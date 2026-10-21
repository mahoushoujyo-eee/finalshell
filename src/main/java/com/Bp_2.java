package com;

import java.lang.reflect.Type;

public class Bp_2 implements X4 {
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   @Override
   public Object z(com.yn_4 var1, Type var2, Object var3) {
      return i(var1);
   }

   public static Object i(com.yn_4 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/yn_4.N Lcom/P7;
      // 007: astore 2
      // 008: astore 1
      // 009: aload 2
      // 00a: invokeinterface com/P7.P ()I 1
      // 00f: bipush 4
      // 010: aload 1
      // 011: ifnull 04b
      // 014: if_icmpne 039
      // 017: goto 01e
      // 01a: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 01d: athrow
      // 01e: aload 2
      // 01f: invokeinterface com/P7.z ()Ljava/lang/String; 1
      // 024: astore 3
      // 025: aload 2
      // 026: sipush 1757
      // 029: ldc2_w 8190228150506322112
      // 02c: invokestatic com/Bp_2.a (IJ)I
      // 02f: invokeinterface com/P7.S (I)V 2
      // 034: aload 3
      // 035: invokevirtual java/lang/String.toCharArray ()[C
      // 038: areturn
      // 039: aload 2
      // 03a: aload 1
      // 03b: ifnull 070
      // 03e: invokeinterface com/P7.P ()I 1
      // 043: bipush 2
      // 044: goto 04b
      // 047: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 04a: athrow
      // 04b: if_icmpne 06c
      // 04e: aload 2
      // 04f: invokeinterface com/P7.j ()Ljava/lang/Number; 1
      // 054: astore 3
      // 055: aload 2
      // 056: sipush 3146
      // 059: ldc2_w 1360900185944453718
      // 05c: invokestatic com/Bp_2.a (IJ)I
      // 05f: invokeinterface com/P7.S (I)V 2
      // 064: aload 3
      // 065: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 068: invokevirtual java/lang/String.toCharArray ()[C
      // 06b: areturn
      // 06c: aload 0
      // 06d: invokevirtual com/yn_4.M ()Ljava/lang/Object;
      // 070: astore 3
      // 071: aload 3
      // 072: instanceof java/lang/String
      // 075: aload 1
      // 076: ifnull 09e
      // 079: ifeq 08f
      // 07c: goto 083
      // 07f: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 082: athrow
      // 083: aload 3
      // 084: checkcast java/lang/String
      // 087: invokevirtual java/lang/String.toCharArray ()[C
      // 08a: areturn
      // 08b: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 08e: athrow
      // 08f: aload 3
      // 090: aload 1
      // 091: ifnull 18c
      // 094: instanceof java/util/Collection
      // 097: goto 09e
      // 09a: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 09d: athrow
      // 09e: ifeq 18b
      // 0a1: aload 3
      // 0a2: checkcast java/util/Collection
      // 0a5: astore 4
      // 0a7: bipush 1
      // 0a8: istore 5
      // 0aa: aload 4
      // 0ac: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0b1: astore 6
      // 0b3: aload 6
      // 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ba: ifeq 11f
      // 0bd: aload 6
      // 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c4: astore 7
      // 0c6: aload 7
      // 0c8: instanceof java/lang/String
      // 0cb: aload 1
      // 0cc: ifnull 121
      // 0cf: aload 1
      // 0d0: ifnull 0f3
      // 0d3: goto 0da
      // 0d6: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0d9: athrow
      // 0da: ifeq 114
      // 0dd: goto 0e4
      // 0e0: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0e3: athrow
      // 0e4: aload 7
      // 0e6: checkcast java/lang/String
      // 0e9: invokevirtual java/lang/String.length ()I
      // 0ec: goto 0f3
      // 0ef: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0f2: athrow
      // 0f3: istore 8
      // 0f5: iload 8
      // 0f7: aload 1
      // 0f8: ifnull 10e
      // 0fb: bipush 1
      // 0fc: if_icmpeq 114
      // 0ff: goto 106
      // 102: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 105: athrow
      // 106: bipush 0
      // 107: goto 10e
      // 10a: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 10d: athrow
      // 10e: istore 5
      // 110: aload 1
      // 111: ifnonnull 11f
      // 114: aload 1
      // 115: ifnonnull 0b3
      // 118: goto 11f
      // 11b: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 11e: athrow
      // 11f: iload 5
      // 121: aload 1
      // 122: ifnull 145
      // 125: ifne 13e
      // 128: goto 12f
      // 12b: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 12e: athrow
      // 12f: new com/Hi_2
      // 132: dup
      // 133: getstatic com/Bp_2.a Ljava/lang/String;
      // 136: invokespecial com/Hi_2.<init> (Ljava/lang/String;)V
      // 139: athrow
      // 13a: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 13d: athrow
      // 13e: aload 4
      // 140: invokeinterface java/util/Collection.size ()I 1
      // 145: newarray 5
      // 147: astore 6
      // 149: bipush 0
      // 14a: istore 7
      // 14c: aload 4
      // 14e: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 153: astore 8
      // 155: aload 8
      // 157: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15c: ifeq 188
      // 15f: aload 8
      // 161: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 166: astore 9
      // 168: aload 6
      // 16a: aload 1
      // 16b: ifnull 18a
      // 16e: iload 7
      // 170: iinc 7 1
      // 173: aload 9
      // 175: checkcast java/lang/String
      // 178: bipush 0
      // 179: invokevirtual java/lang/String.charAt (I)C
      // 17c: castore
      // 17d: aload 1
      // 17e: ifnonnull 155
      // 181: goto 188
      // 184: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 187: athrow
      // 188: aload 6
      // 18a: areturn
      // 18b: aload 3
      // 18c: aload 1
      // 18d: ifnull 1a3
      // 190: ifnonnull 1a2
      // 193: goto 19a
      // 196: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 199: athrow
      // 19a: aconst_null
      // 19b: goto 1a9
      // 19e: invokestatic com/Bp_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 1a1: athrow
      // 1a2: aload 3
      // 1a3: invokestatic com/Ok_2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 1a6: invokevirtual java/lang/String.toCharArray ()[C
      // 1a9: areturn
   }

   @Override
   public int j() {
      return 4;
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "cH\u001bdU+' J\u00147Od'o\t\u0016,Z6\b]".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 101;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 101;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 101;
               break;
            case 1:
               var37 = 76;
               break;
            case 2:
               var37 = 16;
               break;
            case 3:
               var37 = 33;
               break;
            case 4:
               var37 = 94;
               break;
            case 5:
               var37 = 33;
               break;
            default:
               var37 = 54;
         }
      } else {
         var25 = 101;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 3289317240382374229L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = " #Ô\u0093¶Ú9\u0085´\u0006.´\u007ft3\u0013";
            int var13 = " #Ô\u0093¶Ú9\u0085´\u0006.´\u007ft3\u0013".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 101;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 101;
               break;
            case 1:
               var37 = 76;
               break;
            case 2:
               var37 = 16;
               break;
            case 3:
               var37 = 33;
               break;
            case 4:
               var37 = 94;
               break;
            case 5:
               var37 = 33;
               break;
            default:
               var37 = 54;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 101;
                  break;
               case 1:
                  var37 = 76;
                  break;
               case 2:
                  var37 = 16;
                  break;
               case 3:
                  var37 = 33;
                  break;
               case 4:
                  var37 = 94;
                  break;
               case 5:
                  var37 = 33;
                  break;
               default:
                  var37 = 54;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 3289317240382374229L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = " #Ô\u0093¶Ú9\u0085´\u0006.´\u007ft3\u0013";
               int var5 = " #Ô\u0093¶Ú9\u0085´\u0006.´\u007ft3\u0013".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
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
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 101;
                  break;
               case 1:
                  var37 = 76;
                  break;
               case 2:
                  var37 = 16;
                  break;
               case 3:
                  var37 = 33;
                  break;
               case 4:
                  var37 = 94;
                  break;
               case 5:
                  var37 = 33;
                  break;
               default:
                  var37 = 54;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32285;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





