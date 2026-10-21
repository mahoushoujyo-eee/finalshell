package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class C1 implements Runnable {
   final YT3_2 Q;

   C1(YT3_2 var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      Registry.emptyArgs();
      long var1 = 547966988844307959L;
      Ref.h2(547966988844307959L, var1);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





