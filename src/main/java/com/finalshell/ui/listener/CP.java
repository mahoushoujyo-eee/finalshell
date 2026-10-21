package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.FF3;
import com.finalshell.ui.panel.LogPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class CP implements ActionListener {
   final LogPanel W;

   CP(LogPanel var1) {
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new FF3(this));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





