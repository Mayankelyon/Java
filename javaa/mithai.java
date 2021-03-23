
class Sweet
{
   void price()
   {
	    System.out.println("sweet price 1000/kg");
   }	   
}
class Kajukatli extends Sweet
{
   void price()
   {
	    System.out.println(" kaju katli price 1400/kg");
   }
}
class Jalebi extends Sweet 
{
 void price()
   {
	    System.out.println("jalebi price 200/kg");
   }
}
class Taste
{
	public static void main(String arg[])
	{
		
		Sweet obj=new Sweet();
		obj.price();
		Kajukatli obj1=new Kajukatli();
		obj1.price();
		Jalebi obj2=new Jalebi();
		obj2.price();
	   
	   
	   
	}
}
