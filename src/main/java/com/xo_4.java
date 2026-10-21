package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

class xo_4 extends KeyAdapter {
   final JList F;
   final w2_2 C;

   xo_4(w2_2 var1, JList var2) {
      this.C = var1;
      this.F = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (GR.lR.J(var1)) {
         this.C.N(this.F, this.F.getSelectedIndex());
      }
   }
}





