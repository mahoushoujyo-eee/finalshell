package com;

import java.util.Comparator;

class OI implements Comparator {
   final com.QR a;

   OI(com.QR var1) {
      this.a = var1;
   }

   public int d(com.K9 var1, com.K9 var2) {
      Integer var3 = this.a.J.indexOf(var1);
      Integer var4 = this.a.J.indexOf(var2);
      return var3.compareTo(var4);
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.d((com.K9)var1, (com.K9)var2);
   }
}





