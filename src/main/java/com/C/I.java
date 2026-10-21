package com.C;

import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class I extends com.C.d {
   protected ContainerAdapter S;
   protected com.FY R;
   protected com.kE_3 A = null;

   public void w(com.ki_4 var1) {
      this.S = new C(this, var1);
      this.R = new Z(this, var1);
      var1.addAncestorListener(this.R);
   }

   public void v(com.ki_4 var1) {
      this.r();
      this.S = null;
      var1.removeAncestorListener(this.R);
      this.R = null;
   }

   protected void r() {
      int[] var1 = com.C.W.B();
      com.kE_3 var10000 = this.A;
      if (var1 == null) {
         if (this.A == null) {
            return;
         }

         var10000 = this.A;
      }

      var10000.removeContainerListener(this.S);
      this.A = null;
   }

   public Boolean z(com.ki_4 var1) {
      return false;
   }

   public Insets S(com.ki_4 var1) {
      return com.QC.S(var1);
   }

   public void c(Graphics2D var1, Rectangle var2, com.ki_4 var3) {
      com.QC.q(var1, var3);
      super.h(var1, var2, var3);
   }

   @Override
   public void h(Graphics2D var1, Rectangle var2, JPanel var3) {
      this.c(var1, var2, (com.ki_4)var3);
   }

   @Override
   public Boolean y(JPanel var1) {
      return this.z((com.ki_4)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.c(var1, var2, (com.ki_4)var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.S((com.ki_4)var1);
   }

   @Override
   public Boolean d(JComponent var1) {
      return this.z((com.ki_4)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.v((com.ki_4)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.w((com.ki_4)var1);
   }
}





