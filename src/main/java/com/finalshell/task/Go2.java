package com.finalshell.task;

import com.finalshell.core.LF3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Go2 implements Runnable {
   final LF3_2 J;

   Go2(LF3_2 var1) {
      this.J = var1;
   }

   @Override
   public void run() {
      try {
         Object var2 = 194417552812168696L;
         Thread.sleep((long)Registry.lookupField(293577005979220571L).getInt(Ref.g(194417552812168696L, var2)));
      } catch (InterruptedException var11) {
         var11.printStackTrace();
      }

      Object var4 = 194417552812168696L;
      Ref.g(194417552812168696L, var4);
      Object var6 = 549777208306704057L;
      Ref.g(549777208306704057L, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 335950632529437253L;
      Object[] var8 = var10003;
      Ref.h(335950632529437253L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





