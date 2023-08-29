@FunctionalInterface
interface validator{
    boolean valid(int n , String str)
}
public class aisehi{
    public static void main(String[] args){
        validator validator = (n ,str)->str.length() > n;
        Scanner sc = new Scanner (System.in);
        String str =sc.nextline();
        int n = sc.nextInt();

        if(n < 1) {
            System.out.println("Innvalid input");
        }
        else{
            if(validator.valid(str , n)){
                System.out.println("valid string");
            }
            else{
                System.out.println("Invalid string");
            }
        }
    }
}