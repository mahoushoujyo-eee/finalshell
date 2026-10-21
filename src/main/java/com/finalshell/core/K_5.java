package com.finalshell.core;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class K_5 {
   public static String[] O;
   public static String[] b;
   public static String[] c;
   public static long e;

   public static Object E(java.lang.Class param0, String param1) throws NoSuchMethodException, InstantiationException, InvocationTargetException, IllegalAccessException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/K_5.y ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: invokevirtual java/lang/Class.isPrimitive ()Z
      // 008: aload 2
      // 009: ifnull 106
      // 00c: ifeq 0f5
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 01a: aload 2
      // 01b: ifnull 03c
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: if_acmpne 038
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: ldc java/lang/Boolean
      // 031: goto 0f4
      // 034: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: aload 0
      // 039: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 03c: aload 2
      // 03d: ifnull 057
      // 040: if_acmpne 053
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: ldc java/lang/Character
      // 04c: goto 0f4
      // 04f: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: aload 0
      // 054: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 057: aload 2
      // 058: ifnull 072
      // 05b: if_acmpne 06e
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: ldc java/lang/Byte
      // 067: goto 0f4
      // 06a: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 072: aload 2
      // 073: ifnull 08d
      // 076: if_acmpne 089
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: ldc java/lang/Short
      // 082: goto 0f4
      // 085: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: aload 0
      // 08a: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 08d: aload 2
      // 08e: ifnull 0a8
      // 091: if_acmpne 0a4
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: ldc java/lang/Integer
      // 09d: goto 0f4
      // 0a0: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 0a8: aload 2
      // 0a9: ifnull 0c3
      // 0ac: if_acmpne 0bf
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: ldc java/lang/Long
      // 0b8: goto 0f4
      // 0bb: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 0c3: aload 2
      // 0c4: ifnull 0e9
      // 0c7: if_acmpne 0da
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: ldc java/lang/Float
      // 0d3: goto 0f4
      // 0d6: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: aload 2
      // 0dc: ifnull 0ee
      // 0df: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: if_acmpne 0f1
      // 0ec: ldc java/lang/Double
      // 0ee: goto 0f4
      // 0f1: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 0f4: astore 0
      // 0f5: ldc ""
      // 0f7: aload 2
      // 0f8: ifnull 135
      // 0fb: aload 1
      // 0fc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: ifeq 11d
      // 109: aload 0
      // 10a: bipush 0
      // 10b: anewarray 31
      // 10e: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 111: bipush 0
      // 112: anewarray 4
      // 115: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 118: areturn
      // 119: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: aload 0
      // 11e: bipush 1
      // 11f: anewarray 31
      // 122: dup
      // 123: bipush 0
      // 124: ldc java/lang/String
      // 126: aastore
      // 127: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 12a: bipush 1
      // 12b: anewarray 4
      // 12e: dup
      // 12f: bipush 0
      // 130: aload 1
      // 131: aastore
      // 132: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 135: areturn
   }

   public static String[] Q(String var0) {
      ArrayList var5;
      StringTokenizer var2 = new StringTokenizer(var0, ",");
      String[] var10000 = y();
      ArrayList var3 = new ArrayList();
      String[] var1 = var10000;

      while (true) {
         if (var2.hasMoreTokens()) {
            try {
               var5 = var3;
               if (var1 == null) {
                  break;
               }

               var3.add(var2.nextToken());
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var4) {
               throw a(var4);
            }
         }

         var5 = var3;
         break;
      }

      return var5.toArray(new String[var3.size()]);
   }

   public static java.lang.Class c(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/K_5.y ()[Ljava/lang/String;
      // 003: bipush 0
      // 004: istore 2
      // 005: astore 1
      // 006: aload 0
      // 007: sipush -2058
      // 00a: sipush -13246
      // 00d: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 010: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 013: ifeq 034
      // 016: iinc 2 1
      // 019: aload 0
      // 01a: bipush 0
      // 01b: aload 0
      // 01c: invokevirtual java/lang/String.length ()I
      // 01f: bipush 2
      // 020: isub
      // 021: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 024: astore 0
      // 025: aload 1
      // 026: ifnull 184
      // 029: aload 1
      // 02a: ifnonnull 006
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: iload 2
      // 035: aload 1
      // 036: ifnull 191
      // 039: ifne 184
      // 03c: goto 043
      // 03f: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 042: athrow
      // 043: sipush -2077
      // 046: sipush 24476
      // 049: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 04c: aload 0
      // 04d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 050: aload 1
      // 051: ifnull 07a
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: ifeq 06d
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 068: areturn
      // 069: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: sipush -2051
      // 070: sipush -29243
      // 073: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 076: aload 0
      // 077: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07a: aload 1
      // 07b: ifnull 09c
      // 07e: ifeq 090
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 08b: areturn
      // 08c: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: sipush -2056
      // 093: bipush 44
      // 095: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 098: aload 0
      // 099: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09c: aload 1
      // 09d: ifnull 0bf
      // 0a0: ifeq 0b2
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 0ad: areturn
      // 0ae: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: sipush -2060
      // 0b5: sipush 32767
      // 0b8: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 0bb: aload 0
      // 0bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bf: aload 1
      // 0c0: ifnull 0e2
      // 0c3: ifeq 0d5
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 0d0: areturn
      // 0d1: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: sipush -2052
      // 0d8: sipush -21032
      // 0db: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 0de: aload 0
      // 0df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e2: aload 1
      // 0e3: ifnull 105
      // 0e6: ifeq 0f8
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 0f3: areturn
      // 0f4: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: sipush -2061
      // 0fb: sipush 2532
      // 0fe: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 101: aload 0
      // 102: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 105: aload 1
      // 106: ifnull 128
      // 109: ifeq 11b
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 116: areturn
      // 117: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: sipush -2053
      // 11e: sipush -25283
      // 121: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 124: aload 0
      // 125: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 128: aload 1
      // 129: ifnull 14b
      // 12c: ifeq 13e
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 139: areturn
      // 13a: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: sipush -2059
      // 141: sipush -25669
      // 144: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 147: aload 0
      // 148: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14b: aload 1
      // 14c: ifnull 16e
      // 14f: ifeq 161
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 15c: areturn
      // 15d: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 160: athrow
      // 161: sipush -2055
      // 164: sipush -1184
      // 167: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 16a: aload 0
      // 16b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16e: aload 1
      // 16f: ifnull 191
      // 172: ifeq 184
      // 175: goto 17c
      // 178: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 17f: areturn
      // 180: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: sipush -2054
      // 187: sipush -27008
      // 18a: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 18d: aload 0
      // 18e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 191: aload 1
      // 192: ifnull 1ba
      // 195: ifeq 1a6
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: ldc "V"
      // 1a1: astore 0
      // 1a2: aload 1
      // 1a3: ifnonnull 2ea
      // 1a6: sipush -2049
      // 1a9: sipush -28867
      // 1ac: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 1af: aload 0
      // 1b0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: aload 1
      // 1bb: ifnull 1e3
      // 1be: ifeq 1cf
      // 1c1: goto 1c8
      // 1c4: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c7: athrow
      // 1c8: ldc "Z"
      // 1ca: astore 0
      // 1cb: aload 1
      // 1cc: ifnonnull 2ea
      // 1cf: sipush -2080
      // 1d2: sipush -901
      // 1d5: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 1d8: aload 0
      // 1d9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1dc: goto 1e3
      // 1df: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: aload 1
      // 1e4: ifnull 20c
      // 1e7: ifeq 1f8
      // 1ea: goto 1f1
      // 1ed: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f0: athrow
      // 1f1: ldc "C"
      // 1f3: astore 0
      // 1f4: aload 1
      // 1f5: ifnonnull 2ea
      // 1f8: sipush -2062
      // 1fb: sipush 30798
      // 1fe: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 201: aload 0
      // 202: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 205: goto 20c
      // 208: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: aload 1
      // 20d: ifnull 235
      // 210: ifeq 221
      // 213: goto 21a
      // 216: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 219: athrow
      // 21a: ldc "B"
      // 21c: astore 0
      // 21d: aload 1
      // 21e: ifnonnull 2ea
      // 221: sipush -2079
      // 224: sipush 29133
      // 227: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 22a: aload 0
      // 22b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 22e: goto 235
      // 231: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 234: athrow
      // 235: aload 1
      // 236: ifnull 25e
      // 239: ifeq 24a
      // 23c: goto 243
      // 23f: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 242: athrow
      // 243: ldc "S"
      // 245: astore 0
      // 246: aload 1
      // 247: ifnonnull 2ea
      // 24a: sipush -2063
      // 24d: sipush -6426
      // 250: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 253: aload 0
      // 254: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 257: goto 25e
      // 25a: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25d: athrow
      // 25e: aload 1
      // 25f: ifnull 287
      // 262: ifeq 273
      // 265: goto 26c
      // 268: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26b: athrow
      // 26c: ldc "I"
      // 26e: astore 0
      // 26f: aload 1
      // 270: ifnonnull 2ea
      // 273: sipush -2050
      // 276: sipush 31854
      // 279: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 27c: aload 0
      // 27d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 280: goto 287
      // 283: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 286: athrow
      // 287: aload 1
      // 288: ifnull 2b0
      // 28b: ifeq 29c
      // 28e: goto 295
      // 291: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: ldc "J"
      // 297: astore 0
      // 298: aload 1
      // 299: ifnonnull 2ea
      // 29c: sipush -2057
      // 29f: sipush -26024
      // 2a2: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 2a5: aload 0
      // 2a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2af: athrow
      // 2b0: aload 1
      // 2b1: ifnull 2d9
      // 2b4: ifeq 2c5
      // 2b7: goto 2be
      // 2ba: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bd: athrow
      // 2be: ldc "F"
      // 2c0: astore 0
      // 2c1: aload 1
      // 2c2: ifnonnull 2ea
      // 2c5: sipush -2064
      // 2c8: sipush 16408
      // 2cb: invokestatic com/finalshell/core/K_5.a (II)Ljava/lang/String;
      // 2ce: aload 0
      // 2cf: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2d2: goto 2d9
      // 2d5: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d8: athrow
      // 2d9: aload 1
      // 2da: ifnull 2ee
      // 2dd: ifeq 2ea
      // 2e0: goto 2e7
      // 2e3: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e6: athrow
      // 2e7: ldc "D"
      // 2e9: astore 0
      // 2ea: iinc 2 -1
      // 2ed: iload 2
      // 2ee: iflt 316
      // 2f1: new java/lang/StringBuilder
      // 2f4: dup
      // 2f5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f8: getstatic com/finalshell/core/K_5.e J
      // 2fb: l2i
      // 2fc: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2ff: aload 0
      // 300: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 303: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 306: aload 1
      // 307: ifnull 317
      // 30a: goto 311
      // 30d: invokestatic com/finalshell/core/K_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 310: athrow
      // 311: astore 0
      // 312: aload 1
      // 313: ifnonnull 2ea
      // 316: aload 0
      // 317: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 31a: areturn
      // 31b: astore 3
      // 31c: aload 3
      // 31d: invokevirtual java/lang/ClassNotFoundException.printStackTrace ()V
      // 320: bipush 1
      // 321: invokestatic java/lang/System.exit (I)V
      // 324: new java/lang/RuntimeException
      // 327: dup
      // 328: invokespecial java/lang/RuntimeException.<init> ()V
      // 32b: athrow
   }

   public static java.lang.Class[] b(String var0) {
      String[] var10000 = y();
      StringTokenizer var2 = new StringTokenizer(var0, ",");
      String[] var1 = var10000;
      ArrayList var3 = new ArrayList();

      while (true) {
         if (var2.hasMoreTokens()) {
            try {
               var6 = var3.add(c(var2.nextToken()));
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var5) {
               throw a(var5);
            }
         }

         var6 = var3.size();
         break;
      }

      java.lang.Class[] var4 = new java.lang.Class[var6];
      var3.toArray(var4);
      return var4;
   }

   public static void c(String[] var0) {
      O = var0;
   }

   public static String[] y() {
      return O;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var6;
      int var2 = (var0 ^ -2063) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 3;
               break;
            case 1:
               var10000 = 187;
               break;
            case 2:
               var10000 = 101;
               break;
            case 3:
               var10000 = 255;
               break;
            case 4:
               var10000 = 15;
               break;
            case 5:
               var10000 = 195;
               break;
            case 6:
               var10000 = 173;
               break;
            case 7:
               var10000 = 73;
               break;
            case 8:
               var10000 = 217;
               break;
            case 9:
               var10000 = 137;
               break;
            case 10:
               var10000 = 216;
               break;
            case 11:
               var10000 = 177;
               break;
            case 12:
               var10000 = 155;
               break;
            case 13:
               var10000 = 124;
               break;
            case 14:
               var10000 = 131;
               break;
            case 15:
               var10000 = 246;
               break;
            case 16:
               var10000 = 230;
               break;
            case 17:
               var10000 = 239;
               break;
            case 18:
               var10000 = 13;
               break;
            case 19:
               var10000 = 129;
               break;
            case 20:
               var10000 = 25;
               break;
            case 21:
               var10000 = 42;
               break;
            case 22:
               var10000 = 103;
               break;
            case 23:
               var10000 = 70;
               break;
            case 24:
               var10000 = 24;
               break;
            case 25:
               var10000 = 204;
               break;
            case 26:
               var10000 = 132;
               break;
            case 27:
               var10000 = 44;
               break;
            case 28:
               var10000 = 206;
               break;
            case 29:
               var10000 = 224;
               break;
            case 30:
               var10000 = 22;
               break;
            case 31:
               var10000 = 250;
               break;
            case 32:
               var10000 = 253;
               break;
            case 33:
               var10000 = 144;
               break;
            case 34:
               var10000 = 179;
               break;
            case 35:
               var10000 = 83;
               break;
            case 36:
               var10000 = 105;
               break;
            case 37:
               var10000 = 43;
               break;
            case 38:
               var10000 = 54;
               break;
            case 39:
               var10000 = 90;
               break;
            case 40:
               var10000 = 38;
               break;
            case 41:
               var10000 = 9;
               break;
            case 42:
               var10000 = 77;
               break;
            case 43:
               var10000 = 201;
               break;
            case 44:
               var10000 = 178;
               break;
            case 45:
               var10000 = 142;
               break;
            case 46:
               var10000 = 219;
               break;
            case 47:
               var10000 = 183;
               break;
            case 48:
               var10000 = 115;
               break;
            case 49:
               var10000 = 182;
               break;
            case 50:
               var10000 = 223;
               break;
            case 51:
               var10000 = 117;
               break;
            case 52:
               var10000 = 154;
               break;
            case 53:
               var10000 = 28;
               break;
            case 54:
               var10000 = 220;
               break;
            case 55:
               var10000 = 227;
               break;
            case 56:
               var10000 = 199;
               break;
            case 57:
               var10000 = 85;
               break;
            case 58:
               var10000 = 71;
               break;
            case 59:
               var10000 = 76;
               break;
            case 60:
               var10000 = 120;
               break;
            case 61:
               var10000 = 7;
               break;
            case 62:
               var10000 = 20;
               break;
            case 63:
               var10000 = 12;
               break;
            case 64:
               var10000 = 159;
               break;
            case 65:
               var10000 = 167;
               break;
            case 66:
               var10000 = 189;
               break;
            case 67:
               var10000 = 113;
               break;
            case 68:
               var10000 = 245;
               break;
            case 69:
               var10000 = 2;
               break;
            case 70:
               var10000 = 192;
               break;
            case 71:
               var10000 = 136;
               break;
            case 72:
               var10000 = 148;
               break;
            case 73:
               var10000 = 80;
               break;
            case 74:
               var10000 = 143;
               break;
            case 75:
               var10000 = 125;
               break;
            case 76:
               var10000 = 23;
               break;
            case 77:
               var10000 = 184;
               break;
            case 78:
               var10000 = 160;
               break;
            case 79:
               var10000 = 33;
               break;
            case 80:
               var10000 = 237;
               break;
            case 81:
               var10000 = 87;
               break;
            case 82:
               var10000 = 98;
               break;
            case 83:
               var10000 = 58;
               break;
            case 84:
               var10000 = 61;
               break;
            case 85:
               var10000 = 164;
               break;
            case 86:
               var10000 = 153;
               break;
            case 87:
               var10000 = 157;
               break;
            case 88:
               var10000 = 200;
               break;
            case 89:
               var10000 = 215;
               break;
            case 90:
               var10000 = 111;
               break;
            case 91:
               var10000 = 242;
               break;
            case 92:
               var10000 = 56;
               break;
            case 93:
               var10000 = 96;
               break;
            case 94:
               var10000 = 35;
               break;
            case 95:
               var10000 = 209;
               break;
            case 96:
               var10000 = 162;
               break;
            case 97:
               var10000 = 19;
               break;
            case 98:
               var10000 = 31;
               break;
            case 99:
               var10000 = 161;
               break;
            case 100:
               var10000 = 36;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 46;
               break;
            case 103:
               var10000 = 158;
               break;
            case 104:
               var10000 = 109;
               break;
            case 105:
               var10000 = 248;
               break;
            case 106:
               var10000 = 16;
               break;
            case 107:
               var10000 = 188;
               break;
            case 108:
               var10000 = 86;
               break;
            case 109:
               var10000 = 63;
               break;
            case 110:
               var10000 = 140;
               break;
            case 111:
               var10000 = 49;
               break;
            case 112:
               var10000 = 82;
               break;
            case 113:
               var10000 = 213;
               break;
            case 114:
               var10000 = 114;
               break;
            case 115:
               var10000 = 231;
               break;
            case 116:
               var10000 = 110;
               break;
            case 117:
               var10000 = 6;
               break;
            case 118:
               var10000 = 156;
               break;
            case 119:
               var10000 = 170;
               break;
            case 120:
               var10000 = 60;
               break;
            case 121:
               var10000 = 99;
               break;
            case 122:
               var10000 = 163;
               break;
            case 123:
               var10000 = 97;
               break;
            case 124:
               var10000 = 11;
               break;
            case 125:
               var10000 = 221;
               break;
            case 126:
               var10000 = 5;
               break;
            case 127:
               var10000 = 118;
               break;
            case 128:
               var10000 = 72;
               break;
            case 129:
               var10000 = 174;
               break;
            case 130:
               var10000 = 225;
               break;
            case 131:
               var10000 = 252;
               break;
            case 132:
               var10000 = 91;
               break;
            case 133:
               var10000 = 100;
               break;
            case 134:
               var10000 = 241;
               break;
            case 135:
               var10000 = 222;
               break;
            case 136:
               var10000 = 141;
               break;
            case 137:
               var10000 = 37;
               break;
            case 138:
               var10000 = 208;
               break;
            case 139:
               var10000 = 130;
               break;
            case 140:
               var10000 = 232;
               break;
            case 141:
               var10000 = 108;
               break;
            case 142:
               var10000 = 79;
               break;
            case 143:
               var10000 = 135;
               break;
            case 144:
               var10000 = 145;
               break;
            case 145:
               var10000 = 68;
               break;
            case 146:
               var10000 = 234;
               break;
            case 147:
               var10000 = 75;
               break;
            case 148:
               var10000 = 149;
               break;
            case 149:
               var10000 = 198;
               break;
            case 150:
               var10000 = 106;
               break;
            case 151:
               var10000 = 30;
               break;
            case 152:
               var10000 = 51;
               break;
            case 153:
               var10000 = 107;
               break;
            case 154:
               var10000 = 190;
               break;
            case 155:
               var10000 = 81;
               break;
            case 156:
               var10000 = 202;
               break;
            case 157:
               var10000 = 226;
               break;
            case 158:
               var10000 = 59;
               break;
            case 159:
               var10000 = 94;
               break;
            case 160:
               var10000 = 40;
               break;
            case 161:
               var10000 = 123;
               break;
            case 162:
               var10000 = 34;
               break;
            case 163:
               var10000 = 52;
               break;
            case 164:
               var10000 = 191;
               break;
            case 165:
               var10000 = 21;
               break;
            case 166:
               var10000 = 92;
               break;
            case 167:
               var10000 = 122;
               break;
            case 168:
               var10000 = 233;
               break;
            case 169:
               var10000 = 169;
               break;
            case 170:
               var10000 = 203;
               break;
            case 171:
               var10000 = 180;
               break;
            case 172:
               var10000 = 93;
               break;
            case 173:
               var10000 = 243;
               break;
            case 174:
               var10000 = 29;
               break;
            case 175:
               var10000 = 254;
               break;
            case 176:
               var10000 = 17;
               break;
            case 177:
               var10000 = 139;
               break;
            case 178:
               var10000 = 102;
               break;
            case 179:
               var10000 = 39;
               break;
            case 180:
               var10000 = 150;
               break;
            case 181:
               var10000 = 235;
               break;
            case 182:
               var10000 = 212;
               break;
            case 183:
               var10000 = 8;
               break;
            case 184:
               var10000 = 116;
               break;
            case 185:
               var10000 = 1;
               break;
            case 186:
               var10000 = 55;
               break;
            case 187:
               var10000 = 57;
               break;
            case 188:
               var10000 = 4;
               break;
            case 189:
               var10000 = 32;
               break;
            case 190:
               var10000 = 84;
               break;
            case 191:
               var10000 = 197;
               break;
            case 192:
               var10000 = 210;
               break;
            case 193:
               var10000 = 67;
               break;
            case 194:
               var10000 = 95;
               break;
            case 195:
               var10000 = 166;
               break;
            case 196:
               var10000 = 218;
               break;
            case 197:
               var10000 = 193;
               break;
            case 198:
               var10000 = 186;
               break;
            case 199:
               var10000 = 138;
               break;
            case 200:
               var10000 = 168;
               break;
            case 201:
               var10000 = 171;
               break;
            case 202:
               var10000 = 62;
               break;
            case 203:
               var10000 = 112;
               break;
            case 204:
               var10000 = 126;
               break;
            case 205:
               var10000 = 88;
               break;
            case 206:
               var10000 = 146;
               break;
            case 207:
               var10000 = 78;
               break;
            case 208:
               var10000 = 64;
               break;
            case 209:
               var10000 = 10;
               break;
            case 210:
               var10000 = 14;
               break;
            case 211:
               var10000 = 45;
               break;
            case 212:
               var10000 = 26;
               break;
            case 213:
               var10000 = 205;
               break;
            case 214:
               var10000 = 104;
               break;
            case 215:
               var10000 = 251;
               break;
            case 216:
               var10000 = 151;
               break;
            case 217:
               var10000 = 244;
               break;
            case 218:
               var10000 = 247;
               break;
            case 219:
               var10000 = 50;
               break;
            case 220:
               var10000 = 196;
               break;
            case 221:
               var10000 = 211;
               break;
            case 222:
               var10000 = 134;
               break;
            case 223:
               var10000 = 74;
               break;
            case 224:
               var10000 = 249;
               break;
            case 225:
               var10000 = 238;
               break;
            case 226:
               var10000 = 119;
               break;
            case 227:
               var10000 = 176;
               break;
            case 228:
               var10000 = 65;
               break;
            case 229:
               var10000 = 53;
               break;
            case 230:
               var10000 = 240;
               break;
            case 231:
               var10000 = 194;
               break;
            case 232:
               var10000 = 152;
               break;
            case 233:
               var10000 = 175;
               break;
            case 234:
               var10000 = 214;
               break;
            case 235:
               var10000 = 229;
               break;
            case 236:
               var10000 = 185;
               break;
            case 237:
               var10000 = 172;
               break;
            case 238:
               var10000 = 18;
               break;
            case 239:
               var10000 = 69;
               break;
            case 240:
               var10000 = 228;
               break;
            case 241:
               var10000 = 133;
               break;
            case 242:
               var10000 = 47;
               break;
            case 243:
               var10000 = 89;
               break;
            case 244:
               var10000 = 128;
               break;
            case 245:
               var10000 = 41;
               break;
            case 246:
               var10000 = 181;
               break;
            case 247:
               var10000 = 27;
               break;
            case 248:
               var10000 = 236;
               break;
            case 249:
               var10000 = 66;
               break;
            case 250:
               var10000 = 165;
               break;
            case 251:
               var10000 = 0;
               break;
            case 252:
               var10000 = 48;
               break;
            case 253:
               var10000 = 147;
               break;
            case 254:
               var10000 = 121;
               break;
            default:
               var10000 = 127;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         var6 = ((var1 & 65535) >>> 8) - var4;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var24;
      int var5;
      boolean var6;
      String[] var7 = new String[19];
      var5 = 0;
      String[] var10000 = new String[3];
      String var4 = "\u0095èÜ\u0006\u00990ðÔ\u0093©\u0003ùáQ\u0004O\u0018í\u0002\u0005h8\u0096µ\u001e\u0004\u009f~÷Î\u0005\u000b¥ú\u0006\u0093\u0002¯e\u0006\u001fÃ ª\u0089f\u0004\u008e\u0093áW\u0004*ó\u0094©\u0004\u00ad8:Ó\u0007 \u001f\u001b?¾\u001f\b\u0005Æ\\ô®R\u0007ØÝ\u0004g]\u0014t\u0004\u0096Ñ\u0003í\u0005ñt\u0012«\u008e";
      var6 = "\u0095èÜ\u0006\u00990ðÔ\u0093©\u0003ùáQ\u0004O\u0018í\u0002\u0005h8\u0096µ\u001e\u0004\u009f~÷Î\u0005\u000b¥ú\u0006\u0093\u0002¯e\u0006\u001fÃ ª\u0089f\u0004\u008e\u0093áW\u0004*ó\u0094©\u0004\u00ad8:Ó\u0007 \u001f\u001b?¾\u001f\b\u0005Æ\\ô®R\u0007ØÝ\u0004g]\u0014t\u0004\u0096Ñ\u0003í\u0005ñt\u0012«\u008e";
         // [VF] .length();
      char var3 = 3;
      c(var10000);
      int var10 = -1;

      label52:
      while (true) {
         byte var11 = 71;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var29 = var10001.toCharArray();
               int var10004 = var29.length;
               int var8 = 0;
               byte var32 = var11;
               var24 = var29;
               int var17 = var10004;
               byte var37;
               char[] var41;
               int var10006;
               if (var10004 <= 1) {
                  var41 = var29;
                  var37 = var11;
                  var10006 = var8;
               } else {
                  var32 = var11;
                  var17 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var41 = var29;
                  var37 = var11;
                  var10006 = var8;
               }

               while (true) {
                  char var50 = var41[var10006];
                  byte var51;
                  switch (var8 % 7) {
                     case 0:
                        var51 = 101;
                        break;
                     case 1:
                        var51 = 31;
                        break;
                     case 2:
                        var51 = 93;
                        break;
                     case 3:
                        var51 = 126;
                        break;
                     case 4:
                        var51 = 62;
                        break;
                     case 5:
                        var51 = 24;
                        break;
                     default:
                        var51 = 16;
                  }

                  var41[var10006] = (char)(var50 ^ var37 ^ var51);
                  var8++;
                  if (var32 == 0) {
                     var10006 = var32;
                     var41 = var24;
                     var37 = var32;
                  } else {
                     if (var17 <= var8) {
                        break;
                     }

                     var41 = var24;
                     var37 = var32;
                     var10006 = var8;
                  }
               }
            }

            String var34 = new String(var24).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var34;
                  if ((var10 += var3) >= var6) {
                     b = var7;
                     c = new String[19];
                     long var0 = 5807032420183251998L;
                     long var28 = 2397698727922048069L ^ var0;
                     byte var19 = -1;
                     e = var28;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var34;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "^¬ê¡\u0004¯\tkä";
                  var6 = ("^¬ê¡\u0004¯\tkä".length()) != 0;
                  var3 = 4;
                  var10 = -1;
            }

            var11 = 29;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





