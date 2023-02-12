public class StringExample{
    public static void main(String [] ar){
        // String s = "Hello stusdents.";
        // String s1 = "Hello students.";

        // System.out.println(s.charAt(3)); //1
        // System.out.println(s.startsWith("hello"));//false
        // System.out.println(s.endsWith("ents.")); //true
        // boolean b = s.endsWith("ents.");
        // System.out.println(b); //true
        // System.out.println(s.equals(s1));//false
        // System.out.println(s.equalsIgnoreCase(s1));//false
        // System.out.println(s.length()); //16
        // System.out.println(s.indexOf('s'));//6
        // System.out.println(s.indexOf('s',6));//6
        // System.out.println(s1.lastIndexOf('s'));//13
        // System.out.println(s1.lastIndexOf('s', 13));//13
        // String ss = "one,two,three four ";
        // String [] sa = ss.split(",");
        // String hh ="one$two,three$four";
        // String [] sa1 = hh.split("\\$");
        // System.out.println(sa[0]);
        // System.out.println(sa[1]);
        // System.out.println(sa[2]);
        
        // String str = "Hello World";
        // int length = str.length();
        // System.out.println("Length of a String is : " + length);
        // String s11 ="Welcome to Java";
        // String s2 =  new String("Welcome to Java");
        // String s3 = "Welcome to Java ";
        // String s10 = "Welcome to Java ";
        // String s4 = new String("Welcome to Java");
        // System.out.println("s11 == s2 is " + (s11 == s2)); //reference matching //false
        // System.out.println("s2 == s3 is " + (s2 == s3)); //false
        // System.out.println("s2 == s4 is " + (s2 == s4)); //false
        // System.out.println("s3 == s10 is " + (s3 == s10)); //true



       String s1 = "hello";
       String s2 = "hello";
       String s3 = "Hello";
       String s4 = "ellot";
       String s5 = "hello world";

       System.out.println(s1.compareTo(s2));
       System.out.println(s1.compareTo(s3));
       System.out.println(s1.compareTo(s4));
       System.out.println(s1.compareTo(s5));

    }
}