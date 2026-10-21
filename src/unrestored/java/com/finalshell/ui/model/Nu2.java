package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@XStreamAlias("ResourceMap")
public class Nu2 implements Serializable {
   @XStreamImplicit
   public Map P = new HashMap();

   public void T(String var1, F2 var2) {
      this.P.put(var1, var2);
   }

   public void e(String var1) {
      this.P.remove(var1);
   }

   public F2 S(String var1) {
      return (F2)this.P.get(var1);
   }

   public Map b() {
      return this.P;
   }

   public void Y(Map var1) {
      this.P = var1;
   }
}





