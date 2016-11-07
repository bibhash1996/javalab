
class ThA extends Thread{
ThA(){
super ("Thread A");
System. out .println("Thread A : "+this+" started");
start();
}
public void run(){
try{
for(int i=1;i<=5;i++){
System. out .println("Thread A : "+i);
Thread. sleep (50);
}
}catch(InterruptedException e){
System. out .println("Thread Interrupted");
}
System. out .println("Thread A Exiting.....");
}
}
class ThB extends Thread{
ThB(){
super("Thread B");
System. out .println("Thread B : "+this+" started");
start();
}
public void run(){
try{
for(int i=1;i<=5;i++){
System. out .println("Thread B : "+i);
Thread. sleep (100);
}
}catch(InterruptedException e){
System. out .println("Thread Interrupted");
}
System. out .println("Thread B Exiting.....");
}
}
class ThC extends Thread{
ThC(){
super ("Thread C");
System. out .println("Thread C : "+this+" started");
start();
}
public void run(){
try{
for(int i=1;i<=5;i++){
System. out .println("Thread C : "+i);
Thread. sleep (200);
}
}catch(InterruptedException e){
System. out .println("Thread Interrupted");

}
System. out .println("Thread C Exiting.....");
}
}
public class threads {
public static void main(String[] args) {
new ThC();
new ThB();
new ThA();
try{
for(int i=1;i<=5;i++){
System. out .println("Main Thread "+i);
Thread. sleep (400);
}
}catch(InterruptedException e){
System. out .println("Thread Interrupted");
}
System. out .println("Main thread ended");
}
}