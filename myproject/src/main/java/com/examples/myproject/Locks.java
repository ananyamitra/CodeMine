package com.examples.myproject;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {

	//Re-entrant locks.
	//Java 5 introduced the Lock interface which basically has the following usage

	 public class LockExample{
	  	
	 	private final Lock lock = new ReentrantLock();
	  
	  	public void doSomething(){
	  
	  		lock.lock();
	  		try{
	  			//Code which should be run by 1 thread at a time
	  		}
	  		finally{
	  			lock.unlock();
	  		}
	  
	  	}
	  }
	 /*Why should someone use this?
	  * In case of intrinsic locks(ie synchronized approach), when a lock is held by another thread, the current thread blocks till 
	  * this lock is released. It cannot even be interrupted.
	  * 
	  * Reentrant locks
	  * The tryLock() and the tryLock(long timeout, TimeUnit unit) methods provide means for the threads to time-out while waiting
	  * for a lock instead of indefinitely waiting till lock is acquired.
	  * 
	  * 
	  * Any thread can acquire the lock once the synchronized thread is exited by a currently running thread. 
	  * This may lead to starvation of some(unlucky?) thread.
	  * 
	  * Reentrant locks
	  * ReentrantLock Class provides a constructor that optionally takes a boolean parameter fair. 
	  * When more than one thread are competing for the same lock, the lock favors granting access to the longest waiting thread.
	  * 
	  * 
	  * A synchronized block can't start in one method and end in another method.
	  * Reentrant locks allow this.
	  *  
	  *  
	  * Use this only if you actually need these advanced features else prefer normal synchronized blocks 
	  *  
	  *  
	  *  
	  */
	  
	 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
