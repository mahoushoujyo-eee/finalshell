package com.finalshell.task;

import com.finalshell.core.RemoteProcessManager;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class BD implements Runnable {
   public final RemoteProcessManager l;

   public BD(RemoteProcessManager var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Object var1 = 384746094250424954L;
      Ref.g(384746094250424954L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 574315200777470251L;
      Object[] var3 = var10002;
      Ref.h(574315200777470251L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





