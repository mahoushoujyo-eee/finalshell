package com.finalshell.task;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import java.io.InputStream;
import java.io.PipedOutputStream;

public class Yc4 implements Runnable {
   public final InputStream B;
   public final int d;
   public final PipedOutputStream m;
   public static long a;
   public static long b;

   public Yc4(InputStream var1, int var2, PipedOutputStream var3) {
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
      // 000: invokestatic com/finalshell/ui/model/BS.t ()I
      // 003: getstatic com/finalshell/task/Yc4.a J
      // 006: l2i
      // 007: newarray 8
      // 009: astore 2
      // 00a: bipush 0
      // 00b: istore 3
      // 00c: istore 1
      // 00d: aload 0
      // 00e: ldc2_w 415992568410420650
      // 011: astore 13
      // 013: ldc2_w 415992568410420650
      // 016: aload 13
      // 018: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01b: checkcast java/io/InputStream
      // 01e: aload 2
      // 01f: invokevirtual java/io/InputStream.read ([B)I
      // 022: dup
      // 023: istore 3
      // 024: ifle 0c8
      // 027: getstatic com/finalshell/task/Yc4.b J
      // 02a: iload 3
      // 02b: i2l
      // 02c: lmul
      // 02d: aload 0
      // 02e: ldc2_w 225994406241860463
      // 031: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 034: swap
      // 035: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 038: i2l
      // 039: ldiv
      // 03a: lstore 4
      // 03c: invokestatic java/lang/System.currentTimeMillis ()J
      // 03f: lstore 6
      // 041: aload 0
      // 042: ldc2_w 185361316948286860
      // 045: astore 15
      // 047: ldc2_w 185361316948286860
      // 04a: aload 15
      // 04c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04f: checkcast java/io/PipedOutputStream
      // 052: aload 2
      // 053: bipush 0
      // 054: iload 3
      // 055: invokevirtual java/io/PipedOutputStream.write ([BII)V
      // 058: aload 0
      // 059: ldc2_w 185361316948286860
      // 05c: astore 17
      // 05e: ldc2_w 185361316948286860
      // 061: aload 17
      // 063: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 066: checkcast java/io/PipedOutputStream
      // 069: invokevirtual java/io/PipedOutputStream.flush ()V
      // 06c: invokestatic java/lang/System.currentTimeMillis ()J
      // 06f: lload 6
      // 071: lsub
      // 072: lstore 8
      // 074: aload 0
      // 075: iload 1
      // 076: ifne 0c9
      // 079: ldc2_w 225994406241860463
      // 07c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 07f: swap
      // 080: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 083: iload 1
      // 084: ifne 0af
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 08d: athrow
      // 08e: ifle 0c4
      // 091: goto 098
      // 094: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 097: athrow
      // 098: lload 8
      // 09a: lload 4
      // 09c: iload 1
      // 09d: ifne 0b6
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a6: athrow
      // 0a7: lcmp
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ae: athrow
      // 0af: ifge 0c4
      // 0b2: lload 4
      // 0b4: lload 8
      // 0b6: lsub
      // 0b7: invokestatic java/lang/Thread.sleep (J)V
      // 0ba: goto 0c4
      // 0bd: astore 10
      // 0bf: aload 10
      // 0c1: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 0c4: iload 1
      // 0c5: ifeq 00d
      // 0c8: aload 0
      // 0c9: iload 1
      // 0ca: ifne 10a
      // 0cd: ldc2_w 415992568410420650
      // 0d0: astore 19
      // 0d2: ldc2_w 415992568410420650
      // 0d5: aload 19
      // 0d7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0da: checkcast java/io/InputStream
      // 0dd: ifnull 109
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: ldc2_w 415992568410420650
      // 0eb: astore 21
      // 0ed: ldc2_w 415992568410420650
      // 0f0: aload 21
      // 0f2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f5: checkcast java/io/InputStream
      // 0f8: invokevirtual java/io/InputStream.close ()V
      // 0fb: goto 109
      // 0fe: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 101: athrow
      // 102: astore 4
      // 104: aload 4
      // 106: invokevirtual java/io/IOException.printStackTrace ()V
      // 109: aload 0
      // 10a: ldc2_w 185361316948286860
      // 10d: astore 23
      // 10f: ldc2_w 185361316948286860
      // 112: aload 23
      // 114: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 117: checkcast java/io/PipedOutputStream
      // 11a: iload 1
      // 11b: ifne 139
      // 11e: ifnull 24f
      // 121: goto 128
      // 124: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 127: athrow
      // 128: aload 0
      // 129: ldc2_w 185361316948286860
      // 12c: astore 25
      // 12e: ldc2_w 185361316948286860
      // 131: aload 25
      // 133: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 136: checkcast java/io/PipedOutputStream
      // 139: invokevirtual java/io/PipedOutputStream.close ()V
      // 13c: goto 24f
      // 13f: astore 4
      // 141: aload 4
      // 143: invokevirtual java/io/IOException.printStackTrace ()V
      // 146: goto 24f
      // 149: astore 4
      // 14b: aload 0
      // 14c: iload 1
      // 14d: ifne 18d
      // 150: ldc2_w 415992568410420650
      // 153: astore 27
      // 155: ldc2_w 415992568410420650
      // 158: aload 27
      // 15a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 15d: checkcast java/io/InputStream
      // 160: ifnull 18c
      // 163: goto 16a
      // 166: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 169: athrow
      // 16a: aload 0
      // 16b: ldc2_w 415992568410420650
      // 16e: astore 29
      // 170: ldc2_w 415992568410420650
      // 173: aload 29
      // 175: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 178: checkcast java/io/InputStream
      // 17b: invokevirtual java/io/InputStream.close ()V
      // 17e: goto 18c
      // 181: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 184: athrow
      // 185: astore 4
      // 187: aload 4
      // 189: invokevirtual java/io/IOException.printStackTrace ()V
      // 18c: aload 0
      // 18d: ldc2_w 185361316948286860
      // 190: astore 31
      // 192: ldc2_w 185361316948286860
      // 195: aload 31
      // 197: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 19a: checkcast java/io/PipedOutputStream
      // 19d: iload 1
      // 19e: ifne 1bc
      // 1a1: ifnull 24f
      // 1a4: goto 1ab
      // 1a7: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: ldc2_w 185361316948286860
      // 1af: astore 33
      // 1b1: ldc2_w 185361316948286860
      // 1b4: aload 33
      // 1b6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b9: checkcast java/io/PipedOutputStream
      // 1bc: invokevirtual java/io/PipedOutputStream.close ()V
      // 1bf: goto 24f
      // 1c2: astore 4
      // 1c4: aload 4
      // 1c6: invokevirtual java/io/IOException.printStackTrace ()V
      // 1c9: goto 24f
      // 1cc: astore 11
      // 1ce: aload 0
      // 1cf: iload 1
      // 1d0: ifne 210
      // 1d3: ldc2_w 415992568410420650
      // 1d6: astore 35
      // 1d8: ldc2_w 415992568410420650
      // 1db: aload 35
      // 1dd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1e0: checkcast java/io/InputStream
      // 1e3: ifnull 20f
      // 1e6: goto 1ed
      // 1e9: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: ldc2_w 415992568410420650
      // 1f1: astore 37
      // 1f3: ldc2_w 415992568410420650
      // 1f6: aload 37
      // 1f8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1fb: checkcast java/io/InputStream
      // 1fe: invokevirtual java/io/InputStream.close ()V
      // 201: goto 20f
      // 204: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 207: athrow
      // 208: astore 12
      // 20a: aload 12
      // 20c: invokevirtual java/io/IOException.printStackTrace ()V
      // 20f: aload 0
      // 210: ldc2_w 185361316948286860
      // 213: astore 39
      // 215: ldc2_w 185361316948286860
      // 218: aload 39
      // 21a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 21d: checkcast java/io/PipedOutputStream
      // 220: iload 1
      // 221: ifne 23f
      // 224: ifnull 24c
      // 227: goto 22e
      // 22a: invokestatic com/finalshell/task/Yc4.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 22d: athrow
      // 22e: aload 0
      // 22f: ldc2_w 185361316948286860
      // 232: astore 41
      // 234: ldc2_w 185361316948286860
      // 237: aload 41
      // 239: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 23c: checkcast java/io/PipedOutputStream
      // 23f: invokevirtual java/io/PipedOutputStream.close ()V
      // 242: goto 24c
      // 245: astore 12
      // 247: aload 12
      // 249: invokevirtual java/io/IOException.printStackTrace ()V
      // 24c: aload 11
      // 24e: athrow
      // 24f: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
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





