package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Ya4;
import java.lang.reflect.InvocationTargetException;

public class T4 implements Runnable {
   final Ya4 G;

   T4(Ya4 var1) {
      this.G = var1;
   }

   @Override
   public void run() {
      Object var1 = 514798711085199978L;
      Ref.g(514798711085199978L, var1);
      Object var3 = 544896587708147604L;
      Ref.g(544896587708147604L, var3);
      Object var5 = 355468840123996031L;
      Registry.packArgs(Ref.g(355468840123996031L, var5));
      long var7 = 264379078899316637L;
      Ref.h2(264379078899316637L, var7);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }
}





