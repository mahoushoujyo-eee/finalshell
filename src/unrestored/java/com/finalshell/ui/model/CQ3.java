package com.finalshell.ui.model;

public class CQ3 extends CB3 {
   public String v;
   public GQ h;
   public long k;
   public static String d;

   public CQ3(String var1, GQ var2) {
      this.v = var1;
      this.h = var2;
      this.k = 0L;
   }

   public String w() {
      return this.v;
   }

   public void v(String var1) {
      this.v = var1;
   }

   public GQ K() {
      return this.h;
   }

   public void t(GQ var1) {
      this.h = var1;
   }

   public long J() {
      return this.k;
   }

   public void v(long var1) {
      this.k = var1;
   }

   @Override
   public String toString() {
      return this.v + d + this.h + ")";
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "b2".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 45;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      } else {
         var6 = 45;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 111;
               break;
            case 1:
               var23 = 55;
               break;
            case 2:
               var23 = 14;
               break;
            case 3:
               var23 = 125;
               break;
            case 4:
               var23 = 76;
               break;
            case 5:
               var23 = 11;
               break;
            default:
               var23 = 27;
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





