package com;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public final class Qw_2 {
   public static void J() {
      if (com.DE.K) {
         Gk_2.Y();
      }
   }

   public static void j(Graphics var0) {
      if (com.DE.K) {
         R((Graphics2D)var0);
      }
   }

   public static void h(Graphics2D var0) {
      if (com.DE.K) {
         R(var0);
      }
   }

   private static void R(Graphics2D var0) {
      double var1 = (double)((float)Gk_2.O() / 1000000.0F);
      String var3 = "" + GO.FU.format(var1);
      Rectangle var4 = var0.getClip().getBounds();
      Font var5 = var0.getFont();
      var0.setFont(GO.FF);
      Object var6 = RV.X(var0);
      FontMetrics var7 = var0.getFontMetrics();
      int var8 = var7.stringWidth(var3) + 4;
      int var9 = var7.getHeight();
      var0.setPaint(Color.BLACK);
      var0.fillRect(var4.x + var4.width - var8, var4.y, var8, var9);
      var0.setPaint(Color.WHITE);
      var0.drawString(var3, var4.x + var4.width - var8 + 2, var4.y + var9 - var7.getDescent());
      RV.X(var0, var6);
      var0.setFont(var5);
   }

   public static void L(Graphics var0, JComponent var1) {
      j(var0, var1, Color.RED);
   }

   public static void j(Graphics var0, JComponent var1, Color var2) {
      Insets var3 = var1.getInsets();
      var0.setColor(var2);
      var0.drawRect(0, 0, var1.getWidth() - 1, var1.getHeight() - 1);
      var0.drawRect(var3.left, var3.top, var1.getWidth() - var3.left - var3.right - 1, var1.getHeight() - var3.top - var3.bottom - 1);
   }
}





