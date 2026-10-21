package com.finalshell.ui.listener;

import com.finalshell.core.Nx4;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CE3 extends FocusAdapter {
   final Nx4 n;

   CE3(Nx4 var1) {
      this.n = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.n.b();
   }
}





