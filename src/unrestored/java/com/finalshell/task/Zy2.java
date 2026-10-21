package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.UpdateDialog;
import java.lang.reflect.InvocationTargetException;

public class Zy2 implements Runnable {
   public final UpdateDialog u;

   public Zy2(UpdateDialog var1) {
      this.u = var1;
   }

   @Override
   public void run() {
      Object var1 = 381160524526960651L;
      Ref.g(381160524526960651L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 180191510188721772L;
      Object[] var3 = var10002;
      Ref.h(180191510188721772L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





