package com;

public enum xP_3 {
   atMinuteEnd, atHourEnd, atDayEnd, atMonthEnd, atYearEnd;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "l+\u0004\u001e@)nc;\bl+\b\u0010L\u001eEi\tl+\u0015\u0014T)nc;";
      int var5 = "l+\u0004\u001e@)nc;\bl+\b\u0010L\u001eEi\tl+\u0015\u0014T)nc;".length();
      char var2 = '\t';
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 97;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 108;
                        break;
                     case 1:
                        var46 = 62;
                        break;
                     case 2:
                        var46 = 45;
                        break;
                     case 3:
                        var46 = 16;
                        break;
                     case 4:
                        var46 = 84;
                        break;
                     case 5:
                        var46 = 58;
                        break;
                     default:
                        var46 = 74;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var29;
                  if ((var8 += var2) >= var5) {
                     return;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var29;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label53;
                  }

                  var3 = "g \n\u0015P$HC:#\u000bg \n\u0013P%Tc\u0011)\u001e";
                  var5 = "g \n\u0015P$HC:#\u000bg \n\u0013P%Tc\u0011)\u001e".length();
                  var2 = '\n';
                  var8 = -1;
            }

            var10000 = 106;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}






