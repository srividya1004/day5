class search
{
    public static void main(String[]args)
    {
        int[] a ={10,20,30,40,50};
        int key = 30, flag = 0;
        for(int i=0;i<5;i++)
        {
            if(a[i] == key)
            {
              System.out.println("Index value is "+i);
              flag = 1;
             }
        }
      if(flag==0)  
      System.out.println("Element not found");
    }
}