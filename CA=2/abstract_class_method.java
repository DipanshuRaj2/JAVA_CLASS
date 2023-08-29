abstract class Vechicle{
    public abstract int getNoOfWheels ();
}
class Bus extends Vechicle{
    public int getNoOfWheels(){
        return 6;
    }
}
class Auto extends Vechicle{
    public int getNoOfWheels(){
        return 3;
    }
}
class Bike extends Vechicle{
    public int getNoOfWheels(){
        return 2;
    }
}
class abstract_class_method{
    public static void main(String [] args)
    {
        Bus b = new Bus();
        System.out.println(b.getNoOfWheels());

        Auto a = new Auto();
        System.out.println(a.getNoOfWheels());

        Bike c = new Bike();
        System.out.println(c.getNoOfWheels());
.ja

    }
}
