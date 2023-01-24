class own{

   static{
	System.out.println("static");
}
{
System.out.println("init block");
}
	public static void main(String[] args){
own t1 = new own();
System.out.println("main");

}
}
   