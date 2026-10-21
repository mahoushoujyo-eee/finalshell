package com;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class SD implements MouseWheelListener {
   final _n_2 l;

   SD(_n_2 var1) {
      this.l = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2 = _n_2.x(this.l).getValue() - var1.getWheelRotation();
      _n_2.H(this.l).setValue(Math.min(Math.max(_n_2.o(this.l).getMinimum(), var2), _n_2.I(this.l).getMaximum()));
   }
}





