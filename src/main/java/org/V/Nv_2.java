package org.v;

import org.I;

public final class Nv_2 extends NV {
   public final NV d;
   public final Nt_2 S;
   private static final String a;

   public Nv_2(I var1, NV var2, Nt_2 var3) {
      super(var1);
      this.d = var2;
      this.S = var3;
   }

   @Override
   public String toString() {
      return this.d.toString() + a + this.S.toString();
   }

   @org.F.c
   @Override
   public Object i(_w_2 var1) throws Throwable {
      return var1.W(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "nf\u0016\u0019CdI-j\u0017\f\u0017".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 43;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 43;
         var10006 = var0;
      } else {
         var6 = 43;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 43;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 101;
               break;
            case 1:
               var23 = 36;
               break;
            case 2:
               var23 = 83;
               break;
            case 3:
               var23 = 65;
               break;
            case 4:
               var23 = 28;
               break;
            case 5:
               var23 = 46;
               break;
            default:
               var23 = 12;
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





