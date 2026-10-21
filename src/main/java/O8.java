import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

public class O8 implements Comparator {
   public int t(Long var1, Long var2) {
      String var3 = Km_2.U();
      long var4;
      int var10000 = (var4 = var1 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
      if (var3 == null) {
         if (var10000 > 0) {
            return 1;
         }

         long var5;
         var10000 = (var5 = var1 - var2) == 0L ? 0 : (var5 < 0L ? -1 : 1);
      }

      if (var3 == null) {
         if (var10000 < 0) {
            return -1;
         }

         var10000 = 0;
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((Long)var1, (Long)var2);
      Method var10003 = com.c.d(262915954633911742L);
      Object[] var10002 = var10001;
      O8 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





