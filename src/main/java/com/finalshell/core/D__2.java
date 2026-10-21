package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Oz4;
import com.finalshell.ui.model.RP3;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;

public class D__2 {
   public boolean g;
   public XE T;
   public RP3 X;
   public boolean I;
   public boolean p;
   public long v;
   public boolean j;
   public final SetBackgroundImagePanel i;
   public static long[] a;
   public static Integer[] b;

   public D__2(SetBackgroundImagePanel var1) {
      this.i = var1;
      this.T = new XE();
      this.X = RP3.BLINK_BLOCK;
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
      int var1 = ConnectionProperty.M$int();
      D__2 var10000 = this;
      if (var1 != 0) {
         if (SetBackgroundImagePanel.H$Wq_2(this.i) != null) {
            return SetBackgroundImagePanel.H$Wq_2(this.i).x() - 1;
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
      int var1 = ConnectionProperty.y();
      int var10000 = (this.p) ? 1 : 0;
      if (var1 == 0) {
         if (!this.p) {
            return 0 != 0;
         }

         var10000 = SetBackgroundImagePanel.k(this.i);
      }

      if (var1 != 0) {
         return var10000 != 0;
      } else {
         return (boolean)((var10000 > 0 ? 1 : 0) != 0);
      }
   }

   public void E() {
      this.j = true;
      this.v = System.currentTimeMillis();
      this.i.repaint();
   }

   public boolean d(long var1) {
      int var3 = ConnectionProperty.M$int();
      long var4;
      int var10000 = (var4 = var1 - this.v - (long)SetBackgroundImagePanel.k(this.i)) == 0L ? 0 : (var4 < 0L ? -1 : 1);
      if (var3 != 0) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return var10000 != 0;
   }

   public void F() {
      int var1 = ConnectionProperty.y();
      if (this.i.isFocusOwner()) {
         long var2 = System.currentTimeMillis();
         D__2 var10000 = this;
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

   public Oz4 M() {
      int var1 = ConnectionProperty.M$int();
      boolean var10000 = this.U();
      if (var1 != 0) {
         if (!var10000) {
            return Oz4.SHOWING;
         }

         var10000 = this.j;
      }

      if (var1 != 0) {
         if (var10000) {
            return Oz4.SHOWING;
         }

         var10000 = this.g;
      }

      return !var10000 ? Oz4.HIDDEN : Oz4.SHOWING;
   }

   public Oz4 Y() {
      int var1 = ConnectionProperty.y();
      boolean var10000 = this.I;
      if (var1 == 0) {
         if (!this.I) {
            return Oz4.HIDDEN;
         }

         if (var1 != 0) {
            return this.M();
         }

         var10000 = this.i.isFocusOwner();
      }

      return !var10000 ? Oz4.NO_FOCUS : this.M();
   }

   public void Z(String var1, Graphics2D var2, YP var3) {
      int var10000 = ConnectionProperty.M$int();
      Oz4 var5 = this.Y();
      int var4 = var10000;
      if (var5 != Oz4.HIDDEN) {
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
            com.finalshell.ui.model.J2 var8 = new com.finalshell.ui.model.J2(var1);
            int var9 = var6 * this.i.c4.width + this.i.p$int();
            int var10 = var7 * this.i.c4.height;
            int var11 = Sd2.s(var8.r(), var8.o(), var8.length(), SetBackgroundImagePanel.S(this.i).L());
            int var12 = Math.min(this.i.c4.height, this.i.getHeight() - var10);
            int var13 = Math.min(var11 * this.i.c4.width, this.i.getWidth() - var9);
            byte var14 = 2;
            Color var10001 = (Color)(Registry.emptyArgs());
            long var19 = 331166851261172891L;
            Object[] var18 = var10001;
            var10001 = Ref.h(331166851261172891L, var18, var19);

            try {
               var10001 = (Color)var10001;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            Color var15 = SetBackgroundImagePanel.C(var10001, a(13962, 9202906599151132374L));
            switch (O92.Q[this.X.ordinal()]) {
               case 1:
               case 2:
                  if (var5 == Oz4.SHOWING) {
                     YP var16 = SetBackgroundImagePanel.Y(this.i, var3);
                     Color var17 = SetBackgroundImagePanel.t(this.i, SetBackgroundImagePanel.Z(this.i).R(var16.Z()));
                     Color var10002 = (Color)(Registry.emptyArgs());
                     long var21 = 331166851261172891L;
                     Object[] var20 = var10002;
                     var10002 = Ref.h(331166851261172891L, var20, var21);

                     try {
                        var10002 = (Color)var10002;
                     } catch (InvocationTargetException var22) {
                        throw var22.getTargetException();
                     }

                     var17 = SetBackgroundImagePanel.C(var10002, a(5919, 134014653475028802L));
                     var2.setColor(var17);
                     var2.setColor(var15);
                     var2.fillRect(var9, var10, var13, var12);
                     SetBackgroundImagePanel.M(this.i, var6, var7, var8, var3, var2, false, false);
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

   public void p(RP3 var1) {
      this.X = var1;
   }

   public static boolean p(D__2 var0, boolean var1) {
      return var0.p = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26717;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
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
}





