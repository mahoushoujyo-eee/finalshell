package com.finalshell.core;

import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;

public class A2_2 extends Lz2_2 {
   public ContainerAdapter G;
   public com.finalshell.ui.listener.FY Y;
   public com.finalshell.ui.panel.KE3 t = null;

   public void M(Qx2 var1) {
      this.G = new com.finalshell.ui.listener.X2(this, var1);
      this.Y = new com.finalshell.ui.listener.S(this, var1);
      var1.addAncestorListener(this.Y);
   }

   public void E(Qx2 var1) {
      this.K();
      this.G = null;
      var1.removeAncestorListener(this.Y);
      this.Y = null;
   }

   public void K() {
      int[] var1 = W_2.B$arrint();
      com.finalshell.ui.panel.KE3 var10000 = this.t;
      if (var1 == null) {
         if (this.t == null) {
            return;
         }

         var10000 = this.t;
      }

      var10000.removeContainerListener(this.G);
      this.t = null;
   }

   public Boolean N(Qx2 var1) {
      return false;
   }

   public Insets g(Qx2 var1) {
      return QC.S(var1);
   }

   public void z(Graphics2D var1, Rectangle var2, Qx2 var3) {
      QC.q(var1, var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.g((Qx2)var1);
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.N((Qx2)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.E((Qx2)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.M((Qx2)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.z(var1, var2, (Qx2)var3);
   }
}





