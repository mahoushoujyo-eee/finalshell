package com.finalshell.task;

import com.finalshell.core.ProcessMonitorService;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Yl2 implements Runnable {
   public final ProcessMonitorService y;

   public Yl2(ProcessMonitorService var1) {
      this.y = var1;
   }

   @Override
   public void run() {
      Object var1 = 237060045084663859L;
      Ref.g(237060045084663859L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 504673861175161696L;
      Object[] var3 = var10002;
      Ref.h(504673861175161696L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





