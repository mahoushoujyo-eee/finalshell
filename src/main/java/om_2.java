import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

public class Om_2 implements Comparator {
   public int x(Integer var1, Integer var2) {
      return var1.compareTo(var2);
   }

   public int V(Float var1, Float var2) {
      return var1.compareTo(var2);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((Integer)var1, (Integer)var2);
      Method var10003 = com.c.d(227703286706087580L);
      Object[] var10002 = var10001;
      Om_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





