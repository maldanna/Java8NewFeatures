import java.util.function.Consumer;

class movie{
    public String name;
    movie(String n){
        this.name=n;
    }
}
public class ConsumerClass {
    // if we want take some input and  do some actions then no return value then use consumer
    public void consumerMethod(){
        Consumer<movie> c1 = m -> System.out.println("movie name1"+m.name);
        Consumer<movie> c2 = m -> System.out.println("movie name2"+m.name);
        Consumer<movie> c3 = m -> System.out.println("movie name3"+m.name);
        Consumer<movie> c4= c1.andThen(c2).andThen(c3);
        
        movie aa=new movie("master");
        c4.accept(aa);

    }

    public static void main(String[] args){
        ConsumerClass obj=new ConsumerClass();
        obj.consumerMethod();

    }
}
