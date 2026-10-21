package org.l;

import java.util.Iterator;
import org.T.a;

class o_2 implements Iterable {
   final Iterable Z;
   final a r;

   o_2(Iterable var1, a var2) {
      this.Z = var1;
      this.r = var2;
   }

   @Override
   public Iterator iterator() {
      return F.e(this.Z.iterator(), this.r);
   }
}





