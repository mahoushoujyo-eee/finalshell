package com.finalshell.ui.listener;

import com.finalshell.core.IY;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class I3 implements ItemListener {
   final IY o;

   I3(IY var1) {
      this.o = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      this.o.M();
   }
}





