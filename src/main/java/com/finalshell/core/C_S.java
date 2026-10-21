package com.finalshell.core;

import java.util.List;

public class C_S extends M2_2 {
   final EM3 M;
   final QR k;

   C_S(QR var1, EM3 var2) {
      this.k = var1;
      this.M = var2;
   }

   @Override
   public void p(List var1) {
      this.M.k(var1);
   }
}





