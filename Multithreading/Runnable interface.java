//creating our thread using Runnable Interface
class MyThread implements Runnable{
    public void run(){
        for(int  i =0; i<=10; i++){
            System.out.println("Value of i is " +i);
        }
        
    }
}
public class Main{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        Thread t = new Thread(t1);
        t.start();
        
    }    
}


//Thread.sleep(1000) pauses execution for 1 second.
class MyThread implements Runnable{
    public void run(){
        for(int  i =0; i<=10; i++){
            System.out.println("Value of i is " +i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                
            }            
        }        
    }
}
public class Main{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        Thread t = new Thread(t1);
        t.start();        
    }    
}
