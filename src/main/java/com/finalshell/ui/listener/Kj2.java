package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K02;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.TransferHandler;

public class Kj2 extends MouseAdapter {
   public boolean Q;
   final K02 Y;

   Kj2(K02 var1) {
      this.Y = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.Q = true;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      String var2 = Kz4.M();
      Kj2 var10000 = this;
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





