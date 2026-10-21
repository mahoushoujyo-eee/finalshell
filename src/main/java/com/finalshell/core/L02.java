package com.finalshell.core;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;

public class L02 implements PrivilegedAction {
   final AccessibleObject A;
   final LR3 a;

   L02(LR3 var1, AccessibleObject var2) {
      this.a = var1;
      this.A = var2;
   }

   public Void d() {
      this.A.setAccessible(true);
      return null;
   }

   @Override
   public Object run() {
      return this.d();
   }
}





