import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class OA implements Runnable {
   final u8_2 F;
   final la_4 i;

   OA(la_4 var1, u8_2 var2) {
      this.i = var1;
      this.F = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(569826412732108781L).get(com.c.c(161046042370805589L).get(this));
      Object var10001 = com.c.c(277418865962131275L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(340521912883652737L);
      Object[] var10003 = var10002;
      var10002 = (Object[])var10001;
      var10001 = var10004;

      try {
         var5 = (Integer)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.a(var5);
      Method var10 = com.c.d(196856092777064026L);
      var10002 = (Object[])var10001;
      var10001 = var10000;
      var10000 = var10;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





