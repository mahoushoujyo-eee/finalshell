package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.lang.reflect.InvocationTargetException;

public class Jp2 implements Runnable {
   final ShowDeletedPanel L;

   Jp2(ShowDeletedPanel var1) {
      this.L = var1;
   }

   @Override
   public void run() {
      Object var1 = 362723729871172092L;
      Ref.g(362723729871172092L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 595201858718185127L;
      Object[] var3 = var10002;
      Ref.h(595201858718185127L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





