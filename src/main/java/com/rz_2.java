package com;

import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D.Double;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;

public class Rz_2 extends BasicToolTipUI implements com.W2, com.L0 {
   private JComponent I = null;
   private static int r;
   private static final String a;

   public static ComponentUI createUI(JComponent var0) {
      return new Rz_2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      this.I = var1;
      com.FN.Y(this.I);
      LookAndFeel.installProperty(this.I, a, Boolean.FALSE);
      this.I.setBackground(com.aw_2.F);
      int var10000 = d();
      this.I.setForeground(com.aw_2.o);
      this.h();
      int var2 = var10000;
      if (com.ky_4.F() != null) {
         R(++var2);
      }
   }

   @Override
   public void uninstallUI(JComponent var1) {
      this.I = null;
      super.uninstallUI(var1);
   }

   @Override
   public Shape B() {
      return new Double(0.0, 0.0, (double)this.I.getWidth(), (double)this.I.getHeight(), (double)(com.aw_2.A * 2), (double)(com.aw_2.A * 2));
   }

   @Override
   public void h() {
      int var1 = O();
      JComponent var10000 = this.I;
      if (var1 == 0) {
         if (com.FN.l(this.I)) {
            return;
         }

         var10000 = this.I;
      }

      var10000.setBorder(GA.y(com.aw_2.i));
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      int var10000 = O();
      Graphics2D var4 = (Graphics2D)var1;
      Object var5 = RV.X(var4);
      Composite var6 = RV.p(var4, com.aw_2.Q);
      var4.setPaint(var2.getBackground());
      var4.fillRoundRect(0, 0, var2.getWidth(), var2.getHeight(), com.aw_2.A * 2, com.aw_2.A * 2);
      RV.c(var4, var6);
      RV.X(var4, var5);
      Map var7 = com.FN.Y(var4);
      int var3 = var10000;
      super.paint(var1, var2);
      com.FN.k(var4, var7);
      if (var3 != 0) {
         com.ky_4.K(new String[1]);
      }
   }

   public static void R(int var0) {
      r = var0;
   }

   public static int O() {
      return r;
   }

   public static int d() {
      int var0 = O();
      return var0 == 0 ? 34 : 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (O() != 0) {
         R(15);
      }

      char[] var10003 = "0YI\u0016MB".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 122;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 122;
         var10006 = var0;
      } else {
         var6 = 122;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 122;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 37;
               break;
            case 1:
               var23 = 83;
               break;
            case 2:
               var23 = 82;
               break;
            case 3:
               var23 = 29;
               break;
            case 4:
               var23 = 66;
               break;
            case 5:
               var23 = 93;
               break;
            default:
               var23 = 27;
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





