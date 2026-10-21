package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.F8;
import java.lang.reflect.InvocationTargetException;

public class Bj2 implements Runnable {
   public final F8 A;

   public Bj2(F8 var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      Object var1 = 345845810532294667L;
      Ref.g(345845810532294667L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 612305338479149688L;
      Object[] var3 = var10002;
      Ref.h(612305338479149688L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





