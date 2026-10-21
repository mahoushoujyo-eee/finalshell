package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Xv4;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class RL implements DocumentListener {
   final Runnable z;
   final Xv4 U;

   RL(Xv4 var1, Runnable var2) {
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





