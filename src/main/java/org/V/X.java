package org.V;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.l.F;

public class X extends org.V.U {
   private final Map M = new HashMap();
   private long N;
   static final boolean R = !org.V.X.class.desiredAssertionStatus();

   public X() {
   }

   public X(Map var1) {
      int[] var10000 = org.V.f.h();
      super();
      int[] var2 = var10000;
      this.M = new HashMap();

      for (Entry var4 : var1.entrySet()) {
         org.V.N var5 = this.I((String)var4.getKey(), (byte[])var4.getValue());
         if (!R && var5 != null) {
            throw new AssertionError();
         }

         if (var2 != null) {
            break;
         }
      }
   }

   @org.F.c
   public org.V.N I(String var1, byte[] var2) {
      return this.M.put(var1, new p(this, var2, var1));
   }

   @org.F.c
   public org.V.N S(String var1, String var2) {
      return this.I(var1, var2.getBytes());
   }

   public org.V.N O(org.V.N var1) {
      return this.M.put(var1.o(), var1);
   }

   public Collection q() {
      return Collections.unmodifiableCollection(this.M.values());
   }

   public final void j(long var1) {
      this.N = var1;
   }

   @org.F.c
   @Override
   public final org.V.N J(String var1) {
      return (org.V.N)this.M.get(var1);
   }

   @org.F.c
   @Override
   public Iterable E(String var1, boolean var2) {
      return F.W(this.M.values(), new z_2(this, var1, var2));
   }

   static long f(org.V.X var0) {
      return var0.N;
   }
}





