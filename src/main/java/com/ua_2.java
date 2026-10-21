package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ua_2 {
   private static final Logger X;
   private int B;
   private ArrayList t;
   @Nullable
   private final in_4 s;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   public ua_2(@Nullable in_4 var1) {
      this.B = a(31164, 1942292152647473124L);
      this.t = new ArrayList();
      this.s = var1;
   }

   public ua_2(int var1, @Nullable in_4 var2) {
      this.B = a(16237, 5545974350394495284L);
      this.t = new ArrayList();
      this.B = var1;
      this.s = var2;
   }

   public synchronized String O() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/lang/StringBuilder
      // 03: dup
      // 04: invokespecial java/lang/StringBuilder.<init> ()V
      // 07: astore 2
      // 08: bipush 1
      // 09: istore 3
      // 0a: invokestatic com/j_2.g ()Z
      // 0d: aload 0
      // 0e: getfield com/ua_2.t Ljava/util/ArrayList;
      // 11: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 14: astore 4
      // 16: istore 1
      // 17: aload 4
      // 19: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e: ifeq 5a
      // 21: aload 4
      // 23: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 28: checkcast com/dC_3
      // 2b: astore 5
      // 2d: iload 3
      // 2e: iload 1
      // 2f: ifeq 55
      // 32: ifne 4a
      // 35: goto 3c
      // 38: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b: athrow
      // 3c: aload 2
      // 3d: ldc "\n"
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: pop
      // 43: goto 4a
      // 46: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49: athrow
      // 4a: aload 2
      // 4b: aload 5
      // 4d: invokevirtual com/dC_3.V ()Ljava/lang/String;
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: pop
      // 54: bipush 0
      // 55: istore 3
      // 56: iload 1
      // 57: ifne 17
      // 5a: aload 2
      // 5b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5e: areturn
   }

   public synchronized void M(@NotNull com.YP var1, @NotNull j_2 var2) {
      this.N(new com.lu_4(var1, var2));
   }

   private synchronized void N(@NotNull com.lu_4 var1) {
      this.P(new com.dC_3(var1));
   }

   private synchronized void P(@NotNull com.dC_3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/j_2.g ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/ua_2.B I
      // 08: iload 2
      // 09: ifeq 4a
      // 0c: ifle 42
      // 0f: goto 16
      // 12: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/ua_2.t Ljava/util/ArrayList;
      // 1a: invokevirtual java/util/ArrayList.size ()I
      // 1d: iload 2
      // 1e: ifeq 4a
      // 21: goto 28
      // 24: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/ua_2.B I
      // 2c: if_icmplt 42
      // 2f: goto 36
      // 32: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: aload 0
      // 37: bipush 1
      // 38: invokevirtual com/ua_2.F (I)V
      // 3b: goto 42
      // 3e: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/ua_2.t Ljava/util/ArrayList;
      // 46: aload 1
      // 47: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4a: pop
      // 4b: return
   }

   public synchronized int b() {
      return this.t.size();
   }

   public synchronized void F(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/j_2.P ()Z
      // 03: istore 2
      // 04: iload 2
      // 05: ifne 2c
      // 08: iload 1
      // 09: aload 0
      // 0a: getfield com/ua_2.t Ljava/util/ArrayList;
      // 0d: invokevirtual java/util/ArrayList.size ()I
      // 10: if_icmplt 30
      // 13: goto 1a
      // 16: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 0
      // 1b: new java/util/ArrayList
      // 1e: dup
      // 1f: invokespecial java/util/ArrayList.<init> ()V
      // 22: putfield com/ua_2.t Ljava/util/ArrayList;
      // 25: goto 2c
      // 28: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: iload 2
      // 2d: ifeq 51
      // 30: aload 0
      // 31: new java/util/ArrayList
      // 34: dup
      // 35: aload 0
      // 36: getfield com/ua_2.t Ljava/util/ArrayList;
      // 39: iload 1
      // 3a: aload 0
      // 3b: getfield com/ua_2.t Ljava/util/ArrayList;
      // 3e: invokevirtual java/util/ArrayList.size ()I
      // 41: invokevirtual java/util/ArrayList.subList (II)Ljava/util/List;
      // 44: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 47: putfield com/ua_2.t Ljava/util/ArrayList;
      // 4a: goto 51
      // 4d: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 50: athrow
      // 51: return
   }

   public String U(int var1) {
      com.dC_3 var2 = this.t(var1);
      return var2.V();
   }

   public synchronized void D(int param1, int param2, int param3, @NotNull com.lu_4 param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/j_2.g ()Z
      // 03: new com/ua_2
      // 06: dup
      // 07: aload 0
      // 08: getfield com/ua_2.s Lcom/in_4;
      // 0b: invokespecial com/ua_2.<init> (Lcom/in_4;)V
      // 0e: astore 6
      // 10: istore 5
      // 12: iload 3
      // 13: aload 0
      // 14: invokevirtual com/ua_2.b ()I
      // 17: bipush 1
      // 18: isub
      // 19: if_icmpge 31
      // 1c: aload 0
      // 1d: aload 0
      // 1e: invokevirtual com/ua_2.b ()I
      // 21: iload 3
      // 22: isub
      // 23: bipush 1
      // 24: isub
      // 25: aload 6
      // 27: invokevirtual com/ua_2.U (ILcom/ua_2;)V
      // 2a: goto 31
      // 2d: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: new com/ua_2
      // 34: dup
      // 35: aload 0
      // 36: getfield com/ua_2.s Lcom/in_4;
      // 39: invokespecial com/ua_2.<init> (Lcom/in_4;)V
      // 3c: astore 7
      // 3e: iload 1
      // 3f: iload 5
      // 41: ifeq 5d
      // 44: ifle 5c
      // 47: goto 4e
      // 4a: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: iload 1
      // 50: aload 7
      // 52: invokevirtual com/ua_2.Q (ILcom/ua_2;)V
      // 55: goto 5c
      // 58: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b: athrow
      // 5c: bipush 0
      // 5d: istore 8
      // 5f: iload 8
      // 61: iload 2
      // 62: if_icmpge 80
      // 65: aload 7
      // 67: aload 4
      // 69: invokespecial com/ua_2.N (Lcom/lu_4;)V
      // 6c: iinc 8 1
      // 6f: iload 5
      // 71: ifeq 9b
      // 74: iload 5
      // 76: ifne 5f
      // 79: goto 80
      // 7c: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7f: athrow
      // 80: aload 7
      // 82: aload 7
      // 84: invokevirtual com/ua_2.b ()I
      // 87: aload 0
      // 88: invokevirtual com/ua_2.U (ILcom/ua_2;)V
      // 8b: aload 0
      // 8c: iload 2
      // 8d: invokespecial com/ua_2.z (I)V
      // 90: aload 6
      // 92: aload 6
      // 94: invokevirtual com/ua_2.b ()I
      // 97: aload 0
      // 98: invokevirtual com/ua_2.Q (ILcom/ua_2;)V
      // 9b: return
   }

   public synchronized ua_2 K(int param1, int param2, int param3, @NotNull com.lu_4 param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/j_2.g ()Z
      // 03: new com/ua_2
      // 06: dup
      // 07: aload 0
      // 08: getfield com/ua_2.s Lcom/in_4;
      // 0b: invokespecial com/ua_2.<init> (Lcom/in_4;)V
      // 0e: astore 6
      // 10: istore 5
      // 12: iload 3
      // 13: aload 0
      // 14: invokevirtual com/ua_2.b ()I
      // 17: bipush 1
      // 18: isub
      // 19: if_icmpge 31
      // 1c: aload 0
      // 1d: aload 0
      // 1e: invokevirtual com/ua_2.b ()I
      // 21: iload 3
      // 22: isub
      // 23: bipush 1
      // 24: isub
      // 25: aload 6
      // 27: invokevirtual com/ua_2.U (ILcom/ua_2;)V
      // 2a: goto 31
      // 2d: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: new com/ua_2
      // 34: dup
      // 35: aload 0
      // 36: getfield com/ua_2.s Lcom/in_4;
      // 39: invokespecial com/ua_2.<init> (Lcom/in_4;)V
      // 3c: astore 7
      // 3e: iload 1
      // 3f: iload 5
      // 41: ifeq 64
      // 44: ifle 5c
      // 47: goto 4e
      // 4a: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: iload 1
      // 50: aload 7
      // 52: invokevirtual com/ua_2.Q (ILcom/ua_2;)V
      // 55: goto 5c
      // 58: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b: athrow
      // 5c: iload 2
      // 5d: aload 0
      // 5e: invokevirtual com/ua_2.b ()I
      // 61: invokestatic java/lang/Math.min (II)I
      // 64: istore 8
      // 66: new com/ua_2
      // 69: dup
      // 6a: aload 0
      // 6b: getfield com/ua_2.s Lcom/in_4;
      // 6e: invokespecial com/ua_2.<init> (Lcom/in_4;)V
      // 71: astore 9
      // 73: aload 0
      // 74: iload 8
      // 76: aload 9
      // 78: invokevirtual com/ua_2.Q (ILcom/ua_2;)V
      // 7b: aload 7
      // 7d: aload 7
      // 7f: invokevirtual com/ua_2.b ()I
      // 82: aload 0
      // 83: invokevirtual com/ua_2.U (ILcom/ua_2;)V
      // 86: bipush 0
      // 87: istore 10
      // 89: iload 10
      // 8b: iload 8
      // 8d: if_icmpge aa
      // 90: aload 0
      // 91: aload 4
      // 93: invokespecial com/ua_2.N (Lcom/lu_4;)V
      // 96: iinc 10 1
      // 99: iload 5
      // 9b: ifeq b5
      // 9e: iload 5
      // a0: ifne 89
      // a3: goto aa
      // a6: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a9: athrow
      // aa: aload 6
      // ac: aload 6
      // ae: invokevirtual com/ua_2.b ()I
      // b1: aload 0
      // b2: invokevirtual com/ua_2.Q (ILcom/ua_2;)V
      // b5: aload 9
      // b7: areturn
   }

   public synchronized void S(int param1, int param2, j_2 param3, @NotNull com.YP param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 2
      // 02: invokevirtual com/ua_2.t (I)Lcom/dC_3;
      // 05: astore 6
      // 07: invokestatic com/j_2.g ()Z
      // 0a: aload 6
      // 0c: iload 1
      // 0d: aload 3
      // 0e: aload 4
      // 10: invokevirtual com/dC_3.W (ILcom/j_2;Lcom/YP;)V
      // 13: istore 5
      // 15: aload 0
      // 16: getfield com/ua_2.s Lcom/in_4;
      // 19: iload 5
      // 1b: ifeq 33
      // 1e: ifnull 39
      // 21: goto 28
      // 24: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/ua_2.s Lcom/in_4;
      // 2c: goto 33
      // 2f: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: aload 0
      // 34: aload 6
      // 36: invokevirtual com/in_4.U (Lcom/ua_2;Lcom/dC_3;)V
      // 39: return
   }

   public synchronized void b(int var1, int var2, @NotNull com.lu_4 var3) {
      boolean var10000 = j_2.g();
      int var5 = var1;
      boolean var4 = var10000;

      while (var5 <= var2) {
         this.t(var5).c(var3);
         var5++;
         if (!var4) {
            break;
         }
      }
   }

   public synchronized void D() {
      this.t.clear();
   }

   public synchronized void Z(int var1, int var2, int var3, @NotNull com.YP var4) {
      com.dC_3 var5 = this.t(var2);
      var5.R(var1, var3, var4);
   }

   public synchronized void w(int var1, int var2, int var3, int var4, @NotNull com.YP var5) {
      com.dC_3 var6 = this.t(var2);
      var6.j(var1, var3, var4, var5);
   }

   public synchronized void k(int var1, int var2, int var3, int var4, @NotNull com.YP var5) {
      boolean var10000 = j_2.g();
      int var7 = var2;
      boolean var6 = var10000;

      while (var7 < var4) {
         com.dC_3 var8 = this.t(var7);
         var8.A(var1, var3, var5);
         var7++;
         if (!var6) {
            break;
         }
      }
   }

   public synchronized void A(int var1, int var2, @NotNull com.Lf_2 var3) {
      this.t(var1, var2, var3, -this.b());
   }

   public synchronized void t(int param1, int param2, @NotNull com.Lf_2 param3, int param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/j_2.g ()Z
      // 03: istore 5
      // 05: iload 1
      // 06: iload 5
      // 08: ifeq 48
      // 0b: ifge 47
      // 0e: goto 15
      // 11: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14: athrow
      // 15: new java/lang/IllegalArgumentException
      // 18: dup
      // 19: new java/lang/StringBuilder
      // 1c: dup
      // 1d: invokespecial java/lang/StringBuilder.<init> ()V
      // 20: sipush 4320
      // 23: sipush 6895
      // 26: invokestatic com/ua_2.a (II)Ljava/lang/String;
      // 29: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c: iload 1
      // 2d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 30: sipush 4323
      // 33: sipush -30427
      // 36: invokestatic com/ua_2.a (II)Ljava/lang/String;
      // 39: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 42: athrow
      // 43: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: iload 1
      // 48: istore 6
      // 4a: iload 6
      // 4c: iload 1
      // 4d: iload 2
      // 4e: iadd
      // 4f: aload 0
      // 50: getfield com/ua_2.t Ljava/util/ArrayList;
      // 53: invokevirtual java/util/ArrayList.size ()I
      // 56: invokestatic java/lang/Math.min (II)I
      // 59: if_icmpge 78
      // 5c: aload 0
      // 5d: getfield com/ua_2.t Ljava/util/ArrayList;
      // 60: iload 6
      // 62: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 65: checkcast com/dC_3
      // 68: iload 6
      // 6a: aload 3
      // 6b: iload 4
      // 6d: invokevirtual com/dC_3.l (ILcom/Lf_2;I)V
      // 70: iinc 6 1
      // 73: iload 5
      // 75: ifne 4a
      // 78: return
   }

   public synchronized void Q(int var1, @NotNull ua_2 var2) {
      var1 = Math.min(var1, this.b());
      var2.O(this.t.subList(0, var1));
      this.F(var1);
   }

   public synchronized void O(@NotNull List param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/j_2.P ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/ua_2.B I
      // 08: iload 2
      // 09: ifne 95
      // 0c: ifle 8d
      // 0f: goto 16
      // 12: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 1
      // 17: invokeinterface java/util/List.size ()I 1
      // 1c: aload 0
      // 1d: getfield com/ua_2.B I
      // 20: iload 2
      // 21: ifne 67
      // 24: goto 2b
      // 27: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: if_icmplt 5a
      // 2e: goto 35
      // 31: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: aload 1
      // 36: invokeinterface java/util/List.size ()I 1
      // 3b: aload 0
      // 3c: getfield com/ua_2.B I
      // 3f: isub
      // 40: istore 3
      // 41: aload 0
      // 42: new java/util/ArrayList
      // 45: dup
      // 46: aload 1
      // 47: iload 3
      // 48: aload 1
      // 49: invokeinterface java/util/List.size ()I 1
      // 4e: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 53: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 56: putfield com/ua_2.t Ljava/util/ArrayList;
      // 59: return
      // 5a: aload 0
      // 5b: getfield com/ua_2.t Ljava/util/ArrayList;
      // 5e: invokevirtual java/util/ArrayList.size ()I
      // 61: aload 1
      // 62: invokeinterface java/util/List.size ()I 1
      // 67: iadd
      // 68: istore 3
      // 69: iload 3
      // 6a: iload 2
      // 6b: ifne 95
      // 6e: aload 0
      // 6f: getfield com/ua_2.B I
      // 72: if_icmplt 8d
      // 75: goto 7c
      // 78: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b: athrow
      // 7c: aload 0
      // 7d: iload 3
      // 7e: aload 0
      // 7f: getfield com/ua_2.B I
      // 82: isub
      // 83: invokevirtual com/ua_2.F (I)V
      // 86: goto 8d
      // 89: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8c: athrow
      // 8d: aload 0
      // 8e: getfield com/ua_2.t Ljava/util/ArrayList;
      // 91: aload 1
      // 92: invokevirtual java/util/ArrayList.addAll (Ljava/util/Collection;)Z
      // 95: pop
      // 96: return
   }

   @NotNull
   public synchronized com.dC_3 t(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/j_2.g ()Z
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 41
      // 09: ifge 3d
      // 0c: goto 13
      // 0f: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: getstatic com/ua_2.X Lorg/slf4j/Logger;
      // 16: new java/lang/StringBuilder
      // 19: dup
      // 1a: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d: sipush 4322
      // 20: sipush 6255
      // 23: invokestatic com/ua_2.a (II)Ljava/lang/String;
      // 26: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29: iload 1
      // 2a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;)V 2
      // 35: invokestatic com/dC_3.v ()Lcom/dC_3;
      // 38: areturn
      // 39: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: invokevirtual com/ua_2.b ()I
      // 41: istore 3
      // 42: iload 3
      // 43: iload 1
      // 44: if_icmpgt 60
      // 47: aload 0
      // 48: iload 2
      // 49: ifeq 68
      // 4c: invokestatic com/dC_3.v ()Lcom/dC_3;
      // 4f: invokespecial com/ua_2.P (Lcom/dC_3;)V
      // 52: iinc 3 1
      // 55: iload 2
      // 56: ifne 42
      // 59: goto 60
      // 5c: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield com/ua_2.t Ljava/util/ArrayList;
      // 64: iload 1
      // 65: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 68: checkcast com/dC_3
      // 6b: areturn
   }

   public synchronized void U(int var1, @NotNull ua_2 var2) {
      var1 = Math.min(var1, this.b());
      var2.F(this.t.subList(this.b() - var1, this.b()));
      this.z(var1);
   }

   private synchronized void F(@NotNull List var1) {
      ArrayList var2 = new ArrayList(var1);
      var2.addAll(this.t);
      this.t = new ArrayList(var2);
   }

   private synchronized void z(int var1) {
      this.t = new ArrayList(this.t.subList(0, this.b() - var1));
   }

   public int Q(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/j_2.g ()Z
      // 03: bipush 0
      // 04: istore 4
      // 06: istore 3
      // 07: iload 2
      // 08: iload 4
      // 0a: isub
      // 0b: ifle 7e
      // 0e: iload 1
      // 0f: iload 3
      // 10: ifeq 80
      // 13: aload 0
      // 14: getfield com/ua_2.t Ljava/util/ArrayList;
      // 17: invokevirtual java/util/ArrayList.size ()I
      // 1a: iload 3
      // 1b: ifeq 61
      // 1e: goto 25
      // 21: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: if_icmpge 52
      // 28: goto 2f
      // 2b: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/ua_2.t Ljava/util/ArrayList;
      // 33: iload 1
      // 34: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 37: checkcast com/dC_3
      // 3a: invokevirtual com/dC_3.V ()Z
      // 3d: iload 3
      // 3e: ifeq 80
      // 41: goto 48
      // 44: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47: athrow
      // 48: ifeq 7e
      // 4b: goto 52
      // 4e: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51: athrow
      // 52: iload 1
      // 53: aload 0
      // 54: getfield com/ua_2.t Ljava/util/ArrayList;
      // 57: invokevirtual java/util/ArrayList.size ()I
      // 5a: goto 61
      // 5d: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 60: athrow
      // 61: if_icmpge 74
      // 64: aload 0
      // 65: getfield com/ua_2.t Ljava/util/ArrayList;
      // 68: iload 1
      // 69: invokevirtual java/util/ArrayList.remove (I)Ljava/lang/Object;
      // 6c: pop
      // 6d: goto 74
      // 70: invokestatic com/ua_2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: iinc 1 -1
      // 77: iinc 4 1
      // 7a: iload 3
      // 7b: ifne 07
      // 7e: iload 4
      // 80: ireturn
   }

   synchronized int h(@NotNull com.dC_3 var1) {
      return this.t.indexOf(var1);
   }

   public synchronized void e() {
      boolean var10000 = j_2.g();
      Iterator var2 = this.t.iterator();
      boolean var1 = var10000;

      while (var2.hasNext()) {
         com.dC_3 var3 = (com.dC_3)var2.next();
         var3.N = null;
         if (!var1) {
            break;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "î\u008c\u001e==ÒÉ6¶@\u009f\u0086\u0083±\u009ap¾³s{\u007f>\u000e¹\u0019Îkª,YwýGúçù\n\n ¤ï§´ôçxÊ²";
      int var12 = "î\u008c\u001e==ÒÉ6¶@\u009f\u0086\u0083±\u009ap¾³s{\u007f>\u000e¹\u0019Îkª,YwýGúçù\n\n ¤ï§´ôçxÊ²".length();
      char var9 = 22;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 90;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 90;
               var10006 = var14;
            } else {
               var23 = 90;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 90;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 16;
                     break;
                  case 1:
                     var41 = 32;
                     break;
                  case 2:
                     var41 = 48;
                     break;
                  case 3:
                     var41 = 17;
                     break;
                  case 4:
                     var41 = 22;
                     break;
                  case 5:
                     var41 = 98;
                     break;
                  default:
                     var41 = 49;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[3];
            long var0 = 734263515684718450L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "yZÂ\u0090ç~\u0003\u001eÀ-Ì¹G[ÅÎ";
            int var5 = "yZÂ\u0090ç~\u0003\u001eÀ-Ì¹G[ÅÎ".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            c = var6;
            d = new Integer[2];
            X = LoggerFactory.getLogger(ua_2.class);
            return;
         }

         var9 = var10.charAt(var8);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 4322) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 157;
               break;
            case 1:
               var10000 = 108;
               break;
            case 2:
               var10000 = 131;
               break;
            case 3:
               var10000 = 240;
               break;
            case 4:
               var10000 = 164;
               break;
            case 5:
               var10000 = 49;
               break;
            case 6:
               var10000 = 181;
               break;
            case 7:
               var10000 = 156;
               break;
            case 8:
               var10000 = 182;
               break;
            case 9:
               var10000 = 238;
               break;
            case 10:
               var10000 = 22;
               break;
            case 11:
               var10000 = 20;
               break;
            case 12:
               var10000 = 9;
               break;
            case 13:
               var10000 = 187;
               break;
            case 14:
               var10000 = 62;
               break;
            case 15:
               var10000 = 252;
               break;
            case 16:
               var10000 = 67;
               break;
            case 17:
               var10000 = 56;
               break;
            case 18:
               var10000 = 54;
               break;
            case 19:
               var10000 = 103;
               break;
            case 20:
               var10000 = 34;
               break;
            case 21:
               var10000 = 101;
               break;
            case 22:
               var10000 = 63;
               break;
            case 23:
               var10000 = 119;
               break;
            case 24:
               var10000 = 77;
               break;
            case 25:
               var10000 = 5;
               break;
            case 26:
               var10000 = 205;
               break;
            case 27:
               var10000 = 192;
               break;
            case 28:
               var10000 = 17;
               break;
            case 29:
               var10000 = 174;
               break;
            case 30:
               var10000 = 58;
               break;
            case 31:
               var10000 = 24;
               break;
            case 32:
               var10000 = 221;
               break;
            case 33:
               var10000 = 14;
               break;
            case 34:
               var10000 = 179;
               break;
            case 35:
               var10000 = 166;
               break;
            case 36:
               var10000 = 214;
               break;
            case 37:
               var10000 = 80;
               break;
            case 38:
               var10000 = 13;
               break;
            case 39:
               var10000 = 139;
               break;
            case 40:
               var10000 = 138;
               break;
            case 41:
               var10000 = 190;
               break;
            case 42:
               var10000 = 27;
               break;
            case 43:
               var10000 = 141;
               break;
            case 44:
               var10000 = 112;
               break;
            case 45:
               var10000 = 33;
               break;
            case 46:
               var10000 = 255;
               break;
            case 47:
               var10000 = 137;
               break;
            case 48:
               var10000 = 114;
               break;
            case 49:
               var10000 = 35;
               break;
            case 50:
               var10000 = 125;
               break;
            case 51:
               var10000 = 152;
               break;
            case 52:
               var10000 = 30;
               break;
            case 53:
               var10000 = 246;
               break;
            case 54:
               var10000 = 73;
               break;
            case 55:
               var10000 = 234;
               break;
            case 56:
               var10000 = 74;
               break;
            case 57:
               var10000 = 124;
               break;
            case 58:
               var10000 = 215;
               break;
            case 59:
               var10000 = 168;
               break;
            case 60:
               var10000 = 61;
               break;
            case 61:
               var10000 = 116;
               break;
            case 62:
               var10000 = 44;
               break;
            case 63:
               var10000 = 7;
               break;
            case 64:
               var10000 = 85;
               break;
            case 65:
               var10000 = 19;
               break;
            case 66:
               var10000 = 76;
               break;
            case 67:
               var10000 = 233;
               break;
            case 68:
               var10000 = 3;
               break;
            case 69:
               var10000 = 26;
               break;
            case 70:
               var10000 = 154;
               break;
            case 71:
               var10000 = 46;
               break;
            case 72:
               var10000 = 118;
               break;
            case 73:
               var10000 = 210;
               break;
            case 74:
               var10000 = 12;
               break;
            case 75:
               var10000 = 47;
               break;
            case 76:
               var10000 = 4;
               break;
            case 77:
               var10000 = 113;
               break;
            case 78:
               var10000 = 115;
               break;
            case 79:
               var10000 = 194;
               break;
            case 80:
               var10000 = 60;
               break;
            case 81:
               var10000 = 167;
               break;
            case 82:
               var10000 = 241;
               break;
            case 83:
               var10000 = 251;
               break;
            case 84:
               var10000 = 107;
               break;
            case 85:
               var10000 = 158;
               break;
            case 86:
               var10000 = 52;
               break;
            case 87:
               var10000 = 135;
               break;
            case 88:
               var10000 = 42;
               break;
            case 89:
               var10000 = 32;
               break;
            case 90:
               var10000 = 110;
               break;
            case 91:
               var10000 = 18;
               break;
            case 92:
               var10000 = 111;
               break;
            case 93:
               var10000 = 127;
               break;
            case 94:
               var10000 = 96;
               break;
            case 95:
               var10000 = 222;
               break;
            case 96:
               var10000 = 220;
               break;
            case 97:
               var10000 = 195;
               break;
            case 98:
               var10000 = 173;
               break;
            case 99:
               var10000 = 231;
               break;
            case 100:
               var10000 = 78;
               break;
            case 101:
               var10000 = 226;
               break;
            case 102:
               var10000 = 236;
               break;
            case 103:
               var10000 = 2;
               break;
            case 104:
               var10000 = 66;
               break;
            case 105:
               var10000 = 90;
               break;
            case 106:
               var10000 = 245;
               break;
            case 107:
               var10000 = 69;
               break;
            case 108:
               var10000 = 84;
               break;
            case 109:
               var10000 = 98;
               break;
            case 110:
               var10000 = 228;
               break;
            case 111:
               var10000 = 188;
               break;
            case 112:
               var10000 = 37;
               break;
            case 113:
               var10000 = 159;
               break;
            case 114:
               var10000 = 169;
               break;
            case 115:
               var10000 = 105;
               break;
            case 116:
               var10000 = 196;
               break;
            case 117:
               var10000 = 151;
               break;
            case 118:
               var10000 = 88;
               break;
            case 119:
               var10000 = 213;
               break;
            case 120:
               var10000 = 8;
               break;
            case 121:
               var10000 = 100;
               break;
            case 122:
               var10000 = 102;
               break;
            case 123:
               var10000 = 144;
               break;
            case 124:
               var10000 = 95;
               break;
            case 125:
               var10000 = 50;
               break;
            case 126:
               var10000 = 128;
               break;
            case 127:
               var10000 = 142;
               break;
            case 128:
               var10000 = 93;
               break;
            case 129:
               var10000 = 163;
               break;
            case 130:
               var10000 = 212;
               break;
            case 131:
               var10000 = 150;
               break;
            case 132:
               var10000 = 184;
               break;
            case 133:
               var10000 = 229;
               break;
            case 134:
               var10000 = 243;
               break;
            case 135:
               var10000 = 206;
               break;
            case 136:
               var10000 = 48;
               break;
            case 137:
               var10000 = 104;
               break;
            case 138:
               var10000 = 89;
               break;
            case 139:
               var10000 = 254;
               break;
            case 140:
               var10000 = 165;
               break;
            case 141:
               var10000 = 203;
               break;
            case 142:
               var10000 = 53;
               break;
            case 143:
               var10000 = 41;
               break;
            case 144:
               var10000 = 11;
               break;
            case 145:
               var10000 = 200;
               break;
            case 146:
               var10000 = 176;
               break;
            case 147:
               var10000 = 83;
               break;
            case 148:
               var10000 = 218;
               break;
            case 149:
               var10000 = 183;
               break;
            case 150:
               var10000 = 68;
               break;
            case 151:
               var10000 = 39;
               break;
            case 152:
               var10000 = 170;
               break;
            case 153:
               var10000 = 21;
               break;
            case 154:
               var10000 = 178;
               break;
            case 155:
               var10000 = 71;
               break;
            case 156:
               var10000 = 81;
               break;
            case 157:
               var10000 = 197;
               break;
            case 158:
               var10000 = 250;
               break;
            case 159:
               var10000 = 28;
               break;
            case 160:
               var10000 = 10;
               break;
            case 161:
               var10000 = 92;
               break;
            case 162:
               var10000 = 143;
               break;
            case 163:
               var10000 = 217;
               break;
            case 164:
               var10000 = 133;
               break;
            case 165:
               var10000 = 248;
               break;
            case 166:
               var10000 = 216;
               break;
            case 167:
               var10000 = 87;
               break;
            case 168:
               var10000 = 31;
               break;
            case 169:
               var10000 = 43;
               break;
            case 170:
               var10000 = 6;
               break;
            case 171:
               var10000 = 136;
               break;
            case 172:
               var10000 = 72;
               break;
            case 173:
               var10000 = 239;
               break;
            case 174:
               var10000 = 55;
               break;
            case 175:
               var10000 = 230;
               break;
            case 176:
               var10000 = 130;
               break;
            case 177:
               var10000 = 224;
               break;
            case 178:
               var10000 = 244;
               break;
            case 179:
               var10000 = 202;
               break;
            case 180:
               var10000 = 140;
               break;
            case 181:
               var10000 = 38;
               break;
            case 182:
               var10000 = 193;
               break;
            case 183:
               var10000 = 23;
               break;
            case 184:
               var10000 = 94;
               break;
            case 185:
               var10000 = 36;
               break;
            case 186:
               var10000 = 185;
               break;
            case 187:
               var10000 = 223;
               break;
            case 188:
               var10000 = 242;
               break;
            case 189:
               var10000 = 253;
               break;
            case 190:
               var10000 = 153;
               break;
            case 191:
               var10000 = 120;
               break;
            case 192:
               var10000 = 109;
               break;
            case 193:
               var10000 = 91;
               break;
            case 194:
               var10000 = 161;
               break;
            case 195:
               var10000 = 249;
               break;
            case 196:
               var10000 = 207;
               break;
            case 197:
               var10000 = 1;
               break;
            case 198:
               var10000 = 204;
               break;
            case 199:
               var10000 = 65;
               break;
            case 200:
               var10000 = 59;
               break;
            case 201:
               var10000 = 162;
               break;
            case 202:
               var10000 = 209;
               break;
            case 203:
               var10000 = 149;
               break;
            case 204:
               var10000 = 121;
               break;
            case 205:
               var10000 = 160;
               break;
            case 206:
               var10000 = 82;
               break;
            case 207:
               var10000 = 198;
               break;
            case 208:
               var10000 = 186;
               break;
            case 209:
               var10000 = 146;
               break;
            case 210:
               var10000 = 29;
               break;
            case 211:
               var10000 = 219;
               break;
            case 212:
               var10000 = 227;
               break;
            case 213:
               var10000 = 79;
               break;
            case 214:
               var10000 = 97;
               break;
            case 215:
               var10000 = 147;
               break;
            case 216:
               var10000 = 51;
               break;
            case 217:
               var10000 = 122;
               break;
            case 218:
               var10000 = 45;
               break;
            case 219:
               var10000 = 201;
               break;
            case 220:
               var10000 = 117;
               break;
            case 221:
               var10000 = 75;
               break;
            case 222:
               var10000 = 129;
               break;
            case 223:
               var10000 = 132;
               break;
            case 224:
               var10000 = 106;
               break;
            case 225:
               var10000 = 0;
               break;
            case 226:
               var10000 = 126;
               break;
            case 227:
               var10000 = 64;
               break;
            case 228:
               var10000 = 25;
               break;
            case 229:
               var10000 = 191;
               break;
            case 230:
               var10000 = 40;
               break;
            case 231:
               var10000 = 148;
               break;
            case 232:
               var10000 = 15;
               break;
            case 233:
               var10000 = 175;
               break;
            case 234:
               var10000 = 99;
               break;
            case 235:
               var10000 = 225;
               break;
            case 236:
               var10000 = 199;
               break;
            case 237:
               var10000 = 134;
               break;
            case 238:
               var10000 = 180;
               break;
            case 239:
               var10000 = 172;
               break;
            case 240:
               var10000 = 57;
               break;
            case 241:
               var10000 = 86;
               break;
            case 242:
               var10000 = 247;
               break;
            case 243:
               var10000 = 70;
               break;
            case 244:
               var10000 = 16;
               break;
            case 245:
               var10000 = 235;
               break;
            case 246:
               var10000 = 171;
               break;
            case 247:
               var10000 = 123;
               break;
            case 248:
               var10000 = 237;
               break;
            case 249:
               var10000 = 208;
               break;
            case 250:
               var10000 = 177;
               break;
            case 251:
               var10000 = 232;
               break;
            case 252:
               var10000 = 155;
               break;
            case 253:
               var10000 = 211;
               break;
            case 254:
               var10000 = 145;
               break;
            default:
               var10000 = 189;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11864;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





