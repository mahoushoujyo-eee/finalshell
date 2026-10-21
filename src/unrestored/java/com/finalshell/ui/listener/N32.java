package com.finalshell.ui.listener;

import com.finalshell.ui.panel.EX;
import com.finalshell.ui.panel.KD3;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class N32 implements ChangeListener {
   public final EX p;
   public final KD3 r;

   public N32(KD3 var1, EX var2) {
      this.r = var1;
      this.p = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      KD3.c(this.r).h(KD3.d(this.r));
      KD3.c(this.r).b(this.p.getValue());
      KD3.c(this.r).u(KD3.d(this.r));
   }
}





