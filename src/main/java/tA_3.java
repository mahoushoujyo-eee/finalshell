import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;

class tA_3 implements Comparator {
   final HashMap j;
   final f8_2 y;

   tA_3(f8_2 var1, HashMap var2) {
      this.y = var1;
      this.j = var2;
   }

   public int I(Thread var1, Thread var2) {
      Long var3 = (Long)((HashMap)com.c.c(590353382428314736L).get(this)).get(var1.getId());
      Long var4 = (Long)((HashMap)com.c.c(590353382428314736L).get(this)).get(var2.getId());
      return var4.compareTo(var3);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((Thread)var1, (Thread)var2);
      Method var10003 = com.c.d(537215676255985544L);
      Object[] var10002 = var10001;
      tA_3 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





