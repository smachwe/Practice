package com.ik.homework.tree;

public class Lazy {
	private static boolean ini = false;
	
	static {
		Thread t = new Thread(new Runnable(){
			public void run(){
				ini = true;
			}
		});
		t.start();
		try{
			//t.join();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ini);

	}

}
