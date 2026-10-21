package com.finalshell.core;

import java.security.PrivilegedAction;
import java.util.Map;

public class Fw2_2 implements PrivilegedAction {
   public final Map r;
   public final HO_2 Y;

   public Fw2_2(HO_2 var1, Map var2) {
      this.Y = var1;
      this.r = var2;
   }

   public ClassLoader B() {
      return new H_6(this.r, HO_2.E(this.Y));
   }

   @Override
   public Object run() {
      return this.B();
   }
}





