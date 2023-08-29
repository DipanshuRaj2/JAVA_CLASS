abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    
    }
    class Horse extends Animal{
        Horse(){
            System.out.println("Walks on 4 legs");
        }
        public void walk() 
        {
            System.out.println("wALKs on 4");
        }
        }
        class Chicken extends Animal{
            public void walk(){
                System.out.println("walks on 2 legs");
            }
        }

        public class OOPS {
            public static void main(String args[]) {
                Horse horse = new Horse();


            }
        }
    
