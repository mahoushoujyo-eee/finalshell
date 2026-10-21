package com;

import java.awt.Dimension;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class cj_4 implements com.Fv_2 {
   private InputStream O = null;
   private OutputStream I = null;
   private com.DI s;
   private com.dm_4 S;
   private AtomicBoolean g = new AtomicBoolean(false);
   private int K;
   private String V;
   private String u;
   private String d;
   private Dimension C;
   private Dimension G;
   private OutputStreamWriter Y;
   InputStreamReader W;
   boolean e;
   String c;
   public _y_2 R;
   public lv_4 U;
   boolean y;
   To_2 P;
   boolean r;
   private static String[] t;
   private static final String[] f;
   private static final String[] h;
   private static final long[] k;
   private static final Integer[] l;
   private static final long n;

   public cj_4(String var1, String var2, String var3, lv_4 var4) {
      this(var1, a(31465, 6104758990046145127L), var2, var3, var4);
   }

   public cj_4(String var1, int var2, String var3, String var4, lv_4 var5) {
      this.K = a(24968, 4292383849043013895L);
      this.V = b(9596, -7013);
      this.u = b(9586, -14644);
      this.d = "";
      this.e = false;
      this.c = b(9584, -27426);
      this.y = false;
      this.r = false;
      this.u = var1;
      this.K = var2;
      this.V = var3;
      this.d = var4;
      this.U = var5;
   }

   @Override
   public void m(_y_2 var1) {
      this.R = var1;
   }

   @Override
   public _y_2 n() {
      return this.R;
   }

   @Override
   public void R(boolean var1) {
      this.y = var1;
   }

   @Override
   public boolean l() {
      return this.y;
   }

   public To_2 f() {
      return this.P;
   }

   public void W(To_2 var1) {
      this.P = var1;
   }

   public cj_4() {
      this.K = a(31465, 6104758990046145127L);
      this.V = b(9597, 19476);
      this.u = b(9587, 11854);
      this.d = "";
      this.e = false;
      this.c = b(9590, 15233);
      this.y = false;
      this.r = false;
   }

   @Override
   public void j(Dimension param1, Dimension param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: putfield com/cj_4.C Ljava/awt/Dimension;
      // 08: astore 3
      // 09: aload 0
      // 0a: aload 2
      // 0b: putfield com/cj_4.G Ljava/awt/Dimension;
      // 0e: aload 0
      // 0f: aload 3
      // 10: ifnonnull 28
      // 13: getfield com/cj_4.S Lcom/dm_4;
      // 16: ifnull 2b
      // 19: goto 20
      // 1c: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: goto 28
      // 24: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokespecial com/cj_4.T ()V
      // 2b: return
   }

   protected abstract void D(com.dm_4 var1, int var2, int var3, int var4, int var5);

   private void T() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/cj_4.C Ljava/awt/Dimension;
      // 08: aload 1
      // 09: ifnonnull 2c
      // 0c: ifnull 64
      // 0f: goto 16
      // 12: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 60
      // 1b: goto 22
      // 1e: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: getfield com/cj_4.G Ljava/awt/Dimension;
      // 25: goto 2c
      // 28: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: ifnull 64
      // 2f: aload 0
      // 30: aload 0
      // 31: getfield com/cj_4.S Lcom/dm_4;
      // 34: aload 0
      // 35: getfield com/cj_4.C Ljava/awt/Dimension;
      // 38: getfield java/awt/Dimension.width I
      // 3b: aload 0
      // 3c: getfield com/cj_4.C Ljava/awt/Dimension;
      // 3f: getfield java/awt/Dimension.height I
      // 42: aload 0
      // 43: getfield com/cj_4.G Ljava/awt/Dimension;
      // 46: getfield java/awt/Dimension.width I
      // 49: aload 0
      // 4a: getfield com/cj_4.G Ljava/awt/Dimension;
      // 4d: getfield java/awt/Dimension.height I
      // 50: invokevirtual com/cj_4.D (Lcom/dm_4;IIII)V
      // 53: aload 0
      // 54: aconst_null
      // 55: putfield com/cj_4.C Ljava/awt/Dimension;
      // 58: aload 0
      // 59: goto 60
      // 5c: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aconst_null
      // 61: putfield com/cj_4.G Ljava/awt/Dimension;
      // 64: return
   }

   public void F() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 43
      // 09: getfield com/cj_4.r Z
      // 0c: ifeq 2f
      // 0f: goto 16
      // 12: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ifnonnull 43
      // 1b: goto 22
      // 1e: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: getfield com/cj_4.W Ljava/io/InputStreamReader;
      // 25: ifnull bb
      // 28: goto 2f
      // 2b: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: bipush 1
      // 31: putfield com/cj_4.r Z
      // 34: aload 0
      // 35: getfield com/cj_4.s Lcom/DI;
      // 38: invokevirtual com/DI.G ()V
      // 3b: aload 0
      // 3c: goto 43
      // 3f: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 1
      // 44: ifnonnull 68
      // 47: getfield com/cj_4.I Ljava/io/OutputStream;
      // 4a: ifnull 67
      // 4d: goto 54
      // 50: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/cj_4.I Ljava/io/OutputStream;
      // 58: invokevirtual java/io/OutputStream.close ()V
      // 5b: goto 67
      // 5e: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: astore 2
      // 63: aload 2
      // 64: invokevirtual java/io/IOException.printStackTrace ()V
      // 67: aload 0
      // 68: aload 1
      // 69: ifnonnull 8d
      // 6c: getfield com/cj_4.W Ljava/io/InputStreamReader;
      // 6f: ifnull 8c
      // 72: goto 79
      // 75: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: aload 0
      // 7a: getfield com/cj_4.W Ljava/io/InputStreamReader;
      // 7d: invokevirtual java/io/InputStreamReader.close ()V
      // 80: goto 8c
      // 83: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: astore 2
      // 88: aload 2
      // 89: invokevirtual java/io/IOException.printStackTrace ()V
      // 8c: aload 0
      // 8d: aload 1
      // 8e: ifnonnull b7
      // 91: getfield com/cj_4.P LTo_2;
      // 94: ifnull b1
      // 97: goto 9e
      // 9a: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: aload 0
      // 9f: getfield com/cj_4.P LTo_2;
      // a2: invokevirtual To_2.close ()V
      // a5: goto b1
      // a8: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab: athrow
      // ac: astore 2
      // ad: aload 2
      // ae: invokevirtual java/io/IOException.printStackTrace ()V
      // b1: aload 0
      // b2: aconst_null
      // b3: putfield com/cj_4.O Ljava/io/InputStream;
      // b6: aload 0
      // b7: aconst_null
      // b8: putfield com/cj_4.I Ljava/io/OutputStream;
      // bb: return
   }

   @Override
   public void a() {
      this.F();
   }

   @Override
   public com.DI e() {
      return this.s;
   }

   protected abstract com.dm_4 i(com.DI var1) throws Pc_2;

   protected abstract void U(com.dm_4 var1);

   public boolean q(com.aW param1, ms_2 param2, lv_4 param3, com.DI param4, int param5, String param6) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 003: aload 0
      // 004: aload 6
      // 006: putfield com/cj_4.c Ljava/lang/String;
      // 009: astore 7
      // 00b: aload 4
      // 00d: ifnull 018
      // 010: bipush 1
      // 011: goto 019
      // 014: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: bipush 0
      // 019: istore 8
      // 01b: aload 0
      // 01c: aload 7
      // 01e: ifnonnull 044
      // 021: aload 1
      // 022: invokespecial com/cj_4.i (Lcom/aW;)V
      // 025: aload 4
      // 027: ifnonnull 03c
      // 02a: aload 0
      // 02b: aload 0
      // 02c: aload 1
      // 02d: aload 2
      // 02e: aload 3
      // 02f: iload 5
      // 031: invokevirtual com/cj_4.Z (Lcom/aW;Lms_2;Llv_4;I)Lcom/DI;
      // 034: putfield com/cj_4.s Lcom/DI;
      // 037: aload 7
      // 039: ifnull 049
      // 03c: aload 0
      // 03d: goto 044
      // 040: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: aload 4
      // 046: putfield com/cj_4.s Lcom/DI;
      // 049: aload 0
      // 04a: aload 0
      // 04b: aload 0
      // 04c: getfield com/cj_4.s Lcom/DI;
      // 04f: invokevirtual com/cj_4.i (Lcom/DI;)Lcom/dm_4;
      // 052: putfield com/cj_4.S Lcom/dm_4;
      // 055: aload 0
      // 056: aload 0
      // 057: getfield com/cj_4.S Lcom/dm_4;
      // 05a: invokevirtual com/cj_4.U (Lcom/dm_4;)V
      // 05d: aload 0
      // 05e: aload 0
      // 05f: getfield com/cj_4.S Lcom/dm_4;
      // 062: invokevirtual com/dm_4.s ()Ljava/io/InputStream;
      // 065: putfield com/cj_4.O Ljava/io/InputStream;
      // 068: aload 0
      // 069: new To_2
      // 06c: dup
      // 06d: aload 0
      // 06e: getfield com/cj_4.O Ljava/io/InputStream;
      // 071: invokespecial To_2.<init> (Ljava/io/InputStream;)V
      // 074: putfield com/cj_4.P LTo_2;
      // 077: aload 0
      // 078: aload 0
      // 079: getfield com/cj_4.P LTo_2;
      // 07c: putfield com/cj_4.O Ljava/io/InputStream;
      // 07f: aload 0
      // 080: aload 0
      // 081: getfield com/cj_4.S Lcom/dm_4;
      // 084: invokevirtual com/dm_4.j ()Ljava/io/OutputStream;
      // 087: putfield com/cj_4.I Ljava/io/OutputStream;
      // 08a: aload 0
      // 08b: new TC
      // 08e: dup
      // 08f: aload 0
      // 090: getfield com/cj_4.O Ljava/io/InputStream;
      // 093: aload 6
      // 095: invokespecial TC.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 098: putfield com/cj_4.W Ljava/io/InputStreamReader;
      // 09b: iload 8
      // 09d: ifne 0a0
      // 0a0: aload 0
      // 0a1: getfield com/cj_4.S Lcom/dm_4;
      // 0a4: invokevirtual com/dm_4.I ()V
      // 0a7: aload 0
      // 0a8: invokespecial com/cj_4.T ()V
      // 0ab: aload 0
      // 0ac: bipush 1
      // 0ad: putfield com/cj_4.e Z
      // 0b0: bipush 1
      // 0b1: istore 9
      // 0b3: aload 0
      // 0b4: getfield com/cj_4.g Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0b7: bipush 1
      // 0b8: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 0bb: iload 9
      // 0bd: ireturn
      // 0be: astore 9
      // 0c0: aload 1
      // 0c1: aload 9
      // 0c3: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 0c6: invokeinterface com/aW.U (Ljava/lang/String;)V 2
      // 0cb: bipush 0
      // 0cc: istore 10
      // 0ce: aload 0
      // 0cf: getfield com/cj_4.g Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0d2: bipush 1
      // 0d3: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 0d6: iload 10
      // 0d8: ireturn
      // 0d9: astore 9
      // 0db: aload 1
      // 0dc: aload 9
      // 0de: invokevirtual com/Pc_2.getMessage ()Ljava/lang/String;
      // 0e1: invokeinterface com/aW.U (Ljava/lang/String;)V 2
      // 0e6: bipush 0
      // 0e7: istore 10
      // 0e9: aload 0
      // 0ea: getfield com/cj_4.g Ljava/util/concurrent/atomic/AtomicBoolean;
      // 0ed: bipush 1
      // 0ee: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 0f1: iload 10
      // 0f3: ireturn
      // 0f4: astore 9
      // 0f6: aload 9
      // 0f8: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0fb: bipush 0
      // 0fc: istore 10
      // 0fe: aload 0
      // 0ff: getfield com/cj_4.g Ljava/util/concurrent/atomic/AtomicBoolean;
      // 102: bipush 1
      // 103: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 106: iload 10
      // 108: ireturn
      // 109: astore 11
      // 10b: aload 0
      // 10c: getfield com/cj_4.g Ljava/util/concurrent/atomic/AtomicBoolean;
      // 10f: bipush 1
      // 110: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
      // 113: aload 11
      // 115: athrow
   }

   private void i(com.aW param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/cj_4.u Ljava/lang/String;
      // 08: ifnonnull 32
      // 0b: aload 0
      // 0c: aload 2
      // 0d: ifnonnull 33
      // 10: aload 1
      // 11: sipush 9594
      // 14: sipush -11759
      // 17: invokestatic com/cj_4.b (II)Ljava/lang/String;
      // 1a: sipush 9593
      // 1d: sipush 13322
      // 20: invokestatic com/cj_4.b (II)Ljava/lang/String;
      // 23: invokeinterface com/aW.S (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 3
      // 28: putfield com/cj_4.u Ljava/lang/String;
      // 2b: goto 32
      // 2e: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: getfield com/cj_4.u Ljava/lang/String;
      // 36: aload 2
      // 37: ifnonnull 48
      // 3a: ifnull 04
      // 3d: goto 44
      // 40: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/cj_4.u Ljava/lang/String;
      // 48: aload 2
      // 49: ifnonnull 68
      // 4c: invokevirtual java/lang/String.length ()I
      // 4f: ifne 64
      // 52: goto 59
      // 55: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 2
      // 5a: ifnull 04
      // 5d: goto 64
      // 60: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: aload 0
      // 65: getfield com/cj_4.u Ljava/lang/String;
      // 68: invokestatic com/google/common/net/HostAndPort.fromString (Ljava/lang/String;)Lcom/google/common/net/HostAndPort;
      // 6b: astore 3
      // 6c: aload 0
      // 6d: aload 3
      // 6e: invokevirtual com/google/common/net/HostAndPort.getHostText ()Ljava/lang/String;
      // 71: putfield com/cj_4.u Ljava/lang/String;
      // 74: aload 0
      // 75: aload 3
      // 76: aload 0
      // 77: getfield com/cj_4.K I
      // 7a: invokevirtual com/google/common/net/HostAndPort.getPortOrDefault (I)I
      // 7d: putfield com/cj_4.K I
      // 80: goto a8
      // 83: astore 3
      // 84: aload 1
      // 85: aload 3
      // 86: invokevirtual java/lang/IllegalArgumentException.getMessage ()Ljava/lang/String;
      // 89: invokeinterface com/aW.U (Ljava/lang/String;)V 2
      // 8e: aload 0
      // 8f: aload 1
      // 90: sipush 9585
      // 93: sipush 26306
      // 96: invokestatic com/cj_4.b (II)Ljava/lang/String;
      // 99: aload 0
      // 9a: getfield com/cj_4.u Ljava/lang/String;
      // 9d: invokeinterface com/aW.S (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 3
      // a2: putfield com/cj_4.u Ljava/lang/String;
      // a5: goto 04
      // a8: aload 0
      // a9: getfield com/cj_4.V Ljava/lang/String;
      // ac: ifnonnull b6
      // af: goto b6
      // b2: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5: athrow
      // b6: return
   }

   public com.DI Z(com.aW param1, ms_2 param2, lv_4 param3, int param4) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 003: new com/Xe_2
      // 006: dup
      // 007: invokespecial com/Xe_2.<init> ()V
      // 00a: astore 6
      // 00c: astore 5
      // 00e: aload 0
      // 00f: aload 6
      // 011: invokevirtual com/cj_4.L (Lcom/Xe_2;)V
      // 014: aload 3
      // 015: invokestatic com/c.f ()[Ljava/lang/Object;
      // 018: ldc2_w 142726811055146914
      // 01b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 01e: dup_x2
      // 01f: pop
      // 020: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 023: checkcast java/lang/Integer
      // 026: invokevirtual java/lang/Integer.intValue ()I
      // 029: goto 030
      // 02c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02f: athrow
      // 030: ldc2_w 187047088046998003
      // 033: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 036: aconst_null
      // 037: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 03a: if_icmpne 03d
      // 03d: bipush 1
      // 03e: ldc2_w 135067541080030149
      // 041: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 044: aconst_null
      // 045: dup2_x1
      // 046: pop2
      // 047: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 04a: aload 6
      // 04c: ldc2_w 504992152467754337
      // 04f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 052: aconst_null
      // 053: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 056: checkcast java/lang/String
      // 059: invokevirtual com/Xe_2.c (Ljava/lang/String;)V
      // 05c: aload 6
      // 05e: aload 0
      // 05f: getfield com/cj_4.V Ljava/lang/String;
      // 062: aload 0
      // 063: getfield com/cj_4.u Ljava/lang/String;
      // 066: aload 0
      // 067: getfield com/cj_4.K I
      // 06a: aload 2
      // 06b: aload 3
      // 06c: iload 4
      // 06e: invokevirtual com/Xe_2.J (Ljava/lang/String;Ljava/lang/String;ILms_2;Llv_4;I)Lcom/DI;
      // 071: astore 7
      // 073: aload 0
      // 074: aload 7
      // 076: putfield com/cj_4.s Lcom/DI;
      // 079: aload 7
      // 07b: aload 0
      // 07c: getfield com/cj_4.R Lcom/_y_2;
      // 07f: invokevirtual com/DI.N (Lcom/_y_2;)V
      // 082: new com/cV_3
      // 085: dup
      // 086: aload 1
      // 087: invokespecial com/cV_3.<init> (Lcom/aW;)V
      // 08a: astore 8
      // 08c: aload 5
      // 08e: ifnonnull 0bf
      // 091: aload 0
      // 092: getfield com/cj_4.d Ljava/lang/String;
      // 095: ifnull 0b8
      // 098: goto 09f
      // 09b: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: aload 7
      // 0a1: aload 0
      // 0a2: getfield com/cj_4.d Ljava/lang/String;
      // 0a5: invokevirtual com/DI.z (Ljava/lang/String;)V
      // 0a8: aload 8
      // 0aa: aload 0
      // 0ab: getfield com/cj_4.d Ljava/lang/String;
      // 0ae: invokevirtual com/cV_3.M (Ljava/lang/String;)V
      // 0b1: goto 0b8
      // 0b4: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: aload 7
      // 0ba: aload 8
      // 0bc: invokevirtual com/DI.Q (Lcom/Gq_2;)V
      // 0bf: new java/util/Properties
      // 0c2: dup
      // 0c3: invokespecial java/util/Properties.<init> ()V
      // 0c6: astore 9
      // 0c8: aload 9
      // 0ca: sipush 9588
      // 0cd: sipush -24257
      // 0d0: invokestatic com/cj_4.b (II)Ljava/lang/String;
      // 0d3: sipush 9577
      // 0d6: sipush 32651
      // 0d9: invokestatic com/cj_4.b (II)Ljava/lang/String;
      // 0dc: invokevirtual java/util/Properties.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0df: pop
      // 0e0: aload 9
      // 0e2: sipush 9598
      // 0e5: sipush -19438
      // 0e8: invokestatic com/cj_4.b (II)Ljava/lang/String;
      // 0eb: sipush 9599
      // 0ee: sipush 32546
      // 0f1: invokestatic com/cj_4.b (II)Ljava/lang/String;
      // 0f4: invokevirtual java/util/Properties.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0f7: pop
      // 0f8: aload 0
      // 0f9: aload 7
      // 0fb: aload 9
      // 0fd: invokevirtual com/cj_4.S (Lcom/DI;Ljava/util/Properties;)V
      // 100: aload 7
      // 102: invokevirtual com/DI.C ()V
      // 105: aload 7
      // 107: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 10a: ifnull 11b
      // 10d: bipush 5
      // 10e: anewarray 189
      // 111: invokestatic com/cj_4.p ([Ljava/lang/String;)V
      // 114: goto 11b
      // 117: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: areturn
   }

   protected void L(Xe_2 var1) throws Pc_2 {
   }

   protected void S(com.DI var1, Properties var2) throws Pc_2 {
      var1.o(var2);
      var1.b(b(9589, 4819), b(9576, 25264));
      var1.b(b(9591, 4621), b(9579, -18684));
      var1.b(b(9592, -17415), "9");
   }

   @Override
   public String b() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/cj_4.u Ljava/lang/String;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/cj_4.u Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: goto 2d
      // 24: sipush 9595
      // 27: sipush 17239
      // 2a: invokestatic com/cj_4.b (II)Ljava/lang/String;
      // 2d: areturn
   }

   @Override
   public int x(char[] var1, int var2, int var3) throws IOException {
      return this.W.read(var1, var2, var3);
   }

   public int Q(byte[] var1, int var2, int var3) throws IOException {
      return this.O.read(var1, var2, var3);
   }

   @Override
   public synchronized void q(byte[] param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/cj_4.I Ljava/io/OutputStream;
      // 08: aload 2
      // 09: ifnonnull 29
      // 0c: ifnull 2c
      // 0f: goto 16
      // 12: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/cj_4.I Ljava/io/OutputStream;
      // 1a: aload 1
      // 1b: invokevirtual java/io/OutputStream.write ([B)V
      // 1e: aload 0
      // 1f: getfield com/cj_4.I Ljava/io/OutputStream;
      // 22: goto 29
      // 25: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: invokevirtual java/io/OutputStream.flush ()V
      // 2c: return
   }

   @Override
   public synchronized void F(byte[] param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/cj_4.I Ljava/io/OutputStream;
      // 08: aload 2
      // 09: ifnonnull 21
      // 0c: ifnull 25
      // 0f: goto 16
      // 12: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/cj_4.I Ljava/io/OutputStream;
      // 1a: goto 21
      // 1d: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 1
      // 22: invokevirtual java/io/OutputStream.write ([B)V
      // 25: return
   }

   @Override
   public synchronized void v() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/cj_4.I Ljava/io/OutputStream;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/cj_4.I Ljava/io/OutputStream;
      // 1a: goto 21
      // 1d: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual java/io/OutputStream.flush ()V
      // 24: return
   }

   @Override
   public boolean K() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/cj_4.S Lcom/dm_4;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 4f
      // 0f: goto 16
      // 12: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/cj_4.S Lcom/dm_4;
      // 1a: goto 21
      // 1d: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual com/dm_4.L ()Z
      // 24: aload 1
      // 25: ifnonnull 3d
      // 28: ifeq 4f
      // 2b: goto 32
      // 2e: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: getfield com/cj_4.e Z
      // 36: goto 3d
      // 39: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 1
      // 3e: ifnonnull 4c
      // 41: ifeq 4f
      // 44: goto 4b
      // 47: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 50
      // 4f: bipush 0
      // 50: ireturn
   }

   @Override
   public void E(String var1) throws IOException {
      this.q(var1.getBytes(this.c));
   }

   @Override
   public int f$int() throws InterruptedException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/cj_4.g Ljava/util/concurrent/atomic/AtomicBoolean;
      // 08: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
      // 0b: ifeq 23
      // 0e: aload 0
      // 0f: getfield com/cj_4.S Lcom/dm_4;
      // 12: invokestatic com/cj_4.o (Lcom/dm_4;)Z
      // 15: aload 1
      // 16: ifnonnull 3b
      // 19: ifeq 34
      // 1c: goto 23
      // 1f: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: getstatic com/cj_4.n J
      // 26: invokestatic java/lang/Thread.sleep (J)V
      // 29: aload 1
      // 2a: ifnull 04
      // 2d: goto 34
      // 30: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: getfield com/cj_4.S Lcom/dm_4;
      // 38: invokevirtual com/dm_4.o ()I
      // 3b: ireturn
   }

   private static boolean o(com.dm_4 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/cj_4.v ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 14
      // 09: ifnull 42
      // 0c: goto 13
      // 0f: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual com/dm_4.o ()I
      // 17: aload 1
      // 18: ifnonnull 30
      // 1b: ifge 42
      // 1e: goto 25
      // 21: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual com/dm_4.L ()Z
      // 29: goto 30
      // 2c: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 1
      // 31: ifnonnull 3f
      // 34: ifeq 42
      // 37: goto 3e
      // 3a: invokestatic com/cj_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
   }

   @Override
   public boolean A() throws IOException {
      return false;
   }

   @Override
   public lv_4 E() {
      return this.U;
   }

   @Override
   public void M(lv_4 var1) {
      this.U = var1;
   }

   public void U() {
      this.O = null;
      this.I = null;
      this.s = null;
      this.g = null;
      this.V = null;
      this.u = null;
      this.d = null;
      this.C = null;
      this.G = null;
      this.Y = null;
      this.W = null;
      this.c = null;
      this.R = null;
      this.U = null;
      this.P = null;
   }

   public void X() {
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new com.WE(this), com.c.c(222883478649268280L).getInt(null));
      Method var10003 = com.c.d(266288712085965362L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public static void p(String[] var0) {
      t = var0;
   }

   public static String[] v$String() {
      return t;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var15 = new String[19];
      int var13 = 0;
      String var12 = "\u000b!Z\u0096#\u009c]G\u0080\"Þ\u0080w)\u0011Ê\u0093 h?\u009d\u0097\u0018ªj\u0097\u0019¶ÍP9Å\u0006YeEâ\u00950\u0006\u009bL~\u0097a£\u0004Û\u00193=\u0004øKWw\túF\u0018£â¿¥+\u007f\u000f×n\u0083×Kj\u0019æ{µ\u00ad\u0093þ\u0094²\u0006´X\u009b\u0015Ýó\u0005P\u0018¨\u0018*\u0007zH\u000b\u0010¥®\u008d\u0007B^\fÒEö\u0091\u000fx¢vNõYÎ\u0080\u0081yò\n\u0005§Ï\u000fT¡ó.EUØ\u0001CIª\f\u000eg®\u000fku\u0014´¹\u0006Gk°\u0004Ô¥ÑRW\u0005\u0095Y\u00100=\t\u0014\u0019ÅHYÂÒ\u0084\u0091";
      int var14 = "\u000b!Z\u0096#\u009c]G\u0080\"Þ\u0080w)\u0011Ê\u0093 h?\u009d\u0097\u0018ªj\u0097\u0019¶ÍP9Å\u0006YeEâ\u00950\u0006\u009bL~\u0097a£\u0004Û\u00193=\u0004øKWw\túF\u0018£â¿¥+\u007f\u000f×n\u0083×Kj\u0019æ{µ\u00ad\u0093þ\u0094²\u0006´X\u009b\u0015Ýó\u0005P\u0018¨\u0018*\u0007zH\u000b\u0010¥®\u008d\u0007B^\fÒEö\u0091\u000fx¢vNõYÎ\u0080\u0081yò\n\u0005§Ï\u000fT¡ó.EUØ\u0001CIª\f\u000eg®\u000fku\u0014´¹\u0006Gk°\u0004Ô¥ÑRW\u0005\u0095Y\u00100=\t\u0014\u0019ÅHYÂÒ\u0084\u0091"
         .length();
      char var11 = 14;
      p(null);
      int var18 = -1;

      label61:
      while (true) {
         byte var10000 = 9;
         String var10001 = var12.substring(++var18, var18 + var11);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var38 = var10001.toCharArray();
               int var10004 = var38.length;
               int var16 = 0;
               byte var41 = var10000;
               var33 = var38;
               int var24 = var10004;
               byte var47;
               char[] var52;
               int var10006;
               if (var10004 <= 1) {
                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               } else {
                  var41 = var10000;
                  var24 = var10004;
                  if (var10004 <= var16) {
                     break label56;
                  }

                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var61 = var52[var10006];
                  byte var62;
                  switch (var16 % 7) {
                     case 0:
                        var62 = 121;
                        break;
                     case 1:
                        var62 = 110;
                        break;
                     case 2:
                        var62 = 28;
                        break;
                     case 3:
                        var62 = 13;
                        break;
                     case 4:
                        var62 = 34;
                        break;
                     case 5:
                        var62 = 2;
                        break;
                     default:
                        var62 = 83;
                  }

                  var52[var10006] = (char)(var61 ^ var47 ^ var62);
                  var16++;
                  if (var41 == 0) {
                     var10006 = var41;
                     var52 = var33;
                     var47 = var41;
                  } else {
                     if (var24 <= var16) {
                        break;
                     }

                     var52 = var33;
                     var47 = var41;
                     var10006 = var16;
                  }
               }
            }

            String var43 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var43;
                  if ((var18 += var11) >= var14) {
                     f = var15;
                     h = new String[19];
                     long var2 = 1242875659404781158L;
                     long[] var8 = new long[2];
                     int var5 = 0;
                     String var6 = ",ï£g£\u0018\u0017wZ\u0012'\u0099Ãß\u008c\u0017";
                     int var7 = ",ï£g£\u0018\u0017wZ\u0012'\u0099Ãß\u008c\u0017".length();
                     byte var4 = 0;

                     do {
                        byte var26 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var26, var4).getBytes("ISO-8859-1");
                        int var27 = var5++;
                        long var51 = (
                              ((long)var9[0] & 255L) << 56
                                 | ((long)var9[1] & 255L) << 48
                                 | ((long)var9[2] & 255L) << 40
                                 | ((long)var9[3] & 255L) << 32
                                 | ((long)var9[4] & 255L) << 24
                                 | ((long)var9[5] & 255L) << 16
                                 | ((long)var9[6] & 255L) << 8
                                 | (long)var9[7] & 255L
                           )
                           ^ var2;
                        byte var44 = -1;
                        var8[var27] = var51;
                     } while (var4 < var7);

                     k = var8;
                     l = new Integer[2];
                     long var0 = 2232471078905741686L;
                     long var37 = 2232471078905741586L ^ var0;
                     byte var28 = -1;
                     n = var37;
                     return;
                  }

                  var11 = var12.charAt(var18);
                  break;
               default:
                  var15[var13++] = var43;
                  if ((var18 += var11) < var14) {
                     var11 = var12.charAt(var18);
                     continue label61;
                  }

                  var12 = "\u000bø\u000bYÁÌ\u0012BSÄ\u007fIz=÷Äfç\u00ad\u0006$\u0094Åb°\u000f\u001aØ\u008eq\u0097\u008e\u0015ûyn£Ø¥\u008e iwµ\u0091×ÈkM,Y\u008dh";
                  var14 = "\u000bø\u000bYÁÌ\u0012BSÄ\u007fIz=÷Äfç\u00ad\u0006$\u0094Åb°\u000f\u001aØ\u008eq\u0097\u008e\u0015ûyn£Ø¥\u008e iwµ\u0091×ÈkM,Y\u008dh"
                     .length();
                  var11 = 26;
                  var18 = -1;
            }

            var10000 = 33;
            var10001 = var12.substring(++var18, var18 + var11);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 9593) & 65535;
      if (h[var2] == null) {
         char[] var3 = f[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 246;
               break;
            case 1:
               var10000 = 167;
               break;
            case 2:
               var10000 = 251;
               break;
            case 3:
               var10000 = 184;
               break;
            case 4:
               var10000 = 39;
               break;
            case 5:
               var10000 = 190;
               break;
            case 6:
               var10000 = 157;
               break;
            case 7:
               var10000 = 88;
               break;
            case 8:
               var10000 = 104;
               break;
            case 9:
               var10000 = 70;
               break;
            case 10:
               var10000 = 236;
               break;
            case 11:
               var10000 = 53;
               break;
            case 12:
               var10000 = 175;
               break;
            case 13:
               var10000 = 103;
               break;
            case 14:
               var10000 = 33;
               break;
            case 15:
               var10000 = 57;
               break;
            case 16:
               var10000 = 15;
               break;
            case 17:
               var10000 = 203;
               break;
            case 18:
               var10000 = 119;
               break;
            case 19:
               var10000 = 115;
               break;
            case 20:
               var10000 = 126;
               break;
            case 21:
               var10000 = 5;
               break;
            case 22:
               var10000 = 77;
               break;
            case 23:
               var10000 = 144;
               break;
            case 24:
               var10000 = 255;
               break;
            case 25:
               var10000 = 153;
               break;
            case 26:
               var10000 = 9;
               break;
            case 27:
               var10000 = 149;
               break;
            case 28:
               var10000 = 51;
               break;
            case 29:
               var10000 = 47;
               break;
            case 30:
               var10000 = 45;
               break;
            case 31:
               var10000 = 240;
               break;
            case 32:
               var10000 = 105;
               break;
            case 33:
               var10000 = 254;
               break;
            case 34:
               var10000 = 200;
               break;
            case 35:
               var10000 = 146;
               break;
            case 36:
               var10000 = 248;
               break;
            case 37:
               var10000 = 227;
               break;
            case 38:
               var10000 = 134;
               break;
            case 39:
               var10000 = 180;
               break;
            case 40:
               var10000 = 14;
               break;
            case 41:
               var10000 = 220;
               break;
            case 42:
               var10000 = 232;
               break;
            case 43:
               var10000 = 48;
               break;
            case 44:
               var10000 = 18;
               break;
            case 45:
               var10000 = 207;
               break;
            case 46:
               var10000 = 179;
               break;
            case 47:
               var10000 = 147;
               break;
            case 48:
               var10000 = 95;
               break;
            case 49:
               var10000 = 133;
               break;
            case 50:
               var10000 = 114;
               break;
            case 51:
               var10000 = 61;
               break;
            case 52:
               var10000 = 19;
               break;
            case 53:
               var10000 = 127;
               break;
            case 54:
               var10000 = 16;
               break;
            case 55:
               var10000 = 137;
               break;
            case 56:
               var10000 = 30;
               break;
            case 57:
               var10000 = 143;
               break;
            case 58:
               var10000 = 13;
               break;
            case 59:
               var10000 = 24;
               break;
            case 60:
               var10000 = 54;
               break;
            case 61:
               var10000 = 212;
               break;
            case 62:
               var10000 = 214;
               break;
            case 63:
               var10000 = 151;
               break;
            case 64:
               var10000 = 91;
               break;
            case 65:
               var10000 = 155;
               break;
            case 66:
               var10000 = 86;
               break;
            case 67:
               var10000 = 21;
               break;
            case 68:
               var10000 = 233;
               break;
            case 69:
               var10000 = 178;
               break;
            case 70:
               var10000 = 96;
               break;
            case 71:
               var10000 = 241;
               break;
            case 72:
               var10000 = 37;
               break;
            case 73:
               var10000 = 101;
               break;
            case 74:
               var10000 = 201;
               break;
            case 75:
               var10000 = 97;
               break;
            case 76:
               var10000 = 196;
               break;
            case 77:
               var10000 = 164;
               break;
            case 78:
               var10000 = 117;
               break;
            case 79:
               var10000 = 85;
               break;
            case 80:
               var10000 = 253;
               break;
            case 81:
               var10000 = 242;
               break;
            case 82:
               var10000 = 229;
               break;
            case 83:
               var10000 = 135;
               break;
            case 84:
               var10000 = 111;
               break;
            case 85:
               var10000 = 80;
               break;
            case 86:
               var10000 = 219;
               break;
            case 87:
               var10000 = 225;
               break;
            case 88:
               var10000 = 112;
               break;
            case 89:
               var10000 = 116;
               break;
            case 90:
               var10000 = 148;
               break;
            case 91:
               var10000 = 122;
               break;
            case 92:
               var10000 = 215;
               break;
            case 93:
               var10000 = 0;
               break;
            case 94:
               var10000 = 67;
               break;
            case 95:
               var10000 = 75;
               break;
            case 96:
               var10000 = 71;
               break;
            case 97:
               var10000 = 65;
               break;
            case 98:
               var10000 = 7;
               break;
            case 99:
               var10000 = 168;
               break;
            case 100:
               var10000 = 109;
               break;
            case 101:
               var10000 = 84;
               break;
            case 102:
               var10000 = 174;
               break;
            case 103:
               var10000 = 79;
               break;
            case 104:
               var10000 = 189;
               break;
            case 105:
               var10000 = 76;
               break;
            case 106:
               var10000 = 17;
               break;
            case 107:
               var10000 = 52;
               break;
            case 108:
               var10000 = 68;
               break;
            case 109:
               var10000 = 102;
               break;
            case 110:
               var10000 = 218;
               break;
            case 111:
               var10000 = 187;
               break;
            case 112:
               var10000 = 40;
               break;
            case 113:
               var10000 = 138;
               break;
            case 114:
               var10000 = 73;
               break;
            case 115:
               var10000 = 245;
               break;
            case 116:
               var10000 = 145;
               break;
            case 117:
               var10000 = 20;
               break;
            case 118:
               var10000 = 244;
               break;
            case 119:
               var10000 = 106;
               break;
            case 120:
               var10000 = 226;
               break;
            case 121:
               var10000 = 228;
               break;
            case 122:
               var10000 = 141;
               break;
            case 123:
               var10000 = 192;
               break;
            case 124:
               var10000 = 222;
               break;
            case 125:
               var10000 = 63;
               break;
            case 126:
               var10000 = 150;
               break;
            case 127:
               var10000 = 152;
               break;
            case 128:
               var10000 = 10;
               break;
            case 129:
               var10000 = 195;
               break;
            case 130:
               var10000 = 158;
               break;
            case 131:
               var10000 = 108;
               break;
            case 132:
               var10000 = 165;
               break;
            case 133:
               var10000 = 118;
               break;
            case 134:
               var10000 = 231;
               break;
            case 135:
               var10000 = 89;
               break;
            case 136:
               var10000 = 161;
               break;
            case 137:
               var10000 = 43;
               break;
            case 138:
               var10000 = 50;
               break;
            case 139:
               var10000 = 125;
               break;
            case 140:
               var10000 = 211;
               break;
            case 141:
               var10000 = 58;
               break;
            case 142:
               var10000 = 120;
               break;
            case 143:
               var10000 = 6;
               break;
            case 144:
               var10000 = 26;
               break;
            case 145:
               var10000 = 237;
               break;
            case 146:
               var10000 = 193;
               break;
            case 147:
               var10000 = 132;
               break;
            case 148:
               var10000 = 29;
               break;
            case 149:
               var10000 = 239;
               break;
            case 150:
               var10000 = 23;
               break;
            case 151:
               var10000 = 247;
               break;
            case 152:
               var10000 = 221;
               break;
            case 153:
               var10000 = 123;
               break;
            case 154:
               var10000 = 92;
               break;
            case 155:
               var10000 = 235;
               break;
            case 156:
               var10000 = 210;
               break;
            case 157:
               var10000 = 162;
               break;
            case 158:
               var10000 = 156;
               break;
            case 159:
               var10000 = 182;
               break;
            case 160:
               var10000 = 69;
               break;
            case 161:
               var10000 = 186;
               break;
            case 162:
               var10000 = 107;
               break;
            case 163:
               var10000 = 27;
               break;
            case 164:
               var10000 = 172;
               break;
            case 165:
               var10000 = 64;
               break;
            case 166:
               var10000 = 160;
               break;
            case 167:
               var10000 = 78;
               break;
            case 168:
               var10000 = 243;
               break;
            case 169:
               var10000 = 28;
               break;
            case 170:
               var10000 = 224;
               break;
            case 171:
               var10000 = 59;
               break;
            case 172:
               var10000 = 202;
               break;
            case 173:
               var10000 = 188;
               break;
            case 174:
               var10000 = 185;
               break;
            case 175:
               var10000 = 204;
               break;
            case 176:
               var10000 = 25;
               break;
            case 177:
               var10000 = 110;
               break;
            case 178:
               var10000 = 66;
               break;
            case 179:
               var10000 = 11;
               break;
            case 180:
               var10000 = 42;
               break;
            case 181:
               var10000 = 197;
               break;
            case 182:
               var10000 = 128;
               break;
            case 183:
               var10000 = 121;
               break;
            case 184:
               var10000 = 60;
               break;
            case 185:
               var10000 = 49;
               break;
            case 186:
               var10000 = 32;
               break;
            case 187:
               var10000 = 2;
               break;
            case 188:
               var10000 = 191;
               break;
            case 189:
               var10000 = 136;
               break;
            case 190:
               var10000 = 93;
               break;
            case 191:
               var10000 = 12;
               break;
            case 192:
               var10000 = 8;
               break;
            case 193:
               var10000 = 36;
               break;
            case 194:
               var10000 = 46;
               break;
            case 195:
               var10000 = 62;
               break;
            case 196:
               var10000 = 22;
               break;
            case 197:
               var10000 = 213;
               break;
            case 198:
               var10000 = 41;
               break;
            case 199:
               var10000 = 72;
               break;
            case 200:
               var10000 = 176;
               break;
            case 201:
               var10000 = 230;
               break;
            case 202:
               var10000 = 35;
               break;
            case 203:
               var10000 = 131;
               break;
            case 204:
               var10000 = 194;
               break;
            case 205:
               var10000 = 3;
               break;
            case 206:
               var10000 = 208;
               break;
            case 207:
               var10000 = 205;
               break;
            case 208:
               var10000 = 198;
               break;
            case 209:
               var10000 = 159;
               break;
            case 210:
               var10000 = 206;
               break;
            case 211:
               var10000 = 163;
               break;
            case 212:
               var10000 = 183;
               break;
            case 213:
               var10000 = 113;
               break;
            case 214:
               var10000 = 171;
               break;
            case 215:
               var10000 = 99;
               break;
            case 216:
               var10000 = 98;
               break;
            case 217:
               var10000 = 87;
               break;
            case 218:
               var10000 = 216;
               break;
            case 219:
               var10000 = 129;
               break;
            case 220:
               var10000 = 31;
               break;
            case 221:
               var10000 = 234;
               break;
            case 222:
               var10000 = 4;
               break;
            case 223:
               var10000 = 217;
               break;
            case 224:
               var10000 = 140;
               break;
            case 225:
               var10000 = 173;
               break;
            case 226:
               var10000 = 55;
               break;
            case 227:
               var10000 = 34;
               break;
            case 228:
               var10000 = 199;
               break;
            case 229:
               var10000 = 209;
               break;
            case 230:
               var10000 = 139;
               break;
            case 231:
               var10000 = 124;
               break;
            case 232:
               var10000 = 170;
               break;
            case 233:
               var10000 = 169;
               break;
            case 234:
               var10000 = 238;
               break;
            case 235:
               var10000 = 142;
               break;
            case 236:
               var10000 = 74;
               break;
            case 237:
               var10000 = 38;
               break;
            case 238:
               var10000 = 1;
               break;
            case 239:
               var10000 = 56;
               break;
            case 240:
               var10000 = 249;
               break;
            case 241:
               var10000 = 90;
               break;
            case 242:
               var10000 = 252;
               break;
            case 243:
               var10000 = 250;
               break;
            case 244:
               var10000 = 44;
               break;
            case 245:
               var10000 = 166;
               break;
            case 246:
               var10000 = 177;
               break;
            case 247:
               var10000 = 223;
               break;
            case 248:
               var10000 = 100;
               break;
            case 249:
               var10000 = 83;
               break;
            case 250:
               var10000 = 154;
               break;
            case 251:
               var10000 = 81;
               break;
            case 252:
               var10000 = 94;
               break;
            case 253:
               var10000 = 82;
               break;
            case 254:
               var10000 = 130;
               break;
            default:
               var10000 = 181;
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

         h[var2] = new String(var3).intern();
      }

      return h[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20623;
      if (l[var3] == null) {
         l[var3] = (int)(k[var3] ^ var1);
      }

      return l[var3];
   }
}





