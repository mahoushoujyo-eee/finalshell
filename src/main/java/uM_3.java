import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class uM_3 {
   long m;
   tL_3 u;
   private static final long a;

   uM_3() {
      dA_3 var1 = new dA_3(null);
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new WW(this, var1), (int)a);
      Method var10003 = com.c.d(201859364639460244L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(558988037493500446L);
      var10002 = var10001;
      dA_3 var8 = var1;
      var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   static {
      long var0 = 56449889732039166L;
      long var10002 = -6448708938294193642L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





