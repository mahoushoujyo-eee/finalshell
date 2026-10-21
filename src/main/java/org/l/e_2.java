package org.l;

import java.util.Iterator;

class e_2 implements Iterable {
   final Iterable z;
   final Class e;

   e_2(Iterable var1, Class var2) {
      this.z = var1;
      this.e = var2;
   }

   @Override
   public Iterator iterator() {
      return F.P(this.z.iterator(), this.e);
   }
}





