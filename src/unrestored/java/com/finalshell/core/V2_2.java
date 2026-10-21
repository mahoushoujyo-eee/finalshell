package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public class V2_2 extends IM {
   public String z;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   @Override
   public boolean D(ConnectHost param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: aload 1
      // 005: invokespecial com/finalshell/core/IM.D (Lcom/finalshell/crypto/ConnectHost;)Z
      // 008: pop
      // 009: aload 0
      // 00a: getfield com/finalshell/core/V2_2.g Lcom/finalshell/core/YU;
      // 00d: invokevirtual com/finalshell/core/YU.M ()V
      // 010: aload 0
      // 011: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 014: bipush 5
      // 015: invokevirtual com/finalshell/core/UJ.V (B)V
      // 018: istore 2
      // 019: aload 0
      // 01a: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 01d: sipush -4238
      // 020: sipush -22199
      // 023: invokestatic com/finalshell/core/V2_2.a (II)Ljava/lang/String;
      // 026: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 029: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 02c: aload 1
      // 02d: aload 0
      // 02e: getfield com/finalshell/core/V2_2.g Lcom/finalshell/core/YU;
      // 031: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 034: aload 1
      // 035: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 038: bipush 1
      // 039: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 03e: iload 2
      // 03f: ifne 079
      // 042: ifeq 066
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04b: athrow
      // 04c: aload 1
      // 04d: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 050: bipush 1
      // 051: sipush -4234
      // 054: sipush -11377
      // 057: invokestatic com/finalshell/core/V2_2.a (II)Ljava/lang/String;
      // 05a: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 065: athrow
      // 066: aload 0
      // 067: aload 1
      // 068: aload 0
      // 069: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 06c: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 06f: putfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 072: aload 0
      // 073: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 076: invokevirtual com/finalshell/core/UJ.A ()B
      // 079: istore 3
      // 07a: iload 3
      // 07b: iload 2
      // 07c: ifne 09a
      // 07f: sipush 19227
      // 082: ldc2_w 4336302634078930080
      // 085: invokestatic com/finalshell/core/V2_2.a (IJ)I
      // 088: if_icmpne 09d
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 091: athrow
      // 092: bipush 1
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 099: athrow
      // 09a: goto 09e
      // 09d: bipush 0
      // 09e: istore 4
      // 0a0: aload 1
      // 0a1: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0a4: bipush 1
      // 0a5: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0aa: iload 2
      // 0ab: ifne 0d4
      // 0ae: ifeq 0d2
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0bc: bipush 1
      // 0bd: sipush -4240
      // 0c0: sipush -6088
      // 0c3: invokestatic com/finalshell/core/V2_2.a (II)Ljava/lang/String;
      // 0c6: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d1: athrow
      // 0d2: iload 4
      // 0d4: iload 2
      // 0d5: ifne 101
      // 0d8: ifne 0e8
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e1: athrow
      // 0e2: bipush 0
      // 0e3: ireturn
      // 0e4: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e7: athrow
      // 0e8: aload 1
      // 0e9: sipush -4236
      // 0ec: sipush -14332
      // 0ef: invokestatic com/finalshell/core/V2_2.a (II)Ljava/lang/String;
      // 0f2: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0f5: sipush -4235
      // 0f8: sipush 9398
      // 0fb: invokestatic com/finalshell/core/V2_2.a (II)Ljava/lang/String;
      // 0fe: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 101: iload 2
      // 102: ifne 110
      // 105: ifne 111
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10e: athrow
      // 10f: bipush 0
      // 110: ireturn
      // 111: aconst_null
      // 112: astore 5
      // 114: aload 0
      // 115: getfield com/finalshell/core/V2_2.a Ljava/lang/String;
      // 118: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 11b: astore 5
      // 11d: aload 0
      // 11e: getfield com/finalshell/core/V2_2.g Lcom/finalshell/core/YU;
      // 121: invokevirtual com/finalshell/core/YU.M ()V
      // 124: aload 0
      // 125: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 128: sipush 8320
      // 12b: ldc2_w 4439528219570302781
      // 12e: invokestatic com/finalshell/core/V2_2.a (IJ)I
      // 131: invokevirtual com/finalshell/core/UJ.V (B)V
      // 134: aload 0
      // 135: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 138: aload 5
      // 13a: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 13d: aload 0
      // 13e: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 141: sipush -4239
      // 144: sipush 18530
      // 147: invokestatic com/finalshell/core/V2_2.a (II)Ljava/lang/String;
      // 14a: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 14d: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 150: aload 0
      // 151: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 154: sipush -4233
      // 157: sipush 32741
      // 15a: invokestatic com/finalshell/core/V2_2.a (II)Ljava/lang/String;
      // 15d: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 160: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 163: aload 1
      // 164: aload 0
      // 165: getfield com/finalshell/core/V2_2.g Lcom/finalshell/core/YU;
      // 168: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 16b: aload 0
      // 16c: aload 1
      // 16d: aload 0
      // 16e: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 171: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 174: putfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 177: aload 0
      // 178: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 17b: invokevirtual com/finalshell/core/UJ.A ()B
      // 17e: sipush 21284
      // 181: ldc2_w 2425002500419034266
      // 184: invokestatic com/finalshell/core/V2_2.a (IJ)I
      // 187: iand
      // 188: istore 3
      // 189: iload 3
      // 18a: sipush 20706
      // 18d: ldc2_w 1267093491643916126
      // 190: invokestatic com/finalshell/core/V2_2.a (IJ)I
      // 193: if_icmpne 1a7
      // 196: bipush 1
      // 197: iload 2
      // 198: ifne 1a8
      // 19b: goto 1a2
      // 19e: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a1: athrow
      // 1a2: ireturn
      // 1a3: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a6: athrow
      // 1a7: iload 3
      // 1a8: sipush 9084
      // 1ab: ldc2_w 398093308263689411
      // 1ae: invokestatic com/finalshell/core/V2_2.a (IJ)I
      // 1b1: iload 2
      // 1b2: ifne 22b
      // 1b5: if_icmpne 216
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 1c3: invokevirtual com/finalshell/core/UJ.d ()I
      // 1c6: pop
      // 1c7: aload 0
      // 1c8: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 1cb: invokevirtual com/finalshell/core/UJ.r ()I
      // 1ce: pop
      // 1cf: aload 0
      // 1d0: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 1d3: invokevirtual com/finalshell/core/UJ.r ()I
      // 1d6: pop
      // 1d7: aload 0
      // 1d8: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 1db: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1de: astore 6
      // 1e0: aload 0
      // 1e1: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 1e4: invokevirtual com/finalshell/core/UJ.S ()[B
      // 1e7: astore 7
      // 1e9: aload 6
      // 1eb: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 1ee: astore 8
      // 1f0: aload 0
      // 1f1: getfield com/finalshell/core/V2_2.J Lcom/finalshell/core/Gq2;
      // 1f4: iload 2
      // 1f5: ifne 206
      // 1f8: ifnull 16b
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 201: athrow
      // 202: aload 0
      // 203: getfield com/finalshell/core/V2_2.J Lcom/finalshell/core/Gq2;
      // 206: aload 8
      // 208: invokeinterface com/finalshell/core/Gq2.q (Ljava/lang/String;)V 2
      // 20d: goto 16b
      // 210: astore 9
      // 212: iload 2
      // 213: ifeq 16b
      // 216: iload 3
      // 217: iload 2
      // 218: ifne 24c
      // 21b: sipush 3702
      // 21e: ldc2_w 8409530737527833036
      // 221: invokestatic com/finalshell/core/V2_2.a (IJ)I
      // 224: goto 22b
      // 227: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22a: athrow
      // 22b: if_icmpne 26c
      // 22e: aload 0
      // 22f: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 232: invokevirtual com/finalshell/core/UJ.d ()I
      // 235: pop
      // 236: aload 0
      // 237: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 23a: invokevirtual com/finalshell/core/UJ.r ()I
      // 23d: pop
      // 23e: aload 0
      // 23f: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 242: invokevirtual com/finalshell/core/UJ.r ()I
      // 245: goto 24c
      // 248: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24b: athrow
      // 24c: pop
      // 24d: aload 0
      // 24e: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 251: invokevirtual com/finalshell/core/UJ.S ()[B
      // 254: astore 6
      // 256: aload 0
      // 257: getfield com/finalshell/core/V2_2.s Lcom/finalshell/core/UJ;
      // 25a: invokevirtual com/finalshell/core/UJ.r ()I
      // 25d: istore 7
      // 25f: aload 0
      // 260: aload 6
      // 262: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 265: invokevirtual com/finalshell/core/V2_2.A (Ljava/lang/String;)V
      // 268: iload 2
      // 269: ifeq 297
      // 26c: new com/finalshell/core/Pc2
      // 26f: dup
      // 270: new java/lang/StringBuilder
      // 273: dup
      // 274: invokespecial java/lang/StringBuilder.<init> ()V
      // 277: sipush -4237
      // 27a: sipush 19144
      // 27d: invokestatic com/finalshell/core/V2_2.a (II)Ljava/lang/String;
      // 280: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 283: iload 3
      // 284: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 287: ldc ")"
      // 289: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 28f: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 292: athrow
      // 293: invokestatic com/finalshell/core/V2_2.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 296: athrow
      // 297: bipush 0
      // 298: ireturn
   }

   public String N() {
      return this.z;
   }

   public void A(String var1) {
      this.z = var1;
   }

   public static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -4236) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 73;
               break;
            case 1:
               var10000 = 121;
               break;
            case 2:
               var10000 = 223;
               break;
            case 3:
               var10000 = 36;
               break;
            case 4:
               var10000 = 227;
               break;
            case 5:
               var10000 = 248;
               break;
            case 6:
               var10000 = 160;
               break;
            case 7:
               var10000 = 88;
               break;
            case 8:
               var10000 = 239;
               break;
            case 9:
               var10000 = 42;
               break;
            case 10:
               var10000 = 163;
               break;
            case 11:
               var10000 = 204;
               break;
            case 12:
               var10000 = 181;
               break;
            case 13:
               var10000 = 4;
               break;
            case 14:
               var10000 = 67;
               break;
            case 15:
               var10000 = 143;
               break;
            case 16:
               var10000 = 158;
               break;
            case 17:
               var10000 = 199;
               break;
            case 18:
               var10000 = 188;
               break;
            case 19:
               var10000 = 68;
               break;
            case 20:
               var10000 = 230;
               break;
            case 21:
               var10000 = 24;
               break;
            case 22:
               var10000 = 119;
               break;
            case 23:
               var10000 = 165;
               break;
            case 24:
               var10000 = 110;
               break;
            case 25:
               var10000 = 170;
               break;
            case 26:
               var10000 = 236;
               break;
            case 27:
               var10000 = 13;
               break;
            case 28:
               var10000 = 189;
               break;
            case 29:
               var10000 = 167;
               break;
            case 30:
               var10000 = 175;
               break;
            case 31:
               var10000 = 127;
               break;
            case 32:
               var10000 = 177;
               break;
            case 33:
               var10000 = 112;
               break;
            case 34:
               var10000 = 21;
               break;
            case 35:
               var10000 = 118;
               break;
            case 36:
               var10000 = 122;
               break;
            case 37:
               var10000 = 208;
               break;
            case 38:
               var10000 = 184;
               break;
            case 39:
               var10000 = 131;
               break;
            case 40:
               var10000 = 57;
               break;
            case 41:
               var10000 = 125;
               break;
            case 42:
               var10000 = 161;
               break;
            case 43:
               var10000 = 237;
               break;
            case 44:
               var10000 = 164;
               break;
            case 45:
               var10000 = 128;
               break;
            case 46:
               var10000 = 197;
               break;
            case 47:
               var10000 = 75;
               break;
            case 48:
               var10000 = 104;
               break;
            case 49:
               var10000 = 11;
               break;
            case 50:
               var10000 = 171;
               break;
            case 51:
               var10000 = 102;
               break;
            case 52:
               var10000 = 55;
               break;
            case 53:
               var10000 = 33;
               break;
            case 54:
               var10000 = 117;
               break;
            case 55:
               var10000 = 120;
               break;
            case 56:
               var10000 = 30;
               break;
            case 57:
               var10000 = 211;
               break;
            case 58:
               var10000 = 215;
               break;
            case 59:
               var10000 = 90;
               break;
            case 60:
               var10000 = 245;
               break;
            case 61:
               var10000 = 61;
               break;
            case 62:
               var10000 = 151;
               break;
            case 63:
               var10000 = 93;
               break;
            case 64:
               var10000 = 226;
               break;
            case 65:
               var10000 = 49;
               break;
            case 66:
               var10000 = 220;
               break;
            case 67:
               var10000 = 200;
               break;
            case 68:
               var10000 = 190;
               break;
            case 69:
               var10000 = 109;
               break;
            case 70:
               var10000 = 139;
               break;
            case 71:
               var10000 = 39;
               break;
            case 72:
               var10000 = 105;
               break;
            case 73:
               var10000 = 129;
               break;
            case 74:
               var10000 = 144;
               break;
            case 75:
               var10000 = 179;
               break;
            case 76:
               var10000 = 133;
               break;
            case 77:
               var10000 = 37;
               break;
            case 78:
               var10000 = 71;
               break;
            case 79:
               var10000 = 89;
               break;
            case 80:
               var10000 = 41;
               break;
            case 81:
               var10000 = 91;
               break;
            case 82:
               var10000 = 255;
               break;
            case 83:
               var10000 = 44;
               break;
            case 84:
               var10000 = 85;
               break;
            case 85:
               var10000 = 69;
               break;
            case 86:
               var10000 = 84;
               break;
            case 87:
               var10000 = 28;
               break;
            case 88:
               var10000 = 32;
               break;
            case 89:
               var10000 = 168;
               break;
            case 90:
               var10000 = 19;
               break;
            case 91:
               var10000 = 148;
               break;
            case 92:
               var10000 = 99;
               break;
            case 93:
               var10000 = 140;
               break;
            case 94:
               var10000 = 51;
               break;
            case 95:
               var10000 = 115;
               break;
            case 96:
               var10000 = 249;
               break;
            case 97:
               var10000 = 218;
               break;
            case 98:
               var10000 = 108;
               break;
            case 99:
               var10000 = 17;
               break;
            case 100:
               var10000 = 7;
               break;
            case 101:
               var10000 = 27;
               break;
            case 102:
               var10000 = 77;
               break;
            case 103:
               var10000 = 147;
               break;
            case 104:
               var10000 = 111;
               break;
            case 105:
               var10000 = 203;
               break;
            case 106:
               var10000 = 52;
               break;
            case 107:
               var10000 = 107;
               break;
            case 108:
               var10000 = 153;
               break;
            case 109:
               var10000 = 138;
               break;
            case 110:
               var10000 = 114;
               break;
            case 111:
               var10000 = 217;
               break;
            case 112:
               var10000 = 156;
               break;
            case 113:
               var10000 = 43;
               break;
            case 114:
               var10000 = 82;
               break;
            case 115:
               var10000 = 116;
               break;
            case 116:
               var10000 = 38;
               break;
            case 117:
               var10000 = 191;
               break;
            case 118:
               var10000 = 231;
               break;
            case 119:
               var10000 = 94;
               break;
            case 120:
               var10000 = 207;
               break;
            case 121:
               var10000 = 173;
               break;
            case 122:
               var10000 = 137;
               break;
            case 123:
               var10000 = 193;
               break;
            case 124:
               var10000 = 150;
               break;
            case 125:
               var10000 = 238;
               break;
            case 126:
               var10000 = 233;
               break;
            case 127:
               var10000 = 225;
               break;
            case 128:
               var10000 = 185;
               break;
            case 129:
               var10000 = 113;
               break;
            case 130:
               var10000 = 134;
               break;
            case 131:
               var10000 = 31;
               break;
            case 132:
               var10000 = 149;
               break;
            case 133:
               var10000 = 192;
               break;
            case 134:
               var10000 = 59;
               break;
            case 135:
               var10000 = 103;
               break;
            case 136:
               var10000 = 166;
               break;
            case 137:
               var10000 = 23;
               break;
            case 138:
               var10000 = 240;
               break;
            case 139:
               var10000 = 12;
               break;
            case 140:
               var10000 = 2;
               break;
            case 141:
               var10000 = 182;
               break;
            case 142:
               var10000 = 206;
               break;
            case 143:
               var10000 = 246;
               break;
            case 144:
               var10000 = 216;
               break;
            case 145:
               var10000 = 213;
               break;
            case 146:
               var10000 = 141;
               break;
            case 147:
               var10000 = 136;
               break;
            case 148:
               var10000 = 40;
               break;
            case 149:
               var10000 = 198;
               break;
            case 150:
               var10000 = 92;
               break;
            case 151:
               var10000 = 66;
               break;
            case 152:
               var10000 = 172;
               break;
            case 153:
               var10000 = 0;
               break;
            case 154:
               var10000 = 5;
               break;
            case 155:
               var10000 = 202;
               break;
            case 156:
               var10000 = 235;
               break;
            case 157:
               var10000 = 205;
               break;
            case 158:
               var10000 = 3;
               break;
            case 159:
               var10000 = 9;
               break;
            case 160:
               var10000 = 178;
               break;
            case 161:
               var10000 = 81;
               break;
            case 162:
               var10000 = 47;
               break;
            case 163:
               var10000 = 15;
               break;
            case 164:
               var10000 = 26;
               break;
            case 165:
               var10000 = 25;
               break;
            case 166:
               var10000 = 254;
               break;
            case 167:
               var10000 = 76;
               break;
            case 168:
               var10000 = 100;
               break;
            case 169:
               var10000 = 209;
               break;
            case 170:
               var10000 = 63;
               break;
            case 171:
               var10000 = 22;
               break;
            case 172:
               var10000 = 196;
               break;
            case 173:
               var10000 = 53;
               break;
            case 174:
               var10000 = 6;
               break;
            case 175:
               var10000 = 78;
               break;
            case 176:
               var10000 = 152;
               break;
            case 177:
               var10000 = 45;
               break;
            case 178:
               var10000 = 176;
               break;
            case 179:
               var10000 = 97;
               break;
            case 180:
               var10000 = 54;
               break;
            case 181:
               var10000 = 169;
               break;
            case 182:
               var10000 = 132;
               break;
            case 183:
               var10000 = 183;
               break;
            case 184:
               var10000 = 126;
               break;
            case 185:
               var10000 = 16;
               break;
            case 186:
               var10000 = 70;
               break;
            case 187:
               var10000 = 123;
               break;
            case 188:
               var10000 = 162;
               break;
            case 189:
               var10000 = 83;
               break;
            case 190:
               var10000 = 62;
               break;
            case 191:
               var10000 = 48;
               break;
            case 192:
               var10000 = 98;
               break;
            case 193:
               var10000 = 20;
               break;
            case 194:
               var10000 = 234;
               break;
            case 195:
               var10000 = 251;
               break;
            case 196:
               var10000 = 46;
               break;
            case 197:
               var10000 = 180;
               break;
            case 198:
               var10000 = 101;
               break;
            case 199:
               var10000 = 74;
               break;
            case 200:
               var10000 = 222;
               break;
            case 201:
               var10000 = 241;
               break;
            case 202:
               var10000 = 86;
               break;
            case 203:
               var10000 = 187;
               break;
            case 204:
               var10000 = 212;
               break;
            case 205:
               var10000 = 50;
               break;
            case 206:
               var10000 = 244;
               break;
            case 207:
               var10000 = 194;
               break;
            case 208:
               var10000 = 64;
               break;
            case 209:
               var10000 = 60;
               break;
            case 210:
               var10000 = 232;
               break;
            case 211:
               var10000 = 65;
               break;
            case 212:
               var10000 = 58;
               break;
            case 213:
               var10000 = 10;
               break;
            case 214:
               var10000 = 221;
               break;
            case 215:
               var10000 = 210;
               break;
            case 216:
               var10000 = 130;
               break;
            case 217:
               var10000 = 229;
               break;
            case 218:
               var10000 = 159;
               break;
            case 219:
               var10000 = 34;
               break;
            case 220:
               var10000 = 224;
               break;
            case 221:
               var10000 = 145;
               break;
            case 222:
               var10000 = 154;
               break;
            case 223:
               var10000 = 124;
               break;
            case 224:
               var10000 = 174;
               break;
            case 225:
               var10000 = 157;
               break;
            case 226:
               var10000 = 243;
               break;
            case 227:
               var10000 = 95;
               break;
            case 228:
               var10000 = 135;
               break;
            case 229:
               var10000 = 79;
               break;
            case 230:
               var10000 = 87;
               break;
            case 231:
               var10000 = 1;
               break;
            case 232:
               var10000 = 8;
               break;
            case 233:
               var10000 = 247;
               break;
            case 234:
               var10000 = 242;
               break;
            case 235:
               var10000 = 186;
               break;
            case 236:
               var10000 = 146;
               break;
            case 237:
               var10000 = 29;
               break;
            case 238:
               var10000 = 228;
               break;
            case 239:
               var10000 = 252;
               break;
            case 240:
               var10000 = 201;
               break;
            case 241:
               var10000 = 18;
               break;
            case 242:
               var10000 = 14;
               break;
            case 243:
               var10000 = 195;
               break;
            case 244:
               var10000 = 219;
               break;
            case 245:
               var10000 = 35;
               break;
            case 246:
               var10000 = 155;
               break;
            case 247:
               var10000 = 142;
               break;
            case 248:
               var10000 = 106;
               break;
            case 249:
               var10000 = 56;
               break;
            case 250:
               var10000 = 72;
               break;
            case 251:
               var10000 = 80;
               break;
            case 252:
               var10000 = 253;
               break;
            case 253:
               var10000 = 250;
               break;
            case 254:
               var10000 = 96;
               break;
            default:
               var10000 = 214;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20415;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "l¬:´Åù\t\f<§Ôòµ\u008aàj\u0003ÇbÂ\u001c§d\u009a\nü\u00823\u00adF[Cs\u001d¾\u001d\u007f\u0003þ\u008aC`_ií`_[Y\u00048¬Õ\u0092\u001f¸çyz\u0080\u008c¼l·c}tÚ^åc\u000f{h%y\u0086\u0089c\u0090\u0090\u009a{w\u0092-\u000eæ\u0003¶°sÕ\u0000Í\u001af\u001e\tr\u0004";
      int var12 = "l¬:´Åù\t\f<§Ôòµ\u008aàj\u0003ÇbÂ\u001c§d\u009a\nü\u00823\u00adF[Cs\u001d¾\u001d\u007f\u0003þ\u008aC`_ií`_[Y\u00048¬Õ\u0092\u001f¸çyz\u0080\u008c¼l·c}tÚ^åc\u000f{h%y\u0086\u0089c\u0090\u0090\u009a{w\u0092-\u000eæ\u0003¶°sÕ\u0000Í\u001af\u001e\tr\u0004"
         .length();
      char var9 = 16;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 104;
         String var10001 = var10.substring(++var17, var17 + var9);
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
                        var65 = 122;
                        break;
                     case 1:
                        var65 = 117;
                        break;
                     case 2:
                        var65 = 53;
                        break;
                     case 3:
                        var65 = 43;
                        break;
                     case 4:
                        var65 = 96;
                        break;
                     case 5:
                        var65 = 36;
                        break;
                     default:
                        var65 = 102;
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
                     c = new String[8];
                     long var0 = 8491733598471085532L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "Ë4ÉåJ\u009a1*\rzutp÷A¹\u0018©o\u0014\u0099Ñ2Óóö*×B»B¶";
                     int var5 = "Ë4ÉåJ\u009a1*\rzutp÷A¹\u0018©o\u0014\u0099Ñ2Óóö*×B»B¶".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                                    e = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "[\u001cNO&ÃÙz\u0012\u0080¦ý\n\r\u001c#";
                                 var5 = "[\u001cNO&ÃÙz\u0012\u0080¦ý\n\r\u001c#".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

                  var10 = "\u0082mØ\u009fJÎ\u001aÏÕM\u0081[\u000f\u000f\u0098¦z9Ä÷V>\u0010\u0080\u0080÷\u0099N";
                  var12 = "\u0082mØ\u009fJÎ\u001aÏÕM\u0081[\u000f\u000f\u0098¦z9Ä÷V>\u0010\u0080\u0080÷\u0099N".length();
                  var9 = '\f';
                  var17 = -1;
            }

            var10000 = 78;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





