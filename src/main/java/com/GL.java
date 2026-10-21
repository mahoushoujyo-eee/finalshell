package com;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class GL implements DocumentListener {
   final com.Bq_2 p;

   GL(com.Bq_2 var1) {
      this.p = var1;
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      this.g();
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      this.g();
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      this.g();
   }

   private void g() {
      this.p.s();
   }
}





