package com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Oc_2 extends com.Ok_2 implements List, Cloneable, RandomAccess, Serializable {
   private final List l;
   protected transient Object g;
   protected transient Type m;
   private static final String d;

   public Oc_2() {
      this.l = new ArrayList();
   }

   public Oc_2(List param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial com/Ok_2.<init> ()V
      // 07: astore 2
      // 08: aload 2
      // 09: ifnonnull 2b
      // 0c: aload 1
      // 0d: ifnonnull 26
      // 10: goto 17
      // 13: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: new java/lang/IllegalArgumentException
      // 1a: dup
      // 1b: getstatic com/Oc_2.d Ljava/lang/String;
      // 1e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 21: athrow
      // 22: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: putfield com/Oc_2.l Ljava/util/List;
      // 2b: return
   }

   public Oc_2(int var1) {
      this.l = new ArrayList(var1);
   }

   public Object U() {
      return this.g;
   }

   public void L(Object var1) {
      this.g = var1;
   }

   public Type v() {
      return this.m;
   }

   public void w(Type var1) {
      this.m = var1;
   }

   @Override
   public int size() {
      return this.l.size();
   }

   @Override
   public boolean isEmpty() {
      return this.l.isEmpty();
   }

   @Override
   public boolean contains(Object var1) {
      return this.l.contains(var1);
   }

   @Override
   public Iterator iterator() {
      return this.l.iterator();
   }

   @Override
   public Object[] toArray() {
      return this.l.toArray();
   }

   @Override
   public Object[] toArray(Object[] var1) {
      return this.l.toArray(var1);
   }

   @Override
   public boolean add(Object var1) {
      return this.l.add(var1);
   }

   public com.Oc_2 W(Object var1) {
      this.l.add(var1);
      return this;
   }

   @Override
   public boolean remove(Object var1) {
      return this.l.remove(var1);
   }

   public com.Oc_2 D(Object var1) {
      this.l.remove(var1);
      return this;
   }

   @Override
   public boolean containsAll(Collection var1) {
      return this.l.containsAll(var1);
   }

   @Override
   public boolean addAll(Collection var1) {
      return this.l.addAll(var1);
   }

   public com.Oc_2 S(Collection var1) {
      this.l.addAll(var1);
      return this;
   }

   @Override
   public boolean addAll(int var1, Collection var2) {
      return this.l.addAll(var1, var2);
   }

   public com.Oc_2 b(int var1, Collection var2) {
      this.l.addAll(var1, var2);
      return this;
   }

   @Override
   public boolean removeAll(Collection var1) {
      return this.l.removeAll(var1);
   }

   public com.Oc_2 l(Collection var1) {
      this.l.removeAll(var1);
      return this;
   }

   @Override
   public boolean retainAll(Collection var1) {
      return this.l.retainAll(var1);
   }

   public com.Oc_2 o(Collection var1) {
      this.l.retainAll(var1);
      return this;
   }

   @Override
   public void clear() {
      this.l.clear();
   }

   public com.Oc_2 s() {
      this.l.clear();
      return this;
   }

   @Override
   public Object set(int param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: astore 3
      // 04: iload 1
      // 05: bipush -1
      // 06: aload 3
      // 07: ifnonnull 3a
      // 0a: if_icmpne 25
      // 0d: goto 14
      // 10: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: aload 0
      // 15: getfield com/Oc_2.l Ljava/util/List;
      // 18: aload 2
      // 19: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1e: pop
      // 1f: aconst_null
      // 20: areturn
      // 21: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: getfield com/Oc_2.l Ljava/util/List;
      // 29: aload 3
      // 2a: ifnonnull 83
      // 2d: invokeinterface java/util/List.size ()I 1
      // 32: iload 1
      // 33: goto 3a
      // 36: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: if_icmpgt 78
      // 3d: aload 0
      // 3e: getfield com/Oc_2.l Ljava/util/List;
      // 41: invokeinterface java/util/List.size ()I 1
      // 46: istore 4
      // 48: iload 4
      // 4a: iload 1
      // 4b: if_icmpge 6b
      // 4e: aload 0
      // 4f: getfield com/Oc_2.l Ljava/util/List;
      // 52: aconst_null
      // 53: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 58: pop
      // 59: iinc 4 1
      // 5c: aload 3
      // 5d: ifnonnull 76
      // 60: aload 3
      // 61: ifnull 48
      // 64: goto 6b
      // 67: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield com/Oc_2.l Ljava/util/List;
      // 6f: aload 2
      // 70: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 75: pop
      // 76: aconst_null
      // 77: areturn
      // 78: aload 0
      // 79: getfield com/Oc_2.l Ljava/util/List;
      // 7c: iload 1
      // 7d: aload 2
      // 7e: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 83: areturn
   }

   public com.Oc_2 Z(int var1, Object var2) {
      this.set(var1, var2);
      return this;
   }

   @Override
   public void add(int var1, Object var2) {
      this.l.add(var1, var2);
   }

   public com.Oc_2 S(int var1, Object var2) {
      this.l.add(var1, var2);
      return this;
   }

   @Override
   public Object remove(int var1) {
      return this.l.remove(var1);
   }

   public com.Oc_2 m(int var1) {
      this.l.remove(var1);
      return this;
   }

   @Override
   public int indexOf(Object var1) {
      return this.l.indexOf(var1);
   }

   @Override
   public int lastIndexOf(Object var1) {
      return this.l.lastIndexOf(var1);
   }

   @Override
   public ListIterator listIterator() {
      return this.l.listIterator();
   }

   @Override
   public ListIterator listIterator(int var1) {
      return this.l.listIterator(var1);
   }

   @Override
   public List subList(int var1, int var2) {
      return this.l.subList(var1, var2);
   }

   @Override
   public Object get(int var1) {
      return this.l.get(var1);
   }

   public com.O0 V(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/Oc_2.l Ljava/util/List;
      // 07: iload 1
      // 08: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d: astore 3
      // 0e: astore 2
      // 0f: aload 3
      // 10: instanceof com/O0
      // 13: aload 2
      // 14: ifnonnull 39
      // 17: ifeq 2a
      // 1a: goto 21
      // 1d: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 3
      // 22: checkcast com/O0
      // 25: areturn
      // 26: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 3
      // 2b: aload 2
      // 2c: ifnonnull 50
      // 2f: instanceof java/util/Map
      // 32: goto 39
      // 35: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: ifeq 4c
      // 3c: new com/O0
      // 3f: dup
      // 40: aload 3
      // 41: checkcast java/util/Map
      // 44: invokespecial com/O0.<init> (Ljava/util/Map;)V
      // 47: areturn
      // 48: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 3
      // 4d: invokestatic com/Oc_2.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 50: checkcast com/O0
      // 53: areturn
   }

   public com.Oc_2 Y(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/Oc_2.l Ljava/util/List;
      // 07: iload 1
      // 08: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d: astore 3
      // 0e: astore 2
      // 0f: aload 3
      // 10: instanceof com/Oc_2
      // 13: aload 2
      // 14: ifnonnull 39
      // 17: ifeq 2a
      // 1a: goto 21
      // 1d: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 3
      // 22: checkcast com/Oc_2
      // 25: areturn
      // 26: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 3
      // 2b: aload 2
      // 2c: ifnonnull 50
      // 2f: instanceof java/util/List
      // 32: goto 39
      // 35: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: ifeq 4c
      // 3c: new com/Oc_2
      // 3f: dup
      // 40: aload 3
      // 41: checkcast java/util/List
      // 44: invokespecial com/Oc_2.<init> (Ljava/util/List;)V
      // 47: areturn
      // 48: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 3
      // 4d: invokestatic com/Oc_2.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 50: checkcast com/Oc_2
      // 53: areturn
   }

   public Object u(int var1, Class var2) {
      Object var3 = this.l.get(var1);
      return com.B8.t(var3, var2);
   }

   public Object y(int param1, Type param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/Oc_2.l Ljava/util/List;
      // 07: iload 1
      // 08: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d: astore 4
      // 0f: astore 3
      // 10: aload 2
      // 11: aload 3
      // 12: ifnonnull 32
      // 15: instanceof java/lang/Class
      // 18: ifeq 30
      // 1b: goto 22
      // 1e: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 4
      // 24: aload 2
      // 25: checkcast java/lang/Class
      // 28: invokestatic com/B8.t (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
      // 2b: areturn
      // 2c: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 4
      // 32: invokestatic com/Ok_2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 35: astore 5
      // 37: aload 5
      // 39: aload 2
      // 3a: bipush 0
      // 3b: anewarray 194
      // 3e: invokestatic com/Ok_2.B (Ljava/lang/String;Ljava/lang/reflect/Type;[Lcom/Ks_2;)Ljava/lang/Object;
      // 41: areturn
   }

   public Boolean b(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 20
      // 0f: ifnonnull 1f
      // 12: goto 19
      // 15: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aconst_null
      // 1a: areturn
      // 1b: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokestatic com/B8.J (Ljava/lang/Object;)Ljava/lang/Boolean;
      // 23: areturn
   }

   public boolean P(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnonnull 20
      // 0f: ifnonnull 1f
      // 12: goto 19
      // 15: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokestatic com/B8.J (Ljava/lang/Object;)Ljava/lang/Boolean;
      // 23: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 26: ireturn
   }

   public Byte w(int var1) {
      Object var2 = this.get(var1);
      return com.B8.d(var2);
   }

   public byte d(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 05: astore 3
      // 06: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 09: aload 3
      // 0a: invokestatic com/B8.d (Ljava/lang/Object;)Ljava/lang/Byte;
      // 0d: astore 4
      // 0f: astore 2
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Byte.byteValue ()B
      // 2b: ireturn
   }

   public Short i(int var1) {
      Object var2 = this.get(var1);
      return com.B8.Q(var2);
   }

   public short c(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: invokestatic com/B8.Q (Ljava/lang/Object;)Ljava/lang/Short;
      // 0e: astore 4
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Short.shortValue ()S
      // 2b: ireturn
   }

   public Integer p(int var1) {
      Object var2 = this.get(var1);
      return com.B8.Y(var2);
   }

   public int v(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 05: astore 3
      // 06: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 09: aload 3
      // 0a: invokestatic com/B8.Y (Ljava/lang/Object;)Ljava/lang/Integer;
      // 0d: astore 4
      // 0f: astore 2
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Integer.intValue ()I
      // 2b: ireturn
   }

   public Long I(int var1) {
      Object var2 = this.get(var1);
      return com.B8.s(var2);
   }

   public long F(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: invokestatic com/B8.s (Ljava/lang/Object;)Ljava/lang/Long;
      // 0e: astore 4
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: lconst_0
      // 21: lreturn
      // 22: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Long.longValue ()J
      // 2b: lreturn
   }

   public Float D(int var1) {
      Object var2 = this.get(var1);
      return com.B8.h(var2);
   }

   public float B(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: invokestatic com/B8.h (Ljava/lang/Object;)Ljava/lang/Float;
      // 0e: astore 4
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: fconst_0
      // 21: freturn
      // 22: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Float.floatValue ()F
      // 2b: freturn
   }

   public Double q(int var1) {
      Object var2 = this.get(var1);
      return com.B8.Z(var2);
   }

   public double D$double(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokevirtual com/Oc_2.get (I)Ljava/lang/Object;
      // 08: astore 3
      // 09: astore 2
      // 0a: aload 3
      // 0b: invokestatic com/B8.Z (Ljava/lang/Object;)Ljava/lang/Double;
      // 0e: astore 4
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 28
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: dconst_0
      // 21: dreturn
      // 22: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 4
      // 28: invokevirtual java/lang/Double.doubleValue ()D
      // 2b: dreturn
   }

   public BigDecimal E(int var1) {
      Object var2 = this.get(var1);
      return com.B8.b(var2);
   }

   public BigInteger l(int var1) {
      Object var2 = this.get(var1);
      return com.B8.I(var2);
   }

   public String M(int var1) {
      Object var2 = this.get(var1);
      return com.B8.i(var2);
   }

   public Date n(int var1) {
      Object var2 = this.get(var1);
      return com.B8.C(var2);
   }

   public Object Q(int var1) {
      Object var2 = this.get(var1);
      return com.B8.p(var2);
   }

   public Object t(int var1) {
      Object var2 = this.get(var1);
      return com.B8.q(var2);
   }

   public List E(Class var1) {
      String var10000 = Hi_2.C();
      ArrayList var3 = new ArrayList(this.size());
      String var2 = var10000;
      IG var4 = IG.G();
      Iterator var5 = this.iterator();

      while (true) {
         if (var5.hasNext()) {
            Object var6 = var5.next();
            Object var7 = com.B8.B(var6, var1, var4);

            try {
               var9 = var3;
               if (var2 != null) {
                  break;
               }

               var3.add(var7);
               if (var2 == null) {
                  continue;
               }
            } catch (IllegalArgumentException var8) {
               throw b(var8);
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   @Override
   public Object clone() {
      return new com.Oc_2(new ArrayList(this.l));
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
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 1
      // 1b: instanceof com/Oc_2
      // 1e: aload 2
      // 1f: ifnonnull 4b
      // 22: ifeq 41
      // 25: goto 2c
      // 28: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/Oc_2.l Ljava/util/List;
      // 30: aload 1
      // 31: checkcast com/Oc_2
      // 34: getfield com/Oc_2.l Ljava/util/List;
      // 37: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 3c: ireturn
      // 3d: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: getfield com/Oc_2.l Ljava/util/List;
      // 45: aload 1
      // 46: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 4b: ireturn
   }

   @Override
   public int hashCode() {
      return this.l.hashCode();
   }

   private void readObject(ObjectInputStream param1) throws IOException, ClassNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: invokestatic com/eX_3.w ()V
      // 06: astore 2
      // 07: aload 2
      // 08: ifnonnull 39
      // 0b: getstatic com/eX_3.j [Ljava/lang/reflect/Field;
      // 0e: ifnull 35
      // 11: goto 18
      // 14: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: getstatic com/eX_3.R Z
      // 1b: ifne 35
      // 1e: goto 25
      // 21: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new com/eX_3
      // 28: dup
      // 29: aload 1
      // 2a: invokespecial com/eX_3.<init> (Ljava/io/ObjectInputStream;)V
      // 2d: astore 3
      // 2e: aload 3
      // 2f: invokevirtual java/io/ObjectInputStream.defaultReadObject ()V
      // 32: return
      // 33: astore 4
      // 35: aload 1
      // 36: invokevirtual java/io/ObjectInputStream.defaultReadObject ()V
      // 39: aload 0
      // 3a: getfield com/Oc_2.l Ljava/util/List;
      // 3d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 42: astore 3
      // 43: aload 3
      // 44: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 49: ifeq a1
      // 4c: aload 3
      // 4d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 52: astore 4
      // 54: aload 4
      // 56: aload 2
      // 57: ifnonnull 71
      // 5a: ifnonnull 6f
      // 5d: goto 64
      // 60: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: aload 2
      // 65: ifnull 43
      // 68: goto 6f
      // 6b: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: aload 4
      // 71: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 74: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 77: astore 5
      // 79: aload 5
      // 7b: invokestatic com/B8.A (Ljava/lang/String;)Ljava/lang/Class;
      // 7e: aload 2
      // 7f: ifnonnull 9c
      // 82: ifnonnull 9d
      // 85: goto 8c
      // 88: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: getstatic com/IG.D Lcom/IG;
      // 8f: aload 5
      // 91: aconst_null
      // 92: invokevirtual com/IG.Z (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;
      // 95: goto 9c
      // 98: invokestatic com/Oc_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: pop
      // 9d: aload 2
      // 9e: ifnull 43
      // a1: return
   }

   private static Exception b(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "o\u0007Gu?>E#\u0000Amsy".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 105;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 105;
         var10006 = var0;
      } else {
         var6 = 105;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 105;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 106;
               break;
            case 1:
               var23 = 7;
               break;
            case 2:
               var23 = 93;
               break;
            case 3:
               var23 = 104;
               break;
            case 4:
               var23 = 118;
               break;
            case 5:
               var23 = 62;
               break;
            default:
               var23 = 95;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               d = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





