package com;

public enum eL_3 {
   aboveStart, aboveMiddle, aboveEnd, belowStart, belowMiddle, belowEnd;
   private static final eL_3[] j;
   private static final long a;

   public int L() {
      int[] var1 = pb_4.g();
      int var10000 = Sf_2.s[this.ordinal()];
      if (var1 != null) {
         switch (var10000) {
            case 1:
            case 2:
            case 3:
               return 3;
            case 4:
            case 5:
            case 6:
            default:
               var10000 = 1;
         }
      }

      return var10000;
   }

   private static eL_3[] R() {
      eL_3[] var10000 = new eL_3[(int)a];
      var10000[0] = aboveStart;
      var10000[1] = aboveMiddle;
      var10000[2] = aboveEnd;
      var10000[3] = belowStart;
      var10000[4] = belowMiddle;
      var10000[5] = belowEnd;
      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = "J\t'n\u001d\u0019\u0003J\u0019<\bI\u000e$w\u000f\u000f\u0019O\u000bI\u000e$w\u000f\u0007\u001eO\u000f$}\u000bJ\t'n\u001d\u0007\u001eO\u000f$}";
      int var7 = "J\t'n\u001d\u0019\u0003J\u0019<\bI\u000e$w\u000f\u000f\u0019O\u000bI\u000e$w\u000f\u0007\u001eO\u000f$}\u000bJ\t'n\u001d\u0007\u001eO\u000f$}"
         .length();
      char var4 = '\n';
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 69;
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
                        var50 = 110;
                        break;
                     case 1:
                        var50 = 46;
                        break;
                     case 2:
                        var50 = 13;
                        break;
                     case 3:
                        var50 = 93;
                        break;
                     case 4:
                        var50 = 61;
                        break;
                     case 5:
                        var50 = 15;
                        break;
                     default:
                        var50 = 50;
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
                     long var0 = 7357686248928909651L;
                     long var27 = 3819566261490096469L ^ var0;
                     byte var18 = -1;
                     a = var27;
                     j = R();
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

                  var5 = "-n@\tzh~(\n.iC\u0010h~d-~[";
                  var7 = "-n@\tzh~(\n.iC\u0010h~d-~[".length();
                  var4 = '\b';
                  var10 = -1;
            }

            var10000 = 34;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
}






