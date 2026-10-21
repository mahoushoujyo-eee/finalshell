package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("TooltipWay")
public final class WF extends Enum {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static WF up;
   public static WF left;
   public static WF leading;
   public static WF down;
   public static WF right;
   public static WF trailing;
   public static long a;

   public static WF[] values() {
      return (WF[])S.clone();
   }

   public static WF valueOf(String var0) {
      return Enum.valueOf(WF.class, var0);
   }

   public WF(String var1, int var2) {
      super(var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = ">X\b?ZN\u000bQ(\u0000,\u0007'MN\u0006T/\t\u0004'MI\u0016";
      int var7 = ">X\b?ZN\u000bQ(\u0000,\u0007'MN\u0006T/\t\u0004'MI\u0016".length();
      char var4 = 2;
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 57;
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
                        var50 = 114;
                        break;
                     case 1:
                        var50 = 17;
                        break;
                     case 2:
                        var50 = 22;
                        break;
                     case 3:
                        var50 = 91;
                        break;
                     case 4:
                        var50 = 4;
                        break;
                     case 5:
                        var50 = 120;
                        break;
                     default:
                        var50 = 87;
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
                     long var0 = 6343215426344666518L;
                     long var27 = -8067621276009806448L ^ var0;
                     byte var18 = -1;
                     a = var27;
                     up = new WF(var2[0], 0);
                     left = new WF(var2[3], 1);
                     leading = new WF(var2[2], 2);
                     down = new WF(var2[5], 3);
                     right = new WF(var2[4], 4);
                     trailing = new WF(var2[1], 5);
                     S = x();
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

                  var5 = "E=4v5\u0004S;$p";
                  var7 = "E=4v5\u0004S;$p".length();
                  var4 = 5;
                  var10 = -1;
            }

            var10000 = 69;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
}







