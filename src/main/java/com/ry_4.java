package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class ry_4 extends ComponentAdapter {
   final com.DP Y;
   final Sj_2 n;
   final com.QL K;

   ry_4(com.QL var1, com.DP var2, Sj_2 var3) {
      this.K = var1;
      this.Y = var2;
      this.n = var3;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      com.U.O var4;
      String[] var10000 = com.BX.B();
      com.U.O var3 = this.Y.g();
      String[] var2 = var10000;
      var4 = var3;
      label18:
      if (var2 == null) {
         if (var3.getWidth() <= 0) {
            var4 = var3;
            if (var2 != null) {
               break label18;
            }

            if (var3.getHeight() <= 0) {
               return;
            }
         }

         this.Y.a(this.n.b());
         var4 = var3;
      }

      var4.removeComponentListener(this);
   }
}





