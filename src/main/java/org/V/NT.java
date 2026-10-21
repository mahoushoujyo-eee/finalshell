package org.v;

import org.I;

public final class NT extends Nk_2 implements _8 {
   public final RN O;
   private static final String d;

   public NT(I var1, fu_2[] var2, RN var3) {
      super(var1, var2);
      (this.O = var3).G(this);
   }

   public boolean v() {
      return RG.G(this.D(), new String[]{d});
   }

   @Override
   public String toString() {
      return RG.o(this.D()) + this.O;
   }

   @org.F.c
   @Override
   public Object T(e_4 var1) throws Throwable {
      return var1.W(this);
   }

   @org.F.c
   @Override
   public Object i(hL var1) throws Throwable {
      return var1.F(this);
   }

   @org.F.c
   @Override
   public Object R(h_4 var1) throws Throwable {
      return var1.W(this);
   }

   @org.F.c
   @Override
   public S_3 U(String var1) {
      return this.O.U(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\nx&\"KO".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 40;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 40;
         var10006 = var0;
      } else {
         var6 = 40;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 40;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 81;
               break;
            case 1:
               var23 = 36;
               break;
            case 2:
               var23 = 111;
               break;
            case 3:
               var23 = 126;
               break;
            case 4:
               var23 = 10;
               break;
            case 5:
               var23 = 4;
               break;
            default:
               var23 = 102;
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





