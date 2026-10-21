package com;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BV {
   protected int d;
   protected int I;
   protected Color a = null;
   protected int E;
   protected int f = -1;
   public int Y = 0;
   protected boolean Z = false;
   protected OutputStream F;
   protected BufferedImage u;
   protected byte[] P;
   protected byte[] X;
   protected int j;
   protected byte[] U;
   protected boolean[] z = new boolean[a(12222, 2512083220319857117L)];
   protected int W = a(6869, 5064530814061698232L);
   protected int K = -1;
   protected boolean p = false;
   protected boolean l = true;
   protected boolean A = false;
   protected int w = a(17269, 4243177942814000404L);
   private static final String[] b;
   private static final String[] c;
   private static final long[] e;
   private static final Integer[] g;

   public void K(int var1) {
      this.Y = Math.round((float)var1 / 10.0F);
   }

   public void n(int var1) {
      if (var1 >= 0) {
         this.K = var1;
      }
   }

   public void B(int var1) {
      if (var1 >= 0) {
         this.f = var1;
      }
   }

   public void g(Color var1) {
      this.a = var1;
   }

   public boolean V(BufferedImage param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/kj_4.d ()[Lcom/ky_4;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnull 21
      // 08: aload 0
      // 09: getfield com/BV.Z Z
      // 0c: aload 2
      // 0d: ifnull 28
      // 10: goto 17
      // 13: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 16: athrow
      // 17: ifne 27
      // 1a: goto 21
      // 1d: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 26: athrow
      // 27: bipush 1
      // 28: istore 3
      // 29: aload 0
      // 2a: getfield com/BV.A Z
      // 2d: aload 2
      // 2e: ifnull 5f
      // 31: ifne 4e
      // 34: goto 3b
      // 37: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 1
      // 3d: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 40: aload 1
      // 41: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 44: invokevirtual com/BV.f (II)V
      // 47: goto 4e
      // 4a: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 1
      // 50: putfield com/BV.u Ljava/awt/image/BufferedImage;
      // 53: aload 0
      // 54: invokevirtual com/BV.f ()V
      // 57: aload 0
      // 58: invokevirtual com/BV.F ()V
      // 5b: aload 0
      // 5c: getfield com/BV.l Z
      // 5f: aload 2
      // 60: ifnull b0
      // 63: ifeq 99
      // 66: goto 6d
      // 69: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6c: athrow
      // 6d: aload 0
      // 6e: invokevirtual com/BV.v ()V
      // 71: aload 0
      // 72: invokevirtual com/BV.S ()V
      // 75: aload 0
      // 76: getfield com/BV.f I
      // 79: aload 2
      // 7a: ifnull b0
      // 7d: goto 84
      // 80: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 83: athrow
      // 84: iflt 99
      // 87: goto 8e
      // 8a: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: invokevirtual com/BV.A ()V
      // 92: goto 99
      // 95: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 98: athrow
      // 99: aload 0
      // 9a: invokevirtual com/BV.t ()V
      // 9d: aload 0
      // 9e: invokevirtual com/BV.X ()V
      // a1: aload 0
      // a2: aload 2
      // a3: ifnull c3
      // a6: getfield com/BV.l Z
      // a9: goto b0
      // ac: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // af: athrow
      // b0: ifne be
      // b3: aload 0
      // b4: invokevirtual com/BV.S ()V
      // b7: goto be
      // ba: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // bd: athrow
      // be: aload 0
      // bf: invokevirtual com/BV.w ()V
      // c2: aload 0
      // c3: bipush 0
      // c4: putfield com/BV.l Z
      // c7: goto ce
      // ca: astore 4
      // cc: bipush 0
      // cd: istore 3
      // ce: iload 3
      // cf: ireturn
   }

   public boolean G() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/kj_4.d ()[Lcom/ky_4;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/BV.Z Z
      // 08: aload 1
      // 09: ifnull 1d
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: istore 2
      // 1e: aload 0
      // 1f: bipush 0
      // 20: putfield com/BV.Z Z
      // 23: aload 0
      // 24: getfield com/BV.F Ljava/io/OutputStream;
      // 27: sipush 8075
      // 2a: ldc2_w 5913776848330414574
      // 2d: invokestatic com/BV.a (IJ)I
      // 30: invokevirtual java/io/OutputStream.write (I)V
      // 33: aload 0
      // 34: getfield com/BV.F Ljava/io/OutputStream;
      // 37: invokevirtual java/io/OutputStream.flush ()V
      // 3a: aload 0
      // 3b: aload 1
      // 3c: ifnull 4d
      // 3f: getfield com/BV.p Z
      // 42: ifeq 53
      // 45: aload 0
      // 46: goto 4d
      // 49: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4c: athrow
      // 4d: getfield com/BV.F Ljava/io/OutputStream;
      // 50: invokevirtual java/io/OutputStream.close ()V
      // 53: goto 59
      // 56: astore 3
      // 57: bipush 0
      // 58: istore 2
      // 59: aload 0
      // 5a: bipush 0
      // 5b: putfield com/BV.E I
      // 5e: aload 0
      // 5f: aconst_null
      // 60: putfield com/BV.F Ljava/io/OutputStream;
      // 63: aload 0
      // 64: aconst_null
      // 65: putfield com/BV.u Ljava/awt/image/BufferedImage;
      // 68: aload 0
      // 69: aconst_null
      // 6a: putfield com/BV.P [B
      // 6d: aload 0
      // 6e: aconst_null
      // 6f: putfield com/BV.X [B
      // 72: aload 0
      // 73: aconst_null
      // 74: putfield com/BV.U [B
      // 77: aload 0
      // 78: bipush 0
      // 79: putfield com/BV.p Z
      // 7c: aload 0
      // 7d: bipush 1
      // 7e: putfield com/BV.l Z
      // 81: iload 2
      // 82: ireturn
   }

   public void L(float var1) {
      if (var1 != 0.0F) {
         this.Y = Math.round(100.0F / var1);
      }
   }

   public void S(int var1) {
      com.ky_4[] var2 = com.kj_4.d();
      if (var2 != null) {
         if (var1 < 1) {
            var1 = 1;
         }

         this.w = var1;
      }
   }

   public void f(int var1, int var2) {
      com.ky_4[] var3;
      int var10000;
      var3 = com.kj_4.d();
      var10000 = this.Z;
      label35:
      if (var3 != null) {
         if (this.Z) {
            var10000 = this.l;
            if (var3 == null) {
               break label35;
            }

            if (!this.l) {
               return;
            }
         }

         this.d = var1;
         this.I = var2;
         var10000 = this.d;
      }

      label38: {
         byte var10001 = 1;
         if (var3 != null) {
            if (var10000 < 1) {
               this.d = a(16471, 6515942925113820704L);
            }

            var4 = this;
            if (var3 == null) {
               break label38;
            }

            var10000 = this.I;
            var10001 = 1;
         }

         if (var10000 < var10001) {
            this.I = a(1510, 3743167882498098061L);
         }

         var4 = this;
      }

      var4.A = true;
   }

   public boolean f(OutputStream var1) {
      try {
         if (var1 == null) {
            return false;
         }
      } catch (IOException var5) {
         throw a(var5);
      }

      boolean var2 = true;
      this.p = false;
      this.F = var1;

      try {
         this.V(a(-24477, 10340));
      } catch (IOException var4) {
         var2 = false;
      }

      return this.Z = var2;
   }

   public boolean F(String var1) {
      boolean var2;
      try {
         this.F = new BufferedOutputStream(new FileOutputStream(var1));
         var2 = this.f(this.F);
         this.p = true;
      } catch (IOException var4) {
         var2 = false;
      }

      return this.Z = var2;
   }

   protected void F() {
      int var2 = this.P.length;
      int var3 = var2 / 3;
      com.ky_4[] var10000 = com.kj_4.d();
      this.X = new byte[var3];
      com.ky_4[] var1 = var10000;
      I4 var4 = new I4(this.P, var2, this.w);
      this.U = var4.Q();
      int var5 = 0;

      while (true) {
         if (var5 < this.U.length) {
            byte var6 = this.U[var5];
            this.U[var5] = this.U[var5 + 2];
            this.U[var5 + 2] = var6;
            this.z[var5 / 3] = false;
            var5 += 3;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         var5 = 0;
         break;
      }

      int var10 = 0;

      while (true) {
         if (var10 < var3) {
            int var7 = var4.Q(
               this.P[var5++] & a(18193, 5401151161789874555L),
               this.P[var5++] & a(18193, 5401151161789874555L),
               this.P[var5++] & a(18193, 5401151161789874555L)
            );
            this.z[var7] = true;
            this.X[var10] = (byte)var7;
            var10++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         this.P = null;
         this.j = a(5041, 8696970219010971101L);
         this.W = a(6869, 5064530814061698232L);
         break;
      }

      com.BV var11 = this;
      if (var1 != null) {
         if (this.a == null) {
            return;
         }

         var11 = this;
      }

      var11.E = this.N(this.a);
   }

   protected int N(Color var1) {
      com.ky_4[] var2 = com.kj_4.d();
      if (this.U == null) {
         return -1;
      } else {
         int var3 = var1.getRed();
         int var4 = var1.getGreen();
         int var5 = var1.getBlue();
         int var6 = 0;
         int var7 = a(25812, 4606499669004231355L);
         int var8 = this.U.length;
         int var9 = 0;

         int var10000;
         while (true) {
            if (var9 < var8) {
               int var10 = var3 - (this.U[var9++] & a(18193, 5401151161789874555L));
               int var11 = var4 - (this.U[var9++] & a(18193, 5401151161789874555L));
               int var12 = var5 - (this.U[var9] & a(18193, 5401151161789874555L));
               int var13 = var10 * var10 + var11 * var11 + var12 * var12;
               int var14 = var9 / 3;
               if (var2 != null) {
                  var10000 = this.z[var14];
                  if (var2 == null) {
                     break;
                  }

                  label32:
                  if (var10000 != 0) {
                     var10000 = var13;
                     if (var2 != null) {
                        if (var13 >= var7) {
                           break label32;
                        }

                        var7 = var13;
                        var10000 = var14;
                     }

                     var6 = var10000;
                  }

                  var9++;
               }

               if (var2 != null) {
                  continue;
               }
            }

            var10000 = var6;
            break;
         }

         return var10000;
      }
   }

   protected void f() {
      label25: {
         label27: {
            com.ky_4[] var10000 = com.kj_4.d();
            int var2 = this.u.getWidth();
            int var3 = this.u.getHeight();
            com.ky_4[] var1 = var10000;
            int var4 = this.u.getType();
            int var7 = var2;
            int var10001 = this.d;
            if (var1 != null) {
               if (var2 != this.d) {
                  break label27;
               }

               var7 = var3;
               var10001 = this.I;
            }

            if (var1 != null) {
               if (var7 != var10001) {
                  break label27;
               }

               var7 = var4;
               var10001 = 5;
            }

            if (var7 == var10001) {
               break label25;
            }
         }

         BufferedImage var5 = new BufferedImage(this.d, this.I, 5);
         Graphics2D var6 = var5.createGraphics();
         var6.drawImage(this.u, 0, 0, null);
         var6.dispose();
         this.u = var5;
      }

      this.P = ((DataBufferByte)this.u.getRaster().getDataBuffer()).getData();
   }

   protected void t() throws IOException {
      com.ky_4[] var1;
      byte var2;
      int var3;
      label28: {
         this.F.write(a(25612, 4567985777393377913L));
         this.F.write(a(15407, 787364067449403993L));
         com.ky_4[] var10000 = com.kj_4.d();
         this.F.write(4);
         var1 = var10000;
         if (this.a == null) {
            var2 = 0;
            var3 = 0;
            if (var1 != null) {
               break label28;
            }
         }

         var2 = 1;
         var3 = 2;
      }

      int var6;
      label23: {
         label22: {
            try {
               var6 = this.K;
               if (var1 == null) {
                  break label23;
               }

               if (this.K < 0) {
                  break label22;
               }
            } catch (IOException var4) {
               throw a(var4);
            }

            var3 = this.K & a(14257, 4457853080547881425L);
         }

         var6 = var3 << 2;
      }

      var3 = var6;
      this.F.write(var3 | var2);
      this.L(this.Y);
      this.F.write(this.E);
      this.F.write(0);
   }

   protected void X() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/kj_4.d ()[Lcom/ky_4;
      // 03: aload 0
      // 04: getfield com/BV.F Ljava/io/OutputStream;
      // 07: sipush 25510
      // 0a: ldc2_w 1391381961491129806
      // 0d: invokestatic com/BV.a (IJ)I
      // 10: invokevirtual java/io/OutputStream.write (I)V
      // 13: aload 0
      // 14: bipush 0
      // 15: invokevirtual com/BV.L (I)V
      // 18: astore 1
      // 19: aload 0
      // 1a: bipush 0
      // 1b: invokevirtual com/BV.L (I)V
      // 1e: aload 0
      // 1f: aload 0
      // 20: getfield com/BV.d I
      // 23: invokevirtual com/BV.L (I)V
      // 26: aload 0
      // 27: aload 0
      // 28: getfield com/BV.I I
      // 2b: invokevirtual com/BV.L (I)V
      // 2e: aload 0
      // 2f: aload 1
      // 30: ifnull 5b
      // 33: getfield com/BV.l Z
      // 36: ifeq 53
      // 39: goto 40
      // 3c: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/BV.F Ljava/io/OutputStream;
      // 44: bipush 0
      // 45: invokevirtual java/io/OutputStream.write (I)V
      // 48: aload 1
      // 49: ifnonnull 6f
      // 4c: goto 53
      // 4f: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 52: athrow
      // 53: aload 0
      // 54: goto 5b
      // 57: invokestatic com/BV.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 5a: athrow
      // 5b: getfield com/BV.F Ljava/io/OutputStream;
      // 5e: sipush 21681
      // 61: ldc2_w 6653928719075414751
      // 64: invokestatic com/BV.a (IJ)I
      // 67: aload 0
      // 68: getfield com/BV.W I
      // 6b: ior
      // 6c: invokevirtual java/io/OutputStream.write (I)V
      // 6f: return
   }

   protected void v() throws IOException {
      this.L(this.d);
      this.L(this.I);
      this.F.write(a(1134, 5459830961340269063L) | this.W);
      this.F.write(0);
      this.F.write(0);
   }

   protected void A() throws IOException {
      this.F.write(a(32730, 8417048310966925742L));
      this.F.write(a(18193, 5401151161789874555L));
      this.F.write(a(938, 7622916308936476104L));
      this.V(a(-24478, 19437));
      this.F.write(3);
      this.F.write(1);
      this.L(this.f);
      this.F.write(0);
   }

   protected void S() throws IOException {
      com.ky_4[] var10000 = com.kj_4.d();
      this.F.write(this.U, 0, this.U.length);
      int var2 = a(19839, 2206132999955090200L) - this.U.length;
      com.ky_4[] var1 = var10000;
      int var3 = 0;

      while (var3 < var2) {
         this.F.write(0);
         var3++;
         if (var1 == null) {
            break;
         }
      }
   }

   protected void w() throws IOException {
      p4_2 var1 = new p4_2(this.d, this.I, this.X, this.j);
      var1.e(this.F);
   }

   protected void L(int var1) throws IOException {
      this.F.write(var1 & a(19609, 4617887921443867391L));
      this.F.write(var1 >> a(25059, 4380381630871545735L) & a(18193, 5401151161789874555L));
   }

   protected void V(String var1) throws IOException {
      com.ky_4[] var10000 = com.kj_4.d();
      int var3 = 0;
      com.ky_4[] var2 = var10000;

      while (var3 < var1.length()) {
         this.F.write((byte)var1.charAt(var3));
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "Éêß\u0000HÂ\u000bïk!Ö½>Â\u0019éï|";
      int var12 = "Éêß\u0000HÂ\u000bïk!Ö½>Â\u0019éï|".length();
      char var9 = 6;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 40;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 40;
               var10006 = var14;
            } else {
               var27 = 40;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 40;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 81;
                     break;
                  case 1:
                     var47 = 48;
                     break;
                  case 2:
                     var47 = 8;
                     break;
                  case 3:
                     var47 = 46;
                     break;
                  case 4:
                     var47 = 40;
                     break;
                  case 5:
                     var47 = 116;
                     break;
                  default:
                     var47 = 38;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            b = var13;
            c = new String[2];
            long var0 = 8997721363387538592L;
            long[] var6 = new long[20];
            int var3 = 0;
            String var4 = "Âûä\u0018ä\u0016û/cy\u000fTq\u0001\u0085uiwETf\u0092Ö ½°äÚ)?T¸®îT?zG\u00adv\u0004\u0013a\fä\u009bÙ¾A\u0001:\u009bÎ\u0018\u0099c s.\u007fmÊ4}ÒQ8ø\u009aä\u0089uì~÷èJ\u0082\u0080\u001fË\u008bH¸\têÎÿ¾#í@\u0099[þ\u001b¥\u0082;íÝ8ùBmQ\u008dò\u008cõ\u009eWIEÀB\f\u0004Ý$áZ\u008e\u0082\u0016[\u001fÝ \u0099\u0002q\u009cÔe/Ï\u0085¼Ì´9þø";
            int var5 = "Âûä\u0018ä\u0016û/cy\u000fTq\u0001\u0085uiwETf\u0092Ö ½°äÚ)?T¸®îT?zG\u00adv\u0004\u0013a\fä\u009bÙ¾A\u0001:\u009bÎ\u0018\u0099c s.\u007fmÊ4}ÒQ8ø\u009aä\u0089uì~÷èJ\u0082\u0080\u001fË\u008bH¸\têÎÿ¾#í@\u0099[þ\u001b¥\u0082;íÝ8ùBmQ\u008dò\u008cõ\u009eWIEÀB\f\u0004Ý$áZ\u008e\u0082\u0016[\u001fÝ \u0099\u0002q\u009cÔe/Ï\u0085¼Ì´9þø"
               .length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           e = var6;
                           g = new Integer[20];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "mµ\u0004.é\u0092&\u0000\u0091Åò$0\u0089[À";
                        var5 = "mµ\u0004.é\u0092&\u0000\u0091Åò$0\u0089[À".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -24477) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 238;
               break;
            case 1:
               var10000 = 207;
               break;
            case 2:
               var10000 = 112;
               break;
            case 3:
               var10000 = 136;
               break;
            case 4:
               var10000 = 29;
               break;
            case 5:
               var10000 = 39;
               break;
            case 6:
               var10000 = 205;
               break;
            case 7:
               var10000 = 185;
               break;
            case 8:
               var10000 = 87;
               break;
            case 9:
               var10000 = 161;
               break;
            case 10:
               var10000 = 129;
               break;
            case 11:
               var10000 = 5;
               break;
            case 12:
               var10000 = 96;
               break;
            case 13:
               var10000 = 128;
               break;
            case 14:
               var10000 = 53;
               break;
            case 15:
               var10000 = 76;
               break;
            case 16:
               var10000 = 124;
               break;
            case 17:
               var10000 = 166;
               break;
            case 18:
               var10000 = 24;
               break;
            case 19:
               var10000 = 170;
               break;
            case 20:
               var10000 = 72;
               break;
            case 21:
               var10000 = 226;
               break;
            case 22:
               var10000 = 234;
               break;
            case 23:
               var10000 = 239;
               break;
            case 24:
               var10000 = 179;
               break;
            case 25:
               var10000 = 1;
               break;
            case 26:
               var10000 = 220;
               break;
            case 27:
               var10000 = 145;
               break;
            case 28:
               var10000 = 113;
               break;
            case 29:
               var10000 = 254;
               break;
            case 30:
               var10000 = 208;
               break;
            case 31:
               var10000 = 157;
               break;
            case 32:
               var10000 = 143;
               break;
            case 33:
               var10000 = 184;
               break;
            case 34:
               var10000 = 155;
               break;
            case 35:
               var10000 = 103;
               break;
            case 36:
               var10000 = 81;
               break;
            case 37:
               var10000 = 214;
               break;
            case 38:
               var10000 = 61;
               break;
            case 39:
               var10000 = 130;
               break;
            case 40:
               var10000 = 58;
               break;
            case 41:
               var10000 = 188;
               break;
            case 42:
               var10000 = 60;
               break;
            case 43:
               var10000 = 253;
               break;
            case 44:
               var10000 = 98;
               break;
            case 45:
               var10000 = 173;
               break;
            case 46:
               var10000 = 46;
               break;
            case 47:
               var10000 = 201;
               break;
            case 48:
               var10000 = 6;
               break;
            case 49:
               var10000 = 156;
               break;
            case 50:
               var10000 = 119;
               break;
            case 51:
               var10000 = 117;
               break;
            case 52:
               var10000 = 203;
               break;
            case 53:
               var10000 = 140;
               break;
            case 54:
               var10000 = 7;
               break;
            case 55:
               var10000 = 237;
               break;
            case 56:
               var10000 = 2;
               break;
            case 57:
               var10000 = 216;
               break;
            case 58:
               var10000 = 121;
               break;
            case 59:
               var10000 = 93;
               break;
            case 60:
               var10000 = 183;
               break;
            case 61:
               var10000 = 118;
               break;
            case 62:
               var10000 = 255;
               break;
            case 63:
               var10000 = 36;
               break;
            case 64:
               var10000 = 152;
               break;
            case 65:
               var10000 = 160;
               break;
            case 66:
               var10000 = 215;
               break;
            case 67:
               var10000 = 194;
               break;
            case 68:
               var10000 = 142;
               break;
            case 69:
               var10000 = 38;
               break;
            case 70:
               var10000 = 193;
               break;
            case 71:
               var10000 = 241;
               break;
            case 72:
               var10000 = 211;
               break;
            case 73:
               var10000 = 132;
               break;
            case 74:
               var10000 = 108;
               break;
            case 75:
               var10000 = 107;
               break;
            case 76:
               var10000 = 219;
               break;
            case 77:
               var10000 = 41;
               break;
            case 78:
               var10000 = 3;
               break;
            case 79:
               var10000 = 28;
               break;
            case 80:
               var10000 = 89;
               break;
            case 81:
               var10000 = 153;
               break;
            case 82:
               var10000 = 88;
               break;
            case 83:
               var10000 = 115;
               break;
            case 84:
               var10000 = 101;
               break;
            case 85:
               var10000 = 82;
               break;
            case 86:
               var10000 = 199;
               break;
            case 87:
               var10000 = 249;
               break;
            case 88:
               var10000 = 120;
               break;
            case 89:
               var10000 = 197;
               break;
            case 90:
               var10000 = 236;
               break;
            case 91:
               var10000 = 176;
               break;
            case 92:
               var10000 = 23;
               break;
            case 93:
               var10000 = 227;
               break;
            case 94:
               var10000 = 71;
               break;
            case 95:
               var10000 = 148;
               break;
            case 96:
               var10000 = 75;
               break;
            case 97:
               var10000 = 131;
               break;
            case 98:
               var10000 = 94;
               break;
            case 99:
               var10000 = 111;
               break;
            case 100:
               var10000 = 79;
               break;
            case 101:
               var10000 = 66;
               break;
            case 102:
               var10000 = 17;
               break;
            case 103:
               var10000 = 73;
               break;
            case 104:
               var10000 = 57;
               break;
            case 105:
               var10000 = 147;
               break;
            case 106:
               var10000 = 144;
               break;
            case 107:
               var10000 = 177;
               break;
            case 108:
               var10000 = 192;
               break;
            case 109:
               var10000 = 246;
               break;
            case 110:
               var10000 = 175;
               break;
            case 111:
               var10000 = 59;
               break;
            case 112:
               var10000 = 20;
               break;
            case 113:
               var10000 = 232;
               break;
            case 114:
               var10000 = 33;
               break;
            case 115:
               var10000 = 91;
               break;
            case 116:
               var10000 = 230;
               break;
            case 117:
               var10000 = 67;
               break;
            case 118:
               var10000 = 77;
               break;
            case 119:
               var10000 = 69;
               break;
            case 120:
               var10000 = 0;
               break;
            case 121:
               var10000 = 229;
               break;
            case 122:
               var10000 = 31;
               break;
            case 123:
               var10000 = 186;
               break;
            case 124:
               var10000 = 200;
               break;
            case 125:
               var10000 = 50;
               break;
            case 126:
               var10000 = 126;
               break;
            case 127:
               var10000 = 40;
               break;
            case 128:
               var10000 = 164;
               break;
            case 129:
               var10000 = 83;
               break;
            case 130:
               var10000 = 163;
               break;
            case 131:
               var10000 = 135;
               break;
            case 132:
               var10000 = 34;
               break;
            case 133:
               var10000 = 212;
               break;
            case 134:
               var10000 = 55;
               break;
            case 135:
               var10000 = 9;
               break;
            case 136:
               var10000 = 95;
               break;
            case 137:
               var10000 = 80;
               break;
            case 138:
               var10000 = 54;
               break;
            case 139:
               var10000 = 231;
               break;
            case 140:
               var10000 = 137;
               break;
            case 141:
               var10000 = 245;
               break;
            case 142:
               var10000 = 84;
               break;
            case 143:
               var10000 = 228;
               break;
            case 144:
               var10000 = 64;
               break;
            case 145:
               var10000 = 167;
               break;
            case 146:
               var10000 = 225;
               break;
            case 147:
               var10000 = 68;
               break;
            case 148:
               var10000 = 43;
               break;
            case 149:
               var10000 = 125;
               break;
            case 150:
               var10000 = 21;
               break;
            case 151:
               var10000 = 48;
               break;
            case 152:
               var10000 = 11;
               break;
            case 153:
               var10000 = 102;
               break;
            case 154:
               var10000 = 209;
               break;
            case 155:
               var10000 = 247;
               break;
            case 156:
               var10000 = 65;
               break;
            case 157:
               var10000 = 92;
               break;
            case 158:
               var10000 = 45;
               break;
            case 159:
               var10000 = 151;
               break;
            case 160:
               var10000 = 233;
               break;
            case 161:
               var10000 = 248;
               break;
            case 162:
               var10000 = 27;
               break;
            case 163:
               var10000 = 56;
               break;
            case 164:
               var10000 = 123;
               break;
            case 165:
               var10000 = 206;
               break;
            case 166:
               var10000 = 122;
               break;
            case 167:
               var10000 = 178;
               break;
            case 168:
               var10000 = 158;
               break;
            case 169:
               var10000 = 116;
               break;
            case 170:
               var10000 = 224;
               break;
            case 171:
               var10000 = 100;
               break;
            case 172:
               var10000 = 244;
               break;
            case 173:
               var10000 = 141;
               break;
            case 174:
               var10000 = 127;
               break;
            case 175:
               var10000 = 195;
               break;
            case 176:
               var10000 = 109;
               break;
            case 177:
               var10000 = 10;
               break;
            case 178:
               var10000 = 35;
               break;
            case 179:
               var10000 = 49;
               break;
            case 180:
               var10000 = 187;
               break;
            case 181:
               var10000 = 169;
               break;
            case 182:
               var10000 = 15;
               break;
            case 183:
               var10000 = 19;
               break;
            case 184:
               var10000 = 52;
               break;
            case 185:
               var10000 = 223;
               break;
            case 186:
               var10000 = 25;
               break;
            case 187:
               var10000 = 174;
               break;
            case 188:
               var10000 = 138;
               break;
            case 189:
               var10000 = 32;
               break;
            case 190:
               var10000 = 252;
               break;
            case 191:
               var10000 = 180;
               break;
            case 192:
               var10000 = 165;
               break;
            case 193:
               var10000 = 104;
               break;
            case 194:
               var10000 = 198;
               break;
            case 195:
               var10000 = 210;
               break;
            case 196:
               var10000 = 4;
               break;
            case 197:
               var10000 = 162;
               break;
            case 198:
               var10000 = 139;
               break;
            case 199:
               var10000 = 22;
               break;
            case 200:
               var10000 = 149;
               break;
            case 201:
               var10000 = 70;
               break;
            case 202:
               var10000 = 150;
               break;
            case 203:
               var10000 = 78;
               break;
            case 204:
               var10000 = 242;
               break;
            case 205:
               var10000 = 85;
               break;
            case 206:
               var10000 = 182;
               break;
            case 207:
               var10000 = 221;
               break;
            case 208:
               var10000 = 37;
               break;
            case 209:
               var10000 = 191;
               break;
            case 210:
               var10000 = 51;
               break;
            case 211:
               var10000 = 97;
               break;
            case 212:
               var10000 = 154;
               break;
            case 213:
               var10000 = 189;
               break;
            case 214:
               var10000 = 47;
               break;
            case 215:
               var10000 = 196;
               break;
            case 216:
               var10000 = 133;
               break;
            case 217:
               var10000 = 106;
               break;
            case 218:
               var10000 = 168;
               break;
            case 219:
               var10000 = 146;
               break;
            case 220:
               var10000 = 213;
               break;
            case 221:
               var10000 = 171;
               break;
            case 222:
               var10000 = 110;
               break;
            case 223:
               var10000 = 62;
               break;
            case 224:
               var10000 = 172;
               break;
            case 225:
               var10000 = 86;
               break;
            case 226:
               var10000 = 99;
               break;
            case 227:
               var10000 = 218;
               break;
            case 228:
               var10000 = 250;
               break;
            case 229:
               var10000 = 18;
               break;
            case 230:
               var10000 = 42;
               break;
            case 231:
               var10000 = 74;
               break;
            case 232:
               var10000 = 235;
               break;
            case 233:
               var10000 = 14;
               break;
            case 234:
               var10000 = 217;
               break;
            case 235:
               var10000 = 90;
               break;
            case 236:
               var10000 = 190;
               break;
            case 237:
               var10000 = 159;
               break;
            case 238:
               var10000 = 181;
               break;
            case 239:
               var10000 = 134;
               break;
            case 240:
               var10000 = 63;
               break;
            case 241:
               var10000 = 105;
               break;
            case 242:
               var10000 = 202;
               break;
            case 243:
               var10000 = 26;
               break;
            case 244:
               var10000 = 204;
               break;
            case 245:
               var10000 = 8;
               break;
            case 246:
               var10000 = 251;
               break;
            case 247:
               var10000 = 44;
               break;
            case 248:
               var10000 = 114;
               break;
            case 249:
               var10000 = 30;
               break;
            case 250:
               var10000 = 240;
               break;
            case 251:
               var10000 = 243;
               break;
            case 252:
               var10000 = 222;
               break;
            case 253:
               var10000 = 12;
               break;
            case 254:
               var10000 = 13;
               break;
            default:
               var10000 = 16;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18020;
      if (g[var3] == null) {
         g[var3] = (int)(e[var3] ^ var1);
      }

      return g[var3];
   }
}





