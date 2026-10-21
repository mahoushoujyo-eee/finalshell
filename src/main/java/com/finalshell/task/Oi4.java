package com.finalshell.task;

import com.finalshell.core.ProcessMonitorService;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Oi4 implements Runnable {
   public final ProcessMonitorService X;

   public Oi4(ProcessMonitorService var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      Object var1 = 255294524467463739L;
      Ref.g(255294524467463739L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 619546342381877635L;
      Object[] var3 = var10002;
      Ref.h(619546342381877635L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





