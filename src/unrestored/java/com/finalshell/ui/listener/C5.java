package com.finalshell.ui.listener;

import com.finalshell.core.V5_2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class C5 extends FocusAdapter {
   public final V5_2 a;

   public C5(V5_2 var1) {
      this.a = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.a.stopCellEditing();
   }
}





