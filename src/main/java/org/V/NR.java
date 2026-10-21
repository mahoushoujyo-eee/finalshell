package org.v;

import org.I;

public abstract class NR extends NV {
   private static boolean v;

   protected NR(I var1) {
      super(var1);
   }

   @org.F.c
   @Override
   public NR v() {
      return this;
   }

   @org.F.c
   public abstract Object W(_4 var1) throws Throwable;

   @org.F.c
   @Override
   public final Object i(_w_2 var1) throws Throwable {
      return var1.d(this);
   }

   public static void S(boolean var0) {
      v = var0;
   }

   public static boolean k() {
      return v;
   }

   public static boolean Q() {
      boolean var0 = k();
      return !var0;
   }

   static {
      if (k()) {
         S(true);
      }
   }
}





