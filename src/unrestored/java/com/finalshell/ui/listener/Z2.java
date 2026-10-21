package com.finalshell.ui.listener;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSpinner;

public class Z2 extends FocusAdapter {
   public final JSpinner f;

   public Z2(JSpinner var1) {
      this.f = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.f.repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.f.repaint();
   }
}





