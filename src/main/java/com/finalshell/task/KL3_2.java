package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.F5;
import java.lang.reflect.InvocationTargetException;

public class KL3_2 implements Runnable {
   public final F5 X;

   public KL3_2(F5 var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      Object var1 = 351977148881061934L;
      Ref.g(351977148881061934L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 625942730809122781L;
      Object[] var3 = var10002;
      Ref.h(625942730809122781L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





