package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.YQ;
import java.lang.reflect.InvocationTargetException;

public class YC3 implements Runnable {
   public final YQ e;

   public YC3(YQ var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      Object var1 = 145158344851636951L;
      Ref.g(145158344851636951L, var1);
      Object[] var10002 = Registry.packArgs(Ref.g(544011674795306049L, null));
      long var4 = 283179149030029231L;
      Object[] var3 = var10002;
      Ref.h(283179149030029231L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





