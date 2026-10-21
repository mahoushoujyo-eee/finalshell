package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.image.BufferedImage;
import javax.swing.Icon;

public abstract class ZJ implements Up2 {
   public static Insets T;
   public static long[] a;
   public static Integer[] b;

   public FontMetrics Z(Object var1) {
      return FN.E$FontMetrics();
   }

   public abstract Icon n(Object var1);

   public abstract String O(Object var1);

   @Override
   public BufferedImage u(Object var1, DragSourceDragEvent var2) {
      int var3;
      Icon var4;
      String var5;
      FontMetrics var6;
      int var13;
      label37: {
         int var10000 = Rn2.Y();
         var4 = this.n(var1);
         var3 = var10000;
         var5 = this.O(var1);
         var6 = this.Z(var1);
         Icon var10001 = var4;
         if (var3 != 0) {
            if (var4 == null) {
               var13 = 3;
               break label37;
            }

            var10001 = var4;
         }

         var13 = var10001.getIconWidth() + 4;
      }

      int var7;
      int var9;
      label31: {
         var7 = T.left + var13;
         int var8 = T.right + 3;
         var9 = var7 + var6.stringWidth(var5) + var8;
         Icon var14 = var4;
         if (var3 != 0) {
            if (var4 == null) {
               var13 = 0;
               break label31;
            }

            var14 = var4;
         }

         var13 = var14.getIconHeight();
      }

      int var10 = T.top + Math.max(var13, var6.getHeight()) + T.bottom;
      BufferedImage var11 = Xg2.g(var9, var10, 3);
      Graphics2D var12 = var11.createGraphics();
      RV.p(var12, 0.8F);
      RV.b(var12, var6.getFont());
      RV.L(var12);
      var12.setPaint(Color.WHITE);
      var12.fillRect(0, 0, var9, var10);
      var12.setPaint(Color.LIGHT_GRAY);
      var12.drawRect(0, 0, var9 - 1, var10 - 1);
      if (var3 != 0) {
         if (var4 != null) {
            var4.paintIcon(null, var12, T.left, T.top);
         }

         var12.setPaint(Color.BLACK);
         var12.drawString(var5, var7, T.top + (var10 - T.top - T.bottom) / 2 + GA.d(var6));
         var12.dispose();
      }

      if (var3 == 0) {
         Ky4.K(new String[3]);
      }

      return var11;
   }

   @Override
   public Point e(Object var1, DragSourceDragEvent var2) {
      return new Point(a(20335, 8956823061290534712L), 5);
   }

   @Override
   public void v(Object var1, DragSourceDropEvent var2) {
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2135;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5307909822936804245L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "(V\u0005\u0005óË¬´º'\u001bÈ\u007fbn=\u001fn\u0010-g~µí";
      int var5 = "(V\u0005\u0005óË¬´º'\u001bÈ\u007fbn=\u001fn\u0010-g~µí".length();
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
      T = new Insets(a(22059, 1826042720172039806L), a(3576, 3249174288654534062L), a(3576, 3249174288654534062L), a(3576, 3249174288654534062L));
   }
}





