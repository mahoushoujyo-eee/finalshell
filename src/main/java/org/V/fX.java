package org.v;

enum fX {
   INT, ENUM, STRING;
   private static final fX[] l;

   private static fX[] K() {
      return new fX[]{INT, ENUM, STRING};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "l=-\u0004`=,P\u0006v'+T\u0018m";
      int var5 = "l=-\u0004`=,P\u0006v'+T\u0018m".length();
      char var2 = 3;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 91;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 91;
               var10006 = var6;
            } else {
               var13 = 91;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 91;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 126;
                     break;
                  case 1:
                     var29 = 40;
                     break;
                  case 2:
                     var29 = 34;
                     break;
                  case 3:
                     var29 = 70;
                     break;
                  case 4:
                     var29 = 13;
                     break;
                  case 5:
                     var29 = 113;
                     break;
                  default:
                     var29 = 82;
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
            l = K();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}






