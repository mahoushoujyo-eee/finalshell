package com.finalshell.core;

public class Hw2_2 implements M_2_2 {
   final FF_2 b;

   Hw2_2(FF_2 var1) {
      this.b = var1;
   }

   @C_9
   public Void Y$Void(NU_3 var1) {
      FF_2.b(this.b, var1);
      return null;
   }

   @C_9
   public Void t(NS var1) {
      FF_2.R(this.b, var1);
      return null;
   }

   @C_9
   @Override
   public Object Q(NS var1) throws Throwable {
      return this.t(var1);
   }

   @C_9
   public Object Y$Object(NU_3 var1) throws Throwable {
      return this.Y$Void(var1);
   }
}





