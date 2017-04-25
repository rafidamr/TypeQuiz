package controller;

/**
 * Created by asuspc on 4/25/2017.
 */
public class Timer extends Thread {
    static int interval;
    static Timer timer;

    public Timer(int time) {
        this.interval = interval;
    }

    public void run() {
        timer = new Timer(5);
        
    }
}
