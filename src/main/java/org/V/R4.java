package org.v;

import org.I;

public final class R4 extends R7 {
   public final R9 R;
   public final NV d;
   private static final String f;

   public R4(I var1, R9 var2, NV var3, _r_2 var4) {
      super(var1, var4);
      (this.R = var2).Y.n(this);
      (this.d = var3).d(this);
   }

   @Override
   public String toString() {
      return f;
   }

   @org.F.c
   @Override
   public Object R(h_4 var1) throws Throwable {
      return var1.x(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0003\u0013\u001b*\u001a\u0012dK\\S*\u001c\u0012dL\\G$\u001c".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 23;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 23;
         var10006 = var0;
      } else {
         var6 = 23;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            f = var9;
            return;
         }

         var10005 = var10003;
         var10 = 23;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 114;
               break;
            case 1:
               var23 = 107;
               break;
            case 2:
               var23 = 126;
               break;
            case 3:
               var23 = 29;
               break;
            case 4:
               var23 = 37;
               break;
            case 5:
               var23 = 43;
               break;
            default:
               var23 = 93;
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
               f = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





