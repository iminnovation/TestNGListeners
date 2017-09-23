package com.org.IExecutionListners;

import org.testng.IExecutionListener;

public class ExecutionServerCheck implements IExecutionListener {

	@Override
	public void onExecutionStart() {
		//One can do implementation per their needs
		System.out.println("Establish connection with database");		
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("Disconnecting with the database.");
	}
}