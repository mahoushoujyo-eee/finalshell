package com.m;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class B extends FocusAdapter {
   final V b;

   B(V var1) {
      this.b = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.b.stopCellEditing();
   }
}





