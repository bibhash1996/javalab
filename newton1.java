import java.util.Scanner;
class newton1{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
double x;
int deg,itr;
int[] eq= new int[10];
System.out.println("Enter the degree of the equation!!!");
deg = input.nextInt();

for(int i=0;i<=deg;i++)
  {
    System.out.println("Enter the coefficient of y^"+i);
    eq[i]=input.nextInt();
  }
System.out.println("Enter the expected root : ");
x=input.nextInt();
System.out.println("No of iterations : ");
itr=input.nextInt();

double root = solve(itr,x,eq,deg);

System.out.println("Root is : " + root);
}

public static double f(double deg,double x,int[] eq)
     {
        double res=0;
        for(int i=0;i<deg;i++)
          res+=eq[i]*Math.pow(x,i);
     
      return res;
     }
     
public static double fd(double deg,double x,int[] eq)
     {
        double res=0;
        for(int i=0;i<deg;i++)
          res+=eq[i]*Math.pow(x,i-1);
     
      return res;
     }
     
public static double solve(int itr,double x,int[] eq,int deg)
    {
       for(int i=0;i<itr;i++)
          x-=(f(deg,x,eq)/fd(deg,x,eq));
          
      return x;
    }
}