package com.finalshell.ui.model;

import com.finalshell.core.QR;
import java.util.Comparator;

public class OI implements Comparator {
   final QR a;

   OI(QR var1) {
      this.a = var1;
   }

   public int d(com.finalshell.core.K9 var1, com.finalshell.core.K9 var2) {
      Integer var3 = this.a.J.indexOf(var1);
      Integer var4 = this.a.J.indexOf(var2);
      return var3.compareTo(var4);
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.d((com.finalshell.core.K9)var1, (com.finalshell.core.K9)var2);
   }
}





