package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class KM extends MouseAdapter {
   final nx_4 i;

   KM(nx_4 var1) {
      this.i = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = nx_4.c();
      boolean var10000 = this.i.isEnabled();
      if (var2 != 0) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isRightMouseButton(var1);
      }

      if (var10000) {
         this.i.j();
      }
   }
}





