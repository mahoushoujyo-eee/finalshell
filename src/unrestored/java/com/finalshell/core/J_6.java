package com.finalshell.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class J_6 {
   public static Object o(Method var0, @C_9 Object var1, Object[] var2) throws Throwable {
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





