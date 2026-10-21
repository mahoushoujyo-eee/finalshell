public class bq_4 extends bN_3 {
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] f;

   static void o() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic bN_3.C ()I
      // 003: istore 0
      // 004: sipush 13297
      // 007: sipush -1106
      // 00a: invokestatic bq_4.b (II)Ljava/lang/String;
      // 00d: invokestatic bq_4.r (Ljava/lang/String;)V
      // 010: invokestatic bq_4.m ()V
      // 013: getstatic bq_4.V LxJ;
      // 016: invokevirtual xJ.F ()I
      // 019: istore 1
      // 01a: iload 1
      // 01b: sipush 16509
      // 01e: ldc2_w 1737894327566895502
      // 021: invokestatic bq_4.b (IJ)I
      // 024: iand
      // 025: istore 1
      // 026: sipush 11861
      // 029: getstatic bq_4.V LxJ;
      // 02c: iload 1
      // 02d: invokevirtual xJ.R (I)V
      // 030: ldc2_w 8180420212285761444
      // 033: invokestatic bq_4.b (IJ)I
      // 036: newarray 8
      // 038: astore 2
      // 039: sipush 13704
      // 03c: ldc2_w 3221131188011072636
      // 03f: invokestatic bq_4.b (IJ)I
      // 042: newarray 8
      // 044: astore 3
      // 045: bipush 0
      // 046: istore 4
      // 048: iload 4
      // 04a: sipush 13704
      // 04d: ldc2_w 3221131188011072636
      // 050: invokestatic bq_4.b (IJ)I
      // 053: if_icmpge 06f
      // 056: aload 2
      // 057: iload 4
      // 059: iload 4
      // 05b: i2b
      // 05c: bastore
      // 05d: iinc 4 1
      // 060: iload 0
      // 061: ifne 0ac
      // 064: iload 0
      // 065: ifeq 048
      // 068: goto 06f
      // 06b: invokestatic bq_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: getstatic bq_4.V LxJ;
      // 072: sipush 16056
      // 075: ldc2_w 2538606159833102154
      // 078: invokestatic bq_4.b (IJ)I
      // 07b: invokevirtual xJ.b (I)V
      // 07e: sipush 9171
      // 081: getstatic bq_4.V LxJ;
      // 084: invokevirtual xJ.E ()Ljava/io/OutputStream;
      // 087: putstatic bq_4.y Ljava/io/OutputStream;
      // 08a: ldc2_w 7421509811583248931
      // 08d: getstatic bq_4.V LxJ;
      // 090: invokevirtual xJ.S ()Ljava/io/InputStream;
      // 093: putstatic bq_4.J Ljava/io/InputStream;
      // 096: getstatic bq_4.y Ljava/io/OutputStream;
      // 099: aload 2
      // 09a: invokevirtual java/io/OutputStream.write ([B)V
      // 09d: invokestatic bq_4.b (IJ)I
      // 0a0: invokestatic bq_4.D (I)V
      // 0a3: getstatic bq_4.J Ljava/io/InputStream;
      // 0a6: aload 3
      // 0a7: invokevirtual java/io/InputStream.read ([B)I
      // 0aa: istore 4
      // 0ac: bipush 0
      // 0ad: istore 5
      // 0af: iload 5
      // 0b1: sipush 13704
      // 0b4: ldc2_w 3221131188011072636
      // 0b7: invokestatic bq_4.b (IJ)I
      // 0ba: if_icmpge 0f9
      // 0bd: aload 2
      // 0be: iload 5
      // 0c0: baload
      // 0c1: aload 3
      // 0c2: iload 5
      // 0c4: baload
      // 0c5: iload 0
      // 0c6: ifne 104
      // 0c9: if_icmpeq 0f2
      // 0cc: goto 0d3
      // 0cf: invokestatic bq_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: sipush 13298
      // 0d6: sipush 14681
      // 0d9: invokestatic bq_4.b (II)Ljava/lang/String;
      // 0dc: bipush 1
      // 0dd: anewarray 99
      // 0e0: dup
      // 0e1: bipush 0
      // 0e2: iload 5
      // 0e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e7: aastore
      // 0e8: invokestatic bq_4.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0eb: goto 0f2
      // 0ee: invokestatic bq_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: iinc 5 1
      // 0f5: iload 0
      // 0f6: ifeq 0af
      // 0f9: iload 4
      // 0fb: sipush 13704
      // 0fe: ldc2_w 3221131188011072636
      // 101: invokestatic bq_4.b (IJ)I
      // 104: if_icmpge 126
      // 107: sipush 13299
      // 10a: sipush 5065
      // 10d: invokestatic bq_4.b (II)Ljava/lang/String;
      // 110: bipush 1
      // 111: anewarray 99
      // 114: dup
      // 115: bipush 0
      // 116: iload 4
      // 118: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11b: aastore
      // 11c: invokestatic bq_4.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 11f: goto 126
      // 122: invokestatic bq_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: invokestatic bq_4.i ()V
      // 129: invokestatic bq_4.Y ()V
      // 12c: goto 137
      // 12f: astore 6
      // 131: invokestatic bq_4.Y ()V
      // 134: aload 6
      // 136: athrow
      // 137: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "¸(æê\b\u008f=ÁI\u0004ý~@\u009b»\u008d¢r'\u0016ÜA¿æïÂ\n¤íâý\u0019¦E\u009då\u0095$(X»¡\u0004(\u0082\u000b}ÆÒÜX\"§ìý¢\u0086E\u0094eX·?\u0085æñ\u00026* \f\u009cÍ§\u001fÎå\t\u008a]\u00128Ô\u009d±£6Óã\u009c®\u008aÅK\u0000C\u0010B\u0011Ô\\\\YsÅ©";
      int var12 = "¸(æê\b\u008f=ÁI\u0004ý~@\u009b»\u008d¢r'\u0016ÜA¿æïÂ\n¤íâý\u0019¦E\u009då\u0095$(X»¡\u0004(\u0082\u000b}ÆÒÜX\"§ìý¢\u0086E\u0094eX·?\u0085æñ\u00026* \f\u009cÍ§\u001fÎå\t\u008a]\u00128Ô\u009d±£6Óã\u009c®\u008aÅK\u0000C\u0010B\u0011Ô\\\\YsÅ©"
         .length();
      char var9 = '%';
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 30;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 30;
               var10006 = var14;
            } else {
               var27 = 30;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 30;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 38;
                     break;
                  case 1:
                     var47 = 113;
                     break;
                  case 2:
                     var47 = 100;
                     break;
                  case 3:
                     var47 = 120;
                     break;
                  case 4:
                     var47 = 3;
                     break;
                  case 5:
                     var47 = 75;
                     break;
                  default:
                     var47 = 86;
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
            b = new String[3];
            long var0 = 3740131053283277544L;
            long[] var6 = new long[5];
            int var3 = 0;
            String var4 = "]uûØ,%\u0091?«^Ú\u0007\u001eì\u009cL\u001e1®}Q#\u000eJ";
            int var5 = "]uûØ,%\u0091?«^Ú\u0007\u001eì\u009cL\u001e1®}Q#\u000eJ".length();
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
                           f = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "Æa\u0012\u0006`n\f\u00952åm\u001e°\u000f\u0087\u0094";
                        var5 = "Æa\u0012\u0006`n\f\u00952åm\u001e°\u000f\u0087\u0094".length();
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

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 13299) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 15;
               break;
            case 1:
               var10000 = 158;
               break;
            case 2:
               var10000 = 117;
               break;
            case 3:
               var10000 = 97;
               break;
            case 4:
               var10000 = 157;
               break;
            case 5:
               var10000 = 57;
               break;
            case 6:
               var10000 = 204;
               break;
            case 7:
               var10000 = 31;
               break;
            case 8:
               var10000 = 125;
               break;
            case 9:
               var10000 = 68;
               break;
            case 10:
               var10000 = 101;
               break;
            case 11:
               var10000 = 80;
               break;
            case 12:
               var10000 = 235;
               break;
            case 13:
               var10000 = 182;
               break;
            case 14:
               var10000 = 16;
               break;
            case 15:
               var10000 = 79;
               break;
            case 16:
               var10000 = 227;
               break;
            case 17:
               var10000 = 210;
               break;
            case 18:
               var10000 = 100;
               break;
            case 19:
               var10000 = 179;
               break;
            case 20:
               var10000 = 249;
               break;
            case 21:
               var10000 = 66;
               break;
            case 22:
               var10000 = 106;
               break;
            case 23:
               var10000 = 161;
               break;
            case 24:
               var10000 = 162;
               break;
            case 25:
               var10000 = 35;
               break;
            case 26:
               var10000 = 184;
               break;
            case 27:
               var10000 = 105;
               break;
            case 28:
               var10000 = 4;
               break;
            case 29:
               var10000 = 193;
               break;
            case 30:
               var10000 = 254;
               break;
            case 31:
               var10000 = 211;
               break;
            case 32:
               var10000 = 93;
               break;
            case 33:
               var10000 = 196;
               break;
            case 34:
               var10000 = 85;
               break;
            case 35:
               var10000 = 208;
               break;
            case 36:
               var10000 = 164;
               break;
            case 37:
               var10000 = 160;
               break;
            case 38:
               var10000 = 221;
               break;
            case 39:
               var10000 = 171;
               break;
            case 40:
               var10000 = 76;
               break;
            case 41:
               var10000 = 5;
               break;
            case 42:
               var10000 = 63;
               break;
            case 43:
               var10000 = 232;
               break;
            case 44:
               var10000 = 214;
               break;
            case 45:
               var10000 = 240;
               break;
            case 46:
               var10000 = 188;
               break;
            case 47:
               var10000 = 55;
               break;
            case 48:
               var10000 = 130;
               break;
            case 49:
               var10000 = 153;
               break;
            case 50:
               var10000 = 102;
               break;
            case 51:
               var10000 = 74;
               break;
            case 52:
               var10000 = 236;
               break;
            case 53:
               var10000 = 26;
               break;
            case 54:
               var10000 = 250;
               break;
            case 55:
               var10000 = 42;
               break;
            case 56:
               var10000 = 129;
               break;
            case 57:
               var10000 = 48;
               break;
            case 58:
               var10000 = 231;
               break;
            case 59:
               var10000 = 156;
               break;
            case 60:
               var10000 = 223;
               break;
            case 61:
               var10000 = 30;
               break;
            case 62:
               var10000 = 110;
               break;
            case 63:
               var10000 = 94;
               break;
            case 64:
               var10000 = 230;
               break;
            case 65:
               var10000 = 137;
               break;
            case 66:
               var10000 = 238;
               break;
            case 67:
               var10000 = 3;
               break;
            case 68:
               var10000 = 124;
               break;
            case 69:
               var10000 = 45;
               break;
            case 70:
               var10000 = 84;
               break;
            case 71:
               var10000 = 111;
               break;
            case 72:
               var10000 = 224;
               break;
            case 73:
               var10000 = 248;
               break;
            case 74:
               var10000 = 168;
               break;
            case 75:
               var10000 = 203;
               break;
            case 76:
               var10000 = 149;
               break;
            case 77:
               var10000 = 245;
               break;
            case 78:
               var10000 = 20;
               break;
            case 79:
               var10000 = 120;
               break;
            case 80:
               var10000 = 17;
               break;
            case 81:
               var10000 = 116;
               break;
            case 82:
               var10000 = 200;
               break;
            case 83:
               var10000 = 152;
               break;
            case 84:
               var10000 = 13;
               break;
            case 85:
               var10000 = 142;
               break;
            case 86:
               var10000 = 134;
               break;
            case 87:
               var10000 = 107;
               break;
            case 88:
               var10000 = 191;
               break;
            case 89:
               var10000 = 237;
               break;
            case 90:
               var10000 = 234;
               break;
            case 91:
               var10000 = 82;
               break;
            case 92:
               var10000 = 8;
               break;
            case 93:
               var10000 = 65;
               break;
            case 94:
               var10000 = 133;
               break;
            case 95:
               var10000 = 175;
               break;
            case 96:
               var10000 = 199;
               break;
            case 97:
               var10000 = 59;
               break;
            case 98:
               var10000 = 43;
               break;
            case 99:
               var10000 = 28;
               break;
            case 100:
               var10000 = 112;
               break;
            case 101:
               var10000 = 7;
               break;
            case 102:
               var10000 = 0;
               break;
            case 103:
               var10000 = 61;
               break;
            case 104:
               var10000 = 73;
               break;
            case 105:
               var10000 = 81;
               break;
            case 106:
               var10000 = 2;
               break;
            case 107:
               var10000 = 64;
               break;
            case 108:
               var10000 = 34;
               break;
            case 109:
               var10000 = 122;
               break;
            case 110:
               var10000 = 78;
               break;
            case 111:
               var10000 = 132;
               break;
            case 112:
               var10000 = 23;
               break;
            case 113:
               var10000 = 244;
               break;
            case 114:
               var10000 = 32;
               break;
            case 115:
               var10000 = 243;
               break;
            case 116:
               var10000 = 71;
               break;
            case 117:
               var10000 = 233;
               break;
            case 118:
               var10000 = 146;
               break;
            case 119:
               var10000 = 121;
               break;
            case 120:
               var10000 = 39;
               break;
            case 121:
               var10000 = 58;
               break;
            case 122:
               var10000 = 51;
               break;
            case 123:
               var10000 = 113;
               break;
            case 124:
               var10000 = 87;
               break;
            case 125:
               var10000 = 128;
               break;
            case 126:
               var10000 = 241;
               break;
            case 127:
               var10000 = 189;
               break;
            case 128:
               var10000 = 229;
               break;
            case 129:
               var10000 = 155;
               break;
            case 130:
               var10000 = 103;
               break;
            case 131:
               var10000 = 202;
               break;
            case 132:
               var10000 = 148;
               break;
            case 133:
               var10000 = 222;
               break;
            case 134:
               var10000 = 226;
               break;
            case 135:
               var10000 = 6;
               break;
            case 136:
               var10000 = 86;
               break;
            case 137:
               var10000 = 143;
               break;
            case 138:
               var10000 = 18;
               break;
            case 139:
               var10000 = 192;
               break;
            case 140:
               var10000 = 54;
               break;
            case 141:
               var10000 = 56;
               break;
            case 142:
               var10000 = 72;
               break;
            case 143:
               var10000 = 170;
               break;
            case 144:
               var10000 = 169;
               break;
            case 145:
               var10000 = 247;
               break;
            case 146:
               var10000 = 163;
               break;
            case 147:
               var10000 = 151;
               break;
            case 148:
               var10000 = 98;
               break;
            case 149:
               var10000 = 126;
               break;
            case 150:
               var10000 = 205;
               break;
            case 151:
               var10000 = 123;
               break;
            case 152:
               var10000 = 139;
               break;
            case 153:
               var10000 = 174;
               break;
            case 154:
               var10000 = 141;
               break;
            case 155:
               var10000 = 62;
               break;
            case 156:
               var10000 = 255;
               break;
            case 157:
               var10000 = 194;
               break;
            case 158:
               var10000 = 197;
               break;
            case 159:
               var10000 = 218;
               break;
            case 160:
               var10000 = 33;
               break;
            case 161:
               var10000 = 242;
               break;
            case 162:
               var10000 = 95;
               break;
            case 163:
               var10000 = 251;
               break;
            case 164:
               var10000 = 46;
               break;
            case 165:
               var10000 = 147;
               break;
            case 166:
               var10000 = 99;
               break;
            case 167:
               var10000 = 228;
               break;
            case 168:
               var10000 = 67;
               break;
            case 169:
               var10000 = 118;
               break;
            case 170:
               var10000 = 220;
               break;
            case 171:
               var10000 = 145;
               break;
            case 172:
               var10000 = 186;
               break;
            case 173:
               var10000 = 239;
               break;
            case 174:
               var10000 = 25;
               break;
            case 175:
               var10000 = 183;
               break;
            case 176:
               var10000 = 195;
               break;
            case 177:
               var10000 = 119;
               break;
            case 178:
               var10000 = 114;
               break;
            case 179:
               var10000 = 166;
               break;
            case 180:
               var10000 = 252;
               break;
            case 181:
               var10000 = 38;
               break;
            case 182:
               var10000 = 47;
               break;
            case 183:
               var10000 = 173;
               break;
            case 184:
               var10000 = 52;
               break;
            case 185:
               var10000 = 217;
               break;
            case 186:
               var10000 = 70;
               break;
            case 187:
               var10000 = 49;
               break;
            case 188:
               var10000 = 91;
               break;
            case 189:
               var10000 = 14;
               break;
            case 190:
               var10000 = 104;
               break;
            case 191:
               var10000 = 88;
               break;
            case 192:
               var10000 = 27;
               break;
            case 193:
               var10000 = 246;
               break;
            case 194:
               var10000 = 21;
               break;
            case 195:
               var10000 = 190;
               break;
            case 196:
               var10000 = 135;
               break;
            case 197:
               var10000 = 9;
               break;
            case 198:
               var10000 = 131;
               break;
            case 199:
               var10000 = 22;
               break;
            case 200:
               var10000 = 53;
               break;
            case 201:
               var10000 = 165;
               break;
            case 202:
               var10000 = 167;
               break;
            case 203:
               var10000 = 19;
               break;
            case 204:
               var10000 = 212;
               break;
            case 205:
               var10000 = 37;
               break;
            case 206:
               var10000 = 11;
               break;
            case 207:
               var10000 = 201;
               break;
            case 208:
               var10000 = 144;
               break;
            case 209:
               var10000 = 10;
               break;
            case 210:
               var10000 = 24;
               break;
            case 211:
               var10000 = 150;
               break;
            case 212:
               var10000 = 96;
               break;
            case 213:
               var10000 = 206;
               break;
            case 214:
               var10000 = 213;
               break;
            case 215:
               var10000 = 36;
               break;
            case 216:
               var10000 = 90;
               break;
            case 217:
               var10000 = 181;
               break;
            case 218:
               var10000 = 77;
               break;
            case 219:
               var10000 = 41;
               break;
            case 220:
               var10000 = 138;
               break;
            case 221:
               var10000 = 83;
               break;
            case 222:
               var10000 = 154;
               break;
            case 223:
               var10000 = 140;
               break;
            case 224:
               var10000 = 92;
               break;
            case 225:
               var10000 = 50;
               break;
            case 226:
               var10000 = 159;
               break;
            case 227:
               var10000 = 177;
               break;
            case 228:
               var10000 = 178;
               break;
            case 229:
               var10000 = 225;
               break;
            case 230:
               var10000 = 172;
               break;
            case 231:
               var10000 = 29;
               break;
            case 232:
               var10000 = 75;
               break;
            case 233:
               var10000 = 89;
               break;
            case 234:
               var10000 = 253;
               break;
            case 235:
               var10000 = 40;
               break;
            case 236:
               var10000 = 109;
               break;
            case 237:
               var10000 = 216;
               break;
            case 238:
               var10000 = 115;
               break;
            case 239:
               var10000 = 215;
               break;
            case 240:
               var10000 = 198;
               break;
            case 241:
               var10000 = 185;
               break;
            case 242:
               var10000 = 60;
               break;
            case 243:
               var10000 = 180;
               break;
            case 244:
               var10000 = 176;
               break;
            case 245:
               var10000 = 219;
               break;
            case 246:
               var10000 = 12;
               break;
            case 247:
               var10000 = 136;
               break;
            case 248:
               var10000 = 187;
               break;
            case 249:
               var10000 = 209;
               break;
            case 250:
               var10000 = 207;
               break;
            case 251:
               var10000 = 108;
               break;
            case 252:
               var10000 = 127;
               break;
            case 253:
               var10000 = 1;
               break;
            case 254:
               var10000 = 69;
               break;
            default:
               var10000 = 44;
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18928;
      if (f[var3] == null) {
         f[var3] = (int)(c[var3] ^ var1);
      }

      return f[var3];
   }
}





