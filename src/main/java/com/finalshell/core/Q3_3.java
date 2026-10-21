package com.finalshell.core;

public class Q3_3 implements M_2_2 {
   final H3_2 A;

   Q3_3(H3_2 var1) {
      this.A = var1;
   }

   @C_9
   public Boolean Q(NU_3 var1) {
      return true;
   }

   @C_9
   public Boolean k(NS var1) {
      String[] var2 = RG_2.C();
      boolean var10000 = var1.N();
      if (var2 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   @C_9
   @Override
   public Object Q(NS var1) throws Throwable {
      return this.k(var1);
   }

   @C_9
   @Override
   public Object Y(NU_3 var1) throws Throwable {
      return this.Q(var1);
   }
}





