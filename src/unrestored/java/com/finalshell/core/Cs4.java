package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

public class Cs4 {
   public InputStream I;
   public OutputStream X;
   public OutputStream K;
   public boolean G = false;
   public boolean O = false;
   public boolean J = false;
   public static String a;

   public void H(OutputStream var1) {
      this.X = var1;
   }

   public void U(OutputStream var1, boolean var2) {
      this.O = var2;
      this.H(var1);
   }

   public void p(OutputStream var1) {
      this.K = var1;
   }

   public void m(OutputStream var1, boolean var2) {
      this.J = var2;
      this.p(var1);
   }

   public void U(InputStream var1) {
      this.I = var1;
   }

   public void r(InputStream var1, boolean var2) {
      this.G = var2;
      this.U(var1);
   }

   public void d(YU var1) throws IOException, SocketException {
      this.X.write(var1.P.g, 0, var1.P.X);
      this.X.flush();
   }

   public void z(byte[] var1, int var2, int var3) throws IOException {
      this.X.write(var1, var2, var3);
      this.X.flush();
   }

   public void m(byte[] var1, int var2, int var3) throws IOException {
      this.K.write(var1, var2, var3);
      this.K.flush();
   }

   public int z() throws IOException {
      return this.I.read();
   }

   public void u(byte[] var1) throws IOException {
      this.q(var1, 0, var1.length);
   }

   public void q(byte[] var1, int var2, int var3) throws IOException {
      do {
         int var4 = this.I.read(var1, var2, var3);
         if (var4 < 0) {
            throw new IOException(a);
         }

         var2 += var4;
         var3 -= var4;
      } while (var3 > 0);
   }

   public void l() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 3e
      // 09: getfield com/finalshell/core/Cs4.X Ljava/io/OutputStream;
      // 0c: ifnull 3d
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 3e
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: getfield com/finalshell/core/Cs4.O Z
      // 25: ifne 3d
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/finalshell/core/Cs4.X Ljava/io/OutputStream;
      // 33: invokevirtual java/io/OutputStream.close ()V
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: aconst_null
      // 3f: putfield com/finalshell/core/Cs4.X Ljava/io/OutputStream;
      // 42: goto 46
      // 45: astore 2
      // 46: return
   }

   public void Z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 3e
      // 09: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 0c: ifnull 3d
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 3e
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: getfield com/finalshell/core/Cs4.G Z
      // 25: ifne 3d
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 33: invokevirtual java/io/InputStream.close ()V
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: aconst_null
      // 3f: putfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 42: goto 46
      // 45: astore 2
      // 46: aload 0
      // 47: invokevirtual com/finalshell/core/Cs4.l ()V
      // 4a: aload 0
      // 4b: iload 1
      // 4c: ifeq 7d
      // 4f: getfield com/finalshell/core/Cs4.K Ljava/io/OutputStream;
      // 52: ifnull 7c
      // 55: aload 0
      // 56: iload 1
      // 57: ifeq 7d
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: getfield com/finalshell/core/Cs4.J Z
      // 64: ifne 7c
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: aload 0
      // 6f: getfield com/finalshell/core/Cs4.K Ljava/io/OutputStream;
      // 72: invokevirtual java/io/OutputStream.close ()V
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/Cs4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: aload 0
      // 7d: aconst_null
      // 7e: putfield com/finalshell/core/Cs4.K Ljava/io/OutputStream;
      // 81: goto 85
      // 84: astore 2
      // 85: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0018\n\u000b\u001b_~}\u0014+OhDj8<\tOiUy9".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 39;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 39;
         var10006 = var0;
      } else {
         var6 = 39;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 39;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 122;
               break;
            case 1:
               var23 = 67;
               break;
            case 2:
               var23 = 72;
               break;
            case 3:
               var23 = 28;
               break;
            case 4:
               var23 = 23;
               break;
            case 5:
               var23 = 63;
               break;
            default:
               var23 = 122;
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
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





