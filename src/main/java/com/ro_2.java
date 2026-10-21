package com;

final class Ro_2 {
   static final com.d9_2 W;
   static final com.d9_2 C;
   static final com.d9_2 k;
   static final com.d9_2 I;
   private static final String a;

   static String Y() {
      return a;
   }

   static long w(long var0, long var2, long var4) {
      return com.dG_3.h(var0, var2, var4);
   }

   static long b(long var0, long var2, long var4) {
      return ue_2.j(var0, var2, var4);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Q\u007ft\u007fF".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 31;
      char[] var10002 = var10003;
      int var1 = var10004;
      char[] var10;
      byte var14;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var10 = var10003;
         var10005 = var0;
         char var10008 = var10003[var0];
         var10007 = 31;
         var10006 = var10008;
         switch (var0 % 7) {
            case 0:
               var14 = 127;
               break;
            case 1:
               var14 = 78;
               break;
            case 2:
               var14 = 90;
               break;
            case 3:
               var14 = 78;
               break;
            case 4:
               var14 = 106;
               break;
            case 5:
               var14 = 40;
               break;
            default:
               var14 = 126;
         }
      } else {
         var6 = 31;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            W = com.d9_2.NONE;
            C = com.d9_2.ZLIB;
            k = com.d9_2.GZIP;
            I = com.d9_2.ANY;
            return;
         }

         var10 = var10003;
         var10005 = var0;
         char var15 = var10003[var0];
         var10007 = 31;
         var10006 = var15;
         switch (var0 % 7) {
            case 0:
               var14 = 127;
               break;
            case 1:
               var14 = 78;
               break;
            case 2:
               var14 = 90;
               break;
            case 3:
               var14 = 78;
               break;
            case 4:
               var14 = 106;
               break;
            case 5:
               var14 = 40;
               break;
            default:
               var14 = 126;
         }
      }

      while (true) {
         var10[var10005] = (char)(var10006 ^ var10007 ^ var14);
         var0++;
         if (var6 == 0) {
            var10 = var10002;
            var10005 = var6;
            char var17 = var10002[var6];
            var10007 = var6;
            var10006 = var17;
            switch (var0 % 7) {
               case 0:
                  var14 = 127;
                  break;
               case 1:
                  var14 = 78;
                  break;
               case 2:
                  var14 = 90;
                  break;
               case 3:
                  var14 = 78;
                  break;
               case 4:
                  var14 = 106;
                  break;
               case 5:
                  var14 = 40;
                  break;
               default:
                  var14 = 126;
            }
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               W = com.d9_2.NONE;
               C = com.d9_2.ZLIB;
               k = com.d9_2.GZIP;
               I = com.d9_2.ANY;
               return;
            }

            var10 = var10002;
            var10005 = var0;
            char var16 = var10002[var0];
            var10007 = var6;
            var10006 = var16;
            switch (var0 % 7) {
               case 0:
                  var14 = 127;
                  break;
               case 1:
                  var14 = 78;
                  break;
               case 2:
                  var14 = 90;
                  break;
               case 3:
                  var14 = 78;
                  break;
               case 4:
                  var14 = 106;
                  break;
               case 5:
                  var14 = 40;
                  break;
               default:
                  var14 = 126;
            }
         }
      }
   }
}





