package org.v;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ha_2 extends hP {
   private final Method O;
   final hA I;

   ha_2(hA var1, Method var2) {
      super(var1);
      this.I = var1;
      this.O = var2;
   }

   @Override
   public _S p() {
      return hA.J(this.O.getModifiers());
   }

   @Override
   public h4[] f() {
      return new h4[0];
   }

   @Override
   public String K() {
      return this.O.getName();
   }

   @Override
   public boolean c() {
      return Modifier.isTransient(this.O.getModifiers());
   }

   @Override
   public hd_2[] d() {
      return hA.f(this.I, this.O.getParameterTypes());
   }

   @Override
   public boolean u() {
      return Modifier.isStatic(this.O.getModifiers());
   }

   @Override
   public boolean F() {
      return Modifier.isAbstract(this.O.getModifiers());
   }

   @Override
   public hd_2 p$hd_2() {
      return hA.r(this.I, this.O.getReturnType());
   }

   @Override
   public hd_2[] S() {
      return hA.f(this.I, this.O.getExceptionTypes());
   }
}





