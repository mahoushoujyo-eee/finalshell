package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class I4 {
   public int X;
   public byte[] c;
   public int u;
   public int d;
   public int[][] m;
   public int[] q = new int[a(5290, 1521622656332694852L)];
   public int[] l = new int[a(5321, 3772957331856065837L)];
   public int[] B;
   public int[] g;
   public static long[] a;
   public static Integer[] b;

   public I4(byte[] var1, int var2, int var3) {
      Ky4[] var10000 = Kj4.d();
      this.B = new int[a(5321, 3772957331856065837L)];
      this.g = new int[a(2726, 5453761995530148700L)];
      this.c = var1;
      this.u = var2;
      this.d = var3;
      this.m = new int[a(5321, 3772957331856065837L)][];
      Ky4[] var4 = var10000;
      int var5 = 0;

      while (var5 < a(5321, 3772957331856065837L)) {
         this.m[var5] = new int[4];
         int[] var6 = this.m[var5];
         var6[0] = var6[1] = var6[2] = (var5 << a(16161, 4009672161975774942L)) / a(5321, 3772957331856065837L);
         this.B[var5] = a(5321, 3772957331856065837L);
         this.l[var5] = 0;
         var5++;
         if (var4 == null) {
            break;
         }
      }
   }

   public byte[] p() {
      byte[] var9;
      Ky4[] var10000 = Kj4.d();
      byte[] var2 = new byte[a(19858, 1660691168488152167L)];
      int[] var3 = new int[a(5321, 3772957331856065837L)];
      int var4 = 0;
      Ky4[] var1 = var10000;

      while (true) {
         if (var4 < a(5321, 3772957331856065837L)) {
            var3[this.m[var4][3]] = var4++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         var4 = 0;
         break;
      }

      int var5 = 0;

      while (true) {
         if (var5 < a(5321, 3772957331856065837L)) {
            int var6 = var3[var5];
            var2[var4++] = (byte)this.m[var6][0];
            var2[var4++] = (byte)this.m[var6][1];
            var9 = var2;
            if (var1 == null) {
               break;
            }

            var2[var4++] = (byte)this.m[var6][2];
            var5++;
            if (var1 != null) {
               continue;
            }
         }

         var9 = var2;
         break;
      }

      return var9;
   }

   public void m() {
      int var15;
      int var16;
      int var17;
      int var9;
      Ky4[] var10000 = Kj4.d();
      int var8 = 0;
      var9 = 0;
      Ky4[] var1 = var10000;
      int var2 = 0;

      while (true) {
         if (var2 < a(5321, 3772957331856065837L)) {
            int[] var6 = this.m[var2];
            int var4 = var2;
            int var5 = var6[1];
            var16 = var2 + 1;
            if (var1 == null) {
               break;
            }

            int var3 = var16;

            int[] var7;
            int var10001;
            label77: {
               while (var3 < a(5321, 3772957331856065837L)) {
                  var7 = this.m[var3];
                  if (var1 != null) {
                     var17 = var7[1];
                     var10001 = var5;
                     if (var1 == null) {
                        break label77;
                     }

                     if (var17 < var5) {
                        var4 = var3;
                        var5 = var7[1];
                     }

                     var3++;
                  }

                  if (var1 == null) {
                     break;
                  }
               }

               var7 = this.m[var4];
               var17 = var2;
               var10001 = var4;
            }

            if (var1 != null) {
               if (var17 != var10001) {
                  var3 = var7[0];
                  var7[0] = var6[0];
                  var6[0] = var3;
                  var3 = var7[1];
                  var7[1] = var6[1];
                  var6[1] = var3;
                  var3 = var7[2];
                  var7[2] = var6[2];
                  var6[2] = var3;
                  var3 = var7[3];
                  var7[3] = var6[3];
                  var6[3] = var3;
               }

               var17 = var5;
               var10001 = var8;
            }

            label89: {
               if (var1 != null) {
                  if (var17 == var10001) {
                     break label89;
                  }

                  this.q[var8] = var9 + var2 >> 1;
                  var17 = var8;
                  var10001 = 1;
               }

               var3 = var17 + var10001;

               while (true) {
                  if (var3 < var5) {
                     this.q[var3] = var2;
                     var3++;
                     if (var1 == null) {
                        break;
                     }

                     if (var1 != null) {
                        continue;
                     }
                  }

                  var8 = var5;
                  break;
               }

               var9 = var2;
            }

            var2++;
            if (var1 != null) {
               continue;
            }
         }

         this.q[var8] = var9 + a(15506, 8562166995979119995L) >> 1;
         var16 = var8 + 1;
         break;
      }

      var15 = var16;

      while (var15 < a(5321, 3772957331856065837L)) {
         this.q[var15] = a(15506, 8562166995979119995L);
         var15++;
         if (var1 == null) {
            break;
         }
      }
   }

   public void o() {
      int var17;
      int var18;
      Ky4[] var1 = Kj4.d();
      I4 var10000 = this;
      if (var1 != null) {
         if (this.u < a(30310, 7530069800600430485L)) {
            this.d = 1;
         }

         this.X = a(16711, 6887362107516211379L) + (this.d - 1) / 3;
         var10000 = this;
      }

      byte[] var13 = var10000.c;
      int var14 = 0;
      int var15 = this.u;
      int var12 = this.u / (3 * this.d);
      int var11 = var12 / a(18036, 2268913273344972687L);
      int var9 = a(12674, 6204344715817492597L);
      int var7 = a(24439, 595035805799665296L);
      int var8 = var7 >> a(10340, 4700886911163611535L);
      var17 = var8;
      if (var1 != null) {
         if (var8 <= 1) {
            var8 = 0;
         }

         var17 = 0;
      }

      int var2 = var17;

      int var10;
      label143: {
         int var10001;
         label138: {
            while (true) {
               if (var2 < var8) {
                  this.g[var2] = var9 * ((var8 * var8 - var2 * var2) * a(5321, 3772957331856065837L) / (var8 * var8));
                  var2++;
                  if (var1 == null) {
                     break;
                  }

                  if (var1 != null) {
                     continue;
                  }
               }

               var18 = this.u;
               var10001 = a(6014, 7336281413165221511L);
               if (var1 == null) {
                  break label138;
               }

               if (var18 < var10001) {
                  var10 = 3;
                  if (var1 != null) {
                     break label143;
                  }
               }
               break;
            }

            var18 = this.u;
            var10001 = a(26754, 8985540181554428275L);
         }

         int var19 = var18 % var10001;
         if (var1 != null) {
            if (var19 != 0) {
               var10 = a(12879, 2024936490490373042L);
               if (var1 != null) {
                  break label143;
               }
            }

            var19 = this.u % a(29223, 8520723513390523351L);
         }

         if (var1 != null) {
            if (var19 != 0) {
               var10 = a(21815, 5556884296238548178L);
               if (var1 != null) {
                  break label143;
               }
            }

            var19 = this.u % a(32055, 1460606690241080532L);
         }

         if (var1 != null) {
            if (var19 != 0) {
               var10 = a(28633, 2352826868890205759L);
               if (var1 != null) {
                  break label143;
               }
            }

            var19 = a(6014, 7336281413165221511L);
         }

         var10 = var19;
      }

      var2 = 0;

      label104:
      while (var2 < var12) {
         int var4 = (var13[var14] & a(6194, 5070119436041882048L)) << 4;
         int var5 = (var13[var14 + 1] & a(15506, 8562166995979119995L)) << 4;
         int var6 = (var13[var14 + 2] & a(15506, 8562166995979119995L)) << 4;
         int var3 = this.z(var4, var5, var6);
         this.u(var9, var3, var4, var5, var6);

         label102:
         while (true) {
            int var20 = var8;
            if (var1 != null) {
               if (var8 != 0) {
                  this.i(var8, var3, var4, var5, var6);
               }

               var14 += var10;
               var20 = var14;
            }

            if (var1 != null) {
               if (var20 >= var15) {
                  var14 -= this.u;
               }

               var2++;
               var20 = var11;
            }

            if (var1 != null) {
               if (var20 == 0) {
                  var11 = 1;
               }

               var20 = var2 % var11;
            }

            if (var1 != null) {
               if (var20 != 0) {
                  break;
               }

               var9 -= var9 / this.X;
               var7 -= var7 / a(3017, 6861329322180057633L);
               var8 = var7 >> a(26777, 7378619417581648231L);
               var20 = var8;
            }

            if (var1 != null) {
               if (var20 <= 1) {
                  var8 = 0;
               }

               var20 = 0;
            }

            var3 = var20;

            do {
               if (var3 >= var8) {
                  continue label104;
               }

               this.g[var3] = var9 * ((var8 * var8 - var3 * var3) * a(5321, 3772957331856065837L) / (var8 * var8));
               var3++;
               if (var1 == null) {
                  continue label102;
               }
            } while (var1 != null && var1 != null);

            return;
         }
      }
   }

   public int Q(int var1, int var2, int var3) {
      int var17;
      int var18;
      int var9 = a(24059, 8099749641299872775L);
      int var11 = -1;
      Ky4[] var10000 = Kj4.d();
      int var5 = this.q[var2];
      Ky4[] var4 = var10000;
      int var6 = var5 - 1;

      label135:
      while (true) {
         var17 = var5;

         while (true) {
            label130: {
               if (var17 >= a(5321, 3772957331856065837L)) {
                  var17 = var6;
                  if (var4 == null) {
                     break label130;
                  }

                  if (var4 == null) {
                     return var6;
                  }

                  if (var6 < 0) {
                     break;
                  }
               }

               var17 = var5;
            }

            label124:
            if (var4 != null) {
               label122:
               if (var17 < a(5321, 3772957331856065837L)) {
                  int[] var10 = this.m[var5];
                  int var7 = var10[1] - var2;
                  var18 = var7;
                  if (var4 != null) {
                     if (var7 >= var9) {
                        var5 = a(5321, 3772957331856065837L);
                        if (var4 != null) {
                           break label122;
                        }
                     }

                     var5++;
                     var18 = var7;
                  }

                  if (var4 != null) {
                     if (var18 < 0) {
                        var7 = -var7;
                     }

                     var18 = var10[0] - var1;
                  }

                  int var8 = var18;
                  var17 = var8;
                  if (var4 != null) {
                     if (var8 < 0) {
                        var8 = -var8;
                     }

                     var7 += var8;
                     var17 = var7;
                  }

                  if (var4 == null) {
                     break label124;
                  }

                  if (var17 < var9) {
                     var8 = var10[2] - var3;
                     var17 = var8;
                     if (var4 != null) {
                        if (var8 < 0) {
                           var8 = -var8;
                        }

                        var7 += var8;
                        var17 = var7;
                     }

                     if (var4 == null) {
                        break label124;
                     }

                     if (var17 < var9) {
                        var9 = var7;
                        var11 = var10[3];
                     }
                  }
               }

               var17 = var6;
            }

            if (var4 != null) {
               if (var17 < 0) {
                  continue label135;
               }

               int[] var16 = this.m[var6];
               int var12 = var2 - var16[1];
               int var19 = var12;
               if (var4 != null) {
                  if (var12 >= var9) {
                     var6 = -1;
                     if (var4 != null) {
                        continue label135;
                     }
                  }

                  var6--;
                  var19 = var12;
               }

               if (var4 != null) {
                  if (var19 < 0) {
                     var12 = -var12;
                  }

                  var19 = var16[0] - var1;
               }

               int var14 = var19;
               int var20 = var14;
               if (var4 != null) {
                  if (var14 < 0) {
                     var14 = -var14;
                  }

                  var12 += var14;
                  var20 = var12;
               }

               int var10001 = var9;
               if (var4 != null) {
                  if (var20 >= var9) {
                     continue label135;
                  }

                  var20 = var16[2];
                  var10001 = var3;
               }

               var14 = var20 - var10001;
               int var21 = var14;
               if (var4 != null) {
                  if (var14 < 0) {
                     var14 = -var14;
                  }

                  var12 += var14;
                  var21 = var12;
               }

               if (var4 != null) {
                  if (var21 >= var9) {
                     continue label135;
                  }

                  var9 = var12;
                  var21 = var16[3];
               }

               var11 = var21;
               if (var4 != null) {
                  continue label135;
               }
               break;
            }
         }

         return var11;
      }
   }

   public byte[] Q() {
      this.o();
      this.V();
      this.m();
      return this.p();
   }

   public void V() {
      Ky4[] var10000 = Kj4.d();
      int var2 = 0;
      Ky4[] var1 = var10000;

      while (var2 < a(5321, 3772957331856065837L)) {
         this.m[var2][0] = this.m[var2][0] >> 4;
         this.m[var2][1] = this.m[var2][1] >> 4;
         this.m[var2][2] = this.m[var2][2] >> 4;
         this.m[var2][3] = var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void i(int var1, int var2, int var3, int var4, int var5) {
      int var24;
      int var25;
      Exception var27;
      int var9;
      Ky4[] var10000 = Kj4.d();
      var9 = var2 - var1;
      Ky4[] var6 = var10000;

      int var10001;
      label114: {
         label113: {
            try {
               var24 = var9;
               var10001 = -1;
               if (var6 == null) {
                  break label114;
               }

               if (var9 >= -1) {
                  break label113;
               }
            } catch (Exception var22) {
               throw new RuntimeException(a(var22));
            }

            var9 = -1;
         }

         var24 = var2;
         var10001 = var1;
      }

      int var10 = var24 + var10001;

      label104: {
         label103: {
            try {
               var25 = var10;
               var10001 = a(5321, 3772957331856065837L);
               if (var6 == null) {
                  break label104;
               }

               if (var10 <= var10001) {
                  break label103;
               }
            } catch (Exception var21) {
               throw new RuntimeException(a(var21));
            }

            var10 = a(5321, 3772957331856065837L);
         }

         var25 = var2;
         var10001 = 1;
      }

      int var7 = var25 + var10001;
      int var8 = var2 - 1;
      int var12 = 1;

      while (true) {
         int var26 = var7;
         var10001 = var10;

         while (true) {
            label79: {
               while (true) {
                  if (var26 >= var10001) {
                     try {
                        var26 = var8;
                        if (var6 == null) {
                           break label79;
                        }

                        var10001 = var9;
                        if (var6 == null) {
                           continue;
                        }
                     } catch (Exception var17) {
                        throw new RuntimeException(a(var17));
                     }

                     try {
                        if (var26 <= var10001) {
                           return;
                        }
                     } catch (Exception var19) {
                        var27 = var19;
                        boolean var30 = false;
                        break;
                     }
                  }

                  try {
                     var26 = this.g[var12++];
                     break label79;
                  } catch (Exception var18) {
                     var27 = var18;
                     boolean var31 = false;
                     break;
                  }
               }

               throw new RuntimeException(a(var27));
            }

            int var11 = var26;

            label89: {
               label119: {
                  try {
                     var26 = var7;
                     var10001 = var10;
                     if (var6 == null) {
                        break label89;
                     }

                     if (var7 >= var10) {
                        break label119;
                     }
                  } catch (Exception var20) {
                     throw new RuntimeException(a(var20));
                  }

                  int[] var13 = this.m[var7++];

                  try {
                     var13[0] -= var11 * (var13[0] - var3) / a(24685, 3444984586123637132L);
                     var13[1] -= var11 * (var13[1] - var4) / a(17622, 2847149764118402336L);
                     var13[2] -= var11 * (var13[2] - var5) / a(17622, 2847149764118402336L);
                  } catch (Exception var15) {
                  }
               }

               var26 = var8;
               var10001 = var9;
            }

            if (var6 != null) {
               if (var26 <= var10001) {
                  break;
               }

               int[] var23 = this.m[var8--];

               try {
                  var23[0] -= var11 * (var23[0] - var3) / a(17622, 2847149764118402336L);
                  var23[1] -= var11 * (var23[1] - var4) / a(17622, 2847149764118402336L);
                  var23[2] -= var11 * (var23[2] - var5) / a(17622, 2847149764118402336L);
               } catch (Exception var16) {
                  if (var6 == null) {
                     return;
                  }
               }
               break;
            }
         }
      }
   }

   public void u(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = this.m[var2];
      var6[0] -= var1 * (var6[0] - var3) / a(8276, 5155741919219036588L);
      var6[1] -= var1 * (var6[1] - var4) / a(8276, 5155741919219036588L);
      var6[2] -= var1 * (var6[2] - var5) / a(8276, 5155741919219036588L);
   }

   public int z(int var1, int var2, int var3) {
      int var15;
      int var16;
      int var17;
      int var12 = a(31094, 8481115058235566235L);
      Ky4[] var10000 = Kj4.d();
      int var13 = var12;
      int var10 = -1;
      Ky4[] var4 = var10000;
      int var11 = var10;
      int var5 = 0;

      while (true) {
         if (var5 < a(5321, 3772957331856065837L)) {
            int[] var14 = this.m[var5];
            int var6 = var14[0] - var1;
            var15 = var6;
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               if (var6 < 0) {
                  var6 = -var6;
               }

               var15 = var14[1] - var2;
            }

            int var7 = var15;
            var16 = var7;
            if (var4 != null) {
               if (var7 < 0) {
                  var7 = -var7;
               }

               var6 += var7;
               var7 = var14[2] - var3;
               var16 = var7;
            }

            if (var4 != null) {
               if (var16 < 0) {
                  var7 = -var7;
               }

               var6 += var7;
               var16 = var6;
            }

            int var10001 = var12;
            if (var4 != null) {
               if (var16 < var12) {
                  var12 = var6;
                  var10 = var5;
               }

               var16 = var6;
               var10001 = this.l[var5] >> a(7591, 1553456663447997517L);
            }

            int var8 = var16 - var10001;
            var17 = var8;
            var10001 = var13;
            if (var4 != null) {
               if (var8 < var13) {
                  var13 = var8;
                  var11 = var5;
               }

               var17 = this.B[var5];
               var10001 = a(9676, 59332022323852323L);
            }

            int var9 = var17 >> var10001;
            this.B[var5] = this.B[var5] - var9;
            this.l[var5] = this.l[var5] + (var9 << a(30552, 1650642602783336122L));
            var5++;
            if (var4 != null) {
               continue;
            }
         }

         this.B[var10] = this.B[var10] + a(4925, 9022678360827757277L);
         this.l[var10] = this.l[var10] - a(15777, 6195606620812749901L);
         var15 = var11;
         break;
      }

      return var15;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4601;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2007175099901810564L;
      long[] var6 = new long[32];
      int var3 = 0;
      String var4 = "\u009a\u0080\u001c´\u001b«\u0094æ(:\n\u0084ÿ\f\"(á\bã\u001b¼M@oË\u00823n®±\u008cø\u000fõ\u0012i\u001fÏ±ïªÎ\u0093\u0094\u0004îØkEuÂd?þ¹V\u009cæY\u001e*hîåîë\u0086«c$ï\u00049em\u0019k]õ¸8T\"<\u0001\u0007uôæxõ$Ý¼\u009e»\u0080\u001b§\bÄõHã,\u00899<þUG),\u0084¸ýÍ÷³ñET\\yG1B¤\u007fS[8Ñ@º\u0000s\u0012rf\b+\u008d»4\u0002}\u009c*\u0098®\rÁ\u008b\u0090\u008c¹`\u001bÅÊ>µ)ù\u000f\u0000à Ay\u008c63;ÉÉÜ¦\u0089\u009dÃ#\u00ad2^·i\u0017M\u0093ÀI8Æ\u008cÿ4f\bVÇÎyT\u0016\u0015\u0019\u0093\u0096>ý¿Èú·ùÆb\u009bÉ®ñ4\u0087×9á\b\u0096Ö\u0097BO##bT\u0093©";
      int var5 = "\u009a\u0080\u001c´\u001b«\u0094æ(:\n\u0084ÿ\f\"(á\bã\u001b¼M@oË\u00823n®±\u008cø\u000fõ\u0012i\u001fÏ±ïªÎ\u0093\u0094\u0004îØkEuÂd?þ¹V\u009cæY\u001e*hîåîë\u0086«c$ï\u00049em\u0019k]õ¸8T\"<\u0001\u0007uôæxõ$Ý¼\u009e»\u0080\u001b§\bÄõHã,\u00899<þUG),\u0084¸ýÍ÷³ñET\\yG1B¤\u007fS[8Ñ@º\u0000s\u0012rf\b+\u008d»4\u0002}\u009c*\u0098®\rÁ\u008b\u0090\u008c¹`\u001bÅÊ>µ)ù\u000f\u0000à Ay\u008c63;ÉÉÜ¦\u0089\u009dÃ#\u00ad2^·i\u0017M\u0093ÀI8Æ\u008cÿ4f\bVÇÎyT\u0016\u0015\u0019\u0093\u0096>ý¿Èú·ùÆb\u009bÉ®ñ4\u0087×9á\b\u0096Ö\u0097BO##bT\u0093©"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     b = new Integer[32];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "è\u001b!!ÆûÑ\u0014\u00130.Ô%\u0099ì\u000e";
                  var5 = "è\u001b!!ÆûÑ\u0014\u00130.Ô%\u0099ì\u000e".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





