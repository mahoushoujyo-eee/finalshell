package com.finalshell.ui.model;

public final class I3 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static I3 random;
   public static I3 left;
   public static I3 right;
   public static I3 both;

   public static I3[] values() {
      return (I3[])M.clone();
   }

   public static I3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public I3(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "L\"tG\u0006R&|W2U";
      int var5 = "L\"tG\u0006R&|W2U".length();
      char var2 = 4;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 4;
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
                        var46 = 36;
                        break;
                     case 1:
                        var46 = 67;
                        break;
                     case 2:
                        var46 = 22;
                        break;
                     case 3:
                        var46 = 55;
                        break;
                     case 4:
                        var46 = 89;
                        break;
                     case 5:
                        var46 = 60;
                        break;
                     default:
                        var46 = 68;
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
                     random = new I3(var0[1], 0);
                     left = new I3(var0[0], 1);
                     right = new I3(var0[3], 2);
                     both = new I3(var0[2], 3);
                     M = i();
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

                  var3 = "0Z\u0014)\u0005 \\\u0007)[";
                  var5 = "0Z\u0014)\u0005 \\\u0007)[".length();
                  var2 = 4;
                  var8 = -1;
            }

            var10000 = 118;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







