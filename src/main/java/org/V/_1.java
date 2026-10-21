package org.v;

import org.I;

public final class _1 extends _D implements f2 {
   private static final long f;

   public _1(I var1, @org.F.c String var2, fu_2[] var3, String var4, @org.F.c _U[] var5, @org.F.c Nt_2 var6, Nt_2[] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public String R() {
      String[] var10000 = RG.C();
      x_3 var2 = this.y();
      String[] var1 = var10000;

      do {
         while (!(var2 instanceof K_2)) {
            var2 = var2.y();
         }
      } while (var1 == null);

      return ((K_2)var2).R() + (int)f + this.H;
   }

   @org.F.c
   @Override
   public Object J(fq_2 var1) throws Throwable {
      return var1.I(this);
   }

   static {
      long var0 = 8852578523461363656L;
      long var10002 = 3816628815127029740L ^ var0;
      byte var10001 = -1;
      f = var10002;
   }
}





