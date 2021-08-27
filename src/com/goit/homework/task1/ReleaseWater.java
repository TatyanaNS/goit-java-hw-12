package com.goit.homework.task1;

public class ReleaseWater {

  public static void main(String[] args) {

    Molecules molecules = new Molecules();

    try {

      Thread h = new Thread(() -> {
        try {
          molecules.releaseHydrogen();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });

      Thread o = new Thread(() -> {
        try {
          molecules.releaseOxygen();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });

      h.start();
      o.start();

    } catch (Exception ignored) {
    }
  }
}