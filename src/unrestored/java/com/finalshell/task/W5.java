package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.FM;
import java.lang.reflect.InvocationTargetException;

public class W5 implements Runnable {
   public final FM z;

   public W5(FM var1) {
      this.z = var1;
   }

   @Override
   public void run() {
      Object var1 = 266191841177162341L;
      Ref.g(266191841177162341L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 189986363113311747L;
      Object[] var3 = var10002;
      Ref.h(189986363113311747L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





