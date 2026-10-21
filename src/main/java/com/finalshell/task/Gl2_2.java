package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Gl2_2 implements Runnable {
   public final DJ3 B;

   public Gl2_2(DJ3 var1) {
      this.B = var1;
   }

   @Override
   public void run() {
      Object var1 = 573928442214264835L;
      Ref.g(573928442214264835L, var1);
      Object var3 = 253496364775430961L;
      Ref.g(253496364775430961L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 250498425434992262L;
      Object[] var5 = var10003;
      Ref.h(250498425434992262L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





