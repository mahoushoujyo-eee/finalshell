package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Oj4 implements Runnable {
   public final FA Q;

   public Oj4(FA var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      Object var1 = 314187964346221249L;
      Ref.g(314187964346221249L, var1);
      Object var3 = 591504459344043173L;
      Ref.g(591504459344043173L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 358704185326413010L;
      Object[] var5 = var10003;
      Ref.h(358704185326413010L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





