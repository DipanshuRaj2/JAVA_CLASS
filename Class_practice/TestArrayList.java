import java.util.ArrayList;
class TestArrayList {
    public static void main(String[] args) {
        ArrayList cityList =new ArrayList(); //default capacity of array list 10;
        cityList.add("London");
        cityList.add("New York");

        cityList.add("Paris");
        cityList.add(34.5);
        cityList.add("t");
        cityList.add(2);
        cityList.add("Paris");


    System.out.println("List size? " +cityList.size());

    System.out.println("Is london in the List?" +cityList.contains("London")); //true

    
    System.out.println("Is toronto in the list?" +cityList.contains("London"));//true
    System.out.println("Is toronto in the List?" +cityList.contains("Toronto"));//false

    System.out.println("The location of last paris in the list?"+cityList.lastIndexOf("paris"));//6

    System.out.println("Is the list empty? "+cityList.isEmpty());//false

    cityList.add(2 , "Beijing");  //added

    //cityList.remove("London");
    cityList.indexOf("Paris");
    cityList.remove("Paris");///consider as object
    cityList.remove(cityList.indexOf(2));
    cityList.remove(2);
    cityList.remove((Object)2); //argument consider as object
    System.out.println(cityList);
    cityList.set(1, "test"); //replace
    //cityLIst.add(12 , "Beijing"); //exception add
   // (int object);
     for(int i = 0; i<cityList.size(); i++)
    System.out.println(cityList.get(i)+ " ");
System.out.println(cityList);

    }
}