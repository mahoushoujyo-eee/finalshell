package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;

public class Yz4 implements Ak2 {
   public final java.lang.Class U;
   public final Ak2 R;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Yz4(java.lang.Class var1, Ak2 var2) {
      this.U = var1;
      this.R = var2;
   }

   @Override
   public final void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
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
      // 00b: aload 2
      // 00c: aload 6
      // 00e: ifnull 029
      // 011: ifnonnull 028
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 01a: athrow
      // 01b: aload 7
      // 01d: getstatic com/finalshell/ui/model/EP.WriteNullListAsEmpty Lcom/finalshell/ui/model/EP;
      // 020: invokevirtual com/finalshell/io/YM3.x (Lcom/finalshell/ui/model/EP;)V
      // 023: return
      // 024: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 027: athrow
      // 028: aload 2
      // 029: checkcast [Ljava/lang/Object;
      // 02c: astore 8
      // 02e: aload 8
      // 030: arraylength
      // 031: istore 9
      // 033: aload 1
      // 034: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 037: astore 10
      // 039: aload 1
      // 03a: aload 10
      // 03c: aload 2
      // 03d: aload 3
      // 03e: bipush 0
      // 03f: invokevirtual com/finalshell/core/NL3.N (Lcom/finalshell/core/Uh2_2;Ljava/lang/Object;Ljava/lang/Object;I)V
      // 042: aload 7
      // 044: sipush 25451
      // 047: ldc2_w 3583715369204173212
      // 04a: invokestatic com/finalshell/core/Yz4.a (IJ)I
      // 04d: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 050: pop
      // 051: bipush 0
      // 052: istore 11
      // 054: iload 11
      // 056: iload 9
      // 058: if_icmpge 144
      // 05b: aload 6
      // 05d: ifnull 159
      // 060: iload 11
      // 062: ifeq 082
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 06b: athrow
      // 06c: aload 7
      // 06e: sipush 26204
      // 071: ldc2_w 4233470457781374120
      // 074: invokestatic com/finalshell/core/Yz4.a (IJ)I
      // 077: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 07a: pop
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 081: athrow
      // 082: aload 8
      // 084: iload 11
      // 086: aaload
      // 087: astore 12
      // 089: aload 12
      // 08b: aload 6
      // 08d: ifnull 0f7
      // 090: ifnonnull 0ee
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 099: athrow
      // 09a: aload 7
      // 09c: aload 6
      // 09e: ifnull 0e8
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a7: athrow
      // 0a8: getstatic com/finalshell/ui/model/EP.WriteNullStringAsEmpty Lcom/finalshell/ui/model/EP;
      // 0ab: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0ae: ifeq 0d9
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b7: athrow
      // 0b8: aload 2
      // 0b9: instanceof [Ljava/lang/String;
      // 0bc: ifeq 0d9
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c5: athrow
      // 0c6: aload 7
      // 0c8: ldc ""
      // 0ca: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 0cd: aload 6
      // 0cf: ifnonnull 13c
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d8: athrow
      // 0d9: aload 7
      // 0db: getstatic com/finalshell/core/Yz4.a Ljava/lang/String;
      // 0de: invokevirtual com/finalshell/io/YM3.q (Ljava/lang/CharSequence;)Lcom/finalshell/io/YM3;
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e7: athrow
      // 0e8: pop
      // 0e9: aload 6
      // 0eb: ifnonnull 13c
      // 0ee: aload 12
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f6: athrow
      // 0f7: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0fa: aload 0
      // 0fb: getfield com/finalshell/core/Yz4.U Ljava/lang/Class;
      // 0fe: if_acmpne 120
      // 101: aload 0
      // 102: getfield com/finalshell/core/Yz4.R Lcom/finalshell/core/Ak2;
      // 105: aload 1
      // 106: aload 12
      // 108: iload 11
      // 10a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10d: aconst_null
      // 10e: bipush 0
      // 10f: invokeinterface com/finalshell/core/Ak2.u (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 114: aload 6
      // 116: ifnonnull 13c
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Yz4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 11f: athrow
      // 120: aload 1
      // 121: aload 12
      // 123: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 126: invokevirtual com/finalshell/core/NL3.E (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 129: astore 13
      // 12b: aload 13
      // 12d: aload 1
      // 12e: aload 12
      // 130: iload 11
      // 132: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 135: aconst_null
      // 136: bipush 0
      // 137: invokeinterface com/finalshell/core/Ak2.u (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 13c: iinc 11 1
      // 13f: aload 6
      // 141: ifnonnull 054
      // 144: aload 7
      // 146: sipush 24905
      // 149: ldc2_w 7338755750487968703
      // 14c: invokestatic com/finalshell/core/Yz4.a (IJ)I
      // 14f: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 152: pop
      // 153: aload 1
      // 154: aload 10
      // 156: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 159: goto 167
      // 15c: astore 14
      // 15e: aload 1
      // 15f: aload 10
      // 161: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 164: aload 14
      // 166: athrow
      // 167: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10998;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0005\u0014]\u0019".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 80;
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
         var10007 = 80;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 59;
               break;
            case 1:
               var37 = 49;
               break;
            case 2:
               var37 = 97;
               break;
            case 3:
               var37 = 37;
               break;
            case 4:
               var37 = 92;
               break;
            case 5:
               var37 = 19;
               break;
            default:
               var37 = 62;
         }
      } else {
         var25 = 80;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 7806629674080850455L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "õ\u0089\u0087«É¬\u0019õfËô'Ý\u0019\u001bÐ\u0080ªC\u008c[·\u009e\u0093";
            int var13 = "õ\u0089\u0087«É¬\u0019õfËô'Ý\u0019\u001bÐ\u0080ªC\u008c[·\u009e\u0093".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
            c = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 80;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 59;
               break;
            case 1:
               var37 = 49;
               break;
            case 2:
               var37 = 97;
               break;
            case 3:
               var37 = 37;
               break;
            case 4:
               var37 = 92;
               break;
            case 5:
               var37 = 19;
               break;
            default:
               var37 = 62;
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
                  var37 = 59;
                  break;
               case 1:
                  var37 = 49;
                  break;
               case 2:
                  var37 = 97;
                  break;
               case 3:
                  var37 = 37;
                  break;
               case 4:
                  var37 = 92;
                  break;
               case 5:
                  var37 = 19;
                  break;
               default:
                  var37 = 62;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 7806629674080850455L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "õ\u0089\u0087«É¬\u0019õfËô'Ý\u0019\u001bÐ\u0080ªC\u008c[·\u009e\u0093";
               int var5 = "õ\u0089\u0087«É¬\u0019õfËô'Ý\u0019\u001bÐ\u0080ªC\u008c[·\u009e\u0093".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
               c = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 59;
                  break;
               case 1:
                  var37 = 49;
                  break;
               case 2:
                  var37 = 97;
                  break;
               case 3:
                  var37 = 37;
                  break;
               case 4:
                  var37 = 92;
                  break;
               case 5:
                  var37 = 19;
                  break;
               default:
                  var37 = 62;
            }
         }
      }
   }
}





