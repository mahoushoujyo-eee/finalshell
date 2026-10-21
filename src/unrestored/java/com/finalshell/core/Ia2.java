package com.finalshell.core;

import com.finalshell.ui.listener.Gx2;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class Ia2 extends IB {
   public ChangeListener f;

   public Ia2(AS var1) {
      super(var1);
   }

   public Integer A() {
      String[] var10000 = IH.M();
      Integer var2 = (Integer)super.Y();
      String[] var1 = var10000;
      Integer var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            var2 = ((JSlider)this.b()).getMinimum();
         }

         var3 = var2;
      }

      return var3;
   }

   public void S(JSlider var1) {
      this.f = new Gx2(this);
      var1.addChangeListener(this.f);
   }

   public void A(JSlider var1) {
      var1.removeChangeListener(this.f);
      this.f = null;
   }

   public void p(JSlider var1) {
      var1.setValue((Integer)this.o());
   }

   public void M(JSlider var1) {
      Cl4_2.A(this.M(), this.S(), var1.getValue());
   }

   @Override
   public void T(JComponent var1) {
      this.M((JSlider)var1);
   }

   @Override
   public void s(JComponent var1) {
      this.p((JSlider)var1);
   }

   @Override
   public void r(JComponent var1) {
      this.A((JSlider)var1);
   }

   @Override
   public void F(JComponent var1) {
      this.S((JSlider)var1);
   }

   @Override
   public Serializable Y() {
      return this.A();
   }
}





