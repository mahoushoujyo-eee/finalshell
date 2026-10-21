package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.DownloadProgressDialog;
import java.lang.reflect.InvocationTargetException;

public class L62 implements Runnable {
   public final DownloadProgressDialog O;

   public L62(DownloadProgressDialog var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Object var1 = 301426101075703034L;
      Ref.g(301426101075703034L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 464203837310502625L;
      Object[] var3 = var10002;
      Ref.h(464203837310502625L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





