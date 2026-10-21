package com.finalshell.core;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Ha2_2 extends HP_2 {
   public final Method O;
   final HA I;

   Ha2_2(HA var1, Method var2) {
      super(var1);
      this.I = var1;
      this.O = var2;
   }

   public com.finalshell.ui.model.S_3 p$_S() {
      return HA.J(this.O.getModifiers());
   }

   @Override
   public H4_2[] f() {
      return new H4_2[0];
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
   public Hd2[] d() {
      return HA.f(this.I, this.O.getParameterTypes());
   }

   @Override
   public boolean u() {
      return Modifier.isStatic(this.O.getModifiers());
   }

   @Override
   public boolean F() {
      return Modifier.isAbstract(this.O.getModifiers());
   }

   public Hd2 p$hd_2() {
      return HA.r(this.I, this.O.getReturnType());
   }

   @Override
   public Hd2[] S() {
      return HA.f(this.I, this.O.getExceptionTypes());
   }
}





