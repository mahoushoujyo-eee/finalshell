package com.finalshell.core;

import java.io.IOException;
import java.net.Socket;

public class ZT_2 implements Xz2 {
   String Z;
   String u;
   byte[] l;

   public ZT_2(String var1, String var2) {
      this.Z = var1;
      this.u = var2;
      this.V();
   }

   public String h() {
      return this.Z;
   }

   public String P() {
      return this.u;
   }

   @Override
   public Object[] J(int param1, Socket param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 03: astore 3
      // 04: iload 1
      // 05: bipush 2
      // 06: if_icmpeq 0f
      // 09: aconst_null
      // 0a: areturn
      // 0b: invokestatic com/finalshell/core/ZT_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e: athrow
      // 0f: aload 2
      // 10: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 13: astore 4
      // 15: aload 2
      // 16: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 19: astore 5
      // 1b: aload 5
      // 1d: aload 0
      // 1e: getfield com/finalshell/core/ZT_2.l [B
      // 21: invokevirtual java/io/OutputStream.write ([B)V
      // 24: aload 4
      // 26: invokevirtual java/io/InputStream.read ()I
      // 29: istore 6
      // 2b: iload 6
      // 2d: aload 3
      // 2e: ifnull 46
      // 31: ifge 41
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/ZT_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3a: athrow
      // 3b: aconst_null
      // 3c: areturn
      // 3d: invokestatic com/finalshell/core/ZT_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 40: athrow
      // 41: aload 4
      // 43: invokevirtual java/io/InputStream.read ()I
      // 46: istore 7
      // 48: iload 7
      // 4a: aload 3
      // 4b: ifnull 5f
      // 4e: ifeq 5e
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/ZT_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 57: athrow
      // 58: aconst_null
      // 59: areturn
      // 5a: invokestatic com/finalshell/core/ZT_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5d: athrow
      // 5e: bipush 2
      // 5f: anewarray 4
      // 62: dup
      // 63: bipush 0
      // 64: aload 4
      // 66: aastore
      // 67: dup
      // 68: bipush 1
      // 69: aload 5
      // 6b: aastore
      // 6c: areturn
   }

   public void V() {
      byte[] var1 = this.Z.getBytes();
      byte[] var2 = this.u.getBytes();
      this.l = new byte[3 + var1.length + var2.length];
      this.l[0] = 1;
      this.l[1] = (byte)var1.length;
      System.arraycopy(var1, 0, this.l, 2, var1.length);
      this.l[2 + var1.length] = (byte)var2.length;
      System.arraycopy(var2, 0, this.l, 3 + var1.length, var2.length);
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





