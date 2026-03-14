class MT1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
           System.out.println("JAVA");
           try{
               Thread.sleep(5000);
           }
           catch(InterruptedException e)
           {
               System.out.println(e.toString());
           }
        }
    }
}