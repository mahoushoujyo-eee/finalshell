package com;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

abstract class Lr_2 implements com.Q0 {
   Signature m;
   KeyFactory j;
   private static final String[] a;
   private static final String[] b;
   private static final long[] d;
   private static final Integer[] e;

   abstract String X();

   @Override
   public void k() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual com/Lr_2.X ()Ljava/lang/String;
      // 04: astore 2
      // 05: invokestatic com/y1_2.Q ()Z
      // 08: sipush 5905
      // 0b: sipush -15703
      // 0e: invokestatic com/Lr_2.a (II)Ljava/lang/String;
      // 11: astore 3
      // 12: istore 1
      // 13: aload 2
      // 14: sipush 5915
      // 17: sipush 17076
      // 1a: invokestatic com/Lr_2.a (II)Ljava/lang/String;
      // 1d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 20: iload 1
      // 21: ifeq 5b
      // 24: ifeq 3c
      // 27: goto 2e
      // 2a: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: sipush 5910
      // 31: sipush -9395
      // 34: invokestatic com/Lr_2.a (II)Ljava/lang/String;
      // 37: astore 3
      // 38: iload 1
      // 39: ifne 68
      // 3c: aload 2
      // 3d: iload 1
      // 3e: ifeq 67
      // 41: goto 48
      // 44: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: sipush 5912
      // 4b: sipush 13956
      // 4e: invokestatic com/Lr_2.a (II)Ljava/lang/String;
      // 51: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 54: goto 5b
      // 57: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: ifeq 68
      // 5e: sipush 5909
      // 61: sipush -5205
      // 64: invokestatic com/Lr_2.a (II)Ljava/lang/String;
      // 67: astore 3
      // 68: aload 0
      // 69: aload 3
      // 6a: invokestatic java/security/Signature.getInstance (Ljava/lang/String;)Ljava/security/Signature;
      // 6d: putfield com/Lr_2.m Ljava/security/Signature;
      // 70: aload 0
      // 71: sipush 5913
      // 74: sipush -3272
      // 77: invokestatic com/Lr_2.a (II)Ljava/lang/String;
      // 7a: invokestatic java/security/KeyFactory.getInstance (Ljava/lang/String;)Ljava/security/KeyFactory;
      // 7d: putfield com/Lr_2.j Ljava/security/KeyFactory;
      // 80: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void T(byte[] var1, byte[] var2) throws Exception {
      int var10001 = com.y1_2.D();
      var1 = F(var1);
      var2 = F(var2);
      boolean var3 = (boolean)var10001;
      String var4 = a(5916, 28127);

      label39: {
         int var10000;
         label46: {
            label43: {
               try {
                  var10000 = var1.length;
                  var10001 = a(21246, 3981263770132948190L);
                  if (var3) {
                     break label46;
                  }

                  if (var10000 < var10001) {
                     break label43;
                  }
               } catch (Exception var11) {
                  throw a(var11);
               }

               var4 = a(5907, 21558);

               try {
                  if (!var3) {
                     break label39;
                  }
               } catch (Exception var10) {
                  boolean var16 = false;
                  throw a(var10);
               }
            }

            try {
               var10000 = var1.length;
               var10001 = a(6119, 4989468713581142475L);
            } catch (Exception var9) {
               boolean var17 = false;
               throw a(var9);
            }
         }

         if (var10000 >= var10001) {
            var4 = a(5914, -1283);
         }
      }

      AlgorithmParameters var5 = AlgorithmParameters.getInstance(a(5913, -3272));
      var5.init(new ECGenParameterSpec(var4));
      ECParameterSpec var6 = var5.getParameterSpec(ECParameterSpec.class);
      ECPoint var7 = new ECPoint(new BigInteger(1, var1), new BigInteger(1, var2));
      PublicKey var8 = this.j.generatePublic(new ECPublicKeySpec(var7, var6));
      this.m.initVerify(var8);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void N(byte[] var1) throws Exception {
      var1 = F(var1);
      int var10000 = com.y1_2.D();
      String var3 = a(5908, -11942);
      boolean var2 = (boolean)var10000;

      label39: {
         int var10001;
         label46: {
            label43: {
               try {
                  var10000 = var1.length;
                  var10001 = a(25160, 2353833720034104426L);
                  if (var2) {
                     break label46;
                  }

                  if (var10000 < var10001) {
                     break label43;
                  }
               } catch (Exception var10) {
                  throw a(var10);
               }

               var3 = a(5906, 11873);

               try {
                  if (!var2) {
                     break label39;
                  }
               } catch (Exception var9) {
                  boolean var14 = false;
                  throw a(var9);
               }
            }

            try {
               var10000 = var1.length;
               var10001 = a(15835, 23714235633257468L);
            } catch (Exception var8) {
               boolean var15 = false;
               throw a(var8);
            }
         }

         if (var10000 >= var10001) {
            var3 = a(5911, -3720);
         }
      }

      AlgorithmParameters var4 = AlgorithmParameters.getInstance(a(5904, -4479));
      var4.init(new ECGenParameterSpec(var3));
      ECParameterSpec var5 = var4.getParameterSpec(ECParameterSpec.class);
      BigInteger var6 = new BigInteger(1, var1);
      PrivateKey var7 = this.j.generatePrivate(new ECPrivateKeySpec(var6, var5));
      this.m.initSign(var7);
   }

   @Override
   public byte[] k$byte() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/y1_2.Q ()Z
      // 003: aload 0
      // 004: getfield com/Lr_2.m Ljava/security/Signature;
      // 007: invokevirtual java/security/Signature.sign ()[B
      // 00a: astore 2
      // 00b: istore 1
      // 00c: aload 2
      // 00d: iload 1
      // 00e: ifeq 142
      // 011: bipush 0
      // 012: baload
      // 013: sipush 6119
      // 016: ldc2_w 4989468713581142475
      // 019: invokestatic com/Lr_2.a (IJ)I
      // 01c: if_icmpne 141
      // 01f: goto 026
      // 022: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: aload 2
      // 027: bipush 1
      // 028: baload
      // 029: bipush 2
      // 02a: iadd
      // 02b: iload 1
      // 02c: ifeq 092
      // 02f: goto 036
      // 032: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: aload 2
      // 037: arraylength
      // 038: if_icmpeq 08a
      // 03b: goto 042
      // 03e: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 2
      // 043: iload 1
      // 044: ifeq 142
      // 047: goto 04e
      // 04a: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: bipush 1
      // 04f: baload
      // 050: sipush 28176
      // 053: ldc2_w 6512412846924306486
      // 056: invokestatic com/Lr_2.a (IJ)I
      // 059: iand
      // 05a: ifeq 141
      // 05d: goto 064
      // 060: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: aload 2
      // 065: iload 1
      // 066: ifeq 142
      // 069: goto 070
      // 06c: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: bipush 2
      // 071: baload
      // 072: sipush 6226
      // 075: ldc2_w 6525345766547779190
      // 078: invokestatic com/Lr_2.a (IJ)I
      // 07b: iand
      // 07c: bipush 3
      // 07d: iadd
      // 07e: aload 2
      // 07f: arraylength
      // 080: if_icmpne 141
      // 083: goto 08a
      // 086: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: bipush 3
      // 08b: goto 092
      // 08e: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: istore 3
      // 093: aload 2
      // 094: bipush 1
      // 095: baload
      // 096: sipush 17841
      // 099: ldc2_w 3008414072576095120
      // 09c: invokestatic com/Lr_2.a (IJ)I
      // 09f: iand
      // 0a0: iload 1
      // 0a1: ifeq 0d9
      // 0a4: ifeq 0d6
      // 0a7: goto 0ae
      // 0aa: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: aload 2
      // 0af: bipush 2
      // 0b0: baload
      // 0b1: sipush 19338
      // 0b4: ldc2_w 6366338719621135780
      // 0b7: invokestatic com/Lr_2.a (IJ)I
      // 0ba: iand
      // 0bb: bipush 3
      // 0bc: iadd
      // 0bd: iload 1
      // 0be: ifeq 0d9
      // 0c1: goto 0c8
      // 0c4: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: aload 2
      // 0c9: arraylength
      // 0ca: if_icmpne 0d6
      // 0cd: goto 0d4
      // 0d0: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: bipush 4
      // 0d5: istore 3
      // 0d6: aload 2
      // 0d7: iload 3
      // 0d8: baload
      // 0d9: newarray 8
      // 0db: astore 4
      // 0dd: aload 2
      // 0de: iload 3
      // 0df: bipush 2
      // 0e0: iadd
      // 0e1: aload 2
      // 0e2: iload 3
      // 0e3: baload
      // 0e4: iadd
      // 0e5: baload
      // 0e6: newarray 8
      // 0e8: astore 5
      // 0ea: aload 2
      // 0eb: iload 3
      // 0ec: bipush 1
      // 0ed: iadd
      // 0ee: aload 4
      // 0f0: bipush 0
      // 0f1: aload 4
      // 0f3: arraylength
      // 0f4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f7: aload 2
      // 0f8: iload 3
      // 0f9: bipush 3
      // 0fa: iadd
      // 0fb: aload 2
      // 0fc: iload 3
      // 0fd: baload
      // 0fe: iadd
      // 0ff: aload 5
      // 101: bipush 0
      // 102: aload 5
      // 104: arraylength
      // 105: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 108: aload 4
      // 10a: invokestatic com/Lr_2.J ([B)[B
      // 10d: astore 4
      // 10f: aload 5
      // 111: invokestatic com/Lr_2.J ([B)[B
      // 114: astore 5
      // 116: new com/uJ
      // 119: dup
      // 11a: invokespecial com/uJ.<init> ()V
      // 11d: astore 6
      // 11f: aload 6
      // 121: aload 4
      // 123: invokevirtual com/uJ.x ([B)V
      // 126: aload 6
      // 128: aload 5
      // 12a: invokevirtual com/uJ.x ([B)V
      // 12d: aload 6
      // 12f: invokevirtual com/uJ.P ()I
      // 132: newarray 8
      // 134: astore 2
      // 135: aload 6
      // 137: bipush 0
      // 138: invokevirtual com/uJ.Z (I)V
      // 13b: aload 6
      // 13d: aload 2
      // 13e: invokevirtual com/uJ.W ([B)V
      // 141: aload 2
      // 142: areturn
   }

   @Override
   public void d(byte[] var1) throws Exception {
      this.m.update(var1);
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
      // 000: invokestatic com/y1_2.Q ()Z
      // 003: istore 2
      // 004: aload 1
      // 005: bipush 0
      // 006: baload
      // 007: sipush 6119
      // 00a: ldc2_w 4989468713581142475
      // 00d: invokestatic com/Lr_2.a (IJ)I
      // 010: iload 2
      // 011: ifeq 037
      // 014: if_icmpne 082
      // 017: goto 01e
      // 01a: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 1
      // 01f: bipush 1
      // 020: baload
      // 021: bipush 2
      // 022: iadd
      // 023: iload 2
      // 024: ifeq 1e3
      // 027: goto 02e
      // 02a: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 1
      // 02f: arraylength
      // 030: goto 037
      // 033: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: if_icmpeq 1db
      // 03a: aload 1
      // 03b: bipush 1
      // 03c: baload
      // 03d: sipush 17841
      // 040: ldc2_w 3008414072576095120
      // 043: invokestatic com/Lr_2.a (IJ)I
      // 046: iand
      // 047: iload 2
      // 048: ifeq 072
      // 04b: goto 052
      // 04e: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: ifeq 082
      // 055: goto 05c
      // 058: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: aload 1
      // 05d: bipush 2
      // 05e: baload
      // 05f: sipush 19338
      // 062: ldc2_w 6366338719621135780
      // 065: invokestatic com/Lr_2.a (IJ)I
      // 068: iand
      // 069: bipush 3
      // 06a: iadd
      // 06b: goto 072
      // 06e: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: iload 2
      // 073: ifeq 1e3
      // 076: aload 1
      // 077: arraylength
      // 078: if_icmpeq 1db
      // 07b: goto 082
      // 07e: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: new com/uJ
      // 085: dup
      // 086: aload 1
      // 087: invokespecial com/uJ.<init> ([B)V
      // 08a: astore 3
      // 08b: aload 3
      // 08c: invokevirtual com/uJ.S ()[B
      // 08f: pop
      // 090: aload 3
      // 091: invokevirtual com/uJ.d ()I
      // 094: pop
      // 095: aload 3
      // 096: invokevirtual com/uJ.e ()[B
      // 099: astore 4
      // 09b: aload 3
      // 09c: invokevirtual com/uJ.e ()[B
      // 09f: astore 5
      // 0a1: aload 4
      // 0a3: invokestatic com/Lr_2.F ([B)[B
      // 0a6: invokestatic com/Lr_2.a ([B)[B
      // 0a9: astore 4
      // 0ab: aload 5
      // 0ad: invokestatic com/Lr_2.F ([B)[B
      // 0b0: invokestatic com/Lr_2.a ([B)[B
      // 0b3: astore 5
      // 0b5: aconst_null
      // 0b6: astore 6
      // 0b8: aload 4
      // 0ba: arraylength
      // 0bb: sipush 21246
      // 0be: ldc2_w 3981263770132948190
      // 0c1: invokestatic com/Lr_2.a (IJ)I
      // 0c4: iload 2
      // 0c5: ifeq 15d
      // 0c8: if_icmpge 14b
      // 0cb: goto 0d2
      // 0ce: invokestatic com/Lr_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: sipush 6284
      // 0d5: ldc2_w 4220649401221705385
      // 0d8: invokestatic com/Lr_2.a (IJ)I
      // 0db: aload 4
      // 0dd: arraylength
      // 0de: iadd
      // 0df: aload 5
      // 0e1: arraylength
      // 0e2: iadd
      // 0e3: newarray 8
      // 0e5: astore 6
      // 0e7: aload 6
      // 0e9: bipush 0
      // 0ea: sipush 6119
      // 0ed: ldc2_w 4989468713581142475
      // 0f0: invokestatic com/Lr_2.a (IJ)I
      // 0f3: bastore
      // 0f4: aload 6
      // 0f6: bipush 1
      // 0f7: bipush 4
      // 0f8: aload 4
      // 0fa: arraylength
      // 0fb: iadd
      // 0fc: aload 5
      // 0fe: arraylength
      // 0ff: iadd
      // 100: i2b
      // 101: bastore
      // 102: aload 6
      // 104: bipush 2
      // 105: bipush 2
      // 106: bastore
      // 107: aload 6
      // 109: bipush 3
      // 10a: aload 4
      // 10c: arraylength
      // 10d: i2b
      // 10e: bastore
      // 10f: aload 4
      // 111: bipush 0
      // 112: aload 6
      // 114: bipush 4
      // 115: aload 4
      // 117: arraylength
      // 118: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 11b: aload 6
      // 11d: aload 4
      // 11f: arraylength
      // 120: bipush 4
      // 121: iadd
      // 122: bipush 2
      // 123: bastore
      // 124: aload 6
      // 126: aload 4
      // 128: arraylength
      // 129: bipush 5
      // 12a: iadd
      // 12b: aload 5
      // 12d: arraylength
      // 12e: i2b
      // 12f: bastore
      // 130: aload 5
      // 132: bipush 0
      // 133: aload 6
      // 135: sipush 20324
      // 138: ldc2_w 1278296689168300363
      // 13b: invokestatic com/Lr_2.a (IJ)I
      // 13e: aload 4
      // 140: arraylength
      // 141: iadd
      // 142: aload 5
      // 144: arraylength
      // 145: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 148: goto 1d8
      // 14b: sipush 20324
      // 14e: ldc2_w 1278296689168300363
      // 151: invokestatic com/Lr_2.a (IJ)I
      // 154: aload 4
      // 156: arraylength
      // 157: iadd
      // 158: aload 5
      // 15a: arraylength
      // 15b: iadd
      // 15c: bipush 1
      // 15d: iadd
      // 15e: newarray 8
      // 160: astore 6
      // 162: aload 6
      // 164: bipush 0
      // 165: sipush 6119
      // 168: ldc2_w 4989468713581142475
      // 16b: invokestatic com/Lr_2.a (IJ)I
      // 16e: bastore
      // 16f: aload 6
      // 171: bipush 1
      // 172: sipush 5174
      // 175: ldc2_w 8935114547981279771
      // 178: invokestatic com/Lr_2.a (IJ)I
      // 17b: bastore
      // 17c: aload 6
      // 17e: bipush 2
      // 17f: bipush 4
      // 180: aload 4
      // 182: arraylength
      // 183: iadd
      // 184: aload 5
      // 186: arraylength
      // 187: iadd
      // 188: i2b
      // 189: bastore
      // 18a: aload 6
      // 18c: bipush 3
      // 18d: bipush 2
      // 18e: bastore
      // 18f: aload 6
      // 191: bipush 4
      // 192: aload 4
      // 194: arraylength
      // 195: i2b
      // 196: bastore
      // 197: aload 4
      // 199: bipush 0
      // 19a: aload 6
      // 19c: bipush 5
      // 19d: aload 4
      // 19f: arraylength
      // 1a0: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1a3: aload 6
      // 1a5: aload 4
      // 1a7: arraylength
      // 1a8: bipush 5
      // 1a9: iadd
      // 1aa: bipush 2
      // 1ab: bastore
      // 1ac: aload 6
      // 1ae: aload 4
      // 1b0: arraylength
      // 1b1: sipush 20324
      // 1b4: ldc2_w 1278296689168300363
      // 1b7: invokestatic com/Lr_2.a (IJ)I
      // 1ba: iadd
      // 1bb: aload 5
      // 1bd: arraylength
      // 1be: i2b
      // 1bf: bastore
      // 1c0: aload 5
      // 1c2: bipush 0
      // 1c3: aload 6
      // 1c5: sipush 2681
      // 1c8: ldc2_w 4464435364681612378
      // 1cb: invokestatic com/Lr_2.a (IJ)I
      // 1ce: aload 4
      // 1d0: arraylength
      // 1d1: iadd
      // 1d2: aload 5
      // 1d4: arraylength
      // 1d5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1d8: aload 6
      // 1da: astore 1
      // 1db: aload 0
      // 1dc: getfield com/Lr_2.m Ljava/security/Signature;
      // 1df: aload 1
      // 1e0: invokevirtual java/security/Signature.verify ([B)Z
      // 1e3: ireturn
   }

   private static byte[] F(byte[] var0) {
      boolean var1 = com.y1_2.Q();
      int var10000 = var0[0] & a(17841, 3008414072576095120L);
      if (var1) {
         if (var10000 == 0) {
            return var0;
         }

         var10000 = var0.length + 1;
      }

      byte[] var2 = new byte[var10000];
      System.arraycopy(var0, 0, var2, 1, var0.length);
      NR.C(var0);
      return var2;
   }

   private static byte[] J(byte[] var0) {
      boolean var1 = com.y1_2.D();
      int var10000 = var0[0];
      if (!var1) {
         if (var10000 != 0) {
            return var0;
         }

         var10000 = var0.length - 1;
      }

      byte[] var2 = new byte[var10000];
      System.arraycopy(var0, 1, var2, 0, var2.length);
      NR.C(var0);
      return var2;
   }

   private static byte[] a(byte[] var0) {
      boolean var1 = com.y1_2.D();
      int var10000 = var0.length;
      if (!var1) {
         if (var10000 < 2) {
            return var0;
         }

         var10000 = 0;
      }

      int var2 = var10000;

      while (true) {
         if (var2 < var0.length - 1) {
            var10000 = var0[var2];
            if (var1 || var1) {
               break;
            }

            if (var10000 == 0) {
               var10000 = var0[var2 + 1] & a(17841, 3008414072576095120L);
               if (var1) {
                  break;
               }

               if (var10000 == 0) {
                  var2++;
                  if (!var1) {
                     continue;
                  }
               }
            }
         }

         var10000 = var2;
         break;
      }

      if (!var1) {
         if (var10000 == 0) {
            return var0;
         }

         var10000 = var0.length - var2;
      }

      byte[] var3 = new byte[var10000];
      System.arraycopy(var0, var2, var3, 0, var3.length);
      NR.C(var0);
      return var3;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[13];
      int var11 = 0;
      String var10 = "` \u000f-~¦\u0090·\u0087Eÿb¨ß\f\u0085®«\t&¶ÁC=óRîK\tï\u008eøD\u001a\u0013¶ò×\tß\u0007þuÝ2®13\u000f'-çý\u009bÉD²B\u0001Û9\u0005\b»\u000f$ü\u0087Á\u009e\u008eÌ\u009cSÄù\u0081A\u001f3\t<ü\u0082\nSÐ\\Á/\u0013\u0099<å×\n\u001d(Õ^\u0096\u0087÷Æy~e{Ìò\u0002yU\t\u0096Ö×Oùx\tÔ\u0085";
      int var12 = "` \u000f-~¦\u0090·\u0087Eÿb¨ß\f\u0085®«\t&¶ÁC=óRîK\tï\u008eøD\u001a\u0013¶ò×\tß\u0007þuÝ2®13\u000f'-çý\u009bÉD²B\u0001Û9\u0005\b»\u000f$ü\u0087Á\u009e\u008eÌ\u009cSÄù\u0081A\u001f3\t<ü\u0082\nSÐ\\Á/\u0013\u0099<å×\n\u001d(Õ^\u0096\u0087÷Æy~e{Ìò\u0002yU\t\u0096Ö×Oùx\tÔ\u0085"
         .length();
      char var9 = 2;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 105;
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
                        var65 = 49;
                        break;
                     case 1:
                        var65 = 96;
                        break;
                     case 2:
                        var65 = 25;
                        break;
                     case 3:
                        var65 = 100;
                        break;
                     case 4:
                        var65 = 88;
                        break;
                     case 5:
                        var65 = 31;
                        break;
                     default:
                        var65 = 24;
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
                     b = new String[13];
                     long var0 = 6712375378014846983L;
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "\u0088ëJOV\n®\u008e\u0097\"Á9\fï®¨þjä¼V:X±p\u0084J\u0018\n\u00ad\u000bËLBä~\u0092Od\u0099Û\u00172øP\u0088s\u0017\u009d\u009aÃ\u0014£_T-~\u0016Pb7.¼Z£¦ÙØ§J¡üóªÜ\u0099\u0019\u0081Ý\u009d";
                     int var5 = "\u0088ëJOV\n®\u008e\u0097\"Á9\fï®¨þjä¼V:X±p\u0084J\u0018\n\u00ad\u000bËLBä~\u0092Od\u0099Û\u00172øP\u0088s\u0017\u009d\u009aÃ\u0014£_T-~\u0016Pb7.¼Z£¦ÙØ§J¡üóªÜ\u0099\u0019\u0081Ý\u009d"
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
                                    d = var6;
                                    e = new Integer[12];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "jà\u008b±{r}\\¨\u0002\tù^ÈyJ";
                                 var5 = "jà\u008b±{r}\\¨\u0002\tù^ÈyJ".length();
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

                  var10 = "\u008aK»\u0005ý{ê%:´7\u008fìJ\u0007?n±¯\t\u0095D\u008b!O\u0084ÀÛÂ";
                  var12 = "\u008aK»\u0005ý{ê%:´7\u008fìJ\u0007?n±¯\t\u0095D\u008b!O\u0084ÀÛÂ".length();
                  var9 = 19;
                  var17 = -1;
            }

            var10000 = 27;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 5904) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 158;
               break;
            case 1:
               var10000 = 217;
               break;
            case 2:
               var10000 = 218;
               break;
            case 3:
               var10000 = 25;
               break;
            case 4:
               var10000 = 176;
               break;
            case 5:
               var10000 = 189;
               break;
            case 6:
               var10000 = 198;
               break;
            case 7:
               var10000 = 113;
               break;
            case 8:
               var10000 = 16;
               break;
            case 9:
               var10000 = 252;
               break;
            case 10:
               var10000 = 144;
               break;
            case 11:
               var10000 = 168;
               break;
            case 12:
               var10000 = 206;
               break;
            case 13:
               var10000 = 221;
               break;
            case 14:
               var10000 = 216;
               break;
            case 15:
               var10000 = 92;
               break;
            case 16:
               var10000 = 219;
               break;
            case 17:
               var10000 = 223;
               break;
            case 18:
               var10000 = 254;
               break;
            case 19:
               var10000 = 87;
               break;
            case 20:
               var10000 = 17;
               break;
            case 21:
               var10000 = 242;
               break;
            case 22:
               var10000 = 67;
               break;
            case 23:
               var10000 = 164;
               break;
            case 24:
               var10000 = 172;
               break;
            case 25:
               var10000 = 98;
               break;
            case 26:
               var10000 = 69;
               break;
            case 27:
               var10000 = 147;
               break;
            case 28:
               var10000 = 79;
               break;
            case 29:
               var10000 = 62;
               break;
            case 30:
               var10000 = 68;
               break;
            case 31:
               var10000 = 58;
               break;
            case 32:
               var10000 = 210;
               break;
            case 33:
               var10000 = 212;
               break;
            case 34:
               var10000 = 14;
               break;
            case 35:
               var10000 = 5;
               break;
            case 36:
               var10000 = 197;
               break;
            case 37:
               var10000 = 119;
               break;
            case 38:
               var10000 = 215;
               break;
            case 39:
               var10000 = 126;
               break;
            case 40:
               var10000 = 231;
               break;
            case 41:
               var10000 = 20;
               break;
            case 42:
               var10000 = 72;
               break;
            case 43:
               var10000 = 170;
               break;
            case 44:
               var10000 = 129;
               break;
            case 45:
               var10000 = 232;
               break;
            case 46:
               var10000 = 156;
               break;
            case 47:
               var10000 = 169;
               break;
            case 48:
               var10000 = 2;
               break;
            case 49:
               var10000 = 13;
               break;
            case 50:
               var10000 = 130;
               break;
            case 51:
               var10000 = 228;
               break;
            case 52:
               var10000 = 61;
               break;
            case 53:
               var10000 = 121;
               break;
            case 54:
               var10000 = 230;
               break;
            case 55:
               var10000 = 225;
               break;
            case 56:
               var10000 = 4;
               break;
            case 57:
               var10000 = 103;
               break;
            case 58:
               var10000 = 195;
               break;
            case 59:
               var10000 = 220;
               break;
            case 60:
               var10000 = 194;
               break;
            case 61:
               var10000 = 7;
               break;
            case 62:
               var10000 = 56;
               break;
            case 63:
               var10000 = 112;
               break;
            case 64:
               var10000 = 186;
               break;
            case 65:
               var10000 = 227;
               break;
            case 66:
               var10000 = 159;
               break;
            case 67:
               var10000 = 191;
               break;
            case 68:
               var10000 = 192;
               break;
            case 69:
               var10000 = 65;
               break;
            case 70:
               var10000 = 166;
               break;
            case 71:
               var10000 = 162;
               break;
            case 72:
               var10000 = 10;
               break;
            case 73:
               var10000 = 24;
               break;
            case 74:
               var10000 = 244;
               break;
            case 75:
               var10000 = 1;
               break;
            case 76:
               var10000 = 53;
               break;
            case 77:
               var10000 = 90;
               break;
            case 78:
               var10000 = 42;
               break;
            case 79:
               var10000 = 245;
               break;
            case 80:
               var10000 = 34;
               break;
            case 81:
               var10000 = 82;
               break;
            case 82:
               var10000 = 240;
               break;
            case 83:
               var10000 = 85;
               break;
            case 84:
               var10000 = 118;
               break;
            case 85:
               var10000 = 115;
               break;
            case 86:
               var10000 = 78;
               break;
            case 87:
               var10000 = 60;
               break;
            case 88:
               var10000 = 151;
               break;
            case 89:
               var10000 = 99;
               break;
            case 90:
               var10000 = 32;
               break;
            case 91:
               var10000 = 12;
               break;
            case 92:
               var10000 = 235;
               break;
            case 93:
               var10000 = 160;
               break;
            case 94:
               var10000 = 243;
               break;
            case 95:
               var10000 = 66;
               break;
            case 96:
               var10000 = 177;
               break;
            case 97:
               var10000 = 196;
               break;
            case 98:
               var10000 = 125;
               break;
            case 99:
               var10000 = 77;
               break;
            case 100:
               var10000 = 97;
               break;
            case 101:
               var10000 = 59;
               break;
            case 102:
               var10000 = 187;
               break;
            case 103:
               var10000 = 48;
               break;
            case 104:
               var10000 = 184;
               break;
            case 105:
               var10000 = 39;
               break;
            case 106:
               var10000 = 89;
               break;
            case 107:
               var10000 = 255;
               break;
            case 108:
               var10000 = 183;
               break;
            case 109:
               var10000 = 154;
               break;
            case 110:
               var10000 = 91;
               break;
            case 111:
               var10000 = 37;
               break;
            case 112:
               var10000 = 6;
               break;
            case 113:
               var10000 = 124;
               break;
            case 114:
               var10000 = 122;
               break;
            case 115:
               var10000 = 128;
               break;
            case 116:
               var10000 = 93;
               break;
            case 117:
               var10000 = 131;
               break;
            case 118:
               var10000 = 46;
               break;
            case 119:
               var10000 = 33;
               break;
            case 120:
               var10000 = 229;
               break;
            case 121:
               var10000 = 3;
               break;
            case 122:
               var10000 = 106;
               break;
            case 123:
               var10000 = 134;
               break;
            case 124:
               var10000 = 30;
               break;
            case 125:
               var10000 = 247;
               break;
            case 126:
               var10000 = 84;
               break;
            case 127:
               var10000 = 127;
               break;
            case 128:
               var10000 = 86;
               break;
            case 129:
               var10000 = 161;
               break;
            case 130:
               var10000 = 54;
               break;
            case 131:
               var10000 = 52;
               break;
            case 132:
               var10000 = 236;
               break;
            case 133:
               var10000 = 167;
               break;
            case 134:
               var10000 = 105;
               break;
            case 135:
               var10000 = 102;
               break;
            case 136:
               var10000 = 73;
               break;
            case 137:
               var10000 = 95;
               break;
            case 138:
               var10000 = 202;
               break;
            case 139:
               var10000 = 199;
               break;
            case 140:
               var10000 = 21;
               break;
            case 141:
               var10000 = 27;
               break;
            case 142:
               var10000 = 63;
               break;
            case 143:
               var10000 = 141;
               break;
            case 144:
               var10000 = 137;
               break;
            case 145:
               var10000 = 38;
               break;
            case 146:
               var10000 = 80;
               break;
            case 147:
               var10000 = 116;
               break;
            case 148:
               var10000 = 155;
               break;
            case 149:
               var10000 = 142;
               break;
            case 150:
               var10000 = 104;
               break;
            case 151:
               var10000 = 204;
               break;
            case 152:
               var10000 = 36;
               break;
            case 153:
               var10000 = 238;
               break;
            case 154:
               var10000 = 182;
               break;
            case 155:
               var10000 = 111;
               break;
            case 156:
               var10000 = 29;
               break;
            case 157:
               var10000 = 140;
               break;
            case 158:
               var10000 = 110;
               break;
            case 159:
               var10000 = 71;
               break;
            case 160:
               var10000 = 239;
               break;
            case 161:
               var10000 = 148;
               break;
            case 162:
               var10000 = 207;
               break;
            case 163:
               var10000 = 120;
               break;
            case 164:
               var10000 = 132;
               break;
            case 165:
               var10000 = 179;
               break;
            case 166:
               var10000 = 251;
               break;
            case 167:
               var10000 = 185;
               break;
            case 168:
               var10000 = 23;
               break;
            case 169:
               var10000 = 9;
               break;
            case 170:
               var10000 = 109;
               break;
            case 171:
               var10000 = 108;
               break;
            case 172:
               var10000 = 83;
               break;
            case 173:
               var10000 = 209;
               break;
            case 174:
               var10000 = 70;
               break;
            case 175:
               var10000 = 136;
               break;
            case 176:
               var10000 = 138;
               break;
            case 177:
               var10000 = 190;
               break;
            case 178:
               var10000 = 237;
               break;
            case 179:
               var10000 = 165;
               break;
            case 180:
               var10000 = 35;
               break;
            case 181:
               var10000 = 96;
               break;
            case 182:
               var10000 = 117;
               break;
            case 183:
               var10000 = 114;
               break;
            case 184:
               var10000 = 31;
               break;
            case 185:
               var10000 = 171;
               break;
            case 186:
               var10000 = 18;
               break;
            case 187:
               var10000 = 214;
               break;
            case 188:
               var10000 = 208;
               break;
            case 189:
               var10000 = 123;
               break;
            case 190:
               var10000 = 101;
               break;
            case 191:
               var10000 = 19;
               break;
            case 192:
               var10000 = 40;
               break;
            case 193:
               var10000 = 224;
               break;
            case 194:
               var10000 = 200;
               break;
            case 195:
               var10000 = 203;
               break;
            case 196:
               var10000 = 133;
               break;
            case 197:
               var10000 = 57;
               break;
            case 198:
               var10000 = 249;
               break;
            case 199:
               var10000 = 174;
               break;
            case 200:
               var10000 = 75;
               break;
            case 201:
               var10000 = 152;
               break;
            case 202:
               var10000 = 55;
               break;
            case 203:
               var10000 = 50;
               break;
            case 204:
               var10000 = 241;
               break;
            case 205:
               var10000 = 193;
               break;
            case 206:
               var10000 = 64;
               break;
            case 207:
               var10000 = 226;
               break;
            case 208:
               var10000 = 26;
               break;
            case 209:
               var10000 = 173;
               break;
            case 210:
               var10000 = 81;
               break;
            case 211:
               var10000 = 153;
               break;
            case 212:
               var10000 = 28;
               break;
            case 213:
               var10000 = 233;
               break;
            case 214:
               var10000 = 180;
               break;
            case 215:
               var10000 = 100;
               break;
            case 216:
               var10000 = 143;
               break;
            case 217:
               var10000 = 94;
               break;
            case 218:
               var10000 = 253;
               break;
            case 219:
               var10000 = 188;
               break;
            case 220:
               var10000 = 211;
               break;
            case 221:
               var10000 = 181;
               break;
            case 222:
               var10000 = 213;
               break;
            case 223:
               var10000 = 246;
               break;
            case 224:
               var10000 = 44;
               break;
            case 225:
               var10000 = 145;
               break;
            case 226:
               var10000 = 146;
               break;
            case 227:
               var10000 = 163;
               break;
            case 228:
               var10000 = 248;
               break;
            case 229:
               var10000 = 205;
               break;
            case 230:
               var10000 = 88;
               break;
            case 231:
               var10000 = 107;
               break;
            case 232:
               var10000 = 51;
               break;
            case 233:
               var10000 = 150;
               break;
            case 234:
               var10000 = 201;
               break;
            case 235:
               var10000 = 15;
               break;
            case 236:
               var10000 = 41;
               break;
            case 237:
               var10000 = 22;
               break;
            case 238:
               var10000 = 222;
               break;
            case 239:
               var10000 = 139;
               break;
            case 240:
               var10000 = 157;
               break;
            case 241:
               var10000 = 234;
               break;
            case 242:
               var10000 = 11;
               break;
            case 243:
               var10000 = 149;
               break;
            case 244:
               var10000 = 76;
               break;
            case 245:
               var10000 = 74;
               break;
            case 246:
               var10000 = 8;
               break;
            case 247:
               var10000 = 178;
               break;
            case 248:
               var10000 = 0;
               break;
            case 249:
               var10000 = 175;
               break;
            case 250:
               var10000 = 43;
               break;
            case 251:
               var10000 = 49;
               break;
            case 252:
               var10000 = 47;
               break;
            case 253:
               var10000 = 45;
               break;
            case 254:
               var10000 = 135;
               break;
            default:
               var10000 = 250;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30244;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }
}





