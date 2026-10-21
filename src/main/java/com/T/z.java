package com.t;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class z extends MouseAdapter {
   final com.KD L;
   final com.t.n_2 P;

   z(com.t.n_2 var1, com.KD var2) {
      this.P = var1;
      this.L = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         this.L.doClick(0);
      }
   }
}





