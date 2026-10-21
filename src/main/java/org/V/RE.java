package org.v;

import java.security.PrivilegedAction;

class RE implements PrivilegedAction {
   final ClassLoader d;
   final Rh_2 Y;

   RE(Rh_2 var1, ClassLoader var2) {
      this.Y = var1;
      this.d = var2;
   }

   public org.W s() {
      return new _g_2(this.d);
   }

   @Override
   public Object run() {
      return this.s();
   }
}





