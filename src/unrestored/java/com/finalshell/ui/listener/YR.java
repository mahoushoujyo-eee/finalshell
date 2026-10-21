package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.LoginDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class YR implements ActionListener {
   public final LoginDialog Y;

   public YR(LoginDialog var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 621865693838335662L;
      Ref.g(621865693838335662L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 335130564152588696L;
      Object[] var4 = var10002;
      Ref.h(335130564152588696L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





