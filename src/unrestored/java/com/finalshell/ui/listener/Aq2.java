package com.finalshell.ui.listener;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Aq2 extends FocusAdapter {
   public final Ic2 S;

   public Aq2(Ic2 var1) {
      this.S = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      Ic2.w(this.S);
   }
}





