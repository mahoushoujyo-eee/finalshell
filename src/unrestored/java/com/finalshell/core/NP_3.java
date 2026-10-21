package com.finalshell.core;

public abstract class NP_3 extends NV_2 {
   public final String L;
   public static int[] Z;

   public NP_3(com.finalshell.ui.model.I var1, String var2) {
      super(var1);
      this.L = var2;
   }

   @Override
   public String toString() {
      return this.L;
   }

   public static void U(int[] var0) {
      Z = var0;
   }

   public static int[] a() {
      return Z;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (a() != null) {
         U(new int[2]);
      }
   }
}





