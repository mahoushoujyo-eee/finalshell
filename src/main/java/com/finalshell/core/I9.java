package com.finalshell.core;

import com.finalshell.ui.panel.K32;
import java.io.Serializable;
import javax.swing.JComponent;

public class I9 extends IB {
   public DA3 V;

   public I9(AS var1) {
      super(var1);
   }

   public Boolean l() {
      String[] var10000 = IH.M();
      Boolean var2 = (Boolean)super.Y();
      String[] var1 = var10000;
      Boolean var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            var2 = true;
         }

         var3 = var2;
      }

      return var3;
   }

   public void B(K32 var1) {
      this.V = new Ds4(this);
      var1.m(this.V);
   }

   public void b(K32 var1) {
      var1.B(this.V);
      this.V = null;
   }

   public void V(K32 var1) {
      var1.u((Boolean)this.o());
   }

   public void u(K32 var1) {
      this.J(Boolean.valueOf(var1.Y$boolean()));
   }

   @Override
   public void T(JComponent var1) {
      this.u((K32)var1);
   }

   @Override
   public void s(JComponent var1) {
      this.V((K32)var1);
   }

   @Override
   public void r(JComponent var1) {
      this.b((K32)var1);
   }

   @Override
   public void F(JComponent var1) {
      this.B((K32)var1);
   }

   @Override
   public Serializable Y() {
      return this.l();
   }
}





