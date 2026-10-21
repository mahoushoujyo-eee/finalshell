package com.finalshell.core;

import java.util.Random;

public final class Gw2 {
   public static Random g;
   public static long a;

   public static int U() {
      return g.nextInt((int)a);
   }

   public static int K(int var0) {
      return g.nextInt(var0);
   }

   public static int d(int var0, int var1) {
      return var0 + g.nextInt(Math.abs(var1 + 1 - var0));
   }

   public static int J(int[] var0) {
      return var0[d(0, var0.length - 1)];
   }

   public static int t(int var0) {
      return var0 * var0;
   }

   public static float d(float var0) {
      return var0 * var0;
   }

   public static int t(double var0) {
      return (int)Math.round(Math.sqrt(var0));
   }

   public static int B(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var0, var2));
   }

   public static int E(int[] var0) {
      int var4;
      String var10000 = FV_2.D();
      int var2 = var0[0];
      String var1 = var10000;
      int var3 = 1;

      while (true) {
         if (var3 < var0.length) {
            var4 = Math.max(var2, var0[var3]);
            if (var1 != null) {
               break;
            }

            var2 = var4;
            var3++;
            if (var1 == null) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   public static int G(int[] var0) {
      int var4;
      int var2 = var0[0];
      String var10000 = FV_2.D();
      int var3 = 1;
      String var1 = var10000;

      while (true) {
         if (var3 < var0.length) {
            var4 = Math.min(var2, var0[var3]);
            if (var1 != null) {
               break;
            }

            var2 = var4;
            var3++;
            if (var1 == null) {
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2401441949717262167L;
      long var10002 = -120004651069313230L ^ var0;
      byte var10001 = -1;
      a = var10002;
      g = new Random();
   }
}





