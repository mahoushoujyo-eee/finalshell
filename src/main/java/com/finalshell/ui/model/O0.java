package com.finalshell.ui.model;

import com.finalshell.core.B8_2;
import com.finalshell.core.HI;
import com.finalshell.core.IG;
import com.finalshell.core.Ok2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class O0 extends Ok2 implements Map, Cloneable, Serializable, InvocationHandler {
   public final Map q;
   public static String[] d;
   public static String[] e;
   public static long[] g;
   public static Integer[] k;

   public O0() {
      this(b(17736, 8729208656318436868L), false);
   }

   public O0(Map param1) {
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
      // 04: invokespecial com/finalshell/core/Ok2.<init> ()V
      // 07: astore 2
      // 08: aload 2
      // 09: ifnonnull 31
      // 0c: aload 1
      // 0d: ifnonnull 2c
      // 10: goto 17
      // 13: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: new java/lang/IllegalArgumentException
      // 1a: dup
      // 1b: sipush 10947
      // 1e: sipush -16089
      // 21: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 24: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 27: athrow
      // 28: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 1
      // 2e: putfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 31: return
   }

   public O0(boolean var1) {
      this(b(10747, 4742170905293945526L), var1);
   }

   public O0(int var1) {
      this(var1, false);
   }

   public O0(int param1, boolean param2) {
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
      // 04: invokespecial com/finalshell/core/Ok2.<init> ()V
      // 07: astore 3
      // 08: aload 3
      // 09: ifnonnull 2a
      // 0c: iload 2
      // 0d: ifeq 2e
      // 10: goto 17
      // 13: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: new java/util/LinkedHashMap
      // 1b: dup
      // 1c: iload 1
      // 1d: invokespecial java/util/LinkedHashMap.<init> (I)V
      // 20: putfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 23: goto 2a
      // 26: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 3
      // 2b: ifnull 41
      // 2e: aload 0
      // 2f: new java/util/HashMap
      // 32: dup
      // 33: iload 1
      // 34: invokespecial java/util/HashMap.<init> (I)V
      // 37: putfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: return
   }

   @Override
   public int size() {
      return this.q.size();
   }

   @Override
   public boolean isEmpty() {
      return this.q.isEmpty();
   }

   @Override
   public boolean containsKey(Object param1) {
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
      // 04: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 07: aload 1
      // 08: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0d: istore 3
      // 0e: astore 2
      // 0f: iload 3
      // 10: aload 2
      // 11: ifnonnull 98
      // 14: ifne 97
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 1
      // 1f: instanceof java/lang/Number
      // 22: aload 2
      // 23: ifnonnull 96
      // 26: goto 2d
      // 29: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: ifne 82
      // 30: goto 37
      // 33: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 1
      // 38: instanceof java/lang/Character
      // 3b: aload 2
      // 3c: ifnonnull 96
      // 3f: goto 46
      // 42: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: ifne 82
      // 49: goto 50
      // 4c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: aload 1
      // 51: instanceof java/lang/Boolean
      // 54: aload 2
      // 55: ifnonnull 96
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: ifne 82
      // 62: goto 69
      // 65: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 1
      // 6a: instanceof java/util/UUID
      // 6d: aload 2
      // 6e: ifnonnull 98
      // 71: goto 78
      // 74: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: ifeq 97
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 0
      // 83: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 86: aload 1
      // 87: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 8a: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 8f: goto 96
      // 92: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: istore 3
      // 97: iload 3
      // 98: ireturn
   }

   @Override
   public boolean containsValue(Object var1) {
      return this.q.containsValue(var1);
   }

   @Override
   public Object get(Object param1) {
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
      // 04: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 07: aload 1
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: astore 3
      // 0e: astore 2
      // 0f: aload 3
      // 10: aload 2
      // 11: ifnonnull 98
      // 14: ifnonnull 97
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: ifnonnull 96
      // 23: goto 2a
      // 26: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: instanceof java/lang/Number
      // 2d: ifne 82
      // 30: goto 37
      // 33: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 1
      // 38: aload 2
      // 39: ifnonnull 96
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: instanceof java/lang/Character
      // 46: ifne 82
      // 49: goto 50
      // 4c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: aload 1
      // 51: aload 2
      // 52: ifnonnull 96
      // 55: goto 5c
      // 58: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: instanceof java/lang/Boolean
      // 5f: ifne 82
      // 62: goto 69
      // 65: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 1
      // 6a: aload 2
      // 6b: ifnonnull 98
      // 6e: goto 75
      // 71: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: instanceof java/util/UUID
      // 78: ifeq 97
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 0
      // 83: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 86: aload 1
      // 87: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 8a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 8f: goto 96
      // 92: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: astore 3
      // 97: aload 3
      // 98: areturn
   }

   public O0 D(String param1) {
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
      // 04: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 07: aload 1
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: astore 3
      // 0e: astore 2
      // 0f: aload 3
      // 10: instanceof com/finalshell/ui/model/O0
      // 13: aload 2
      // 14: ifnonnull 2e
      // 17: ifeq 2a
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 3
      // 22: checkcast com/finalshell/ui/model/O0
      // 25: areturn
      // 26: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 3
      // 2b: instanceof java/util/Map
      // 2e: aload 2
      // 2f: ifnonnull 5b
      // 32: ifeq 4c
      // 35: goto 3c
      // 38: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: new com/finalshell/ui/model/O0
      // 3f: dup
      // 40: aload 3
      // 41: checkcast java/util/Map
      // 44: invokespecial com/finalshell/ui/model/O0.<init> (Ljava/util/Map;)V
      // 47: areturn
      // 48: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 3
      // 4d: aload 2
      // 4e: ifnonnull 6e
      // 51: instanceof java/lang/String
      // 54: goto 5b
      // 57: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: ifeq 6a
      // 5e: aload 3
      // 5f: checkcast java/lang/String
      // 62: invokestatic com/finalshell/core/Ok2.y$O0 (Ljava/lang/String;)Lcom/finalshell/ui/model/O0;
      // 65: areturn
      // 66: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 3
      // 6b: invokestatic com/finalshell/ui/model/O0.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 6e: checkcast com/finalshell/ui/model/O0
      // 71: areturn
   }

   public Oc2 J(String param1) {
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
      // 04: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 07: aload 1
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: astore 3
      // 0e: astore 2
      // 0f: aload 3
      // 10: instanceof com/finalshell/ui/model/Oc2
      // 13: aload 2
      // 14: ifnonnull 2e
      // 17: ifeq 2a
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 3
      // 22: checkcast com/finalshell/ui/model/Oc2
      // 25: areturn
      // 26: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 3
      // 2b: instanceof java/util/List
      // 2e: aload 2
      // 2f: ifnonnull 5b
      // 32: ifeq 4c
      // 35: goto 3c
      // 38: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: new com/finalshell/ui/model/Oc2
      // 3f: dup
      // 40: aload 3
      // 41: checkcast java/util/List
      // 44: invokespecial com/finalshell/ui/model/Oc2.<init> (Ljava/util/List;)V
      // 47: areturn
      // 48: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 3
      // 4d: aload 2
      // 4e: ifnonnull 71
      // 51: instanceof java/lang/String
      // 54: goto 5b
      // 57: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: ifeq 6d
      // 5e: aload 3
      // 5f: checkcast java/lang/String
      // 62: invokestatic com/finalshell/core/Ok2.X (Ljava/lang/String;)Ljava/lang/Object;
      // 65: checkcast com/finalshell/ui/model/Oc2
      // 68: areturn
      // 69: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 3
      // 6e: invokestatic com/finalshell/ui/model/O0.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 71: checkcast com/finalshell/ui/model/Oc2
      // 74: areturn
   }

   public Object E(String var1, Class var2) {
      Object var3 = this.q.get(var1);
      return B8_2.t(var3, var2);
   }

   public Object a(String var1, Type var2) {
      Object var3 = this.q.get(var1);
      return B8_2.I(var3, var2, IG.G());
   }

   public Object x(String param1, HI param2) {
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
      // 04: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 07: aload 1
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: astore 4
      // 0f: astore 3
      // 10: aload 2
      // 11: aload 3
      // 12: ifnonnull 32
      // 15: ifnonnull 26
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 4
      // 21: areturn
      // 22: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 4
      // 28: aload 2
      // 29: invokevirtual com/finalshell/core/HI.O ()Ljava/lang/reflect/Type;
      // 2c: invokestatic com/finalshell/core/IG.G ()Lcom/finalshell/core/IG;
      // 2f: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 32: areturn
   }

   public Boolean x(String param1) {
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
      // 04: aload 1
      // 05: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 20
      // 0f: ifnonnull 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aconst_null
      // 1a: areturn
      // 1b: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/Object;)Ljava/lang/Boolean;
      // 23: areturn
   }

   public byte[] Z(String param1) {
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
      // 04: aload 1
      // 05: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 20
      // 0f: ifnonnull 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aconst_null
      // 1a: areturn
      // 1b: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokestatic com/finalshell/core/B8_2.B (Ljava/lang/Object;)[B
      // 23: areturn
   }

   public boolean G(String param1) {
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
      // 04: aload 1
      // 05: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08: astore 3
      // 09: aload 3
      // 0a: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/Object;)Ljava/lang/Boolean;
      // 0d: astore 4
      // 0f: astore 2
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2b: ireturn
   }

   public Byte r(String var1) {
      Object var2 = this.get(var1);
      return B8_2.d(var2);
   }

   public byte X(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05: astore 3
      // 06: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 09: aload 3
      // 0a: invokestatic com/finalshell/core/B8_2.d (Ljava/lang/Object;)Ljava/lang/Byte;
      // 0d: astore 4
      // 0f: astore 2
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Byte.byteValue ()B
      // 2b: ireturn
   }

   public Short v(String var1) {
      Object var2 = this.get(var1);
      return B8_2.Q(var2);
   }

   public short n(String param1) {
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
      // 04: aload 1
      // 05: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: invokestatic com/finalshell/core/B8_2.Q (Ljava/lang/Object;)Ljava/lang/Short;
      // 0e: astore 4
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Short.shortValue ()S
      // 2b: ireturn
   }

   public Integer e(String var1) {
      Object var2 = this.get(var1);
      return B8_2.Y(var2);
   }

   public int b(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05: astore 3
      // 06: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 09: aload 3
      // 0a: invokestatic com/finalshell/core/B8_2.Y (Ljava/lang/Object;)Ljava/lang/Integer;
      // 0d: astore 4
      // 0f: astore 2
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Integer.intValue ()I
      // 2b: ireturn
   }

   public Long h(String var1) {
      Object var2 = this.get(var1);
      return B8_2.s(var2);
   }

   public long I(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05: astore 3
      // 06: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 09: aload 3
      // 0a: invokestatic com/finalshell/core/B8_2.s (Ljava/lang/Object;)Ljava/lang/Long;
      // 0d: astore 4
      // 0f: astore 2
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: lconst_0
      // 21: lreturn
      // 22: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Long.longValue ()J
      // 2b: lreturn
   }

   public Float F(String var1) {
      Object var2 = this.get(var1);
      return B8_2.h(var2);
   }

   public float o(String param1) {
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
      // 04: aload 1
      // 05: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08: astore 3
      // 09: aload 3
      // 0a: invokestatic com/finalshell/core/B8_2.h (Ljava/lang/Object;)Ljava/lang/Float;
      // 0d: astore 4
      // 0f: astore 2
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: fconst_0
      // 21: freturn
      // 22: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Float.floatValue ()F
      // 2b: freturn
   }

   public Double f(String var1) {
      Object var2 = this.get(var1);
      return B8_2.Z(var2);
   }

   public double l(String param1) {
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
      // 04: aload 1
      // 05: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: invokestatic com/finalshell/core/B8_2.Z (Ljava/lang/Object;)Ljava/lang/Double;
      // 0e: astore 4
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: dconst_0
      // 21: dreturn
      // 22: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Double.doubleValue ()D
      // 2b: dreturn
   }

   public BigDecimal i(String var1) {
      Object var2 = this.get(var1);
      return B8_2.b(var2);
   }

   public BigInteger c(String var1) {
      Object var2 = this.get(var1);
      return B8_2.I(var2);
   }

   public String C$String(String param1) {
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
      // 04: aload 1
      // 05: invokevirtual com/finalshell/ui/model/O0.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 20
      // 0f: ifnonnull 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aconst_null
      // 1a: areturn
      // 1b: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 23: areturn
   }

   public Date B(String var1) {
      Object var2 = this.get(var1);
      return B8_2.C(var2);
   }

   public Object C$Object(String var1) {
      Object var2 = this.get(var1);
      return B8_2.p(var2);
   }

   public Object k(String var1) {
      Object var2 = this.get(var1);
      return B8_2.q(var2);
   }

   public Object C(String var1, Object var2) {
      return this.q.put(var1, var2);
   }

   public O0 U(String var1, Object var2) {
      this.q.put(var1, var2);
      return this;
   }

   @Override
   public void putAll(Map var1) {
      this.q.putAll(var1);
   }

   public O0 d(Map var1) {
      this.q.putAll(var1);
      return this;
   }

   @Override
   public void clear() {
      this.q.clear();
   }

   public O0 H() {
      this.q.clear();
      return this;
   }

   @Override
   public Object remove(Object var1) {
      return this.q.remove(var1);
   }

   public O0 p(Object var1) {
      this.q.remove(var1);
      return this;
   }

   @Override
   public Set keySet() {
      return this.q.keySet();
   }

   @Override
   public Collection values() {
      return this.q.values();
   }

   @Override
   public Set entrySet() {
      return this.q.entrySet();
   }

   public O0 K() {
      O0 var10000;
      O0 var10001;
      Object var10002;
      label16: {
         try {
            var10000 = null;
            var10001 = var10000;
            if (this.q instanceof LinkedHashMap) {
               var10002 = new LinkedHashMap(this.q);
               break label16;
            }
         } catch (IllegalArgumentException var1) {
            throw a(var1);
         }

         var10002 = new HashMap(this.q);
      }

      var10001 = new O0((Map)var10002);
      return var10000;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 1
      // 1b: instanceof com/finalshell/ui/model/O0
      // 1e: aload 2
      // 1f: ifnonnull 4b
      // 22: ifeq 41
      // 25: goto 2c
      // 28: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 30: aload 1
      // 31: checkcast com/finalshell/ui/model/O0
      // 34: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 37: invokeinterface java/util/Map.equals (Ljava/lang/Object;)Z 2
      // 3c: ireturn
      // 3d: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 0
      // 42: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 45: aload 1
      // 46: invokeinterface java/util/Map.equals (Ljava/lang/Object;)Z 2
      // 4b: ireturn
   }

   @Override
   public int hashCode() {
      return this.q.hashCode();
   }

   @Override
   public Object invoke(Object param1, Method param2, Object[] param3) throws Throwable {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 2
      // 004: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 007: astore 5
      // 009: astore 4
      // 00b: aload 5
      // 00d: arraylength
      // 00e: aload 4
      // 010: ifnonnull 16e
      // 013: bipush 1
      // 014: if_icmpne 16b
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: aload 2
      // 01f: aload 4
      // 021: ifnonnull 054
      // 024: goto 02b
      // 027: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 02e: sipush 10945
      // 031: sipush 19941
      // 034: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 037: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03a: ifeq 053
      // 03d: goto 044
      // 040: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 0
      // 045: aload 3
      // 046: bipush 0
      // 047: aaload
      // 048: invokevirtual com/finalshell/ui/model/O0.equals (Ljava/lang/Object;)Z
      // 04b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 04e: areturn
      // 04f: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 2
      // 054: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 057: astore 6
      // 059: aload 6
      // 05b: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 05e: if_acmpeq 076
      // 061: new com/finalshell/core/Hi2
      // 064: dup
      // 065: sipush 10955
      // 068: sipush -7087
      // 06b: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 06e: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 071: athrow
      // 072: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: aconst_null
      // 077: astore 7
      // 079: aload 2
      // 07a: ldc_w com/finalshell/core/E6
      // 07d: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 080: checkcast com/finalshell/core/E6
      // 083: astore 8
      // 085: aload 8
      // 087: aload 4
      // 089: ifnonnull 098
      // 08c: ifnull 0bf
      // 08f: goto 096
      // 092: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: aload 8
      // 098: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 09d: aload 4
      // 09f: ifnonnull 0bd
      // 0a2: invokevirtual java/lang/String.length ()I
      // 0a5: ifeq 0bf
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: aload 8
      // 0b1: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: astore 7
      // 0bf: aload 7
      // 0c1: aload 4
      // 0c3: ifnonnull 168
      // 0c6: ifnonnull 15a
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cf: athrow
      // 0d0: aload 2
      // 0d1: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 0d4: astore 7
      // 0d6: aload 7
      // 0d8: sipush 10944
      // 0db: sipush -29887
      // 0de: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 0e1: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0e4: aload 4
      // 0e6: ifnonnull 121
      // 0e9: ifne 108
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: new com/finalshell/core/Hi2
      // 0f6: dup
      // 0f7: sipush 10948
      // 0fa: sipush -24982
      // 0fd: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 100: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 103: athrow
      // 104: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: aload 7
      // 10a: bipush 3
      // 10b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 10e: astore 7
      // 110: aload 7
      // 112: aload 4
      // 114: ifnonnull 158
      // 117: invokevirtual java/lang/String.length ()I
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: ifne 139
      // 124: new com/finalshell/core/Hi2
      // 127: dup
      // 128: sipush 10948
      // 12b: sipush -24982
      // 12e: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 131: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 134: athrow
      // 135: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 138: athrow
      // 139: new java/lang/StringBuilder
      // 13c: dup
      // 13d: invokespecial java/lang/StringBuilder.<init> ()V
      // 140: aload 7
      // 142: bipush 0
      // 143: invokevirtual java/lang/String.charAt (I)C
      // 146: invokestatic java/lang/Character.toLowerCase (C)C
      // 149: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 14c: aload 7
      // 14e: bipush 1
      // 14f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 158: astore 7
      // 15a: aload 0
      // 15b: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 15e: aload 7
      // 160: aload 3
      // 161: bipush 0
      // 162: aaload
      // 163: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 168: pop
      // 169: aconst_null
      // 16a: areturn
      // 16b: aload 5
      // 16d: arraylength
      // 16e: ifne 367
      // 171: aload 2
      // 172: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 175: astore 6
      // 177: aload 6
      // 179: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 17c: if_acmpne 194
      // 17f: new com/finalshell/core/Hi2
      // 182: dup
      // 183: sipush 10949
      // 186: sipush 9115
      // 189: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 18c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 18f: athrow
      // 190: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: aconst_null
      // 195: astore 7
      // 197: aload 2
      // 198: ldc_w com/finalshell/core/E6
      // 19b: invokestatic com/finalshell/core/B8_2.J (Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 19e: checkcast com/finalshell/core/E6
      // 1a1: astore 8
      // 1a3: aload 8
      // 1a5: aload 4
      // 1a7: ifnonnull 1b6
      // 1aa: ifnull 1dd
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: aload 8
      // 1b6: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 1bb: aload 4
      // 1bd: ifnonnull 1db
      // 1c0: invokevirtual java/lang/String.length ()I
      // 1c3: ifeq 1dd
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: aload 8
      // 1cf: invokeinterface com/finalshell/core/E6.W$String ()Ljava/lang/String; 1
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1da: athrow
      // 1db: astore 7
      // 1dd: aload 7
      // 1df: aload 4
      // 1e1: ifnonnull 358
      // 1e4: ifnonnull 34d
      // 1e7: goto 1ee
      // 1ea: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ed: athrow
      // 1ee: aload 2
      // 1ef: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 1f2: astore 7
      // 1f4: aload 7
      // 1f6: sipush 10950
      // 1f9: sipush -951
      // 1fc: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 1ff: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 202: aload 4
      // 204: ifnonnull 27d
      // 207: ifeq 268
      // 20a: goto 211
      // 20d: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 210: athrow
      // 211: aload 7
      // 213: bipush 3
      // 214: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 217: astore 7
      // 219: aload 7
      // 21b: aload 4
      // 21d: ifnonnull 261
      // 220: invokevirtual java/lang/String.length ()I
      // 223: ifne 242
      // 226: goto 22d
      // 229: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22c: athrow
      // 22d: new com/finalshell/core/Hi2
      // 230: dup
      // 231: sipush 10953
      // 234: sipush -25574
      // 237: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 23a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 23d: athrow
      // 23e: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 241: athrow
      // 242: new java/lang/StringBuilder
      // 245: dup
      // 246: invokespecial java/lang/StringBuilder.<init> ()V
      // 249: aload 7
      // 24b: bipush 0
      // 24c: invokevirtual java/lang/String.charAt (I)C
      // 24f: invokestatic java/lang/Character.toLowerCase (C)C
      // 252: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 255: aload 7
      // 257: bipush 1
      // 258: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 25b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 261: astore 7
      // 263: aload 4
      // 265: ifnull 34d
      // 268: aload 7
      // 26a: sipush 10951
      // 26d: sipush 26255
      // 270: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 273: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 276: goto 27d
      // 279: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27c: athrow
      // 27d: aload 4
      // 27f: ifnonnull 2f8
      // 282: ifeq 2e3
      // 285: goto 28c
      // 288: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28b: athrow
      // 28c: aload 7
      // 28e: bipush 2
      // 28f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 292: astore 7
      // 294: aload 7
      // 296: aload 4
      // 298: ifnonnull 2dc
      // 29b: invokevirtual java/lang/String.length ()I
      // 29e: ifne 2bd
      // 2a1: goto 2a8
      // 2a4: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a7: athrow
      // 2a8: new com/finalshell/core/Hi2
      // 2ab: dup
      // 2ac: sipush 10953
      // 2af: sipush -25574
      // 2b2: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 2b5: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 2b8: athrow
      // 2b9: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bc: athrow
      // 2bd: new java/lang/StringBuilder
      // 2c0: dup
      // 2c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c4: aload 7
      // 2c6: bipush 0
      // 2c7: invokevirtual java/lang/String.charAt (I)C
      // 2ca: invokestatic java/lang/Character.toLowerCase (C)C
      // 2cd: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2d0: aload 7
      // 2d2: bipush 1
      // 2d3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2dc: astore 7
      // 2de: aload 4
      // 2e0: ifnull 34d
      // 2e3: aload 7
      // 2e5: sipush 10946
      // 2e8: sipush 23269
      // 2eb: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 2ee: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2f1: goto 2f8
      // 2f4: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f7: athrow
      // 2f8: aload 4
      // 2fa: ifnonnull 32d
      // 2fd: ifeq 313
      // 300: goto 307
      // 303: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 306: athrow
      // 307: aload 0
      // 308: invokevirtual com/finalshell/ui/model/O0.hashCode ()I
      // 30b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 30e: areturn
      // 30f: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 312: athrow
      // 313: aload 7
      // 315: aload 4
      // 317: ifnonnull 33b
      // 31a: sipush 10952
      // 31d: sipush 1137
      // 320: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 323: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 326: goto 32d
      // 329: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32c: athrow
      // 32d: ifeq 33c
      // 330: aload 0
      // 331: invokevirtual com/finalshell/ui/model/O0.toString ()Ljava/lang/String;
      // 334: goto 33b
      // 337: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33a: athrow
      // 33b: areturn
      // 33c: new com/finalshell/core/Hi2
      // 33f: dup
      // 340: sipush 10953
      // 343: sipush -25574
      // 346: invokestatic com/finalshell/ui/model/O0.b (II)Ljava/lang/String;
      // 349: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 34c: athrow
      // 34d: aload 0
      // 34e: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 351: aload 7
      // 353: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 358: astore 9
      // 35a: aload 9
      // 35c: aload 2
      // 35d: invokevirtual java/lang/reflect/Method.getGenericReturnType ()Ljava/lang/reflect/Type;
      // 360: invokestatic com/finalshell/core/IG.G ()Lcom/finalshell/core/IG;
      // 363: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 366: areturn
      // 367: new java/lang/UnsupportedOperationException
      // 36a: dup
      // 36b: aload 2
      // 36c: invokevirtual java/lang/reflect/Method.toGenericString ()Ljava/lang/String;
      // 36f: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 372: athrow
   }

   public Map d() {
      return this.q;
   }

   public void readObject(ObjectInputStream param1) throws IOException, ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: invokestatic com/finalshell/serialization/EX3.w ()V
      // 06: astore 2
      // 07: aload 2
      // 08: ifnonnull 39
      // 0b: getstatic com/finalshell/serialization/EX3.j [Ljava/lang/reflect/Field;
      // 0e: ifnull 35
      // 11: goto 18
      // 14: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic com/finalshell/serialization/EX3.R Z
      // 1b: ifne 35
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: new com/finalshell/serialization/EX3
      // 28: dup
      // 29: aload 1
      // 2a: invokespecial com/finalshell/serialization/EX3.<init> (Ljava/io/ObjectInputStream;)V
      // 2d: astore 3
      // 2e: aload 3
      // 2f: invokevirtual java/io/ObjectInputStream.defaultReadObject ()V
      // 32: return
      // 33: astore 4
      // 35: aload 1
      // 36: invokevirtual java/io/ObjectInputStream.defaultReadObject ()V
      // 39: aload 0
      // 3a: getfield com/finalshell/ui/model/O0.q Ljava/util/Map;
      // 3d: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 42: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 47: astore 3
      // 48: aload 3
      // 49: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4e: ifeq ad
      // 51: aload 3
      // 52: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 57: checkcast java/util/Map$Entry
      // 5a: astore 4
      // 5c: aload 4
      // 5e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 63: astore 5
      // 65: aload 5
      // 67: aload 2
      // 68: ifnonnull 8f
      // 6b: ifnull 88
      // 6e: goto 75
      // 71: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: getstatic com/finalshell/core/IG.D Lcom/finalshell/core/IG;
      // 78: aload 5
      // 7a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 7d: invokevirtual com/finalshell/core/IG.E (Ljava/lang/Class;)Ljava/lang/Class;
      // 80: pop
      // 81: goto 88
      // 84: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: aload 4
      // 8a: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 8f: astore 6
      // 91: aload 6
      // 93: ifnull a9
      // 96: getstatic com/finalshell/core/IG.D Lcom/finalshell/core/IG;
      // 99: aload 6
      // 9b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 9e: invokevirtual com/finalshell/core/IG.E (Ljava/lang/Class;)Ljava/lang/Class;
      // a1: pop
      // a2: goto a9
      // a5: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8: athrow
      // a9: aload 2
      // aa: ifnull 48
      // ad: return
   }

   @Override
   public Object X(Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: ldc java/util/Map
      // 07: aload 2
      // 08: ifnonnull 1f
      // 0b: if_acmpeq 45
      // 0e: goto 15
      // 11: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 1
      // 16: ldc com/finalshell/ui/model/O0
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 2
      // 20: ifnonnull 37
      // 23: if_acmpeq 45
      // 26: goto 2d
      // 29: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 1
      // 2e: ldc com/finalshell/core/Ok2
      // 30: goto 37
      // 33: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 2
      // 38: ifnonnull 59
      // 3b: if_acmpne 4b
      // 3e: goto 45
      // 41: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 0
      // 46: areturn
      // 47: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 1
      // 4c: aload 2
      // 4d: ifnonnull 86
      // 50: ldc java/lang/Object
      // 52: goto 59
      // 55: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: if_acmpne 7e
      // 5c: aload 0
      // 5d: aload 2
      // 5e: ifnonnull 86
      // 61: goto 68
      // 64: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 6b: invokevirtual com/finalshell/ui/model/O0.containsKey (Ljava/lang/Object;)Z
      // 6e: ifne 7e
      // 71: goto 78
      // 74: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: aload 0
      // 79: areturn
      // 7a: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: aload 0
      // 7f: aload 1
      // 80: invokestatic com/finalshell/core/IG.G ()Lcom/finalshell/core/IG;
      // 83: invokestatic com/finalshell/core/B8_2.g (Ljava/util/Map;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 86: areturn
   }

   public Object C(Class param1, IG param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 1
      // 06: ldc java/util/Map
      // 08: aload 4
      // 0a: ifnonnull 2c
      // 0d: if_acmpne 1d
      // 10: goto 17
      // 13: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: areturn
      // 19: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 4
      // 20: ifnonnull 58
      // 23: ldc java/lang/Object
      // 25: goto 2c
      // 28: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: if_acmpne 52
      // 2f: aload 0
      // 30: aload 4
      // 32: ifnonnull 58
      // 35: goto 3c
      // 38: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 3f: invokevirtual com/finalshell/ui/model/O0.containsKey (Ljava/lang/Object;)Z
      // 42: ifne 52
      // 45: goto 4c
      // 48: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 0
      // 4d: areturn
      // 4e: invokestatic com/finalshell/ui/model/O0.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 0
      // 53: aload 1
      // 54: aload 2
      // 55: invokestatic com/finalshell/core/B8_2.g (Ljava/util/Map;Ljava/lang/Class;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 58: areturn
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.K();
   }

   @Override
   public Object put(Object var1, Object var2) {
      return this.C((String)var1, var2);
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 10945) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 211;
               break;
            case 1:
               var10000 = 65;
               break;
            case 2:
               var10000 = 229;
               break;
            case 3:
               var10000 = 250;
               break;
            case 4:
               var10000 = 200;
               break;
            case 5:
               var10000 = 29;
               break;
            case 6:
               var10000 = 171;
               break;
            case 7:
               var10000 = 147;
               break;
            case 8:
               var10000 = 17;
               break;
            case 9:
               var10000 = 40;
               break;
            case 10:
               var10000 = 33;
               break;
            case 11:
               var10000 = 124;
               break;
            case 12:
               var10000 = 10;
               break;
            case 13:
               var10000 = 7;
               break;
            case 14:
               var10000 = 168;
               break;
            case 15:
               var10000 = 11;
               break;
            case 16:
               var10000 = 105;
               break;
            case 17:
               var10000 = 103;
               break;
            case 18:
               var10000 = 143;
               break;
            case 19:
               var10000 = 176;
               break;
            case 20:
               var10000 = 142;
               break;
            case 21:
               var10000 = 202;
               break;
            case 22:
               var10000 = 59;
               break;
            case 23:
               var10000 = 254;
               break;
            case 24:
               var10000 = 225;
               break;
            case 25:
               var10000 = 87;
               break;
            case 26:
               var10000 = 72;
               break;
            case 27:
               var10000 = 88;
               break;
            case 28:
               var10000 = 73;
               break;
            case 29:
               var10000 = 210;
               break;
            case 30:
               var10000 = 106;
               break;
            case 31:
               var10000 = 79;
               break;
            case 32:
               var10000 = 187;
               break;
            case 33:
               var10000 = 173;
               break;
            case 34:
               var10000 = 163;
               break;
            case 35:
               var10000 = 215;
               break;
            case 36:
               var10000 = 76;
               break;
            case 37:
               var10000 = 230;
               break;
            case 38:
               var10000 = 80;
               break;
            case 39:
               var10000 = 218;
               break;
            case 40:
               var10000 = 243;
               break;
            case 41:
               var10000 = 164;
               break;
            case 42:
               var10000 = 193;
               break;
            case 43:
               var10000 = 174;
               break;
            case 44:
               var10000 = 12;
               break;
            case 45:
               var10000 = 57;
               break;
            case 46:
               var10000 = 123;
               break;
            case 47:
               var10000 = 195;
               break;
            case 48:
               var10000 = 182;
               break;
            case 49:
               var10000 = 246;
               break;
            case 50:
               var10000 = 154;
               break;
            case 51:
               var10000 = 113;
               break;
            case 52:
               var10000 = 130;
               break;
            case 53:
               var10000 = 93;
               break;
            case 54:
               var10000 = 221;
               break;
            case 55:
               var10000 = 2;
               break;
            case 56:
               var10000 = 162;
               break;
            case 57:
               var10000 = 181;
               break;
            case 58:
               var10000 = 58;
               break;
            case 59:
               var10000 = 216;
               break;
            case 60:
               var10000 = 214;
               break;
            case 61:
               var10000 = 161;
               break;
            case 62:
               var10000 = 61;
               break;
            case 63:
               var10000 = 28;
               break;
            case 64:
               var10000 = 94;
               break;
            case 65:
               var10000 = 136;
               break;
            case 66:
               var10000 = 4;
               break;
            case 67:
               var10000 = 240;
               break;
            case 68:
               var10000 = 25;
               break;
            case 69:
               var10000 = 114;
               break;
            case 70:
               var10000 = 235;
               break;
            case 71:
               var10000 = 23;
               break;
            case 72:
               var10000 = 208;
               break;
            case 73:
               var10000 = 120;
               break;
            case 74:
               var10000 = 199;
               break;
            case 75:
               var10000 = 109;
               break;
            case 76:
               var10000 = 122;
               break;
            case 77:
               var10000 = 119;
               break;
            case 78:
               var10000 = 102;
               break;
            case 79:
               var10000 = 129;
               break;
            case 80:
               var10000 = 24;
               break;
            case 81:
               var10000 = 178;
               break;
            case 82:
               var10000 = 183;
               break;
            case 83:
               var10000 = 236;
               break;
            case 84:
               var10000 = 157;
               break;
            case 85:
               var10000 = 74;
               break;
            case 86:
               var10000 = 89;
               break;
            case 87:
               var10000 = 239;
               break;
            case 88:
               var10000 = 86;
               break;
            case 89:
               var10000 = 47;
               break;
            case 90:
               var10000 = 141;
               break;
            case 91:
               var10000 = 207;
               break;
            case 92:
               var10000 = 232;
               break;
            case 93:
               var10000 = 111;
               break;
            case 94:
               var10000 = 108;
               break;
            case 95:
               var10000 = 253;
               break;
            case 96:
               var10000 = 100;
               break;
            case 97:
               var10000 = 69;
               break;
            case 98:
               var10000 = 67;
               break;
            case 99:
               var10000 = 205;
               break;
            case 100:
               var10000 = 242;
               break;
            case 101:
               var10000 = 50;
               break;
            case 102:
               var10000 = 48;
               break;
            case 103:
               var10000 = 39;
               break;
            case 104:
               var10000 = 27;
               break;
            case 105:
               var10000 = 148;
               break;
            case 106:
               var10000 = 177;
               break;
            case 107:
               var10000 = 244;
               break;
            case 108:
               var10000 = 145;
               break;
            case 109:
               var10000 = 217;
               break;
            case 110:
               var10000 = 83;
               break;
            case 111:
               var10000 = 52;
               break;
            case 112:
               var10000 = 37;
               break;
            case 113:
               var10000 = 71;
               break;
            case 114:
               var10000 = 44;
               break;
            case 115:
               var10000 = 9;
               break;
            case 116:
               var10000 = 233;
               break;
            case 117:
               var10000 = 249;
               break;
            case 118:
               var10000 = 118;
               break;
            case 119:
               var10000 = 196;
               break;
            case 120:
               var10000 = 223;
               break;
            case 121:
               var10000 = 43;
               break;
            case 122:
               var10000 = 101;
               break;
            case 123:
               var10000 = 227;
               break;
            case 124:
               var10000 = 82;
               break;
            case 125:
               var10000 = 104;
               break;
            case 126:
               var10000 = 203;
               break;
            case 127:
               var10000 = 169;
               break;
            case 128:
               var10000 = 98;
               break;
            case 129:
               var10000 = 99;
               break;
            case 130:
               var10000 = 135;
               break;
            case 131:
               var10000 = 63;
               break;
            case 132:
               var10000 = 146;
               break;
            case 133:
               var10000 = 206;
               break;
            case 134:
               var10000 = 213;
               break;
            case 135:
               var10000 = 95;
               break;
            case 136:
               var10000 = 252;
               break;
            case 137:
               var10000 = 204;
               break;
            case 138:
               var10000 = 150;
               break;
            case 139:
               var10000 = 134;
               break;
            case 140:
               var10000 = 126;
               break;
            case 141:
               var10000 = 31;
               break;
            case 142:
               var10000 = 175;
               break;
            case 143:
               var10000 = 5;
               break;
            case 144:
               var10000 = 55;
               break;
            case 145:
               var10000 = 185;
               break;
            case 146:
               var10000 = 238;
               break;
            case 147:
               var10000 = 64;
               break;
            case 148:
               var10000 = 77;
               break;
            case 149:
               var10000 = 201;
               break;
            case 150:
               var10000 = 49;
               break;
            case 151:
               var10000 = 53;
               break;
            case 152:
               var10000 = 245;
               break;
            case 153:
               var10000 = 1;
               break;
            case 154:
               var10000 = 219;
               break;
            case 155:
               var10000 = 92;
               break;
            case 156:
               var10000 = 36;
               break;
            case 157:
               var10000 = 179;
               break;
            case 158:
               var10000 = 220;
               break;
            case 159:
               var10000 = 165;
               break;
            case 160:
               var10000 = 152;
               break;
            case 161:
               var10000 = 117;
               break;
            case 162:
               var10000 = 234;
               break;
            case 163:
               var10000 = 15;
               break;
            case 164:
               var10000 = 14;
               break;
            case 165:
               var10000 = 194;
               break;
            case 166:
               var10000 = 18;
               break;
            case 167:
               var10000 = 156;
               break;
            case 168:
               var10000 = 38;
               break;
            case 169:
               var10000 = 149;
               break;
            case 170:
               var10000 = 66;
               break;
            case 171:
               var10000 = 60;
               break;
            case 172:
               var10000 = 3;
               break;
            case 173:
               var10000 = 84;
               break;
            case 174:
               var10000 = 107;
               break;
            case 175:
               var10000 = 133;
               break;
            case 176:
               var10000 = 144;
               break;
            case 177:
               var10000 = 51;
               break;
            case 178:
               var10000 = 128;
               break;
            case 179:
               var10000 = 251;
               break;
            case 180:
               var10000 = 70;
               break;
            case 181:
               var10000 = 41;
               break;
            case 182:
               var10000 = 184;
               break;
            case 183:
               var10000 = 115;
               break;
            case 184:
               var10000 = 26;
               break;
            case 185:
               var10000 = 13;
               break;
            case 186:
               var10000 = 56;
               break;
            case 187:
               var10000 = 121;
               break;
            case 188:
               var10000 = 8;
               break;
            case 189:
               var10000 = 30;
               break;
            case 190:
               var10000 = 131;
               break;
            case 191:
               var10000 = 112;
               break;
            case 192:
               var10000 = 158;
               break;
            case 193:
               var10000 = 21;
               break;
            case 194:
               var10000 = 0;
               break;
            case 195:
               var10000 = 140;
               break;
            case 196:
               var10000 = 189;
               break;
            case 197:
               var10000 = 167;
               break;
            case 198:
               var10000 = 212;
               break;
            case 199:
               var10000 = 226;
               break;
            case 200:
               var10000 = 75;
               break;
            case 201:
               var10000 = 20;
               break;
            case 202:
               var10000 = 159;
               break;
            case 203:
               var10000 = 32;
               break;
            case 204:
               var10000 = 231;
               break;
            case 205:
               var10000 = 46;
               break;
            case 206:
               var10000 = 127;
               break;
            case 207:
               var10000 = 153;
               break;
            case 208:
               var10000 = 180;
               break;
            case 209:
               var10000 = 34;
               break;
            case 210:
               var10000 = 68;
               break;
            case 211:
               var10000 = 186;
               break;
            case 212:
               var10000 = 247;
               break;
            case 213:
               var10000 = 45;
               break;
            case 214:
               var10000 = 81;
               break;
            case 215:
               var10000 = 125;
               break;
            case 216:
               var10000 = 116;
               break;
            case 217:
               var10000 = 228;
               break;
            case 218:
               var10000 = 85;
               break;
            case 219:
               var10000 = 188;
               break;
            case 220:
               var10000 = 138;
               break;
            case 221:
               var10000 = 132;
               break;
            case 222:
               var10000 = 19;
               break;
            case 223:
               var10000 = 90;
               break;
            case 224:
               var10000 = 237;
               break;
            case 225:
               var10000 = 22;
               break;
            case 226:
               var10000 = 6;
               break;
            case 227:
               var10000 = 170;
               break;
            case 228:
               var10000 = 191;
               break;
            case 229:
               var10000 = 224;
               break;
            case 230:
               var10000 = 151;
               break;
            case 231:
               var10000 = 78;
               break;
            case 232:
               var10000 = 241;
               break;
            case 233:
               var10000 = 137;
               break;
            case 234:
               var10000 = 198;
               break;
            case 235:
               var10000 = 110;
               break;
            case 236:
               var10000 = 35;
               break;
            case 237:
               var10000 = 139;
               break;
            case 238:
               var10000 = 160;
               break;
            case 239:
               var10000 = 155;
               break;
            case 240:
               var10000 = 172;
               break;
            case 241:
               var10000 = 248;
               break;
            case 242:
               var10000 = 222;
               break;
            case 243:
               var10000 = 96;
               break;
            case 244:
               var10000 = 54;
               break;
            case 245:
               var10000 = 97;
               break;
            case 246:
               var10000 = 42;
               break;
            case 247:
               var10000 = 209;
               break;
            case 248:
               var10000 = 197;
               break;
            case 249:
               var10000 = 91;
               break;
            case 250:
               var10000 = 192;
               break;
            case 251:
               var10000 = 16;
               break;
            case 252:
               var10000 = 166;
               break;
            case 253:
               var10000 = 62;
               break;
            case 254:
               var10000 = 255;
               break;
            default:
               var10000 = 190;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21324;
      if (k[var3] == null) {
         k[var3] = (int)(g[var3] ^ var1);
      }

      return k[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[11];
      int var11 = 0;
      String var10 = "»\u001fÅË\u001fM\u0003\u0092F5\fZèõf¹\u0091¥éßüZ@\b±5.\u0095\u008b²È\u0019\u000edñª¬Ã7i#\u0091+ÛÈîg\u000eí¼\u009b\u0005å\u0002\u00ad\u0085\u001dÿÜR\u000e4\u0002b»\u0003ì\u0001l\u000eoìË\u000fïCì\u00ad!úÍò, ";
      int var12 = "»\u001fÅË\u001fM\u0003\u0092F5\fZèõf¹\u0091¥éßüZ@\b±5.\u0095\u008b²È\u0019\u000edñª¬Ã7i#\u0091+ÛÈîg\u000eí¼\u009b\u0005å\u0002\u00ad\u0085\u001dÿÜR\u000e4\u0002b»\u0003ì\u0001l\u000eoìË\u000fïCì\u00ad!úÍò, "
         .length();
      char var9 = 6;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 63;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var30;
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
                        var58 = 22;
                        break;
                     case 1:
                        var58 = 14;
                        break;
                     case 2:
                        var58 = 20;
                        break;
                     case 3:
                        var58 = 15;
                        break;
                     case 4:
                        var58 = 74;
                        break;
                     case 5:
                        var58 = 51;
                        break;
                     default:
                        var58 = 103;
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
                     d = var13;
                     e = new String[11];
                     long var0 = 7016074164471791000L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "³_*\u0007©\u0002ë\u008c>KÆþ\u0091\u001e\u0007>";
                     int var5 = "³_*\u0007©\u0002ë\u008c>KÆþ\u0091\u001e\u0007>".length();
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

                     g = var6;
                     k = new Integer[2];
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

                  var10 = "\u00806rãÐ {J\u000e5ÝEìûú«_\u0018a¹Dg3";
                  var12 = "\u00806rãÐ {J\u000e5ÝEìûú«_\u0018a¹Dg3".length();
                  var9 = '\b';
                  var16 = -1;
            }

            var10000 = 115;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





