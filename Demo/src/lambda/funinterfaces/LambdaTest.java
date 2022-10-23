
@FunctionalInterface
interface additionalIntef {
    int add(int a,int b); 
}


public class LambdaTest {

    public static void main(String args[]){
        additionalIntef ainterf=(a,b)->{
            return a+b;
        };
        System.out.println("Hi Hello wolrd");
        System.out.println("interface: "+ainterf.add(8,9));

    }
    
}
