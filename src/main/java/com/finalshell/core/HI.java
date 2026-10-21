package com.finalshell.core;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HI {
   static ConcurrentMap U;
   protected final Type I;
   public static Type L;

   protected HI() {
      Type var1 = this.getClass().getGenericSuperclass();
      Type var2 = ((ParameterizedType)var1).getActualTypeArguments()[0];
      Type var3 = (Type)U.get(var2);
      if (var3 == null) {
         U.putIfAbsent(var2, var2);
         var3 = (Type)U.get(var2);
      }

      this.I = var3;
   }

   protected HI(Type[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokespecial java/lang/Object.<init> ()V
      // 007: astore 2
      // 008: aload 0
      // 009: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 00c: astore 3
      // 00d: aload 3
      // 00e: invokevirtual java/lang/Class.getGenericSuperclass ()Ljava/lang/reflect/Type;
      // 011: astore 4
      // 013: aload 4
      // 015: checkcast java/lang/reflect/ParameterizedType
      // 018: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 01d: bipush 0
      // 01e: aaload
      // 01f: checkcast java/lang/reflect/ParameterizedType
      // 022: astore 5
      // 024: aload 5
      // 026: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 02b: astore 6
      // 02d: aload 5
      // 02f: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 034: astore 7
      // 036: bipush 0
      // 037: istore 8
      // 039: bipush 0
      // 03a: istore 9
      // 03c: iload 9
      // 03e: aload 7
      // 040: arraylength
      // 041: if_icmpge 0eb
      // 044: aload 7
      // 046: iload 9
      // 048: aaload
      // 049: instanceof java/lang/reflect/TypeVariable
      // 04c: aload 2
      // 04d: ifnonnull 08e
      // 050: ifeq 086
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 059: athrow
      // 05a: iload 8
      // 05c: aload 2
      // 05d: ifnonnull 08e
      // 060: goto 067
      // 063: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 066: athrow
      // 067: aload 1
      // 068: arraylength
      // 069: if_icmpge 086
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 072: athrow
      // 073: aload 7
      // 075: iload 9
      // 077: aload 1
      // 078: iload 8
      // 07a: iinc 8 1
      // 07d: aaload
      // 07e: aastore
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 085: athrow
      // 086: aload 7
      // 088: iload 9
      // 08a: aaload
      // 08b: instanceof java/lang/reflect/GenericArrayType
      // 08e: aload 2
      // 08f: ifnonnull 0c6
      // 092: ifeq 0b3
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 09b: athrow
      // 09c: aload 7
      // 09e: iload 9
      // 0a0: aload 7
      // 0a2: iload 9
      // 0a4: aaload
      // 0a5: checkcast java/lang/reflect/GenericArrayType
      // 0a8: invokestatic com/finalshell/core/B8_2.A (Ljava/lang/reflect/GenericArrayType;)Ljava/lang/reflect/Type;
      // 0ab: aastore
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0b2: athrow
      // 0b3: aload 7
      // 0b5: iload 9
      // 0b7: aload 2
      // 0b8: ifnonnull 0d4
      // 0bb: aaload
      // 0bc: instanceof java/lang/reflect/ParameterizedType
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0c5: athrow
      // 0c6: ifeq 0e4
      // 0c9: aload 7
      // 0cb: iload 9
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: aload 7
      // 0d7: iload 9
      // 0d9: aaload
      // 0da: checkcast java/lang/reflect/ParameterizedType
      // 0dd: aload 1
      // 0de: iload 8
      // 0e0: invokespecial com/finalshell/core/HI.s (Ljava/lang/reflect/ParameterizedType;[Ljava/lang/reflect/Type;I)Ljava/lang/reflect/Type;
      // 0e3: aastore
      // 0e4: iinc 9 1
      // 0e7: aload 2
      // 0e8: ifnull 03c
      // 0eb: new com/finalshell/core/HK
      // 0ee: dup
      // 0ef: aload 7
      // 0f1: aload 3
      // 0f2: aload 6
      // 0f4: invokespecial com/finalshell/core/HK.<init> ([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
      // 0f7: astore 9
      // 0f9: getstatic com/finalshell/core/HI.U Ljava/util/concurrent/ConcurrentMap;
      // 0fc: aload 9
      // 0fe: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 103: checkcast java/lang/reflect/Type
      // 106: astore 10
      // 108: aload 2
      // 109: ifnonnull 13a
      // 10c: aload 10
      // 10e: ifnonnull 134
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 117: athrow
      // 118: getstatic com/finalshell/core/HI.U Ljava/util/concurrent/ConcurrentMap;
      // 11b: aload 9
      // 11d: aload 9
      // 11f: invokeinterface java/util/concurrent/ConcurrentMap.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 124: pop
      // 125: getstatic com/finalshell/core/HI.U Ljava/util/concurrent/ConcurrentMap;
      // 128: aload 9
      // 12a: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 12f: checkcast java/lang/reflect/Type
      // 132: astore 10
      // 134: aload 0
      // 135: aload 10
      // 137: putfield com/finalshell/core/HI.I Ljava/lang/reflect/Type;
      // 13a: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 13d: ifnull 14c
      // 140: ldc "YwuUi"
      // 142: invokestatic com/finalshell/core/Hi2.F (Ljava/lang/String;)V
      // 145: goto 14c
      // 148: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 14b: athrow
      // 14c: return
   }

   public static Type V(HK var0) {
      String var10000 = Hi2.C();
      Type var2 = (Type)U.get(var0);
      String var1 = var10000;

      try {
         if (var1 != null) {
            return var2;
         }

         if (var2 != null) {
            return var2;
         }
      } catch (Hi2 var3) {
         throw a(var3);
      }

      U.putIfAbsent(var0, var0);
      return (Type)U.get(var0);
   }

   public Type s(ParameterizedType param1, Type[] param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 07: astore 5
      // 09: aload 1
      // 0a: invokeinterface java/lang/reflect/ParameterizedType.getRawType ()Ljava/lang/reflect/Type; 1
      // 0f: astore 6
      // 11: aload 1
      // 12: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 17: astore 7
      // 19: bipush 0
      // 1a: istore 8
      // 1c: astore 4
      // 1e: iload 8
      // 20: aload 7
      // 22: arraylength
      // 23: if_icmpge cf
      // 26: aload 7
      // 28: iload 8
      // 2a: aaload
      // 2b: instanceof java/lang/reflect/TypeVariable
      // 2e: aload 4
      // 30: ifnonnull 70
      // 33: ifeq 68
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3c: athrow
      // 3d: iload 3
      // 3e: aload 4
      // 40: ifnonnull 70
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 49: athrow
      // 4a: aload 2
      // 4b: arraylength
      // 4c: if_icmpge 68
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 55: athrow
      // 56: aload 7
      // 58: iload 8
      // 5a: aload 2
      // 5b: iload 3
      // 5c: iinc 3 1
      // 5f: aaload
      // 60: aastore
      // 61: goto 68
      // 64: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 67: athrow
      // 68: aload 7
      // 6a: iload 8
      // 6c: aaload
      // 6d: instanceof java/lang/reflect/GenericArrayType
      // 70: aload 4
      // 72: ifnonnull aa
      // 75: ifeq 96
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 7e: athrow
      // 7f: aload 7
      // 81: iload 8
      // 83: aload 7
      // 85: iload 8
      // 87: aaload
      // 88: checkcast java/lang/reflect/GenericArrayType
      // 8b: invokestatic com/finalshell/core/B8_2.A (Ljava/lang/reflect/GenericArrayType;)Ljava/lang/reflect/Type;
      // 8e: aastore
      // 8f: goto 96
      // 92: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 95: athrow
      // 96: aload 7
      // 98: iload 8
      // 9a: aload 4
      // 9c: ifnonnull b8
      // 9f: aaload
      // a0: instanceof java/lang/reflect/ParameterizedType
      // a3: goto aa
      // a6: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // a9: athrow
      // aa: ifeq c7
      // ad: aload 7
      // af: iload 8
      // b1: goto b8
      // b4: invokestatic com/finalshell/core/HI.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // b7: athrow
      // b8: aload 0
      // b9: aload 7
      // bb: iload 8
      // bd: aaload
      // be: checkcast java/lang/reflect/ParameterizedType
      // c1: aload 2
      // c2: iload 3
      // c3: invokespecial com/finalshell/core/HI.s (Ljava/lang/reflect/ParameterizedType;[Ljava/lang/reflect/Type;I)Ljava/lang/reflect/Type;
      // c6: aastore
      // c7: iinc 8 1
      // ca: aload 4
      // cc: ifnull 1e
      // cf: new com/finalshell/core/HK
      // d2: dup
      // d3: aload 7
      // d5: aload 5
      // d7: aload 6
      // d9: invokespecial com/finalshell/core/HK.<init> ([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
      // dc: astore 8
      // de: aload 8
      // e0: areturn
   }

   public Type O() {
      return this.I;
   }

   static {
      __vfClinit__();
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }

   public static void __vfClinit__() {
      long var2 = 390808525397096305L;
      long var10002 = -7085340402781456543L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      U = new ConcurrentHashMap((int)var0, 0.75F, 1);
      L = new HC().O();
   }
}





