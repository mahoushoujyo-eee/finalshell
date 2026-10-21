package org.y;

import com.GO;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.z.D;

class P implements S {
   final Set N;

   P(Set var1) {
      this.N = var1;
   }

   @Override
   public Map T(String var1, boolean var2, boolean var3) throws IOException {
      HashMap var5 = new HashMap();
      boolean var10000 = GO.s();
      Iterator var6 = this.N.iterator();
      boolean var4 = var10000;

      while (var6.hasNext()) {
         D var7 = (D)var6.next();
         URI var8 = (URI)var7.H().l();
         var7.G().Y().V(new C(this, var1, var3, var8, var5));
         if (!var4) {
            break;
         }
      }

      return var5;
   }
}





