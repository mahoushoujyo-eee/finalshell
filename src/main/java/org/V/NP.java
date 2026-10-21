package org.v;

import org.I;

public abstract class NP extends NV {
   public final String L;
   private static int[] Z;

   public NP(I var1, String var2) {
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
      if (a() != null) {
         U(new int[2]);
      }
   }
}





