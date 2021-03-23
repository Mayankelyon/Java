import java.util.Scanner;
class CalSw
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
switch(ch)
{
case 1:
 System.out.println("Addition="+(a+b));
 break;
case 2:
 System.out.println("Subtraction="+(a-b));
 break;
 case 3:
 System.out.println("multiplication="+(a*b));
 break;
 case 4:
 double v1=(double)a/(double)b;
 
 System.out.println("Division="+v1);
 break;
 default:
 System.out.println("invalid");
 
}

}
}