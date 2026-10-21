import java.io.IOException;
import java.io.OutputStream;

public class aU extends a2 {
   private OutputStream W;

   public aU(OutputStream var1) {
      this.W = var1;
   }

   public void p(byte var1) throws IOException {
      this.W.write(var1);
   }

   public void I(byte[] var1) throws IOException {
      this.W.write(var1);
      this.W.flush();
   }

   public void C(Ub_2 param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic mp_2.o ()[Ljava/lang/String;
      // 003: aload 1
      // 004: invokevirtual Ub_2.R ()LKy_2;
      // 007: astore 3
      // 008: astore 2
      // 009: aconst_null
      // 00a: astore 4
      // 00c: aload 1
      // 00d: aload 2
      // 00e: ifnull 026
      // 011: instanceof Uw_2
      // 014: ifeq 02e
      // 017: goto 01e
      // 01a: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01d: athrow
      // 01e: aload 1
      // 01f: goto 026
      // 022: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 025: athrow
      // 026: checkcast Uw_2
      // 029: invokevirtual Uw_2.f ()Lyu_4;
      // 02c: astore 4
      // 02e: aload 4
      // 030: ifnull 076
      // 033: bipush 0
      // 034: istore 5
      // 036: iload 5
      // 038: aload 4
      // 03a: invokevirtual yu_4.c ()I
      // 03d: if_icmpge 063
      // 040: aload 0
      // 041: getstatic x9.ZPAD Lx9;
      // 044: invokevirtual x9.r ()B
      // 047: invokevirtual aU.p (B)V
      // 04a: iinc 5 1
      // 04d: aload 2
      // 04e: ifnull 06d
      // 051: aload 2
      // 052: ifnonnull 036
      // 055: goto 05c
      // 058: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05b: athrow
      // 05c: bipush 5
      // 05d: anewarray 79
      // 060: invokestatic com/ky_4.K ([Ljava/lang/String;)V
      // 063: aload 0
      // 064: getstatic x9.ZDLE Lx9;
      // 067: invokevirtual x9.r ()B
      // 06a: invokevirtual aU.p (B)V
      // 06d: aload 0
      // 06e: aload 4
      // 070: invokevirtual yu_4.T ()B
      // 073: invokevirtual aU.p (B)V
      // 076: bipush 0
      // 077: istore 5
      // 079: aload 3
      // 07a: invokeinterface Ky_2.K ()Z 1
      // 07f: ifeq 09e
      // 082: iinc 5 1
      // 085: aload 0
      // 086: aload 3
      // 087: invokeinterface Ky_2.c ()B 1
      // 08c: invokevirtual aU.p (B)V
      // 08f: aload 2
      // 090: ifnull 0e6
      // 093: aload 2
      // 094: ifnonnull 079
      // 097: goto 09e
      // 09a: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09d: athrow
      // 09e: aload 4
      // 0a0: aload 2
      // 0a1: ifnull 0b0
      // 0a4: ifnull 0e6
      // 0a7: goto 0ae
      // 0aa: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ad: athrow
      // 0ae: aload 4
      // 0b0: invokevirtual yu_4.d ()Z
      // 0b3: aload 2
      // 0b4: ifnull 0f5
      // 0b7: ifeq 0e6
      // 0ba: goto 0c1
      // 0bd: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getstatic kD_3.CR LkD_3;
      // 0c5: invokevirtual kD_3.m ()B
      // 0c8: invokevirtual aU.p (B)V
      // 0cb: aload 0
      // 0cc: getstatic kD_3.LF LkD_3;
      // 0cf: invokevirtual kD_3.m ()B
      // 0d2: invokevirtual aU.p (B)V
      // 0d5: aload 0
      // 0d6: getstatic kD_3.XON LkD_3;
      // 0d9: invokevirtual kD_3.m ()B
      // 0dc: invokevirtual aU.p (B)V
      // 0df: goto 0e6
      // 0e2: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e5: athrow
      // 0e6: aload 1
      // 0e7: aload 2
      // 0e8: ifnull 0f9
      // 0eb: instanceof UK
      // 0ee: goto 0f5
      // 0f1: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f4: athrow
      // 0f5: ifeq 116
      // 0f8: aload 1
      // 0f9: checkcast UK
      // 0fc: invokevirtual UK.e ()Lx9;
      // 0ff: getstatic x9.ZCRCW Lx9;
      // 102: if_acmpne 116
      // 105: aload 0
      // 106: getstatic kD_3.XON LkD_3;
      // 109: invokevirtual kD_3.m ()B
      // 10c: invokevirtual aU.p (B)V
      // 10f: goto 116
      // 112: invokestatic aU.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 115: athrow
      // 116: aload 0
      // 117: getfield aU.W Ljava/io/OutputStream;
      // 11a: invokevirtual java/io/OutputStream.flush ()V
      // 11d: return
   }

   @Override
   public void H(Object var1) throws IOException {
      this.C((Ub_2)var1);
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





