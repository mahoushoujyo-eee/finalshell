package com.finalshell.ui.model;

public final class L {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static L jarEntry;
   public static L packageEntry;
   public static L classEntry;
   public static L javaEntry;
   public static L fileEntry;

   public static L[] values() {
      return (L[])com.finalshell.reflect.Ref.cloneObject(C);
   }

   public static L valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public L(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "nHI\b\u0018}q[G^\u0011\u0000\ttH\\\u0002<t`lP\n}EK\u0010\n_zj[S";
      int var5 = "nHI\b\u0018}q[G^\u0011\u0000\ttH\\\u0002<t`lP\n}EK\u0010\n_zj[S".length();
      char var2 = '\f';
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 106;
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
                        var46 = 116;
                        break;
                     case 1:
                        var46 = 67;
                        break;
                     case 2:
                        var46 = 64;
                        break;
                     case 3:
                        var46 = 9;
                        break;
                     case 4:
                        var46 = 19;
                        break;
                     case 5:
                        var46 = 112;
                        break;
                     default:
                        var46 = 126;
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
                     jarEntry = new L(var0[4], 0);
                     packageEntry = new L(var0[0], 1);
                     classEntry = new L(var0[2], 2);
                     javaEntry = new L(var0[1], 3);
                     fileEntry = new L(var0[3], 4);
                     C = c();
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

                  var3 = "Bz|<\u0006NZVj\bNrb\u001c-T\\]";
                  var5 = "Bz|<\u0006NZVj\bNrb\u001c-T\\]".length();
                  var2 = '\t';
                  var8 = -1;
            }

            var10000 = 80;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
   private static Object C;
}







