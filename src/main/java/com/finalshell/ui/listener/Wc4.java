package com.finalshell.ui.listener;

import com.finalshell.core.IH;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Wc4 extends FocusAdapter {
   final IH l;

   Wc4(IH var1) {
      this.l = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.l.M();
   }
}





