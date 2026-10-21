package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.lang.reflect.InvocationTargetException;

public class V0 implements Runnable {
   final ClearListDialog J;

   V0(ClearListDialog var1) {
      this.J = var1;
   }

   @Override
   public void run() {
      Object var1 = 420319759948501659L;
      Ref.g(420319759948501659L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 231167985840496171L;
      Object[] var3 = var10002;
      Ref.h(231167985840496171L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





