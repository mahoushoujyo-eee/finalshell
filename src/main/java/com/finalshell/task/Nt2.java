package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Cc2;
import java.lang.reflect.InvocationTargetException;

public class Nt2 implements Runnable {
   public final Cc2 x;

   public Nt2(Cc2 var1) {
      this.x = var1;
   }

   @Override
   public void run() {
      Object var1 = 333864974779810853L;
      Ref.g(333864974779810853L, var1);
      Object[] var10002 = Registry.packArgs(Registry.lookupField(544011674795306049L).get(null));
      long var4 = 525365375200145529L;
      Object[] var3 = var10002;
      Ref.h(525365375200145529L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





