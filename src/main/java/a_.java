import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class a_ implements Comparator {
   public int Q(File var1, File var2) {
      return var1.getName().compareTo(var2.getName());
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((File)var1, (File)var2);
      Method var10003 = com.c.d(488550066188234368L);
      Object[] var10002 = var10001;
      a_ var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





