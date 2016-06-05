package TestThread;

public class MyThread1 implements Runnable{
    private String name;
    
	public MyThread1(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(name+"运行"+i);
		}
		try{
			Thread.sleep((long) (Math.random()*10));
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
