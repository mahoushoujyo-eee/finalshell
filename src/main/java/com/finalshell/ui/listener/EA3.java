package com.finalshell.ui.listener;

import com.finalshell.core.Rk2;
import javax.swing.event.DocumentEvent;

public class EA3 extends EK3 {
   final Rk2 M;

   EA3(Rk2 var1) {
      this.M = var1;
   }

   @Override
   public void u(DocumentEvent var1) {
      this.M.d(var1);
   }
}





