import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class k9_2 implements Comparator {
   final Yf_2 j;

   k9_2(Yf_2 var1) {
      this.j = var1;
   }

   public int v(lv_4 var1, lv_4 var2) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(622590009271170486L);
      Object[] var10002 = var10001;
      lv_4 var6 = var2;
      Method var10000 = var10003;

      try {
         var5 = (Long)var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10002 = com.c.f();
      Method var10004 = com.c.d(622590009271170486L);
      Object[] var11 = var10002;
      lv_4 var10 = var1;
      Method var7 = var10004;

      try {
         var8 = (Long)var7.invoke(var10, var11);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      return Long.compare(var5, var8);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((lv_4)var1, (lv_4)var2);
      Method var10003 = com.c.d(329377280464077623L);
      Object[] var10002 = var10001;
      k9_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





