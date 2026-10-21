package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.UpdateDialog;
import java.lang.reflect.InvocationTargetException;

public class YD implements Runnable {
   public final UpdateDialog O;

   public YD(UpdateDialog var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Object var1 = 484378731380892109L;
      Ref.g(484378731380892109L, var1);
      Object var3 = 354794456661762655L;
      Ref.g(354794456661762655L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 119751058421524022L;
      Object[] var5 = var10003;
      Ref.h(119751058421524022L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }
}





