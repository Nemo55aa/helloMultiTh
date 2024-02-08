public class App {
    public static void main(String[] args) throws Exception {
        helloThread heTh = new helloThread();
        worldThread wldTh = new worldThread();
        
        heTh.start();
        wldTh.start();

        System.out.println("Hello, World!");
    }
}

class helloThread extends Thread {
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
    
}
class worldThread extends Thread {
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
    
}