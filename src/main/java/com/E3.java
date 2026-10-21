package com;

import java.util.HashMap;
import java.util.Map;

public class E3 {
   private Map p = new HashMap();

   public pF_3 A(String var1) {
      return (pF_3)this.p.get(var1);
   }

   public void w(String var1, pF_3 var2) {
      this.p.put(var1, var2);
   }

   public Map k() {
      return this.p;
   }

   public void G(Map var1) {
      this.p = var1;
   }

   public com.LC W() {
      return new com.LC(this.p);
   }
}





