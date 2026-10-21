package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.ApplyToFileAndDirDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KK3 implements ActionListener {
   final ApplyToFileAndDirDialog b;

   KK3(ApplyToFileAndDirDialog var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 604264262482250447L;
      ((ApplyToFileAndDirDialog)Ref.g(604264262482250447L, var2)).setVisible(false);
   }
}





