package com.frankbahar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static com.frankbahar.Main.EOF;

public class Main {
    public  static final String EOF = "EOF";

    public static void main(String[] args) {
	//    List<String> buffer = new ArrayList<String>();
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
  //      ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
//	    MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN,  bufferLock);
//	    MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
//	    MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);

        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
	    MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
	    MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

	    executorService.execute(producer);
	    executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_BLUE +"I'm being printed for the Callable class");
                return "This is the callable result";
            }
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException e){
            System.out.println("Something went wrong");
        } catch (InterruptedException e){
            System.out.println("Thread running the task was interrupted");
        }

        executorService.shutdown();

//	    new Thread(producer).start();
//	    new Thread(consumer1).start();
//	    new Thread(consumer2).start();

    }
}

class MyProducer implements Runnable{
    private ArrayBlockingQueue<String> buffer;
    private String color;
  //  private ReentrantLock bufferlock;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    //    this.bufferlock = bufferlock;
    }

    public void run(){
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for(String num : nums){
            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e){
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting...");
    //    synchronized (buffer) {
     //   bufferlock.lock();
        try {
            buffer.put("EOF");
            //    }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

class MyConsumer implements Runnable{
    private ArrayBlockingQueue<String> buffer;
    private String color;
//    ReentrantLock bufferlock;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
      //  this.bufferlock = bufferlock;
    }

    public void run(){
        while(true){
            synchronized (buffer) {
        //    if(bufferlock.tryLock()) {
                try {
                     if (buffer.isEmpty()) {
                        //          bufferlock.unlock();
                          continue;
                    }
                    if (buffer.peek().equals(EOF)) {
                         System.out.println(color + "Exiting");
                        //           bufferlock.unlock();
                         break;
                    } else {
                        System.out.println(color + "Removed" + buffer.take());
                    }
                } catch (InterruptedException e) {
                    //         bufferlock.unlock();
                }
             }
        }
    }
}