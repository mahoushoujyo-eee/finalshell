package org.V;

class z_2 implements org.T.a {
   static final boolean m = !org.V.X.class.desiredAssertionStatus();
   final String C;
   final boolean B;
   final org.V.X M;
   private static final long a;

   z_2(org.V.X var1, String var2, boolean var3) {
      this.M = var1;
      this.C = var2;
      this.B = var3;
   }

   @Override
   public boolean k(@org.F.c Object var1) {
      int[] var2;
      org.V.N var6;
      label42: {
         int[] var10000 = org.V.f.h();
         org.V.N var3 = (org.V.N)var1;
         var2 = var10000;
         if (!m) {
            var6 = var3;
            if (var2 != null) {
               break label42;
            }

            if (var3 == null) {
               throw new AssertionError();
            }
         }

         var6 = var3;
      }

      String var4 = var6.o();
      int var5 = this.C.length();
      byte var7 = var4.startsWith(this.C);
      if (var2 == null) {
         if (var7 == 0) {
            return (boolean)0;
         }

         var7 = this.B;
      }

      if (var2 != null) {
         return (boolean)var7;
      } else if (var7 != 0) {
         return (boolean)1;
      } else {
         int var8 = var4.indexOf((int)a, var5);
         if (var2 != null) {
            return (boolean)var8;
         } else {
            return (boolean)(var8 == -1 ? 1 : 0);
         }
      }
   }

   static {
      long var0 = 3631307813545587705L;
      long var10002 = -732812909801098282L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





