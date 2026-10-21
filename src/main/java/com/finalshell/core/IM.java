package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public abstract class IM {
   protected Gq2 J;
   protected YU g;
   protected UJ s;
   protected String a;

   public boolean D(ConnectHost var1) throws Exception {
      this.J = var1.N();
      this.g = var1.D;
      this.s = this.g.I();
      this.a = var1.t$String();
      return true;
   }
}





