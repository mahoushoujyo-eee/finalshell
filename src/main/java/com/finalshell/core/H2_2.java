package com.finalshell.core;

import java.io.File;

public class H2_2 extends DB_2 {
   final com.finalshell.ui.panel.T P;

   H2_2(com.finalshell.ui.panel.T var1) {
      this.P = var1;
   }

   @Override
   public void u(int var1, Object var2, Object var3) {
      File var4 = ((Wo4)var3).T();
      this.P.T$void();
      this.P.E.P(var4);
   }
}





