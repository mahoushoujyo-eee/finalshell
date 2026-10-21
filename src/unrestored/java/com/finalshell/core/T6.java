package com.finalshell.core;

import java.awt.image.ColorModel;

public class T6 extends XM {
   public T6(float var1, ColorModel var2, ColorModel var3) {
      super(var1, var2, var3);
   }

   @Override
   public void G(int[] var1, int[] var2, float var3) {
      String var10000 = RA3.c();
      int var5 = var1.length;
      String var4 = var10000;
      byte var6 = 0;

      while (var6 < var5) {
         int var7 = var1[var6];
         int var8 = var2[var6];
         int var9 = var1[var6 + 1];
         int var10 = var2[var6 + 1];
         int var11 = var1[var6 + 2];
         int var12 = var2[var6 + 2];
         int var13 = var1[var6 + 3];
         int var14 = var2[var6 + 3];
         int var20 = var8;
         if (var4 == null) {
            var20 = var8 < var7 ? var8 : var7;
         }

         int var15 = var20;
         int var21 = var10;
         if (var4 == null) {
            var21 = var10 < var9 ? var10 : var9;
         }

         int var16 = var21;
         int var22 = var12;
         if (var4 == null) {
            var22 = var12 < var11 ? var12 : var11;
         }

         int var17 = var22;
         float var18 = var3 * (float)var13 / 255.0F;
         float var19 = 1.0F - var18;
         var2[var6] = (int)(var18 * (float)var15 + var19 * (float)var8);
         var2[var6 + 1] = (int)(var18 * (float)var16 + var19 * (float)var10);
         var2[var6 + 2] = (int)(var18 * (float)var17 + var19 * (float)var12);
         var2[var6 + 3] = (int)((float)var13 * var3 + (float)var14 * var19);
         var6 += 4;
         if (var4 != null) {
            break;
         }
      }
   }
}





