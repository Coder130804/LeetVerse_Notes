public class Execute
{
    public static void main(String args[])
    {
        Block obj=new Block(); //shared resource
        Th1 t1=new Th1(obj); //Thread 1- user defined
        Th2 t2=new Th2(obj); //Thread 2- user defined
        t1.start();
        t2.start();
    }
}