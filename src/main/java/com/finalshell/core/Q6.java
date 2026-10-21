package com.finalshell.core;

import java.awt.Color;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public class Q6 implements Paint {
   public Color g = Color.RED;
   public boolean D = false;
   public ColorModel C = ColorModel.getRGBdefault();
   public int S;
   public int z;
   public int I;
   public int N;
   public static long[] a;
   public static Integer[] b;

   public Q6(int var1, int var2, int var3, int var4, Color var5) {
      this.S = var1;
      this.z = var2;
      this.I = var3;
      this.N = var4;
      this.g = var5;
   }

   @Override
   public PaintContext createContext(ColorModel var1, Rectangle var2, Rectangle2D var3, AffineTransform var4, RenderingHints var5) {
      return new E_2_3(this, var4);
   }

   public Color X(int var1, int var2) {
      int var3;
      int var10000;
      int var10001;
      label43: {
         label46: {
            var3 = com.finalshell.ui.panel.N_2.W();
            var10000 = var1;
            var10001 = this.S;
            if (var3 != 0) {
               if (var1 < this.S) {
                  var1 = this.S;
                  if (var3 != 0) {
                     break label46;
                  }
               }

               var10000 = var1;
               var10001 = this.S + a(6751, 1642532646966100142L);
            }

            if (var3 == 0) {
               break label43;
            }

            if (var10000 > var10001) {
               var1 = this.S + a(29747, 3321551848957079233L);
            }
         }

         var10000 = var2;
         var10001 = this.z;
      }

      if (var3 != 0) {
         if (var10000 < var10001) {
            var2 = this.z;
            if (var3 != 0) {
               return new Color(this.v(var1, var2), this.G(var1, var2), this.f(var1, var2));
            }
         }

         var10000 = var2;
         var10001 = this.z + a(29747, 3321551848957079233L);
      }

      if (var3 != 0) {
         if (var10000 <= var10001) {
            return new Color(this.v(var1, var2), this.G(var1, var2), this.f(var1, var2));
         }

         var10000 = this.z;
         var10001 = a(29747, 3321551848957079233L);
      }

      var2 = var10000 + var10001;
      return new Color(this.v(var1, var2), this.G(var1, var2), this.f(var1, var2));
   }

   public int v(int var1, int var2) {
      int var3 = a(11882, 5026002081987179674L) - (a(11882, 5026002081987179674L) - this.g.getRed()) * (var1 - this.S) / this.I;
      var3 -= var3 * (var2 - this.z) / this.N;
      return this.q(var3);
   }

   public int G(int var1, int var2) {
      int var3 = a(11882, 5026002081987179674L) - (a(11882, 5026002081987179674L) - this.g.getGreen()) * (var1 - this.S) / this.I;
      var3 -= var3 * (var2 - this.z) / this.N;
      return this.q(var3);
   }

   public int f(int var1, int var2) {
      int var3 = a(11882, 5026002081987179674L) - (a(11882, 5026002081987179674L) - this.g.getBlue()) * (var1 - this.S) / this.I;
      var3 -= var3 * (var2 - this.z) / this.N;
      return this.q(var3);
   }

   public int q(int var1) {
      int var2 = com.finalshell.ui.panel.N_2.W();
      int var10000 = (this.D) ? 1 : 0;
      if (var2 != 0) {
         if (this.D) {
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
         if (var10000 > a(10922, 1162464156354719833L)) {
            var1 = a(11882, 5026002081987179674L);
         }

         return var1;
      }
   }

   @Override
   public int getTransparency() {
      return 1;
   }

   public Color L() {
      return this.g;
   }

   public boolean S() {
      return this.D;
   }

   public void c(boolean var1) {
      this.D = var1;
   }

   static ColorModel m(Q6 var0) {
      return var0.C;
   }

   static int N(Q6 var0, int var1, int var2) {
      return var0.v(var1, var2);
   }

   static int n(Q6 var0, int var1, int var2) {
      return var0.G(var1, var2);
   }

   static int F(Q6 var0, int var1, int var2) {
      return var0.f(var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6898;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2216463484755511855L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "äDè\u0091&Zåî#\u0004Y+ußº\u0089";
      int var5 = "äDè\u0091&Zåî#\u0004Y+ußº\u0089".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "4ÎÙ\u0015\u000bB>Jt\u001dõÝ \u001f\u008b\u0081";
                  var5 = "4ÎÙ\u0015\u000bB>Jt\u001dõÝ \u001f\u008b\u0081".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





