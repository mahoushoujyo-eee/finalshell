package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.OR3;
import java.lang.reflect.InvocationTargetException;

public class Gp2 implements Runnable {
   public final OR3 j;

   public Gp2(OR3 var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      Object var1 = 594954614017090905L;
      Ref.g(594954614017090905L, var1);
      Object var3 = 368254581323746541L;
      Ref.g(368254581323746541L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 409855906395534563L;
      Object[] var5 = var10003;
      Ref.h(409855906395534563L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }
}





