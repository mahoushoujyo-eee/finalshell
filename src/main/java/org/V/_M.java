package org.v;

class _M implements _5 {
   final fF x;
   private static final String a;

   _M(fF var1) {
      this.x = var1;
   }

   @org.F.c
   public Void m(fR var1) {
      this.x.t.print(var1.z);
      return null;
   }

   @org.F.c
   public Void n(_o_2 var1) {
      fF.w(this.x, var1.M);
      return null;
   }

   @org.F.c
   public Void J(Rr_2 var1) {
      String[] var10000 = RG.C();
      this.x.t.print(var1.G[0]);
      int var3 = 1;
      String[] var2 = var10000;

      while (var3 < var1.G.length) {
         this.x.t.print(a + var1.G[var3]);
         var3++;
         if (var2 == null) {
            break;
         }
      }

      return null;
   }

   @org.F.c
   @Override
   public Object i(Rr_2 var1) throws Throwable {
      return this.J(var1);
   }

   @org.F.c
   @Override
   public Object u(_o_2 var1) throws Throwable {
      return this.n(var1);
   }

   @org.F.c
   @Override
   public Object q(fR var1) throws Throwable {
      return this.m(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\f\u000e".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 56;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 56;
         var10006 = var0;
      } else {
         var6 = 56;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 56;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 24;
               break;
            case 1:
               var23 = 22;
               break;
            case 2:
               var23 = 111;
               break;
            case 3:
               var23 = 15;
               break;
            case 4:
               var23 = 30;
               break;
            case 5:
               var23 = 45;
               break;
            default:
               var23 = 50;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





