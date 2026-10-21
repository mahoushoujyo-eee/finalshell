package com.finalshell.core;

import java.nio.charset.StandardCharsets;

public final class DF_2 implements Cloneable {
   public boolean Y = false;
   public boolean j = false;
   public int c;
   public int i = a(30904, 6057093035128584819L);
   public byte[] L;
   public byte[] Z;
   public byte[] q;
   public int F;
   public long C;
   public boolean D = false;
   public long B = 0L;
   public static String a;
   public static long[] b;
   public static Integer[] d;

   public void E(long var1) {
      this.B = var1;
   }

   public long a() {
      return this.B;
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
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 2
      // 04: bipush 0
      // 05: iload 1
      // 06: aload 2
      // 07: ifnonnull 44
      // 0a: if_icmpgt 33
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: iload 1
      // 15: sipush 28787
      // 18: ldc2_w 7927466505301488304
      // 1b: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 1e: aload 2
      // 1f: ifnonnull 44
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: if_icmple 47
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: iload 1
      // 34: sipush 2753
      // 37: ldc2_w 5038628957861316609
      // 3a: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: if_icmpne 57
      // 47: aload 0
      // 48: iload 1
      // 49: putfield com/finalshell/core/DF_2.i I
      // 4c: aload 2
      // 4d: ifnull 77
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: new java/lang/IllegalArgumentException
      // 5a: dup
      // 5b: new java/lang/StringBuilder
      // 5e: dup
      // 5f: invokespecial java/lang/StringBuilder.<init> ()V
      // 62: getstatic com/finalshell/core/DF_2.a Ljava/lang/String;
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68: iload 1
      // 69: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 72: athrow
      // 73: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: return
   }

   public int R() {
      return this.i;
   }

   public void R(String var1) {
      this.Z = var1.getBytes(StandardCharsets.ISO_8859_1);
   }

   public String q() {
      try {
         if (this.Z == null) {
            return "";
         }
      } catch (IllegalArgumentException var1) {
         throw a(var1);
      }

      return new String(this.Z, StandardCharsets.ISO_8859_1);
   }

   public void y(String var1) {
      this.q = var1.getBytes(StandardCharsets.ISO_8859_1);
   }

   public String h() {
      try {
         if (this.q == null) {
            return "";
         }
      } catch (IllegalArgumentException var1) {
         throw a(var1);
      }

      return new String(this.q, StandardCharsets.ISO_8859_1);
   }

   public void U(long var1) {
      this.C = var1;
   }

   public long P() {
      return this.C;
   }

   public void t(Wa2_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nm4.g ()[I
      // 003: bipush 0
      // 004: istore 3
      // 005: astore 2
      // 006: aload 0
      // 007: getfield com/finalshell/core/DF_2.Y Z
      // 00a: aload 2
      // 00b: ifnonnull 02b
      // 00e: ifeq 01c
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: iload 3
      // 019: bipush 1
      // 01a: ior
      // 01b: istore 3
      // 01c: aload 0
      // 01d: aload 2
      // 01e: ifnonnull 033
      // 021: getfield com/finalshell/core/DF_2.j Z
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: ifeq 032
      // 02e: iload 3
      // 02f: bipush 2
      // 030: ior
      // 031: istore 3
      // 032: aload 0
      // 033: getfield com/finalshell/core/DF_2.L [B
      // 036: aload 2
      // 037: ifnonnull 04c
      // 03a: ifnull 048
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: iload 3
      // 045: bipush 4
      // 046: ior
      // 047: istore 3
      // 048: aload 0
      // 049: getfield com/finalshell/core/DF_2.Z [B
      // 04c: aload 2
      // 04d: ifnonnull 06a
      // 050: ifnull 066
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: iload 3
      // 05b: sipush 22584
      // 05e: ldc2_w 9101383686785194750
      // 061: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 064: ior
      // 065: istore 3
      // 066: aload 0
      // 067: getfield com/finalshell/core/DF_2.q [B
      // 06a: ifnull 079
      // 06d: iload 3
      // 06e: sipush 665
      // 071: ldc2_w 3596670563051176027
      // 074: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 077: ior
      // 078: istore 3
      // 079: bipush 0
      // 07a: istore 4
      // 07c: aload 1
      // 07d: getfield com/finalshell/core/Wa2_2.N I
      // 080: bipush 1
      // 081: aload 2
      // 082: ifnonnull 0b8
      // 085: if_icmpne 099
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: iload 4
      // 091: bipush 4
      // 092: ior
      // 093: istore 4
      // 095: aload 2
      // 096: ifnull 0c1
      // 099: aload 1
      // 09a: aload 2
      // 09b: ifnonnull 12f
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: getfield com/finalshell/core/Wa2_2.N I
      // 0a8: sipush 10843
      // 0ab: ldc2_w 4021362141561858193
      // 0ae: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: if_icmpne 0c1
      // 0bb: iload 4
      // 0bd: bipush 2
      // 0be: ior
      // 0bf: istore 4
      // 0c1: aload 1
      // 0c2: sipush 32090
      // 0c5: ldc2_w 4334830446223228829
      // 0c8: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 0cb: invokevirtual com/finalshell/core/Wa2_2.C (I)V
      // 0ce: aload 1
      // 0cf: sipush 24080
      // 0d2: ldc2_w 888934181711895765
      // 0d5: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 0d8: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 0db: aload 1
      // 0dc: iload 3
      // 0dd: i2b
      // 0de: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 0e1: aload 1
      // 0e2: aload 0
      // 0e3: getfield com/finalshell/core/DF_2.B J
      // 0e6: l2i
      // 0e7: i2b
      // 0e8: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 0eb: aload 1
      // 0ec: aload 0
      // 0ed: getfield com/finalshell/core/DF_2.B J
      // 0f0: sipush 24080
      // 0f3: ldc2_w 888934181711895765
      // 0f6: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 0f9: lshr
      // 0fa: l2i
      // 0fb: i2b
      // 0fc: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 0ff: aload 1
      // 100: aload 0
      // 101: getfield com/finalshell/core/DF_2.B J
      // 104: sipush 12769
      // 107: ldc2_w 514964352498053920
      // 10a: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 10d: lshr
      // 10e: l2i
      // 10f: i2b
      // 110: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 113: aload 1
      // 114: aload 0
      // 115: getfield com/finalshell/core/DF_2.B J
      // 118: sipush 22608
      // 11b: ldc2_w 1293324846536022676
      // 11e: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 121: lshr
      // 122: l2i
      // 123: i2b
      // 124: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 127: aload 1
      // 128: iload 4
      // 12a: i2b
      // 12b: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 12e: aload 1
      // 12f: aload 0
      // 130: getfield com/finalshell/core/DF_2.i I
      // 133: i2b
      // 134: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 137: aload 0
      // 138: getfield com/finalshell/core/DF_2.L [B
      // 13b: aload 2
      // 13c: ifnonnull 180
      // 13f: ifnull 17c
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 148: athrow
      // 149: aload 1
      // 14a: aload 0
      // 14b: getfield com/finalshell/core/DF_2.L [B
      // 14e: arraylength
      // 14f: i2b
      // 150: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 153: aload 1
      // 154: aload 0
      // 155: getfield com/finalshell/core/DF_2.L [B
      // 158: arraylength
      // 159: sipush 24080
      // 15c: ldc2_w 888934181711895765
      // 15f: invokestatic com/finalshell/core/DF_2.a (IJ)I
      // 162: ishr
      // 163: i2b
      // 164: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 167: aload 1
      // 168: aload 0
      // 169: getfield com/finalshell/core/DF_2.L [B
      // 16c: bipush 0
      // 16d: aload 0
      // 16e: getfield com/finalshell/core/DF_2.L [B
      // 171: arraylength
      // 172: invokevirtual com/finalshell/core/Wa2_2.P ([BII)V
      // 175: goto 17c
      // 178: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: aload 0
      // 17d: getfield com/finalshell/core/DF_2.Z [B
      // 180: aload 2
      // 181: ifnonnull 1ac
      // 184: ifnull 1a8
      // 187: goto 18e
      // 18a: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: aload 1
      // 18f: aload 0
      // 190: getfield com/finalshell/core/DF_2.Z [B
      // 193: bipush 0
      // 194: aload 0
      // 195: getfield com/finalshell/core/DF_2.Z [B
      // 198: arraylength
      // 199: invokevirtual com/finalshell/core/Wa2_2.P ([BII)V
      // 19c: aload 1
      // 19d: bipush 0
      // 19e: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: getfield com/finalshell/core/DF_2.q [B
      // 1ac: ifnull 1c9
      // 1af: aload 1
      // 1b0: aload 0
      // 1b1: getfield com/finalshell/core/DF_2.q [B
      // 1b4: bipush 0
      // 1b5: aload 0
      // 1b6: getfield com/finalshell/core/DF_2.q [B
      // 1b9: arraylength
      // 1ba: invokevirtual com/finalshell/core/Wa2_2.P ([BII)V
      // 1bd: aload 1
      // 1be: bipush 0
      // 1bf: invokevirtual com/finalshell/core/Wa2_2.a (B)V
      // 1c2: goto 1c9
      // 1c5: invokestatic com/finalshell/core/DF_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c8: athrow
      // 1c9: return
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      int[] var10000 = Nm4.g();
      DF_2 var2 = (DF_2)super.clone();
      int[] var1 = var10000;

      label51: {
         label50: {
            try {
               var9 = var2.L;
               if (var1 != null) {
                  break label51;
               }

               if (var2.L == null) {
                  break label50;
               }
            } catch (CloneNotSupportedException var6) {
               throw a(var6);
            }

            byte[] var3 = new byte[var2.L.length];
            System.arraycopy(var2.L, 0, var3, 0, var3.length);
            var2.L = var3;
         }

         var9 = var2.Z;
      }

      label41: {
         label40: {
            try {
               if (var1 != null) {
                  break label41;
               }

               if (var9 == null) {
                  break label40;
               }
            } catch (CloneNotSupportedException var5) {
               throw a(var5);
            }

            byte[] var7 = new byte[var2.Z.length];
            System.arraycopy(var2.Z, 0, var7, 0, var7.length);
            var2.Z = var7;
         }

         try {
            if (var1 != null) {
               return var2;
            }

            var9 = var2.q;
         } catch (CloneNotSupportedException var4) {
            throw a(var4);
         }
      }

      if (var9 != null) {
         byte[] var8 = new byte[var2.q.length];
         System.arraycopy(var2.q, 0, var8, 0, var8.length);
         var2.q = var8;
      }

      return var2;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 706;
      if (d[var3] == null) {
         d[var3] = (int)(b[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long var9;
      char[] var10003 = "\u0003g?(".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 3;
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
         var10007 = 3;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 111;
               break;
            case 1:
               var50 = 23;
               break;
            case 2:
               var50 = 6;
               break;
            case 3:
               var50 = 11;
               break;
            case 4:
               var50 = 84;
               break;
            case 5:
               var50 = 76;
               break;
            default:
               var50 = 61;
         }
      } else {
         var34 = 3;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            var9 = 5123355951318460852L;
            long[] var14 = new long[10];
            int var11 = 0;
            String var12 = "((æ\u001aäýiÿ\u0004\u001bêj)u\u001b\t\\és¡´jaJ¯\u0085Wïv\u009aÚ\u0084Ð\u0091³ñ?e³B\u0081?#\u0085Ãi\u001d6FÝ5P¨Ï38ú\u00186Òa\u009bµi";
            int var13 = "((æ\u001aäýiÿ\u0004\u001bêj)u\u001b\t\\és¡´jaJ¯\u0085Wïv\u009aÚ\u0084Ð\u0091³ñ?e³B\u0081?#\u0085Ãi\u001d6FÝ5P¨Ï38ú\u00186Òa\u009bµi"
               .length();
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
                           d = new Integer[10];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "ª\u00193c\u0018ÇÁ,¦\u0017ãPÚl\u00938";
                        var13 = "ª\u00193c\u0018ÇÁ,¦\u0017ãPÚl\u00938".length();
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
         var10007 = 3;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 111;
               break;
            case 1:
               var50 = 23;
               break;
            case 2:
               var50 = 6;
               break;
            case 3:
               var50 = 11;
               break;
            case 4:
               var50 = 84;
               break;
            case 5:
               var50 = 76;
               break;
            default:
               var50 = 61;
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
                  var50 = 111;
                  break;
               case 1:
                  var50 = 23;
                  break;
               case 2:
                  var50 = 6;
                  break;
               case 3:
                  var50 = 11;
                  break;
               case 4:
                  var50 = 84;
                  break;
               case 5:
                  var50 = 76;
                  break;
               default:
                  var50 = 61;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 5123355951318460852L;
               long[] var6 = new long[10];
               int var3 = 0;
               String var4 = "((æ\u001aäýiÿ\u0004\u001bêj)u\u001b\t\\és¡´jaJ¯\u0085Wïv\u009aÚ\u0084Ð\u0091³ñ?e³B\u0081?#\u0085Ãi\u001d6FÝ5P¨Ï38ú\u00186Òa\u009bµi";
               int var5 = "((æ\u001aäýiÿ\u0004\u001bêj)u\u001b\t\\és¡´jaJ¯\u0085Wïv\u009aÚ\u0084Ð\u0091³ñ?e³B\u0081?#\u0085Ãi\u001d6FÝ5P¨Ï38ú\u00186Òa\u009bµi"
                  .length();
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
                              d = new Integer[10];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ª\u00193c\u0018ÇÁ,¦\u0017ãPÚl\u00938";
                           var5 = "ª\u00193c\u0018ÇÁ,¦\u0017ãPÚl\u00938".length();
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
                  var50 = 111;
                  break;
               case 1:
                  var50 = 23;
                  break;
               case 2:
                  var50 = 6;
                  break;
               case 3:
                  var50 = 11;
                  break;
               case 4:
                  var50 = 84;
                  break;
               case 5:
                  var50 = 76;
                  break;
               default:
                  var50 = 61;
            }
         }
      }
   }
}





