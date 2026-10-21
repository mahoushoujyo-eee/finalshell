package com.finalshell.ui.listener;

import com.finalshell.ui.panel.QZ;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Io2 extends MouseAdapter {
   public final QZ w;

   public Io2(QZ var1) {
      this.w = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = com.finalshell.ui.panel.QX.Y();
      QZ var10000 = this.w;
      if (var2 == null) {
         if (this.w.s) {
            return;
         }

         var10000 = this.w;
      }

      var10000.s();
   }
}





