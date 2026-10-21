package com;

import java.lang.reflect.Type;

public abstract class zS implements X4 {
   private static com.ky_4[] g;

   @Override
   public Object z(com.yn_4 var1, Type var2, Object var3) {
      return this.p(var1, var2, var3, null, 0);
   }

   public abstract Object p(com.yn_4 var1, Type var2, Object var3, String var4, int var5);

   public static void v(com.ky_4[] var0) {
      g = var0;
   }

   public static com.ky_4[] p() {
      return g;
   }

   static {
      if (p() != null) {
         v(new com.ky_4[1]);
      }
   }
}





