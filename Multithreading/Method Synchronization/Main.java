class Main
{
    public static void main(String args[])
    {
        Print obj=new Print(); //shared resource
        Thread1 t1=new Thread1(obj); //Thread 1- user defined
        Thread2 t2=new Thread2(obj); //Thread 2- user defined
        t1.setName("Thread1");
        t2.setName("Thread2");
        t2.start();
        t1.start();
    }
}