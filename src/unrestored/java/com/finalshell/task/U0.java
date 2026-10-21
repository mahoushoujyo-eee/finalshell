package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.TF;
import java.lang.reflect.InvocationTargetException;

public class U0 implements Runnable {
   public final TF L;

   public U0(TF var1) {
      this.L = var1;
   }

   @Override
   public void run() {
      Object var1 = 206736569318369403L;
      Ref.g(206736569318369403L, var1);
      Object var3 = 152418249076262564L;
      Ref.g(152418249076262564L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 562927769813494074L;
      Object[] var5 = var10003;
      Ref.h(562927769813494074L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }
}





