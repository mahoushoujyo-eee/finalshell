package com.finalshell.task;

import com.finalshell.core.YI;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class BI implements Runnable {
   public final YI S;
   public static long a;

   public BI(YI var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(a);
      } catch (InterruptedException var13) {
         var13.printStackTrace();
      }

      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 377280722715900564L;
      Object[] var4 = var10002;
      Ref.h(377280722715900564L, var4, var5);
      Object var6 = 418950108620675427L;
      Ref.g(418950108620675427L, var6);
      Object var8 = 377371690155578360L;
      Object[] var10005 = Registry.packArgs(Ref.g(377371690155578360L, var8));
      long var11 = 507595107774603013L;
      Object[] var10 = var10005;
      Ref.h(507595107774603013L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw new RuntimeException(var12.getTargetException());
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7981388552316499215L;
      long var10002 = 7981388552316498979L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





