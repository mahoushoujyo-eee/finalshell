package com.finalshell.core;

import java.awt.Rectangle;

public class Y62 extends GT3 {
   public static String a;
   public static long b;

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      String[] var10000 = W5.q();
      int var6 = 0;
      int[] var7 = new int[var1 * var2];
      int var8 = 0;
      String[] var5 = var10000;

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

                  int var10 = (int)b;
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

                                       var10 = Iw4.P(var20, var10001, 3);
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

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Z\u001ezo^4$`\u001bbh\u001c".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 120;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 120;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 96;
               break;
            case 1:
               var21 = 10;
               break;
            case 2:
               var21 = 119;
               break;
            case 3:
               var21 = 101;
               break;
            case 4:
               var21 = 9;
               break;
            case 5:
               var21 = 1;
               break;
            default:
               var21 = 61;
         }
      } else {
         var13 = 120;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 5237242211458118435L;
            long var12 = -4013801432655039709L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 120;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 96;
               break;
            case 1:
               var21 = 10;
               break;
            case 2:
               var21 = 119;
               break;
            case 3:
               var21 = 101;
               break;
            case 4:
               var21 = 9;
               break;
            case 5:
               var21 = 1;
               break;
            default:
               var21 = 61;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 96;
                  break;
               case 1:
                  var21 = 10;
                  break;
               case 2:
                  var21 = 119;
                  break;
               case 3:
                  var21 = 101;
                  break;
               case 4:
                  var21 = 9;
                  break;
               case 5:
                  var21 = 1;
                  break;
               default:
                  var21 = 61;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 5237242211458118435L;
               long var11 = -4013801432655039709L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 96;
                  break;
               case 1:
                  var21 = 10;
                  break;
               case 2:
                  var21 = 119;
                  break;
               case 3:
                  var21 = 101;
                  break;
               case 4:
                  var21 = 9;
                  break;
               case 5:
                  var21 = 1;
                  break;
               default:
                  var21 = 61;
            }
         }
      }
   }
}





