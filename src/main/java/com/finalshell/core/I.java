package com.finalshell.core;

import com.finalshell.ui.panel.Ki4;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class I extends D2_2 {
   protected ContainerAdapter S;
   protected com.finalshell.ui.listener.FY R;
   protected com.finalshell.ui.panel.KE3 A = null;

   public void w(Ki4 var1) {
      this.S = new com.finalshell.ui.listener.C(this, var1);
      this.R = new com.finalshell.ui.listener.Z(this, var1);
      var1.addAncestorListener(this.R);
   }

   public void v(Ki4 var1) {
      this.r();
      this.S = null;
      var1.removeAncestorListener(this.R);
      this.R = null;
   }

   protected void r() {
      int[] var1 = W_2.B$arrint();
      com.finalshell.ui.panel.KE3 var10000 = this.A;
      if (var1 == null) {
         if (this.A == null) {
            return;
         }

         var10000 = this.A;
      }

      var10000.removeContainerListener(this.S);
      this.A = null;
   }

   public Boolean z(Ki4 var1) {
      return false;
   }

   public Insets S(Ki4 var1) {
      return QC.S(var1);
   }

   public void c(Graphics2D var1, Rectangle var2, Ki4 var3) {
      QC.q(var1, var3);
      super.h(var1, var2, var3);
   }

   @Override
   public void h(Graphics2D var1, Rectangle var2, JPanel var3) {
      this.c(var1, var2, (Ki4)var3);
   }

   @Override
   public Boolean y(JPanel var1) {
      return this.z((Ki4)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.c(var1, var2, (Ki4)var3);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.S((Ki4)var1);
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      return this.z((Ki4)var1);
   }

   @Override
   public void X(JComponent var1) {
      this.v((Ki4)var1);
   }

   @Override
   public void A$void(JComponent var1) {
      this.w((Ki4)var1);
   }
}





