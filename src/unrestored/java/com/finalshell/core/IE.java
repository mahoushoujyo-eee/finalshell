package com.finalshell.core;

import com.finalshell.ui.listener.Ba2;
import com.finalshell.ui.model.Ed2;
import javax.swing.JComponent;
import javax.swing.event.ChangeListener;

public class IE extends IB {
   public ChangeListener J;

   public IE(AS var1) {
      super(var1);
   }

   public void j(com.finalshell.ui.panel.Ou4 var1) {
      this.J = new Ba2(this);
      var1.t(this.J);
   }

   public void e(com.finalshell.ui.panel.Ou4 var1) {
      var1.s(this.J);
      this.J = null;
   }

   public void c(com.finalshell.ui.panel.Ou4 var1) {
      var1.Q((Ed2)this.o());
   }

   public void Q(com.finalshell.ui.panel.Ou4 var1) {
      this.J(var1.l());
   }

   @Override
   public void T(JComponent var1) {
      this.Q((com.finalshell.ui.panel.Ou4)var1);
   }

   @Override
   public void s(JComponent var1) {
      this.c((com.finalshell.ui.panel.Ou4)var1);
   }

   @Override
   public void r(JComponent var1) {
      this.e((com.finalshell.ui.panel.Ou4)var1);
   }

   @Override
   public void F(JComponent var1) {
      this.j((com.finalshell.ui.panel.Ou4)var1);
   }
}





