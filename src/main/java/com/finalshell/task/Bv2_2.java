package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import java.lang.reflect.InvocationTargetException;

public class Bv2_2 implements Runnable {
   final ConnectionProperty R;

   Bv2_2(ConnectionProperty var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      Object[] var10001 = Registry.packArgs(this.R.U);
      long var2 = 185296114512803953L;
      Object[] var1 = var10001;
      Ref.h(185296114512803953L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





