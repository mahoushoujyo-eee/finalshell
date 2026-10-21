package com.finalshell.core;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class I_6 implements H_4 {
   public final Map T;

   public I_6() {
      this.T = new HashMap();
   }

   public I_6(Map var1) {
      this.T = var1;
   }

   public final Map n() {
      return this.T;
   }

   @Override
   public final OutputStream X(String var1) {
      return new com.finalshell.io.C(this, var1);
   }

   @Override
   public final boolean A(String var1) {
      return this.T.remove(var1) != null;
   }

   static Map T(I_6 var0) {
      return var0.T;
   }
}





