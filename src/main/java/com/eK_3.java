package com;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public abstract class eK_3 implements DocumentListener {
   @Override
   public void insertUpdate(DocumentEvent var1) {
      this.u(var1);
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      this.u(var1);
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      this.u(var1);
   }

   public abstract void u(DocumentEvent var1);

   protected String Y(DocumentEvent var1) {
      Document var2 = var1.getDocument();

      String var3;
      try {
         var3 = var2.getText(0, var2.getLength());
      } catch (BadLocationException var5) {
         var3 = null;
      }

      return var3;
   }
}





