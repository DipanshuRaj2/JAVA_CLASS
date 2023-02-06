import java.util.Scanner;

public class Solution2{
    public static void main(String[] args) {

               Scanner dipanshu = new Scanner(System.in);
        String str = dipanshu.nextLine();
        char ch = dipanshu.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) ==ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
// count the no. of character .