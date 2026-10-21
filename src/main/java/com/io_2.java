package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Io_2 extends MouseAdapter {
   final com.QZ w;

   Io_2(com.QZ var1) {
      this.w = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = com.QX.Y();
      com.QZ var10000 = this.w;
      if (var2 == null) {
         if (this.w.s) {
            return;
         }

         var10000 = this.w;
      }

      var10000.s();
   }
}





