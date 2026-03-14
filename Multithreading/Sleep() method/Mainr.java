class Mainr
{
    public static void main() throws InterruptedException
    {
        MT1 e=new MT1();
        Thread obj=new Thread(e);
        obj.start();
        for(int i=0;i<3;i++)
        {
          System.out.println("Programming");
          Thread.sleep(5000);
        }
        System.out.println();
    }
}