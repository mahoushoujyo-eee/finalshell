public enum gV {
   ESCAPE, DATA, HEADER, CANCEL, FINISH;
   private static String i;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "\u0000'^\u0000&[\u0006\u0003=S\b%V\u0006\r1\\\u00053L";
      int var5 = "\u0000'^\u0000&[\u0006\u0003=S\b%V\u0006\r1\\\u00053L".length();
      V(null);
      char var2 = 6;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 2;
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
                        var46 = 71;
                        break;
                     case 1:
                        var46 = 118;
                        break;
                     case 2:
                        var46 = 31;
                        break;
                     case 3:
                        var46 = 67;
                        break;
                     case 4:
                        var46 = 116;
                        break;
                     case 5:
                        var46 = 28;
                        break;
                     default:
                        var46 = 10;
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

                  var3 = "kX>o^?\u0004lX$m";
                  var5 = "kX>o^?\u0004lX$m".length();
                  var2 = 6;
                  var8 = -1;
            }

            var10000 = 111;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }

   public static void V(String var0) {
      i = var0;
   }

   public static String b() {
      return i;
   }
}






