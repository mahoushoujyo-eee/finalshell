package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Kb2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class N_ implements ActionListener {
   final Kb2 C;

   N_(Kb2 var1) {
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 554193528273869769L;
      Ref.g(554193528273869769L, var2);
      Object[] var10002 = Registry.packArgs(false);
      long var5 = 583190785470630532L;
      Object[] var4 = var10002;
      Ref.h(583190785470630532L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





