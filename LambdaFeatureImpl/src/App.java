@FunctionalInterface
interface inface1{
    int add(int a,int b);
}

@FunctionalInterface
interface inface2{
    int square(int a);
}



public class App {
    public static void main(String[] args) throws Exception {
      inface1 inf=(a,b)-> {return (a+b);}; // -> (a+b);
      System.out.println("sum value is : "+inf.add(2,3));

      inface2 inf2=x->x*x;
      System.out.println("square value is : "+inf2.square(3));
    }
}
