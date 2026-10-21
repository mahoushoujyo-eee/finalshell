package com.finalshell.ui.model;

public final class D92 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static D92 NONE;
   public static D92 ZLIB;
   public static D92 GZIP;
   public static D92 ANY;
   public static D92[] C;

   public static D92[] values() {
      return (D92[])C.clone();
   }

   public static D92 valueOf(String var0) {
      return Enum.valueOf(D92.class, var0);
   }

   public D92(String var1, int var2) {
      super(var1, var2);
   }

   public static D92[] E() {
      return new D92[]{NONE, ZLIB, GZIP, ANY};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u000e6Y\u0004\b\"I\u0007";
      int var5 = "\u000e6Y\u0004\b\"I\u0007".length();
      char var2 = 3;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 12;
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
                        var46 = 67;
                        break;
                     case 1:
                        var46 = 116;
                        break;
                     case 2:
                        var46 = 12;
                        break;
                     case 3:
                        var46 = 91;
                        break;
                     case 4:
                        var46 = 114;
                        break;
                     case 5:
                        var46 = 55;
                        break;
                     default:
                        var46 = 98;
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
                     NONE = new D92(var0[3], 0);
                     ZLIB = new D92(var0[2], 1);
                     GZIP = new D92(var0[1], 2);
                     ANY = new D92(var0[0], 3);
                     C = E();
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

                  var3 = "uT)u\u0004aW.r";
                  var5 = "uT)u\u0004aW.r".length();
                  var2 = 4;
                  var8 = -1;
            }

            var10000 = 108;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







