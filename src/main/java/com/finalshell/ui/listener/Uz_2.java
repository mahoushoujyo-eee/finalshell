package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KD3;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Uz_2 implements ChangeListener {
   public final KD3 U;

   public Uz_2(KD3 var1) {
      this.U = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      KD3.M(this.U);
   }
}





