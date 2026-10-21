package com;

import java.security.PrivilegedAction;

class xw_4 implements PrivilegedAction {
   @Override
   public Object run() {
      return com.KW.class.getProtectionDomain();
   }
}





