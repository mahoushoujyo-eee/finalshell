package org.v;

import org.I;

public final class Rc_2 extends R7 {
   @org.F.c
   public final _r_2 p;
   @org.F.c
   public final NV r;
   @org.F.c
   public final NV[] Z;
   private static final String d;

   public Rc_2(I var1, @org.F.c _r_2 var2, @org.F.c NV var3, @org.F.c NV[] var4, _r_2 var5) {
      String[] var10000 = RG.C();
      super(var1, var5);
      String[] var6 = var10000;
      this.p = var2;
      if (var6 != null) {
         if (var2 != null) {
            var2.G(this);
         }

         this.r = var3;
      }

      if (var6 != null) {
         if (var3 != null) {
            var3.d(this);
         }

         this.Z = var4;
      }

      NV[] var11 = var4;
      if (var6 != null) {
         if (var4 == null) {
            return;
         }

         var11 = var4;
      }

      NV[] var7 = var11;
      int var8 = var7.length;
      int var9 = 0;

      while (var9 < var8) {
         NV var10 = var7[var9];
         var10.d(this);
         var9++;
         if (var6 == null) {
            break;
         }
      }
   }

   @Override
   public String toString() {
      return d;
   }

   @org.F.c
   @Override
   public Object R(h_4 var1) throws Throwable {
      return var1.E(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "2\u0007y<Qn(zS+2Wn=tF%2P`(zF".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 22;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 22;
         var10006 = var0;
      } else {
         var6 = 22;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 22;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 66;
               break;
            case 1:
               var23 = 126;
               break;
            case 2:
               var23 = 29;
               break;
            case 3:
               var23 = 10;
               break;
            case 4:
               var23 = 111;
               break;
            case 5:
               var23 = 86;
               break;
            default:
               var23 = 16;
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





