class Th1 extends Thread
{
    Block p;
    Th1(Block p)
    {
        this.p=p;
    }
    public void run()
    {
        synchronized(p)
        {
            p.printname("Developer 1");
        }
    }
}