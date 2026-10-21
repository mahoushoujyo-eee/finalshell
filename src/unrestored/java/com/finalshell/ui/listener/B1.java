package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.EditTunnelDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B1 implements ActionListener {
   public final EditTunnelDialog z;

   public B1(EditTunnelDialog var1) {
      this.z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 346888946081107416L;
      ((EditTunnelDialog)Ref.g(346888946081107416L, var2)).setVisible(false);
   }
}





