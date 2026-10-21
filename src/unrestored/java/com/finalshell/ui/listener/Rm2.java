package com.finalshell.ui.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class Rm2 extends MouseAdapter {
   public final com.finalshell.core.Lk4 K;

   public Rm2(com.finalshell.core.Lk4 var1) {
      this.K = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = com.finalshell.core.Lk4.N();
      boolean var10000 = this.K.isEnabled();
      if (var2 == null) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isRightMouseButton(var1);
      }

      if (var10000) {
         this.K.q();
      }
   }
}





