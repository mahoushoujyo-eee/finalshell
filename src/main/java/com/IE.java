package com;

import javax.swing.JComponent;
import javax.swing.event.ChangeListener;

public class IE extends IB {
   private ChangeListener J;

   public IE(com.aS var1) {
      super(var1);
   }

   protected void j(com.ou_4 var1) {
      this.J = new com.Ba_2(this);
      var1.t(this.J);
   }

   protected void e(com.ou_4 var1) {
      var1.s(this.J);
      this.J = null;
   }

   protected void c(com.ou_4 var1) {
      var1.Q((Ed_2)this.o());
   }

   protected void Q(com.ou_4 var1) {
      this.J(var1.l());
   }

   @Override
   protected void T(JComponent var1) {
      this.Q((com.ou_4)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.c((com.ou_4)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.e((com.ou_4)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.j((com.ou_4)var1);
   }
}





