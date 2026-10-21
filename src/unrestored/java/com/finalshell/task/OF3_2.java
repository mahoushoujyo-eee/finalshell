package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class OF3_2 implements Runnable {
   public final YT3_2 E;

   public OF3_2(YT3_2 var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Object var1 = 422887422003221225L;
      Ref.g(422887422003221225L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 413194456365551229L;
      Object[] var3 = var10002;
      Ref.h(413194456365551229L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





