package com.finalshell.core;

public final class NO_2 extends NV_2 {
   public final Nt2_2 w;
   @C_9
   C_q_2_2 H;
   @C_9
   FW_2 Z;
   @C_9
   Q4_3 B;
   public static String a;

   public NO_2(com.finalshell.ui.model.I var1, Nt2_2 var2) {
      super(var1);
      this.w = var2;
   }

   @Override
   public String toString() {
      return this.w.toString() + a;
   }

   @C_9
   @Override
   public Object i(C_w_2 var1) throws Throwable {
      return var1.S(this);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "q#Hv~".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 21;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 21;
         var10006 = var0;
      } else {
         var6 = 21;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 21;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 74;
               break;
            case 1:
               var23 = 66;
               break;
            case 2:
               var23 = 53;
               break;
            case 3:
               var23 = 10;
               break;
            case 4:
               var23 = 24;
               break;
            case 5:
               var23 = 57;
               break;
            default:
               var23 = 70;
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





