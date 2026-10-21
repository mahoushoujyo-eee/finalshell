package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

class HW extends KeyAdapter {
   final JList m;
   final wO_3 u;

   HW(wO_3 var1, JList var2) {
      this.u = var1;
      this.m = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (GR.lR.J(var1)) {
         this.u.N(this.m, this.m.getSelectedIndex());
      }
   }
}





