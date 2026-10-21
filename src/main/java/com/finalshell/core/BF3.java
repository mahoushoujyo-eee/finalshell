package com.finalshell.core;

public class BF3 extends BN3 {
   public static volatile boolean L;
   public static volatile int w;
   public static volatile long W;
   public static volatile long D;
   public static byte[] F;
   public static byte[] O;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] f;
   public static long g;

   public static void J() throws Exception {
      int var10000 = BN3.C();
      Thread var1 = new Thread(new com.finalshell.task.U8());
      int var0 = var10000;
      L = false;
      var1.setPriority(b(11743, 3887804343035504099L));
      var1.start();

      while (!L) {
         Thread.sleep(g);
         if (var0 != 0) {
            break;
         }
      }
   }

   public static void c() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/BN3.C ()I
      // 003: istore 0
      // 004: sipush 835
      // 007: ldc2_w 1866722296126573424
      // 00a: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 00d: istore 1
      // 00e: sipush 10121
      // 011: ldc2_w 5532295284341911487
      // 014: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 017: istore 2
      // 018: sipush 26800
      // 01b: ldc2_w 7462248346783408260
      // 01e: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 021: istore 3
      // 022: sipush 31430
      // 025: sipush -21191
      // 028: invokestatic com/finalshell/core/BF3.b (II)Ljava/lang/String;
      // 02b: invokestatic com/finalshell/core/BF3.r (Ljava/lang/String;)V
      // 02e: invokestatic com/finalshell/core/BF3.m ()V
      // 031: getstatic com/finalshell/core/BF3.V Lcom/finalshell/core/XJ_2;
      // 034: invokevirtual com/finalshell/core/XJ_2.E ()Ljava/io/OutputStream;
      // 037: putstatic com/finalshell/core/BF3.y Ljava/io/OutputStream;
      // 03a: getstatic com/finalshell/core/BF3.V Lcom/finalshell/core/XJ_2;
      // 03d: invokevirtual com/finalshell/core/XJ_2.S$InputStream ()Ljava/io/InputStream;
      // 040: putstatic com/finalshell/core/BF3.J Ljava/io/InputStream;
      // 043: getstatic com/finalshell/core/BF3.V Lcom/finalshell/core/XJ_2;
      // 046: sipush 10121
      // 049: ldc2_w 5532295284341911487
      // 04c: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 04f: invokevirtual com/finalshell/core/XJ_2.b (I)V
      // 052: getstatic com/finalshell/core/BF3.V Lcom/finalshell/core/XJ_2;
      // 055: sipush 10121
      // 058: ldc2_w 5532295284341911487
      // 05b: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 05e: invokevirtual com/finalshell/core/XJ_2.V (I)V
      // 061: sipush 12193
      // 064: invokestatic com/finalshell/core/BF3.J ()V
      // 067: ldc2_w 3299176685894444948
      // 06a: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 06d: invokestatic com/finalshell/core/BF3.D (I)V
      // 070: getstatic com/finalshell/core/BF3.L Z
      // 073: iload 0
      // 074: ifne 0a4
      // 077: ifeq 098
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: sipush 31424
      // 084: sipush -16281
      // 087: invokestatic com/finalshell/core/BF3.b (II)Ljava/lang/String;
      // 08a: bipush 0
      // 08b: anewarray 113
      // 08e: invokestatic com/finalshell/core/BF3.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: invokestatic com/finalshell/core/BF3.J ()V
      // 09b: sipush 19712
      // 09e: ldc2_w 6626248309485159741
      // 0a1: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 0a4: istore 4
      // 0a6: sipush 6630
      // 0a9: ldc2_w 8089433928788152788
      // 0ac: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 0af: istore 5
      // 0b1: bipush 0
      // 0b2: istore 6
      // 0b4: iload 6
      // 0b6: sipush 10590
      // 0b9: ldc2_w 1246269147373412719
      // 0bc: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 0bf: if_icmpge 10f
      // 0c2: getstatic com/finalshell/core/BF3.y Ljava/io/OutputStream;
      // 0c5: getstatic com/finalshell/core/BF3.F [B
      // 0c8: bipush 0
      // 0c9: iload 4
      // 0cb: invokevirtual java/io/OutputStream.write ([BII)V
      // 0ce: sipush 16651
      // 0d1: ldc2_w 6619755295459723579
      // 0d4: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 0d7: invokestatic com/finalshell/core/BF3.D (I)V
      // 0da: iload 0
      // 0db: ifne 10b
      // 0de: getstatic com/finalshell/core/BF3.L Z
      // 0e1: iload 0
      // 0e2: ifne 112
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: ifne 101
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: iload 0
      // 0f7: ifeq 10f
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: iinc 6 1
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: iload 0
      // 10c: ifeq 0b4
      // 10f: getstatic com/finalshell/core/BF3.L Z
      // 112: iload 0
      // 113: ifne 13a
      // 116: ifeq 137
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: sipush 31429
      // 123: sipush -17660
      // 126: invokestatic com/finalshell/core/BF3.b (II)Ljava/lang/String;
      // 129: bipush 0
      // 12a: anewarray 113
      // 12d: invokestatic com/finalshell/core/BF3.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: getstatic com/finalshell/core/BF3.w I
      // 13a: iload 0
      // 13b: ifne 17e
      // 13e: sipush 10121
      // 141: ldc2_w 5532295284341911487
      // 144: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 147: if_icmpge 17b
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: new java/lang/StringBuilder
      // 154: dup
      // 155: invokespecial java/lang/StringBuilder.<init> ()V
      // 158: sipush 31427
      // 15b: sipush -28241
      // 15e: invokestatic com/finalshell/core/BF3.b (II)Ljava/lang/String;
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: getstatic com/finalshell/core/BF3.w I
      // 167: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 16a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16d: bipush 0
      // 16e: anewarray 113
      // 171: invokestatic com/finalshell/core/BF3.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 174: goto 17b
      // 177: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17a: athrow
      // 17b: getstatic com/finalshell/core/BF3.L Z
      // 17e: iload 0
      // 17f: ifne 1be
      // 182: ifeq 1a3
      // 185: goto 18c
      // 188: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: sipush 31428
      // 18f: sipush -25320
      // 192: invokestatic com/finalshell/core/BF3.b (II)Ljava/lang/String;
      // 195: bipush 0
      // 196: anewarray 113
      // 199: invokestatic com/finalshell/core/BF3.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: getstatic com/finalshell/core/BF3.D J
      // 1a6: getstatic com/finalshell/core/BF3.W J
      // 1a9: lsub
      // 1aa: l2i
      // 1ab: istore 6
      // 1ad: sipush 10121
      // 1b0: ldc2_w 5532295284341911487
      // 1b3: invokestatic com/finalshell/core/BF3.b (IJ)I
      // 1b6: iload 4
      // 1b8: idiv
      // 1b9: bipush 2
      // 1ba: iadd
      // 1bb: iload 5
      // 1bd: imul
      // 1be: istore 7
      // 1c0: iload 0
      // 1c1: ifne 21e
      // 1c4: iload 6
      // 1c6: iload 7
      // 1c8: if_icmple 218
      // 1cb: goto 1d2
      // 1ce: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: new java/lang/StringBuilder
      // 1d5: dup
      // 1d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d9: sipush 31431
      // 1dc: sipush 23541
      // 1df: invokestatic com/finalshell/core/BF3.b (II)Ljava/lang/String;
      // 1e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e5: iload 7
      // 1e7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1ea: sipush 31425
      // 1ed: sipush -7792
      // 1f0: invokestatic com/finalshell/core/BF3.b (II)Ljava/lang/String;
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f6: iload 6
      // 1f8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1fb: sipush 31426
      // 1fe: sipush -27788
      // 201: invokestatic com/finalshell/core/BF3.b (II)Ljava/lang/String;
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20a: bipush 0
      // 20b: anewarray 113
      // 20e: invokestatic com/finalshell/core/BF3.Z (Ljava/lang/String;[Ljava/lang/Object;)V
      // 211: goto 218
      // 214: invokestatic com/finalshell/core/BF3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 217: athrow
      // 218: invokestatic com/finalshell/core/BF3.i ()V
      // 21b: invokestatic com/finalshell/core/BF3.Y ()V
      // 21e: goto 229
      // 221: astore 8
      // 223: invokestatic com/finalshell/core/BF3.Y ()V
      // 226: aload 8
      // 228: athrow
      // 229: return
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 31428) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 90;
               break;
            case 1:
               var10000 = 25;
               break;
            case 2:
               var10000 = 54;
               break;
            case 3:
               var10000 = 228;
               break;
            case 4:
               var10000 = 188;
               break;
            case 5:
               var10000 = 57;
               break;
            case 6:
               var10000 = 77;
               break;
            case 7:
               var10000 = 132;
               break;
            case 8:
               var10000 = 92;
               break;
            case 9:
               var10000 = 179;
               break;
            case 10:
               var10000 = 37;
               break;
            case 11:
               var10000 = 190;
               break;
            case 12:
               var10000 = 135;
               break;
            case 13:
               var10000 = 23;
               break;
            case 14:
               var10000 = 42;
               break;
            case 15:
               var10000 = 216;
               break;
            case 16:
               var10000 = 124;
               break;
            case 17:
               var10000 = 74;
               break;
            case 18:
               var10000 = 21;
               break;
            case 19:
               var10000 = 186;
               break;
            case 20:
               var10000 = 22;
               break;
            case 21:
               var10000 = 233;
               break;
            case 22:
               var10000 = 160;
               break;
            case 23:
               var10000 = 224;
               break;
            case 24:
               var10000 = 168;
               break;
            case 25:
               var10000 = 50;
               break;
            case 26:
               var10000 = 185;
               break;
            case 27:
               var10000 = 249;
               break;
            case 28:
               var10000 = 70;
               break;
            case 29:
               var10000 = 17;
               break;
            case 30:
               var10000 = 237;
               break;
            case 31:
               var10000 = 108;
               break;
            case 32:
               var10000 = 162;
               break;
            case 33:
               var10000 = 75;
               break;
            case 34:
               var10000 = 32;
               break;
            case 35:
               var10000 = 201;
               break;
            case 36:
               var10000 = 3;
               break;
            case 37:
               var10000 = 120;
               break;
            case 38:
               var10000 = 68;
               break;
            case 39:
               var10000 = 182;
               break;
            case 40:
               var10000 = 35;
               break;
            case 41:
               var10000 = 2;
               break;
            case 42:
               var10000 = 4;
               break;
            case 43:
               var10000 = 114;
               break;
            case 44:
               var10000 = 100;
               break;
            case 45:
               var10000 = 141;
               break;
            case 46:
               var10000 = 80;
               break;
            case 47:
               var10000 = 197;
               break;
            case 48:
               var10000 = 85;
               break;
            case 49:
               var10000 = 0;
               break;
            case 50:
               var10000 = 109;
               break;
            case 51:
               var10000 = 115;
               break;
            case 52:
               var10000 = 69;
               break;
            case 53:
               var10000 = 126;
               break;
            case 54:
               var10000 = 251;
               break;
            case 55:
               var10000 = 150;
               break;
            case 56:
               var10000 = 33;
               break;
            case 57:
               var10000 = 118;
               break;
            case 58:
               var10000 = 66;
               break;
            case 59:
               var10000 = 169;
               break;
            case 60:
               var10000 = 230;
               break;
            case 61:
               var10000 = 64;
               break;
            case 62:
               var10000 = 195;
               break;
            case 63:
               var10000 = 174;
               break;
            case 64:
               var10000 = 248;
               break;
            case 65:
               var10000 = 166;
               break;
            case 66:
               var10000 = 219;
               break;
            case 67:
               var10000 = 220;
               break;
            case 68:
               var10000 = 167;
               break;
            case 69:
               var10000 = 217;
               break;
            case 70:
               var10000 = 151;
               break;
            case 71:
               var10000 = 40;
               break;
            case 72:
               var10000 = 104;
               break;
            case 73:
               var10000 = 235;
               break;
            case 74:
               var10000 = 98;
               break;
            case 75:
               var10000 = 250;
               break;
            case 76:
               var10000 = 1;
               break;
            case 77:
               var10000 = 5;
               break;
            case 78:
               var10000 = 142;
               break;
            case 79:
               var10000 = 218;
               break;
            case 80:
               var10000 = 239;
               break;
            case 81:
               var10000 = 76;
               break;
            case 82:
               var10000 = 30;
               break;
            case 83:
               var10000 = 242;
               break;
            case 84:
               var10000 = 231;
               break;
            case 85:
               var10000 = 156;
               break;
            case 86:
               var10000 = 254;
               break;
            case 87:
               var10000 = 165;
               break;
            case 88:
               var10000 = 178;
               break;
            case 89:
               var10000 = 202;
               break;
            case 90:
               var10000 = 96;
               break;
            case 91:
               var10000 = 110;
               break;
            case 92:
               var10000 = 205;
               break;
            case 93:
               var10000 = 175;
               break;
            case 94:
               var10000 = 67;
               break;
            case 95:
               var10000 = 105;
               break;
            case 96:
               var10000 = 112;
               break;
            case 97:
               var10000 = 24;
               break;
            case 98:
               var10000 = 196;
               break;
            case 99:
               var10000 = 176;
               break;
            case 100:
               var10000 = 43;
               break;
            case 101:
               var10000 = 111;
               break;
            case 102:
               var10000 = 87;
               break;
            case 103:
               var10000 = 225;
               break;
            case 104:
               var10000 = 44;
               break;
            case 105:
               var10000 = 163;
               break;
            case 106:
               var10000 = 157;
               break;
            case 107:
               var10000 = 212;
               break;
            case 108:
               var10000 = 238;
               break;
            case 109:
               var10000 = 91;
               break;
            case 110:
               var10000 = 102;
               break;
            case 111:
               var10000 = 203;
               break;
            case 112:
               var10000 = 153;
               break;
            case 113:
               var10000 = 16;
               break;
            case 114:
               var10000 = 193;
               break;
            case 115:
               var10000 = 240;
               break;
            case 116:
               var10000 = 210;
               break;
            case 117:
               var10000 = 116;
               break;
            case 118:
               var10000 = 226;
               break;
            case 119:
               var10000 = 145;
               break;
            case 120:
               var10000 = 56;
               break;
            case 121:
               var10000 = 12;
               break;
            case 122:
               var10000 = 252;
               break;
            case 123:
               var10000 = 60;
               break;
            case 124:
               var10000 = 117;
               break;
            case 125:
               var10000 = 255;
               break;
            case 126:
               var10000 = 184;
               break;
            case 127:
               var10000 = 79;
               break;
            case 128:
               var10000 = 200;
               break;
            case 129:
               var10000 = 136;
               break;
            case 130:
               var10000 = 36;
               break;
            case 131:
               var10000 = 95;
               break;
            case 132:
               var10000 = 215;
               break;
            case 133:
               var10000 = 133;
               break;
            case 134:
               var10000 = 138;
               break;
            case 135:
               var10000 = 183;
               break;
            case 136:
               var10000 = 131;
               break;
            case 137:
               var10000 = 46;
               break;
            case 138:
               var10000 = 123;
               break;
            case 139:
               var10000 = 8;
               break;
            case 140:
               var10000 = 234;
               break;
            case 141:
               var10000 = 243;
               break;
            case 142:
               var10000 = 221;
               break;
            case 143:
               var10000 = 155;
               break;
            case 144:
               var10000 = 10;
               break;
            case 145:
               var10000 = 18;
               break;
            case 146:
               var10000 = 59;
               break;
            case 147:
               var10000 = 61;
               break;
            case 148:
               var10000 = 11;
               break;
            case 149:
               var10000 = 81;
               break;
            case 150:
               var10000 = 47;
               break;
            case 151:
               var10000 = 71;
               break;
            case 152:
               var10000 = 14;
               break;
            case 153:
               var10000 = 82;
               break;
            case 154:
               var10000 = 170;
               break;
            case 155:
               var10000 = 52;
               break;
            case 156:
               var10000 = 173;
               break;
            case 157:
               var10000 = 148;
               break;
            case 158:
               var10000 = 253;
               break;
            case 159:
               var10000 = 15;
               break;
            case 160:
               var10000 = 89;
               break;
            case 161:
               var10000 = 94;
               break;
            case 162:
               var10000 = 206;
               break;
            case 163:
               var10000 = 26;
               break;
            case 164:
               var10000 = 86;
               break;
            case 165:
               var10000 = 88;
               break;
            case 166:
               var10000 = 41;
               break;
            case 167:
               var10000 = 159;
               break;
            case 168:
               var10000 = 130;
               break;
            case 169:
               var10000 = 246;
               break;
            case 170:
               var10000 = 187;
               break;
            case 171:
               var10000 = 198;
               break;
            case 172:
               var10000 = 204;
               break;
            case 173:
               var10000 = 164;
               break;
            case 174:
               var10000 = 103;
               break;
            case 175:
               var10000 = 27;
               break;
            case 176:
               var10000 = 106;
               break;
            case 177:
               var10000 = 229;
               break;
            case 178:
               var10000 = 172;
               break;
            case 179:
               var10000 = 29;
               break;
            case 180:
               var10000 = 152;
               break;
            case 181:
               var10000 = 121;
               break;
            case 182:
               var10000 = 63;
               break;
            case 183:
               var10000 = 99;
               break;
            case 184:
               var10000 = 93;
               break;
            case 185:
               var10000 = 83;
               break;
            case 186:
               var10000 = 125;
               break;
            case 187:
               var10000 = 62;
               break;
            case 188:
               var10000 = 48;
               break;
            case 189:
               var10000 = 122;
               break;
            case 190:
               var10000 = 73;
               break;
            case 191:
               var10000 = 58;
               break;
            case 192:
               var10000 = 20;
               break;
            case 193:
               var10000 = 140;
               break;
            case 194:
               var10000 = 191;
               break;
            case 195:
               var10000 = 119;
               break;
            case 196:
               var10000 = 194;
               break;
            case 197:
               var10000 = 45;
               break;
            case 198:
               var10000 = 244;
               break;
            case 199:
               var10000 = 144;
               break;
            case 200:
               var10000 = 207;
               break;
            case 201:
               var10000 = 6;
               break;
            case 202:
               var10000 = 227;
               break;
            case 203:
               var10000 = 214;
               break;
            case 204:
               var10000 = 51;
               break;
            case 205:
               var10000 = 241;
               break;
            case 206:
               var10000 = 49;
               break;
            case 207:
               var10000 = 158;
               break;
            case 208:
               var10000 = 65;
               break;
            case 209:
               var10000 = 180;
               break;
            case 210:
               var10000 = 199;
               break;
            case 211:
               var10000 = 189;
               break;
            case 212:
               var10000 = 31;
               break;
            case 213:
               var10000 = 113;
               break;
            case 214:
               var10000 = 147;
               break;
            case 215:
               var10000 = 127;
               break;
            case 216:
               var10000 = 171;
               break;
            case 217:
               var10000 = 211;
               break;
            case 218:
               var10000 = 139;
               break;
            case 219:
               var10000 = 192;
               break;
            case 220:
               var10000 = 84;
               break;
            case 221:
               var10000 = 72;
               break;
            case 222:
               var10000 = 209;
               break;
            case 223:
               var10000 = 78;
               break;
            case 224:
               var10000 = 154;
               break;
            case 225:
               var10000 = 181;
               break;
            case 226:
               var10000 = 247;
               break;
            case 227:
               var10000 = 208;
               break;
            case 228:
               var10000 = 7;
               break;
            case 229:
               var10000 = 34;
               break;
            case 230:
               var10000 = 245;
               break;
            case 231:
               var10000 = 39;
               break;
            case 232:
               var10000 = 137;
               break;
            case 233:
               var10000 = 236;
               break;
            case 234:
               var10000 = 9;
               break;
            case 235:
               var10000 = 129;
               break;
            case 236:
               var10000 = 149;
               break;
            case 237:
               var10000 = 146;
               break;
            case 238:
               var10000 = 38;
               break;
            case 239:
               var10000 = 97;
               break;
            case 240:
               var10000 = 232;
               break;
            case 241:
               var10000 = 128;
               break;
            case 242:
               var10000 = 213;
               break;
            case 243:
               var10000 = 53;
               break;
            case 244:
               var10000 = 143;
               break;
            case 245:
               var10000 = 13;
               break;
            case 246:
               var10000 = 55;
               break;
            case 247:
               var10000 = 28;
               break;
            case 248:
               var10000 = 107;
               break;
            case 249:
               var10000 = 222;
               break;
            case 250:
               var10000 = 161;
               break;
            case 251:
               var10000 = 223;
               break;
            case 252:
               var10000 = 19;
               break;
            case 253:
               var10000 = 177;
               break;
            case 254:
               var10000 = 101;
               break;
            default:
               var10000 = 134;
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

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2100;
      if (f[var3] == null) {
         f[var3] = (int)(c[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[8];
      int var13 = 0;
      String var12 = "\u0083!¸Ûý\u0012\u0019Yã8eWë\u0098¡ÕSDöø\u0099R7\u0095Ðâ² à',²M©C\\Î\u0090\u0019\u0001:p\u0000|ÜIü×\u0003\u008a'\u001cà\\*Ýá\u001f\r4×\u0015\\\f¡«ÝwÈ\"/¬Ýz\u0018pÛ\u009d#p©ÆqA°jBÆÛ\u001a\u008aÂ(\u0080À¶R\u0081+o;«Ç\u0086 m»ÒH¥°æ\u0093eZ\u0098XÕcÔ\u0089RÎ  ´YØû\\ÅuCÐ\u0006Åö\u0014\u0084ôXaáE\u009a³\u0093ekü*ú\u009flGpÓ\u001d\r.£\u0001|\\ù0Ì,GB\u0086\u000f";
      int var14 = "\u0083!¸Ûý\u0012\u0019Yã8eWë\u0098¡ÕSDöø\u0099R7\u0095Ðâ² à',²M©C\\Î\u0090\u0019\u0001:p\u0000|ÜIü×\u0003\u008a'\u001cà\\*Ýá\u001f\r4×\u0015\\\f¡«ÝwÈ\"/¬Ýz\u0018pÛ\u009d#p©ÆqA°jBÆÛ\u001a\u008aÂ(\u0080À¶R\u0081+o;«Ç\u0086 m»ÒH¥°æ\u0093eZ\u0098XÕcÔ\u0089RÎ  ´YØû\\ÅuCÐ\u0006Åö\u0014\u0084ôXaáE\u009a³\u0093ekü*ú\u009flGpÓ\u001d\r.£\u0001|\\ù0Ì,GB\u0086\u000f"
         .length();
      char var11 = 29;
      int var19 = -1;

      label70:
      while (true) {
         byte var10000 = 112;
         String var10001 = var12.substring(++var19, var19 + var11);
         byte var10002 = -1;

         while (true) {
      char[] var36;
            label65: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var16 = 0;
               byte var46 = var10000;
               var36 = var43;
               int var26 = var10004;
               byte var53;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               } else {
                  var46 = var10000;
                  var26 = var10004;
                  if (var10004 <= var16) {
                     break label65;
                  }

                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var68 = var59[var10006];
                  byte var69;
                  switch (var16 % 7) {
                     case 0:
                        var69 = 38;
                        break;
                     case 1:
                        var69 = 24;
                        break;
                     case 2:
                        var69 = 47;
                        break;
                     case 3:
                        var69 = 47;
                        break;
                     case 4:
                        var69 = 28;
                        break;
                     case 5:
                        var69 = 126;
                        break;
                     default:
                        var69 = 22;
                  }

                  var59[var10006] = (char)(var68 ^ var53 ^ var69);
                  var16++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var59 = var36;
                     var53 = var46;
                  } else {
                     if (var26 <= var16) {
                        break;
                     }

                     var59 = var36;
                     var53 = var46;
                     var10006 = var16;
                  }
               }
            }

            String var48 = new String(var36).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var48;
                  if ((var19 += var11) >= var14) {
                     a = var15;
                     b = new String[8];
                     long var2 = 6851349395744368580L;
                     long[] var8 = new long[10];
                     int var5 = 0;
                     String var6 = "ÊL\\=\u001a«GPí|¬ ø\u0093\u0001¤\u0099=ØfZª\u0088\u001f'\u0012h\u0007@p´*Þ³\u0083qð\u008dnÍ\u009e\u0085I0\nÖ\u0085Cúfù8Ú\u00076\"éÖ\u0015Ü\u000f\u0083,Ð";
                     int var7 = "ÊL\\=\u001a«GPí|¬ ø\u0093\u0001¤\u0099=ØfZª\u0088\u001f'\u0012h\u0007@p´*Þ³\u0083qð\u008dnÍ\u009e\u0085I0\nÖ\u0085Cúfù8Ú\u00076\"éÖ\u0015Ü\u000f\u0083,Ð"
                        .length();
                     byte var4 = 0;

                     label44:
                     while (true) {
                        byte var28 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var28, var4).getBytes("ISO-8859-1");
                        long[] var21 = var8;
                        int var29 = var5++;
                        long var40 = ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L;
                        byte var49 = -1;

                        while (true) {
                           long var58 = var40 ^ var2;
                           switch (var49) {
                              case 0:
                                 var21[var29] = var58;
                                 if (var4 >= var7) {
                                    c = var8;
                                    f = new Integer[10];
                                    long var0 = 1695045229907746106L;
                                    long var42 = 1695045229907746096L ^ var0;
                                    byte var31 = -1;
                                    g = var42;
                                    w = 0;
                                    F = new byte[b(6193, 2587141806183321606L)];
                                    O = new byte[F.length];
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var58;
                                 if (var4 < var7) {
                                    continue label44;
                                 }

                                 var6 = "<J\u009f\b#´\u0002-6\u0097\n\u0014]\u000bbó";
                                 var7 = "<J\u009f\b#´\u0002-6\u0097\n\u0014]\u000bbó".length();
                                 var4 = 0;
                           }

                           byte var30 = var4;
                           var4 += 8;
                           var9 = var6.substring(var30, var4).getBytes("ISO-8859-1");
                           var21 = var8;
                           var29 = var5++;
                           var40 = ((long)var9[0] & 255L) << 56
                              | ((long)var9[1] & 255L) << 48
                              | ((long)var9[2] & 255L) << 40
                              | ((long)var9[3] & 255L) << 32
                              | ((long)var9[4] & 255L) << 24
                              | ((long)var9[5] & 255L) << 16
                              | ((long)var9[6] & 255L) << 8
                              | (long)var9[7] & 255L;
                           var49 = 0;
                        }
                     }
                  }

                  var11 = var12.charAt(var19);
                  break;
               default:
                  var15[var13++] = var48;
                  if ((var19 += var11) < var14) {
                     var11 = var12.charAt(var19);
                     continue label70;
                  }

                  var12 = "\nV1\u008fm&\u000bÊÿ«×\u009fÉHÆ§h¬Í\u00812\u000b¯°mº\u0005f\u0091ý\u0086×Ý\u0090\u0017íº\f8-ÃË\u0091ü";
                  var14 = "\nV1\u008fm&\u000bÊÿ«×\u009fÉHÆ§h¬Í\u00812\u000b¯°mº\u0005f\u0091ý\u0086×Ý\u0090\u0017íº\f8-ÃË\u0091ü".length();
                  var11 = 5;
                  var19 = -1;
            }

            var10000 = 68;
            var10001 = var12.substring(++var19, var19 + var11);
            var10002 = 0;
         }
      }
   }
}





