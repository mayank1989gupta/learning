/**
 * 
 */
package com.learning.samplers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Mayank
 *
 */
public class ExecutorSample implements Callable<String> {
	private int number;
	public ExecutorSample(int number) {
		this.number = number;
	}

	private static ExecutorService executor = Executors.newFixedThreadPool(5);

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<String> callable = null;
		List<Future<String>> list = new ArrayList<Future<String>>();
		Future<String> future = null;

		for(int i=10; i <= 15; i++){
			callable = new ExecutorSample(i);
			future = executor.submit(callable);
			list.add(future);
		}

		/**
		 * For 1&2 second task it will return immediately. 
		 * We will wait for the third until task will get completed. 
		 * Even if 4th task completed, iteration will wait for the third task . 
		 */
		for(Future<String> fut : list) {
			System.out.println("main()" + " **** " + Thread.currentThread().getName() + " **** " + fut.get());
			//System.out.println(fut.get());
		}

		executor.shutdown();//shutdown executor

	}

	@Override
	public String call() throws Exception {
		StringBuilder result = new StringBuilder();
		result.append("For Number: ").append(number).append(": ");
		for(int i = 0 ; i < number; i++) {
			if(number == 12) {
				Thread.sleep(500);
			}
			result.append("Number: ").append(i).append("  ");
		}

		return result.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		executor.shutdown();//GC
		super.finalize();
	}

}
