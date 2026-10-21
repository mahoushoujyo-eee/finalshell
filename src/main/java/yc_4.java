import java.io.InputStream;
import java.io.PipedOutputStream;

class yc_4 implements Runnable {
   final InputStream B;
   final int d;
   final PipedOutputStream m;
   private static final long a;
   private static final long b;

   yc_4(InputStream var1, int var2, PipedOutputStream var3) {
      this.B = var1;
      this.d = var2;
      this.m = var3;
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
      // 000: invokestatic BS.t ()I
      // 003: getstatic yc_4.a J
      // 006: l2i
      // 007: newarray 8
      // 009: astore 2
      // 00a: bipush 0
      // 00b: istore 3
      // 00c: istore 1
      // 00d: aload 0
      // 00e: ldc2_w 415992568410420650
      // 011: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 014: swap
      // 015: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 018: checkcast java/io/InputStream
      // 01b: aload 2
      // 01c: invokevirtual java/io/InputStream.read ([B)I
      // 01f: dup
      // 020: istore 3
      // 021: ifle 0bf
      // 024: getstatic yc_4.b J
      // 027: iload 3
      // 028: i2l
      // 029: lmul
      // 02a: aload 0
      // 02b: ldc2_w 225994406241860463
      // 02e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 031: swap
      // 032: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 035: i2l
      // 036: ldiv
      // 037: lstore 4
      // 039: invokestatic java/lang/System.currentTimeMillis ()J
      // 03c: lstore 6
      // 03e: aload 0
      // 03f: ldc2_w 185361316948286860
      // 042: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 045: swap
      // 046: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 049: checkcast java/io/PipedOutputStream
      // 04c: aload 2
      // 04d: bipush 0
      // 04e: iload 3
      // 04f: invokevirtual java/io/PipedOutputStream.write ([BII)V
      // 052: aload 0
      // 053: ldc2_w 185361316948286860
      // 056: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 059: swap
      // 05a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05d: checkcast java/io/PipedOutputStream
      // 060: invokevirtual java/io/PipedOutputStream.flush ()V
      // 063: invokestatic java/lang/System.currentTimeMillis ()J
      // 066: lload 6
      // 068: lsub
      // 069: lstore 8
      // 06b: aload 0
      // 06c: iload 1
      // 06d: ifne 0c0
      // 070: ldc2_w 225994406241860463
      // 073: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 076: swap
      // 077: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 07a: iload 1
      // 07b: ifne 0a6
      // 07e: goto 085
      // 081: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 084: athrow
      // 085: ifle 0bb
      // 088: goto 08f
      // 08b: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 08e: athrow
      // 08f: lload 8
      // 091: lload 4
      // 093: iload 1
      // 094: ifne 0ad
      // 097: goto 09e
      // 09a: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 09d: athrow
      // 09e: lcmp
      // 09f: goto 0a6
      // 0a2: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a5: athrow
      // 0a6: ifge 0bb
      // 0a9: lload 4
      // 0ab: lload 8
      // 0ad: lsub
      // 0ae: invokestatic java/lang/Thread.sleep (J)V
      // 0b1: goto 0bb
      // 0b4: astore 10
      // 0b6: aload 10
      // 0b8: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0bb: iload 1
      // 0bc: ifeq 00d
      // 0bf: aload 0
      // 0c0: iload 1
      // 0c1: ifne 0fb
      // 0c4: ldc2_w 415992568410420650
      // 0c7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ca: swap
      // 0cb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ce: checkcast java/io/InputStream
      // 0d1: ifnull 0fa
      // 0d4: goto 0db
      // 0d7: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: ldc2_w 415992568410420650
      // 0df: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0e2: swap
      // 0e3: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e6: checkcast java/io/InputStream
      // 0e9: invokevirtual java/io/InputStream.close ()V
      // 0ec: goto 0fa
      // 0ef: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0f2: athrow
      // 0f3: astore 4
      // 0f5: aload 4
      // 0f7: invokevirtual java/io/IOException.printStackTrace ()V
      // 0fa: aload 0
      // 0fb: ldc2_w 185361316948286860
      // 0fe: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 101: swap
      // 102: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 105: checkcast java/io/PipedOutputStream
      // 108: iload 1
      // 109: ifne 124
      // 10c: ifnull 222
      // 10f: goto 116
      // 112: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 115: athrow
      // 116: aload 0
      // 117: ldc2_w 185361316948286860
      // 11a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 11d: swap
      // 11e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 121: checkcast java/io/PipedOutputStream
      // 124: invokevirtual java/io/PipedOutputStream.close ()V
      // 127: goto 222
      // 12a: astore 4
      // 12c: aload 4
      // 12e: invokevirtual java/io/IOException.printStackTrace ()V
      // 131: goto 222
      // 134: astore 4
      // 136: aload 0
      // 137: iload 1
      // 138: ifne 172
      // 13b: ldc2_w 415992568410420650
      // 13e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 141: swap
      // 142: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 145: checkcast java/io/InputStream
      // 148: ifnull 171
      // 14b: goto 152
      // 14e: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 151: athrow
      // 152: aload 0
      // 153: ldc2_w 415992568410420650
      // 156: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 159: swap
      // 15a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 15d: checkcast java/io/InputStream
      // 160: invokevirtual java/io/InputStream.close ()V
      // 163: goto 171
      // 166: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 169: athrow
      // 16a: astore 4
      // 16c: aload 4
      // 16e: invokevirtual java/io/IOException.printStackTrace ()V
      // 171: aload 0
      // 172: ldc2_w 185361316948286860
      // 175: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 178: swap
      // 179: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 17c: checkcast java/io/PipedOutputStream
      // 17f: iload 1
      // 180: ifne 19b
      // 183: ifnull 222
      // 186: goto 18d
      // 189: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 18c: athrow
      // 18d: aload 0
      // 18e: ldc2_w 185361316948286860
      // 191: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 194: swap
      // 195: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 198: checkcast java/io/PipedOutputStream
      // 19b: invokevirtual java/io/PipedOutputStream.close ()V
      // 19e: goto 222
      // 1a1: astore 4
      // 1a3: aload 4
      // 1a5: invokevirtual java/io/IOException.printStackTrace ()V
      // 1a8: goto 222
      // 1ab: astore 11
      // 1ad: aload 0
      // 1ae: iload 1
      // 1af: ifne 1e9
      // 1b2: ldc2_w 415992568410420650
      // 1b5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1b8: swap
      // 1b9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1bc: checkcast java/io/InputStream
      // 1bf: ifnull 1e8
      // 1c2: goto 1c9
      // 1c5: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: ldc2_w 415992568410420650
      // 1cd: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1d0: swap
      // 1d1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1d4: checkcast java/io/InputStream
      // 1d7: invokevirtual java/io/InputStream.close ()V
      // 1da: goto 1e8
      // 1dd: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1e0: athrow
      // 1e1: astore 12
      // 1e3: aload 12
      // 1e5: invokevirtual java/io/IOException.printStackTrace ()V
      // 1e8: aload 0
      // 1e9: ldc2_w 185361316948286860
      // 1ec: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1ef: swap
      // 1f0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f3: checkcast java/io/PipedOutputStream
      // 1f6: iload 1
      // 1f7: ifne 212
      // 1fa: ifnull 21f
      // 1fd: goto 204
      // 200: invokestatic yc_4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 203: athrow
      // 204: aload 0
      // 205: ldc2_w 185361316948286860
      // 208: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 20b: swap
      // 20c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 20f: checkcast java/io/PipedOutputStream
      // 212: invokevirtual java/io/PipedOutputStream.close ()V
      // 215: goto 21f
      // 218: astore 12
      // 21a: aload 12
      // 21c: invokevirtual java/io/IOException.printStackTrace ()V
      // 21f: aload 11
      // 221: athrow
      // 222: return
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var2 = 2259873607493926846L;
      long var10002 = -6675999889866506306L ^ var2;
      byte var10001 = -1;
      a = var10002;
      long var0 = 7818634203571841965L;
      var10002 = 7818634203571841093L ^ var0;
      var10001 = -1;
      b = var10002;
   }
}





