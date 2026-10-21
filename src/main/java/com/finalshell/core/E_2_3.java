package com.finalshell.core;

import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.HashMap;
import java.util.Map;

public class E_2_3 implements PaintContext {
   public Map M;
   public final AffineTransform k;
   public final Q6 F;
   public static long a;

   public E_2_3(Q6 var1, AffineTransform var2) {
      this.F = var1;
      this.k = var2;
      this.M = new HashMap();
   }

   @Override
   public void dispose() {
      this.M.clear();
   }

   @Override
   public ColorModel getColorModel() {
      return Q6.m(this.F);
   }

   @Override
   public Raster getRaster(int var1, int var2, int var3, int var4) {
      int var10000 = com.finalshell.ui.panel.N_2.W();
      Rectangle var6 = new Rectangle(var1, var2, var3, var4);
      int var5 = var10000;
      E_2_3 var14 = this;
      if (var5 != 0) {
         if (this.M.containsKey(var6)) {
            return (Raster)this.M.get(var6);
         }

         var14 = this;
      }

      WritableRaster var7 = Q6.m(var14.F).createCompatibleWritableRaster(var3, var4);
      var1 = (int)((long)var1 - Math.round(this.k.getTranslateX()));
      var2 = (int)((long)var2 - Math.round(this.k.getTranslateY()));
      int[] var8 = new int[var3 * var4 * 4];
      int var9 = 0;

      while (true) {
         if (var9 < var4) {
            if (var5 == 0) {
               break;
            }

            int var10 = 0;

            label35: {
               while (var10 < var3) {
                  int var11 = (var9 * var3 + var10) * 4;
                  var8[var11] = Q6.N(this.F, var1 + var10, var2 + var9);
                  var8[var11 + 1] = Q6.n(this.F, var1 + var10, var2 + var9);
                  var8[var11 + 2] = Q6.F(this.F, var1 + var10, var2 + var9);
                  var8[var11 + 3] = (int)a;
                  var10++;
                  if (var5 == 0) {
                     break label35;
                  }

                  if (var5 == 0) {
                     break;
                  }
               }

               var9++;
            }

            if (var5 != 0) {
               continue;
            }
         }

         var7.setPixels(0, 0, var3, var4, var8);
         this.M.put(var6, var7);
         break;
      }

      return var7;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6778374795622601653L;
      long var10002 = 5495360986477744970L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





