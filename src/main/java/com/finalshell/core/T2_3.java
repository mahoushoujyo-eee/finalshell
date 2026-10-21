package com.finalshell.core;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;

public class T2_3 extends T4 {
   public final com.finalshell.ui.panel.OQ l;
   public static long[] a;
   public static Integer[] b;

   public T2_3(com.finalshell.ui.panel.OQ var1) {
      this.l = var1;
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return this.l.i() ? com.finalshell.ui.panel.OQ.W : com.finalshell.ui.panel.OQ.b;
   }

   @Override
   public void layoutContainer(Container var1) {
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      byte var3 = (byte)((this.l.s.getComponentOrientation().isLeftToRight()) ? 1 : 0);
      Insets var4 = this.l.getInsets();
      String var2 = var10000;
      byte var5 = (byte)((this.l.i()) ? 1 : 0);
      int var6 = this.l.a.getText() != null ? 1 : 0;
      int var7 = var5 != 0 && this.l.o.getText() != null ? 1 : 0;
      int var8 = var5 != 0 && this.l.U.getText() != null ? 1 : 0;
      this.l.a.setVisible(var6);
      this.l.o.setVisible(var7);
      this.l.U.setVisible(var8);
      int var19 = var5;
      if (var2 != null) {
         if (var5 != 0) {
            int var24;
            label92: {
               var24 = var3;
               if (var2 != null) {
                  if (var3 != 0) {
                     var24 = var4.left;
                     break label92;
                  }

                  var24 = com.finalshell.ui.panel.OQ.W.width - var4.right;
               }

               var24 -= b(27489, 2062756884810957577L);
            }

            this.l.z.setBounds(var24, var4.top, b(5930, 1208210181485035331L), b(5930, 1208210181485035331L));
            if (var6 == 0) {
               return;
            }

            Dimension var9 = this.l.a.getPreferredSize();
            Dimension var10 = var7 != 0 ? this.l.o.getPreferredSize() : new Dimension(0, 0);
            Dimension var11 = var8 != 0 ? this.l.U.getPreferredSize() : new Dimension(0, 0);
            var24 = var7;
            if (var2 != null) {
               var24 = var7 != 0 ? 4 + var10.height : 0;
            }

            int var20 = var9.height + var24;
            var24 = var8;
            if (var2 != null) {
               var24 = var8 != 0 ? 4 + var11.height : 0;
            }

            int var12 = var20 + var24;
            int var21 = var3;
            if (var2 != null) {
               var21 = var3 != 0 ? var4.left + b(5930, 1208210181485035331L) + 4 : var4.left;
            }

            int var13 = var21;
            int var14 = com.finalshell.ui.panel.OQ.W.width - var4.left - var4.right - b(5930, 1208210181485035331L) - 4;
            int var15 = var4.top + (com.finalshell.ui.panel.OQ.W.height - var4.top - var4.bottom) / 2 - var12 / 2;
            this.l.a.setBounds(var13, var15, var14, var9.height);
            var15 += var9.height + 4;
            int var22 = var7;
            if (var2 != null) {
               if (var7 != 0) {
                  this.l.o.setBounds(var13, var15, var14, var10.height);
                  var15 += var10.height + 4;
               }

               var22 = var8;
            }

            if (var22 != 0) {
               this.l.U.setBounds(var13, var15, var14, var11.height);
            }

            if (var2 != null) {
               return;
            }
         }

         var19 = com.finalshell.ui.panel.OQ.b.width - var4.left - var4.right;
      }

      int var16 = var19;
      this.l.z.setBounds(var4.left + var16 / 2 - b(27170, 7877545228203754057L), var4.top, b(5930, 1208210181485035331L), b(5930, 1208210181485035331L));
      int var23 = var6;
      if (var2 != null) {
         if (var6 == 0) {
            return;
         }

         var23 = var4.top + b(5930, 1208210181485035331L) + 4;
      }

      int var17 = var23;
      this.l.a.setBounds(var4.left, var17, var16, com.finalshell.ui.panel.OQ.b.height - var17 - var4.bottom);
   }

   public Rectangle K() {
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      byte var2 = (byte)((this.l.s.getComponentOrientation().isLeftToRight()) ? 1 : 0);
      String var1 = var10000;
      Insets var3 = this.l.getInsets();
      byte var4 = (byte)((this.l.i()) ? 1 : 0);
      int var7 = var4;
      if (var1 != null) {
         if (var4 != 0) {
            int var8 = var2;
            if (var1 != null) {
               if (var2 == 0) {
                  return new Rectangle(
                     var3.left,
                     var3.top,
                     com.finalshell.ui.panel.OQ.W.width - 4 - b(5930, 1208210181485035331L) - var3.right,
                     com.finalshell.ui.panel.OQ.W.height - var3.top - var3.bottom
                  );
               }

               var8 = var3.left + b(5930, 1208210181485035331L) + 4;
            }

            int var6 = var8;
            return new Rectangle(
               var6, var3.top, com.finalshell.ui.panel.OQ.W.width - var6 - var3.right, com.finalshell.ui.panel.OQ.W.height - var3.top - var3.bottom
            );
         }

         var7 = var3.top + b(5930, 1208210181485035331L) + 4;
      }

      int var5 = var7;
      return new Rectangle(
         var3.left, var5, com.finalshell.ui.panel.OQ.b.width - var3.left - var3.right, com.finalshell.ui.panel.OQ.b.height - var5 - var3.bottom
      );
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26729;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 820168308794802473L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "¶ËPy\u0004Ó¾\\Ç~üN\f\u0099B\u0016÷Í\u001f\u0016Ø\u0097Ã{";
      int var5 = "¶ËPy\u0004Ó¾\\Ç~üN\f\u0099B\u0016÷Í\u001f\u0016Ø\u0097Ã{".length();
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
      b = new Integer[3];
   }
}





