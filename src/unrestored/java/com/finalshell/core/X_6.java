package com.finalshell.core;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class X_6 extends U2_3 {
   public final Map M = new HashMap();
   public long N;
   public static boolean R;

   public X_6() {
   }

   public X_6(Map var1) {
   super();
      int[] var10000 = F_6.h();
      int[] var2 = var10000;
      this.M = new HashMap();

      for (Entry var4 : var1.entrySet()) {
         N_6 var5 = this.I((String)var4.getKey(), (byte[])var4.getValue());
         if (!R && var5 != null) {
            throw new AssertionError();
         }

         if (var2 != null) {
            break;
         }
      }
   }

   @C_9
   public N_6 I(String var1, byte[] var2) {
      return (N_6)(this.M.put(var1, new P2_4(this, var2, var1)));
   }

   @C_9
   public N_6 S(String var1, String var2) {
      return this.I(var1, var2.getBytes());
   }

   public N_6 O(N_6 var1) {
      return (N_6)(this.M.put(var1.o$String(), var1));
   }

   public Collection q() {
      return Collections.unmodifiableCollection(this.M.values());
   }

   public final void j(long var1) {
      this.N = var1;
   }

   @C_9
   @Override
   public final N_6 J(String var1) {
      return (N_6)this.M.get(var1);
   }

   @C_9
   @Override
   public Iterable E(String var1, boolean var2) {
      return F3_3.W(this.M.values(), new Z2_3(this, var1, var2));
   }

   public static long f(X_6 var0) {
      return var0.N;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      R = !X_6.class.desiredAssertionStatus();
   }
}





