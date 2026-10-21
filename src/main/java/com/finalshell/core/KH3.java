package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;

public class KH3 implements Ak2, X4 {
   static BigDecimal s;
   static BigDecimal o;
   public static KH3 b;
   public static String a;
   public static long[] c;
   public static Integer[] d;

   @Override
   public void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 1
      // 004: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 007: astore 7
      // 009: astore 6
      // 00b: aload 2
      // 00c: aload 6
      // 00e: ifnull 037
      // 011: ifnonnull 02f
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 7
      // 01d: getstatic com/finalshell/ui/model/EP.WriteNullNumberAsZero Lcom/finalshell/ui/model/EP;
      // 020: invokevirtual com/finalshell/io/YM3.x (Lcom/finalshell/ui/model/EP;)V
      // 023: aload 6
      // 025: ifnonnull 185
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 2
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: checkcast java/math/BigDecimal
      // 03a: astore 8
      // 03c: aload 8
      // 03e: invokevirtual java/math/BigDecimal.scale ()I
      // 041: istore 9
      // 043: iload 5
      // 045: aload 7
      // 047: getfield com/finalshell/io/YM3.q I
      // 04a: getstatic com/finalshell/ui/model/EP.WriteBigDecimalAsPlain Lcom/finalshell/ui/model/EP;
      // 04d: invokestatic com/finalshell/ui/model/EP.a (IILcom/finalshell/ui/model/EP;)Z
      // 050: aload 6
      // 052: ifnull 061
      // 055: ifeq 09a
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: iload 9
      // 061: sipush 10559
      // 064: ldc2_w 5433898461633172947
      // 067: invokestatic com/finalshell/core/KH3.a (IJ)I
      // 06a: aload 6
      // 06c: ifnull 08b
      // 06f: if_icmplt 09a
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: iload 9
      // 07b: sipush 16182
      // 07e: ldc2_w 2812286808471618527
      // 081: invokestatic com/finalshell/core/KH3.a (IJ)I
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: if_icmpge 09a
      // 08e: aload 8
      // 090: invokevirtual java/math/BigDecimal.toPlainString ()Ljava/lang/String;
      // 093: astore 10
      // 095: aload 6
      // 097: ifnonnull 0a1
      // 09a: aload 8
      // 09c: invokevirtual java/math/BigDecimal.toString ()Ljava/lang/String;
      // 09f: astore 10
      // 0a1: iload 9
      // 0a3: aload 6
      // 0a5: ifnull 150
      // 0a8: ifne 141
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 10
      // 0b4: invokevirtual java/lang/String.length ()I
      // 0b7: aload 6
      // 0b9: ifnull 150
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: sipush 8932
      // 0c6: ldc2_w 4420950594308038158
      // 0c9: invokestatic com/finalshell/core/KH3.a (IJ)I
      // 0cc: if_icmplt 141
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: iload 5
      // 0d8: aload 7
      // 0da: getfield com/finalshell/io/YM3.q I
      // 0dd: getstatic com/finalshell/ui/model/EP.BrowserCompatible Lcom/finalshell/ui/model/EP;
      // 0e0: invokestatic com/finalshell/ui/model/EP.a (IILcom/finalshell/ui/model/EP;)Z
      // 0e3: aload 6
      // 0e5: ifnull 150
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: ifeq 141
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: aload 8
      // 0fb: getstatic com/finalshell/core/KH3.s Ljava/math/BigDecimal;
      // 0fe: invokevirtual java/math/BigDecimal.compareTo (Ljava/math/BigDecimal;)I
      // 101: aload 6
      // 103: ifnull 126
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: iflt 135
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: aload 8
      // 119: getstatic com/finalshell/core/KH3.o Ljava/math/BigDecimal;
      // 11c: invokevirtual java/math/BigDecimal.compareTo (Ljava/math/BigDecimal;)I
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: aload 6
      // 128: ifnull 150
      // 12b: ifle 141
      // 12e: goto 135
      // 131: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: aload 7
      // 137: aload 10
      // 139: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 13c: return
      // 13d: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: aload 7
      // 143: aload 10
      // 145: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 148: aload 7
      // 14a: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 14d: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 150: ifeq 185
      // 153: aload 4
      // 155: ldc java/math/BigDecimal
      // 157: if_acmpeq 185
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 160: athrow
      // 161: aload 8
      // 163: invokevirtual java/math/BigDecimal.scale ()I
      // 166: ifne 185
      // 169: goto 170
      // 16c: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: aload 7
      // 172: sipush 21860
      // 175: ldc2_w 8601077452836284812
      // 178: invokestatic com/finalshell/core/KH3.a (IJ)I
      // 17b: invokevirtual com/finalshell/io/YM3.write (I)V
      // 17e: goto 185
      // 181: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 184: athrow
      // 185: return
   }

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      try {
         return K(var1);
      } catch (Exception var5) {
         throw new Hi2(a + var3, var5);
      }
   }

   public static Object K(Yn4 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: invokeinterface com/finalshell/core/P7.P ()I 1
      // 0f: bipush 2
      // 10: aload 1
      // 11: ifnull 48
      // 14: if_icmpne 36
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokeinterface com/finalshell/core/P7.c$BigDecimal ()Ljava/math/BigDecimal; 1
      // 24: astore 3
      // 25: aload 2
      // 26: sipush 7068
      // 29: ldc2_w 7656797340824233847
      // 2c: invokestatic com/finalshell/core/KH3.a (IJ)I
      // 2f: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 34: aload 3
      // 35: areturn
      // 36: aload 2
      // 37: aload 1
      // 38: ifnull 67
      // 3b: invokeinterface com/finalshell/core/P7.P ()I 1
      // 40: bipush 3
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: if_icmpne 63
      // 4b: aload 2
      // 4c: invokeinterface com/finalshell/core/P7.c$BigDecimal ()Ljava/math/BigDecimal; 1
      // 51: astore 3
      // 52: aload 2
      // 53: sipush 8932
      // 56: ldc2_w 4420950594308038158
      // 59: invokestatic com/finalshell/core/KH3.a (IJ)I
      // 5c: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 61: aload 3
      // 62: areturn
      // 63: aload 0
      // 64: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 67: astore 3
      // 68: aload 3
      // 69: aload 1
      // 6a: ifnull 80
      // 6d: ifnonnull 7f
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aconst_null
      // 78: goto 83
      // 7b: invokestatic com/finalshell/core/KH3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: aload 3
      // 80: invokestatic com/finalshell/core/B8_2.b (Ljava/lang/Object;)Ljava/math/BigDecimal;
      // 83: areturn
   }

   @Override
   public int j() {
      return 2;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31976;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "1x\u0019\n!%]\"p\u0006\u0018(A]3k\u0004\u000bhA^(|\u0007\u001dd[\u0018".toCharArray();
      int var10004 = var10003.length;
      int var16 = 0;
      byte var53 = 86;
      char[] var10002 = var10003;
      int var34 = var10004;
      char[] var63;
      byte var73;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var63 = var10003;
         var10005 = var16;
         char var10008 = var10003[var16];
         var10007 = 86;
         var10006 = var10008;
         switch (var16 % 7) {
            case 0:
               var73 = 23;
               break;
            case 1:
               var73 = 79;
               break;
            case 2:
               var73 = 61;
               break;
            case 3:
               var73 = 47;
               break;
            case 4:
               var73 = 18;
               break;
            case 5:
               var73 = 55;
               break;
            default:
               var73 = 110;
         }
      } else {
         var53 = 86;
         var34 = var10004;
         if (var10004 <= var16) {
            String var59 = new String(var10003).intern();
            int var42 = -1;
            a = var59;
            long var24 = 5422303921120307160L;
            long[] var29 = new long[5];
            int var26 = 0;
            String var27 = "~Ä{a\u007fxÎz*ni\u009bËâ¤c«Q\u0082çeÝ9Æ";
            int var28 = "~Ä{a\u007fxÎz*ni\u009bËâ¤c«Q\u0082çeÝ9Æ".length();
            byte var25 = 0;

            label82:
            while (true) {
               var42 = var25;
               var25 += 8;
               byte[] var31 = var27.substring(var42, var25).getBytes("ISO-8859-1");
               long[] var33 = var29;
               var42 = var26++;
               long var51 = ((long)var31[0] & 255L) << 56
                  | ((long)var31[1] & 255L) << 48
                  | ((long)var31[2] & 255L) << 40
                  | ((long)var31[3] & 255L) << 32
                  | ((long)var31[4] & 255L) << 24
                  | ((long)var31[5] & 255L) << 16
                  | ((long)var31[6] & 255L) << 8
                  | (long)var31[7] & 255L;
               byte var60 = -1;

               while (true) {
                  long var70 = var51 ^ var24;
                  switch (var60) {
                     case 0:
                        var33[var42] = var70;
                        if (var25 >= var28) {
                           c = var29;
                           d = new Integer[5];
                           long var18 = 2977705624321985958L;
                           long[] var17 = new long[2];
                           int var20 = 0;
                           String var21 = ")M\u0010\u0082à\u009aòYÖ²ï}\u001fe\r§";
                           int var22 = ")M\u0010\u0082à\u009aòYÖ²ï}\u001fe\r§".length();
                           byte var19 = 0;

                           do {
                              int var46 = var19;
                              var19 += 8;
                              byte[] var23 = var21.substring(var46, var19).getBytes("ISO-8859-1");
                              var46 = var20++;
                              long var71 = (
                                    ((long)var23[0] & 255L) << 56
                                       | ((long)var23[1] & 255L) << 48
                                       | ((long)var23[2] & 255L) << 40
                                       | ((long)var23[3] & 255L) << 32
                                       | ((long)var23[4] & 255L) << 24
                                       | ((long)var23[5] & 255L) << 16
                                       | ((long)var23[6] & 255L) << 8
                                       | (long)var23[7] & 255L
                                 )
                                 ^ var18;
                              byte var62 = -1;
                              var17[var46] = var71;
                           } while (var19 < var22);

                           s = BigDecimal.valueOf(var17[1]);
                           o = BigDecimal.valueOf(var17[0]);
                           b = new KH3();
                           return;
                        }
                        break;
                     default:
                        var33[var42] = var70;
                        if (var25 < var28) {
                           continue label82;
                        }

                        var27 = "d«#¡:n\u0080¿±@,µªEM\u0097";
                        var28 = "d«#¡:n\u0080¿±@,µªEM\u0097".length();
                        var25 = 0;
                  }

                  byte var45 = var25;
                  var25 += 8;
                  var31 = var27.substring(var45, var25).getBytes("ISO-8859-1");
                  var33 = var29;
                  var42 = var26++;
                  var51 = ((long)var31[0] & 255L) << 56
                     | ((long)var31[1] & 255L) << 48
                     | ((long)var31[2] & 255L) << 40
                     | ((long)var31[3] & 255L) << 32
                     | ((long)var31[4] & 255L) << 24
                     | ((long)var31[5] & 255L) << 16
                     | ((long)var31[6] & 255L) << 8
                     | (long)var31[7] & 255L;
                  var60 = 0;
               }
            }
         }

         var63 = var10003;
         var10005 = var16;
         char var74 = var10003[var16];
         var10007 = 86;
         var10006 = var74;
         switch (var16 % 7) {
            case 0:
               var73 = 23;
               break;
            case 1:
               var73 = 79;
               break;
            case 2:
               var73 = 61;
               break;
            case 3:
               var73 = 47;
               break;
            case 4:
               var73 = 18;
               break;
            case 5:
               var73 = 55;
               break;
            default:
               var73 = 110;
         }
      }

      while (true) {
         var63[var10005] = (char)(var10006 ^ var10007 ^ var73);
         var16++;
         if (var53 == 0) {
            var63 = var10002;
            var10005 = var53;
            char var76 = var10002[var53];
            var10007 = var53;
            var10006 = var76;
            switch (var16 % 7) {
               case 0:
                  var73 = 23;
                  break;
               case 1:
                  var73 = 79;
                  break;
               case 2:
                  var73 = 61;
                  break;
               case 3:
                  var73 = 47;
                  break;
               case 4:
                  var73 = 18;
                  break;
               case 5:
                  var73 = 55;
                  break;
               default:
                  var73 = 110;
            }
         } else {
            if (var34 <= var16) {
               String var55 = new String(var10002).intern();
               int var36 = -1;
               a = var55;
               long var8 = 5422303921120307160L;
               long[] var14 = new long[5];
               int var11 = 0;
               String var12 = "~Ä{a\u007fxÎz*ni\u009bËâ¤c«Q\u0082çeÝ9Æ";
               int var13 = "~Ä{a\u007fxÎz*ni\u009bËâ¤c«Q\u0082çeÝ9Æ".length();
               byte var10 = 0;

               label48:
               while (true) {
                  var36 = var10;
                  var10 += 8;
                  byte[] var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                  long[] var10000 = var14;
                  var36 = var11++;
                  long var49 = ((long)var15[0] & 255L) << 56
                     | ((long)var15[1] & 255L) << 48
                     | ((long)var15[2] & 255L) << 40
                     | ((long)var15[3] & 255L) << 32
                     | ((long)var15[4] & 255L) << 24
                     | ((long)var15[5] & 255L) << 16
                     | ((long)var15[6] & 255L) << 8
                     | (long)var15[7] & 255L;
                  byte var56 = -1;

                  while (true) {
                     long var67 = var49 ^ var8;
                     switch (var56) {
                        case 0:
                           var10000[var36] = var67;
                           if (var10 >= var13) {
                              c = var14;
                              d = new Integer[5];
                              long var1 = 2977705624321985958L;
                              long[] var0 = new long[2];
                              int var4 = 0;
                              String var5 = ")M\u0010\u0082à\u009aòYÖ²ï}\u001fe\r§";
                              int var6 = ")M\u0010\u0082à\u009aòYÖ²ï}\u001fe\r§".length();
                              byte var3 = 0;

                              do {
                                 int var40 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var40, var3).getBytes("ISO-8859-1");
                                 var40 = var4++;
                                 long var68 = (
                                       ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L
                                    )
                                    ^ var1;
                                 byte var58 = -1;
                                 var0[var40] = var68;
                              } while (var3 < var6);

                              s = BigDecimal.valueOf(var0[1]);
                              o = BigDecimal.valueOf(var0[0]);
                              b = new KH3();
                              return;
                           }
                           break;
                        default:
                           var10000[var36] = var67;
                           if (var10 < var13) {
                              continue label48;
                           }

                           var12 = "d«#¡:n\u0080¿±@,µªEM\u0097";
                           var13 = "d«#¡:n\u0080¿±@,µªEM\u0097".length();
                           var10 = 0;
                     }

                     byte var39 = var10;
                     var10 += 8;
                     var15 = var12.substring(var39, var10).getBytes("ISO-8859-1");
                     var10000 = var14;
                     var36 = var11++;
                     var49 = ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L;
                     var56 = 0;
                  }
               }
            }

            var63 = var10002;
            var10005 = var16;
            char var75 = var10002[var16];
            var10007 = var53;
            var10006 = var75;
            switch (var16 % 7) {
               case 0:
                  var73 = 23;
                  break;
               case 1:
                  var73 = 79;
                  break;
               case 2:
                  var73 = 61;
                  break;
               case 3:
                  var73 = 47;
                  break;
               case 4:
                  var73 = 18;
                  break;
               case 5:
                  var73 = 55;
                  break;
               default:
                  var73 = 110;
            }
         }
      }
   }
}





