
import java.util.Scanner;

class comp {
public static String print(complex a)
 {
  return "" + (a.real + "+i(" + a.img + ")");
 }
 public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    while(true){
    System.out.println("1.Addition \n 2. Subtraction \n 3. Multiplication \n 4.Exit");
    System.out.println("Enter your choice : ");
    int n = input.nextInt();
    if(n==4)
    System.exit(0);
    complex a = new complex();
    complex b = new complex();
    System.out.println("Enter real and imaginary parts : ");
    a.real = input.nextInt();
    a.img = input.nextInt();
    System.out.println("Enter real and imaginary parts : ");
    b.real = input.nextInt();
    b.img = input.nextInt();
    switch(n){
     
            case 1:System.out.println("Sum is : " + print(a.add(b)));break;
            case 2:System.out.println("diff is : " + print(a.subt(b)));break;
            case 3:System.out.println("prod is : " + print(a.mult(b)));break;
           
            default:System.out.println("Wrong choice!!!");break;
             }
    }
  }
 
}