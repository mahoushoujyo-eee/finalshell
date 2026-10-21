package com.finalshell.ui.listener;

import com.finalshell.core.Nx4;
import com.finalshell.ui.panel.Kh4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class LN3 extends MouseAdapter {
   final Kh4 K;

   LN3(Kh4 var1) {
      this.K = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = Nx4.R();
      int var10000 = (SwingUtilities.isLeftMouseButton(var1)) ? 1 : 0;
      if (var2 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getY();
      }

      if (var10000 <= this.K.getHeight() / 2) {
         Kh4.e(this.K);
         if (var2 == 0) {
            return;
         }
      }

      Kh4.Q(this.K);
   }
}





