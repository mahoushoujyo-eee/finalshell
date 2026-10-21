import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class st {
   private static boolean p;

   public static void main(String[] var0) {
      Object[] var10000 = com.c.a(var0);
      Method var2 = com.c.d(405573401826445833L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public static void L(boolean var0) {
      p = var0;
   }

   public static boolean b() {
      return p;
   }

   public static boolean u() {
      boolean var0 = b();
      return !var0;
   }

   static {
      if (!b()) {
         L(true);
      }
   }
}





