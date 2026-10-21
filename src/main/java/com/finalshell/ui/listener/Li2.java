package com.finalshell.ui.listener;

import com.finalshell.core.Hl2;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Li2 implements FocusListener {
   final Hl2 O;

   Li2(Hl2 var1) {
      this.O = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      Hl2.s(this.O).repaint();
   }

   @Override
   public void focusGained(FocusEvent var1) {
      Hl2.s(this.O).repaint();
   }
}





