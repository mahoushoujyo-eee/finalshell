package com.finalshell.ui.model;

public final class Eg4 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static Eg4 random;
   public static Eg4 moveNew;
   public static Eg4 moveOld;
   public static Eg4 moveBoth;
   public static boolean P;

   public static Eg4[] values() {
      return (Eg4[])com.finalshell.reflect.Ref.cloneObject(X);
   }

   public static Eg4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public Eg4(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static void g(boolean var0) {
      P = var0;
   }

   public static boolean L() {
      return P;
   }

   public static boolean a() {
      boolean var0 = L();
      return !var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u0016^M:-L<\u0013\u0006\tPU;\u0000N";
      int var5 = "\u0016^M:-L<\u0013\u0006\tPU;\u0000N".length();
      char var2 = '\b';
      g(false);
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 5;
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
                        var46 = 126;
                        break;
                     case 1:
                        var46 = 52;
                        break;
                     case 2:
                        var46 = 62;
                        break;
                     case 3:
                        var46 = 90;
                        break;
                     case 4:
                        var46 = 106;
                        break;
                     case 5:
                        var46 = 38;
                        break;
                     default:
                        var46 = 77;
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
                     random = new Eg4(var0[1], 0);
                     moveNew = new Eg4(var0[2], 1);
                     moveOld = new Eg4(var0[3], 2);
                     moveBoth = new Eg4(var0[0], 3);
                     X = I();
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

                  var3 = "\u0010XK<'@9\u0007\u0010XK<&I*";
                  var5 = "\u0010XK<'@9\u0007\u0010XK<&I*".length();
                  var2 = 7;
                  var8 = -1;
            }

            var10000 = 3;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
   private static Object X;
}







