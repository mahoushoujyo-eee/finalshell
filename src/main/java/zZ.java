import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

class zZ implements Callable {
   final BufferedReader F;
   final StringBuffer u;

   zZ(BufferedReader var1, StringBuffer var2) {
      this.F = var1;
      this.u = var2;
   }

   public String y() throws Exception {
      com.ky_4[] var1 = yT_3.c();

      String var2;
      while ((var2 = ((BufferedReader)com.c.c(557524112743495789L).get(this)).readLine()) != null) {
         ((StringBuffer)com.c.c(201311005218497213L).get(this)).append(var2 + "\n");
         if (var1 == null) {
            break;
         }
      }

      return null;
   }

   @Override
   public Object call() throws Exception {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(358091690752758155L);
      Object[] var10002 = var10001;
      zZ var2 = this;
      Method var10000 = var10003;

      try {
         return (String)var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





