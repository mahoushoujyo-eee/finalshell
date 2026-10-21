package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class D1 implements Runnable {
   public final Ul2 W;

   public D1(Ul2 var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      Object var1 = 129158354330092400L;
      Ref.g(129158354330092400L, var1);
      Object var3 = 393801433552238231L;
      Ref.g(393801433552238231L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 412779964454069832L;
      Object[] var5 = var10003;
      Ref.h(412779964454069832L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





