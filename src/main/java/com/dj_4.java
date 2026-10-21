package com;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

abstract class dj_4 implements EU {
   private Cipher H;
   private SecretKeySpec Y;
   private int U;
   private ByteBuffer K;
   private long r;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   @Override
   public int w() {
      return a(2063, 7760173041356337073L);
   }

   @Override
   public int j() {
      return a(24834, 6916730780236449464L);
   }

   @Override
   public void z(int param1, byte[] param2, byte[] param3) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/y1_2.Q ()Z
      // 003: sipush -23034
      // 006: sipush -13645
      // 009: invokestatic com/dj_4.a (II)Ljava/lang/String;
      // 00c: astore 5
      // 00e: istore 4
      // 010: aload 3
      // 011: arraylength
      // 012: iload 4
      // 014: ifeq 049
      // 017: sipush 7147
      // 01a: ldc2_w 7266516284230401104
      // 01d: invokestatic com/dj_4.a (IJ)I
      // 020: if_icmple 045
      // 023: goto 02a
      // 026: invokestatic com/dj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: sipush 5208
      // 02d: ldc2_w 8728583942633780192
      // 030: invokestatic com/dj_4.a (IJ)I
      // 033: newarray 8
      // 035: astore 6
      // 037: aload 3
      // 038: bipush 0
      // 039: aload 6
      // 03b: bipush 0
      // 03c: aload 6
      // 03e: arraylength
      // 03f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 042: aload 6
      // 044: astore 3
      // 045: aload 0
      // 046: invokevirtual com/dj_4.u ()I
      // 049: istore 7
      // 04b: aload 2
      // 04c: arraylength
      // 04d: iload 4
      // 04f: ifeq 067
      // 052: iload 7
      // 054: if_icmple 079
      // 057: goto 05e
      // 05a: invokestatic com/dj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: iload 7
      // 060: goto 067
      // 063: invokestatic com/dj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: newarray 8
      // 069: astore 6
      // 06b: aload 2
      // 06c: bipush 0
      // 06d: aload 6
      // 06f: bipush 0
      // 070: aload 6
      // 072: arraylength
      // 073: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 076: aload 6
      // 078: astore 2
      // 079: aload 0
      // 07a: iload 1
      // 07b: iload 4
      // 07d: ifeq 08b
      // 080: ifne 08e
      // 083: goto 08a
      // 086: invokestatic com/dj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: bipush 1
      // 08b: goto 08f
      // 08e: bipush 2
      // 08f: putfield com/dj_4.U I
      // 092: aload 0
      // 093: aload 3
      // 094: invokestatic java/nio/ByteBuffer.wrap ([B)Ljava/nio/ByteBuffer;
      // 097: putfield com/dj_4.K Ljava/nio/ByteBuffer;
      // 09a: aload 0
      // 09b: aload 0
      // 09c: getfield com/dj_4.K Ljava/nio/ByteBuffer;
      // 09f: bipush 4
      // 0a0: invokevirtual java/nio/ByteBuffer.getLong (I)J
      // 0a3: putfield com/dj_4.r J
      // 0a6: aload 0
      // 0a7: new javax/crypto/spec/SecretKeySpec
      // 0aa: dup
      // 0ab: aload 2
      // 0ac: sipush -23033
      // 0af: sipush 13852
      // 0b2: invokestatic com/dj_4.a (II)Ljava/lang/String;
      // 0b5: invokespecial javax/crypto/spec/SecretKeySpec.<init> ([BLjava/lang/String;)V
      // 0b8: putfield com/dj_4.Y Ljavax/crypto/spec/SecretKeySpec;
      // 0bb: aload 0
      // 0bc: new java/lang/StringBuilder
      // 0bf: dup
      // 0c0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c3: sipush -23035
      // 0c6: sipush 19663
      // 0c9: invokestatic com/dj_4.a (II)Ljava/lang/String;
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: aload 5
      // 0d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d7: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 0da: putfield com/dj_4.H Ljavax/crypto/Cipher;
      // 0dd: aload 0
      // 0de: getfield com/dj_4.H Ljavax/crypto/Cipher;
      // 0e1: aload 0
      // 0e2: getfield com/dj_4.U I
      // 0e5: aload 0
      // 0e6: getfield com/dj_4.Y Ljavax/crypto/spec/SecretKeySpec;
      // 0e9: new javax/crypto/spec/GCMParameterSpec
      // 0ec: dup
      // 0ed: sipush 32086
      // 0f0: ldc2_w 5833075865578511087
      // 0f3: invokestatic com/dj_4.a (IJ)I
      // 0f6: aload 3
      // 0f7: invokespecial javax/crypto/spec/GCMParameterSpec.<init> (I[B)V
      // 0fa: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 0fd: goto 114
      // 100: astore 8
      // 102: aload 0
      // 103: aconst_null
      // 104: putfield com/dj_4.H Ljavax/crypto/Cipher;
      // 107: aload 0
      // 108: aconst_null
      // 109: putfield com/dj_4.Y Ljavax/crypto/spec/SecretKeySpec;
      // 10c: aload 0
      // 10d: aconst_null
      // 10e: putfield com/dj_4.K Ljava/nio/ByteBuffer;
      // 111: aload 8
      // 113: athrow
      // 114: return
   }

   @Override
   public void X(byte[] var1, int var2, int var3, byte[] var4, int var5) throws Exception {
      this.H.update(var1, var2, var3, var4, var5);
   }

   @Override
   public void c(byte[] var1, int var2, int var3) throws Exception {
      this.H.updateAAD(var1, var2, var3);
   }

   @Override
   public void E(byte[] param1, int param2, int param3, byte[] param4, int param5) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/y1_2.Q ()Z
      // 03: aload 0
      // 04: getfield com/dj_4.H Ljavax/crypto/Cipher;
      // 07: aload 1
      // 08: iload 2
      // 09: iload 3
      // 0a: aload 4
      // 0c: iload 5
      // 0e: invokevirtual javax/crypto/Cipher.doFinal ([BII[BI)I
      // 11: pop
      // 12: istore 6
      // 14: aload 0
      // 15: getfield com/dj_4.K Ljava/nio/ByteBuffer;
      // 18: bipush 4
      // 19: invokevirtual java/nio/ByteBuffer.getLong (I)J
      // 1c: lconst_1
      // 1d: ladd
      // 1e: lstore 7
      // 20: iload 6
      // 22: ifeq 7c
      // 25: lload 7
      // 27: aload 0
      // 28: getfield com/dj_4.r J
      // 2b: lcmp
      // 2c: ifne 4b
      // 2f: goto 36
      // 32: invokestatic com/dj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: new java/lang/IllegalStateException
      // 39: dup
      // 3a: sipush -23036
      // 3d: sipush -6073
      // 40: invokestatic com/dj_4.a (II)Ljava/lang/String;
      // 43: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 46: athrow
      // 47: invokestatic com/dj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield com/dj_4.K Ljava/nio/ByteBuffer;
      // 4f: bipush 4
      // 50: lload 7
      // 52: invokevirtual java/nio/ByteBuffer.putLong (IJ)Ljava/nio/ByteBuffer;
      // 55: pop
      // 56: aload 0
      // 57: getfield com/dj_4.H Ljavax/crypto/Cipher;
      // 5a: aload 0
      // 5b: getfield com/dj_4.U I
      // 5e: aload 0
      // 5f: getfield com/dj_4.Y Ljavax/crypto/spec/SecretKeySpec;
      // 62: new javax/crypto/spec/GCMParameterSpec
      // 65: dup
      // 66: sipush 28472
      // 69: ldc2_w 2281836644444047495
      // 6c: invokestatic com/dj_4.a (IJ)I
      // 6f: aload 0
      // 70: getfield com/dj_4.K Ljava/nio/ByteBuffer;
      // 73: invokevirtual java/nio/ByteBuffer.array ()[B
      // 76: invokespecial javax/crypto/spec/GCMParameterSpec.<init> (I[B)V
      // 79: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 7c: return
   }

   @Override
   public boolean Y() {
      return false;
   }

   @Override
   public boolean S() {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "Hçg/Pù\u0090Ö\u0016\u001a\u0099õ)ÑÂ\u0002^§s\u000b\u00135\u0090\n°®F^ç\rh";
      int var12 = "Hçg/Pù\u0090Ö\u0016\u001a\u0099õ)ÑÂ\u0002^§s\u000b\u00135\u0090\n°®F^ç\rh".length();
      char var9 = '\b';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 88;
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
                        var65 = 82;
                        break;
                     case 1:
                        var65 = 122;
                        break;
                     case 2:
                        var65 = 77;
                        break;
                     case 3:
                        var65 = 13;
                        break;
                     case 4:
                        var65 = 56;
                        break;
                     case 5:
                        var65 = 103;
                        break;
                     default:
                        var65 = 44;
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
                     b = new String[4];
                     long var0 = 6549449139777218014L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "npßÝ^ÌY\u0082\u0098¨\u0002\u0006Aé£v*â\u0013á\u0089^¿±/X\u000f¶F5Ö2";
                     int var5 = "npßÝ^ÌY\u0082\u0098¨\u0002\u0006Aé£v*â\u0013á\u0089^¿±/X\u000f¶F5Ö2".length();
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
                                    d = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0017\rwyif-ÙòÌ¸\u0015ßsÊ\u007f";
                                 var5 = "\u0017\rwyif-ÙòÌ¸\u0015ßsÊ\u007f".length();
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

                  var10 = "\\\u001em\t\u0087eûÖ\u000bî\u0010>\u0005";
                  var12 = "\\\u001em\t\u0087eûÖ\u000bî\u0010>\u0005".length();
                  var9 = 3;
                  var17 = -1;
            }

            var10000 = 117;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -23035) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 66;
               break;
            case 1:
               var10000 = 76;
               break;
            case 2:
               var10000 = 198;
               break;
            case 3:
               var10000 = 39;
               break;
            case 4:
               var10000 = 139;
               break;
            case 5:
               var10000 = 221;
               break;
            case 6:
               var10000 = 173;
               break;
            case 7:
               var10000 = 47;
               break;
            case 8:
               var10000 = 128;
               break;
            case 9:
               var10000 = 44;
               break;
            case 10:
               var10000 = 19;
               break;
            case 11:
               var10000 = 153;
               break;
            case 12:
               var10000 = 20;
               break;
            case 13:
               var10000 = 209;
               break;
            case 14:
               var10000 = 241;
               break;
            case 15:
               var10000 = 50;
               break;
            case 16:
               var10000 = 240;
               break;
            case 17:
               var10000 = 223;
               break;
            case 18:
               var10000 = 92;
               break;
            case 19:
               var10000 = 138;
               break;
            case 20:
               var10000 = 158;
               break;
            case 21:
               var10000 = 165;
               break;
            case 22:
               var10000 = 178;
               break;
            case 23:
               var10000 = 35;
               break;
            case 24:
               var10000 = 201;
               break;
            case 25:
               var10000 = 135;
               break;
            case 26:
               var10000 = 104;
               break;
            case 27:
               var10000 = 15;
               break;
            case 28:
               var10000 = 220;
               break;
            case 29:
               var10000 = 215;
               break;
            case 30:
               var10000 = 34;
               break;
            case 31:
               var10000 = 124;
               break;
            case 32:
               var10000 = 4;
               break;
            case 33:
               var10000 = 188;
               break;
            case 34:
               var10000 = 141;
               break;
            case 35:
               var10000 = 136;
               break;
            case 36:
               var10000 = 30;
               break;
            case 37:
               var10000 = 101;
               break;
            case 38:
               var10000 = 73;
               break;
            case 39:
               var10000 = 202;
               break;
            case 40:
               var10000 = 190;
               break;
            case 41:
               var10000 = 177;
               break;
            case 42:
               var10000 = 86;
               break;
            case 43:
               var10000 = 52;
               break;
            case 44:
               var10000 = 71;
               break;
            case 45:
               var10000 = 160;
               break;
            case 46:
               var10000 = 129;
               break;
            case 47:
               var10000 = 9;
               break;
            case 48:
               var10000 = 253;
               break;
            case 49:
               var10000 = 38;
               break;
            case 50:
               var10000 = 53;
               break;
            case 51:
               var10000 = 159;
               break;
            case 52:
               var10000 = 144;
               break;
            case 53:
               var10000 = 214;
               break;
            case 54:
               var10000 = 40;
               break;
            case 55:
               var10000 = 13;
               break;
            case 56:
               var10000 = 48;
               break;
            case 57:
               var10000 = 79;
               break;
            case 58:
               var10000 = 132;
               break;
            case 59:
               var10000 = 112;
               break;
            case 60:
               var10000 = 42;
               break;
            case 61:
               var10000 = 105;
               break;
            case 62:
               var10000 = 64;
               break;
            case 63:
               var10000 = 65;
               break;
            case 64:
               var10000 = 166;
               break;
            case 65:
               var10000 = 90;
               break;
            case 66:
               var10000 = 204;
               break;
            case 67:
               var10000 = 168;
               break;
            case 68:
               var10000 = 137;
               break;
            case 69:
               var10000 = 154;
               break;
            case 70:
               var10000 = 2;
               break;
            case 71:
               var10000 = 191;
               break;
            case 72:
               var10000 = 115;
               break;
            case 73:
               var10000 = 3;
               break;
            case 74:
               var10000 = 247;
               break;
            case 75:
               var10000 = 6;
               break;
            case 76:
               var10000 = 100;
               break;
            case 77:
               var10000 = 207;
               break;
            case 78:
               var10000 = 162;
               break;
            case 79:
               var10000 = 32;
               break;
            case 80:
               var10000 = 183;
               break;
            case 81:
               var10000 = 120;
               break;
            case 82:
               var10000 = 57;
               break;
            case 83:
               var10000 = 216;
               break;
            case 84:
               var10000 = 37;
               break;
            case 85:
               var10000 = 184;
               break;
            case 86:
               var10000 = 49;
               break;
            case 87:
               var10000 = 225;
               break;
            case 88:
               var10000 = 87;
               break;
            case 89:
               var10000 = 252;
               break;
            case 90:
               var10000 = 27;
               break;
            case 91:
               var10000 = 107;
               break;
            case 92:
               var10000 = 236;
               break;
            case 93:
               var10000 = 230;
               break;
            case 94:
               var10000 = 83;
               break;
            case 95:
               var10000 = 23;
               break;
            case 96:
               var10000 = 63;
               break;
            case 97:
               var10000 = 186;
               break;
            case 98:
               var10000 = 36;
               break;
            case 99:
               var10000 = 26;
               break;
            case 100:
               var10000 = 123;
               break;
            case 101:
               var10000 = 89;
               break;
            case 102:
               var10000 = 219;
               break;
            case 103:
               var10000 = 77;
               break;
            case 104:
               var10000 = 16;
               break;
            case 105:
               var10000 = 196;
               break;
            case 106:
               var10000 = 18;
               break;
            case 107:
               var10000 = 41;
               break;
            case 108:
               var10000 = 75;
               break;
            case 109:
               var10000 = 149;
               break;
            case 110:
               var10000 = 234;
               break;
            case 111:
               var10000 = 187;
               break;
            case 112:
               var10000 = 218;
               break;
            case 113:
               var10000 = 22;
               break;
            case 114:
               var10000 = 98;
               break;
            case 115:
               var10000 = 250;
               break;
            case 116:
               var10000 = 222;
               break;
            case 117:
               var10000 = 179;
               break;
            case 118:
               var10000 = 125;
               break;
            case 119:
               var10000 = 45;
               break;
            case 120:
               var10000 = 143;
               break;
            case 121:
               var10000 = 116;
               break;
            case 122:
               var10000 = 69;
               break;
            case 123:
               var10000 = 226;
               break;
            case 124:
               var10000 = 206;
               break;
            case 125:
               var10000 = 17;
               break;
            case 126:
               var10000 = 254;
               break;
            case 127:
               var10000 = 172;
               break;
            case 128:
               var10000 = 167;
               break;
            case 129:
               var10000 = 67;
               break;
            case 130:
               var10000 = 147;
               break;
            case 131:
               var10000 = 231;
               break;
            case 132:
               var10000 = 237;
               break;
            case 133:
               var10000 = 72;
               break;
            case 134:
               var10000 = 156;
               break;
            case 135:
               var10000 = 88;
               break;
            case 136:
               var10000 = 174;
               break;
            case 137:
               var10000 = 192;
               break;
            case 138:
               var10000 = 127;
               break;
            case 139:
               var10000 = 193;
               break;
            case 140:
               var10000 = 97;
               break;
            case 141:
               var10000 = 85;
               break;
            case 142:
               var10000 = 113;
               break;
            case 143:
               var10000 = 182;
               break;
            case 144:
               var10000 = 130;
               break;
            case 145:
               var10000 = 171;
               break;
            case 146:
               var10000 = 51;
               break;
            case 147:
               var10000 = 70;
               break;
            case 148:
               var10000 = 108;
               break;
            case 149:
               var10000 = 251;
               break;
            case 150:
               var10000 = 11;
               break;
            case 151:
               var10000 = 117;
               break;
            case 152:
               var10000 = 119;
               break;
            case 153:
               var10000 = 180;
               break;
            case 154:
               var10000 = 56;
               break;
            case 155:
               var10000 = 43;
               break;
            case 156:
               var10000 = 205;
               break;
            case 157:
               var10000 = 29;
               break;
            case 158:
               var10000 = 134;
               break;
            case 159:
               var10000 = 14;
               break;
            case 160:
               var10000 = 197;
               break;
            case 161:
               var10000 = 10;
               break;
            case 162:
               var10000 = 91;
               break;
            case 163:
               var10000 = 131;
               break;
            case 164:
               var10000 = 212;
               break;
            case 165:
               var10000 = 246;
               break;
            case 166:
               var10000 = 145;
               break;
            case 167:
               var10000 = 118;
               break;
            case 168:
               var10000 = 82;
               break;
            case 169:
               var10000 = 61;
               break;
            case 170:
               var10000 = 229;
               break;
            case 171:
               var10000 = 121;
               break;
            case 172:
               var10000 = 152;
               break;
            case 173:
               var10000 = 1;
               break;
            case 174:
               var10000 = 169;
               break;
            case 175:
               var10000 = 74;
               break;
            case 176:
               var10000 = 151;
               break;
            case 177:
               var10000 = 163;
               break;
            case 178:
               var10000 = 0;
               break;
            case 179:
               var10000 = 243;
               break;
            case 180:
               var10000 = 248;
               break;
            case 181:
               var10000 = 185;
               break;
            case 182:
               var10000 = 33;
               break;
            case 183:
               var10000 = 62;
               break;
            case 184:
               var10000 = 80;
               break;
            case 185:
               var10000 = 233;
               break;
            case 186:
               var10000 = 161;
               break;
            case 187:
               var10000 = 102;
               break;
            case 188:
               var10000 = 114;
               break;
            case 189:
               var10000 = 164;
               break;
            case 190:
               var10000 = 111;
               break;
            case 191:
               var10000 = 28;
               break;
            case 192:
               var10000 = 199;
               break;
            case 193:
               var10000 = 58;
               break;
            case 194:
               var10000 = 255;
               break;
            case 195:
               var10000 = 55;
               break;
            case 196:
               var10000 = 94;
               break;
            case 197:
               var10000 = 208;
               break;
            case 198:
               var10000 = 194;
               break;
            case 199:
               var10000 = 245;
               break;
            case 200:
               var10000 = 195;
               break;
            case 201:
               var10000 = 133;
               break;
            case 202:
               var10000 = 140;
               break;
            case 203:
               var10000 = 60;
               break;
            case 204:
               var10000 = 235;
               break;
            case 205:
               var10000 = 122;
               break;
            case 206:
               var10000 = 211;
               break;
            case 207:
               var10000 = 203;
               break;
            case 208:
               var10000 = 81;
               break;
            case 209:
               var10000 = 24;
               break;
            case 210:
               var10000 = 110;
               break;
            case 211:
               var10000 = 5;
               break;
            case 212:
               var10000 = 146;
               break;
            case 213:
               var10000 = 106;
               break;
            case 214:
               var10000 = 242;
               break;
            case 215:
               var10000 = 181;
               break;
            case 216:
               var10000 = 148;
               break;
            case 217:
               var10000 = 224;
               break;
            case 218:
               var10000 = 150;
               break;
            case 219:
               var10000 = 31;
               break;
            case 220:
               var10000 = 68;
               break;
            case 221:
               var10000 = 238;
               break;
            case 222:
               var10000 = 232;
               break;
            case 223:
               var10000 = 95;
               break;
            case 224:
               var10000 = 25;
               break;
            case 225:
               var10000 = 103;
               break;
            case 226:
               var10000 = 54;
               break;
            case 227:
               var10000 = 99;
               break;
            case 228:
               var10000 = 228;
               break;
            case 229:
               var10000 = 210;
               break;
            case 230:
               var10000 = 200;
               break;
            case 231:
               var10000 = 7;
               break;
            case 232:
               var10000 = 249;
               break;
            case 233:
               var10000 = 157;
               break;
            case 234:
               var10000 = 213;
               break;
            case 235:
               var10000 = 109;
               break;
            case 236:
               var10000 = 59;
               break;
            case 237:
               var10000 = 239;
               break;
            case 238:
               var10000 = 155;
               break;
            case 239:
               var10000 = 21;
               break;
            case 240:
               var10000 = 176;
               break;
            case 241:
               var10000 = 142;
               break;
            case 242:
               var10000 = 84;
               break;
            case 243:
               var10000 = 8;
               break;
            case 244:
               var10000 = 175;
               break;
            case 245:
               var10000 = 189;
               break;
            case 246:
               var10000 = 126;
               break;
            case 247:
               var10000 = 217;
               break;
            case 248:
               var10000 = 96;
               break;
            case 249:
               var10000 = 227;
               break;
            case 250:
               var10000 = 93;
               break;
            case 251:
               var10000 = 170;
               break;
            case 252:
               var10000 = 244;
               break;
            case 253:
               var10000 = 46;
               break;
            case 254:
               var10000 = 12;
               break;
            default:
               var10000 = 78;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26555;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





