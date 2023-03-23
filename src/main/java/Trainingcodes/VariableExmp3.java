package Trainingcodes;

class Program
{
	static int a,b,c;
	int m,n,o;
// static block
static
{
	a=10;
	b=20;
	c=30;
}
//non-static block
{
	m=100;
	n=200;
	o=300;
}
//static method
static void disp1()
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
// non-static method
 void disp2()
{
	System.out.println(m);
	System.out.println(n);
	System.out.println(o);
}
public class VariableExmp3 {
	public static void main(String[] args) {
		Program.disp1();
		Program p1=new Program();
		p1.disp2();
		
	}
}
}

