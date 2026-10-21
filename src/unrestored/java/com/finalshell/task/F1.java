package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Ux4;
import java.lang.reflect.InvocationTargetException;

public class F1 implements Runnable {
   public final Ux4 H;

   public F1(Ux4 var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      Object var1 = 133013519344596583L;
      Ref.g(133013519344596583L, var1);
      Object var3 = 275353081768743222L;
      Ref.g(275353081768743222L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 119751058421524022L;
      Object[] var5 = var10003;
      Ref.h(119751058421524022L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }
}





