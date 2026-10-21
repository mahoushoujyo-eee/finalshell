package com.C;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class k_2 extends v_2 {
   protected Color q = com.OP.I;
   protected Color W = com.OP.x;

   public Color j() {
      return this.q;
   }

   public void C(Color var1) {
      this.q = var1;
   }

   public Color M() {
      return this.W;
   }

   public void c(Color var1) {
      this.W = var1;
   }

   public void j(Graphics2D var1, Rectangle var2, com.L.U var3) {
      label23: {
         int[] var4 = com.C.W.B();
         com.L.U var10000 = var3;
         if (var4 == null) {
            if (var3.T() == com.L.E.box) {
               this.f(var1, var2, var3);
               if (var4 == null) {
                  break label23;
               }
            }

            var10000 = var3;
         }

         if (var10000.J()) {
            this.v(var1, var2, var3);
            if (var4 == null) {
               break label23;
            }
         }

         this.k(var1, var2, var3);
      }

      super.u(var1, var2, (JLabel)var3);
   }

   protected void f(Graphics2D var1, Rectangle var2, com.L.U var3) {
   }

   protected void v(Graphics2D var1, Rectangle var2, com.L.U var3) {
      var1.setPaint(new GradientPaint(0.0F, (float)var2.y, this.q, 0.0F, (float)(var2.y + var2.height), this.W));
      var1.fillRect(0, 0, var3.getWidth(), var3.getHeight());
   }

   protected void k(Graphics2D var1, Rectangle var2, com.L.U var3) {
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JLabel var3) {
      this.j(var1, var2, (com.L.U)var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.j(var1, var2, (com.L.U)var3);
   }
}





