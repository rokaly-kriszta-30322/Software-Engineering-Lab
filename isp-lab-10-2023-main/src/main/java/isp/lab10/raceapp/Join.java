package isp.lab10.raceapp;

class Join extends Thread
{
    String n;
    Thread t;
    Join(String n, Thread t){this.n = n;this.t=t;}

    public void run()
    {
        System.out.println("thread "+n+" is in run() method");
        try
        {
            if (t!=null) t.join();
            System.out.println("thread "+n+" executes operation.");
            Thread.sleep(3000);
            System.out.println("thread "+n+" a terminates operation.");
        }
        catch(Exception e){e.printStackTrace();}

    }

    public static void main(String[] args)
    {
        Join w1 = new Join("Process 1",null);
        Join w2 = new Join("Process 2",w1);
        w1.start();
        w2.start();
    }
}
