import java.io.IOException;
import java.net.Socket;

public class a1 implements xz_2 {
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
      // 00: invokestatic Jk_2.Y ()[Ljava/lang/String;
      // 03: astore 3
      // 04: iload 1
      // 05: aload 3
      // 06: ifnull 1a
      // 09: ifeq 19
      // 0c: goto 13
      // 0f: invokestatic a1.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic a1.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 18: athrow
      // 19: bipush 2
      // 1a: anewarray 4
      // 1d: dup
      // 1e: bipush 0
      // 1f: aload 2
      // 20: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 23: aastore
      // 24: dup
      // 25: bipush 1
      // 26: aload 2
      // 27: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 2a: aastore
      // 2b: areturn
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





