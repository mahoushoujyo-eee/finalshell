package com.finalshell.core;

import java.util.Objects;

public class Ay2_2 {
   public final int L;
   public final int H;
   public final boolean d;

   public Ay2_2(XE var1, boolean var2) {
      this(var1.q, var1.r, var2);
   }

   public Ay2_2(int var1, int var2, boolean var3) {
      this.L = var1;
      this.H = var2;
      this.d = var3;
   }

   public int S() {
      return this.L;
   }

   public int r() {
      return this.H;
   }

   public boolean p() {
      return this.d;
   }

   @Override
   public boolean equals(Object var1) {
      boolean var2 = com.finalshell.ui.model.J2.g();
      Object var10000 = this;
      if (var2) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2) {
         if (!(var10000 instanceof Ay2_2)) {
            return false;
         }

         var10000 = var1;
      }

      Ay2_2 var3 = (Ay2_2)var10000;
      int var4 = this.L;
      int var10001 = var3.L;
      if (var2) {
         if (this.L != var3.L) {
            return 0 != 0;
         }

         var4 = this.H;
         var10001 = var3.H;
      }

      if (var2) {
         if (var4 != var10001) {
            return 0 != 0;
         }

         var4 = (this.d) ? 1 : 0;
         if (!var2) {
            return this.d;
         }

         var10001 = (var3.d) ? 1 : 0;
      }

      return (boolean)((var4 == var10001 ? 1 : 0) != 0);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.L, this.H, this.d);
   }
}





