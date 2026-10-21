package com.finalshell.ui.panel;

import com.finalshell.core.Au2;
import com.finalshell.core.FN;
import com.finalshell.core.GO;
import com.finalshell.core.RV;
import com.finalshell.core.W2_3;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.RoundRectangle2D.Double;
import javax.swing.Icon;

public class Op2 extends O implements W2_3, Au2 {
   public Color y = GO.FR;
   public Color d = GO.Q;
   public Color b = GO.Ft;
   public Color H = GO.Ff;
   public Color t = GO.FX;
   public final Stroke a = new BasicStroke(2.5F, 1, 1, 1.0F);
   public boolean J = false;
   public static long[] c;
   public static Integer[] e;

   public Op2() {
      this.L();
   }

   public Op2(Icon var1) {
      super(var1);
      this.L();
   }

   public Op2(Icon var1, int var2) {
      super(var1, var2);
      this.L();
   }

   public Op2(String var1) {
      super(var1);
      this.L();
   }

   public Op2(String var1, int var2) {
      super(var1, var2, new Object[0]);
      this.L();
   }

   public Op2(String var1, Icon var2, int var3) {
      super(var1, var2, var3, new Object[0]);
      this.L();
   }

   public void L() {
      this.setOpaque(false);
      this.D(true);
      this.setForeground(Color.DARK_GRAY);
      this.q(Color.LIGHT_GRAY);
      this.x(b(32128, 5579374550264534920L));
      this.setHorizontalAlignment(0);
      FN.u(this);
      FN.O(this, b(24821, 2808339090634590972L));
   }

   public Color E() {
      return this.y;
   }

   public void v(Color var1) {
      this.y = var1;
      this.repaint();
   }

   public Color i() {
      return this.d;
   }

   public void d(Color var1) {
      this.d = var1;
      this.repaint();
   }

   public Color e() {
      return this.b;
   }

   public void L(Color var1) {
      this.b = var1;
      this.repaint();
   }

   public Color K() {
      return this.H;
   }

   public void s(Color var1) {
      this.H = var1;
      this.repaint();
   }

   public Color O() {
      return this.t;
   }

   public void i(Color var1) {
      this.t = var1;
      this.repaint();
   }

   public boolean H() {
      return this.J;
   }

   public void G(boolean var1) {
      this.J = var1;
      this.repaint();
   }

   @Override
   public Shape B() {
      int var1 = this.getWidth();
      int var2 = this.getHeight();
      int var3 = Math.min(var1, var2);
      return new Double(
         (double)(var1 / 2 - var3 / 2 + 1),
         (double)(var2 / 2 - var3 / 2 + 1),
         (double)(var3 - 3),
         (double)(var3 - 3),
         (double)(this.getWidth() - 4),
         (double)(this.getHeight() - 4)
      );
   }

   @Override
   public void paintComponent(Graphics var1) {
      Op2 var9;
      label52: {
         boolean var10000 = Oj2.V();
         Graphics2D var3 = (Graphics2D)var1;
         boolean var2 = var10000;
         Object var4 = RV.X(var3);
         int var5 = this.getWidth();
         int var6 = this.getHeight();
         int var7 = Math.min(var5, var6);
         Color var8 = this.getBackground();
         if (!var2) {
            if (var8 != null) {
               label39: {
                  if (this.J) {
                     var3.setPaint(this.b);
                     if (!var2) {
                        break label39;
                     }
                  }

                  var3.setPaint(new GradientPaint(0.0F, 0.0F, this.y, 0.0F, (float)this.getHeight(), this.d));
               }

               var3.fillRoundRect(var5 / 2 - var7 / 2 + 1, var6 / 2 - var7 / 2 + 1, var7 - 2, var7 - 2, this.getWidth() - 4, this.getHeight() - 4);
            }

            var9 = this;
            if (var2) {
               break label52;
            }

            var8 = this.K();
         }

         if (var8 != null) {
            Color var10;
            label27: {
               var3.setStroke(this.a);
               Op2 var10001 = this;
               if (!var2) {
                  if (this.isEnabled()) {
                     var10 = this.H;
                     break label27;
                  }

                  var10001 = this;
               }

               var10 = var10001.t;
            }

            var3.setPaint(var10);
            var3.drawRoundRect(var5 / 2 - var7 / 2 + 1, var6 / 2 - var7 / 2 + 1, var7 - 3, var7 - 3, this.getWidth() - 4, this.getHeight() - 4);
         }

         RV.X(var3, var4);
         var9 = this;
      }

      var9.paintComponent(var1);
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      int var2 = Math.max(var1.width, var1.height);
      var1.width = var2;
      var1.height = var2;
      return var1;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10760;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 990727641345555910L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ñ¿µ\u00adÒÐªF,±¸ñy\u0091·.";
      int var5 = "ñ¿µ\u00adÒÐªF,±¸ñy\u0091·.".length();
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

      c = var6;
      e = new Integer[2];
   }
}





