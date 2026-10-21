package com.finalshell.core;

import java.io.IOException;

public class HV implements Y42 {
   public char[] K;
   public int X;
   public int t;
   public int b = 0;

   @Override
   public int O() {
      return this.b;
   }

   @Override
   public void o(int var1) {
      this.b = var1;
   }

   public HV(char[] var1, int var2, int var3) {
      this.K = var1;
      this.X = var2;
      this.t = var3;
   }

   public HV(char[] var1) {
      this(var1, 0, var1.length);
   }

   @Override
   public char C() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/HV.t I
      // 08: aload 1
      // 09: ifnonnull 3c
      // 0c: ifne 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/HV.b (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: new com/finalshell/io/P
      // 19: dup
      // 1a: invokespecial com/finalshell/io/P.<init> ()V
      // 1d: athrow
      // 1e: invokestatic com/finalshell/core/HV.b (Ljava/io/IOException;)Ljava/io/IOException;
      // 21: athrow
      // 22: aload 0
      // 23: dup
      // 24: getfield com/finalshell/core/HV.t I
      // 27: bipush 1
      // 28: isub
      // 29: putfield com/finalshell/core/HV.t I
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/HV.K [C
      // 30: aload 0
      // 31: dup
      // 32: getfield com/finalshell/core/HV.X I
      // 35: dup_x1
      // 36: bipush 1
      // 37: iadd
      // 38: putfield com/finalshell/core/HV.X I
      // 3b: caload
      // 3c: istore 2
      // 3d: iload 2
      // 3e: ireturn
   }

   @Override
   public void s(char param1) throws com.finalshell.io.P {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dx4.g ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 7b
      // 09: getfield com/finalshell/core/HV.X I
      // 0c: ifne 70
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/HV.b (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/HV.K [C
      // 1a: aload 2
      // 1b: ifnonnull 4e
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/HV.b (Ljava/io/IOException;)Ljava/io/IOException;
      // 24: athrow
      // 25: arraylength
      // 26: aload 0
      // 27: getfield com/finalshell/core/HV.t I
      // 2a: isub
      // 2b: ifne 43
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/HV.b (Ljava/io/IOException;)Ljava/io/IOException;
      // 34: athrow
      // 35: aload 0
      // 36: getfield com/finalshell/core/HV.K [C
      // 39: arraylength
      // 3a: bipush 1
      // 3b: iadd
      // 3c: newarray 5
      // 3e: astore 3
      // 3f: aload 2
      // 40: ifnull 4f
      // 43: aload 0
      // 44: getfield com/finalshell/core/HV.K [C
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/HV.b (Ljava/io/IOException;)Ljava/io/IOException;
      // 4d: athrow
      // 4e: astore 3
      // 4f: aload 0
      // 50: aload 3
      // 51: arraylength
      // 52: aload 0
      // 53: getfield com/finalshell/core/HV.t I
      // 56: isub
      // 57: putfield com/finalshell/core/HV.X I
      // 5a: aload 0
      // 5b: getfield com/finalshell/core/HV.K [C
      // 5e: bipush 0
      // 5f: aload 3
      // 60: aload 0
      // 61: getfield com/finalshell/core/HV.X I
      // 64: aload 0
      // 65: getfield com/finalshell/core/HV.t I
      // 68: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 6b: aload 0
      // 6c: aload 3
      // 6d: putfield com/finalshell/core/HV.K [C
      // 70: aload 0
      // 71: dup
      // 72: getfield com/finalshell/core/HV.t I
      // 75: bipush 1
      // 76: iadd
      // 77: putfield com/finalshell/core/HV.t I
      // 7a: aload 0
      // 7b: getfield com/finalshell/core/HV.K [C
      // 7e: aload 0
      // 7f: dup
      // 80: getfield com/finalshell/core/HV.X I
      // 83: bipush 1
      // 84: isub
      // 85: dup_x1
      // 86: putfield com/finalshell/core/HV.X I
      // 89: iload 1
      // 8a: castore
      // 8b: return
   }

   @Override
   public String a(int var1) throws IOException {
      String var2 = Sd2.E(var1, this.K, this.X, this.t, this);
      this.X = this.X + var2.length();
      this.t = this.t - var2.length();
      return var2;
   }

   @Override
   public void h(char[] var1, int var2) throws com.finalshell.io.P {
      String var10000 = Dx4.g();
      int var4 = var2 - 1;
      String var3 = var10000;

      while (var4 >= 0) {
         this.s(var1[var4]);
         var4--;
         if (var3 != null) {
            break;
         }
      }
   }

   @Override
   public boolean w() {
      String var1 = Dx4.g();
      int var10000 = this.t;
      if (var1 == null) {
         var10000 = this.t == 0 ? 1 : 0;
      }

      return var10000 != 0;
   }

   public static IOException b(IOException var0) {
      return var0;
   }
}





