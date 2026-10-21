package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Cp2;
import java.lang.reflect.InvocationTargetException;

public class DV3 implements Runnable {
   public final Cp2 U;

   public DV3(Cp2 var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      Object var1 = 536100890810317032L;
      Ref.g(536100890810317032L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 619034462121735526L;
      Object[] var3 = var10002;
      Ref.h(619034462121735526L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





