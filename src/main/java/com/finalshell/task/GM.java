package com.finalshell.task;

import com.finalshell.core.Ca4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class GM implements Runnable {
   public final Ca4 k;
   public static long a;

   public GM(Ca4 var1) {
      this.k = var1;
   }

   @Override
   public void run() {
      while (true) {
         Object var2 = 458098468214047198L;
         Ref.g(458098468214047198L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 475862018592834069L;
         Object[] var4 = var10002;
         Ref.h(475862018592834069L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         try {
            Thread.sleep(a);
         } catch (InterruptedException var6) {
            var6.printStackTrace();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3302110406838298373L;
      long var10002 = 3302110406838298465L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





