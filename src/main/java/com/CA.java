package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.SwingUtilities;

class CA extends MouseAdapter {
   final Ic_2 E;

   CA(Ic_2 var1) {
      this.E = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var10000 = com.kz_4.M();
      int var3 = Ic_2.g(this.E).getUI().locationToIndex(Ic_2.g(this.E), var1.getPoint());
      String var2 = var10000;
      int var4 = SwingUtilities.isLeftMouseButton(var1);
      if (var2 != null) {
         if (var4 == 0) {
            return;
         }

         var4 = var3;
      }

      if (var4 != -1) {
         Ic_2.i(this.E, (File)Ic_2.g(this.E).getModel().getElementAt(var3));
      }
   }
}





