package com.finalshell.task;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class AC implements Runnable {
   public final Km2 i;

   public AC(Km2 var1) {
      this.i = var1;
   }

   @Override
   public void run() {
      Object var1 = 132406367702544046L;
      Ref.g(132406367702544046L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 258105725179591793L;
      Object[] var3 = var10002;
      Ref.h(258105725179591793L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





