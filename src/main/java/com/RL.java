package com;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class RL implements DocumentListener {
   final Runnable z;
   final xv_4 U;

   RL(xv_4 var1, Runnable var2) {
      this.U = var1;
      this.z = var2;
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      this.z.run();
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      this.z.run();
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      this.z.run();
   }
}





