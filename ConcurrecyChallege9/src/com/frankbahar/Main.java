package com.frankbahar;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        final NewTutor tutor = new NewTutor();
        final NewStudent student = new NewStudent(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

class NewTutor {
    private NewStudent student;
    private Lock lock;


    public void setStudent(NewStudent student) {
        this.student = student;
        this.lock = new ReentrantLock();
    }

    public void studyTime() {

        boolean status = false;
        System.out.println("Tutor has arrived");

        while (!status) {
                try {
                    // wait for student to arrive
                 Thread.sleep(1500);
                 //   this.swait();
                } catch (InterruptedException e) {
                }
                status = false;
                try {
                    if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                        try {
                            student.startStudy();
                            System.out.println("Tutor is studying with student");
                            status=true;
                        } finally {
                            lock.unlock();
                        }
                    } else {
                        System.out.println("Could not get the lock");
                    }
                } catch (InterruptedException e) {
                }
        }
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class NewStudent {

    private NewTutor tutor;
    private Lock lock;

    NewStudent(NewTutor tutor) {
        this.tutor = tutor;
        this.lock = new ReentrantLock();

    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        boolean status = false;
        while (!status) {
            try {
                if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        tutor.getProgressReport();
                        System.out.println("Tutor is studying with student");
                        status = true;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Could not get the lock");

                }
            }
             catch (InterruptedException e) {

         }
       }
        System.out.println("Student handed in assignment");
        //tutor.notifyAll();

    }
}