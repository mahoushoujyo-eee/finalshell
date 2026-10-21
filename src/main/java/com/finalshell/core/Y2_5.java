package com.finalshell.core;

import com.finalshell.io.B52;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public abstract class Y2_5 {
   public TR s = new TR();
   public InetAddress v = null;
   public String m = null;
   public int k;
   public Socket Y = null;
   public InputStream L;
   public OutputStream I;
   public int w;
   public Y2_5 T = null;
   public static Y2_5 a;
   public static String[] b;
   public static String[] c;
   public static long[] f;
   public static Integer[] g;

   static {
      __vfClinit__();
   }

   public Y2_5(Y2_5 param1, String param2, int param3) throws UnknownHostException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: new com/finalshell/core/TR
      // 08: dup
      // 09: invokespecial com/finalshell/core/TR.<init> ()V
      // 0c: putfield com/finalshell/core/Y2_5.s Lcom/finalshell/core/TR;
      // 0f: aload 0
      // 10: aconst_null
      // 11: putfield com/finalshell/core/Y2_5.v Ljava/net/InetAddress;
      // 14: aload 0
      // 15: aconst_null
      // 16: putfield com/finalshell/core/Y2_5.m Ljava/lang/String;
      // 19: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 1c: aload 0
      // 1d: aconst_null
      // 1e: putfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 21: astore 4
      // 23: aload 0
      // 24: aconst_null
      // 25: putfield com/finalshell/core/Y2_5.T Lcom/finalshell/core/Y2_5;
      // 28: aload 0
      // 29: aload 1
      // 2a: putfield com/finalshell/core/Y2_5.T Lcom/finalshell/core/Y2_5;
      // 2d: aload 0
      // 2e: aload 2
      // 2f: putfield com/finalshell/core/Y2_5.m Ljava/lang/String;
      // 32: aload 1
      // 33: aload 4
      // 35: ifnull 52
      // 38: ifnonnull 51
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 0
      // 43: aload 2
      // 44: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 47: putfield com/finalshell/core/Y2_5.v Ljava/net/InetAddress;
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: iload 3
      // 53: putfield com/finalshell/core/Y2_5.k I
      // 56: return
   }

   public Y2_5(String var1, int var2) throws UnknownHostException {
      this(null, var1, var2);
   }

   public Y2_5(Y2_5 var1, InetAddress var2, int var3) {
      this.T = var1;
      this.v = var2;
      this.k = var3;
   }

   public Y2_5(InetAddress var1, int var2) {
      this(null, var1, var2);
   }

   public Y2_5(Y2_5 var1) {
      this.v = var1.v;
      this.k = var1.k;
      this.w = var1.w;
      this.s = var1.s;
   }

   public int z() {
      return this.k;
   }

   public InetAddress k() {
      return this.v;
   }

   public void k(InetAddress var1) {
      this.s.Y(var1);
   }

   public boolean L(String var1) {
      return this.s.K(var1);
   }

   public void H(InetAddress var1, InetAddress var2) {
      this.s.f(var1, var2);
   }

   public void S(TR var1) {
      this.s = var1;
   }

   public TR c() {
      return this.s;
   }

   public boolean X$boolean(String var1) {
      return this.s.t(var1);
   }

   public boolean K(InetAddress var1) {
      return this.s.a(var1);
   }

   public void k(Y2_5 var1) {
      this.T = var1;
   }

   public Y2_5 D() {
      return this.T;
   }

   @Override
   public String toString() {
      return this.v.getHostName() + ":" + this.k + a(-31700, 18733) + this.w;
   }

   public static void d(String var0, int var1, String var2) throws UnknownHostException {
      a = new X2_4(var0, var1, var2);
   }

   public static void h(InetAddress var0, int var1, String var2) {
      a = new X2_4(var0, var1, var2);
   }

   public static void N(String var0, int var1) throws UnknownHostException {
      a = new C3(var0, var1);
   }

   public static void v(InetAddress var0, int var1) {
      a = new C3(var0, var1);
   }

   public static void s(Y2_5 var0) {
      a = var0;
   }

   public static Y2_5 m$y_2() {
      return a;
   }

   public static Y2_5 X$y_2(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 003: sipush 8708
      // 006: ldc2_w 4010857206153681901
      // 009: invokestatic com/finalshell/core/Y2_5.a (IJ)I
      // 00c: istore 3
      // 00d: aconst_null
      // 00e: astore 4
      // 010: astore 1
      // 011: aconst_null
      // 012: astore 5
      // 014: new java/util/StringTokenizer
      // 017: dup
      // 018: aload 0
      // 019: ldc ":"
      // 01b: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 01e: astore 7
      // 020: aload 7
      // 022: aload 1
      // 023: ifnull 03c
      // 026: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 029: bipush 1
      // 02a: if_icmpge 03a
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aconst_null
      // 035: areturn
      // 036: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: aload 7
      // 03c: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 03f: astore 2
      // 040: aload 7
      // 042: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 045: aload 1
      // 046: ifnull 074
      // 049: ifeq 064
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: aload 7
      // 055: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 058: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 05b: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 05e: istore 3
      // 05f: goto 064
      // 062: astore 8
      // 064: aload 7
      // 066: aload 1
      // 067: ifnull 079
      // 06a: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: ifeq 07e
      // 077: aload 7
      // 079: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 07c: astore 4
      // 07e: aload 7
      // 080: aload 1
      // 081: ifnull 09a
      // 084: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 087: ifeq 09f
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 7
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 09d: astore 5
      // 09f: aload 4
      // 0a1: aload 1
      // 0a2: ifnull 0c7
      // 0a5: ifnonnull 0be
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: new com/finalshell/core/C3
      // 0b2: dup
      // 0b3: aload 2
      // 0b4: iload 3
      // 0b5: invokespecial com/finalshell/core/C3.<init> (Ljava/lang/String;I)V
      // 0b8: astore 6
      // 0ba: aload 1
      // 0bb: ifnonnull 106
      // 0be: aload 5
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: ifnonnull 0db
      // 0ca: new com/finalshell/core/X2_4
      // 0cd: dup
      // 0ce: aload 2
      // 0cf: iload 3
      // 0d0: aload 4
      // 0d2: invokespecial com/finalshell/core/X2_4.<init> (Ljava/lang/String;ILjava/lang/String;)V
      // 0d5: astore 6
      // 0d7: aload 1
      // 0d8: ifnonnull 106
      // 0db: new com/finalshell/core/C3
      // 0de: dup
      // 0df: aload 2
      // 0e0: iload 3
      // 0e1: invokespecial com/finalshell/core/C3.<init> (Ljava/lang/String;I)V
      // 0e4: astore 6
      // 0e6: new com/finalshell/core/ZT_2
      // 0e9: dup
      // 0ea: aload 4
      // 0ec: aload 5
      // 0ee: invokespecial com/finalshell/core/ZT_2.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0f1: astore 8
      // 0f3: aload 6
      // 0f5: checkcast com/finalshell/core/C3
      // 0f8: bipush 2
      // 0f9: aload 8
      // 0fb: invokevirtual com/finalshell/core/C3.d (ILcom/finalshell/core/Xz2;)Z
      // 0fe: pop
      // 0ff: goto 106
      // 102: astore 8
      // 104: aconst_null
      // 105: areturn
      // 106: aload 6
      // 108: areturn
   }

   public void m$void() throws B52 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Y2_5.T Lcom/finalshell/core/Y2_5;
      // 08: aload 1
      // 09: ifnull 3c
      // 0c: ifnonnull 34
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: new java/net/Socket
      // 1a: dup
      // 1b: aload 0
      // 1c: getfield com/finalshell/core/Y2_5.v Ljava/net/InetAddress;
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Y2_5.k I
      // 23: invokespecial java/net/Socket.<init> (Ljava/net/InetAddress;I)V
      // 26: putfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 29: aload 1
      // 2a: ifnonnull 8d
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: aload 1
      // 3d: ifnull 77
      // 40: getfield com/finalshell/core/Y2_5.v Ljava/net/InetAddress;
      // 43: ifnull 6f
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: new com/finalshell/network/Tl4
      // 51: dup
      // 52: aload 0
      // 53: getfield com/finalshell/core/Y2_5.T Lcom/finalshell/core/Y2_5;
      // 56: aload 0
      // 57: getfield com/finalshell/core/Y2_5.v Ljava/net/InetAddress;
      // 5a: aload 0
      // 5b: getfield com/finalshell/core/Y2_5.k I
      // 5e: invokespecial com/finalshell/network/Tl4.<init> (Lcom/finalshell/core/Y2_5;Ljava/net/InetAddress;I)V
      // 61: putfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 64: aload 1
      // 65: ifnonnull 8d
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: aload 0
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: new com/finalshell/network/Tl4
      // 7a: dup
      // 7b: aload 0
      // 7c: getfield com/finalshell/core/Y2_5.T Lcom/finalshell/core/Y2_5;
      // 7f: aload 0
      // 80: getfield com/finalshell/core/Y2_5.m Ljava/lang/String;
      // 83: aload 0
      // 84: getfield com/finalshell/core/Y2_5.k I
      // 87: invokespecial com/finalshell/network/Tl4.<init> (Lcom/finalshell/core/Y2_5;Ljava/lang/String;I)V
      // 8a: putfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 8d: aload 0
      // 8e: aload 0
      // 8f: getfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 92: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 95: putfield com/finalshell/core/Y2_5.L Ljava/io/InputStream;
      // 98: aload 0
      // 99: aload 0
      // 9a: getfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 9d: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // a0: putfield com/finalshell/core/Y2_5.I Ljava/io/OutputStream;
      // a3: goto c9
      // a6: astore 2
      // a7: aload 2
      // a8: athrow
      // a9: astore 2
      // aa: new com/finalshell/io/B52
      // ad: dup
      // ae: sipush 7982
      // b1: ldc2_w 4575668584525342401
      // b4: invokestatic com/finalshell/core/Y2_5.a (IJ)I
      // b7: new java/lang/StringBuilder
      // ba: dup
      // bb: invokespecial java/lang/StringBuilder.<init> ()V
      // be: aload 2
      // bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // c2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c5: invokespecial com/finalshell/io/B52.<init> (ILjava/lang/String;)V
      // c8: athrow
      // c9: return
   }

   public abstract Y2_5 B();

   public abstract Jk2 k(int var1, InetAddress var2, int var3);

   public abstract Jk2 Q(int var1, String var2, int var3) throws UnknownHostException;

   public abstract Jk2 o(InputStream var1) throws B52, IOException;

   public Jk2 r(InetAddress var1, int var2) throws B52 {
      try {
         this.m$void();
         Jk2 var3 = this.k(1, var1, var2);
         return this.p(var3);
      } catch (B52 var4) {
         this.F();
         throw var4;
      }
   }

   public Jk2 V(String var1, int var2) throws UnknownHostException, B52 {
      try {
         this.m$void();
         Jk2 var3 = this.Q(1, var1, var2);
         return this.p(var3);
      } catch (B52 var4) {
         this.F();
         throw var4;
      }
   }

   public Jk2 J(InetAddress var1, int var2) throws B52 {
      try {
         this.m$void();
         Jk2 var3 = this.k(2, var1, var2);
         return this.p(var3);
      } catch (B52 var4) {
         this.F();
         throw var4;
      }
   }

   public Jk2 e(String var1, int var2) throws UnknownHostException, B52 {
      try {
         this.m$void();
         Jk2 var3 = this.Q(2, var1, var2);
         return this.p(var3);
      } catch (B52 var4) {
         this.F();
         throw var4;
      }
   }

   public Jk2 s() throws IOException, B52 {
      try {
         return this.o(this.L);
      } catch (InterruptedIOException var3) {
         throw var3;
      } catch (IOException var4) {
         this.F();
         throw new B52(a(13469, 6304218990715932016L), a(-31699, 12723) + var4);
      }
   }

   public Jk2 F(InetAddress var1, int var2) throws B52 {
      String[] var3 = Jk2.Y();

      try {
         label32: {
            this.m$void();
            Jk2 var4 = this.k(3, var1, var2);

            try {
               if (var3 == null) {
                  throw new B52(a(30760, 1218424183128375748L), a(-31698, -10867));
               }

               if (var4 == null) {
                  break label32;
               }
            } catch (B52 var5) {
               throw a(var5);
            }

            return this.p(var4);
         }
      } catch (B52 var6) {
         this.F();
         throw var6;
      }

      this.F();
      throw new B52(a(30760, 1218424183128375748L), a(-31698, -10867));
   }

   public Jk2 Y(String var1, int var2) throws UnknownHostException, B52 {
      String[] var3 = Jk2.Y();

      try {
         label32: {
            this.m$void();
            Jk2 var4 = this.Q(3, var1, var2);

            try {
               if (var3 == null) {
                  throw new B52(a(3788, 6501228741262030626L), a(-31697, 29675));
               }

               if (var4 == null) {
                  break label32;
               }
            } catch (B52 var5) {
               throw a(var5);
            }

            return this.p(var4);
         }
      } catch (B52 var6) {
         this.F();
         throw var6;
      }

      this.F();
      throw new B52(a(3788, 6501228741262030626L), a(-31697, 29675));
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
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 25
      // 09: getfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 1a: invokevirtual java/net/Socket.close ()V
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Y2_5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: aconst_null
      // 26: putfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 29: goto 2d
      // 2c: astore 2
      // 2d: return
   }

   public void N(Jk2 var1) throws B52, IOException {
      var1.l(this.I);
   }

   public Jk2 g() throws B52, IOException {
      return this.o(this.L);
   }

   public Jk2 p(Jk2 var1) throws B52 {
      try {
         var1.l(this.I);
         return this.o(this.L);
      } catch (B52 var4) {
         throw var4;
      } catch (IOException var5) {
         throw new B52(a(7982, 4575668584525342401L), "" + var5);
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -31697) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 98;
               break;
            case 1:
               var10000 = 214;
               break;
            case 2:
               var10000 = 33;
               break;
            case 3:
               var10000 = 107;
               break;
            case 4:
               var10000 = 199;
               break;
            case 5:
               var10000 = 82;
               break;
            case 6:
               var10000 = 64;
               break;
            case 7:
               var10000 = 193;
               break;
            case 8:
               var10000 = 94;
               break;
            case 9:
               var10000 = 194;
               break;
            case 10:
               var10000 = 150;
               break;
            case 11:
               var10000 = 44;
               break;
            case 12:
               var10000 = 124;
               break;
            case 13:
               var10000 = 77;
               break;
            case 14:
               var10000 = 233;
               break;
            case 15:
               var10000 = 159;
               break;
            case 16:
               var10000 = 155;
               break;
            case 17:
               var10000 = 39;
               break;
            case 18:
               var10000 = 63;
               break;
            case 19:
               var10000 = 161;
               break;
            case 20:
               var10000 = 184;
               break;
            case 21:
               var10000 = 173;
               break;
            case 22:
               var10000 = 27;
               break;
            case 23:
               var10000 = 160;
               break;
            case 24:
               var10000 = 222;
               break;
            case 25:
               var10000 = 29;
               break;
            case 26:
               var10000 = 93;
               break;
            case 27:
               var10000 = 16;
               break;
            case 28:
               var10000 = 62;
               break;
            case 29:
               var10000 = 17;
               break;
            case 30:
               var10000 = 46;
               break;
            case 31:
               var10000 = 13;
               break;
            case 32:
               var10000 = 242;
               break;
            case 33:
               var10000 = 5;
               break;
            case 34:
               var10000 = 179;
               break;
            case 35:
               var10000 = 167;
               break;
            case 36:
               var10000 = 203;
               break;
            case 37:
               var10000 = 182;
               break;
            case 38:
               var10000 = 121;
               break;
            case 39:
               var10000 = 255;
               break;
            case 40:
               var10000 = 81;
               break;
            case 41:
               var10000 = 126;
               break;
            case 42:
               var10000 = 80;
               break;
            case 43:
               var10000 = 235;
               break;
            case 44:
               var10000 = 123;
               break;
            case 45:
               var10000 = 95;
               break;
            case 46:
               var10000 = 189;
               break;
            case 47:
               var10000 = 217;
               break;
            case 48:
               var10000 = 96;
               break;
            case 49:
               var10000 = 90;
               break;
            case 50:
               var10000 = 248;
               break;
            case 51:
               var10000 = 198;
               break;
            case 52:
               var10000 = 10;
               break;
            case 53:
               var10000 = 115;
               break;
            case 54:
               var10000 = 131;
               break;
            case 55:
               var10000 = 151;
               break;
            case 56:
               var10000 = 174;
               break;
            case 57:
               var10000 = 125;
               break;
            case 58:
               var10000 = 6;
               break;
            case 59:
               var10000 = 42;
               break;
            case 60:
               var10000 = 196;
               break;
            case 61:
               var10000 = 54;
               break;
            case 62:
               var10000 = 74;
               break;
            case 63:
               var10000 = 22;
               break;
            case 64:
               var10000 = 51;
               break;
            case 65:
               var10000 = 72;
               break;
            case 66:
               var10000 = 1;
               break;
            case 67:
               var10000 = 43;
               break;
            case 68:
               var10000 = 69;
               break;
            case 69:
               var10000 = 35;
               break;
            case 70:
               var10000 = 243;
               break;
            case 71:
               var10000 = 176;
               break;
            case 72:
               var10000 = 245;
               break;
            case 73:
               var10000 = 144;
               break;
            case 74:
               var10000 = 14;
               break;
            case 75:
               var10000 = 228;
               break;
            case 76:
               var10000 = 240;
               break;
            case 77:
               var10000 = 65;
               break;
            case 78:
               var10000 = 32;
               break;
            case 79:
               var10000 = 213;
               break;
            case 80:
               var10000 = 252;
               break;
            case 81:
               var10000 = 73;
               break;
            case 82:
               var10000 = 40;
               break;
            case 83:
               var10000 = 28;
               break;
            case 84:
               var10000 = 241;
               break;
            case 85:
               var10000 = 234;
               break;
            case 86:
               var10000 = 192;
               break;
            case 87:
               var10000 = 59;
               break;
            case 88:
               var10000 = 68;
               break;
            case 89:
               var10000 = 117;
               break;
            case 90:
               var10000 = 8;
               break;
            case 91:
               var10000 = 212;
               break;
            case 92:
               var10000 = 231;
               break;
            case 93:
               var10000 = 250;
               break;
            case 94:
               var10000 = 253;
               break;
            case 95:
               var10000 = 164;
               break;
            case 96:
               var10000 = 139;
               break;
            case 97:
               var10000 = 186;
               break;
            case 98:
               var10000 = 71;
               break;
            case 99:
               var10000 = 103;
               break;
            case 100:
               var10000 = 45;
               break;
            case 101:
               var10000 = 229;
               break;
            case 102:
               var10000 = 137;
               break;
            case 103:
               var10000 = 200;
               break;
            case 104:
               var10000 = 156;
               break;
            case 105:
               var10000 = 225;
               break;
            case 106:
               var10000 = 50;
               break;
            case 107:
               var10000 = 168;
               break;
            case 108:
               var10000 = 3;
               break;
            case 109:
               var10000 = 21;
               break;
            case 110:
               var10000 = 106;
               break;
            case 111:
               var10000 = 134;
               break;
            case 112:
               var10000 = 25;
               break;
            case 113:
               var10000 = 127;
               break;
            case 114:
               var10000 = 89;
               break;
            case 115:
               var10000 = 220;
               break;
            case 116:
               var10000 = 221;
               break;
            case 117:
               var10000 = 224;
               break;
            case 118:
               var10000 = 47;
               break;
            case 119:
               var10000 = 132;
               break;
            case 120:
               var10000 = 140;
               break;
            case 121:
               var10000 = 129;
               break;
            case 122:
               var10000 = 20;
               break;
            case 123:
               var10000 = 99;
               break;
            case 124:
               var10000 = 0;
               break;
            case 125:
               var10000 = 56;
               break;
            case 126:
               var10000 = 145;
               break;
            case 127:
               var10000 = 209;
               break;
            case 128:
               var10000 = 130;
               break;
            case 129:
               var10000 = 165;
               break;
            case 130:
               var10000 = 30;
               break;
            case 131:
               var10000 = 105;
               break;
            case 132:
               var10000 = 85;
               break;
            case 133:
               var10000 = 180;
               break;
            case 134:
               var10000 = 18;
               break;
            case 135:
               var10000 = 36;
               break;
            case 136:
               var10000 = 136;
               break;
            case 137:
               var10000 = 7;
               break;
            case 138:
               var10000 = 83;
               break;
            case 139:
               var10000 = 87;
               break;
            case 140:
               var10000 = 38;
               break;
            case 141:
               var10000 = 172;
               break;
            case 142:
               var10000 = 201;
               break;
            case 143:
               var10000 = 88;
               break;
            case 144:
               var10000 = 237;
               break;
            case 145:
               var10000 = 102;
               break;
            case 146:
               var10000 = 66;
               break;
            case 147:
               var10000 = 249;
               break;
            case 148:
               var10000 = 183;
               break;
            case 149:
               var10000 = 246;
               break;
            case 150:
               var10000 = 208;
               break;
            case 151:
               var10000 = 226;
               break;
            case 152:
               var10000 = 178;
               break;
            case 153:
               var10000 = 204;
               break;
            case 154:
               var10000 = 75;
               break;
            case 155:
               var10000 = 122;
               break;
            case 156:
               var10000 = 157;
               break;
            case 157:
               var10000 = 185;
               break;
            case 158:
               var10000 = 163;
               break;
            case 159:
               var10000 = 79;
               break;
            case 160:
               var10000 = 91;
               break;
            case 161:
               var10000 = 254;
               break;
            case 162:
               var10000 = 55;
               break;
            case 163:
               var10000 = 118;
               break;
            case 164:
               var10000 = 100;
               break;
            case 165:
               var10000 = 60;
               break;
            case 166:
               var10000 = 216;
               break;
            case 167:
               var10000 = 238;
               break;
            case 168:
               var10000 = 57;
               break;
            case 169:
               var10000 = 12;
               break;
            case 170:
               var10000 = 227;
               break;
            case 171:
               var10000 = 171;
               break;
            case 172:
               var10000 = 114;
               break;
            case 173:
               var10000 = 61;
               break;
            case 174:
               var10000 = 251;
               break;
            case 175:
               var10000 = 111;
               break;
            case 176:
               var10000 = 190;
               break;
            case 177:
               var10000 = 11;
               break;
            case 178:
               var10000 = 152;
               break;
            case 179:
               var10000 = 244;
               break;
            case 180:
               var10000 = 116;
               break;
            case 181:
               var10000 = 34;
               break;
            case 182:
               var10000 = 104;
               break;
            case 183:
               var10000 = 197;
               break;
            case 184:
               var10000 = 153;
               break;
            case 185:
               var10000 = 52;
               break;
            case 186:
               var10000 = 177;
               break;
            case 187:
               var10000 = 158;
               break;
            case 188:
               var10000 = 113;
               break;
            case 189:
               var10000 = 146;
               break;
            case 190:
               var10000 = 154;
               break;
            case 191:
               var10000 = 191;
               break;
            case 192:
               var10000 = 187;
               break;
            case 193:
               var10000 = 120;
               break;
            case 194:
               var10000 = 2;
               break;
            case 195:
               var10000 = 19;
               break;
            case 196:
               var10000 = 247;
               break;
            case 197:
               var10000 = 78;
               break;
            case 198:
               var10000 = 23;
               break;
            case 199:
               var10000 = 143;
               break;
            case 200:
               var10000 = 207;
               break;
            case 201:
               var10000 = 239;
               break;
            case 202:
               var10000 = 110;
               break;
            case 203:
               var10000 = 84;
               break;
            case 204:
               var10000 = 181;
               break;
            case 205:
               var10000 = 162;
               break;
            case 206:
               var10000 = 4;
               break;
            case 207:
               var10000 = 97;
               break;
            case 208:
               var10000 = 138;
               break;
            case 209:
               var10000 = 108;
               break;
            case 210:
               var10000 = 169;
               break;
            case 211:
               var10000 = 206;
               break;
            case 212:
               var10000 = 133;
               break;
            case 213:
               var10000 = 215;
               break;
            case 214:
               var10000 = 31;
               break;
            case 215:
               var10000 = 188;
               break;
            case 216:
               var10000 = 135;
               break;
            case 217:
               var10000 = 142;
               break;
            case 218:
               var10000 = 37;
               break;
            case 219:
               var10000 = 109;
               break;
            case 220:
               var10000 = 170;
               break;
            case 221:
               var10000 = 15;
               break;
            case 222:
               var10000 = 230;
               break;
            case 223:
               var10000 = 205;
               break;
            case 224:
               var10000 = 76;
               break;
            case 225:
               var10000 = 26;
               break;
            case 226:
               var10000 = 141;
               break;
            case 227:
               var10000 = 210;
               break;
            case 228:
               var10000 = 236;
               break;
            case 229:
               var10000 = 232;
               break;
            case 230:
               var10000 = 112;
               break;
            case 231:
               var10000 = 175;
               break;
            case 232:
               var10000 = 53;
               break;
            case 233:
               var10000 = 67;
               break;
            case 234:
               var10000 = 86;
               break;
            case 235:
               var10000 = 92;
               break;
            case 236:
               var10000 = 218;
               break;
            case 237:
               var10000 = 119;
               break;
            case 238:
               var10000 = 24;
               break;
            case 239:
               var10000 = 223;
               break;
            case 240:
               var10000 = 166;
               break;
            case 241:
               var10000 = 128;
               break;
            case 242:
               var10000 = 211;
               break;
            case 243:
               var10000 = 148;
               break;
            case 244:
               var10000 = 9;
               break;
            case 245:
               var10000 = 49;
               break;
            case 246:
               var10000 = 195;
               break;
            case 247:
               var10000 = 58;
               break;
            case 248:
               var10000 = 41;
               break;
            case 249:
               var10000 = 70;
               break;
            case 250:
               var10000 = 101;
               break;
            case 251:
               var10000 = 48;
               break;
            case 252:
               var10000 = 149;
               break;
            case 253:
               var10000 = 202;
               break;
            case 254:
               var10000 = 219;
               break;
            default:
               var10000 = 147;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14829;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "\u0000\u008e=;üiàZâ\u0094Ò\u0087\u009d\u0002L¦Ù~\u0015îg7\u009a'\"*È\bï\u0092Õ'Ôì\u000f1©ZÕÛ¿ê¦\"\t\u0086lËXª\u007f÷Å(\u0001l#ôQ#ß»\u0090¸|?åCî0àìG\u0093\u0097\u0005\f\u007f\u000fú&\u00ad;S7ÀÈ9ÜÍíxÌÁ\u0015uT=¢Ò:RÒæ\u0012 ¢\u0084Q\u0001{_²)\u001b>¶\u0014¢ ~Òv3Í\u001f\u008c^d\u0014çM\u0092\u00818";
      int var12 = "\u0000\u008e=;üiàZâ\u0094Ò\u0087\u009d\u0002L¦Ù~\u0015îg7\u009a'\"*È\bï\u0092Õ'Ôì\u000f1©ZÕÛ¿ê¦\"\t\u0086lËXª\u007f÷Å(\u0001l#ôQ#ß»\u0090¸|?åCî0àìG\u0093\u0097\u0005\f\u007f\u000fú&\u00ad;S7ÀÈ9ÜÍíxÌÁ\u0015uT=¢Ò:RÒæ\u0012 ¢\u0084Q\u0001{_²)\u001b>¶\u0014¢ ~Òv3Í\u001f\u008c^d\u0014çM\u0092\u00818"
         .length();
      char var9 = 'C';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 53;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 96;
                        break;
                     case 1:
                        var65 = 90;
                        break;
                     case 2:
                        var65 = 21;
                        break;
                     case 3:
                        var65 = 36;
                        break;
                     case 4:
                        var65 = 14;
                        break;
                     case 5:
                        var65 = 114;
                        break;
                     default:
                        var65 = 108;
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
                     b = var13;
                     c = new String[4];
                     long var0 = 5338437677655891277L;
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "®#ÀÜÏÛ\u0090=~©O:U)\\\u0089\u0088®\u001f\r6²»\u008c";
                     int var5 = "®#ÀÜÏÛ\u0090=~©O:U)\\\u0089\u0088®\u001f\r6²»\u008c".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
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
                                    f = var6;
                                    g = new Integer[5];
                                    a = null;
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0017\u0005·ÊÆN*o\u0082<=]q¦\u0082\u0098";
                                 var5 = "\u0017\u0005·ÊÆN*o\u0082<=]q¦\u0082\u0098".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
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

                  var10 = "\u001c\u0097D\u009e\u000fîÛ¯\u0001³}óÐ3y\u0095V¨Ñ\u00ad\t×V¤A\u0088\u0081Ä>ç";
                  var12 = "\u001c\u0097D\u009e\u000fîÛ¯\u0001³}óÐ3y\u0095V¨Ñ\u00ad\t×V¤A\u0088\u0081Ä>ç".length();
                  var9 = 20;
                  var17 = -1;
            }

            var10000 = 66;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





