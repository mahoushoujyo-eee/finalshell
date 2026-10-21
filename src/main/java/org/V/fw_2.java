package org.v;

import java.security.PrivilegedAction;
import java.util.Map;
import org.w.h;

class fw_2 implements PrivilegedAction {
   final Map r;
   final hO Y;

   fw_2(hO var1, Map var2) {
      this.Y = var1;
      this.r = var2;
   }

   public ClassLoader B() {
      return new h(this.r, hO.E(this.Y));
   }

   @Override
   public Object run() {
      return this.B();
   }
}





