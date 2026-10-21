package com.finalshell.core;

public class RE3 {
   public byte[] Q;
   public int V;
   public static long[] a;
   public static Integer[] b;

   public RE3() {
      this.Q = new byte[a(12121, 5268468176220594306L)];
   }

   public RE3(int var1) {
      this.Q = new byte[var1];
   }

   public RE3 c(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XB.X ()[I
      // 03: aload 0
      // 04: getfield com/finalshell/core/RE3.V I
      // 07: istore 3
      // 08: astore 2
      // 09: aload 2
      // 0a: ifnonnull 3b
      // 0d: iload 3
      // 0e: bipush 1
      // 0f: iadd
      // 10: aload 0
      // 11: getfield com/finalshell/core/RE3.Q [B
      // 14: arraylength
      // 15: if_icmple 2b
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1e: athrow
      // 1f: aload 0
      // 20: bipush 1
      // 21: invokespecial com/finalshell/core/RE3.O (I)V
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/core/RE3.Q [B
      // 2f: iload 3
      // 30: iinc 3 1
      // 33: iload 1
      // 34: i2b
      // 35: bastore
      // 36: aload 0
      // 37: iload 3
      // 38: putfield com/finalshell/core/RE3.V I
      // 3b: aload 0
      // 3c: areturn
   }

   public RE3 W(int var1, int var2) {
      int var3 = this.V;

      try {
         if (var3 + 2 > this.Q.length) {
            this.O(2);
         }
      } catch (UnsupportedOperationException var5) {
         throw a(var5);
      }

      byte[] var4 = this.Q;
      var4[var3++] = (byte)var1;
      var4[var3++] = (byte)var2;
      this.V = var3;
      return this;
   }

   public RE3 G(int var1) {
      int var2 = this.V;

      try {
         if (var2 + 2 > this.Q.length) {
            this.O(2);
         }
      } catch (UnsupportedOperationException var4) {
         throw a(var4);
      }

      byte[] var3 = this.Q;
      var3[var2++] = (byte)(var1 >>> a(25699, 7937009476032654265L));
      var3[var2++] = (byte)var1;
      this.V = var2;
      return this;
   }

   public RE3 d(int var1, int var2) {
      int var3 = this.V;

      try {
         if (var3 + 3 > this.Q.length) {
            this.O(3);
         }
      } catch (UnsupportedOperationException var5) {
         throw a(var5);
      }

      byte[] var4 = this.Q;
      var4[var3++] = (byte)var1;
      var4[var3++] = (byte)(var2 >>> a(25699, 7937009476032654265L));
      var4[var3++] = (byte)var2;
      this.V = var3;
      return this;
   }

   public RE3 z(int var1) {
      int var2 = this.V;

      try {
         if (var2 + 4 > this.Q.length) {
            this.O(4);
         }
      } catch (UnsupportedOperationException var4) {
         throw a(var4);
      }

      byte[] var3 = this.Q;
      var3[var2++] = (byte)(var1 >>> a(15852, 1672534334041469491L));
      var3[var2++] = (byte)(var1 >>> a(31170, 9066381730949035550L));
      var3[var2++] = (byte)(var1 >>> a(25699, 7937009476032654265L));
      var3[var2++] = (byte)var1;
      this.V = var2;
      return this;
   }

   public RE3 n(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/XB.X ()[I
      // 003: aload 1
      // 004: invokevirtual java/lang/String.length ()I
      // 007: istore 3
      // 008: astore 2
      // 009: aload 0
      // 00a: getfield com/finalshell/core/RE3.V I
      // 00d: istore 4
      // 00f: iload 4
      // 011: bipush 2
      // 012: iadd
      // 013: iload 3
      // 014: iadd
      // 015: aload 0
      // 016: getfield com/finalshell/core/RE3.Q [B
      // 019: arraylength
      // 01a: if_icmple 02b
      // 01d: aload 0
      // 01e: bipush 2
      // 01f: iload 3
      // 020: iadd
      // 021: invokespecial com/finalshell/core/RE3.O (I)V
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: getfield com/finalshell/core/RE3.Q [B
      // 02f: astore 5
      // 031: aload 5
      // 033: iload 4
      // 035: iinc 4 1
      // 038: iload 3
      // 039: sipush 1977
      // 03c: ldc2_w 7730067642735462500
      // 03f: invokestatic com/finalshell/core/RE3.a (IJ)I
      // 042: iushr
      // 043: i2b
      // 044: bastore
      // 045: aload 5
      // 047: iload 4
      // 049: iinc 4 1
      // 04c: iload 3
      // 04d: i2b
      // 04e: bastore
      // 04f: bipush 0
      // 050: istore 6
      // 052: iload 6
      // 054: iload 3
      // 055: if_icmpge 0fa
      // 058: aload 1
      // 059: iload 6
      // 05b: invokevirtual java/lang/String.charAt (I)C
      // 05e: istore 7
      // 060: aload 2
      // 061: ifnonnull 100
      // 064: iload 7
      // 066: bipush 1
      // 067: aload 2
      // 068: ifnonnull 0ae
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 071: athrow
      // 072: if_icmplt 09c
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 07b: athrow
      // 07c: iload 7
      // 07e: sipush 7810
      // 081: ldc2_w 4324873847841558874
      // 084: invokestatic com/finalshell/core/RE3.a (IJ)I
      // 087: aload 2
      // 088: ifnonnull 0ae
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 091: athrow
      // 092: if_icmple 0d1
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 09b: athrow
      // 09c: iload 7
      // 09e: sipush 24218
      // 0a1: ldc2_w 1120974718376530244
      // 0a4: invokestatic com/finalshell/core/RE3.a (IJ)I
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0ad: athrow
      // 0ae: aload 2
      // 0af: ifnonnull 0ce
      // 0b2: if_icmplt 0e7
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0bb: athrow
      // 0bc: iload 7
      // 0be: sipush 18605
      // 0c1: ldc2_w 7376052056962778996
      // 0c4: invokestatic com/finalshell/core/RE3.a (IJ)I
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0cd: athrow
      // 0ce: if_icmpgt 0e7
      // 0d1: aload 5
      // 0d3: iload 4
      // 0d5: iinc 4 1
      // 0d8: iload 7
      // 0da: i2b
      // 0db: bastore
      // 0dc: aload 2
      // 0dd: ifnull 0f3
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0e6: athrow
      // 0e7: new java/lang/UnsupportedOperationException
      // 0ea: dup
      // 0eb: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 0ee: athrow
      // 0ef: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0f2: athrow
      // 0f3: iinc 6 1
      // 0f6: aload 2
      // 0f7: ifnull 052
      // 0fa: aload 0
      // 0fb: iload 4
      // 0fd: putfield com/finalshell/core/RE3.V I
      // 100: aload 0
      // 101: areturn
   }

   public RE3 t(byte[] param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XB.X ()[I
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnonnull 27
      // 0b: getfield com/finalshell/core/RE3.V I
      // 0e: iload 3
      // 0f: iadd
      // 10: aload 0
      // 11: getfield com/finalshell/core/RE3.Q [B
      // 14: arraylength
      // 15: if_icmple 2b
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 26: athrow
      // 27: iload 3
      // 28: invokespecial com/finalshell/core/RE3.O (I)V
      // 2b: aload 1
      // 2c: aload 4
      // 2e: ifnonnull 3c
      // 31: ifnull 49
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 3a: athrow
      // 3b: aload 1
      // 3c: iload 2
      // 3d: aload 0
      // 3e: getfield com/finalshell/core/RE3.Q [B
      // 41: aload 0
      // 42: getfield com/finalshell/core/RE3.V I
      // 45: iload 3
      // 46: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 49: aload 0
      // 4a: dup
      // 4b: getfield com/finalshell/core/RE3.V I
      // 4e: iload 3
      // 4f: iadd
      // 50: putfield com/finalshell/core/RE3.V I
      // 53: aload 0
      // 54: areturn
   }

   public void O(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XB.X ()[I
      // 03: bipush 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/RE3.Q [B
      // 08: arraylength
      // 09: imul
      // 0a: istore 3
      // 0b: aload 0
      // 0c: getfield com/finalshell/core/RE3.V I
      // 0f: iload 1
      // 10: iadd
      // 11: istore 4
      // 13: astore 2
      // 14: iload 3
      // 15: aload 2
      // 16: ifnonnull 2d
      // 19: iload 4
      // 1b: if_icmple 30
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 24: athrow
      // 25: iload 3
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/RE3.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2c: athrow
      // 2d: goto 32
      // 30: iload 4
      // 32: newarray 8
      // 34: astore 5
      // 36: aload 0
      // 37: getfield com/finalshell/core/RE3.Q [B
      // 3a: bipush 0
      // 3b: aload 5
      // 3d: bipush 0
      // 3e: aload 0
      // 3f: getfield com/finalshell/core/RE3.V I
      // 42: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 45: aload 0
      // 46: aload 5
      // 48: putfield com/finalshell/core/RE3.Q [B
      // 4b: return
   }

   public static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4057;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6693200976260358911L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "e¹\u00886dE:t\u0082¶*ýÞ²óÚr\u0091²gâ_Â=fÌ¬\f\u0095\u009e\tNº\u0087±EÖ¶ê\u0093\u001a\u001c[Áo\u0005\u0014ñ";
      int var5 = "e¹\u00886dE:t\u0082¶*ýÞ²óÚr\u0091²gâ_Â=fÌ¬\f\u0095\u009e\tNº\u0087±EÖ¶ê\u0093\u001a\u001c[Áo\u0005\u0014ñ".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "í±\u008aÂïdPÔ1öyµ[M}»";
                  var5 = "í±\u008aÂïdPÔ1öyµ[M}»".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





