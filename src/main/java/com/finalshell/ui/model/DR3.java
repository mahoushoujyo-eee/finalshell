package com.finalshell.ui.model;

import com.finalshell.core.Xv2;

public final class DR3 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static DR3 random;
   public static DR3 horizontal;
   public static DR3 vertical;
   public static DR3 up;
   public static DR3 down;
   public static DR3 left;
   public static DR3 right;
   public static long[] a;
   public static Integer[] b;

   public static DR3[] values() {
      return (DR3[])com.finalshell.reflect.Ref.cloneObject(o);
   }

   public static DR3 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public DR3(String var1, int var2) {
   }

   public boolean V() {
      String[] var1 = Xv2.X$arrString();
      boolean var10000 = this.equals(horizontal);
      if (var1 != null) {
         if (!var10000) {
            var10000 = this.equals(left);
            if (var1 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = this.equals(right);
               if (var1 == null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public boolean Z() {
      String[] var1 = Xv2.X$arrString();
      boolean var10000 = this.equals(vertical);
      if (var1 != null) {
         if (!var10000) {
            var10000 = this.equals(up);
            if (var1 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = this.equals(down);
               if (var1 == null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2205;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var8 = new String[7];
      int var12 = 0;
      String var11 = "~YH\u0004\u0006hWQ\u000e\nX\u0002oF\blSM\u001e\fVfv\nrYM\u0003\u001fZinWS";
      int var13 = "~YH\u0004\u0006hWQ\u000e\nX\u0002oF\blSM\u001e\fVfv\nrYM\u0003\u001fZinWS".length();
      char var10 = 4;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 27;
         String var10001 = var11.substring(++var16, var16 + var10);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 1;
                        break;
                     case 1:
                        var58 = 45;
                        break;
                     case 2:
                        var58 = 36;
                        break;
                     case 3:
                        var58 = 113;
                        break;
                     case 4:
                        var58 = 126;
                        break;
                     case 5:
                        var58 = 46;
                        break;
                     default:
                        var58 = 28;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var39;
                  if ((var16 += var10) >= var13) {
                     long var0 = 4490621120676421447L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "ó¹Í§\u001fjZÞ/\u0087cD\u0012ó\u0001\\´ºdLK©ä\u0019";
                     int var5 = "ó¹Í§\u001fjZÞ/\u0087cD\u0012ó\u0001\\´ºdLK©ä\u0019".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var0;
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     a = var6;
                     b = new Integer[3];
                     random = new DR3(var8[1], 0);
                     horizontal = new DR3(var8[4], 1);
                     vertical = new DR3(var8[3], 2);
                     up = new DR3(var8[2], 3);
                     down = new DR3(var8[0], 4);
                     left = new DR3(var8[6], 5);
                     right = new DR3(var8[5], a(13255, 1058623017906682712L));
                     o = q();
                     return;
                  }

                  var10 = var11.charAt(var16);
                  break;
               default:
                  var8[var12++] = var39;
                  if ((var16 += var10) < var13) {
                     var10 = var11.charAt(var16);
                     continue label61;
                  }

                  var11 = "\u0014#$~m\u0004\n/%b";
                  var13 = "\u0014#$~m\u0004\n/%b".length();
                  var10 = 5;
                  var16 = -1;
            }

            var10000 = 103;
            var10001 = var11.substring(++var16, var16 + var10);
            var10002 = 0;
         }
      }
   }
   private static Object o;
}







