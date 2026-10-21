package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Ff2;
import java.lang.reflect.InvocationTargetException;

public class D02 implements Runnable {
   public final Ff2 s;

   public D02(Ff2 var1) {
      this.s = var1;
   }

   @Override
   public void run() {
      Object var1 = 285773678609041001L;
      Ref.g(285773678609041001L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 540679430908090072L;
      Object[] var3 = var10002;
      Ref.h(540679430908090072L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





