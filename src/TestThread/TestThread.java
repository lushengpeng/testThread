package TestThread;

public class TestThread {
    public static void main(String[] args){
    	testExtendThread();
    	testImplementRun();
    }
    
    static void testExtendThread(){
    	MyThread thread1 =  new MyThread("First");
    	MyThread thread2 =  new MyThread("Second");
    	
//    	thread1.start();
//    	thread2.start();
    	
    }
    
    static void testImplementRun(){
    	new Thread(new MyThread1("First1")).start();
    	new Thread(new MyThread1("Second1")).start();
    }
}
