package com.finalshell.task;

import com.finalshell.core.D82_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Ue2 extends Thread {
   public final D82_2 k;
   public static long a;

   public Ue2(D82_2 var1) {
      this.k = var1;
   }

   @Override
   public void run() {
      while (true) {
         Object var2 = 204787616236471256L;
         Ref.g(204787616236471256L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 445643277824358917L;
         Object[] var4 = var10002;
         Ref.h(445643277824358917L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw new RuntimeException(var7.getTargetException());
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
      long var0 = 2203987499599607839L;
      long var10002 = 2203987499599607853L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





