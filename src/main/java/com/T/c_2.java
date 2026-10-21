package com.t;

import com.P9;
import java.awt.Color;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public class c_2 implements Paint {
   private boolean O = false;
   private ColorModel f = ColorModel.getRGBdefault();
   private int Q;
   private int D;
   private static final long[] a;
   private static final Integer[] b;

   public c_2(int var1, int var2) {
      this.Q = var1;
      this.D = var2;
   }

   @Override
   public PaintContext createContext(ColorModel var1, Rectangle var2, Rectangle2D var3, AffineTransform var4, RenderingHints var5) {
      return new com.t.q_2(this, var4);
   }

   public Color T(int var1) {
      return new com.t.A(1.0F - Math.max(0.0F, Math.min((float)(var1 - this.Q) / (float)this.D, 1.0F)), 1.0F, 1.0F).E();
   }

   private int v(int var1) {
      int var2 = com.t.n_2.W();
      int var10000 = this.O;
      if (var2 != 0) {
         if (this.O) {
            var1 = P9.d(var1);
         }

         var10000 = var1;
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            var1 = 0;
            if (var2 != 0) {
               return var1;
            }
         }

         var10000 = var1;
      }

      if (var2 == 0) {
         return var10000;
      } else {
         if (var10000 > a(5840, 7828266098155595869L)) {
            var1 = a(15824, 547945893086495580L);
         }

         return var1;
      }
   }

   @Override
   public int getTransparency() {
      return 1;
   }

   public boolean i() {
      return this.O;
   }

   public void D(boolean var1) {
      this.O = var1;
   }

   static ColorModel t(c_2 var0) {
      return var0.f;
   }

   static int O(c_2 var0) {
      return var0.Q;
   }

   static int L(c_2 var0) {
      return var0.D;
   }

   static int l(c_2 var0, int var1) {
      return var0.v(var1);
   }

   static {
      long var0 = 8227343561617086384L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Ñ\u0091ÇÀP\u0084¿\u0012#\u0004RþúÆ\u0094\u0013";
      int var5 = "Ñ\u0091ÇÀP\u0084¿\u0012#\u0004RþúÆ\u0094\u0013".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16013;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





