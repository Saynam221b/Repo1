package com;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExceptionH {

	public static void main(final String[] args) throws InterruptedException {
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(new Task());

		ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;
		pool.shutdown();
	}

	static class Task implements Runnable {

		@Override
		public void run() {

			try {
				long duration = (long) (Math.random() * 5);

				System.out.println("Running..");
				TimeUnit.SECONDS.sleep(duration);
				System.out.println("Done");
			}

			catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
