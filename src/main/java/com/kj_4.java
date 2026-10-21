package com;

import java.awt.image.BufferedImage;

public class kj_4 {
   public BufferedImage W;
   public int p;
   private static com.ky_4[] P;

   public kj_4(BufferedImage var1, int var2) {
      this.W = var1;
      this.p = var2;
   }

   public static void C(com.ky_4[] var0) {
      P = var0;
   }

   public static com.ky_4[] d() {
      return P;
   }

   static {
      if (d() == null) {
         C(new com.ky_4[4]);
      }
   }
}





