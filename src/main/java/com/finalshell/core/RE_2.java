package com.finalshell.core;

import java.security.PrivilegedAction;

public class RE_2 implements PrivilegedAction {
   final ClassLoader d;
   final Rh2_2 Y;

   RE_2(Rh2_2 var1, ClassLoader var2) {
      this.Y = var1;
      this.d = var2;
   }

   public W3_4 s() {
      return new C_g_2(this.d);
   }

   @Override
   public Object run() {
      return this.s();
   }
}





