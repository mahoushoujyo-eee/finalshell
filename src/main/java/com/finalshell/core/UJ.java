package com.finalshell.core;

public class UJ {
   public final byte[] l = new byte[4];
   public byte[] g;
   public int X;
   public int Z;
   public static long[] a;
   public static Integer[] b;
   public static long[] c;
   public static Long[] d;

   public UJ(int var1) {
      this.g = new byte[var1];
      this.X = 0;
      this.Z = 0;
   }

   public UJ(byte[] var1) {
      this.g = var1;
      this.X = 0;
      this.Z = 0;
   }

   public UJ() {
      this(a(13254, 5500483342134397450L));
   }

   public void V(byte var1) {
      this.g[this.X++] = var1;
   }

   public void e(byte[] var1) {
      this.P(var1, 0, var1.length);
   }

   public void P(byte[] var1, int var2, int var3) {
      System.arraycopy(var1, var2, this.g, this.X, var3);
      this.X += var3;
   }

   public void q(byte[] var1) {
      this.l(var1, 0, var1.length);
   }

   public void l(byte[] var1, int var2, int var3) {
      this.u(var3);
      this.P(var1, var2, var3);
   }

   public void u(int var1) {
      this.l[0] = (byte)(var1 >>> a(23657, 1481021654533678497L));
      this.l[1] = (byte)(var1 >>> a(22671, 625972412490195277L));
      this.l[2] = (byte)(var1 >>> a(14872, 799791411457606617L));
      this.l[3] = (byte)var1;
      System.arraycopy(this.l, 0, this.g, this.X, 4);
      this.X += 4;
   }

   public void V(long var1) {
      this.l[0] = (byte)((int)(var1 >>> a(11343, 7823761778029614486L)));
      this.l[1] = (byte)((int)(var1 >>> a(30659, 160162379088432647L)));
      this.l[2] = (byte)((int)(var1 >>> a(14474, 4247655513863930199L)));
      this.l[3] = (byte)((int)(var1 >>> a(28621, 649813016768157198L)));
      System.arraycopy(this.l, 0, this.g, this.X, 4);
      this.l[0] = (byte)((int)(var1 >>> a(20550, 5005610954177259928L)));
      this.l[1] = (byte)((int)(var1 >>> a(22671, 625972412490195277L)));
      this.l[2] = (byte)((int)(var1 >>> a(14872, 799791411457606617L)));
      this.l[3] = (byte)((int)var1);
      System.arraycopy(this.l, 0, this.g, this.X + 4, 4);
      this.X = this.X + a(14872, 799791411457606617L);
   }

   public void S(int var1) {
      this.X += var1;
   }

   public void J(int var1) {
      boolean var2 = Dm4.F$boolean();

      while (var1 > 0) {
         this.g[this.X++] = 0;
         var1--;
         if (!var2) {
            break;
         }
      }
   }

   public void x(byte[] var1) {
      label17: {
         int var3;
         label16: {
            boolean var10000 = Dm4.F$boolean();
            var3 = var1.length;
            boolean var2 = var10000;
            if (var2) {
               if ((var1[0] & a(10814, 2579964628172493817L)) == 0) {
                  break label16;
               }

               this.u(++var3);
               this.V((byte)0);
            }

            if (var2) {
               break label17;
            }
         }

         this.u(var3);
      }

      this.e(var1);
   }

   public int P() {
      return this.X - this.Z;
   }

   public int R() {
      return this.Z;
   }

   public void Z(int var1) {
      this.Z = var1;
   }

   public long E() {
      long var1 = (long)this.d() & b(24721, 205470153976506057L);
      return var1 << a(12611, 3559914527733205126L) | (long)this.d() & b(25667, 5957028753900298778L);
   }

   public int d() {
      int var1 = this.c$int();
      return var1 << a(27875, 1697937455061636411L) & a(26115, 1605537971229368280L) | this.c$int() & a(22142, 3168044852373565346L);
   }

   public long K() {
      long var1 = 0L;
      long var3 = 0L;
      var1 = (long)this.r();
      var1 = var1 << a(14872, 799791411457606617L) & b(9151, 4739287720158733794L) | (long)(this.r() & a(9679, 3020366631504436245L));
      var3 = (long)this.r();
      var3 = var3 << a(14872, 799791411457606617L) & b(32533, 8369051866110687567L) | (long)(this.r() & a(9679, 3020366631504436245L));
      return var1 << a(22671, 625972412490195277L) & b(29961, 3825806452494889813L) | var3 & b(6222, 5154550432671014421L);
   }

   public int c$int() {
      int var1 = this.r();
      return var1 << a(26730, 5647035932439482789L) & a(27092, 7800845655292219423L) | this.r() & a(21352, 3605338777157184166L);
   }

   public int r() {
      return this.g[this.Z++] & a(9679, 3020366631504436245L);
   }

   public void W(byte[] var1) {
      this.G(var1, 0, var1.length);
   }

   public void G(byte[] var1, int var2, int var3) {
      System.arraycopy(this.g, this.Z, var1, var2, var3);
      this.Z += var3;
   }

   public int T(int var1) {
      int var2 = this.Z;
      this.Z += var1;
      return var2;
   }

   public byte[] e() {
      int var2;
      int var5;
      label21: {
         label20: {
            int var10000 = (Dm4.F$boolean()) ? 1 : 0;
            var2 = this.d();
            boolean var1 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
            var10000 = var2;
            if (var1) {
               if (var2 >= 0) {
                  var5 = var2;
                  if (!var1) {
                     break label21;
                  }

                  if (var2 <= a(6176, 3189787690981679584L)) {
                     break label20;
                  }
               }

               var10000 = a(14511, 7557912548441899362L);
            }

            var2 = var10000;
         }

         var5 = var2;
      }

      byte[] var3 = new byte[var5];
      this.G(var3, 0, var2);
      return var3;
   }

   public byte[] c$arrbyte() {
      boolean var10000 = Dm4.J$boolean();
      int var2 = this.d();
      boolean var1 = var10000;
      int var3 = (var2 + a(9907, 620760934282485612L)) / a(14872, 799791411457606617L);
      byte[] var4 = new byte[var3];
      this.G(var4, 0, var3);
      byte[] var6 = var4;
      if (!var1) {
         if ((var4[0] & a(10814, 2579964628172493817L)) != 0) {
            byte[] var5 = new byte[var4.length + 1];
            var5[0] = 0;
            System.arraycopy(var4, 0, var5, 1, var4.length);
            var4 = var5;
         }

         var6 = var4;
      }

      return var6;
   }

   public byte[] S() {
      int var2;
      int var5;
      label21: {
         label20: {
            int var10000 = (Dm4.J$boolean()) ? 1 : 0;
            var2 = this.d();
            boolean var1 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
            var10000 = var2;
            if (!var1) {
               if (var2 >= 0) {
                  var5 = var2;
                  if (var1) {
                     break label21;
                  }

                  if (var2 <= a(26765, 6742151809290670407L)) {
                     break label20;
                  }
               }

               var10000 = a(29245, 6991124047706065915L);
            }

            var2 = var10000;
         }

         var5 = var2;
      }

      byte[] var3 = new byte[var5];
      this.G(var3, 0, var2);
      return var3;
   }

   public byte[] C(int[] var1, int[] var2) {
      int var3 = this.d();
      var1[0] = this.T(var3);
      var2[0] = var3;
      return this.g;
   }

   public void m() {
      this.X = 0;
      this.Z = 0;
   }

   public void f() {
      boolean var1 = Dm4.J$boolean();
      UJ var10000 = this;
      if (!var1) {
         if (this.Z == 0) {
            return;
         }

         System.arraycopy(this.g, this.Z, this.g, 0, this.X - this.Z);
         this.X = this.X - this.Z;
         var10000 = this;
      }

      var10000.Z = 0;
   }

   public void a() {
      this.Z = 0;
   }

   public byte A() {
      return this.g[5];
   }

   public void X(int var1) {
      int var10000 = (Dm4.J$boolean()) ? 1 : 0;
      int var3 = this.X + var1 + a(16078, 7651718402987869959L);
      boolean var2 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      var10000 = this.g.length;
      int var10001 = var3;
      if (!var2) {
         if (var10000 >= var3) {
            return;
         }

         var10000 = this.g.length;
         var10001 = 2;
      }

      int var4 = var10000 * var10001;
      var10000 = var4;
      if (!var2) {
         if (var4 < var3) {
            var4 = var3;
         }

         var10000 = var4;
      }

      byte[] var5 = new byte[var10000];
      System.arraycopy(this.g, 0, var5, 0, this.X);
      this.g = var5;
   }

   public byte[][] U(int param1, String param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: iload 1
      // 04: anewarray 170
      // 07: astore 4
      // 09: istore 3
      // 0a: bipush 0
      // 0b: istore 5
      // 0d: iload 5
      // 0f: iload 1
      // 10: if_icmpge 53
      // 13: aload 0
      // 14: invokevirtual com/finalshell/core/UJ.d ()I
      // 17: istore 6
      // 19: aload 0
      // 1a: iload 3
      // 1b: ifeq 44
      // 1e: invokevirtual com/finalshell/core/UJ.P ()I
      // 21: iload 6
      // 23: if_icmpge 3a
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/UJ.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 2c: athrow
      // 2d: new com/finalshell/core/Pc2
      // 30: dup
      // 31: aload 2
      // 32: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic com/finalshell/core/UJ.a (Lcom/finalshell/core/Pc2;)Lcom/finalshell/core/Pc2;
      // 39: athrow
      // 3a: aload 4
      // 3c: iload 5
      // 3e: iload 6
      // 40: newarray 8
      // 42: aastore
      // 43: aload 0
      // 44: aload 4
      // 46: iload 5
      // 48: aaload
      // 49: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 4c: iinc 5 1
      // 4f: iload 3
      // 50: ifne 0d
      // 53: aload 4
      // 55: areturn
   }

   public static UJ h(byte[][] var0) {
      int var2 = var0.length * 4;
      boolean var10000 = Dm4.J$boolean();
      int var3 = 0;
      boolean var1 = var10000;

      while (var3 < var0.length) {
         var2 += var0[var3].length;
         var3++;
         if (var1) {
            break;
         }
      }

      UJ var5 = new UJ(var2);
      int var4 = 0;

      while (true) {
         if (var4 < var0.length) {
      int var6;
            var6 = var5;
            if (var1) {
               break;
            }

            var5.q(var0[var4]);
            var4++;
            if (!var1) {
      int var6;
               continue;
            }
         }

         var6 = var5;
         break;
      }

      return var6;
   }

   public static Pc2 a(Pc2 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31183;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 1624) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var8 = 7413961304399841567L;
      long[] var14 = new long[24];
      int var11 = 0;
      String var12 = "¤úû\u001eeÒ\u0098²\b\u007f|Ë\u0094[£F5)\u001c,Òfh}$2\u008a\u0012sá\u0013\u0015Ï¢\u000e\u008fpiæ\u0000ºçK\u0017Ù½\u0098X\rrfªTWÎ\u0098Âðÿª\u0090\u001a¬¦þ\fòé|uÚf\u000f\"-´c\f\u0082äðWáï_tÁ¹\u0017æ\f\u0088HÌ\u0007(ÿï\u000e\u000buÚ\u009f1\u009fTÁT2\u0092¨B\u008diõæ\u0099hJÎ\u008a\u0012Ü4²ÞÈÿ;.ÚþefVtdì\u0004·Ð´ \u009f\u0002´S\r×(H`³¸\"V\u009d\u0005YBæB\u0083\u007f8F\u0096Ç\u0007+\u0082ÿe}Uõ";
      int var13 = "¤úû\u001eeÒ\u0098²\b\u007f|Ë\u0094[£F5)\u001c,Òfh}$2\u008a\u0012sá\u0013\u0015Ï¢\u000e\u008fpiæ\u0000ºçK\u0017Ù½\u0098X\rrfªTWÎ\u0098Âðÿª\u0090\u001a¬¦þ\fòé|uÚf\u000f\"-´c\f\u0082äðWáï_tÁ¹\u0017æ\f\u0088HÌ\u0007(ÿï\u000e\u000buÚ\u009f1\u009fTÁT2\u0092¨B\u008diõæ\u0099hJÎ\u008a\u0012Ü4²ÞÈÿ;.ÚþefVtdì\u0004·Ð´ \u009f\u0002´S\r×(H`³¸\"V\u009d\u0005YBæB\u0083\u007f8F\u0096Ç\u0007+\u0082ÿe}Uõ"
         .length();
      byte var10 = 0;

      label38:
      while (true) {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes("ISO-8859-1");
         long[] var10000 = var14;
         var10001 = var11++;
         long var10002 = ((long)var15[0] & 255L) << 56
            | ((long)var15[1] & 255L) << 48
            | ((long)var15[2] & 255L) << 40
            | ((long)var15[3] & 255L) << 32
            | ((long)var15[4] & 255L) << 24
            | ((long)var15[5] & 255L) << 16
            | ((long)var15[6] & 255L) << 8
            | (long)var15[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var30 = var10002 ^ var8;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var30;
                  if (var10 >= var13) {
                     a = var14;
                     b = new Integer[24];
                     long var0 = 2356218982051855414L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\"k\u0002ªâr¥\u0000r\u0019f¹ØÇ¡ÓT\u0096 úìcºyg:\\àÒ\n]Ü";
                     int var5 = "\"k\u0002ªâr¥\u0000r\u0019f¹ØÇ¡ÓT\u0096 úìcºyg:\\àÒ\n]Ü".length();
                     byte var2 = 0;

                     label28:
                     while (true) {
                        int var21 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                        var10000 = var6;
                        var21 = var3++;
                        var10002 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        var10003 = -1;

                        while (true) {
                           var30 = var10002 ^ var0;
                           switch (var10003) {
                              case 0:
                                 var10000[var21] = var30;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Long[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var10000[var21] = var30;
                                 if (var2 < var5) {
                                    continue label28;
                                 }

                                 var4 = "êZùã\u0005\u009eOcaw\u00ad¼vUæÔ";
                                 var5 = "êZùã\u0005\u009eOcaw\u00ad¼vUæÔ".length();
                                 var2 = 0;
                           }

                           byte var23 = var2;
                           var2 += 8;
                           var7 = var4.substring(var23, var2).getBytes("ISO-8859-1");
                           var10000 = var6;
                           var21 = var3++;
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
                  break;
               default:
                  var10000[var10001] = var30;
                  if (var10 < var13) {
                     continue label38;
                  }

                  var12 = "\u0011ßÙÁ\u0015\u0085\\±O»î@\fù\u001c4";
                  var13 = "\u0011ßÙÁ\u0015\u0085\\±O»î@\fù\u001c4".length();
                  var10 = 0;
            }

            byte var20 = var10;
            var10 += 8;
            var15 = var12.substring(var20, var10).getBytes("ISO-8859-1");
            var10000 = var14;
            var10001 = var11++;
            var10002 = ((long)var15[0] & 255L) << 56
               | ((long)var15[1] & 255L) << 48
               | ((long)var15[2] & 255L) << 40
               | ((long)var15[3] & 255L) << 32
               | ((long)var15[4] & 255L) << 24
               | ((long)var15[5] & 255L) << 16
               | ((long)var15[6] & 255L) << 8
               | (long)var15[7] & 255L;
            var10003 = 0;
         }
      }
   }
}






