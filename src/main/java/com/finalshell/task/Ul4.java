package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.YQ;
import java.lang.reflect.InvocationTargetException;

public class Ul4 implements Runnable {
   final YQ U;

   Ul4(YQ var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      Object var1 = 127602324048157648L;
      Ref.g(127602324048157648L, var1);
      Object[] var10002 = Registry.packArgs(Registry.lookupField(396737168650694975L).get(null));
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





