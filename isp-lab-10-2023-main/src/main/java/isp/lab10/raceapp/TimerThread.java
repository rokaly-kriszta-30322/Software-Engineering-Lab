package isp.lab10.raceapp;

class TimerThread extends Thread {
    private long timer;
    private boolean running;

    public TimerThread() {
        timer = 0;
        running = false;
    }

    public void run() {
        running = true;
        while (running) {
            try {
                Thread.sleep(10);
                timer += 10;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopTimer() {
        running = false;
    }

    public long getTimer() {
        return timer;
    }
}

