package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.EditTunnelDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Op4 implements ActionListener {
   final EditTunnelDialog k;

   Op4(EditTunnelDialog var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 507430026907972008L;
      Ref.g(507430026907972008L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 470182363312266410L;
      Object[] var4 = var10002;
      Ref.h(470182363312266410L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





