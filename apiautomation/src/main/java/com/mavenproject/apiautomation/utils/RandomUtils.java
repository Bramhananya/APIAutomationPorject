package com.mavenproject.apiautomation.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

  private RandomUtils() {
  }

  static Random random = new Random();
  private static int maxRange = 1000000;

  public static int generateInt() {
    return generateInt(maxRange);
  }

  public static String generateText() {
    return "AutoTest" + generateInt(maxRange);
  }

  public static long generateTenDigitNumber() {
    ThreadLocalRandom random = ThreadLocalRandom.current();
    return random.nextLong(1_000_000_000L, 10_000_000_000L);
  }

  public static int generateInt(int n) {
    return random.nextInt(n);
  }
}
