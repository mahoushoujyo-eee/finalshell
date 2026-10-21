package org;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;

public final class q {
   private final AccessControlContext Q;

   public q(PermissionCollection var1) {
      this.Q = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, var1)});
   }

   public Object F(PrivilegedAction var1) {
      return AccessController.doPrivileged(var1, this.Q);
   }

   public Object z(PrivilegedExceptionAction var1) throws Exception {
      try {
         return AccessController.doPrivileged(var1, this.Q);
      } catch (PrivilegedActionException var3) {
         throw var3.getException();
      }
   }

   static {
      if (System.getSecurityManager() == null) {
         Policy.setPolicy(new org.X());
         System.setSecurityManager(new SecurityManager());
      }
   }
}





