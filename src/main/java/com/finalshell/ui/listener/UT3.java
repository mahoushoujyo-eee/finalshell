package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.SetByKeyboardDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UT3 implements ActionListener {
   final SetByKeyboardDialog T;

   UT3(SetByKeyboardDialog var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 418345723542745387L;
      ((SetByKeyboardDialog)Ref.g(418345723542745387L, var2)).setVisible(false);
   }
}





