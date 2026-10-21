package com;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

public class om_4 {
   private byte[] C;
   private long P;
   private long u;
   private long I;
   private static ReentrantLock m;
   public static boolean p;
   private File v;
   private File q;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;
   private static final long[] e;
   private static final Long[] f;

   public om_4(String var1, String var2) throws Exception {
      this.v = new File(var1);
      this.q = new File(var2);
      this.c();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void c() throws Exception {
      ByteArrayOutputStream var2 = null;
      String var10000 = com.co_4.n();
      FileInputStream var3 = null;
      m.lock();
      String var1 = var10000;
      boolean var17 = false /* VF: Semaphore variable */;

      label177: {
         label176: {
            label175: {
               try {
                  var17 = true;
                  var2 = new ByteArrayOutputStream();
                  byte[] var4 = new byte[a(26466, 7147681268684653401L)];
                  var3 = new FileInputStream(this.v);

                  while (true) {
                     if (var3.read(var4) != -1) {
                        try {
                           var2.write(var4);
                           if (var1 != null) {
                              var17 = false;
                              break;
                           }

                           if (var1 == null) {
                              continue;
                           }
                        } catch (IOException var26) {
                           throw a(var26);
                        }
                     }

                     try {
                        this.C = var2.toByteArray();
                        this.P = this.w(0);
                        this.u = this.w(4);
                        this.I = (this.u - this.P) / b(5816, 6876531208258805643L) + 1L;
                        var35 = var3;
                        if (var1 != null) {
                           var17 = false;
                           break label175;
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
                        label182: {
                           label137: {
                              label136: {
                                 try {
                                    var33 = var2;
                                    if (var1 != null) {
                                       break label136;
                                    }

                                    if (var2 == null) {
                                       break label137;
                                    }
                                 } catch (IOException var19) {
                                    throw a(var19);
                                 }

                                 var33 = var2;
                              }

                              var33.close();
                           }

                           label128: {
                              try {
                                 var34 = var3;
                                 if (var1 != null) {
                                    break label128;
                                 }

                                 if (var3 == null) {
                                    break label182;
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

                     m.unlock();
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
                  break label176;
               }
            }

            try {
               label148: {
                  try {
                     if (var1 != null) {
                        break label148;
                     }

                     if (var35 == null) {
                        break label177;
                     }
                  } catch (IOException var21) {
                     throw a(var21);
                  }

                  var35 = var3;
               }

               var35.close();
               break label177;
            } catch (IOException var22) {
               var36 = var22;
               boolean var37 = false;
            }
         }

         IOException var28 = var36;
         var28.printStackTrace();
      }

      m.unlock();
   }

   private long w(int var1) {
      long var2 = (long)(this.C[var1] & a(26892, 4973600230822284596L));
      var2 |= (long)(this.C[var1 + 1] << a(27539, 6323103256328048544L)) & b(21555, 6047875993807756553L);
      var2 |= (long)(this.C[var1 + 2] << a(8785, 1891890837461091950L)) & b(20103, 3039441742701070257L);
      return var2 | (long)(this.C[var1 + 3] << a(17432, 2771681177845800998L)) & b(9652, 8926098792124378245L);
   }

   private long i(int var1) {
      long var2 = (long)this.C[var1] & b(26596, 6600875862975852248L);
      var2 |= (long)(this.C[var1 + 1] << a(27539, 6323103256328048544L)) & b(21555, 6047875993807756553L);
      return var2 | (long)(this.C[var1 + 2] << a(8785, 1891890837461091950L)) & b(20103, 3039441742701070257L);
   }

   private long R(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/co_4.n ()Ljava/lang/String;
      // 003: lconst_0
      // 004: lstore 4
      // 006: aload 0
      // 007: getfield com/om_4.I J
      // 00a: lstore 6
      // 00c: lconst_0
      // 00d: lstore 8
      // 00f: astore 3
      // 010: lload 4
      // 012: lload 6
      // 014: lcmp
      // 015: ifgt 12d
      // 018: lload 4
      // 01a: lload 6
      // 01c: ladd
      // 01d: bipush 1
      // 01e: lushr
      // 01f: lstore 8
      // 021: aload 0
      // 022: aload 0
      // 023: getfield com/om_4.P J
      // 026: lload 8
      // 028: lconst_1
      // 029: lsub
      // 02a: sipush 26684
      // 02d: ldc2_w 4410178629150613774
      // 030: invokestatic com/om_4.b (IJ)J
      // 033: lmul
      // 034: ladd
      // 035: l2i
      // 036: invokespecial com/om_4.w (I)J
      // 039: lstore 10
      // 03b: aload 0
      // 03c: aload 0
      // 03d: getfield com/om_4.P J
      // 040: lload 8
      // 042: sipush 26684
      // 045: ldc2_w 4410178629150613774
      // 048: invokestatic com/om_4.b (IJ)J
      // 04b: lmul
      // 04c: ladd
      // 04d: l2i
      // 04e: invokespecial com/om_4.w (I)J
      // 051: lstore 12
      // 053: lload 10
      // 055: aload 3
      // 056: ifnonnull 136
      // 059: lload 1
      // 05a: lcmp
      // 05b: aload 3
      // 05c: ifnonnull 0b4
      // 05f: goto 066
      // 062: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: ifgt 0b0
      // 069: goto 070
      // 06c: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: lload 1
      // 071: lload 12
      // 073: lcmp
      // 074: aload 3
      // 075: ifnonnull 0b4
      // 078: goto 07f
      // 07b: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: ifge 0b0
      // 082: goto 089
      // 085: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: aload 0
      // 08a: aload 0
      // 08b: getfield com/om_4.P J
      // 08e: lload 8
      // 090: lconst_1
      // 091: lsub
      // 092: sipush 26684
      // 095: ldc2_w 4410178629150613774
      // 098: invokestatic com/om_4.b (IJ)J
      // 09b: lmul
      // 09c: ladd
      // 09d: sipush 28697
      // 0a0: ldc2_w 5701292741424757026
      // 0a3: invokestatic com/om_4.b (IJ)J
      // 0a6: ladd
      // 0a7: l2i
      // 0a8: invokespecial com/om_4.i (I)J
      // 0ab: lreturn
      // 0ac: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: lload 1
      // 0b1: lload 12
      // 0b3: lcmp
      // 0b4: aload 3
      // 0b5: ifnonnull 0eb
      // 0b8: ifne 0e7
      // 0bb: goto 0c2
      // 0be: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: aload 0
      // 0c4: getfield com/om_4.P J
      // 0c7: lload 8
      // 0c9: sipush 26684
      // 0cc: ldc2_w 4410178629150613774
      // 0cf: invokestatic com/om_4.b (IJ)J
      // 0d2: lmul
      // 0d3: ladd
      // 0d4: sipush 28697
      // 0d7: ldc2_w 5701292741424757026
      // 0da: invokestatic com/om_4.b (IJ)J
      // 0dd: ladd
      // 0de: l2i
      // 0df: invokespecial com/om_4.i (I)J
      // 0e2: lreturn
      // 0e3: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: lload 1
      // 0e8: lload 10
      // 0ea: lcmp
      // 0eb: aload 3
      // 0ec: ifnonnull 119
      // 0ef: ifle 103
      // 0f2: goto 0f9
      // 0f5: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: lload 8
      // 0fb: lconst_1
      // 0fc: ladd
      // 0fd: lstore 4
      // 0ff: aload 3
      // 100: ifnull 129
      // 103: lload 1
      // 104: lload 10
      // 106: aload 3
      // 107: ifnonnull 126
      // 10a: goto 111
      // 10d: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: lcmp
      // 112: goto 119
      // 115: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: ifge 129
      // 11c: lload 8
      // 11e: lconst_1
      // 11f: goto 126
      // 122: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: lsub
      // 127: lstore 6
      // 129: aload 3
      // 12a: ifnull 010
      // 12d: sipush 17310
      // 130: ldc2_w 496727989530364582
      // 133: invokestatic com/om_4.b (IJ)J
      // 136: lreturn
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public com.co_4 K(String var1) {
      long var3 = N(var1);
      String var10000 = com.co_4.n();
      m.lock();
      long var5 = this.R(var3);
      String var2 = var10000;
      boolean var11 = false /* VF: Semaphore variable */;

      com.co_4 var7;
      label57: {
         try {
            label47: {
               try {
                  var11 = true;
                  if (var2 != null) {
                     var11 = false;
                     return null;
                  }

                  if (var5 == b(18517, 4528129311136645483L)) {
                     var11 = false;
                     break label47;
                  }
               } catch (NullPointerException var12) {
                  throw a(var12);
               }

               var7 = this.U((int)var5);
               var11 = false;
               break label57;
            }
         } finally {
            if (var11) {
               m.unlock();
            }
         }

         m.unlock();
         return null;
      }

      m.unlock();
      return var7;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private com.co_4 U(int var1) {
      String var10000 = com.co_4.n();
      com.co_4 var3 = new com.co_4();
      String var2 = var10000;

      try {
         byte var4 = this.C[var1 + 4];

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
                  var5 = this.i(var1 + 5);
                  com.om_4 var18 = this;
                  if (var2 == null) {
                     var4 = this.C[(int)var5];
                     if (var4 == 2) {
                        HX var7 = this.a((int)this.i((int)var5 + 1));
                        var3.e = var7.H;
                        var5 += b(7124, 7496990098270081773L);

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

                  HX var16 = var18.a((int)var5);
                  var3.e = var16.H;
                  var5 += (long)var16.M;
               }

               try {
                  var3.x = this.e((int)var5);
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
               var3.e = this.a((int)this.i(var1 + 5)).H;
               var3.x = this.e(var1 + a(27539, 6323103256328048544L));
               if (var2 == null) {
                  return var3;
               }
            }
         } catch (Exception var8) {
            throw a(var8);
         }

         HX var15 = this.a(var1 + 4);
         var3.e = var15.H;
         var3.x = this.e(var1 + 4 + var15.M);
         return var3;
      } catch (Exception var14) {
         return null;
      }
   }

   private String e(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/co_4.n ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/om_4.C [B
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
      // 17: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: iload 3
      // 1c: bipush 2
      // 1d: goto 24
      // 20: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: if_icmpne 49
      // 27: aload 0
      // 28: iload 1
      // 29: bipush 1
      // 2a: iadd
      // 2b: invokespecial com/om_4.i (I)J
      // 2e: lstore 4
      // 30: lload 4
      // 32: lconst_0
      // 33: lcmp
      // 34: ifne 3e
      // 37: ldc ""
      // 39: areturn
      // 3a: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: lload 4
      // 41: l2i
      // 42: invokespecial com/om_4.a (I)Lcom/HX;
      // 45: getfield com/HX.H Ljava/lang/String;
      // 48: areturn
      // 49: aload 0
      // 4a: iload 1
      // 4b: invokespecial com/om_4.a (I)Lcom/HX;
      // 4e: getfield com/HX.H Ljava/lang/String;
      // 51: areturn
   }

   private HX a(int var1) {
      byte[] var4 = new byte[a(26177, 3882824661103346300L)];
      String var10000 = com.co_4.n();
      int var5 = 0;
      String var2 = var10000;
      int var3 = var1 + 1;
      var4[var5] = this.C[var1];

      while (var4[var5] != 0) {
         var5++;
         var4[var5] = this.C[var3++];
         if (var2 != null) {
            break;
         }
      }

      try {
         return new HX(this, new String(var4, 0, var5, a(-28385, -23487)), var5 + 1);
      } catch (UnsupportedEncodingException var7) {
         return new HX(this, "", 0);
      }
   }

   private static long N(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/co_4.n ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush -28391
      // 1a: sipush -18061
      // 1d: invokestatic com/om_4.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/om_4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: sipush -28399
      // 2c: sipush 31648
      // 2f: invokestatic com/om_4.a (II)Ljava/lang/String;
      // 32: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 35: astore 2
      // 36: aload 2
      // 37: bipush 0
      // 38: aaload
      // 39: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 3c: sipush 26596
      // 3f: ldc2_w 6600875862975852248
      // 42: invokestatic com/om_4.b (IJ)J
      // 45: land
      // 46: sipush 17432
      // 49: ldc2_w 2771681177845800998
      // 4c: invokestatic com/om_4.a (IJ)I
      // 4f: lshl
      // 50: sipush 13670
      // 53: ldc2_w 3678374449097243729
      // 56: invokestatic com/om_4.b (IJ)J
      // 59: land
      // 5a: lstore 3
      // 5b: lload 3
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: aaload
      // 5f: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 62: sipush 26596
      // 65: ldc2_w 6600875862975852248
      // 68: invokestatic com/om_4.b (IJ)J
      // 6b: land
      // 6c: sipush 8785
      // 6f: ldc2_w 1891890837461091950
      // 72: invokestatic com/om_4.a (IJ)I
      // 75: lshl
      // 76: sipush 23575
      // 79: ldc2_w 663018296816440615
      // 7c: invokestatic com/om_4.b (IJ)J
      // 7f: land
      // 80: lor
      // 81: lstore 3
      // 82: lload 3
      // 83: aload 2
      // 84: bipush 2
      // 85: aaload
      // 86: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 89: sipush 26596
      // 8c: ldc2_w 6600875862975852248
      // 8f: invokestatic com/om_4.b (IJ)J
      // 92: land
      // 93: sipush 27539
      // 96: ldc2_w 6323103256328048544
      // 99: invokestatic com/om_4.a (IJ)I
      // 9c: lshl
      // 9d: sipush 13384
      // a0: ldc2_w 872774759753776501
      // a3: invokestatic com/om_4.b (IJ)J
      // a6: land
      // a7: lor
      // a8: lstore 3
      // a9: lload 3
      // aa: aload 2
      // ab: bipush 3
      // ac: aaload
      // ad: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // b0: sipush 26596
      // b3: ldc2_w 6600875862975852248
      // b6: invokestatic com/om_4.b (IJ)J
      // b9: land
      // ba: lor
      // bb: lstore 3
      // bc: lload 3
      // bd: lreturn
   }

   public void O() throws Exception {
      String var10000 = com.co_4.n();
      long var2 = this.P;
      String var1 = var10000;
      long var4 = this.I;
      ArrayList var6 = new ArrayList();
      HashSet var7 = new HashSet();
      HashSet var8 = new HashSet();
      int var9 = 0;

      while (true) {
         if ((long)var9 < var4) {
            long var10 = this.w((int)(var2 + (long)var9 * b(26684, 4410178629150613774L)));
            com.co_4 var12 = this.U((int)this.i((int)(var2 + (long)var9 * b(26684, 4410178629150613774L) + b(28697, 5701292741424757026L))));

            try {
               var12.S = i(var10);
               var6.add(var12);
               var7.add(var12.e);
               var47 = var8.add(var12.x);
               if (var1 != null) {
                  break;
               }

               var9++;
               if (var1 == null) {
                  continue;
               }
            } catch (Exception var24) {
               throw a(var24);
            }
         }

         var47 = a(8090, 3771442565228231592L);
         break;
      }

      byte[] var25 = new byte[var47];
      int var26 = a(27539, 6323103256328048544L);
      HashMap var11 = new HashMap();
      HashMap var35 = new HashMap();
      Iterator var13 = var7.iterator();

      while (true) {
         if (var13.hasNext()) {
            String var14 = (String)var13.next();

            label72: {
               try {
                  var14 = var14.trim();
                  var11.put(var14, var26);
                  System.arraycopy(var14.getBytes(a(-28387, 10681)), 0, var25, var26, var14.getBytes(a(-28387, 10681)).length);
                  var26 += var14.getBytes(a(-28387, 10681)).length;
                  var25[var26++] = 0;
               } catch (Exception var23) {
                  System.out.println(var26);
                  System.exit(0);
                  break label72;
               }

               if (var1 != null) {
                  break;
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         var13 = var8.iterator();
         break;
      }

      while (true) {
         if (var13.hasNext()) {
            String var38 = (String)var13.next();

            try {
               var38 = var38.trim();
               var35.put(var38, var26);
               System.arraycopy(var38.getBytes(a(-28387, 10681)), 0, var25, var26, var38.getBytes(a(-28387, 10681)).length);
               var48 = var26 + var38.getBytes(a(-28387, 10681)).length;
               if (var1 != null) {
                  break;
               }

               var26 = var48;
               var25[var26++] = 0;
            } catch (Exception var22) {
               System.out.println(var26);
               System.exit(0);
            }

            if (var1 == null) {
               continue;
            }
         }

         var48 = var26;
         break;
      }

      int var36 = var48;
      Iterator var40 = var6.iterator();

      while (true) {
         if (var40.hasNext()) {
            com.co_4 var15 = (com.co_4)var40.next();
            int var16 = var26;
            int var17 = (Integer)var11.get(var15.e.trim());
            int var18 = (Integer)var35.get(var15.x.trim());
            long var19 = N(var15.S);
            var19 &= b(17310, 496727989530364582L);
            var25[var26++] = (byte)((int)(var19 & b(26596, 6600875862975852248L)));
            var25[var26++] = (byte)((int)(var19 >> a(27539, 6323103256328048544L) & b(26596, 6600875862975852248L)));
            var25[var26++] = (byte)((int)(var19 >> a(8785, 1891890837461091950L) & b(26596, 6600875862975852248L)));
            var25[var26++] = (byte)((int)(var19 >> a(17432, 2771681177845800998L) & b(26596, 6600875862975852248L)));
            var17 &= -1;
            var25[var26++] = (byte)(var17 & a(14483, 1087215267295354019L));
            var25[var26++] = (byte)(var17 >> a(27539, 6323103256328048544L) & a(26892, 4973600230822284596L));
            var25[var26++] = (byte)(var17 >> a(8785, 1891890837461091950L) & a(26892, 4973600230822284596L));
            var49 = var18 & -1;
            if (var1 != null) {
               break;
            }

            var18 = var49;
            var25[var26++] = (byte)(var18 & a(26892, 4973600230822284596L));
            var25[var26++] = (byte)(var18 >> a(27539, 6323103256328048544L) & a(26892, 4973600230822284596L));
            var25[var26++] = (byte)(var18 >> a(8785, 1891890837461091950L) & a(26892, 4973600230822284596L));
            System.out.println(var15.S + ":" + var16 + ":" + var17 + ":" + var18);
            if (var1 == null) {
               continue;
            }
         }

         var49 = var26 - a(17245, 8650569619066300264L);
         break;
      }

      int var41 = var49;
      System.out.println(a(-28388, -13742) + var36);
      System.out.println(a(-28386, -8301) + var41);
      System.out.println(a(-28392, 24229) + (var26 - 1));
      var25[0] = (byte)(var36 & a(26892, 4973600230822284596L));
      var25[1] = (byte)(var36 >> a(27539, 6323103256328048544L) & a(26892, 4973600230822284596L));
      var25[2] = (byte)(var36 >> a(8785, 1891890837461091950L) & a(26892, 4973600230822284596L));
      var25[3] = (byte)(var36 >> a(17432, 2771681177845800998L) & a(26892, 4973600230822284596L));
      var25[4] = (byte)(var41 & a(26892, 4973600230822284596L));
      var25[5] = (byte)(var41 >> a(27539, 6323103256328048544L) & a(26892, 4973600230822284596L));
      var25[a(19915, 3530262388436511218L)] = (byte)(var41 >> a(8785, 1891890837461091950L) & a(26892, 4973600230822284596L));
      var25[a(22811, 2037921257721249057L)] = (byte)(var41 >> a(17432, 2771681177845800998L) & a(26892, 4973600230822284596L));

      try {
         FileOutputStream var42 = new FileOutputStream(this.q);
         ByteArrayOutputStream var43 = new ByteArrayOutputStream();
         var43.write(var25, 0, var26 - 1);
         var43.writeTo(var42);
         var43.close();
         var42.close();
      } catch (Exception var21) {
         var21.printStackTrace();
      }
   }

   public static void main(String[] var0) throws Exception {
      com.om_4 var1 = new com.om_4(com.om_4.class.getResource(a(-28390, -30867)).getPath(), a(-28389, 6740));
      var1.O();
   }

   public static String i(long var0) {
      String var3 = "";
      String var10000 = com.co_4.n();
      var3 = var3 + String.valueOf(var0 >> a(27482, 7729903251454037870L) & b(18910, 718419013522751713L)).concat(".");
      var3 = var3 + String.valueOf(var0 >> a(10309, 5955695351031352441L) & b(26596, 6600875862975852248L)).concat(".");
      String var2 = var10000;
      var3 = var3 + String.valueOf(var0 >> a(19465, 5025417592500693048L) & b(26596, 6600875862975852248L)).concat(".");
      var3 = var3 + String.valueOf(var0 & b(26596, 6600875862975852248L));

      try {
         if (var2 != null) {
            com.ky_4.K(new String[5]);
         }

         return var3;
      } catch (NullPointerException var4) {
         throw a(var4);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[9];
      int var19 = 0;
      String var18 = "\u008cA亪耚丐竩\u0007½óJaM]z\b\u0088Yù!\u009d\u008d*\u0000\nãUµ3H\u0014\b\u009d\b]\u0003g\u001cz\u00077¦´£Õ|ä\u0003é\u008f«";
      int var20 = "\u008cA亪耚丐竩\u0007½óJaM]z\b\u0088Yù!\u009d\u008d*\u0000\nãUµ3H\u0014\b\u009d\b]\u0003g\u001cz\u00077¦´£Õ|ä\u0003é\u008f«".length();
      char var17 = 6;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 25;
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
                        var84 = 50;
                        break;
                     case 1:
                        var84 = 60;
                        break;
                     case 2:
                        var84 = 14;
                        break;
                     case 3:
                        var84 = 12;
                        break;
                     case 4:
                        var84 = 40;
                        break;
                     case 5:
                        var84 = 41;
                        break;
                     default:
                        var84 = 44;
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
                     b = new String[9];
                     long var8 = 7980380946781284576L;
                     long[] var14 = new long[14];
                     int var11 = 0;
                     String var12 = "J\u009bò\u0003uÇ%+U41g[\u009f\u0081\u0014½06^W\u0080\u0095Æfb\u0003\u009a\u001a\u0098/¹\u009e¾\u0091\u009d\u008d\u009aä\u0089\u0087¦\u0098É{\u0000«\u009c\u001eí\u0013\u0093Õ\u0013\bÞ<\u009f(¶\u0019\u009eî\u009eQà«Á\b´ô¼\u0096z¾\u0018À1\u0000Ðò4\tT\u0086¦ÓH\u0000A°8~½'H";
                     int var13 = "J\u009bò\u0003uÇ%+U41g[\u009f\u0081\u0014½06^W\u0080\u0095Æfb\u0003\u009a\u001a\u0098/¹\u009e¾\u0091\u009d\u008d\u009aä\u0089\u0087¦\u0098É{\u0000«\u009c\u001eí\u0013\u0093Õ\u0013\bÞ<\u009f(¶\u0019\u009eî\u009eQà«Á\b´ô¼\u0096z¾\u0018À1\u0000Ðò4\tT\u0086¦ÓH\u0000A°8~½'H"
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
                                    d = new Integer[14];
                                    long var0 = 1174916046836195223L;
                                    long[] var6 = new long[14];
                                    int var3 = 0;
                                    String var4 = "_Q,aÉ±f±C |Ç\f\u0015=\u009exD\u008b-`\u0091\u008d~éUgm\u0016\u009fªÎ\u0019¶u¢8zß\u0089Ñfù\u008a\u009c9¡\u0003\u001cR\u009bîx\u009fÝâKÕ&t·³ñ°O {X?´\u0080\u001b-z9ó¶\u0019~\u009ek\u0091üd\u0085\u000e3\u0012\u0019} K¡8Ê°";
                                    int var5 = "_Q,aÉ±f±C |Ç\f\u0015=\u009exD\u008b-`\u0091\u008d~éUgm\u0016\u009fªÎ\u0019¶u¢8zß\u0089Ñfù\u008a\u009c9¡\u0003\u001cR\u009bîx\u009fÝâKÕ&t·³ñ°O {X?´\u0080\u001b-z9ó¶\u0019~\u009ek\u0091üd\u0085\u000e3\u0012\u0019} K¡8Ê°"
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
                                                   f = new Long[14];
                                                   m = new ReentrantLock();
                                                   p = false;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "#B\u0015ù\u0006Ã£Æ:`gÂ!]Ø&";
                                                var5 = "#B\u0015ù\u0006Ã£Æ:`gÂ!]Ø&".length();
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

                                 var12 = "c£ß;\u001a?§\u0096/\u009en\u0080\u0010\n\u000f\u0082";
                                 var13 = "c£ß;\u001a?§\u0096/\u009en\u0080\u0010\n\u000f\u0082".length();
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

                  var18 = "Ù\u0004ùgìkS\u0002ó¢";
                  var20 = "Ù\u0004ùgìkS\u0002ó¢".length();
                  var17 = 7;
                  var26 = -1;
            }

            var10000 = 102;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -28391) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 133;
               break;
            case 1:
               var10000 = 248;
               break;
            case 2:
               var10000 = 15;
               break;
            case 3:
               var10000 = 2;
               break;
            case 4:
               var10000 = 5;
               break;
            case 5:
               var10000 = 118;
               break;
            case 6:
               var10000 = 185;
               break;
            case 7:
               var10000 = 137;
               break;
            case 8:
               var10000 = 218;
               break;
            case 9:
               var10000 = 212;
               break;
            case 10:
               var10000 = 217;
               break;
            case 11:
               var10000 = 80;
               break;
            case 12:
               var10000 = 224;
               break;
            case 13:
               var10000 = 139;
               break;
            case 14:
               var10000 = 50;
               break;
            case 15:
               var10000 = 56;
               break;
            case 16:
               var10000 = 18;
               break;
            case 17:
               var10000 = 1;
               break;
            case 18:
               var10000 = 211;
               break;
            case 19:
               var10000 = 251;
               break;
            case 20:
               var10000 = 112;
               break;
            case 21:
               var10000 = 57;
               break;
            case 22:
               var10000 = 179;
               break;
            case 23:
               var10000 = 241;
               break;
            case 24:
               var10000 = 81;
               break;
            case 25:
               var10000 = 29;
               break;
            case 26:
               var10000 = 104;
               break;
            case 27:
               var10000 = 213;
               break;
            case 28:
               var10000 = 221;
               break;
            case 29:
               var10000 = 41;
               break;
            case 30:
               var10000 = 84;
               break;
            case 31:
               var10000 = 17;
               break;
            case 32:
               var10000 = 98;
               break;
            case 33:
               var10000 = 16;
               break;
            case 34:
               var10000 = 71;
               break;
            case 35:
               var10000 = 245;
               break;
            case 36:
               var10000 = 39;
               break;
            case 37:
               var10000 = 180;
               break;
            case 38:
               var10000 = 83;
               break;
            case 39:
               var10000 = 32;
               break;
            case 40:
               var10000 = 169;
               break;
            case 41:
               var10000 = 190;
               break;
            case 42:
               var10000 = 215;
               break;
            case 43:
               var10000 = 141;
               break;
            case 44:
               var10000 = 167;
               break;
            case 45:
               var10000 = 107;
               break;
            case 46:
               var10000 = 246;
               break;
            case 47:
               var10000 = 9;
               break;
            case 48:
               var10000 = 26;
               break;
            case 49:
               var10000 = 223;
               break;
            case 50:
               var10000 = 75;
               break;
            case 51:
               var10000 = 229;
               break;
            case 52:
               var10000 = 37;
               break;
            case 53:
               var10000 = 34;
               break;
            case 54:
               var10000 = 94;
               break;
            case 55:
               var10000 = 110;
               break;
            case 56:
               var10000 = 187;
               break;
            case 57:
               var10000 = 54;
               break;
            case 58:
               var10000 = 209;
               break;
            case 59:
               var10000 = 7;
               break;
            case 60:
               var10000 = 225;
               break;
            case 61:
               var10000 = 20;
               break;
            case 62:
               var10000 = 87;
               break;
            case 63:
               var10000 = 136;
               break;
            case 64:
               var10000 = 159;
               break;
            case 65:
               var10000 = 140;
               break;
            case 66:
               var10000 = 109;
               break;
            case 67:
               var10000 = 200;
               break;
            case 68:
               var10000 = 183;
               break;
            case 69:
               var10000 = 172;
               break;
            case 70:
               var10000 = 85;
               break;
            case 71:
               var10000 = 253;
               break;
            case 72:
               var10000 = 25;
               break;
            case 73:
               var10000 = 150;
               break;
            case 74:
               var10000 = 184;
               break;
            case 75:
               var10000 = 13;
               break;
            case 76:
               var10000 = 174;
               break;
            case 77:
               var10000 = 202;
               break;
            case 78:
               var10000 = 19;
               break;
            case 79:
               var10000 = 69;
               break;
            case 80:
               var10000 = 123;
               break;
            case 81:
               var10000 = 28;
               break;
            case 82:
               var10000 = 227;
               break;
            case 83:
               var10000 = 62;
               break;
            case 84:
               var10000 = 122;
               break;
            case 85:
               var10000 = 77;
               break;
            case 86:
               var10000 = 127;
               break;
            case 87:
               var10000 = 240;
               break;
            case 88:
               var10000 = 182;
               break;
            case 89:
               var10000 = 162;
               break;
            case 90:
               var10000 = 121;
               break;
            case 91:
               var10000 = 60;
               break;
            case 92:
               var10000 = 154;
               break;
            case 93:
               var10000 = 192;
               break;
            case 94:
               var10000 = 125;
               break;
            case 95:
               var10000 = 233;
               break;
            case 96:
               var10000 = 43;
               break;
            case 97:
               var10000 = 203;
               break;
            case 98:
               var10000 = 21;
               break;
            case 99:
               var10000 = 208;
               break;
            case 100:
               var10000 = 38;
               break;
            case 101:
               var10000 = 89;
               break;
            case 102:
               var10000 = 64;
               break;
            case 103:
               var10000 = 120;
               break;
            case 104:
               var10000 = 132;
               break;
            case 105:
               var10000 = 24;
               break;
            case 106:
               var10000 = 0;
               break;
            case 107:
               var10000 = 204;
               break;
            case 108:
               var10000 = 254;
               break;
            case 109:
               var10000 = 115;
               break;
            case 110:
               var10000 = 91;
               break;
            case 111:
               var10000 = 45;
               break;
            case 112:
               var10000 = 207;
               break;
            case 113:
               var10000 = 243;
               break;
            case 114:
               var10000 = 12;
               break;
            case 115:
               var10000 = 181;
               break;
            case 116:
               var10000 = 66;
               break;
            case 117:
               var10000 = 129;
               break;
            case 118:
               var10000 = 195;
               break;
            case 119:
               var10000 = 222;
               break;
            case 120:
               var10000 = 88;
               break;
            case 121:
               var10000 = 27;
               break;
            case 122:
               var10000 = 117;
               break;
            case 123:
               var10000 = 249;
               break;
            case 124:
               var10000 = 206;
               break;
            case 125:
               var10000 = 95;
               break;
            case 126:
               var10000 = 48;
               break;
            case 127:
               var10000 = 53;
               break;
            case 128:
               var10000 = 74;
               break;
            case 129:
               var10000 = 191;
               break;
            case 130:
               var10000 = 250;
               break;
            case 131:
               var10000 = 119;
               break;
            case 132:
               var10000 = 72;
               break;
            case 133:
               var10000 = 90;
               break;
            case 134:
               var10000 = 47;
               break;
            case 135:
               var10000 = 210;
               break;
            case 136:
               var10000 = 40;
               break;
            case 137:
               var10000 = 236;
               break;
            case 138:
               var10000 = 197;
               break;
            case 139:
               var10000 = 97;
               break;
            case 140:
               var10000 = 176;
               break;
            case 141:
               var10000 = 175;
               break;
            case 142:
               var10000 = 201;
               break;
            case 143:
               var10000 = 226;
               break;
            case 144:
               var10000 = 59;
               break;
            case 145:
               var10000 = 231;
               break;
            case 146:
               var10000 = 163;
               break;
            case 147:
               var10000 = 61;
               break;
            case 148:
               var10000 = 101;
               break;
            case 149:
               var10000 = 76;
               break;
            case 150:
               var10000 = 171;
               break;
            case 151:
               var10000 = 252;
               break;
            case 152:
               var10000 = 216;
               break;
            case 153:
               var10000 = 214;
               break;
            case 154:
               var10000 = 145;
               break;
            case 155:
               var10000 = 135;
               break;
            case 156:
               var10000 = 44;
               break;
            case 157:
               var10000 = 237;
               break;
            case 158:
               var10000 = 205;
               break;
            case 159:
               var10000 = 149;
               break;
            case 160:
               var10000 = 22;
               break;
            case 161:
               var10000 = 108;
               break;
            case 162:
               var10000 = 52;
               break;
            case 163:
               var10000 = 199;
               break;
            case 164:
               var10000 = 247;
               break;
            case 165:
               var10000 = 228;
               break;
            case 166:
               var10000 = 160;
               break;
            case 167:
               var10000 = 165;
               break;
            case 168:
               var10000 = 10;
               break;
            case 169:
               var10000 = 36;
               break;
            case 170:
               var10000 = 131;
               break;
            case 171:
               var10000 = 114;
               break;
            case 172:
               var10000 = 177;
               break;
            case 173:
               var10000 = 144;
               break;
            case 174:
               var10000 = 244;
               break;
            case 175:
               var10000 = 164;
               break;
            case 176:
               var10000 = 220;
               break;
            case 177:
               var10000 = 92;
               break;
            case 178:
               var10000 = 238;
               break;
            case 179:
               var10000 = 198;
               break;
            case 180:
               var10000 = 6;
               break;
            case 181:
               var10000 = 42;
               break;
            case 182:
               var10000 = 14;
               break;
            case 183:
               var10000 = 255;
               break;
            case 184:
               var10000 = 235;
               break;
            case 185:
               var10000 = 168;
               break;
            case 186:
               var10000 = 230;
               break;
            case 187:
               var10000 = 58;
               break;
            case 188:
               var10000 = 158;
               break;
            case 189:
               var10000 = 173;
               break;
            case 190:
               var10000 = 3;
               break;
            case 191:
               var10000 = 86;
               break;
            case 192:
               var10000 = 153;
               break;
            case 193:
               var10000 = 232;
               break;
            case 194:
               var10000 = 188;
               break;
            case 195:
               var10000 = 219;
               break;
            case 196:
               var10000 = 151;
               break;
            case 197:
               var10000 = 146;
               break;
            case 198:
               var10000 = 189;
               break;
            case 199:
               var10000 = 4;
               break;
            case 200:
               var10000 = 134;
               break;
            case 201:
               var10000 = 55;
               break;
            case 202:
               var10000 = 23;
               break;
            case 203:
               var10000 = 111;
               break;
            case 204:
               var10000 = 30;
               break;
            case 205:
               var10000 = 35;
               break;
            case 206:
               var10000 = 242;
               break;
            case 207:
               var10000 = 194;
               break;
            case 208:
               var10000 = 186;
               break;
            case 209:
               var10000 = 170;
               break;
            case 210:
               var10000 = 46;
               break;
            case 211:
               var10000 = 31;
               break;
            case 212:
               var10000 = 33;
               break;
            case 213:
               var10000 = 78;
               break;
            case 214:
               var10000 = 96;
               break;
            case 215:
               var10000 = 156;
               break;
            case 216:
               var10000 = 126;
               break;
            case 217:
               var10000 = 138;
               break;
            case 218:
               var10000 = 196;
               break;
            case 219:
               var10000 = 143;
               break;
            case 220:
               var10000 = 100;
               break;
            case 221:
               var10000 = 99;
               break;
            case 222:
               var10000 = 239;
               break;
            case 223:
               var10000 = 63;
               break;
            case 224:
               var10000 = 142;
               break;
            case 225:
               var10000 = 155;
               break;
            case 226:
               var10000 = 65;
               break;
            case 227:
               var10000 = 113;
               break;
            case 228:
               var10000 = 102;
               break;
            case 229:
               var10000 = 79;
               break;
            case 230:
               var10000 = 166;
               break;
            case 231:
               var10000 = 82;
               break;
            case 232:
               var10000 = 67;
               break;
            case 233:
               var10000 = 157;
               break;
            case 234:
               var10000 = 93;
               break;
            case 235:
               var10000 = 116;
               break;
            case 236:
               var10000 = 51;
               break;
            case 237:
               var10000 = 178;
               break;
            case 238:
               var10000 = 11;
               break;
            case 239:
               var10000 = 128;
               break;
            case 240:
               var10000 = 73;
               break;
            case 241:
               var10000 = 193;
               break;
            case 242:
               var10000 = 234;
               break;
            case 243:
               var10000 = 68;
               break;
            case 244:
               var10000 = 152;
               break;
            case 245:
               var10000 = 147;
               break;
            case 246:
               var10000 = 124;
               break;
            case 247:
               var10000 = 161;
               break;
            case 248:
               var10000 = 103;
               break;
            case 249:
               var10000 = 49;
               break;
            case 250:
               var10000 = 148;
               break;
            case 251:
               var10000 = 70;
               break;
            case 252:
               var10000 = 130;
               break;
            case 253:
               var10000 = 106;
               break;
            case 254:
               var10000 = 105;
               break;
            default:
               var10000 = 8;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25656;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18747) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }
}





