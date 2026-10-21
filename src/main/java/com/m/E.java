package com.m;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class E extends FocusAdapter {
   final V E;

   E(V var1) {
      this.E = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.E.stopCellEditing();
   }
}





