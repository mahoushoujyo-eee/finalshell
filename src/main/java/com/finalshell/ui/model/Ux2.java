package com.finalshell.ui.model;

public final class Ux2 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Ux2 waiting;
   public static Ux2 loading;
   public static Ux2 loaded;
   public static Ux2 failed;

   public static Ux2[] values() {
      return (Ux2[])s.clone();
   }

   public static Ux2 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Ux2(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u0011\u0014>\u0000>P\u001c\u0006\u001b\u001a6\b2Z";
      int var5 = "\u0011\u0014>\u0000>P\u001c\u0006\u001b\u001a6\b2Z".length();
      char var2 = 7;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 80;
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
                        var46 = 45;
                        break;
                     case 1:
                        var46 = 43;
                        break;
                     case 2:
                        var46 = 15;
                        break;
                     case 3:
                        var46 = 52;
                        break;
                     case 4:
                        var46 = 7;
                        break;
                     case 5:
                        var46 = 110;
                        break;
                     default:
                        var46 = 43;
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
                     waiting = new Ux2(var0[3], 0);
                     loading = new Ux2(var0[0], 1);
                     loaded = new Ux2(var0[2], 2);
                     failed = new Ux2(var0[1], 3);
                     s = s();
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

                  var3 = "+.\u0004:\b`\u00070 \f*\u0004j&";
                  var5 = "+.\u0004:\b`\u00070 \f*\u0004j&".length();
                  var2 = 6;
                  var8 = -1;
            }

            var10000 = 106;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







