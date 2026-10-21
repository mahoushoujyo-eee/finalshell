package com.finalshell.core;

public class CE_2 implements E4_2 {
   final Cs2_2 j;

   CE_2(Cs2_2 var1) {
      this.j = var1;
   }

   public C_8_2 S(NT var1) throws B2_5 {
      return this.j.z(var1);
   }

   public C_8_2 C(RF var1) throws B2_5 {
      return this.j.W(var1);
   }

   @Override
   public Object q(RF var1) throws Throwable {
      return this.C(var1);
   }

   @Override
   public Object W(NT var1) throws Throwable {
      return this.S(var1);
   }
}





