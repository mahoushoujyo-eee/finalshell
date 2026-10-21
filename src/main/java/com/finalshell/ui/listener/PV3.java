package com.finalshell.ui.listener;

import com.finalshell.core.KV_2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PV3 extends FocusAdapter {
   final KV_2 n;

   PV3(KV_2 var1) {
      this.n = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      KV_2.q(this.n).repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      KV_2.C(this.n).repaint();
   }
}





