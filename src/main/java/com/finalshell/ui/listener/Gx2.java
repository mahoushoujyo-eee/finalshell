package com.finalshell.ui.listener;

import com.finalshell.core.Ia2;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Gx2 implements ChangeListener {
   final Ia2 M;

   Gx2(Ia2 var1) {
      this.M = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.M.M();
   }
}





