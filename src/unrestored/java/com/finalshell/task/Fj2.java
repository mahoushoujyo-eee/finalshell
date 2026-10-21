package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import java.lang.reflect.InvocationTargetException;

public class Fj2 implements Runnable {
   public final MainFrame q;

   public Fj2(MainFrame var1) {
      this.q = var1;
   }

   @Override
   public void run() {
      Object var1 = 572988005050429118L;
      Ref.g(572988005050429118L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 573491141587592431L;
      Object[] var3 = var10002;
      Ref.h(573491141587592431L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





