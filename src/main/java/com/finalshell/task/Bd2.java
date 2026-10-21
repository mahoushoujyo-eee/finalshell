package com.finalshell.task;

import com.finalshell.core.Fo4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.U;
import java.lang.reflect.InvocationTargetException;

public class Bd2 implements Runnable {
   public final U X;
   public final Fo4 F;

   public Bd2(Fo4 var1, U var2) {
      this.F = var1;
      this.X = var2;
   }

   @Override
   public void run() {
      Object var1 = 503352577815543664L;
      Ref.g(503352577815543664L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 176356587927714575L;
      Object[] var3 = var10002;
      Ref.h(176356587927714575L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





