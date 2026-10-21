import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class Jl_2 implements Comparator {
   public int I(ln_4 var1, ln_4 var2) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(145535910876897139L);
      Object[] var10002 = var10001;
      ln_4 var6 = var1;
      Method var10000 = var10003;

      try {
         var5 = (Integer)var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10002 = com.c.f();
      Method var10004 = com.c.d(145535910876897139L);
      Object[] var11 = var10002;
      ln_4 var10 = var2;
      Method var7 = var10004;

      try {
         var8 = (Integer)var7.invoke(var10, var11);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      return Integer.compare(var5, var8);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((ln_4)var1, (ln_4)var2);
      Method var10003 = com.c.d(459791630102767596L);
      Object[] var10002 = var10001;
      Jl_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





