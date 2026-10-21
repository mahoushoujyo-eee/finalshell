package com.finalshell.task;

import com.finalshell.core.ProcessMonitorService;
import com.finalshell.core.KV;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class JV implements Runnable {
   public final ProcessMonitorService y;

   public JV(ProcessMonitorService var1) {
      this.y = var1;
   }

   @Override
   public void run() {
      String[] var1 = KV.b$arrString();
      Object var2 = 425507471413967389L;
      ProcessMonitorService var10001 = (ProcessMonitorService)Ref.g(425507471413967389L, var2);
      if (var1 == null) {
         if (!Registry.lookupField(288681454708139251L).getBoolean(var10001)) {
            return;
         }

         Object var4 = 425507471413967389L;
         ProcessMonitorService var10002 = (ProcessMonitorService)Ref.g(425507471413967389L, var4);
      }

      Object[] var9 = Registry.emptyArgs();
      long var7 = 384639163675728627L;
      Object[] var6 = var9;
      Ref.h(384639163675728627L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





