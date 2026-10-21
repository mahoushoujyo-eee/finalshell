package com.finalshell.core;

import java.util.Date;
import javax.swing.JComponent;

public class I7 extends IB {
   public Pu4 M;

   public I7(AS var1) {
      super(var1);
   }

   public void V(Lk4 var1) {
      this.M = new WX3(this);
      var1.Z(this.M);
   }

   public void l(Lk4 var1) {
      var1.s(this.M);
      this.M = null;
   }

   public void c(Lk4 var1) {
      Long var2 = (Long)this.o();
      Date var3 = var2 != null ? new Date(var2) : null;
      var1.R(var3);
   }

   public void A(Lk4 var1) {
      Long var6;
      label14: {
         String[] var10000 = IH.M();
         Date var3 = var1.E();
         String[] var2 = var10000;
         Date var5 = var3;
         if (var2 != null) {
            if (var3 == null) {
               var6 = null;
               break label14;
            }

            var5 = var3;
         }

         var6 = var5.getTime();
      }

      Long var4 = var6;
      this.J(var4);
   }

   @Override
   public void T(JComponent var1) {
      this.A((Lk4)var1);
   }

   @Override
   public void s(JComponent var1) {
      this.c((Lk4)var1);
   }

   @Override
   public void r(JComponent var1) {
      this.l((Lk4)var1);
   }

   @Override
   public void F(JComponent var1) {
      this.V((Lk4)var1);
   }
}





