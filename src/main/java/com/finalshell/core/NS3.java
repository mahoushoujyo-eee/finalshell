package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class NS3 {
   public BufferedInputStream y;
   public int A;
   public int n;
   public int g;
   public boolean b;
   public int X;
   public int M = 1;
   public int[] t;
   public int[] T;
   public int[] K;
   public int d;
   public int J;
   public int Z;
   public int a;
   public boolean f;
   public boolean c;
   public int H;
   public int i;
   public int k;
   public int q;
   public int h;
   public Rectangle O;
   public BufferedImage u;
   public BufferedImage x;
   public final byte[] m = new byte[a(17160, 7905076392615279196L)];
   public int r = 0;
   public int z = 0;
   public int C = 0;
   public boolean B = false;
   public int e = 0;
   public int V;
   public short[] P;
   public byte[] w;
   public byte[] s;
   public byte[] L;
   public ArrayList R;
   public int o;
   public static String[] j;
   public static String[] l;
   public static long[] p;
   public static Integer[] v;

   public int e() {
      return this.a;
   }

   public int F(int var1) {
      Ky4[] var10000 = Kj4.d();
      this.e = -1;
      Ky4[] var2 = var10000;
      int var3 = var1;
      if (var2 != null) {
         if (var1 >= 0) {
            if (var2 == null) {
               return var1;
            }

            if (var1 < this.o) {
               this.e = ((Kj4)this.R.get(var1)).p;
            }
         }

         var3 = this.e;
      }

      return var3;
   }

   public BufferedImage j(int var1) {
      Ky4[] var10000 = Kj4.d();
      BufferedImage var3 = null;
      Ky4[] var2 = var10000;
      int var4 = var1;
      if (var2 != null) {
         if (var1 < 0) {
            return var3;
         }

         var4 = var1;
      }

      if (var4 < this.o) {
         var3 = ((Kj4)this.R.get(var1)).W;
      }

      return var3;
   }

   public int f() {
      return this.o;
   }

   public BufferedImage s() {
      return this.j(0);
   }

   public int c() {
      return this.M;
   }

   public int P(BufferedInputStream param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Kj4.d ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 6e
      // 09: invokevirtual com/finalshell/core/NS3.E ()V
      // 0c: aload 1
      // 0d: ifnull 66
      // 10: goto 17
      // 13: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 16: athrow
      // 17: aload 0
      // 18: aload 1
      // 19: putfield com/finalshell/core/NS3.y Ljava/io/BufferedInputStream;
      // 1c: aload 0
      // 1d: invokevirtual com/finalshell/core/NS3.k ()V
      // 20: aload 2
      // 21: ifnull 7e
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: invokevirtual com/finalshell/core/NS3.o ()Z
      // 2f: ifne 7a
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual com/finalshell/core/NS3.C ()V
      // 3d: aload 2
      // 3e: ifnull 7e
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 47: athrow
      // 48: aload 0
      // 49: getfield com/finalshell/core/NS3.o I
      // 4c: ifge 7a
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 55: athrow
      // 56: aload 0
      // 57: bipush 1
      // 58: putfield com/finalshell/core/NS3.A I
      // 5b: aload 2
      // 5c: ifnonnull 7a
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 65: athrow
      // 66: aload 0
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 6d: athrow
      // 6e: sipush 20520
      // 71: ldc2_w 3943895479944374626
      // 74: invokestatic com/finalshell/core/NS3.a (IJ)I
      // 77: putfield com/finalshell/core/NS3.A I
      // 7a: aload 1
      // 7b: invokevirtual java/io/BufferedInputStream.close ()V
      // 7e: goto 82
      // 81: astore 3
      // 82: aload 0
      // 83: getfield com/finalshell/core/NS3.A I
      // 86: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public int A(String var1) {
      label47: {
         label52: {
            Ky4[] var2 = Kj4.d();
            NS3 var10000 = this;
            if (var2 != null) {
               this.A = 0;

               try {
                  var1 = var1.trim();
                  if (var1.indexOf(a(12422, 9821)) > 0) {
                     URL var3 = new URL(var1);

                     try {
                        this.y = new BufferedInputStream(var3.openStream());
                        if (var2 != null) {
                           break label52;
                        }
                     } catch (IOException var7) {
                        boolean var10 = false;
                        throw a(var7);
                     }
                  }

                  try {
                     var10000 = this;
                  } catch (IOException var6) {
                     boolean var11 = false;
                     throw a(var6);
                  }
               } catch (IOException var8) {
                  boolean var10001 = false;
                  break label47;
               }
            }

            try {
               var10000.y = new BufferedInputStream(new FileInputStream(var1));
            } catch (IOException var5) {
               boolean var12 = false;
               break label47;
            }
         }

         try {
            this.A = this.P(this.y);
            return this.A;
         } catch (IOException var4) {
            boolean var13 = false;
         }
      }

      this.A = a(8138, 4080239199235286670L);
      return this.A;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   protected void r() {
      Ky4[] var1;
      int var3;
      NS3 var23;
      label205: {
         label204: {
            Ky4[] var10000 = Kj4.d();
            byte var2 = -1;
            var1 = var10000;
            var3 = this.q * this.h;
            var23 = this;
            if (var1 != null) {
               if (this.L != null) {
                  var23 = this;
                  if (var1 == null) {
                     break label205;
                  }

                  if (this.L.length >= var3) {
                     break label204;
                  }
               }

               var23 = this;
            }

            var23.L = new byte[var3];
         }

         var23 = this;
      }

      if (var1 != null) {
         if (var23.P == null) {
            this.P = new short[a(8626, 164563254886799602L)];
         }

         var23 = this;
      }

      label208: {
         byte[] var24 = var23.w;
         if (var1 != null) {
            if (var23.w == null) {
               this.w = new byte[a(9192, 480758518447348395L)];
            }

            var23 = this;
            if (var1 == null) {
               break label208;
            }

            var24 = this.s;
         }

         if (var24 == null) {
            this.s = new byte[a(25607, 6099643176437243200L)];
         }

         var23 = this;
      }

      int var16 = var23.M$int();
      int var5 = 1 << var16;
      int var8 = var5 + 1;
      int var4 = var5 + 2;
      int var10 = -1;
      int var7 = var16 + 1;
      int var6 = (1 << var7) - 1;
      int var12 = 0;

      while (var12 < var5) {
         this.P[var12] = 0;
         this.w[var12] = (byte)var12;
         var12++;
         if (var1 == null) {
            break;
         }
      }

      int var19 = 0;
      int var20 = 0;
      int var18 = 0;
      int var17 = 0;
      int var13 = 0;
      int var11 = 0;
      int var15 = 0;
      int var14 = 0;

      while (true) {
         label176:
         if (var14 < var3) {
      int var26;
            var26 = var18;
            if (var1 == null) {
               break;
            }

            label219: {
               if (var1 != null) {
                  if (var18 != 0) {
                     break label219;
                  }

                  var26 = var11;
               }

               int var10001 = var7;
               if (var1 != null) {
                  if (var26 < var7) {
                     int var27 = var13;
                     if (var1 != null) {
                        if (var13 == 0) {
                           var13 = this.L$int();
                           int var28 = var13;
                           if (var1 != null) {
                              if (var13 <= 0 && var1 != null) {
                                 break label176;
                              }

                              var28 = 0;
                           }

                           var19 = var28;
                        }

                        var27 = var15 + ((this.m[var19] & a(29014, 6465265476012197917L)) << var11);
                     }

                     var15 = var27;
                     var11 += 8;
                     var19++;
                     var13--;
                     if (var1 != null) {
                        continue;
                     }
                  }

                  var12 = var15 & var6;
                  var15 >>= var7;
                  var11 -= var7;
                  var26 = var12;
                  if (var1 == null) {
                     break;
                  }

                  var10001 = var4;
               }

               if (var26 > var10001) {
                  break label176;
               }

               int var29 = var12;
               var10001 = var8;
               if (var1 != null) {
                  if (var12 == var8 && var1 != null) {
                     break label176;
                  }

                  var29 = var12;
                  var10001 = var5;
               }

               label213: {
                  if (var1 != null) {
                     if (var29 == var10001) {
                        var7 = var16 + 1;
                        var6 = (1 << var7) - 1;
                        var4 = var5 + 2;
                        var10 = -1;
                        if (var1 != null) {
                           continue;
                        }
                     }

                     var29 = var10;
                     if (var1 == null) {
                        break label213;
                     }

                     var10001 = -1;
                  }

                  if (var29 == var10001) {
                     this.s[var18++] = this.w[var12];
                     var10 = var12;
                     var17 = var12;
                     if (var1 != null) {
                        continue;
                     }
                  }

                  var29 = var12;
               }

               int var9;
               label215: {
                  var9 = var29;
                  int var30 = var12;
                  var10001 = var4;
                  if (var1 != null) {
                     if (var12 == var4) {
                        this.s[var18++] = (byte)var17;
                        var12 = var10;
                     }

                     var30 = var12;
                     var10001 = var5;
                  }

                  while (var30 > var10001) {
                     this.s[var18++] = this.w[var12];
                     var12 = this.P[var12];
                     if (var1 == null) {
                        break label215;
                     }

                     if (var1 == null) {
                        break;
                     }

                     var30 = var12;
                     var10001 = var5;
                  }

                  var17 = this.w[var12] & a(29014, 6465265476012197917L);
               }

               int var31 = var4;
               var10001 = a(9192, 480758518447348395L);
               if (var1 != null) {
                  if (var4 >= var10001 && var1 != null) {
                     break label176;
                  }

                  this.s[var18++] = (byte)var17;
                  this.P[var4] = (short)var10;
                  this.w[var4] = (byte)var17;
                  var31 = ++var4;
                  var10001 = var6;
               }

               var32 = var31 & var10001;
               label140:
               if (var1 != null) {
                  if (var32 == 0) {
      int var32;
                     var32 = var4;
                     if (var1 == null) {
                        break label140;
                     }

                     if (var4 < a(9192, 480758518447348395L)) {
                        var7++;
                        var6 += var4;
                     }
                  }

                  var32 = var9;
               }

               var10 = var32;
            }

            this.L[var20++] = this.s[--var18];
            var14++;
            if (var1 != null) {
               continue;
            }
         }

         var26 = var20;
         break;
      }

      var14 = var26;

      while (var14 < var3) {
         this.L[var14] = 0;
         var14++;
         if (var1 == null) {
            break;
         }
      }

      if (Ky4.F$arrString() != null) {
         Kj4.C(new Ky4[1]);
      }
   }

   protected boolean o() {
      Ky4[] var1 = Kj4.d();
      int var10000 = this.A;
      if (var1 != null) {
         var10000 = this.A != 0 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   protected void E() {
      this.A = 0;
      this.o = 0;
      this.R = new ArrayList();
      this.t = null;
      this.T = null;
   }

   protected int M$int() {
      int var1 = 0;

      try {
         var1 = this.y.read();
      } catch (IOException var3) {
         this.A = 1;
      }

      return var1;
   }

   protected int L$int() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Kj4.d ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: aload 0
      // 05: invokevirtual com/finalshell/core/NS3.M$int ()I
      // 08: putfield com/finalshell/core/NS3.r I
      // 0b: bipush 0
      // 0c: istore 2
      // 0d: astore 1
      // 0e: aload 0
      // 0f: getfield com/finalshell/core/NS3.r I
      // 12: aload 1
      // 13: ifnull 94
      // 16: ifle 93
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1f: athrow
      // 20: iload 2
      // 21: aload 0
      // 22: getfield com/finalshell/core/NS3.r I
      // 25: if_icmpge 70
      // 28: aload 0
      // 29: getfield com/finalshell/core/NS3.y Ljava/io/BufferedInputStream;
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/NS3.m [B
      // 30: iload 2
      // 31: aload 0
      // 32: getfield com/finalshell/core/NS3.r I
      // 35: iload 2
      // 36: isub
      // 37: invokevirtual java/io/BufferedInputStream.read ([BII)I
      // 3a: istore 3
      // 3b: iload 3
      // 3c: bipush -1
      // 3d: aload 1
      // 3e: ifnull 84
      // 41: aload 1
      // 42: ifnull 6a
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4b: athrow
      // 4c: if_icmpne 61
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 55: athrow
      // 56: aload 1
      // 57: ifnonnull 70
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 60: athrow
      // 61: iload 2
      // 62: iload 3
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 69: athrow
      // 6a: iadd
      // 6b: istore 2
      // 6c: aload 1
      // 6d: ifnonnull 20
      // 70: goto 74
      // 73: astore 3
      // 74: iload 2
      // 75: aload 1
      // 76: ifnull 94
      // 79: aload 0
      // 7a: getfield com/finalshell/core/NS3.r I
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 83: athrow
      // 84: if_icmpge 93
      // 87: aload 0
      // 88: bipush 1
      // 89: putfield com/finalshell/core/NS3.A I
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 92: athrow
      // 93: iload 2
      // 94: ireturn
   }

   protected int[] K(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 3
      // 01: iload 1
      // 02: imul
      // 03: istore 3
      // 04: invokestatic com/finalshell/core/Kj4.d ()[Lcom/finalshell/ui/panel/Ky4;
      // 07: aconst_null
      // 08: astore 4
      // 0a: astore 2
      // 0b: iload 3
      // 0c: newarray 8
      // 0e: astore 5
      // 10: bipush 0
      // 11: istore 6
      // 13: aload 0
      // 14: getfield com/finalshell/core/NS3.y Ljava/io/BufferedInputStream;
      // 17: aload 5
      // 19: invokevirtual java/io/BufferedInputStream.read ([B)I
      // 1c: istore 6
      // 1e: goto 23
      // 21: astore 7
      // 23: iload 6
      // 25: aload 2
      // 26: ifnull 54
      // 29: iload 3
      // 2a: if_icmpge 44
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 33: athrow
      // 34: aload 0
      // 35: bipush 1
      // 36: putfield com/finalshell/core/NS3.A I
      // 39: aload 2
      // 3a: ifnonnull dd
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 43: athrow
      // 44: sipush 15647
      // 47: ldc2_w 1990267153661068369
      // 4a: invokestatic com/finalshell/core/NS3.a (IJ)I
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 53: athrow
      // 54: newarray 10
      // 56: astore 4
      // 58: bipush 0
      // 59: istore 7
      // 5b: bipush 0
      // 5c: istore 8
      // 5e: iload 7
      // 60: iload 1
      // 61: if_icmpge dd
      // 64: aload 5
      // 66: iload 8
      // 68: iinc 8 1
      // 6b: baload
      // 6c: sipush 5137
      // 6f: ldc2_w 9205847320407289180
      // 72: invokestatic com/finalshell/core/NS3.a (IJ)I
      // 75: iand
      // 76: istore 9
      // 78: aload 5
      // 7a: iload 8
      // 7c: iinc 8 1
      // 7f: baload
      // 80: sipush 29014
      // 83: ldc2_w 6465265476012197917
      // 86: invokestatic com/finalshell/core/NS3.a (IJ)I
      // 89: iand
      // 8a: istore 10
      // 8c: aload 5
      // 8e: iload 8
      // 90: iinc 8 1
      // 93: baload
      // 94: sipush 29014
      // 97: ldc2_w 6465265476012197917
      // 9a: invokestatic com/finalshell/core/NS3.a (IJ)I
      // 9d: iand
      // 9e: istore 11
      // a0: aload 4
      // a2: aload 2
      // a3: ifnull df
      // a6: iload 7
      // a8: iinc 7 1
      // ab: sipush 23986
      // ae: ldc2_w 7037906768170444019
      // b1: invokestatic com/finalshell/core/NS3.a (IJ)I
      // b4: iload 9
      // b6: sipush 7198
      // b9: ldc2_w 6126525539120522584
      // bc: invokestatic com/finalshell/core/NS3.a (IJ)I
      // bf: ishl
      // c0: ior
      // c1: iload 10
      // c3: sipush 8293
      // c6: ldc2_w 3759626309519939892
      // c9: invokestatic com/finalshell/core/NS3.a (IJ)I
      // cc: ishl
      // cd: ior
      // ce: iload 11
      // d0: ior
      // d1: iastore
      // d2: aload 2
      // d3: ifnonnull 5e
      // d6: goto dd
      // d9: invokestatic com/finalshell/core/NS3.a (Ljava/io/IOException;)Ljava/io/IOException;
      // dc: athrow
      // dd: aload 4
      // df: areturn
   }

   protected void C() {
      Ky4[] var10000 = Kj4.d();
      boolean var2 = false;
      Ky4[] var1 = var10000;

      while (!var2) {
         int var7 = this.o();
         if (var1 != null) {
            if (var7 != 0) {
               break;
            }

            var7 = this.M$int();
         }

         label73: {
            label72: {
               label85: {
                  label70: {
                     int var3 = var7;
                     if (var1 != null) {
                        switch (var3) {
                           case 33:
                              break label70;
                           case 44:
                              this.h();
                              break;
                           case 59:
                              break label85;
                           default:
                              break label72;
                        }
                     }

                     if (var1 != null) {
                        break label73;
                     }
                  }

                  int var6 = this.M$int();
                  if (var1 != null) {
                     switch (var6) {
                        case 249:
                           this.q();
                           if (var1 != null) {
                              break label73;
                           }
                        case 255:
                           this.L$int();
                           String var4 = "";
                           int var5 = 0;

                           label83: {
                              while (var5 < a(22383, 5230609835344031271L)) {
                                 var4 = var4 + (char)this.m[var5];
                                 var5++;
                                 if (var1 == null) {
                                    break label83;
                                 }

                                 if (var1 == null) {
                                    break;
                                 }
                              }

                              if (var4.equals(a(12420, 19575))) {
                                 this.W();
                                 if (var1 != null) {
                                    break label73;
                                 }
                              }

                              this.K();
                           }

                           if (var1 != null) {
                              break label73;
                           }
                        default:
                           this.K();
                     }
                  }

                  if (var1 != null) {
                     break label73;
                  }
               }

               var2 = true;
               if (var1 != null) {
                  break label73;
               }
            }

            this.A = 1;
         }

         if (var1 == null) {
            break;
         }
      }
   }

   protected void q() {
      Ky4[] var10000 = Kj4.d();
      this.M$int();
      Ky4[] var1 = var10000;
      int var2 = this.M$int();
      this.z = (var2 & a(8264, 3197096439304493319L)) >> 2;
      NS3 var3 = this;
      if (var1 != null) {
         if (this.z == 0) {
            this.z = 1;
         }

         var3 = this;
      }

      int var10001 = var2 & 1;
      if (var1 != null) {
         var10001 = var10001 != 0 ? 1 : 0;
      }

      var3.B = (boolean)var10001;
      this.e = this.v() * a(350, 6868384764813129740L);
      this.V = this.M$int();
      this.M$int();
   }

   protected void k() {
      Ky4[] var10000 = Kj4.d();
      String var2 = "";
      int var3 = 0;
      Ky4[] var1 = var10000;

      label45: {
         while (true) {
            if (var3 < a(716, 2577296619705613193L)) {
               var2 = var2 + (char)this.M$int();
               var3++;
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  continue;
               }
            }

            var4 = var2.startsWith(a(12421, 25110));
            if (var1 == null) {
               break label45;
            }

            if (!var4) {
               this.A = 1;
               return;
            }

            this.M$void();
            break;
         }

         var4 = this.b;
      }

      label50: {
         if (var1 != null) {
            if (!var4) {
               return;
            }

            var5 = this;
            if (var1 == null) {
               break label50;
            }

            var4 = this.o();
         }

         if (var4) {
            return;
         }

         this.t = this.K(this.X);
         var5 = this;
      }

      var5.J = this.t[this.d];
   }

   protected void h() {
      Ky4[] var10000 = Kj4.d();
      this.i = this.v();
      Ky4[] var1 = var10000;
      this.k = this.v();
      this.q = this.v();
      this.h = this.v();
      int var2 = this.M$int();
      int var10001 = var2 & a(5914, 5184386143853162070L);
      if (var1 != null) {
         var10001 = var10001 != 0 ? 1 : 0;
      }

      this.f = (boolean)var10001;
      var10001 = (var2 & a(19308, 8216995625742070335L)) != 0;
      if (var1 != null) {
         var10001 = var10001 != 0 ? 1 : 0;
      }

      label78: {
         label84: {
            this.c = (boolean)var10001;
            this.H = 2 << (var2 & a(27345, 3301359291208651672L));
            var4 = this.f;
            if (var1 != null) {
               if (this.f) {
                  this.T = this.K(this.H);
                  this.K = this.T;
                  if (var1 != null) {
                     break label84;
                  }
               }

               this.K = this.t;
               var4 = this.d;
            }

            if (var1 == null) {
               break label78;
            }

            if (var4 == this.V) {
               this.J = 0;
            }
         }

         var4 = 0;
      }

      int var3 = var4;
      NS3 var5 = this;
      if (var1 != null) {
         if (this.B) {
            var3 = this.K[this.V];
            this.K[this.V] = 0;
         }

         var5 = this;
      }

      if (var1 != null) {
         if (var5.K == null) {
            this.A = 1;
         }

         var5 = this;
      }

      boolean var6 = var5.o();
      if (var1 != null) {
         if (var6) {
            return;
         }

         this.r();
         this.K();
         var6 = this.o();
      }

      label85: {
         if (var1 != null) {
            if (var6) {
               return;
            }

            this.o++;
            this.u = new BufferedImage(this.n, this.g, 3);
            this.L$void();
            this.R.add(new Kj4(this.u, this.e));
            var7 = this;
            if (var1 == null) {
               break label85;
            }

            var6 = this.B;
         }

         if (var6) {
            this.K[this.V] = var3;
         }

         var7 = this;
      }

      var7.F();
   }

   protected void M$void() {
      Ky4[] var10000 = Kj4.d();
      this.n = this.v();
      this.g = this.v();
      int var2 = this.M$int();
      Ky4[] var1 = var10000;
      int var10001 = var2 & a(299, 4404463374864398441L);
      if (var1 != null) {
         var10001 = var10001 != 0 ? 1 : 0;
      }

      this.b = (boolean)var10001;
      this.X = 2 << (var2 & a(22707, 6445485269405196771L));
      this.d = this.M$int();
      this.a = this.M$int();
   }

   protected void W() {
      Ky4[] var1 = Kj4.d();

      label25:
      while (true) {
         this.L$int();
         if (this.m[0] == 1) {
            int var2 = this.m[1] & a(29014, 6465265476012197917L);
            int var3 = this.m[2] & a(29014, 6465265476012197917L);
            this.M = var3 << a(6751, 5214305717958681354L) | var2;
         }

         do {
            int var10000 = this.r;
            if (var1 != null) {
               if (this.r <= 0) {
                  continue;
               }

               var10000 = this.o();
            }

            if (var10000 == 0) {
               continue label25;
            }
         } while (var1 == null);

         return;
      }
   }

   protected int v() {
      return this.M$int() | this.M$int() << a(6751, 5214305717958681354L);
   }

   protected void F() {
      this.C = this.z;
      this.O = new Rectangle(this.i, this.k, this.q, this.h);
      this.x = this.u;
      this.Z = this.J;
      this.T = null;
   }

   protected void L$void() {
      Ky4[] var1;
      int[] var2;
      int var18;
      Ky4[] var10000 = Kj4.d();
      var2 = ((DataBufferInt)this.u.getRaster().getDataBuffer()).getData();
      var1 = var10000;
      var18 = this.C;
      label140:
      if (var1 != null) {
         label138:
         if (this.C > 0) {
            NS3 var19 = this;
            if (var1 != null) {
               label134:
               if (this.C == 3) {
                  label132: {
                     int var3 = this.o - 2;
                     if (var1 != null) {
                        if (var3 <= 0) {
                           break label132;
                        }

                        this.x = this.j(var3 - 1);
                     }

                     if (var1 != null) {
                        break label134;
                     }
                  }

                  this.x = null;
               }

               var19 = this;
            }

            BufferedImage var20 = var19.x;
            if (var1 != null) {
               if (var19.x == null) {
                  break label138;
               }

               var20 = this.x;
            }

            int[] var14 = ((DataBufferInt)var20.getRaster().getDataBuffer()).getData();
            System.arraycopy(var14, 0, var2, 0, this.n * this.g);
            var18 = this.C;
            if (var1 == null) {
               break label140;
            }

            if (this.C == 2) {
               Graphics2D var4;
               Color var5;
               label115: {
                  var4 = this.u.createGraphics();
                  if (this.B) {
                     var5 = new Color(0, 0, 0, 0);
                     if (var1 != null) {
                        break label115;
                     }
                  }

                  var5 = new Color(this.Z);
               }

               var4.setColor(var5);
               var4.setComposite(AlphaComposite.Src);
               var4.fill(this.O);
               var4.dispose();
            }
         }

         var18 = 1;
      }

      int var15 = var18;
      int var16 = a(6751, 5214305717958681354L);
      int var17 = 0;
      int var6 = 0;

      label107:
      while (true) {
         var18 = var6;

         label105:
         while (var18 < this.h) {
            label158: {
               int var7 = (((var6) ? 1 : 0) ? 1 : 0) ? 1 : 0;
               var18 = (((this.c) != 0) != 0) != 0;
               if (var1 != null) {
                  if (this.c) {
                     label97: {
                        var18 = var17;
                        int var10001 = this.h;
                        if (var1 != null) {
                           if (var17 >= this.h) {
                              var18 = ++var15;
                              if (var1 == null) {
                                 break label97;
                              }

                              switch (var15) {
                                 case 2:
                                    var17 = 4;
                                    if (var1 != null) {
                                       break;
                                    }
                                 case 3:
                                    var17 = 2;
                                    var16 = 4;
                                    if (var1 != null) {
                                       break;
                                    }
                                 case 4:
                                    var17 = 1;
                                    var16 = 2;
                              }
                           }

                           var7 = var17;
                           var18 = var17;
                           var10001 = var16;
                        }

                        var18 += var10001;
                     }

                     var17 = var18;
                  }

                  var7 += this.k;
                  if (var1 == null) {
                     break label158;
                  }

                  var18 = var7;
               }

               if (var18 < this.g) {
                  int var8 = var7 * this.n;
                  int var9 = var8 + this.i;
                  int var10 = var9 + this.q;
                  var18 = var8 + this.n;
                  int var26 = var10;
                  if (var1 != null) {
                     if (var18 < var10) {
                        var10 = var8 + this.n;
                     }

                     var18 = var6;
                     var26 = this.q;
                  }

                  int var11 = var18 * var26;

                  while (var9 < var10) {
                     int var12 = this.L[var11++] & a(29014, 6465265476012197917L);
                     int var13 = this.K[var12];
                     if (var1 != null) {
                        var18 = var13;
                        if (var1 == null) {
                           continue label105;
                        }

                        if (var13 != 0) {
                           var2[var9] = var13;
                        }

                        var9++;
                     }

                     if (var1 == null) {
                        break;
                     }
                  }
               }

               var6++;
            }

            if (var1 == null) {
               return;
            }
            continue label107;
         }

         return;
      }
   }

   protected void K() {
      do {
         this.L$int();
      } while (this.r > 0 && !this.o());
   }

   public int Y() {
      return this.A;
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 12420) & 65535;
      if (l[var2] == null) {
         char[] var3 = j[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 155;
               break;
            case 1:
               var10000 = 64;
               break;
            case 2:
               var10000 = 233;
               break;
            case 3:
               var10000 = 31;
               break;
            case 4:
               var10000 = 7;
               break;
            case 5:
               var10000 = 143;
               break;
            case 6:
               var10000 = 45;
               break;
            case 7:
               var10000 = 40;
               break;
            case 8:
               var10000 = 138;
               break;
            case 9:
               var10000 = 6;
               break;
            case 10:
               var10000 = 135;
               break;
            case 11:
               var10000 = 136;
               break;
            case 12:
               var10000 = 218;
               break;
            case 13:
               var10000 = 104;
               break;
            case 14:
               var10000 = 54;
               break;
            case 15:
               var10000 = 79;
               break;
            case 16:
               var10000 = 163;
               break;
            case 17:
               var10000 = 239;
               break;
            case 18:
               var10000 = 220;
               break;
            case 19:
               var10000 = 60;
               break;
            case 20:
               var10000 = 167;
               break;
            case 21:
               var10000 = 109;
               break;
            case 22:
               var10000 = 249;
               break;
            case 23:
               var10000 = 76;
               break;
            case 24:
               var10000 = 152;
               break;
            case 25:
               var10000 = 111;
               break;
            case 26:
               var10000 = 137;
               break;
            case 27:
               var10000 = 200;
               break;
            case 28:
               var10000 = 82;
               break;
            case 29:
               var10000 = 61;
               break;
            case 30:
               var10000 = 91;
               break;
            case 31:
               var10000 = 190;
               break;
            case 32:
               var10000 = 16;
               break;
            case 33:
               var10000 = 10;
               break;
            case 34:
               var10000 = 56;
               break;
            case 35:
               var10000 = 180;
               break;
            case 36:
               var10000 = 198;
               break;
            case 37:
               var10000 = 201;
               break;
            case 38:
               var10000 = 230;
               break;
            case 39:
               var10000 = 242;
               break;
            case 40:
               var10000 = 203;
               break;
            case 41:
               var10000 = 123;
               break;
            case 42:
               var10000 = 189;
               break;
            case 43:
               var10000 = 78;
               break;
            case 44:
               var10000 = 47;
               break;
            case 45:
               var10000 = 29;
               break;
            case 46:
               var10000 = 20;
               break;
            case 47:
               var10000 = 133;
               break;
            case 48:
               var10000 = 156;
               break;
            case 49:
               var10000 = 102;
               break;
            case 50:
               var10000 = 85;
               break;
            case 51:
               var10000 = 121;
               break;
            case 52:
               var10000 = 214;
               break;
            case 53:
               var10000 = 160;
               break;
            case 54:
               var10000 = 132;
               break;
            case 55:
               var10000 = 238;
               break;
            case 56:
               var10000 = 175;
               break;
            case 57:
               var10000 = 15;
               break;
            case 58:
               var10000 = 23;
               break;
            case 59:
               var10000 = 151;
               break;
            case 60:
               var10000 = 206;
               break;
            case 61:
               var10000 = 86;
               break;
            case 62:
               var10000 = 157;
               break;
            case 63:
               var10000 = 112;
               break;
            case 64:
               var10000 = 74;
               break;
            case 65:
               var10000 = 140;
               break;
            case 66:
               var10000 = 2;
               break;
            case 67:
               var10000 = 177;
               break;
            case 68:
               var10000 = 131;
               break;
            case 69:
               var10000 = 73;
               break;
            case 70:
               var10000 = 215;
               break;
            case 71:
               var10000 = 110;
               break;
            case 72:
               var10000 = 83;
               break;
            case 73:
               var10000 = 68;
               break;
            case 74:
               var10000 = 176;
               break;
            case 75:
               var10000 = 118;
               break;
            case 76:
               var10000 = 182;
               break;
            case 77:
               var10000 = 117;
               break;
            case 78:
               var10000 = 27;
               break;
            case 79:
               var10000 = 39;
               break;
            case 80:
               var10000 = 142;
               break;
            case 81:
               var10000 = 26;
               break;
            case 82:
               var10000 = 141;
               break;
            case 83:
               var10000 = 12;
               break;
            case 84:
               var10000 = 43;
               break;
            case 85:
               var10000 = 66;
               break;
            case 86:
               var10000 = 75;
               break;
            case 87:
               var10000 = 21;
               break;
            case 88:
               var10000 = 87;
               break;
            case 89:
               var10000 = 240;
               break;
            case 90:
               var10000 = 245;
               break;
            case 91:
               var10000 = 246;
               break;
            case 92:
               var10000 = 59;
               break;
            case 93:
               var10000 = 103;
               break;
            case 94:
               var10000 = 32;
               break;
            case 95:
               var10000 = 193;
               break;
            case 96:
               var10000 = 222;
               break;
            case 97:
               var10000 = 105;
               break;
            case 98:
               var10000 = 46;
               break;
            case 99:
               var10000 = 55;
               break;
            case 100:
               var10000 = 212;
               break;
            case 101:
               var10000 = 119;
               break;
            case 102:
               var10000 = 178;
               break;
            case 103:
               var10000 = 125;
               break;
            case 104:
               var10000 = 244;
               break;
            case 105:
               var10000 = 99;
               break;
            case 106:
               var10000 = 229;
               break;
            case 107:
               var10000 = 67;
               break;
            case 108:
               var10000 = 216;
               break;
            case 109:
               var10000 = 208;
               break;
            case 110:
               var10000 = 128;
               break;
            case 111:
               var10000 = 172;
               break;
            case 112:
               var10000 = 3;
               break;
            case 113:
               var10000 = 19;
               break;
            case 114:
               var10000 = 97;
               break;
            case 115:
               var10000 = 204;
               break;
            case 116:
               var10000 = 210;
               break;
            case 117:
               var10000 = 124;
               break;
            case 118:
               var10000 = 30;
               break;
            case 119:
               var10000 = 174;
               break;
            case 120:
               var10000 = 224;
               break;
            case 121:
               var10000 = 227;
               break;
            case 122:
               var10000 = 221;
               break;
            case 123:
               var10000 = 213;
               break;
            case 124:
               var10000 = 72;
               break;
            case 125:
               var10000 = 127;
               break;
            case 126:
               var10000 = 90;
               break;
            case 127:
               var10000 = 106;
               break;
            case 128:
               var10000 = 223;
               break;
            case 129:
               var10000 = 62;
               break;
            case 130:
               var10000 = 232;
               break;
            case 131:
               var10000 = 8;
               break;
            case 132:
               var10000 = 92;
               break;
            case 133:
               var10000 = 49;
               break;
            case 134:
               var10000 = 134;
               break;
            case 135:
               var10000 = 250;
               break;
            case 136:
               var10000 = 154;
               break;
            case 137:
               var10000 = 241;
               break;
            case 138:
               var10000 = 253;
               break;
            case 139:
               var10000 = 36;
               break;
            case 140:
               var10000 = 129;
               break;
            case 141:
               var10000 = 100;
               break;
            case 142:
               var10000 = 145;
               break;
            case 143:
               var10000 = 25;
               break;
            case 144:
               var10000 = 18;
               break;
            case 145:
               var10000 = 139;
               break;
            case 146:
               var10000 = 93;
               break;
            case 147:
               var10000 = 14;
               break;
            case 148:
               var10000 = 33;
               break;
            case 149:
               var10000 = 42;
               break;
            case 150:
               var10000 = 161;
               break;
            case 151:
               var10000 = 195;
               break;
            case 152:
               var10000 = 191;
               break;
            case 153:
               var10000 = 166;
               break;
            case 154:
               var10000 = 81;
               break;
            case 155:
               var10000 = 186;
               break;
            case 156:
               var10000 = 148;
               break;
            case 157:
               var10000 = 107;
               break;
            case 158:
               var10000 = 209;
               break;
            case 159:
               var10000 = 89;
               break;
            case 160:
               var10000 = 225;
               break;
            case 161:
               var10000 = 88;
               break;
            case 162:
               var10000 = 0;
               break;
            case 163:
               var10000 = 1;
               break;
            case 164:
               var10000 = 34;
               break;
            case 165:
               var10000 = 24;
               break;
            case 166:
               var10000 = 53;
               break;
            case 167:
               var10000 = 179;
               break;
            case 168:
               var10000 = 217;
               break;
            case 169:
               var10000 = 165;
               break;
            case 170:
               var10000 = 35;
               break;
            case 171:
               var10000 = 44;
               break;
            case 172:
               var10000 = 96;
               break;
            case 173:
               var10000 = 22;
               break;
            case 174:
               var10000 = 52;
               break;
            case 175:
               var10000 = 164;
               break;
            case 176:
               var10000 = 58;
               break;
            case 177:
               var10000 = 17;
               break;
            case 178:
               var10000 = 184;
               break;
            case 179:
               var10000 = 5;
               break;
            case 180:
               var10000 = 243;
               break;
            case 181:
               var10000 = 247;
               break;
            case 182:
               var10000 = 71;
               break;
            case 183:
               var10000 = 120;
               break;
            case 184:
               var10000 = 98;
               break;
            case 185:
               var10000 = 50;
               break;
            case 186:
               var10000 = 170;
               break;
            case 187:
               var10000 = 194;
               break;
            case 188:
               var10000 = 226;
               break;
            case 189:
               var10000 = 197;
               break;
            case 190:
               var10000 = 144;
               break;
            case 191:
               var10000 = 94;
               break;
            case 192:
               var10000 = 159;
               break;
            case 193:
               var10000 = 171;
               break;
            case 194:
               var10000 = 188;
               break;
            case 195:
               var10000 = 28;
               break;
            case 196:
               var10000 = 115;
               break;
            case 197:
               var10000 = 173;
               break;
            case 198:
               var10000 = 70;
               break;
            case 199:
               var10000 = 248;
               break;
            case 200:
               var10000 = 254;
               break;
            case 201:
               var10000 = 162;
               break;
            case 202:
               var10000 = 51;
               break;
            case 203:
               var10000 = 211;
               break;
            case 204:
               var10000 = 48;
               break;
            case 205:
               var10000 = 181;
               break;
            case 206:
               var10000 = 255;
               break;
            case 207:
               var10000 = 147;
               break;
            case 208:
               var10000 = 38;
               break;
            case 209:
               var10000 = 146;
               break;
            case 210:
               var10000 = 37;
               break;
            case 211:
               var10000 = 169;
               break;
            case 212:
               var10000 = 130;
               break;
            case 213:
               var10000 = 63;
               break;
            case 214:
               var10000 = 41;
               break;
            case 215:
               var10000 = 185;
               break;
            case 216:
               var10000 = 4;
               break;
            case 217:
               var10000 = 183;
               break;
            case 218:
               var10000 = 252;
               break;
            case 219:
               var10000 = 150;
               break;
            case 220:
               var10000 = 80;
               break;
            case 221:
               var10000 = 116;
               break;
            case 222:
               var10000 = 84;
               break;
            case 223:
               var10000 = 108;
               break;
            case 224:
               var10000 = 219;
               break;
            case 225:
               var10000 = 57;
               break;
            case 226:
               var10000 = 199;
               break;
            case 227:
               var10000 = 236;
               break;
            case 228:
               var10000 = 13;
               break;
            case 229:
               var10000 = 126;
               break;
            case 230:
               var10000 = 234;
               break;
            case 231:
               var10000 = 187;
               break;
            case 232:
               var10000 = 168;
               break;
            case 233:
               var10000 = 95;
               break;
            case 234:
               var10000 = 235;
               break;
            case 235:
               var10000 = 153;
               break;
            case 236:
               var10000 = 196;
               break;
            case 237:
               var10000 = 77;
               break;
            case 238:
               var10000 = 69;
               break;
            case 239:
               var10000 = 251;
               break;
            case 240:
               var10000 = 158;
               break;
            case 241:
               var10000 = 237;
               break;
            case 242:
               var10000 = 65;
               break;
            case 243:
               var10000 = 207;
               break;
            case 244:
               var10000 = 202;
               break;
            case 245:
               var10000 = 122;
               break;
            case 246:
               var10000 = 192;
               break;
            case 247:
               var10000 = 113;
               break;
            case 248:
               var10000 = 9;
               break;
            case 249:
               var10000 = 101;
               break;
            case 250:
               var10000 = 231;
               break;
            case 251:
               var10000 = 205;
               break;
            case 252:
               var10000 = 228;
               break;
            case 253:
               var10000 = 149;
               break;
            case 254:
               var10000 = 11;
               break;
            default:
               var10000 = 114;
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

         l[var2] = new String(var3).intern();
      }

      return l[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14656;
      if (v[var3] == null) {
         v[var3] = (int)(p[var3] ^ var1);
      }

      return v[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "E\u0086N \u0099ä\u0006\u0016ñ4´\u0003¤yH\u0003?â\u0080";
      int var12 = "E\u0086N \u0099ä\u0006\u0016ñ4´\u0003¤yH\u0003?â\u0080".length();
      char var9 = 11;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 87;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 87;
               var10006 = var14;
            } else {
               var27 = 87;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 87;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 85;
                     break;
                  case 1:
                     var47 = 74;
                     break;
                  case 2:
                     var47 = 34;
                     break;
                  case 3:
                     var47 = 58;
                     break;
                  case 4:
                     var47 = 52;
                     break;
                  case 5:
                     var47 = 114;
                     break;
                  default:
                     var47 = 117;
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
            j = var13;
            l = new String[3];
            long var0 = 880308453958512197L;
            long[] var6 = new long[22];
            int var3 = 0;
            String var4 = "\u009235´|df·²sv©Âå\u008a¶\u0019ûÔßwúÖ¬S½2¦¸4dîá÷\u0018¸÷óHÉ¨iG£(¦UÊºÂ÷eP[K\rBN£«&Õ#\u0004êxÓÏX \u0000it@\"½F\u0095=ÚãÄthë¢\u0007%CÑ¨¢Þµ¦§¤\u0084\u0081\u0002 +@\u0093\u0097\u007fî\u001a\u000f£Ãæôø×\u008e\u009càë\u0014\u0081^\u0018¤;\u0091w^\u0000×x`\u001d\u0010\u008f¡wM\u0002ËyÞwy\u0003^\u0085\u0095U\u009cVC\u0081\u0080hI\u0083³\u001c:";
            int var5 = "\u009235´|df·²sv©Âå\u008a¶\u0019ûÔßwúÖ¬S½2¦¸4dîá÷\u0018¸÷óHÉ¨iG£(¦UÊºÂ÷eP[K\rBN£«&Õ#\u0004êxÓÏX \u0000it@\"½F\u0095=ÚãÄthë¢\u0007%CÑ¨¢Þµ¦§¤\u0084\u0081\u0002 +@\u0093\u0097\u007fî\u001a\u000f£Ãæôø×\u008e\u009càë\u0014\u0081^\u0018¤;\u0091w^\u0000×x`\u001d\u0010\u008f¡wM\u0002ËyÞwy\u0003^\u0085\u0095U\u009cVC\u0081\u0080hI\u0083³\u001c:"
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
                           p = var6;
                           v = new Integer[22];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "Õ®T\u009eRÐ\u0095\u0019BÛ\u000frwÏMG";
                        var5 = "Õ®T\u009eRÐ\u0095\u0019BÛ\u000frwÏMG".length();
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
}






