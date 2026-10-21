package com;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;

class l0_2 implements PrivilegedAction {
   final AccessibleObject A;
   final com.lR_3 a;

   l0_2(com.lR_3 var1, AccessibleObject var2) {
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





