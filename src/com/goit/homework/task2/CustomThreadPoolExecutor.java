package com.goit.homework.task2;

class CustomThreadPoolExecutor {

  public void execute(Runnable myRunnable) {
    Repeat annotation = MyRunnable.class.getDeclaredAnnotation(Repeat.class);

    for (int i = 0; i < annotation.value() ; i++) {
      myRunnable.run();
    }
  }
}