package com;

import org.jetbrains.annotations.NotNull;

public class q_2 extends j_2 {
   private final j_2 e;
   private final int t;

   public q_2(@NotNull j_2 var1, int var2, int var3) {
      super(var1.r(), var1.o() + var2, var3);
      this.e = var1;
      this.t = var2;
   }

   @NotNull
   public j_2 V() {
      return this.e;
   }

   public int p() {
      return this.t;
   }
}





