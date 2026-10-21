package com.finalshell.ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import javax.swing.JPanel;

public class SP extends JPanel {
   public Dimension K = new Dimension(a(22388, 1388335077066673046L), a(12892, 5118450692145278652L));
   public static long[] a;
   public static Integer[] b;

   public SP() {
      this.setOpaque(false);
   }

   @Override
   public void paintComponent(Graphics var1) {
      Insets var2 = this.getBorder().getBorderInsets(this);
      int var3 = var2.left;
      int var4 = this.getBorder().getBorderInsets(this).top;
      int var5 = this.getWidth();
      int var6 = this.getHeight();
      Graphics2D var7 = (Graphics2D)var1;
      byte var8 = 0;
      var7.setColor(new Color(var8, var8, var8, a(21641, 3944900261045733482L)));
      var7.fillRoundRect(var3, var4, var5 - var2.left - var2.right, var6 - var2.top - var2.bottom, this.K.width, this.K.height);
   }

   public Dimension z() {
      return this.K;
   }

   public void x(Dimension var1) {
      this.K = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23778;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5641139834241331243L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "Õ´\u008d¶\u0015\u0084»©¬ñ\u0015ça¸¸\u0011gï´`¥é^\u0083";
      int var5 = "Õ´\u008d¶\u0015\u0084»©¬ñ\u0015ça¸¸\u0011gï´`¥é^\u0083".length();
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





