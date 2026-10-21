package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.UpdateFrame;
import java.lang.reflect.InvocationTargetException;

public class Kx2 implements Runnable {
   public final UpdateFrame E;

   public Kx2(UpdateFrame var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Object var1 = 576526388784622692L;
      Ref.g(576526388784622692L, var1);
      Object var3 = 215526989813745242L;
      Ref.g(215526989813745242L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 373868045552747003L;
      Object[] var5 = var10003;
      Ref.h(373868045552747003L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





