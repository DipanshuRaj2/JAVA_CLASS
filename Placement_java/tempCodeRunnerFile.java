class multithreaded_programing
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        t.setName("New Thread");
        System.out.println(t);        
    }
}