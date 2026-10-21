package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.YQ;
import java.lang.reflect.InvocationTargetException;

public class T implements Runnable {
   public final YQ c;

   public T(YQ var1) {
      this.c = var1;
   }

   @Override
   public void run() {
      Object var1 = 200713337626158409L;
      Ref.g(200713337626158409L, var1);
      Object[] var10002 = Registry.packArgs(Registry.lookupField(205985593854165162L).get(null));
      long var4 = 283179149030029231L;
      Object[] var3 = var10002;
      Ref.h(283179149030029231L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





