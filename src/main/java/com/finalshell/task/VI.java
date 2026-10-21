package com.finalshell.task;

import com.finalshell.core.MT;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class VI implements Runnable {
   final MT h;

   VI(MT var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      Object var1 = 549431568394920065L;
      Ref.g(549431568394920065L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 317796404524602366L;
      Object[] var3 = var10002;
      Ref.h(317796404524602366L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





