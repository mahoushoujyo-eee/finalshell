package com.finalshell.ui.listener;

import com.finalshell.core.V5_2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class B8 extends FocusAdapter {
   public final V5_2 b;

   public B8(V5_2 var1) {
      this.b = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.b.stopCellEditing();
   }
}





