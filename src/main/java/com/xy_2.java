package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Xy_2 extends MouseAdapter {
   final com.QQ F;

   Xy_2(com.QQ var1) {
      this.F = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      com.ky_4[] var2 = com.QQ.N();
      boolean var10000 = this.F.m;
      if (var2 == null) {
         if (!this.F.m) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      if (var10000) {
         this.F.a();
         if (var2 == null) {
            return;
         }
      }

      this.F.l();
   }
}





