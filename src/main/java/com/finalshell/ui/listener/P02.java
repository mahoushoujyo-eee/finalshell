package com.finalshell.ui.listener;

import com.finalshell.core.BX;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class P02 implements ChangeListener {
   public final BX M;

   public P02(BX var1) {
      this.M = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.M.Z();
   }
}





