package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.EditDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cl2 implements ActionListener {
   public final EditDialog R;

   public Cl2(EditDialog var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 177594495535080808L;
      ((EditDialog)Ref.g(177594495535080808L, var2)).setVisible(false);
   }
}





