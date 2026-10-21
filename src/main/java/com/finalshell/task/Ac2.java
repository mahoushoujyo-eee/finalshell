package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Y3;
import java.lang.reflect.InvocationTargetException;

public class Ac2 implements Runnable {
   final Y3 e;

   Ac2(Y3 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      Object var1 = 575424184787798525L;
      Ref.g(575424184787798525L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 196680627597967655L;
      Object[] var3 = var10002;
      Ref.h(196680627597967655L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





