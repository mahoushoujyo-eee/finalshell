package com.finalshell.task;

import com.finalshell.core.YI;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Aw2 implements Runnable {
   public final YI R;

   public Aw2(YI var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      try {
         Object var2 = 454074474896944253L;
         Ref.g(454074474896944253L, var2);
         Object var4 = 275061180115109797L;
         Ref.g(275061180115109797L, var4);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 554677732047204965L;
         Object[] var6 = var10003;
         Ref.h(554677732047204965L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw new RuntimeException(var8.getTargetException());
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }
}





