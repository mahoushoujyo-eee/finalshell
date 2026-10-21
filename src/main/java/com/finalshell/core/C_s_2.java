package com.finalshell.core;

public class C_s_2 extends C_L {
   public final J_5 OU;
   @C_9
   public final J_5 OQ;
   public static boolean OT;
   public final W3_6 O6;
   public static String[] cb;
   public static String[] db;
   public static long[] eb;
   public static Integer[] fb;

   public C_s_2(W3_6 var1, @C_9 J_5 var2, J_5 var3, C_L var4) {
      super(var4);
      this.O6 = var1;
      this.OU = var2;
      this.OQ = var3;
      super.L();
   }

   @C_9
   @Override
   public Hd2 x(String param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: invokestatic com/finalshell/core/W3_6.t ()Ljava/util/logging/Logger;
      // 006: aconst_null
      // 007: sipush 17261
      // 00a: sipush -12326
      // 00d: invokestatic com/finalshell/core/C_s_2.b (II)Ljava/lang/String;
      // 010: aload 1
      // 011: invokevirtual java/util/logging/Logger.entering (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
      // 014: astore 2
      // 015: aload 1
      // 016: invokestatic com/finalshell/core/F0_2.F (Ljava/lang/String;)Ljava/lang/String;
      // 019: astore 3
      // 01a: invokestatic com/finalshell/core/W3_6.t ()Ljava/util/logging/Logger;
      // 01d: getstatic java/util/logging/Level.FINE Ljava/util/logging/Level;
      // 020: sipush 17256
      // 023: sipush -25217
      // 026: invokestatic com/finalshell/core/C_s_2.b (II)Ljava/lang/String;
      // 029: aload 3
      // 02a: invokevirtual java/util/logging/Logger.log (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
      // 02d: aload 3
      // 02e: sipush 17258
      // 031: sipush -21170
      // 034: invokestatic com/finalshell/core/C_s_2.b (II)Ljava/lang/String;
      // 037: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 03a: aload 2
      // 03b: ifnull 06a
      // 03e: ifeq 04e
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aconst_null
      // 049: areturn
      // 04a: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: aload 3
      // 04f: sipush 25668
      // 052: ldc2_w 8308444574867474831
      // 055: invokestatic com/finalshell/core/C_s_2.a (IJ)I
      // 058: aload 3
      // 059: sipush 12016
      // 05c: ldc2_w 597401944659886905
      // 05f: invokestatic com/finalshell/core/C_s_2.a (IJ)I
      // 062: invokevirtual java/lang/String.lastIndexOf (I)I
      // 065: bipush 2
      // 066: iadd
      // 067: invokevirtual java/lang/String.indexOf (II)I
      // 06a: istore 4
      // 06c: iload 4
      // 06e: bipush -1
      // 06f: if_icmpne 07e
      // 072: aload 3
      // 073: aload 2
      // 074: ifnull 07f
      // 077: goto 085
      // 07a: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: aload 3
      // 07f: bipush 0
      // 080: iload 4
      // 082: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 085: astore 5
      // 087: bipush 0
      // 088: istore 6
      // 08a: iload 6
      // 08c: aload 0
      // 08d: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // 090: invokestatic com/finalshell/core/W3_6.o (Lcom/finalshell/core/W3_6;)Ljava/util/List;
      // 093: invokeinterface java/util/List.size ()I 1
      // 098: if_icmpge 110
      // 09b: aload 0
      // 09c: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // 09f: invokestatic com/finalshell/core/W3_6.o (Lcom/finalshell/core/W3_6;)Ljava/util/List;
      // 0a2: iload 6
      // 0a4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0a9: checkcast com/finalshell/core/H3_2
      // 0ac: astore 7
      // 0ae: aload 7
      // 0b0: aload 5
      // 0b2: invokevirtual com/finalshell/core/H3_2.u (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 0b5: astore 8
      // 0b7: aload 2
      // 0b8: ifnull 13b
      // 0bb: aload 2
      // 0bc: ifnull 10c
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 8
      // 0c8: ifnull 109
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: aload 3
      // 0d3: aload 5
      // 0d5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d8: ifne 100
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: aload 7
      // 0e4: aload 3
      // 0e5: invokevirtual com/finalshell/core/H3_2.u (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 0e8: astore 8
      // 0ea: aload 8
      // 0ec: aload 2
      // 0ed: ifnull 108
      // 0f0: ifnonnull 100
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: aconst_null
      // 0fb: areturn
      // 0fc: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: aload 0
      // 101: aload 8
      // 103: invokevirtual com/finalshell/core/C_s_2.l (Lcom/finalshell/core/Hd2;)V
      // 106: aload 8
      // 108: areturn
      // 109: iinc 6 1
      // 10c: aload 2
      // 10d: ifnonnull 08a
      // 110: iload 4
      // 112: aload 2
      // 113: ifnull 139
      // 116: bipush -1
      // 117: if_icmpne 128
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: goto 13f
      // 124: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 3
      // 129: sipush 8125
      // 12c: ldc2_w 798571123217478263
      // 12f: invokestatic com/finalshell/core/C_s_2.a (IJ)I
      // 132: iload 4
      // 134: bipush 2
      // 135: iadd
      // 136: invokevirtual java/lang/String.indexOf (II)I
      // 139: istore 4
      // 13b: aload 2
      // 13c: ifnonnull 06c
      // 13f: aload 0
      // 140: getfield com/finalshell/core/C_s_2.OU Lcom/finalshell/core/J_5;
      // 143: aload 3
      // 144: invokestatic com/finalshell/core/Cr2_2.R (Ljava/lang/String;)Ljava/lang/String;
      // 147: invokevirtual com/finalshell/core/J_5.J (Ljava/lang/String;)Lcom/finalshell/core/N_6;
      // 14a: astore 4
      // 14c: aload 4
      // 14e: ifnonnull 157
      // 151: aconst_null
      // 152: areturn
      // 153: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: aload 0
      // 158: getfield com/finalshell/core/C_s_2.OQ Lcom/finalshell/core/J_5;
      // 15b: astore 5
      // 15d: aload 5
      // 15f: getstatic com/finalshell/core/K_4.L Lcom/finalshell/core/J_5;
      // 162: if_acmpeq 1a3
      // 165: getstatic com/finalshell/core/C_s_2.OT Z
      // 168: ifne 195
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: aload 5
      // 174: aload 2
      // 175: ifnull 197
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17e: athrow
      // 17f: ifnonnull 195
      // 182: goto 189
      // 185: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: new java/lang/AssertionError
      // 18c: dup
      // 18d: invokespecial java/lang/AssertionError.<init> ()V
      // 190: athrow
      // 191: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: aload 5
      // 197: aload 3
      // 198: invokestatic com/finalshell/core/Cr2_2.A (Ljava/lang/String;)Ljava/lang/String;
      // 19b: invokevirtual com/finalshell/core/J_5.J (Ljava/lang/String;)Lcom/finalshell/core/N_6;
      // 19e: astore 6
      // 1a0: goto 1f6
      // 1a3: aload 4
      // 1a5: instanceof com/finalshell/core/D_2_3
      // 1a8: ifne 1b1
      // 1ab: aconst_null
      // 1ac: areturn
      // 1ad: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: new java/io/File
      // 1b4: dup
      // 1b5: aload 4
      // 1b7: checkcast com/finalshell/core/D_2_3
      // 1ba: invokevirtual com/finalshell/core/D_2_3.U ()Ljava/io/File;
      // 1bd: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 1c0: aload 3
      // 1c1: aload 3
      // 1c2: sipush 27667
      // 1c5: ldc2_w 5076450027857560027
      // 1c8: invokestatic com/finalshell/core/C_s_2.a (IJ)I
      // 1cb: invokevirtual java/lang/String.lastIndexOf (I)I
      // 1ce: bipush 1
      // 1cf: iadd
      // 1d0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1d3: invokestatic com/finalshell/core/Cr2_2.A (Ljava/lang/String;)Ljava/lang/String;
      // 1d6: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 1d9: astore 7
      // 1db: aload 7
      // 1dd: invokevirtual java/io/File.exists ()Z
      // 1e0: ifeq 1f3
      // 1e3: new com/finalshell/core/D_2_3
      // 1e6: dup
      // 1e7: aload 7
      // 1e9: invokespecial com/finalshell/core/D_2_3.<init> (Ljava/io/File;)V
      // 1ec: goto 1f4
      // 1ef: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f2: athrow
      // 1f3: aconst_null
      // 1f4: astore 6
      // 1f6: aload 6
      // 1f8: aload 2
      // 1f9: ifnull 208
      // 1fc: ifnull 223
      // 1ff: goto 206
      // 202: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 205: athrow
      // 206: aload 4
      // 208: invokeinterface com/finalshell/core/N_6.z ()J 1
      // 20d: aload 6
      // 20f: invokeinterface com/finalshell/core/N_6.z ()J 1
      // 214: lcmp
      // 215: ifgt 223
      // 218: aload 0
      // 219: aload 6
      // 21b: invokespecial com/finalshell/core/C_s_2.a (Lcom/finalshell/core/N_6;)Lcom/finalshell/core/Hd2;
      // 21e: areturn
      // 21f: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: aload 0
      // 224: aload 4
      // 226: aload 3
      // 227: invokespecial com/finalshell/core/C_s_2.s (Lcom/finalshell/core/N_6;Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 22a: areturn
   }

   public Hd2 s(N_6 param1, String param2) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // 08: aload 1
      // 09: invokeinterface com/finalshell/core/N_6.o$String ()Ljava/lang/String; 1
      // 0e: new java/io/BufferedInputStream
      // 11: dup
      // 12: aload 1
      // 13: invokeinterface com/finalshell/core/N_6.o$InputStream ()Ljava/io/InputStream; 1
      // 18: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // 1f: getfield com/finalshell/core/W3_6.m Ljava/nio/charset/Charset;
      // 22: invokestatic com/finalshell/core/W3_6.Y (Lcom/finalshell/core/W3_6;Ljava/lang/String;Ljava/io/InputStream;Ljava/nio/charset/Charset;)Lcom/finalshell/core/RB;
      // 25: astore 5
      // 27: new com/finalshell/core/H3_2
      // 2a: dup
      // 2b: aload 5
      // 2d: aload 0
      // 2e: invokespecial com/finalshell/core/H3_2.<init> (Lcom/finalshell/core/RB;Lcom/finalshell/core/C_L;)V
      // 31: aload 0
      // 32: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // 35: invokestatic com/finalshell/core/W3_6.N (Lcom/finalshell/core/W3_6;)Ljava/util/EnumSet;
      // 38: invokevirtual com/finalshell/core/H3_2.F (Ljava/util/EnumSet;)Lcom/finalshell/core/H3_2;
      // 3b: astore 4
      // 3d: goto 96
      // 40: astore 5
      // 42: new java/lang/ClassNotFoundException
      // 45: dup
      // 46: new java/lang/StringBuilder
      // 49: dup
      // 4a: invokespecial java/lang/StringBuilder.<init> ()V
      // 4d: sipush 17263
      // 50: sipush -30529
      // 53: invokestatic com/finalshell/core/C_s_2.b (II)Ljava/lang/String;
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: aload 1
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 5d: ldc "\""
      // 5f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 62: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 65: aload 5
      // 67: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 6a: athrow
      // 6b: astore 5
      // 6d: new java/lang/ClassNotFoundException
      // 70: dup
      // 71: new java/lang/StringBuilder
      // 74: dup
      // 75: invokespecial java/lang/StringBuilder.<init> ()V
      // 78: sipush 17259
      // 7b: sipush -23184
      // 7e: invokestatic com/finalshell/core/C_s_2.b (II)Ljava/lang/String;
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: aload 1
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 88: ldc "\""
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 90: aload 5
      // 92: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 95: athrow
      // 96: aload 0
      // 97: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // 9a: invokestatic com/finalshell/core/W3_6.o (Lcom/finalshell/core/W3_6;)Ljava/util/List;
      // 9d: aload 4
      // 9f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a4: pop
      // a5: aload 4
      // a7: aload 2
      // a8: invokevirtual com/finalshell/core/H3_2.u (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // ab: astore 5
      // ad: aload 5
      // af: aload 3
      // b0: ifnull f9
      // b3: ifnonnull f1
      // b6: goto bd
      // b9: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc: athrow
      // bd: new java/lang/ClassNotFoundException
      // c0: dup
      // c1: new java/lang/StringBuilder
      // c4: dup
      // c5: invokespecial java/lang/StringBuilder.<init> ()V
      // c8: ldc "\""
      // ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cd: aload 1
      // ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // d1: sipush 17260
      // d4: sipush -15490
      // d7: invokestatic com/finalshell/core/C_s_2.b (II)Ljava/lang/String;
      // da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // dd: aload 2
      // de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e1: ldc "\""
      // e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e9: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;)V
      // ec: athrow
      // ed: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f0: athrow
      // f1: aload 0
      // f2: aload 5
      // f4: invokevirtual com/finalshell/core/C_s_2.l (Lcom/finalshell/core/Hd2;)V
      // f7: aload 5
      // f9: areturn
   }

   public Hd2 a(N_6 param1) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // 07: invokestatic com/finalshell/core/W3_6.w (Lcom/finalshell/core/W3_6;)Lcom/finalshell/core/D_6;
      // 0a: new java/lang/StringBuilder
      // 0d: dup
      // 0e: invokespecial java/lang/StringBuilder.<init> ()V
      // 11: sipush 17257
      // 14: sipush -2156
      // 17: invokestatic com/finalshell/core/C_s_2.b (II)Ljava/lang/String;
      // 1a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d: aload 1
      // 1e: invokeinterface com/finalshell/core/N_6.o$String ()Ljava/lang/String; 1
      // 23: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26: ldc "\""
      // 28: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e: invokevirtual com/finalshell/core/D_6.u (Ljava/lang/String;)V
      // 31: astore 2
      // 32: aconst_null
      // 33: astore 3
      // 34: aload 1
      // 35: invokeinterface com/finalshell/core/N_6.o$InputStream ()Ljava/io/InputStream; 1
      // 3a: astore 3
      // 3b: new com/finalshell/core/Cr2_2
      // 3e: dup
      // 3f: new java/io/BufferedInputStream
      // 42: dup
      // 43: aload 3
      // 44: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 47: invokespecial com/finalshell/core/Cr2_2.<init> (Ljava/io/InputStream;)V
      // 4a: astore 4
      // 4c: aload 3
      // 4d: aload 2
      // 4e: ifnull 5c
      // 51: ifnull af
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: aload 3
      // 5c: invokevirtual java/io/InputStream.close ()V
      // 5f: goto af
      // 62: astore 5
      // 64: goto af
      // 67: astore 5
      // 69: new java/lang/ClassNotFoundException
      // 6c: dup
      // 6d: new java/lang/StringBuilder
      // 70: dup
      // 71: invokespecial java/lang/StringBuilder.<init> ()V
      // 74: sipush 17262
      // 77: sipush -18436
      // 7a: invokestatic com/finalshell/core/C_s_2.b (II)Ljava/lang/String;
      // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 80: aload 1
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 84: ldc "\""
      // 86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8c: aload 5
      // 8e: invokespecial java/lang/ClassNotFoundException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 91: athrow
      // 92: astore 6
      // 94: aload 3
      // 95: aload 2
      // 96: ifnull a4
      // 99: ifnull ac
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/C_s_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: aload 3
      // a4: invokevirtual java/io/InputStream.close ()V
      // a7: goto ac
      // aa: astore 7
      // ac: aload 6
      // ae: athrow
      // af: new com/finalshell/core/Ht2_2
      // b2: dup
      // b3: aload 4
      // b5: aload 0
      // b6: invokespecial com/finalshell/core/Ht2_2.<init> (Lcom/finalshell/core/Cr2_2;Lcom/finalshell/core/C_L;)V
      // b9: astore 5
      // bb: aload 0
      // bc: aload 5
      // be: invokevirtual com/finalshell/core/C_s_2.l (Lcom/finalshell/core/Hd2;)V
      // c1: aload 5
      // c3: invokevirtual com/finalshell/core/Ht2_2.S ()V
      // c6: aload 5
      // c8: astore 6
      // ca: aload 0
      // cb: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // ce: invokestatic com/finalshell/core/W3_6.w (Lcom/finalshell/core/W3_6;)Lcom/finalshell/core/D_6;
      // d1: invokevirtual com/finalshell/core/D_6.r ()V
      // d4: aload 6
      // d6: areturn
      // d7: astore 8
      // d9: aload 0
      // da: getfield com/finalshell/core/C_s_2.O6 Lcom/finalshell/core/W3_6;
      // dd: invokestatic com/finalshell/core/W3_6.w (Lcom/finalshell/core/W3_6;)Lcom/finalshell/core/D_6;
      // e0: invokevirtual com/finalshell/core/D_6.r ()V
      // e3: aload 8
      // e5: athrow
   }

   static {
      __vfClinit__();
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 17260) & 65535;
      if (db[var2] == null) {
         char[] var3 = cb[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 25;
               break;
            case 1:
               var10000 = 46;
               break;
            case 2:
               var10000 = 50;
               break;
            case 3:
               var10000 = 124;
               break;
            case 4:
               var10000 = 113;
               break;
            case 5:
               var10000 = 216;
               break;
            case 6:
               var10000 = 7;
               break;
            case 7:
               var10000 = 76;
               break;
            case 8:
               var10000 = 128;
               break;
            case 9:
               var10000 = 103;
               break;
            case 10:
               var10000 = 169;
               break;
            case 11:
               var10000 = 96;
               break;
            case 12:
               var10000 = 72;
               break;
            case 13:
               var10000 = 60;
               break;
            case 14:
               var10000 = 132;
               break;
            case 15:
               var10000 = 26;
               break;
            case 16:
               var10000 = 230;
               break;
            case 17:
               var10000 = 225;
               break;
            case 18:
               var10000 = 9;
               break;
            case 19:
               var10000 = 3;
               break;
            case 20:
               var10000 = 145;
               break;
            case 21:
               var10000 = 35;
               break;
            case 22:
               var10000 = 105;
               break;
            case 23:
               var10000 = 45;
               break;
            case 24:
               var10000 = 144;
               break;
            case 25:
               var10000 = 32;
               break;
            case 26:
               var10000 = 171;
               break;
            case 27:
               var10000 = 117;
               break;
            case 28:
               var10000 = 236;
               break;
            case 29:
               var10000 = 251;
               break;
            case 30:
               var10000 = 63;
               break;
            case 31:
               var10000 = 58;
               break;
            case 32:
               var10000 = 222;
               break;
            case 33:
               var10000 = 167;
               break;
            case 34:
               var10000 = 118;
               break;
            case 35:
               var10000 = 201;
               break;
            case 36:
               var10000 = 178;
               break;
            case 37:
               var10000 = 214;
               break;
            case 38:
               var10000 = 98;
               break;
            case 39:
               var10000 = 6;
               break;
            case 40:
               var10000 = 163;
               break;
            case 41:
               var10000 = 130;
               break;
            case 42:
               var10000 = 78;
               break;
            case 43:
               var10000 = 226;
               break;
            case 44:
               var10000 = 54;
               break;
            case 45:
               var10000 = 82;
               break;
            case 46:
               var10000 = 116;
               break;
            case 47:
               var10000 = 115;
               break;
            case 48:
               var10000 = 237;
               break;
            case 49:
               var10000 = 111;
               break;
            case 50:
               var10000 = 31;
               break;
            case 51:
               var10000 = 100;
               break;
            case 52:
               var10000 = 131;
               break;
            case 53:
               var10000 = 137;
               break;
            case 54:
               var10000 = 211;
               break;
            case 55:
               var10000 = 138;
               break;
            case 56:
               var10000 = 79;
               break;
            case 57:
               var10000 = 88;
               break;
            case 58:
               var10000 = 143;
               break;
            case 59:
               var10000 = 246;
               break;
            case 60:
               var10000 = 155;
               break;
            case 61:
               var10000 = 107;
               break;
            case 62:
               var10000 = 157;
               break;
            case 63:
               var10000 = 36;
               break;
            case 64:
               var10000 = 158;
               break;
            case 65:
               var10000 = 67;
               break;
            case 66:
               var10000 = 241;
               break;
            case 67:
               var10000 = 231;
               break;
            case 68:
               var10000 = 161;
               break;
            case 69:
               var10000 = 61;
               break;
            case 70:
               var10000 = 127;
               break;
            case 71:
               var10000 = 244;
               break;
            case 72:
               var10000 = 0;
               break;
            case 73:
               var10000 = 224;
               break;
            case 74:
               var10000 = 1;
               break;
            case 75:
               var10000 = 28;
               break;
            case 76:
               var10000 = 168;
               break;
            case 77:
               var10000 = 164;
               break;
            case 78:
               var10000 = 49;
               break;
            case 79:
               var10000 = 11;
               break;
            case 80:
               var10000 = 75;
               break;
            case 81:
               var10000 = 81;
               break;
            case 82:
               var10000 = 110;
               break;
            case 83:
               var10000 = 37;
               break;
            case 84:
               var10000 = 24;
               break;
            case 85:
               var10000 = 219;
               break;
            case 86:
               var10000 = 233;
               break;
            case 87:
               var10000 = 176;
               break;
            case 88:
               var10000 = 174;
               break;
            case 89:
               var10000 = 22;
               break;
            case 90:
               var10000 = 14;
               break;
            case 91:
               var10000 = 87;
               break;
            case 92:
               var10000 = 188;
               break;
            case 93:
               var10000 = 17;
               break;
            case 94:
               var10000 = 165;
               break;
            case 95:
               var10000 = 175;
               break;
            case 96:
               var10000 = 129;
               break;
            case 97:
               var10000 = 51;
               break;
            case 98:
               var10000 = 189;
               break;
            case 99:
               var10000 = 159;
               break;
            case 100:
               var10000 = 108;
               break;
            case 101:
               var10000 = 44;
               break;
            case 102:
               var10000 = 48;
               break;
            case 103:
               var10000 = 254;
               break;
            case 104:
               var10000 = 64;
               break;
            case 105:
               var10000 = 85;
               break;
            case 106:
               var10000 = 243;
               break;
            case 107:
               var10000 = 102;
               break;
            case 108:
               var10000 = 221;
               break;
            case 109:
               var10000 = 185;
               break;
            case 110:
               var10000 = 179;
               break;
            case 111:
               var10000 = 73;
               break;
            case 112:
               var10000 = 217;
               break;
            case 113:
               var10000 = 197;
               break;
            case 114:
               var10000 = 205;
               break;
            case 115:
               var10000 = 38;
               break;
            case 116:
               var10000 = 83;
               break;
            case 117:
               var10000 = 125;
               break;
            case 118:
               var10000 = 140;
               break;
            case 119:
               var10000 = 210;
               break;
            case 120:
               var10000 = 136;
               break;
            case 121:
               var10000 = 74;
               break;
            case 122:
               var10000 = 252;
               break;
            case 123:
               var10000 = 65;
               break;
            case 124:
               var10000 = 245;
               break;
            case 125:
               var10000 = 183;
               break;
            case 126:
               var10000 = 55;
               break;
            case 127:
               var10000 = 191;
               break;
            case 128:
               var10000 = 193;
               break;
            case 129:
               var10000 = 248;
               break;
            case 130:
               var10000 = 104;
               break;
            case 131:
               var10000 = 228;
               break;
            case 132:
               var10000 = 239;
               break;
            case 133:
               var10000 = 187;
               break;
            case 134:
               var10000 = 8;
               break;
            case 135:
               var10000 = 12;
               break;
            case 136:
               var10000 = 27;
               break;
            case 137:
               var10000 = 232;
               break;
            case 138:
               var10000 = 29;
               break;
            case 139:
               var10000 = 68;
               break;
            case 140:
               var10000 = 71;
               break;
            case 141:
               var10000 = 112;
               break;
            case 142:
               var10000 = 162;
               break;
            case 143:
               var10000 = 126;
               break;
            case 144:
               var10000 = 202;
               break;
            case 145:
               var10000 = 34;
               break;
            case 146:
               var10000 = 86;
               break;
            case 147:
               var10000 = 242;
               break;
            case 148:
               var10000 = 156;
               break;
            case 149:
               var10000 = 192;
               break;
            case 150:
               var10000 = 2;
               break;
            case 151:
               var10000 = 207;
               break;
            case 152:
               var10000 = 106;
               break;
            case 153:
               var10000 = 184;
               break;
            case 154:
               var10000 = 170;
               break;
            case 155:
               var10000 = 41;
               break;
            case 156:
               var10000 = 59;
               break;
            case 157:
               var10000 = 186;
               break;
            case 158:
               var10000 = 247;
               break;
            case 159:
               var10000 = 13;
               break;
            case 160:
               var10000 = 142;
               break;
            case 161:
               var10000 = 166;
               break;
            case 162:
               var10000 = 198;
               break;
            case 163:
               var10000 = 114;
               break;
            case 164:
               var10000 = 47;
               break;
            case 165:
               var10000 = 135;
               break;
            case 166:
               var10000 = 109;
               break;
            case 167:
               var10000 = 249;
               break;
            case 168:
               var10000 = 23;
               break;
            case 169:
               var10000 = 19;
               break;
            case 170:
               var10000 = 149;
               break;
            case 171:
               var10000 = 209;
               break;
            case 172:
               var10000 = 195;
               break;
            case 173:
               var10000 = 69;
               break;
            case 174:
               var10000 = 18;
               break;
            case 175:
               var10000 = 212;
               break;
            case 176:
               var10000 = 62;
               break;
            case 177:
               var10000 = 213;
               break;
            case 178:
               var10000 = 93;
               break;
            case 179:
               var10000 = 172;
               break;
            case 180:
               var10000 = 80;
               break;
            case 181:
               var10000 = 250;
               break;
            case 182:
               var10000 = 122;
               break;
            case 183:
               var10000 = 121;
               break;
            case 184:
               var10000 = 181;
               break;
            case 185:
               var10000 = 92;
               break;
            case 186:
               var10000 = 57;
               break;
            case 187:
               var10000 = 97;
               break;
            case 188:
               var10000 = 204;
               break;
            case 189:
               var10000 = 223;
               break;
            case 190:
               var10000 = 141;
               break;
            case 191:
               var10000 = 53;
               break;
            case 192:
               var10000 = 134;
               break;
            case 193:
               var10000 = 218;
               break;
            case 194:
               var10000 = 220;
               break;
            case 195:
               var10000 = 215;
               break;
            case 196:
               var10000 = 190;
               break;
            case 197:
               var10000 = 194;
               break;
            case 198:
               var10000 = 90;
               break;
            case 199:
               var10000 = 234;
               break;
            case 200:
               var10000 = 206;
               break;
            case 201:
               var10000 = 147;
               break;
            case 202:
               var10000 = 227;
               break;
            case 203:
               var10000 = 253;
               break;
            case 204:
               var10000 = 153;
               break;
            case 205:
               var10000 = 52;
               break;
            case 206:
               var10000 = 255;
               break;
            case 207:
               var10000 = 238;
               break;
            case 208:
               var10000 = 160;
               break;
            case 209:
               var10000 = 10;
               break;
            case 210:
               var10000 = 94;
               break;
            case 211:
               var10000 = 146;
               break;
            case 212:
               var10000 = 56;
               break;
            case 213:
               var10000 = 150;
               break;
            case 214:
               var10000 = 99;
               break;
            case 215:
               var10000 = 40;
               break;
            case 216:
               var10000 = 196;
               break;
            case 217:
               var10000 = 182;
               break;
            case 218:
               var10000 = 203;
               break;
            case 219:
               var10000 = 21;
               break;
            case 220:
               var10000 = 39;
               break;
            case 221:
               var10000 = 148;
               break;
            case 222:
               var10000 = 42;
               break;
            case 223:
               var10000 = 229;
               break;
            case 224:
               var10000 = 139;
               break;
            case 225:
               var10000 = 20;
               break;
            case 226:
               var10000 = 84;
               break;
            case 227:
               var10000 = 5;
               break;
            case 228:
               var10000 = 133;
               break;
            case 229:
               var10000 = 235;
               break;
            case 230:
               var10000 = 33;
               break;
            case 231:
               var10000 = 91;
               break;
            case 232:
               var10000 = 123;
               break;
            case 233:
               var10000 = 199;
               break;
            case 234:
               var10000 = 15;
               break;
            case 235:
               var10000 = 77;
               break;
            case 236:
               var10000 = 240;
               break;
            case 237:
               var10000 = 180;
               break;
            case 238:
               var10000 = 16;
               break;
            case 239:
               var10000 = 152;
               break;
            case 240:
               var10000 = 119;
               break;
            case 241:
               var10000 = 30;
               break;
            case 242:
               var10000 = 43;
               break;
            case 243:
               var10000 = 70;
               break;
            case 244:
               var10000 = 200;
               break;
            case 245:
               var10000 = 66;
               break;
            case 246:
               var10000 = 208;
               break;
            case 247:
               var10000 = 173;
               break;
            case 248:
               var10000 = 101;
               break;
            case 249:
               var10000 = 4;
               break;
            case 250:
               var10000 = 154;
               break;
            case 251:
               var10000 = 177;
               break;
            case 252:
               var10000 = 151;
               break;
            case 253:
               var10000 = 95;
               break;
            case 254:
               var10000 = 120;
               break;
            default:
               var10000 = 89;
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

         db[var2] = new String(var3).intern();
      }

      return db[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11723;
      if (fb[var3] == null) {
         fb[var3] = (int)(eb[var3] ^ var1);
      }

      return fb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "Á\u0096\u008aaj\u0019ÑsG\t²\tÓßü£¼¤=»\nÈ¨mÍñÖG³Lø\u001d°Xeãºu\u0001\u000eþ9I\u0003Ó(\"~2\u00161½\u0012ÛÒ£Rz×\u00152\u001aÊØÁÝÛ\f-!{ßõ¿Ó\u0090|±\u001b[ÿ\r\\È\u000f~}¡\r¾É\tS©ý<v\u0099\u0083yl\u0082\u0014\u0083\u001fdý\u001eý\u0095\u001fl\u001b\u001bG\u0099 ko\u001b4\u0014©";
      int var12 = "Á\u0096\u008aaj\u0019ÑsG\t²\tÓßü£¼¤=»\nÈ¨mÍñÖG³Lø\u001d°Xeãºu\u0001\u000eþ9I\u0003Ó(\"~2\u00161½\u0012ÛÒ£Rz×\u00152\u001aÊØÁÝÛ\f-!{ßõ¿Ó\u0090|±\u001b[ÿ\r\\È\u000f~}¡\r¾É\tS©ý<v\u0099\u0083yl\u0082\u0014\u0083\u001fdý\u001eý\u0095\u001fl\u001b\u001bG\u0099 ko\u001b4\u0014©"
         .length();
      char var9 = 20;
      int var17 = -1;

      label76:
      while (true) {
         byte var10000 = 100;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label71: {
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
                     break label71;
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
                        var65 = 2;
                        break;
                     case 1:
                        var65 = 24;
                        break;
                     case 2:
                        var65 = 24;
                        break;
                     case 3:
                        var65 = 19;
                        break;
                     case 4:
                        var65 = 93;
                        break;
                     case 5:
                        var65 = 78;
                        break;
                     default:
                        var65 = 54;
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
                     cb = var13;
                     db = new String[8];
                     long var0 = 8137114292494791415L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "\u0010ðf¶\u0014\u0018»\\\u0080|0@«¤À¤";
                     int var5 = "\u0010ðf¶\u0014\u0018»\\\u0080|0@«¤À¤".length();
                     byte var2 = 0;

                     label50:
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
                                    eb = var6;
                                    fb = new Integer[4];
                                    OT = !W3_6.class.desiredAssertionStatus();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label50;
                                 }

                                 var4 = "\u001eÛq\u009c\u007fsqàk\u001d7\u0091B\u009f3\u0002";
                                 var5 = "\u001eÛq\u009c\u007fsqàk\u001d7\u0091B\u009f3\u0002".length();
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
                     continue label76;
                  }

                  var10 = "z\n³\u0088K\u001aGYmðS´!+ç\u0083{)\u001f_øU\u0096ÚS Ôp\u0003táý";
                  var12 = "z\n³\u0088K\u001aGYmðS´!+ç\u0083{)\u001f_øU\u0096ÚS Ôp\u0003táý".length();
                  var9 = 5;
                  var17 = -1;
            }

            var10000 = 23;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





