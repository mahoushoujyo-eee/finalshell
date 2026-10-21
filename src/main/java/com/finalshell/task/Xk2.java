package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.lang.reflect.InvocationTargetException;

public class Xk2 implements Runnable {
   final AppendCarriageReturnCRPanel C;

   Xk2(AppendCarriageReturnCRPanel var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      Object var1 = 167179888068300774L;
      Ref.g(167179888068300774L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 121159855614552174L;
      Object[] var3 = var10002;
      Ref.h(121159855614552174L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





