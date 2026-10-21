package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;

public class Fe2 implements Runnable {
   public final Window A;
   public static long a;

   public Fe2(Window var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      com.finalshell.ui.panel.Ky4[] var10000 = YT3_2.c();
      int var2 = 0;
      com.finalshell.ui.panel.Ky4[] var1 = var10000;

      while (var2 < 1) {
         Object var4 = 195849108616798451L;
         Registry.packArgs(Ref.g(195849108616798451L, var4));
         long var6 = 219945543022327308L;
         Ref.h2(219945543022327308L, var6);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw new RuntimeException(var9.getTargetException());
         }

         try {
            Thread.sleep(a);
         } catch (InterruptedException var8) {
            var8.printStackTrace();
         }

         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3782035904469922761L;
      long var10002 = 3782035904469922811L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





