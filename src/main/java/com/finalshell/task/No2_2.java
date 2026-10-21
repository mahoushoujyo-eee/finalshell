package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.U;
import java.lang.reflect.InvocationTargetException;

public class No2_2 implements Runnable {
   final U i;

   No2_2(U var1) {
      this.i = var1;
   }

   @Override
   public void run() {
      Object var1 = 565460019918896506L;
      Ref.g(565460019918896506L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 399329213267848661L;
      Object[] var3 = var10002;
      Ref.h(399329213267848661L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





