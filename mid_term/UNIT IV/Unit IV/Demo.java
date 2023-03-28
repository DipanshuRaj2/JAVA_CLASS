public class Demo{
    static void validate(int age){
        if(age<18)
        throw new java.io.IOException("not valid");

        else
        System.out.println("Welcome to Vote");

    
    }
    public static void main(String args[]){
        validate(13);
        System.out.println("rest of the code ...");
    }
}