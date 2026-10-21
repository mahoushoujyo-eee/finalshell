package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.lang.reflect.InvocationTargetException;

public class A5 implements Runnable {
   public final ClearListDialog j;

   public A5(ClearListDialog var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      Object var1 = 202500284452452570L;
      Ref.g(202500284452452570L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 527909282492888538L;
      Object[] var3 = var10002;
      Ref.h(527909282492888538L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





