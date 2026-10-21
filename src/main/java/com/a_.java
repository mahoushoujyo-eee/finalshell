package com;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class a_ implements fb_4 {
   final File b;
   final CK e;
   final pv_4 k;

   a_(pv_4 var1, File var2, CK var3) {
      this.k = var1;
      this.b = var2;
      this.e = var3;
   }

   @Override
   public void a(int var1) {
      YI var10000 = this.k.c;
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
      YI var10000 = this.k.c;
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
      pv_4.r();
      String var6 = this.b.getAbsolutePath() + File.separator + var2;
      this.k.c = new YI(com.c.c(183482007281545121L).getInt(null), var1, var6, null, var3, true);
      YI var10001 = this.k.c;
      Object[] var10002 = com.c.a(this.e);
      Method var10004 = com.c.d(200446375758088289L);
      Object[] var10003 = var10002;
      YI var32 = var10001;
      Method var19 = var10004;

      try {
         var19.invoke(var32, var10003);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var10001 = this.k.c;
      var10002 = com.c.e(var3);
      var10004 = com.c.d(119264357941005086L);
      var10003 = var10002;
      YI var34 = var10001;
      Method var21 = var10004;

      try {
         var21.invoke(var34, var10003);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var10001 = this.k.c;
      var10002 = com.c.a(var2);
      var10004 = com.c.d(266762783168573723L);
      var10003 = var10002;
      YI var36 = var10001;
      Method var23 = var10004;

      try {
         var23.invoke(var36, var10003);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var10001 = this.k.c;
      var10002 = com.c.f();
      var10004 = com.c.d(605799167049228581L);
      var10003 = var10002;
      YI var38 = var10001;
      Method var25 = var10004;

      try {
         var25.invoke(var38, var10003);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Object[] var10000 = com.c.f();
      Method var14 = com.c.d(270389152141252877L);
      var10002 = var10000;
      var10001 = null;

      try {
         var10000 = (Object[])var14.invoke(var10001, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Object[] var28 = com.c.f();
      Method var46 = com.c.d(377280722715900564L);
      var10002 = var28;
      var10001 = var10000;
      Method var16 = var46;

      try {
         var10000 = (Object[])var16.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var30 = com.c.a(this.k.c);
      Method var47 = com.c.d(118191003152152827L);
      var10002 = var30;
      var10001 = var10000;
      Method var18 = var47;

      try {
         var18.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      if (com.ky_4.F() != null) {
         pv_4.Y("QxLumc");
      }
   }
}





