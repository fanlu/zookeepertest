package com.fl.zookeepertest;

/**
 * @ClassName: TestCurrentZk
 * @Description: TODO
 * @author: LUCKY
 * @date:2016年2月2日 下午11:36:04
 */
public class TestCurrentZk {

	public static void main(String[] args) throws Exception {
		Thread threads[] = new Thread[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
					DistributedLock clientTest = new DistributedLock(
							"localhost:2181", "locknametest");
					clientTest.getLocks();
				}
			});

			threads[i].start();

		}
		Thread.sleep(Integer.MAX_VALUE);
	}
}
