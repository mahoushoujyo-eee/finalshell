package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.RenameFolderDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H implements ActionListener {
   public final RenameFolderDialog f;

   public H(RenameFolderDialog var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 447500719249879950L;
      ((RenameFolderDialog)Ref.g(447500719249879950L, var2)).setVisible(false);
   }
}





