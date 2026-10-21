package com.finalshell.task;

import com.finalshell.core.RemoteProcessManager;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class NS implements Runnable {
   public final RemoteProcessManager m;

   public NS(RemoteProcessManager var1) {
      this.m = var1;
   }

   @Override
   public void run() {
      Object var1 = 270290619286314259L;
      Ref.g(270290619286314259L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 516570048275578990L;
      Object[] var3 = var10002;
      Ref.h(516570048275578990L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





