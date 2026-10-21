package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CL;
import java.lang.reflect.InvocationTargetException;

public class FZ3 implements Runnable {
   public final CL F;

   public FZ3(CL var1) {
      this.F = var1;
   }

   @Override
   public void run() {
      Object var1 = 513583176910431633L;
      Ref.g(513583176910431633L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 301040545199815839L;
      Object[] var3 = var10002;
      Ref.h(301040545199815839L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





