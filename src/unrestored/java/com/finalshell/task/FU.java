package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class FU implements Runnable {
   public final YT3_2 K;

   public FU(YT3_2 var1) {
      this.K = var1;
   }

   @Override
   public void run() {
      Registry.emptyArgs();
      long var1 = 579488513565403011L;
      Ref.h2(579488513565403011L, var1);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw new RuntimeException(var3.getTargetException());
      }
   }
}





