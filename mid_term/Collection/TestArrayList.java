import java.util.*;

class TestArrayList {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
            list.add("Ravi");
            list.add("vijay");
            list.add("Ravi");
            list.add("Ajay");

            Iterator itr = list.iterator();

            while(itr.hasNext()){
                System.out.println(itr.next());
            }

        }
    }

