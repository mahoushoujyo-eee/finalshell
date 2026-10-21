package com.finalshell.task;

import com.finalshell.crypto.User;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Cr2 implements Runnable {
   final User z;

   Cr2(User var1) {
      this.z = var1;
   }

   @Override
   public void run() {
      Object var1 = 369978863948429585L;
      Ref.g(369978863948429585L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 193999962470178439L;
      Object[] var3 = var10002;
      Ref.h(193999962470178439L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





