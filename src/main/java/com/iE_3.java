package com;

import java.awt.Component;

class iE_3 implements com.Ka_2 {
   final com.QB b;

   iE_3(com.QB var1) {
      this.b = var1;
   }

   @Override
   public void N(Component var1, Component var2) {
      int[] var3 = com.WC.V();
      Object var10000 = this.b;
      if (var3 == null) {
         if (!this.b.V) {
            return;
         }

         var10000 = var2;
      }

      if (var10000 == null) {
         this.b.l();
      }
   }
}





