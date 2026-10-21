package com.finalshell.core;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

public class WJ_2 implements Hx2 {
   byte[] s;
   byte[] V;
   byte[] F;
   ECPublicKey H;
   ECPrivateKey N;
   ECParameterSpec k;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   @Override
   public void B(int param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Y12.Q ()Z
      // 003: aconst_null
      // 004: astore 3
      // 005: istore 2
      // 006: iload 1
      // 007: sipush 16487
      // 00a: ldc2_w 2481683168441076959
      // 00d: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 010: iload 2
      // 011: ifeq 035
      // 014: if_icmpne 02b
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: sipush -31014
      // 021: sipush -10169
      // 024: invokestatic com/finalshell/core/WJ_2.a (II)Ljava/lang/String;
      // 027: astore 3
      // 028: goto 08c
      // 02b: iload 1
      // 02c: sipush 18346
      // 02f: ldc2_w 6634899232160910097
      // 032: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 035: iload 2
      // 036: ifeq 05a
      // 039: if_icmpne 050
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 042: athrow
      // 043: sipush -31010
      // 046: sipush 28964
      // 049: invokestatic com/finalshell/core/WJ_2.a (II)Ljava/lang/String;
      // 04c: astore 3
      // 04d: goto 08c
      // 050: iload 1
      // 051: sipush 27491
      // 054: ldc2_w 7846804715247970265
      // 057: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 05a: if_icmpne 06a
      // 05d: sipush -31009
      // 060: sipush 19490
      // 063: invokestatic com/finalshell/core/WJ_2.a (II)Ljava/lang/String;
      // 066: astore 3
      // 067: goto 08c
      // 06a: new com/finalshell/core/Pc2
      // 06d: dup
      // 06e: new java/lang/StringBuilder
      // 071: dup
      // 072: invokespecial java/lang/StringBuilder.<init> ()V
      // 075: sipush -31011
      // 078: sipush -30488
      // 07b: invokestatic com/finalshell/core/WJ_2.a (II)Ljava/lang/String;
      // 07e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 081: iload 1
      // 082: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 085: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 088: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 08b: athrow
      // 08c: bipush 0
      // 08d: istore 4
      // 08f: iload 4
      // 091: sipush 24541
      // 094: ldc2_w 7841493238511211364
      // 097: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 09a: if_icmpge 233
      // 09d: sipush -31012
      // 0a0: sipush -17003
      // 0a3: invokestatic com/finalshell/core/WJ_2.a (II)Ljava/lang/String;
      // 0a6: invokestatic java/security/KeyPairGenerator.getInstance (Ljava/lang/String;)Ljava/security/KeyPairGenerator;
      // 0a9: astore 5
      // 0ab: new java/security/spec/ECGenParameterSpec
      // 0ae: dup
      // 0af: aload 3
      // 0b0: invokespecial java/security/spec/ECGenParameterSpec.<init> (Ljava/lang/String;)V
      // 0b3: astore 6
      // 0b5: aload 5
      // 0b7: aload 6
      // 0b9: invokevirtual java/security/KeyPairGenerator.initialize (Ljava/security/spec/AlgorithmParameterSpec;)V
      // 0bc: aload 5
      // 0be: invokevirtual java/security/KeyPairGenerator.genKeyPair ()Ljava/security/KeyPair;
      // 0c1: astore 7
      // 0c3: aload 0
      // 0c4: aload 7
      // 0c6: invokevirtual java/security/KeyPair.getPrivate ()Ljava/security/PrivateKey;
      // 0c9: checkcast java/security/interfaces/ECPrivateKey
      // 0cc: putfield com/finalshell/core/WJ_2.N Ljava/security/interfaces/ECPrivateKey;
      // 0cf: aload 0
      // 0d0: aload 7
      // 0d2: invokevirtual java/security/KeyPair.getPublic ()Ljava/security/PublicKey;
      // 0d5: checkcast java/security/interfaces/ECPublicKey
      // 0d8: putfield com/finalshell/core/WJ_2.H Ljava/security/interfaces/ECPublicKey;
      // 0db: aload 0
      // 0dc: aload 0
      // 0dd: getfield com/finalshell/core/WJ_2.H Ljava/security/interfaces/ECPublicKey;
      // 0e0: invokeinterface java/security/interfaces/ECPublicKey.getParams ()Ljava/security/spec/ECParameterSpec; 1
      // 0e5: putfield com/finalshell/core/WJ_2.k Ljava/security/spec/ECParameterSpec;
      // 0e8: aload 0
      // 0e9: aload 0
      // 0ea: getfield com/finalshell/core/WJ_2.N Ljava/security/interfaces/ECPrivateKey;
      // 0ed: invokeinterface java/security/interfaces/ECPrivateKey.getS ()Ljava/math/BigInteger; 1
      // 0f2: invokevirtual java/math/BigInteger.toByteArray ()[B
      // 0f5: putfield com/finalshell/core/WJ_2.s [B
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/WJ_2.H Ljava/security/interfaces/ECPublicKey;
      // 0fc: invokeinterface java/security/interfaces/ECPublicKey.getW ()Ljava/security/spec/ECPoint; 1
      // 101: astore 8
      // 103: aload 0
      // 104: aload 8
      // 106: invokevirtual java/security/spec/ECPoint.getAffineX ()Ljava/math/BigInteger;
      // 109: invokevirtual java/math/BigInteger.toByteArray ()[B
      // 10c: putfield com/finalshell/core/WJ_2.V [B
      // 10f: aload 0
      // 110: aload 8
      // 112: invokevirtual java/security/spec/ECPoint.getAffineY ()Ljava/math/BigInteger;
      // 115: invokevirtual java/math/BigInteger.toByteArray ()[B
      // 118: putfield com/finalshell/core/WJ_2.F [B
      // 11b: aload 0
      // 11c: getfield com/finalshell/core/WJ_2.V [B
      // 11f: arraylength
      // 120: aload 0
      // 121: getfield com/finalshell/core/WJ_2.F [B
      // 124: arraylength
      // 125: iload 2
      // 126: ifeq 248
      // 129: iload 2
      // 12a: ifeq 15a
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: if_icmpeq 149
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: iload 2
      // 13f: ifne 225
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 148: athrow
      // 149: iload 1
      // 14a: sipush 28822
      // 14d: ldc2_w 5724409416429124651
      // 150: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: iload 2
      // 15b: ifeq 1a7
      // 15e: if_icmpne 196
      // 161: goto 168
      // 164: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: aload 0
      // 169: getfield com/finalshell/core/WJ_2.V [B
      // 16c: arraylength
      // 16d: sipush 1028
      // 170: ldc2_w 3061901101571852474
      // 173: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 176: iload 2
      // 177: ifeq 1a7
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: if_icmpne 196
      // 184: goto 18b
      // 187: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: iload 2
      // 18c: ifne 233
      // 18f: goto 196
      // 192: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: iload 1
      // 197: sipush 5873
      // 19a: ldc2_w 9041949649949907533
      // 19d: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 1a0: goto 1a7
      // 1a3: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: iload 2
      // 1a8: ifeq 1f4
      // 1ab: if_icmpne 1e3
      // 1ae: goto 1b5
      // 1b1: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: getfield com/finalshell/core/WJ_2.V [B
      // 1b9: arraylength
      // 1ba: sipush 22766
      // 1bd: ldc2_w 7032582451911791704
      // 1c0: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 1c3: iload 2
      // 1c4: ifeq 1f4
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: if_icmpne 1e3
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: iload 2
      // 1d9: ifne 233
      // 1dc: goto 1e3
      // 1df: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: iload 1
      // 1e4: sipush 29429
      // 1e7: ldc2_w 316962555162443338
      // 1ea: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: iload 2
      // 1f5: ifeq 217
      // 1f8: if_icmpne 225
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 0
      // 203: getfield com/finalshell/core/WJ_2.V [B
      // 206: arraylength
      // 207: sipush 14729
      // 20a: ldc2_w 1485620964730533182
      // 20d: invokestatic com/finalshell/core/WJ_2.a (IJ)I
      // 210: goto 217
      // 213: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: if_icmpne 225
      // 21a: iload 2
      // 21b: ifne 233
      // 21e: goto 225
      // 221: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 224: athrow
      // 225: iinc 4 1
      // 228: iload 2
      // 229: ifne 08f
      // 22c: goto 233
      // 22f: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 232: athrow
      // 233: aload 0
      // 234: iload 2
      // 235: ifeq 24c
      // 238: getfield com/finalshell/core/WJ_2.s [B
      // 23b: arraylength
      // 23c: aload 0
      // 23d: getfield com/finalshell/core/WJ_2.V [B
      // 240: arraylength
      // 241: goto 248
      // 244: invokestatic com/finalshell/core/WJ_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 247: athrow
      // 248: if_icmpge 257
      // 24b: aload 0
      // 24c: aload 0
      // 24d: aload 0
      // 24e: getfield com/finalshell/core/WJ_2.s [B
      // 251: invokespecial com/finalshell/core/WJ_2.M ([B)[B
      // 254: putfield com/finalshell/core/WJ_2.s [B
      // 257: return
   }

   @Override
   public byte[] D() {
      return this.s;
   }

   @Override
   public byte[] e() {
      return this.V;
   }

   @Override
   public byte[] O() {
      return this.F;
   }

   ECPublicKey K() {
      return this.H;
   }

   ECPrivateKey g() {
      return this.N;
   }

   public byte[] M(byte[] var1) {
      byte[] var2 = new byte[var1.length + 1];
      System.arraycopy(var1, 0, var2, 1, var1.length);
      NR.C(var1);
      return var2;
   }

   public byte[] q(byte[] var1) {
      boolean var2 = Y12.Q();
      byte[] var10000 = var1;
      if (var2) {
         label20:
         if (var1[0] == 0) {
            int var4 = var1[1] & a(5008, 8441049791226765093L);
            if (var2) {
               if (var4 == 0) {
                  break label20;
               }

               var4 = var1.length - 1;
            }

            byte[] var3 = new byte[var4];
            System.arraycopy(var1, 1, var3, 0, var3.length);
            NR.C(var1);
            return var3;
         }

         var10000 = var1;
      }

      return var10000;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -31010) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 69;
               break;
            case 1:
               var10000 = 218;
               break;
            case 2:
               var10000 = 143;
               break;
            case 3:
               var10000 = 212;
               break;
            case 4:
               var10000 = 30;
               break;
            case 5:
               var10000 = 221;
               break;
            case 6:
               var10000 = 74;
               break;
            case 7:
               var10000 = 68;
               break;
            case 8:
               var10000 = 111;
               break;
            case 9:
               var10000 = 148;
               break;
            case 10:
               var10000 = 198;
               break;
            case 11:
               var10000 = 149;
               break;
            case 12:
               var10000 = 241;
               break;
            case 13:
               var10000 = 186;
               break;
            case 14:
               var10000 = 85;
               break;
            case 15:
               var10000 = 90;
               break;
            case 16:
               var10000 = 116;
               break;
            case 17:
               var10000 = 219;
               break;
            case 18:
               var10000 = 127;
               break;
            case 19:
               var10000 = 179;
               break;
            case 20:
               var10000 = 22;
               break;
            case 21:
               var10000 = 217;
               break;
            case 22:
               var10000 = 130;
               break;
            case 23:
               var10000 = 240;
               break;
            case 24:
               var10000 = 160;
               break;
            case 25:
               var10000 = 165;
               break;
            case 26:
               var10000 = 182;
               break;
            case 27:
               var10000 = 137;
               break;
            case 28:
               var10000 = 33;
               break;
            case 29:
               var10000 = 96;
               break;
            case 30:
               var10000 = 45;
               break;
            case 31:
               var10000 = 228;
               break;
            case 32:
               var10000 = 79;
               break;
            case 33:
               var10000 = 222;
               break;
            case 34:
               var10000 = 189;
               break;
            case 35:
               var10000 = 232;
               break;
            case 36:
               var10000 = 170;
               break;
            case 37:
               var10000 = 20;
               break;
            case 38:
               var10000 = 138;
               break;
            case 39:
               var10000 = 112;
               break;
            case 40:
               var10000 = 64;
               break;
            case 41:
               var10000 = 227;
               break;
            case 42:
               var10000 = 25;
               break;
            case 43:
               var10000 = 180;
               break;
            case 44:
               var10000 = 66;
               break;
            case 45:
               var10000 = 60;
               break;
            case 46:
               var10000 = 169;
               break;
            case 47:
               var10000 = 113;
               break;
            case 48:
               var10000 = 225;
               break;
            case 49:
               var10000 = 213;
               break;
            case 50:
               var10000 = 247;
               break;
            case 51:
               var10000 = 195;
               break;
            case 52:
               var10000 = 103;
               break;
            case 53:
               var10000 = 235;
               break;
            case 54:
               var10000 = 216;
               break;
            case 55:
               var10000 = 167;
               break;
            case 56:
               var10000 = 234;
               break;
            case 57:
               var10000 = 6;
               break;
            case 58:
               var10000 = 159;
               break;
            case 59:
               var10000 = 145;
               break;
            case 60:
               var10000 = 128;
               break;
            case 61:
               var10000 = 196;
               break;
            case 62:
               var10000 = 12;
               break;
            case 63:
               var10000 = 249;
               break;
            case 64:
               var10000 = 133;
               break;
            case 65:
               var10000 = 10;
               break;
            case 66:
               var10000 = 205;
               break;
            case 67:
               var10000 = 92;
               break;
            case 68:
               var10000 = 230;
               break;
            case 69:
               var10000 = 236;
               break;
            case 70:
               var10000 = 162;
               break;
            case 71:
               var10000 = 134;
               break;
            case 72:
               var10000 = 117;
               break;
            case 73:
               var10000 = 31;
               break;
            case 74:
               var10000 = 84;
               break;
            case 75:
               var10000 = 106;
               break;
            case 76:
               var10000 = 18;
               break;
            case 77:
               var10000 = 40;
               break;
            case 78:
               var10000 = 109;
               break;
            case 79:
               var10000 = 77;
               break;
            case 80:
               var10000 = 122;
               break;
            case 81:
               var10000 = 82;
               break;
            case 82:
               var10000 = 175;
               break;
            case 83:
               var10000 = 197;
               break;
            case 84:
               var10000 = 154;
               break;
            case 85:
               var10000 = 52;
               break;
            case 86:
               var10000 = 28;
               break;
            case 87:
               var10000 = 34;
               break;
            case 88:
               var10000 = 86;
               break;
            case 89:
               var10000 = 168;
               break;
            case 90:
               var10000 = 114;
               break;
            case 91:
               var10000 = 231;
               break;
            case 92:
               var10000 = 151;
               break;
            case 93:
               var10000 = 140;
               break;
            case 94:
               var10000 = 19;
               break;
            case 95:
               var10000 = 65;
               break;
            case 96:
               var10000 = 252;
               break;
            case 97:
               var10000 = 98;
               break;
            case 98:
               var10000 = 223;
               break;
            case 99:
               var10000 = 102;
               break;
            case 100:
               var10000 = 73;
               break;
            case 101:
               var10000 = 123;
               break;
            case 102:
               var10000 = 237;
               break;
            case 103:
               var10000 = 5;
               break;
            case 104:
               var10000 = 233;
               break;
            case 105:
               var10000 = 24;
               break;
            case 106:
               var10000 = 201;
               break;
            case 107:
               var10000 = 239;
               break;
            case 108:
               var10000 = 57;
               break;
            case 109:
               var10000 = 7;
               break;
            case 110:
               var10000 = 67;
               break;
            case 111:
               var10000 = 207;
               break;
            case 112:
               var10000 = 55;
               break;
            case 113:
               var10000 = 72;
               break;
            case 114:
               var10000 = 41;
               break;
            case 115:
               var10000 = 99;
               break;
            case 116:
               var10000 = 251;
               break;
            case 117:
               var10000 = 190;
               break;
            case 118:
               var10000 = 17;
               break;
            case 119:
               var10000 = 49;
               break;
            case 120:
               var10000 = 46;
               break;
            case 121:
               var10000 = 185;
               break;
            case 122:
               var10000 = 245;
               break;
            case 123:
               var10000 = 158;
               break;
            case 124:
               var10000 = 42;
               break;
            case 125:
               var10000 = 0;
               break;
            case 126:
               var10000 = 126;
               break;
            case 127:
               var10000 = 220;
               break;
            case 128:
               var10000 = 208;
               break;
            case 129:
               var10000 = 97;
               break;
            case 130:
               var10000 = 146;
               break;
            case 131:
               var10000 = 110;
               break;
            case 132:
               var10000 = 107;
               break;
            case 133:
               var10000 = 91;
               break;
            case 134:
               var10000 = 131;
               break;
            case 135:
               var10000 = 173;
               break;
            case 136:
               var10000 = 43;
               break;
            case 137:
               var10000 = 14;
               break;
            case 138:
               var10000 = 153;
               break;
            case 139:
               var10000 = 125;
               break;
            case 140:
               var10000 = 29;
               break;
            case 141:
               var10000 = 254;
               break;
            case 142:
               var10000 = 59;
               break;
            case 143:
               var10000 = 80;
               break;
            case 144:
               var10000 = 62;
               break;
            case 145:
               var10000 = 163;
               break;
            case 146:
               var10000 = 181;
               break;
            case 147:
               var10000 = 63;
               break;
            case 148:
               var10000 = 47;
               break;
            case 149:
               var10000 = 76;
               break;
            case 150:
               var10000 = 51;
               break;
            case 151:
               var10000 = 203;
               break;
            case 152:
               var10000 = 16;
               break;
            case 153:
               var10000 = 11;
               break;
            case 154:
               var10000 = 150;
               break;
            case 155:
               var10000 = 200;
               break;
            case 156:
               var10000 = 13;
               break;
            case 157:
               var10000 = 194;
               break;
            case 158:
               var10000 = 184;
               break;
            case 159:
               var10000 = 37;
               break;
            case 160:
               var10000 = 3;
               break;
            case 161:
               var10000 = 188;
               break;
            case 162:
               var10000 = 161;
               break;
            case 163:
               var10000 = 136;
               break;
            case 164:
               var10000 = 246;
               break;
            case 165:
               var10000 = 211;
               break;
            case 166:
               var10000 = 124;
               break;
            case 167:
               var10000 = 54;
               break;
            case 168:
               var10000 = 174;
               break;
            case 169:
               var10000 = 101;
               break;
            case 170:
               var10000 = 78;
               break;
            case 171:
               var10000 = 61;
               break;
            case 172:
               var10000 = 209;
               break;
            case 173:
               var10000 = 26;
               break;
            case 174:
               var10000 = 166;
               break;
            case 175:
               var10000 = 119;
               break;
            case 176:
               var10000 = 94;
               break;
            case 177:
               var10000 = 243;
               break;
            case 178:
               var10000 = 157;
               break;
            case 179:
               var10000 = 129;
               break;
            case 180:
               var10000 = 70;
               break;
            case 181:
               var10000 = 152;
               break;
            case 182:
               var10000 = 27;
               break;
            case 183:
               var10000 = 35;
               break;
            case 184:
               var10000 = 44;
               break;
            case 185:
               var10000 = 71;
               break;
            case 186:
               var10000 = 155;
               break;
            case 187:
               var10000 = 141;
               break;
            case 188:
               var10000 = 32;
               break;
            case 189:
               var10000 = 193;
               break;
            case 190:
               var10000 = 9;
               break;
            case 191:
               var10000 = 120;
               break;
            case 192:
               var10000 = 242;
               break;
            case 193:
               var10000 = 23;
               break;
            case 194:
               var10000 = 75;
               break;
            case 195:
               var10000 = 147;
               break;
            case 196:
               var10000 = 118;
               break;
            case 197:
               var10000 = 156;
               break;
            case 198:
               var10000 = 88;
               break;
            case 199:
               var10000 = 132;
               break;
            case 200:
               var10000 = 204;
               break;
            case 201:
               var10000 = 108;
               break;
            case 202:
               var10000 = 244;
               break;
            case 203:
               var10000 = 164;
               break;
            case 204:
               var10000 = 87;
               break;
            case 205:
               var10000 = 177;
               break;
            case 206:
               var10000 = 210;
               break;
            case 207:
               var10000 = 81;
               break;
            case 208:
               var10000 = 238;
               break;
            case 209:
               var10000 = 93;
               break;
            case 210:
               var10000 = 121;
               break;
            case 211:
               var10000 = 255;
               break;
            case 212:
               var10000 = 8;
               break;
            case 213:
               var10000 = 53;
               break;
            case 214:
               var10000 = 83;
               break;
            case 215:
               var10000 = 105;
               break;
            case 216:
               var10000 = 100;
               break;
            case 217:
               var10000 = 248;
               break;
            case 218:
               var10000 = 135;
               break;
            case 219:
               var10000 = 2;
               break;
            case 220:
               var10000 = 104;
               break;
            case 221:
               var10000 = 4;
               break;
            case 222:
               var10000 = 15;
               break;
            case 223:
               var10000 = 224;
               break;
            case 224:
               var10000 = 36;
               break;
            case 225:
               var10000 = 38;
               break;
            case 226:
               var10000 = 142;
               break;
            case 227:
               var10000 = 144;
               break;
            case 228:
               var10000 = 253;
               break;
            case 229:
               var10000 = 115;
               break;
            case 230:
               var10000 = 95;
               break;
            case 231:
               var10000 = 202;
               break;
            case 232:
               var10000 = 172;
               break;
            case 233:
               var10000 = 206;
               break;
            case 234:
               var10000 = 139;
               break;
            case 235:
               var10000 = 183;
               break;
            case 236:
               var10000 = 214;
               break;
            case 237:
               var10000 = 1;
               break;
            case 238:
               var10000 = 178;
               break;
            case 239:
               var10000 = 171;
               break;
            case 240:
               var10000 = 56;
               break;
            case 241:
               var10000 = 229;
               break;
            case 242:
               var10000 = 250;
               break;
            case 243:
               var10000 = 50;
               break;
            case 244:
               var10000 = 199;
               break;
            case 245:
               var10000 = 215;
               break;
            case 246:
               var10000 = 48;
               break;
            case 247:
               var10000 = 192;
               break;
            case 248:
               var10000 = 176;
               break;
            case 249:
               var10000 = 21;
               break;
            case 250:
               var10000 = 89;
               break;
            case 251:
               var10000 = 39;
               break;
            case 252:
               var10000 = 226;
               break;
            case 253:
               var10000 = 187;
               break;
            case 254:
               var10000 = 58;
               break;
            default:
               var10000 = 191;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19647;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "¬¦\u0011¼g%\u0015äë\t\u0003 älß5Á\u00adÔ\u0002Æ\u008b";
      int var12 = "¬¦\u0011¼g%\u0015äë\t\u0003 älß5Á\u00adÔ\u0002Æ\u008b".length();
      char var9 = '\t';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 126;
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
                        var65 = 56;
                        break;
                     case 1:
                        var65 = 91;
                        break;
                     case 2:
                        var65 = 76;
                        break;
                     case 3:
                        var65 = 11;
                        break;
                     case 4:
                        var65 = 65;
                        break;
                     case 5:
                        var65 = 36;
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
                     a = var13;
                     b = new String[5];
                     long var0 = 4258272753868865801L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "ÒÇ§â\u0098\u009a½JÚÎ\u0081½k\u0085I\u0093%\u0087Ô\u009dÔ<¼\"\u007fÍÛéÁ/ZÄ\u00047n\u000eîb\u008b\u0098!f\u0004îY#$Ù\n\t\u008f\u00adÍ\u0002\u0091\u0085\u008c÷É\u0004Pë\fÖ£ûi\u0013R¶ôu";
                     int var5 = "ÒÇ§â\u0098\u009a½JÚÎ\u0081½k\u0085I\u0093%\u0087Ô\u009dÔ<¼\"\u007fÍÛéÁ/ZÄ\u00047n\u000eîb\u008b\u0098!f\u0004îY#$Ù\n\t\u008f\u00adÍ\u0002\u0091\u0085\u008c÷É\u0004Pë\fÖ£ûi\u0013R¶ôu"
                        .length();
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
                                    c = var6;
                                    d = new Integer[11];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "É\u0006vüðÍ\u0015aÈ\u0086\u008d\u0097\"`Þ¬";
                                 var5 = "É\u0006vüðÍ\u0015aÈ\u0086\u008d\u0097\"`Þ¬".length();
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

                  var10 = "+óÐ\u009eékS\u008b±5\u009eÑC\u0004ýD\u0087ó\tLQ\u008a\t®j¶Âu\u0000\u0093\u000b\u009e";
                  var12 = "+óÐ\u009eékS\u008b±5\u009eÑC\u0004ýD\u0087ó\tLQ\u008a\t®j¶Âu\u0000\u0093\u000b\u009e".length();
                  var9 = 22;
                  var17 = -1;
            }

            var10000 = 121;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





