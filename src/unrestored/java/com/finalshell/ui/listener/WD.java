package com.finalshell.ui.listener;

import com.finalshell.core.It4;
import com.finalshell.core.NJ;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class WD implements ChangeListener {
   public final NJ Z;
   public final It4 T;

   public WD(It4 var1, NJ var2) {
      this.T = var1;
      this.Z = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.Z.R();
   }
}





