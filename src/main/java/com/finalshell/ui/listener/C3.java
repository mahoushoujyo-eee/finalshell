package com.finalshell.ui.listener;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class C3 implements CaretListener {
   final com.finalshell.ui.panel.T z;

   C3(com.finalshell.ui.panel.T var1) {
      this.z = var1;
   }

   @Override
   public void caretUpdate(CaretEvent var1) {
      this.z.b(null);
   }
}





