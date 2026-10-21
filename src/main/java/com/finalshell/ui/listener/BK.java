package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

public class BK extends WindowAdapter {
   public final com.finalshell.ui.frame.U h;

   public BK(com.finalshell.ui.frame.U var1) {
      this.h = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      Object var2 = 264195371654050931L;
      Ref.g(264195371654050931L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 445366294732630642L;
      Object[] var4 = var10002;
      Ref.h(445366294732630642L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





