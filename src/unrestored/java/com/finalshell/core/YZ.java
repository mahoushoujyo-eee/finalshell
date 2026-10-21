package com.finalshell.core;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

public abstract class YZ implements Ip4 {
   public Signature k;
   public KeyFactory n;
   public static String[] a;
   public static String[] b;

   public abstract String d();

   @Override
   public void k$void() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: sipush -14389
      // 003: invokestatic com/finalshell/core/Y12.Q ()Z
      // 006: aload 0
      // 007: invokevirtual com/finalshell/core/YZ.d ()Ljava/lang/String;
      // 00a: astore 2
      // 00b: istore 1
      // 00c: sipush -16828
      // 00f: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 012: astore 3
      // 013: aload 2
      // 014: iload 1
      // 015: ifeq 059
      // 018: sipush -14398
      // 01b: sipush 4708
      // 01e: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 021: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 024: ifne 050
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 2
      // 02f: sipush -14396
      // 032: sipush 24054
      // 035: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 038: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03b: iload 1
      // 03c: ifeq 07d
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: ifeq 05e
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: sipush -14392
      // 053: sipush -11142
      // 056: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 059: astore 3
      // 05a: iload 1
      // 05b: ifne 10c
      // 05e: aload 2
      // 05f: iload 1
      // 060: ifeq 0ab
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: sipush -14387
      // 06d: sipush 9116
      // 070: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 073: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: ifne 0a2
      // 080: aload 2
      // 081: sipush -14391
      // 084: sipush -9599
      // 087: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 08a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08d: iload 1
      // 08e: ifeq 0c4
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: ifeq 0b0
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: sipush -14390
      // 0a5: sipush 1162
      // 0a8: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 0ab: astore 3
      // 0ac: iload 1
      // 0ad: ifne 10c
      // 0b0: aload 2
      // 0b1: sipush -14399
      // 0b4: sipush 3270
      // 0b7: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 0ba: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: iload 1
      // 0c5: ifeq 0ff
      // 0c8: ifeq 0e0
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: sipush -14397
      // 0d5: sipush 16376
      // 0d8: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 0db: astore 3
      // 0dc: iload 1
      // 0dd: ifne 10c
      // 0e0: aload 2
      // 0e1: iload 1
      // 0e2: ifeq 10b
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: sipush -14395
      // 0ef: sipush 15972
      // 0f2: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 0f5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: ifeq 10c
      // 102: sipush -14386
      // 105: sipush -27637
      // 108: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 10b: astore 3
      // 10c: aload 0
      // 10d: aload 3
      // 10e: invokestatic java/security/Signature.getInstance (Ljava/lang/String;)Ljava/security/Signature;
      // 111: putfield com/finalshell/core/YZ.k Ljava/security/Signature;
      // 114: aload 0
      // 115: sipush -14388
      // 118: sipush -22472
      // 11b: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 11e: invokestatic java/security/KeyFactory.getInstance (Ljava/lang/String;)Ljava/security/KeyFactory;
      // 121: putfield com/finalshell/core/YZ.n Ljava/security/KeyFactory;
      // 124: return
   }

   @Override
   public void Q(byte[] var1, byte[] var2) throws Exception {
      RSAPublicKeySpec var3 = new RSAPublicKeySpec(new BigInteger(var2), new BigInteger(var1));
      PublicKey var4 = this.n.generatePublic(var3);
      this.k.initVerify(var4);
   }

   @Override
   public void i(byte[] var1, byte[] var2) throws Exception {
      RSAPrivateKeySpec var3 = new RSAPrivateKeySpec(new BigInteger(var2), new BigInteger(var1));
      PrivateKey var4 = this.n.generatePrivate(var3);
      this.k.initSign(var4);
   }

   @Override
   public byte[] k$arrbyte() throws Exception {
      return this.k.sign();
   }

   @Override
   public void d(byte[] var1) throws Exception {
      this.k.update(var1);
   }

   @Override
   public boolean g(byte[] param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 3
      // 002: invokestatic com/finalshell/core/Y12.D ()Z
      // 005: bipush 0
      // 006: istore 4
      // 008: new com/finalshell/core/UJ
      // 00b: dup
      // 00c: aload 1
      // 00d: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 010: astore 6
      // 012: new java/lang/String
      // 015: dup
      // 016: aload 6
      // 018: invokevirtual com/finalshell/core/UJ.S ()[B
      // 01b: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 01e: invokespecial java/lang/String.<init> ([BLjava/nio/charset/Charset;)V
      // 021: astore 7
      // 023: istore 2
      // 024: aload 7
      // 026: sipush -14394
      // 029: sipush 25006
      // 02c: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 02f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 032: iload 2
      // 033: ifne 122
      // 036: ifne 112
      // 039: goto 040
      // 03c: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: aload 7
      // 042: sipush -14373
      // 045: sipush -23138
      // 048: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 04b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04e: iload 2
      // 04f: ifne 122
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: ifne 112
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: aload 7
      // 065: sipush -14393
      // 068: sipush -14386
      // 06b: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 06e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 071: iload 2
      // 072: ifne 122
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: ifne 112
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: aload 7
      // 088: sipush -14376
      // 08b: sipush -21690
      // 08e: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 091: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 094: iload 2
      // 095: ifne 122
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: ifne 112
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 7
      // 0ab: sipush -14385
      // 0ae: sipush 6534
      // 0b1: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 0b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b7: iload 2
      // 0b8: ifne 122
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: ifne 112
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 7
      // 0ce: sipush -14375
      // 0d1: sipush -6595
      // 0d4: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 0d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0da: iload 2
      // 0db: ifne 122
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: ifne 112
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: aload 7
      // 0f1: sipush -14400
      // 0f4: sipush 25526
      // 0f7: invokestatic com/finalshell/core/YZ.a (II)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0fd: iload 2
      // 0fe: ifne 15e
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: ifeq 156
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 7
      // 114: aload 0
      // 115: invokevirtual com/finalshell/core/YZ.d ()Ljava/lang/String;
      // 118: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: iload 2
      // 123: ifne 145
      // 126: ifne 136
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: bipush 0
      // 131: ireturn
      // 132: invokestatic com/finalshell/core/YZ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: aload 6
      // 138: invokevirtual com/finalshell/core/UJ.d ()I
      // 13b: istore 4
      // 13d: aload 6
      // 13f: invokevirtual com/finalshell/core/UJ.R ()I
      // 142: istore 3
      // 143: iload 4
      // 145: newarray 8
      // 147: astore 5
      // 149: aload 1
      // 14a: iload 3
      // 14b: aload 5
      // 14d: bipush 0
      // 14e: iload 4
      // 150: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 153: aload 5
      // 155: astore 1
      // 156: aload 0
      // 157: getfield com/finalshell/core/YZ.k Ljava/security/Signature;
      // 15a: aload 1
      // 15b: invokevirtual java/security/Signature.verify ([B)Z
      // 15e: ireturn
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -14391) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 42;
               break;
            case 1:
               var10000 = 8;
               break;
            case 2:
               var10000 = 173;
               break;
            case 3:
               var10000 = 92;
               break;
            case 4:
               var10000 = 232;
               break;
            case 5:
               var10000 = 242;
               break;
            case 6:
               var10000 = 6;
               break;
            case 7:
               var10000 = 67;
               break;
            case 8:
               var10000 = 90;
               break;
            case 9:
               var10000 = 134;
               break;
            case 10:
               var10000 = 36;
               break;
            case 11:
               var10000 = 121;
               break;
            case 12:
               var10000 = 91;
               break;
            case 13:
               var10000 = 247;
               break;
            case 14:
               var10000 = 182;
               break;
            case 15:
               var10000 = 99;
               break;
            case 16:
               var10000 = 88;
               break;
            case 17:
               var10000 = 102;
               break;
            case 18:
               var10000 = 138;
               break;
            case 19:
               var10000 = 245;
               break;
            case 20:
               var10000 = 78;
               break;
            case 21:
               var10000 = 71;
               break;
            case 22:
               var10000 = 69;
               break;
            case 23:
               var10000 = 105;
               break;
            case 24:
               var10000 = 11;
               break;
            case 25:
               var10000 = 70;
               break;
            case 26:
               var10000 = 60;
               break;
            case 27:
               var10000 = 39;
               break;
            case 28:
               var10000 = 98;
               break;
            case 29:
               var10000 = 157;
               break;
            case 30:
               var10000 = 205;
               break;
            case 31:
               var10000 = 79;
               break;
            case 32:
               var10000 = 120;
               break;
            case 33:
               var10000 = 13;
               break;
            case 34:
               var10000 = 195;
               break;
            case 35:
               var10000 = 53;
               break;
            case 36:
               var10000 = 128;
               break;
            case 37:
               var10000 = 140;
               break;
            case 38:
               var10000 = 56;
               break;
            case 39:
               var10000 = 51;
               break;
            case 40:
               var10000 = 124;
               break;
            case 41:
               var10000 = 132;
               break;
            case 42:
               var10000 = 61;
               break;
            case 43:
               var10000 = 228;
               break;
            case 44:
               var10000 = 154;
               break;
            case 45:
               var10000 = 87;
               break;
            case 46:
               var10000 = 80;
               break;
            case 47:
               var10000 = 227;
               break;
            case 48:
               var10000 = 106;
               break;
            case 49:
               var10000 = 150;
               break;
            case 50:
               var10000 = 166;
               break;
            case 51:
               var10000 = 136;
               break;
            case 52:
               var10000 = 21;
               break;
            case 53:
               var10000 = 115;
               break;
            case 54:
               var10000 = 64;
               break;
            case 55:
               var10000 = 82;
               break;
            case 56:
               var10000 = 30;
               break;
            case 57:
               var10000 = 217;
               break;
            case 58:
               var10000 = 93;
               break;
            case 59:
               var10000 = 254;
               break;
            case 60:
               var10000 = 253;
               break;
            case 61:
               var10000 = 171;
               break;
            case 62:
               var10000 = 15;
               break;
            case 63:
               var10000 = 170;
               break;
            case 64:
               var10000 = 2;
               break;
            case 65:
               var10000 = 123;
               break;
            case 66:
               var10000 = 23;
               break;
            case 67:
               var10000 = 246;
               break;
            case 68:
               var10000 = 97;
               break;
            case 69:
               var10000 = 206;
               break;
            case 70:
               var10000 = 65;
               break;
            case 71:
               var10000 = 165;
               break;
            case 72:
               var10000 = 83;
               break;
            case 73:
               var10000 = 241;
               break;
            case 74:
               var10000 = 31;
               break;
            case 75:
               var10000 = 12;
               break;
            case 76:
               var10000 = 199;
               break;
            case 77:
               var10000 = 255;
               break;
            case 78:
               var10000 = 43;
               break;
            case 79:
               var10000 = 221;
               break;
            case 80:
               var10000 = 164;
               break;
            case 81:
               var10000 = 177;
               break;
            case 82:
               var10000 = 84;
               break;
            case 83:
               var10000 = 142;
               break;
            case 84:
               var10000 = 176;
               break;
            case 85:
               var10000 = 133;
               break;
            case 86:
               var10000 = 48;
               break;
            case 87:
               var10000 = 50;
               break;
            case 88:
               var10000 = 152;
               break;
            case 89:
               var10000 = 188;
               break;
            case 90:
               var10000 = 119;
               break;
            case 91:
               var10000 = 174;
               break;
            case 92:
               var10000 = 226;
               break;
            case 93:
               var10000 = 130;
               break;
            case 94:
               var10000 = 94;
               break;
            case 95:
               var10000 = 16;
               break;
            case 96:
               var10000 = 32;
               break;
            case 97:
               var10000 = 34;
               break;
            case 98:
               var10000 = 52;
               break;
            case 99:
               var10000 = 58;
               break;
            case 100:
               var10000 = 163;
               break;
            case 101:
               var10000 = 219;
               break;
            case 102:
               var10000 = 147;
               break;
            case 103:
               var10000 = 236;
               break;
            case 104:
               var10000 = 95;
               break;
            case 105:
               var10000 = 198;
               break;
            case 106:
               var10000 = 72;
               break;
            case 107:
               var10000 = 185;
               break;
            case 108:
               var10000 = 209;
               break;
            case 109:
               var10000 = 158;
               break;
            case 110:
               var10000 = 169;
               break;
            case 111:
               var10000 = 62;
               break;
            case 112:
               var10000 = 159;
               break;
            case 113:
               var10000 = 192;
               break;
            case 114:
               var10000 = 27;
               break;
            case 115:
               var10000 = 238;
               break;
            case 116:
               var10000 = 191;
               break;
            case 117:
               var10000 = 224;
               break;
            case 118:
               var10000 = 122;
               break;
            case 119:
               var10000 = 59;
               break;
            case 120:
               var10000 = 116;
               break;
            case 121:
               var10000 = 141;
               break;
            case 122:
               var10000 = 17;
               break;
            case 123:
               var10000 = 126;
               break;
            case 124:
               var10000 = 151;
               break;
            case 125:
               var10000 = 160;
               break;
            case 126:
               var10000 = 146;
               break;
            case 127:
               var10000 = 41;
               break;
            case 128:
               var10000 = 108;
               break;
            case 129:
               var10000 = 196;
               break;
            case 130:
               var10000 = 18;
               break;
            case 131:
               var10000 = 186;
               break;
            case 132:
               var10000 = 168;
               break;
            case 133:
               var10000 = 184;
               break;
            case 134:
               var10000 = 125;
               break;
            case 135:
               var10000 = 112;
               break;
            case 136:
               var10000 = 203;
               break;
            case 137:
               var10000 = 167;
               break;
            case 138:
               var10000 = 145;
               break;
            case 139:
               var10000 = 44;
               break;
            case 140:
               var10000 = 187;
               break;
            case 141:
               var10000 = 180;
               break;
            case 142:
               var10000 = 109;
               break;
            case 143:
               var10000 = 74;
               break;
            case 144:
               var10000 = 212;
               break;
            case 145:
               var10000 = 100;
               break;
            case 146:
               var10000 = 214;
               break;
            case 147:
               var10000 = 24;
               break;
            case 148:
               var10000 = 68;
               break;
            case 149:
               var10000 = 57;
               break;
            case 150:
               var10000 = 216;
               break;
            case 151:
               var10000 = 213;
               break;
            case 152:
               var10000 = 54;
               break;
            case 153:
               var10000 = 197;
               break;
            case 154:
               var10000 = 148;
               break;
            case 155:
               var10000 = 20;
               break;
            case 156:
               var10000 = 190;
               break;
            case 157:
               var10000 = 235;
               break;
            case 158:
               var10000 = 14;
               break;
            case 159:
               var10000 = 66;
               break;
            case 160:
               var10000 = 208;
               break;
            case 161:
               var10000 = 175;
               break;
            case 162:
               var10000 = 104;
               break;
            case 163:
               var10000 = 40;
               break;
            case 164:
               var10000 = 3;
               break;
            case 165:
               var10000 = 19;
               break;
            case 166:
               var10000 = 162;
               break;
            case 167:
               var10000 = 251;
               break;
            case 168:
               var10000 = 161;
               break;
            case 169:
               var10000 = 211;
               break;
            case 170:
               var10000 = 28;
               break;
            case 171:
               var10000 = 101;
               break;
            case 172:
               var10000 = 10;
               break;
            case 173:
               var10000 = 139;
               break;
            case 174:
               var10000 = 149;
               break;
            case 175:
               var10000 = 77;
               break;
            case 176:
               var10000 = 107;
               break;
            case 177:
               var10000 = 63;
               break;
            case 178:
               var10000 = 55;
               break;
            case 179:
               var10000 = 75;
               break;
            case 180:
               var10000 = 200;
               break;
            case 181:
               var10000 = 237;
               break;
            case 182:
               var10000 = 229;
               break;
            case 183:
               var10000 = 38;
               break;
            case 184:
               var10000 = 156;
               break;
            case 185:
               var10000 = 9;
               break;
            case 186:
               var10000 = 33;
               break;
            case 187:
               var10000 = 89;
               break;
            case 188:
               var10000 = 49;
               break;
            case 189:
               var10000 = 127;
               break;
            case 190:
               var10000 = 110;
               break;
            case 191:
               var10000 = 231;
               break;
            case 192:
               var10000 = 137;
               break;
            case 193:
               var10000 = 129;
               break;
            case 194:
               var10000 = 225;
               break;
            case 195:
               var10000 = 135;
               break;
            case 196:
               var10000 = 181;
               break;
            case 197:
               var10000 = 35;
               break;
            case 198:
               var10000 = 244;
               break;
            case 199:
               var10000 = 37;
               break;
            case 200:
               var10000 = 81;
               break;
            case 201:
               var10000 = 143;
               break;
            case 202:
               var10000 = 113;
               break;
            case 203:
               var10000 = 4;
               break;
            case 204:
               var10000 = 1;
               break;
            case 205:
               var10000 = 189;
               break;
            case 206:
               var10000 = 7;
               break;
            case 207:
               var10000 = 240;
               break;
            case 208:
               var10000 = 210;
               break;
            case 209:
               var10000 = 86;
               break;
            case 210:
               var10000 = 46;
               break;
            case 211:
               var10000 = 220;
               break;
            case 212:
               var10000 = 234;
               break;
            case 213:
               var10000 = 117;
               break;
            case 214:
               var10000 = 96;
               break;
            case 215:
               var10000 = 230;
               break;
            case 216:
               var10000 = 194;
               break;
            case 217:
               var10000 = 153;
               break;
            case 218:
               var10000 = 111;
               break;
            case 219:
               var10000 = 233;
               break;
            case 220:
               var10000 = 178;
               break;
            case 221:
               var10000 = 202;
               break;
            case 222:
               var10000 = 47;
               break;
            case 223:
               var10000 = 172;
               break;
            case 224:
               var10000 = 76;
               break;
            case 225:
               var10000 = 249;
               break;
            case 226:
               var10000 = 223;
               break;
            case 227:
               var10000 = 183;
               break;
            case 228:
               var10000 = 248;
               break;
            case 229:
               var10000 = 0;
               break;
            case 230:
               var10000 = 103;
               break;
            case 231:
               var10000 = 131;
               break;
            case 232:
               var10000 = 45;
               break;
            case 233:
               var10000 = 201;
               break;
            case 234:
               var10000 = 73;
               break;
            case 235:
               var10000 = 155;
               break;
            case 236:
               var10000 = 204;
               break;
            case 237:
               var10000 = 193;
               break;
            case 238:
               var10000 = 243;
               break;
            case 239:
               var10000 = 26;
               break;
            case 240:
               var10000 = 29;
               break;
            case 241:
               var10000 = 5;
               break;
            case 242:
               var10000 = 179;
               break;
            case 243:
               var10000 = 114;
               break;
            case 244:
               var10000 = 250;
               break;
            case 245:
               var10000 = 239;
               break;
            case 246:
               var10000 = 207;
               break;
            case 247:
               var10000 = 85;
               break;
            case 248:
               var10000 = 218;
               break;
            case 249:
               var10000 = 144;
               break;
            case 250:
               var10000 = 222;
               break;
            case 251:
               var10000 = 118;
               break;
            case 252:
               var10000 = 252;
               break;
            case 253:
               var10000 = 215;
               break;
            case 254:
               var10000 = 22;
               break;
            default:
               var10000 = 25;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var5 = new String[19];
      int var3 = 0;
      String var2 = "Ê\u0094Ágqõ\u0012x;\u0002ÞNE\t\ta÷\u009c\u0093w\u0097z\rQÙ¿\u008dõ\u0011;MÍhÔe!\u000b¹\u0001¢\u0095\u0014.\u000e\u001f.8Y\r(ð\u0090¯\u0014¶\u0083=Úf6¤}\f4\u008b6\u0084¦\u0092Éó\u001eÒ¿¥\u0003Ùq\u008f\u0016Eï0\bO\u0018ÕÅÃµÁ¿¢Ôq^ø{r\u008b«å\rª\u001fÀU\u001d\bÁ,\u0092D?à\\\u0016¶5NS\u0080s,¨ü\u0018&\u000bSaãªªå8Xâ\u009f\u0016¿ëo\u0088¤\b¨Çlõ4°\u0018Ö¢\u009a\u0082ã=\u0098B\u0087\r\u000fætk\u0081î\u0019ð\u0089ß\\\u00930\f×=JR)H8¨ ¾|Ë\u0016¹º¯¢¼M«o\fà8\u0015\u009a\u0083\u0091öänñ)Û±\u0016\u0001Ç¸\r^¸÷Ñ\u00877Iï³ÞS\u001f¼Sú\u008eºE\fìí-HÅ\u000b¥À\u0093´\u000ei\u0007CµðCWqÖ\u0016\u0095õ*K\fp½ÈÎ\u0014`\u008a\u009bQú¬\u0089%\\@n\u009c";
      int var4 = "Ê\u0094Ágqõ\u0012x;\u0002ÞNE\t\ta÷\u009c\u0093w\u0097z\rQÙ¿\u008dõ\u0011;MÍhÔe!\u000b¹\u0001¢\u0095\u0014.\u000e\u001f.8Y\r(ð\u0090¯\u0014¶\u0083=Úf6¤}\f4\u008b6\u0084¦\u0092Éó\u001eÒ¿¥\u0003Ùq\u008f\u0016Eï0\bO\u0018ÕÅÃµÁ¿¢Ôq^ø{r\u008b«å\rª\u001fÀU\u001d\bÁ,\u0092D?à\\\u0016¶5NS\u0080s,¨ü\u0018&\u000bSaãªªå8Xâ\u009f\u0016¿ëo\u0088¤\b¨Çlõ4°\u0018Ö¢\u009a\u0082ã=\u0098B\u0087\r\u000fætk\u0081î\u0019ð\u0089ß\\\u00930\f×=JR)H8¨ ¾|Ë\u0016¹º¯¢¼M«o\fà8\u0015\u009a\u0083\u0091öänñ)Û±\u0016\u0001Ç¸\r^¸÷Ñ\u00877Iï³ÞS\u001f¼Sú\u008eºE\fìí-HÅ\u000b¥À\u0093´\u000ei\u0007CµðCWqÖ\u0016\u0095õ*K\fp½ÈÎ\u0014`\u008a\u009bQú¬\u0089%\\@n\u009c"
         .length();
      char var1 = 22;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 40;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 22;
                        break;
                     case 1:
                        var46 = 47;
                        break;
                     case 2:
                        var46 = 2;
                        break;
                     case 3:
                        var46 = 13;
                        break;
                     case 4:
                        var46 = 51;
                        break;
                     case 5:
                        var46 = 110;
                        break;
                     default:
                        var46 = 42;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[19];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "S\u008fn\u0098\u0018\u0096£\u0088\u0091\u0080\u0017\u0085ã\r\"»\u000e[0\u0013\u007fj\fìß±\u0092ÊÌØ¤ £ðô";
                  var4 = "S\u008fn\u0098\u0018\u0096£\u0088\u0091\u0080\u0017\u0085ã\r\"»\u000e[0\u0013\u007fj\fìß±\u0092ÊÌØ¤ £ðô".length();
                  var1 = 22;
                  var8 = -1;
            }

            var10000 = 126;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





