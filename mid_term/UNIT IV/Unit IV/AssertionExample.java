public class AssertionExample{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        assert num>= 10; // stop if number is less than 10
        assert num <20: "number less should be less than 20";

        //if fail msg is displayed with error
        System.out.println("Pass");
    }
}