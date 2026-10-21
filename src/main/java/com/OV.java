package com;

public enum OV {
   none, fillFirst, fillMiddle, fillLast, fillFirstAndLast, fillAll;
   private static final long a;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = "k2A#o\u0001V~/l!M$E~/\bk2A#e\tWy\u0004c4C*\u0007k2A#h\u0004H";
      int var7 = "k2A#o\u0001V~/l!M$E~/\bk2A#e\tWy\u0004c4C*\u0007k2A#h\u0004H".length();
      char var4 = 16;
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 56;
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
                        var50 = 53;
                        break;
                     case 1:
                        var50 = 99;
                        break;
                     case 2:
                        var50 = 21;
                        break;
                     case 3:
                        var50 = 119;
                        break;
                     case 4:
                        var50 = 17;
                        break;
                     case 5:
                        var50 = 80;
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
                     long var0 = 8886392014867456997L;
                     long var27 = -7095282113610849309L ^ var0;
                     byte var18 = -1;
                     a = var27;
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

                  var5 = "%|\u000fm*O\u000e'y\u0006\t%|\u000fm!O\u00180a";
                  var7 = "%|\u000fm*O\u000e'y\u0006\t%|\u000fm!O\u00180a".length();
                  var4 = '\n';
                  var10 = -1;
            }

            var10000 = 118;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
}






