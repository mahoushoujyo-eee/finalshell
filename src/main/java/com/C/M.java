package com.C;

public enum M {
   simple, dropdown;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "4^s{sSX>\u0006#Eq{{Y";
      int var5 = "4^s{sSX>\u0006#Eq{{Y".length();
      char var2 = '\b';
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 79;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 79;
               var10006 = var6;
            } else {
               var13 = 79;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 79;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 31;
                     break;
                  case 1:
                     var29 = 99;
                     break;
                  case 2:
                     var29 = 83;
                     break;
                  case 3:
                     var29 = 68;
                     break;
                  case 4:
                     var29 = 88;
                     break;
                  case 5:
                     var29 = 115;
                     break;
                  default:
                     var29 = 96;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}






