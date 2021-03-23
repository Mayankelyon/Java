import java.io.*;
class Add
{
public static void main(String[] args)throws IOException
{
int a,b,sum;
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1st num:");
a=Integer.parseInt(bf.readLine());
System.out.println("Enter 2nd num:");
b=Integer.parseInt(bf.readLine());
c=a+b;
System.out.println("Add="+c);
}
}