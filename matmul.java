import java.util.Scanner;

class matmul{

   public static void main(String[] args)
   {
      int m1,n1,m2,n2;
      System.out.println("Enter no of rows and coloumns of matrix 1 :");
      Scanner input = new Scanner(System.in);
      m1=input.nextInt();
      n1=input.nextInt();
       System.out.println("Enter no of rows and coloumns of matrix 2 :");
      
      m2=input.nextInt();
      n2=input.nextInt();
      if(n1!=m2)
      {
        System.out.println("Matrix multiplication not possible!!");
        System.exit(0);
      }
      
      System.out.println("Enter 1 matrix  :");
      int[][] mat1 = new int[m1][n1];
       for(int i = 0;i<m1;i++)
          for(int j=0;j<n1;j++)
            mat1[i][j]=input.nextInt();
            
            
      System.out.println("Enter 2 matrix  :");
      int[][] mat2 = new int[m2][n2];
       for(int i = 0;i<m2;i++)
          for(int j=0;j<n2;j++)
            mat2[i][j]=input.nextInt();
      
      int[][] res = new int[m1][n2];
      
      for(int i=0;i<m1;i++)
	for(int j=0;j<n2;j++)
	{
	  res[i][j]=0;
	  for(int k=0;k<n1;k++)
	   res[i][j]+=mat1[i][k]*mat2[k][j];
	}
      
      System.out.println("Resultant is :");
      for(int i=0;i<m1;i++)
         {
           for(int j=0;j<n2;j++)
           System.out.print(res[i][j] + " ");
           
           System.out.println();
         }
   }

}