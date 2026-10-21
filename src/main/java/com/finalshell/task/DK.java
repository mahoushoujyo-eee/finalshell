package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import java.lang.reflect.InvocationTargetException;

public class DK implements Runnable {
   public final AM q;

   public DK(AM var1) {
      this.q = var1;
   }

   @Override
   public void run() {
      Object var1 = 491215108764495688L;
      Ref.g(491215108764495688L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 252467289908772906L;
      Object[] var3 = var10002;
      Ref.h(252467289908772906L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





