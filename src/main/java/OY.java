import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class OY implements Comparable {
   private dM_3 v;
   int t;

   public OY(dM_3 var1, int var2) {
      com.c.c(159590777020539491L).set(this, var1);
      com.c.c(198606278652726872L).setInt(this, var2);
   }

   public int d(OY var1) {
      Object[] var10000 = com.c.a(com.c.c(159590777020539491L).get(this), com.c.c(198606278652726872L).getInt(this), com.c.c(198606278652726872L).getInt(var1));
      Method var3 = com.c.d(295920266311443483L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         return (Integer)var3.invoke(var4, var5);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public int compareTo(Object var1) {
      Object[] var10001 = com.c.a((OY)var1);
      Method var10003 = com.c.d(462876887609621738L);
      Object[] var10002 = var10001;
      OY var3 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





