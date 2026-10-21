package com.finalshell.ui.model;

public final class D4 {
public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static D4 VOID;
   public static D4 BYTE;
   public static D4 SHORT;
   public static D4 CHAR;
   public static D4 INT;
   public static D4 LONG;
   public static D4 FLOAT;
   public static D4 DOUBLE;
   public static D4 BOOLEAN;
   public static D4[] E;
   public static long[] a;
   public static Integer[] b;

   public static D4[] values() {
      return (D4[])E.clone();
   }

   public static D4 valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public D4(String var1, int var2) {
   }

   @Override
   public String toString() {
      return this.name().toLowerCase();
   }

   public static D4[] m() {
      D4[] var10000 = new D4[a(16626, 2048712378761219428L)];
      var10000[0] = VOID;
      var10000[1] = BYTE;
      var10000[2] = SHORT;
      var10000[3] = CHAR;
      var10000[4] = INT;
      var10000[5] = LONG;
      var10000[a(4611, 298439324260032404L)] = FLOAT;
      var10000[a(7780, 3333372131502838772L)] = DOUBLE;
      var10000[a(18113, 2719855876287925076L)] = BOOLEAN;
      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19859;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var8 = new String[9];
      int var12 = 0;
      String var11 = "\\w\fb\u0004Sp\u0003w\u0004Ra\u0016`\u0004Fw\u000ba\u0003Yv\u0016\u0006Tw\u0017g(Q\u0005Cp\rw0";
      int var13 = "\\w\fb\u0004Sp\u0003w\u0004Ra\u0016`\u0004Fw\u000ba\u0003Yv\u0016\u0006Tw\u0017g(Q\u0005Cp\rw0".length();
      char var10 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 12;
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
                        var65 = 28;
                        break;
                     case 1:
                        var65 = 52;
                        break;
                     case 2:
                        var65 = 78;
                        break;
                     case 3:
                        var65 = 41;
                        break;
                     case 4:
                        var65 = 104;
                        break;
                     case 5:
                        var65 = 24;
                        break;
                     default:
                        var65 = 121;
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
                     long var0 = 893324975705062803L;
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "¦Ä(ô©Ú¼z+kRIß\n\u007f!á~h_ûÔÎÌ\u009f®ø7ÿ\u008b®`lè\rÄàd¢\u0001";
                     int var5 = "¦Ä(ô©Ú¼z+kRIß\n\u007f!á~h_ûÔÎÌ\u009f®ø7ÿ\u008b®`lè\rÄàd¢\u0001".length();
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
                                    a = var6;
                                    b = new Integer[7];
                                    VOID = new D4(var8[3], 0);
                                    BYTE = new D4(var8[2], 1);
                                    SHORT = new D4(var8[6], 2);
                                    CHAR = new D4(var8[1], 3);
                                    INT = new D4(var8[4], 4);
                                    LONG = new D4(var8[0], 5);
                                    FLOAT = new D4(var8[8], a(20262, 5649810506679583412L));
                                    DOUBLE = new D4(var8[5], a(32457, 3583108064463991640L));
                                    BOOLEAN = new D4(var8[7], a(3186, 2636664676527161825L));
                                    E = m();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Û\u0012n\u000fÚàpþØØ{AG\u0084öÏ";
                                 var5 = "Û\u0012n\u000fÚàpþØØ{AG\u0084öÏ".length();
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

                  var11 = "\u0019<F\"j\u001ep\u0005\u001d?F/{";
                  var13 = "\u0019<F\"j\u001ep\u0005\u001d?F/{".length();
                  var10 = 7;
                  var17 = -1;
            }

            var10000 = 71;
            var10001 = var11.substring(++var17, var17 + var10);
            var10002 = 0;
         }
      }
   }
}







