package com.finalshell.ui.listener;

import com.finalshell.core.Nx4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class KM extends MouseAdapter {
   final Nx4 i;

   KM(Nx4 var1) {
      this.i = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = Nx4.c$int();
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





