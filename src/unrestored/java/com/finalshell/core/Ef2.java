package com.finalshell.core;

import com.finalshell.ui.panel.KD3;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class Ef2 extends TransferHandler {
   public final KD3 O;

   public Ef2(KD3 var1) {
      this.O = var1;
   }

   @Override
   public int getSourceActions(JComponent var1) {
      return 1;
   }

   @Override
   public Transferable createTransferable(JComponent var1) {
      return KD3.E(this.O).getSelectionCount() > 0 ? new StringSelection(KD3.E(this.O).N().getAbsolutePath()) : null;
   }
}





