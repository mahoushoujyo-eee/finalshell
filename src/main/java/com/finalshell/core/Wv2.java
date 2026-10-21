package com.finalshell.core;

import java.util.Random;

public class Wv2 {
   static Random W;

   static {
      __vfClinit__();
   }

   public Wv2() {
      W = new Random();
   }

   public static int j() {
      return W.nextInt();
   }

   public static int A(int var0) {
      return W.nextInt(var0);
   }

   public static Long q() {
      return W.nextLong();
   }

   public static Float T() {
      return W.nextFloat();
   }

   public static void __vfClinit__() {
      W = new Random();
   }
}





