package com.V;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSpinner;

class z extends FocusAdapter {
   final JSpinner f;

   z(JSpinner var1) {
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





