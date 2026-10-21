package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Aa2;
import java.lang.reflect.InvocationTargetException;

public class D32 implements Runnable {
   public final Aa2 Q;

   public D32(Aa2 var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      Object var1 = 439663471776631349L;
      Ref.g(439663471776631349L, var1);
      Object var3 = 362499978219265933L;
      Ref.g(362499978219265933L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 318198075729798656L;
      Object[] var5 = var10003;
      Ref.h(318198075729798656L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





