package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class OU implements Runnable {
   @Override
   public void run() {
      Registry.lookupField(525809009753943217L).get(null);
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 484337060253588099L;
      Object[] var1 = var10001;
      Ref.h(484337060253588099L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





