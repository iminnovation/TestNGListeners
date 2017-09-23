package com.org.IExecutionListners;
import org.testng.IExecutionListener;

public class ExecutionListen implements IExecutionListener {
	private long startTime;

	@Override
	public void onExecutionStart() {
		startTime = System.currentTimeMillis();
		System.out.println("******Starting TestNG*******");		
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("******Ending TestNG in" + (System.currentTimeMillis() - startTime) + "ms. *********");
	}
}