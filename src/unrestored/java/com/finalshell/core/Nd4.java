package com.finalshell.core;

import java.util.Arrays;
import java.util.List;

public abstract class Nd4 {
   public static List q;

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\"'\u0010;t\t\u001c3+\u001e2v\u0007]:1\u0017%;\u001bS7.\u0017yv\u0000^ /\u001cyx\u0000V<$\u001b4t\u001b[:,\\3t\u001bW)\"'\u0010;t\t\u001c3+\u001e2v\u0007]:1\u0017%;\u001bS7.\u0017yv\u0000^ /\u001cyp\u0017F0,\u0001>z\u0001";
      int var5 = "\"'\u0010;t\t\u001c3+\u001e2v\u0007]:1\u0017%;\u001bS7.\u0017yv\u0000^ /\u001cyx\u0000V<$\u001b4t\u001b[:,\\3t\u001bW)\"'\u0010;t\t\u001c3+\u001e2v\u0007]:1\u0017%;\u001bS7.\u0017yv\u0000^ /\u001cyp\u0017F0,\u0001>z\u0001"
         .length();
      char var2 = '1';
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 61;
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
                        var46 = 104;
                        break;
                     case 1:
                        var46 = 127;
                        break;
                     case 2:
                        var46 = 79;
                        break;
                     case 3:
                        var46 = 106;
                        break;
                     case 4:
                        var46 = 40;
                        break;
                     case 5:
                        var46 = 82;
                        break;
                     default:
                        var46 = 15;
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
                     q = Arrays.asList(var0[2], var0[1], var0[3], var0[0]);
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

                  var3 = "9<\u000b o\u0012\u0007(0\u0005)m\u001cF!*\f> \u0000H,5\fbm\u001bE;4\u0007b`\u0015D+$9<\u000b o\u0012\u0007(0\u0005)m\u001cF!*\f> \u0000H,5\fbm\u001bE;4\u0007b}\u001dS+";
                  var5 = "9<\u000b o\u0012\u0007(0\u0005)m\u001cF!*\f> \u0000H,5\fbm\u001bE;4\u0007b`\u0015D+$9<\u000b o\u0012\u0007(0\u0005)m\u001cF!*\f> \u0000H,5\fbm\u001bE;4\u0007b}\u001dS+"
                     .length();
                  var2 = '$';
                  var8 = -1;
            }

            var10000 = 38;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}






