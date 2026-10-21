package com;

import com.I.x;
import java.io.IOException;

class ie_4 implements Runnable {
   final com.I.P I;
   final x j;
   final com.Oj_2 r;
   final xD_3 P;

   ie_4(xD_3 var1, com.I.P var2, x var3, com.Oj_2 var4) {
      this.P = var1;
      this.I = var2;
      this.j = var3;
      this.r = var4;
   }

   @Override
   public void run() {
      try {
         String var1 = com.Cz_2.W(this.I.w(this.j));
         com.QX var2 = new com.QX();
         _C var3 = new _C(var1);
         var3.setEditable(false);
         var2.add(new SZ(var3, false));
         var2.c(this.r, true, true);
         w6_2.v(var3, GR.lD, new com.WV(this, var2));
      } catch (IOException var4) {
         nE_3.g(this, var4);
      }
   }
}





