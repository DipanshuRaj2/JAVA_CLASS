class ThrowDemo{
    static void demo()
    {
        try{
            throw new NullPointerException("heloooo");

        }
        // catch(NullPointerException e)
        // {
        //     System.out.println("Caught inside Demo");
        //     throw e; //rethrow the exception
        // }
        catch(Exception e)
        {
            System.out.println("Caught Inside demo");
            throw e;
            //in a ladder of catch only one catch can access
        }
    }
    public static void main(String args[])
    {
        try{
            demo();
        }
        catch(NullPointerException e)
        {
            System.out.println("Recaught: "+ e);
        }
    }
}