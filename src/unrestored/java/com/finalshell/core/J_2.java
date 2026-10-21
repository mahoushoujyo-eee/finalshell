package com.finalshell.core;

import com.finalshell.ui.panel.Ov2;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class J_2 extends V2 {
   public ContainerAdapter F;
   public com.finalshell.ui.listener.FY z;
   public com.finalshell.ui.panel.KE3 O = null;

   public void l(Ov2 var1) {
      this.F = new com.finalshell.ui.listener.P2(this, var1);
      this.z = new com.finalshell.ui.listener.S2(this, var1);
      var1.addAncestorListener(this.z);
   }

   public void C(Ov2 var1) {
      this.U();
      this.F = null;
      var1.removeAncestorListener(this.z);
      this.z = null;
   }

   public void U() {
      int[] var1 = W_2.B$arrint();
      com.finalshell.ui.panel.KE3 var10000 = this.O;
      if (var1 == null) {
         if (this.O == null) {
            return;
         }

         var10000 = this.O;
      }

      var10000.removeContainerListener(this.F);
      this.O = null;
   }

   public Boolean P(Ov2 var1) {
      return false;
   }

   public Insets k(Ov2 var1) {
      return QC.S(var1);
   }

   public void Q(Graphics2D var1, Rectangle var2, Ov2 var3) {
      QC.q(var1, var3);
      super.u(var1, var2, (JLabel)var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JLabel var3) {
      this.Q(var1, var2, (Ov2)var3);
   }

   @Override
   public Insets Q(JLabel var1) {
      return this.k((Ov2)var1);
   }

   @Override
   public Boolean A(JLabel var1) {
      return this.P((Ov2)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.Q(var1, var2, (Ov2)var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.k((Ov2)var1);
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.P((Ov2)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.C((Ov2)var1);
   }

   @Override
   public void A(JComponent var1) {
      this.l((Ov2)var1);
   }
}





