package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.FolderAdapter;
import java.lang.reflect.InvocationTargetException;

public class Mg2 implements Runnable {
   final FolderAdapter j;

   Mg2(FolderAdapter var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      Object var1 = 233709872523386793L;
      Ref.g(233709872523386793L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 536573249317665647L;
      Object[] var3 = var10002;
      Ref.h(536573249317665647L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





