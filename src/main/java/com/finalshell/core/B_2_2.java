package com.finalshell.core;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class B_2_2 extends V2 {
   protected Rectangle J = new Rectangle();
   protected Rectangle S = new Rectangle();
   protected Rectangle k = new Rectangle();

   @Override
   protected String d(JLabel var1, FontMetrics var2, String var3, Icon var4, Rectangle var5, Rectangle var6, Rectangle var7) {
      this.J = this.e(var5, this.J);
      this.S = this.e(var6, this.S);
      this.k = this.e(var7, this.k);
      var3 = super.d(var1, var2, var3, var4, this.J, this.S, this.k);
      this.A(this.J, var5);
      this.A(this.S, var6);
      this.A(this.k, var7);
      return var3;
   }

   protected Rectangle e(Rectangle var1, Rectangle var2) {
      int[] var3 = W_2.B$arrint();
      Rectangle var10000 = var2;
      if (var3 == null) {
         if (var2 == null) {
            var2 = new Rectangle();
         }

         var2.x = var1.y;
         var2.y = var1.x;
         var2.width = var1.height;
         var2.height = var1.width;
         var10000 = var2;
      }

      return var10000;
   }

   protected Rectangle A(Rectangle var1, Rectangle var2) {
      int[] var3 = W_2.B$arrint();
      Rectangle var10000 = var2;
      if (var3 == null) {
         if (var2 == null) {
            var2 = new Rectangle();
         }

         var2.x = var1.x;
         var2.y = var1.y;
         var2.width = var1.width;
         var2.height = var1.height;
         var10000 = var2;
      }

      return var10000;
   }

   @Override
   public Dimension K(JLabel var1) {
      return this.s(super.K(var1));
   }

   protected Dimension s(Dimension var1) {
      return new Dimension(var1.height, var1.width);
   }

   @Override
   public Dimension d$Dimension(JComponent var1) {
      return this.K((JLabel)var1);
   }
}





