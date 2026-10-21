package com;

import java.io.IOException;
import java.util.ArrayList;

class dw_4 implements Runnable {
   final ArrayList R;
   final CK d;
   final pv_4 N;

   dw_4(pv_4 var1, ArrayList var2, CK var3) {
      this.N = var1;
      this.R = var2;
      this.d = var3;
   }

   @Override
   public void run() {
      try {
         String[] var1 = this.R.toArray(new String[this.R.size()]);
         this.d.d(var1);
      } catch (IOException var2) {
         this.N.s = false;
         var2.printStackTrace();
      }
   }
}





