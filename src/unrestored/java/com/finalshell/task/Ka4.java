package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import java.lang.reflect.InvocationTargetException;

public class Ka4 implements Runnable {
   public final MainFrame E;

   public Ka4(MainFrame var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Object var1 = 153427872343135490L;
      Ref.g(153427872343135490L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 176356587927714575L;
      Object[] var3 = var10002;
      Ref.h(176356587927714575L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





