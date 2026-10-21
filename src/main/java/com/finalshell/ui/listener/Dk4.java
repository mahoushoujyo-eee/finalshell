package com.finalshell.ui.listener;

import com.finalshell.core.Fm2;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Dk4 implements ItemListener {
   final Fm2 y;

   Dk4(Fm2 var1) {
      this.y = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      this.y.A();
   }
}





