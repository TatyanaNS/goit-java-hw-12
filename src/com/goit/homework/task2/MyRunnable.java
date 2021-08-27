package com.goit.homework.task2;

@Repeat(3)
class MyRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("Hello!");
  }
}