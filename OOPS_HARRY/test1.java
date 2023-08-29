public class test1 {
    public static void main(String[] args) {
        //declares an array of integer.
        int arr[];

        //allocating memory for 5 integers
        arr = new int[5];

        //initialise the first elements of the array
        arr[0] = 10;

        //initialise the Second elements of the array
        arr[1] = 12;

        //initialise the third elements of the array
        arr[2] = 13;

        //initialise the fourth elements of the array
        arr[3] = 23;

        //initialise the fifth elements of the array
        arr[4] = 'a';

        //accessing the elements of the specified array
        for(int i = 0; i < arr.length; i++)
            System.out.println("Elements at index "+ i + " : " + arr[i]);
        
    
    }


}
