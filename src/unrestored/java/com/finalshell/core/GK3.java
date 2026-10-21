package com.finalshell.core;

import java.awt.Rectangle;

public class GK3 extends Gl4 {
   public int u;
   public static String c;
   public static long e;

   public GK3() {
      this.u = (int)e;
      this.b = -1;
   }

   public void N(int var1) {
      this.u = var1;
   }

   public int v() {
      return this.u;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var24;
      String[] var10000 = W5.q();
      int[] var6 = new int[var1 * var2];
      String[] var5 = var10000;
      int var7 = 0;

      label164:
      while (true) {
         int var20 = var7;

         label162:
         while (var20 < this.W) {
            int var8 = 0;
            int var21 = var7;
            if (var5 != null) {
               if (var7 > 0) {
                  int[] var9 = var3;
                  var3 = var6;
                  var6 = var9;
               }

               var21 = 0;
            }

            int var19 = var21;

            label159:
            while (true) {
               int var22 = var19;

               label157:
               while (true) {
                  if (var22 >= var2) {
                     break label159;
                  }

                  var20 = 0;
                  if (var5 == null) {
                     continue label162;
                  }

                  int var10 = 0;

                  while (var10 < var1) {
                     int var11 = var3[var19 * var1 + var10];
                     if (var5 != null) {
                        var22 = (this.F.v(var11)) ? 1 : 0;
                        if (var5 == null) {
                           continue label157;
                        }

                        if (var22 != 0) {
                           int var12 = 0;
                           int var13 = -1;

                           int var10001;
                           label146:
                           while (true) {
                              int var23 = var13;

                              label143:
                              while (var23 <= 1) {
                                 int var14 = var19 + var13;
                                 if (var5 != null) {
                                    var24 = 0;
                                    var10001 = var14;
                                    if (var5 == null) {
                                       break label146;
                                    }

                                    label107:
                                    if (0 <= var14) {
                                       int var25 = var14;
                                       var10001 = var2;
                                       if (var5 != null) {
                                          if (var14 >= var2) {
                                             break label107;
                                          }

                                          var25 = var14;
                                          var10001 = var1;
                                       }

                                       int var15 = var25 * var10001;
                                       int var16 = -1;

                                       while (var16 <= 1) {
                                          int var17 = var10 + var16;
                                          var23 = var13;
                                          if (var5 == null) {
                                             continue label143;
                                          }

                                          label133: {
                                             label178: {
                                                label131:
                                                if (var5 != null) {
                                                   if (var13 == 0) {
                                                      var23 = var16;
                                                      if (var5 == null) {
                                                         break label131;
                                                      }

                                                      if (var16 == 0) {
                                                         break label178;
                                                      }
                                                   }

                                                   var23 = 0;
                                                }

                                                label179: {
                                                   var10001 = var17;
                                                   if (var5 != null) {
                                                      if (var23 > var17) {
                                                         break label178;
                                                      }

                                                      var23 = var17;
                                                      if (var5 == null) {
                                                         break label179;
                                                      }

                                                      var10001 = var1;
                                                   }

                                                   if (var23 >= var10001) {
                                                      break label178;
                                                   }

                                                   var23 = var3[var15 + var17];
                                                }

                                                int var18 = var23;
                                                if (var5 == null) {
                                                   break label133;
                                                }

                                                if (!this.F.v(var18)) {
                                                   var12++;
                                                }
                                             }

                                             var16++;
                                          }

                                          if (var5 == null) {
                                             break;
                                          }
                                       }
                                    }

                                    var13++;
                                 }

                                 if (var5 != null) {
                                    continue label146;
                                 }
                                 break;
                              }

                              var24 = var12;
                              var10001 = this.u;
                              break;
                           }

                           label89:
                           if (var24 >= var10001) {
                              GK3 var26 = this;
                              if (var5 != null) {
                                 if (this.a != null) {
                                    var11 = this.a.D((float)var7 / (float)this.W);
                                    if (var5 != null) {
                                       break label89;
                                    }
                                 }

                                 var26 = this;
                              }

                              var11 = var26.b;
                           }
                        }

                        var6[var8++] = var11;
                        var10++;
                     }

                     if (var5 == null) {
                        break;
                     }
                  }

                  var19++;
                  if (var5 == null) {
                     break label159;
                  }
                  break;
               }
            }

            var7++;
            if (var5 == null) {
               return var6;
            }
            continue label164;
         }

         return var6;
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
      char[] var10003 = "\u0001j\u0011f\nIZ\u0006q\u0010c\u001d\u001e[m".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 43;
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
         var10007 = 43;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 104;
               break;
            case 1:
               var21 = 40;
               break;
            case 2:
               var21 = 84;
               break;
            case 3:
               var21 = 44;
               break;
            case 4:
               var21 = 83;
               break;
            case 5:
               var21 = 27;
               break;
            default:
               var21 = 94;
         }
      } else {
         var13 = 43;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            c = var16;
            long var3 = 2338073821720663398L;
            long var12 = -1671325458160102044L ^ var3;
            var8 = -1;
            e = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 43;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 104;
               break;
            case 1:
               var21 = 40;
               break;
            case 2:
               var21 = 84;
               break;
            case 3:
               var21 = 44;
               break;
            case 4:
               var21 = 83;
               break;
            case 5:
               var21 = 27;
               break;
            default:
               var21 = 94;
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
                  var21 = 104;
                  break;
               case 1:
                  var21 = 40;
                  break;
               case 2:
                  var21 = 84;
                  break;
               case 3:
                  var21 = 44;
                  break;
               case 4:
                  var21 = 83;
                  break;
               case 5:
                  var21 = 27;
                  break;
               default:
                  var21 = 94;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               c = var15;
               long var0 = 2338073821720663398L;
               long var11 = -1671325458160102044L ^ var0;
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
                  var21 = 104;
                  break;
               case 1:
                  var21 = 40;
                  break;
               case 2:
                  var21 = 84;
                  break;
               case 3:
                  var21 = 44;
                  break;
               case 4:
                  var21 = 83;
                  break;
               case 5:
                  var21 = 27;
                  break;
               default:
                  var21 = 94;
            }
         }
      }
   }
}





