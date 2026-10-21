import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class zP {
   protected zP() {
   }

   public abstract Object o();

   public abstract int U();

   public abstract int i();

   public abstract Object o(int var1, int var2);

   public String L(int var1, int var2) {
      boolean var10000 = Uo_2.k();
      Object[] var10002 = com.c.a(var1, var2);
      Method var10004 = com.c.d(533716037937215783L);
      Object[] var10003 = var10002;
      zP var10 = this;
      Method var10001 = var10004;

      try {
         var9 = var10001.invoke(var10, var10003);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object var4 = var9;
      boolean var3 = var10000;
      Object var7 = var4;
      if (var3) {
         if (var4 == null) {
            return "";
         }

         var7 = var4;
      }

      String var5 = var7.toString();
      String var8 = var5;
      if (var3) {
         if (var5 == null) {
            return "";
         }

         var8 = var5;
      }

      return var8;
   }

   public abstract Object U(int var1);
}





