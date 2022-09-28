/*class threadImpl implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("child thread");
        }
        
    }
    
}*/




public class ThreadsWithLambda {
    public static void main(String args[]) throws InterruptedException{

        Runnable rable = ()->{
            for(int i=0;i<10;i++){
                System.out.println("child thread");
            }
        };
    
        Thread trd=new Thread(rable);
        trd.start();
    
        for(int i=0;i<10;i++){
            
            System.out.println("main thread");
            Thread.sleep(10);


        }
        
    }


}
