package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.io.InputStream;

public class Rx2 {
   public final byte[] l;
   public final int[] V;
   public final String[] q;
   public final int I;
   public final int b;
   public boolean c;
   public static String[] a;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;

   public Rx2(InputStream param1, boolean param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: sipush 7961
      // 003: invokestatic com/finalshell/core/XB.X ()[I
      // 006: aload 0
      // 007: invokespecial java/lang/Object.<init> ()V
      // 00a: aload 0
      // 00b: iload 2
      // 00c: putfield com/finalshell/core/Rx2.c Z
      // 00f: new java/io/ByteArrayOutputStream
      // 012: dup
      // 013: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 016: astore 4
      // 018: astore 3
      // 019: ldc2_w 8446335966100734248
      // 01c: invokestatic com/finalshell/core/Rx2.a (IJ)I
      // 01f: newarray 8
      // 021: astore 5
      // 023: aload 1
      // 024: aload 5
      // 026: invokevirtual java/io/InputStream.read ([B)I
      // 029: istore 6
      // 02b: iload 6
      // 02d: bipush -1
      // 02e: if_icmpne 040
      // 031: aload 3
      // 032: ifnonnull 05d
      // 035: aload 3
      // 036: ifnull 061
      // 039: goto 040
      // 03c: invokestatic com/finalshell/core/Rx2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 03f: athrow
      // 040: iload 6
      // 042: ifle 05d
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/Rx2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 04b: athrow
      // 04c: aload 4
      // 04e: aload 5
      // 050: bipush 0
      // 051: iload 6
      // 053: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Rx2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05c: athrow
      // 05d: aload 3
      // 05e: ifnull 023
      // 061: aload 1
      // 062: invokevirtual java/io/InputStream.close ()V
      // 065: aload 0
      // 066: aload 4
      // 068: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 06b: putfield com/finalshell/core/Rx2.l [B
      // 06e: aload 0
      // 06f: aload 0
      // 070: sipush 12531
      // 073: ldc2_w 4742160517747470033
      // 076: invokestatic com/finalshell/core/Rx2.a (IJ)I
      // 079: invokespecial com/finalshell/core/Rx2.m (I)I
      // 07c: newarray 10
      // 07e: putfield com/finalshell/core/Rx2.V [I
      // 081: sipush 21078
      // 084: aload 0
      // 085: getfield com/finalshell/core/Rx2.V [I
      // 088: arraylength
      // 089: istore 4
      // 08b: ldc2_w 6319709270419999844
      // 08e: aload 0
      // 08f: iload 4
      // 091: anewarray 78
      // 094: putfield com/finalshell/core/Rx2.q [Ljava/lang/String;
      // 097: bipush 0
      // 098: istore 5
      // 09a: invokestatic com/finalshell/core/Rx2.a (IJ)I
      // 09d: istore 6
      // 09f: bipush 1
      // 0a0: istore 7
      // 0a2: iload 7
      // 0a4: iload 4
      // 0a6: if_icmpge 182
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/core/Rx2.V [I
      // 0ad: iload 7
      // 0af: iload 6
      // 0b1: bipush 1
      // 0b2: iadd
      // 0b3: iastore
      // 0b4: aload 0
      // 0b5: aload 3
      // 0b6: ifnonnull 189
      // 0b9: getfield com/finalshell/core/Rx2.l [B
      // 0bc: iload 6
      // 0be: baload
      // 0bf: aload 3
      // 0c0: ifnonnull 172
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Rx2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c9: athrow
      // 0ca: tableswitch 160 1 18 122 160 90 90 97 97 160 160 90 90 90 90 160 160 115 160 160 90
      // 120: invokestatic com/finalshell/core/Rx2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 123: athrow
      // 124: bipush 5
      // 125: istore 8
      // 127: aload 3
      // 128: ifnull 174
      // 12b: sipush 29870
      // 12e: ldc2_w 5536287584971106951
      // 131: invokestatic com/finalshell/core/Rx2.a (IJ)I
      // 134: istore 8
      // 136: iinc 7 1
      // 139: aload 3
      // 13a: ifnull 174
      // 13d: bipush 4
      // 13e: istore 8
      // 140: aload 3
      // 141: ifnull 174
      // 144: bipush 3
      // 145: aload 0
      // 146: iload 6
      // 148: bipush 1
      // 149: iadd
      // 14a: invokespecial com/finalshell/core/Rx2.m (I)I
      // 14d: iadd
      // 14e: istore 8
      // 150: iload 8
      // 152: iload 5
      // 154: aload 3
      // 155: ifnonnull 178
      // 158: if_icmple 174
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/Rx2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 161: athrow
      // 162: iload 8
      // 164: istore 5
      // 166: aload 3
      // 167: ifnull 174
      // 16a: bipush 3
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/core/Rx2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 171: athrow
      // 172: istore 8
      // 174: iload 6
      // 176: iload 8
      // 178: iadd
      // 179: istore 6
      // 17b: iinc 7 1
      // 17e: aload 3
      // 17f: ifnull 0a2
      // 182: aload 0
      // 183: iload 5
      // 185: putfield com/finalshell/core/Rx2.I I
      // 188: aload 0
      // 189: iload 6
      // 18b: putfield com/finalshell/core/Rx2.b I
      // 18e: return
   }

   public void C(Lx2 var1) {
      int var7;
      int var8;
      int[] var2;
      char[] var3;
      int var6;
      int var23;
      label184: {
         var3 = new char[this.I];
         int[] var10000 = XB.X();
         var8 = 0;
         var2 = var10000;
         var23 = (this.c) ? 1 : 0;
         if (var2 == null) {
            if (this.c) {
               var6 = this.f();
               int var4 = this.m(var6);

               while (var4 > 0) {
                  String var9 = this.l(var6 + 2, var3);
                  var23 = (a(28796, -29771).equals(var9)) ? 1 : 0;
                  if (var2 != null) {
                     break label184;
                  }

                  if (var2 == null) {
                     if (var23 != 0) {
                        var8 = var6 + a(12531, 4742160517747470033L);
                        if (var2 == null) {
                           break;
                        }
                     }

                     var23 = var6 + a(13409, 3323115123623782981L) + this.X(var6 + 4);
                  }

                  var6 = var23;
                  var4--;
                  if (var2 != null) {
                     break;
                  }
               }
            }

            var23 = this.b;
         }

         var6 = var23;
         var23 = this.m(var6 + a(13409, 3323115123623782981L));
      }

      int var21 = var23;
      var6 += 8;
      int var11 = 0;

      while (var11 < var21) {
         var6 += 2;
         var11++;
         if (var2 != null) {
            break;
         }
      }

      var11 = this.m(var6);
      var7 = var6 + 2;

      while (true) {
         if (var11 > 0) {
            int var5 = this.m(var7 + a(13409, 3323115123623782981L));
            if (var2 != null) {
               break;
            }

            var7 += 8;

            label151: {
               while (var5 > 0) {
                  var7 += a(13409, 3323115123623782981L) + this.X(var7 + 2);
                  var5--;
                  if (var2 != null) {
                     break label151;
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var11--;
            }

            if (var2 == null) {
               continue;
            }
         }

         var11 = this.m(var7);
         break;
      }

      var7 += 2;

      while (true) {
         if (var11 > 0) {
            int var13 = this.m(var7 + a(13409, 3323115123623782981L));
            if (var2 != null) {
               break;
            }

            var7 += 8;

            label131: {
               while (var13 > 0) {
                  var7 += a(13409, 3323115123623782981L) + this.X(var7 + 2);
                  var13--;
                  if (var2 != null) {
                     break label131;
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var11--;
            }

            if (var2 == null) {
               continue;
            }
         }

         var11 = this.m(var7);
         break;
      }

      var7 += 2;

      label116:
      while (true) {
         if (var11 > 0) {
            var7 += a(13409, 3323115123623782981L) + this.X(var7 + 2);
            var11--;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         var23 = var8;
         if (var2 == null) {
            if (var8 != 0) {
               var11 = this.m(var8);
               var7 = var8 + 2;

               while (var11 > 0) {
                  String var10 = this.l(var7, var3);
                  var1.R(var10);
                  var11--;
                  if (var2 != null) {
                     break label116;
                  }

                  if (var2 != null) {
                     break;
                  }
               }
            }

            var23 = this.m(var6);
         }

         var11 = var23;
         break;
      }

      var6 += 2;

      while (true) {
         if (var11 > 0) {
            int var14 = this.m(var6 + a(13409, 3323115123623782981L));
            if (var2 != null) {
               break;
            }

            var6 += 8;

            label88: {
               while (var14 > 0) {
                  var6 += a(13409, 3323115123623782981L) + this.X(var6 + 2);
                  var14--;
                  if (var2 != null) {
                     break label88;
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var11--;
            }

            if (var2 == null) {
               continue;
            }
         }

         var11 = this.m(var6);
         break;
      }

      var6 += 2;

      while (var11 > 0) {
         var6 = this.A(var1, var3, var6);
         var11--;
         if (var2 != null) {
            break;
         }
      }

      if (Ky4.F$arrString() != null) {
         XB.N(new int[5]);
      }
   }

   public int f() {
      int var7;
      int var8;
      int[] var10000 = XB.X();
      int var2 = this.b + a(12531, 4742160517747470033L) + this.m(this.b + a(13409, 3323115123623782981L)) * 2;
      int[] var1 = var10000;
      int var3 = this.m(var2);

      while (true) {
         if (var3 > 0) {
            var7 = this.m(var2 + a(12531, 4742160517747470033L));
            if (var1 != null) {
               break;
            }

            int var4 = var7;

            label57: {
               while (var4 > 0) {
                  var2 += a(13409, 3323115123623782981L) + this.X(var2 + a(14884, 7657198279263413256L));
                  var4--;
                  if (var1 != null) {
                     break label57;
                  }

                  if (var1 != null) {
                     break;
                  }
               }

               var2 += 8;
               var3--;
            }

            if (var1 == null) {
               continue;
            }
         }

         var2 += 2;
         var7 = this.m(var2);
         break;
      }

      var3 = var7;

      while (true) {
         if (var3 > 0) {
            var8 = this.m(var2 + a(12531, 4742160517747470033L));
            if (var1 != null) {
               break;
            }

            int var6 = var8;

            label37: {
               while (var6 > 0) {
                  var2 += a(13409, 3323115123623782981L) + this.X(var2 + a(23352, 4269116902259524887L));
                  var6--;
                  if (var1 != null) {
                     break label37;
                  }

                  if (var1 != null) {
                     break;
                  }
               }

               var2 += 8;
               var3--;
            }

            if (var1 == null) {
               continue;
            }
         }

         var8 = var2 + 2;
         break;
      }

      return var8;
   }

   public int A(Lx2 var1, char[] var2, int var3) {
      int var33;
      int var7;
      String var8;
      int var10 = this.m(var3);
      int[] var10000 = XB.X();
      String var11 = this.l(var3 + 2, var2);
      String var12 = this.l(var3 + 4, var2);
      int var5 = 0;
      int[] var4 = var10000;
      int var6 = 0;
      var7 = this.m(var3 + a(16835, 7344570157291872228L));
      var3 += 8;

      while (true) {
         if (var7 > 0) {
            var8 = this.l(var3, var2);
            int var13 = this.X(var3 + 2);
            var3 += 6;
            var34 = var8.equals(a(28799, -22709));
            if (var4 != null) {
               break;
            }

            if (var4 == null) {
               if (var34 != 0) {
                  var5 = var3;
               }

               var34 = var3 + var13;
            }

            var3 = var34;
            var7--;
            if (var4 == null) {
      int var34;
               continue;
            }
         }

         var34 = var6;
         break;
      }

      label149: {
         if (var4 == null) {
            if (var34 == 0) {
               break label149;
            }

            var6 += 2;
            var34 = 0;
         }

         var7 = var34;

         while (var7 < this.m(var6)) {
            var6 += 2;
            var7++;
            if (var4 != null) {
               break;
            }
         }
      }

      Wj4 var32 = var1.g(var10, var11, var12);
      if (var32 != null) {
         if (var4 != null) {
            return var5;
         }

         if (var5 != 0) {
            int var14 = this.X(var5 + 4);
            var5 += 8;
            int var16 = var5 + var14;
            var7 = this.m(var16);
            var5 = var16 + 2;

            while (var7 > 0) {
               var5 += 8;
               var7--;
               if (var4 != null) {
                  return var3;
               }

               if (var4 != null) {
                  break;
               }
            }

            int var17 = 0;
            int var18 = 0;
            var7 = this.m(var5);
            var5 += 2;

            label107: {
               while (var7 > 0) {
                  String var29 = this.l(var5, var2);
                  var35 = var29.equals(a(28798, -29171));
                  if (var4 != null) {
                     break label107;
                  }

                  label103: {
                     label153: {
                        if (var4 == null) {
                           if (var35 != 0) {
                              var17 = var5 + a(13409, 3323115123623782981L);
                              if (var4 == null) {
                                 break label153;
                              }
                           }

                           var35 = var29.equals(a(28797, 12450));
                        }

                        if (var4 != null) {
                           break label103;
                        }

                        if (var35 != 0) {
                           var18 = var5 + a(13409, 3323115123623782981L);
                        }
                     }

                     var35 = var5 + a(13409, 3323115123623782981L) + this.X(var5 + 2);
                  }

                  var5 = var35;
                  var7--;
                  if (var4 != null) {
                     break;
                  }
               }

               var35 = var17;
            }

            if (var4 != null) {
               return var35;
            }

            if (var35 != 0) {
               int var9;
               label84: {
                  int var36 = var18;
                  if (var4 == null) {
                     if (var18 != 0) {
                        var9 = this.m(var18) * 3;
                        var6 = var18 + 2;
                        int[] var19 = new int[var9];

                        while (var9 > 0) {
                           var9--;
                           var19[var9] = var6 + a(13409, 3323115123623782981L);
                           var9--;
                           var19[var9] = this.m(var6 + a(12531, 4742160517747470033L));
                           var9--;
                           var19[var9] = this.m(var6);
                           var6 += 10;
                           if (var4 != null) {
                              break label84;
                           }

                           if (var4 != null) {
                              break;
                           }
                        }
                     }

                     var36 = this.m(var17);
                  }

                  var9 = var36;
               }

               var6 = var17 + 2;

               while (var9 > 0) {
                  int var37 = this.m(var6 + a(12531, 4742160517747470033L));
                  if (var4 != null) {
                     return var37;
                  }

                  var33 = var37;
                  var32.p(this.l(var6 + 4, var2), var33);
                  var6 += 10;
                  var9--;
                  if (var4 != null) {
                     break;
                  }
               }
            }
         }
      }

      return var3;
   }

   public int m(int var1) {
      byte[] var2 = this.l;
      return (var2[var1] & a(22789, 6668029864107345701L)) << a(31416, 264108058789553302L) | var2[var1 + 1] & a(31964, 5021098413646848767L);
   }

   public int X(int var1) {
      byte[] var2 = this.l;
      return (var2[var1] & a(31964, 5021098413646848767L)) << a(28557, 1003220879750312357L)
         | (var2[var1 + 1] & a(31964, 5021098413646848767L)) << a(5798, 4700451335067945099L)
         | (var2[var1 + 2] & a(31964, 5021098413646848767L)) << a(12531, 4742160517747470033L)
         | var2[var1 + 3] & a(31964, 5021098413646848767L);
   }

   public String l(int var1, char[] var2) {
      String var7;
      int[] var10000 = XB.X();
      int var4 = this.m(var1);
      String var5 = this.q[var4];
      int[] var3 = var10000;
      var7 = var5;
      if (var3 == null) {
         if (var5 != null) {
            return var5;
         }

         var1 = this.V[var4];
         var7 = this.q[var4] = this.C(var1 + 2, this.m(var1), var2);
      }

      return var7;
   }

   public String C(int var1, int var2, char[] var3) {
      int var7;
      int[] var10000 = XB.X();
      int var5 = var1 + var2;
      byte[] var6 = this.l;
      int[] var4 = var10000;
      var7 = 0;
      byte var9 = 0;
      char var10 = 0;

      while (var1 < var5) {
         label54: {
            int var8;
            label53: {
               label65: {
                  var8 = var6[var1++];
                  int var11 = var9;
                  if (var4 == null) {
                     switch (var9) {
                        case 0:
                           var8 &= a(31964, 5021098413646848767L);
                           var11 = var8;
                           break;
                        case 1:
                           break label65;
                        case 2:
                           break label53;
                        default:
                           break label54;
                     }
                  }

                  int var12 = a(7102, 7992993624238245261L);
                  if (var4 == null) {
                     if (var11 < var12) {
                        var3[var7++] = (char)var8;
                        if (var4 == null) {
                           break label54;
                        }
                     }

                     var11 = var8;
                     var12 = a(19735, 3728804318231892786L);
                  }

                  label42:
                  if (var4 == null) {
                     if (var11 < var12) {
                        var11 = var8;
                        var12 = a(22212, 7230031104647039220L);
                        if (var4 != null) {
                           break label42;
                        }

                        if (var8 > var12) {
                           var10 = (char)(var8 & a(15657, 4997657610210501384L));
                           var9 = 1;
                           if (var4 == null) {
                              break label54;
                           }
                        }
                     }

                     var11 = var8;
                     var12 = a(12699, 4693544420591988669L);
                  }

                  var10 = (char)(var11 & var12);
                  var9 = 2;
                  if (var4 == null) {
                     break label54;
                  }
               }

               var3[var7++] = (char)(var10 << a(13409, 3323115123623782981L) | var8 & a(22151, 1598488468375996589L));
               var9 = 0;
               if (var4 == null) {
                  break label54;
               }
            }

            var10 = (char)(var10 << a(13409, 3323115123623782981L) | var8 & a(27800, 3792734842716861107L));
            var9 = 1;
         }

         if (var4 != null) {
            break;
         }
      }

      return new String(var3, 0, var7);
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ 28797) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 1;
               break;
            case 1:
               var10000 = 181;
               break;
            case 2:
               var10000 = 20;
               break;
            case 3:
               var10000 = 29;
               break;
            case 4:
               var10000 = 226;
               break;
            case 5:
               var10000 = 7;
               break;
            case 6:
               var10000 = 71;
               break;
            case 7:
               var10000 = 229;
               break;
            case 8:
               var10000 = 221;
               break;
            case 9:
               var10000 = 179;
               break;
            case 10:
               var10000 = 196;
               break;
            case 11:
               var10000 = 211;
               break;
            case 12:
               var10000 = 195;
               break;
            case 13:
               var10000 = 172;
               break;
            case 14:
               var10000 = 235;
               break;
            case 15:
               var10000 = 145;
               break;
            case 16:
               var10000 = 65;
               break;
            case 17:
               var10000 = 103;
               break;
            case 18:
               var10000 = 8;
               break;
            case 19:
               var10000 = 167;
               break;
            case 20:
               var10000 = 203;
               break;
            case 21:
               var10000 = 180;
               break;
            case 22:
               var10000 = 95;
               break;
            case 23:
               var10000 = 250;
               break;
            case 24:
               var10000 = 165;
               break;
            case 25:
               var10000 = 132;
               break;
            case 26:
               var10000 = 21;
               break;
            case 27:
               var10000 = 187;
               break;
            case 28:
               var10000 = 102;
               break;
            case 29:
               var10000 = 246;
               break;
            case 30:
               var10000 = 18;
               break;
            case 31:
               var10000 = 55;
               break;
            case 32:
               var10000 = 178;
               break;
            case 33:
               var10000 = 58;
               break;
            case 34:
               var10000 = 148;
               break;
            case 35:
               var10000 = 97;
               break;
            case 36:
               var10000 = 34;
               break;
            case 37:
               var10000 = 85;
               break;
            case 38:
               var10000 = 161;
               break;
            case 39:
               var10000 = 182;
               break;
            case 40:
               var10000 = 51;
               break;
            case 41:
               var10000 = 220;
               break;
            case 42:
               var10000 = 109;
               break;
            case 43:
               var10000 = 16;
               break;
            case 44:
               var10000 = 27;
               break;
            case 45:
               var10000 = 252;
               break;
            case 46:
               var10000 = 242;
               break;
            case 47:
               var10000 = 207;
               break;
            case 48:
               var10000 = 38;
               break;
            case 49:
               var10000 = 2;
               break;
            case 50:
               var10000 = 6;
               break;
            case 51:
               var10000 = 130;
               break;
            case 52:
               var10000 = 44;
               break;
            case 53:
               var10000 = 89;
               break;
            case 54:
               var10000 = 231;
               break;
            case 55:
               var10000 = 225;
               break;
            case 56:
               var10000 = 193;
               break;
            case 57:
               var10000 = 78;
               break;
            case 58:
               var10000 = 26;
               break;
            case 59:
               var10000 = 233;
               break;
            case 60:
               var10000 = 185;
               break;
            case 61:
               var10000 = 122;
               break;
            case 62:
               var10000 = 166;
               break;
            case 63:
               var10000 = 105;
               break;
            case 64:
               var10000 = 83;
               break;
            case 65:
               var10000 = 175;
               break;
            case 66:
               var10000 = 230;
               break;
            case 67:
               var10000 = 4;
               break;
            case 68:
               var10000 = 48;
               break;
            case 69:
               var10000 = 140;
               break;
            case 70:
               var10000 = 93;
               break;
            case 71:
               var10000 = 157;
               break;
            case 72:
               var10000 = 152;
               break;
            case 73:
               var10000 = 218;
               break;
            case 74:
               var10000 = 173;
               break;
            case 75:
               var10000 = 59;
               break;
            case 76:
               var10000 = 37;
               break;
            case 77:
               var10000 = 150;
               break;
            case 78:
               var10000 = 212;
               break;
            case 79:
               var10000 = 224;
               break;
            case 80:
               var10000 = 14;
               break;
            case 81:
               var10000 = 227;
               break;
            case 82:
               var10000 = 9;
               break;
            case 83:
               var10000 = 3;
               break;
            case 84:
               var10000 = 190;
               break;
            case 85:
               var10000 = 119;
               break;
            case 86:
               var10000 = 49;
               break;
            case 87:
               var10000 = 125;
               break;
            case 88:
               var10000 = 149;
               break;
            case 89:
               var10000 = 228;
               break;
            case 90:
               var10000 = 56;
               break;
            case 91:
               var10000 = 176;
               break;
            case 92:
               var10000 = 133;
               break;
            case 93:
               var10000 = 138;
               break;
            case 94:
               var10000 = 121;
               break;
            case 95:
               var10000 = 101;
               break;
            case 96:
               var10000 = 241;
               break;
            case 97:
               var10000 = 54;
               break;
            case 98:
               var10000 = 222;
               break;
            case 99:
               var10000 = 28;
               break;
            case 100:
               var10000 = 142;
               break;
            case 101:
               var10000 = 79;
               break;
            case 102:
               var10000 = 22;
               break;
            case 103:
               var10000 = 15;
               break;
            case 104:
               var10000 = 198;
               break;
            case 105:
               var10000 = 57;
               break;
            case 106:
               var10000 = 248;
               break;
            case 107:
               var10000 = 139;
               break;
            case 108:
               var10000 = 33;
               break;
            case 109:
               var10000 = 99;
               break;
            case 110:
               var10000 = 42;
               break;
            case 111:
               var10000 = 170;
               break;
            case 112:
               var10000 = 156;
               break;
            case 113:
               var10000 = 236;
               break;
            case 114:
               var10000 = 155;
               break;
            case 115:
               var10000 = 208;
               break;
            case 116:
               var10000 = 67;
               break;
            case 117:
               var10000 = 217;
               break;
            case 118:
               var10000 = 188;
               break;
            case 119:
               var10000 = 45;
               break;
            case 120:
               var10000 = 47;
               break;
            case 121:
               var10000 = 23;
               break;
            case 122:
               var10000 = 75;
               break;
            case 123:
               var10000 = 234;
               break;
            case 124:
               var10000 = 35;
               break;
            case 125:
               var10000 = 10;
               break;
            case 126:
               var10000 = 64;
               break;
            case 127:
               var10000 = 159;
               break;
            case 128:
               var10000 = 214;
               break;
            case 129:
               var10000 = 144;
               break;
            case 130:
               var10000 = 249;
               break;
            case 131:
               var10000 = 12;
               break;
            case 132:
               var10000 = 72;
               break;
            case 133:
               var10000 = 143;
               break;
            case 134:
               var10000 = 100;
               break;
            case 135:
               var10000 = 153;
               break;
            case 136:
               var10000 = 90;
               break;
            case 137:
               var10000 = 69;
               break;
            case 138:
               var10000 = 82;
               break;
            case 139:
               var10000 = 206;
               break;
            case 140:
               var10000 = 135;
               break;
            case 141:
               var10000 = 189;
               break;
            case 142:
               var10000 = 80;
               break;
            case 143:
               var10000 = 184;
               break;
            case 144:
               var10000 = 86;
               break;
            case 145:
               var10000 = 131;
               break;
            case 146:
               var10000 = 147;
               break;
            case 147:
               var10000 = 0;
               break;
            case 148:
               var10000 = 43;
               break;
            case 149:
               var10000 = 39;
               break;
            case 150:
               var10000 = 164;
               break;
            case 151:
               var10000 = 177;
               break;
            case 152:
               var10000 = 158;
               break;
            case 153:
               var10000 = 87;
               break;
            case 154:
               var10000 = 169;
               break;
            case 155:
               var10000 = 247;
               break;
            case 156:
               var10000 = 111;
               break;
            case 157:
               var10000 = 160;
               break;
            case 158:
               var10000 = 81;
               break;
            case 159:
               var10000 = 115;
               break;
            case 160:
               var10000 = 25;
               break;
            case 161:
               var10000 = 53;
               break;
            case 162:
               var10000 = 17;
               break;
            case 163:
               var10000 = 183;
               break;
            case 164:
               var10000 = 128;
               break;
            case 165:
               var10000 = 24;
               break;
            case 166:
               var10000 = 134;
               break;
            case 167:
               var10000 = 237;
               break;
            case 168:
               var10000 = 13;
               break;
            case 169:
               var10000 = 186;
               break;
            case 170:
               var10000 = 163;
               break;
            case 171:
               var10000 = 209;
               break;
            case 172:
               var10000 = 243;
               break;
            case 173:
               var10000 = 74;
               break;
            case 174:
               var10000 = 191;
               break;
            case 175:
               var10000 = 126;
               break;
            case 176:
               var10000 = 232;
               break;
            case 177:
               var10000 = 61;
               break;
            case 178:
               var10000 = 73;
               break;
            case 179:
               var10000 = 254;
               break;
            case 180:
               var10000 = 137;
               break;
            case 181:
               var10000 = 91;
               break;
            case 182:
               var10000 = 253;
               break;
            case 183:
               var10000 = 240;
               break;
            case 184:
               var10000 = 107;
               break;
            case 185:
               var10000 = 194;
               break;
            case 186:
               var10000 = 141;
               break;
            case 187:
               var10000 = 251;
               break;
            case 188:
               var10000 = 68;
               break;
            case 189:
               var10000 = 192;
               break;
            case 190:
               var10000 = 201;
               break;
            case 191:
               var10000 = 41;
               break;
            case 192:
               var10000 = 245;
               break;
            case 193:
               var10000 = 255;
               break;
            case 194:
               var10000 = 36;
               break;
            case 195:
               var10000 = 46;
               break;
            case 196:
               var10000 = 5;
               break;
            case 197:
               var10000 = 110;
               break;
            case 198:
               var10000 = 162;
               break;
            case 199:
               var10000 = 174;
               break;
            case 200:
               var10000 = 63;
               break;
            case 201:
               var10000 = 127;
               break;
            case 202:
               var10000 = 50;
               break;
            case 203:
               var10000 = 202;
               break;
            case 204:
               var10000 = 30;
               break;
            case 205:
               var10000 = 106;
               break;
            case 206:
               var10000 = 215;
               break;
            case 207:
               var10000 = 146;
               break;
            case 208:
               var10000 = 213;
               break;
            case 209:
               var10000 = 239;
               break;
            case 210:
               var10000 = 238;
               break;
            case 211:
               var10000 = 204;
               break;
            case 212:
               var10000 = 124;
               break;
            case 213:
               var10000 = 62;
               break;
            case 214:
               var10000 = 52;
               break;
            case 215:
               var10000 = 136;
               break;
            case 216:
               var10000 = 32;
               break;
            case 217:
               var10000 = 98;
               break;
            case 218:
               var10000 = 104;
               break;
            case 219:
               var10000 = 66;
               break;
            case 220:
               var10000 = 19;
               break;
            case 221:
               var10000 = 40;
               break;
            case 222:
               var10000 = 129;
               break;
            case 223:
               var10000 = 76;
               break;
            case 224:
               var10000 = 210;
               break;
            case 225:
               var10000 = 244;
               break;
            case 226:
               var10000 = 31;
               break;
            case 227:
               var10000 = 11;
               break;
            case 228:
               var10000 = 77;
               break;
            case 229:
               var10000 = 112;
               break;
            case 230:
               var10000 = 117;
               break;
            case 231:
               var10000 = 114;
               break;
            case 232:
               var10000 = 199;
               break;
            case 233:
               var10000 = 223;
               break;
            case 234:
               var10000 = 120;
               break;
            case 235:
               var10000 = 123;
               break;
            case 236:
               var10000 = 118;
               break;
            case 237:
               var10000 = 200;
               break;
            case 238:
               var10000 = 219;
               break;
            case 239:
               var10000 = 96;
               break;
            case 240:
               var10000 = 70;
               break;
            case 241:
               var10000 = 84;
               break;
            case 242:
               var10000 = 154;
               break;
            case 243:
               var10000 = 205;
               break;
            case 244:
               var10000 = 60;
               break;
            case 245:
               var10000 = 88;
               break;
            case 246:
               var10000 = 151;
               break;
            case 247:
               var10000 = 94;
               break;
            case 248:
               var10000 = 116;
               break;
            case 249:
               var10000 = 197;
               break;
            case 250:
               var10000 = 108;
               break;
            case 251:
               var10000 = 216;
               break;
            case 252:
               var10000 = 92;
               break;
            case 253:
               var10000 = 168;
               break;
            case 254:
               var10000 = 113;
               break;
            default:
               var10000 = 171;
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
            var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24098;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      byte[] var7;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "s\u001a¹@}¤.ó\u0096R\u0014B~üöF\u009c\u0002\u0012Kb«\u0019êÛZ4¨¦5Ëqçãªã\u001fU3ÜJe\u001d#\u000e\u0086\u009aÁ";
      int var12 = "s\u001a¹@}¤.ó\u0096R\u0014B~üöF\u009c\u0002\u0012Kb«\u0019êÛZ4¨¦5Ëqçãªã\u001fU3ÜJe\u001d#\u000e\u0086\u009aÁ".length();
      char var9 = 22;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 57;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 122;
                        break;
                     case 1:
                        var65 = 70;
                        break;
                     case 2:
                        var65 = 32;
                        break;
                     case 3:
                        var65 = 54;
                        break;
                     case 4:
                        var65 = 51;
                        break;
                     case 5:
                        var65 = 111;
                        break;
                     default:
                        var65 = 121;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     d = new String[4];
                     long var0 = 2357545643367823399L;
                     long[] var6 = new long[20];
                     int var3 = 0;
                     String var4 = "/oð*>\u008d\u0016þAdÃØé\u0007Ú'l\u000eÔ}¿eÿý\u0014oHä³*\u009b01òðuàS\u0097\u0095q7\b:\u0083ägÅ\ry\u008a²½ç\u0092d\fÛáYï\u0092ëõi\u008d8æa©pµû\u009cÂ\u00935×Ê«Ø\u0083Ø\u0080¾pÉ\u009a\u0017d\u00adlJ.Ò©îô1hÄÍ\\¹ß!\u0015Í¹~ý<?7\u00ad\u0095d\u008f\u001c#\u0098¨\u0086³X\t0¼q8pÎµ\u0095ôI1ª\t-Ö\u001b½*";
                     int var5 = "/oð*>\u008d\u0016þAdÃØé\u0007Ú'l\u000eÔ}¿eÿý\u0014oHä³*\u009b01òðuàS\u0097\u0095q7\b:\u0083ägÅ\ry\u008a²½ç\u0092d\fÛáYï\u0092ëõi\u008d8æa©pµû\u009cÂ\u00935×Ê«Ø\u0083Ø\u0080¾pÉ\u009a\u0017d\u00adlJ.Ò©îô1hÄÍ\\¹ß!\u0015Í¹~ý<?7\u00ad\u0095d\u008f\u001c#\u0098¨\u0086³X\t0¼q8pÎµ\u0095ôI1ª\t-Ö\u001b½*"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[20];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0099\u008fýã-6plzÀõÏ\u0017¿=\u000f";
                                 var5 = "\u0099\u008fýã-6plzÀõÏ\u0017¿=\u000f".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "×{nÂ\u00120¬{<\u008f\u0081Úý¢98\u0085Q®¡´Î\u0097";
                  var12 = "×{nÂ\u00120¬{<\u008f\u0081Úý¢98\u0085Q®¡´Î\u0097".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 95;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





