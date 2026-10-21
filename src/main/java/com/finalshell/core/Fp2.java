package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class Fp2 {
   String W;
   boolean v;

   public Fp2(String var1, boolean var2) {
      long var4 = 288266638735159654L;
      Ref.s(288266638735159654L, var1, var4);
      Registry.lookupField(237281645912513830L).setBoolean(this, var2);
   }

   public boolean W() {
      return Registry.lookupField(237281645912513830L).getBoolean(this);
   }

   public void c(boolean var1) {
      Registry.lookupField(237281645912513830L).setBoolean(this, var1);
   }

   public String k() {
      Object var1 = 288266638735159654L;
      return (String)Ref.g(288266638735159654L, var1);
   }

   public void n(String var1) {
      long var3 = 288266638735159654L;
      Ref.s(288266638735159654L, var1, var3);
   }

   @Override
   public String toString() {
      new StringBuilder().append(this.getClass().getName()).append("[");
      Object var1 = 288266638735159654L;
      return this.append((String)Ref.g(288266638735159654L, var1))
         .append("/")
         .append(Registry.lookupField(237281645912513830L).getBoolean(this))
         .append("]")
         .toString();
   }
}





