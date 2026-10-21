package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.LoginDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class O7_2 implements ActionListener {
   public final LoginDialog U;

   public O7_2(LoginDialog var1) {
      this.U = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 524473246138891048L;
      ((LoginDialog)Ref.g(524473246138891048L, var2)).setVisible(false);
   }
}





