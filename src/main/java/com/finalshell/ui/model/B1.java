package com.finalshell.ui.model;

import com.finalshell.core.LB3;
import com.finalshell.ui.dialog.Ds2;

public final class B1 {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static B1 up;
   public static B1 down;
   public static B1 left;
   public static B1 right;
   public static B1[] c;

   public static B1[] values() {
      return (B1[])c.clone();
   }

   public static B1 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public B1(String var1, int var2) {
   }

   public B1[] r() {
      int[] var1 = Ds2.U$arrint();
      int var10000 = LB3.z[this.ordinal()];
      if (var1 == null) {
         switch (var10000) {
            case 1:
               var10000 = 4;
               break;
            case 2:
               return new B1[]{down, up, right, left};
            case 3:
               return new B1[]{left, right, down, up};
            case 4:
               return new B1[]{right, left, down, up};
            default:
               return null;
         }
      }

      B1[] var2 = new B1[var10000];
      var2[0] = up;
      var2[1] = down;
      var2[2] = right;
      var2[3] = left;
      return var2;
   }

   public int m(boolean var1) {
      int[] var2 = Ds2.U$arrint();
      int var10000 = LB3.z[this.ordinal()];
      if (var2 == null) {
         switch (var10000) {
            case 1:
               return 3;
            case 2:
               return 1;
            case 3:
               var10000 = (var1) ? 1 : 0;
               if (var2 == null) {
                  var10000 = var1 != 0 ? 4 : 2;
               }

               return var10000;
            case 4:
               var10000 = (var1) ? 1 : 0;
               if (var2 == null) {
                  var10000 = var1 != 0 ? 2 : 4;
               }

               return var10000;
            default:
               var10000 = -1;
         }
      }

      return var10000;
   }

   public static B1[] h() {
      return new B1[]{up, down, left, right};
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "\u007f\u0001\fF\u0002f\u0014";
      int var5 = "\u007f\u0001\fF\u0002f\u0014".length();
      char var2 = 4;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 27;
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
                        var46 = 8;
                        break;
                     case 1:
                        var46 = 127;
                        break;
                     case 2:
                        var46 = 113;
                        break;
                     case 3:
                        var46 = 41;
                        break;
                     case 4:
                        var46 = 13;
                        break;
                     case 5:
                        var46 = 120;
                        break;
                     default:
                        var46 = 14;
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
                     up = new B1(var0[1], 0);
                     down = new B1(var0[3], 1);
                     left = new B1(var0[0], 2);
                     right = new B1(var0[2], 3);
                     c = h();
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

                  var3 = "t\u0018\u0018Ow\u0004b\u001e\bI";
                  var5 = "t\u0018\u0018Ow\u0004b\u001e\bI".length();
                  var2 = 5;
                  var8 = -1;
            }

            var10000 = 14;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}







