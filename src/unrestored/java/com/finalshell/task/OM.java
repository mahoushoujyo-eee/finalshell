package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import java.lang.reflect.InvocationTargetException;

public class OM implements Runnable {
   public final MainFrame z;

   public OM(MainFrame var1) {
      this.z = var1;
   }

   @Override
   public void run() {
      Object var1 = 428884336772749219L;
      Ref.g(428884336772749219L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 267463681951434232L;
      Object[] var3 = var10002;
      Ref.h(267463681951434232L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw new RuntimeException(var5.getTargetException());
      }
   }
}





