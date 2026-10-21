package com;

import java.awt.Rectangle;

public class ym_4 extends gT_3 {
   private static final String a;

   @Override
   protected int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var6 = 0;
      String[] var10000 = com.W5.q();
      int[] var7 = new int[var1 * var2];
      String[] var5 = var10000;
      int var8 = 0;

      label95:
      while (true) {
         int var16 = var8;

         label93:
         while (var16 < var2) {
            int var9 = 0;

            label90:
            while (true) {
               int var17 = var9;
               int var10001 = var1;

               label88:
               while (true) {
                  if (var17 >= var10001) {
                     break label90;
                  }

                  int var10 = -1;
                  var16 = -1;
                  if (var5 == null) {
                     continue label93;
                  }

                  int var11 = -1;

                  label85:
                  while (true) {
                     int var18 = var11;
                     var10001 = 1;

                     label83:
                     while (true) {
                        if (var18 > var10001) {
                           break label85;
                        }

                        int var12 = var8 + var11;
                        if (var5 != null) {
                           var17 = 0;
                           var10001 = var12;
                           if (var5 == null) {
                              continue label88;
                           }

                           label61:
                           if (0 <= var12) {
                              int var19 = var12;
                              var10001 = var2;
                              if (var5 != null) {
                                 if (var12 >= var2) {
                                    break label61;
                                 }

                                 var19 = var12;
                                 var10001 = var1;
                              }

                              int var13 = var19 * var10001;
                              int var14 = -1;

                              while (var14 <= 1) {
                                 int var15 = var9 + var14;
                                 if (var5 != null) {
                                    var18 = 0;
                                    var10001 = var15;
                                    if (var5 == null) {
                                       continue label83;
                                    }

                                    label69:
                                    if (0 <= var15) {
                                       int var20 = var15;
                                       var10001 = var1;
                                       if (var5 != null) {
                                          if (var15 >= var1) {
                                             break label69;
                                          }

                                          var20 = var10;
                                          var10001 = var3[var13 + var15];
                                       }

                                       var10 = iw_4.P(var20, var10001, 2);
                                    }

                                    var14++;
                                 }

                                 if (var5 == null) {
                                    break;
                                 }
                              }
                           }

                           var11++;
                        }

                        if (var5 == null) {
                           break label85;
                        }
                        break;
                     }
                  }

                  var7[var6++] = var10;
                  var9++;
                  if (var5 == null) {
                     break label90;
                  }
                  break;
               }
            }

            var8++;
            if (var5 == null) {
               return var7;
            }
            continue label95;
         }

         return var7;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ",1'n'*\u0011\u00004?ie".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 89;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 89;
         var10006 = var0;
      } else {
         var6 = 89;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 89;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 55;
               break;
            case 1:
               var23 = 4;
               break;
            case 2:
               var23 = 11;
               break;
            case 3:
               var23 = 69;
               break;
            case 4:
               var23 = 81;
               break;
            case 5:
               var23 = 62;
               break;
            default:
               var23 = 33;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





