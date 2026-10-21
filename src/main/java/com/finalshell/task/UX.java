package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class UX implements Runnable {
   public static long a;

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }

         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10001 = Registry.packArgs(new Jw2(this));
         long var3 = 434592463220957006L;
         Object[] var2 = var10001;
         Ref.h(434592463220957006L, var2, var3);

         try {
            ;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8196352957545191836L;
      long var10002 = 8196352957545189924L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





