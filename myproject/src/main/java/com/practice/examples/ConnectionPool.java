package com.practice.examples;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
	
	BlockingQueue<Connection> queueConns;
	
	public ConnectionPool(int poolSize){
		queueConns = new ArrayBlockingQueue<Connection>(poolSize);
		for(int i =0; i<poolSize; i++){
			queueConns.add(new Connection());
		}
	}
	
	public Connection getConnection(){
		
		Connection conn = null;
		try {
			conn =  queueConns.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	public void returnConnection(Connection conn){
		
		try {
			queueConns.put(conn);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
