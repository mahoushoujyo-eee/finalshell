package com.C;

import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;

public class a_2 extends com.Lz_2 {
   protected ContainerAdapter G;
   protected com.FY Y;
   protected com.kE_3 t = null;

   public void M(com.Qx_2 var1) {
      this.G = new com.C.x_2(this, var1);
      this.Y = new S(this, var1);
      var1.addAncestorListener(this.Y);
   }

   public void E(com.Qx_2 var1) {
      this.K();
      this.G = null;
      var1.removeAncestorListener(this.Y);
      this.Y = null;
   }

   protected void K() {
      int[] var1 = com.C.W.B();
      com.kE_3 var10000 = this.t;
      if (var1 == null) {
         if (this.t == null) {
            return;
         }

         var10000 = this.t;
      }

      var10000.removeContainerListener(this.G);
      this.t = null;
   }

   public Boolean N(com.Qx_2 var1) {
      return false;
   }

   public Insets g(com.Qx_2 var1) {
      return com.QC.S(var1);
   }

   public void z(Graphics2D var1, Rectangle var2, com.Qx_2 var3) {
      com.QC.q(var1, var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.g((com.Qx_2)var1);
   }

   @Override
   public Boolean d(JComponent var1) {
      return this.N((com.Qx_2)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.E((com.Qx_2)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.M((com.Qx_2)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.z(var1, var2, (com.Qx_2)var3);
   }
}





