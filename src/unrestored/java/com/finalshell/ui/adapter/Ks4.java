package com.finalshell.ui.adapter;

import com.finalshell.reflect.Ref;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class Ks4 extends AbstractAction {
   public UndoManager b;

   public Ks4(UndoManager var1) {
      long var3 = 124256119779299785L;
      Ref.s(124256119779299785L, var1, var3);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         Object var3 = 124256119779299785L;
         ((UndoManager)Ref.g(124256119779299785L, var3)).undo();
      } catch (CannotUndoException var5) {
         Toolkit.getDefaultToolkit().beep();
      }
   }
}





