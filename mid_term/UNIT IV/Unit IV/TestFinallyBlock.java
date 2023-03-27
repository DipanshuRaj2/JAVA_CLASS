//exception doesn't occur
//for each try block there can be zero or more catch blocks, but only one finally block
// we can't write alone "try" it should be catch or throw. atleast finally write
class TestFinallyBlock{
    public static void main(String[] args){
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        try{
            int data = a/b;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.println("I am Handling the Exception");}
        catch(ArithmeticException e){System.out.println("I am Handling the Arithmetic Exception");}
        catch(Exception e){System.out.println("I am Handling the Handling all Exception"+e);}
    finally {System.out.println("finnally block is always executed");}
    System.out.println("rest of the code...");
   
    }
   
}