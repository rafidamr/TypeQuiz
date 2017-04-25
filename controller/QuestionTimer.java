package controller;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by asuspc on 4/25/2017.
 */
public class QuestionTimer extends Thread {
    private static int interval;
    private static Timer timer;
    private static boolean started;
    private static boolean end;
    private static boolean correct;

    public QuestionTimer () {
        end = false;
        correct = false;
    }
    public QuestionTimer(int time) {
        this.interval = time;
        end = false;
        correct = false;
        started = false;
    }

    public boolean getStarted() {
        return started;
    }

    public boolean getEnd() {
        return end;
    }
    public void setInterval(int interval) {
        this.interval = interval;
    }
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
    public void run() {
        started = true;
        end = false;
        correct = false;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                setInterval();
            }
        }, 1000, 1000);
    }

    private static void setInterval() {
        if(interval == 1) {
            timer.cancel();
            end = true;
        } else if (correct) {
            interval = 5;
            correct = false;
        }
        --interval;
    }
}
