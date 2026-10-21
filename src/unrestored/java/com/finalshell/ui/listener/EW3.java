package com.finalshell.ui.listener;

import com.finalshell.ui.frame.Xc4;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EW3 implements ChangeListener {
   public final Xc4 H;

   public EW3(Xc4 var1) {
      this.H = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      Xc4.N(this.H);
   }
}





