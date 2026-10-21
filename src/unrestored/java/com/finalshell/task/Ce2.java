package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Ce2 implements Runnable {
   @Override
   public void run() {
      Ref.g(525809009753943217L, null);
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 580193852202659773L;
      Object[] var1 = var10001;
      Ref.h(580193852202659773L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw new RuntimeException(var3.getTargetException());
      }
   }
}





