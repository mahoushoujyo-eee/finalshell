package com.finalshell.core;

public class Rf2_2 extends RQ {
   public final Fu2_2[] b;
   public final Nt2_2 C;
   public final Rq2_2 p;
   public static long a;

   public Rf2_2(com.finalshell.ui.model.I var1, Fu2_2[] var2, Nt2_2 var3, Rq2_2 var4) {
      super(var1);
      this.b = var2;
      this.C = var3;
      this.p = var4;
   }

   @Override
   public void e(Rx2_2 var1) {
      this.C.n(var1);
      this.p.C(var1);
   }

   @C_9
   @Override
   public Object R(FY_2 var1) throws Throwable {
      return var1.K(this);
   }

   @Override
   public String toString() {
      return RG_2.o(this.b) + this.C + (int)a + this.p;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6038248351736960168L;
      long var10002 = 3939462760925926536L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





