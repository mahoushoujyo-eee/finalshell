package com;

import java.util.Date;
import javax.swing.JComponent;

public class I7 extends IB {
   private pu_4 M;

   public I7(com.aS var1) {
      super(var1);
   }

   protected void V(com.lk_4 var1) {
      this.M = new wX_3(this);
      var1.Z(this.M);
   }

   protected void l(com.lk_4 var1) {
      var1.s(this.M);
      this.M = null;
   }

   protected void c(com.lk_4 var1) {
      Long var2 = (Long)this.o();
      Date var3 = var2 != null ? new Date(var2) : null;
      var1.R(var3);
   }

   protected void A(com.lk_4 var1) {
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
   protected void T(JComponent var1) {
      this.A((com.lk_4)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.c((com.lk_4)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.l((com.lk_4)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.V((com.lk_4)var1);
   }
}





