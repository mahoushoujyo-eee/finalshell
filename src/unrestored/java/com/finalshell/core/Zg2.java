package com.finalshell.core;

import java.lang.reflect.Type;
import java.util.Map;

public class Zg2 extends ZS implements X4 {
   public static Zg2 f;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   @Override
   public Object p(Yn4 param1, Type param2, Object param3, String param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 6
      // 005: aload 2
      // 006: ldc com/finalshell/ui/model/O0
      // 008: if_acmpne 02e
      // 00b: aload 1
      // 00c: aload 6
      // 00e: ifnonnull 02f
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: invokevirtual com/finalshell/core/Yn4.n ()Lcom/finalshell/core/Ni4;
      // 01b: ifnonnull 02e
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 1
      // 026: invokevirtual com/finalshell/core/Yn4.Q$O0 ()Lcom/finalshell/ui/model/O0;
      // 029: areturn
      // 02a: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 1
      // 02f: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 032: astore 7
      // 034: aload 7
      // 036: invokeinterface com/finalshell/core/P7.P ()I 1
      // 03b: aload 6
      // 03d: ifnonnull 06d
      // 040: sipush 6915
      // 043: ldc2_w 6790598615730430106
      // 046: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 049: if_icmpne 069
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: aload 7
      // 055: sipush 16807
      // 058: ldc2_w 5247168736837499426
      // 05b: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 05e: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 063: aconst_null
      // 064: areturn
      // 065: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: aload 2
      // 06a: instanceof java/lang/Class
      // 06d: aload 6
      // 06f: ifnonnull 096
      // 072: ifeq 0a9
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: sipush -3068
      // 07f: sipush 11572
      // 082: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 085: aload 2
      // 086: checkcast java/lang/Class
      // 089: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 08c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: aload 6
      // 098: ifnonnull 0a6
      // 09b: ifeq 0a9
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: bipush 1
      // 0a6: goto 0aa
      // 0a9: bipush 0
      // 0aa: istore 8
      // 0ac: aload 7
      // 0ae: invokeinterface com/finalshell/core/P7.A$int ()I 1
      // 0b3: getstatic com/finalshell/ui/model/Ks2_2.OrderedField Lcom/finalshell/ui/model/Ks2_2;
      // 0b6: getfield com/finalshell/ui/model/Ks2_2.mask I
      // 0b9: iand
      // 0ba: ifeq 0d0
      // 0bd: aload 0
      // 0be: aload 2
      // 0bf: aload 7
      // 0c1: invokeinterface com/finalshell/core/P7.A$int ()I 1
      // 0c6: invokevirtual com/finalshell/core/Zg2.V (Ljava/lang/reflect/Type;I)Ljava/util/Map;
      // 0c9: goto 0d5
      // 0cc: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: aload 2
      // 0d2: invokevirtual com/finalshell/core/Zg2.B (Ljava/lang/reflect/Type;)Ljava/util/Map;
      // 0d5: astore 9
      // 0d7: aload 1
      // 0d8: invokevirtual com/finalshell/core/Yn4.A$xM_3 ()Lcom/finalshell/core/XM3;
      // 0db: astore 10
      // 0dd: aload 1
      // 0de: aload 10
      // 0e0: aload 9
      // 0e2: aload 3
      // 0e3: invokevirtual com/finalshell/core/Yn4.L (Lcom/finalshell/core/XM3;Ljava/lang/Object;Ljava/lang/Object;)Lcom/finalshell/core/XM3;
      // 0e6: pop
      // 0e7: aload 0
      // 0e8: aload 1
      // 0e9: aload 2
      // 0ea: aload 3
      // 0eb: aload 9
      // 0ed: iload 5
      // 0ef: invokevirtual com/finalshell/core/Zg2.N (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/util/Map;I)Ljava/lang/Object;
      // 0f2: astore 11
      // 0f4: iload 8
      // 0f6: ifeq 103
      // 0f9: aload 11
      // 0fb: checkcast java/util/Map
      // 0fe: invokestatic java/util/Collections.unmodifiableMap (Ljava/util/Map;)Ljava/util/Map;
      // 101: astore 11
      // 103: aload 11
      // 105: astore 12
      // 107: aload 1
      // 108: aload 10
      // 10a: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 10d: aload 12
      // 10f: areturn
      // 110: astore 13
      // 112: aload 1
      // 113: aload 10
      // 115: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 118: aload 13
      // 11a: athrow
   }

   public Object c(Yn4 var1, Type var2, Object var3, Map var4) {
      return this.N(var1, var2, var3, var4, 0);
   }

   public Object N(Yn4 param1, Type param2, Object param3, Map param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 6
      // 05: aload 2
      // 06: aload 6
      // 08: ifnonnull 97
      // 0b: instanceof java/lang/reflect/ParameterizedType
      // 0e: ifeq 90
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 2
      // 19: checkcast java/lang/reflect/ParameterizedType
      // 1c: astore 7
      // 1e: aload 7
      // 20: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 25: bipush 0
      // 26: aaload
      // 27: astore 8
      // 29: aconst_null
      // 2a: astore 9
      // 2c: aload 4
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: aload 6
      // 33: ifnonnull 5f
      // 36: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 39: sipush -3045
      // 3c: sipush -26249
      // 3f: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 42: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45: ifeq 56
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: ldc java/util/List
      // 51: astore 9
      // 53: goto 61
      // 56: aload 7
      // 58: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 5d: bipush 1
      // 5e: aaload
      // 5f: astore 9
      // 61: ldc java/lang/String
      // 63: aload 6
      // 65: ifnonnull 8f
      // 68: aload 8
      // 6a: if_acmpne 84
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: aload 1
      // 75: aload 4
      // 77: aload 9
      // 79: aload 3
      // 7a: iload 5
      // 7c: invokestatic com/finalshell/core/Zg2.C (Lcom/finalshell/core/Yn4;Ljava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/util/Map;
      // 7f: areturn
      // 80: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: aload 1
      // 85: aload 4
      // 87: aload 8
      // 89: aload 9
      // 8b: aload 3
      // 8c: invokestatic com/finalshell/core/Zg2.R (Lcom/finalshell/core/Yn4;Ljava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
      // 8f: areturn
      // 90: aload 1
      // 91: aload 4
      // 93: aload 3
      // 94: invokevirtual com/finalshell/core/Yn4.B (Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
      // 97: areturn
   }

   public static Map q(Yn4 var0, Map var1, Type var2, Object var3) {
      return C(var0, var1, var2, var3, 0);
   }

   public static Map C(Yn4 param0, Map param1, Type param2, Object param3, int param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 004: astore 6
      // 006: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 009: aload 6
      // 00b: invokeinterface com/finalshell/core/P7.P ()I 1
      // 010: istore 7
      // 012: astore 5
      // 014: iload 7
      // 016: sipush 3249
      // 019: ldc2_w 914567480272566070
      // 01c: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 01f: aload 5
      // 021: ifnonnull 038
      // 024: if_icmpeq 186
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: iload 7
      // 030: bipush 4
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: if_icmpne 082
      // 03b: aload 6
      // 03d: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 042: astore 8
      // 044: aload 8
      // 046: invokevirtual java/lang/String.length ()I
      // 049: aload 5
      // 04b: ifnonnull 06d
      // 04e: ifeq 07c
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 8
      // 05a: sipush -3062
      // 05d: sipush 23850
      // 060: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 063: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 5
      // 06f: ifnonnull 0a8
      // 072: ifeq 082
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aconst_null
      // 07d: areturn
      // 07e: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: new java/lang/StringBuilder
      // 085: dup
      // 086: invokespecial java/lang/StringBuilder.<init> ()V
      // 089: sipush -3058
      // 08c: sipush -28721
      // 08f: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 092: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 095: aload 6
      // 097: invokeinterface com/finalshell/core/P7.B ()Ljava/lang/String; 1
      // 09c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a2: astore 8
      // 0a4: aload 3
      // 0a5: instanceof java/lang/String
      // 0a8: aload 5
      // 0aa: ifnonnull 123
      // 0ad: ifeq 0e9
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: new java/lang/StringBuilder
      // 0ba: dup
      // 0bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0be: aload 8
      // 0c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c3: sipush -3060
      // 0c6: sipush -9245
      // 0c9: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d2: astore 8
      // 0d4: new java/lang/StringBuilder
      // 0d7: dup
      // 0d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0db: aload 8
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: aload 3
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e7: astore 8
      // 0e9: new java/lang/StringBuilder
      // 0ec: dup
      // 0ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f0: aload 8
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: sipush -3071
      // 0f8: sipush -18504
      // 0fb: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 0fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 101: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 104: astore 8
      // 106: new java/lang/StringBuilder
      // 109: dup
      // 10a: invokespecial java/lang/StringBuilder.<init> ()V
      // 10d: aload 8
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: aload 6
      // 114: invokeinterface com/finalshell/core/P7.C$String ()Ljava/lang/String; 1
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11f: astore 8
      // 121: iload 7
      // 123: bipush 4
      // 124: if_icmpeq 17c
      // 127: new com/finalshell/ui/model/Oc2
      // 12a: dup
      // 12b: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 12e: astore 9
      // 130: aload 0
      // 131: aload 9
      // 133: aload 3
      // 134: invokevirtual com/finalshell/core/Yn4.p (Ljava/util/Collection;Ljava/lang/Object;)V
      // 137: aload 9
      // 139: aload 5
      // 13b: ifnonnull 159
      // 13e: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 141: bipush 1
      // 142: if_icmpne 17c
      // 145: goto 14c
      // 148: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: aload 9
      // 14e: bipush 0
      // 14f: invokevirtual com/finalshell/ui/model/Oc2.get (I)Ljava/lang/Object;
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: astore 10
      // 15b: aload 10
      // 15d: aload 5
      // 15f: ifnonnull 178
      // 162: instanceof com/finalshell/ui/model/O0
      // 165: ifeq 17c
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: aload 10
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: checkcast com/finalshell/ui/model/O0
      // 17b: areturn
      // 17c: new com/finalshell/core/Hi2
      // 17f: dup
      // 180: aload 8
      // 182: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 185: athrow
      // 186: aload 0
      // 187: invokevirtual com/finalshell/core/Yn4.A$xM_3 ()Lcom/finalshell/core/XM3;
      // 18a: astore 8
      // 18c: bipush 0
      // 18d: istore 9
      // 18f: aload 6
      // 191: invokeinterface com/finalshell/core/P7.N ()V 1
      // 196: aload 6
      // 198: invokeinterface com/finalshell/core/P7.w$char ()C 1
      // 19d: istore 10
      // 19f: aload 6
      // 1a1: getstatic com/finalshell/ui/model/Ks2_2.AllowArbitraryCommas Lcom/finalshell/ui/model/Ks2_2;
      // 1a4: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/ui/model/Ks2_2;)Z 2
      // 1a9: ifeq 1ef
      // 1ac: iload 10
      // 1ae: sipush 29581
      // 1b1: ldc2_w 6725216268795562001
      // 1b4: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 1b7: aload 5
      // 1b9: ifnonnull 1fa
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: if_icmpne 1ef
      // 1c6: aload 6
      // 1c8: invokeinterface com/finalshell/core/P7.C$char ()C 1
      // 1cd: pop
      // 1ce: aload 6
      // 1d0: invokeinterface com/finalshell/core/P7.N ()V 1
      // 1d5: aload 6
      // 1d7: invokeinterface com/finalshell/core/P7.w$char ()C 1
      // 1dc: istore 10
      // 1de: aload 5
      // 1e0: ifnonnull 275
      // 1e3: aload 5
      // 1e5: ifnull 1ac
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: iload 10
      // 1f1: sipush 4197
      // 1f4: ldc2_w 8325075964081515504
      // 1f7: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 1fa: aload 5
      // 1fc: ifnonnull 280
      // 1ff: if_icmpne 275
      // 202: goto 209
      // 205: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 208: athrow
      // 209: aload 6
      // 20b: aload 0
      // 20c: invokevirtual com/finalshell/core/Yn4.K ()Lcom/finalshell/core/O12;
      // 20f: sipush 21433
      // 212: ldc2_w 9026844957479528484
      // 215: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 218: invokeinterface com/finalshell/core/P7.z (Lcom/finalshell/core/O12;C)Ljava/lang/String; 3
      // 21d: astore 11
      // 21f: aload 6
      // 221: invokeinterface com/finalshell/core/P7.N ()V 1
      // 226: aload 6
      // 228: invokeinterface com/finalshell/core/P7.w$char ()C 1
      // 22d: istore 10
      // 22f: iload 10
      // 231: aload 5
      // 233: ifnonnull 42d
      // 236: sipush 4797
      // 239: ldc2_w 4324631835580475690
      // 23c: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 23f: if_icmpeq 417
      // 242: goto 249
      // 245: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 248: athrow
      // 249: new com/finalshell/core/Hi2
      // 24c: dup
      // 24d: new java/lang/StringBuilder
      // 250: dup
      // 251: invokespecial java/lang/StringBuilder.<init> ()V
      // 254: sipush -3043
      // 257: sipush 8548
      // 25a: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 25d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 260: aload 6
      // 262: invokeinterface com/finalshell/core/P7.R ()I 1
      // 267: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 26a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 26d: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 270: athrow
      // 271: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 274: athrow
      // 275: iload 10
      // 277: sipush 5313
      // 27a: ldc2_w 2408051561658494802
      // 27d: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 280: aload 5
      // 282: ifnonnull 2d1
      // 285: if_icmpne 2ba
      // 288: goto 28f
      // 28b: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28e: athrow
      // 28f: aload 6
      // 291: invokeinterface com/finalshell/core/P7.C$char ()C 1
      // 296: pop
      // 297: aload 6
      // 299: invokeinterface com/finalshell/core/P7.w$void ()V 1
      // 29e: aload 6
      // 2a0: sipush 16807
      // 2a3: ldc2_w 5247168736837499426
      // 2a6: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 2a9: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 2ae: aload 1
      // 2af: astore 12
      // 2b1: aload 0
      // 2b2: aload 8
      // 2b4: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 2b7: aload 12
      // 2b9: areturn
      // 2ba: iload 10
      // 2bc: aload 5
      // 2be: ifnonnull 38b
      // 2c1: sipush 1269
      // 2c4: ldc2_w 1084575406979432295
      // 2c7: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 2ca: goto 2d1
      // 2cd: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d0: athrow
      // 2d1: if_icmpne 375
      // 2d4: aload 6
      // 2d6: aload 5
      // 2d8: ifnonnull 30b
      // 2db: goto 2e2
      // 2de: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e1: athrow
      // 2e2: getstatic com/finalshell/ui/model/Ks2_2.AllowSingleQuotes Lcom/finalshell/ui/model/Ks2_2;
      // 2e5: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/ui/model/Ks2_2;)Z 2
      // 2ea: ifne 309
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: new com/finalshell/core/Hi2
      // 2f7: dup
      // 2f8: sipush -3057
      // 2fb: sipush -20177
      // 2fe: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 301: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 304: athrow
      // 305: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: aload 6
      // 30b: aload 0
      // 30c: invokevirtual com/finalshell/core/Yn4.K ()Lcom/finalshell/core/O12;
      // 30f: sipush 11229
      // 312: ldc2_w 5280097439165845573
      // 315: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 318: invokeinterface com/finalshell/core/P7.z (Lcom/finalshell/core/O12;C)Ljava/lang/String; 3
      // 31d: astore 11
      // 31f: aload 6
      // 321: invokeinterface com/finalshell/core/P7.N ()V 1
      // 326: aload 6
      // 328: invokeinterface com/finalshell/core/P7.w$char ()C 1
      // 32d: istore 10
      // 32f: iload 10
      // 331: aload 5
      // 333: ifnonnull 42d
      // 336: sipush 27833
      // 339: ldc2_w 6704066730693416767
      // 33c: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 33f: if_icmpeq 417
      // 342: goto 349
      // 345: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 348: athrow
      // 349: new com/finalshell/core/Hi2
      // 34c: dup
      // 34d: new java/lang/StringBuilder
      // 350: dup
      // 351: invokespecial java/lang/StringBuilder.<init> ()V
      // 354: sipush -3059
      // 357: sipush -9126
      // 35a: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 35d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 360: aload 6
      // 362: invokeinterface com/finalshell/core/P7.R ()I 1
      // 367: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 36a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 36d: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 370: athrow
      // 371: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 374: athrow
      // 375: aload 6
      // 377: aload 5
      // 379: ifnonnull 3a5
      // 37c: getstatic com/finalshell/ui/model/Ks2_2.AllowUnQuotedFieldNames Lcom/finalshell/ui/model/Ks2_2;
      // 37f: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/ui/model/Ks2_2;)Z 2
      // 384: goto 38b
      // 387: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38a: athrow
      // 38b: ifne 3a3
      // 38e: new com/finalshell/core/Hi2
      // 391: dup
      // 392: sipush -3064
      // 395: sipush -26654
      // 398: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 39b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 39e: athrow
      // 39f: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a2: athrow
      // 3a3: aload 6
      // 3a5: aload 0
      // 3a6: invokevirtual com/finalshell/core/Yn4.K ()Lcom/finalshell/core/O12;
      // 3a9: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/core/O12;)Ljava/lang/String; 2
      // 3ae: astore 11
      // 3b0: aload 6
      // 3b2: invokeinterface com/finalshell/core/P7.N ()V 1
      // 3b7: aload 6
      // 3b9: invokeinterface com/finalshell/core/P7.w$char ()C 1
      // 3be: istore 10
      // 3c0: iload 10
      // 3c2: aload 5
      // 3c4: ifnonnull 42d
      // 3c7: sipush 27833
      // 3ca: ldc2_w 6704066730693416767
      // 3cd: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 3d0: if_icmpeq 417
      // 3d3: goto 3da
      // 3d6: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d9: athrow
      // 3da: new com/finalshell/core/Hi2
      // 3dd: dup
      // 3de: new java/lang/StringBuilder
      // 3e1: dup
      // 3e2: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e5: sipush -3059
      // 3e8: sipush -9126
      // 3eb: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 3ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f1: aload 6
      // 3f3: invokeinterface com/finalshell/core/P7.R ()I 1
      // 3f8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3fb: sipush -3066
      // 3fe: sipush 2031
      // 401: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 404: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 407: iload 10
      // 409: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 40c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 40f: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 412: athrow
      // 413: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 416: athrow
      // 417: aload 6
      // 419: invokeinterface com/finalshell/core/P7.C$char ()C 1
      // 41e: pop
      // 41f: aload 6
      // 421: invokeinterface com/finalshell/core/P7.N ()V 1
      // 426: aload 6
      // 428: invokeinterface com/finalshell/core/P7.w$char ()C 1
      // 42d: istore 10
      // 42f: aload 6
      // 431: invokeinterface com/finalshell/core/P7.w$void ()V 1
      // 436: aload 5
      // 438: ifnonnull 615
      // 43b: aload 11
      // 43d: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 440: if_acmpne 60e
      // 443: goto 44a
      // 446: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 449: athrow
      // 44a: aload 6
      // 44c: getstatic com/finalshell/ui/model/Ks2_2.DisableSpecialKeyDetect Lcom/finalshell/ui/model/Ks2_2;
      // 44f: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/ui/model/Ks2_2;)Z 2
      // 454: aload 5
      // 456: ifnonnull 617
      // 459: goto 460
      // 45c: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45f: athrow
      // 460: ifne 60e
      // 463: goto 46a
      // 466: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 469: athrow
      // 46a: iload 4
      // 46c: getstatic com/finalshell/ui/model/Ks2_2.DisableSpecialKeyDetect Lcom/finalshell/ui/model/Ks2_2;
      // 46f: invokestatic com/finalshell/ui/model/Ks2_2.D (ILcom/finalshell/ui/model/Ks2_2;)Z
      // 472: aload 5
      // 474: ifnonnull 617
      // 477: goto 47e
      // 47a: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47d: athrow
      // 47e: ifne 60e
      // 481: goto 488
      // 484: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 487: athrow
      // 488: aload 6
      // 48a: aload 0
      // 48b: invokevirtual com/finalshell/core/Yn4.K ()Lcom/finalshell/core/O12;
      // 48e: sipush 21433
      // 491: ldc2_w 9026844957479528484
      // 494: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 497: invokeinterface com/finalshell/core/P7.z (Lcom/finalshell/core/O12;C)Ljava/lang/String; 3
      // 49c: astore 12
      // 49e: aload 0
      // 49f: invokevirtual com/finalshell/core/Yn4.L ()Lcom/finalshell/core/IG;
      // 4a2: astore 13
      // 4a4: aload 12
      // 4a6: sipush -3041
      // 4a9: sipush 8229
      // 4ac: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 4af: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4b2: aload 5
      // 4b4: ifnonnull 4e0
      // 4b7: ifeq 4cb
      // 4ba: goto 4c1
      // 4bd: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c0: athrow
      // 4c1: ldc_w java/util/HashMap
      // 4c4: astore 14
      // 4c6: aload 5
      // 4c8: ifnull 539
      // 4cb: aload 12
      // 4cd: sipush -3069
      // 4d0: sipush 3802
      // 4d3: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 4d6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4d9: goto 4e0
      // 4dc: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4df: athrow
      // 4e0: aload 5
      // 4e2: ifnonnull 511
      // 4e5: ifeq 4f9
      // 4e8: goto 4ef
      // 4eb: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ee: athrow
      // 4ef: ldc_w java/util/LinkedHashMap
      // 4f2: astore 14
      // 4f4: aload 5
      // 4f6: ifnull 539
      // 4f9: aload 13
      // 4fb: aload 5
      // 4fd: ifnonnull 520
      // 500: goto 507
      // 503: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 506: athrow
      // 507: invokevirtual com/finalshell/core/IG.a ()Z
      // 50a: goto 511
      // 50d: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 510: athrow
      // 511: ifeq 51e
      // 514: ldc_w java/util/HashMap
      // 517: astore 14
      // 519: aload 5
      // 51b: ifnull 539
      // 51e: aload 13
      // 520: aload 12
      // 522: aconst_null
      // 523: aload 6
      // 525: invokeinterface com/finalshell/core/P7.A$int ()I 1
      // 52a: invokevirtual com/finalshell/core/IG.P (Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;
      // 52d: astore 14
      // 52f: goto 539
      // 532: astore 15
      // 534: ldc_w java/util/HashMap
      // 537: astore 14
      // 539: ldc java/util/Map
      // 53b: aload 14
      // 53d: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 540: aload 5
      // 542: ifnonnull 579
      // 545: ifeq 5a1
      // 548: goto 54f
      // 54b: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54e: athrow
      // 54f: aload 6
      // 551: sipush 16807
      // 554: ldc2_w 5247168736837499426
      // 557: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 55a: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 55f: aload 5
      // 561: ifnonnull 708
      // 564: goto 56b
      // 567: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56a: athrow
      // 56b: aload 6
      // 56d: invokeinterface com/finalshell/core/P7.P ()I 1
      // 572: goto 579
      // 575: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 578: athrow
      // 579: sipush 15709
      // 57c: ldc2_w 3317625319738509003
      // 57f: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 582: if_icmpne 705
      // 585: aload 6
      // 587: sipush 16807
      // 58a: ldc2_w 5247168736837499426
      // 58d: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 590: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 595: aload 1
      // 596: astore 15
      // 598: aload 0
      // 599: aload 8
      // 59b: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 59e: aload 15
      // 5a0: areturn
      // 5a1: aload 13
      // 5a3: aload 14
      // 5a5: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 5a8: astore 15
      // 5aa: aload 6
      // 5ac: sipush 16807
      // 5af: ldc2_w 5247168736837499426
      // 5b2: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 5b5: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 5ba: aload 0
      // 5bb: bipush 2
      // 5bc: invokevirtual com/finalshell/core/Yn4.l (I)V
      // 5bf: aload 8
      // 5c1: aload 5
      // 5c3: ifnonnull 600
      // 5c6: ifnull 5f5
      // 5c9: goto 5d0
      // 5cc: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5cf: athrow
      // 5d0: aload 3
      // 5d1: aload 5
      // 5d3: ifnonnull 600
      // 5d6: goto 5dd
      // 5d9: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5dc: athrow
      // 5dd: instanceof java/lang/Integer
      // 5e0: ifne 5f5
      // 5e3: goto 5ea
      // 5e6: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e9: athrow
      // 5ea: aload 0
      // 5eb: invokevirtual com/finalshell/core/Yn4.A$void ()V
      // 5ee: goto 5f5
      // 5f1: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f4: athrow
      // 5f5: aload 15
      // 5f7: aload 0
      // 5f8: aload 14
      // 5fa: aload 3
      // 5fb: invokeinterface com/finalshell/core/X4.z (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 600: checkcast java/util/Map
      // 603: astore 16
      // 605: aload 0
      // 606: aload 8
      // 608: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 60b: aload 16
      // 60d: areturn
      // 60e: aload 6
      // 610: invokeinterface com/finalshell/core/P7.K ()V 1
      // 615: iload 9
      // 617: aload 5
      // 619: ifnonnull 646
      // 61c: ifeq 633
      // 61f: goto 626
      // 622: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 625: athrow
      // 626: aload 0
      // 627: aload 8
      // 629: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 62c: goto 633
      // 62f: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 632: athrow
      // 633: aload 6
      // 635: aload 5
      // 637: ifnonnull 66f
      // 63a: invokeinterface com/finalshell/core/P7.P ()I 1
      // 63f: goto 646
      // 642: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 645: athrow
      // 646: sipush 21883
      // 649: ldc2_w 3506113326831759087
      // 64c: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 64f: if_icmpne 661
      // 652: aconst_null
      // 653: astore 12
      // 655: aload 6
      // 657: invokeinterface com/finalshell/core/P7.K ()V 1
      // 65c: aload 5
      // 65e: ifnull 671
      // 661: aload 0
      // 662: aload 2
      // 663: aload 11
      // 665: invokevirtual com/finalshell/core/Yn4.r (Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
      // 668: goto 66f
      // 66b: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66e: athrow
      // 66f: astore 12
      // 671: aload 1
      // 672: aload 11
      // 674: aload 12
      // 676: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 67b: pop
      // 67c: aload 0
      // 67d: aload 1
      // 67e: aload 11
      // 680: invokevirtual com/finalshell/core/Yn4.f (Ljava/util/Map;Ljava/lang/Object;)V
      // 683: aload 0
      // 684: aload 8
      // 686: aload 12
      // 688: aload 11
      // 68a: invokevirtual com/finalshell/core/Yn4.L (Lcom/finalshell/core/XM3;Ljava/lang/Object;Ljava/lang/Object;)Lcom/finalshell/core/XM3;
      // 68d: pop
      // 68e: aload 0
      // 68f: aload 8
      // 691: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 694: aload 6
      // 696: invokeinterface com/finalshell/core/P7.P ()I 1
      // 69b: istore 13
      // 69d: iload 13
      // 69f: sipush 11524
      // 6a2: ldc2_w 6238264722950231706
      // 6a5: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 6a8: aload 5
      // 6aa: ifnonnull 6c9
      // 6ad: if_icmpeq 6d8
      // 6b0: goto 6b7
      // 6b3: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b6: athrow
      // 6b7: iload 13
      // 6b9: sipush 14401
      // 6bc: ldc2_w 3209364820264879056
      // 6bf: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 6c2: goto 6c9
      // 6c5: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c8: athrow
      // 6c9: aload 5
      // 6cb: ifnonnull 6ef
      // 6ce: if_icmpne 6e4
      // 6d1: goto 6d8
      // 6d4: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d7: athrow
      // 6d8: aload 1
      // 6d9: astore 14
      // 6db: aload 0
      // 6dc: aload 8
      // 6de: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 6e1: aload 14
      // 6e3: areturn
      // 6e4: iload 13
      // 6e6: sipush 15709
      // 6e9: ldc2_w 3317625319738509003
      // 6ec: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 6ef: if_icmpne 705
      // 6f2: aload 6
      // 6f4: invokeinterface com/finalshell/core/P7.K ()V 1
      // 6f9: aload 1
      // 6fa: astore 14
      // 6fc: aload 0
      // 6fd: aload 8
      // 6ff: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 702: aload 14
      // 704: areturn
      // 705: iinc 9 1
      // 708: goto 18f
      // 70b: astore 17
      // 70d: aload 0
      // 70e: aload 8
      // 710: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 713: aload 17
      // 715: athrow
   }

   public static Object R(Yn4 param0, Map param1, Type param2, Type param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 007: astore 6
      // 009: astore 5
      // 00b: aload 6
      // 00d: invokeinterface com/finalshell/core/P7.P ()I 1
      // 012: sipush 31719
      // 015: ldc2_w 4589530058161078397
      // 018: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 01b: aload 5
      // 01d: ifnonnull 041
      // 020: if_icmpeq 070
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: aload 6
      // 02c: invokeinterface com/finalshell/core/P7.P ()I 1
      // 031: sipush 28813
      // 034: ldc2_w 3710124582084201245
      // 037: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: if_icmpeq 070
      // 044: new com/finalshell/core/Hi2
      // 047: dup
      // 048: new java/lang/StringBuilder
      // 04b: dup
      // 04c: invokespecial java/lang/StringBuilder.<init> ()V
      // 04f: sipush -3063
      // 052: sipush -17931
      // 055: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 058: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05b: aload 6
      // 05d: invokeinterface com/finalshell/core/P7.B ()Ljava/lang/String; 1
      // 062: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 065: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 068: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 06b: athrow
      // 06c: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: aload 0
      // 071: invokevirtual com/finalshell/core/Yn4.L ()Lcom/finalshell/core/IG;
      // 074: aload 2
      // 075: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 078: astore 7
      // 07a: aload 0
      // 07b: invokevirtual com/finalshell/core/Yn4.L ()Lcom/finalshell/core/IG;
      // 07e: aload 3
      // 07f: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 082: astore 8
      // 084: aload 6
      // 086: aload 7
      // 088: invokeinterface com/finalshell/core/X4.j ()I 1
      // 08d: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 092: aload 0
      // 093: invokevirtual com/finalshell/core/Yn4.A$xM_3 ()Lcom/finalshell/core/XM3;
      // 096: astore 9
      // 098: aload 6
      // 09a: invokeinterface com/finalshell/core/P7.P ()I 1
      // 09f: sipush 19961
      // 0a2: ldc2_w 2955706351552656998
      // 0a5: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 0a8: if_icmpne 0cc
      // 0ab: aload 6
      // 0ad: sipush 16807
      // 0b0: ldc2_w 5247168736837499426
      // 0b3: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 0b6: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 0bb: aload 5
      // 0bd: ifnonnull 25c
      // 0c0: aload 5
      // 0c2: ifnull 46a
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 6
      // 0ce: invokeinterface com/finalshell/core/P7.P ()I 1
      // 0d3: aload 5
      // 0d5: ifnonnull 262
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: bipush 4
      // 0e0: if_icmpne 25c
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 6
      // 0ec: invokeinterface com/finalshell/core/P7.p ()Z 1
      // 0f1: aload 5
      // 0f3: ifnonnull 262
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: ifeq 25c
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: aload 6
      // 109: getstatic com/finalshell/ui/model/Ks2_2.DisableSpecialKeyDetect Lcom/finalshell/ui/model/Ks2_2;
      // 10c: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/ui/model/Ks2_2;)Z 2
      // 111: aload 5
      // 113: ifnonnull 262
      // 116: goto 11d
      // 119: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: ifne 25c
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aconst_null
      // 128: astore 10
      // 12a: aload 6
      // 12c: bipush 4
      // 12d: invokeinterface com/finalshell/core/P7.e (I)V 2
      // 132: aload 6
      // 134: aload 5
      // 136: ifnonnull 152
      // 139: invokeinterface com/finalshell/core/P7.P ()I 1
      // 13e: bipush 4
      // 13f: if_icmpne 1d0
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 148: athrow
      // 149: aload 6
      // 14b: goto 152
      // 14e: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 157: astore 11
      // 159: sipush -3072
      // 15c: sipush 11001
      // 15f: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 162: aload 11
      // 164: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 167: aload 5
      // 169: ifnonnull 18f
      // 16c: ifeq 187
      // 16f: goto 176
      // 172: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: aload 9
      // 178: getfield com/finalshell/core/XM3.G Lcom/finalshell/core/XM3;
      // 17b: astore 12
      // 17d: aload 12
      // 17f: getfield com/finalshell/core/XM3.T Ljava/lang/Object;
      // 182: astore 10
      // 184: goto 1cd
      // 187: ldc_w "$"
      // 18a: aload 11
      // 18c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 18f: ifeq 1b9
      // 192: aload 9
      // 194: astore 12
      // 196: aload 12
      // 198: getfield com/finalshell/core/XM3.G Lcom/finalshell/core/XM3;
      // 19b: ifnull 1af
      // 19e: aload 12
      // 1a0: getfield com/finalshell/core/XM3.G Lcom/finalshell/core/XM3;
      // 1a3: aload 5
      // 1a5: ifnonnull 1b4
      // 1a8: astore 12
      // 1aa: aload 5
      // 1ac: ifnull 196
      // 1af: aload 12
      // 1b1: getfield com/finalshell/core/XM3.T Ljava/lang/Object;
      // 1b4: astore 10
      // 1b6: goto 1cd
      // 1b9: aload 0
      // 1ba: new com/finalshell/core/N_2_2
      // 1bd: dup
      // 1be: aload 9
      // 1c0: aload 11
      // 1c2: invokespecial com/finalshell/core/N_2_2.<init> (Lcom/finalshell/core/XM3;Ljava/lang/String;)V
      // 1c5: invokevirtual com/finalshell/core/Yn4.O (Lcom/finalshell/core/N_2_2;)V
      // 1c8: aload 0
      // 1c9: bipush 1
      // 1ca: invokevirtual com/finalshell/core/Yn4.l (I)V
      // 1cd: goto 1fb
      // 1d0: new com/finalshell/core/Hi2
      // 1d3: dup
      // 1d4: new java/lang/StringBuilder
      // 1d7: dup
      // 1d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1db: sipush -3061
      // 1de: sipush -30546
      // 1e1: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: aload 6
      // 1e9: invokeinterface com/finalshell/core/P7.P ()I 1
      // 1ee: invokestatic com/finalshell/core/Ge2.g (I)Ljava/lang/String;
      // 1f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f7: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1fa: athrow
      // 1fb: aload 6
      // 1fd: sipush 15709
      // 200: ldc2_w 3317625319738509003
      // 203: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 206: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 20b: aload 6
      // 20d: aload 5
      // 20f: ifnonnull 25b
      // 212: invokeinterface com/finalshell/core/P7.P ()I 1
      // 217: sipush 15709
      // 21a: ldc2_w 3317625319738509003
      // 21d: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 220: if_icmpeq 23f
      // 223: goto 22a
      // 226: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 229: athrow
      // 22a: new com/finalshell/core/Hi2
      // 22d: dup
      // 22e: sipush -3070
      // 231: sipush -22877
      // 234: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 237: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 23a: athrow
      // 23b: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23e: athrow
      // 23f: aload 6
      // 241: sipush 16807
      // 244: ldc2_w 5247168736837499426
      // 247: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 24a: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 24f: aload 10
      // 251: astore 11
      // 253: aload 0
      // 254: aload 9
      // 256: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 259: aload 11
      // 25b: areturn
      // 25c: aload 1
      // 25d: invokeinterface java/util/Map.size ()I 1
      // 262: aload 5
      // 264: ifnonnull 344
      // 267: ifne 331
      // 26a: goto 271
      // 26d: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 270: athrow
      // 271: aload 6
      // 273: invokeinterface com/finalshell/core/P7.P ()I 1
      // 278: bipush 4
      // 279: aload 5
      // 27b: ifnonnull 345
      // 27e: goto 285
      // 281: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 284: athrow
      // 285: if_icmpne 331
      // 288: goto 28f
      // 28b: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28e: athrow
      // 28f: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 292: aload 6
      // 294: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 299: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 29c: aload 5
      // 29e: ifnonnull 344
      // 2a1: goto 2a8
      // 2a4: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: ifeq 331
      // 2ab: goto 2b2
      // 2ae: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b1: athrow
      // 2b2: aload 6
      // 2b4: getstatic com/finalshell/ui/model/Ks2_2.DisableSpecialKeyDetect Lcom/finalshell/ui/model/Ks2_2;
      // 2b7: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/ui/model/Ks2_2;)Z 2
      // 2bc: aload 5
      // 2be: ifnonnull 344
      // 2c1: goto 2c8
      // 2c4: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c7: athrow
      // 2c8: ifne 331
      // 2cb: goto 2d2
      // 2ce: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d1: athrow
      // 2d2: aload 6
      // 2d4: bipush 4
      // 2d5: invokeinterface com/finalshell/core/P7.e (I)V 2
      // 2da: aload 6
      // 2dc: sipush 16807
      // 2df: ldc2_w 5247168736837499426
      // 2e2: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 2e5: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 2ea: aload 6
      // 2ec: aload 5
      // 2ee: ifnonnull 325
      // 2f1: goto 2f8
      // 2f4: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f7: athrow
      // 2f8: invokeinterface com/finalshell/core/P7.P ()I 1
      // 2fd: sipush 15709
      // 300: ldc2_w 3317625319738509003
      // 303: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 306: if_icmpne 323
      // 309: goto 310
      // 30c: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30f: athrow
      // 310: aload 6
      // 312: invokeinterface com/finalshell/core/P7.K ()V 1
      // 317: aload 1
      // 318: astore 10
      // 31a: aload 0
      // 31b: aload 9
      // 31d: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 320: aload 10
      // 322: areturn
      // 323: aload 6
      // 325: aload 7
      // 327: invokeinterface com/finalshell/core/X4.j ()I 1
      // 32c: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 331: aload 6
      // 333: aload 5
      // 335: ifnonnull 3b7
      // 338: invokeinterface com/finalshell/core/P7.P ()I 1
      // 33d: goto 344
      // 340: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 343: athrow
      // 344: bipush 4
      // 345: if_icmpne 3a6
      // 348: aload 7
      // 34a: aload 5
      // 34c: ifnonnull 3b7
      // 34f: goto 356
      // 352: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 355: athrow
      // 356: instanceof com/finalshell/core/Ep4
      // 359: ifeq 3a6
      // 35c: goto 363
      // 35f: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 362: athrow
      // 363: aload 6
      // 365: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 36a: astore 11
      // 36c: aload 6
      // 36e: invokeinterface com/finalshell/core/P7.K ()V 1
      // 373: new com/finalshell/core/Yn4
      // 376: dup
      // 377: aload 11
      // 379: aload 0
      // 37a: invokevirtual com/finalshell/core/Yn4.L ()Lcom/finalshell/core/IG;
      // 37d: aload 0
      // 37e: invokevirtual com/finalshell/core/Yn4.E ()Lcom/finalshell/core/P7;
      // 381: invokeinterface com/finalshell/core/P7.A$int ()I 1
      // 386: invokespecial com/finalshell/core/Yn4.<init> (Ljava/lang/String;Lcom/finalshell/core/IG;I)V
      // 389: astore 12
      // 38b: aload 12
      // 38d: aload 0
      // 38e: invokevirtual com/finalshell/core/Yn4.m ()Ljava/lang/String;
      // 391: invokevirtual com/finalshell/core/Yn4.B (Ljava/lang/String;)V
      // 394: aload 7
      // 396: aload 12
      // 398: aload 2
      // 399: aconst_null
      // 39a: invokeinterface com/finalshell/core/X4.z (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 39f: astore 10
      // 3a1: aload 5
      // 3a3: ifnull 3b9
      // 3a6: aload 7
      // 3a8: aload 0
      // 3a9: aload 2
      // 3aa: aconst_null
      // 3ab: invokeinterface com/finalshell/core/X4.z (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 3b0: goto 3b7
      // 3b3: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b6: athrow
      // 3b7: astore 10
      // 3b9: aload 6
      // 3bb: aload 5
      // 3bd: ifnonnull 41d
      // 3c0: invokeinterface com/finalshell/core/P7.P ()I 1
      // 3c5: sipush 28569
      // 3c8: ldc2_w 595573097697825794
      // 3cb: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 3ce: if_icmpeq 404
      // 3d1: goto 3d8
      // 3d4: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d7: athrow
      // 3d8: new com/finalshell/core/Hi2
      // 3db: dup
      // 3dc: new java/lang/StringBuilder
      // 3df: dup
      // 3e0: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e3: sipush -3042
      // 3e6: sipush -10353
      // 3e9: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 3ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ef: aload 6
      // 3f1: invokeinterface com/finalshell/core/P7.P ()I 1
      // 3f6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3fc: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 3ff: athrow
      // 400: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 403: athrow
      // 404: aload 6
      // 406: aload 8
      // 408: invokeinterface com/finalshell/core/X4.j ()I 1
      // 40d: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 412: aload 8
      // 414: aload 0
      // 415: aload 3
      // 416: aload 10
      // 418: invokeinterface com/finalshell/core/X4.z (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 41d: astore 11
      // 41f: aload 0
      // 420: aload 1
      // 421: aload 10
      // 423: invokevirtual com/finalshell/core/Yn4.f (Ljava/util/Map;Ljava/lang/Object;)V
      // 426: aload 1
      // 427: aload 10
      // 429: aload 11
      // 42b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 430: pop
      // 431: aload 6
      // 433: aload 5
      // 435: ifnonnull 459
      // 438: invokeinterface com/finalshell/core/P7.P ()I 1
      // 43d: sipush 16807
      // 440: ldc2_w 5247168736837499426
      // 443: invokestatic com/finalshell/core/Zg2.a (IJ)I
      // 446: if_icmpne 465
      // 449: goto 450
      // 44c: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44f: athrow
      // 450: aload 6
      // 452: goto 459
      // 455: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 458: athrow
      // 459: aload 7
      // 45b: invokeinterface com/finalshell/core/X4.j ()I 1
      // 460: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 465: aload 5
      // 467: ifnull 098
      // 46a: aload 0
      // 46b: aload 9
      // 46d: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 470: goto 47e
      // 473: astore 13
      // 475: aload 0
      // 476: aload 9
      // 478: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 47b: aload 13
      // 47d: athrow
      // 47e: aload 1
      // 47f: areturn
   }

   public Map B(Type var1) {
      return this.V(var1, Ok2.a);
   }

   public Map V(Type param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 3
      // 004: aload 1
      // 005: ldc_w java/util/Properties
      // 008: aload 3
      // 009: ifnonnull 026
      // 00c: if_acmpne 022
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: new java/util/Properties
      // 019: dup
      // 01a: invokespecial java/util/Properties.<init> ()V
      // 01d: areturn
      // 01e: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: aload 1
      // 023: ldc_w java/util/Hashtable
      // 026: aload 3
      // 027: ifnonnull 044
      // 02a: if_acmpne 040
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: new java/util/Hashtable
      // 037: dup
      // 038: invokespecial java/util/Hashtable.<init> ()V
      // 03b: areturn
      // 03c: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: aload 1
      // 041: ldc_w java/util/IdentityHashMap
      // 044: aload 3
      // 045: ifnonnull 062
      // 048: if_acmpne 05e
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: new java/util/IdentityHashMap
      // 055: dup
      // 056: invokespecial java/util/IdentityHashMap.<init> ()V
      // 059: areturn
      // 05a: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 1
      // 05f: ldc_w java/util/SortedMap
      // 062: aload 3
      // 063: ifnonnull 07b
      // 066: if_acmpeq 089
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: aload 1
      // 071: ldc_w java/util/TreeMap
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: aload 3
      // 07c: ifnonnull 099
      // 07f: if_acmpne 095
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: new java/util/TreeMap
      // 08c: dup
      // 08d: invokespecial java/util/TreeMap.<init> ()V
      // 090: areturn
      // 091: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: aload 1
      // 096: ldc_w java/util/concurrent/ConcurrentMap
      // 099: aload 3
      // 09a: ifnonnull 0b2
      // 09d: if_acmpeq 0c0
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: aload 1
      // 0a8: ldc_w java/util/concurrent/ConcurrentHashMap
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 3
      // 0b3: ifnonnull 0cf
      // 0b6: if_acmpne 0cc
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: new java/util/concurrent/ConcurrentHashMap
      // 0c3: dup
      // 0c4: invokespecial java/util/concurrent/ConcurrentHashMap.<init> ()V
      // 0c7: areturn
      // 0c8: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 1
      // 0cd: ldc java/util/Map
      // 0cf: aload 3
      // 0d0: ifnonnull 109
      // 0d3: if_acmpne 105
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: iload 2
      // 0de: getstatic com/finalshell/ui/model/Ks2_2.OrderedField Lcom/finalshell/ui/model/Ks2_2;
      // 0e1: getfield com/finalshell/ui/model/Ks2_2.mask I
      // 0e4: iand
      // 0e5: ifeq 0fd
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: new java/util/LinkedHashMap
      // 0f2: dup
      // 0f3: invokespecial java/util/LinkedHashMap.<init> ()V
      // 0f6: goto 104
      // 0f9: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: new java/util/HashMap
      // 100: dup
      // 101: invokespecial java/util/HashMap.<init> ()V
      // 104: areturn
      // 105: aload 1
      // 106: ldc_w java/util/HashMap
      // 109: aload 3
      // 10a: ifnonnull 132
      // 10d: if_acmpne 123
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: new java/util/HashMap
      // 11a: dup
      // 11b: invokespecial java/util/HashMap.<init> ()V
      // 11e: areturn
      // 11f: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: aload 1
      // 124: aload 3
      // 125: ifnonnull 142
      // 128: ldc_w java/util/LinkedHashMap
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: if_acmpne 141
      // 135: new java/util/LinkedHashMap
      // 138: dup
      // 139: invokespecial java/util/LinkedHashMap.<init> ()V
      // 13c: areturn
      // 13d: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: aload 1
      // 142: aload 3
      // 143: ifnonnull 18e
      // 146: instanceof java/lang/reflect/ParameterizedType
      // 149: ifeq 18d
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152: athrow
      // 153: aload 1
      // 154: checkcast java/lang/reflect/ParameterizedType
      // 157: astore 4
      // 159: aload 4
      // 15b: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 160: astore 5
      // 162: ldc_w java/util/EnumMap
      // 165: aload 5
      // 167: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 16a: ifeq 185
      // 16d: aload 4
      // 16f: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 174: astore 6
      // 176: new java/util/EnumMap
      // 179: dup
      // 17a: aload 6
      // 17c: bipush 0
      // 17d: aaload
      // 17e: checkcast java/lang/Class
      // 181: invokespecial java/util/EnumMap.<init> (Ljava/lang/Class;)V
      // 184: areturn
      // 185: aload 0
      // 186: aload 5
      // 188: iload 2
      // 189: invokevirtual com/finalshell/core/Zg2.V (Ljava/lang/reflect/Type;I)Ljava/util/Map;
      // 18c: areturn
      // 18d: aload 1
      // 18e: checkcast java/lang/Class
      // 191: astore 4
      // 193: aload 4
      // 195: invokevirtual java/lang/Class.isInterface ()Z
      // 198: aload 3
      // 199: ifnonnull 1e8
      // 19c: ifeq 1cc
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: new com/finalshell/core/Hi2
      // 1a9: dup
      // 1aa: new java/lang/StringBuilder
      // 1ad: dup
      // 1ae: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b1: sipush -3044
      // 1b4: sipush -15575
      // 1b7: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 1ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bd: aload 1
      // 1be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c4: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1c7: athrow
      // 1c8: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: sipush -3067
      // 1cf: sipush -6950
      // 1d2: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 1d5: aload 3
      // 1d6: ifnonnull 1fc
      // 1d9: aload 4
      // 1db: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 1de: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: ifeq 1f7
      // 1eb: new java/util/HashMap
      // 1ee: dup
      // 1ef: invokespecial java/util/HashMap.<init> ()V
      // 1f2: areturn
      // 1f3: invokestatic com/finalshell/core/Zg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f6: athrow
      // 1f7: aload 4
      // 1f9: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 1fc: checkcast java/util/Map
      // 1ff: areturn
      // 200: astore 5
      // 202: new com/finalshell/core/Hi2
      // 205: dup
      // 206: new java/lang/StringBuilder
      // 209: dup
      // 20a: invokespecial java/lang/StringBuilder.<init> ()V
      // 20d: sipush -3065
      // 210: sipush 1572
      // 213: invokestatic com/finalshell/core/Zg2.a (II)Ljava/lang/String;
      // 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 219: aload 1
      // 21a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 21d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 220: aload 5
      // 222: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 225: athrow
   }

   @Override
   public int j() {
      return a(3249, 914567480272566070L);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -3057) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 233;
               break;
            case 1:
               var10000 = 155;
               break;
            case 2:
               var10000 = 91;
               break;
            case 3:
               var10000 = 120;
               break;
            case 4:
               var10000 = 29;
               break;
            case 5:
               var10000 = 181;
               break;
            case 6:
               var10000 = 251;
               break;
            case 7:
               var10000 = 74;
               break;
            case 8:
               var10000 = 151;
               break;
            case 9:
               var10000 = 30;
               break;
            case 10:
               var10000 = 250;
               break;
            case 11:
               var10000 = 85;
               break;
            case 12:
               var10000 = 205;
               break;
            case 13:
               var10000 = 75;
               break;
            case 14:
               var10000 = 6;
               break;
            case 15:
               var10000 = 87;
               break;
            case 16:
               var10000 = 182;
               break;
            case 17:
               var10000 = 54;
               break;
            case 18:
               var10000 = 164;
               break;
            case 19:
               var10000 = 190;
               break;
            case 20:
               var10000 = 46;
               break;
            case 21:
               var10000 = 11;
               break;
            case 22:
               var10000 = 70;
               break;
            case 23:
               var10000 = 173;
               break;
            case 24:
               var10000 = 126;
               break;
            case 25:
               var10000 = 112;
               break;
            case 26:
               var10000 = 227;
               break;
            case 27:
               var10000 = 99;
               break;
            case 28:
               var10000 = 163;
               break;
            case 29:
               var10000 = 152;
               break;
            case 30:
               var10000 = 3;
               break;
            case 31:
               var10000 = 47;
               break;
            case 32:
               var10000 = 105;
               break;
            case 33:
               var10000 = 157;
               break;
            case 34:
               var10000 = 113;
               break;
            case 35:
               var10000 = 21;
               break;
            case 36:
               var10000 = 127;
               break;
            case 37:
               var10000 = 71;
               break;
            case 38:
               var10000 = 51;
               break;
            case 39:
               var10000 = 128;
               break;
            case 40:
               var10000 = 224;
               break;
            case 41:
               var10000 = 195;
               break;
            case 42:
               var10000 = 153;
               break;
            case 43:
               var10000 = 200;
               break;
            case 44:
               var10000 = 114;
               break;
            case 45:
               var10000 = 4;
               break;
            case 46:
               var10000 = 226;
               break;
            case 47:
               var10000 = 133;
               break;
            case 48:
               var10000 = 249;
               break;
            case 49:
               var10000 = 5;
               break;
            case 50:
               var10000 = 41;
               break;
            case 51:
               var10000 = 121;
               break;
            case 52:
               var10000 = 187;
               break;
            case 53:
               var10000 = 38;
               break;
            case 54:
               var10000 = 148;
               break;
            case 55:
               var10000 = 63;
               break;
            case 56:
               var10000 = 124;
               break;
            case 57:
               var10000 = 115;
               break;
            case 58:
               var10000 = 64;
               break;
            case 59:
               var10000 = 136;
               break;
            case 60:
               var10000 = 107;
               break;
            case 61:
               var10000 = 97;
               break;
            case 62:
               var10000 = 45;
               break;
            case 63:
               var10000 = 169;
               break;
            case 64:
               var10000 = 234;
               break;
            case 65:
               var10000 = 61;
               break;
            case 66:
               var10000 = 254;
               break;
            case 67:
               var10000 = 214;
               break;
            case 68:
               var10000 = 138;
               break;
            case 69:
               var10000 = 179;
               break;
            case 70:
               var10000 = 32;
               break;
            case 71:
               var10000 = 172;
               break;
            case 72:
               var10000 = 246;
               break;
            case 73:
               var10000 = 218;
               break;
            case 74:
               var10000 = 180;
               break;
            case 75:
               var10000 = 26;
               break;
            case 76:
               var10000 = 95;
               break;
            case 77:
               var10000 = 142;
               break;
            case 78:
               var10000 = 56;
               break;
            case 79:
               var10000 = 13;
               break;
            case 80:
               var10000 = 10;
               break;
            case 81:
               var10000 = 207;
               break;
            case 82:
               var10000 = 73;
               break;
            case 83:
               var10000 = 159;
               break;
            case 84:
               var10000 = 102;
               break;
            case 85:
               var10000 = 92;
               break;
            case 86:
               var10000 = 210;
               break;
            case 87:
               var10000 = 18;
               break;
            case 88:
               var10000 = 42;
               break;
            case 89:
               var10000 = 60;
               break;
            case 90:
               var10000 = 19;
               break;
            case 91:
               var10000 = 77;
               break;
            case 92:
               var10000 = 191;
               break;
            case 93:
               var10000 = 189;
               break;
            case 94:
               var10000 = 116;
               break;
            case 95:
               var10000 = 65;
               break;
            case 96:
               var10000 = 255;
               break;
            case 97:
               var10000 = 139;
               break;
            case 98:
               var10000 = 96;
               break;
            case 99:
               var10000 = 106;
               break;
            case 100:
               var10000 = 27;
               break;
            case 101:
               var10000 = 206;
               break;
            case 102:
               var10000 = 37;
               break;
            case 103:
               var10000 = 93;
               break;
            case 104:
               var10000 = 103;
               break;
            case 105:
               var10000 = 239;
               break;
            case 106:
               var10000 = 213;
               break;
            case 107:
               var10000 = 24;
               break;
            case 108:
               var10000 = 43;
               break;
            case 109:
               var10000 = 170;
               break;
            case 110:
               var10000 = 33;
               break;
            case 111:
               var10000 = 235;
               break;
            case 112:
               var10000 = 192;
               break;
            case 113:
               var10000 = 35;
               break;
            case 114:
               var10000 = 230;
               break;
            case 115:
               var10000 = 248;
               break;
            case 116:
               var10000 = 22;
               break;
            case 117:
               var10000 = 90;
               break;
            case 118:
               var10000 = 83;
               break;
            case 119:
               var10000 = 237;
               break;
            case 120:
               var10000 = 69;
               break;
            case 121:
               var10000 = 154;
               break;
            case 122:
               var10000 = 9;
               break;
            case 123:
               var10000 = 118;
               break;
            case 124:
               var10000 = 72;
               break;
            case 125:
               var10000 = 204;
               break;
            case 126:
               var10000 = 198;
               break;
            case 127:
               var10000 = 101;
               break;
            case 128:
               var10000 = 208;
               break;
            case 129:
               var10000 = 223;
               break;
            case 130:
               var10000 = 225;
               break;
            case 131:
               var10000 = 100;
               break;
            case 132:
               var10000 = 14;
               break;
            case 133:
               var10000 = 76;
               break;
            case 134:
               var10000 = 98;
               break;
            case 135:
               var10000 = 143;
               break;
            case 136:
               var10000 = 220;
               break;
            case 137:
               var10000 = 7;
               break;
            case 138:
               var10000 = 232;
               break;
            case 139:
               var10000 = 183;
               break;
            case 140:
               var10000 = 168;
               break;
            case 141:
               var10000 = 104;
               break;
            case 142:
               var10000 = 58;
               break;
            case 143:
               var10000 = 203;
               break;
            case 144:
               var10000 = 39;
               break;
            case 145:
               var10000 = 94;
               break;
            case 146:
               var10000 = 197;
               break;
            case 147:
               var10000 = 36;
               break;
            case 148:
               var10000 = 132;
               break;
            case 149:
               var10000 = 236;
               break;
            case 150:
               var10000 = 50;
               break;
            case 151:
               var10000 = 16;
               break;
            case 152:
               var10000 = 1;
               break;
            case 153:
               var10000 = 245;
               break;
            case 154:
               var10000 = 219;
               break;
            case 155:
               var10000 = 242;
               break;
            case 156:
               var10000 = 149;
               break;
            case 157:
               var10000 = 171;
               break;
            case 158:
               var10000 = 209;
               break;
            case 159:
               var10000 = 161;
               break;
            case 160:
               var10000 = 122;
               break;
            case 161:
               var10000 = 199;
               break;
            case 162:
               var10000 = 125;
               break;
            case 163:
               var10000 = 111;
               break;
            case 164:
               var10000 = 89;
               break;
            case 165:
               var10000 = 185;
               break;
            case 166:
               var10000 = 253;
               break;
            case 167:
               var10000 = 84;
               break;
            case 168:
               var10000 = 31;
               break;
            case 169:
               var10000 = 177;
               break;
            case 170:
               var10000 = 88;
               break;
            case 171:
               var10000 = 110;
               break;
            case 172:
               var10000 = 48;
               break;
            case 173:
               var10000 = 145;
               break;
            case 174:
               var10000 = 178;
               break;
            case 175:
               var10000 = 80;
               break;
            case 176:
               var10000 = 109;
               break;
            case 177:
               var10000 = 134;
               break;
            case 178:
               var10000 = 108;
               break;
            case 179:
               var10000 = 79;
               break;
            case 180:
               var10000 = 212;
               break;
            case 181:
               var10000 = 25;
               break;
            case 182:
               var10000 = 117;
               break;
            case 183:
               var10000 = 202;
               break;
            case 184:
               var10000 = 130;
               break;
            case 185:
               var10000 = 140;
               break;
            case 186:
               var10000 = 165;
               break;
            case 187:
               var10000 = 34;
               break;
            case 188:
               var10000 = 252;
               break;
            case 189:
               var10000 = 238;
               break;
            case 190:
               var10000 = 167;
               break;
            case 191:
               var10000 = 216;
               break;
            case 192:
               var10000 = 28;
               break;
            case 193:
               var10000 = 53;
               break;
            case 194:
               var10000 = 17;
               break;
            case 195:
               var10000 = 147;
               break;
            case 196:
               var10000 = 166;
               break;
            case 197:
               var10000 = 222;
               break;
            case 198:
               var10000 = 57;
               break;
            case 199:
               var10000 = 240;
               break;
            case 200:
               var10000 = 194;
               break;
            case 201:
               var10000 = 176;
               break;
            case 202:
               var10000 = 0;
               break;
            case 203:
               var10000 = 20;
               break;
            case 204:
               var10000 = 23;
               break;
            case 205:
               var10000 = 188;
               break;
            case 206:
               var10000 = 201;
               break;
            case 207:
               var10000 = 49;
               break;
            case 208:
               var10000 = 144;
               break;
            case 209:
               var10000 = 2;
               break;
            case 210:
               var10000 = 211;
               break;
            case 211:
               var10000 = 123;
               break;
            case 212:
               var10000 = 221;
               break;
            case 213:
               var10000 = 82;
               break;
            case 214:
               var10000 = 241;
               break;
            case 215:
               var10000 = 158;
               break;
            case 216:
               var10000 = 150;
               break;
            case 217:
               var10000 = 8;
               break;
            case 218:
               var10000 = 141;
               break;
            case 219:
               var10000 = 12;
               break;
            case 220:
               var10000 = 162;
               break;
            case 221:
               var10000 = 129;
               break;
            case 222:
               var10000 = 86;
               break;
            case 223:
               var10000 = 68;
               break;
            case 224:
               var10000 = 174;
               break;
            case 225:
               var10000 = 146;
               break;
            case 226:
               var10000 = 228;
               break;
            case 227:
               var10000 = 137;
               break;
            case 228:
               var10000 = 131;
               break;
            case 229:
               var10000 = 81;
               break;
            case 230:
               var10000 = 66;
               break;
            case 231:
               var10000 = 175;
               break;
            case 232:
               var10000 = 78;
               break;
            case 233:
               var10000 = 62;
               break;
            case 234:
               var10000 = 55;
               break;
            case 235:
               var10000 = 44;
               break;
            case 236:
               var10000 = 67;
               break;
            case 237:
               var10000 = 59;
               break;
            case 238:
               var10000 = 186;
               break;
            case 239:
               var10000 = 215;
               break;
            case 240:
               var10000 = 229;
               break;
            case 241:
               var10000 = 193;
               break;
            case 242:
               var10000 = 160;
               break;
            case 243:
               var10000 = 196;
               break;
            case 244:
               var10000 = 40;
               break;
            case 245:
               var10000 = 52;
               break;
            case 246:
               var10000 = 184;
               break;
            case 247:
               var10000 = 243;
               break;
            case 248:
               var10000 = 231;
               break;
            case 249:
               var10000 = 247;
               break;
            case 250:
               var10000 = 119;
               break;
            case 251:
               var10000 = 15;
               break;
            case 252:
               var10000 = 217;
               break;
            case 253:
               var10000 = 156;
               break;
            case 254:
               var10000 = 135;
               break;
            default:
               var10000 = 244;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15255;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[21];
      int var11 = 0;
      String var10 = "}£6IÚÏÈ\u0090\u0004CÌø\u001fÿcfQÐÌ\u0089ð,OÉyóÍÉ®jØ\u008eÂ\u0000¢C\u008a¿Èª\u009dµO1\u000eÌ\tÊ,\u009a\\\u0082-\u0005«â\th²\f¯ýÐí\u000bñ2ê\u0084]§\u0095\r.W\u0007q¸â\u000eJ\u0019âfg\"\u0004}C\u008aÀ\u001f\u0000\u0000\u0099=/AvAÓy6¿\f\u00156µ\u0095»q®ÿ/¼;@þU[J\u0097Î\fÓDãµ`P\u009fcî=\u00917\u000fÂm\u001adðCñ\u001f\u0083\u0015á!Òé\u007f\tr0l^jÕ(v#%A\u0016\u0093ñ:b&\u0085\u00190\u009e\\ð\u009báºk.&\u008bË\u008dz\u0095Â \u0098\u0001æFýñ@\u0011Zñ\u0094%K\u001fÒÐ\u0012F#\u0001¹ \u008aNrÙ±òa'gªã©\u007f\u0011b0\u008c\u0013d\u0004\u00ad¹J\u0018\u001bÐ¼\u0017OFRû\u0002#!\u00adù5\u008dú~\u008erø%\u0089Hp§q+\u000bõ£|ï×1ã0¤\u00adÑ\u0002@\u001b\u0002ôQ\u0011Q÷\u0091Ízå.u\u0018.µ\u0091àé7r\u0098\u001f\u009a\u000eÊüEy;Fz\u0099\u0003£ª\u0096âÅ\u000fµ\"o\u0095Vñ}é6`Bì´\u001a\u000eòt\r\u0083b©\u009d\u0093æ|\u009eóçí";
      int var12 = "}£6IÚÏÈ\u0090\u0004CÌø\u001fÿcfQÐÌ\u0089ð,OÉyóÍÉ®jØ\u008eÂ\u0000¢C\u008a¿Èª\u009dµO1\u000eÌ\tÊ,\u009a\\\u0082-\u0005«â\th²\f¯ýÐí\u000bñ2ê\u0084]§\u0095\r.W\u0007q¸â\u000eJ\u0019âfg\"\u0004}C\u008aÀ\u001f\u0000\u0000\u0099=/AvAÓy6¿\f\u00156µ\u0095»q®ÿ/¼;@þU[J\u0097Î\fÓDãµ`P\u009fcî=\u00917\u000fÂm\u001adðCñ\u001f\u0083\u0015á!Òé\u007f\tr0l^jÕ(v#%A\u0016\u0093ñ:b&\u0085\u00190\u009e\\ð\u009báºk.&\u008bË\u008dz\u0095Â \u0098\u0001æFýñ@\u0011Zñ\u0094%K\u001fÒÐ\u0012F#\u0001¹ \u008aNrÙ±òa'gªã©\u007f\u0011b0\u008c\u0013d\u0004\u00ad¹J\u0018\u001bÐ¼\u0017OFRû\u0002#!\u00adù5\u008dú~\u008erø%\u0089Hp§q+\u000bõ£|ï×1ã0¤\u00adÑ\u0002@\u001b\u0002ôQ\u0011Q÷\u0091Ízå.u\u0018.µ\u0091àé7r\u0098\u001f\u009a\u000eÊüEy;Fz\u0099\u0003£ª\u0096âÅ\u000fµ\"o\u0095Vñ}é6`Bì´\u001a\u000eòt\r\u0083b©\u009d\u0093æ|\u009eóçí"
         .length();
      char var9 = '\f';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 2;
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
                        var65 = 61;
                        break;
                     case 1:
                        var65 = 107;
                        break;
                     case 2:
                        var65 = 15;
                        break;
                     case 3:
                        var65 = 48;
                        break;
                     case 4:
                        var65 = 125;
                        break;
                     case 5:
                        var65 = 32;
                        break;
                     default:
                        var65 = 19;
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
                     b = new String[21];
                     long var0 = 1700098938370463079L;
                     long[] var6 = new long[19];
                     int var3 = 0;
                     String var4 = "½áÝ9À\u0089¼w}eðË\u0080L\u0013¡\u000bÿÓ\u00047¯¾µÍMòN\u0084\u0086û\u0080·Î\u0003_\u0015íºHïÈð\u0010\u0001µ*'[0.\u0004Ê\u0011\u0016¸\u0094Ü\u0013\u0081c\u0005ÞjGgº\u0012P>c\f\u0085æxö¢Û\u0083ée\u000eª³\u0085\u0080ýa\u0086é³\u009a\u008b«ÝZZ.+m¶\u0099Át\u0091H¿ù\u009a<U\u0016O¬L\u0092fH5õºC\u0016&Hy\u0005\u0005\f\\÷5\u0000R\"]";
                     int var5 = "½áÝ9À\u0089¼w}eðË\u0080L\u0013¡\u000bÿÓ\u00047¯¾µÍMòN\u0084\u0086û\u0080·Î\u0003_\u0015íºHïÈð\u0010\u0001µ*'[0.\u0004Ê\u0011\u0016¸\u0094Ü\u0013\u0081c\u0005ÞjGgº\u0012P>c\f\u0085æxö¢Û\u0083ée\u000eª³\u0085\u0080ýa\u0086é³\u009a\u008b«ÝZZ.+m¶\u0099Át\u0091H¿ù\u009a<U\u0016O¬L\u0092fH5õºC\u0016&Hy\u0005\u0005\f\\÷5\u0000R\"]"
                        .length();
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
                                    c = var6;
                                    d = new Integer[19];
                                    f = new Zg2();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "S;hX\u0019éÂb D;\\C,ïU";
                                 var5 = "S;hX\u0019éÂb D;\\C,ïU".length();
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

                  var10 = "\u00934o\u0010\u0001\u0092\u0090zðæÐ\u0000«\u0092\u000f,É`i^TkD^Î]\\Ó{\u008acò\u007fõ\u0087\u0097\"Iâ\nvmw§å&k\u0000q³ Ú¼Ë'À[/çe";
                  var12 = "\u00934o\u0010\u0001\u0092\u0090zðæÐ\u0000«\u0092\u000f,É`i^TkD^Î]\\Ó{\u008acò\u007fõ\u0087\u0097\"Iâ\nvmw§å&k\u0000q³ Ú¼Ë'À[/çe"
                     .length();
                  var9 = 15;
                  var17 = -1;
            }

            var10000 = 115;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





