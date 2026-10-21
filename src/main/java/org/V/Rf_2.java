package org.v;

import org.I;

public class Rf_2 extends RQ {
   public final fu_2[] b;
   public final Nt_2 C;
   public final Rq_2 p;
   private static final long a;

   public Rf_2(I var1, fu_2[] var2, Nt_2 var3, Rq_2 var4) {
      super(var1);
      this.b = var2;
      this.C = var3;
      this.p = var4;
   }

   @Override
   public void e(Rx_2 var1) {
      this.C.n(var1);
      this.p.C(var1);
   }

   @org.F.c
   @Override
   public Object R(fY var1) throws Throwable {
      return var1.K(this);
   }

   @Override
   public String toString() {
      return RG.o(this.b) + this.C + (int)a + this.p;
   }

   static {
      long var0 = 6038248351736960168L;
      long var10002 = 3939462760925926536L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





