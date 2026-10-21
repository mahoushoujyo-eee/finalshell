package com.finalshell.ui.model;

public final class HA {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static HA debug;
   public static HA info;
   public static HA warn;
   public static HA error;

   public static HA[] values() {
      return (HA[])p.clone();
   }

   public static HA valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public HA(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u001a}\u0001\u001e\u001b\u0005\u001bj\u0011\u0004\u000e";
      int var5 = "\u001a}\u0001\u001e\u001b\u0005\u001bj\u0011\u0004\u000e".length();
      char var2 = 5;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 90;
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
                        var46 = 36;
                        break;
                     case 1:
                        var46 = 66;
                        break;
                     case 2:
                        var46 = 57;
                        break;
                     case 3:
                        var46 = 49;
                        break;
                     case 4:
                        var46 = 38;
                        break;
                     case 5:
                        var46 = 37;
                        break;
                     default:
                        var46 = 56;
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
                     debug = new HA(var0[0], 0);
                     info = new HA(var0[3], 1);
                     warn = new HA(var0[2], 2);
                     error = new HA(var0[1], 3);
                     p = M();
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

                  var3 = "\bx\u0010\u0004\u0004\u0016w\u0004\u0005";
                  var5 = "\bx\u0010\u0004\u0004\u0016w\u0004\u0005".length();
                  var2 = 4;
                  var8 = -1;
            }

            var10000 = 91;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







