package com.finalshell.core;

public final class Ni2_2 extends NR_2 {
   public final N_ S;
   public final String J;
   @C_9
   public NV_2 B;
   public static long a;

   public Ni2_2(com.finalshell.ui.model.I var1, N_ var2, String var3) {
      super(var1);
      this.S = var2;
      this.J = var3;
   }

   @Override
   public String toString() {
      return this.S.toString() + (int)a + this.J;
   }

   @C_9
   @Override
   public Object W(C_4_3 var1) throws Throwable {
      return var1.K(this);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 421127293331197320L;
      long var10002 = 2203649969414098342L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





