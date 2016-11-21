import java.util.*;
class complex {
double real,img;


complex add(complex b)
{
  complex sum = new complex();
  sum.real =this.real + b.real;
  sum.img  =this.img + b.img;
  return sum;
}

complex subt(complex b)
{
 complex sub = new complex();
 sub.real =this.real- b.real;
 sub.img =this.img - b.img;
 return sub;
}
complex mult(complex b)
{
  complex mul = new complex();
  mul.real = b.real*this.real -(this.img-b.img);
  mul.img = b.img*this.real + this.img-b.real;
  return mul;
}
complex div(complex b)
{
  complex conj = new complex();
  conj.real=b.real;
  conj.img=-1*b.img;
  complex num=new complex();
  num = this.mult(conj);
  complex din = new complex();
  din = b.mult(conj);
  num.real/=din.real;
  num.img/=din.real;
  
  return num;
}
}