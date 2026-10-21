package org.l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C extends AbstractCollection {
   private final Iterator s;
   private final List N = new ArrayList();

   public C(Iterator var1) {
      this.s = var1;
   }

   @Override
   public Iterator iterator() {
      return new org.l.R(this);
   }

   @Override
   public int size() {
      boolean var10000 = F.G();
      int var2 = 0;
      Iterator var3 = this.iterator();
      boolean var1 = var10000;

      while (var3.hasNext()) {
         Object var4 = var3.next();
         var2++;
         if (var1) {
            break;
         }
      }

      return var2;
   }

   static List K(C var0) {
      return var0.N;
   }

   static Iterator R(C var0) {
      return var0.s;
   }
}





