package com.finalshell.ui.listener;

import com.finalshell.core.Ir2;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BO implements ChangeListener {
   final Ir2 i;

   BO(Ir2 var1) {
      this.i = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.i.M();
   }
}





