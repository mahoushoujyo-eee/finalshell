package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.ImportPrivateKeyDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ov2 implements ActionListener {
   public final ImportPrivateKeyDialog b;

   public Ov2(ImportPrivateKeyDialog var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 365395363090493628L;
      ((ImportPrivateKeyDialog)Ref.g(365395363090493628L, var2)).setVisible(false);
   }
}





