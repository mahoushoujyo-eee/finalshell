package com.finalshell.core;

import java.util.Arrays;

public class Rp2 {
   public final byte[] X;

   Rp2(int[] var1) {
      this.X = e(var1);
   }

   Rp2(byte[] var1) {
      this.X = var1;
   }

   @Override
   public boolean equals(Object var1) {
      String[] var2 = Wq2_2.y();
      Object var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof Rp2)) {
            return false;
         }

         var10000 = var1;
      }

      Rp2 var3 = (Rp2)var10000;
      return Arrays.equals(this.X, var3.X);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.X);
   }

   public static byte[] e(int[] var0) {
      byte[] var1 = new byte[var0.length];
      int var2 = 0;

      for (int var6 : var0) {
         var1[var2] = (byte)var6;
         var2++;
      }

      return var1;
   }
}





