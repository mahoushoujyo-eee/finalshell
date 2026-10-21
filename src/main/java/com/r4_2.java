package com;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class r4_2 {
   private byte[] D;
   private long O;
   private long t;
   private long d;
   private static ReentrantLock j;
   private static Long o;
   public static boolean e;
   private File v;
   private static int[] y;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] f;
   private static final long[] g;
   private static final Long[] h;

   public r4_2(String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/r4_2.g ()[I
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: astore 2
      // 08: aload 0
      // 09: new java/io/File
      // 0c: dup
      // 0d: aload 1
      // 0e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 11: putfield com/r4_2.v Ljava/io/File;
      // 14: aload 0
      // 15: aload 2
      // 16: ifnonnull 31
      // 19: invokespecial com/r4_2.r ()V
      // 1c: getstatic com/r4_2.e Z
      // 1f: ifeq 34
      // 22: goto 29
      // 25: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: goto 31
      // 2d: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: invokespecial com/r4_2.y ()V
      // 34: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 37: ifnull 47
      // 3a: bipush 1
      // 3b: newarray 10
      // 3d: invokestatic com/r4_2.f ([I)V
      // 40: goto 47
      // 43: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: return
   }

   private void y() {
      Executors.newScheduledThreadPool(1)
         .scheduleAtFixedRate(new com.YK(this), b(31601, 8695304516048138132L), b(21306, 3557292601280301017L), TimeUnit.MILLISECONDS);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void r() throws Exception {
      int[] var10000 = g();
      o = this.v.lastModified();
      int[] var1 = var10000;
      ByteArrayOutputStream var2 = null;
      FileInputStream var3 = null;
      j.lock();
      StringBuilder var36 = new StringBuilder().append(a(5889, -22192)).append(this.v.getAbsolutePath()).append(" ").append(this.v.exists()).append(" ");
      Object[] var10001 = com.c.f();
      Method var41 = com.c.d(561847341732101275L);
      Object[] var46 = var10001;
      Object var45 = null;

      try {
         var42 = (Boolean)var41.invoke(var45, var46);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      String var4 = var36.append(var42).toString();
      boolean var19 = false /* VF: Semaphore variable */;

      label188: {
         label187: {
            label186: {
               try {
                  var19 = true;
                  var2 = new ByteArrayOutputStream();
                  byte[] var5 = new byte[a(5076, 8279689753463652462L)];
                  var3 = new FileInputStream(this.v);

                  while (true) {
                     if (var3.read(var5) != -1) {
                        try {
                           var2.write(var5);
                           if (var1 != null) {
                              var19 = false;
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        } catch (IOException var29) {
                           throw a(var29);
                        }
                     }

                     try {
                        this.D = var2.toByteArray();
                        this.O = this.O(0);
                        this.t = this.O(4);
                        this.d = (this.t - this.O) / b(20724, 3577195196498838550L) + 1L;
                        var39 = var3;
                        if (var1 != null) {
                           var19 = false;
                           break label186;
                        }

                        var3.close();
                        var2.close();
                        var19 = false;
                        break;
                     } catch (IOException var26) {
                        throw a(var26);
                     }
                  }
               } finally {
                  if (var19) {
                     try {
                        label193: {
                           label148: {
                              label147: {
                                 try {
                                    var37 = var2;
                                    if (var1 != null) {
                                       break label147;
                                    }

                                    if (var2 == null) {
                                       break label148;
                                    }
                                 } catch (IOException var22) {
                                    throw a(var22);
                                 }

                                 var37 = var2;
                              }

                              var37.close();
                           }

                           label139: {
                              try {
                                 var38 = var3;
                                 if (var1 != null) {
                                    break label139;
                                 }

                                 if (var3 == null) {
                                    break label193;
                                 }
                              } catch (IOException var21) {
                                 throw a(var21);
                              }

                              var38 = var3;
                           }

                           var38.close();
                        }
                     } catch (IOException var23) {
                        var23.printStackTrace();
                     }

                     j.unlock();
                  }
               }

               try {
                  try {
                     if (var2 != null) {
                        var2.close();
                     }
                  } catch (IOException var27) {
                     throw a(var27);
                  }

                  var39 = var3;
               } catch (IOException var28) {
                  var40 = var28;
                  boolean var43 = false;
                  break label187;
               }
            }

            try {
               label159: {
                  try {
                     if (var1 != null) {
                        break label159;
                     }

                     if (var39 == null) {
                        break label188;
                     }
                  } catch (IOException var24) {
                     throw a(var24);
                  }

                  var39 = var3;
               }

               var39.close();
               break label188;
            } catch (IOException var25) {
               var40 = var25;
               boolean var44 = false;
            }
         }

         IOException var31 = var40;
         var31.printStackTrace();
      }

      j.unlock();
   }

   private long O(int var1) {
      long var2 = (long)(this.D[var1] & a(25230, 2632127247376478522L));
      var2 |= (long)(this.D[var1 + 1] << a(19144, 2468756639767943549L)) & b(20914, 5217348183741760862L);
      var2 |= (long)(this.D[var1 + 2] << a(476, 1303789394006053475L)) & b(23788, 2107798338649327626L);
      return var2 | (long)(this.D[var1 + 3] << a(4649, 1689306692724097438L)) & b(3469, 815612526011504996L);
   }

   private long j(int var1) {
      long var2 = (long)(this.D[var1] & a(22791, 4089509435033275065L));
      var2 |= (long)(this.D[var1 + 1] << a(19144, 2468756639767943549L) & a(3032, 4441935611611551844L));
      return var2 | (long)(this.D[var1 + 2] << a(476, 1303789394006053475L) & a(1996, 5028095084433183860L));
   }

   private long G(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/r4_2.g ()[I
      // 03: lconst_0
      // 04: lstore 4
      // 06: astore 3
      // 07: aload 0
      // 08: getfield com/r4_2.d J
      // 0b: lstore 6
      // 0d: lconst_0
      // 0e: lstore 8
      // 10: lload 4
      // 12: lload 6
      // 14: lcmp
      // 15: ifgt f6
      // 18: lload 4
      // 1a: lload 6
      // 1c: ladd
      // 1d: bipush 1
      // 1e: lushr
      // 1f: lstore 8
      // 21: aload 0
      // 22: aload 0
      // 23: getfield com/r4_2.O J
      // 26: lload 8
      // 28: lconst_1
      // 29: lsub
      // 2a: sipush 23099
      // 2d: ldc2_w 9002145119942676180
      // 30: invokestatic com/r4_2.b (IJ)J
      // 33: lmul
      // 34: ladd
      // 35: l2i
      // 36: invokespecial com/r4_2.O (I)J
      // 39: lstore 10
      // 3b: aload 0
      // 3c: aload 0
      // 3d: getfield com/r4_2.O J
      // 40: lload 8
      // 42: sipush 23099
      // 45: ldc2_w 9002145119942676180
      // 48: invokestatic com/r4_2.b (IJ)J
      // 4b: lmul
      // 4c: ladd
      // 4d: l2i
      // 4e: invokespecial com/r4_2.O (I)J
      // 51: lstore 12
      // 53: lload 10
      // 55: aload 3
      // 56: ifnonnull ff
      // 59: lload 1
      // 5a: lcmp
      // 5b: aload 3
      // 5c: ifnonnull b4
      // 5f: goto 66
      // 62: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: ifgt b0
      // 69: goto 70
      // 6c: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: lload 1
      // 71: lload 12
      // 73: lcmp
      // 74: aload 3
      // 75: ifnonnull b4
      // 78: goto 7f
      // 7b: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: ifge b0
      // 82: goto 89
      // 85: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 0
      // 8a: aload 0
      // 8b: getfield com/r4_2.O J
      // 8e: lload 8
      // 90: lconst_1
      // 91: lsub
      // 92: sipush 23099
      // 95: ldc2_w 9002145119942676180
      // 98: invokestatic com/r4_2.b (IJ)J
      // 9b: lmul
      // 9c: ladd
      // 9d: sipush 24383
      // a0: ldc2_w 7845551952059632596
      // a3: invokestatic com/r4_2.b (IJ)J
      // a6: ladd
      // a7: l2i
      // a8: invokespecial com/r4_2.j (I)J
      // ab: lreturn
      // ac: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af: athrow
      // b0: lload 1
      // b1: lload 10
      // b3: lcmp
      // b4: aload 3
      // b5: ifnonnull e2
      // b8: ifle cc
      // bb: goto c2
      // be: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c1: athrow
      // c2: lload 8
      // c4: lconst_1
      // c5: ladd
      // c6: lstore 4
      // c8: aload 3
      // c9: ifnull f2
      // cc: lload 1
      // cd: lload 10
      // cf: aload 3
      // d0: ifnonnull ef
      // d3: goto da
      // d6: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d9: athrow
      // da: lcmp
      // db: goto e2
      // de: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e1: athrow
      // e2: ifge f2
      // e5: lload 8
      // e7: lconst_1
      // e8: goto ef
      // eb: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ee: athrow
      // ef: lsub
      // f0: lstore 6
      // f2: aload 3
      // f3: ifnull 10
      // f6: sipush 28367
      // f9: ldc2_w 8696487647896189487
      // fc: invokestatic com/r4_2.b (IJ)J
      // ff: lreturn
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public com.C_ n(String var1) {
      long var3 = d(var1);
      j.lock();
      int[] var10000 = g();
      long var5 = this.G(var3);
      int[] var2 = var10000;
      boolean var12 = false /* VF: Semaphore variable */;

      com.C_ var7;
      label61: {
         label60: {
            try {
               label58: {
                  try {
                     var12 = true;
                     if (var2 != null) {
                        var12 = false;
                        break label60;
                     }

                     if (var5 == b(2225, 2626678007929494608L)) {
                        var12 = false;
                        break label58;
                     }
                  } catch (NullPointerException var14) {
                     throw a(var14);
                  }

                  var7 = this.T((int)var5);
                  var12 = false;
                  break label61;
               }
            } finally {
               if (var12) {
                  j.unlock();
               }
            }

            j.unlock();
         }

         try {
            if (var2 != null) {
               com.ky_4.K(new String[5]);
            }

            return null;
         } catch (NullPointerException var13) {
            throw a(var13);
         }
      }

      j.unlock();
      return var7;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private com.C_ T(int var1) {
      int[] var10000 = g();
      com.C_ var3 = new com.C_();
      int[] var2 = var10000;

      try {
         byte var4 = this.D[var1 + 4];

         byte var10001;
         label92: {
            label93: {
               try {
                  var17 = var4;
                  var10001 = 1;
                  if (var2 != null) {
                     break label92;
                  }

                  if (var4 != 1) {
                     break label93;
                  }
               } catch (Exception var11) {
                  throw a(var11);
               }

               long var5;
               label69: {
                  var5 = this.j(var1 + 5);
                  r4_2 var18 = this;
                  if (var2 == null) {
                     var4 = this.D[(int)var5];
                     if (var4 == 2) {
                        il_4 var7 = this.a((int)this.j((int)var5 + 1));
                        var3.w = var7.O;
                        var5 += b(30020, 3415162406771466659L);

                        try {
                           if (var2 == null) {
                              break label69;
                           }
                        } catch (Exception var13) {
                           boolean var21 = false;
                           throw a(var13);
                        }
                     }

                     try {
                        var18 = this;
                     } catch (Exception var12) {
                        boolean var22 = false;
                        throw a(var12);
                     }
                  }

                  il_4 var16 = var18.a((int)var5);
                  var3.w = var16.O;
                  var5 += (long)var16.r;
               }

               try {
                  var3.N = this.R((int)var5);
                  if (var2 == null) {
                     return var3;
                  }
               } catch (Exception var10) {
                  boolean var23 = false;
                  throw a(var10);
               }
            }

            try {
               var17 = var4;
               var10001 = 2;
            } catch (Exception var9) {
               boolean var24 = false;
               throw a(var9);
            }
         }

         try {
            if (var17 == var10001) {
               var3.w = this.a((int)this.j(var1 + 5)).O;
               var3.N = this.R(var1 + a(19144, 2468756639767943549L));
               if (var2 == null) {
                  return var3;
               }
            }
         } catch (Exception var8) {
            throw a(var8);
         }

         il_4 var15 = this.a(var1 + 4);
         var3.w = var15.O;
         var3.N = this.R(var1 + 4 + var15.r);
         return var3;
      } catch (Exception var14) {
         return null;
      }
   }

   private String R(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/r4_2.g ()[I
      // 03: aload 0
      // 04: getfield com/r4_2.D [B
      // 07: iload 1
      // 08: baload
      // 09: istore 3
      // 0a: astore 2
      // 0b: iload 3
      // 0c: bipush 1
      // 0d: aload 2
      // 0e: ifnonnull 24
      // 11: if_icmpeq 27
      // 14: goto 1b
      // 17: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: iload 3
      // 1c: bipush 2
      // 1d: goto 24
      // 20: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: if_icmpne 4a
      // 27: aload 0
      // 28: iload 1
      // 29: bipush 1
      // 2a: iadd
      // 2b: invokespecial com/r4_2.j (I)J
      // 2e: lstore 4
      // 30: lload 4
      // 32: lconst_0
      // 33: lcmp
      // 34: ifne 3f
      // 37: ldc_w ""
      // 3a: areturn
      // 3b: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 0
      // 40: lload 4
      // 42: l2i
      // 43: invokespecial com/r4_2.a (I)Lcom/il_4;
      // 46: getfield com/il_4.O Ljava/lang/String;
      // 49: areturn
      // 4a: aload 0
      // 4b: iload 1
      // 4c: invokespecial com/r4_2.a (I)Lcom/il_4;
      // 4f: getfield com/il_4.O Ljava/lang/String;
      // 52: areturn
   }

   private il_4 a(int var1) {
      byte[] var4 = new byte[a(1019, 2338536723095588930L)];
      int[] var10000 = g();
      int var5 = 0;
      int var3 = var1 + 1;
      var4[var5] = this.D[var1];
      int[] var2 = var10000;

      while (var4[var5] != 0) {
         var5++;
         var4[var5] = this.D[var3++];
         if (var2 != null) {
            break;
         }
      }

      try {
         return new il_4(this, new String(var4, 0, var5, a(5888, -8985)), var5 + 1);
      } catch (UnsupportedEncodingException var7) {
         return new il_4(this, "", 0);
      }
   }

   private static long d(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/r4_2.g ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 5891
      // 1a: sipush -32717
      // 1d: invokestatic com/r4_2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/r4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: sipush 5890
      // 2c: sipush -14364
      // 2f: invokestatic com/r4_2.a (II)Ljava/lang/String;
      // 32: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 35: astore 2
      // 36: aload 2
      // 37: bipush 0
      // 38: aaload
      // 39: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 3c: sipush 9321
      // 3f: ldc2_w 7500518462892961927
      // 42: invokestatic com/r4_2.b (IJ)J
      // 45: land
      // 46: sipush 29308
      // 49: ldc2_w 6429960134631678410
      // 4c: invokestatic com/r4_2.a (IJ)I
      // 4f: lshl
      // 50: sipush 22767
      // 53: ldc2_w 1101859275428924418
      // 56: invokestatic com/r4_2.b (IJ)J
      // 59: land
      // 5a: lstore 3
      // 5b: lload 3
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: aaload
      // 5f: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 62: sipush 4917
      // 65: ldc2_w 842564939137632209
      // 68: invokestatic com/r4_2.b (IJ)J
      // 6b: land
      // 6c: sipush 15019
      // 6f: ldc2_w 3351328360253597968
      // 72: invokestatic com/r4_2.a (IJ)I
      // 75: lshl
      // 76: sipush 21286
      // 79: ldc2_w 5273684623249999822
      // 7c: invokestatic com/r4_2.b (IJ)J
      // 7f: land
      // 80: lor
      // 81: lstore 3
      // 82: lload 3
      // 83: aload 2
      // 84: bipush 2
      // 85: aaload
      // 86: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 89: sipush 4917
      // 8c: ldc2_w 842564939137632209
      // 8f: invokestatic com/r4_2.b (IJ)J
      // 92: land
      // 93: sipush 7660
      // 96: ldc2_w 6411686299430129233
      // 99: invokestatic com/r4_2.a (IJ)I
      // 9c: lshl
      // 9d: sipush 1697
      // a0: ldc2_w 3791498003938005579
      // a3: invokestatic com/r4_2.b (IJ)J
      // a6: land
      // a7: lor
      // a8: lstore 3
      // a9: lload 3
      // aa: aload 2
      // ab: bipush 3
      // ac: aaload
      // ad: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // b0: sipush 4917
      // b3: ldc2_w 842564939137632209
      // b6: invokestatic com/r4_2.b (IJ)J
      // b9: land
      // ba: lor
      // bb: lstore 3
      // bc: lload 3
      // bd: lreturn
   }

   static File B(r4_2 var0) {
      return var0.v;
   }

   static Long A() {
      return o;
   }

   static Long N(Long var0) {
      o = var0;
      return var0;
   }

   static void J(r4_2 var0) throws Exception {
      var0.r();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[4];
      int var19 = 0;
      String var18 = "È\u0016仜聺举稒\u0002Ï¤";
      int var20 = "È\u0016仜聺举稒\u0002Ï¤".length();
      f(null);
      char var17 = 6;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 33;
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
                        var84 = 87;
                        break;
                     case 1:
                        var84 = 99;
                        break;
                     case 2:
                        var84 = 99;
                        break;
                     case 3:
                        var84 = 82;
                        break;
                     case 4:
                        var84 = 90;
                        break;
                     case 5:
                        var84 = 42;
                        break;
                     default:
                        var84 = 102;
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
                     b = new String[4];
                     long var8 = 3262880761365241226L;
                     long[] var14 = new long[12];
                     int var11 = 0;
                     String var12 = "êé(0Õd\u0013Ón[D×Pâúî¼j\u001b\u0084\u001e\u0006\u008fù\u009eQ\u0082ü)e×Ì\u0080\u0092Zä§ð\rH\u008b\tf´\tÙ\u0089þIGà\u0000ã:4\u008aè\u0092÷³X\u0005\u0019ärjô²£àÄÿð\u0083`\u0014ú!ìO";
                     int var13 = "êé(0Õd\u0013Ón[D×Pâúî¼j\u001b\u0084\u001e\u0006\u008fù\u009eQ\u0082ü)e×Ì\u0080\u0092Zä§ð\rH\u008b\tf´\tÙ\u0089þIGà\u0000ã:4\u008aè\u0092÷³X\u0005\u0019ärjô²£àÄÿð\u0083`\u0014ú!ìO"
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
                                    f = new Integer[12];
                                    long var0 = 7576068204085732757L;
                                    long[] var6 = new long[16];
                                    int var3 = 0;
                                    String var4 = "]½\u0082¼ùúHÞ\u0005Ãf\n\u0083ÊnE \f}Ý\u0010\u0017â[br:¡Êï<ñ\u00014¨)!W\u0015í\u0015Í\u0092®Ø\u001akF!D'c\u009bÜ\u009fËfi\u000eÈýÀi\u0097X\u0087YðA%a\u0084X}\u0093\"WÙqÄîlGk;: E²¯³ ì¡F:tcþ\u008f³\fm\u009fFF\u0081ù\u000bHÄ2";
                                    int var5 = "]½\u0082¼ùúHÞ\u0005Ãf\n\u0083ÊnE \f}Ý\u0010\u0017â[br:¡Êï<ñ\u00014¨)!W\u0015í\u0015Í\u0092®Ø\u001akF!D'c\u009bÜ\u009fËfi\u000eÈýÀi\u0097X\u0087YðA%a\u0084X}\u0093\"WÙqÄîlGk;: E²¯³ ì¡F:tcþ\u008f³\fm\u009fFF\u0081ù\u000bHÄ2"
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
                                                   g = var6;
                                                   h = new Long[16];
                                                   j = new ReentrantLock();
                                                   o = 0L;
                                                   e = false;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "b\u0092ý½KÖ\"»\u0011\u0088t\u0087nOIé";
                                                var5 = "b\u0092ý½KÖ\"»\u0011\u0088t\u0087nOIé".length();
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

                                 var12 = "\u0001ª^jM#\u001c\f²Ä¡P\u0005\u0005|X";
                                 var13 = "\u0001ª^jM#\u001c\f²Ä¡P\u0005\u0005|X".length();
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

                  var18 = "剱輳°0帽ò\u0003ÞØ|";
                  var20 = "剱輳°0帽ò\u0003ÞØ|".length();
                  var17 = 6;
                  var26 = -1;
            }

            var10000 = 47;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }

   public static void f(int[] var0) {
      y = var0;
   }

   public static int[] g() {
      return y;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 5891) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 68;
               break;
            case 1:
               var10000 = 140;
               break;
            case 2:
               var10000 = 239;
               break;
            case 3:
               var10000 = 127;
               break;
            case 4:
               var10000 = 51;
               break;
            case 5:
               var10000 = 9;
               break;
            case 6:
               var10000 = 56;
               break;
            case 7:
               var10000 = 123;
               break;
            case 8:
               var10000 = 19;
               break;
            case 9:
               var10000 = 167;
               break;
            case 10:
               var10000 = 198;
               break;
            case 11:
               var10000 = 146;
               break;
            case 12:
               var10000 = 125;
               break;
            case 13:
               var10000 = 93;
               break;
            case 14:
               var10000 = 57;
               break;
            case 15:
               var10000 = 205;
               break;
            case 16:
               var10000 = 234;
               break;
            case 17:
               var10000 = 245;
               break;
            case 18:
               var10000 = 61;
               break;
            case 19:
               var10000 = 107;
               break;
            case 20:
               var10000 = 158;
               break;
            case 21:
               var10000 = 211;
               break;
            case 22:
               var10000 = 90;
               break;
            case 23:
               var10000 = 117;
               break;
            case 24:
               var10000 = 108;
               break;
            case 25:
               var10000 = 60;
               break;
            case 26:
               var10000 = 85;
               break;
            case 27:
               var10000 = 155;
               break;
            case 28:
               var10000 = 71;
               break;
            case 29:
               var10000 = 76;
               break;
            case 30:
               var10000 = 87;
               break;
            case 31:
               var10000 = 145;
               break;
            case 32:
               var10000 = 249;
               break;
            case 33:
               var10000 = 134;
               break;
            case 34:
               var10000 = 240;
               break;
            case 35:
               var10000 = 88;
               break;
            case 36:
               var10000 = 232;
               break;
            case 37:
               var10000 = 162;
               break;
            case 38:
               var10000 = 216;
               break;
            case 39:
               var10000 = 115;
               break;
            case 40:
               var10000 = 100;
               break;
            case 41:
               var10000 = 225;
               break;
            case 42:
               var10000 = 3;
               break;
            case 43:
               var10000 = 131;
               break;
            case 44:
               var10000 = 182;
               break;
            case 45:
               var10000 = 23;
               break;
            case 46:
               var10000 = 26;
               break;
            case 47:
               var10000 = 144;
               break;
            case 48:
               var10000 = 132;
               break;
            case 49:
               var10000 = 252;
               break;
            case 50:
               var10000 = 25;
               break;
            case 51:
               var10000 = 73;
               break;
            case 52:
               var10000 = 59;
               break;
            case 53:
               var10000 = 48;
               break;
            case 54:
               var10000 = 224;
               break;
            case 55:
               var10000 = 236;
               break;
            case 56:
               var10000 = 253;
               break;
            case 57:
               var10000 = 243;
               break;
            case 58:
               var10000 = 174;
               break;
            case 59:
               var10000 = 20;
               break;
            case 60:
               var10000 = 151;
               break;
            case 61:
               var10000 = 94;
               break;
            case 62:
               var10000 = 166;
               break;
            case 63:
               var10000 = 196;
               break;
            case 64:
               var10000 = 33;
               break;
            case 65:
               var10000 = 248;
               break;
            case 66:
               var10000 = 91;
               break;
            case 67:
               var10000 = 18;
               break;
            case 68:
               var10000 = 113;
               break;
            case 69:
               var10000 = 126;
               break;
            case 70:
               var10000 = 62;
               break;
            case 71:
               var10000 = 226;
               break;
            case 72:
               var10000 = 10;
               break;
            case 73:
               var10000 = 14;
               break;
            case 74:
               var10000 = 241;
               break;
            case 75:
               var10000 = 254;
               break;
            case 76:
               var10000 = 135;
               break;
            case 77:
               var10000 = 99;
               break;
            case 78:
               var10000 = 217;
               break;
            case 79:
               var10000 = 13;
               break;
            case 80:
               var10000 = 207;
               break;
            case 81:
               var10000 = 1;
               break;
            case 82:
               var10000 = 74;
               break;
            case 83:
               var10000 = 209;
               break;
            case 84:
               var10000 = 65;
               break;
            case 85:
               var10000 = 96;
               break;
            case 86:
               var10000 = 165;
               break;
            case 87:
               var10000 = 129;
               break;
            case 88:
               var10000 = 177;
               break;
            case 89:
               var10000 = 102;
               break;
            case 90:
               var10000 = 55;
               break;
            case 91:
               var10000 = 179;
               break;
            case 92:
               var10000 = 238;
               break;
            case 93:
               var10000 = 121;
               break;
            case 94:
               var10000 = 219;
               break;
            case 95:
               var10000 = 220;
               break;
            case 96:
               var10000 = 250;
               break;
            case 97:
               var10000 = 110;
               break;
            case 98:
               var10000 = 0;
               break;
            case 99:
               var10000 = 139;
               break;
            case 100:
               var10000 = 244;
               break;
            case 101:
               var10000 = 137;
               break;
            case 102:
               var10000 = 124;
               break;
            case 103:
               var10000 = 66;
               break;
            case 104:
               var10000 = 97;
               break;
            case 105:
               var10000 = 194;
               break;
            case 106:
               var10000 = 175;
               break;
            case 107:
               var10000 = 80;
               break;
            case 108:
               var10000 = 105;
               break;
            case 109:
               var10000 = 112;
               break;
            case 110:
               var10000 = 181;
               break;
            case 111:
               var10000 = 50;
               break;
            case 112:
               var10000 = 47;
               break;
            case 113:
               var10000 = 153;
               break;
            case 114:
               var10000 = 142;
               break;
            case 115:
               var10000 = 141;
               break;
            case 116:
               var10000 = 81;
               break;
            case 117:
               var10000 = 44;
               break;
            case 118:
               var10000 = 43;
               break;
            case 119:
               var10000 = 45;
               break;
            case 120:
               var10000 = 176;
               break;
            case 121:
               var10000 = 16;
               break;
            case 122:
               var10000 = 119;
               break;
            case 123:
               var10000 = 180;
               break;
            case 124:
               var10000 = 72;
               break;
            case 125:
               var10000 = 201;
               break;
            case 126:
               var10000 = 4;
               break;
            case 127:
               var10000 = 143;
               break;
            case 128:
               var10000 = 214;
               break;
            case 129:
               var10000 = 251;
               break;
            case 130:
               var10000 = 53;
               break;
            case 131:
               var10000 = 70;
               break;
            case 132:
               var10000 = 178;
               break;
            case 133:
               var10000 = 15;
               break;
            case 134:
               var10000 = 52;
               break;
            case 135:
               var10000 = 163;
               break;
            case 136:
               var10000 = 221;
               break;
            case 137:
               var10000 = 172;
               break;
            case 138:
               var10000 = 154;
               break;
            case 139:
               var10000 = 37;
               break;
            case 140:
               var10000 = 133;
               break;
            case 141:
               var10000 = 197;
               break;
            case 142:
               var10000 = 161;
               break;
            case 143:
               var10000 = 114;
               break;
            case 144:
               var10000 = 147;
               break;
            case 145:
               var10000 = 42;
               break;
            case 146:
               var10000 = 193;
               break;
            case 147:
               var10000 = 169;
               break;
            case 148:
               var10000 = 89;
               break;
            case 149:
               var10000 = 218;
               break;
            case 150:
               var10000 = 95;
               break;
            case 151:
               var10000 = 195;
               break;
            case 152:
               var10000 = 11;
               break;
            case 153:
               var10000 = 185;
               break;
            case 154:
               var10000 = 17;
               break;
            case 155:
               var10000 = 39;
               break;
            case 156:
               var10000 = 41;
               break;
            case 157:
               var10000 = 191;
               break;
            case 158:
               var10000 = 202;
               break;
            case 159:
               var10000 = 103;
               break;
            case 160:
               var10000 = 32;
               break;
            case 161:
               var10000 = 136;
               break;
            case 162:
               var10000 = 235;
               break;
            case 163:
               var10000 = 228;
               break;
            case 164:
               var10000 = 30;
               break;
            case 165:
               var10000 = 38;
               break;
            case 166:
               var10000 = 6;
               break;
            case 167:
               var10000 = 160;
               break;
            case 168:
               var10000 = 190;
               break;
            case 169:
               var10000 = 22;
               break;
            case 170:
               var10000 = 58;
               break;
            case 171:
               var10000 = 200;
               break;
            case 172:
               var10000 = 152;
               break;
            case 173:
               var10000 = 21;
               break;
            case 174:
               var10000 = 83;
               break;
            case 175:
               var10000 = 168;
               break;
            case 176:
               var10000 = 98;
               break;
            case 177:
               var10000 = 213;
               break;
            case 178:
               var10000 = 222;
               break;
            case 179:
               var10000 = 12;
               break;
            case 180:
               var10000 = 148;
               break;
            case 181:
               var10000 = 159;
               break;
            case 182:
               var10000 = 229;
               break;
            case 183:
               var10000 = 192;
               break;
            case 184:
               var10000 = 208;
               break;
            case 185:
               var10000 = 255;
               break;
            case 186:
               var10000 = 120;
               break;
            case 187:
               var10000 = 40;
               break;
            case 188:
               var10000 = 2;
               break;
            case 189:
               var10000 = 35;
               break;
            case 190:
               var10000 = 92;
               break;
            case 191:
               var10000 = 173;
               break;
            case 192:
               var10000 = 150;
               break;
            case 193:
               var10000 = 84;
               break;
            case 194:
               var10000 = 188;
               break;
            case 195:
               var10000 = 46;
               break;
            case 196:
               var10000 = 5;
               break;
            case 197:
               var10000 = 138;
               break;
            case 198:
               var10000 = 118;
               break;
            case 199:
               var10000 = 204;
               break;
            case 200:
               var10000 = 34;
               break;
            case 201:
               var10000 = 8;
               break;
            case 202:
               var10000 = 24;
               break;
            case 203:
               var10000 = 28;
               break;
            case 204:
               var10000 = 215;
               break;
            case 205:
               var10000 = 227;
               break;
            case 206:
               var10000 = 130;
               break;
            case 207:
               var10000 = 111;
               break;
            case 208:
               var10000 = 64;
               break;
            case 209:
               var10000 = 122;
               break;
            case 210:
               var10000 = 101;
               break;
            case 211:
               var10000 = 31;
               break;
            case 212:
               var10000 = 187;
               break;
            case 213:
               var10000 = 86;
               break;
            case 214:
               var10000 = 36;
               break;
            case 215:
               var10000 = 246;
               break;
            case 216:
               var10000 = 186;
               break;
            case 217:
               var10000 = 54;
               break;
            case 218:
               var10000 = 203;
               break;
            case 219:
               var10000 = 78;
               break;
            case 220:
               var10000 = 104;
               break;
            case 221:
               var10000 = 206;
               break;
            case 222:
               var10000 = 156;
               break;
            case 223:
               var10000 = 210;
               break;
            case 224:
               var10000 = 247;
               break;
            case 225:
               var10000 = 171;
               break;
            case 226:
               var10000 = 75;
               break;
            case 227:
               var10000 = 183;
               break;
            case 228:
               var10000 = 69;
               break;
            case 229:
               var10000 = 106;
               break;
            case 230:
               var10000 = 231;
               break;
            case 231:
               var10000 = 29;
               break;
            case 232:
               var10000 = 242;
               break;
            case 233:
               var10000 = 7;
               break;
            case 234:
               var10000 = 116;
               break;
            case 235:
               var10000 = 82;
               break;
            case 236:
               var10000 = 128;
               break;
            case 237:
               var10000 = 109;
               break;
            case 238:
               var10000 = 149;
               break;
            case 239:
               var10000 = 212;
               break;
            case 240:
               var10000 = 77;
               break;
            case 241:
               var10000 = 199;
               break;
            case 242:
               var10000 = 189;
               break;
            case 243:
               var10000 = 170;
               break;
            case 244:
               var10000 = 223;
               break;
            case 245:
               var10000 = 164;
               break;
            case 246:
               var10000 = 67;
               break;
            case 247:
               var10000 = 233;
               break;
            case 248:
               var10000 = 79;
               break;
            case 249:
               var10000 = 184;
               break;
            case 250:
               var10000 = 157;
               break;
            case 251:
               var10000 = 237;
               break;
            case 252:
               var10000 = 63;
               break;
            case 253:
               var10000 = 49;
               break;
            case 254:
               var10000 = 27;
               break;
            default:
               var10000 = 230;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5053;
      if (f[var3] == null) {
         f[var3] = (int)(c[var3] ^ var1);
      }

      return f[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 21738) & 32767;
      if (h[var3] == null) {
         h[var3] = g[var3] ^ var1;
      }

      return h[var3];
   }
}





