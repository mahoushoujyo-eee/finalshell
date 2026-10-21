package com.finalshell.core;

import java.security.PrivilegedAction;

public class Xw4 implements PrivilegedAction {
   @Override
   public Object run() {
      return KW.class.getProtectionDomain();
   }
}





