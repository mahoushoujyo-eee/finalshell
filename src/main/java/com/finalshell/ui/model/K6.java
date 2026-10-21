package com.finalshell.ui.model;

public final class K6 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static K6 underlined;
   public static K6 waved;
   public static K6 strikeThrough;
   public static K6 doubleStrikeThrough;
   public static K6 superscript;
   public static K6 subscript;
   public static long a;

   public static K6[] values() {
      return (K6[])q.clone();
   }

   public static K6 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public K6(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = "x{3>\u0019?Khf/7\u0010\u000epn{3;\u001d\niz\"9\u00076qrq\"\ro`45\u001e?Ltf))\u00122\toa$/\u0016(ql`";
      int var7 = "x{3>\u0019?Khf/7\u0010\u000epn{3;\u001d\niz\"9\u00076qrq\"\ro`45\u001e?Ltf))\u00122\toa$/\u0016(ql`".length();
      char var4 = 19;
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 69;
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
                        var50 = 89;
                        break;
                     case 1:
                        var50 = 81;
                        break;
                     case 2:
                        var50 = 3;
                        break;
                     case 3:
                        var50 = 25;
                        break;
                     case 4:
                        var50 = 48;
                        break;
                     case 5:
                        var50 = 31;
                        break;
                     default:
                        var50 = 93;
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
                     long var0 = 5371963831535055287L;
                     long var27 = -3262492125167308367L ^ var0;
                     byte var18 = -1;
                     a = var27;
                     underlined = new K6(var2[1], 0);
                     waved = new K6(var2[4], 1);
                     strikeThrough = new K6(var2[2], 2);
                     doubleStrikeThrough = new K6(var2[0], 3);
                     superscript = new K6(var2[5], 4);
                     subscript = new K6(var2[3], 5);
                     q = G();
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

                  var5 = "RL\t\u0000(\u000bVX\u000f\u0000>\u0010BWD\u000f\u0011";
                  var7 = "RL\t\u0000(\u000bVX\u000f\u0000>\u0010BWD\u000f\u0011".length();
                  var4 = 5;
                  var10 = -1;
            }

            var10000 = 124;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
}







