package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Backspace;
import java.lang.reflect.InvocationTargetException;

public class Tp2 implements Runnable {
   public final Backspace d;

   public Tp2(Backspace var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      Object var1 = 306481791184023029L;
      Ref.g(306481791184023029L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 496821856781947383L;
      Object[] var3 = var10002;
      Ref.h(496821856781947383L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





