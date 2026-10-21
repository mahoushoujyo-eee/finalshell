package com;

public class zs_2 {
   private static com.ky_4[] y;

   public static void n(com.ky_4[] var0) {
      y = var0;
   }

   public static com.ky_4[] v() {
      return y;
   }

   static {
      if (v() != null) {
         n(new com.ky_4[3]);
      }
   }
}





