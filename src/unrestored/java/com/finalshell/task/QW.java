package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.ML;
import java.lang.reflect.InvocationTargetException;

public class QW implements Runnable {
   public final String I;
   public final ML l;

   public QW(ML var1, String var2) {
      this.l = var1;
      this.I = var2;
   }

   @Override
   public void run() {
      Object var1 = 339502436883578119L;
      Ref.g(339502436883578119L, var1);
      Object var3 = 347805637754599459L;
      Ref.g(347805637754599459L, var3);
      Object var5 = 307059608814817737L;
      Object[] var10004 = Registry.packArgs(Ref.g(307059608814817737L, var5));
      long var8 = 138118316736819193L;
      Object[] var7 = var10004;
      Ref.h(138118316736819193L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw new RuntimeException(var9.getTargetException());
      }
   }
}





