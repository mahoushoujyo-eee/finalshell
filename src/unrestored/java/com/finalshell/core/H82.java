package com.finalshell.core;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class H82 extends W5 {
   public float S = 0.0F;
   public float T = 1.0F;
   public float I = 1.0F;
   public float i = 0.0F;
   public float l = 0.0F;
   public boolean x = false;
   public boolean f = true;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public H82() {
   }

   public H82(float var1, float var2, float var3, float var4) {
      this.I = var1;
      this.S = var2;
      this.l = var3;
      this.i = var4;
   }

   public void F(float var1) {
      this.S = var1;
   }

   public float T() {
      return this.S;
   }

   public void s(float var1) {
      this.I = var1;
   }

   public float f() {
      return this.I;
   }

   public void Z(float var1) {
      this.l = var1;
   }

   public float S() {
      return this.l;
   }

   public void B(float var1) {
      this.i = var1;
   }

   public float r() {
      return this.i;
   }

   public void W(boolean var1) {
      this.x = var1;
   }

   public boolean x() {
      return this.x;
   }

   public void H(boolean var1) {
      this.f = var1;
   }

   public boolean t() {
      return this.f;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      boolean var38;
      H82 var41;
      String[] var3;
      int var4;
      int var5;
      label146: {
         var4 = var1.getWidth();
         String[] var10000 = W5.q();
         var5 = var1.getHeight();
         var3 = var10000;
         BufferedImage var35 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label146;
            }

            var35 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var35;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      this.l(var1, 0, 0, var4, var5, var6);
      float var8 = (float)Math.sin((double)this.S);
      float var9 = (float)Math.cos((double)this.S);
      int var11 = var4 / 2;
      int var12 = var5 / 2;
      int var13 = 0;
      float var14 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12));
      float var15 = (float)((double)this.I * Math.cos((double)this.S));
      float var16 = (float)((double)this.I * -Math.sin((double)this.S));
      float var17 = this.I + Math.abs(this.l * var14) + this.i * var14;
      int var18 = (int)var17;
      AffineTransform var19 = new AffineTransform();
      Float var20 = new Float();
      int var36 = (this.f) ? 1 : 0;
      if (var3 != null) {
         if (this.f) {
            NM.g(var6, 0, var6.length);
         }

         var36 = 0;
      }

      int var21 = var36;

      label139:
      while (true) {
         var36 = var21;

         label136:
         while (true) {
            if (var36 < var5) {
               var38 = false;
               if (var3 == null) {
                  break;
               }

               int var22 = 0;

               while (var22 < var4) {
                  int var23 = 0;
                  int var24 = 0;
                  int var25 = 0;
                  int var26 = 0;
                  int var27 = 0;
                  var36 = 0;
                  if (var3 == null) {
                     continue label136;
                  }

                  int var28 = 0;

                  label120: {
                     while (var28 < var18) {
                        int var29 = var22;
                        int var30 = var21;
                        float var31 = (float)var28 / (float)var18;
                        var20.x = (float)var22;
                        var20.y = (float)var21;
                        var19.setToIdentity();
                        var19.translate((double)((float)var11 + var31 * var15), (double)((float)var12 + var31 * var16));
                        float var32 = 1.0F - this.i * var31;
                        var19.scale((double)var32, (double)var32);
                        float var42;
                        var36 = (var42 = this.l - 0.0F) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
                        if (var3 == null) {
                           break label120;
                        }

                        if (var3 != null) {
                           if (var36 != 0) {
                              var19.rotate((double)(-this.l * var31));
                           }

                           var19.translate((double)(-var11), (double)(-var12));
                           var19.transform(var20, var20);
                           var29 = (int)var20.x;
                           var30 = (int)var20.y;
                           var36 = var29;
                        }

                        label116: {
                           label154: {
                              if (var3 != null) {
                                 if (var36 >= 0) {
                                    var36 = var29;
                                    if (var3 == null) {
                                       break label116;
                                    }

                                    if (var29 < var4) {
                                       break label154;
                                    }
                                 }

                                 var36 = (this.x) ? 1 : 0;
                              }

                              if (var3 == null) {
                                 break label120;
                              }

                              if (var36 == 0) {
                                 break;
                              }

                              var29 = NM.r(var29, var4);
                           }

                           var36 = var30;
                        }

                        label105: {
                           label155: {
                              if (var3 != null) {
                                 if (var36 >= 0) {
                                    var36 = var30;
                                    if (var3 == null) {
                                       break label105;
                                    }

                                    if (var30 < var5) {
                                       break label155;
                                    }
                                 }

                                 var36 = (this.x) ? 1 : 0;
                              }

                              if (var3 == null) {
                                 break label120;
                              }

                              if (var36 == 0) {
                                 break;
                              }

                              var30 = NM.r(var30, var5);
                           }

                           var27++;
                           var36 = var6[var30 * var4 + var29];
                        }

                        int var33 = var36;
                        var23 += var33 >> a(29296, 6107559316641299611L) & a(26991, 4514215655147579269L);
                        var24 += var33 >> a(4458, 1685855918660116355L) & a(378, 3499936799801757589L);
                        var25 += var33 >> a(30010, 4509896673732082644L) & a(378, 3499936799801757589L);
                        var26 += var33 & a(378, 3499936799801757589L);
                        var28++;
                        if (var3 == null) {
                           break;
                        }
                     }

                     var36 = var27;
                  }

                  label128: {
                     if (var3 != null) {
                        if (var36 == 0) {
                           var7[var13] = var6[var13];
                           if (var3 != null) {
                              break label128;
                           }
                        }

                        var23 = Iw4.e(var23 / var27);
                        var24 = Iw4.e(var24 / var27);
                        var25 = Iw4.e(var25 / var27);
                        var36 = Iw4.e(var26 / var27);
                     }

                     var26 = var36;
                     var7[var13] = var23 << a(1610, 866871657049376934L)
                        | var24 << a(29609, 2721234698614488385L)
                        | var25 << a(19978, 544872417342193895L)
                        | var26;
                  }

                  var13++;
                  var22++;
                  if (var3 == null) {
                     break;
                  }
               }

               var21++;
               if (var3 != null) {
                  continue label139;
               }
            }

            var41 = this;
            if (var3 == null) {
               break label139;
            }

            var38 = this.f;
            break;
         }

         if (var38) {
            NM.L(var7, 0, var6.length);
         }

         var41 = this;
         break;
      }

      var41.E(var2, 0, 0, var4, var5, var7);
      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20202;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0018fsm*@z.ciq%Oy/x(1+".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 125;
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
         var10007 = 125;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 39;
               break;
            case 1:
               var50 = 119;
               break;
            case 2:
               var50 = 123;
               break;
            case 3:
               var50 = 98;
               break;
            case 4:
               var50 = 120;
               break;
            case 5:
               var50 = 112;
               break;
            default:
               var50 = 104;
         }
      } else {
         var34 = 125;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 2132268327520412337L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "¹ë\u0005ê·?\u0085Ë°«\"\u009cú£\u009e2ëh5ÜJÉ\u009fàÌ\u001eÜ\u009d\u0085\u0092}\"\u001cv\u008b3x/\u0099m=X\u0081êû+íÛ";
            int var13 = "¹ë\u0005ê·?\u0085Ë°«\"\u009cú£\u009e2ëh5ÜJÉ\u009fàÌ\u001eÜ\u009d\u0085\u0092}\"\u001cv\u008b3x/\u0099m=X\u0081êû+íÛ".length();
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

                        var12 = "I\u0094ýÓÃãê\u000f~E_|\u0080<¢^";
                        var13 = "I\u0094ýÓÃãê\u000f~E_|\u0080<¢^".length();
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
         var10007 = 125;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 39;
               break;
            case 1:
               var50 = 119;
               break;
            case 2:
               var50 = 123;
               break;
            case 3:
               var50 = 98;
               break;
            case 4:
               var50 = 120;
               break;
            case 5:
               var50 = 112;
               break;
            default:
               var50 = 104;
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
                  var50 = 39;
                  break;
               case 1:
                  var50 = 119;
                  break;
               case 2:
                  var50 = 123;
                  break;
               case 3:
                  var50 = 98;
                  break;
               case 4:
                  var50 = 120;
                  break;
               case 5:
                  var50 = 112;
                  break;
               default:
                  var50 = 104;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 2132268327520412337L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "¹ë\u0005ê·?\u0085Ë°«\"\u009cú£\u009e2ëh5ÜJÉ\u009fàÌ\u001eÜ\u009d\u0085\u0092}\"\u001cv\u008b3x/\u0099m=X\u0081êû+íÛ";
               int var5 = "¹ë\u0005ê·?\u0085Ë°«\"\u009cú£\u009e2ëh5ÜJÉ\u009fàÌ\u001eÜ\u009d\u0085\u0092}\"\u001cv\u008b3x/\u0099m=X\u0081êû+íÛ".length();
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

                           var4 = "I\u0094ýÓÃãê\u000f~E_|\u0080<¢^";
                           var5 = "I\u0094ýÓÃãê\u000f~E_|\u0080<¢^".length();
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
                  var50 = 39;
                  break;
               case 1:
                  var50 = 119;
                  break;
               case 2:
                  var50 = 123;
                  break;
               case 3:
                  var50 = 98;
                  break;
               case 4:
                  var50 = 120;
                  break;
               case 5:
                  var50 = 112;
                  break;
               default:
                  var50 = 104;
            }
         }
      }
   }
}





