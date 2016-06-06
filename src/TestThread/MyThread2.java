package TestThread;

import java.sql.Date;
import java.util.concurrent.Callable;

public class MyThread2 implements Callable<Object>{
	
	private String taskNum;
	
	public MyThread2(String taskNum){
		this.taskNum = taskNum;
	}
	

	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(">>>"+taskNum+"task start!");
		Date dateTmp1 = new Date(0);
		Thread.sleep(1000);
		Date dateTmp2 = new Date(0);
		long time = dateTmp2.getTime() - dateTmp1.getTime();
		System.out.println(">>>"+taskNum+"task voer!");
		return "My Number:"+taskNum;
	}

}
