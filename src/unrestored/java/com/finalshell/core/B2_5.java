package com.finalshell.core;

public class B2_5 extends D22_2 {
   public static String[] u;

   public B2_5(String var1, @C_9 com.finalshell.ui.model.I var2) {
      super(var1, var2);
   }

   public B2_5(String var1, @C_9 com.finalshell.ui.model.I var2, Throwable var3) {
      super(var1, var2, var3);
   }

   public static void Q(String[] var0) {
      u = var0;
   }

   public static String[] d() {
      return u;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (d() != null) {
         Q(new String[3]);
      }
   }
}





