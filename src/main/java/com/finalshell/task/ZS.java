package com.finalshell.task;

import com.finalshell.core.Ne4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.KQ;
import java.lang.reflect.InvocationTargetException;

public class ZS implements Runnable {
   final KQ l;

   ZS(KQ var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Object var1 = 337673702137830950L;
      Ref.g(337673702137830950L, var1);
      Object var3 = 144581259712304790L;
      Ref.g(144581259712304790L, var3);
      Ne4 var10003 = Registry.emptyArgs();
      long var6 = 150976763033464620L;
      Object[] var5 = var10003;
      var10003 = Ref.h(150976763033464620L, var5, var6);

      try {
         var10003 = (Ne4)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10003.requestFocus();
   }
}





