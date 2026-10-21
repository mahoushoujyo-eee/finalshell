package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.EditProxyServerDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Us4 implements ActionListener {
   final EditProxyServerDialog f;

   Us4(EditProxyServerDialog var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 320252036984788391L;
      Ref.g(320252036984788391L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 186252164537170718L;
      Object[] var4 = var10002;
      Ref.h(186252164537170718L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





