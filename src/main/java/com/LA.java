package com;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D.Double;
import javax.swing.JComponent;

public class LA extends com.Lz_2 {
   protected int i = com.FT.T;
   protected int w = com.FT.y;
   protected Color L = com.FT.q;
   protected Stroke h = null;

   public LA() {
      this.p();
   }

   public LA(int var1) {
      this.i = var1;
   }

   public LA(Color var1) {
      this.L = var1;
      this.p();
   }

   public LA(int var1, Color var2) {
      this.i = var1;
      this.L = var2;
   }

   public int a() {
      return this.i;
   }

   public void O(int var1) {
      this.i = var1;
      this.p();
      this.Z();
   }

   public int t() {
      return this.w;
   }

   public void F(int var1) {
      this.w = var1;
      this.p();
      this.l();
   }

   public Color s() {
      return this.L;
   }

   public void r(Color var1) {
      this.L = var1;
      this.l();
   }

   public Stroke C() {
      return this.h;
   }

   public void x(Stroke var1) {
      this.h = var1;
      this.l();
   }

   protected void p() {
      this.h = new BasicStroke((float)this.a(), 1, 1);
   }

   @Override
   public Dimension d(JComponent var1) {
      return new Dimension(Math.max(this.i * 2, this.w * 2), Math.max(this.i * 2, this.w * 2));
   }

   @Override
   public Insets B(JComponent var1) {
      Insets var2 = super.B(var1);
      return new Insets(var2.top + this.i, var2.left + this.i, var2.bottom + this.i, var2.right + this.i);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = com.Lz_2.M();
      com.LA var10000 = this;
      if (var4 == null) {
         if (this.i <= 0) {
            return;
         }

         var10000 = this;
      }

      if (var4 == null) {
         if (var10000.h == null) {
            return;
         }

         var10000 = this;
      }

      Object var7 = var10000.L;
      if (var4 == null) {
         if (var10000.L == null) {
            return;
         }

         var7 = RV.X(var1);
      }

      Object var5 = var7;
      Stroke var6 = RV.d(var1, this.h, this.h != null);
      var1.setPaint(this.L);
      var1.draw(this.v(var2));
      RV.t(var1, var6, this.h != null);
      RV.X(var1, var5);
   }

   protected RectangularShape v(Rectangle var1) {
      double var5;
      label18: {
         int[] var2 = com.Lz_2.M();
         int var10000 = this.i;
         if (var2 == null) {
            if (this.i == 1) {
               var5 = 0.0;
               break label18;
            }

            var10000 = this.i;
         }

         var5 = (double)var10000 / 2.0;
      }

      double var3 = var5;
      return (RectangularShape)(this.w > 0
         ? new Double(
            (double)var1.x + var3,
            (double)var1.y + var3,
            (double)var1.width - var3 * 2.0 - 1.0,
            (double)var1.height - var3 * 2.0 - 1.0,
            (double)(this.w * 2),
            (double)(this.w * 2)
         )
         : new java.awt.geom.Rectangle2D.Double(
            (double)var1.x + var3, (double)var1.y + var3, (double)var1.width - var3 * 2.0 - 1.0, (double)var1.height - var3 * 2.0 - 1.0
         ));
   }
}





