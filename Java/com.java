class Asd
{
public static void main(String arg[])
{
	int i,j;
for(i=1;i<=4;i++){
	for(j=1;j<=5-i;j++)
	{
		System.out.print("  ");

	}
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.print("\n");

}
for(i=4;i>=1;i--){
	for(j=1;j<=5-i;j++)
	{
		System.out.print("  ");

	}
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.print("\n");

}
}

}

