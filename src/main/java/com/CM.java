package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class CM implements ChangeListener {
   final _n_2 p;

   CM(_n_2 var1) {
      this.p = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      _n_2.T(this.p).repaint();
   }
}





