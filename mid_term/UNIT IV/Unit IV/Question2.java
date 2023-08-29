/* Create a generic class that contains a method that returns the average of an array of
numbers of any type, including integers, floats, and doubles.
Create a generic class that contains a method sameAvg() that determines if two Stats objects
contain arrays that yield the same average, no matter what type of numeric data each object holds.
*/
class Stats<T extends Number > //Bounded Type
{
T[] nums;
Stats(T[] o) {
nums = o;
}
double average() {
double sum = 0.0;
for(int i=0; i < nums.length; i++)
sum += nums[i].doubleValue(); // No Error!!!
return sum / nums.length;
}
boolean sameAvg(Stats<?> ob) //Wild Card Argument
{
if(average() == ob.average())
return true;
return false;
}
}
class Question2 {
public static void main(String args[])
{
Integer inums[] = { 1, 2, 3, 4, 5 };
Stats<Integer> iob = new Stats<>(inums);
double v = iob.average();
System.out.println("iob average is " + v);
Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
//Double dnums[] = { 1.0, 2.0, 3.0, 4.0, 5.0 };

Stats<Double> dob = new Stats<Double>(dnums);
double w = dob.average();

System.out.println("dob average is " + w);

if(iob.sameAvg(dob))
System.out.println("Averages are the same.");
else
System.out.println("Averages differ.");

}
}