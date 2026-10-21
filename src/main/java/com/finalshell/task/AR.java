package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Aa2;
import java.lang.reflect.InvocationTargetException;

public class AR implements Runnable {
   final Aa2 M;

   AR(Aa2 var1) {
      this.M = var1;
   }

   @Override
   public void run() {
      Object var1 = 196150108480638557L;
      Ref.g(196150108480638557L, var1);
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





