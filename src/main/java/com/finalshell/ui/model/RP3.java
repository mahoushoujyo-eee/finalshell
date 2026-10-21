package com.finalshell.ui.model;

public final class RP3 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static RP3 BLINK_BLOCK;
   public static RP3 STEADY_BLOCK;
   public static RP3 BLINK_UNDERLINE;
   public static RP3 STEADY_UNDERLINE;
   public static RP3 BLINK_VERTICAL_BAR;
   public static RP3 STEADY_VERTICAL_BAR;
   public static long a;

   public static RP3[] values() {
      return (RP3[])w.clone();
   }

   public static RP3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public RP3(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = "B583%~_G$/&(dA]>?33\fB583%~_S-21*\u000fS-4<*xU_%8 -nNT\u0012S-4<*xVT3);\"fLN#< ";
      int var7 = "B583%~_G$/&(dA]>?33\fB583%~_S-21*\u000fS-4<*xU_%8 -nNT\u0012S-4<*xVT3);\"fLN#< ".length();
      char var4 = 19;
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 35;
         String var10001 = var5.substring(++var10, var10 + var4);
         byte var10002 = -1;

         while (true) {
      char[] var23;
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
                        var50 = 50;
                        break;
                     case 1:
                        var50 = 66;
                        break;
                     case 2:
                        var50 = 94;
                        break;
                     case 3:
                        var50 = 81;
                        break;
                     case 4:
                        var50 = 66;
                        break;
                     case 5:
                        var50 = 4;
                        break;
                     default:
                        var50 = 35;
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
                     long var0 = 1402280390422034552L;
                     long var27 = 6464223507119732862L ^ var0;
                     byte var18 = -1;
                     a = var27;
                     BLINK_BLOCK = new RP3(var2[4], 0);
                     STEADY_BLOCK = new RP3(var2[1], 1);
                     BLINK_UNDERLINE = new RP3(var2[2], 2);
                     STEADY_UNDERLINE = new RP3(var2[5], 3);
                     BLINK_VERTICAL_BAR = new RP3(var2[3], 4);
                     STEADY_VERTICAL_BAR = new RP3(var2[0], 5);
                     w = C();
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

                  var5 = "A?&.8jPO<,+\u0010P'*!7lMV=+%!y[M6";
                  var7 = "A?&.8jPO<,+\u0010P'*!7lMV=+%!y[M6".length();
                  var4 = 11;
                  var10 = -1;
            }

            var10000 = 49;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
}







