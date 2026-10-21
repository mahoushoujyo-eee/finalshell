package com.C;

import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class J extends v_2 {
   protected ContainerAdapter F;
   protected com.FY z;
   protected com.kE_3 O = null;

   public void l(com.Ov_2 var1) {
      this.F = new com.C.p_2(this, var1);
      this.z = new s_2(this, var1);
      var1.addAncestorListener(this.z);
   }

   public void C(com.Ov_2 var1) {
      this.U();
      this.F = null;
      var1.removeAncestorListener(this.z);
      this.z = null;
   }

   protected void U() {
      int[] var1 = com.C.W.B();
      com.kE_3 var10000 = this.O;
      if (var1 == null) {
         if (this.O == null) {
            return;
         }

         var10000 = this.O;
      }

      var10000.removeContainerListener(this.F);
      this.O = null;
   }

   public Boolean P(com.Ov_2 var1) {
      return false;
   }

   public Insets k(com.Ov_2 var1) {
      return com.QC.S(var1);
   }

   public void Q(Graphics2D var1, Rectangle var2, com.Ov_2 var3) {
      com.QC.q(var1, var3);
      super.u(var1, var2, (JLabel)var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JLabel var3) {
      this.Q(var1, var2, (com.Ov_2)var3);
   }

   @Override
   public Insets Q(JLabel var1) {
      return this.k((com.Ov_2)var1);
   }

   @Override
   public Boolean A(JLabel var1) {
      return this.P((com.Ov_2)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.Q(var1, var2, (com.Ov_2)var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.k((com.Ov_2)var1);
   }

   @Override
   public Boolean d(JComponent var1) {
      return this.P((com.Ov_2)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.C((com.Ov_2)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.l((com.Ov_2)var1);
   }
}





