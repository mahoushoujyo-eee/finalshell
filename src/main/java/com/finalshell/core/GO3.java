package com.finalshell.core;

import java.awt.Rectangle;

public class GO3 extends Gl4 {
   public static String c;
   public static long e;

   public GO3() {
      this.b = -1;
   }

   @Override
   protected int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      String[] var10000 = W5.q();
      int var6 = 0;
      String[] var5 = var10000;
      int[] var7 = new int[var1 * var2];
      int var8 = 0;

      label136:
      while (true) {
         int var18 = var8;

         label134:
         while (var18 < var2) {
            int var9 = 0;

            while (var9 < var1) {
               int var10 = var3[var8 * var1 + var9];
               if (var5 != null) {
                  var18 = (this.F.v(var10)) ? 1 : 0;
                  if (var5 == null) {
                     continue label134;
                  }

                  label64:
                  if (var18 != 0) {
                     int var11 = 0;
                     int var12 = -1;

                     label123:
                     while (true) {
                        int var19 = var12;

                        int var10001;
                        label120:
                        while (true) {
                           if (var19 <= 1) {
                              int var13 = var8 + var12;
                              if (var5 != null) {
                                 var20 = 0;
                                 var10001 = var13;
                                 if (var5 == null) {
                                    break;
                                 }

                                 label114:
                                 if (0 <= var13) {
                                    int var21 = var13;
                                    var10001 = var2;
                                    if (var5 != null) {
                                       if (var13 >= var2) {
                                          break label114;
                                       }

                                       var21 = var13;
                                       var10001 = var1;
                                    }

                                    int var14 = var21 * var10001;
                                    int var15 = -1;

                                    while (var15 <= 1) {
                                       int var16 = var9 + var15;
                                       var19 = var12;
                                       if (var5 == null) {
                                          continue label120;
                                       }

                                       label104: {
                                          label149: {
                                             label102:
                                             if (var5 != null) {
                                                if (var12 == 0) {
                                                   var19 = var15;
                                                   if (var5 == null) {
                                                      break label102;
                                                   }

                                                   if (var15 == 0) {
                                                      break label149;
                                                   }
                                                }

                                                var19 = 0;
                                             }

                                             label150: {
                                                var10001 = var16;
                                                if (var5 != null) {
                                                   if (var19 > var16) {
                                                      break label149;
                                                   }

                                                   var19 = var16;
                                                   if (var5 == null) {
                                                      break label150;
                                                   }

                                                   var10001 = var1;
                                                }

                                                if (var19 >= var10001) {
                                                   break label149;
                                                }

                                                var19 = var3[var14 + var16];
                                             }

                                             int var17 = var19;
                                             if (this.F.v(var17)) {
                                                var11++;
                                             }

                                             if (var5 != null) {
                                                break label104;
                                             }
                                          }

                                          var11++;
                                       }

                                       var15++;
                                       if (var5 == null) {
                                          break;
                                       }
                                    }
                                 }

                                 var12++;
                              }

                              if (var5 != null) {
      int var20;
      int var20;
                                 continue label123;
                              }
                           }

                           var20 = var11;
                           if (var5 == null) {
                              break label123;
                           }

                           var10001 = (int)e;
                           break;
                        }

                        if (var20 != var10001) {
                           break label64;
                        }

                        var20 = this.b;
                        break;
                     }

                     var10 = var20;
                  }

                  var7[var6++] = var10;
                  var9++;
               }

               if (var5 == null) {
                  break;
               }
            }

            var8++;
            if (var5 == null) {
               return var7;
            }
            continue label136;
         }

         return var7;
      }
   }

   @Override
   public String toString() {
      return c;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "]4M\u0017ONnP(W\u001aTY$1s\r".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 19;
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
         var10007 = 19;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 12;
               break;
            case 1:
               var21 = 78;
               break;
            case 2:
               var21 = 48;
               break;
            case 3:
               var21 = 101;
               break;
            case 4:
               var21 = 46;
               break;
            case 5:
               var21 = 36;
               break;
            default:
               var21 = 82;
         }
      } else {
         var13 = 19;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            c = var16;
            long var3 = 4091875465433889778L;
            long var12 = 4834713935000288251L ^ var3;
            var8 = -1;
            e = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 19;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 12;
               break;
            case 1:
               var21 = 78;
               break;
            case 2:
               var21 = 48;
               break;
            case 3:
               var21 = 101;
               break;
            case 4:
               var21 = 46;
               break;
            case 5:
               var21 = 36;
               break;
            default:
               var21 = 82;
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
                  var21 = 12;
                  break;
               case 1:
                  var21 = 78;
                  break;
               case 2:
                  var21 = 48;
                  break;
               case 3:
                  var21 = 101;
                  break;
               case 4:
                  var21 = 46;
                  break;
               case 5:
                  var21 = 36;
                  break;
               default:
                  var21 = 82;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               c = var15;
               long var0 = 4091875465433889778L;
               long var11 = 4834713935000288251L ^ var0;
               var6 = -1;
               e = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 12;
                  break;
               case 1:
                  var21 = 78;
                  break;
               case 2:
                  var21 = 48;
                  break;
               case 3:
                  var21 = 101;
                  break;
               case 4:
                  var21 = 46;
                  break;
               case 5:
                  var21 = 36;
                  break;
               default:
                  var21 = 82;
            }
         }
      }
   }
}






