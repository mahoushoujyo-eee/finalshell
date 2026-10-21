package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.BV;
import java.lang.reflect.InvocationTargetException;

public class Dr2 implements Runnable {
   public final String o;
   public final BV b;

   public Dr2(BV var1, String var2) {
      this.b = var1;
      this.o = var2;
   }

   @Override
   public void run() {
      Object var1 = 426764604080246614L;
      Ref.g(426764604080246614L, var1);
      Object var3 = 300671885637670350L;
      Ref.g(300671885637670350L, var3);
      Object var5 = 353262325720269499L;
      Object[] var10004 = Registry.packArgs(Ref.g(353262325720269499L, var5), true, true);
      long var8 = 324338769529465951L;
      Object[] var7 = var10004;
      Ref.h(324338769529465951L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }
}





