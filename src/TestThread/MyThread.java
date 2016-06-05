package TestThread;

public class MyThread extends Thread{
	
	private String name;
	
	

	public MyThread(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i =0; i<5 ;i++){
			System.out.println(name+"运行"+i);
		}
		try{
			sleep((int)Math.random()*10);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
