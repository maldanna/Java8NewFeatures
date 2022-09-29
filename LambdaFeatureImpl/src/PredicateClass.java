import java.util.function.*;
public class PredicateClass {
    
    public static void main(String[] args) {
        // mainly predicate functional wil be useful to implement boolean retrun functions
        Predicate<Integer> p=i-> i>10 ;
        System.out.println("boolean values is: "+p.test(100));
        String[] names={"maldanna","ramaa","bheem"};
        Predicate<String> p2=s-> s.contains("m") && s.contains("a");
        for(String name:names){
            System.out.println("user with m : "+p2.test(name));
        }

    }

}
