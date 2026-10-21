package com;

class Kr_2 implements com.E {
   final com.k3_2 h;
   final com.ks_4 x;

   Kr_2(com.ks_4 var1, com.k3_2 var2) {
      this.x = var1;
      this.h = var2;
   }

   public Boolean h() {
      int[] var1 = com.k3_2.L();
      int var10000 = this.h.Y();
      if (var1 != null) {
         if (var10000 == 0) {
            return true;
         }

         var10000 = this.x.e;
      }

      if (var1 != null) {
         if (var10000 == 0) {
            return true;
         }

         var10000 = this.x.I();
      }

      int var2 = var10000;
      var10000 = var2;
      byte var10001 = 1;
      if (var1 != null) {
         if (var2 > 1) {
            return true;
         }

         var10000 = var2;
         var10001 = 1;
      }

      if (var10000 == var10001) {
         com.k3_2 var4 = this.x.j;
         if (var1 != null) {
            if (this.x.j == null) {
               return false;
            }

            var4 = this.x.j;
         }

         if (var4 != this.h) {
            return true;
         }
      }

      return false;
   }

   @Override
   public Object J() {
      return this.h();
   }
}





