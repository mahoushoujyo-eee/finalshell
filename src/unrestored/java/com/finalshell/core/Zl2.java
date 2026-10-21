package com.finalshell.core;

import com.finalshell.ui.model.Bj2;
import com.finalshell.ui.panel.Pb4;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.Line2D.Double;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class Zl2 extends BasicMenuBarUI implements W2_3, L0_2 {
   public Color Q = Ea4.k;
   public Color K = Ea4.E;
   public boolean m = Ea4.V;
   public int X = Ea4.g;
   public int j = Ea4.b;
   public Bj2 h = Ea4.x;
   public Color S = Ea4.d;
   public static String a;

   public static ComponentUI createUI(JComponent var0) {
      return new Zl2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(this.menuBar);
      LookAndFeel.installProperty(this.menuBar, a, Boolean.FALSE);
      this.menuBar.setLayout(new TA(0));
      this.h();
   }

   @Override
   public Shape B() {
      return GA.X(this.menuBar, this.g(), this.K());
   }

   @Override
   public void h() {
      int[] var1 = Pb4.g();
      boolean var10000 = FN.l((JComponent)this.menuBar);
      if (var1 != null) {
         if (var10000) {
            return;
         }

         var10000 = this.m;
      }

      Insets var2;
      label29: {
         label33: {
            if (var1 != null) {
               if (var10000) {
                  break label33;
               }

               var10000 = this.h.equals(Bj2.attached);
            }

            if (var10000) {
               var2 = new Insets(0, 0, 1 + this.j, 0);
               if (var1 != null) {
                  break label29;
               }
            }

            var2 = new Insets(1 + this.j, 1 + this.j, 1 + this.j, 1 + this.j);
            if (var1 != null) {
               break label29;
            }
         }

         var2 = new Insets(0, 0, 0, 0);
      }

      this.menuBar.setBorder(GA.y(var2));
   }

   public Color T() {
      return this.Q;
   }

   public void s(Color var1) {
      this.Q = var1;
   }

   public Color k() {
      return this.K;
   }

   public void j(Color var1) {
      this.K = var1;
   }

   public boolean O$boolean() {
      return this.m;
   }

   public void j(boolean var1) {
      this.m = var1;
      this.h();
   }

   public Bj2 w() {
      return this.h;
   }

   public void v(Bj2 var1) {
      this.h = var1;
      this.h();
   }

   public Color O$Color() {
      return this.S;
   }

   public void w(Color var1) {
      this.S = var1;
   }

   public int K() {
      return this.X;
   }

   public void N(int var1) {
      this.X = var1;
   }

   public int g() {
      return this.j;
   }

   public void g(int var1) {
      this.j = var1;
      this.h();
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      int[] var3 = Pb4.g();
      if (!this.m) {
         Graphics2D var4 = (Graphics2D)var1;
         if (this.h == Bj2.attached) {
            Double var5 = new Double(0.0, (double)(var2.getHeight() - 1 - this.j), (double)(var2.getWidth() - 1), (double)(var2.getHeight() - 1 - this.j));
            RV.Y(var4, var5, GO.r, this.j);
            var4.setPaint(new GradientPaint(0.0F, 0.0F, this.Q, 0.0F, (float)var2.getHeight(), this.K));
            var4.fillRect(0, 0, var2.getWidth(), var2.getHeight() - this.j);
            var4.setPaint(this.S);
            var4.draw(var5);
            if (var3 != null) {
               return;
            }
         }

         GA.R(var4, var2, GO.r, this.j, this.X, true, true, this.S);
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0006Y\u0004\b\u001cp".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 37;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      } else {
         var6 = 37;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 76;
               break;
            case 1:
               var23 = 12;
               break;
            case 2:
               var23 = 64;
               break;
            case 3:
               var23 = 92;
               break;
            case 4:
               var23 = 76;
               break;
            case 5:
               var23 = 48;
               break;
            default:
               var23 = 51;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





