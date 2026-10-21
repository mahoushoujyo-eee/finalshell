import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class oZ_3 implements Runnable {
   final s h;
   final yl_4 M;
   final lv_4 U;
   final U E;

   oZ_3(U var1, s var2, yl_4 var3, lv_4 var4) {
      this.E = var1;
      this.h = var2;
      this.M = var3;
      this.U = var4;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(542785260238654605L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(239393919034688200L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(363759879239066771L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10000 = (Method)com.c.c(542785260238654605L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(239393919034688200L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = (Object[])com.c.c(320880767863788237L).get(this);
      var10002 = com.c.f();
      Method var10004 = com.c.d(323168880566913665L);
      Object[] var30 = var10002;
      var10002 = var10001;
      Method var19 = var10004;

      try {
         var10001 = (Object[])var19.invoke(var10002, var30);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.a(var10001, com.c.c(305562707889565747L).get(this));
      var10003 = com.c.d(142884213810215617L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





