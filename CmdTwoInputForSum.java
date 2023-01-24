public class CmdTwoInputForSum {

        public static void main(String[] args) {
        double a, b, c;
        System.out.println("length is: "+args.length);
        for(int i=0; i<args.length; i++){
        System.out.println(args[i]);
        }
        a=Double.parseDouble(args[0]);//String is a class so we need Wraper Class to convert into double
        b=Double.parseDouble(args[(args.length)-1]);
        
        c=a+b;
        System.out.println("sum of two number is:"+c);
        
        Double d= Double.valueOf(args[1]);// convert string into Double object
        if( d instanceof Double)
        System.out.println("d is instance of Double");
        }
        }  

