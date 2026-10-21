package com.finalshell.core;

public final class C_1_2 extends C_D implements F22 {
   public static long f;

   public C_1_2(com.finalshell.ui.model.I var1, @C_9 String var2, Fu2_2[] var3, String var4, @C_9 C_U[] var5, @C_9 Nt2_2 var6, Nt2_2[] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public String R() {
      String[] var10000 = RG_2.C();
      X_3_2 var2 = this.y();
      String[] var1 = var10000;

      do {
         while (!(var2 instanceof K_2_2)) {
            var2 = var2.y();
         }
      } while (var1 == null);

      return ((K_2_2)var2).R() + (int)f + this.H;
   }

   @C_9
   @Override
   public Object J(Fq2_2 var1) throws Throwable {
      return var1.I(this);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8852578523461363656L;
      long var10002 = 3816628815127029740L ^ var0;
      byte var10001 = -1;
      f = var10002;
   }
}





