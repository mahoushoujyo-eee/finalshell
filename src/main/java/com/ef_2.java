package com;

import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

class Ef_2 extends TransferHandler {
   final com.kD_3 O;

   Ef_2(com.kD_3 var1) {
      this.O = var1;
   }

   @Override
   public int getSourceActions(JComponent var1) {
      return 1;
   }

   @Override
   protected Transferable createTransferable(JComponent var1) {
      return com.kD_3.E(this.O).getSelectionCount() > 0 ? new StringSelection(com.kD_3.E(this.O).N().getAbsolutePath()) : null;
   }
}





