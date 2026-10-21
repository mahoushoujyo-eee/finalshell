package com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class G implements fb_4 {
   final CK e;
   final pv_4 N;

   G(pv_4 var1, CK var2) {
      this.N = var1;
      this.e = var2;
   }

   @Override
   public void a(int var1) {
      YI var10000 = this.N.c;
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(571070361007830286L);
      Object[] var10002 = var10001;
      YI var4 = var10000;
      Method var3 = var10003;

      try {
         var3.invoke(var4, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void q(int var1, long var2, int var4) {
      YI var10000 = this.N.c;
      Object[] var10001 = com.c.e((long)var4);
      Method var10003 = com.c.d(349985227491593793L);
      Object[] var10002 = var10001;
      YI var7 = var10000;
      Method var6 = var10003;

      try {
         var6.invoke(var7, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Override
   public void d(int var1, String var2, long var3) {
      this.N.c = new YI(com.c.c(183482007281545121L).getInt(null), var1, var2, var2, var3, false);
      YI var10000 = this.N.c;
      Object[] var10001 = com.c.a(this.e);
      Method var10003 = com.c.d(200446375758088289L);
      Object[] var10002 = var10001;
      YI var23 = var10000;
      Method var12 = var10003;

      try {
         var12.invoke(var23, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var10000 = this.N.c;
      var10001 = com.c.e(var3);
      var10003 = com.c.d(119264357941005086L);
      var10002 = var10001;
      YI var25 = var10000;
      Method var14 = var10003;

      try {
         var14.invoke(var25, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10000 = this.N.c;
      var10001 = com.c.f();
      var10003 = com.c.d(605799167049228581L);
      var10002 = var10001;
      YI var27 = var10000;
      Method var16 = var10003;

      try {
         var16.invoke(var27, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Object[] var17 = com.c.f();
      Method var18 = com.c.d(270389152141252877L);
      var10002 = var17;
      var10001 = null;

      try {
         var10000 = (YI)var18.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(377280722715900564L);
      var10002 = var10001;
      var10001 = var10000;
      Method var20 = var10003;

      try {
         var10000 = (YI)var20.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10001 = com.c.a(this.N.c);
      var10003 = com.c.d(118191003152152827L);
      var10002 = var10001;
      var10001 = var10000;
      Method var22 = var10003;

      try {
         var22.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





