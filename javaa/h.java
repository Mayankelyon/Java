class Abc 
{
	static
	{
	System.out.println("static");

  }
  {//object init block
	System.out.println("objecy initl");

  }
  Abc()
   {//abc cons
	System.out.println("objecy initl");

  }
  {//object init block
	System.out.println("objecy initl2");

  }
  public static void main(String arg[])
  {
	  	System.out.println("main block ");

}
}