package com.finalshell.core;

import java.util.ArrayList;

public class Nz4 implements A0_2 {
   public final String[] Y;
   public final long[] u;
   public static long[] a;
   public static Integer[] b;

   public Nz4(String[] var1) {
   super();
      String var10000 = Hi2.C();
      this.Y = var1;
      String var2 = var10000;
      this.u = new long[var1.length];
      int var3 = 0;

      while (var3 < this.u.length) {
         this.u[var3] = B8_2.z$long(var1[var3]);
         var3++;
         if (var2 != null) {
            break;
         }
      }
   }

   @Override
   public Object Y(Ph4 var1, Object var2, Object var3) {
      ArrayList var9;
      ArrayList var5 = new ArrayList(this.Y.length);
      String var10000 = Hi2.C();
      int var6 = 0;
      String var4 = var10000;

      while (true) {
         if (var6 < this.Y.length) {
            Object var7 = var1.S(var3, this.Y[var6], this.u[var6]);

            try {
               var9 = var5;
               if (var4 != null) {
                  break;
               }

               var5.add(var7);
               var6++;
               if (var4 == null) {
                  continue;
               }
            } catch (Hi2 var8) {
               throw a(var8);
            }
         }

         var9 = var5;
         break;
      }

      return var9;
   }

   @Override
   public void Z(Ph4 param1, Yn4 param2, KE param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 2
      // 004: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 007: checkcast com/finalshell/core/U9
      // 00a: astore 5
      // 00c: astore 4
      // 00e: aload 3
      // 00f: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 012: aload 4
      // 014: ifnonnull 03f
      // 017: ifnonnull 034
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/Nz4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 020: athrow
      // 021: aload 3
      // 022: new com/finalshell/ui/model/Oc2
      // 025: dup
      // 026: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 029: dup
      // 02a: astore 6
      // 02c: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 02f: aload 4
      // 031: ifnull 044
      // 034: aload 3
      // 035: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/core/Nz4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 03e: athrow
      // 03f: checkcast com/finalshell/ui/model/Oc2
      // 042: astore 6
      // 044: aload 6
      // 046: invokevirtual com/finalshell/ui/model/Oc2.size ()I
      // 049: istore 7
      // 04b: iload 7
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/Nz4.u [J
      // 051: arraylength
      // 052: if_icmpge 070
      // 055: aload 6
      // 057: aconst_null
      // 058: invokevirtual com/finalshell/ui/model/Oc2.add (Ljava/lang/Object;)Z
      // 05b: pop
      // 05c: iinc 7 1
      // 05f: aload 4
      // 061: ifnonnull 07b
      // 064: aload 4
      // 066: ifnull 04b
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/Nz4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 06f: athrow
      // 070: aload 5
      // 072: aload 0
      // 073: getfield com/finalshell/core/Nz4.u [J
      // 076: invokevirtual com/finalshell/core/U9.R ([J)I
      // 079: istore 7
      // 07b: aload 5
      // 07d: getfield com/finalshell/core/U9.z I
      // 080: istore 8
      // 082: iload 8
      // 084: bipush 3
      // 085: if_icmpne 13d
      // 088: aload 5
      // 08a: aload 4
      // 08c: ifnonnull 111
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/Nz4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 095: athrow
      // 096: invokevirtual com/finalshell/core/U9.P ()I
      // 099: tableswitch 109 2 4 31 57 83
      // 0b4: invokestatic com/finalshell/core/Nz4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0b7: athrow
      // 0b8: aload 5
      // 0ba: invokevirtual com/finalshell/core/U9.j ()Ljava/lang/Number;
      // 0bd: astore 9
      // 0bf: aload 5
      // 0c1: sipush 1314
      // 0c4: ldc2_w 124352893058811678
      // 0c7: invokestatic com/finalshell/core/Nz4.a (IJ)I
      // 0ca: invokevirtual com/finalshell/core/U9.S (I)V
      // 0cd: aload 4
      // 0cf: ifnull 113
      // 0d2: aload 5
      // 0d4: invokevirtual com/finalshell/core/U9.c$BigDecimal ()Ljava/math/BigDecimal;
      // 0d7: astore 9
      // 0d9: aload 5
      // 0db: sipush 20960
      // 0de: ldc2_w 7166032654526895069
      // 0e1: invokestatic com/finalshell/core/Nz4.a (IJ)I
      // 0e4: invokevirtual com/finalshell/core/U9.S (I)V
      // 0e7: aload 4
      // 0e9: ifnull 113
      // 0ec: aload 5
      // 0ee: invokevirtual com/finalshell/core/U9.z ()Ljava/lang/String;
      // 0f1: astore 9
      // 0f3: aload 5
      // 0f5: sipush 20960
      // 0f8: ldc2_w 7166032654526895069
      // 0fb: invokestatic com/finalshell/core/Nz4.a (IJ)I
      // 0fe: invokevirtual com/finalshell/core/U9.S (I)V
      // 101: aload 4
      // 103: ifnull 113
      // 106: aload 2
      // 107: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/Nz4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 110: athrow
      // 111: astore 9
      // 113: aload 6
      // 115: iload 7
      // 117: aload 9
      // 119: invokevirtual com/finalshell/ui/model/Oc2.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 11c: pop
      // 11d: aload 5
      // 11f: invokevirtual com/finalshell/core/U9.P ()I
      // 122: sipush 20960
      // 125: ldc2_w 7166032654526895069
      // 128: invokestatic com/finalshell/core/Nz4.a (IJ)I
      // 12b: if_icmpne 13a
      // 12e: aload 4
      // 130: ifnull 070
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/Nz4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 139: athrow
      // 13a: goto 13d
      // 13d: return
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 573;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6358231305111882396L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "¯á\u009aà!\u001a\u0099Q\u0016?2\u008defM\u0092";
      int var5 = "¯á\u009aà!\u001a\u0099Q\u0016?2\u008defM\u0092".length();
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
      b = new Integer[2];
   }
}





