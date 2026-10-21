package com;

// $VF: synthetic class
class rH_3 {
   static final int[] v = new int[D.values().length];

   static {
      long var2 = 1379622557036702169L;
      long var10002 = -281856507441976865L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;

      try {
         v[D.SnakeCase.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         v[D.KebabCase.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         v[D.PascalCase.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         v[D.CamelCase.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         v[D.NoChange.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         v[D.NeverUseThisValueExceptDefaultValue.ordinal()] = (int)var0;
      } catch (NoSuchFieldError var5) {
      }
   }
}





