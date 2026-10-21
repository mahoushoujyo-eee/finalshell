package com.finalshell.ui.listener;

import com.finalshell.core.V5_2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class E3 extends FocusAdapter {
   final V5_2 E;

   E3(V5_2 var1) {
      this.E = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.E.stopCellEditing();
   }
}





