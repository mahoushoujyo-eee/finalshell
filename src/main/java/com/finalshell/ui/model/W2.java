package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ReadState")
public final class W2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static W2 none;
   public static W2 created;
   public static W2 ok;
   public static W2 restored;
   public static W2 failed;

   public static W2[] values() {
      return (W2[])Q.clone();
   }

   public static W2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public W2(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "oZ{H\bsPfYr\b\u0003e\u0006gT|Ax\u001e";
      int var5 = "oZ{H\bsPfYr\b\u0003e\u0006gT|Ax\u001e".length();
      char var2 = 4;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 59;
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
                        var46 = 58;
                        break;
                     case 1:
                        var46 = 14;
                        break;
                     case 2:
                        var46 = 46;
                        break;
                     case 3:
                        var46 = 22;
                        break;
                     case 4:
                        var46 = 38;
                        break;
                     case 5:
                        var46 = 65;
                        break;
                     default:
                        var46 = 93;
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
                     none = new W2(var0[0], 0);
                     created = new W2(var0[3], 1);
                     ok = new W2(var0[4], 2);
                     restored = new W2(var0[1], 3);
                     failed = new W2(var0[2], 4);
                     Q = i();
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

                  var3 = ">\u001b,\u00105C^\u00022\u0002";
                  var5 = ">\u001b,\u00105C^\u00022\u0002".length();
                  var2 = 7;
                  var8 = -1;
            }

            var10000 = 103;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







