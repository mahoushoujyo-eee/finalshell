package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class nU_3 extends ComponentAdapter {
   final nx_4 k;

   nU_3(nx_4 var1) {
      this.k = var1;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      int var2 = nx_4.c();
      nx_4 var10000 = this.k;
      if (var2 != 0) {
         if (!this.k.S.isShowing()) {
            return;
         }

         var10000 = this.k;
      }

      var10000.y();
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int var2 = nx_4.c();
      nx_4 var10000 = this.k;
      if (var2 != 0) {
         if (!this.k.S.isShowing()) {
            return;
         }

         var10000 = this.k;
      }

      var10000.y();
   }
}





