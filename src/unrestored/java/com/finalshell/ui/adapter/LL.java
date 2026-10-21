package com.finalshell.ui.adapter;

import com.finalshell.reflect.Ref;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

public class LL extends AbstractAction {
   public UndoManager H;

   public LL(UndoManager var1) {
      long var3 = 336675141547947742L;
      Ref.s(336675141547947742L, var1, var3);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         Object var3 = 336675141547947742L;
         ((UndoManager)Ref.g(336675141547947742L, var3)).redo();
      } catch (CannotRedoException var5) {
         Toolkit.getDefaultToolkit().beep();
      }
   }
}





