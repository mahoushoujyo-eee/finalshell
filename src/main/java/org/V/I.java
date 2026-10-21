package org.V;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class I implements org.V.H {
   private final Map T;

   public I() {
      this.T = new HashMap();
   }

   public I(Map var1) {
      this.T = var1;
   }

   public final Map n() {
      return this.T;
   }

   @Override
   public final OutputStream X(String var1) {
      return new C(this, var1);
   }

   @Override
   public final boolean A(String var1) {
      return this.T.remove(var1) != null;
   }

   static Map T(I var0) {
      return var0.T;
   }
}





