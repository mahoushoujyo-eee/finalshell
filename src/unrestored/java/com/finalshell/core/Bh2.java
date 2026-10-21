package com.finalshell.core;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;

public class Bh2 implements SC {
   public int[] e;
   public int P;
   public int p;
   public int g = 0;
   public boolean W = false;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public Bh2(BufferedImage var1) {
      this(var1, false);
   }

   public Bh2(BufferedImage var1, boolean var2) {
      this(var1, 0, var2);
   }

   public Bh2(BufferedImage var1, int var2, boolean var3) {
      this.g(this.I(var1, 0, 0, var1.getWidth(), var1.getHeight(), null), var1.getWidth(), var1.getHeight(), var2, var3);
   }

   public Bh2(int[] var1, int var2, int var3, int var4, boolean var5) {
      this.g(var1, var2, var3, var4, var5);
   }

   public Bh2(Image var1) {
      this(var1, 0, false);
   }

   public Bh2(Image var1, int var2, boolean var3) {
      PixelGrabber var4 = new PixelGrabber(var1, 0, 0, -1, -1, null, 0, -1);

      try {
         var4.grabPixels();
      } catch (InterruptedException var6) {
         throw new RuntimeException(a(-10852, -9178));
      }

      try {
         if ((var4.status() & a(31648, 2300948338531180125L)) != 0) {
            throw new RuntimeException(a(-10851, -8411));
         }
      } catch (RuntimeException var7) {
         throw new RuntimeException(a(var7));
      }

      this.g((int[])var4.getPixels(), var4.getWidth(), var4.getHeight(), var2, var3);
   }

   public int[] I(BufferedImage param1, int param2, int param3, int param4, int param5, int[] param6) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/UZ.h ()Ljava/lang/String;
      // 03: aload 1
      // 04: invokevirtual java/awt/image/BufferedImage.getType ()I
      // 07: istore 8
      // 09: astore 7
      // 0b: iload 8
      // 0d: bipush 2
      // 0e: aload 7
      // 10: ifnonnull 27
      // 13: if_icmpeq 2a
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: iload 8
      // 1f: bipush 1
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: if_icmpne 41
      // 2a: aload 1
      // 2b: invokevirtual java/awt/image/BufferedImage.getRaster ()Ljava/awt/image/WritableRaster;
      // 2e: iload 2
      // 2f: iload 3
      // 30: iload 4
      // 32: iload 5
      // 34: aload 6
      // 36: invokevirtual java/awt/image/WritableRaster.getDataElements (IIIILjava/lang/Object;)Ljava/lang/Object;
      // 39: checkcast [I
      // 3c: areturn
      // 3d: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 1
      // 42: iload 2
      // 43: iload 3
      // 44: iload 4
      // 46: iload 5
      // 48: aload 6
      // 4a: bipush 0
      // 4b: iload 4
      // 4d: invokevirtual java/awt/image/BufferedImage.getRGB (IIII[III)[I
      // 50: areturn
   }

   public void g(int[] var1, int var2, int var3, int var4, boolean var5) {
      this.e = var1;
      this.P = var2;
      this.p = var3;
      this.g = var4;
      this.W = var5;
   }

   @Override
   public float h(float param1, float param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/UZ.h ()Ljava/lang/String;
      // 003: fload 1
      // 004: f2i
      // 005: istore 4
      // 007: fload 2
      // 008: f2i
      // 009: istore 5
      // 00b: astore 3
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/Bh2.g I
      // 010: aload 3
      // 011: ifnonnull 042
      // 014: bipush 2
      // 015: if_icmpne 039
      // 018: goto 01f
      // 01b: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01e: athrow
      // 01f: iload 4
      // 021: aload 0
      // 022: getfield com/finalshell/core/Bh2.P I
      // 025: invokestatic com/finalshell/core/NM.r (II)I
      // 028: istore 4
      // 02a: iload 5
      // 02c: aload 0
      // 02d: getfield com/finalshell/core/Bh2.p I
      // 030: invokestatic com/finalshell/core/NM.r (II)I
      // 033: istore 5
      // 035: aload 3
      // 036: ifnull 130
      // 039: iload 4
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 3
      // 043: ifnonnull 0a8
      // 046: iflt 09d
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: iload 5
      // 052: aload 3
      // 053: ifnonnull 0a8
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: iflt 09d
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: iload 4
      // 069: aload 3
      // 06a: ifnonnull 0a8
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 0
      // 075: getfield com/finalshell/core/Bh2.P I
      // 078: if_icmpge 09d
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: iload 5
      // 084: aload 3
      // 085: ifnonnull 134
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: aload 0
      // 090: getfield com/finalshell/core/Bh2.p I
      // 093: if_icmplt 130
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: aload 0
      // 09e: getfield com/finalshell/core/Bh2.g I
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: aload 3
      // 0a9: ifnonnull 0be
      // 0ac: ifne 0bc
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: fconst_0
      // 0b7: freturn
      // 0b8: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: iload 4
      // 0be: aload 3
      // 0bf: ifnonnull 0dc
      // 0c2: ifge 0d3
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: bipush 0
      // 0cd: istore 4
      // 0cf: aload 3
      // 0d0: ifnull 0f6
      // 0d3: iload 4
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: aload 3
      // 0dd: ifnonnull 0f8
      // 0e0: aload 0
      // 0e1: getfield com/finalshell/core/Bh2.P I
      // 0e4: if_icmplt 0f6
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/core/Bh2.P I
      // 0f2: bipush 1
      // 0f3: isub
      // 0f4: istore 4
      // 0f6: iload 5
      // 0f8: aload 3
      // 0f9: ifnonnull 116
      // 0fc: ifge 10d
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: bipush 0
      // 107: istore 5
      // 109: aload 3
      // 10a: ifnull 130
      // 10d: iload 5
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 3
      // 117: ifnonnull 134
      // 11a: aload 0
      // 11b: getfield com/finalshell/core/Bh2.p I
      // 11e: if_icmplt 130
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 0
      // 129: getfield com/finalshell/core/Bh2.p I
      // 12c: bipush 1
      // 12d: isub
      // 12e: istore 5
      // 130: aload 0
      // 131: getfield com/finalshell/core/Bh2.W Z
      // 134: aload 3
      // 135: ifnonnull 182
      // 138: ifeq 170
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: aload 0
      // 143: getfield com/finalshell/core/Bh2.e [I
      // 146: iload 5
      // 148: aload 0
      // 149: getfield com/finalshell/core/Bh2.P I
      // 14c: imul
      // 14d: iload 4
      // 14f: iadd
      // 150: iaload
      // 151: sipush 4155
      // 154: ldc2_w 4797142761498146247
      // 157: invokestatic com/finalshell/core/Bh2.a (IJ)I
      // 15a: ishr
      // 15b: sipush 14338
      // 15e: ldc2_w 8827903151040028157
      // 161: invokestatic com/finalshell/core/Bh2.a (IJ)I
      // 164: iand
      // 165: i2f
      // 166: ldc 255.0
      // 168: fdiv
      // 169: goto 186
      // 16c: invokestatic com/finalshell/core/Bh2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: aload 0
      // 171: getfield com/finalshell/core/Bh2.e [I
      // 174: iload 5
      // 176: aload 0
      // 177: getfield com/finalshell/core/Bh2.P I
      // 17a: imul
      // 17b: iload 4
      // 17d: iadd
      // 17e: iaload
      // 17f: invokestatic com/finalshell/core/Iw4.g (I)I
      // 182: i2f
      // 183: ldc 255.0
      // 185: fdiv
      // 186: freturn
   }

   public void O(int var1) {
      this.g = var1;
   }

   public int X() {
      return this.g;
   }

   public int H() {
      return this.P;
   }

   public int n() {
      return this.p;
   }

   public int[] d() {
      return this.e;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -10852) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 24;
               break;
            case 1:
               var10000 = 42;
               break;
            case 2:
               var10000 = 213;
               break;
            case 3:
               var10000 = 163;
               break;
            case 4:
               var10000 = 208;
               break;
            case 5:
               var10000 = 131;
               break;
            case 6:
               var10000 = 158;
               break;
            case 7:
               var10000 = 36;
               break;
            case 8:
               var10000 = 89;
               break;
            case 9:
               var10000 = 69;
               break;
            case 10:
               var10000 = 99;
               break;
            case 11:
               var10000 = 34;
               break;
            case 12:
               var10000 = 35;
               break;
            case 13:
               var10000 = 12;
               break;
            case 14:
               var10000 = 124;
               break;
            case 15:
               var10000 = 71;
               break;
            case 16:
               var10000 = 49;
               break;
            case 17:
               var10000 = 23;
               break;
            case 18:
               var10000 = 184;
               break;
            case 19:
               var10000 = 159;
               break;
            case 20:
               var10000 = 76;
               break;
            case 21:
               var10000 = 224;
               break;
            case 22:
               var10000 = 228;
               break;
            case 23:
               var10000 = 205;
               break;
            case 24:
               var10000 = 148;
               break;
            case 25:
               var10000 = 54;
               break;
            case 26:
               var10000 = 250;
               break;
            case 27:
               var10000 = 78;
               break;
            case 28:
               var10000 = 107;
               break;
            case 29:
               var10000 = 227;
               break;
            case 30:
               var10000 = 118;
               break;
            case 31:
               var10000 = 229;
               break;
            case 32:
               var10000 = 251;
               break;
            case 33:
               var10000 = 236;
               break;
            case 34:
               var10000 = 9;
               break;
            case 35:
               var10000 = 154;
               break;
            case 36:
               var10000 = 216;
               break;
            case 37:
               var10000 = 18;
               break;
            case 38:
               var10000 = 29;
               break;
            case 39:
               var10000 = 161;
               break;
            case 40:
               var10000 = 110;
               break;
            case 41:
               var10000 = 31;
               break;
            case 42:
               var10000 = 247;
               break;
            case 43:
               var10000 = 61;
               break;
            case 44:
               var10000 = 96;
               break;
            case 45:
               var10000 = 138;
               break;
            case 46:
               var10000 = 237;
               break;
            case 47:
               var10000 = 149;
               break;
            case 48:
               var10000 = 183;
               break;
            case 49:
               var10000 = 191;
               break;
            case 50:
               var10000 = 68;
               break;
            case 51:
               var10000 = 92;
               break;
            case 52:
               var10000 = 46;
               break;
            case 53:
               var10000 = 33;
               break;
            case 54:
               var10000 = 86;
               break;
            case 55:
               var10000 = 234;
               break;
            case 56:
               var10000 = 225;
               break;
            case 57:
               var10000 = 177;
               break;
            case 58:
               var10000 = 51;
               break;
            case 59:
               var10000 = 72;
               break;
            case 60:
               var10000 = 188;
               break;
            case 61:
               var10000 = 189;
               break;
            case 62:
               var10000 = 122;
               break;
            case 63:
               var10000 = 240;
               break;
            case 64:
               var10000 = 65;
               break;
            case 65:
               var10000 = 113;
               break;
            case 66:
               var10000 = 232;
               break;
            case 67:
               var10000 = 112;
               break;
            case 68:
               var10000 = 14;
               break;
            case 69:
               var10000 = 79;
               break;
            case 70:
               var10000 = 11;
               break;
            case 71:
               var10000 = 66;
               break;
            case 72:
               var10000 = 85;
               break;
            case 73:
               var10000 = 143;
               break;
            case 74:
               var10000 = 172;
               break;
            case 75:
               var10000 = 241;
               break;
            case 76:
               var10000 = 244;
               break;
            case 77:
               var10000 = 153;
               break;
            case 78:
               var10000 = 204;
               break;
            case 79:
               var10000 = 235;
               break;
            case 80:
               var10000 = 214;
               break;
            case 81:
               var10000 = 52;
               break;
            case 82:
               var10000 = 190;
               break;
            case 83:
               var10000 = 254;
               break;
            case 84:
               var10000 = 164;
               break;
            case 85:
               var10000 = 218;
               break;
            case 86:
               var10000 = 115;
               break;
            case 87:
               var10000 = 156;
               break;
            case 88:
               var10000 = 134;
               break;
            case 89:
               var10000 = 100;
               break;
            case 90:
               var10000 = 114;
               break;
            case 91:
               var10000 = 167;
               break;
            case 92:
               var10000 = 135;
               break;
            case 93:
               var10000 = 242;
               break;
            case 94:
               var10000 = 21;
               break;
            case 95:
               var10000 = 174;
               break;
            case 96:
               var10000 = 26;
               break;
            case 97:
               var10000 = 133;
               break;
            case 98:
               var10000 = 41;
               break;
            case 99:
               var10000 = 207;
               break;
            case 100:
               var10000 = 4;
               break;
            case 101:
               var10000 = 64;
               break;
            case 102:
               var10000 = 168;
               break;
            case 103:
               var10000 = 230;
               break;
            case 104:
               var10000 = 196;
               break;
            case 105:
               var10000 = 175;
               break;
            case 106:
               var10000 = 212;
               break;
            case 107:
               var10000 = 111;
               break;
            case 108:
               var10000 = 94;
               break;
            case 109:
               var10000 = 95;
               break;
            case 110:
               var10000 = 106;
               break;
            case 111:
               var10000 = 222;
               break;
            case 112:
               var10000 = 25;
               break;
            case 113:
               var10000 = 178;
               break;
            case 114:
               var10000 = 255;
               break;
            case 115:
               var10000 = 220;
               break;
            case 116:
               var10000 = 102;
               break;
            case 117:
               var10000 = 55;
               break;
            case 118:
               var10000 = 2;
               break;
            case 119:
               var10000 = 195;
               break;
            case 120:
               var10000 = 53;
               break;
            case 121:
               var10000 = 226;
               break;
            case 122:
               var10000 = 98;
               break;
            case 123:
               var10000 = 5;
               break;
            case 124:
               var10000 = 253;
               break;
            case 125:
               var10000 = 223;
               break;
            case 126:
               var10000 = 180;
               break;
            case 127:
               var10000 = 186;
               break;
            case 128:
               var10000 = 10;
               break;
            case 129:
               var10000 = 93;
               break;
            case 130:
               var10000 = 101;
               break;
            case 131:
               var10000 = 145;
               break;
            case 132:
               var10000 = 56;
               break;
            case 133:
               var10000 = 48;
               break;
            case 134:
               var10000 = 201;
               break;
            case 135:
               var10000 = 194;
               break;
            case 136:
               var10000 = 179;
               break;
            case 137:
               var10000 = 155;
               break;
            case 138:
               var10000 = 123;
               break;
            case 139:
               var10000 = 233;
               break;
            case 140:
               var10000 = 246;
               break;
            case 141:
               var10000 = 105;
               break;
            case 142:
               var10000 = 128;
               break;
            case 143:
               var10000 = 32;
               break;
            case 144:
               var10000 = 108;
               break;
            case 145:
               var10000 = 75;
               break;
            case 146:
               var10000 = 0;
               break;
            case 147:
               var10000 = 44;
               break;
            case 148:
               var10000 = 126;
               break;
            case 149:
               var10000 = 43;
               break;
            case 150:
               var10000 = 117;
               break;
            case 151:
               var10000 = 50;
               break;
            case 152:
               var10000 = 84;
               break;
            case 153:
               var10000 = 157;
               break;
            case 154:
               var10000 = 90;
               break;
            case 155:
               var10000 = 88;
               break;
            case 156:
               var10000 = 219;
               break;
            case 157:
               var10000 = 109;
               break;
            case 158:
               var10000 = 166;
               break;
            case 159:
               var10000 = 77;
               break;
            case 160:
               var10000 = 39;
               break;
            case 161:
               var10000 = 15;
               break;
            case 162:
               var10000 = 182;
               break;
            case 163:
               var10000 = 125;
               break;
            case 164:
               var10000 = 187;
               break;
            case 165:
               var10000 = 67;
               break;
            case 166:
               var10000 = 129;
               break;
            case 167:
               var10000 = 7;
               break;
            case 168:
               var10000 = 137;
               break;
            case 169:
               var10000 = 193;
               break;
            case 170:
               var10000 = 6;
               break;
            case 171:
               var10000 = 139;
               break;
            case 172:
               var10000 = 38;
               break;
            case 173:
               var10000 = 37;
               break;
            case 174:
               var10000 = 202;
               break;
            case 175:
               var10000 = 185;
               break;
            case 176:
               var10000 = 231;
               break;
            case 177:
               var10000 = 142;
               break;
            case 178:
               var10000 = 3;
               break;
            case 179:
               var10000 = 104;
               break;
            case 180:
               var10000 = 249;
               break;
            case 181:
               var10000 = 181;
               break;
            case 182:
               var10000 = 239;
               break;
            case 183:
               var10000 = 209;
               break;
            case 184:
               var10000 = 1;
               break;
            case 185:
               var10000 = 169;
               break;
            case 186:
               var10000 = 82;
               break;
            case 187:
               var10000 = 63;
               break;
            case 188:
               var10000 = 248;
               break;
            case 189:
               var10000 = 162;
               break;
            case 190:
               var10000 = 132;
               break;
            case 191:
               var10000 = 199;
               break;
            case 192:
               var10000 = 150;
               break;
            case 193:
               var10000 = 165;
               break;
            case 194:
               var10000 = 17;
               break;
            case 195:
               var10000 = 27;
               break;
            case 196:
               var10000 = 120;
               break;
            case 197:
               var10000 = 119;
               break;
            case 198:
               var10000 = 176;
               break;
            case 199:
               var10000 = 45;
               break;
            case 200:
               var10000 = 245;
               break;
            case 201:
               var10000 = 73;
               break;
            case 202:
               var10000 = 146;
               break;
            case 203:
               var10000 = 203;
               break;
            case 204:
               var10000 = 22;
               break;
            case 205:
               var10000 = 103;
               break;
            case 206:
               var10000 = 144;
               break;
            case 207:
               var10000 = 170;
               break;
            case 208:
               var10000 = 136;
               break;
            case 209:
               var10000 = 13;
               break;
            case 210:
               var10000 = 152;
               break;
            case 211:
               var10000 = 151;
               break;
            case 212:
               var10000 = 19;
               break;
            case 213:
               var10000 = 28;
               break;
            case 214:
               var10000 = 221;
               break;
            case 215:
               var10000 = 58;
               break;
            case 216:
               var10000 = 47;
               break;
            case 217:
               var10000 = 141;
               break;
            case 218:
               var10000 = 121;
               break;
            case 219:
               var10000 = 91;
               break;
            case 220:
               var10000 = 74;
               break;
            case 221:
               var10000 = 81;
               break;
            case 222:
               var10000 = 62;
               break;
            case 223:
               var10000 = 252;
               break;
            case 224:
               var10000 = 217;
               break;
            case 225:
               var10000 = 171;
               break;
            case 226:
               var10000 = 97;
               break;
            case 227:
               var10000 = 59;
               break;
            case 228:
               var10000 = 215;
               break;
            case 229:
               var10000 = 200;
               break;
            case 230:
               var10000 = 192;
               break;
            case 231:
               var10000 = 8;
               break;
            case 232:
               var10000 = 160;
               break;
            case 233:
               var10000 = 116;
               break;
            case 234:
               var10000 = 243;
               break;
            case 235:
               var10000 = 20;
               break;
            case 236:
               var10000 = 57;
               break;
            case 237:
               var10000 = 130;
               break;
            case 238:
               var10000 = 16;
               break;
            case 239:
               var10000 = 80;
               break;
            case 240:
               var10000 = 87;
               break;
            case 241:
               var10000 = 210;
               break;
            case 242:
               var10000 = 40;
               break;
            case 243:
               var10000 = 206;
               break;
            case 244:
               var10000 = 70;
               break;
            case 245:
               var10000 = 140;
               break;
            case 246:
               var10000 = 30;
               break;
            case 247:
               var10000 = 83;
               break;
            case 248:
               var10000 = 127;
               break;
            case 249:
               var10000 = 238;
               break;
            case 250:
               var10000 = 173;
               break;
            case 251:
               var10000 = 147;
               break;
            case 252:
               var10000 = 198;
               break;
            case 253:
               var10000 = 60;
               break;
            case 254:
               var10000 = 197;
               break;
            default:
               var10000 = 211;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26109;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "\u0000ªÖ\u0011ð![?G\u001aô\b¹H\u0090³Ù`º7¶ú\u008d\u001b\u007f\u008cQ¼f®ê\u0013çÎ?üm\u008c\u000e\u0087\u009c¼\u0083\u001aÌ\tìþ\u008d\u0004\u008d";
      int var12 = "\u0000ªÖ\u0011ð![?G\u001aô\b¹H\u0090³Ù`º7¶ú\u008d\u001b\u007f\u008cQ¼f®ê\u0013çÎ?üm\u008c\u000e\u0087\u009c¼\u0083\u001aÌ\tìþ\u008d\u0004\u008d"
         .length();
      char var9 = 31;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 6;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 6;
               var10006 = var14;
            } else {
               var23 = 6;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 6;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 91;
                     break;
                  case 1:
                     var41 = 40;
                     break;
                  case 2:
                     var41 = 75;
                     break;
                  case 3:
                     var41 = 65;
                     break;
                  case 4:
                     var41 = 13;
                     break;
                  case 5:
                     var41 = 86;
                     break;
                  default:
                     var41 = 107;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 3448224641014646930L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "(Â\u00132\rÀVOOu^|z\u0083½M\u0018¹Í<d'\u0095\u0090";
            int var5 = "(Â\u00132\rÀVOOu^|z\u0083½M\u0018¹Í<d'\u0095\u0090".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            c = var6;
            d = new Integer[3];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





