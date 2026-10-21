package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class w__2 extends MouseAdapter {
   final com.QS q;

   w__2(com.QS var1) {
      this.q = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      com.ky_4[] var2 = com.QQ.N();
      boolean var10000 = this.q.a;
      if (var2 == null) {
         if (!this.q.a) {
            return;
         }

         var10000 = com.FN.B(var1);
      }

      if (var10000) {
         this.q.a();
         if (var2 == null) {
            return;
         }
      }

      this.q.V();
   }
}





