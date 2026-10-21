package com.finalshell.core;

import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.Ks4;

public class Kr2 implements E_2 {
   public final K32 h;
   public final Ks4 x;

   public Kr2(Ks4 var1, K32 var2) {
      this.x = var1;
      this.h = var2;
   }

   public Boolean h() {
      int[] var1 = K32.L$arrint();
      int var10000 = (this.h.Y$boolean()) ? 1 : 0;
      if (var1 != null) {
         if (var10000 == 0) {
            return true;
         }

         var10000 = (this.x.e) ? 1 : 0;
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
         K32 var4 = this.x.j;
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





