package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Bq_2;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GL implements DocumentListener {
   public final Bq_2 p;

   public GL(Bq_2 var1) {
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

   public void g() {
      this.p.s();
   }
}





