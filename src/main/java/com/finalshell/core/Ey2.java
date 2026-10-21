package com.finalshell.core;

public class Ey2 {
   public static String t;
   public static String q;
   public static String O;
   public static String z;
   public static String T;
   public static String L;
   public static String R;
   public static String i;
   public static String V;
   public static String W;
   public static String F;

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[11];
      int var4 = 0;
      String var3 = "<\f%\u001a)\u0005\u0010+;&\u0013&\u001e\u0003*\u001b\u0010<\f%\u001a)\u0005\u0010+- \f+\u0013\u0019*\r\u000f<\f%\u001a)\u0005\u0010+9;\u001a9\u0002\u0010+\b<\f%\u001a)\u0005\u0010+\u0006!\u0006;\u0012+\u001d\b+\u0000:\u001e(\u001d\u0010+\u0010)\u0005&\u001e>\u0018\u001b(- \f+\u0013\u0019*\r\b=\u0006%\u0013%\u0007\u0010=\u0007)\u0006*\n9\u0014\u0011";
      int var5 = "<\f%\u001a)\u0005\u0010+;&\u0013&\u001e\u0003*\u001b\u0010<\f%\u001a)\u0005\u0010+- \f+\u0013\u0019*\r\u000f<\f%\u001a)\u0005\u0010+9;\u001a9\u0002\u0010+\b<\f%\u001a)\u0005\u0010+\u0006!\u0006;\u0012+\u001d\b+\u0000:\u001e(\u001d\u0010+\u0010)\u0005&\u001e>\u0018\u001b(- \f+\u0013\u0019*\r\b=\u0006%\u0013%\u0007\u0010=\u0007)\u0006*\n9\u0014\u0011"
         .length();
      char var2 = 16;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 68;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
      char[] var20;
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
                        var46 = 11;
                        break;
                     case 1:
                        var46 = 45;
                        break;
                     case 2:
                        var46 = 13;
                        break;
                     case 3:
                        var46 = 59;
                        break;
                     case 4:
                        var46 = 14;
                        break;
                     case 5:
                        var46 = 53;
                        break;
                     default:
                        var46 = 49;
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
                     t = var0[4];
                     q = var0[5];
                     O = var0[7];
                     z = var0[9];
                     T = var0[3];
                     L = var0[0];
                     R = var0[1];
                     i = var0[2];
                     V = var0[10];
                     W = var0[6];
                     F = var0[8];
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

                  var3 = "]yNn[vs\bKgD|\\zyJ";
                  var5 = "]yNn[vs\bKgD|\\zyJ".length();
                  var2 = 7;
                  var8 = -1;
            }

            var10000 = 38;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}





