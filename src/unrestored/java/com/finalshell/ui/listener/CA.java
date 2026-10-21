package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.SwingUtilities;

public class CA extends MouseAdapter {
   public final Ic2 E;

   public CA(Ic2 var1) {
      this.E = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var10000 = Kz4.M();
      int var3 = Ic2.g(this.E).getUI().locationToIndex(Ic2.g(this.E), var1.getPoint());
      String var2 = var10000;
      int var4 = (SwingUtilities.isLeftMouseButton(var1)) ? 1 : 0;
      if (var2 != null) {
         if (var4 == 0) {
            return;
         }

         var4 = var3;
      }

      if (var4 != -1) {
         Ic2.i(this.E, (File)Ic2.g(this.E).getModel().getElementAt(var3));
      }
   }
}





