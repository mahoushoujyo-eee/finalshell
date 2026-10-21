import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class f2_2 implements Runnable {
   int I;
   final or_4 T;
   private final byte[] S;
   private final DataOutputStream L;
   private final int G;
   private final DataInputStream j;

   f2_2(or_4 var1, byte[] var2, DataOutputStream var3, int var4, DataInputStream var5) {
      this.T = var1;
      this.S = var2;
      this.L = var3;
      this.G = var4;
      this.j = var5;
      this.I = 0;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Qm_2.J ()[Lcom/ky_4;
      // 03: aload 0
      // 04: getfield f2_2.T Lor_4;
      // 07: getfield or_4.c I
      // 0a: newarray 8
      // 0c: astore 2
      // 0d: astore 1
      // 0e: bipush 0
      // 0f: istore 3
      // 10: aload 0
      // 11: aload 1
      // 12: ifnull 23
      // 15: getfield f2_2.S [B
      // 18: ifnull 44
      // 1b: goto 22
      // 1e: invokestatic f2_2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21: athrow
      // 22: aload 0
      // 23: getfield f2_2.L Ljava/io/DataOutputStream;
      // 26: aload 0
      // 27: getfield f2_2.S [B
      // 2a: bipush 0
      // 2b: aload 0
      // 2c: getfield f2_2.G I
      // 2f: invokevirtual java/io/DataOutputStream.write ([BII)V
      // 32: goto 44
      // 35: astore 4
      // 37: aload 4
      // 39: invokevirtual java/io/IOException.printStackTrace ()V
      // 3c: aload 0
      // 3d: getfield f2_2.T Lor_4;
      // 40: invokevirtual or_4.G ()V
      // 43: return
      // 44: bipush 0
      // 45: istore 4
      // 47: aload 1
      // 48: ifnonnull 5e
      // 4b: aload 0
      // 4c: getfield f2_2.L Ljava/io/DataOutputStream;
      // 4f: aload 2
      // 50: bipush 0
      // 51: iload 3
      // 52: invokevirtual java/io/DataOutputStream.write ([BII)V
      // 55: goto 5e
      // 58: astore 5
      // 5a: aload 1
      // 5b: ifnonnull 83
      // 5e: aload 0
      // 5f: getfield f2_2.j Ljava/io/DataInputStream;
      // 62: aload 2
      // 63: invokevirtual java/io/DataInputStream.read ([B)I
      // 66: dup
      // 67: istore 3
      // 68: ifgt 4b
      // 6b: aload 1
      // 6c: ifnull 55
      // 6f: goto 83
      // 72: astore 5
      // 74: goto 83
      // 77: astore 6
      // 79: aload 0
      // 7a: getfield f2_2.T Lor_4;
      // 7d: invokevirtual or_4.G ()V
      // 80: aload 6
      // 82: athrow
      // 83: aload 0
      // 84: getfield f2_2.T Lor_4;
      // 87: invokevirtual or_4.G ()V
      // 8a: return
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





