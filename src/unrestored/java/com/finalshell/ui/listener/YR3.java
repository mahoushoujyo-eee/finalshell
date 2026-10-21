package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.EditorSelectionDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YR3 implements ActionListener {
   public final EditorSelectionDialog q;

   public YR3(EditorSelectionDialog var1) {
      this.q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 137469915231392771L;
      Ref.setInt(633665384138343849L, Ref.g(137469915231392771L, var2), ((Integer)Ref.g(356419212223958784L, null)).intValue());
      Object var4 = 137469915231392771L;
      ((EditorSelectionDialog)Ref.g(137469915231392771L, var4)).setVisible(false);
   }
}





