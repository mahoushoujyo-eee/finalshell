package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K42;
import com.finalshell.ui.panel.Kk4;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Pn2 extends FocusAdapter {
   final K42 N;
   final Kk4 H;

   Pn2(Kk4 var1, K42 var2) {
      this.H = var1;
      this.N = var2;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      Kk4.L(this.H);
   }
}





