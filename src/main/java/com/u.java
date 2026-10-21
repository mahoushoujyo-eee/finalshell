package com;

import java.io.IOException;
import java.lang.reflect.Type;

public class u implements com.ak_2, X4 {
   public static u q;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   @Override
   public void u(nL_3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/nL_3.w Lcom/yM_3;
      // 07: astore 7
      // 09: astore 6
      // 0b: aload 2
      // 0c: checkcast java/lang/Number
      // 0f: astore 8
      // 11: aload 8
      // 13: aload 6
      // 15: ifnull 30
      // 18: ifnonnull 2f
      // 1b: goto 22
      // 1e: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 7
      // 24: getstatic com/EP.WriteNullNumberAsZero Lcom/EP;
      // 27: invokevirtual com/yM_3.x (Lcom/EP;)V
      // 2a: return
      // 2b: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 2
      // 30: instanceof java/lang/Long
      // 33: ifeq 4c
      // 36: aload 7
      // 38: aload 8
      // 3a: invokevirtual java/lang/Number.longValue ()J
      // 3d: invokevirtual com/yM_3.i (J)V
      // 40: aload 6
      // 42: ifnonnull 5d
      // 45: goto 4c
      // 48: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 7
      // 4e: aload 8
      // 50: invokevirtual java/lang/Number.intValue ()I
      // 53: invokevirtual com/yM_3.v (I)V
      // 56: goto 5d
      // 59: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: aload 7
      // 5f: getstatic com/EP.WriteClassName Lcom/EP;
      // 62: invokevirtual com/yM_3.I (Lcom/EP;)Z
      // 65: ifeq bf
      // 68: aload 8
      // 6a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 6d: astore 9
      // 6f: aload 9
      // 71: ldc java/lang/Byte
      // 73: aload 6
      // 75: ifnull a7
      // 78: if_acmpne 9c
      // 7b: goto 82
      // 7e: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: aload 7
      // 84: sipush 32138
      // 87: ldc2_w 7808554767838208316
      // 8a: invokestatic com/u.a (IJ)I
      // 8d: invokevirtual com/yM_3.write (I)V
      // 90: aload 6
      // 92: ifnonnull bf
      // 95: goto 9c
      // 98: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: aload 9
      // 9e: ldc java/lang/Short
      // a0: goto a7
      // a3: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a6: athrow
      // a7: if_acmpne bf
      // aa: aload 7
      // ac: sipush 8594
      // af: ldc2_w 4230002531841195299
      // b2: invokestatic com/u.a (IJ)I
      // b5: invokevirtual com/yM_3.write (I)V
      // b8: goto bf
      // bb: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // be: athrow
      // bf: return
   }

   @Override
   public Object z(com.yn_4 param1, Type param2, Object param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 003: aload 1
      // 004: getfield com/yn_4.N Lcom/P7;
      // 007: astore 5
      // 009: astore 4
      // 00b: aload 5
      // 00d: invokeinterface com/P7.P ()I 1
      // 012: istore 6
      // 014: iload 6
      // 016: sipush 16994
      // 019: ldc2_w 3867950713173696213
      // 01c: invokestatic com/u.a (IJ)I
      // 01f: aload 4
      // 021: ifnull 047
      // 024: if_icmpne 044
      // 027: goto 02e
      // 02a: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 5
      // 030: sipush 15965
      // 033: ldc2_w 2480896725784863465
      // 036: invokestatic com/u.a (IJ)I
      // 039: invokeinterface com/P7.S (I)V 2
      // 03e: aconst_null
      // 03f: areturn
      // 040: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: iload 6
      // 046: bipush 2
      // 047: aload 4
      // 049: ifnull 085
      // 04c: if_icmpne 07b
      // 04f: goto 056
      // 052: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 5
      // 058: invokeinterface com/P7.G ()I 1
      // 05d: istore 8
      // 05f: aload 5
      // 061: sipush 23075
      // 064: ldc2_w 7500484747879073427
      // 067: invokestatic com/u.a (IJ)I
      // 06a: invokeinterface com/P7.S (I)V 2
      // 06f: iload 8
      // 071: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 074: astore 7
      // 076: aload 4
      // 078: ifnonnull 0fb
      // 07b: iload 6
      // 07d: bipush 3
      // 07e: goto 085
      // 081: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: aload 4
      // 087: ifnull 0ce
      // 08a: if_icmpne 0bc
      // 08d: goto 094
      // 090: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: aload 5
      // 096: invokeinterface com/P7.c ()Ljava/math/BigDecimal; 1
      // 09b: astore 8
      // 09d: aload 8
      // 09f: invokestatic com/B8.P (Ljava/math/BigDecimal;)I
      // 0a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a5: astore 7
      // 0a7: aload 5
      // 0a9: sipush 23075
      // 0ac: ldc2_w 7500484747879073427
      // 0af: invokestatic com/u.a (IJ)I
      // 0b2: invokeinterface com/P7.S (I)V 2
      // 0b7: aload 4
      // 0b9: ifnonnull 0fb
      // 0bc: iload 6
      // 0be: sipush 13915
      // 0c1: ldc2_w 7191840164805126894
      // 0c4: invokestatic com/u.a (IJ)I
      // 0c7: goto 0ce
      // 0ca: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: if_icmpne 0ee
      // 0d1: new com/O0
      // 0d4: dup
      // 0d5: bipush 1
      // 0d6: invokespecial com/O0.<init> (Z)V
      // 0d9: astore 8
      // 0db: aload 1
      // 0dc: aload 8
      // 0de: invokevirtual com/yn_4.u (Ljava/util/Map;)Ljava/lang/Object;
      // 0e1: pop
      // 0e2: aload 8
      // 0e4: invokestatic com/B8.Y (Ljava/lang/Object;)Ljava/lang/Integer;
      // 0e7: astore 7
      // 0e9: aload 4
      // 0eb: ifnonnull 0fb
      // 0ee: aload 1
      // 0ef: invokevirtual com/yn_4.M ()Ljava/lang/Object;
      // 0f2: astore 8
      // 0f4: aload 8
      // 0f6: invokestatic com/B8.Y (Ljava/lang/Object;)Ljava/lang/Integer;
      // 0f9: astore 7
      // 0fb: goto 13c
      // 0fe: astore 8
      // 100: sipush 15517
      // 103: sipush -32313
      // 106: invokestatic com/u.a (II)Ljava/lang/String;
      // 109: astore 9
      // 10b: aload 3
      // 10c: ifnull 130
      // 10f: new java/lang/StringBuilder
      // 112: dup
      // 113: invokespecial java/lang/StringBuilder.<init> ()V
      // 116: aload 9
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: sipush 15516
      // 11e: sipush 25775
      // 121: invokestatic com/u.a (II)Ljava/lang/String;
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: aload 3
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12e: astore 9
      // 130: new com/Hi_2
      // 133: dup
      // 134: aload 9
      // 136: aload 8
      // 138: invokespecial com/Hi_2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 13b: athrow
      // 13c: aload 2
      // 13d: ldc java/util/concurrent/atomic/AtomicInteger
      // 13f: if_acmpne 153
      // 142: new java/util/concurrent/atomic/AtomicInteger
      // 145: dup
      // 146: aload 7
      // 148: invokevirtual java/lang/Integer.intValue ()I
      // 14b: invokespecial java/util/concurrent/atomic/AtomicInteger.<init> (I)V
      // 14e: areturn
      // 14f: invokestatic com/u.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152: athrow
      // 153: aload 7
      // 155: areturn
   }

   @Override
   public int j() {
      return 2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "\u001d\u0091+\u000e\u0090\u009bêþ\nÄ\u0015\u008fÿà\n ¼_Ø\u0088=ãÿz\u007f";
      int var12 = "\u001d\u0091+\u000e\u0090\u009bêþ\nÄ\u0015\u008fÿà\n ¼_Ø\u0088=ãÿz\u007f".length();
      char var9 = 14;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 94;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 94;
               var10006 = var14;
            } else {
               var27 = 94;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 94;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 3;
                     break;
                  case 1:
                     var47 = 68;
                     break;
                  case 2:
                     var47 = 113;
                     break;
                  case 3:
                     var47 = 31;
                     break;
                  case 4:
                     var47 = 23;
                     break;
                  case 5:
                     var47 = 120;
                     break;
                  default:
                     var47 = 40;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 3743379217749784271L;
            long[] var6 = new long[6];
            int var3 = 0;
            String var4 = "Y$\u000fw\u0015\u0016\u009c-ðÍ×ð5X\u00146t\u007fNh\u009eáè\u0012\"´Æ,/£×±";
            int var5 = "Y$\u000fw\u0015\u0016\u009c-ðÍ×ð5X\u00146t\u007fNh\u009eáè\u0012\"´Æ,/£×±".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           c = var6;
                           d = new Integer[6];
                           q = new u();
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "Dy\u0010z\u0090ë\u008b¿?Ì¤ï%\u001fpL";
                        var5 = "Dy\u0010z\u0090ë\u008b¿?Ì¤ï%\u001fpL".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 15517) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 50;
               break;
            case 1:
               var10000 = 146;
               break;
            case 2:
               var10000 = 136;
               break;
            case 3:
               var10000 = 234;
               break;
            case 4:
               var10000 = 112;
               break;
            case 5:
               var10000 = 4;
               break;
            case 6:
               var10000 = 132;
               break;
            case 7:
               var10000 = 240;
               break;
            case 8:
               var10000 = 93;
               break;
            case 9:
               var10000 = 152;
               break;
            case 10:
               var10000 = 58;
               break;
            case 11:
               var10000 = 157;
               break;
            case 12:
               var10000 = 110;
               break;
            case 13:
               var10000 = 106;
               break;
            case 14:
               var10000 = 1;
               break;
            case 15:
               var10000 = 88;
               break;
            case 16:
               var10000 = 245;
               break;
            case 17:
               var10000 = 249;
               break;
            case 18:
               var10000 = 73;
               break;
            case 19:
               var10000 = 71;
               break;
            case 20:
               var10000 = 94;
               break;
            case 21:
               var10000 = 45;
               break;
            case 22:
               var10000 = 165;
               break;
            case 23:
               var10000 = 171;
               break;
            case 24:
               var10000 = 190;
               break;
            case 25:
               var10000 = 105;
               break;
            case 26:
               var10000 = 115;
               break;
            case 27:
               var10000 = 143;
               break;
            case 28:
               var10000 = 242;
               break;
            case 29:
               var10000 = 49;
               break;
            case 30:
               var10000 = 230;
               break;
            case 31:
               var10000 = 227;
               break;
            case 32:
               var10000 = 104;
               break;
            case 33:
               var10000 = 35;
               break;
            case 34:
               var10000 = 208;
               break;
            case 35:
               var10000 = 130;
               break;
            case 36:
               var10000 = 186;
               break;
            case 37:
               var10000 = 38;
               break;
            case 38:
               var10000 = 44;
               break;
            case 39:
               var10000 = 192;
               break;
            case 40:
               var10000 = 196;
               break;
            case 41:
               var10000 = 194;
               break;
            case 42:
               var10000 = 95;
               break;
            case 43:
               var10000 = 177;
               break;
            case 44:
               var10000 = 153;
               break;
            case 45:
               var10000 = 238;
               break;
            case 46:
               var10000 = 198;
               break;
            case 47:
               var10000 = 241;
               break;
            case 48:
               var10000 = 79;
               break;
            case 49:
               var10000 = 25;
               break;
            case 50:
               var10000 = 209;
               break;
            case 51:
               var10000 = 26;
               break;
            case 52:
               var10000 = 220;
               break;
            case 53:
               var10000 = 188;
               break;
            case 54:
               var10000 = 239;
               break;
            case 55:
               var10000 = 59;
               break;
            case 56:
               var10000 = 90;
               break;
            case 57:
               var10000 = 154;
               break;
            case 58:
               var10000 = 69;
               break;
            case 59:
               var10000 = 51;
               break;
            case 60:
               var10000 = 217;
               break;
            case 61:
               var10000 = 247;
               break;
            case 62:
               var10000 = 125;
               break;
            case 63:
               var10000 = 57;
               break;
            case 64:
               var10000 = 151;
               break;
            case 65:
               var10000 = 216;
               break;
            case 66:
               var10000 = 244;
               break;
            case 67:
               var10000 = 189;
               break;
            case 68:
               var10000 = 103;
               break;
            case 69:
               var10000 = 37;
               break;
            case 70:
               var10000 = 141;
               break;
            case 71:
               var10000 = 48;
               break;
            case 72:
               var10000 = 92;
               break;
            case 73:
               var10000 = 254;
               break;
            case 74:
               var10000 = 3;
               break;
            case 75:
               var10000 = 39;
               break;
            case 76:
               var10000 = 27;
               break;
            case 77:
               var10000 = 100;
               break;
            case 78:
               var10000 = 140;
               break;
            case 79:
               var10000 = 226;
               break;
            case 80:
               var10000 = 63;
               break;
            case 81:
               var10000 = 56;
               break;
            case 82:
               var10000 = 135;
               break;
            case 83:
               var10000 = 223;
               break;
            case 84:
               var10000 = 19;
               break;
            case 85:
               var10000 = 127;
               break;
            case 86:
               var10000 = 131;
               break;
            case 87:
               var10000 = 114;
               break;
            case 88:
               var10000 = 65;
               break;
            case 89:
               var10000 = 187;
               break;
            case 90:
               var10000 = 174;
               break;
            case 91:
               var10000 = 53;
               break;
            case 92:
               var10000 = 55;
               break;
            case 93:
               var10000 = 23;
               break;
            case 94:
               var10000 = 253;
               break;
            case 95:
               var10000 = 118;
               break;
            case 96:
               var10000 = 211;
               break;
            case 97:
               var10000 = 225;
               break;
            case 98:
               var10000 = 237;
               break;
            case 99:
               var10000 = 155;
               break;
            case 100:
               var10000 = 156;
               break;
            case 101:
               var10000 = 24;
               break;
            case 102:
               var10000 = 119;
               break;
            case 103:
               var10000 = 147;
               break;
            case 104:
               var10000 = 82;
               break;
            case 105:
               var10000 = 246;
               break;
            case 106:
               var10000 = 128;
               break;
            case 107:
               var10000 = 85;
               break;
            case 108:
               var10000 = 248;
               break;
            case 109:
               var10000 = 111;
               break;
            case 110:
               var10000 = 183;
               break;
            case 111:
               var10000 = 108;
               break;
            case 112:
               var10000 = 197;
               break;
            case 113:
               var10000 = 54;
               break;
            case 114:
               var10000 = 213;
               break;
            case 115:
               var10000 = 16;
               break;
            case 116:
               var10000 = 204;
               break;
            case 117:
               var10000 = 81;
               break;
            case 118:
               var10000 = 96;
               break;
            case 119:
               var10000 = 173;
               break;
            case 120:
               var10000 = 36;
               break;
            case 121:
               var10000 = 64;
               break;
            case 122:
               var10000 = 232;
               break;
            case 123:
               var10000 = 166;
               break;
            case 124:
               var10000 = 99;
               break;
            case 125:
               var10000 = 142;
               break;
            case 126:
               var10000 = 84;
               break;
            case 127:
               var10000 = 207;
               break;
            case 128:
               var10000 = 182;
               break;
            case 129:
               var10000 = 219;
               break;
            case 130:
               var10000 = 97;
               break;
            case 131:
               var10000 = 124;
               break;
            case 132:
               var10000 = 41;
               break;
            case 133:
               var10000 = 98;
               break;
            case 134:
               var10000 = 218;
               break;
            case 135:
               var10000 = 10;
               break;
            case 136:
               var10000 = 89;
               break;
            case 137:
               var10000 = 91;
               break;
            case 138:
               var10000 = 191;
               break;
            case 139:
               var10000 = 30;
               break;
            case 140:
               var10000 = 13;
               break;
            case 141:
               var10000 = 47;
               break;
            case 142:
               var10000 = 76;
               break;
            case 143:
               var10000 = 113;
               break;
            case 144:
               var10000 = 15;
               break;
            case 145:
               var10000 = 215;
               break;
            case 146:
               var10000 = 210;
               break;
            case 147:
               var10000 = 233;
               break;
            case 148:
               var10000 = 121;
               break;
            case 149:
               var10000 = 123;
               break;
            case 150:
               var10000 = 120;
               break;
            case 151:
               var10000 = 201;
               break;
            case 152:
               var10000 = 214;
               break;
            case 153:
               var10000 = 179;
               break;
            case 154:
               var10000 = 29;
               break;
            case 155:
               var10000 = 116;
               break;
            case 156:
               var10000 = 163;
               break;
            case 157:
               var10000 = 102;
               break;
            case 158:
               var10000 = 175;
               break;
            case 159:
               var10000 = 129;
               break;
            case 160:
               var10000 = 195;
               break;
            case 161:
               var10000 = 40;
               break;
            case 162:
               var10000 = 228;
               break;
            case 163:
               var10000 = 184;
               break;
            case 164:
               var10000 = 61;
               break;
            case 165:
               var10000 = 134;
               break;
            case 166:
               var10000 = 31;
               break;
            case 167:
               var10000 = 150;
               break;
            case 168:
               var10000 = 252;
               break;
            case 169:
               var10000 = 21;
               break;
            case 170:
               var10000 = 206;
               break;
            case 171:
               var10000 = 6;
               break;
            case 172:
               var10000 = 107;
               break;
            case 173:
               var10000 = 149;
               break;
            case 174:
               var10000 = 101;
               break;
            case 175:
               var10000 = 32;
               break;
            case 176:
               var10000 = 33;
               break;
            case 177:
               var10000 = 77;
               break;
            case 178:
               var10000 = 83;
               break;
            case 179:
               var10000 = 159;
               break;
            case 180:
               var10000 = 117;
               break;
            case 181:
               var10000 = 86;
               break;
            case 182:
               var10000 = 78;
               break;
            case 183:
               var10000 = 60;
               break;
            case 184:
               var10000 = 67;
               break;
            case 185:
               var10000 = 34;
               break;
            case 186:
               var10000 = 9;
               break;
            case 187:
               var10000 = 52;
               break;
            case 188:
               var10000 = 17;
               break;
            case 189:
               var10000 = 250;
               break;
            case 190:
               var10000 = 162;
               break;
            case 191:
               var10000 = 42;
               break;
            case 192:
               var10000 = 229;
               break;
            case 193:
               var10000 = 180;
               break;
            case 194:
               var10000 = 158;
               break;
            case 195:
               var10000 = 18;
               break;
            case 196:
               var10000 = 126;
               break;
            case 197:
               var10000 = 181;
               break;
            case 198:
               var10000 = 169;
               break;
            case 199:
               var10000 = 7;
               break;
            case 200:
               var10000 = 138;
               break;
            case 201:
               var10000 = 185;
               break;
            case 202:
               var10000 = 66;
               break;
            case 203:
               var10000 = 109;
               break;
            case 204:
               var10000 = 87;
               break;
            case 205:
               var10000 = 202;
               break;
            case 206:
               var10000 = 12;
               break;
            case 207:
               var10000 = 205;
               break;
            case 208:
               var10000 = 167;
               break;
            case 209:
               var10000 = 14;
               break;
            case 210:
               var10000 = 231;
               break;
            case 211:
               var10000 = 172;
               break;
            case 212:
               var10000 = 5;
               break;
            case 213:
               var10000 = 43;
               break;
            case 214:
               var10000 = 178;
               break;
            case 215:
               var10000 = 255;
               break;
            case 216:
               var10000 = 212;
               break;
            case 217:
               var10000 = 193;
               break;
            case 218:
               var10000 = 203;
               break;
            case 219:
               var10000 = 199;
               break;
            case 220:
               var10000 = 160;
               break;
            case 221:
               var10000 = 80;
               break;
            case 222:
               var10000 = 72;
               break;
            case 223:
               var10000 = 145;
               break;
            case 224:
               var10000 = 137;
               break;
            case 225:
               var10000 = 62;
               break;
            case 226:
               var10000 = 139;
               break;
            case 227:
               var10000 = 22;
               break;
            case 228:
               var10000 = 251;
               break;
            case 229:
               var10000 = 236;
               break;
            case 230:
               var10000 = 70;
               break;
            case 231:
               var10000 = 74;
               break;
            case 232:
               var10000 = 200;
               break;
            case 233:
               var10000 = 75;
               break;
            case 234:
               var10000 = 11;
               break;
            case 235:
               var10000 = 235;
               break;
            case 236:
               var10000 = 2;
               break;
            case 237:
               var10000 = 164;
               break;
            case 238:
               var10000 = 148;
               break;
            case 239:
               var10000 = 221;
               break;
            case 240:
               var10000 = 168;
               break;
            case 241:
               var10000 = 144;
               break;
            case 242:
               var10000 = 8;
               break;
            case 243:
               var10000 = 161;
               break;
            case 244:
               var10000 = 133;
               break;
            case 245:
               var10000 = 28;
               break;
            case 246:
               var10000 = 68;
               break;
            case 247:
               var10000 = 20;
               break;
            case 248:
               var10000 = 46;
               break;
            case 249:
               var10000 = 224;
               break;
            case 250:
               var10000 = 170;
               break;
            case 251:
               var10000 = 176;
               break;
            case 252:
               var10000 = 122;
               break;
            case 253:
               var10000 = 222;
               break;
            case 254:
               var10000 = 0;
               break;
            default:
               var10000 = 243;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7349;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





