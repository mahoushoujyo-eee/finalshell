package com.finalshell.ui.listener;

import com.finalshell.core.Nr4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Iy4 extends MouseAdapter {
   final Nr4 g;

   Iy4(Nr4 var1) {
      this.g = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.g.o.r(this.g.q);
   }
}





