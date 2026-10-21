package com;

import java.util.Objects;

class Px_2 {
   private final int l;
   private final int E;

   public Px_2(int var1, int var2) {
      this.l = var1;
      this.E = var2;
   }

   @Override
   public boolean equals(Object var1) {
      String var2 = com.dx_4.g();
      Object var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var10000 != null) {
         var10000 = this.getClass();
         if (var2 == null) {
            if (var10000 != var1.getClass()) {
               return false;
            }

            var10000 = var1;
         }

         Px_2 var3 = (Px_2)var10000;
         int var5 = this.l;
         int var10001 = var3.l;
         if (var2 == null) {
            if (this.l != var3.l) {
               return (boolean)0;
            }

            var5 = this.E;
            if (var2 != null) {
               return (boolean)this.E;
            }

            var10001 = var3.E;
         }

         return (boolean)(var5 == var10001 ? 1 : 0);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.l, this.E);
   }
}





