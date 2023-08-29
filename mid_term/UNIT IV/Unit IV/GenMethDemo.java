class GenMethDemo{
    public static <V, T extends V>boolean isIn(V value, T[] array){
        for(int i = 0; i<array.length;i++){
            if(value.equals(array[i]))
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Integer i[] ={1,2,3,4,5,6};
        System.out.println("2 is in Integer Array" +isIn(2, i));
        String s[]={"one ", "two","three","four", "five","six"};
        System.out.println("one is in String Array" +isIn("one" , s));
    }
}