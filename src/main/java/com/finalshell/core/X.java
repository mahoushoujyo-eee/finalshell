package com.finalshell.core;

import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;

public class X extends Lz2_2 {
   protected ContainerAdapter D;
   protected com.finalshell.ui.listener.FY T;
   protected com.finalshell.ui.panel.KE3 u = null;

   public void i(KR var1) {
      this.D = new com.finalshell.ui.listener.A(this, var1);
      this.T = new com.finalshell.ui.listener.T2(this, var1);
      var1.addAncestorListener(this.T);
   }

   public void w(KR var1) {
      this.V();
      this.D = null;
      var1.removeAncestorListener(this.T);
      this.T = null;
   }

   protected void V() {
      int[] var1 = W_2.B$arrint();
      com.finalshell.ui.panel.KE3 var10000 = this.u;
      if (var1 == null) {
         if (this.u == null) {
            return;
         }

         var10000 = this.u;
      }

      var10000.removeContainerListener(this.D);
      this.u = null;
   }

   public Boolean B(KR var1) {
      return false;
   }

   public Insets X(KR var1) {
      return QC.S(var1);
   }

   public void J(Graphics2D var1, Rectangle var2, KR var3) {
      QC.q(var1, var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.X((KR)var1);
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.B((KR)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.w((KR)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.i((KR)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.J(var1, var2, (KR)var3);
   }
}





