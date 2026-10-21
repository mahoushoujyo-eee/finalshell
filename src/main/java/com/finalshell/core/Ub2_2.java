package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.Type;
import java.util.Map;

public class Ub2_2 extends UT_2 {
   public X4 I;
   public boolean z;
   public static String[] c;
   public static String[] d;
   public static long e;

   public Ub2_2(IG var1, java.lang.Class var2, Ph2 var3) {
   super(var2, var3);
      E6 var10;
      Ky4[] var10000 = ZS.p();
      Ky4[] var4 = var10000;
      this.z = false;
      E6 var5 = var3.Z();

      label46: {
         try {
            var10 = var5;
            if (var4 != null) {
               break label46;
            }

            if (var5 == null) {
               return;
            }
         } catch (Hi2 var9) {
      java.lang.Class var10001;
      java.lang.Class var10001;
      java.lang.Class var10001;
            throw a(var9);
         }

         var10 = var5;
      }

      java.lang.Class var6 = var10.K();

      boolean var12;
      label37: {
         label36: {
            label35: {
               try {
                  var11 = this;
                  var10001 = var6;
                  if (var4 != null) {
                     break label35;
                  }

                  if (var6 == null) {
                     break label36;
                  }
               } catch (Hi2 var8) {
                  throw a(var8);
               }

               var10001 = var6;
            }

            try {
               if (var10001 != Void.class) {
                  var12 = true;
                  break label37;
               }
            } catch (Hi2 var7) {
               throw a(var7);
            }
         }

         var12 = false;
      }

      var11.z = var12;
   }

   public X4 k(IG param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Ub2_2.I Lcom/finalshell/core/X4;
      // 08: aload 2
      // 09: ifnonnull 9b
      // 0c: ifnonnull 97
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 1a: invokevirtual com/finalshell/core/Ph2.Z ()Lcom/finalshell/core/E6;
      // 1d: astore 3
      // 1e: aload 3
      // 1f: aload 2
      // 20: ifnonnull 2e
      // 23: ifnull 7a
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 3
      // 2e: invokeinterface com/finalshell/core/E6.K ()Ljava/lang/Class; 1
      // 33: aload 2
      // 34: ifnonnull 50
      // 37: ldc java/lang/Void
      // 39: if_acmpeq 7a
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 3
      // 44: invokeinterface com/finalshell/core/E6.K ()Ljava/lang/Class; 1
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: astore 4
      // 52: aload 0
      // 53: aload 4
      // 55: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 58: checkcast com/finalshell/core/X4
      // 5b: putfield com/finalshell/core/Ub2_2.I Lcom/finalshell/core/X4;
      // 5e: goto 76
      // 61: astore 5
      // 63: new com/finalshell/core/Hi2
      // 66: dup
      // 67: sipush -16838
      // 6a: sipush -9987
      // 6d: invokestatic com/finalshell/core/Ub2_2.b (II)Ljava/lang/String;
      // 70: aload 5
      // 72: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 75: athrow
      // 76: aload 2
      // 77: ifnull 97
      // 7a: aload 0
      // 7b: aload 1
      // 7c: aload 0
      // 7d: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 80: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 83: aload 0
      // 84: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 87: getfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 8a: invokevirtual com/finalshell/core/IG.p (Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 8d: putfield com/finalshell/core/Ub2_2.I Lcom/finalshell/core/X4;
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 96: athrow
      // 97: aload 0
      // 98: getfield com/finalshell/core/Ub2_2.I Lcom/finalshell/core/X4;
      // 9b: areturn
   }

   @Override
   public void y(Yn4 param1, Object param2, Type param3, Map param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 5
      // 005: aload 0
      // 006: getfield com/finalshell/core/Ub2_2.I Lcom/finalshell/core/X4;
      // 009: aload 5
      // 00b: ifnonnull 02c
      // 00e: ifnonnull 028
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 0
      // 019: aload 1
      // 01a: invokevirtual com/finalshell/core/Yn4.L ()Lcom/finalshell/core/IG;
      // 01d: invokevirtual com/finalshell/core/Ub2_2.k (Lcom/finalshell/core/IG;)Lcom/finalshell/core/X4;
      // 020: pop
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: aload 0
      // 029: getfield com/finalshell/core/Ub2_2.I Lcom/finalshell/core/X4;
      // 02c: astore 6
      // 02e: aload 0
      // 02f: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 032: getfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 035: astore 7
      // 037: aload 3
      // 038: instanceof java/lang/reflect/ParameterizedType
      // 03b: aload 5
      // 03d: ifnonnull 0b0
      // 040: ifeq 0ab
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: aload 1
      // 04b: invokevirtual com/finalshell/core/Yn4.A$xM_3 ()Lcom/finalshell/core/XM3;
      // 04e: astore 8
      // 050: aload 8
      // 052: aload 5
      // 054: ifnonnull 063
      // 057: ifnull 067
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: aload 8
      // 063: aload 3
      // 064: putfield com/finalshell/core/XM3.F Ljava/lang/reflect/Type;
      // 067: aload 7
      // 069: aload 5
      // 06b: ifnonnull 08a
      // 06e: aload 3
      // 06f: if_acmpeq 0ab
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield com/finalshell/core/Ub2_2.w Ljava/lang/Class;
      // 07d: aload 3
      // 07e: aload 7
      // 080: invokestatic com/finalshell/core/Ph2.O (Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: astore 7
      // 08c: aload 6
      // 08e: instanceof com/finalshell/core/TH_2
      // 091: aload 5
      // 093: ifnonnull 0b0
      // 096: ifeq 0ab
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: aload 1
      // 0a1: invokevirtual com/finalshell/core/Yn4.L ()Lcom/finalshell/core/IG;
      // 0a4: aload 7
      // 0a6: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 0a9: astore 6
      // 0ab: aload 6
      // 0ad: instanceof com/finalshell/core/Ep4
      // 0b0: aload 5
      // 0b2: ifnonnull 0d9
      // 0b5: ifeq 100
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 0c3: aload 5
      // 0c5: ifnonnull 10b
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: getfield com/finalshell/core/Ph2.h I
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: ifeq 100
      // 0dc: aload 6
      // 0de: checkcast com/finalshell/core/Ep4
      // 0e1: astore 9
      // 0e3: aload 9
      // 0e5: aload 1
      // 0e6: aload 7
      // 0e8: aload 0
      // 0e9: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 0ec: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 0ef: aload 0
      // 0f0: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 0f3: getfield com/finalshell/core/Ph2.h I
      // 0f6: invokevirtual com/finalshell/core/Ep4.m (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;
      // 0f9: astore 8
      // 0fb: aload 5
      // 0fd: ifnull 196
      // 100: aload 0
      // 101: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: aload 5
      // 10d: ifnonnull 128
      // 110: getfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 113: ifnonnull 13a
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 5
      // 12a: ifnonnull 194
      // 12d: getfield com/finalshell/core/Ph2.h I
      // 130: ifeq 17c
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 139: athrow
      // 13a: aload 6
      // 13c: aload 5
      // 13e: ifnonnull 194
      // 141: goto 148
      // 144: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: instanceof com/finalshell/core/ZS
      // 14b: ifeq 17c
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: aload 6
      // 157: checkcast com/finalshell/core/ZS
      // 15a: aload 1
      // 15b: aload 7
      // 15d: aload 0
      // 15e: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 161: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 164: aload 0
      // 165: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 168: getfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 16b: aload 0
      // 16c: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 16f: getfield com/finalshell/core/Ph2.h I
      // 172: invokevirtual com/finalshell/core/ZS.p (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;
      // 175: astore 8
      // 177: aload 5
      // 179: ifnull 196
      // 17c: aload 6
      // 17e: aload 1
      // 17f: aload 7
      // 181: aload 0
      // 182: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 185: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 188: invokeinterface com/finalshell/core/X4.z (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 18d: goto 194
      // 190: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: astore 8
      // 196: aload 8
      // 198: instanceof [B
      // 19b: aload 5
      // 19d: ifnonnull 29a
      // 1a0: ifeq 28a
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: sipush -16839
      // 1ad: sipush 27956
      // 1b0: invokestatic com/finalshell/core/Ub2_2.b (II)Ljava/lang/String;
      // 1b3: aload 5
      // 1b5: ifnonnull 1fe
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 1c3: getfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 1c6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c9: ifne 1fc
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: sipush -16837
      // 1d6: sipush -19776
      // 1d9: invokestatic com/finalshell/core/Ub2_2.b (II)Ljava/lang/String;
      // 1dc: aload 0
      // 1dd: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 1e0: getfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 1e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e6: aload 5
      // 1e8: ifnonnull 29a
      // 1eb: goto 1f2
      // 1ee: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f1: athrow
      // 1f2: ifeq 28a
      // 1f5: goto 1fc
      // 1f8: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fb: athrow
      // 1fc: aload 8
      // 1fe: checkcast [B
      // 201: astore 9
      // 203: aconst_null
      // 204: astore 10
      // 206: new java/util/zip/GZIPInputStream
      // 209: dup
      // 20a: new java/io/ByteArrayInputStream
      // 20d: dup
      // 20e: aload 9
      // 210: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 213: invokespecial java/util/zip/GZIPInputStream.<init> (Ljava/io/InputStream;)V
      // 216: astore 10
      // 218: new java/io/ByteArrayOutputStream
      // 21b: dup
      // 21c: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 21f: astore 11
      // 221: getstatic com/finalshell/core/Ub2_2.e J
      // 224: l2i
      // 225: newarray 8
      // 227: astore 12
      // 229: aload 10
      // 22b: aload 12
      // 22d: invokevirtual java/util/zip/GZIPInputStream.read ([B)I
      // 230: istore 13
      // 232: iload 13
      // 234: bipush -1
      // 235: if_icmpne 249
      // 238: aload 5
      // 23a: ifnonnull 266
      // 23d: aload 5
      // 23f: ifnull 26b
      // 242: goto 249
      // 245: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 248: athrow
      // 249: iload 13
      // 24b: ifle 266
      // 24e: goto 255
      // 251: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 254: athrow
      // 255: aload 11
      // 257: aload 12
      // 259: bipush 0
      // 25a: iload 13
      // 25c: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 25f: goto 266
      // 262: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: aload 5
      // 268: ifnull 221
      // 26b: aload 11
      // 26d: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 270: astore 8
      // 272: goto 28a
      // 275: astore 11
      // 277: new com/finalshell/core/Hi2
      // 27a: dup
      // 27b: sipush -16840
      // 27e: sipush 3828
      // 281: invokestatic com/finalshell/core/Ub2_2.b (II)Ljava/lang/String;
      // 284: aload 11
      // 286: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 289: athrow
      // 28a: aload 1
      // 28b: aload 5
      // 28d: ifnonnull 2c5
      // 290: invokevirtual com/finalshell/core/Yn4.O ()I
      // 293: goto 29a
      // 296: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 299: athrow
      // 29a: bipush 1
      // 29b: if_icmpne 2bd
      // 29e: aload 1
      // 29f: invokevirtual com/finalshell/core/Yn4.C ()Lcom/finalshell/core/N_2_2;
      // 2a2: astore 9
      // 2a4: aload 9
      // 2a6: aload 0
      // 2a7: putfield com/finalshell/core/N_2_2.i Lcom/finalshell/core/UT_2;
      // 2aa: aload 9
      // 2ac: aload 1
      // 2ad: invokevirtual com/finalshell/core/Yn4.A$xM_3 ()Lcom/finalshell/core/XM3;
      // 2b0: putfield com/finalshell/core/N_2_2.m Lcom/finalshell/core/XM3;
      // 2b3: aload 1
      // 2b4: bipush 0
      // 2b5: invokevirtual com/finalshell/core/Yn4.l (I)V
      // 2b8: aload 5
      // 2ba: ifnull 2ff
      // 2bd: aload 2
      // 2be: goto 2c5
      // 2c1: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c4: athrow
      // 2c5: aload 5
      // 2c7: ifnonnull 2eb
      // 2ca: ifnonnull 2f1
      // 2cd: goto 2d4
      // 2d0: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d3: athrow
      // 2d4: aload 4
      // 2d6: aload 0
      // 2d7: getfield com/finalshell/core/Ub2_2.p Lcom/finalshell/core/Ph2;
      // 2da: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 2dd: aload 8
      // 2df: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2e4: goto 2eb
      // 2e7: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ea: athrow
      // 2eb: pop
      // 2ec: aload 5
      // 2ee: ifnull 2ff
      // 2f1: aload 0
      // 2f2: aload 2
      // 2f3: aload 8
      // 2f5: invokevirtual com/finalshell/core/Ub2_2.D (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2f8: goto 2ff
      // 2fb: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fe: athrow
      // 2ff: return
   }

   @Override
   public int f() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Ub2_2.I Lcom/finalshell/core/X4;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 27
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ub2_2.I Lcom/finalshell/core/X4;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Ub2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokeinterface com/finalshell/core/X4.j ()I 1
      // 26: ireturn
      // 27: bipush 2
      // 28: ireturn
   }

   public void O(Yn4 var1, Object var2, Type var3, Map var4) {
      throw new Hi2(b(-16833, 24254));
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -16837) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 202;
               break;
            case 1:
               var10000 = 69;
               break;
            case 2:
               var10000 = 199;
               break;
            case 3:
               var10000 = 49;
               break;
            case 4:
               var10000 = 223;
               break;
            case 5:
               var10000 = 253;
               break;
            case 6:
               var10000 = 250;
               break;
            case 7:
               var10000 = 157;
               break;
            case 8:
               var10000 = 34;
               break;
            case 9:
               var10000 = 216;
               break;
            case 10:
               var10000 = 32;
               break;
            case 11:
               var10000 = 0;
               break;
            case 12:
               var10000 = 123;
               break;
            case 13:
               var10000 = 124;
               break;
            case 14:
               var10000 = 48;
               break;
            case 15:
               var10000 = 39;
               break;
            case 16:
               var10000 = 118;
               break;
            case 17:
               var10000 = 197;
               break;
            case 18:
               var10000 = 19;
               break;
            case 19:
               var10000 = 201;
               break;
            case 20:
               var10000 = 65;
               break;
            case 21:
               var10000 = 142;
               break;
            case 22:
               var10000 = 63;
               break;
            case 23:
               var10000 = 227;
               break;
            case 24:
               var10000 = 86;
               break;
            case 25:
               var10000 = 206;
               break;
            case 26:
               var10000 = 130;
               break;
            case 27:
               var10000 = 176;
               break;
            case 28:
               var10000 = 74;
               break;
            case 29:
               var10000 = 200;
               break;
            case 30:
               var10000 = 213;
               break;
            case 31:
               var10000 = 68;
               break;
            case 32:
               var10000 = 191;
               break;
            case 33:
               var10000 = 252;
               break;
            case 34:
               var10000 = 155;
               break;
            case 35:
               var10000 = 35;
               break;
            case 36:
               var10000 = 173;
               break;
            case 37:
               var10000 = 220;
               break;
            case 38:
               var10000 = 198;
               break;
            case 39:
               var10000 = 128;
               break;
            case 40:
               var10000 = 255;
               break;
            case 41:
               var10000 = 239;
               break;
            case 42:
               var10000 = 134;
               break;
            case 43:
               var10000 = 245;
               break;
            case 44:
               var10000 = 31;
               break;
            case 45:
               var10000 = 58;
               break;
            case 46:
               var10000 = 9;
               break;
            case 47:
               var10000 = 21;
               break;
            case 48:
               var10000 = 87;
               break;
            case 49:
               var10000 = 244;
               break;
            case 50:
               var10000 = 41;
               break;
            case 51:
               var10000 = 66;
               break;
            case 52:
               var10000 = 172;
               break;
            case 53:
               var10000 = 205;
               break;
            case 54:
               var10000 = 228;
               break;
            case 55:
               var10000 = 85;
               break;
            case 56:
               var10000 = 126;
               break;
            case 57:
               var10000 = 247;
               break;
            case 58:
               var10000 = 12;
               break;
            case 59:
               var10000 = 3;
               break;
            case 60:
               var10000 = 37;
               break;
            case 61:
               var10000 = 80;
               break;
            case 62:
               var10000 = 96;
               break;
            case 63:
               var10000 = 95;
               break;
            case 64:
               var10000 = 241;
               break;
            case 65:
               var10000 = 82;
               break;
            case 66:
               var10000 = 222;
               break;
            case 67:
               var10000 = 57;
               break;
            case 68:
               var10000 = 188;
               break;
            case 69:
               var10000 = 180;
               break;
            case 70:
               var10000 = 229;
               break;
            case 71:
               var10000 = 224;
               break;
            case 72:
               var10000 = 7;
               break;
            case 73:
               var10000 = 218;
               break;
            case 74:
               var10000 = 219;
               break;
            case 75:
               var10000 = 14;
               break;
            case 76:
               var10000 = 204;
               break;
            case 77:
               var10000 = 167;
               break;
            case 78:
               var10000 = 181;
               break;
            case 79:
               var10000 = 111;
               break;
            case 80:
               var10000 = 119;
               break;
            case 81:
               var10000 = 139;
               break;
            case 82:
               var10000 = 203;
               break;
            case 83:
               var10000 = 2;
               break;
            case 84:
               var10000 = 150;
               break;
            case 85:
               var10000 = 78;
               break;
            case 86:
               var10000 = 114;
               break;
            case 87:
               var10000 = 159;
               break;
            case 88:
               var10000 = 120;
               break;
            case 89:
               var10000 = 20;
               break;
            case 90:
               var10000 = 174;
               break;
            case 91:
               var10000 = 81;
               break;
            case 92:
               var10000 = 182;
               break;
            case 93:
               var10000 = 107;
               break;
            case 94:
               var10000 = 1;
               break;
            case 95:
               var10000 = 106;
               break;
            case 96:
               var10000 = 214;
               break;
            case 97:
               var10000 = 59;
               break;
            case 98:
               var10000 = 47;
               break;
            case 99:
               var10000 = 27;
               break;
            case 100:
               var10000 = 92;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 221;
               break;
            case 103:
               var10000 = 54;
               break;
            case 104:
               var10000 = 56;
               break;
            case 105:
               var10000 = 235;
               break;
            case 106:
               var10000 = 116;
               break;
            case 107:
               var10000 = 178;
               break;
            case 108:
               var10000 = 156;
               break;
            case 109:
               var10000 = 101;
               break;
            case 110:
               var10000 = 110;
               break;
            case 111:
               var10000 = 231;
               break;
            case 112:
               var10000 = 154;
               break;
            case 113:
               var10000 = 108;
               break;
            case 114:
               var10000 = 215;
               break;
            case 115:
               var10000 = 208;
               break;
            case 116:
               var10000 = 79;
               break;
            case 117:
               var10000 = 212;
               break;
            case 118:
               var10000 = 254;
               break;
            case 119:
               var10000 = 183;
               break;
            case 120:
               var10000 = 112;
               break;
            case 121:
               var10000 = 189;
               break;
            case 122:
               var10000 = 148;
               break;
            case 123:
               var10000 = 246;
               break;
            case 124:
               var10000 = 226;
               break;
            case 125:
               var10000 = 242;
               break;
            case 126:
               var10000 = 129;
               break;
            case 127:
               var10000 = 76;
               break;
            case 128:
               var10000 = 6;
               break;
            case 129:
               var10000 = 233;
               break;
            case 130:
               var10000 = 53;
               break;
            case 131:
               var10000 = 51;
               break;
            case 132:
               var10000 = 236;
               break;
            case 133:
               var10000 = 77;
               break;
            case 134:
               var10000 = 171;
               break;
            case 135:
               var10000 = 169;
               break;
            case 136:
               var10000 = 179;
               break;
            case 137:
               var10000 = 40;
               break;
            case 138:
               var10000 = 145;
               break;
            case 139:
               var10000 = 89;
               break;
            case 140:
               var10000 = 104;
               break;
            case 141:
               var10000 = 163;
               break;
            case 142:
               var10000 = 30;
               break;
            case 143:
               var10000 = 24;
               break;
            case 144:
               var10000 = 88;
               break;
            case 145:
               var10000 = 75;
               break;
            case 146:
               var10000 = 50;
               break;
            case 147:
               var10000 = 165;
               break;
            case 148:
               var10000 = 232;
               break;
            case 149:
               var10000 = 249;
               break;
            case 150:
               var10000 = 185;
               break;
            case 151:
               var10000 = 240;
               break;
            case 152:
               var10000 = 164;
               break;
            case 153:
               var10000 = 67;
               break;
            case 154:
               var10000 = 161;
               break;
            case 155:
               var10000 = 251;
               break;
            case 156:
               var10000 = 153;
               break;
            case 157:
               var10000 = 131;
               break;
            case 158:
               var10000 = 11;
               break;
            case 159:
               var10000 = 186;
               break;
            case 160:
               var10000 = 83;
               break;
            case 161:
               var10000 = 97;
               break;
            case 162:
               var10000 = 60;
               break;
            case 163:
               var10000 = 103;
               break;
            case 164:
               var10000 = 237;
               break;
            case 165:
               var10000 = 194;
               break;
            case 166:
               var10000 = 33;
               break;
            case 167:
               var10000 = 44;
               break;
            case 168:
               var10000 = 42;
               break;
            case 169:
               var10000 = 5;
               break;
            case 170:
               var10000 = 234;
               break;
            case 171:
               var10000 = 166;
               break;
            case 172:
               var10000 = 99;
               break;
            case 173:
               var10000 = 160;
               break;
            case 174:
               var10000 = 122;
               break;
            case 175:
               var10000 = 15;
               break;
            case 176:
               var10000 = 29;
               break;
            case 177:
               var10000 = 187;
               break;
            case 178:
               var10000 = 28;
               break;
            case 179:
               var10000 = 91;
               break;
            case 180:
               var10000 = 90;
               break;
            case 181:
               var10000 = 17;
               break;
            case 182:
               var10000 = 143;
               break;
            case 183:
               var10000 = 127;
               break;
            case 184:
               var10000 = 18;
               break;
            case 185:
               var10000 = 117;
               break;
            case 186:
               var10000 = 98;
               break;
            case 187:
               var10000 = 211;
               break;
            case 188:
               var10000 = 175;
               break;
            case 189:
               var10000 = 105;
               break;
            case 190:
               var10000 = 113;
               break;
            case 191:
               var10000 = 10;
               break;
            case 192:
               var10000 = 26;
               break;
            case 193:
               var10000 = 141;
               break;
            case 194:
               var10000 = 147;
               break;
            case 195:
               var10000 = 243;
               break;
            case 196:
               var10000 = 4;
               break;
            case 197:
               var10000 = 144;
               break;
            case 198:
               var10000 = 8;
               break;
            case 199:
               var10000 = 16;
               break;
            case 200:
               var10000 = 217;
               break;
            case 201:
               var10000 = 133;
               break;
            case 202:
               var10000 = 38;
               break;
            case 203:
               var10000 = 94;
               break;
            case 204:
               var10000 = 100;
               break;
            case 205:
               var10000 = 115;
               break;
            case 206:
               var10000 = 190;
               break;
            case 207:
               var10000 = 162;
               break;
            case 208:
               var10000 = 140;
               break;
            case 209:
               var10000 = 209;
               break;
            case 210:
               var10000 = 230;
               break;
            case 211:
               var10000 = 192;
               break;
            case 212:
               var10000 = 125;
               break;
            case 213:
               var10000 = 109;
               break;
            case 214:
               var10000 = 46;
               break;
            case 215:
               var10000 = 149;
               break;
            case 216:
               var10000 = 137;
               break;
            case 217:
               var10000 = 62;
               break;
            case 218:
               var10000 = 152;
               break;
            case 219:
               var10000 = 52;
               break;
            case 220:
               var10000 = 151;
               break;
            case 221:
               var10000 = 22;
               break;
            case 222:
               var10000 = 238;
               break;
            case 223:
               var10000 = 168;
               break;
            case 224:
               var10000 = 93;
               break;
            case 225:
               var10000 = 45;
               break;
            case 226:
               var10000 = 102;
               break;
            case 227:
               var10000 = 146;
               break;
            case 228:
               var10000 = 71;
               break;
            case 229:
               var10000 = 72;
               break;
            case 230:
               var10000 = 132;
               break;
            case 231:
               var10000 = 25;
               break;
            case 232:
               var10000 = 196;
               break;
            case 233:
               var10000 = 177;
               break;
            case 234:
               var10000 = 193;
               break;
            case 235:
               var10000 = 36;
               break;
            case 236:
               var10000 = 136;
               break;
            case 237:
               var10000 = 195;
               break;
            case 238:
               var10000 = 70;
               break;
            case 239:
               var10000 = 184;
               break;
            case 240:
               var10000 = 170;
               break;
            case 241:
               var10000 = 225;
               break;
            case 242:
               var10000 = 248;
               break;
            case 243:
               var10000 = 43;
               break;
            case 244:
               var10000 = 73;
               break;
            case 245:
               var10000 = 84;
               break;
            case 246:
               var10000 = 135;
               break;
            case 247:
               var10000 = 121;
               break;
            case 248:
               var10000 = 23;
               break;
            case 249:
               var10000 = 138;
               break;
            case 250:
               var10000 = 158;
               break;
            case 251:
               var10000 = 55;
               break;
            case 252:
               var10000 = 64;
               break;
            case 253:
               var10000 = 210;
               break;
            case 254:
               var10000 = 61;
               break;
            default:
               var10000 = 13;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "6\u001f\u001a\r\u009b\u0081\u0083þÄÊÎ0³¹\"ÁI,Ë»¤Ò\u0093\u0085îÕf\u0002iÊýß\u0011\u001b\u009dÞÜ-kÖºû\"KKù>\f\u0006\u0097OÙôDäMô¹}E\u0004s\u0013²\u008c";
      int var6 = "6\u001f\u001a\r\u009b\u0081\u0083þÄÊÎ0³¹\"ÁI,Ë»¤Ò\u0093\u0085îÕf\u0002iÊýß\u0011\u001b\u009dÞÜ-kÖºû\"KKù>\f\u0006\u0097OÙôDäMô¹}E\u0004s\u0013²\u008c"
         .length();
      char var3 = 11;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 44;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 61;
                        break;
                     case 1:
                        var50 = 123;
                        break;
                     case 2:
                        var50 = 48;
                        break;
                     case 3:
                        var50 = 109;
                        break;
                     case 4:
                        var50 = 31;
                        break;
                     case 5:
                        var50 = 56;
                        break;
                     default:
                        var50 = 114;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     c = var7;
                     d = new String[5];
                     long var0 = 829322512580329991L;
                     long var27 = 5935226891590288903L ^ var0;
                     byte var18 = -1;
                     e = var27;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "}Ê\\T\u0012¾\nuëÏ3ÌN\u009b\u008dÐ\u00adq\u0004-Ðm4";
                  var6 = "}Ê\\T\u0012¾\nuëÏ3ÌN\u009b\u008dÐ\u00adq\u0004-Ðm4".length();
                  var3 = 18;
                  var10 = -1;
            }

            var10000 = 76;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





