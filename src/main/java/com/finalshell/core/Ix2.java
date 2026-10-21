package com.finalshell.core;

import com.finalshell.ui.listener.EL;
import java.awt.event.AdjustmentListener;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JScrollBar;

public class Ix2 extends IB {
   public AdjustmentListener U;

   public Ix2(AS var1) {
      super(var1);
   }

   public Integer n() {
      String[] var10000 = IH.M();
      Integer var2 = (Integer)super.Y();
      String[] var1 = var10000;
      Integer var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            var2 = ((JScrollBar)this.b()).getMinimum();
         }

         var3 = var2;
      }

      return var3;
   }

   public void h(JScrollBar var1) {
      this.U = new EL(this);
      var1.addAdjustmentListener(this.U);
   }

   public void g(JScrollBar var1) {
      var1.removeAdjustmentListener(this.U);
      this.U = null;
   }

   public void m(JScrollBar var1) {
      var1.setValue((Integer)this.o());
   }

   public void F(JScrollBar var1) {
      Cl4_2.A(this.M(), this.S(), var1.getValue());
   }

   @Override
   public void T(JComponent var1) {
      this.F((JScrollBar)var1);
   }

   @Override
   public void s(JComponent var1) {
      this.m((JScrollBar)var1);
   }

   @Override
   public void r(JComponent var1) {
      this.g((JScrollBar)var1);
   }

   @Override
   public void F(JComponent var1) {
      this.h((JScrollBar)var1);
   }

   @Override
   public Serializable Y() {
      return this.n();
   }
}





