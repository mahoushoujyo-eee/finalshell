package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.PortForwardEditDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cl2 implements ActionListener {
   public final PortForwardEditDialog R;

   public Cl2(PortForwardEditDialog var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 177594495535080808L;
      ((PortForwardEditDialog)Ref.g(177594495535080808L, var2)).setVisible(false);
   }
}





