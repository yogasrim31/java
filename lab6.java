public class rectangle
{
    int length;
    int width;
     void insert(int l,int w)
     {
         length=l;
         width=w;
         
     }
      void calculatearea()
      {
          System.out.println(length*width);
          
      }
      public static void main(String args[])
      {
          rectangle r1=new rectangle(), r2=new rectangle();
          r1.insert(11,5);
          r2.insert(3,15);
          
          r1.calculatearea();
          r2.calculatearea();
      }
      
}

