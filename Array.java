//write a programm which prompts the user to enter the number of subjects
import java.util.*;
class Array{
		public static void main(String vs[]){
int[] marks;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of Subjects:- ");
int subjects=sc.nextInt();

marks=new int[subjects];
System.out.println("****************************");

for(int i=0;i<subjects;i++){
	System.out.println("Enter the Mark of Subject"+i+":-");	
		marks[i]=sc.nextInt();

}





}

}
