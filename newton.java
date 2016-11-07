import java.util.Scanner;

class newton {
  double f(int[] eq,double x)
  {
   double val=0;
   for(int i=0;i<eq.length;i++)
     val+=Math.pow(x,i)*eq[i];
   return val;  
  }
  
  double solution(int[] eq,double st,int deg)
  {
   int[] deq= new int[deg];
   for(int j=0;j<deg;j++)
     deq[j]=(j+1)*eq[j+1];
   for(int i=0;i<1000;i++)
      st-=f(eq,st)/f(deq,st);
    return st; 
  }
  
  public static void main(String[] args)
     {
      Scanner input = new Scanner(System.in);
      newton my = new newton();
      System.out.println("Enter the equation : ");
      System.out.println("Format <1X2-2X1-2x0> for equation" + "\"x square - 2*x -2\" ");
      String eq = new String();
      eq=input.nextLine();
      System.out.println("Enter the expected root : ");
      int st = input.nextInt();
      int n = eq.length();
      int[] eqs = new int[n];
      int deg = 0,pos,val;
      for(int i=1;i<n;i++){
        if(eq.charAt(i)=='x'){
        
        pos = Integer.parseInt(eq.substring(i+1,i+2));
        if(i-2>=0 && eq.charAt(i-2)=='-')
           val=-1*Integer.parseInt(eq.substring(i-1,i));
        else
             val=Integer.parseInt(eq.substring(i-1,i));
           if(pos>deg)
           deg=pos;
           eqs[pos]=val;
        }
      }
     System.out.println("Approximate sol is = " + my.solution(eqs,st,deg));
     input.close();
     }
}