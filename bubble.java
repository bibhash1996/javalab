import java.util.Scanner;

class bubble {
  public static void main(String[] args)
  {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter  the size : ");
     int n = input.nextInt();
     int[] a = new int[n];
     System.out.println("Enter the array  :");
     for(int i=0;i<n;i++)
       a[i]=input.nextInt();
     int[] b = new int[n];
     b = bub(a);
     System.out.println("Sorted array is : ");
     for(int x : b)
       System.out.println(x);
      
  }
  
  public static int[] bub(int a[])
  {
     int i,j,k;
     
      for(i=0;i<a.length;i++)
         for(j=0;j<(a.length-i-1);j++)
             {
               if(a[j+1]<a[j])
                 {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                 }
             }
         return a;    
  }
}