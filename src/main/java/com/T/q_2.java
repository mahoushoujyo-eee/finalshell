package com.t;

import java.awt.Color;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.HashMap;
import java.util.Map;

class q_2 implements PaintContext {
   private Map s;
   final AffineTransform C;
   final c_2 i;
   private static final long a;

   q_2(c_2 var1, AffineTransform var2) {
      this.i = var1;
      this.C = var2;
      this.s = new HashMap();
   }

   @Override
   public void dispose() {
      this.s.clear();
   }

   @Override
   public ColorModel getColorModel() {
      return c_2.t(this.i);
   }

   @Override
   public Raster getRaster(int var1, int var2, int var3, int var4) {
      int var10000 = com.t.n_2.W();
      Rectangle var6 = new Rectangle(var1, var2, var3, var4);
      int var5 = var10000;
      com.t.q_2 var14 = this;
      if (var5 != 0) {
         if (this.s.containsKey(var6)) {
            return (Raster)this.s.get(var6);
         }

         var14 = this;
      }

      WritableRaster var7 = c_2.t(var14.i).createCompatibleWritableRaster(var3, var4);
      var2 = (int)((long)var2 - Math.round(this.C.getTranslateY()));
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
                  Color var11 = new com.t.A(1.0F - (float)(var2 + var9) / (float)(c_2.O(this.i) * 2 + c_2.L(this.i)), 1.0F, 1.0F).E();
                  int var12 = (var9 * var3 + var10) * 4;
                  var8[var12] = c_2.l(this.i, var11.getRed());
                  var8[var12 + 1] = c_2.l(this.i, var11.getGreen());
                  var8[var12 + 2] = c_2.l(this.i, var11.getBlue());
                  var8[var12 + 3] = (int)a;
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
         this.s.put(var6, var7);
         break;
      }

      return var7;
   }

   static {
      long var0 = 976348985882135495L;
      long var10002 = -4283835738001159368L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





