package com.goit.homework.task2;

public class StartMyRunnable {

  public static void main(String[] strings) {

    CustomThreadPoolExecutor customThreadPoolExecutor = new CustomThreadPoolExecutor();
    customThreadPoolExecutor.execute(new MyRunnable());
  }
}