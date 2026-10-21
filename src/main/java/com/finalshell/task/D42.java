package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class D42 implements Runnable {
   public final YT3_2 t;

   public D42(YT3_2 var1) {
      this.t = var1;
   }

   @Override
   public void run() {
      Object var1 = 581600672436814503L;
      Ref.g(581600672436814503L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 412189052060962364L;
      Object[] var3 = var10002;
      Ref.h(412189052060962364L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





