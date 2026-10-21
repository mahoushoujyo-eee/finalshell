package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.U__2;
import java.lang.reflect.InvocationTargetException;

public class Xn2 implements Runnable {
   public final U__2 I;

   public Xn2(U__2 var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      Object var1 = 276732548056820562L;
      Ref.g(276732548056820562L, var1);
      Object var3 = 287611408882635703L;
      Ref.g(287611408882635703L, var3);
      Object[] var10003 = Registry.packArgs(Registry.lookupField(149407827136588388L).getInt(null), true);
      long var6 = 547792367998174127L;
      Object[] var5 = var10003;
      Ref.h(547792367998174127L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





