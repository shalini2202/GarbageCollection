package com.GarbageCollection;

public class GCNFinalize {

	 public void finalize(){
		 System.out.println("object is garbage collected");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GCNFinalize gc1 = new GCNFinalize();
		GCNFinalize gc2 = new GCNFinalize();
		
		gc1 = null;
		gc2 = null;
		
		System.gc();
		

	}

}
