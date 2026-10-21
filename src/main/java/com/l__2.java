package com;

import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class l__2 extends ComponentAdapter {
   final com.Ds_2 p;

   l__2(com.Ds_2 var1) {
      this.p = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int[] var2 = com.Ds_2.U();
      com.Ds_2 var10000 = this.p;
      if (var2 == null) {
         if (this.p.g() == null) {
            return;
         }

         var10000 = this.p;
      }

      Rectangle var3 = var10000.getBounds();
      var3.width++;
      var3.height++;
      Xk_2.v(this.p, this.p.g().g(this.p.o, var3));
   }
}





