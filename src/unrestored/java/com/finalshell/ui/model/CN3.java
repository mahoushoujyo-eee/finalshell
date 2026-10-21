package com.finalshell.ui.model;

public final class CN3 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static CN3 mouseClicked;
   public static CN3 mousePressed;
   public static CN3 mouseDragged;
   public static CN3 mouseReleased;
   public static CN3 mouseEntered;
   public static CN3 mouseExited;
   public static CN3 mouseMoved;
   public static CN3 mouseWheelMoved;
   public static long[] b;
   public static Integer[] c;

   public static CN3[] values() {
      return (CN3[])a.clone();
   }

   public static CN3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public CN3(String var1, int var2) {
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23449;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var8 = new String[8];
      int var12 = 0;
      String var11 = "\f9vv\u0018Mh\u00001d`\u0019\n\f9vv\u0018Du\u00173g\u000f\f9vv\u0018^r\u00043oH\u0012\u007f\u007f\u0005\r\f9vv\u0018[\u007f\r3bv\u0018m\f\f9vv\u0018Lt\u00153q`\u0019\f\f9vv\u0018Yh\u0004%p`\u0019";
      int var13 = "\f9vv\u0018Mh\u00001d`\u0019\n\f9vv\u0018Du\u00173g\u000f\f9vv\u0018^r\u00043oH\u0012\u007f\u007f\u0005\r\f9vv\u0018[\u007f\r3bv\u0018m\f\f9vv\u0018Lt\u00153q`\u0019\f\f9vv\u0018Yh\u0004%p`\u0019"
         .length();
      char var10 = '\f';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 123;
         String var10001 = var11.substring(++var17, var17 + var10);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 26;
                        break;
                     case 1:
                        var65 = 45;
                        break;
                     case 2:
                        var65 = 120;
                        break;
                     case 3:
                        var65 = 126;
                        break;
                     case 4:
                        var65 = 6;
                        break;
                     case 5:
                        var65 = 114;
                        break;
                     default:
                        var65 = 97;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var44;
                  if ((var17 += var10) >= var13) {
                     long var0 = 5280913256162224565L;
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "×Lp%Æì\u0097¬>dÅÊ\u0019¼\tPøÐ¸~\u008dD\u0000-";
                     int var5 = "×Lp%Æì\u0097¬>dÅÊ\u0019¼\tPøÐ¸~\u008dD\u0000-".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    b = var6;
                                    c = new Integer[5];
                                    mouseClicked = new CN3(var8[7], 0);
                                    mousePressed = new CN3(var8[5], 1);
                                    mouseDragged = new CN3(var8[0], 2);
                                    mouseReleased = new CN3(var8[3], 3);
                                    mouseEntered = new CN3(var8[4], 4);
                                    mouseExited = new CN3(var8[6], 5);
                                    mouseMoved = new CN3(var8[1], a(9606, 5253868559035006495L));
                                    mouseWheelMoved = new CN3(var8[2], a(23327, 3952784443236679810L));
                                    a = P();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "UNîX÷lË\u009dé\u0082\b\\§ãi0";
                                 var5 = "UNîX÷lË\u009dé\u0082\b\\§ãi0".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var8[var12++] = var44;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label70;
                  }

                  var11 = "\u00041~~\u0010Dj\u0000*ni\f\u00041~~\u0010B~\u0000=`h\u0011";
                  var13 = "\u00041~~\u0010Dj\u0000*ni\f\u00041~~\u0010B~\u0000=`h\u0011".length();
                  var10 = 11;
                  var17 = -1;
            }

            var10000 = 115;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
}







