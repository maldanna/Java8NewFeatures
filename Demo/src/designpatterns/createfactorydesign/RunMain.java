

public class RunMain {
    
    public static void main(String[] args) {
        CreateFactory obj=new CreateFactory();
        System.out.println("Android object: "+obj.createObjectOs("Ios"));
        System.out.println("Android object: "+obj.createObjectOs("Android"));
        System.out.println("Android object: "+obj.createObjectOs("Windows"));

    }
}
