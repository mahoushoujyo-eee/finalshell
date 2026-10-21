package com.finalshell.core;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

public class M_3 implements Icon {
   public final D_2_2 x;
   public static long[] a;
   public static Integer[] b;

   public M_3(D_2_2 var1) {
      this.x = var1;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      int[] var5 = D_2_2.W();
      Icon var10000 = D_2_2.X(this.x).getFrameIcon();
      if (var5 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = D_2_2.g(this.x).getFrameIcon();
      }

      var10000.paintIcon(var1, var2, var3, var4);
   }

   @Override
   public int getIconWidth() {
      int[] var1 = D_2_2.W();
      Icon var10000 = D_2_2.D(this.x).getFrameIcon();
      if (var1 == null) {
         if (var10000 == null) {
            return a(23165, 6140383083694913544L);
         }

         var10000 = D_2_2.o(this.x).getFrameIcon();
      }

      return var10000.getIconWidth();
   }

   @Override
   public int getIconHeight() {
      int[] var1 = D_2_2.W();
      Icon var10000 = D_2_2.G(this.x).getFrameIcon();
      if (var1 == null) {
         if (var10000 == null) {
            return a(2280, 8839665802153699996L);
         }

         var10000 = D_2_2.J(this.x).getFrameIcon();
      }

      return var10000.getIconHeight();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8820;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7258878483675810214L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "(¹S¯é³#*:h=\u009a'Jñ¾";
      int var5 = "(¹S¯é³#*:h=\u009a'Jñ¾".length();
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





