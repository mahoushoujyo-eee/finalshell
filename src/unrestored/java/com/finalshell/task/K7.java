package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class K7 implements Runnable {
   public final YT3_2 p;

   public K7(YT3_2 var1) {
      this.p = var1;
   }

   @Override
   public void run() {
      Object var1 = 224900151959412301L;
      Ref.g(224900151959412301L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 398517794264889337L;
      Object[] var3 = var10002;
      Ref.h(398517794264889337L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





