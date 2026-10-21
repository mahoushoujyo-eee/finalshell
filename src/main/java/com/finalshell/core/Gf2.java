package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class Gf2 extends Gi2 {
   public ImageIcon rZ = W6_2.H;
   public int r6 = W6_2.A;
   public int rq = W6_2.v;

   public static ComponentUI createUI(JComponent var0) {
      return new Gf2();
   }

   public ImageIcon g$ImageIcon() {
      return this.rZ;
   }

   public void o(ImageIcon var1) {
      this.rZ = var1;
   }

   public int U() {
      return this.r6;
   }

   public void g(int var1) {
      this.r6 = var1;
   }

   public int O() {
      return this.rq;
   }

   public void T(int var1) {
      this.rq = var1;
   }

   public Insets g$Insets() {
      Insets var2;
      int var4;
      label16: {
         boolean var10000 = Tk2.B();
         var2 = super.g();
         boolean var1 = var10000;
         boolean var3 = this.b.getComponentOrientation().isLeftToRight();
         var4 = this.rZ.getIconWidth() + 1 + this.r6 * 2 + this.rq;
         if (!var1) {
            if (!var3) {
               break label16;
            }

            var2.right += var4;
         }

         if (!var1) {
            return var2;
         }
      }

      var2.left += var4;
      return var2;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      boolean var3;
      Rectangle var5;
      int var10;
      label28: {
         int var10000 = (Tk2.B()) ? 1 : 0;
         super.paint(var1, var2);
         var3 = (var10000) != 0;
         byte var4 = (byte)((var2.getComponentOrientation().isLeftToRight()) ? 1 : 0);
         var5 = this.D(var2);
         int var6 = var5.x + var5.width / 2 - this.rZ.getIconWidth() / 2;
         int var7 = var5.y + var5.height / 2 - this.rZ.getIconHeight() / 2;
         var1.drawImage(this.rZ.getImage(), var6, var7, null);
         var10000 = var4;
         if (!var3) {
            if (var4 != 0) {
               var10 = var5.x;
               break label28;
            }

            var10000 = var5.x + var5.width;
         }

         var10 = var10000 - 1;
      }

      int var8 = var10;
      var1.setColor(var2.isEnabled() ? GO.N : GO.FX);
      var1.drawLine(var8, var5.y + 1, var8, var5.y + var5.height - 2);
      if (Ky4.F$arrString() != null) {
         Tk2.U(!var3);
      }
   }

   public Rectangle D(JComponent var1) {
      boolean var2;
      byte var3;
      Insets var4;
      int var9;
      label28: {
         boolean var10000 = Tk2.B();
         var3 = (byte)((var1.getComponentOrientation().isLeftToRight()) ? 1 : 0);
         var2 = var10000;
         var4 = var1.getInsets();
         var9 = (this.G) ? 1 : 0;
         if (!var2) {
            if (this.G) {
               var9 = this.C + 1;
               break label28;
            }

            var9 = (this.D) ? 1 : 0;
         }

         if (!var2) {
            var9 = var9 != 0 ? 1 : 0;
         }
      }

      int var5 = var9;
      int var6 = var1.getHeight() - var4.top - var4.bottom;
      var9 = var3;
      if (!var2) {
         if (var3 != 0) {
            int var8 = var4.right - this.rq - var5;
            return new Rectangle(var1.getWidth() - var4.right + this.rq, var4.top, var8, var6);
         }

         var9 = var4.left - this.rq - var5;
      }

      int var7 = var9;
      return new Rectangle(var5, var4.top, var7, var6);
   }

   public Rectangle o(JComponent var1) {
      boolean var2 = var1.getComponentOrientation().isLeftToRight();
      Insets var3 = var1.getInsets();
      return var2
         ? new Rectangle(var1.getWidth() - var3.right + this.rq, 0, var3.right - this.rq, var1.getHeight())
         : new Rectangle(0, 0, var3.left - this.rq, var1.getHeight());
   }
}





