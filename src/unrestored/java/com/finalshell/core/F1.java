package com.finalshell.core;

public final class F1 {
   @C_9
   public final String W;
   public final int k;
   public final int B;
   @C_9
   public com.finalshell.ui.model.I p;
   public final com.finalshell.ui.model.F2_2 T;
   public final String Y;

   public F1(@C_9 String var1, int var2, int var3, com.finalshell.ui.model.F2_2 var4, String var5) {
      this.W = var1;
      this.k = var2;
      this.B = var3;
      this.T = var4;
      this.Y = var5;
   }

   public F1(com.finalshell.ui.model.I var1, com.finalshell.ui.model.F2_2 var2, String var3) {
      this.W = var1.x();
      this.k = var1.D();
      this.B = var1.S();
      this.p = var1;
      this.T = var2;
      this.Y = var3;
   }

   public com.finalshell.ui.model.I T() {
      String[] var1 = RG_2.C();
      com.finalshell.ui.model.I var10000 = this.p;
      if (var1 != null) {
         if (this.p != null) {
            return this.p;
         }

         var10000 = this.p = new com.finalshell.ui.model.I(this.W, this.k, this.B);
      }

      return var10000;
   }

   @Override
   public String toString() {
      return this.Y;
   }
}





