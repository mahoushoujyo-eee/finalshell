package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.UpdateFrame;
import java.lang.reflect.InvocationTargetException;

public class M7 implements Runnable {
   public final UpdateFrame P;

   public M7(UpdateFrame var1) {
      this.P = var1;
   }

   @Override
   public void run() {
      Object var1 = 330322124816829715L;
      Ref.g(330322124816829715L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 611344775103445562L;
      Object[] var3 = var10002;
      Ref.h(611344775103445562L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





