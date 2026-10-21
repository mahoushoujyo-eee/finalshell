package com.finalshell.util;

import com.finalshell.core.F3_3;
import com.finalshell.ui.model.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C extends AbstractCollection {
   public final Iterator s;
   public final List N = new ArrayList();

   public C(Iterator var1) {
      this.s = var1;
   }

   @Override
   public Iterator iterator() {
      return new R(this);
   }

   @Override
   public int size() {
      boolean var10000 = F3_3.G();
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

   public static List K(C var0) {
      return var0.N;
   }

   public static Iterator R(C var0) {
      return var0.s;
   }
}





