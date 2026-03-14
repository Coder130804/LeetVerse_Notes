public class Print
{
    String a[];
    public synchronized void printing(String a[])
    {
        this.a=a;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(Thread.currentThread().getName()+": "+a[i]);
        }
    }
}
//this class contains the shared resource