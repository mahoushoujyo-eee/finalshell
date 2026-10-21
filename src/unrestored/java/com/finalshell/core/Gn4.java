package com.finalshell.core;

import java.awt.Rectangle;

public class Gn4 extends GT3 {
   public float p = (float) (Math.PI * 3.0 / 4.0);
   public float j = (float) (Math.PI / 6);
   public boolean U = false;
   public float k = 3.0F;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void b(float var1) {
      this.p = var1;
   }

   public float l() {
      return this.p;
   }

   public void k(float var1) {
      this.j = var1;
   }

   public float Q() {
      return this.j;
   }

   public void P(float var1) {
      this.k = 3.0F * var1;
   }

   public float G() {
      return this.k / 3.0F;
   }

   public void V(boolean var1) {
      this.U = var1;
   }

   public boolean V() {
      return this.U;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var37;
      int var38;
      String[] var10000 = W5.q();
      int var6 = 0;
      int[] var7 = new int[var1 * var2];
      int var9 = var1;
      int[] var8 = new int[var1 * var2];
      int var11 = 0;
      String[] var5 = var10000;

      while (var11 < var3.length) {
         var8[var11] = Iw4.g(var3[var11]);
         var11++;
         if (var5 == null) {
            break;
         }
      }

      int var14 = (int)(Math.cos((double)this.p) * Math.cos((double)this.j) * 255.9F);
      int var15 = (int)(Math.sin((double)this.p) * Math.cos((double)this.j) * 255.9F);
      int var16 = (int)(Math.sin((double)this.j) * 255.9F);
      int var13 = (int)(1530.0F / this.k);
      int var17 = var13 * var13;
      int var18 = var13 * var16;
      int var21 = var16;
      int var22 = 0;
      int var23 = 0;

      while (var23 < var2) {
         int var24 = var22;
         int var25 = var22 + var9;
         int var26 = var25 + var9;
         int var27 = 0;

         while (true) {
            if (var27 < var1) {
               var37 = var23;
               if (var5 == null) {
                  break;
               }

               int var20;
               label89: {
                  label88:
                  if (var5 != null) {
                     if (var23 != 0) {
                        var37 = var23;
                        if (var5 == null) {
                           break label88;
                        }

                        if (var23 < var2 - 2) {
                           var37 = var27;
                           if (var5 == null) {
                              break label88;
                           }

                           if (var27 != 0) {
                              var37 = var27;
                              if (var5 == null) {
                                 break label88;
                              }

                              if (var27 < var1 - 2) {
                                 int var12;
                                 var11 = var8[var24 - 1] + var8[var25 - 1] + var8[var26 - 1] - var8[var24 + 1] - var8[var25 + 1] - var8[var26 + 1];
                                 var12 = var8[var26 - 1] + var8[var26] + var8[var26 + 1] - var8[var24 - 1] - var8[var24] - var8[var24 + 1];
                                 var38 = var11;
                                 label77:
                                 if (var5 != null) {
                                    if (var11 == 0) {
                                       var38 = var12;
                                       if (var5 == null) {
                                          break label77;
                                       }

                                       if (var12 == 0) {
                                          var20 = var21;
                                          if (var5 != null) {
                                             break label89;
                                          }
                                       }
                                    }

                                    var38 = var11 * var14 + var12 * var15 + var18;
                                 }

                                 int var19 = var38;
                                 if (var5 != null) {
                                    if (var38 < 0) {
                                       var20 = 0;
                                       if (var5 != null) {
                                          break label89;
                                       }
                                    }

                                    var38 = (int)((double)var19 / Math.sqrt((double)(var11 * var11 + var12 * var12 + var17)));
                                 }

                                 var20 = var38;
                                 if (var5 != null) {
                                    break label89;
                                 }
                              }
                           }
                        }
                     }

                     var37 = var21;
                  }

                  var20 = var37;
               }

               label57: {
                  label56: {
                     int var39 = (this.U) ? 1 : 0;
                     if (var5 != null) {
                        if (!this.U) {
                           break label56;
                        }

                        var39 = var3[var6];
                     }

                     int var28 = var39;
                     int var29 = var28 & a(31222, 8109987245816246867L);
                     int var30 = var28 >> a(15548, 9074451703399986975L) & a(32085, 6156801358014052081L);
                     int var31 = var28 >> a(20873, 7363365684734122536L) & a(1793, 4995917531087867041L);
                     int var32 = var28 & a(1793, 4995917531087867041L);
                     var30 = var30 * var20 >> a(11621, 2035294097463355075L);
                     var31 = var31 * var20 >> a(11621, 2035294097463355075L);
                     var32 = var32 * var20 >> a(11621, 2035294097463355075L);
                     var7[var6++] = var29 | var30 << a(26562, 1042989956288998496L) | var31 << a(11621, 2035294097463355075L) | var32;
                     if (var5 != null) {
                        break label57;
                     }
                  }

                  var7[var6++] = a(30919, 3597071436533298016L) | var20 << a(26562, 1042989956288998496L) | var20 << a(11621, 2035294097463355075L) | var20;
               }

               var27++;
               var24++;
               var25++;
               var26++;
               if (var5 != null) {
                  continue;
               }
            }

            var23++;
            var37 = var22 + var9;
            break;
         }

         var22 = var37;
         if (var5 == null) {
            break;
         }
      }

      return var7;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2983;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0010\"\u001f]S,\u001fl\u0013\u000bSU%\tmxH".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 39;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 39;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 100;
               break;
            case 1:
               var50 = 113;
               break;
            case 2:
               var50 = 65;
               break;
            case 3:
               var50 = 22;
               break;
            case 4:
               var50 = 29;
               break;
            case 5:
               var50 = 113;
               break;
            default:
               var50 = 93;
         }
      } else {
         var34 = 39;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8445393072392395988L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "DPÐ\u0085Ý;/´HÑüàH¾ú\u001f(Þ\u009f¯|\u00ad.\u0087\u009f\u0002#²ýoªÚìå\u009cn\u001cækÛamIR,\u0099°¤";
            int var13 = "DPÐ\u0085Ý;/´HÑüàH¾ú\u001f(Þ\u009f¯|\u00ad.\u0087\u009f\u0002#²ýoªÚìå\u009cn\u001cækÛamIR,\u0099°¤".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "<|[§!\u009e\u0086ôä,«[\u0093ÝÐ\u008a";
                        var13 = "<|[§!\u009e\u0086ôä,«[\u0093ÝÐ\u008a".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 39;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 100;
               break;
            case 1:
               var50 = 113;
               break;
            case 2:
               var50 = 65;
               break;
            case 3:
               var50 = 22;
               break;
            case 4:
               var50 = 29;
               break;
            case 5:
               var50 = 113;
               break;
            default:
               var50 = 93;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 100;
                  break;
               case 1:
                  var50 = 113;
                  break;
               case 2:
                  var50 = 65;
                  break;
               case 3:
                  var50 = 22;
                  break;
               case 4:
                  var50 = 29;
                  break;
               case 5:
                  var50 = 113;
                  break;
               default:
                  var50 = 93;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8445393072392395988L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "DPÐ\u0085Ý;/´HÑüàH¾ú\u001f(Þ\u009f¯|\u00ad.\u0087\u009f\u0002#²ýoªÚìå\u009cn\u001cækÛamIR,\u0099°¤";
               int var5 = "DPÐ\u0085Ý;/´HÑüàH¾ú\u001f(Þ\u009f¯|\u00ad.\u0087\u009f\u0002#²ýoªÚìå\u009cn\u001cækÛamIR,\u0099°¤".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "<|[§!\u009e\u0086ôä,«[\u0093ÝÐ\u008a";
                           var5 = "<|[§!\u009e\u0086ôä,«[\u0093ÝÐ\u008a".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 100;
                  break;
               case 1:
                  var50 = 113;
                  break;
               case 2:
                  var50 = 65;
                  break;
               case 3:
                  var50 = 22;
                  break;
               case 4:
                  var50 = 29;
                  break;
               case 5:
                  var50 = 113;
                  break;
               default:
                  var50 = 93;
            }
         }
      }
   }
}





