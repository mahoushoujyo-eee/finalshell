package com.finalshell.core;

public class B2_4 implements H22_2 {
   final Cs2_2 v;

   B2_4(Cs2_2 var1) {
      this.v = var1;
   }

   @C_9
   public FK e(Fg2 var1) throws B2_5 {
      return this.v.H(var1);
   }

   @C_9
   public FK S(Fb2_3 var1) throws B2_5 {
      return this.v.L(var1);
   }

   @C_9
   public FK h(FA var1) throws B2_5 {
      return this.v.s(var1);
   }

   @C_9
   public FK y(FH var1) throws B2_5 {
      return this.v.c(var1);
   }

   @C_9
   @Override
   public Object w(FH var1) throws Throwable {
      return this.y(var1);
   }

   @C_9
   @Override
   public Object r(FA var1) throws Throwable {
      return this.h(var1);
   }

   @C_9
   @Override
   public Object U(Fb2_3 var1) throws Throwable {
      return this.S(var1);
   }

   @C_9
   @Override
   public Object f(Fg2 var1) throws Throwable {
      return this.e(var1);
   }
}





