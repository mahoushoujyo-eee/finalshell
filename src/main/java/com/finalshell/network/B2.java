package com.finalshell.network;

import com.finalshell.core.Jk2;
import com.finalshell.core.Y2_5;
import com.finalshell.io.B52;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class B2 extends ServerSocket {
   protected Y2_5 N;
   protected String k;
   protected InetAddress s;
   protected int V;
   boolean U;
   InetAddress Y;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public B2(String var1, int var2) throws B52, UnknownHostException, IOException {
      this(Y2_5.a, var1, var2);
   }

   public B2(Y2_5 param1, String param2, int param3) throws B52, UnknownHostException, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: invokespecial java/net/ServerSocket.<init> (I)V
      // 05: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 08: aload 0
      // 09: bipush 0
      // 0a: putfield com/finalshell/network/B2.U Z
      // 0d: astore 4
      // 0f: aload 1
      // 10: aload 4
      // 12: ifnull 4c
      // 15: ifnonnull 34
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e: athrow
      // 1f: new com/finalshell/io/B52
      // 22: dup
      // 23: sipush 8966
      // 26: ldc2_w 3315797795392990498
      // 29: invokestatic com/finalshell/network/B2.a (IJ)I
      // 2c: invokespecial com/finalshell/io/B52.<init> (I)V
      // 2f: athrow
      // 30: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: invokevirtual com/finalshell/core/Y2_5.B ()Lcom/finalshell/core/Y2_5;
      // 39: putfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 3c: aload 0
      // 3d: aload 4
      // 3f: ifnull 78
      // 42: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 45: goto 4c
      // 48: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4b: athrow
      // 4c: aload 2
      // 4d: invokevirtual com/finalshell/core/Y2_5.X$boolean (Ljava/lang/String;)Z
      // 50: ifeq 70
      // 53: aload 0
      // 54: aload 2
      // 55: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 58: putfield com/finalshell/network/B2.Y Ljava/net/InetAddress;
      // 5b: aload 0
      // 5c: aconst_null
      // 5d: putfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 60: aload 0
      // 61: invokespecial com/finalshell/network/B2.s ()V
      // 64: aload 4
      // 66: ifnonnull 84
      // 69: goto 70
      // 6c: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6f: athrow
      // 70: aload 0
      // 71: goto 78
      // 74: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 77: athrow
      // 78: aload 0
      // 79: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 7c: aload 2
      // 7d: iload 3
      // 7e: invokevirtual com/finalshell/core/Y2_5.e (Ljava/lang/String;I)Lcom/finalshell/core/Jk2;
      // 81: invokespecial com/finalshell/network/B2.y (Lcom/finalshell/core/Jk2;)V
      // 84: return
   }

   public B2(InetAddress var1, int var2) throws B52, IOException {
      this(Y2_5.a, var1, var2);
   }

   public B2(Y2_5 param1, InetAddress param2, int param3) throws B52, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: bipush 0
      // 05: invokespecial java/net/ServerSocket.<init> (I)V
      // 08: astore 4
      // 0a: aload 0
      // 0b: bipush 0
      // 0c: putfield com/finalshell/network/B2.U Z
      // 0f: aload 1
      // 10: aload 4
      // 12: ifnull 4c
      // 15: ifnonnull 34
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e: athrow
      // 1f: new com/finalshell/io/B52
      // 22: dup
      // 23: sipush 28145
      // 26: ldc2_w 232712163550880724
      // 29: invokestatic com/finalshell/network/B2.a (IJ)I
      // 2c: invokespecial com/finalshell/io/B52.<init> (I)V
      // 2f: athrow
      // 30: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: invokevirtual com/finalshell/core/Y2_5.B ()Lcom/finalshell/core/Y2_5;
      // 39: putfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 3c: aload 0
      // 3d: aload 4
      // 3f: ifnull 70
      // 42: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 45: goto 4c
      // 48: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4b: athrow
      // 4c: aload 2
      // 4d: invokevirtual com/finalshell/core/Y2_5.K (Ljava/net/InetAddress;)Z
      // 50: ifeq 68
      // 53: aload 0
      // 54: aload 2
      // 55: putfield com/finalshell/network/B2.Y Ljava/net/InetAddress;
      // 58: aload 0
      // 59: invokespecial com/finalshell/network/B2.s ()V
      // 5c: aload 4
      // 5e: ifnonnull 7c
      // 61: goto 68
      // 64: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 67: athrow
      // 68: aload 0
      // 69: goto 70
      // 6c: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 74: aload 2
      // 75: iload 3
      // 76: invokevirtual com/finalshell/core/Y2_5.J (Ljava/net/InetAddress;I)Lcom/finalshell/core/Jk2;
      // 79: invokespecial com/finalshell/network/B2.y (Lcom/finalshell/core/Jk2;)V
      // 7c: return
   }

   @Override
   public Socket accept() throws IOException {
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
      // 06: ifnull 89
      // 09: getfield com/finalshell/network/B2.U Z
      // 0c: ifne 81
      // 0f: goto 16
      // 12: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 1a: aload 1
      // 1b: ifnull 39
      // 1e: goto 25
      // 21: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24: athrow
      // 25: ifnonnull 35
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2e: athrow
      // 2f: aconst_null
      // 30: areturn
      // 31: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 34: athrow
      // 35: aload 0
      // 36: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 39: invokevirtual com/finalshell/core/Y2_5.s ()Lcom/finalshell/core/Jk2;
      // 3c: astore 3
      // 3d: aload 3
      // 3e: getfield com/finalshell/core/Jk2.e Ljava/net/InetAddress;
      // 41: ifnonnull 5e
      // 44: new com/finalshell/network/Tl4
      // 47: dup
      // 48: aload 3
      // 49: getfield com/finalshell/core/Jk2.B Ljava/lang/String;
      // 4c: aload 3
      // 4d: getfield com/finalshell/core/Jk2.R I
      // 50: aload 0
      // 51: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 54: invokespecial com/finalshell/network/Tl4.<init> (Ljava/lang/String;ILcom/finalshell/core/Y2_5;)V
      // 57: goto 71
      // 5a: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5d: athrow
      // 5e: new com/finalshell/network/Tl4
      // 61: dup
      // 62: aload 3
      // 63: getfield com/finalshell/core/Jk2.e Ljava/net/InetAddress;
      // 66: aload 3
      // 67: getfield com/finalshell/core/Jk2.R I
      // 6a: aload 0
      // 6b: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 6e: invokespecial com/finalshell/network/Tl4.<init> (Ljava/net/InetAddress;ILcom/finalshell/core/Y2_5;)V
      // 71: astore 2
      // 72: aload 0
      // 73: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 76: getfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 79: bipush 0
      // 7a: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 7d: aload 1
      // 7e: ifnonnull c0
      // 81: aload 0
      // 82: goto 89
      // 85: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 88: athrow
      // 89: invokespecial java/net/ServerSocket.accept ()Ljava/net/Socket;
      // 8c: astore 2
      // 8d: aload 2
      // 8e: invokevirtual java/net/Socket.getInetAddress ()Ljava/net/InetAddress;
      // 91: aload 0
      // 92: getfield com/finalshell/network/B2.Y Ljava/net/InetAddress;
      // 95: invokevirtual java/net/InetAddress.equals (Ljava/lang/Object;)Z
      // 98: ifeq b1
      // 9b: aload 1
      // 9c: ifnull bc
      // 9f: goto a6
      // a2: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // a5: athrow
      // a6: aload 1
      // a7: ifnonnull c0
      // aa: goto b1
      // ad: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // b0: athrow
      // b1: aload 2
      // b2: invokevirtual java/net/Socket.close ()V
      // b5: goto bc
      // b8: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // bb: athrow
      // bc: aload 1
      // bd: ifnonnull 81
      // c0: aload 0
      // c1: aconst_null
      // c2: putfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // c5: aload 2
      // c6: areturn
   }

   @Override
   public void close() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial java/net/ServerSocket.close ()V
      // 07: astore 1
      // 08: aload 0
      // 09: aload 1
      // 0a: ifnull 29
      // 0d: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 10: ifnull 28
      // 13: goto 1a
      // 16: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 1e: invokevirtual com/finalshell/core/Y2_5.F ()V
      // 21: goto 28
      // 24: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: aload 0
      // 29: aconst_null
      // 2a: putfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 2d: return
   }

   public String b() {
      return this.k;
   }

   @Override
   public InetAddress getInetAddress() {
      String[] var1 = Jk2.Y();

      try {
         if (var1 == null) {
            return this.s;
         }

         if (this.s != null) {
            return this.s;
         }
      } catch (UnknownHostException var4) {
         throw a(var4);
      }

      try {
         this.s = InetAddress.getByName(this.k);
      } catch (UnknownHostException var3) {
         return null;
      }

      return this.s;
   }

   @Override
   public int getLocalPort() {
      return this.V;
   }

   @Override
   public void setSoTimeout(int param1) throws SocketException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: iload 1
      // 05: invokespecial java/net/ServerSocket.setSoTimeout (I)V
      // 08: astore 2
      // 09: aload 0
      // 0a: aload 2
      // 0b: ifnull 23
      // 0e: getfield com/finalshell/network/B2.U Z
      // 11: ifne 2d
      // 14: goto 1b
      // 17: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 22: athrow
      // 23: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 26: getfield com/finalshell/core/Y2_5.Y Ljava/net/Socket;
      // 29: iload 1
      // 2a: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 2d: return
   }

   public void y(Jk2 param1) throws B52 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: getfield com/finalshell/core/Jk2.R I
      // 08: putfield com/finalshell/network/B2.V I
      // 0b: astore 2
      // 0c: aload 2
      // 0d: ifnull 54
      // 10: aload 1
      // 11: getfield com/finalshell/core/Jk2.B Ljava/lang/String;
      // 14: getstatic com/finalshell/network/B2.a Ljava/lang/String;
      // 17: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a: ifeq 45
      // 1d: goto 24
      // 20: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 23: athrow
      // 24: aload 0
      // 25: aload 0
      // 26: getfield com/finalshell/network/B2.N Lcom/finalshell/core/Y2_5;
      // 29: getfield com/finalshell/core/Y2_5.v Ljava/net/InetAddress;
      // 2c: putfield com/finalshell/network/B2.s Ljava/net/InetAddress;
      // 2f: aload 0
      // 30: aload 0
      // 31: getfield com/finalshell/network/B2.s Ljava/net/InetAddress;
      // 34: invokevirtual java/net/InetAddress.getHostName ()Ljava/lang/String;
      // 37: putfield com/finalshell/network/B2.k Ljava/lang/String;
      // 3a: aload 2
      // 3b: ifnonnull 5c
      // 3e: goto 45
      // 41: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 44: athrow
      // 45: aload 0
      // 46: aload 1
      // 47: getfield com/finalshell/core/Jk2.B Ljava/lang/String;
      // 4a: putfield com/finalshell/network/B2.k Ljava/lang/String;
      // 4d: goto 54
      // 50: invokestatic com/finalshell/network/B2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 53: athrow
      // 54: aload 0
      // 55: aload 1
      // 56: getfield com/finalshell/core/Jk2.e Ljava/net/InetAddress;
      // 59: putfield com/finalshell/network/B2.s Ljava/net/InetAddress;
      // 5c: return
   }

   public void s() {
      this.U = true;
      this.V = super.getLocalPort();
      this.s = super.getInetAddress();
      this.k = this.s.getHostName();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3620;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "))UaOz/".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 123;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 123;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 98;
               break;
            case 1:
               var37 = 124;
               break;
            case 2:
               var37 = 30;
               break;
            case 3:
               var37 = 52;
               break;
            case 4:
               var37 = 4;
               break;
            case 5:
               var37 = 47;
               break;
            default:
               var37 = 100;
         }
      } else {
         var25 = 123;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 1832800303801577912L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "B\u000bv<\u0081?\u001c\u009a\u0011H&ñ¿\u000fÒl";
            int var13 = "B\u000bv<\u0081?\u001c\u009a\u0011H&ñ¿\u000fÒl".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 123;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 98;
               break;
            case 1:
               var37 = 124;
               break;
            case 2:
               var37 = 30;
               break;
            case 3:
               var37 = 52;
               break;
            case 4:
               var37 = 4;
               break;
            case 5:
               var37 = 47;
               break;
            default:
               var37 = 100;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 98;
                  break;
               case 1:
                  var37 = 124;
                  break;
               case 2:
                  var37 = 30;
                  break;
               case 3:
                  var37 = 52;
                  break;
               case 4:
                  var37 = 4;
                  break;
               case 5:
                  var37 = 47;
                  break;
               default:
                  var37 = 100;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 1832800303801577912L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "B\u000bv<\u0081?\u001c\u009a\u0011H&ñ¿\u000fÒl";
               int var5 = "B\u000bv<\u0081?\u001c\u009a\u0011H&ñ¿\u000fÒl".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
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
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 98;
                  break;
               case 1:
                  var37 = 124;
                  break;
               case 2:
                  var37 = 30;
                  break;
               case 3:
                  var37 = 52;
                  break;
               case 4:
                  var37 = 4;
                  break;
               case 5:
                  var37 = 47;
                  break;
               default:
                  var37 = 100;
            }
         }
      }
   }
}





