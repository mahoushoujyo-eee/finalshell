package com.finalshell.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class RD extends RB {
   @C_9
   public Rs2 V;
   public final List l = new ArrayList();

   public RD(@C_9 String var1) {
      this(var1, new FK[0]);
   }

   public RD(@C_9 String var1, FK[] var2) {
      super(var1, var2);
   }

   public void g(@C_9 Rs2 var1) {
      this.V = var1;
   }

   public void Y(C_9_2 var1) {
      this.l.add(var1);
      var1.l(this);
   }

   public C_9_2[] E() {
      return (C_9_2[])(this.l.toArray(new C_9_2[this.l.size()]));
   }

   @C_9
   public C_9_2 o(String var1) {
      C_9_2 var5;
      String[] var10000 = RG_2.C();
      Iterator var3 = this.l.iterator();
      String[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            C_9_2 var4 = (C_9_2)var3.next();
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

   @C_9
   @Override
   public Object l(Rz2_2 var1) throws Throwable {
      return var1.g(this);
   }
}





