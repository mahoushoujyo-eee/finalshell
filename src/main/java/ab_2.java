import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

class ab_2 implements Comparator {
   final boolean h;

   ab_2(boolean var1) {
      this.h = var1;
   }

   public int a(File var1, File var2) {
      Object[] var10000 = com.c.a(var1.getName());
      Method var10 = com.c.d(240174729775302079L);
      Object[] var18 = var10000;
      Object var14 = null;

      try {
         var11 = (Long)var10.invoke(var14, var18);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      long var4 = var11;
      boolean var12 = KT.F();
      var14 = com.c.a(var2.getName());
      Method var16 = com.c.d(240174729775302079L);
      Object[] var21 = (Object[])var14;
      var18 = null;

      try {
         var17 = (Long)var16.invoke(var18, var21);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      long var6 = var17;
      boolean var3 = var12;
      int var13 = com.c.c(619787630767044970L).getBoolean(this);
      if (var3) {
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
      Method var10003 = com.c.d(154605682348061912L);
      Object[] var10002 = var10001;
      ab_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





