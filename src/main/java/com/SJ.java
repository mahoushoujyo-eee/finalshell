package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class SJ implements ActionListener {
   final _y_2 n;

   SJ(_y_2 var1) {
      this.n = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = _y_2.M();
      _y_2 var10000 = this.n;
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(483219322811206313L);
      Object[] var10002 = var10001;
      _y_2 var31 = var10000;
      Method var13 = var10003;

      try {
         var10000 = (_y_2)var13.invoke(var31, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(571514335693873067L);
      var10002 = var10001;
      var10001 = var10000;
      Method var15 = var10003;

      try {
         var16 = (Boolean)var15.invoke(var10001, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      if (var2 != 0) {
         var16 = !var16;
      }

      boolean var3 = var16;
      var10000 = this.n;
      var10001 = com.c.f();
      var10003 = com.c.d(483219322811206313L);
      var10002 = var10001;
      _y_2 var35 = var10000;
      Method var18 = var10003;

      try {
         var10000 = (_y_2)var18.invoke(var35, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10001 = com.c.a(var3);
      var10003 = com.c.d(137024548965563513L);
      var10002 = var10001;
      var10001 = var10000;
      Method var20 = var10003;

      try {
         var20.invoke(var10001, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10000 = this.n;
      var10001 = com.c.f();
      var10003 = com.c.d(503550115260388056L);
      var10002 = var10001;
      _y_2 var39 = var10000;
      Method var22 = var10003;

      try {
         var10000 = (_y_2)var22.invoke(var39, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10001 = com.c.a(var3);
      var10003 = com.c.d(137024548965563513L);
      var10002 = var10001;
      var10001 = var10000;
      Method var24 = var10003;

      try {
         var24.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      U var25 = this.n.kD;
      var10001 = com.c.a(this.n);
      var10003 = com.c.d(182560589671772498L);
      var10002 = var10001;
      U var43 = var25;
      Method var26 = var10003;

      try {
         var26.invoke(var43, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var27 = com.c.f();
      Method var28 = com.c.d(270389152141252877L);
      var10002 = var27;
      var10001 = null;

      try {
         var10000 = (_y_2)var28.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var10002 = var10001;
      var10001 = var10000;
      Method var30 = var10003;

      try {
         var30.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      this.n.T();
   }
}





