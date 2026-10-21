package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.BO3;
import java.lang.reflect.InvocationTargetException;

public class JH implements Runnable {
   public final BO3 h;

   public JH(BO3 var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      Object var1 = 182737286098539567L;
      Ref.g(182737286098539567L, var1);
      Object var3 = 217384029588736691L;
      Ref.g(217384029588736691L, var3);
      Object var5 = 476201740043670453L;
      Ref.g(476201740043670453L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 346382751221538814L;
      Object[] var7 = var10004;
      Ref.h(346382751221538814L, var7, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 433046742012662407L;
      Object[] var9 = var10005;
      Ref.h(433046742012662407L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }
   }
}





