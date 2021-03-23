import java.util.Scanner;
class Cal
{
public static void main(String[] args)
{
int a,b,ch;
Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st number");

a=sc.nextInt();
	System.out.println("enter the 2nd number");

b=sc.nextInt();
	System.out.println("press the following number for operation \n 1=+\n2=-\n3=*\n4=/");

ch=sc.nextInt();
if(ch==1)
{
	System.out.println(a+"+"+b+"="+(a+b));
}
else if(ch==2)
{
	System.out.println(a+"-"+b+"="+(a-b));
}
else if(ch==3)
{
	System.out.println(a+"*"+b+"="+(a*b));
}
else if(ch==4)
{
	System.out.println(a+"/"+b+"="+(a/b));
}
else
{
	System.out.println("invalid");
}

}
}