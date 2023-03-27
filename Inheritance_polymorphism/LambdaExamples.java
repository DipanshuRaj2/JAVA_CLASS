class LambdaExamples{
    public static void main(String... args) {
        Numbers sum = (a1, b1) -> {return (a1+b1);};
        System.out.println(sum.print(6,9));

        //()->{};

        JoingString join = (a,b) ->{return (a+b);};
        System.out.println(join.join("Hello", "World"));

        Numbers multiply = (a,b) ->{return (a*b);};
        System.out.println(multiply.print(42,0));
    }
}

@FunctionalInterface
interface Numbers{
    int print(int a, int b);
}

@FunctionalInterface
interface JoingString{
    String join(String a ,String b);
}