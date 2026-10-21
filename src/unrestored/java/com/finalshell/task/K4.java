package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.UpdateDialog;
import java.lang.reflect.InvocationTargetException;

public class K4 implements Runnable {
   public final UpdateDialog v;

   public K4(UpdateDialog var1) {
      this.v = var1;
   }

   @Override
   public void run() {
      Object var1 = 392747189541455450L;
      Ref.g(392747189541455450L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 448870905616495851L;
      Object[] var3 = var10002;
      Ref.h(448870905616495851L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





