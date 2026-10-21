package com.finalshell.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class C32 {
   public final InputStream g;
   public final OutputStream n;
   public final byte[] Y;
   public final byte[] o;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] f;

   public C32(InputStream var1, OutputStream var2) {
      this.g = var1;
      this.n = var2;
      this.Y = new byte[a(2461, 870976571283922038L)];
      this.o = new byte[a(24813, 1966778721617622277L)];
   }

   public boolean u() throws IOException {
      String[] var1 = Ub2.A();

      boolean var10000;
      while (true) {
         byte var2 = this.f();
         if (var2 == a(25054, 9096645472812381219L)) {
            var10000 = false;
            break;
         }

         if (var2 == a(8224, 5823705257337484742L)) {
            var10000 = true;
            if (var1 == null) {
               return true;
            }
            break;
         }
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void R(Path var1, boolean var2) throws IOException {
      String[] var10000 = Ub2.A();
      DataInputStream var4 = new DataInputStream(Files.newInputStream(var1));
      String[] var3 = var10000;

      try {
         Object var6;
         label39: {
            boolean var5 = this.u();
            if (var5) {
               var6 = new YO3_2();
               if (var3 == null) {
      byte var13;
                  break label39;
               }
            }

            var6 = new FL3();
         }

         byte[] var7;
         label56: {
            label68: {
               label64: {
                  try {
                     var13 = var2;
                     if (var3 != null) {
                        break label68;
                     }

                     if (!var2) {
                        break label64;
                     }
                  } catch (Throwable var11) {
                     throw a(var11);
                  }

                  var7 = new byte[a(11519, 2170539695079520528L)];

                  try {
                     if (var3 == null) {
                        break label56;
                     }
                  } catch (Throwable var10) {
                     boolean var10001 = false;
                     throw a(var10);
                  }
               }

               try {
                  var13 = a(30642, 1401153680221577816L);
               } catch (Throwable var9) {
                  boolean var15 = false;
                  throw a(var9);
               }
            }

            var7 = new byte[var13];
         }

         this.O(var4, 1, (J1)var6, var7);
         this.V();
      } catch (Throwable var12) {
         try {
            var4.close();
         } catch (Throwable var8) {
            var12.addSuppressed(var8);
         }

         throw var12;
      }

      var4.close();
   }

   public void O(DataInputStream var1, int var2, J1 var3, byte[] var4) throws IOException {
      String[] var5 = Ub2.A();

      int var6;
      while ((var6 = var1.read(var4)) != -1) {
         this.B(var2++, var4, var6, var3);
         if (var5 != null) {
            break;
         }
      }
   }

   public void V() throws IOException {
      byte var6;
      String[] var10000 = Ub2.A();
      int var2 = 0;
      String[] var1 = var10000;

      while (var2 < a(9671, 121426466144776233L)) {
         this.b((byte)4);
         byte var3 = this.f();

         int var10001;
         label37: {
            try {
               var6 = var3;
               var10001 = a(28881, 8267154407292216637L);
               if (var1 != null) {
                  break label37;
               }

               if (var3 == var10001) {
                  return;
               }
            } catch (IOException var5) {
               throw a(var5);
            }

            var6 = var3;
            var10001 = a(1418, 8567421317519888487L);
         }

         try {
            if (var6 == var10001) {
               throw new IOException(a(-20655, 26222));
            }
         } catch (IOException var4) {
            throw a(var4);
         }

         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   public void B(int param1, byte[] param2, int param3, J1 param4) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ub2.A ()[Ljava/lang/String;
      // 003: astore 5
      // 005: iload 3
      // 006: aload 5
      // 008: ifnonnull 02b
      // 00b: aload 2
      // 00c: arraylength
      // 00d: if_icmpge 02a
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aload 2
      // 018: iload 3
      // 019: sipush 21777
      // 01c: ldc2_w 2375467120497623280
      // 01f: invokestatic com/finalshell/core/C32.a (IJ)I
      // 022: bastore
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: bipush 0
      // 02b: istore 6
      // 02d: iload 6
      // 02f: sipush 20055
      // 032: ldc2_w 1367562646882196400
      // 035: invokestatic com/finalshell/core/C32.a (IJ)I
      // 038: if_icmpge 0f1
      // 03b: aload 2
      // 03c: arraylength
      // 03d: sipush 11519
      // 040: ldc2_w 2170539695079520528
      // 043: invokestatic com/finalshell/core/C32.a (IJ)I
      // 046: if_icmpne 05d
      // 049: aload 0
      // 04a: getfield com/finalshell/core/C32.n Ljava/io/OutputStream;
      // 04d: bipush 2
      // 04e: invokevirtual java/io/OutputStream.write (I)V
      // 051: aload 5
      // 053: ifnull 06c
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield com/finalshell/core/C32.n Ljava/io/OutputStream;
      // 061: bipush 1
      // 062: invokevirtual java/io/OutputStream.write (I)V
      // 065: goto 06c
      // 068: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: aload 0
      // 06d: getfield com/finalshell/core/C32.n Ljava/io/OutputStream;
      // 070: iload 1
      // 071: invokevirtual java/io/OutputStream.write (I)V
      // 074: aload 0
      // 075: getfield com/finalshell/core/C32.n Ljava/io/OutputStream;
      // 078: iload 1
      // 079: bipush -1
      // 07a: ixor
      // 07b: invokevirtual java/io/OutputStream.write (I)V
      // 07e: aload 0
      // 07f: getfield com/finalshell/core/C32.n Ljava/io/OutputStream;
      // 082: aload 2
      // 083: invokevirtual java/io/OutputStream.write ([B)V
      // 086: aload 0
      // 087: aload 2
      // 088: aload 4
      // 08a: invokespecial com/finalshell/core/C32.H ([BLcom/finalshell/core/J1;)V
      // 08d: aload 0
      // 08e: getfield com/finalshell/core/C32.n Ljava/io/OutputStream;
      // 091: invokevirtual java/io/OutputStream.flush ()V
      // 094: aload 0
      // 095: invokespecial com/finalshell/core/C32.f ()B
      // 098: istore 7
      // 09a: iload 7
      // 09c: sipush 26106
      // 09f: ldc2_w 6703429421605105695
      // 0a2: invokestatic com/finalshell/core/C32.a (IJ)I
      // 0a5: if_icmpne 0a9
      // 0a8: return
      // 0a9: iload 7
      // 0ab: sipush 25054
      // 0ae: ldc2_w 9096645472812381219
      // 0b1: invokestatic com/finalshell/core/C32.a (IJ)I
      // 0b4: aload 5
      // 0b6: ifnonnull 0dd
      // 0b9: if_icmpne 0d2
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: iinc 6 1
      // 0c6: aload 5
      // 0c8: ifnull 02d
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: iload 7
      // 0d4: sipush 1418
      // 0d7: ldc2_w 8567421317519888487
      // 0da: invokestatic com/finalshell/core/C32.a (IJ)I
      // 0dd: if_icmpne 094
      // 0e0: new java/io/IOException
      // 0e3: dup
      // 0e4: sipush -20653
      // 0e7: sipush -2089
      // 0ea: invokestatic com/finalshell/core/C32.a (II)Ljava/lang/String;
      // 0ed: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0f0: athrow
      // 0f1: new java/io/IOException
      // 0f4: dup
      // 0f5: sipush -20656
      // 0f8: sipush 1325
      // 0fb: invokestatic com/finalshell/core/C32.a (II)Ljava/lang/String;
      // 0fe: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 101: athrow
   }

   public void H(byte[] var1, J1 var2) throws IOException {
      byte[] var4 = new byte[var2.Z()];
      String[] var10000 = Ub2.A();
      long var5 = var2.C(var1);
      String[] var3 = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var2.Z()) {
            try {
               var4[var2.Z() - var7 - 1] = (byte)((int)(var5 >> a(4795, 9046780148557596504L) * var7 & b(27706, 1895517838495274593L)));
               var7++;
               if (var3 != null) {
                  break;
               }

               if (var3 == null) {
                  continue;
               }
            } catch (IOException var8) {
               throw a(var8);
            }
         }

         this.n.write(var4);
         break;
      }
   }

   public void a(Path param1, boolean param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ub2.A ()[Ljava/lang/String;
      // 03: new java/io/DataOutputStream
      // 06: dup
      // 07: aload 1
      // 08: bipush 0
      // 09: anewarray 67
      // 0c: invokestatic java/nio/file/Files.newOutputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;
      // 0f: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 12: astore 4
      // 14: astore 3
      // 15: aload 0
      // 16: getfield com/finalshell/core/C32.g Ljava/io/InputStream;
      // 19: invokevirtual java/io/InputStream.available ()I
      // 1c: dup
      // 1d: istore 5
      // 1f: aload 3
      // 20: ifnonnull 44
      // 23: ifle 3f
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/finalshell/core/C32.g Ljava/io/InputStream;
      // 31: iload 5
      // 33: i2l
      // 34: invokevirtual java/io/InputStream.skip (J)J
      // 37: pop2
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: iload 2
      // 41: invokevirtual com/finalshell/core/C32.A (Z)I
      // 44: istore 6
      // 46: iload 2
      // 47: ifeq 57
      // 4a: new com/finalshell/core/YO3_2
      // 4d: dup
      // 4e: invokespecial com/finalshell/core/YO3_2.<init> ()V
      // 51: astore 7
      // 53: aload 3
      // 54: ifnull 60
      // 57: new com/finalshell/core/FL3
      // 5a: dup
      // 5b: invokespecial com/finalshell/core/FL3.<init> ()V
      // 5e: astore 7
      // 60: aload 0
      // 61: aload 7
      // 63: bipush 1
      // 64: iload 6
      // 66: aload 4
      // 68: invokevirtual com/finalshell/core/C32.C (Lcom/finalshell/core/J1;IILjava/io/DataOutputStream;)V
      // 6b: aload 4
      // 6d: invokevirtual java/io/DataOutputStream.close ()V
      // 70: goto 89
      // 73: astore 5
      // 75: aload 4
      // 77: invokevirtual java/io/DataOutputStream.close ()V
      // 7a: goto 86
      // 7d: astore 6
      // 7f: aload 5
      // 81: aload 6
      // 83: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 86: aload 5
      // 88: athrow
      // 89: return
   }

   public void C(J1 param1, int param2, int param3, DataOutputStream param4) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ub2.A ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 6
      // 06: astore 5
      // 08: bipush 0
      // 09: istore 9
      // 0b: iload 3
      // 0c: bipush 4
      // 0d: if_icmpne 2e
      // 10: aload 0
      // 11: sipush 26106
      // 14: ldc2_w 6703429421605105695
      // 17: invokestatic com/finalshell/core/C32.a (IJ)I
      // 1a: invokevirtual com/finalshell/core/C32.b (B)V
      // 1d: aload 5
      // 1f: ifnonnull 4a
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: return
      // 2a: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: iload 3
      // 2f: aload 5
      // 31: ifnonnull 47
      // 34: bipush 1
      // 35: if_icmpne 4a
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: istore 7
      // 4d: aload 0
      // 4e: iload 2
      // 4f: iload 7
      // 51: aload 1
      // 52: invokevirtual com/finalshell/core/C32.M (IZLcom/finalshell/core/J1;)[B
      // 55: astore 8
      // 57: aload 4
      // 59: aload 8
      // 5b: invokevirtual java/io/DataOutputStream.write ([B)V
      // 5e: iinc 2 1
      // 61: bipush 0
      // 62: istore 9
      // 64: bipush 1
      // 65: istore 6
      // 67: aload 0
      // 68: sipush 26106
      // 6b: ldc2_w 6703429421605105695
      // 6e: invokestatic com/finalshell/core/C32.a (IJ)I
      // 71: invokevirtual com/finalshell/core/C32.b (B)V
      // 74: goto ed
      // 77: astore 10
      // 79: iinc 9 1
      // 7c: iload 9
      // 7e: aload 5
      // 80: ifnonnull bd
      // 83: sipush 20055
      // 86: ldc2_w 1367562646882196400
      // 89: invokestatic com/finalshell/core/C32.a (IJ)I
      // 8c: if_icmpne af
      // 8f: goto 96
      // 92: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: aload 0
      // 97: invokevirtual com/finalshell/core/C32.q ()V
      // 9a: new java/io/IOException
      // 9d: dup
      // 9e: sipush -20649
      // a1: sipush 27759
      // a4: invokestatic com/finalshell/core/C32.a (II)Ljava/lang/String;
      // a7: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // aa: athrow
      // ab: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: aload 0
      // b0: sipush 25054
      // b3: ldc2_w 9096645472812381219
      // b6: invokestatic com/finalshell/core/C32.a (IJ)I
      // b9: invokevirtual com/finalshell/core/C32.b (B)V
      // bc: bipush 0
      // bd: istore 6
      // bf: goto ed
      // c2: astore 10
      // c4: aload 0
      // c5: sipush 26106
      // c8: ldc2_w 6703429421605105695
      // cb: invokestatic com/finalshell/core/C32.a (IJ)I
      // ce: invokevirtual com/finalshell/core/C32.b (B)V
      // d1: goto ed
      // d4: astore 10
      // d6: aload 0
      // d7: invokevirtual com/finalshell/core/C32.q ()V
      // da: new java/io/IOException
      // dd: dup
      // de: sipush -20650
      // e1: sipush 8176
      // e4: invokestatic com/finalshell/core/C32.a (II)Ljava/lang/String;
      // e7: aload 10
      // e9: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // ec: athrow
      // ed: aload 0
      // ee: iload 6
      // f0: invokevirtual com/finalshell/core/C32.g (Z)I
      // f3: istore 3
      // f4: goto 08
   }

   public void b(byte var1) throws IOException {
      this.n.write(var1);
      this.n.flush();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Irreducible bytecode was duplicated to produce valid code
   public int A(boolean var1) throws IOException {
      String[] var10000 = Ub2.A();
      boolean var4 = false;
      String[] var2 = var10000;

      int var5;
      label54: {
         label62: {
            label58: {
               try {
                  var9 = var1;
                  if (var2 != null) {
                     break label62;
                  }

                  if (var1) {
                     break label58;
                  }
               } catch (IOException var8) {
                  throw a(var8);
               }

               var5 = a(3278, 8833433602594920748L);

               try {
                  if (var2 == null) {
                     break label54;
                  }
               } catch (IOException var7) {
                  boolean var10001 = false;
                  throw a(var7);
               }
            }

            try {
               var9 = a(30280, 8800556220609799073L);
            } catch (IOException var6) {
               boolean var11 = false;
               throw a(var6);
            }
         }

         var5 = (int)(var9);
      }

      this.b((byte)var5);

      label36:
      while (true) {
         byte var3 = this.f();
         if (var3 == 1 || var3 == 2) {
            while (var2 != null) {
               if (var3 != 2) {
                  continue label36;
               }
            }

            return var3;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public int g(boolean var1) throws IOException {
      byte var6;
      String[] var10000 = Ub2.A();
      boolean var4 = false;
      String[] var2 = var10000;

      label29:
      while (true) {
         byte var3 = this.f();
         if (var3 != 1) {
            var6 = var3;
         } else {
            var6 = var3;
            if (var2 == null) {
               return var3;
            }
         }

         while (var2 == null) {
            try {
               if (var6 != 2 && var3 != 4) {
                  continue label29;
               }
            } catch (IOException var5) {
               throw a(var5);
            }

            var6 = var3;
            if (var2 == null) {
               return var3;
            }
         }

         return var6;
      }
   }

   public void U() {
      try {
         Thread.sleep(b(7161, 8953126092121055651L));
      } catch (InterruptedException var4) {
         try {
            this.q();
         } catch (IOException var3) {
         }

         throw new RuntimeException(a(-20654, -7276), var4);
      }
   }

   public void q() throws IOException {
      this.b((byte)a(26439, 2959681801487233703L));
      this.b((byte)a(1418, 8567421317519888487L));
   }

   public byte[] M(int param1, boolean param2, J1 param3) throws IOException, M8, U3, VH {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ub2.A ()[Ljava/lang/String;
      // 003: astore 4
      // 005: iload 2
      // 006: ifeq 014
      // 009: aload 0
      // 00a: getfield com/finalshell/core/C32.Y [B
      // 00d: astore 5
      // 00f: aload 4
      // 011: ifnull 01a
      // 014: aload 0
      // 015: getfield com/finalshell/core/C32.o [B
      // 018: astore 5
      // 01a: aload 0
      // 01b: invokespecial com/finalshell/core/C32.f ()B
      // 01e: istore 6
      // 020: iload 6
      // 022: iload 1
      // 023: bipush 1
      // 024: isub
      // 025: aload 4
      // 027: ifnonnull 044
      // 02a: if_icmpne 041
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: new com/finalshell/core/M8
      // 037: dup
      // 038: aload 0
      // 039: invokespecial com/finalshell/core/M8.<init> (Lcom/finalshell/core/C32;)V
      // 03c: athrow
      // 03d: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: iload 6
      // 043: iload 1
      // 044: aload 4
      // 046: ifnonnull 077
      // 049: if_icmpeq 060
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: new com/finalshell/core/U3
      // 056: dup
      // 057: aload 0
      // 058: invokespecial com/finalshell/core/U3.<init> (Lcom/finalshell/core/C32;)V
      // 05b: athrow
      // 05c: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 0
      // 061: invokespecial com/finalshell/core/C32.f ()B
      // 064: istore 6
      // 066: iload 6
      // 068: aload 4
      // 06a: ifnonnull 088
      // 06d: iload 1
      // 06e: bipush -1
      // 06f: ixor
      // 070: goto 077
      // 073: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: if_icmpeq 087
      // 07a: new com/finalshell/core/VH
      // 07d: dup
      // 07e: aload 0
      // 07f: invokespecial com/finalshell/core/VH.<init> (Lcom/finalshell/core/C32;)V
      // 082: athrow
      // 083: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: bipush 0
      // 088: istore 7
      // 08a: iload 7
      // 08c: aload 5
      // 08e: arraylength
      // 08f: if_icmpge 0af
      // 092: aload 5
      // 094: iload 7
      // 096: aload 0
      // 097: invokespecial com/finalshell/core/C32.f ()B
      // 09a: bastore
      // 09b: iinc 7 1
      // 09e: aload 4
      // 0a0: ifnonnull 0ed
      // 0a3: aload 4
      // 0a5: ifnull 08a
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield com/finalshell/core/C32.g Ljava/io/InputStream;
      // 0b3: invokevirtual java/io/InputStream.available ()I
      // 0b6: aload 3
      // 0b7: invokeinterface com/finalshell/core/J1.Z ()I 1
      // 0bc: if_icmplt 0e9
      // 0bf: aload 4
      // 0c1: ifnonnull 0ed
      // 0c4: aload 3
      // 0c5: aload 5
      // 0c7: invokeinterface com/finalshell/core/J1.C ([B)J 2
      // 0cc: aload 0
      // 0cd: aload 3
      // 0ce: invokespecial com/finalshell/core/C32.S (Lcom/finalshell/core/J1;)J
      // 0d1: lcmp
      // 0d2: ifeq 0f2
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: new com/finalshell/core/VH
      // 0df: dup
      // 0e0: aload 0
      // 0e1: invokespecial com/finalshell/core/VH.<init> (Lcom/finalshell/core/C32;)V
      // 0e4: athrow
      // 0e5: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: invokespecial com/finalshell/core/C32.U ()V
      // 0ed: aload 4
      // 0ef: ifnull 0af
      // 0f2: aload 5
      // 0f4: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 0f7: ifnull 108
      // 0fa: bipush 3
      // 0fb: anewarray 249
      // 0fe: invokestatic com/finalshell/core/Ub2.i ([Ljava/lang/String;)V
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/C32.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: areturn
   }

   public long S(J1 var1) throws IOException {
      long var6;
      String[] var10000 = Ub2.A();
      long var3 = 0L;
      String[] var2 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var1.Z()) {
            var6 = (var3 << a(19498, 3583678778772724174L)) + (long)this.g.read();
            if (var2 != null) {
               break;
            }

            var3 = var6;
            var5++;
            if (var2 == null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public byte f() throws IOException {
      String[] var1 = Ub2.A();

      while (true) {
         while (this.g.available() <= 0) {
            this.U();
         }

         int var2 = this.g.read();

         try {
            if (var1 == null) {
               return (byte)var2;
            }
         } catch (IOException var3) {
            throw a(var3);
         }
      }
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var6;
      int var2 = (var0 ^ -20653) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 71;
               break;
            case 1:
               var10000 = 216;
               break;
            case 2:
               var10000 = 140;
               break;
            case 3:
               var10000 = 46;
               break;
            case 4:
               var10000 = 76;
               break;
            case 5:
               var10000 = 167;
               break;
            case 6:
               var10000 = 199;
               break;
            case 7:
               var10000 = 13;
               break;
            case 8:
               var10000 = 92;
               break;
            case 9:
               var10000 = 144;
               break;
            case 10:
               var10000 = 208;
               break;
            case 11:
               var10000 = 74;
               break;
            case 12:
               var10000 = 22;
               break;
            case 13:
               var10000 = 128;
               break;
            case 14:
               var10000 = 107;
               break;
            case 15:
               var10000 = 59;
               break;
            case 16:
               var10000 = 80;
               break;
            case 17:
               var10000 = 154;
               break;
            case 18:
               var10000 = 33;
               break;
            case 19:
               var10000 = 57;
               break;
            case 20:
               var10000 = 137;
               break;
            case 21:
               var10000 = 103;
               break;
            case 22:
               var10000 = 8;
               break;
            case 23:
               var10000 = 72;
               break;
            case 24:
               var10000 = 188;
               break;
            case 25:
               var10000 = 48;
               break;
            case 26:
               var10000 = 247;
               break;
            case 27:
               var10000 = 26;
               break;
            case 28:
               var10000 = 117;
               break;
            case 29:
               var10000 = 101;
               break;
            case 30:
               var10000 = 142;
               break;
            case 31:
               var10000 = 166;
               break;
            case 32:
               var10000 = 146;
               break;
            case 33:
               var10000 = 203;
               break;
            case 34:
               var10000 = 187;
               break;
            case 35:
               var10000 = 87;
               break;
            case 36:
               var10000 = 151;
               break;
            case 37:
               var10000 = 58;
               break;
            case 38:
               var10000 = 111;
               break;
            case 39:
               var10000 = 186;
               break;
            case 40:
               var10000 = 106;
               break;
            case 41:
               var10000 = 236;
               break;
            case 42:
               var10000 = 9;
               break;
            case 43:
               var10000 = 202;
               break;
            case 44:
               var10000 = 129;
               break;
            case 45:
               var10000 = 17;
               break;
            case 46:
               var10000 = 245;
               break;
            case 47:
               var10000 = 218;
               break;
            case 48:
               var10000 = 122;
               break;
            case 49:
               var10000 = 121;
               break;
            case 50:
               var10000 = 230;
               break;
            case 51:
               var10000 = 220;
               break;
            case 52:
               var10000 = 180;
               break;
            case 53:
               var10000 = 39;
               break;
            case 54:
               var10000 = 66;
               break;
            case 55:
               var10000 = 252;
               break;
            case 56:
               var10000 = 47;
               break;
            case 57:
               var10000 = 235;
               break;
            case 58:
               var10000 = 130;
               break;
            case 59:
               var10000 = 211;
               break;
            case 60:
               var10000 = 222;
               break;
            case 61:
               var10000 = 184;
               break;
            case 62:
               var10000 = 179;
               break;
            case 63:
               var10000 = 164;
               break;
            case 64:
               var10000 = 185;
               break;
            case 65:
               var10000 = 232;
               break;
            case 66:
               var10000 = 159;
               break;
            case 67:
               var10000 = 4;
               break;
            case 68:
               var10000 = 205;
               break;
            case 69:
               var10000 = 212;
               break;
            case 70:
               var10000 = 207;
               break;
            case 71:
               var10000 = 84;
               break;
            case 72:
               var10000 = 35;
               break;
            case 73:
               var10000 = 241;
               break;
            case 74:
               var10000 = 206;
               break;
            case 75:
               var10000 = 155;
               break;
            case 76:
               var10000 = 197;
               break;
            case 77:
               var10000 = 124;
               break;
            case 78:
               var10000 = 69;
               break;
            case 79:
               var10000 = 51;
               break;
            case 80:
               var10000 = 255;
               break;
            case 81:
               var10000 = 183;
               break;
            case 82:
               var10000 = 41;
               break;
            case 83:
               var10000 = 225;
               break;
            case 84:
               var10000 = 138;
               break;
            case 85:
               var10000 = 246;
               break;
            case 86:
               var10000 = 82;
               break;
            case 87:
               var10000 = 96;
               break;
            case 88:
               var10000 = 165;
               break;
            case 89:
               var10000 = 81;
               break;
            case 90:
               var10000 = 233;
               break;
            case 91:
               var10000 = 95;
               break;
            case 92:
               var10000 = 38;
               break;
            case 93:
               var10000 = 109;
               break;
            case 94:
               var10000 = 63;
               break;
            case 95:
               var10000 = 240;
               break;
            case 96:
               var10000 = 162;
               break;
            case 97:
               var10000 = 182;
               break;
            case 98:
               var10000 = 145;
               break;
            case 99:
               var10000 = 105;
               break;
            case 100:
               var10000 = 171;
               break;
            case 101:
               var10000 = 227;
               break;
            case 102:
               var10000 = 65;
               break;
            case 103:
               var10000 = 135;
               break;
            case 104:
               var10000 = 148;
               break;
            case 105:
               var10000 = 195;
               break;
            case 106:
               var10000 = 178;
               break;
            case 107:
               var10000 = 176;
               break;
            case 108:
               var10000 = 7;
               break;
            case 109:
               var10000 = 85;
               break;
            case 110:
               var10000 = 149;
               break;
            case 111:
               var10000 = 19;
               break;
            case 112:
               var10000 = 49;
               break;
            case 113:
               var10000 = 160;
               break;
            case 114:
               var10000 = 90;
               break;
            case 115:
               var10000 = 143;
               break;
            case 116:
               var10000 = 172;
               break;
            case 117:
               var10000 = 30;
               break;
            case 118:
               var10000 = 134;
               break;
            case 119:
               var10000 = 34;
               break;
            case 120:
               var10000 = 223;
               break;
            case 121:
               var10000 = 221;
               break;
            case 122:
               var10000 = 11;
               break;
            case 123:
               var10000 = 102;
               break;
            case 124:
               var10000 = 217;
               break;
            case 125:
               var10000 = 70;
               break;
            case 126:
               var10000 = 67;
               break;
            case 127:
               var10000 = 54;
               break;
            case 128:
               var10000 = 3;
               break;
            case 129:
               var10000 = 12;
               break;
            case 130:
               var10000 = 126;
               break;
            case 131:
               var10000 = 18;
               break;
            case 132:
               var10000 = 251;
               break;
            case 133:
               var10000 = 215;
               break;
            case 134:
               var10000 = 53;
               break;
            case 135:
               var10000 = 25;
               break;
            case 136:
               var10000 = 28;
               break;
            case 137:
               var10000 = 118;
               break;
            case 138:
               var10000 = 94;
               break;
            case 139:
               var10000 = 20;
               break;
            case 140:
               var10000 = 168;
               break;
            case 141:
               var10000 = 214;
               break;
            case 142:
               var10000 = 31;
               break;
            case 143:
               var10000 = 21;
               break;
            case 144:
               var10000 = 191;
               break;
            case 145:
               var10000 = 234;
               break;
            case 146:
               var10000 = 15;
               break;
            case 147:
               var10000 = 100;
               break;
            case 148:
               var10000 = 78;
               break;
            case 149:
               var10000 = 61;
               break;
            case 150:
               var10000 = 200;
               break;
            case 151:
               var10000 = 209;
               break;
            case 152:
               var10000 = 16;
               break;
            case 153:
               var10000 = 98;
               break;
            case 154:
               var10000 = 50;
               break;
            case 155:
               var10000 = 139;
               break;
            case 156:
               var10000 = 131;
               break;
            case 157:
               var10000 = 42;
               break;
            case 158:
               var10000 = 112;
               break;
            case 159:
               var10000 = 32;
               break;
            case 160:
               var10000 = 250;
               break;
            case 161:
               var10000 = 170;
               break;
            case 162:
               var10000 = 196;
               break;
            case 163:
               var10000 = 153;
               break;
            case 164:
               var10000 = 104;
               break;
            case 165:
               var10000 = 40;
               break;
            case 166:
               var10000 = 181;
               break;
            case 167:
               var10000 = 120;
               break;
            case 168:
               var10000 = 174;
               break;
            case 169:
               var10000 = 113;
               break;
            case 170:
               var10000 = 79;
               break;
            case 171:
               var10000 = 108;
               break;
            case 172:
               var10000 = 45;
               break;
            case 173:
               var10000 = 224;
               break;
            case 174:
               var10000 = 52;
               break;
            case 175:
               var10000 = 253;
               break;
            case 176:
               var10000 = 243;
               break;
            case 177:
               var10000 = 68;
               break;
            case 178:
               var10000 = 189;
               break;
            case 179:
               var10000 = 201;
               break;
            case 180:
               var10000 = 127;
               break;
            case 181:
               var10000 = 56;
               break;
            case 182:
               var10000 = 158;
               break;
            case 183:
               var10000 = 62;
               break;
            case 184:
               var10000 = 175;
               break;
            case 185:
               var10000 = 83;
               break;
            case 186:
               var10000 = 229;
               break;
            case 187:
               var10000 = 156;
               break;
            case 188:
               var10000 = 193;
               break;
            case 189:
               var10000 = 198;
               break;
            case 190:
               var10000 = 132;
               break;
            case 191:
               var10000 = 6;
               break;
            case 192:
               var10000 = 93;
               break;
            case 193:
               var10000 = 115;
               break;
            case 194:
               var10000 = 163;
               break;
            case 195:
               var10000 = 119;
               break;
            case 196:
               var10000 = 237;
               break;
            case 197:
               var10000 = 36;
               break;
            case 198:
               var10000 = 55;
               break;
            case 199:
               var10000 = 177;
               break;
            case 200:
               var10000 = 204;
               break;
            case 201:
               var10000 = 5;
               break;
            case 202:
               var10000 = 228;
               break;
            case 203:
               var10000 = 116;
               break;
            case 204:
               var10000 = 248;
               break;
            case 205:
               var10000 = 231;
               break;
            case 206:
               var10000 = 194;
               break;
            case 207:
               var10000 = 136;
               break;
            case 208:
               var10000 = 91;
               break;
            case 209:
               var10000 = 192;
               break;
            case 210:
               var10000 = 89;
               break;
            case 211:
               var10000 = 37;
               break;
            case 212:
               var10000 = 29;
               break;
            case 213:
               var10000 = 27;
               break;
            case 214:
               var10000 = 114;
               break;
            case 215:
               var10000 = 147;
               break;
            case 216:
               var10000 = 210;
               break;
            case 217:
               var10000 = 161;
               break;
            case 218:
               var10000 = 86;
               break;
            case 219:
               var10000 = 64;
               break;
            case 220:
               var10000 = 249;
               break;
            case 221:
               var10000 = 173;
               break;
            case 222:
               var10000 = 88;
               break;
            case 223:
               var10000 = 219;
               break;
            case 224:
               var10000 = 133;
               break;
            case 225:
               var10000 = 213;
               break;
            case 226:
               var10000 = 123;
               break;
            case 227:
               var10000 = 0;
               break;
            case 228:
               var10000 = 190;
               break;
            case 229:
               var10000 = 152;
               break;
            case 230:
               var10000 = 23;
               break;
            case 231:
               var10000 = 24;
               break;
            case 232:
               var10000 = 238;
               break;
            case 233:
               var10000 = 244;
               break;
            case 234:
               var10000 = 110;
               break;
            case 235:
               var10000 = 254;
               break;
            case 236:
               var10000 = 226;
               break;
            case 237:
               var10000 = 2;
               break;
            case 238:
               var10000 = 77;
               break;
            case 239:
               var10000 = 169;
               break;
            case 240:
               var10000 = 150;
               break;
            case 241:
               var10000 = 141;
               break;
            case 242:
               var10000 = 1;
               break;
            case 243:
               var10000 = 99;
               break;
            case 244:
               var10000 = 44;
               break;
            case 245:
               var10000 = 125;
               break;
            case 246:
               var10000 = 43;
               break;
            case 247:
               var10000 = 242;
               break;
            case 248:
               var10000 = 14;
               break;
            case 249:
               var10000 = 73;
               break;
            case 250:
               var10000 = 97;
               break;
            case 251:
               var10000 = 10;
               break;
            case 252:
               var10000 = 157;
               break;
            case 253:
               var10000 = 239;
               break;
            case 254:
               var10000 = 75;
               break;
            default:
               var10000 = 60;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         var6 = ((var1 & 65535) >>> 8) - var4;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21997;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 14938) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean var13;
      char[] var43;
      long[] var6;
      String[] var21 = new String[6];
      int var19 = 0;
      String var18 = "Ë\u009cä¾\u0092Á7+\u008c3\u009c|éIÜü\u001dµ=Kaáï\u001cÜz\u0006bÎZ¼Xý]²±,ó`ÉC2\u0012®\u0095ýTÔ¹\u0005ô/\u0017G8u* SqyDy\u00855Ê`¸Ù\u0091\u0011¬ßSs©+l>\u001e\u001a\u001cÞ<OYø\u0002\u0094ËÍ(øY%aV\u008e\u0095ÅJ\u000f?\u0015¶+GÁ|Åt*ÑN\u0083ä~\u0081¦H";
      int var20 = "Ë\u009cä¾\u0092Á7+\u008c3\u009c|éIÜü\u001dµ=Kaáï\u001cÜz\u0006bÎZ¼Xý]²±,ó`ÉC2\u0012®\u0095ýTÔ¹\u0005ô/\u0017G8u* SqyDy\u00855Ê`¸Ù\u0091\u0011¬ßSs©+l>\u001e\u001a\u001cÞ<OYø\u0002\u0094ËÍ(øY%aV\u008e\u0095ÅJ\u000f?\u0015¶+GÁ|Åt*ÑN\u0083ä~\u0081¦H"
         .length();
      char var17 = 23;
      int var25 = -1;

      label79:
      while (true) {
         byte var10000 = 36;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
            label74: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var22 = 0;
               byte var52 = var10000;
               var43 = var49;
               int var32 = var10004;
               byte var60;
               char[] var67;
               int var10006;
               if (var10004 <= 1) {
                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               } else {
                  var52 = var10000;
                  var32 = var10004;
                  if (var10004 <= var22) {
                     break label74;
                  }

                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var76 = var67[var10006];
                  byte var77;
                  switch (var22 % 7) {
                     case 0:
                        var77 = 111;
                        break;
                     case 1:
                        var77 = 62;
                        break;
                     case 2:
                        var77 = 111;
                        break;
                     case 3:
                        var77 = 24;
                        break;
                     case 4:
                        var77 = 125;
                        break;
                     case 5:
                        var77 = 123;
                        break;
                     default:
                        var77 = 30;
                  }

                  var67[var10006] = (char)(var76 ^ var60 ^ var77);
                  var22++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var67 = var43;
                     var60 = var52;
                  } else {
                     if (var32 <= var22) {
                        break;
                     }

                     var67 = var43;
                     var60 = var52;
                     var10006 = var22;
                  }
               }
            }

            String var54 = new String(var43).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var54;
                  if ((var25 += var17) >= var20) {
                     a = var21;
                     b = new String[6];
                     long var8 = 2195601088072790842L;
                     long[] var14 = new long[17];
                     int var11 = 0;
                     String var12 = "\u0019N&jDëãEÉOéª^ÿ\u0016\u0001çÎ\u0088HÃ\u0013N*îè\u0000ìÏéÃ\u0019´<\u0004ÆÐG\u0010Ø¢a¥o&Ú\u0082?Õ¼Ýª8\u001aïÌ\u008eOZº²\\\u0091âã|=0`¦\u0083#&?D%>Ðªüñó³\u0099Ä\u008b¨\u0080;\u009ekr\u000f&Æ¿ ì§Ô/ë³ÐïìÄdRß\u0081\u0085Wµ öpÞôj";
                     var13 = ("\u0019N&jDëãEÉOéª^ÿ\u0016\u0001çÎ\u0088HÃ\u0013N*îè\u0000ìÏéÃ\u0019´<\u0004ÆÐG\u0010Ø¢a¥o&Ú\u0082?Õ¼Ýª8\u001aïÌ\u008eOZº²\\\u0091âã|=0`¦\u0083#&?D%>Ðªüñó³\u0099Ä\u008b¨\u0080;\u009ekr\u000f&Æ¿ ì§Ô/ë³ÐïìÄdRß\u0081\u0085Wµ öpÞôj") != 0;
                        // [VF] .length();   // 上一行已完成赋值，残留链式调用
                     byte var10 = 0;

                     label53:
                     while (true) {
                        byte var34 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var34, var10).getBytes("ISO-8859-1");
                        long[] var27 = var14;
                        int var35 = var11++;
                        long var47 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var55 = -1;

                        while (true) {
                           long var65 = var47 ^ var8;
                           switch (var55) {
                              case 0:
                                 var27[var35] = var65;
                                 if (var10 >= var13) {
                                    c = var14;
                                    d = new Integer[17];
                                    long var0 = 5616652540208833790L;
                                    var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "1Í¿\u0004£ÙEWW¼`Ôy\u001c2`";
                                    int var5 = "1Í¿\u0004£ÙEWW¼`Ôy\u001c2`".length();
                                    byte var2 = 0;

                                    do {
                                       byte var37 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                       int var38 = var3++;
                                       var65 = (
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
                                       byte var57 = -1;
                                       var6[var38] = var65;
                                    } while (var2 < var5);

                                    e = var6;
                                    f = new Long[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var35] = var65;
                                 if (var10 < var13) {
                                    continue label53;
                                 }

                                 var12 = ("¬Y'ÏÖ¡j\u000390¯\u0012\r¯\u0087\f") != 0;
                                 var13 = (("¬Y'ÏÖ¡j\u000390¯\u0012\r¯\u0087\f".length()) != 0);
                                 var10 = 0;
                           }

                           byte var36 = var10;
                           var10 += 8;
                           var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                           var27 = var14;
                           var35 = var11++;
                           var47 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var55 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var54;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label79;
                  }

                  var18 = "`\u0018\r²3Ü\u009f\u0014\u0005H1\u008fÀ¾b4®\u0093 ¨lá\u0080ÔHe\u0003\u0083\u0003ú¤P\u0097ÍàÙw\u0097gó\u0004\u007fU«Q.\u0018-\u0088áÞ\u0006òØ4Ajõ/\u008eÛÚÎ\u0097\u0010ü\u0080D\u0097\u001a\u0002";
                  var20 = "`\u0018\r²3Ü\u009f\u0014\u0005H1\u008fÀ¾b4®\u0093 ¨lá\u0080ÔHe\u0003\u0083\u0003ú¤P\u0097ÍàÙw\u0097gó\u0004\u007fU«Q.\u0018-\u0088áÞ\u0006òØ4Ajõ/\u008eÛÚÎ\u0097\u0010ü\u0080D\u0097\u001a\u0002"
                     .length();
                  var17 = '.';
                  var25 = -1;
            }

            var10000 = 114;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }
   private static Object var9;
}





