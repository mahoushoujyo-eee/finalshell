package com;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.text.JTextComponent;

class HS implements FocusListener {
   final JTextComponent K;
   final _c_2 z;

   HS(_c_2 var1, JTextComponent var2) {
      this.z = var1;
      this.K = var2;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.K.repaint();
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.K.repaint();
   }
}





