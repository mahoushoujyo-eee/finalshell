package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.JD;
import java.lang.reflect.InvocationTargetException;

public class TB implements Runnable {
   final JD E;

   TB(JD var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Object var1 = 586182878466586699L;
      Ref.g(586182878466586699L, var1);
      Object var3 = 152815625666990065L;
      Ref.g(152815625666990065L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 219324858743675444L;
      Object[] var5 = var10003;
      Ref.h(219324858743675444L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





