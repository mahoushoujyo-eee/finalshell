import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class DD implements Comparator {
   final aJ R;

   DD(aJ var1) {
      this.R = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      String var10000 = aA.z();
      Object var10001 = com.c.c(168418258401192889L).get(this);
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(396550792733905567L);
      Object[] var10003 = var10002;
      var10002 = (Object[])var10001;
      var10001 = var10004;

      try {
         var13 = (Integer)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      int var4 = var13;
      String var3 = var10000;
      var10000 = (String)com.c.c(168418258401192889L).get(this);
      var10001 = com.c.a(var2);
      Method var19 = com.c.d(396550792733905567L);
      var10002 = (Object[])var10001;
      var10001 = var10000;
      Method var9 = var19;

      try {
         var10 = (Integer)var9.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      int var5 = var10;
      int var11 = var4;
      int var16 = var5;
      if (var3 == null) {
         if (var4 > var5) {
            return 1;
         }

         var11 = var4;
         if (var3 != null) {
            return var4;
         }

         var16 = var5;
      }

      return var11 < var16 ? -1 : 0;
   }
}





