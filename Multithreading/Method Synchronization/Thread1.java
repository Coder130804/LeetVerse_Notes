class Thread1 extends Thread
{
    Print p;
    Thread1(Print p)
    {
        this.p=p;
    }
    public void run()
    {
        p.printing(new String[]{"I","Love","Java","very","much"});
    }
}