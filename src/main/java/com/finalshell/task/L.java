package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Tv2;
import java.lang.reflect.InvocationTargetException;

public class L implements Runnable {
   final Tv2 U;
   public static long a;

   L(Tv2 var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var7) {
            var7.printStackTrace();
         }

         Object var2 = 312739476035184007L;
         Ref.g(312739476035184007L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 413561020881451532L;
         Object[] var4 = var10002;
         Ref.h(413561020881451532L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8467135376623373278L;
      long var10002 = 8467135376623372342L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





