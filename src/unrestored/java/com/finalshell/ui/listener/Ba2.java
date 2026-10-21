package com.finalshell.ui.listener;

import com.finalshell.core.IE;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ba2 implements ChangeListener {
   public final IE O;

   public Ba2(IE var1) {
      this.O = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.O.M();
   }
}





