package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.EditProxyServerDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FP3 implements ActionListener {
   public final EditProxyServerDialog N;

   public FP3(EditProxyServerDialog var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 333741744921910983L;
      ((EditProxyServerDialog)Ref.g(333741744921910983L, var2)).setVisible(false);
   }
}





