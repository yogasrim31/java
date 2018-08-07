public class calculation
{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum ( int a, int b,int c)
    {
      System.out.println(a+b+c);
    }
      public static void main(String args[])
      {
          calculation obj= new calculation();
          obj.sum(10,10,10);
          obj.sum(20,20);
      }
      
}


