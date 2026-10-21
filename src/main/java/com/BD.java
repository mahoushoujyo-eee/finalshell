package com;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class BD {
   private byte[] y;
   private long n;
   private long A;
   private long q;
   private String p;
   private File G;
   private static boolean D;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;
   private static final long[] e;
   private static final Long[] f;

   public BD(String var1) throws Exception {
      this.p = var1;
      this.G = new File(this.p);
      this.r();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void r() throws Exception {
      boolean var10000 = h();
      ByteArrayOutputStream var2 = null;
      FileInputStream var3 = null;
      boolean var1 = var10000;
      boolean var17 = false /* VF: Semaphore variable */;

      label175: {
         label174: {
            try {
               var17 = true;
               var2 = new ByteArrayOutputStream();
               byte[] var4 = new byte[a(15669, 4977162344121140272L)];
               var3 = new FileInputStream(this.G);

               while (true) {
                  if (var3.read(var4) != -1) {
                     try {
                        var2.write(var4);
                        if (var1) {
                           var17 = false;
                           break;
                        }

                        if (!var1) {
                           continue;
                        }
                     } catch (IOException var26) {
                        throw a(var26);
                     }
                  }

                  try {
                     this.y = var2.toByteArray();
                     this.n = this.O(0);
                     this.A = this.O(4);
                     this.q = (this.A - this.n) / b(26036, 7808328855899678747L) + 1L;
                     var35 = var3;
                     if (var1) {
                        var17 = false;
                        break label174;
                     }

                     var3.close();
                     var2.close();
                     var17 = false;
                     break;
                  } catch (IOException var23) {
                     throw a(var23);
                  }
               }
            } finally {
               if (var17) {
                  try {
                     label181: {
                        label136: {
                           label135: {
                              try {
                                 var33 = var2;
                                 if (var1) {
                                    break label135;
                                 }

                                 if (var2 == null) {
                                    break label136;
                                 }
                              } catch (IOException var19) {
                                 throw a(var19);
                              }

                              var33 = var2;
                           }

                           var33.close();
                        }

                        label127: {
                           try {
                              var34 = var3;
                              if (var1) {
                                 break label127;
                              }

                              if (var3 == null) {
                                 break label181;
                              }
                           } catch (IOException var18) {
                              throw a(var18);
                           }

                           var34 = var3;
                        }

                        var34.close();
                     }
                  } catch (IOException var20) {
                     var20.printStackTrace();
                  }
               }
            }

            try {
               try {
                  if (var2 != null) {
                     var2.close();
                  }
               } catch (IOException var24) {
                  throw a(var24);
               }

               var35 = var3;
            } catch (IOException var25) {
               var36 = var25;
               boolean var10001 = false;
               break label175;
            }
         }

         try {
            label147: {
               try {
                  if (var1) {
                     break label147;
                  }

                  if (var35 == null) {
                     return;
                  }
               } catch (IOException var21) {
                  throw a(var21);
               }

               var35 = var3;
            }

            var35.close();
            return;
         } catch (IOException var22) {
            var36 = var22;
            boolean var37 = false;
         }
      }

      IOException var28 = var36;
      var28.printStackTrace();
   }

   private static long M(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/BD.h ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush -21824
      // 1a: sipush -18516
      // 1d: invokestatic com/BD.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: sipush -21819
      // 2c: sipush -29187
      // 2f: invokestatic com/BD.a (II)Ljava/lang/String;
      // 32: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 35: astore 2
      // 36: aload 2
      // 37: bipush 0
      // 38: aaload
      // 39: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 3c: sipush 26465
      // 3f: ldc2_w 5325268516799163087
      // 42: invokestatic com/BD.b (IJ)J
      // 45: land
      // 46: sipush 20960
      // 49: ldc2_w 1019616471333431524
      // 4c: invokestatic com/BD.a (IJ)I
      // 4f: lshl
      // 50: sipush 24222
      // 53: ldc2_w 8478916455119819573
      // 56: invokestatic com/BD.b (IJ)J
      // 59: land
      // 5a: lstore 3
      // 5b: lload 3
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: aaload
      // 5f: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 62: sipush 26465
      // 65: ldc2_w 5325268516799163087
      // 68: invokestatic com/BD.b (IJ)J
      // 6b: land
      // 6c: sipush 6777
      // 6f: ldc2_w 2862388184473117566
      // 72: invokestatic com/BD.a (IJ)I
      // 75: lshl
      // 76: sipush 4488
      // 79: ldc2_w 7620616610307109
      // 7c: invokestatic com/BD.b (IJ)J
      // 7f: land
      // 80: lor
      // 81: lstore 3
      // 82: lload 3
      // 83: aload 2
      // 84: bipush 2
      // 85: aaload
      // 86: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 89: sipush 26465
      // 8c: ldc2_w 5325268516799163087
      // 8f: invokestatic com/BD.b (IJ)J
      // 92: land
      // 93: sipush 9977
      // 96: ldc2_w 8176550324397449201
      // 99: invokestatic com/BD.a (IJ)I
      // 9c: lshl
      // 9d: sipush 22452
      // a0: ldc2_w 5983505725482375700
      // a3: invokestatic com/BD.b (IJ)J
      // a6: land
      // a7: lor
      // a8: lstore 3
      // a9: lload 3
      // aa: aload 2
      // ab: bipush 3
      // ac: aaload
      // ad: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // b0: sipush 26465
      // b3: ldc2_w 5325268516799163087
      // b6: invokestatic com/BD.b (IJ)J
      // b9: land
      // ba: lor
      // bb: lstore 3
      // bc: lload 3
      // bd: lreturn
   }

   private long O(int var1) {
      long var2 = (long)(this.y[var1] & a(19420, 3548665031136932575L));
      var2 |= (long)(this.y[var1 + 1] << a(2636, 2002754935698207562L)) & b(15834, 4328919274552029305L);
      var2 |= (long)(this.y[var1 + 2] << a(4895, 4972002295813024287L)) & b(19012, 9171893212349138912L);
      return var2 | (long)(this.y[var1 + 3] << a(8517, 2455967397775579204L)) & b(1568, 3208836424022969222L);
   }

   private long v(int var1) {
      long var2 = (long)this.y[var1] & b(23745, 164400053362594157L);
      var2 |= (long)(this.y[var1 + 1] << a(9977, 8176550324397449201L)) & b(22452, 5983505725482375700L);
      return var2 | (long)(this.y[var1 + 2] << a(6777, 2862388184473117566L)) & b(4488, 7620616610307109L);
   }

   public com.co_4 h(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokestatic com/BD.M (Ljava/lang/String;)J
      // 004: lstore 3
      // 005: invokestatic com/BD.h ()Z
      // 008: lconst_1
      // 009: lstore 5
      // 00b: aload 0
      // 00c: getfield com/BD.q J
      // 00f: lstore 7
      // 011: istore 2
      // 012: lload 5
      // 014: lload 7
      // 016: lcmp
      // 017: ifgt 142
      // 01a: lload 5
      // 01c: lload 7
      // 01e: ladd
      // 01f: bipush 1
      // 020: lushr
      // 021: lstore 9
      // 023: aload 0
      // 024: aload 0
      // 025: getfield com/BD.n J
      // 028: lload 9
      // 02a: lconst_1
      // 02b: lsub
      // 02c: sipush 9264
      // 02f: ldc2_w 1705378341840939415
      // 032: invokestatic com/BD.b (IJ)J
      // 035: lmul
      // 036: ladd
      // 037: l2i
      // 038: invokespecial com/BD.O (I)J
      // 03b: lstore 11
      // 03d: aload 0
      // 03e: aload 0
      // 03f: getfield com/BD.n J
      // 042: lload 9
      // 044: sipush 9264
      // 047: ldc2_w 1705378341840939415
      // 04a: invokestatic com/BD.b (IJ)J
      // 04d: lmul
      // 04e: ladd
      // 04f: l2i
      // 050: invokespecial com/BD.O (I)J
      // 053: lstore 13
      // 055: lload 11
      // 057: lload 3
      // 058: lcmp
      // 059: iload 2
      // 05a: ifne 100
      // 05d: ifgt 0fc
      // 060: goto 067
      // 063: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: lload 3
      // 068: lload 13
      // 06a: lcmp
      // 06b: iload 2
      // 06c: ifne 100
      // 06f: goto 076
      // 072: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: ifge 0fc
      // 079: goto 080
      // 07c: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 0
      // 081: aload 0
      // 082: getfield com/BD.n J
      // 085: lload 9
      // 087: lconst_1
      // 088: lsub
      // 089: sipush 9264
      // 08c: ldc2_w 1705378341840939415
      // 08f: invokestatic com/BD.b (IJ)J
      // 092: lmul
      // 093: ladd
      // 094: sipush 15736
      // 097: ldc2_w 731199114024644826
      // 09a: invokestatic com/BD.b (IJ)J
      // 09d: ladd
      // 09e: l2i
      // 09f: invokespecial com/BD.v (I)J
      // 0a2: lstore 15
      // 0a4: aload 0
      // 0a5: aload 0
      // 0a6: getfield com/BD.n J
      // 0a9: lload 9
      // 0ab: lconst_1
      // 0ac: lsub
      // 0ad: sipush 9264
      // 0b0: ldc2_w 1705378341840939415
      // 0b3: invokestatic com/BD.b (IJ)J
      // 0b6: lmul
      // 0b7: ladd
      // 0b8: sipush 27779
      // 0bb: ldc2_w 1471151141639725350
      // 0be: invokestatic com/BD.b (IJ)J
      // 0c1: ladd
      // 0c2: sipush 4826
      // 0c5: ldc2_w 7935107364368113531
      // 0c8: invokestatic com/BD.b (IJ)J
      // 0cb: ladd
      // 0cc: l2i
      // 0cd: invokespecial com/BD.v (I)J
      // 0d0: lstore 17
      // 0d2: new com/co_4
      // 0d5: dup
      // 0d6: invokespecial com/co_4.<init> ()V
      // 0d9: astore 19
      // 0db: aload 19
      // 0dd: aload 1
      // 0de: invokevirtual com/co_4.o (Ljava/lang/String;)V
      // 0e1: aload 19
      // 0e3: aload 0
      // 0e4: lload 15
      // 0e6: l2i
      // 0e7: invokespecial com/BD.Z (I)Ljava/lang/String;
      // 0ea: invokevirtual com/co_4.s (Ljava/lang/String;)V
      // 0ed: aload 19
      // 0ef: aload 0
      // 0f0: lload 17
      // 0f2: l2i
      // 0f3: invokespecial com/BD.Z (I)Ljava/lang/String;
      // 0f6: invokevirtual com/co_4.m (Ljava/lang/String;)V
      // 0f9: aload 19
      // 0fb: areturn
      // 0fc: lload 3
      // 0fd: lload 11
      // 0ff: lcmp
      // 100: iload 2
      // 101: ifne 12e
      // 104: ifle 118
      // 107: goto 10e
      // 10a: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: lload 9
      // 110: lconst_1
      // 111: ladd
      // 112: lstore 5
      // 114: iload 2
      // 115: ifeq 13e
      // 118: lload 3
      // 119: lload 11
      // 11b: iload 2
      // 11c: ifne 13b
      // 11f: goto 126
      // 122: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: lcmp
      // 127: goto 12e
      // 12a: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: ifge 13e
      // 131: lload 9
      // 133: lconst_1
      // 134: goto 13b
      // 137: invokestatic com/BD.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: lsub
      // 13c: lstore 7
      // 13e: iload 2
      // 13f: ifeq 012
      // 142: aconst_null
      // 143: areturn
   }

   private pj_4 h(int var1) {
      boolean var10000 = h();
      byte[] var4 = new byte[a(25053, 6629400678468475103L)];
      boolean var2 = var10000;
      int var5 = 0;
      int var3 = var1 + 1;
      var4[var5] = this.y[var1];

      while (var4[var5] != 0) {
         var5++;
         var4[var5] = this.y[var3++];
         if (var2) {
            break;
         }
      }

      try {
         return new pj_4(this, new String(var4, 0, var5, a(-21817, 238)), var5 + 1);
      } catch (UnsupportedEncodingException var7) {
         return new pj_4(this, "", 0);
      }
   }

   private String Z(int var1) {
      try {
         pj_4 var3 = this.h(var1);
         return var3.B;
      } catch (Exception var4) {
         return null;
      }
   }

   public static void main(String[] var0) throws Exception {
      com.BD var1 = new com.BD(a(-21818, -9141));
      System.out.println(var1.h(a(-21820, 12732)));
   }

   public static void T(boolean var0) {
      D = var0;
   }

   public static boolean v() {
      return D;
   }

   public static boolean h() {
      boolean var0 = v();

      try {
         return !var0;
      } catch (NullPointerException var1) {
         throw a(var1);
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[5];
      int var19 = 0;
      String var18 = "Y»$êÌ\u0084ºw\u0099\u001aÛóv¤4\u0002?K\nz\u009eü»ÝÊ\u008azÔÿ";
      int var20 = "Y»$êÌ\u0084ºw\u0099\u001aÛóv¤4\u0002?K\nz\u009eü»ÝÊ\u008azÔÿ".length();
      char var17 = 15;
      T(true);
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 45;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var54 = var10001.toCharArray();
               int var10004 = var54.length;
               int var22 = 0;
               byte var57 = var10000;
               var46 = var54;
               int var34 = var10004;
               byte var66;
               char[] var74;
               int var10006;
               if (var10004 <= 1) {
                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               } else {
                  var57 = var10000;
                  var34 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var83 = var74[var10006];
                  byte var84;
                  switch (var22 % 7) {
                     case 0:
                        var84 = 60;
                        break;
                     case 1:
                        var84 = 74;
                        break;
                     case 2:
                        var84 = 35;
                        break;
                     case 3:
                        var84 = 6;
                        break;
                     case 4:
                        var84 = 39;
                        break;
                     case 5:
                        var84 = 72;
                        break;
                     default:
                        var84 = 110;
                  }

                  var74[var10006] = (char)(var83 ^ var66 ^ var84);
                  var22++;
                  if (var57 == 0) {
                     var10006 = var57;
                     var74 = var46;
                     var66 = var57;
                  } else {
                     if (var34 <= var22) {
                        break;
                     }

                     var74 = var46;
                     var66 = var57;
                     var10006 = var22;
                  }
               }
            }

            String var59 = new String(var46).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var59;
                  if ((var26 += var17) >= var20) {
                     a = var21;
                     b = new String[5];
                     long var8 = 4770705750479796043L;
                     long[] var14 = new long[9];
                     int var11 = 0;
                     String var12 = "Ð\u0093NóY\u001e]D\u001b¯\u0098É\u0095\u0018o\u0017\u008c\b[\b\u0090\u009a.\u0094Wó\u0092·Þ\u0086\u0085ksqNrÝµ\u009f·\u0016\u0003îï·\u0088w{Pãõ\u0089S1D\t";
                     int var13 = "Ð\u0093NóY\u001e]D\u001b¯\u0098É\u0095\u0018o\u0017\u008c\b[\b\u0090\u009a.\u0094Wó\u0092·Þ\u0086\u0085ksqNrÝµ\u009f·\u0016\u0003îï·\u0088w{Pãõ\u0089S1D\t"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var36 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var37 = var11++;
                        long var50 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var71 = var50 ^ var8;
                           switch (var60) {
                              case 0:
                                 var28[var37] = var71;
                                 if (var10 >= var13) {
                                    c = var14;
                                    d = new Integer[9];
                                    long var0 = 652205058281862883L;
                                    long[] var6 = new long[13];
                                    int var3 = 0;
                                    String var4 = "\u001e§¡\u009a\u0082\u0088\u009f~%\u0085\n²\u0080£=e\u001dg\u008d »Â×ÁvD\u0005C¤\u0086q\u00035\u001ep.\u0086\u0099y\u009a\u0003(¤³Ø\u001e\u0086=g\u00123\u0010\u0098%)\u009bZ\u0004·ÊÝ~\u0013÷eQØ²âÏ^ò@ê>\u008bæøÜÓ\t\u0016\u000bâ\u0091cªÆ";
                                    int var5 = "\u001e§¡\u009a\u0082\u0088\u009f~%\u0085\n²\u0080£=e\u001dg\u008d »Â×ÁvD\u0005C¤\u0086q\u00035\u001ep.\u0086\u0099y\u009a\u0003(¤³Ø\u001e\u0086=g\u00123\u0010\u0098%)\u009bZ\u0004·ÊÝ~\u0013÷eQØ²âÏ^ò@ê>\u008bæøÜÓ\t\u0016\u000bâ\u0091cªÆ"
                                       .length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var39 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var40 = var3++;
                                       long var52 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var62 = -1;

                                       while (true) {
                                          var71 = var52 ^ var0;
                                          switch (var62) {
                                             case 0:
                                                var29[var40] = var71;
                                                if (var2 >= var5) {
                                                   e = var6;
                                                   f = new Long[13];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "\u000bE\tñ¾!çq|¦0\u009cÇ;åÖ";
                                                var5 = "\u000bE\tñ¾!çq|¦0\u009cÇ;åÖ".length();
                                                var2 = 0;
                                          }

                                          byte var41 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var40 = var3++;
                                          var52 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var62 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var37] = var71;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "\u0092E\u008cÔñ\u0089T%í\u0005ù\u0012t\u0092h²";
                                 var13 = "\u0092E\u008cÔñ\u0089T%í\u0005ù\u0012t\u0092h²".length();
                                 var10 = 0;
                           }

                           byte var38 = var10;
                           var10 += 8;
                           var15 = var12.substring(var38, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var37 = var11++;
                           var50 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var59;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "\u0010\u0095q\u0006¦Æ上耧产穧";
                  var20 = "\u0010\u0095q\u0006¦Æ上耧产穧".length();
                  var17 = 3;
                  var26 = -1;
            }

            var10000 = 17;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -21820) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 9;
               break;
            case 1:
               var10000 = 32;
               break;
            case 2:
               var10000 = 130;
               break;
            case 3:
               var10000 = 112;
               break;
            case 4:
               var10000 = 162;
               break;
            case 5:
               var10000 = 141;
               break;
            case 6:
               var10000 = 105;
               break;
            case 7:
               var10000 = 204;
               break;
            case 8:
               var10000 = 8;
               break;
            case 9:
               var10000 = 236;
               break;
            case 10:
               var10000 = 49;
               break;
            case 11:
               var10000 = 182;
               break;
            case 12:
               var10000 = 144;
               break;
            case 13:
               var10000 = 164;
               break;
            case 14:
               var10000 = 243;
               break;
            case 15:
               var10000 = 18;
               break;
            case 16:
               var10000 = 39;
               break;
            case 17:
               var10000 = 85;
               break;
            case 18:
               var10000 = 183;
               break;
            case 19:
               var10000 = 184;
               break;
            case 20:
               var10000 = 237;
               break;
            case 21:
               var10000 = 231;
               break;
            case 22:
               var10000 = 206;
               break;
            case 23:
               var10000 = 53;
               break;
            case 24:
               var10000 = 167;
               break;
            case 25:
               var10000 = 68;
               break;
            case 26:
               var10000 = 159;
               break;
            case 27:
               var10000 = 174;
               break;
            case 28:
               var10000 = 239;
               break;
            case 29:
               var10000 = 58;
               break;
            case 30:
               var10000 = 108;
               break;
            case 31:
               var10000 = 157;
               break;
            case 32:
               var10000 = 115;
               break;
            case 33:
               var10000 = 29;
               break;
            case 34:
               var10000 = 21;
               break;
            case 35:
               var10000 = 87;
               break;
            case 36:
               var10000 = 114;
               break;
            case 37:
               var10000 = 63;
               break;
            case 38:
               var10000 = 235;
               break;
            case 39:
               var10000 = 122;
               break;
            case 40:
               var10000 = 88;
               break;
            case 41:
               var10000 = 149;
               break;
            case 42:
               var10000 = 110;
               break;
            case 43:
               var10000 = 170;
               break;
            case 44:
               var10000 = 143;
               break;
            case 45:
               var10000 = 136;
               break;
            case 46:
               var10000 = 139;
               break;
            case 47:
               var10000 = 103;
               break;
            case 48:
               var10000 = 7;
               break;
            case 49:
               var10000 = 220;
               break;
            case 50:
               var10000 = 44;
               break;
            case 51:
               var10000 = 113;
               break;
            case 52:
               var10000 = 137;
               break;
            case 53:
               var10000 = 92;
               break;
            case 54:
               var10000 = 15;
               break;
            case 55:
               var10000 = 77;
               break;
            case 56:
               var10000 = 31;
               break;
            case 57:
               var10000 = 131;
               break;
            case 58:
               var10000 = 104;
               break;
            case 59:
               var10000 = 253;
               break;
            case 60:
               var10000 = 37;
               break;
            case 61:
               var10000 = 116;
               break;
            case 62:
               var10000 = 238;
               break;
            case 63:
               var10000 = 20;
               break;
            case 64:
               var10000 = 117;
               break;
            case 65:
               var10000 = 50;
               break;
            case 66:
               var10000 = 133;
               break;
            case 67:
               var10000 = 138;
               break;
            case 68:
               var10000 = 169;
               break;
            case 69:
               var10000 = 91;
               break;
            case 70:
               var10000 = 185;
               break;
            case 71:
               var10000 = 119;
               break;
            case 72:
               var10000 = 67;
               break;
            case 73:
               var10000 = 10;
               break;
            case 74:
               var10000 = 254;
               break;
            case 75:
               var10000 = 177;
               break;
            case 76:
               var10000 = 132;
               break;
            case 77:
               var10000 = 247;
               break;
            case 78:
               var10000 = 56;
               break;
            case 79:
               var10000 = 46;
               break;
            case 80:
               var10000 = 180;
               break;
            case 81:
               var10000 = 214;
               break;
            case 82:
               var10000 = 25;
               break;
            case 83:
               var10000 = 205;
               break;
            case 84:
               var10000 = 219;
               break;
            case 85:
               var10000 = 62;
               break;
            case 86:
               var10000 = 100;
               break;
            case 87:
               var10000 = 192;
               break;
            case 88:
               var10000 = 120;
               break;
            case 89:
               var10000 = 17;
               break;
            case 90:
               var10000 = 155;
               break;
            case 91:
               var10000 = 255;
               break;
            case 92:
               var10000 = 195;
               break;
            case 93:
               var10000 = 179;
               break;
            case 94:
               var10000 = 199;
               break;
            case 95:
               var10000 = 26;
               break;
            case 96:
               var10000 = 142;
               break;
            case 97:
               var10000 = 93;
               break;
            case 98:
               var10000 = 215;
               break;
            case 99:
               var10000 = 248;
               break;
            case 100:
               var10000 = 161;
               break;
            case 101:
               var10000 = 178;
               break;
            case 102:
               var10000 = 224;
               break;
            case 103:
               var10000 = 78;
               break;
            case 104:
               var10000 = 30;
               break;
            case 105:
               var10000 = 70;
               break;
            case 106:
               var10000 = 212;
               break;
            case 107:
               var10000 = 6;
               break;
            case 108:
               var10000 = 126;
               break;
            case 109:
               var10000 = 197;
               break;
            case 110:
               var10000 = 240;
               break;
            case 111:
               var10000 = 233;
               break;
            case 112:
               var10000 = 61;
               break;
            case 113:
               var10000 = 241;
               break;
            case 114:
               var10000 = 168;
               break;
            case 115:
               var10000 = 135;
               break;
            case 116:
               var10000 = 47;
               break;
            case 117:
               var10000 = 66;
               break;
            case 118:
               var10000 = 82;
               break;
            case 119:
               var10000 = 229;
               break;
            case 120:
               var10000 = 171;
               break;
            case 121:
               var10000 = 84;
               break;
            case 122:
               var10000 = 193;
               break;
            case 123:
               var10000 = 166;
               break;
            case 124:
               var10000 = 234;
               break;
            case 125:
               var10000 = 216;
               break;
            case 126:
               var10000 = 12;
               break;
            case 127:
               var10000 = 59;
               break;
            case 128:
               var10000 = 111;
               break;
            case 129:
               var10000 = 101;
               break;
            case 130:
               var10000 = 209;
               break;
            case 131:
               var10000 = 33;
               break;
            case 132:
               var10000 = 250;
               break;
            case 133:
               var10000 = 16;
               break;
            case 134:
               var10000 = 150;
               break;
            case 135:
               var10000 = 189;
               break;
            case 136:
               var10000 = 217;
               break;
            case 137:
               var10000 = 154;
               break;
            case 138:
               var10000 = 198;
               break;
            case 139:
               var10000 = 202;
               break;
            case 140:
               var10000 = 129;
               break;
            case 141:
               var10000 = 232;
               break;
            case 142:
               var10000 = 2;
               break;
            case 143:
               var10000 = 43;
               break;
            case 144:
               var10000 = 158;
               break;
            case 145:
               var10000 = 72;
               break;
            case 146:
               var10000 = 181;
               break;
            case 147:
               var10000 = 76;
               break;
            case 148:
               var10000 = 200;
               break;
            case 149:
               var10000 = 151;
               break;
            case 150:
               var10000 = 210;
               break;
            case 151:
               var10000 = 97;
               break;
            case 152:
               var10000 = 244;
               break;
            case 153:
               var10000 = 90;
               break;
            case 154:
               var10000 = 69;
               break;
            case 155:
               var10000 = 222;
               break;
            case 156:
               var10000 = 41;
               break;
            case 157:
               var10000 = 19;
               break;
            case 158:
               var10000 = 0;
               break;
            case 159:
               var10000 = 134;
               break;
            case 160:
               var10000 = 191;
               break;
            case 161:
               var10000 = 128;
               break;
            case 162:
               var10000 = 211;
               break;
            case 163:
               var10000 = 48;
               break;
            case 164:
               var10000 = 89;
               break;
            case 165:
               var10000 = 203;
               break;
            case 166:
               var10000 = 79;
               break;
            case 167:
               var10000 = 194;
               break;
            case 168:
               var10000 = 213;
               break;
            case 169:
               var10000 = 172;
               break;
            case 170:
               var10000 = 75;
               break;
            case 171:
               var10000 = 98;
               break;
            case 172:
               var10000 = 246;
               break;
            case 173:
               var10000 = 201;
               break;
            case 174:
               var10000 = 3;
               break;
            case 175:
               var10000 = 163;
               break;
            case 176:
               var10000 = 160;
               break;
            case 177:
               var10000 = 36;
               break;
            case 178:
               var10000 = 52;
               break;
            case 179:
               var10000 = 14;
               break;
            case 180:
               var10000 = 145;
               break;
            case 181:
               var10000 = 99;
               break;
            case 182:
               var10000 = 95;
               break;
            case 183:
               var10000 = 147;
               break;
            case 184:
               var10000 = 196;
               break;
            case 185:
               var10000 = 13;
               break;
            case 186:
               var10000 = 146;
               break;
            case 187:
               var10000 = 42;
               break;
            case 188:
               var10000 = 127;
               break;
            case 189:
               var10000 = 86;
               break;
            case 190:
               var10000 = 156;
               break;
            case 191:
               var10000 = 106;
               break;
            case 192:
               var10000 = 4;
               break;
            case 193:
               var10000 = 38;
               break;
            case 194:
               var10000 = 225;
               break;
            case 195:
               var10000 = 107;
               break;
            case 196:
               var10000 = 186;
               break;
            case 197:
               var10000 = 207;
               break;
            case 198:
               var10000 = 54;
               break;
            case 199:
               var10000 = 140;
               break;
            case 200:
               var10000 = 249;
               break;
            case 201:
               var10000 = 121;
               break;
            case 202:
               var10000 = 221;
               break;
            case 203:
               var10000 = 223;
               break;
            case 204:
               var10000 = 251;
               break;
            case 205:
               var10000 = 102;
               break;
            case 206:
               var10000 = 152;
               break;
            case 207:
               var10000 = 227;
               break;
            case 208:
               var10000 = 35;
               break;
            case 209:
               var10000 = 165;
               break;
            case 210:
               var10000 = 40;
               break;
            case 211:
               var10000 = 74;
               break;
            case 212:
               var10000 = 245;
               break;
            case 213:
               var10000 = 242;
               break;
            case 214:
               var10000 = 22;
               break;
            case 215:
               var10000 = 94;
               break;
            case 216:
               var10000 = 187;
               break;
            case 217:
               var10000 = 11;
               break;
            case 218:
               var10000 = 65;
               break;
            case 219:
               var10000 = 230;
               break;
            case 220:
               var10000 = 175;
               break;
            case 221:
               var10000 = 27;
               break;
            case 222:
               var10000 = 1;
               break;
            case 223:
               var10000 = 173;
               break;
            case 224:
               var10000 = 176;
               break;
            case 225:
               var10000 = 23;
               break;
            case 226:
               var10000 = 218;
               break;
            case 227:
               var10000 = 64;
               break;
            case 228:
               var10000 = 124;
               break;
            case 229:
               var10000 = 188;
               break;
            case 230:
               var10000 = 228;
               break;
            case 231:
               var10000 = 190;
               break;
            case 232:
               var10000 = 28;
               break;
            case 233:
               var10000 = 60;
               break;
            case 234:
               var10000 = 226;
               break;
            case 235:
               var10000 = 5;
               break;
            case 236:
               var10000 = 45;
               break;
            case 237:
               var10000 = 109;
               break;
            case 238:
               var10000 = 51;
               break;
            case 239:
               var10000 = 148;
               break;
            case 240:
               var10000 = 24;
               break;
            case 241:
               var10000 = 252;
               break;
            case 242:
               var10000 = 125;
               break;
            case 243:
               var10000 = 55;
               break;
            case 244:
               var10000 = 71;
               break;
            case 245:
               var10000 = 208;
               break;
            case 246:
               var10000 = 73;
               break;
            case 247:
               var10000 = 57;
               break;
            case 248:
               var10000 = 153;
               break;
            case 249:
               var10000 = 34;
               break;
            case 250:
               var10000 = 96;
               break;
            case 251:
               var10000 = 80;
               break;
            case 252:
               var10000 = 118;
               break;
            case 253:
               var10000 = 81;
               break;
            case 254:
               var10000 = 123;
               break;
            default:
               var10000 = 83;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14592;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 19879) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }
}





