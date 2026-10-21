package com.finalshell.core;

public class Kv2 extends HM {
   public float g;

   public Kv2(SC var1, float var2) {
      super(var1);
      this.g = var2;
   }

   public void P(float var1) {
      this.g = var1;
   }

   public float m() {
      return this.g;
   }

   @Override
   public float h(float var1, float var2) {
      String var10000 = UZ.h();
      float var4 = 0.0F;
      String var3 = var10000;
      float var5 = 1.0F;

      while (true) {
         if (var5 <= this.g) {
            var4 += Math.abs(this.T.h(var5 * var1, var5 * var2)) / var5;
            var6 = var5 * 2.0F;
            if (var3 != null) {
               break;
            }

            var5 = var6;
            if (var3 == null) {
      float var6;
      float var6;
               continue;
            }
         }

         var6 = var4;
         break;
      }

      return var6;
   }
}






