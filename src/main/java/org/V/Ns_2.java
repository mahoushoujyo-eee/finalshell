package org.v;

import org.I;

public final class Ns_2 extends NL {
   @org.F.c
   public final NV W;
   private static final String d;

   public Ns_2(I var1, @org.F.c NV var2, NV[] var3) {
      String[] var10000 = RG.C();
      super(var1, var3);
      this.W = var2;
      String[] var4 = var10000;
      NV var5 = var2;
      if (var4 != null) {
         if (var2 == null) {
            return;
         }

         var5 = var2;
      }

      var5.d(this);
   }

   @Override
   public String toString() {
      return d;
   }

   @org.F.c
   @Override
   public Object s(V_2 var1) throws Throwable {
      return var1.a(this);
   }

   @org.F.c
   @Override
   public Object R(h_4 var1) throws Throwable {
      return var1.S(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "k\u0013a|ER[".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 34;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 34;
         var10006 = var0;
      } else {
         var6 = 34;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 34;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 58;
               break;
            case 1:
               var23 = 68;
               break;
            case 2:
               var23 = 51;
               break;
            case 3:
               var23 = 59;
               break;
            case 4:
               var23 = 21;
               break;
            case 5:
               var23 = 88;
               break;
            default:
               var23 = 80;
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
               d = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





