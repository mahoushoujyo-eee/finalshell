package com.finalshell.ui.listener;

import com.finalshell.ui.panel.OG;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Os_2 extends FocusAdapter {
   final OG I;

   Os_2(OG var1) {
      this.I = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.I.repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.I.repaint();
   }
}





