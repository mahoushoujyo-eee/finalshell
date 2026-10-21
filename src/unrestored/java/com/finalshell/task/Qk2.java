package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.lang.reflect.InvocationTargetException;

public class Qk2 implements Runnable {
   public final FileBrowserAddressBar l;

   public Qk2(FileBrowserAddressBar var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Object var1 = 160756828064934953L;
      Ref.g(160756828064934953L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 339146148260406633L;
      Object[] var3 = var10002;
      Ref.h(339146148260406633L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





