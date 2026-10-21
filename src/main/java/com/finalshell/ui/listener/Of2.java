package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ExitFullScreenPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Of2 implements ActionListener {
   public final ExitFullScreenPanel L;

   public Of2(ExitFullScreenPanel var1) {
      this.L = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 184522589415808242L;
      Ref.g(184522589415808242L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 387302395567244859L;
      Object[] var4 = var10002;
      Ref.h(387302395567244859L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





