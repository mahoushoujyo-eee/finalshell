package org.v;

import java.util.Arrays;

public class f3 {
   public final String[] R;
   public final String O;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public f3(String var1, String[] var2) {
      this.R = var2;
      this.O = var1;
   }

   public f3(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 003: aload 0
      // 004: invokespecial java/lang/Object.<init> ()V
      // 007: astore 2
      // 008: aload 1
      // 009: bipush 0
      // 00a: invokevirtual java/lang/String.charAt (I)C
      // 00d: aload 2
      // 00e: ifnull 031
      // 011: sipush 8072
      // 014: ldc2_w 6649308916854954894
      // 017: invokestatic org/v/f3.a (IJ)I
      // 01a: if_icmpeq 030
      // 01d: goto 024
      // 020: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 023: athrow
      // 024: new org/P
      // 027: dup
      // 028: invokespecial org/P.<init> ()V
      // 02b: athrow
      // 02c: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 02f: athrow
      // 030: bipush 1
      // 031: istore 3
      // 032: new java/util/ArrayList
      // 035: dup
      // 036: invokespecial java/util/ArrayList.<init> ()V
      // 039: astore 4
      // 03b: aload 1
      // 03c: iload 3
      // 03d: invokevirtual java/lang/String.charAt (I)C
      // 040: sipush 26728
      // 043: ldc2_w 8381722092884618346
      // 046: invokestatic org/v/f3.a (IJ)I
      // 049: if_icmpeq 102
      // 04c: aload 2
      // 04d: ifnull 126
      // 050: iload 3
      // 051: istore 5
      // 053: aload 1
      // 054: iload 5
      // 056: invokevirtual java/lang/String.charAt (I)C
      // 059: sipush 1123
      // 05c: ldc2_w 2873471533016645732
      // 05f: invokestatic org/v/f3.a (IJ)I
      // 062: if_icmpne 077
      // 065: iinc 5 1
      // 068: aload 2
      // 069: ifnull 0a0
      // 06c: aload 2
      // 06d: ifnonnull 053
      // 070: goto 077
      // 073: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 076: athrow
      // 077: getstatic org/v/f3.a Ljava/lang/String;
      // 07a: aload 1
      // 07b: iload 5
      // 07d: invokevirtual java/lang/String.charAt (I)C
      // 080: invokevirtual java/lang/String.indexOf (I)I
      // 083: bipush -1
      // 084: aload 2
      // 085: ifnull 0af
      // 088: if_icmpeq 0a0
      // 08b: goto 092
      // 08e: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 091: athrow
      // 092: iinc 5 1
      // 095: aload 2
      // 096: ifnonnull 0ec
      // 099: goto 0a0
      // 09c: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 09f: athrow
      // 0a0: aload 1
      // 0a1: iload 5
      // 0a3: invokevirtual java/lang/String.charAt (I)C
      // 0a6: sipush 20085
      // 0a9: ldc2_w 2986755066369854070
      // 0ac: invokestatic org/v/f3.a (IJ)I
      // 0af: if_icmpne 0e0
      // 0b2: iinc 5 1
      // 0b5: aload 1
      // 0b6: iload 5
      // 0b8: invokevirtual java/lang/String.charAt (I)C
      // 0bb: sipush 16728
      // 0be: ldc2_w 9116045476215342425
      // 0c1: invokestatic org/v/f3.a (IJ)I
      // 0c4: if_icmpeq 0d9
      // 0c7: iinc 5 1
      // 0ca: aload 2
      // 0cb: ifnull 0dc
      // 0ce: aload 2
      // 0cf: ifnonnull 0b5
      // 0d2: goto 0d9
      // 0d5: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 0d8: athrow
      // 0d9: iinc 5 1
      // 0dc: aload 2
      // 0dd: ifnonnull 0ec
      // 0e0: new org/P
      // 0e3: dup
      // 0e4: invokespecial org/P.<init> ()V
      // 0e7: athrow
      // 0e8: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 0eb: athrow
      // 0ec: aload 4
      // 0ee: aload 1
      // 0ef: iload 3
      // 0f0: iload 5
      // 0f2: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0f5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0fa: pop
      // 0fb: iload 5
      // 0fd: istore 3
      // 0fe: aload 2
      // 0ff: ifnonnull 03b
      // 102: aload 0
      // 103: aload 4
      // 105: aload 4
      // 107: invokeinterface java/util/List.size ()I 1
      // 10c: anewarray 34
      // 10f: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 114: checkcast [Ljava/lang/String;
      // 117: putfield org/v/f3.R [Ljava/lang/String;
      // 11a: aload 0
      // 11b: aload 1
      // 11c: iinc 3 1
      // 11f: iload 3
      // 120: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 123: putfield org/v/f3.O Ljava/lang/String;
      // 126: return
   }

   @Override
   public boolean equals(@org.F.c Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnull 1b
      // 09: aload 0
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 19: athrow
      // 1a: aload 1
      // 1b: aload 2
      // 1c: ifnull 33
      // 1f: instanceof org/v/f3
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast org/v/f3
      // 36: astore 3
      // 37: aload 0
      // 38: getfield org/v/f3.R [Ljava/lang/String;
      // 3b: aload 3
      // 3c: getfield org/v/f3.R [Ljava/lang/String;
      // 3f: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 42: aload 2
      // 43: ifnull 62
      // 46: ifeq 74
      // 49: goto 50
      // 4c: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield org/v/f3.O Ljava/lang/String;
      // 54: aload 3
      // 55: getfield org/v/f3.O Ljava/lang/String;
      // 58: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5b: goto 62
      // 5e: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 61: athrow
      // 62: aload 2
      // 63: ifnull 71
      // 66: ifeq 74
      // 69: goto 70
      // 6c: invokestatic org/v/f3.a (Lorg/P;)Lorg/P;
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode((Object[])this.R) ^ this.O.hashCode();
   }

   @Override
   public String toString() {
      String[] var10000 = RG.C();
      StringBuilder var2 = new StringBuilder("(");
      String[] var1 = var10000;
      String[] var3 = this.R;
      int var4 = var3.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            String var6 = var3[var5];

            try {
               var8 = var2.append(var6);
               if (var1 == null) {
                  break;
               }

               var5++;
               if (var1 != null) {
                  continue;
               }
            } catch (org.P var7) {
               throw a(var7);
            }
         }

         var8 = var2.append((char)a(28600, 7059971121447726008L)).append(this.O);
         break;
      }

      return var8.toString();
   }

   public f3 m(String var1) {
      String[] var2 = new String[1 + this.R.length];
      var2[0] = var1;
      System.arraycopy(this.R, 0, var2, 1, this.R.length);
      return new f3(this.O, var2);
   }

   private static org.P a(org.P var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "T2\u000f.w!\u001bL".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 38;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 38;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 48;
               break;
            case 1:
               var50 = 87;
               break;
            case 2:
               var50 = 109;
               break;
            case 3:
               var50 = 78;
               break;
            case 4:
               var50 = 24;
               break;
            case 5:
               var50 = 77;
               break;
            default:
               var50 = 110;
         }
      } else {
         var34 = 38;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8320541840719012473L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "|\u009a\u000eÃØÆ(C\b¸Ü\u0007\u0082º\u008e:þ¨Ân\u009cË§\u001b\ft\u0088°0¼\u0089è";
            int var13 = "|\u009a\u000eÃØÆ(C\b¸Ü\u0007\u0082º\u008e:þ¨Ân\u009cË§\u001b\ft\u0088°0¼\u0089è".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "KË\u000bìßsbF!ëñO¤.ùß";
                        var13 = "KË\u000bìßsbF!ëñO¤.ùß".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 38;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 48;
               break;
            case 1:
               var50 = 87;
               break;
            case 2:
               var50 = 109;
               break;
            case 3:
               var50 = 78;
               break;
            case 4:
               var50 = 24;
               break;
            case 5:
               var50 = 77;
               break;
            default:
               var50 = 110;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 48;
                  break;
               case 1:
                  var50 = 87;
                  break;
               case 2:
                  var50 = 109;
                  break;
               case 3:
                  var50 = 78;
                  break;
               case 4:
                  var50 = 24;
                  break;
               case 5:
                  var50 = 77;
                  break;
               default:
                  var50 = 110;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8320541840719012473L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "|\u009a\u000eÃØÆ(C\b¸Ü\u0007\u0082º\u008e:þ¨Ân\u009cË§\u001b\ft\u0088°0¼\u0089è";
               int var5 = "|\u009a\u000eÃØÆ(C\b¸Ü\u0007\u0082º\u008e:þ¨Ân\u009cË§\u001b\ft\u0088°0¼\u0089è".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "KË\u000bìßsbF!ëñO¤.ùß";
                           var5 = "KË\u000bìßsbF!ëñO¤.ùß".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 48;
                  break;
               case 1:
                  var50 = 87;
                  break;
               case 2:
                  var50 = 109;
                  break;
               case 3:
                  var50 = 78;
                  break;
               case 4:
                  var50 = 24;
                  break;
               case 5:
                  var50 = 77;
                  break;
               default:
                  var50 = 110;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1027;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





