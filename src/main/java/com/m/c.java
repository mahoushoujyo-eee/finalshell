package com.m;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class c extends FocusAdapter {
   final V a;

   c(V var1) {
      this.a = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.a.stopCellEditing();
   }
}





