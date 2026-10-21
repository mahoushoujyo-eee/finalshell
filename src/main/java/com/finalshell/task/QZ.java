package com.finalshell.task;

import com.finalshell.core.Ca4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class QZ implements Runnable {
   final Ca4 w;

   QZ(Ca4 var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      Object var1 = 510787872752501177L;
      Ref.g(510787872752501177L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 283552467042563158L;
      Object[] var3 = var10002;
      Ref.h(283552467042563158L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





