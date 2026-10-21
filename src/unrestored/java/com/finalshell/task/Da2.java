package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel;
import java.lang.reflect.InvocationTargetException;

public class Da2 implements Runnable {
   public final RouteTracePanel y;

   public Da2(RouteTracePanel var1) {
      this.y = var1;
   }

   @Override
   public void run() {
      Object var1 = 594460525817753444L;
      Ref.g(594460525817753444L, var1);
      Object var3 = 498715864659540734L;
      Ref.g(498715864659540734L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 442031661173946549L;
      Object[] var5 = var10003;
      Ref.h(442031661173946549L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }
}





