package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public class BM {
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Long[] d;

   public static String o(ConnectHost param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aconst_null
      // 004: astore 3
      // 005: astore 2
      // 006: new com/finalshell/core/Xe2
      // 009: dup
      // 00a: invokespecial com/finalshell/core/Xe2.<init> ()V
      // 00d: astore 4
      // 00f: aload 0
      // 010: aload 2
      // 011: ifnull 029
      // 014: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 017: ifeq 13c
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: aload 0
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: sipush -20077
      // 02c: sipush -21144
      // 02f: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 032: invokevirtual com/finalshell/crypto/ConnectHost.i$dm_4 (Ljava/lang/String;)Lcom/finalshell/core/Dm4;
      // 035: checkcast com/finalshell/core/DB3
      // 038: astore 5
      // 03a: aload 5
      // 03c: sipush -20065
      // 03f: sipush 1700
      // 042: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 045: sipush -20079
      // 048: sipush 31538
      // 04b: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 04e: invokevirtual com/finalshell/core/DB3.o (Ljava/lang/String;Ljava/lang/String;)V
      // 051: aload 5
      // 053: sipush -20067
      // 056: sipush -18886
      // 059: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 05c: sipush -20079
      // 05f: sipush 31538
      // 062: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 065: invokevirtual com/finalshell/core/DB3.o (Ljava/lang/String;Ljava/lang/String;)V
      // 068: aload 5
      // 06a: sipush -20066
      // 06d: sipush 8637
      // 070: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 073: sipush -20079
      // 076: sipush 31538
      // 079: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 07c: invokevirtual com/finalshell/core/DB3.o (Ljava/lang/String;Ljava/lang/String;)V
      // 07f: aload 5
      // 081: sipush -20080
      // 084: sipush 32328
      // 087: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 08a: sipush -20072
      // 08d: sipush 3570
      // 090: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 093: invokevirtual com/finalshell/core/DB3.o (Ljava/lang/String;Ljava/lang/String;)V
      // 096: aload 5
      // 098: aconst_null
      // 099: invokevirtual com/finalshell/core/DB3.X (Ljava/io/InputStream;)V
      // 09c: aload 5
      // 09e: aload 1
      // 09f: invokevirtual com/finalshell/core/DB3.h (Ljava/lang/String;)V
      // 0a2: new java/io/BufferedReader
      // 0a5: dup
      // 0a6: new java/io/InputStreamReader
      // 0a9: dup
      // 0aa: aload 5
      // 0ac: invokevirtual com/finalshell/core/DB3.s ()Ljava/io/InputStream;
      // 0af: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 0b2: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0b5: astore 6
      // 0b7: aload 5
      // 0b9: aload 2
      // 0ba: ifnull 0cf
      // 0bd: invokevirtual com/finalshell/core/DB3.B ()Z
      // 0c0: ifeq 0cd
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: ldc ""
      // 0cc: areturn
      // 0cd: aload 5
      // 0cf: invokevirtual com/finalshell/core/DB3.I ()V
      // 0d2: new java/lang/StringBuffer
      // 0d5: dup
      // 0d6: invokespecial java/lang/StringBuffer.<init> ()V
      // 0d9: astore 8
      // 0db: aload 6
      // 0dd: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0e0: dup
      // 0e1: astore 7
      // 0e3: ifnull 10f
      // 0e6: aload 8
      // 0e8: new java/lang/StringBuilder
      // 0eb: dup
      // 0ec: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ef: aload 7
      // 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f4: ldc "\n"
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fc: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0ff: pop
      // 100: aload 2
      // 101: ifnull 114
      // 104: aload 2
      // 105: ifnonnull 0db
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 6
      // 111: invokevirtual java/io/BufferedReader.close ()V
      // 114: bipush 0
      // 115: istore 9
      // 117: aload 5
      // 119: aload 2
      // 11a: ifnull 133
      // 11d: invokevirtual com/finalshell/core/DB3.B ()Z
      // 120: ifeq 131
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: aload 5
      // 12c: invokevirtual com/finalshell/core/DB3.o ()I
      // 12f: istore 9
      // 131: aload 5
      // 133: invokevirtual com/finalshell/core/DB3.r ()V
      // 136: aload 8
      // 138: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 13b: astore 3
      // 13c: goto 154
      // 13f: astore 5
      // 141: aconst_null
      // 142: astore 3
      // 143: sipush 31989
      // 146: ldc2_w 8574256936969163704
      // 149: invokestatic com/finalshell/core/BM.a (IJ)J
      // 14c: invokestatic java/lang/Thread.sleep (J)V
      // 14f: goto 154
      // 152: astore 6
      // 154: aload 3
      // 155: areturn
   }

   public static Tl2 F(ConnectHost param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aconst_null
      // 004: astore 3
      // 005: astore 2
      // 006: new com/finalshell/core/Xe2
      // 009: dup
      // 00a: invokespecial com/finalshell/core/Xe2.<init> ()V
      // 00d: astore 4
      // 00f: new com/finalshell/core/Tl2
      // 012: dup
      // 013: ldc ""
      // 015: ldc ""
      // 017: invokespecial com/finalshell/core/Tl2.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 01a: astore 5
      // 01c: aload 0
      // 01d: aload 2
      // 01e: ifnull 036
      // 021: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 024: ifeq 16a
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 0
      // 02f: goto 036
      // 032: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: sipush -20068
      // 039: sipush -24226
      // 03c: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 03f: invokevirtual com/finalshell/crypto/ConnectHost.i$dm_4 (Ljava/lang/String;)Lcom/finalshell/core/Dm4;
      // 042: checkcast com/finalshell/core/DB3
      // 045: astore 6
      // 047: aload 6
      // 049: sipush -20069
      // 04c: sipush 29951
      // 04f: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 052: sipush -20078
      // 055: sipush -20897
      // 058: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 05b: invokevirtual com/finalshell/core/DB3.o (Ljava/lang/String;Ljava/lang/String;)V
      // 05e: aload 6
      // 060: aconst_null
      // 061: invokevirtual com/finalshell/core/DB3.X (Ljava/io/InputStream;)V
      // 064: aload 6
      // 066: aload 1
      // 067: invokevirtual com/finalshell/core/DB3.h (Ljava/lang/String;)V
      // 06a: new java/io/BufferedReader
      // 06d: dup
      // 06e: new java/io/InputStreamReader
      // 071: dup
      // 072: aload 6
      // 074: invokevirtual com/finalshell/core/DB3.s ()Ljava/io/InputStream;
      // 077: sipush -20070
      // 07a: sipush 29293
      // 07d: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 080: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 083: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 086: astore 7
      // 088: new java/io/BufferedReader
      // 08b: dup
      // 08c: new java/io/InputStreamReader
      // 08f: dup
      // 090: aload 6
      // 092: invokevirtual com/finalshell/core/DB3.B ()Ljava/io/InputStream;
      // 095: sipush -20071
      // 098: sipush -30340
      // 09b: invokestatic com/finalshell/core/BM.a (II)Ljava/lang/String;
      // 09e: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0a1: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0a4: astore 8
      // 0a6: aload 6
      // 0a8: aload 2
      // 0a9: ifnull 0bd
      // 0ac: invokevirtual com/finalshell/core/DB3.B ()Z
      // 0af: ifeq 0bb
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: aconst_null
      // 0ba: areturn
      // 0bb: aload 6
      // 0bd: invokevirtual com/finalshell/core/DB3.I ()V
      // 0c0: new java/util/ArrayList
      // 0c3: dup
      // 0c4: invokespecial java/util/ArrayList.<init> ()V
      // 0c7: astore 9
      // 0c9: new java/lang/StringBuffer
      // 0cc: dup
      // 0cd: invokespecial java/lang/StringBuffer.<init> ()V
      // 0d0: astore 10
      // 0d2: aload 9
      // 0d4: new com/finalshell/task/T52
      // 0d7: dup
      // 0d8: aload 7
      // 0da: aload 10
      // 0dc: invokespecial com/finalshell/task/T52.<init> (Ljava/io/BufferedReader;Ljava/lang/StringBuffer;)V
      // 0df: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0e2: pop
      // 0e3: new java/lang/StringBuffer
      // 0e6: dup
      // 0e7: invokespecial java/lang/StringBuffer.<init> ()V
      // 0ea: astore 11
      // 0ec: aload 9
      // 0ee: new com/finalshell/task/ZZ
      // 0f1: dup
      // 0f2: aload 8
      // 0f4: aload 11
      // 0f6: invokespecial com/finalshell/task/ZZ.<init> (Ljava/io/BufferedReader;Ljava/lang/StringBuffer;)V
      // 0f9: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0fc: pop
      // 0fd: ldc2_w 388376917454860932
      // 100: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 103: aconst_null
      // 104: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 107: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10a: ldc2_w 597037287277754180
      // 10d: astore 14
      // 10f: astore 13
      // 111: ldc2_w 597037287277754180
      // 114: aload 13
      // 116: aload 14
      // 118: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11b: checkcast java/util/concurrent/ThreadPoolExecutor
      // 11e: goto 125
      // 121: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 9
      // 127: invokevirtual java/util/concurrent/ThreadPoolExecutor.invokeAll (Ljava/util/Collection;)Ljava/util/List;
      // 12a: pop
      // 12b: aload 7
      // 12d: invokevirtual java/io/BufferedReader.close ()V
      // 130: aload 8
      // 132: invokevirtual java/io/BufferedReader.close ()V
      // 135: bipush 0
      // 136: istore 12
      // 138: aload 6
      // 13a: aload 2
      // 13b: ifnull 154
      // 13e: invokevirtual com/finalshell/core/DB3.B ()Z
      // 141: ifeq 152
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/BM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: aload 6
      // 14d: invokevirtual com/finalshell/core/DB3.o ()I
      // 150: istore 12
      // 152: aload 6
      // 154: invokevirtual com/finalshell/core/DB3.r ()V
      // 157: new com/finalshell/core/Tl2
      // 15a: dup
      // 15b: aload 10
      // 15d: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 160: aload 11
      // 162: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 165: invokespecial com/finalshell/core/Tl2.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 168: astore 5
      // 16a: goto 180
      // 16d: astore 6
      // 16f: sipush 20232
      // 172: ldc2_w 6058928353032691780
      // 175: invokestatic com/finalshell/core/BM.a (IJ)J
      // 178: invokestatic java/lang/Thread.sleep (J)V
      // 17b: goto 180
      // 17e: astore 7
      // 180: aload 5
      // 182: areturn
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -20069) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 88;
               break;
            case 1:
               var10000 = 30;
               break;
            case 2:
               var10000 = 160;
               break;
            case 3:
               var10000 = 245;
               break;
            case 4:
               var10000 = 142;
               break;
            case 5:
               var10000 = 205;
               break;
            case 6:
               var10000 = 248;
               break;
            case 7:
               var10000 = 90;
               break;
            case 8:
               var10000 = 175;
               break;
            case 9:
               var10000 = 93;
               break;
            case 10:
               var10000 = 41;
               break;
            case 11:
               var10000 = 95;
               break;
            case 12:
               var10000 = 223;
               break;
            case 13:
               var10000 = 68;
               break;
            case 14:
               var10000 = 213;
               break;
            case 15:
               var10000 = 97;
               break;
            case 16:
               var10000 = 79;
               break;
            case 17:
               var10000 = 101;
               break;
            case 18:
               var10000 = 38;
               break;
            case 19:
               var10000 = 118;
               break;
            case 20:
               var10000 = 1;
               break;
            case 21:
               var10000 = 58;
               break;
            case 22:
               var10000 = 23;
               break;
            case 23:
               var10000 = 100;
               break;
            case 24:
               var10000 = 4;
               break;
            case 25:
               var10000 = 73;
               break;
            case 26:
               var10000 = 13;
               break;
            case 27:
               var10000 = 125;
               break;
            case 28:
               var10000 = 50;
               break;
            case 29:
               var10000 = 108;
               break;
            case 30:
               var10000 = 71;
               break;
            case 31:
               var10000 = 84;
               break;
            case 32:
               var10000 = 127;
               break;
            case 33:
               var10000 = 167;
               break;
            case 34:
               var10000 = 241;
               break;
            case 35:
               var10000 = 109;
               break;
            case 36:
               var10000 = 39;
               break;
            case 37:
               var10000 = 162;
               break;
            case 38:
               var10000 = 65;
               break;
            case 39:
               var10000 = 116;
               break;
            case 40:
               var10000 = 251;
               break;
            case 41:
               var10000 = 19;
               break;
            case 42:
               var10000 = 228;
               break;
            case 43:
               var10000 = 69;
               break;
            case 44:
               var10000 = 66;
               break;
            case 45:
               var10000 = 192;
               break;
            case 46:
               var10000 = 149;
               break;
            case 47:
               var10000 = 22;
               break;
            case 48:
               var10000 = 254;
               break;
            case 49:
               var10000 = 232;
               break;
            case 50:
               var10000 = 52;
               break;
            case 51:
               var10000 = 126;
               break;
            case 52:
               var10000 = 64;
               break;
            case 53:
               var10000 = 239;
               break;
            case 54:
               var10000 = 123;
               break;
            case 55:
               var10000 = 33;
               break;
            case 56:
               var10000 = 225;
               break;
            case 57:
               var10000 = 197;
               break;
            case 58:
               var10000 = 122;
               break;
            case 59:
               var10000 = 113;
               break;
            case 60:
               var10000 = 111;
               break;
            case 61:
               var10000 = 244;
               break;
            case 62:
               var10000 = 87;
               break;
            case 63:
               var10000 = 59;
               break;
            case 64:
               var10000 = 233;
               break;
            case 65:
               var10000 = 209;
               break;
            case 66:
               var10000 = 28;
               break;
            case 67:
               var10000 = 15;
               break;
            case 68:
               var10000 = 145;
               break;
            case 69:
               var10000 = 172;
               break;
            case 70:
               var10000 = 204;
               break;
            case 71:
               var10000 = 47;
               break;
            case 72:
               var10000 = 185;
               break;
            case 73:
               var10000 = 7;
               break;
            case 74:
               var10000 = 119;
               break;
            case 75:
               var10000 = 184;
               break;
            case 76:
               var10000 = 247;
               break;
            case 77:
               var10000 = 45;
               break;
            case 78:
               var10000 = 106;
               break;
            case 79:
               var10000 = 218;
               break;
            case 80:
               var10000 = 20;
               break;
            case 81:
               var10000 = 144;
               break;
            case 82:
               var10000 = 57;
               break;
            case 83:
               var10000 = 34;
               break;
            case 84:
               var10000 = 124;
               break;
            case 85:
               var10000 = 91;
               break;
            case 86:
               var10000 = 229;
               break;
            case 87:
               var10000 = 81;
               break;
            case 88:
               var10000 = 237;
               break;
            case 89:
               var10000 = 24;
               break;
            case 90:
               var10000 = 25;
               break;
            case 91:
               var10000 = 183;
               break;
            case 92:
               var10000 = 150;
               break;
            case 93:
               var10000 = 56;
               break;
            case 94:
               var10000 = 250;
               break;
            case 95:
               var10000 = 188;
               break;
            case 96:
               var10000 = 31;
               break;
            case 97:
               var10000 = 48;
               break;
            case 98:
               var10000 = 191;
               break;
            case 99:
               var10000 = 219;
               break;
            case 100:
               var10000 = 129;
               break;
            case 101:
               var10000 = 193;
               break;
            case 102:
               var10000 = 102;
               break;
            case 103:
               var10000 = 117;
               break;
            case 104:
               var10000 = 137;
               break;
            case 105:
               var10000 = 208;
               break;
            case 106:
               var10000 = 203;
               break;
            case 107:
               var10000 = 98;
               break;
            case 108:
               var10000 = 92;
               break;
            case 109:
               var10000 = 155;
               break;
            case 110:
               var10000 = 226;
               break;
            case 111:
               var10000 = 46;
               break;
            case 112:
               var10000 = 99;
               break;
            case 113:
               var10000 = 51;
               break;
            case 114:
               var10000 = 249;
               break;
            case 115:
               var10000 = 6;
               break;
            case 116:
               var10000 = 29;
               break;
            case 117:
               var10000 = 54;
               break;
            case 118:
               var10000 = 61;
               break;
            case 119:
               var10000 = 112;
               break;
            case 120:
               var10000 = 78;
               break;
            case 121:
               var10000 = 43;
               break;
            case 122:
               var10000 = 255;
               break;
            case 123:
               var10000 = 128;
               break;
            case 124:
               var10000 = 136;
               break;
            case 125:
               var10000 = 200;
               break;
            case 126:
               var10000 = 158;
               break;
            case 127:
               var10000 = 235;
               break;
            case 128:
               var10000 = 96;
               break;
            case 129:
               var10000 = 189;
               break;
            case 130:
               var10000 = 173;
               break;
            case 131:
               var10000 = 139;
               break;
            case 132:
               var10000 = 8;
               break;
            case 133:
               var10000 = 86;
               break;
            case 134:
               var10000 = 77;
               break;
            case 135:
               var10000 = 80;
               break;
            case 136:
               var10000 = 238;
               break;
            case 137:
               var10000 = 253;
               break;
            case 138:
               var10000 = 103;
               break;
            case 139:
               var10000 = 72;
               break;
            case 140:
               var10000 = 152;
               break;
            case 141:
               var10000 = 196;
               break;
            case 142:
               var10000 = 140;
               break;
            case 143:
               var10000 = 3;
               break;
            case 144:
               var10000 = 227;
               break;
            case 145:
               var10000 = 85;
               break;
            case 146:
               var10000 = 159;
               break;
            case 147:
               var10000 = 215;
               break;
            case 148:
               var10000 = 74;
               break;
            case 149:
               var10000 = 110;
               break;
            case 150:
               var10000 = 146;
               break;
            case 151:
               var10000 = 234;
               break;
            case 152:
               var10000 = 32;
               break;
            case 153:
               var10000 = 231;
               break;
            case 154:
               var10000 = 105;
               break;
            case 155:
               var10000 = 252;
               break;
            case 156:
               var10000 = 180;
               break;
            case 157:
               var10000 = 26;
               break;
            case 158:
               var10000 = 36;
               break;
            case 159:
               var10000 = 206;
               break;
            case 160:
               var10000 = 201;
               break;
            case 161:
               var10000 = 114;
               break;
            case 162:
               var10000 = 12;
               break;
            case 163:
               var10000 = 242;
               break;
            case 164:
               var10000 = 164;
               break;
            case 165:
               var10000 = 55;
               break;
            case 166:
               var10000 = 37;
               break;
            case 167:
               var10000 = 154;
               break;
            case 168:
               var10000 = 89;
               break;
            case 169:
               var10000 = 176;
               break;
            case 170:
               var10000 = 211;
               break;
            case 171:
               var10000 = 214;
               break;
            case 172:
               var10000 = 9;
               break;
            case 173:
               var10000 = 120;
               break;
            case 174:
               var10000 = 94;
               break;
            case 175:
               var10000 = 35;
               break;
            case 176:
               var10000 = 161;
               break;
            case 177:
               var10000 = 148;
               break;
            case 178:
               var10000 = 82;
               break;
            case 179:
               var10000 = 224;
               break;
            case 180:
               var10000 = 181;
               break;
            case 181:
               var10000 = 198;
               break;
            case 182:
               var10000 = 70;
               break;
            case 183:
               var10000 = 216;
               break;
            case 184:
               var10000 = 42;
               break;
            case 185:
               var10000 = 27;
               break;
            case 186:
               var10000 = 194;
               break;
            case 187:
               var10000 = 187;
               break;
            case 188:
               var10000 = 107;
               break;
            case 189:
               var10000 = 138;
               break;
            case 190:
               var10000 = 222;
               break;
            case 191:
               var10000 = 177;
               break;
            case 192:
               var10000 = 199;
               break;
            case 193:
               var10000 = 63;
               break;
            case 194:
               var10000 = 156;
               break;
            case 195:
               var10000 = 10;
               break;
            case 196:
               var10000 = 143;
               break;
            case 197:
               var10000 = 195;
               break;
            case 198:
               var10000 = 53;
               break;
            case 199:
               var10000 = 2;
               break;
            case 200:
               var10000 = 134;
               break;
            case 201:
               var10000 = 179;
               break;
            case 202:
               var10000 = 67;
               break;
            case 203:
               var10000 = 169;
               break;
            case 204:
               var10000 = 21;
               break;
            case 205:
               var10000 = 121;
               break;
            case 206:
               var10000 = 178;
               break;
            case 207:
               var10000 = 165;
               break;
            case 208:
               var10000 = 62;
               break;
            case 209:
               var10000 = 44;
               break;
            case 210:
               var10000 = 151;
               break;
            case 211:
               var10000 = 212;
               break;
            case 212:
               var10000 = 190;
               break;
            case 213:
               var10000 = 220;
               break;
            case 214:
               var10000 = 131;
               break;
            case 215:
               var10000 = 166;
               break;
            case 216:
               var10000 = 186;
               break;
            case 217:
               var10000 = 132;
               break;
            case 218:
               var10000 = 11;
               break;
            case 219:
               var10000 = 40;
               break;
            case 220:
               var10000 = 170;
               break;
            case 221:
               var10000 = 243;
               break;
            case 222:
               var10000 = 17;
               break;
            case 223:
               var10000 = 141;
               break;
            case 224:
               var10000 = 130;
               break;
            case 225:
               var10000 = 163;
               break;
            case 226:
               var10000 = 217;
               break;
            case 227:
               var10000 = 168;
               break;
            case 228:
               var10000 = 210;
               break;
            case 229:
               var10000 = 153;
               break;
            case 230:
               var10000 = 147;
               break;
            case 231:
               var10000 = 182;
               break;
            case 232:
               var10000 = 49;
               break;
            case 233:
               var10000 = 135;
               break;
            case 234:
               var10000 = 230;
               break;
            case 235:
               var10000 = 76;
               break;
            case 236:
               var10000 = 246;
               break;
            case 237:
               var10000 = 133;
               break;
            case 238:
               var10000 = 0;
               break;
            case 239:
               var10000 = 16;
               break;
            case 240:
               var10000 = 104;
               break;
            case 241:
               var10000 = 115;
               break;
            case 242:
               var10000 = 18;
               break;
            case 243:
               var10000 = 221;
               break;
            case 244:
               var10000 = 202;
               break;
            case 245:
               var10000 = 75;
               break;
            case 246:
               var10000 = 157;
               break;
            case 247:
               var10000 = 174;
               break;
            case 248:
               var10000 = 83;
               break;
            case 249:
               var10000 = 5;
               break;
            case 250:
               var10000 = 14;
               break;
            case 251:
               var10000 = 171;
               break;
            case 252:
               var10000 = 60;
               break;
            case 253:
               var10000 = 240;
               break;
            case 254:
               var10000 = 207;
               break;
            default:
               var10000 = 236;
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

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 12108) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[12];
      int var11 = 0;
      String var10 = "\r\u0090\n»\u0005\u0095ê/\r\u0011\u0005\u008e\u0087L }\u0005$\b¶\u000e\u0014\u0004[±À\u009f\u0006\u0013uØC\u0085\u008c\b\u001c\u0098(º±xVq\u0004Î\u0015U1\u0004ê?Ñt\u0005\u0092Ëä\b\u001d";
      int var12 = "\r\u0090\n»\u0005\u0095ê/\r\u0011\u0005\u008e\u0087L }\u0005$\b¶\u000e\u0014\u0004[±À\u009f\u0006\u0013uØC\u0085\u008c\b\u001c\u0098(º±xVq\u0004Î\u0015U1\u0004ê?Ñt\u0005\u0092Ëä\b\u001d"
         .length();
      char var9 = 4;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 108;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 55;
                        break;
                     case 1:
                        var58 = 50;
                        break;
                     case 2:
                        var58 = 39;
                        break;
                     case 3:
                        var58 = 32;
                        break;
                     case 4:
                        var58 = 99;
                        break;
                     case 5:
                        var58 = 36;
                        break;
                     default:
                        var58 = 85;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[12];
                     long var0 = 4684978226241744305L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u0015\u0011Áã¡\u009aM\u00917ù\u0083\u009e\u0097mþm";
                     int var5 = "\u0015\u0011Áã¡\u009aM\u00917ù\u0083\u009e\u0097mþm".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Long[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "å\"\u0014+\u001d\u0004©÷\u0087Ç";
                  var12 = "å\"\u0014+\u001d\u0004©÷\u0087Ç".length();
                  var9 = 5;
                  var16 = -1;
            }

            var10000 = 85;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





