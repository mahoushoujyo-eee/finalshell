package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.YQ;
import java.lang.reflect.InvocationTargetException;

public class CD implements Runnable {
   public final YQ M;

   public CD(YQ var1) {
      this.M = var1;
   }

   @Override
   public void run() {
      Object var1 = 189300561785992095L;
      Ref.g(189300561785992095L, var1);
      Object[] var10002 = Registry.packArgs(Ref.g(449769185297014212L, null));
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





