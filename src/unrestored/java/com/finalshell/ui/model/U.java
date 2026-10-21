package com.finalshell.ui.model;

public final class U {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static U EXTENDS;
   public static U SUPER;
   public static U ANY;
   public static U NONE;
   public static U[] d;

   public static U[] values() {
      return (U[])d.clone();
   }

   public static U valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public U(String var1, int var2) {
   }

   public static U[] B() {
      return new U[]{EXTENDS, SUPER, ANY, NONE};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "|\u0010(\u0004s\u0011?5";
      int var5 = "|\u0010(\u0004s\u0011?5".length();
      char var2 = 3;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 82;
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
                        var46 = 111;
                        break;
                     case 1:
                        var46 = 12;
                        break;
                     case 2:
                        var46 = 35;
                        break;
                     case 3:
                        var46 = 34;
                        break;
                     case 4:
                        var46 = 49;
                        break;
                     case 5:
                        var46 = 49;
                        break;
                     default:
                        var46 = 41;
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
                     EXTENDS = new U(var0[3], 0);
                     SUPER = new U(var0[2], 1);
                     ANY = new U(var0[0], 2);
                     NONE = new U(var0[1], 3);
                     d = B();
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

                  var3 = "t\u0011;/+\u0007b\u001c?/7=2";
                  var5 = "t\u0011;/+\u0007b\u001c?/7=2".length();
                  var2 = 5;
                  var8 = -1;
            }

            var10000 = 72;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







