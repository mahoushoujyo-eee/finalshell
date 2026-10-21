package com.finalshell.core;

import java.util.Objects;

public class Px2 {
   public final int l;
   public final int E;

   public Px2(int var1, int var2) {
      this.l = var1;
      this.E = var2;
   }

   @Override
   public boolean equals(Object var1) {
      String var2 = Dx4.g();
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

         Px2 var3 = (Px2)var10000;
         int var5 = this.l;
         int var10001 = var3.l;
         if (var2 == null) {
            if (this.l != var3.l) {
               return 0 != 0;
            }

            var5 = this.E;
            if (var2 != null) {
               return (this.E != 0);
            }

            var10001 = var3.E;
         }

         return (boolean)((var5 == var10001 ? 1 : 0) != 0);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.l, this.E);
   }
}





