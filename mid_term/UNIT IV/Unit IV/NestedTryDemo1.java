class NestedTryDemo1{
    public static void main(String args[]){
        try{
            int a = Integer.parseInt(args[0]);
            try {
                int b = Integer.parseInt(args[1]);
                System.out.println(a/b);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Div by zero error!");

            }
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("Need 2 parameters");

        }
        System.out.println("remaining program");
    }
}