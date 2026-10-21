package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LI extends L3 {
   public int E;
   public int Z;
   public float X;
   public boolean A;
   public boolean w;
   public boolean W;
   public boolean r;
   public int x;
   public int y;
   public float m;
   public static long[] a;
   public static Integer[] b;

   public LI() {
      this.E = a(19335, 474099625837707963L);
      this.Z = 0;
      this.X = 0.75F;
      this.A = true;
      this.w = true;
      this.W = true;
      this.r = true;
      this.x = a(19335, 474099625837707963L);
      this.y = 0;
      this.m = 0.75F;
   }

   public LI(int var1, int var2, float var3) {
      this.E = a(17392, 3842359393206651597L);
      this.Z = 0;
      this.X = 0.75F;
      this.A = true;
      this.w = true;
      this.W = true;
      this.r = true;
      this.x = a(19335, 474099625837707963L);
      this.y = 0;
      this.m = 0.75F;
      this.E = var1;
      this.Z = var2;
      this.X = var3;
   }

   public LI(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.E = a(19335, 474099625837707963L);
      this.Z = 0;
      this.X = 0.75F;
      this.A = true;
      this.w = true;
      Lz2_2.M();
      this.W = true;
      this.r = true;
      this.x = a(19335, 474099625837707963L);
      this.y = 0;
      this.m = 0.75F;
      this.A = var1;
      this.w = var2;
      this.W = var3;
      this.r = var4;
      if (Ky4.F$arrString() != null) {
         Lz2_2.d(new int[4]);
      }
   }

   public void F() {
      this.x = this.E;
      this.y = this.Z;
      this.m = this.X;
      this.P(Fk2.o(this.E, this.Z, this.X));
   }

   public int n$int() {
      return this.E;
   }

   public LI N(int var1) {
      this.E = var1;
      return this;
   }

   public int r() {
      return this.Z;
   }

   public LI D(int var1) {
      this.Z = var1;
      return this;
   }

   public float i() {
      return this.X;
   }

   public LI x(float var1) {
      this.X = var1;
      return this;
   }

   public boolean e() {
      return this.A;
   }

   public LI I(boolean var1) {
      this.A = var1;
      return this;
   }

   public boolean H() {
      return this.w;
   }

   public LI L(boolean var1) {
      this.w = var1;
      return this;
   }

   public boolean m() {
      return this.W;
   }

   public LI J(boolean var1) {
      this.W = var1;
      return this;
   }

   public boolean n$boolean() {
      return this.r;
   }

   public LI O(boolean var1) {
      this.r = var1;
      return this;
   }

   public LI w(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.A = var1;
      this.w = var2;
      this.W = var3;
      this.r = var4;
      return this;
   }

   @Override
   public Insets B(JComponent var1) {
      return new Insets(this.A ? this.E : 0, this.w ? this.E : 0, this.W ? this.E : 0, this.r ? this.E : 0);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      LI var10000;
      int[] var4;
      PF3 var5;
      label108: {
         label107: {
            var4 = Lz2_2.M();
            var10000 = this;
            label106:
            if (var4 == null) {
               if (this.x == this.E) {
                  var10000 = this;
                  if (var4 != null) {
                     break label106;
                  }

                  if (this.y == this.Z) {
                     var10000 = this;
                     if (var4 != null) {
                        break label106;
                     }

                     if (this.m == this.X) {
                        var5 = this.t;
                        if (var4 != null) {
                           break label108;
                        }

                        if (this.t != null) {
                           break label107;
                        }
                     }
                  }
               }

               var10000 = this;
            }

            var10000.F();
         }

         var5 = this.t;
      }

      if (var4 == null) {
         if (var5 == null) {
            return;
         }

         this.t.k(var3);
         var5 = this.t;
      }

      int var6;
      label84: {
         LI var10003 = this;
         if (var4 == null) {
            if (this.w) {
               var6 = 0;
               break label84;
            }

            var10003 = this;
         }

         var6 = var10003.E;
      }

      int var8;
      int var10002;
      label78: {
         var10002 = var2.x - var6;
         LI var10004 = this;
         if (var4 == null) {
            if (this.A) {
               var8 = 0;
               break label78;
            }

            var10004 = this;
         }

         var8 = var10004.E;
      }

      int var11;
      label72: {
         var6 = var2.y - var8;
         LI var10005 = this;
         if (var4 == null) {
            if (this.w) {
               var11 = 0;
               break label72;
            }

            var10005 = this;
         }

         var11 = var10005.E;
      }

      label66: {
         var8 = var2.width + var11;
         LI var12 = this;
         if (var4 == null) {
            if (this.r) {
               var11 = 0;
               break label66;
            }

            var12 = this;
         }

         var11 = var12.E;
      }

      int var15;
      label60: {
         var8 += var11;
         LI var10006 = this;
         if (var4 == null) {
            if (this.A) {
               var15 = 0;
               break label60;
            }

            var10006 = this;
         }

         var15 = var10006.E;
      }

      label54: {
         var11 = var2.height + var15;
         LI var16 = this;
         if (var4 == null) {
            if (this.W) {
               var15 = 0;
               break label54;
            }

            var16 = this;
         }

         var15 = var16.E;
      }

      var5.l(var1, var10002, var6, var8, var11 + var15);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2364;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3449872024967202370L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Ç#ÿ·\u0012\u0089\u0084ófÿ\nh³Í\u008c\u0085";
      int var5 = "Ç#ÿ·\u0012\u0089\u0084ófÿ\nh³Í\u008c\u0085".length();
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
}





