package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;

public class Yd_2 extends BasicPopupMenuSeparatorUI {
   protected Color H = Eb_2.M;
   protected Stroke o = Eb_2.L;
   protected int I = Eb_2.m;
   protected int u = Eb_2.i;
   private static final String a;

   public static ComponentUI createUI(JComponent var0) {
      return new com.Yd_2();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      LookAndFeel.installProperty(var1, a, Boolean.FALSE);
   }

   public Color Y() {
      return this.H;
   }

   public void D(Color var1) {
      this.H = var1;
   }

   public Stroke j() {
      return this.o;
   }

   public void o(Stroke var1) {
      this.o = var1;
   }

   public int A() {
      return this.I;
   }

   public void F(int var1) {
      this.I = var1;
   }

   public int I() {
      return this.u;
   }

   public void v(int var1) {
      this.u = var1;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      Graphics2D var3 = (Graphics2D)var1;
      Object var4 = RV.X(var3);
      Stroke var5 = RV.M(var3, this.o);
      var1.setColor(this.H);
      var1.drawLine(this.u, var2.getHeight() / 2, var2.getWidth() - this.u - 1, var2.getHeight() / 2);
      RV.p(var3, var5);
      RV.X(var3, var4);
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      return new Dimension(0, this.I * 2 + 1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "J\t\u001d\u0014oi".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 72;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 72;
         var10006 = var0;
      } else {
         var6 = 72;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 72;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 109;
               break;
            case 1:
               var23 = 49;
               break;
            case 2:
               var23 = 52;
               break;
            case 3:
               var23 = 45;
               break;
            case 4:
               var23 = 82;
               break;
            case 5:
               var23 = 68;
               break;
            default:
               var23 = 21;
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





