package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Ku4;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class W72 extends MouseAdapter {
   public final Ku4 N;
   public final Component W;

   public W72(Ku4 var1, Component var2) {
      this.N = var1;
      this.W = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = Ku4.H();
      if (var2 == 0) {
         if (!SwingUtilities.isMiddleMouseButton(var1)) {
            return;
         }

         this.N.remove(this.W);
         this.N.revalidate();
      }

      this.N.repaint();
   }
}





