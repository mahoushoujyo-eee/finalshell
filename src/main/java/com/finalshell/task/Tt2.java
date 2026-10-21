package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FileCommandPanel;
import java.lang.reflect.InvocationTargetException;

public class Tt2 implements Runnable {
   public final FileCommandPanel F;

   public Tt2(FileCommandPanel var1) {
      this.F = var1;
   }

   @Override
   public void run() {
      Object var1 = 434996761704522558L;
      Ref.g(434996761704522558L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 380866699589160754L;
      Object[] var3 = var10002;
      Ref.h(380866699589160754L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





