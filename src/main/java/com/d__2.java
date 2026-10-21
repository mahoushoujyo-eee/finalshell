package com;

import java.awt.Color;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class d__2 {
   private boolean g;
   protected XE T;
   private rP_3 X;
   private boolean I;
   private boolean p;
   private long v;
   private boolean j;
   final pA_3 i;
   private static final long[] a;
   private static final Integer[] b;

   public d__2(pA_3 var1) {
      this.i = var1;
      this.T = new XE();
      this.X = rP_3.BLINK_BLOCK;
      this.I = true;
      this.p = true;
   }

   public void z(int var1) {
      this.T.q = var1;
      this.E();
   }

   public void J(int var1) {
      this.T.r = var1;
      this.E();
   }

   public int Q() {
      int var1 = _y_2.M();
      com.d__2 var10000 = this;
      if (var1 != 0) {
         if (pA_3.H(this.i) != null) {
            return pA_3.H(this.i).x() - 1;
         }

         var10000 = this;
      }

      return var10000.T.q;
   }

   public int O() {
      return this.T.r - 1 - this.i.P;
   }

   public void d(boolean var1) {
      this.I = var1;
   }

   public void a(boolean var1) {
      this.p = var1;
   }

   public boolean U() {
      int var1 = _y_2.y();
      int var10000 = this.p;
      if (var1 == 0) {
         if (!this.p) {
            return (boolean)0;
         }

         var10000 = pA_3.k(this.i);
      }

      if (var1 != 0) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 > 0 ? 1 : 0);
      }
   }

   public void E() {
      this.j = true;
      this.v = System.currentTimeMillis();
      this.i.repaint();
   }

   private boolean d(long var1) {
      int var3 = _y_2.M();
      long var4;
      int var10000 = (var4 = var1 - this.v - (long)pA_3.k(this.i)) == 0L ? 0 : (var4 < 0L ? -1 : 1);
      if (var3 != 0) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   public void F() {
      int var1 = _y_2.y();
      if (this.i.isFocusOwner()) {
         long var2 = System.currentTimeMillis();
         com.d__2 var10000 = this;
         if (var1 == 0) {
            if (!this.d(var2)) {
               return;
            }

            var10000 = this;
         }

         boolean var10001 = this.g;
         if (var1 == 0) {
            var10001 = !this.g;
         }

         var10000.g = var10001;
         this.v = var2;
         this.j = false;
         this.i.repaint();
      }
   }

   private com.oz_4 M() {
      int var1 = _y_2.M();
      boolean var10000 = this.U();
      if (var1 != 0) {
         if (!var10000) {
            return com.oz_4.SHOWING;
         }

         var10000 = this.j;
      }

      if (var1 != 0) {
         if (var10000) {
            return com.oz_4.SHOWING;
         }

         var10000 = this.g;
      }

      return !var10000 ? com.oz_4.HIDDEN : com.oz_4.SHOWING;
   }

   private com.oz_4 Y() {
      int var1 = _y_2.y();
      boolean var10000 = this.I;
      if (var1 == 0) {
         if (!this.I) {
            return com.oz_4.HIDDEN;
         }

         if (var1 != 0) {
            return this.M();
         }

         var10000 = this.i.isFocusOwner();
      }

      return !var10000 ? com.oz_4.NO_FOCUS : this.M();
   }

   void Z(String var1, Graphics2D var2, com.YP var3) {
      int var10000 = _y_2.M();
      com.oz_4 var5 = this.Y();
      int var4 = var10000;
      if (var5 != com.oz_4.HIDDEN) {
         int var6 = this.Q();
         int var7 = this.O();
         var10000 = var7;
         if (var4 != 0) {
            if (var7 < 0) {
               return;
            }

            var10000 = var7;
         }

         if (var10000 < this.i.N.c()) {
            j_2 var8 = new j_2(var1);
            int var9 = var6 * this.i.c4.width + this.i.p();
            int var10 = var7 * this.i.c4.height;
            int var11 = Sd_2.s(var8.r(), var8.o(), var8.length(), pA_3.S(this.i).L());
            int var12 = Math.min(this.i.c4.height, this.i.getHeight() - var10);
            int var13 = Math.min(var11 * this.i.c4.width, this.i.getWidth() - var9);
            byte var14 = 2;
            nY var22 = this.i.cM;
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(331166851261172891L);
            Object[] var10002 = var10001;
            nY var28 = var22;
            Method var23 = var10003;

            try {
               var24 = (Color)var23.invoke(var28, var10002);
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            Color var15 = pA_3.C(var24, a(13962, 9202906599151132374L));
            switch (com.o9_2.Q[this.X.ordinal()]) {
               case 1:
               case 2:
                  if (var5 == com.oz_4.SHOWING) {
                     com.YP var16 = pA_3.Y(this.i, var3);
                     Color var17 = pA_3.t(this.i, pA_3.Z(this.i).R(var16.Z()));
                     nY var25 = this.i.cM;
                     var10001 = com.c.f();
                     var10003 = com.c.d(331166851261172891L);
                     var10002 = var10001;
                     nY var30 = var25;
                     Method var26 = var10003;

                     try {
                        var27 = (Color)var26.invoke(var30, var10002);
                     } catch (InvocationTargetException var18) {
                        throw var18.getTargetException();
                     }

                     var17 = pA_3.C(var27, a(5919, 134014653475028802L));
                     var2.setColor(var17);
                     var2.setColor(var15);
                     var2.fillRect(var9, var10, var13, var12);
                     pA_3.M(this.i, var6, var7, var8, var3, var2, false, false);
                     if (var4 != 0) {
                        break;
                     }
                  }

                  var2.setColor(var15);
                  var2.drawRect(var9, var10, var13, var12);
                  if (var4 != 0) {
                     break;
                  }
               case 3:
               case 4:
                  var2.setColor(var15);
                  var2.fillRect(var9, var10 + var12, var13, var14);
                  if (var4 != 0) {
                     break;
                  }
               case 5:
               case 6:
                  var2.setColor(var15);
                  var2.fillRect(var9, var10, var14, var12);
            }
         }
      }
   }

   void p(rP_3 var1) {
      this.X = var1;
   }

   static boolean p(com.d__2 var0, boolean var1) {
      return var0.p = var1;
   }

   static {
      long var0 = 1615052263949713823L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "^àbÝ!z¾\"ª<\u0004\u0018Ñé\u009f¶";
      int var5 = "^àbÝ!z¾\"ª<\u0004\u0018Ñé\u009f¶".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26717;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





