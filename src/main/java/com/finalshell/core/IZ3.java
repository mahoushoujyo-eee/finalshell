package com.finalshell.core;

public class IZ3 implements On2 {
   protected On2 m;

   public IZ3() {
      this(DE.I);
   }

   public IZ3(On2 var1) {
      this.m = var1;
   }

   public On2 u() {
      return this.m;
   }

   public void q(On2 var1) {
      this.m = var1;
   }

   public boolean s(com.finalshell.ui.model.CY3 var1) {
      return this.m.n(var1.D());
   }

   @Override
   public boolean n(Object var1) {
      return this.s((com.finalshell.ui.model.CY3)var1);
   }
}





