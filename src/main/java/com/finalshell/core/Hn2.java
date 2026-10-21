package com.finalshell.core;

public class Hn2 extends HM {
   public float w = 1.0F;

   public Hn2(SC var1) {
      super(var1);
   }

   @Override
   public float h(float var1, float var2) {
      String var10000 = UZ.h();
      float var4 = 0.0F;
      float var5 = 1.0F;
      String var3 = var10000;

      while (true) {
         if (var5 <= this.w) {
            var4 += this.T.h(var5 * var1, var5 * var2) / var5;
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






