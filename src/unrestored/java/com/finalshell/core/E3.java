package com.finalshell.core;

import java.util.HashMap;
import java.util.Map;

public class E3 {
   public Map p = new HashMap();

   public PF3 A(String var1) {
      return (PF3)this.p.get(var1);
   }

   public void w(String var1, PF3 var2) {
      this.p.put(var1, var2);
   }

   public Map k() {
      return this.p;
   }

   public void G(Map var1) {
      this.p = var1;
   }

   public LC_2 W() {
      return new LC_2(this.p);
   }
}





