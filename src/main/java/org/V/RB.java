package org.v;

public abstract class RB implements x_3 {
   @org.F.c
   public final String c;
   public final fK[] B;
   private static final String a;

   public RB(@org.F.c String var1, fK[] var2) {
      this.c = var1;
      this.B = var2;
   }

   @Override
   public x_3 y() {
      throw new org.P(a);
   }

   @org.F.c
   public abstract Object l(Rz_2 var1) throws Throwable;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "V/]fY\u007f\\{nJ`[a\u0015baW}\u0014gTd/Pf\u0014j[tcQz]aR7|]fDj".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 63;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 63;
         var10006 = var0;
      } else {
         var6 = 63;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 63;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 40;
               break;
            case 1:
               var23 = 48;
               break;
            case 2:
               var23 = 1;
               break;
            case 3:
               var23 = 54;
               break;
            case 4:
               var23 = 11;
               break;
            case 5:
               var23 = 48;
               break;
            default:
               var23 = 10;
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





