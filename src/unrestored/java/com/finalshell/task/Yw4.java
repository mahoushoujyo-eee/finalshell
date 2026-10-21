package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.lang.reflect.InvocationTargetException;

public class Yw4 implements Runnable {
   public final ClearListDialog G;

   public Yw4(ClearListDialog var1) {
      this.G = var1;
   }

   @Override
   public void run() {
      Object var1 = 520085588810419933L;
      Ref.g(520085588810419933L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 141175834513271564L;
      Object[] var3 = var10002;
      Ref.h(141175834513271564L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





