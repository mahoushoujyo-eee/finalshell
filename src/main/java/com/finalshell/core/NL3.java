package com.finalshell.core;

import com.finalshell.io.YM3;
import com.finalshell.ui.model.EP;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.TimeZone;

public class NL3 extends Nv4 {
   protected final En2 B;
   public final YM3 w;
   public int k = 0;
   public String R = "\t";
   public String V;
   public DateFormat T;
   public String n;
   protected IdentityHashMap Y = null;
   protected Uh2_2 W;
   protected TimeZone D = Ok2.X;
   protected Locale y = Ok2.Y;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;
   public static long f;

   public NL3() {
      this(new YM3(), En2.p());
   }

   public NL3(YM3 var1) {
      this(var1, En2.p());
   }

   public NL3(En2 var1) {
      this(new YM3(), var1);
   }

   public NL3(YM3 var1, En2 var2) {
      this.w = var1;
      this.B = var2;
   }

   public String N() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 29
      // 09: getfield com/finalshell/core/NL3.T Ljava/text/DateFormat;
      // 0c: instanceof java/text/SimpleDateFormat
      // 0f: ifeq 28
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/core/NL3.T Ljava/text/DateFormat;
      // 1d: checkcast java/text/SimpleDateFormat
      // 20: invokevirtual java/text/SimpleDateFormat.toPattern ()Ljava/lang/String;
      // 23: areturn
      // 24: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/finalshell/core/NL3.V Ljava/lang/String;
      // 2c: areturn
   }

   public DateFormat x() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/NL3.T Ljava/text/DateFormat;
      // 08: aload 1
      // 09: ifnull 46
      // 0c: ifnonnull 42
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 43
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: getfield com/finalshell/core/NL3.V Ljava/lang/String;
      // 25: ifnull 42
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 0
      // 31: aload 0
      // 32: getfield com/finalshell/core/NL3.V Ljava/lang/String;
      // 35: invokespecial com/finalshell/core/NL3.v (Ljava/lang/String;)Ljava/text/DateFormat;
      // 38: putfield com/finalshell/core/NL3.T Ljava/text/DateFormat;
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 0
      // 43: getfield com/finalshell/core/NL3.T Ljava/text/DateFormat;
      // 46: areturn
   }

   public DateFormat v(String var1) {
      SimpleDateFormat var2 = new SimpleDateFormat(var1, this.y);
      var2.setTimeZone(this.D);
      return var2;
   }

   public void r(DateFormat param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: putfield com/finalshell/core/NL3.T Ljava/text/DateFormat;
      // 08: astore 2
      // 09: aload 0
      // 0a: aload 2
      // 0b: ifnull 23
      // 0e: getfield com/finalshell/core/NL3.V Ljava/lang/String;
      // 11: ifnull 27
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aconst_null
      // 24: putfield com/finalshell/core/NL3.V Ljava/lang/String;
      // 27: return
   }

   public void W(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: putfield com/finalshell/core/NL3.V Ljava/lang/String;
      // 08: astore 2
      // 09: aload 0
      // 0a: aload 2
      // 0b: ifnull 23
      // 0e: getfield com/finalshell/core/NL3.T Ljava/text/DateFormat;
      // 11: ifnull 27
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aconst_null
      // 24: putfield com/finalshell/core/NL3.T Ljava/text/DateFormat;
      // 27: return
   }

   public void Q(String var1) {
      this.n = var1;
   }

   public String z$String() {
      return this.n;
   }

   public Uh2_2 z$uh_2() {
      return this.W;
   }

   public void S(Uh2_2 var1) {
      this.W = var1;
   }

   public void N(Uh2_2 var1, Object var2, Object var3, int var4) {
      this.c(var1, var2, var3, var4, 0);
   }

   public void c(Uh2_2 param1, Object param2, Object param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 6
      // 05: aload 0
      // 06: aload 6
      // 08: ifnull 33
      // 0b: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 0e: getfield com/finalshell/io/YM3.g Z
      // 11: ifeq 20
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: return
      // 1c: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: new com/finalshell/core/Uh2_2
      // 24: dup
      // 25: aload 1
      // 26: aload 2
      // 27: aload 3
      // 28: iload 4
      // 2a: iload 5
      // 2c: invokespecial com/finalshell/core/Uh2_2.<init> (Lcom/finalshell/core/Uh2_2;Ljava/lang/Object;Ljava/lang/Object;II)V
      // 2f: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 32: aload 0
      // 33: getfield com/finalshell/core/NL3.Y Ljava/util/IdentityHashMap;
      // 36: aload 6
      // 38: ifnull 63
      // 3b: ifnonnull 57
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 0
      // 46: new java/util/IdentityHashMap
      // 49: dup
      // 4a: invokespecial java/util/IdentityHashMap.<init> ()V
      // 4d: putfield com/finalshell/core/NL3.Y Ljava/util/IdentityHashMap;
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 0
      // 58: getfield com/finalshell/core/NL3.Y Ljava/util/IdentityHashMap;
      // 5b: aload 2
      // 5c: aload 0
      // 5d: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 60: invokevirtual java/util/IdentityHashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 63: pop
      // 64: return
   }

   public void E(Object var1, Object var2) {
      this.N(this.W, var1, var2, 0);
   }

   public void T() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 1e
      // 09: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 0c: ifnull 28
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 22: getfield com/finalshell/core/Uh2_2.M Lcom/finalshell/core/Uh2_2;
      // 25: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 28: return
   }

   public final boolean x(Type param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 08: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 0b: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0e: ifeq 69
      // 11: aload 1
      // 12: ifnonnull 65
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 20: getstatic com/finalshell/ui/model/EP.NotWriteRootClassName Lcom/finalshell/ui/model/EP;
      // 23: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 26: aload 3
      // 27: ifnull 66
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: ifeq 65
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 3f: aload 3
      // 40: ifnull 62
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: ifnull 69
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 58: getfield com/finalshell/core/Uh2_2.M Lcom/finalshell/core/Uh2_2;
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: ifnull 69
      // 65: bipush 1
      // 66: goto 6a
      // 69: bipush 0
      // 6a: ireturn
   }

   public boolean S(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/NL3.Y Ljava/util/IdentityHashMap;
      // 08: aload 2
      // 09: ifnull 24
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/finalshell/core/NL3.Y Ljava/util/IdentityHashMap;
      // 20: aload 1
      // 21: invokevirtual java/util/IdentityHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 24: checkcast com/finalshell/core/Uh2_2
      // 27: astore 3
      // 28: aload 3
      // 29: aload 2
      // 2a: ifnull 3e
      // 2d: ifnonnull 3d
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: bipush 0
      // 38: ireturn
      // 39: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 1
      // 3e: aload 2
      // 3f: ifnull 59
      // 42: invokestatic java/util/Collections.emptyMap ()Ljava/util/Map;
      // 45: if_acmpne 55
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 0
      // 50: ireturn
      // 51: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: aload 3
      // 56: getfield com/finalshell/core/Uh2_2.D Ljava/lang/Object;
      // 59: astore 4
      // 5b: aload 4
      // 5d: aload 2
      // 5e: ifnull 6d
      // 61: ifnull 98
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 4
      // 6d: instanceof java/lang/Integer
      // 70: aload 2
      // 71: ifnull 99
      // 74: ifne 98
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: aload 4
      // 80: instanceof java/lang/String
      // 83: aload 2
      // 84: ifnull 99
      // 87: goto 8e
      // 8a: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: ifeq 9c
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: bipush 1
      // 99: goto 9d
      // 9c: bipush 0
      // 9d: ireturn
   }

   public void G(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 007: astore 3
      // 008: astore 2
      // 009: aload 3
      // 00a: getfield com/finalshell/core/Uh2_2.Q Ljava/lang/Object;
      // 00d: astore 4
      // 00f: aload 2
      // 010: ifnull 037
      // 013: aload 1
      // 014: aload 4
      // 016: if_acmpne 038
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 024: sipush 11860
      // 027: sipush -31103
      // 02a: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 02d: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: return
      // 038: aload 3
      // 039: getfield com/finalshell/core/Uh2_2.M Lcom/finalshell/core/Uh2_2;
      // 03c: astore 5
      // 03e: aload 5
      // 040: aload 2
      // 041: ifnull 074
      // 044: ifnull 073
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: aload 1
      // 04f: aload 5
      // 051: getfield com/finalshell/core/Uh2_2.Q Ljava/lang/Object;
      // 054: if_acmpne 073
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 062: sipush 11867
      // 065: sipush 6822
      // 068: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 06b: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 06e: return
      // 06f: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: aload 3
      // 074: astore 6
      // 076: aload 6
      // 078: getfield com/finalshell/core/Uh2_2.M Lcom/finalshell/core/Uh2_2;
      // 07b: ifnonnull 08d
      // 07e: aload 2
      // 07f: ifnull 094
      // 082: aload 2
      // 083: ifnonnull 098
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: aload 6
      // 08f: getfield com/finalshell/core/Uh2_2.M Lcom/finalshell/core/Uh2_2;
      // 092: astore 6
      // 094: aload 2
      // 095: ifnonnull 076
      // 098: aload 1
      // 099: aload 2
      // 09a: ifnull 0e6
      // 09d: aload 6
      // 09f: getfield com/finalshell/core/Uh2_2.Q Ljava/lang/Object;
      // 0a2: if_acmpne 0c7
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 0b0: sipush 11866
      // 0b3: sipush -14590
      // 0b6: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 0b9: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 0bc: aload 2
      // 0bd: ifnonnull 107
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 0cb: sipush 11861
      // 0ce: sipush -28101
      // 0d1: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 0d4: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 0d7: aload 0
      // 0d8: getfield com/finalshell/core/NL3.Y Ljava/util/IdentityHashMap;
      // 0db: aload 1
      // 0dc: invokevirtual java/util/IdentityHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: checkcast com/finalshell/core/Uh2_2
      // 0e9: invokevirtual com/finalshell/core/Uh2_2.toString ()Ljava/lang/String;
      // 0ec: astore 7
      // 0ee: aload 0
      // 0ef: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 0f2: aload 7
      // 0f4: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 0f7: aload 0
      // 0f8: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 0fb: sipush 11862
      // 0fe: sipush -4785
      // 101: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 104: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 107: return
   }

   public boolean m(Nv4 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/NL3.p Ljava/util/List;
      // 08: aload 2
      // 09: ifnull 3f
      // 0c: ifnull 34
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/NL3.p Ljava/util/List;
      // 1a: invokeinterface java/util/List.size ()I 1
      // 1f: aload 2
      // 20: ifnull f6
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: ifgt f5
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: getfield com/finalshell/core/NL3.x Ljava/util/List;
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 2
      // 40: ifnull 76
      // 43: ifnull 6b
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield com/finalshell/core/NL3.x Ljava/util/List;
      // 51: invokeinterface java/util/List.size ()I 1
      // 56: aload 2
      // 57: ifnull f6
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: ifgt f5
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 1
      // 6c: getfield com/finalshell/core/Nv4.p Ljava/util/List;
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: aload 2
      // 77: ifnull ad
      // 7a: ifnull a2
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: aload 1
      // 85: getfield com/finalshell/core/Nv4.p Ljava/util/List;
      // 88: invokeinterface java/util/List.size ()I 1
      // 8d: aload 2
      // 8e: ifnull f6
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: ifgt f5
      // 9b: goto a2
      // 9e: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: aload 1
      // a3: getfield com/finalshell/core/Nv4.x Ljava/util/List;
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: aload 2
      // ae: ifnull c6
      // b1: ifnull d9
      // b4: goto bb
      // b7: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba: athrow
      // bb: aload 1
      // bc: getfield com/finalshell/core/Nv4.x Ljava/util/List;
      // bf: goto c6
      // c2: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c5: athrow
      // c6: invokeinterface java/util/List.size ()I 1
      // cb: aload 2
      // cc: ifnull f6
      // cf: ifgt f5
      // d2: goto d9
      // d5: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d8: athrow
      // d9: aload 0
      // da: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // dd: getfield com/finalshell/io/YM3.z Z
      // e0: aload 2
      // e1: ifnull f6
      // e4: goto eb
      // e7: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ea: athrow
      // eb: ifeq f9
      // ee: goto f5
      // f1: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f4: athrow
      // f5: bipush 1
      // f6: goto fa
      // f9: bipush 0
      // fa: ireturn
   }

   public boolean o(Nv4 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/NL3.U Ljava/util/List;
      // 08: aload 2
      // 09: ifnull 3f
      // 0c: ifnull 34
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/NL3.U Ljava/util/List;
      // 1a: invokeinterface java/util/List.size ()I 1
      // 1f: aload 2
      // 20: ifnull 6c
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: ifgt 6b
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 1
      // 35: getfield com/finalshell/core/Nv4.U Ljava/util/List;
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 2
      // 40: ifnull 58
      // 43: ifnull 6f
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 1
      // 4e: getfield com/finalshell/core/Nv4.U Ljava/util/List;
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: invokeinterface java/util/List.size ()I 1
      // 5d: aload 2
      // 5e: ifnull 6c
      // 61: ifle 6f
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
   }

   public boolean T(Nv4 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/NL3.m Ljava/util/List;
      // 08: aload 2
      // 09: ifnull 3f
      // 0c: ifnull 34
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/NL3.m Ljava/util/List;
      // 1a: invokeinterface java/util/List.size ()I 1
      // 1f: aload 2
      // 20: ifnull 6c
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: ifgt 6b
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 1
      // 35: getfield com/finalshell/core/Nv4.m Ljava/util/List;
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 2
      // 40: ifnull 58
      // 43: ifnull 6f
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 1
      // 4e: getfield com/finalshell/core/Nv4.m Ljava/util/List;
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: invokeinterface java/util/List.size ()I 1
      // 5d: aload 2
      // 5e: ifnull 6c
      // 61: ifle 6f
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
   }

   public int a() {
      return this.k;
   }

   public void C() {
      this.k++;
   }

   public void r() {
      this.k--;
   }

   public void i() {
      String var10000 = Nv4.o();
      this.w.write(a(9078, 3490853001805057648L));
      int var2 = 0;
      String var1 = var10000;

      while (var2 < this.k) {
         this.w.write(this.R);
         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   public YM3 S() {
      return this.w;
   }

   @Override
   public String toString() {
      return this.w.toString();
   }

   public void D(EP var1, boolean var2) {
      this.w.k(var1, var2);
   }

   public boolean z(EP var1) {
      return this.w.I(var1);
   }

   public void e() {
      this.w.Y();
   }

   public En2 K() {
      return this.B;
   }

   public static void p(Writer var0, Object var1) {
      YM3 var2 = new YM3();

      try {
         NL3 var3 = new NL3(var2);
         var3.B(var1);
         var2.F(var0);
      } catch (IOException var7) {
         throw new Hi2(var7.getMessage(), var7);
      } finally {
         var2.close();
      }
   }

   public static void c(YM3 var0, Object var1) {
      NL3 var2 = new NL3(var0);
      var2.B(var1);
   }

   public final void B(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 20
      // 09: ifnonnull 1f
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 17: invokevirtual com/finalshell/io/YM3.Y ()V
      // 1a: return
      // 1b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 23: astore 3
      // 24: aload 0
      // 25: aload 3
      // 26: invokevirtual com/finalshell/core/NL3.E (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 29: astore 4
      // 2b: aload 4
      // 2d: aload 0
      // 2e: aload 1
      // 2f: aconst_null
      // 30: aconst_null
      // 31: bipush 0
      // 32: invokeinterface com/finalshell/core/Ak2.u (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 37: goto 4b
      // 3a: astore 5
      // 3c: new com/finalshell/core/Hi2
      // 3f: dup
      // 40: aload 5
      // 42: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 45: aload 5
      // 47: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 4a: athrow
      // 4b: return
   }

   public final void K(Object param1, java.lang.Class param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 3
      // 05: ifnull 21
      // 08: aload 1
      // 09: ifnonnull 22
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 17: invokevirtual com/finalshell/io/YM3.Y ()V
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: return
      // 22: aload 0
      // 23: aload 2
      // 24: invokevirtual com/finalshell/core/NL3.E (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 27: astore 4
      // 29: aload 4
      // 2b: aload 0
      // 2c: aload 1
      // 2d: aconst_null
      // 2e: aconst_null
      // 2f: bipush 0
      // 30: invokeinterface com/finalshell/core/Ak2.u (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 35: goto 49
      // 38: astore 5
      // 3a: new com/finalshell/core/Hi2
      // 3d: dup
      // 3e: aload 5
      // 40: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 43: aload 5
      // 45: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 48: athrow
      // 49: return
   }

   public final void c(Object var1, Object var2) {
      this.I(var1, var2, null, 0);
   }

   protected final void A(char param1, String param2, Object param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 4
      // 07: ifnull 31
      // 0a: iload 1
      // 0b: ifeq 24
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: aload 0
      // 16: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 19: iload 1
      // 1a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 28: aload 2
      // 29: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 2c: aload 0
      // 2d: aload 3
      // 2e: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 31: return
   }

   public final void I(Object var1, Object var2, Type var3, int var4) {
      String var5 = Nv4.o();

      try {
         label28: {
            Object var10000;
            label27: {
               try {
                  var10000 = var1;
                  if (var5 == null) {
                     break label27;
                  }

                  if (var1 == null) {
                     break label28;
                  }
               } catch (IOException var8) {
                  throw a(var8);
               }

               var10000 = var1;
            }

            java.lang.Class var6 = var10000.getClass();
            Ak2 var7 = this.E(var6);
            var7.u(this, var1, var2, var3, var4);
            return;
         }

         this.w.Y();
      } catch (IOException var9) {
         throw new Hi2(var9.getMessage(), var9);
      }
   }

   public final void l(Object param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 1
      // 005: instanceof java/util/Date
      // 008: aload 3
      // 009: ifnull 119
      // 00c: ifeq 115
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: sipush 11858
      // 019: sipush -15011
      // 01c: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 01f: aload 2
      // 020: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 023: aload 3
      // 024: ifnull 05d
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: ifeq 050
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: aload 1
      // 039: checkcast java/util/Date
      // 03c: invokevirtual java/util/Date.getTime ()J
      // 03f: getstatic com/finalshell/core/NL3.f J
      // 042: ldiv
      // 043: lstore 4
      // 045: aload 0
      // 046: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 049: lload 4
      // 04b: l2i
      // 04c: invokevirtual com/finalshell/io/YM3.v (I)V
      // 04f: return
      // 050: sipush 11864
      // 053: sipush -28283
      // 056: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 059: aload 2
      // 05a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05d: ifeq 073
      // 060: aload 0
      // 061: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 064: aload 1
      // 065: checkcast java/util/Date
      // 068: invokevirtual java/util/Date.getTime ()J
      // 06b: invokevirtual com/finalshell/io/YM3.i (J)V
      // 06e: return
      // 06f: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: aload 0
      // 074: invokevirtual com/finalshell/core/NL3.x ()Ljava/text/DateFormat;
      // 077: astore 4
      // 079: aload 4
      // 07b: aload 3
      // 07c: ifnull 102
      // 07f: ifnonnull 100
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: aload 2
      // 08a: aload 3
      // 08b: ifnull 0df
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: ifnull 0c9
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: aload 2
      // 0a1: invokespecial com/finalshell/core/NL3.v (Ljava/lang/String;)Ljava/text/DateFormat;
      // 0a4: astore 4
      // 0a6: goto 100
      // 0a9: astore 5
      // 0ab: aload 2
      // 0ac: ldc_w "T"
      // 0af: sipush 11859
      // 0b2: sipush 14725
      // 0b5: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 0b8: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0bb: astore 6
      // 0bd: aload 0
      // 0be: aload 6
      // 0c0: invokespecial com/finalshell/core/NL3.v (Ljava/lang/String;)Ljava/text/DateFormat;
      // 0c3: astore 4
      // 0c5: aload 3
      // 0c6: ifnonnull 100
      // 0c9: aload 0
      // 0ca: aload 3
      // 0cb: ifnull 0f8
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: getfield com/finalshell/core/NL3.n Ljava/lang/String;
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: ifnull 0f0
      // 0e2: aload 0
      // 0e3: aload 0
      // 0e4: getfield com/finalshell/core/NL3.n Ljava/lang/String;
      // 0e7: invokespecial com/finalshell/core/NL3.v (Ljava/lang/String;)Ljava/text/DateFormat;
      // 0ea: astore 4
      // 0ec: aload 3
      // 0ed: ifnonnull 100
      // 0f0: aload 0
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: getstatic com/finalshell/core/Ok2.z Ljava/lang/String;
      // 0fb: invokespecial com/finalshell/core/NL3.v (Ljava/lang/String;)Ljava/text/DateFormat;
      // 0fe: astore 4
      // 100: aload 4
      // 102: aload 1
      // 103: checkcast java/util/Date
      // 106: invokevirtual java/text/DateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 109: astore 5
      // 10b: aload 0
      // 10c: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 10f: aload 5
      // 111: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 114: return
      // 115: aload 1
      // 116: instanceof [B
      // 119: aload 3
      // 11a: ifnull 22f
      // 11d: ifeq 220
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aload 1
      // 128: checkcast [B
      // 12b: astore 4
      // 12d: sipush 11865
      // 130: sipush 18259
      // 133: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 136: aload 2
      // 137: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13a: aload 3
      // 13b: ifnull 15c
      // 13e: ifne 16a
      // 141: goto 148
      // 144: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: sipush 11856
      // 14b: sipush -13883
      // 14e: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 151: aload 2
      // 152: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 155: goto 15c
      // 158: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: aload 3
      // 15d: ifnull 1f8
      // 160: ifeq 1e4
      // 163: goto 16a
      // 166: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aconst_null
      // 16b: astore 5
      // 16d: new java/io/ByteArrayOutputStream
      // 170: dup
      // 171: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 174: astore 6
      // 176: aload 4
      // 178: arraylength
      // 179: sipush 4155
      // 17c: ldc2_w 2386301453292731711
      // 17f: invokestatic com/finalshell/core/NL3.a (IJ)I
      // 182: if_icmpge 196
      // 185: new java/util/zip/GZIPOutputStream
      // 188: dup
      // 189: aload 6
      // 18b: aload 4
      // 18d: arraylength
      // 18e: invokespecial java/util/zip/GZIPOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 191: astore 5
      // 193: goto 1a1
      // 196: new java/util/zip/GZIPOutputStream
      // 199: dup
      // 19a: aload 6
      // 19c: invokespecial java/util/zip/GZIPOutputStream.<init> (Ljava/io/OutputStream;)V
      // 19f: astore 5
      // 1a1: aload 5
      // 1a3: aload 4
      // 1a5: invokevirtual java/util/zip/GZIPOutputStream.write ([B)V
      // 1a8: aload 5
      // 1aa: invokevirtual java/util/zip/GZIPOutputStream.finish ()V
      // 1ad: aload 0
      // 1ae: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 1b1: aload 6
      // 1b3: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 1b6: invokevirtual com/finalshell/io/YM3.B ([B)V
      // 1b9: aload 5
      // 1bb: invokestatic com/finalshell/core/S7.o (Ljava/io/Closeable;)V
      // 1be: goto 1e0
      // 1c1: astore 6
      // 1c3: new com/finalshell/core/Hi2
      // 1c6: dup
      // 1c7: sipush 11857
      // 1ca: sipush 13217
      // 1cd: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 1d0: aload 6
      // 1d2: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1d5: athrow
      // 1d6: astore 7
      // 1d8: aload 5
      // 1da: invokestatic com/finalshell/core/S7.o (Ljava/io/Closeable;)V
      // 1dd: aload 7
      // 1df: athrow
      // 1e0: aload 3
      // 1e1: ifnonnull 21f
      // 1e4: sipush 11863
      // 1e7: sipush -20371
      // 1ea: invokestatic com/finalshell/core/NL3.a (II)Ljava/lang/String;
      // 1ed: aload 2
      // 1ee: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f1: goto 1f8
      // 1f4: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f7: athrow
      // 1f8: ifeq 20f
      // 1fb: aload 0
      // 1fc: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 1ff: aload 4
      // 201: invokevirtual com/finalshell/io/YM3.W ([B)V
      // 204: aload 3
      // 205: ifnonnull 21f
      // 208: goto 20f
      // 20b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20e: athrow
      // 20f: aload 0
      // 210: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 213: aload 4
      // 215: invokevirtual com/finalshell/io/YM3.B ([B)V
      // 218: goto 21f
      // 21b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21e: athrow
      // 21f: return
      // 220: aload 1
      // 221: aload 3
      // 222: ifnull 233
      // 225: instanceof java/util/Collection
      // 228: goto 22f
      // 22b: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22e: athrow
      // 22f: ifeq 2ba
      // 232: aload 1
      // 233: checkcast java/util/Collection
      // 236: astore 4
      // 238: aload 4
      // 23a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 23f: astore 5
      // 241: aload 0
      // 242: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 245: sipush 16542
      // 248: ldc2_w 2117451915135135134
      // 24b: invokestatic com/finalshell/core/NL3.a (IJ)I
      // 24e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 251: bipush 0
      // 252: istore 6
      // 254: iload 6
      // 256: aload 4
      // 258: invokeinterface java/util/Collection.size ()I 1
      // 25d: if_icmpge 2a9
      // 260: aload 5
      // 262: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 267: astore 7
      // 269: aload 3
      // 26a: ifnull 2b9
      // 26d: aload 3
      // 26e: ifnull 2a5
      // 271: goto 278
      // 274: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 277: athrow
      // 278: iload 6
      // 27a: ifeq 29b
      // 27d: goto 284
      // 280: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 283: athrow
      // 284: aload 0
      // 285: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 288: sipush 6274
      // 28b: ldc2_w 1782675968294188423
      // 28e: invokestatic com/finalshell/core/NL3.a (IJ)I
      // 291: invokevirtual com/finalshell/io/YM3.write (I)V
      // 294: goto 29b
      // 297: invokestatic com/finalshell/core/NL3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29a: athrow
      // 29b: aload 0
      // 29c: aload 7
      // 29e: aload 2
      // 29f: invokevirtual com/finalshell/core/NL3.l (Ljava/lang/Object;Ljava/lang/String;)V
      // 2a2: iinc 6 1
      // 2a5: aload 3
      // 2a6: ifnonnull 254
      // 2a9: aload 0
      // 2aa: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 2ad: sipush 3626
      // 2b0: ldc2_w 4843756110726882093
      // 2b3: invokestatic com/finalshell/core/NL3.a (IJ)I
      // 2b6: invokevirtual com/finalshell/io/YM3.write (I)V
      // 2b9: return
      // 2ba: aload 0
      // 2bb: aload 1
      // 2bc: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 2bf: return
   }

   public final void l(String var1) {
      Wk2_2.b.X(this, var1);
   }

   public Ak2 E(java.lang.Class var1) {
      return this.B.O$ak_2(var1);
   }

   public void g() {
      this.w.close();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 11858) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 209;
               break;
            case 1:
               var10000 = 171;
               break;
            case 2:
               var10000 = 175;
               break;
            case 3:
               var10000 = 44;
               break;
            case 4:
               var10000 = 0;
               break;
            case 5:
               var10000 = 23;
               break;
            case 6:
               var10000 = 140;
               break;
            case 7:
               var10000 = 40;
               break;
            case 8:
               var10000 = 8;
               break;
            case 9:
               var10000 = 21;
               break;
            case 10:
               var10000 = 191;
               break;
            case 11:
               var10000 = 118;
               break;
            case 12:
               var10000 = 247;
               break;
            case 13:
               var10000 = 63;
               break;
            case 14:
               var10000 = 49;
               break;
            case 15:
               var10000 = 160;
               break;
            case 16:
               var10000 = 124;
               break;
            case 17:
               var10000 = 202;
               break;
            case 18:
               var10000 = 132;
               break;
            case 19:
               var10000 = 136;
               break;
            case 20:
               var10000 = 180;
               break;
            case 21:
               var10000 = 139;
               break;
            case 22:
               var10000 = 91;
               break;
            case 23:
               var10000 = 41;
               break;
            case 24:
               var10000 = 219;
               break;
            case 25:
               var10000 = 58;
               break;
            case 26:
               var10000 = 32;
               break;
            case 27:
               var10000 = 225;
               break;
            case 28:
               var10000 = 103;
               break;
            case 29:
               var10000 = 129;
               break;
            case 30:
               var10000 = 128;
               break;
            case 31:
               var10000 = 9;
               break;
            case 32:
               var10000 = 94;
               break;
            case 33:
               var10000 = 101;
               break;
            case 34:
               var10000 = 252;
               break;
            case 35:
               var10000 = 31;
               break;
            case 36:
               var10000 = 68;
               break;
            case 37:
               var10000 = 164;
               break;
            case 38:
               var10000 = 148;
               break;
            case 39:
               var10000 = 168;
               break;
            case 40:
               var10000 = 102;
               break;
            case 41:
               var10000 = 48;
               break;
            case 42:
               var10000 = 163;
               break;
            case 43:
               var10000 = 181;
               break;
            case 44:
               var10000 = 20;
               break;
            case 45:
               var10000 = 95;
               break;
            case 46:
               var10000 = 104;
               break;
            case 47:
               var10000 = 117;
               break;
            case 48:
               var10000 = 241;
               break;
            case 49:
               var10000 = 33;
               break;
            case 50:
               var10000 = 207;
               break;
            case 51:
               var10000 = 93;
               break;
            case 52:
               var10000 = 239;
               break;
            case 53:
               var10000 = 97;
               break;
            case 54:
               var10000 = 234;
               break;
            case 55:
               var10000 = 76;
               break;
            case 56:
               var10000 = 186;
               break;
            case 57:
               var10000 = 205;
               break;
            case 58:
               var10000 = 250;
               break;
            case 59:
               var10000 = 98;
               break;
            case 60:
               var10000 = 141;
               break;
            case 61:
               var10000 = 79;
               break;
            case 62:
               var10000 = 248;
               break;
            case 63:
               var10000 = 231;
               break;
            case 64:
               var10000 = 12;
               break;
            case 65:
               var10000 = 213;
               break;
            case 66:
               var10000 = 238;
               break;
            case 67:
               var10000 = 216;
               break;
            case 68:
               var10000 = 166;
               break;
            case 69:
               var10000 = 81;
               break;
            case 70:
               var10000 = 80;
               break;
            case 71:
               var10000 = 106;
               break;
            case 72:
               var10000 = 222;
               break;
            case 73:
               var10000 = 113;
               break;
            case 74:
               var10000 = 172;
               break;
            case 75:
               var10000 = 194;
               break;
            case 76:
               var10000 = 123;
               break;
            case 77:
               var10000 = 133;
               break;
            case 78:
               var10000 = 223;
               break;
            case 79:
               var10000 = 157;
               break;
            case 80:
               var10000 = 215;
               break;
            case 81:
               var10000 = 13;
               break;
            case 82:
               var10000 = 70;
               break;
            case 83:
               var10000 = 111;
               break;
            case 84:
               var10000 = 195;
               break;
            case 85:
               var10000 = 22;
               break;
            case 86:
               var10000 = 224;
               break;
            case 87:
               var10000 = 3;
               break;
            case 88:
               var10000 = 218;
               break;
            case 89:
               var10000 = 233;
               break;
            case 90:
               var10000 = 84;
               break;
            case 91:
               var10000 = 115;
               break;
            case 92:
               var10000 = 244;
               break;
            case 93:
               var10000 = 227;
               break;
            case 94:
               var10000 = 83;
               break;
            case 95:
               var10000 = 151;
               break;
            case 96:
               var10000 = 67;
               break;
            case 97:
               var10000 = 243;
               break;
            case 98:
               var10000 = 187;
               break;
            case 99:
               var10000 = 138;
               break;
            case 100:
               var10000 = 176;
               break;
            case 101:
               var10000 = 53;
               break;
            case 102:
               var10000 = 25;
               break;
            case 103:
               var10000 = 208;
               break;
            case 104:
               var10000 = 17;
               break;
            case 105:
               var10000 = 11;
               break;
            case 106:
               var10000 = 7;
               break;
            case 107:
               var10000 = 90;
               break;
            case 108:
               var10000 = 43;
               break;
            case 109:
               var10000 = 72;
               break;
            case 110:
               var10000 = 105;
               break;
            case 111:
               var10000 = 78;
               break;
            case 112:
               var10000 = 253;
               break;
            case 113:
               var10000 = 26;
               break;
            case 114:
               var10000 = 159;
               break;
            case 115:
               var10000 = 60;
               break;
            case 116:
               var10000 = 174;
               break;
            case 117:
               var10000 = 178;
               break;
            case 118:
               var10000 = 196;
               break;
            case 119:
               var10000 = 4;
               break;
            case 120:
               var10000 = 203;
               break;
            case 121:
               var10000 = 10;
               break;
            case 122:
               var10000 = 109;
               break;
            case 123:
               var10000 = 149;
               break;
            case 124:
               var10000 = 153;
               break;
            case 125:
               var10000 = 170;
               break;
            case 126:
               var10000 = 65;
               break;
            case 127:
               var10000 = 212;
               break;
            case 128:
               var10000 = 242;
               break;
            case 129:
               var10000 = 34;
               break;
            case 130:
               var10000 = 254;
               break;
            case 131:
               var10000 = 144;
               break;
            case 132:
               var10000 = 204;
               break;
            case 133:
               var10000 = 220;
               break;
            case 134:
               var10000 = 228;
               break;
            case 135:
               var10000 = 73;
               break;
            case 136:
               var10000 = 36;
               break;
            case 137:
               var10000 = 192;
               break;
            case 138:
               var10000 = 154;
               break;
            case 139:
               var10000 = 24;
               break;
            case 140:
               var10000 = 61;
               break;
            case 141:
               var10000 = 245;
               break;
            case 142:
               var10000 = 30;
               break;
            case 143:
               var10000 = 66;
               break;
            case 144:
               var10000 = 39;
               break;
            case 145:
               var10000 = 214;
               break;
            case 146:
               var10000 = 145;
               break;
            case 147:
               var10000 = 50;
               break;
            case 148:
               var10000 = 184;
               break;
            case 149:
               var10000 = 161;
               break;
            case 150:
               var10000 = 198;
               break;
            case 151:
               var10000 = 99;
               break;
            case 152:
               var10000 = 199;
               break;
            case 153:
               var10000 = 130;
               break;
            case 154:
               var10000 = 110;
               break;
            case 155:
               var10000 = 158;
               break;
            case 156:
               var10000 = 173;
               break;
            case 157:
               var10000 = 237;
               break;
            case 158:
               var10000 = 182;
               break;
            case 159:
               var10000 = 46;
               break;
            case 160:
               var10000 = 18;
               break;
            case 161:
               var10000 = 64;
               break;
            case 162:
               var10000 = 69;
               break;
            case 163:
               var10000 = 142;
               break;
            case 164:
               var10000 = 146;
               break;
            case 165:
               var10000 = 185;
               break;
            case 166:
               var10000 = 125;
               break;
            case 167:
               var10000 = 57;
               break;
            case 168:
               var10000 = 152;
               break;
            case 169:
               var10000 = 35;
               break;
            case 170:
               var10000 = 190;
               break;
            case 171:
               var10000 = 5;
               break;
            case 172:
               var10000 = 56;
               break;
            case 173:
               var10000 = 193;
               break;
            case 174:
               var10000 = 71;
               break;
            case 175:
               var10000 = 211;
               break;
            case 176:
               var10000 = 38;
               break;
            case 177:
               var10000 = 162;
               break;
            case 178:
               var10000 = 197;
               break;
            case 179:
               var10000 = 87;
               break;
            case 180:
               var10000 = 240;
               break;
            case 181:
               var10000 = 55;
               break;
            case 182:
               var10000 = 246;
               break;
            case 183:
               var10000 = 210;
               break;
            case 184:
               var10000 = 88;
               break;
            case 185:
               var10000 = 82;
               break;
            case 186:
               var10000 = 107;
               break;
            case 187:
               var10000 = 27;
               break;
            case 188:
               var10000 = 52;
               break;
            case 189:
               var10000 = 183;
               break;
            case 190:
               var10000 = 96;
               break;
            case 191:
               var10000 = 62;
               break;
            case 192:
               var10000 = 206;
               break;
            case 193:
               var10000 = 29;
               break;
            case 194:
               var10000 = 177;
               break;
            case 195:
               var10000 = 137;
               break;
            case 196:
               var10000 = 42;
               break;
            case 197:
               var10000 = 255;
               break;
            case 198:
               var10000 = 155;
               break;
            case 199:
               var10000 = 165;
               break;
            case 200:
               var10000 = 201;
               break;
            case 201:
               var10000 = 47;
               break;
            case 202:
               var10000 = 89;
               break;
            case 203:
               var10000 = 2;
               break;
            case 204:
               var10000 = 75;
               break;
            case 205:
               var10000 = 85;
               break;
            case 206:
               var10000 = 134;
               break;
            case 207:
               var10000 = 116;
               break;
            case 208:
               var10000 = 121;
               break;
            case 209:
               var10000 = 6;
               break;
            case 210:
               var10000 = 15;
               break;
            case 211:
               var10000 = 251;
               break;
            case 212:
               var10000 = 77;
               break;
            case 213:
               var10000 = 169;
               break;
            case 214:
               var10000 = 232;
               break;
            case 215:
               var10000 = 14;
               break;
            case 216:
               var10000 = 229;
               break;
            case 217:
               var10000 = 28;
               break;
            case 218:
               var10000 = 92;
               break;
            case 219:
               var10000 = 156;
               break;
            case 220:
               var10000 = 249;
               break;
            case 221:
               var10000 = 127;
               break;
            case 222:
               var10000 = 135;
               break;
            case 223:
               var10000 = 200;
               break;
            case 224:
               var10000 = 37;
               break;
            case 225:
               var10000 = 19;
               break;
            case 226:
               var10000 = 100;
               break;
            case 227:
               var10000 = 188;
               break;
            case 228:
               var10000 = 131;
               break;
            case 229:
               var10000 = 147;
               break;
            case 230:
               var10000 = 1;
               break;
            case 231:
               var10000 = 86;
               break;
            case 232:
               var10000 = 179;
               break;
            case 233:
               var10000 = 108;
               break;
            case 234:
               var10000 = 189;
               break;
            case 235:
               var10000 = 236;
               break;
            case 236:
               var10000 = 51;
               break;
            case 237:
               var10000 = 54;
               break;
            case 238:
               var10000 = 120;
               break;
            case 239:
               var10000 = 16;
               break;
            case 240:
               var10000 = 143;
               break;
            case 241:
               var10000 = 226;
               break;
            case 242:
               var10000 = 59;
               break;
            case 243:
               var10000 = 230;
               break;
            case 244:
               var10000 = 126;
               break;
            case 245:
               var10000 = 150;
               break;
            case 246:
               var10000 = 119;
               break;
            case 247:
               var10000 = 122;
               break;
            case 248:
               var10000 = 221;
               break;
            case 249:
               var10000 = 45;
               break;
            case 250:
               var10000 = 112;
               break;
            case 251:
               var10000 = 235;
               break;
            case 252:
               var10000 = 114;
               break;
            case 253:
               var10000 = 167;
               break;
            case 254:
               var10000 = 217;
               break;
            default:
               var10000 = 74;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27908;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[12];
      int var13 = 0;
      String var12 = "Ê5\u008dÞ\u0010É`A\u0003Ö\rX\u000bÖ\u0093^\u00942\u0082{T\u0085Çî\u0015+àó÷Î(\u0082\u0002pc«ú\u0007\u00990\u0018\u0018ö)\u0081\u009e\u0002 \u0081\u0003¨ºn\fJH\u001f¾·\u0081èù\u009bd\u0094(\t\u009e\"\u0085óä(\u0082ÌÖ\fï§«C!>:\u000eÁþß\u0093\r^Ç\u009dOç¿â>Úò°\u0006\u008c";
      int var14 = "Ê5\u008dÞ\u0010É`A\u0003Ö\rX\u000bÖ\u0093^\u00942\u0082{T\u0085Çî\u0015+àó÷Î(\u0082\u0002pc«ú\u0007\u00990\u0018\u0018ö)\u0081\u009e\u0002 \u0081\u0003¨ºn\fJH\u001f¾·\u0081èù\u009bd\u0094(\t\u009e\"\u0085óä(\u0082ÌÖ\fï§«C!>:\u000eÁþß\u0093\r^Ç\u009dOç¿â>Úò°\u0006\u008c"
         .length();
      char var11 = '\b';
      int var19 = -1;

      label70:
      while (true) {
         byte var10000 = 62;
         String var10001 = var12.substring(++var19, var19 + var11);
         byte var10002 = -1;

         while (true) {
      char[] var36;
            label65: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var16 = 0;
               byte var46 = var10000;
               var36 = var43;
               int var26 = var10004;
               byte var53;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               } else {
                  var46 = var10000;
                  var26 = var10004;
                  if (var10004 <= var16) {
                     break label65;
                  }

                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var68 = var59[var10006];
                  byte var69;
                  switch (var16 % 7) {
                     case 0:
                        var69 = 110;
                        break;
                     case 1:
                        var69 = 50;
                        break;
                     case 2:
                        var69 = 82;
                        break;
                     case 3:
                        var69 = 28;
                        break;
                     case 4:
                        var69 = 34;
                        break;
                     case 5:
                        var69 = 118;
                        break;
                     default:
                        var69 = 72;
                  }

                  var59[var10006] = (char)(var68 ^ var53 ^ var69);
                  var16++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var59 = var36;
                     var53 = var46;
                  } else {
                     if (var26 <= var16) {
                        break;
                     }

                     var59 = var36;
                     var53 = var46;
                     var10006 = var16;
                  }
               }
            }

            String var48 = new String(var36).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var48;
                  if ((var19 += var11) >= var14) {
                     a = var15;
                     b = new String[12];
                     long var2 = 428152985575890518L;
                     long[] var8 = new long[5];
                     int var5 = 0;
                     String var6 = "A¹¤¤dDái\u0091æGÍ)\nëý\u000b¬Â\u000bytP,";
                     int var7 = "A¹¤¤dDái\u0091æGÍ)\nëý\u000b¬Â\u000bytP,".length();
                     byte var4 = 0;

                     label44:
                     while (true) {
                        byte var28 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var28, var4).getBytes("ISO-8859-1");
                        long[] var21 = var8;
                        int var29 = var5++;
                        long var40 = ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L;
                        byte var49 = -1;

                        while (true) {
                           long var58 = var40 ^ var2;
                           switch (var49) {
                              case 0:
                                 var21[var29] = var58;
                                 if (var4 >= var7) {
                                    c = var8;
                                    e = new Integer[5];
                                    long var0 = 275667276499653199L;
                                    long var42 = 275667276499653031L ^ var0;
                                    byte var31 = -1;
                                    f = var42;
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var58;
                                 if (var4 < var7) {
                                    continue label44;
                                 }

                                 var6 = "BÍ\u0010ïÀFý&\u0004Ö% x_³\u0093";
                                 var7 = "BÍ\u0010ïÀFý&\u0004Ö% x_³\u0093".length();
                                 var4 = 0;
                           }

                           byte var30 = var4;
                           var4 += 8;
                           var9 = var6.substring(var30, var4).getBytes("ISO-8859-1");
                           var21 = var8;
                           var29 = var5++;
                           var40 = ((long)var9[0] & 255L) << 56
                              | ((long)var9[1] & 255L) << 48
                              | ((long)var9[2] & 255L) << 40
                              | ((long)var9[3] & 255L) << 32
                              | ((long)var9[4] & 255L) << 24
                              | ((long)var9[5] & 255L) << 16
                              | ((long)var9[6] & 255L) << 8
                              | (long)var9[7] & 255L;
                           var49 = 0;
                        }
                     }
                  }

                  var11 = var12.charAt(var19);
                  break;
               default:
                  var15[var13++] = var48;
                  if ((var19 += var11) < var14) {
                     var11 = var12.charAt(var19);
                     continue label70;
                  }

                  var12 = "ü°\u0093[\u00ad3\u0004Á\u0094z²";
                  var14 = "ü°\u0093[\u00ad3\u0004Á\u0094z²".length();
                  var11 = 6;
                  var19 = -1;
            }

            var10000 = 56;
            var10001 = var12.substring(++var19, var19 + var11);
            var10002 = 0;
         }
      }
   }
}





