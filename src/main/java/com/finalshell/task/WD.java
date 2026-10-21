package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Cc2;
import java.lang.reflect.InvocationTargetException;

public class WD implements Runnable {
   public final Cc2 O;

   public WD(Cc2 var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Object var1 = 547342694708100733L;
      Ref.g(547342694708100733L, var1);
      Object[] var10002 = Registry.packArgs(Registry.lookupField(396737168650694975L).get(null));
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





