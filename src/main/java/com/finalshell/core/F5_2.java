package com.finalshell.core;

import java.util.List;

public class F5_2 implements H22_2 {
   final List i;
   final H3_2 Q;

   F5_2(H3_2 var1, List var2) {
      this.Q = var1;
      this.i = var2;
   }

   @C_9
   public Void N(Fg2 var1) {
      this.i.add(var1);
      return null;
   }

   @C_9
   public Void B(Fb2_3 var1) {
      return null;
   }

   @C_9
   public Void a(FA var1) {
      return null;
   }

   @C_9
   public Void H(FH var1) {
      return null;
   }

   @C_9
   @Override
   public Object w(FH var1) throws Throwable {
      return this.H(var1);
   }

   @C_9
   @Override
   public Object r(FA var1) throws Throwable {
      return this.a(var1);
   }

   @C_9
   @Override
   public Object U(Fb2_3 var1) throws Throwable {
      return this.B(var1);
   }

   @C_9
   @Override
   public Object f(Fg2 var1) throws Throwable {
      return this.N(var1);
   }
}





