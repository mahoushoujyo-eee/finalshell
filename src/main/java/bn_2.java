import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class Bn_2 implements Comparator {
   final boolean H;
   final yT_3 d;

   Bn_2(yT_3 var1, boolean var2) {
      this.d = var1;
      this.H = var2;
   }

   public int M(File var1, File var2) {
      Object[] var10000 = com.c.a(com.c.c(196598744367778661L).get(this), var1.getName());
      Method var10 = com.c.d(607259551718786171L);
      Object[] var18 = var10000;
      Object var14 = null;

      try {
         var11 = (Long)var10.invoke(var14, var18);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      long var4 = var11;
      com.ky_4[] var12 = yT_3.c();
      var14 = com.c.a(com.c.c(196598744367778661L).get(this), var2.getName());
      Method var16 = com.c.d(607259551718786171L);
      Object[] var21 = (Object[])var14;
      var18 = null;

      try {
         var17 = (Long)var16.invoke(var18, var21);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      long var6 = var17;
      com.ky_4[] var3 = var12;
      int var13 = com.c.c(156915645017568853L).getBoolean(this);
      if (var3 != null) {
         if (var13 == 0) {
            return Long.compare(var4, var6);
         }

         var13 = Long.compare(var6, var4);
      }

      return var13;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((File)var1, (File)var2);
      Method var10003 = com.c.d(489202120646989913L);
      Object[] var10002 = var10001;
      Bn_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





