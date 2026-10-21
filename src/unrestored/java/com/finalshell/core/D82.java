package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;

public class D82 implements Ak2 {
   public static D82 v;
   public static long[] a;
   public static Integer[] b;

   @Override
   public void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 1
      // 004: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 007: astore 7
      // 009: astore 6
      // 00b: aload 6
      // 00d: ifnull 02a
      // 010: aload 2
      // 011: ifnonnull 02b
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/D82.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01a: athrow
      // 01b: aload 7
      // 01d: getstatic com/finalshell/ui/model/EP.WriteNullListAsEmpty Lcom/finalshell/ui/model/EP;
      // 020: invokevirtual com/finalshell/io/YM3.x (Lcom/finalshell/ui/model/EP;)V
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/D82.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 029: athrow
      // 02a: return
      // 02b: aconst_null
      // 02c: astore 8
      // 02e: aload 7
      // 030: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 033: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 036: aload 6
      // 038: ifnull 05d
      // 03b: ifeq 072
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/D82.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 044: athrow
      // 045: aload 4
      // 047: aload 6
      // 049: ifnull 062
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/D82.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 052: athrow
      // 053: instanceof java/lang/reflect/ParameterizedType
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/D82.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05c: athrow
      // 05d: ifeq 072
      // 060: aload 4
      // 062: checkcast java/lang/reflect/ParameterizedType
      // 065: astore 9
      // 067: aload 9
      // 069: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 06e: bipush 0
      // 06f: aaload
      // 070: astore 8
      // 072: aload 2
      // 073: checkcast java/util/Enumeration
      // 076: astore 9
      // 078: aload 1
      // 079: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 07c: astore 10
      // 07e: aload 1
      // 07f: aload 10
      // 081: aload 2
      // 082: aload 3
      // 083: bipush 0
      // 084: invokevirtual com/finalshell/core/NL3.N (Lcom/finalshell/core/Uh2_2;Ljava/lang/Object;Ljava/lang/Object;I)V
      // 087: bipush 0
      // 088: istore 11
      // 08a: aload 7
      // 08c: sipush 8884
      // 08f: ldc2_w 861100755141418962
      // 092: invokestatic com/finalshell/core/D82.a (IJ)I
      // 095: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 098: pop
      // 099: aload 9
      // 09b: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 0a0: ifeq 110
      // 0a3: aload 9
      // 0a5: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 0aa: astore 12
      // 0ac: aload 6
      // 0ae: ifnull 125
      // 0b1: iload 11
      // 0b3: iinc 11 1
      // 0b6: ifeq 0d6
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/D82.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0bf: athrow
      // 0c0: aload 7
      // 0c2: sipush 18938
      // 0c5: ldc2_w 7062378330414396575
      // 0c8: invokestatic com/finalshell/core/D82.a (IJ)I
      // 0cb: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 0ce: pop
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/D82.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d5: athrow
      // 0d6: aload 12
      // 0d8: ifnonnull 0ec
      // 0db: aload 7
      // 0dd: invokevirtual com/finalshell/io/YM3.Y ()V
      // 0e0: aload 6
      // 0e2: ifnonnull 099
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/core/D82.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0eb: athrow
      // 0ec: aload 1
      // 0ed: aload 12
      // 0ef: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0f2: invokevirtual com/finalshell/core/NL3.E (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 0f5: astore 13
      // 0f7: aload 13
      // 0f9: aload 1
      // 0fa: aload 12
      // 0fc: iload 11
      // 0fe: bipush 1
      // 0ff: isub
      // 100: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 103: aload 8
      // 105: bipush 0
      // 106: invokeinterface com/finalshell/core/Ak2.u (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 10b: aload 6
      // 10d: ifnonnull 099
      // 110: aload 7
      // 112: sipush 25747
      // 115: ldc2_w 7995816361652591092
      // 118: invokestatic com/finalshell/core/D82.a (IJ)I
      // 11b: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 11e: pop
      // 11f: aload 1
      // 120: aload 10
      // 122: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 125: goto 133
      // 128: astore 14
      // 12a: aload 1
      // 12b: aload 10
      // 12d: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 130: aload 14
      // 132: athrow
      // 133: return
   }

   static {
      __vfClinit__();
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32103;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3877611751213112810L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "æÁáPÚ\u007f\u0004CöÕY£ÍöBcº\u000e\u001e¡º4)Y";
      int var5 = "æÁáPÚ\u007f\u0004CöÕY£ÍöBcº\u000e\u001e¡º4)Y".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
      b = new Integer[3];
      v = new D82();
   }
}





