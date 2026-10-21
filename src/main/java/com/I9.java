package com;

import java.io.Serializable;
import javax.swing.JComponent;

public class I9 extends IB {
   private com.dA_3 V;

   public I9(com.aS var1) {
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

   protected void B(com.k3_2 var1) {
      this.V = new com.ds_4(this);
      var1.m(this.V);
   }

   protected void b(com.k3_2 var1) {
      var1.B(this.V);
      this.V = null;
   }

   protected void V(com.k3_2 var1) {
      var1.u((Boolean)this.o());
   }

   protected void u(com.k3_2 var1) {
      this.J(Boolean.valueOf(var1.Y()));
   }

   @Override
   protected void T(JComponent var1) {
      this.u((com.k3_2)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.V((com.k3_2)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.b((com.k3_2)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.B((com.k3_2)var1);
   }

   @Override
   public Serializable Y() {
      return this.l();
   }
}





