package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class ZQ implements Runnable {
   final Ul2 A;

   ZQ(Ul2 var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      Object var1 = 305774498485143426L;
      Ref.g(305774498485143426L, var1);
      Object var3 = 393801433552238231L;
      Ref.g(393801433552238231L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 565917871429439956L;
      Object[] var5 = var10003;
      Ref.h(565917871429439956L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





