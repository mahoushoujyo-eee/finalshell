package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel;
import java.lang.reflect.InvocationTargetException;

public class UM implements Runnable {
   public final RouteTracePanel w;

   public UM(RouteTracePanel var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      Object var1 = 432539051267499093L;
      Ref.g(432539051267499093L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 503996986995373182L;
      Object[] var3 = var10002;
      Ref.h(503996986995373182L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





