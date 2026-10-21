package com.C;

import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;

public class X extends com.Lz_2 {
   protected ContainerAdapter D;
   protected com.FY T;
   protected com.kE_3 u = null;

   public void i(com.KR var1) {
      this.D = new com.C.A(this, var1);
      this.T = new com.C.T(this, var1);
      var1.addAncestorListener(this.T);
   }

   public void w(com.KR var1) {
      this.V();
      this.D = null;
      var1.removeAncestorListener(this.T);
      this.T = null;
   }

   protected void V() {
      int[] var1 = com.C.W.B();
      com.kE_3 var10000 = this.u;
      if (var1 == null) {
         if (this.u == null) {
            return;
         }

         var10000 = this.u;
      }

      var10000.removeContainerListener(this.D);
      this.u = null;
   }

   public Boolean B(com.KR var1) {
      return false;
   }

   public Insets X(com.KR var1) {
      return com.QC.S(var1);
   }

   public void J(Graphics2D var1, Rectangle var2, com.KR var3) {
      com.QC.q(var1, var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.X((com.KR)var1);
   }

   @Override
   public Boolean d(JComponent var1) {
      return this.B((com.KR)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.w((com.KR)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.i((com.KR)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.J(var1, var2, (com.KR)var3);
   }
}





