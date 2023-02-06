import java.util.ArrayList;
class TestArrayList {
    public static void main(String[] args) {
        ArrayList cityList =new ArrayList();
        cityList.add("London");
        cityList.add("New York");

        cityList.add("Paris");
        cityList.add(34.5);
        cityList.add("t");
        cityList.add(2);
        cityList.add("Paris");

        System.out.println(cityList);
    //[London, New York, Paris, 34.5, t, 2, Paris]
    }
}