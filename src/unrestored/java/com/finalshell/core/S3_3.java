package com.finalshell.core;

public class S3_3 {
   public final boolean K;
   public final Q4_3 F;
   @C_9
   public W4_3 C;
   public static String a;

   public S3_3(boolean var1, Q4_3 var2) {
      this.K = var1;
      this.F = var2;
   }

   @Override
   public String toString() {
      String[] var10000 = RG_2.C();
      StringBuilder var2 = new StringBuilder();
      String[] var1 = var10000;
      S3_3 var3 = this;
      if (var1 != null) {
         if (this.K) {
            var2.append(a);
         }

         var3 = this;
      }

      if (var3.C != null) {
         var2.append(this.C);
         if (var1 != null) {
            return var2.toString();
         }
      }

      var2.append(this.F);
      return var2.toString();
   }

   public void u(W4_3 var1) {
      this.C = var1;
   }

   public short p() {
      String[] var1 = RG_2.C();
      W4_3 var10000 = this.C;
      if (var1 != null) {
         if (this.C == null) {
            return -1;
         }

         var10000 = this.C;
      }

      return var10000.w();
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "o@T)Yr".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 33;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 33;
         var10006 = var0;
      } else {
         var6 = 33;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 33;
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
               var23 = 8;
               break;
            case 2:
               var23 = 27;
               break;
            case 3:
               var23 = 105;
               break;
            case 4:
               var23 = 20;
               break;
            case 5:
               var23 = 115;
               break;
            default:
               var23 = 104;
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





