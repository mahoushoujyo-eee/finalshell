package com.finalshell.ui.model;

public final class Lg4 extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Lg4 colorSwitch;
   public static Lg4 defaultColor;
   public static Lg4 color1;
   public static Lg4 color2;
   public static Lg4[] x;

   public static Lg4[] values() {
      return (Lg4[])x.clone();
   }

   public static Lg4 valueOf(String var0) {
      return Enum.valueOf(Lg4.class, var0);
   }

   public Lg4(String var1, int var2) {
      super(var1, var2);
   }

   public static Lg4[] M() {
      return new Lg4[]{colorSwitch, defaultColor, color1, color2};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "tLsl#c\fsFyb$>kTLsl#";
      int var5 = "tLsl#c\fsFyb$>kTLsl#".length();
      char var2 = 6;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 64;
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
                        var46 = 87;
                        break;
                     case 1:
                        var46 = 99;
                        break;
                     case 2:
                        var46 = 95;
                        break;
                     case 3:
                        var46 = 67;
                        break;
                     case 4:
                        var46 = 17;
                        break;
                     case 5:
                        var46 = 18;
                        break;
                     default:
                        var46 = 95;
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
                     colorSwitch = new Lg4(var0[2], 0);
                     defaultColor = new Lg4(var0[1], 1);
                     color1 = new Lg4(var0[0], 2);
                     color2 = new Lg4(var0[3], 3);
                     x = M();
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

                  var3 = "AyFY\u00164]KbI^\u0006AyFY\u0016U";
                  var5 = "AyFY\u00164]KbI^\u0006AyFY\u0016U".length();
                  var2 = 11;
                  var8 = -1;
            }

            var10000 = 117;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







