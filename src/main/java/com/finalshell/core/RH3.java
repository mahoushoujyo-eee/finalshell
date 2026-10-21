package com.finalshell.core;

// $VF: synthetic class
public class RH3 {
   static int[] v;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 1379622557036702169L;
      long var10002 = -281856507441976865L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      v = new int[com.finalshell.ui.model.D.values().length];

      try {
         v[com.finalshell.ui.model.D.SnakeCase.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         v[com.finalshell.ui.model.D.KebabCase.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         v[com.finalshell.ui.model.D.PascalCase.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         v[com.finalshell.ui.model.D.CamelCase.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         v[com.finalshell.ui.model.D.NoChange.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         v[com.finalshell.ui.model.D.NeverUseThisValueExceptDefaultValue.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var5) {
      }
   }
}





