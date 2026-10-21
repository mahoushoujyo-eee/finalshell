package org.v;

import org.I;

public final class f1 {
   @org.F.c
   private final String W;
   private final int k;
   private final int B;
   @org.F.c
   private I p;
   public final F_2 T;
   public final String Y;

   public f1(@org.F.c String var1, int var2, int var3, F_2 var4, String var5) {
      this.W = var1;
      this.k = var2;
      this.B = var3;
      this.T = var4;
      this.Y = var5;
   }

   public f1(I var1, F_2 var2, String var3) {
      this.W = var1.x();
      this.k = var1.D();
      this.B = var1.S();
      this.p = var1;
      this.T = var2;
      this.Y = var3;
   }

   public I T() {
      String[] var1 = RG.C();
      I var10000 = this.p;
      if (var1 != null) {
         if (this.p != null) {
            return this.p;
         }

         var10000 = this.p = new I(this.W, this.k, this.B);
      }

      return var10000;
   }

   @Override
   public String toString() {
      return this.Y;
   }
}





