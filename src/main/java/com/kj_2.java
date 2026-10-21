package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.TransferHandler;

class Kj_2 extends MouseAdapter {
   public boolean Q;
   final com.k0_2 Y;

   Kj_2(com.k0_2 var1) {
      this.Y = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.Q = true;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      String var2 = com.kz_4.M();
      com.Kj_2 var10000 = this;
      if (var2 != null) {
         if (!this.Q) {
            return;
         }

         var10000 = this;
      }

      TransferHandler var3 = var10000.Y.getTransferHandler();
      var3.exportAsDrag(this.Y, var1, var3.getSourceActions(this.Y));
      this.Q = false;
   }
}





