package com.threadextendsthreadclass;
import java.lang.Runnable;
import java.util.*;
public class ThreadRunning extends Thread{
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		ThreadRunning t1=new ThreadRunning();  
		t1.start();  
		 }
}
