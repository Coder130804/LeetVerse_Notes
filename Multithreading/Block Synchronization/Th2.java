class Th2 extends Thread
{
    Block p;
    Th2(Block p)
    {
        this.p=p;
    }
    public void run()
    {
        synchronized(p)
        {
            p.printname("Developer 2");
        }
    }
}