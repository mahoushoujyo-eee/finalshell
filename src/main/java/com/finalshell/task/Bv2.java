package com.finalshell.task;

import com.finalshell.core.Ty2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Bv2 implements Runnable {
   public final Ty2 V;

   public Bv2(Ty2 var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      Object var1 = 359898254707283044L;
      Registry.packArgs(Ref.g(359898254707283044L, var1));
      long var3 = 395648233250236832L;
      Ref.h2(395648233250236832L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





