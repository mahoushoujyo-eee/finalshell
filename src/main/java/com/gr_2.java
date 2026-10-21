package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Gr_2 implements ActionListener {
   final _y_2 V;

   Gr_2(_y_2 var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      U var10000 = this.V.kD;
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(222971910568398589L);
      Object[] var10002 = var10001;
      U var4 = var10000;
      Method var3 = var10003;

      try {
         var3.invoke(var4, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





