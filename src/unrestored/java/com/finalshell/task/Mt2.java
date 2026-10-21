package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Mt2 implements Runnable {
   public final XW V;

   public Mt2(XW var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      try {
         Object var2 = 610634713269186354L;
         Ref.g(610634713269186354L, var2);
         Object var4 = 157659510478786273L;
         Ref.g(157659510478786273L, var4);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 265460201950227144L;
         Object[] var6 = var10003;
         Ref.h(265460201950227144L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw new RuntimeException(var8.getTargetException());
         }
      } catch (Exception var9) {
      }
   }
}





