package com.finalshell.ui.model;

import org.jetbrains.annotations.NotNull;

public class Q2 extends J2 {
   public final J2 e;
   public final int t;

   public Q2(@NotNull J2 var1, int var2, int var3) {
      super(var1.r(), var1.o() + var2, var3);
      this.e = var1;
      this.t = var2;
   }

   @NotNull
   public J2 V() {
      return this.e;
   }

   public int p() {
      return this.t;
   }
}





