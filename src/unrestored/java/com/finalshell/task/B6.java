package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Fx2;
import java.lang.reflect.InvocationTargetException;

public class B6 implements Runnable {
   public final Fx2 Y;

   public B6(Fx2 var1) {
      this.Y = var1;
   }

   @Override
   public void run() {
      Object var1 = 170510718350934630L;
      Ref.g(170510718350934630L, var1);
      Object var3 = 308244256405363848L;
      Ref.g(308244256405363848L, var3);
      Object var5 = 215526989813745242L;
      Ref.g(215526989813745242L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 373868045552747003L;
      Object[] var7 = var10004;
      Ref.h(373868045552747003L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw new RuntimeException(var9.getTargetException());
      }
   }
}





