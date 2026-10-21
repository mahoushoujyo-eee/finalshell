package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class BG implements Runnable {
   @Override
   public void run() {
      Registry.emptyArgs();
      long var1 = 498587469900677540L;
      Ref.h2(498587469900677540L, var1);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw new RuntimeException(var3.getTargetException());
      }
   }
}





