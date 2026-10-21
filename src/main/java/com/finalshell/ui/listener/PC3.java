package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class PC3 extends MouseAdapter {
   public final Kz4 m;

   public PC3(Kz4 var1) {
      this.m = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         this.m.m();
      }
   }
}





