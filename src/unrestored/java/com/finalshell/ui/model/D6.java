package com.finalshell.ui.model;

public final class D6 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static D6 add;
   public static D6 remove;
   public static D6 replace;
   public static D6 move;
   public static D6 copy;
   public static D6 test;
   public static D6[] F;
   public static long a;

   public static D6[] values() {
      return (D6[])F.clone();
   }

   public static D6 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public D6(String var1, int var2) {
   }

   public static D6[] m() {
      D6[] var10000 = new D6[(int)a];
      var10000[0] = add;
      var10000[1] = remove;
      var10000[2] = replace;
      var10000[3] = move;
      var10000[4] = copy;
      var10000[5] = test;
      return var10000;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = "~QE\u0004rZW|\u0006mPLvq#\u0007mPQuf%H";
      int var7 = "~QE\u0004rZW|\u0006mPLvq#\u0007mPQuf%H".length();
      char var4 = 3;
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 49;
         String var10001 = var5.substring(++var10, var10 + var4);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label48;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 46;
                        break;
                     case 1:
                        var50 = 4;
                        break;
                     case 2:
                        var50 = 16;
                        break;
                     case 3:
                        var50 = 40;
                        break;
                     case 4:
                        var50 = 54;
                        break;
                     case 5:
                        var50 = 119;
                        break;
                     default:
                        var50 = 28;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var2[var6++] = var33;
                  if ((var10 += var4) >= var7) {
                     long var0 = 7738935872742658095L;
                     long var27 = 3909796765412003881L ^ var0;
                     byte var18 = -1;
                     a = var27;
                     add = new D6(var2[0], 0);
                     remove = new D6(var2[2], 1);
                     replace = new D6(var2[3], 2);
                     move = new D6(var2[1], 3);
                     copy = new D6(var2[4], 4);
                     test = new D6(var2[5], 5);
                     F = m();
                     return;
                  }

                  var4 = var5.charAt(var10);
                  break;
               default:
                  var2[var6++] = var33;
                  if ((var10 += var4) < var7) {
                     var4 = var5.charAt(var10);
                     continue label53;
                  }

                  var5 = "9\u001f\u0014%\u0004.\u0015\u0017(";
                  var7 = "9\u001f\u0014%\u0004.\u0015\u0017(".length();
                  var4 = 4;
                  var10 = -1;
            }

            var10000 = 116;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
}







