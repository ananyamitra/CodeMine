package com.examples.myproject;

//Lazy initialization with double null check
public class Singleton {
	
	//Make the instance volatile
	private static volatile Singleton obj;	
	//Make the constructor private
	private Singleton(){}
	
	//use double null check mechanism to avoid synchronizing all getInstance calls
	public static Singleton getInstance(){		
		if(obj == null){
			synchronized(Singleton.class){
				if(obj == null)
					obj = new Singleton();
			}
		}		
		return obj;
	}
}

//Approach using Inner Static Helper Class
class AnotherSingletonHelper{
	
	private AnotherSingletonHelper(){};
	
	//private Inner class which has instance of singleton class
	private static class AnotherSingleton{
		private static final AnotherSingleton object = new AnotherSingleton();
	}
		
	//When this method is called, the inner class gets loaded and creates the singleton instance
	public static AnotherSingleton getInstance(){
		return AnotherSingleton.object;
		
	}
	
}


/** Preferred style for singletons. */
enum EnumSingleton {
  INSTANCE;
  
  /**Add some behavior to the object. */
  public void testMethod(){
    //elided    
  }
  
  /** Demonstrate use of EnumSIngleton. */
  public static void main(String[] aArgs){
	EnumSingleton obj = EnumSingleton.INSTANCE;
    obj.testMethod();
  }
} 