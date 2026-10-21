package com.finalshell.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class NW implements FW3 {
   byte[] N;
   int a;
   int g;
   int A;
   Random S;
   final InputStream T;
   final OutputStream J;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   NW(InputStream var1, OutputStream var2) {
      this.T = var1;
      this.J = var2;
      this.N = new byte[a(6085, 1987690668988592585L)];
      this.a = 0;
      this.g = 0;
      this.A = 0;
      this.S = new Random();
   }

   @Override
   public void w(TX param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/BN3.Z ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual com/finalshell/core/TX.C ()I
      // 008: bipush 1
      // 009: iload 2
      // 00a: ifeq 159
      // 00d: if_icmpne 154
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield com/finalshell/core/NW.T Ljava/io/InputStream;
      // 01b: invokevirtual java/io/InputStream.available ()I
      // 01e: istore 3
      // 01f: iload 3
      // 020: newarray 8
      // 022: astore 4
      // 024: aload 0
      // 025: getfield com/finalshell/core/NW.T Ljava/io/InputStream;
      // 028: aload 4
      // 02a: bipush 0
      // 02b: iload 3
      // 02c: invokevirtual java/io/InputStream.read ([BII)I
      // 02f: istore 3
      // 030: bipush 0
      // 031: istore 5
      // 033: iload 5
      // 035: iload 3
      // 036: if_icmpge 154
      // 039: aload 4
      // 03b: iload 5
      // 03d: baload
      // 03e: istore 6
      // 040: aload 0
      // 041: getfield com/finalshell/core/NW.N [B
      // 044: aload 0
      // 045: dup
      // 046: getfield com/finalshell/core/NW.a I
      // 049: dup_x1
      // 04a: bipush 1
      // 04b: iadd
      // 04c: putfield com/finalshell/core/NW.a I
      // 04f: iload 6
      // 051: bastore
      // 052: iload 2
      // 053: ifeq 150
      // 056: iload 6
      // 058: sipush 17401
      // 05b: ldc2_w 9007811334643918326
      // 05e: invokestatic com/finalshell/core/NW.a (IJ)I
      // 061: iload 2
      // 062: ifeq 159
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06b: athrow
      // 06c: if_icmpne 14d
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: bipush 0
      // 077: istore 7
      // 079: bipush 0
      // 07a: istore 8
      // 07c: iload 8
      // 07e: aload 0
      // 07f: getfield com/finalshell/core/NW.a I
      // 082: bipush 2
      // 083: isub
      // 084: if_icmpge 0a5
      // 087: iload 7
      // 089: aload 0
      // 08a: getfield com/finalshell/core/NW.N [B
      // 08d: iload 8
      // 08f: baload
      // 090: iadd
      // 091: istore 7
      // 093: iinc 8 1
      // 096: iload 2
      // 097: ifeq 150
      // 09a: iload 2
      // 09b: ifne 07c
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: sipush 778
      // 0a8: ldc2_w 3526486518425183495
      // 0ab: invokestatic com/finalshell/core/NW.a (IJ)I
      // 0ae: iload 7
      // 0b0: sipush 29255
      // 0b3: ldc2_w 5492244047842186318
      // 0b6: invokestatic com/finalshell/core/NW.a (IJ)I
      // 0b9: iand
      // 0ba: iadd
      // 0bb: i2b
      // 0bc: istore 9
      // 0be: aload 0
      // 0bf: dup
      // 0c0: getfield com/finalshell/core/NW.g I
      // 0c3: bipush 1
      // 0c4: iadd
      // 0c5: putfield com/finalshell/core/NW.g I
      // 0c8: iload 2
      // 0c9: ifeq 148
      // 0cc: iload 9
      // 0ce: aload 0
      // 0cf: getfield com/finalshell/core/NW.N [B
      // 0d2: iload 8
      // 0d4: baload
      // 0d5: if_icmpeq 0ff
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0e2: sipush 12005
      // 0e5: sipush -22650
      // 0e8: invokestatic com/finalshell/core/NW.a (II)Ljava/lang/String;
      // 0eb: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0ee: aload 0
      // 0ef: dup
      // 0f0: getfield com/finalshell/core/NW.A I
      // 0f3: bipush 1
      // 0f4: iadd
      // 0f5: putfield com/finalshell/core/NW.A I
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 102: new java/lang/StringBuilder
      // 105: dup
      // 106: invokespecial java/lang/StringBuilder.<init> ()V
      // 109: sipush 12004
      // 10c: sipush 644
      // 10f: invokestatic com/finalshell/core/NW.a (II)Ljava/lang/String;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: aload 0
      // 116: getfield com/finalshell/core/NW.a I
      // 119: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 11c: sipush 12007
      // 11f: sipush -564
      // 122: invokestatic com/finalshell/core/NW.a (II)Ljava/lang/String;
      // 125: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 128: aload 0
      // 129: getfield com/finalshell/core/NW.g I
      // 12c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 12f: sipush 12006
      // 132: sipush 16240
      // 135: invokestatic com/finalshell/core/NW.a (II)Ljava/lang/String;
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: aload 0
      // 13c: getfield com/finalshell/core/NW.A I
      // 13f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 142: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 145: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 148: aload 0
      // 149: bipush 0
      // 14a: putfield com/finalshell/core/NW.a I
      // 14d: iinc 5 1
      // 150: iload 2
      // 151: ifne 033
      // 154: aload 1
      // 155: invokevirtual com/finalshell/core/TX.C ()I
      // 158: bipush 2
      // 159: iload 2
      // 15a: ifeq 180
      // 15d: if_icmpne 210
      // 160: goto 167
      // 163: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: bipush 4
      // 168: aload 0
      // 169: getfield com/finalshell/core/NW.S Ljava/util/Random;
      // 16c: invokevirtual java/util/Random.nextInt ()I
      // 16f: sipush 9670
      // 172: ldc2_w 1457789888118539213
      // 175: invokestatic com/finalshell/core/NW.a (IJ)I
      // 178: iand
      // 179: goto 180
      // 17c: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: iadd
      // 181: istore 3
      // 182: iload 3
      // 183: bipush 2
      // 184: iadd
      // 185: newarray 8
      // 187: astore 4
      // 189: bipush 0
      // 18a: istore 5
      // 18c: bipush 0
      // 18d: istore 6
      // 18f: iload 6
      // 191: iload 3
      // 192: if_icmpge 1d3
      // 195: sipush 30001
      // 198: ldc2_w 540465686706230075
      // 19b: invokestatic com/finalshell/core/NW.a (IJ)I
      // 19e: aload 0
      // 19f: getfield com/finalshell/core/NW.S Ljava/util/Random;
      // 1a2: invokevirtual java/util/Random.nextInt ()I
      // 1a5: sipush 9670
      // 1a8: ldc2_w 1457789888118539213
      // 1ab: invokestatic com/finalshell/core/NW.a (IJ)I
      // 1ae: iand
      // 1af: iadd
      // 1b0: i2b
      // 1b1: istore 7
      // 1b3: aload 4
      // 1b5: iload 6
      // 1b7: iload 7
      // 1b9: bastore
      // 1ba: iload 5
      // 1bc: iload 7
      // 1be: iadd
      // 1bf: istore 5
      // 1c1: iinc 6 1
      // 1c4: iload 2
      // 1c5: ifeq 203
      // 1c8: iload 2
      // 1c9: ifne 18f
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/core/NW.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: aload 4
      // 1d5: iload 6
      // 1d7: iinc 6 1
      // 1da: sipush 30001
      // 1dd: ldc2_w 540465686706230075
      // 1e0: invokestatic com/finalshell/core/NW.a (IJ)I
      // 1e3: iload 5
      // 1e5: sipush 9670
      // 1e8: ldc2_w 1457789888118539213
      // 1eb: invokestatic com/finalshell/core/NW.a (IJ)I
      // 1ee: iand
      // 1ef: iadd
      // 1f0: i2b
      // 1f1: bastore
      // 1f2: aload 4
      // 1f4: iload 6
      // 1f6: iinc 6 1
      // 1f9: sipush 9836
      // 1fc: ldc2_w 828087793160667234
      // 1ff: invokestatic com/finalshell/core/NW.a (IJ)I
      // 202: bastore
      // 203: aload 0
      // 204: getfield com/finalshell/core/NW.J Ljava/io/OutputStream;
      // 207: aload 4
      // 209: bipush 0
      // 20a: aload 4
      // 20c: arraylength
      // 20d: invokevirtual java/io/OutputStream.write ([BII)V
      // 210: goto 218
      // 213: astore 3
      // 214: aload 3
      // 215: invokevirtual java/lang/Exception.printStackTrace ()V
      // 218: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 12006) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 34;
               break;
            case 1:
               var10000 = 70;
               break;
            case 2:
               var10000 = 50;
               break;
            case 3:
               var10000 = 157;
               break;
            case 4:
               var10000 = 22;
               break;
            case 5:
               var10000 = 250;
               break;
            case 6:
               var10000 = 78;
               break;
            case 7:
               var10000 = 251;
               break;
            case 8:
               var10000 = 200;
               break;
            case 9:
               var10000 = 231;
               break;
            case 10:
               var10000 = 84;
               break;
            case 11:
               var10000 = 47;
               break;
            case 12:
               var10000 = 18;
               break;
            case 13:
               var10000 = 80;
               break;
            case 14:
               var10000 = 238;
               break;
            case 15:
               var10000 = 68;
               break;
            case 16:
               var10000 = 108;
               break;
            case 17:
               var10000 = 99;
               break;
            case 18:
               var10000 = 48;
               break;
            case 19:
               var10000 = 66;
               break;
            case 20:
               var10000 = 90;
               break;
            case 21:
               var10000 = 208;
               break;
            case 22:
               var10000 = 11;
               break;
            case 23:
               var10000 = 150;
               break;
            case 24:
               var10000 = 131;
               break;
            case 25:
               var10000 = 97;
               break;
            case 26:
               var10000 = 212;
               break;
            case 27:
               var10000 = 160;
               break;
            case 28:
               var10000 = 8;
               break;
            case 29:
               var10000 = 223;
               break;
            case 30:
               var10000 = 169;
               break;
            case 31:
               var10000 = 207;
               break;
            case 32:
               var10000 = 240;
               break;
            case 33:
               var10000 = 219;
               break;
            case 34:
               var10000 = 57;
               break;
            case 35:
               var10000 = 114;
               break;
            case 36:
               var10000 = 36;
               break;
            case 37:
               var10000 = 202;
               break;
            case 38:
               var10000 = 218;
               break;
            case 39:
               var10000 = 96;
               break;
            case 40:
               var10000 = 44;
               break;
            case 41:
               var10000 = 38;
               break;
            case 42:
               var10000 = 25;
               break;
            case 43:
               var10000 = 19;
               break;
            case 44:
               var10000 = 185;
               break;
            case 45:
               var10000 = 214;
               break;
            case 46:
               var10000 = 28;
               break;
            case 47:
               var10000 = 158;
               break;
            case 48:
               var10000 = 134;
               break;
            case 49:
               var10000 = 37;
               break;
            case 50:
               var10000 = 41;
               break;
            case 51:
               var10000 = 88;
               break;
            case 52:
               var10000 = 92;
               break;
            case 53:
               var10000 = 226;
               break;
            case 54:
               var10000 = 46;
               break;
            case 55:
               var10000 = 181;
               break;
            case 56:
               var10000 = 32;
               break;
            case 57:
               var10000 = 104;
               break;
            case 58:
               var10000 = 201;
               break;
            case 59:
               var10000 = 197;
               break;
            case 60:
               var10000 = 152;
               break;
            case 61:
               var10000 = 237;
               break;
            case 62:
               var10000 = 112;
               break;
            case 63:
               var10000 = 3;
               break;
            case 64:
               var10000 = 165;
               break;
            case 65:
               var10000 = 209;
               break;
            case 66:
               var10000 = 125;
               break;
            case 67:
               var10000 = 193;
               break;
            case 68:
               var10000 = 91;
               break;
            case 69:
               var10000 = 126;
               break;
            case 70:
               var10000 = 62;
               break;
            case 71:
               var10000 = 253;
               break;
            case 72:
               var10000 = 109;
               break;
            case 73:
               var10000 = 224;
               break;
            case 74:
               var10000 = 10;
               break;
            case 75:
               var10000 = 82;
               break;
            case 76:
               var10000 = 172;
               break;
            case 77:
               var10000 = 33;
               break;
            case 78:
               var10000 = 161;
               break;
            case 79:
               var10000 = 221;
               break;
            case 80:
               var10000 = 0;
               break;
            case 81:
               var10000 = 35;
               break;
            case 82:
               var10000 = 148;
               break;
            case 83:
               var10000 = 230;
               break;
            case 84:
               var10000 = 116;
               break;
            case 85:
               var10000 = 29;
               break;
            case 86:
               var10000 = 164;
               break;
            case 87:
               var10000 = 103;
               break;
            case 88:
               var10000 = 95;
               break;
            case 89:
               var10000 = 153;
               break;
            case 90:
               var10000 = 199;
               break;
            case 91:
               var10000 = 186;
               break;
            case 92:
               var10000 = 198;
               break;
            case 93:
               var10000 = 249;
               break;
            case 94:
               var10000 = 21;
               break;
            case 95:
               var10000 = 194;
               break;
            case 96:
               var10000 = 156;
               break;
            case 97:
               var10000 = 100;
               break;
            case 98:
               var10000 = 204;
               break;
            case 99:
               var10000 = 77;
               break;
            case 100:
               var10000 = 187;
               break;
            case 101:
               var10000 = 132;
               break;
            case 102:
               var10000 = 247;
               break;
            case 103:
               var10000 = 211;
               break;
            case 104:
               var10000 = 118;
               break;
            case 105:
               var10000 = 120;
               break;
            case 106:
               var10000 = 30;
               break;
            case 107:
               var10000 = 17;
               break;
            case 108:
               var10000 = 130;
               break;
            case 109:
               var10000 = 123;
               break;
            case 110:
               var10000 = 61;
               break;
            case 111:
               var10000 = 60;
               break;
            case 112:
               var10000 = 245;
               break;
            case 113:
               var10000 = 128;
               break;
            case 114:
               var10000 = 94;
               break;
            case 115:
               var10000 = 206;
               break;
            case 116:
               var10000 = 23;
               break;
            case 117:
               var10000 = 15;
               break;
            case 118:
               var10000 = 121;
               break;
            case 119:
               var10000 = 87;
               break;
            case 120:
               var10000 = 159;
               break;
            case 121:
               var10000 = 179;
               break;
            case 122:
               var10000 = 63;
               break;
            case 123:
               var10000 = 149;
               break;
            case 124:
               var10000 = 182;
               break;
            case 125:
               var10000 = 101;
               break;
            case 126:
               var10000 = 191;
               break;
            case 127:
               var10000 = 106;
               break;
            case 128:
               var10000 = 178;
               break;
            case 129:
               var10000 = 39;
               break;
            case 130:
               var10000 = 171;
               break;
            case 131:
               var10000 = 105;
               break;
            case 132:
               var10000 = 86;
               break;
            case 133:
               var10000 = 246;
               break;
            case 134:
               var10000 = 145;
               break;
            case 135:
               var10000 = 83;
               break;
            case 136:
               var10000 = 129;
               break;
            case 137:
               var10000 = 241;
               break;
            case 138:
               var10000 = 98;
               break;
            case 139:
               var10000 = 170;
               break;
            case 140:
               var10000 = 141;
               break;
            case 141:
               var10000 = 196;
               break;
            case 142:
               var10000 = 133;
               break;
            case 143:
               var10000 = 13;
               break;
            case 144:
               var10000 = 140;
               break;
            case 145:
               var10000 = 111;
               break;
            case 146:
               var10000 = 72;
               break;
            case 147:
               var10000 = 5;
               break;
            case 148:
               var10000 = 195;
               break;
            case 149:
               var10000 = 93;
               break;
            case 150:
               var10000 = 143;
               break;
            case 151:
               var10000 = 234;
               break;
            case 152:
               var10000 = 27;
               break;
            case 153:
               var10000 = 151;
               break;
            case 154:
               var10000 = 110;
               break;
            case 155:
               var10000 = 252;
               break;
            case 156:
               var10000 = 81;
               break;
            case 157:
               var10000 = 124;
               break;
            case 158:
               var10000 = 175;
               break;
            case 159:
               var10000 = 174;
               break;
            case 160:
               var10000 = 64;
               break;
            case 161:
               var10000 = 138;
               break;
            case 162:
               var10000 = 9;
               break;
            case 163:
               var10000 = 24;
               break;
            case 164:
               var10000 = 56;
               break;
            case 165:
               var10000 = 213;
               break;
            case 166:
               var10000 = 59;
               break;
            case 167:
               var10000 = 40;
               break;
            case 168:
               var10000 = 53;
               break;
            case 169:
               var10000 = 210;
               break;
            case 170:
               var10000 = 176;
               break;
            case 171:
               var10000 = 115;
               break;
            case 172:
               var10000 = 236;
               break;
            case 173:
               var10000 = 242;
               break;
            case 174:
               var10000 = 69;
               break;
            case 175:
               var10000 = 217;
               break;
            case 176:
               var10000 = 6;
               break;
            case 177:
               var10000 = 146;
               break;
            case 178:
               var10000 = 220;
               break;
            case 179:
               var10000 = 14;
               break;
            case 180:
               var10000 = 43;
               break;
            case 181:
               var10000 = 163;
               break;
            case 182:
               var10000 = 244;
               break;
            case 183:
               var10000 = 142;
               break;
            case 184:
               var10000 = 233;
               break;
            case 185:
               var10000 = 74;
               break;
            case 186:
               var10000 = 222;
               break;
            case 187:
               var10000 = 55;
               break;
            case 188:
               var10000 = 26;
               break;
            case 189:
               var10000 = 102;
               break;
            case 190:
               var10000 = 4;
               break;
            case 191:
               var10000 = 177;
               break;
            case 192:
               var10000 = 167;
               break;
            case 193:
               var10000 = 127;
               break;
            case 194:
               var10000 = 254;
               break;
            case 195:
               var10000 = 45;
               break;
            case 196:
               var10000 = 52;
               break;
            case 197:
               var10000 = 154;
               break;
            case 198:
               var10000 = 136;
               break;
            case 199:
               var10000 = 147;
               break;
            case 200:
               var10000 = 1;
               break;
            case 201:
               var10000 = 183;
               break;
            case 202:
               var10000 = 7;
               break;
            case 203:
               var10000 = 139;
               break;
            case 204:
               var10000 = 173;
               break;
            case 205:
               var10000 = 188;
               break;
            case 206:
               var10000 = 216;
               break;
            case 207:
               var10000 = 228;
               break;
            case 208:
               var10000 = 229;
               break;
            case 209:
               var10000 = 137;
               break;
            case 210:
               var10000 = 89;
               break;
            case 211:
               var10000 = 12;
               break;
            case 212:
               var10000 = 232;
               break;
            case 213:
               var10000 = 255;
               break;
            case 214:
               var10000 = 205;
               break;
            case 215:
               var10000 = 248;
               break;
            case 216:
               var10000 = 155;
               break;
            case 217:
               var10000 = 203;
               break;
            case 218:
               var10000 = 227;
               break;
            case 219:
               var10000 = 190;
               break;
            case 220:
               var10000 = 73;
               break;
            case 221:
               var10000 = 76;
               break;
            case 222:
               var10000 = 42;
               break;
            case 223:
               var10000 = 75;
               break;
            case 224:
               var10000 = 135;
               break;
            case 225:
               var10000 = 180;
               break;
            case 226:
               var10000 = 119;
               break;
            case 227:
               var10000 = 117;
               break;
            case 228:
               var10000 = 162;
               break;
            case 229:
               var10000 = 144;
               break;
            case 230:
               var10000 = 215;
               break;
            case 231:
               var10000 = 113;
               break;
            case 232:
               var10000 = 122;
               break;
            case 233:
               var10000 = 225;
               break;
            case 234:
               var10000 = 54;
               break;
            case 235:
               var10000 = 58;
               break;
            case 236:
               var10000 = 65;
               break;
            case 237:
               var10000 = 168;
               break;
            case 238:
               var10000 = 67;
               break;
            case 239:
               var10000 = 51;
               break;
            case 240:
               var10000 = 2;
               break;
            case 241:
               var10000 = 239;
               break;
            case 242:
               var10000 = 107;
               break;
            case 243:
               var10000 = 243;
               break;
            case 244:
               var10000 = 189;
               break;
            case 245:
               var10000 = 184;
               break;
            case 246:
               var10000 = 31;
               break;
            case 247:
               var10000 = 235;
               break;
            case 248:
               var10000 = 166;
               break;
            case 249:
               var10000 = 71;
               break;
            case 250:
               var10000 = 16;
               break;
            case 251:
               var10000 = 79;
               break;
            case 252:
               var10000 = 192;
               break;
            case 253:
               var10000 = 49;
               break;
            case 254:
               var10000 = 20;
               break;
            default:
               var10000 = 85;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26127;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = " É\u00863X\u0004#hÿ\u001e";
      int var12 = " É\u00863X\u0004#hÿ\u001e".length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 108;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 120;
                        break;
                     case 1:
                        var65 = 35;
                        break;
                     case 2:
                        var65 = 58;
                        break;
                     case 3:
                        var65 = 52;
                        break;
                     case 4:
                        var65 = 50;
                        break;
                     case 5:
                        var65 = 16;
                        break;
                     default:
                        var65 = 1;
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
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     b = var13;
                     c = new String[4];
                     long var0 = 5026911593148297007L;
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "û\u0090\u0010&'Õ\u008aÓ\u0003\u00959\u001d0ÈoGþ\u009a¨}9\nJ\bJþ.Ö\n\u0089ùö\u00adçd¸$\u0093ìÝ";
                     int var5 = "û\u0090\u0010&'Õ\u008aÓ\u0003\u00959\u001d0ÈoGþ\u009a¨}9\nJ\bJþ.Ö\n\u0089ùö\u00adçd¸$\u0093ìÝ".length();
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
                                    d = var6;
                                    e = new Integer[7];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0002Ë´ög\u008c<4\u0096íÉw\u0011\u0086»^";
                                 var5 = "\u0002Ë´ög\u008c<4\u0096íÉw\u0011\u0086»^".length();
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

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "D\u008fmë\u0011\u007f\u000eÇàXÒN\u0006Íy8h%\u001c\u0098dï";
                  var12 = "D\u008fmë\u0011\u007f\u000eÇàXÒN\u0006Íy8h%\u001c\u0098dï".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 120;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





