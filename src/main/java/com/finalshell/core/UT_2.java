package com.finalshell.core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;

public abstract class UT_2 {
   public final Ph2 p;
   public final java.lang.Class w;
   public static String[] a;
   public static String[] b;

   public UT_2(java.lang.Class var1, Ph2 var2) {
      this.w = var1;
      this.p = var2;
   }

   public java.lang.Class X() {
      return this.w;
   }

   public abstract void y(Yn4 var1, Object var2, Type var3, Map var4);

   public int f() {
      return 0;
   }

   public void S(Object var1, boolean var2) {
      this.D(var1, var2);
   }

   public void n(Object var1, int var2) {
      this.D(var1, var2);
   }

   public void C(Object var1, long var2) {
      this.D(var1, var2);
   }

   public void S(Object var1, String var2) {
      this.D(var1, var2);
   }

   public void D(Object param1, Object param2) {
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
      // 004: aload 2
      // 005: ifnonnull 02c
      // 008: aload 0
      // 009: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 00c: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 00f: aload 3
      // 010: ifnonnull 03e
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 019: athrow
      // 01a: invokevirtual java/lang/Class.isPrimitive ()Z
      // 01d: ifeq 02c
      // 020: goto 027
      // 023: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 026: athrow
      // 027: return
      // 028: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 030: aload 3
      // 031: ifnonnull 093
      // 034: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 03d: athrow
      // 03e: ldc java/lang/String
      // 040: if_acmpne 08f
      // 043: aload 0
      // 044: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 047: aload 3
      // 048: ifnonnull 093
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 051: athrow
      // 052: getfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 055: ifnull 08f
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 063: aload 3
      // 064: ifnonnull 093
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 06d: athrow
      // 06e: getfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 071: sipush 13910
      // 074: sipush -7677
      // 077: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 07a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07d: ifeq 08f
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 086: athrow
      // 087: aload 2
      // 088: checkcast java/lang/String
      // 08b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 08e: astore 2
      // 08f: aload 0
      // 090: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 093: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 096: astore 4
      // 098: aload 4
      // 09a: ifnull 528
      // 09d: aload 0
      // 09e: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 0a1: aload 3
      // 0a2: ifnonnull 523
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0ab: athrow
      // 0ac: getfield com/finalshell/core/Ph2.j Z
      // 0af: ifeq 50e
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 0bd: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 0c0: ldc java/util/concurrent/atomic/AtomicInteger
      // 0c2: aload 3
      // 0c3: ifnonnull 130
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0cc: athrow
      // 0cd: if_acmpne 120
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0d6: athrow
      // 0d7: aload 4
      // 0d9: aload 1
      // 0da: bipush 0
      // 0db: anewarray 4
      // 0de: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0e1: checkcast java/util/concurrent/atomic/AtomicInteger
      // 0e4: astore 5
      // 0e6: aload 5
      // 0e8: aload 3
      // 0e9: ifnonnull 0f8
      // 0ec: ifnull 106
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0f5: athrow
      // 0f6: aload 5
      // 0f8: aload 2
      // 0f9: checkcast java/util/concurrent/atomic/AtomicInteger
      // 0fc: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 0ff: invokevirtual java/util/concurrent/atomic/AtomicInteger.set (I)V
      // 102: aload 3
      // 103: ifnull 11c
      // 106: aload 0
      // 107: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 10a: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 10d: aload 4
      // 10f: aload 1
      // 110: aload 2
      // 111: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 114: pop
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 11b: athrow
      // 11c: aload 3
      // 11d: ifnull 762
      // 120: aload 0
      // 121: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 124: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 127: ldc java/util/concurrent/atomic/AtomicLong
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 12f: athrow
      // 130: aload 3
      // 131: ifnonnull 197
      // 134: if_acmpne 187
      // 137: goto 13e
      // 13a: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 13d: athrow
      // 13e: aload 4
      // 140: aload 1
      // 141: bipush 0
      // 142: anewarray 4
      // 145: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 148: checkcast java/util/concurrent/atomic/AtomicLong
      // 14b: astore 5
      // 14d: aload 5
      // 14f: aload 3
      // 150: ifnonnull 15f
      // 153: ifnull 16d
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 15c: athrow
      // 15d: aload 5
      // 15f: aload 2
      // 160: checkcast java/util/concurrent/atomic/AtomicLong
      // 163: invokevirtual java/util/concurrent/atomic/AtomicLong.get ()J
      // 166: invokevirtual java/util/concurrent/atomic/AtomicLong.set (J)V
      // 169: aload 3
      // 16a: ifnull 183
      // 16d: aload 0
      // 16e: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 171: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 174: aload 4
      // 176: aload 1
      // 177: aload 2
      // 178: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 17b: pop
      // 17c: goto 183
      // 17f: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 182: athrow
      // 183: aload 3
      // 184: ifnull 762
      // 187: aload 0
      // 188: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 18b: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 18e: ldc java/util/concurrent/atomic/AtomicBoolean
      // 190: goto 197
      // 193: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 196: athrow
      // 197: aload 3
      // 198: ifnonnull 1fc
      // 19b: if_acmpne 1ee
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 1a4: athrow
      // 1a5: aload 4
      // 1a7: aload 1
      // 1a8: bipush 0
      // 1a9: anewarray 4
      // 1ac: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1af: checkcast java/util/concurrent/atomic/AtomicBoolean
      // 1b2: astore 5
      // 1b4: aload 5
      // 1b6: aload 3
      // 1b7: ifnonnull 1c6
      // 1ba: ifnull 1d4
      // 1bd: goto 1c4
      // 1c0: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 1c3: athrow
      // 1c4: aload 5
      // 1c6: aload 2
      // 1c7: checkcast java/util/concurrent/atomic/AtomicBoolean
      // 1ca: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
      // 1cd: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 1d0: aload 3
      // 1d1: ifnull 1ea
      // 1d4: aload 0
      // 1d5: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 1d8: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 1db: aload 4
      // 1dd: aload 1
      // 1de: aload 2
      // 1df: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1e2: pop
      // 1e3: goto 1ea
      // 1e6: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 1e9: athrow
      // 1ea: aload 3
      // 1eb: ifnull 762
      // 1ee: ldc java/util/Map
      // 1f0: aload 4
      // 1f2: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 1f5: goto 1fc
      // 1f8: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 1fb: athrow
      // 1fc: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 1ff: ifeq 35b
      // 202: aconst_null
      // 203: astore 5
      // 205: aload 4
      // 207: aload 1
      // 208: bipush 0
      // 209: anewarray 4
      // 20c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 20f: checkcast java/util/Map
      // 212: astore 5
      // 214: goto 229
      // 217: astore 6
      // 219: aload 0
      // 21a: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 21d: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 220: aload 4
      // 222: aload 1
      // 223: aload 2
      // 224: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 227: pop
      // 228: return
      // 229: aload 5
      // 22b: aload 3
      // 22c: ifnonnull 33e
      // 22f: ifnull 336
      // 232: goto 239
      // 235: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 238: athrow
      // 239: aload 5
      // 23b: aload 3
      // 23c: ifnonnull 256
      // 23f: goto 246
      // 242: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 245: athrow
      // 246: invokestatic java/util/Collections.emptyMap ()Ljava/util/Map;
      // 249: if_acmpne 254
      // 24c: goto 253
      // 24f: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 252: athrow
      // 253: return
      // 254: aload 5
      // 256: aload 3
      // 257: ifnonnull 28a
      // 25a: invokeinterface java/util/Map.isEmpty ()Z 1
      // 25f: ifeq 288
      // 262: goto 269
      // 265: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 268: athrow
      // 269: aload 2
      // 26a: checkcast java/util/Map
      // 26d: aload 3
      // 26e: ifnonnull 28a
      // 271: goto 278
      // 274: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 277: athrow
      // 278: invokeinterface java/util/Map.isEmpty ()Z 1
      // 27d: ifeq 288
      // 280: goto 287
      // 283: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 286: athrow
      // 287: return
      // 288: aload 5
      // 28a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 28d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 290: astore 6
      // 292: aload 6
      // 294: sipush 13911
      // 297: sipush 9527
      // 29a: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 29d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a0: aload 3
      // 2a1: ifnonnull 2c3
      // 2a4: ifne 2f4
      // 2a7: goto 2ae
      // 2aa: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 2ad: athrow
      // 2ae: aload 6
      // 2b0: sipush 13912
      // 2b3: sipush 12865
      // 2b6: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 2b9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2bc: goto 2c3
      // 2bf: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 2c2: athrow
      // 2c3: aload 3
      // 2c4: ifnonnull 2e6
      // 2c7: ifne 2f4
      // 2ca: goto 2d1
      // 2cd: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 2d0: athrow
      // 2d1: aload 6
      // 2d3: sipush 13908
      // 2d6: sipush 14609
      // 2d9: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 2dc: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2df: goto 2e6
      // 2e2: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 2e5: athrow
      // 2e6: aload 3
      // 2e7: ifnonnull 314
      // 2ea: ifeq 2f5
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 2f3: athrow
      // 2f4: return
      // 2f5: aload 5
      // 2f7: aload 3
      // 2f8: ifnonnull 329
      // 2fb: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2fe: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 301: sipush 13916
      // 304: sipush 3874
      // 307: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 30a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 30d: goto 314
      // 310: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 313: athrow
      // 314: ifeq 327
      // 317: aload 0
      // 318: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 31b: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 31e: aload 4
      // 320: aload 1
      // 321: aload 2
      // 322: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 325: pop
      // 326: return
      // 327: aload 5
      // 329: aload 2
      // 32a: checkcast java/util/Map
      // 32d: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 332: aload 3
      // 333: ifnull 357
      // 336: aload 2
      // 337: goto 33e
      // 33a: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 33d: athrow
      // 33e: ifnull 357
      // 341: aload 0
      // 342: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 345: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 348: aload 4
      // 34a: aload 1
      // 34b: aload 2
      // 34c: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 34f: pop
      // 350: goto 357
      // 353: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 356: athrow
      // 357: aload 3
      // 358: ifnull 762
      // 35b: aconst_null
      // 35c: astore 5
      // 35e: aload 4
      // 360: aload 1
      // 361: bipush 0
      // 362: anewarray 4
      // 365: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 368: checkcast java/util/Collection
      // 36b: astore 5
      // 36d: goto 382
      // 370: astore 6
      // 372: aload 0
      // 373: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 376: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 379: aload 4
      // 37b: aload 1
      // 37c: aload 2
      // 37d: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 380: pop
      // 381: return
      // 382: aload 5
      // 384: aload 3
      // 385: ifnonnull 4e2
      // 388: ifnull 4d9
      // 38b: goto 392
      // 38e: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 391: athrow
      // 392: aload 2
      // 393: ifnull 4d9
      // 396: goto 39d
      // 399: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 39c: athrow
      // 39d: aload 5
      // 39f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 3a2: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 3a5: astore 6
      // 3a7: aload 5
      // 3a9: aload 3
      // 3aa: ifnonnull 3c3
      // 3ad: invokestatic java/util/Collections.emptySet ()Ljava/util/Set;
      // 3b0: if_acmpeq 42c
      // 3b3: goto 3ba
      // 3b6: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 3b9: athrow
      // 3ba: aload 5
      // 3bc: goto 3c3
      // 3bf: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 3c2: athrow
      // 3c3: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 3c6: if_acmpeq 42c
      // 3c9: aload 6
      // 3cb: sipush 13909
      // 3ce: sipush -5282
      // 3d1: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 3d4: aload 3
      // 3d5: ifnonnull 3fb
      // 3d8: goto 3df
      // 3db: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 3de: athrow
      // 3df: if_acmpeq 42c
      // 3e2: goto 3e9
      // 3e5: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 3e8: athrow
      // 3e9: aload 6
      // 3eb: sipush 13913
      // 3ee: sipush 15914
      // 3f1: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 3f4: goto 3fb
      // 3f7: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 3fa: athrow
      // 3fb: aload 3
      // 3fc: ifnonnull 41b
      // 3ff: if_acmpeq 42c
      // 402: goto 409
      // 405: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 408: athrow
      // 409: aload 6
      // 40b: sipush 13905
      // 40e: sipush -9062
      // 411: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 414: goto 41b
      // 417: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 41a: athrow
      // 41b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 41e: aload 3
      // 41f: ifnonnull 434
      // 422: ifeq 42d
      // 425: goto 42c
      // 428: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 42b: athrow
      // 42c: return
      // 42d: aload 5
      // 42f: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 434: aload 3
      // 435: ifnonnull 464
      // 438: ifne 454
      // 43b: goto 442
      // 43e: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 441: athrow
      // 442: aload 5
      // 444: invokeinterface java/util/Collection.clear ()V 1
      // 449: aload 3
      // 44a: ifnull 473
      // 44d: goto 454
      // 450: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 453: athrow
      // 454: aload 2
      // 455: checkcast java/util/Collection
      // 458: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 45d: goto 464
      // 460: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 463: athrow
      // 464: aload 3
      // 465: ifnonnull 481
      // 468: ifeq 473
      // 46b: goto 472
      // 46e: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 471: athrow
      // 472: return
      // 473: aload 6
      // 475: sipush 13914
      // 478: sipush -2188
      // 47b: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 47e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 481: aload 3
      // 482: ifnonnull 4c7
      // 485: ifne 4b2
      // 488: goto 48f
      // 48b: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 48e: athrow
      // 48f: aload 6
      // 491: sipush 13904
      // 494: sipush -3337
      // 497: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 49a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 49d: aload 3
      // 49e: ifnonnull 4d4
      // 4a1: goto 4a8
      // 4a4: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 4a7: athrow
      // 4a8: ifeq 4c9
      // 4ab: goto 4b2
      // 4ae: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 4b1: athrow
      // 4b2: aload 0
      // 4b3: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 4b6: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 4b9: aload 4
      // 4bb: aload 1
      // 4bc: aload 2
      // 4bd: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 4c0: goto 4c7
      // 4c3: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 4c6: athrow
      // 4c7: pop
      // 4c8: return
      // 4c9: aload 5
      // 4cb: aload 2
      // 4cc: checkcast java/util/Collection
      // 4cf: invokeinterface java/util/Collection.addAll (Ljava/util/Collection;)Z 2
      // 4d4: pop
      // 4d5: aload 3
      // 4d6: ifnull 50a
      // 4d9: aload 5
      // 4db: goto 4e2
      // 4de: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 4e1: athrow
      // 4e2: aload 3
      // 4e3: ifnonnull 4f1
      // 4e6: ifnonnull 50a
      // 4e9: goto 4f0
      // 4ec: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 4ef: athrow
      // 4f0: aload 2
      // 4f1: ifnull 50a
      // 4f4: aload 0
      // 4f5: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 4f8: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 4fb: aload 4
      // 4fd: aload 1
      // 4fe: aload 2
      // 4ff: invokestatic com/finalshell/core/UT_2.s (Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 502: pop
      // 503: goto 50a
      // 506: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 509: athrow
      // 50a: aload 3
      // 50b: ifnull 762
      // 50e: aload 4
      // 510: aload 1
      // 511: bipush 1
      // 512: anewarray 4
      // 515: dup
      // 516: bipush 0
      // 517: aload 2
      // 518: aastore
      // 519: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 51c: goto 523
      // 51f: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 522: athrow
      // 523: pop
      // 524: aload 3
      // 525: ifnull 762
      // 528: aload 0
      // 529: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 52c: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 52f: astore 5
      // 531: aload 0
      // 532: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 535: aload 3
      // 536: ifnonnull 551
      // 539: getfield com/finalshell/core/Ph2.j Z
      // 53c: ifeq 744
      // 53f: goto 546
      // 542: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 545: athrow
      // 546: aload 0
      // 547: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 54a: goto 551
      // 54d: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 550: athrow
      // 551: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 554: ldc java/util/concurrent/atomic/AtomicInteger
      // 556: aload 3
      // 557: ifnonnull 59f
      // 55a: if_acmpne 58f
      // 55d: goto 564
      // 560: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 563: athrow
      // 564: aload 5
      // 566: aload 1
      // 567: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 56a: checkcast java/util/concurrent/atomic/AtomicInteger
      // 56d: astore 6
      // 56f: aload 6
      // 571: aload 3
      // 572: ifnonnull 581
      // 575: ifnull 58b
      // 578: goto 57f
      // 57b: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 57e: athrow
      // 57f: aload 6
      // 581: aload 2
      // 582: checkcast java/util/concurrent/atomic/AtomicInteger
      // 585: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 588: invokevirtual java/util/concurrent/atomic/AtomicInteger.set (I)V
      // 58b: aload 3
      // 58c: ifnull 762
      // 58f: aload 0
      // 590: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 593: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 596: ldc java/util/concurrent/atomic/AtomicLong
      // 598: goto 59f
      // 59b: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 59e: athrow
      // 59f: aload 3
      // 5a0: ifnonnull 5e8
      // 5a3: if_acmpne 5d8
      // 5a6: goto 5ad
      // 5a9: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 5ac: athrow
      // 5ad: aload 5
      // 5af: aload 1
      // 5b0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5b3: checkcast java/util/concurrent/atomic/AtomicLong
      // 5b6: astore 6
      // 5b8: aload 6
      // 5ba: aload 3
      // 5bb: ifnonnull 5ca
      // 5be: ifnull 5d4
      // 5c1: goto 5c8
      // 5c4: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 5c7: athrow
      // 5c8: aload 6
      // 5ca: aload 2
      // 5cb: checkcast java/util/concurrent/atomic/AtomicLong
      // 5ce: invokevirtual java/util/concurrent/atomic/AtomicLong.get ()J
      // 5d1: invokevirtual java/util/concurrent/atomic/AtomicLong.set (J)V
      // 5d4: aload 3
      // 5d5: ifnull 762
      // 5d8: aload 0
      // 5d9: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 5dc: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 5df: ldc java/util/concurrent/atomic/AtomicBoolean
      // 5e1: goto 5e8
      // 5e4: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 5e7: athrow
      // 5e8: aload 3
      // 5e9: ifnonnull 63c
      // 5ec: if_acmpne 621
      // 5ef: goto 5f6
      // 5f2: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 5f5: athrow
      // 5f6: aload 5
      // 5f8: aload 1
      // 5f9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5fc: checkcast java/util/concurrent/atomic/AtomicBoolean
      // 5ff: astore 6
      // 601: aload 6
      // 603: aload 3
      // 604: ifnonnull 613
      // 607: ifnull 61d
      // 60a: goto 611
      // 60d: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 610: athrow
      // 611: aload 6
      // 613: aload 2
      // 614: checkcast java/util/concurrent/atomic/AtomicBoolean
      // 617: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
      // 61a: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 61d: aload 3
      // 61e: ifnull 762
      // 621: ldc java/util/Map
      // 623: aload 3
      // 624: ifnonnull 6b6
      // 627: goto 62e
      // 62a: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 62d: athrow
      // 62e: aload 0
      // 62f: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 632: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 635: goto 63c
      // 638: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 63b: athrow
      // 63c: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 63f: ifeq 6a9
      // 642: aload 5
      // 644: aload 1
      // 645: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 648: checkcast java/util/Map
      // 64b: astore 6
      // 64d: aload 6
      // 64f: aload 3
      // 650: ifnonnull 65f
      // 653: ifnull 6a5
      // 656: goto 65d
      // 659: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 65c: athrow
      // 65d: aload 6
      // 65f: aload 3
      // 660: ifnonnull 679
      // 663: invokestatic java/util/Collections.emptyMap ()Ljava/util/Map;
      // 666: if_acmpeq 699
      // 669: goto 670
      // 66c: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 66f: athrow
      // 670: aload 6
      // 672: goto 679
      // 675: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 678: athrow
      // 679: aload 3
      // 67a: ifnonnull 69c
      // 67d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 680: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 683: sipush 13905
      // 686: sipush -9062
      // 689: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 68c: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 68f: ifeq 69a
      // 692: goto 699
      // 695: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 698: athrow
      // 699: return
      // 69a: aload 6
      // 69c: aload 2
      // 69d: checkcast java/util/Map
      // 6a0: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 6a5: aload 3
      // 6a6: ifnull 762
      // 6a9: aload 5
      // 6ab: aload 1
      // 6ac: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6af: goto 6b6
      // 6b2: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 6b5: athrow
      // 6b6: checkcast java/util/Collection
      // 6b9: astore 6
      // 6bb: aload 6
      // 6bd: aload 3
      // 6be: ifnonnull 6cc
      // 6c1: ifnull 740
      // 6c4: goto 6cb
      // 6c7: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 6ca: athrow
      // 6cb: aload 2
      // 6cc: ifnull 740
      // 6cf: aload 6
      // 6d1: aload 3
      // 6d2: ifnonnull 6f2
      // 6d5: goto 6dc
      // 6d8: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 6db: athrow
      // 6dc: invokestatic java/util/Collections.emptySet ()Ljava/util/Set;
      // 6df: if_acmpeq 72c
      // 6e2: goto 6e9
      // 6e5: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 6e8: athrow
      // 6e9: aload 6
      // 6eb: goto 6f2
      // 6ee: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 6f1: athrow
      // 6f2: aload 3
      // 6f3: ifnonnull 70c
      // 6f6: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 6f9: if_acmpeq 72c
      // 6fc: goto 703
      // 6ff: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 702: athrow
      // 703: aload 6
      // 705: goto 70c
      // 708: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 70b: athrow
      // 70c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 70f: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 712: sipush 13905
      // 715: sipush -9062
      // 718: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 71b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 71e: aload 3
      // 71f: ifnonnull 73f
      // 722: ifeq 72d
      // 725: goto 72c
      // 728: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 72b: athrow
      // 72c: return
      // 72d: aload 6
      // 72f: invokeinterface java/util/Collection.clear ()V 1
      // 734: aload 6
      // 736: aload 2
      // 737: checkcast java/util/Collection
      // 73a: invokeinterface java/util/Collection.addAll (Ljava/util/Collection;)Z 2
      // 73f: pop
      // 740: aload 3
      // 741: ifnull 762
      // 744: aload 5
      // 746: aload 3
      // 747: ifnonnull 75d
      // 74a: goto 751
      // 74d: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 750: athrow
      // 751: ifnull 762
      // 754: goto 75b
      // 757: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 75a: athrow
      // 75b: aload 5
      // 75d: aload 1
      // 75e: aload 2
      // 75f: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 762: goto 7a0
      // 765: astore 4
      // 767: new com/finalshell/core/Hi2
      // 76a: dup
      // 76b: new java/lang/StringBuilder
      // 76e: dup
      // 76f: invokespecial java/lang/StringBuilder.<init> ()V
      // 772: sipush 13915
      // 775: sipush 16320
      // 778: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 77b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77e: aload 0
      // 77f: getfield com/finalshell/core/UT_2.w Ljava/lang/Class;
      // 782: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 785: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 788: ldc "#"
      // 78a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 78d: aload 0
      // 78e: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 791: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 794: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 797: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79a: aload 4
      // 79c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 79f: athrow
      // 7a0: return
   }

   public static boolean s(Field param0, Method param1, Object param2, Object param3) throws InvocationTargetException, IllegalAccessException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnonnull 21
      // 0b: aload 2
      // 0c: aload 3
      // 0d: invokestatic com/finalshell/core/UT_2.B (Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b: sipush 13906
      // 2e: sipush 14192
      // 31: invokestatic com/finalshell/core/UT_2.a (II)Ljava/lang/String;
      // 34: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37: aload 1
      // 38: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 3b: bipush 3
      // 3c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 45: bipush 1
      // 46: anewarray 73
      // 49: dup
      // 4a: bipush 0
      // 4b: aload 1
      // 4c: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 4f: aastore
      // 50: invokevirtual java/lang/Class.getDeclaredMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 53: astore 5
      // 55: aload 5
      // 57: aload 2
      // 58: bipush 1
      // 59: anewarray 4
      // 5c: dup
      // 5d: bipush 0
      // 5e: aload 3
      // 5f: aastore
      // 60: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 63: pop
      // 64: bipush 1
      // 65: ireturn
      // 66: astore 5
      // 68: goto 72
      // 6b: astore 5
      // 6d: goto 72
      // 70: astore 5
      // 72: bipush 0
      // 73: ireturn
   }

   public static boolean B(Field param0, Object param1, Object param2) throws IllegalAccessException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 3
      // 04: aload 0
      // 05: aload 3
      // 06: ifnonnull 14
      // 09: ifnull 34
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 17: invokestatic java/lang/reflect/Modifier.isFinal (I)Z
      // 1a: aload 3
      // 1b: ifnonnull 35
      // 1e: ifne 34
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 27: athrow
      // 28: aload 0
      // 29: aload 1
      // 2a: aload 2
      // 2b: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 2e: bipush 1
      // 2f: ireturn
      // 30: invokestatic com/finalshell/core/UT_2.a (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
   }

   public void d(String var1, Object var2) {
      throw new Hi2(a(13907, -16006));
   }

   public static ReflectiveOperationException a(ReflectiveOperationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 13904) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 165;
               break;
            case 1:
               var10000 = 242;
               break;
            case 2:
               var10000 = 36;
               break;
            case 3:
               var10000 = 196;
               break;
            case 4:
               var10000 = 55;
               break;
            case 5:
               var10000 = 157;
               break;
            case 6:
               var10000 = 90;
               break;
            case 7:
               var10000 = 246;
               break;
            case 8:
               var10000 = 63;
               break;
            case 9:
               var10000 = 178;
               break;
            case 10:
               var10000 = 135;
               break;
            case 11:
               var10000 = 188;
               break;
            case 12:
               var10000 = 125;
               break;
            case 13:
               var10000 = 244;
               break;
            case 14:
               var10000 = 13;
               break;
            case 15:
               var10000 = 131;
               break;
            case 16:
               var10000 = 14;
               break;
            case 17:
               var10000 = 180;
               break;
            case 18:
               var10000 = 107;
               break;
            case 19:
               var10000 = 227;
               break;
            case 20:
               var10000 = 199;
               break;
            case 21:
               var10000 = 38;
               break;
            case 22:
               var10000 = 94;
               break;
            case 23:
               var10000 = 129;
               break;
            case 24:
               var10000 = 151;
               break;
            case 25:
               var10000 = 11;
               break;
            case 26:
               var10000 = 219;
               break;
            case 27:
               var10000 = 120;
               break;
            case 28:
               var10000 = 149;
               break;
            case 29:
               var10000 = 97;
               break;
            case 30:
               var10000 = 121;
               break;
            case 31:
               var10000 = 194;
               break;
            case 32:
               var10000 = 176;
               break;
            case 33:
               var10000 = 5;
               break;
            case 34:
               var10000 = 9;
               break;
            case 35:
               var10000 = 159;
               break;
            case 36:
               var10000 = 171;
               break;
            case 37:
               var10000 = 85;
               break;
            case 38:
               var10000 = 77;
               break;
            case 39:
               var10000 = 202;
               break;
            case 40:
               var10000 = 142;
               break;
            case 41:
               var10000 = 181;
               break;
            case 42:
               var10000 = 52;
               break;
            case 43:
               var10000 = 110;
               break;
            case 44:
               var10000 = 191;
               break;
            case 45:
               var10000 = 92;
               break;
            case 46:
               var10000 = 251;
               break;
            case 47:
               var10000 = 249;
               break;
            case 48:
               var10000 = 139;
               break;
            case 49:
               var10000 = 204;
               break;
            case 50:
               var10000 = 179;
               break;
            case 51:
               var10000 = 225;
               break;
            case 52:
               var10000 = 75;
               break;
            case 53:
               var10000 = 123;
               break;
            case 54:
               var10000 = 248;
               break;
            case 55:
               var10000 = 35;
               break;
            case 56:
               var10000 = 30;
               break;
            case 57:
               var10000 = 84;
               break;
            case 58:
               var10000 = 162;
               break;
            case 59:
               var10000 = 31;
               break;
            case 60:
               var10000 = 8;
               break;
            case 61:
               var10000 = 138;
               break;
            case 62:
               var10000 = 218;
               break;
            case 63:
               var10000 = 74;
               break;
            case 64:
               var10000 = 126;
               break;
            case 65:
               var10000 = 220;
               break;
            case 66:
               var10000 = 25;
               break;
            case 67:
               var10000 = 189;
               break;
            case 68:
               var10000 = 32;
               break;
            case 69:
               var10000 = 209;
               break;
            case 70:
               var10000 = 174;
               break;
            case 71:
               var10000 = 175;
               break;
            case 72:
               var10000 = 3;
               break;
            case 73:
               var10000 = 239;
               break;
            case 74:
               var10000 = 187;
               break;
            case 75:
               var10000 = 253;
               break;
            case 76:
               var10000 = 16;
               break;
            case 77:
               var10000 = 164;
               break;
            case 78:
               var10000 = 203;
               break;
            case 79:
               var10000 = 166;
               break;
            case 80:
               var10000 = 217;
               break;
            case 81:
               var10000 = 195;
               break;
            case 82:
               var10000 = 156;
               break;
            case 83:
               var10000 = 146;
               break;
            case 84:
               var10000 = 183;
               break;
            case 85:
               var10000 = 48;
               break;
            case 86:
               var10000 = 15;
               break;
            case 87:
               var10000 = 213;
               break;
            case 88:
               var10000 = 235;
               break;
            case 89:
               var10000 = 124;
               break;
            case 90:
               var10000 = 10;
               break;
            case 91:
               var10000 = 224;
               break;
            case 92:
               var10000 = 130;
               break;
            case 93:
               var10000 = 49;
               break;
            case 94:
               var10000 = 117;
               break;
            case 95:
               var10000 = 18;
               break;
            case 96:
               var10000 = 26;
               break;
            case 97:
               var10000 = 233;
               break;
            case 98:
               var10000 = 172;
               break;
            case 99:
               var10000 = 169;
               break;
            case 100:
               var10000 = 168;
               break;
            case 101:
               var10000 = 83;
               break;
            case 102:
               var10000 = 19;
               break;
            case 103:
               var10000 = 67;
               break;
            case 104:
               var10000 = 215;
               break;
            case 105:
               var10000 = 51;
               break;
            case 106:
               var10000 = 98;
               break;
            case 107:
               var10000 = 206;
               break;
            case 108:
               var10000 = 148;
               break;
            case 109:
               var10000 = 155;
               break;
            case 110:
               var10000 = 133;
               break;
            case 111:
               var10000 = 50;
               break;
            case 112:
               var10000 = 221;
               break;
            case 113:
               var10000 = 28;
               break;
            case 114:
               var10000 = 153;
               break;
            case 115:
               var10000 = 1;
               break;
            case 116:
               var10000 = 150;
               break;
            case 117:
               var10000 = 113;
               break;
            case 118:
               var10000 = 64;
               break;
            case 119:
               var10000 = 71;
               break;
            case 120:
               var10000 = 69;
               break;
            case 121:
               var10000 = 119;
               break;
            case 122:
               var10000 = 103;
               break;
            case 123:
               var10000 = 87;
               break;
            case 124:
               var10000 = 212;
               break;
            case 125:
               var10000 = 109;
               break;
            case 126:
               var10000 = 127;
               break;
            case 127:
               var10000 = 232;
               break;
            case 128:
               var10000 = 128;
               break;
            case 129:
               var10000 = 70;
               break;
            case 130:
               var10000 = 57;
               break;
            case 131:
               var10000 = 136;
               break;
            case 132:
               var10000 = 158;
               break;
            case 133:
               var10000 = 72;
               break;
            case 134:
               var10000 = 208;
               break;
            case 135:
               var10000 = 86;
               break;
            case 136:
               var10000 = 205;
               break;
            case 137:
               var10000 = 177;
               break;
            case 138:
               var10000 = 88;
               break;
            case 139:
               var10000 = 17;
               break;
            case 140:
               var10000 = 230;
               break;
            case 141:
               var10000 = 23;
               break;
            case 142:
               var10000 = 255;
               break;
            case 143:
               var10000 = 104;
               break;
            case 144:
               var10000 = 234;
               break;
            case 145:
               var10000 = 43;
               break;
            case 146:
               var10000 = 222;
               break;
            case 147:
               var10000 = 108;
               break;
            case 148:
               var10000 = 2;
               break;
            case 149:
               var10000 = 116;
               break;
            case 150:
               var10000 = 27;
               break;
            case 151:
               var10000 = 33;
               break;
            case 152:
               var10000 = 223;
               break;
            case 153:
               var10000 = 41;
               break;
            case 154:
               var10000 = 46;
               break;
            case 155:
               var10000 = 0;
               break;
            case 156:
               var10000 = 68;
               break;
            case 157:
               var10000 = 137;
               break;
            case 158:
               var10000 = 144;
               break;
            case 159:
               var10000 = 145;
               break;
            case 160:
               var10000 = 58;
               break;
            case 161:
               var10000 = 21;
               break;
            case 162:
               var10000 = 160;
               break;
            case 163:
               var10000 = 12;
               break;
            case 164:
               var10000 = 4;
               break;
            case 165:
               var10000 = 105;
               break;
            case 166:
               var10000 = 42;
               break;
            case 167:
               var10000 = 163;
               break;
            case 168:
               var10000 = 79;
               break;
            case 169:
               var10000 = 186;
               break;
            case 170:
               var10000 = 95;
               break;
            case 171:
               var10000 = 93;
               break;
            case 172:
               var10000 = 245;
               break;
            case 173:
               var10000 = 99;
               break;
            case 174:
               var10000 = 143;
               break;
            case 175:
               var10000 = 228;
               break;
            case 176:
               var10000 = 132;
               break;
            case 177:
               var10000 = 102;
               break;
            case 178:
               var10000 = 40;
               break;
            case 179:
               var10000 = 254;
               break;
            case 180:
               var10000 = 59;
               break;
            case 181:
               var10000 = 111;
               break;
            case 182:
               var10000 = 39;
               break;
            case 183:
               var10000 = 73;
               break;
            case 184:
               var10000 = 240;
               break;
            case 185:
               var10000 = 80;
               break;
            case 186:
               var10000 = 118;
               break;
            case 187:
               var10000 = 47;
               break;
            case 188:
               var10000 = 37;
               break;
            case 189:
               var10000 = 184;
               break;
            case 190:
               var10000 = 211;
               break;
            case 191:
               var10000 = 243;
               break;
            case 192:
               var10000 = 100;
               break;
            case 193:
               var10000 = 198;
               break;
            case 194:
               var10000 = 141;
               break;
            case 195:
               var10000 = 34;
               break;
            case 196:
               var10000 = 197;
               break;
            case 197:
               var10000 = 114;
               break;
            case 198:
               var10000 = 82;
               break;
            case 199:
               var10000 = 76;
               break;
            case 200:
               var10000 = 250;
               break;
            case 201:
               var10000 = 237;
               break;
            case 202:
               var10000 = 192;
               break;
            case 203:
               var10000 = 216;
               break;
            case 204:
               var10000 = 154;
               break;
            case 205:
               var10000 = 185;
               break;
            case 206:
               var10000 = 236;
               break;
            case 207:
               var10000 = 96;
               break;
            case 208:
               var10000 = 61;
               break;
            case 209:
               var10000 = 29;
               break;
            case 210:
               var10000 = 22;
               break;
            case 211:
               var10000 = 24;
               break;
            case 212:
               var10000 = 7;
               break;
            case 213:
               var10000 = 62;
               break;
            case 214:
               var10000 = 226;
               break;
            case 215:
               var10000 = 112;
               break;
            case 216:
               var10000 = 44;
               break;
            case 217:
               var10000 = 20;
               break;
            case 218:
               var10000 = 140;
               break;
            case 219:
               var10000 = 167;
               break;
            case 220:
               var10000 = 252;
               break;
            case 221:
               var10000 = 170;
               break;
            case 222:
               var10000 = 190;
               break;
            case 223:
               var10000 = 101;
               break;
            case 224:
               var10000 = 60;
               break;
            case 225:
               var10000 = 54;
               break;
            case 226:
               var10000 = 207;
               break;
            case 227:
               var10000 = 201;
               break;
            case 228:
               var10000 = 106;
               break;
            case 229:
               var10000 = 81;
               break;
            case 230:
               var10000 = 247;
               break;
            case 231:
               var10000 = 91;
               break;
            case 232:
               var10000 = 173;
               break;
            case 233:
               var10000 = 152;
               break;
            case 234:
               var10000 = 45;
               break;
            case 235:
               var10000 = 56;
               break;
            case 236:
               var10000 = 6;
               break;
            case 237:
               var10000 = 241;
               break;
            case 238:
               var10000 = 182;
               break;
            case 239:
               var10000 = 122;
               break;
            case 240:
               var10000 = 78;
               break;
            case 241:
               var10000 = 89;
               break;
            case 242:
               var10000 = 229;
               break;
            case 243:
               var10000 = 147;
               break;
            case 244:
               var10000 = 193;
               break;
            case 245:
               var10000 = 210;
               break;
            case 246:
               var10000 = 66;
               break;
            case 247:
               var10000 = 238;
               break;
            case 248:
               var10000 = 134;
               break;
            case 249:
               var10000 = 214;
               break;
            case 250:
               var10000 = 65;
               break;
            case 251:
               var10000 = 53;
               break;
            case 252:
               var10000 = 115;
               break;
            case 253:
               var10000 = 231;
               break;
            case 254:
               var10000 = 200;
               break;
            default:
               var10000 = 161;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[13];
      int var3 = 0;
      String var2 = "1\u0019\u000eÃ\u001bVW»gN\f\u0004¢c\u0083ð\u0000áÄÅ@\u0094µÏ\u0011\u0083Î\"tb\u0085noT,\u0089\u001a\u0001ïí\u001b\rV*--y.\u0080óQê¶ØÓ®Eñ9\u0016O(\u0003bþ\u007f\u00049¸çð\"CscL³\u0010·\u0001i\u0010\u0081ÏÖIï¢\u001a<\u009f\f\\·ÊbÅÉ½\u008c\u0088µ\u0080\u009ex9$¨M\u001e\u008b\u001cèB\u001e×ó\\±'Ýá\bþ.ÝÆC.\u008f\u001b}\u0097h9\u0096ß\u000f¤a\u0083B\u0092\u0004\u0000rÉ\u0011#wÙå\u0019cº\u00adT*ºã\u0098Ðø\u001f¬!º&T<|`Q\u0080Þ×\u0010aúñ\u0001¶\u0015ô#Z3@D×\u0011;!ø\u0014¹M\u009bBvû\fP\u0083\t\u0088×ö$Rp\u008dÅ*@\u0098V\u009bÿ.%µñ½\u001ch\u001aÌ@\u00068fÈ`ò\tíã\u0092~Q7Ü\u0001E¬\\R@ÑðçA|?ázý\u001cÜ\u0016³\"¬j¡<¹¾×\u001aÙ ì\u0088íîy$÷¨CHÐ\u007f\r\u0081";
      int var4 = "1\u0019\u000eÃ\u001bVW»gN\f\u0004¢c\u0083ð\u0000áÄÅ@\u0094µÏ\u0011\u0083Î\"tb\u0085noT,\u0089\u001a\u0001ïí\u001b\rV*--y.\u0080óQê¶ØÓ®Eñ9\u0016O(\u0003bþ\u007f\u00049¸çð\"CscL³\u0010·\u0001i\u0010\u0081ÏÖIï¢\u001a<\u009f\f\\·ÊbÅÉ½\u008c\u0088µ\u0080\u009ex9$¨M\u001e\u008b\u001cèB\u001e×ó\\±'Ýá\bþ.ÝÆC.\u008f\u001b}\u0097h9\u0096ß\u000f¤a\u0083B\u0092\u0004\u0000rÉ\u0011#wÙå\u0019cº\u00adT*ºã\u0098Ðø\u001f¬!º&T<|`Q\u0080Þ×\u0010aúñ\u0001¶\u0015ô#Z3@D×\u0011;!ø\u0014¹M\u009bBvû\fP\u0083\t\u0088×ö$Rp\u008dÅ*@\u0098V\u009bÿ.%µñ½\u001ch\u001aÌ@\u00068fÈ`ò\tíã\u0092~Q7Ü\u0001E¬\\R@ÑðçA|?ázý\u001cÜ\u0016³\"¬j¡<¹¾×\u001aÙ ì\u0088íîy$÷¨CHÐ\u007f\r\u0081"
         .length();
      char var1 = 27;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 14;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 22;
                        break;
                     case 1:
                        var46 = 69;
                        break;
                     case 2:
                        var46 = 87;
                        break;
                     case 3:
                        var46 = 105;
                        break;
                     case 4:
                        var46 = 108;
                        break;
                     case 5:
                        var46 = 67;
                        break;
                     default:
                        var46 = 28;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[13];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "»yÉEwÒ,*æ\u009eâRªª?jc\u0080\u0006 \u001b\u00ad\u0097\u0010\u009fUP\u0013öbj!\r\u008aÏ\u000bè\u009coÚ\u0099\u000e\u0092ñ\u0082\n£ù";
                  var4 = "»yÉEwÒ,*æ\u009eâRªª?jc\u0080\u0006 \u001b\u00ad\u0097\u0010\u009fUP\u0013öbj!\r\u008aÏ\u000bè\u009coÚ\u0099\u000e\u0092ñ\u0082\n£ù"
                     .length();
                  var1 = 20;
                  var8 = -1;
            }

            var10000 = 2;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





