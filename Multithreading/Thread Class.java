//Creating thread using Thread class
class MyThread extends Thread{
    public void run(){
        for(int i =10; i>=1; i--){
            System.out.println("another thread = "+i);
            try{
                Thread.sleep(2000);
                
            }catch(Exception e){
                
            }
        }
    }
}
public class Main{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
    }
}
