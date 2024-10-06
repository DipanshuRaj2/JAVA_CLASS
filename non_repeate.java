import java.util.HashSet;
import java.util.Scanner;
public class non_repeate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = x; i <= y; i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean check(int n){
        String str = String.valueOf(n);
        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray()){
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}