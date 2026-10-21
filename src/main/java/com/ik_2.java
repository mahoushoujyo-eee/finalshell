package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Ik_2 extends KeyAdapter {
   final nr_4 Q;

   Ik_2(nr_4 var1) {
      this.Q = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (GR.lD.J(var1)) {
         this.Q.g();
      }
   }
}





