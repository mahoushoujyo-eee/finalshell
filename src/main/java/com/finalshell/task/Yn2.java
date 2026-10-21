package com.finalshell.task;

import com.finalshell.core.Ln2;
import com.finalshell.core.Ln4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Yn2 implements Runnable {
   public final Ln2 N;
   public static long a;

   public Yn2(Ln2 var1) {
      this.N = var1;
   }

   @Override
   public void run() {
      int var14;
      boolean var1 = Ln4_2.R();
      Object var3 = 129595593052585232L;
      Ref.g(129595593052585232L, var3);
      Object var10002 = Registry.emptyArgs();
      long var6 = 349012733953542138L;
      Object var5 = var10002;
      var10002 = Ref.h(349012733953542138L, var5, var6);

      try {
         var14 = ((Boolean)var10002) ? 1 : 0;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      if (!var1) {
         if (var14 == 0) {
            return;
         }

         var14 = (int)a;
      }

      int var2 = var14;
      Object var7 = 129595593052585232L;
      Ref.g(129595593052585232L, var7);
      Object[] var10004 = Registry.packArgs(var2);
      long var10 = 278542859830713193L;
      Object[] var9 = var10004;
      Ref.h(278542859830713193L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4470594266267196051L;
      long var10002 = -8297652392963248221L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





