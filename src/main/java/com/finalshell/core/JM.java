package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class JM {
   public String K;
   public boolean B;
   public String q;

   public JM(String var1) {
      long var3 = 136568670898850279L;
      String var2 = "";
      Ref.s(136568670898850279L, var2, var3);
      Registry.lookupField(231748893861719771L).setBoolean(this, false);
      long var5 = 567851261854980699L;
      String var4 = "";
      Ref.s(567851261854980699L, var4, var5);
      long var7 = 136568670898850279L;
      Ref.s(136568670898850279L, var1, var7);
   }

   public boolean w() {
      return Registry.lookupField(231748893861719771L).getBoolean(this);
   }

   public void u(boolean var1) {
      Registry.lookupField(231748893861719771L).setBoolean(this, var1);
   }
}





