package com;

public enum N0 {
   field, calendar, other;
   private static final N0[] X;

   private static N0[] p() {
      return new N0[]{field, calendar, other};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "FZL\u0006\u0017\u0005OGA\u000f\u0001\bJOH\u0006\u000b v[";
      int var5 = "FZL\u0006\u0017\u0005OGA\u000f\u0001\bJOH\u0006\u000b v[".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 56;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 56;
               var10006 = var6;
            } else {
               var13 = 56;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 56;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 17;
                     break;
                  case 1:
                     var29 = 22;
                     break;
                  case 2:
                     var29 = 28;
                     break;
                  case 3:
                     var29 = 91;
                     break;
                  case 4:
                     var29 = 93;
                     break;
                  case 5:
                     var29 = 124;
                     break;
                  default:
                     var29 = 47;
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
            X = p();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}






