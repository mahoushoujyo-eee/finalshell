package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.SpeedTestFrame;
import java.lang.reflect.InvocationTargetException;

public class QC implements Runnable {
   public final SpeedTestFrame O;

   public QC(SpeedTestFrame var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Object var1 = 402713754232817284L;
      Ref.g(402713754232817284L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 478221716271290912L;
      Object[] var3 = var10002;
      Ref.h(478221716271290912L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





