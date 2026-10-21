package com.finalshell.io;

import com.finalshell.core.C_9;
import com.finalshell.core.W_7;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class K2 extends Reader {
   public final Iterator W;
   public Reader m;
   public final Iterable u;
   public static long[] a;
   public static Long[] b;

   public K2(Iterable var1) {
      this.u = var1;
      W_7.v();
      this.W = this.u.iterator();
      this.m = W_7.c;
      if (Ky4.F$arrString() != null) {
         W_7.i("dninhc");
      }
   }

   @Override
   public void close() throws IOException {
      String var10000 = W_7.v();
      Iterator var2 = this.u.iterator();
      String var1 = var10000;

      while (var2.hasNext()) {
         Reader var3 = (Reader)var2.next();
         var3.close();
         if (var1 == null) {
            break;
         }
      }
   }

   @Override
   public int read() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W_7.v ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/io/K2.m Ljava/io/Reader;
      // 08: invokevirtual java/io/Reader.read ()I
      // 0b: istore 2
      // 0c: iload 2
      // 0d: bipush -1
      // 0e: if_icmpeq 22
      // 11: iload 2
      // 12: aload 1
      // 13: ifnull 36
      // 16: goto 1d
      // 19: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c: athrow
      // 1d: ireturn
      // 1e: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21: athrow
      // 22: aload 0
      // 23: aload 1
      // 24: ifnull 40
      // 27: getfield com/finalshell/io/K2.W Ljava/util/Iterator;
      // 2a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2f: goto 36
      // 32: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 35: athrow
      // 36: ifne 3f
      // 39: bipush -1
      // 3a: ireturn
      // 3b: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3e: athrow
      // 3f: aload 0
      // 40: aload 0
      // 41: getfield com/finalshell/io/K2.W Ljava/util/Iterator;
      // 44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 49: checkcast java/io/Reader
      // 4c: putfield com/finalshell/io/K2.m Ljava/io/Reader;
      // 4f: goto 04
   }

   @Override
   public long skip(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W_7.v ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: getfield com/finalshell/io/K2.m Ljava/io/Reader;
      // 08: lload 1
      // 09: invokevirtual java/io/Reader.skip (J)J
      // 0c: lstore 4
      // 0e: lload 4
      // 10: sipush 32332
      // 13: ldc2_w 1496831238319552163
      // 16: invokestatic com/finalshell/io/K2.a (IJ)J
      // 19: lcmp
      // 1a: ifeq 2f
      // 1d: lload 4
      // 1f: aload 3
      // 20: ifnull 4e
      // 23: goto 2a
      // 26: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 29: athrow
      // 2a: lreturn
      // 2b: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 3
      // 31: ifnull 50
      // 34: getfield com/finalshell/io/K2.W Ljava/util/Iterator;
      // 37: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c: ifne 4f
      // 3f: goto 46
      // 42: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 45: athrow
      // 46: lconst_0
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4d: athrow
      // 4e: lreturn
      // 4f: aload 0
      // 50: aload 0
      // 51: getfield com/finalshell/io/K2.W Ljava/util/Iterator;
      // 54: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 59: checkcast java/io/Reader
      // 5c: putfield com/finalshell/io/K2.m Ljava/io/Reader;
      // 5f: goto 04
   }

   @Override
   public int read(@C_9 char[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/W_7.v ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 0
      // 06: getfield com/finalshell/io/K2.m Ljava/io/Reader;
      // 09: aload 1
      // 0a: iload 2
      // 0b: iload 3
      // 0c: invokevirtual java/io/Reader.read ([CII)I
      // 0f: istore 5
      // 11: iload 5
      // 13: i2l
      // 14: sipush 21786
      // 17: ldc2_w 8359636198903094772
      // 1a: invokestatic com/finalshell/io/K2.a (IJ)J
      // 1d: lcmp
      // 1e: ifeq 34
      // 21: iload 5
      // 23: aload 4
      // 25: ifnull 49
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2e: athrow
      // 2f: ireturn
      // 30: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 33: athrow
      // 34: aload 0
      // 35: aload 4
      // 37: ifnull 53
      // 3a: getfield com/finalshell/io/K2.W Ljava/util/Iterator;
      // 3d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 42: goto 49
      // 45: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 48: athrow
      // 49: ifne 52
      // 4c: bipush -1
      // 4d: ireturn
      // 4e: invokestatic com/finalshell/io/K2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 51: athrow
      // 52: aload 0
      // 53: aload 0
      // 54: getfield com/finalshell/io/K2.W Ljava/util/Iterator;
      // 57: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5c: checkcast java/io/Reader
      // 5f: putfield com/finalshell/io/K2.m Ljava/io/Reader;
      // 62: goto 05
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18671) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8780395618586326185L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0092à\u0014 >z½õò& `qÙ\u0096¢";
      int var5 = "\u0092à\u0014 >z½õò& `qÙ\u0096¢".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Long[2];
   }
}





