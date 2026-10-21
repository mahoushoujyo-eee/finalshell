package com.finalshell.core;

public final class N3_2 extends NR_2 {
   public final N_ o;
   public final U3_3 P;
   public static long a;

   public N3_2(com.finalshell.ui.model.I var1, N_ var2, U3_3 var3) {
      super(var1);
      this.o = var2;
      this.P = var3;
   }

   @Override
   public String toString() {
      return this.o.toString() + (int)a + this.P.h();
   }

   @C_9
   @Override
   public Object W(C_4_3 var1) throws Throwable {
      return var1.M(this);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4778177404587537342L;
      long var10002 = -7336567809935346800L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





