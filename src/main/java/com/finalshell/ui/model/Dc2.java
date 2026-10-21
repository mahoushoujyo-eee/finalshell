package com.finalshell.ui.model;

public final class Dc2 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Dc2 NONPRINTING;
   public static Dc2 PRINTING;
   public static Dc2 NONASCII;
   public static Dc2 NONE;
   public static Dc2[] I;

   public static Dc2[] values() {
      return (Dc2[])I.clone();
   }

   public static Dc2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Dc2(String var1, int var2) {
   }

   public static Dc2[] Y() {
      return new Dc2[]{NONPRINTING, PRINTING, NONASCII, NONE};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "fn0\u0005T2}|h0\u0012\bxs7\u001bR2}o";
      int var5 = "fn0\u0005T2}|h0\u0012\bxs7\u001bR2}o".length();
      char var2 = 11;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 44;
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
                        var46 = 4;
                        break;
                     case 1:
                        var46 = 13;
                        break;
                     case 2:
                        var46 = 82;
                        break;
                     case 3:
                        var46 = 121;
                        break;
                     case 4:
                        var46 = 42;
                        break;
                     case 5:
                        var46 = 87;
                        break;
                     default:
                        var46 = 31;
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
                     NONPRINTING = new Dc2(var0[0], 0);
                     PRINTING = new Dc2(var0[1], 1);
                     NONASCII = new Dc2(var0[2], 2);
                     NONE = new Dc2(var0[3], 3);
                     I = Y();
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

                  var3 = "\u0005\rSw6[\u0019\u0002\u0004\u0005\rSs";
                  var5 = "\u0005\rSw6[\u0019\u0002\u0004\u0005\rSs".length();
                  var2 = '\b';
                  var8 = -1;
            }

            var10000 = 79;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







