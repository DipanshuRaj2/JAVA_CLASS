class calcultor{
    public int add(int a , int b){
        System.out.println("add");
        return a+b;
    }
}
public class Main{
    public static void main(String[] args){
        int num = 1;
        int num2 = 12;
        calcultor clac = new calcultor();
        int res =  clac.add(num, num2);
        
        System.out.println(res);
    }
}