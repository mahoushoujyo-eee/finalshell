package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.PasswordDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Y implements ActionListener {
   final PasswordDialog Y;

   Y(PasswordDialog var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 576251462374426065L;
      ((PasswordDialog)Ref.g(576251462374426065L, var2)).setVisible(false);
   }
}





