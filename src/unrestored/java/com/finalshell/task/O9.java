package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.lang.reflect.InvocationTargetException;

public class O9 implements Runnable {
   public final ClearListDialog E;

   public O9(ClearListDialog var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Object var1 = 464128336754552796L;
      Ref.g(464128336754552796L, var1);
      Object[] var10002 = Registry.packArgs(false);
      long var4 = 238155532020070409L;
      Object[] var3 = var10002;
      Ref.h(238155532020070409L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





