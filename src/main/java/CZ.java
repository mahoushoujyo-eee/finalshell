import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CZ implements Cq_2 {
   final YI J;
   final String W;
   final ca_4 i;

   CZ(ca_4 var1, YI var2, String var3) {
      this.i = var1;
      this.J = var2;
      this.W = var3;
   }

   @Override
   public void u(VO var1) {
      boolean var2 = F6.g();
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(178857963789314984L);
      Object[] var10002 = var10001;
      VO var14 = var1;
      Method var10000 = var10003;

      try {
         var7 = (Integer)var10000.invoke(var14, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var7 == com.c.c(242649790291880610L).getInt(null)) {
         var10000 = (Method)com.c.c(225021371275606830L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(140337426392269953L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10 = (F6)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         if (!var2) {
            if (var10 == null) {
               return;
            }

            var10000 = (Method)com.c.c(225021371275606830L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(140337426392269953L);
            var10002 = var10001;
            var10001 = var10000;
            var10000 = var10003;

            try {
               var10 = (F6)var10000.invoke(var10001, var10002);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }
         }

         var10001 = com.c.a(com.c.c(225021371275606830L).get(this), com.c.c(395548631722221050L).get(this));
         var10003 = com.c.d(263637764923912958L);
         var10002 = var10001;
         F6 var20 = var10;
         var10000 = var10003;

         try {
            var10000.invoke(var20, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }
}





