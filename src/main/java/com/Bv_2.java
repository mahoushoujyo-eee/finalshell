package com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Bv_2 implements Runnable {
   final _y_2 R;

   Bv_2(_y_2 var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      U var10000 = this.R.kD;
      Object[] var10001 = com.c.a(this.R.U);
      Method var10003 = com.c.d(185296114512803953L);
      Object[] var10002 = var10001;
      U var3 = var10000;
      Method var2 = var10003;

      try {
         var2.invoke(var3, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





