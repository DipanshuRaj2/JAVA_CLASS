class Myexception extends Throwable
{
    public Myexception(int i)
    {
        System.out.println("you have entered ."+i+" : It exceeding the limit");
    }
    
}
public class ExceptionTest{
    public void show(int i)throws Myexception{
        if(i>100)
        throw new Myexception(i);
        else
        System.out.println(+i+"is less then 100 it is ok");

    }
    public static void main(String[] args){
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        ExceptionTest t = new ExceptionTest();

        try{
            t.show(i); 
            t.show(j);
        }

        catch(Throwable e){
            System.out.println("catched exception is"+e);
        }

    }
}