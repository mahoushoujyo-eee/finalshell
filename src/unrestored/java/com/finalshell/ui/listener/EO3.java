package com.finalshell.ui.listener;

import javax.swing.event.DocumentEvent;

public abstract class EO3 extends EK3 {
   @Override
   public void u(DocumentEvent var1) {
      try {
         this.d(Integer.parseInt(this.Y(var1)), var1);
      } catch (Throwable var3) {
         this.d(null, var1);
      }
   }

   public abstract void d(Integer var1, DocumentEvent var2);
}





