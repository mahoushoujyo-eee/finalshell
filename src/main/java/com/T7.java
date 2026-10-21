package com;

import java.util.Comparator;

class T7 implements Comparator {
   final xD_3 l;

   T7(xD_3 var1) {
      this.l = var1;
   }

   public int v(Object[] var1, Object[] var2) {
      return ((String)var1[0]).compareTo((String)var2[0]);
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.v((Object[])var1, (Object[])var2);
   }
}





