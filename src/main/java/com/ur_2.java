package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

class ur_2 extends KeyAdapter {
   final Ic_2 k;

   ur_2(Ic_2 var1) {
      this.k = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (GR.lZ.J(var1)) {
         Ic_2.i(this.k, (File)Ic_2.g(this.k).getSelectedValue());
      }
   }
}





