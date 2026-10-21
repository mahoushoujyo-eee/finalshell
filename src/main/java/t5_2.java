import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

class t5_2 implements Callable {
   final BufferedReader D;
   final StringBuffer g;

   t5_2(BufferedReader var1, StringBuffer var2) {
      this.D = var1;
      this.g = var2;
   }

   public String F() throws Exception {
      com.ky_4[] var1 = yT_3.c();

      String var2;
      while ((var2 = ((BufferedReader)com.c.c(454362310334684855L).get(this)).readLine()) != null) {
         ((StringBuffer)com.c.c(621745322823250220L).get(this)).append(var2 + "\n");
         if (var1 == null) {
            break;
         }
      }

      return null;
   }

   @Override
   public Object call() throws Exception {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(580399604591341686L);
      Object[] var10002 = var10001;
      t5_2 var2 = this;
      Method var10000 = var10003;

      try {
         return (String)var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





