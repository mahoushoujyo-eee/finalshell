package com;

public enum Du_2 {
   random, cascade, randomize;
   private static boolean T;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      r(true);
      String var3 = "\u0002T}.\u0000\u001f\u0004\t\u0013T`)\u000e\u0016\b\u001bP\u0006\u0013T`)\u000e\u0016";
      int var5 = "\u0002T}.\u0000\u001f\u0004\t\u0013T`)\u000e\u0016\b\u001bP\u0006\u0013T`)\u000e\u0016".length();
      char var2 = 7;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 9;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 9;
               var10006 = var6;
            } else {
               var13 = 9;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 9;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 104;
                     break;
                  case 1:
                     var29 = 60;
                     break;
                  case 2:
                     var29 = 7;
                     break;
                  case 3:
                     var29 = 68;
                     break;
                  case 4:
                     var29 = 104;
                     break;
                  case 5:
                     var29 = 114;
                     break;
                  default:
                     var29 = 104;
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

   public static void r(boolean var0) {
      T = var0;
   }

   public static boolean R() {
      return T;
   }

   public static boolean W() {
      boolean var0 = R();
      return !var0;
   }
}






