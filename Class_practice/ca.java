class testdemo{
    int id;
    String name;
    int age;
    static String uni="LPU";
    testdemo(int id , String name)
    {
        this.id=id;

        this.name="name";
    }
    testdemo(int id ,String name , int age)
    {
        this(id.name);
        this.age=age;
    }
    void detail()
    {System.out.println(name+","+id+","+age+","+uni);}
    public static void main(String args[])
    {
        testdemo t = new testdemo(34,"shruti",10);
        t.detail();
    }

    }
