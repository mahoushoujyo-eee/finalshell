package com.finalshell.ui.model;

import com.finalshell.core.A6;
import com.finalshell.core.ND_2;
import com.finalshell.ui.panel.Ky4;
import java.util.Comparator;

public class Bl2 implements Comparator {
   public int O(ND_2 var1, ND_2 var2) {
      Ky4[] var10000 = A6.P();
      byte var4 = 0;
      Ky4[] var3 = var10000;
      float var5 = 1.0F - var2.k.g;
      float var6 = 1.0F - var1.k.g;
      int var7 = var2.k.t;
      int var8 = var1.k.t;
      int var9 = var7;
      int var10001 = var8;
      if (var3 != null) {
         if (var7 < var8) {
            var4 = 1;
            if (var3 != null) {
               return var4;
            }
         }

         var9 = var7;
         var10001 = var8;
      }

      if (var3 != null) {
         if (var9 > var10001) {
            var4 = -1;
            if (var3 != null) {
               return var4;
            }
         }

         var9 = var7;
         if (var3 == null) {
            return var7;
         }

         var10001 = var8;
      }

      if (var9 == var10001) {
         float var10;
         int var13 = (var10 = var5 - var6) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         if (var3 != null) {
            if (var13 < 0) {
               var4 = 1;
               if (var3 != null) {
                  return var4;
               }
            }

            float var11;
            var13 = (var11 = var5 - var6) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
         }

         if (var3 != null) {
            if (var13 > 0) {
               var4 = -1;
               if (var3 != null) {
                  return var4;
               }
            }

            float var12;
            var13 = (var12 = var5 - var6) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         }

         if (var3 == null) {
            return var13;
         }

         if (var13 == 0) {
            var4 = 0;
         }
      }

      return var4;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.O((ND_2)var1, (ND_2)var2);
   }
}





