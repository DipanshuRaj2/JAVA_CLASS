class BreakDemo{
	public static void main(String[]rk)
{

	//outer:

		for(int i =0; i<3; i++)
{
				System.out.println("Outer"+i);

   //inner:
				for(int j = 0; j<3; j++){
						System.out.println("inner: "+j);
						if(i==j+1)
						break;
            		System.out.println("Bye");
}
}
}
}
