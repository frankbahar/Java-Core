package com.frankbahar;

import static com.frankbahar.ThreadColor.ANSI_GREEN;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_GREEN + " Hello from my runnables");
    }
}
