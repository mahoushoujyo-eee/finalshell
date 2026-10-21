package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.UpdateFrame;
import java.lang.reflect.InvocationTargetException;

public class J3 implements Runnable {
   final UpdateFrame J;

   J3(UpdateFrame var1) {
      this.J = var1;
   }

   @Override
   public void run() {
      Object var1 = 523116530769986235L;
      Ref.g(523116530769986235L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 558988037493500446L;
      Object[] var3 = var10002;
      Ref.h(558988037493500446L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





