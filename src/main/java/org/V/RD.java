package org.v;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class RD extends RB {
   @org.F.c
   public Rs_2 V;
   public final List l = new ArrayList();

   public RD(@org.F.c String var1) {
      this(var1, new fK[0]);
   }

   public RD(@org.F.c String var1, fK[] var2) {
      super(var1, var2);
   }

   public void g(@org.F.c Rs_2 var1) {
      this.V = var1;
   }

   public void Y(_9 var1) {
      this.l.add(var1);
      var1.l(this);
   }

   public _9[] E() {
      return this.l.toArray(new _9[this.l.size()]);
   }

   @org.F.c
   public _9 o(String var1) {
      String[] var10000 = RG.C();
      Iterator var3 = this.l.iterator();
      String[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            _9 var4 = (_9)var3.next();
            var5 = var4;
            if (var2 == null) {
               break;
            }

            if (var4.j().equals(var1)) {
               var5 = var4;
               break;
            }

            if (var2 != null) {
               continue;
            }
         }

         return null;
      }

      return var5;
   }

   @org.F.c
   @Override
   public Object l(Rz_2 var1) throws Throwable {
      return var1.g(this);
   }
}





