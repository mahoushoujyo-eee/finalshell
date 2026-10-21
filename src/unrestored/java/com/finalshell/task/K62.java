package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Cc2;
import java.lang.reflect.InvocationTargetException;

public class K62 implements Runnable {
   public final Cc2 c;

   public K62(Cc2 var1) {
      this.c = var1;
   }

   @Override
   public void run() {
      Object var1 = 299536276505910457L;
      Ref.g(299536276505910457L, var1);
      Object[] var10002 = Registry.packArgs(Ref.g(449769185297014212L, null));
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





