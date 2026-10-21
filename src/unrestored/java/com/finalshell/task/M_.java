package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Cc2;
import java.lang.reflect.InvocationTargetException;

public class M_ implements Runnable {
   public final Cc2 A;

   public M_(Cc2 var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      Object var1 = 166464146926802718L;
      Ref.g(166464146926802718L, var1);
      Object[] var10002 = Registry.packArgs(Ref.g(205985593854165162L, null));
      long var4 = 525365375200145529L;
      Object[] var3 = var10002;
      Ref.h(525365375200145529L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





