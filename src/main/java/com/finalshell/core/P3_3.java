package com.finalshell.core;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P3_3 implements S_6 {
   final Set N;

   P3_3(Set var1) {
      this.N = var1;
   }

   @Override
   public Map T(String var1, boolean var2, boolean var3) throws IOException {
      HashMap var5 = new HashMap();
      boolean var10000 = GO.s();
      Iterator var6 = this.N.iterator();
      boolean var4 = var10000;

      while (var6.hasNext()) {
         D2_7 var7 = (D2_7)var6.next();
         URI var8 = (URI)var7.H().l();
         var7.G().Y().V(new C2_6(this, var1, var3, var8, var5));
         if (!var4) {
            break;
         }
      }

      return var5;
   }
}





