public class NestedTryDemo {
    public static void main(String[] args){
        int a =Integer.parseInt(args[0]);
        try{
        int c = a/0;
        }
        catch(ArithmeticException e){System.out.println("This is the A.e");}
        catch(ArrayIndexOutOfBoundsException m){System.out.println("This is the ArrayIndexOutOfBoundsException");}
        System.out.println("Rest of the code");
    }
}