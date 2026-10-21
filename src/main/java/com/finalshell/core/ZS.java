package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.Type;

public abstract class ZS implements X4 {
   public static Ky4[] g;

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      return this.p(var1, var2, var3, null, 0);
   }

   public abstract Object p(Yn4 var1, Type var2, Object var3, String var4, int var5);

   public static void v(Ky4[] var0) {
      g = var0;
   }

   public static Ky4[] p() {
      return g;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (p() != null) {
         v(new Ky4[1]);
      }
   }
}





