package org.w;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public final class n {
   static final boolean y = !n.class.desiredAssertionStatus();

   private n() {
   }

   public static Object A(Object var0, Method[] var1) {
      int[] var2;
      Class var3;
      byte var8;
      int[] var10000 = org.w.d.q();
      var3 = var1[0].getDeclaringClass();
      var2 = var10000;
      var8 = y;
      label77:
      if (var2 == null) {
         if (!y) {
            var8 = var3.isInterface();
            if (var2 != null) {
               break label77;
            }

            if (var8 == 0) {
               throw new AssertionError();
            }
         }

         var8 = 0;
      }

      byte var4 = var8;

      while (true) {
         if (var4 < var1.length) {
            Method var5 = var1[var4];
            var9 = var1[var4 + 1];
            if (var2 != null) {
               break;
            }

            Object var6;
            var6 = var9;
            var10 = y;
            label63:
            if (var2 == null) {
               if (!y) {
                  var10 = var5.getDeclaringClass().equals(var3);
                  if (var2 != null) {
                     break label63;
                  }

                  if (!var10) {
                     throw new AssertionError();
                  }
               }

               var6.setAccessible(true);
               var10 = y;
            }

            label55:
            if (var2 == null) {
               if (!var10) {
                  var10 = var5.getReturnType().equals(var6.getReturnType());
                  if (var2 != null) {
                     break label55;
                  }

                  if (!var10) {
                     throw new AssertionError();
                  }
               }

               var10 = y;
            }

            label48: {
               if (var2 == null) {
                  if (var10) {
                     break label48;
                  }

                  var10 = Arrays.equals((Object[])var5.getParameterTypes(), (Object[])var6.getParameterTypes());
               }

               if (!var10) {
                  throw new AssertionError();
               }
            }

            var4 += 2;
            if (var2 == null) {
               continue;
            }
         }

         var9 = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{var3}, new org.w.c(var1, var0));
         break;
      }

      Object var7 = var9;
      if (com.ky_4.F() != null) {
         org.w.d.P(new int[3]);
      }

      return var7;
   }
}





