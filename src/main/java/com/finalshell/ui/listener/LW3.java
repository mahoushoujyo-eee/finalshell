package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Km4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class LW3 implements ActionListener {
   final Km4 V;

   LW3(Km4 var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 415409921904330788L;
      Ref.g(415409921904330788L, var2);
      Object[] var10002 = Registry.packArgs(false);
      long var5 = 433716955203722428L;
      Object[] var4 = var10002;
      Ref.h(433716955203722428L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





