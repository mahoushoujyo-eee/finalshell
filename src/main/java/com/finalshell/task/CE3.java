package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import java.lang.reflect.InvocationTargetException;

public class CE3 implements Runnable {
   public final Tf4 H;
   public final YY3 y;

   public CE3(YY3 var1, Tf4 var2) {
      this.y = var1;
      this.H = var2;
   }

   @Override
   public void run() {
      Object var1 = 408438253181889861L;
      Ref.g(408438253181889861L, var1);
      Object var3 = 216006756334095373L;
      Ref.g(216006756334095373L, var3);
      Object var5 = 627973027287447539L;
      Ref.g(627973027287447539L, var5);
      Object var7 = 163960328229192286L;
      Object[] var10005 = Registry.packArgs(Ref.g(163960328229192286L, var7));
      long var10 = 354921658348946569L;
      Object[] var9 = var10005;
      Ref.h(354921658348946569L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }
}





