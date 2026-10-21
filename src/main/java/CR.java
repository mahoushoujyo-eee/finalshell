import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CR implements Cq_2 {
   final YI C;
   final String m;
   final F6 I;

   CR(F6 var1, YI var2, String var3) {
      this.I = var1;
      this.C = var2;
      this.m = var3;
   }

   @Override
   public void u(VO var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(178857963789314984L);
      Object[] var10002 = var10001;
      VO var7 = var1;
      Method var10000 = var10003;

      try {
         var4 = (Integer)var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      if (var4 == com.c.c(242649790291880610L).getInt(null)) {
         var10000 = (Method)com.c.c(632844740712008035L).get(this);
         var10001 = com.c.a(com.c.c(379104353760710404L).get(this), com.c.c(141303724457314099L).get(this));
         var10003 = com.c.d(263637764923912958L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }
   }
}





