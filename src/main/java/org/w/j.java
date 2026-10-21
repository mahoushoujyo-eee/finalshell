package org.w;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class j {
   private j() {
   }

   public static Object o(Method var0, @org.F.c Object var1, Object[] var2) throws Throwable {
      try {
         return var0.invoke(var1, var2);
      } catch (InvocationTargetException var5) {
         Throwable var4 = var5.getTargetException();
         throw var4;
      } catch (Exception var6) {
         throw new AssertionError(var6);
      }
   }
}





