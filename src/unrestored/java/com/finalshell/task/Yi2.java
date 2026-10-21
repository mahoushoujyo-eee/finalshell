package com.finalshell.task;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Yi2 implements Runnable {
   public final T32 n;

   public Yi2(T32 var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      Object var1 = 509013253342387530L;
      Ref.g(509013253342387530L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 472356858502363527L;
      Object[] var3 = var10002;
      Ref.h(472356858502363527L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





