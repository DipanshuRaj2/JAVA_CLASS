class Typecasting{
    public static void main(String[] args){
        
    // char[]a = {'c','o','n','g','r' ,'a' ,'t' ,'s'};
    // byte[]b ={82 , 65,86, 73, 75, 65,78 ,84};

    // String s1= new String(a);
    // System.out.println(s1);

    // String s2 = new String(a, 2,5);
    //  System.out.println(s2);
    // String s3 = new String(s1);
    //  System.out.println(s3);
    // String s4 = new String(b);
    //  System.out.println(s4);
    // String s5 = new String(b , 4 , 4); 
    // System.out.println(s5);





    
    // String str = "have.fun.in.java@blogspot@in";

    // String[] s = str.split("\\.",-2);

    // for(String x: s)System.out.println(x);

    




    //StringBuilder sb=new StringBuilder(50);
    //sb.append("Hello my students.");

    StringBuilder sb = new StringBuilder("Hello my Students");

    sb.append("xyz");

    System.out.println(sb);

    system.out.println(sb.length());

    sb.setLength(30);

    //System.out.println(sb.length());

    System.out.println("setCharAt:" +sb);

    sb.reverse();

    sb.insert(2,'y');

    System.out.println("deleteCharAt:"+sb);

    sb.delete(5,10);

    System.out.println("delete:" +sb);

    System.out.println(sb.substring(5));
    System.out.println(sb);
    System.out.println(sb.substring(5,7));

    StringBuilder b1 = new StringBuilder("Hello");
    // StringBuilder 
        
    b3 = ("Hello"); //String cannot convert into StringBuilder

    StringBuider b2 = new StringBuilder("Hello");

    System.out.println("b1 equals b2=" +b1.equals(b2));//logical error reason equals do comparison betwwen contents
    // and b1 and b2 "Hello " is not considerd as string they are stored in non readable format.

    System.out.println("b1 equals b2 toString()=" +b1.toString().equals(b2.toString()));


        }
    
}

public static void main(String [] , ar){
    Typecasting obj = new Typecasting();
        obj.StringBuilderMethods;
}
