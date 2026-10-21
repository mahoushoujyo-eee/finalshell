package com.finalshell.core;

public abstract class NR_2 extends NV_2 {
   public static boolean v;

   public NR_2(com.finalshell.ui.model.I var1) {
      super(var1);
   }

   @C_9
   @Override
   public NR_2 v() {
      return this;
   }

   @C_9
   public abstract Object W(C_4_3 var1) throws Throwable;

   @C_9
   @Override
   public final Object i(C_w_2 var1) throws Throwable {
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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (k()) {
         S(true);
      }
   }
}





