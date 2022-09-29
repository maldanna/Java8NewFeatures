import java.util.function.Supplier;

public class SupplierClass {

    // iif you don't want pass anything but you want return something then use Supplier
    public static void  supplierMethod(){
        Supplier s1= ()->{
            String otp="";
            for(int i=0;i<6;i++){
                otp=otp+ (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println("otp is: "+s1.get());

    }
    

    public static void main(String[] args) {
        SupplierClass.supplierMethod();
    }
    
}
