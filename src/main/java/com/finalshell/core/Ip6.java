package com.finalshell.core;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Ip6 {
   public byte[] i;
   public long N;
   public long B;
   public long a;
   public static ReentrantLock R;
   public static Long d;
   public static boolean Q;
   public File V;
   public static String[] b;
   public static String[] c;
   public static long[] e;
   public static Integer[] f;
   public static long[] g;
   public static Long[] h;

   public Ip6(String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic com/finalshell/core/Co4.n ()Ljava/lang/String;
      // 07: aload 0
      // 08: new java/io/File
      // 0b: dup
      // 0c: aload 1
      // 0d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 10: putfield com/finalshell/core/Ip6.V Ljava/io/File;
      // 13: astore 2
      // 14: aload 0
      // 15: aload 2
      // 16: ifnonnull 31
      // 19: invokespecial com/finalshell/core/Ip6.F ()V
      // 1c: getstatic com/finalshell/core/Ip6.Q Z
      // 1f: ifeq 34
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: invokespecial com/finalshell/core/Ip6.x ()V
      // 34: return
   }

   public void x() {
      Executors.newScheduledThreadPool(1)
         .scheduleAtFixedRate(new com.finalshell.task.Kr4(this), b(3657, 7962660249290777586L), b(26937, 2012428184418403467L), TimeUnit.MILLISECONDS);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void F() throws Exception {
      String var10000 = Co4.n();
      d = this.V.lastModified();
      String var1 = var10000;
      ByteArrayOutputStream var2 = null;
      FileInputStream var3 = null;
      R.lock();
      boolean var17 = false /* VF: Semaphore variable */;

      label177: {
         label176: {
            label175: {
               try {
                  var17 = true;
                  var2 = new ByteArrayOutputStream();
                  byte[] var4 = new byte[a(32610, 7788410548130961347L)];
                  var3 = new FileInputStream(this.V);

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
      FileInputStream var35;
      FileInputStream var35;
                           throw a(var26);
                        }
                     }

                     try {
                        this.i = var2.toByteArray();
                        this.N = this.M(0);
                        this.B = this.M(4);
                        this.a = (this.B - this.N) / b(26339, 7678955157537409886L) + 1L;
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

                     R.unlock();
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

      R.unlock();
   }

   public long M(int var1) {
      long var2 = (long)(this.i[var1] & a(14828, 3223381710762348876L));
      var2 |= (long)(this.i[var1 + 1] << a(18481, 8325728160593731733L)) & b(26165, 8030282212614261637L);
      var2 |= (long)(this.i[var1 + 2] << a(24260, 7412995842788718177L)) & b(25622, 8048238410777741737L);
      return var2 | (long)(this.i[var1 + 3] << a(31883, 3030968669311325220L)) & b(25497, 8699545119522049569L);
   }

   public long f(int var1) {
      long var2 = (long)(this.i[var1] & a(20299, 7138310426090170342L));
      var2 |= (long)(this.i[var1 + 1] << a(27782, 7708190420057408545L) & a(32053, 1488828853466650003L));
      return var2 | (long)(this.i[var1 + 2] << a(12091, 7044446676016924569L) & a(24950, 4957810942667737557L));
   }

   public Co4 k(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Co4.n ()Ljava/lang/String;
      // 003: lconst_0
      // 004: lstore 4
      // 006: astore 3
      // 007: aload 0
      // 008: getfield com/finalshell/core/Ip6.a J
      // 00b: lstore 6
      // 00d: lconst_0
      // 00e: lstore 8
      // 010: lload 4
      // 012: lload 6
      // 014: lcmp
      // 015: ifgt 111
      // 018: lload 4
      // 01a: lload 6
      // 01c: ladd
      // 01d: bipush 1
      // 01e: lushr
      // 01f: lstore 8
      // 021: aload 0
      // 022: aload 0
      // 023: getfield com/finalshell/core/Ip6.N J
      // 026: lload 8
      // 028: lconst_1
      // 029: lsub
      // 02a: sipush 30745
      // 02d: ldc2_w 1484632164805662127
      // 030: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 033: lmul
      // 034: ladd
      // 035: l2i
      // 036: invokespecial com/finalshell/core/Ip6.M (I)J
      // 039: lstore 10
      // 03b: aload 0
      // 03c: aload 0
      // 03d: getfield com/finalshell/core/Ip6.N J
      // 040: lload 8
      // 042: sipush 26339
      // 045: ldc2_w 7678955157537409886
      // 048: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 04b: lmul
      // 04c: ladd
      // 04d: l2i
      // 04e: invokespecial com/finalshell/core/Ip6.M (I)J
      // 051: lstore 12
      // 053: lload 10
      // 055: lload 1
      // 056: lcmp
      // 057: aload 3
      // 058: ifnonnull 0cf
      // 05b: ifgt 0cb
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: lload 1
      // 066: lload 12
      // 068: lcmp
      // 069: aload 3
      // 06a: ifnonnull 0cf
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: ifge 0cb
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: aload 0
      // 07f: aload 0
      // 080: aload 0
      // 081: getfield com/finalshell/core/Ip6.N J
      // 084: lload 8
      // 086: lconst_1
      // 087: lsub
      // 088: sipush 26339
      // 08b: ldc2_w 7678955157537409886
      // 08e: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 091: lmul
      // 092: ladd
      // 093: bipush 5
      // 094: ldc2_w 9031695613097717170
      // 097: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 09a: ladd
      // 09b: l2i
      // 09c: invokespecial com/finalshell/core/Ip6.f (I)J
      // 09f: l2i
      // 0a0: aload 0
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/core/Ip6.N J
      // 0a5: lload 8
      // 0a7: lconst_1
      // 0a8: lsub
      // 0a9: sipush 26339
      // 0ac: ldc2_w 7678955157537409886
      // 0af: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 0b2: lmul
      // 0b3: ladd
      // 0b4: sipush 3430
      // 0b7: ldc2_w 9195321388771254487
      // 0ba: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 0bd: ladd
      // 0be: l2i
      // 0bf: invokespecial com/finalshell/core/Ip6.f (I)J
      // 0c2: l2i
      // 0c3: invokespecial com/finalshell/core/Ip6.C (II)Lcom/finalshell/core/Co4;
      // 0c6: areturn
      // 0c7: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: lload 1
      // 0cc: lload 10
      // 0ce: lcmp
      // 0cf: aload 3
      // 0d0: ifnonnull 0fd
      // 0d3: ifle 0e7
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: lload 8
      // 0df: lconst_1
      // 0e0: ladd
      // 0e1: lstore 4
      // 0e3: aload 3
      // 0e4: ifnull 10d
      // 0e7: lload 1
      // 0e8: lload 10
      // 0ea: aload 3
      // 0eb: ifnonnull 10a
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: lcmp
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: ifge 10d
      // 100: lload 8
      // 102: lconst_1
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: lsub
      // 10b: lstore 6
      // 10d: aload 3
      // 10e: ifnull 010
      // 111: aconst_null
      // 112: areturn
   }

   public Co4 v(String var1) {
      long var2 = s(var1);
      R.lock();

      Co4 var4;
      try {
         var4 = this.k(var2);
      } finally {
         R.unlock();
      }

      return var4;
   }

   public Co4 C(int var1, int var2) {
      Co4 var3 = new Co4();

      try {
         var3.e = this.B(var1);
         var3.x = this.B(var2);
         return var3;
      } catch (Exception var5) {
         return null;
      }
   }

   public String B(int var1) {
      byte[] var4 = new byte[a(31395, 9142221259539960333L)];
      String var10000 = Co4.n();
      int var5 = 0;
      int var3 = var1 + 1;
      var4[var5] = this.i[var1];
      String var2 = var10000;

      while (var4[var5] != 0) {
         var5++;
         var4[var5] = this.i[var3++];
         if (var2 != null) {
            break;
         }
      }

      try {
         return new String(var4, 0, var5, a(10175, 16877));
      } catch (UnsupportedEncodingException var7) {
         return new String("");
      }
   }

   public static long s(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Co4.n ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 10173
      // 1a: sipush 13679
      // 1d: invokestatic com/finalshell/core/Ip6.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/Ip6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: sipush 10172
      // 2c: sipush 1014
      // 2f: invokestatic com/finalshell/core/Ip6.a (II)Ljava/lang/String;
      // 32: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 35: astore 2
      // 36: aload 2
      // 37: bipush 0
      // 38: aaload
      // 39: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 3c: sipush 30582
      // 3f: ldc2_w 4444391853501110991
      // 42: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 45: land
      // 46: sipush 12449
      // 49: ldc2_w 2027589126606985229
      // 4c: invokestatic com/finalshell/core/Ip6.a (IJ)I
      // 4f: lshl
      // 50: sipush 29227
      // 53: ldc2_w 1699530181132246935
      // 56: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 59: land
      // 5a: lstore 3
      // 5b: lload 3
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: aaload
      // 5f: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 62: sipush 25150
      // 65: ldc2_w 7138689974477016960
      // 68: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 6b: land
      // 6c: sipush 24260
      // 6f: ldc2_w 7412995842788718177
      // 72: invokestatic com/finalshell/core/Ip6.a (IJ)I
      // 75: lshl
      // 76: sipush 31993
      // 79: ldc2_w 5532040005086597450
      // 7c: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 7f: land
      // 80: lor
      // 81: lstore 3
      // 82: lload 3
      // 83: aload 2
      // 84: bipush 2
      // 85: aaload
      // 86: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 89: sipush 25150
      // 8c: ldc2_w 7138689974477016960
      // 8f: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // 92: land
      // 93: sipush 18481
      // 96: ldc2_w 8325728160593731733
      // 99: invokestatic com/finalshell/core/Ip6.a (IJ)I
      // 9c: lshl
      // 9d: sipush 25483
      // a0: ldc2_w 6529429953164103217
      // a3: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // a6: land
      // a7: lor
      // a8: lstore 3
      // a9: lload 3
      // aa: aload 2
      // ab: bipush 3
      // ac: aaload
      // ad: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // b0: sipush 25150
      // b3: ldc2_w 7138689974477016960
      // b6: invokestatic com/finalshell/core/Ip6.b (IJ)J
      // b9: land
      // ba: lor
      // bb: lstore 3
      // bc: lload 3
      // bd: lreturn
   }

   public static void main(String[] var0) {
      try {
         Ip6 var1 = new Ip6(a(10168, -29760));
         System.out.println(var1.v(a(10174, 32537)));
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   static File h(Ip6 var0) {
      return var0.V;
   }

   static Long T() {
      return d;
   }

   static Long D(Long var0) {
      d = var0;
      return var0;
   }

   static void p(Ip6 var0) throws Exception {
      var0.F();
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 10172) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 60;
               break;
            case 1:
               var10000 = 185;
               break;
            case 2:
               var10000 = 208;
               break;
            case 3:
               var10000 = 118;
               break;
            case 4:
               var10000 = 57;
               break;
            case 5:
               var10000 = 230;
               break;
            case 6:
               var10000 = 17;
               break;
            case 7:
               var10000 = 127;
               break;
            case 8:
               var10000 = 212;
               break;
            case 9:
               var10000 = 96;
               break;
            case 10:
               var10000 = 149;
               break;
            case 11:
               var10000 = 42;
               break;
            case 12:
               var10000 = 76;
               break;
            case 13:
               var10000 = 181;
               break;
            case 14:
               var10000 = 235;
               break;
            case 15:
               var10000 = 157;
               break;
            case 16:
               var10000 = 30;
               break;
            case 17:
               var10000 = 89;
               break;
            case 18:
               var10000 = 163;
               break;
            case 19:
               var10000 = 201;
               break;
            case 20:
               var10000 = 114;
               break;
            case 21:
               var10000 = 179;
               break;
            case 22:
               var10000 = 251;
               break;
            case 23:
               var10000 = 238;
               break;
            case 24:
               var10000 = 217;
               break;
            case 25:
               var10000 = 15;
               break;
            case 26:
               var10000 = 46;
               break;
            case 27:
               var10000 = 4;
               break;
            case 28:
               var10000 = 182;
               break;
            case 29:
               var10000 = 218;
               break;
            case 30:
               var10000 = 198;
               break;
            case 31:
               var10000 = 159;
               break;
            case 32:
               var10000 = 176;
               break;
            case 33:
               var10000 = 231;
               break;
            case 34:
               var10000 = 206;
               break;
            case 35:
               var10000 = 124;
               break;
            case 36:
               var10000 = 202;
               break;
            case 37:
               var10000 = 136;
               break;
            case 38:
               var10000 = 8;
               break;
            case 39:
               var10000 = 28;
               break;
            case 40:
               var10000 = 203;
               break;
            case 41:
               var10000 = 51;
               break;
            case 42:
               var10000 = 249;
               break;
            case 43:
               var10000 = 111;
               break;
            case 44:
               var10000 = 33;
               break;
            case 45:
               var10000 = 246;
               break;
            case 46:
               var10000 = 41;
               break;
            case 47:
               var10000 = 34;
               break;
            case 48:
               var10000 = 141;
               break;
            case 49:
               var10000 = 170;
               break;
            case 50:
               var10000 = 1;
               break;
            case 51:
               var10000 = 209;
               break;
            case 52:
               var10000 = 162;
               break;
            case 53:
               var10000 = 93;
               break;
            case 54:
               var10000 = 11;
               break;
            case 55:
               var10000 = 131;
               break;
            case 56:
               var10000 = 234;
               break;
            case 57:
               var10000 = 166;
               break;
            case 58:
               var10000 = 186;
               break;
            case 59:
               var10000 = 21;
               break;
            case 60:
               var10000 = 64;
               break;
            case 61:
               var10000 = 129;
               break;
            case 62:
               var10000 = 139;
               break;
            case 63:
               var10000 = 90;
               break;
            case 64:
               var10000 = 14;
               break;
            case 65:
               var10000 = 68;
               break;
            case 66:
               var10000 = 221;
               break;
            case 67:
               var10000 = 132;
               break;
            case 68:
               var10000 = 20;
               break;
            case 69:
               var10000 = 248;
               break;
            case 70:
               var10000 = 146;
               break;
            case 71:
               var10000 = 59;
               break;
            case 72:
               var10000 = 5;
               break;
            case 73:
               var10000 = 178;
               break;
            case 74:
               var10000 = 63;
               break;
            case 75:
               var10000 = 81;
               break;
            case 76:
               var10000 = 7;
               break;
            case 77:
               var10000 = 110;
               break;
            case 78:
               var10000 = 236;
               break;
            case 79:
               var10000 = 113;
               break;
            case 80:
               var10000 = 91;
               break;
            case 81:
               var10000 = 224;
               break;
            case 82:
               var10000 = 116;
               break;
            case 83:
               var10000 = 191;
               break;
            case 84:
               var10000 = 61;
               break;
            case 85:
               var10000 = 66;
               break;
            case 86:
               var10000 = 67;
               break;
            case 87:
               var10000 = 253;
               break;
            case 88:
               var10000 = 79;
               break;
            case 89:
               var10000 = 32;
               break;
            case 90:
               var10000 = 240;
               break;
            case 91:
               var10000 = 121;
               break;
            case 92:
               var10000 = 184;
               break;
            case 93:
               var10000 = 211;
               break;
            case 94:
               var10000 = 36;
               break;
            case 95:
               var10000 = 40;
               break;
            case 96:
               var10000 = 54;
               break;
            case 97:
               var10000 = 35;
               break;
            case 98:
               var10000 = 123;
               break;
            case 99:
               var10000 = 140;
               break;
            case 100:
               var10000 = 27;
               break;
            case 101:
               var10000 = 97;
               break;
            case 102:
               var10000 = 115;
               break;
            case 103:
               var10000 = 228;
               break;
            case 104:
               var10000 = 56;
               break;
            case 105:
               var10000 = 158;
               break;
            case 106:
               var10000 = 143;
               break;
            case 107:
               var10000 = 171;
               break;
            case 108:
               var10000 = 99;
               break;
            case 109:
               var10000 = 138;
               break;
            case 110:
               var10000 = 47;
               break;
            case 111:
               var10000 = 175;
               break;
            case 112:
               var10000 = 195;
               break;
            case 113:
               var10000 = 168;
               break;
            case 114:
               var10000 = 122;
               break;
            case 115:
               var10000 = 53;
               break;
            case 116:
               var10000 = 18;
               break;
            case 117:
               var10000 = 44;
               break;
            case 118:
               var10000 = 167;
               break;
            case 119:
               var10000 = 24;
               break;
            case 120:
               var10000 = 237;
               break;
            case 121:
               var10000 = 107;
               break;
            case 122:
               var10000 = 188;
               break;
            case 123:
               var10000 = 31;
               break;
            case 124:
               var10000 = 194;
               break;
            case 125:
               var10000 = 148;
               break;
            case 126:
               var10000 = 244;
               break;
            case 127:
               var10000 = 137;
               break;
            case 128:
               var10000 = 225;
               break;
            case 129:
               var10000 = 227;
               break;
            case 130:
               var10000 = 145;
               break;
            case 131:
               var10000 = 133;
               break;
            case 132:
               var10000 = 80;
               break;
            case 133:
               var10000 = 128;
               break;
            case 134:
               var10000 = 62;
               break;
            case 135:
               var10000 = 2;
               break;
            case 136:
               var10000 = 86;
               break;
            case 137:
               var10000 = 71;
               break;
            case 138:
               var10000 = 197;
               break;
            case 139:
               var10000 = 58;
               break;
            case 140:
               var10000 = 75;
               break;
            case 141:
               var10000 = 84;
               break;
            case 142:
               var10000 = 77;
               break;
            case 143:
               var10000 = 144;
               break;
            case 144:
               var10000 = 23;
               break;
            case 145:
               var10000 = 160;
               break;
            case 146:
               var10000 = 3;
               break;
            case 147:
               var10000 = 10;
               break;
            case 148:
               var10000 = 39;
               break;
            case 149:
               var10000 = 239;
               break;
            case 150:
               var10000 = 94;
               break;
            case 151:
               var10000 = 95;
               break;
            case 152:
               var10000 = 172;
               break;
            case 153:
               var10000 = 83;
               break;
            case 154:
               var10000 = 169;
               break;
            case 155:
               var10000 = 156;
               break;
            case 156:
               var10000 = 192;
               break;
            case 157:
               var10000 = 87;
               break;
            case 158:
               var10000 = 134;
               break;
            case 159:
               var10000 = 38;
               break;
            case 160:
               var10000 = 190;
               break;
            case 161:
               var10000 = 112;
               break;
            case 162:
               var10000 = 204;
               break;
            case 163:
               var10000 = 19;
               break;
            case 164:
               var10000 = 189;
               break;
            case 165:
               var10000 = 242;
               break;
            case 166:
               var10000 = 82;
               break;
            case 167:
               var10000 = 55;
               break;
            case 168:
               var10000 = 187;
               break;
            case 169:
               var10000 = 52;
               break;
            case 170:
               var10000 = 0;
               break;
            case 171:
               var10000 = 22;
               break;
            case 172:
               var10000 = 25;
               break;
            case 173:
               var10000 = 142;
               break;
            case 174:
               var10000 = 74;
               break;
            case 175:
               var10000 = 9;
               break;
            case 176:
               var10000 = 200;
               break;
            case 177:
               var10000 = 216;
               break;
            case 178:
               var10000 = 48;
               break;
            case 179:
               var10000 = 180;
               break;
            case 180:
               var10000 = 119;
               break;
            case 181:
               var10000 = 105;
               break;
            case 182:
               var10000 = 73;
               break;
            case 183:
               var10000 = 120;
               break;
            case 184:
               var10000 = 247;
               break;
            case 185:
               var10000 = 150;
               break;
            case 186:
               var10000 = 245;
               break;
            case 187:
               var10000 = 205;
               break;
            case 188:
               var10000 = 161;
               break;
            case 189:
               var10000 = 210;
               break;
            case 190:
               var10000 = 103;
               break;
            case 191:
               var10000 = 213;
               break;
            case 192:
               var10000 = 214;
               break;
            case 193:
               var10000 = 6;
               break;
            case 194:
               var10000 = 154;
               break;
            case 195:
               var10000 = 241;
               break;
            case 196:
               var10000 = 147;
               break;
            case 197:
               var10000 = 13;
               break;
            case 198:
               var10000 = 98;
               break;
            case 199:
               var10000 = 250;
               break;
            case 200:
               var10000 = 207;
               break;
            case 201:
               var10000 = 164;
               break;
            case 202:
               var10000 = 177;
               break;
            case 203:
               var10000 = 254;
               break;
            case 204:
               var10000 = 29;
               break;
            case 205:
               var10000 = 106;
               break;
            case 206:
               var10000 = 130;
               break;
            case 207:
               var10000 = 43;
               break;
            case 208:
               var10000 = 100;
               break;
            case 209:
               var10000 = 215;
               break;
            case 210:
               var10000 = 222;
               break;
            case 211:
               var10000 = 232;
               break;
            case 212:
               var10000 = 70;
               break;
            case 213:
               var10000 = 109;
               break;
            case 214:
               var10000 = 50;
               break;
            case 215:
               var10000 = 152;
               break;
            case 216:
               var10000 = 233;
               break;
            case 217:
               var10000 = 72;
               break;
            case 218:
               var10000 = 78;
               break;
            case 219:
               var10000 = 223;
               break;
            case 220:
               var10000 = 193;
               break;
            case 221:
               var10000 = 12;
               break;
            case 222:
               var10000 = 173;
               break;
            case 223:
               var10000 = 151;
               break;
            case 224:
               var10000 = 117;
               break;
            case 225:
               var10000 = 65;
               break;
            case 226:
               var10000 = 37;
               break;
            case 227:
               var10000 = 125;
               break;
            case 228:
               var10000 = 126;
               break;
            case 229:
               var10000 = 220;
               break;
            case 230:
               var10000 = 219;
               break;
            case 231:
               var10000 = 174;
               break;
            case 232:
               var10000 = 16;
               break;
            case 233:
               var10000 = 92;
               break;
            case 234:
               var10000 = 102;
               break;
            case 235:
               var10000 = 108;
               break;
            case 236:
               var10000 = 196;
               break;
            case 237:
               var10000 = 104;
               break;
            case 238:
               var10000 = 252;
               break;
            case 239:
               var10000 = 49;
               break;
            case 240:
               var10000 = 45;
               break;
            case 241:
               var10000 = 155;
               break;
            case 242:
               var10000 = 199;
               break;
            case 243:
               var10000 = 243;
               break;
            case 244:
               var10000 = 183;
               break;
            case 245:
               var10000 = 229;
               break;
            case 246:
               var10000 = 135;
               break;
            case 247:
               var10000 = 69;
               break;
            case 248:
               var10000 = 153;
               break;
            case 249:
               var10000 = 85;
               break;
            case 250:
               var10000 = 255;
               break;
            case 251:
               var10000 = 26;
               break;
            case 252:
               var10000 = 165;
               break;
            case 253:
               var10000 = 101;
               break;
            case 254:
               var10000 = 226;
               break;
            default:
               var10000 = 88;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10406;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 11706) & 32767;
      if (h[var3] == null) {
         h[var3] = g[var3] ^ var1;
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[5];
      int var19 = 0;
      String var18 = "\u009b\u009f\u0006Íç丗胍仮穽\r\u0098[Òàæ2wþ\"ëÆêø";
      int var20 = "\u009b\u009f\u0006Íç丗胍仮穽\r\u0098[Òàæ2wþ\"ëÆêø".length();
      char var17 = 2;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 110;
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
                        var84 = 32;
                        break;
                     case 1:
                        var84 = 73;
                        break;
                     case 2:
                        var84 = 64;
                        break;
                     case 3:
                        var84 = 56;
                        break;
                     case 4:
                        var84 = 49;
                        break;
                     case 5:
                        var84 = 88;
                        break;
                     default:
                        var84 = 1;
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
                     b = var21;
                     c = new String[5];
                     long var8 = 2100641318089096732L;
                     long[] var14 = new long[12];
                     int var11 = 0;
                     String var12 = "\b?öÕ\u0013\u000eÔ\u008fà@#yÅ¢:5Û¾á?©\u0092\u009e\u0081\u008eOí\u001cWë\bmû§\"\u0092î\u001eù\u0095¨\u0087¥ùÈ\u008b7É:â¤íXNo¯Åuÿ Ûu-ßÞM©geÒ,\u0091\u001eÒYv\u0006\u0096ª ";
                     int var13 = "\b?öÕ\u0013\u000eÔ\u008fà@#yÅ¢:5Û¾á?©\u0092\u009e\u0081\u008eOí\u001cWë\bmû§\"\u0092î\u001eù\u0095¨\u0087¥ùÈ\u008b7É:â¤íXNo¯Åuÿ Ûu-ßÞM©geÒ,\u0091\u001eÒYv\u0006\u0096ª "
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
                                    e = var14;
                                    f = new Integer[12];
                                    long var0 = 5819792364533243225L;
                                    long[] var6 = new long[14];
                                    int var3 = 0;
                                    String var4 = "\nY? \u009a¬lh>E\u0003\u001d \u0091}C(~ðcy\u0010\u0093xmi¨\u0085Ì\u001a\u0007i3Õ¶ç°Ð\u0092&?u\u0018c\\x\u0014ðGQÿã.ù\u0082Î:U/UÁ£\u0016\rK)\u009a\u0097V¶\u008aZ\u001c\u0001ÏA0\u0018\f\u0013?µErc\u008aéÜ/XVG§Ëý\u0089";
                                    int var5 = "\nY? \u009a¬lh>E\u0003\u001d \u0091}C(~ðcy\u0010\u0093xmi¨\u0085Ì\u001a\u0007i3Õ¶ç°Ð\u0092&?u\u0018c\\x\u0014ðGQÿã.ù\u0082Î:U/UÁ£\u0016\rK)\u009a\u0097V¶\u008aZ\u001c\u0001ÏA0\u0018\f\u0013?µErc\u008aéÜ/XVG§Ëý\u0089"
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
                                                   h = new Long[14];
                                                   R = new ReentrantLock();
                                                   d = 0L;
                                                   Q = false;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "D^wD¯Ô\u0088ü-\u0093\t\u001cÈ¬pï";
                                                var5 = "D^wD¯Ô\u0088ü-\u0093\t\u001cÈ¬pï".length();
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

                                 var12 = "¡P\b±Dïæ\t\u008d\u0083°á6§\u0019\u0005";
                                 var13 = "¡P\b±Dïæ\t\u008d\u0083°á6§\u0019\u0005".length();
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

                  var18 = "Ò\u0012©\bßjv´Õ¡DÐ";
                  var20 = "Ò\u0012©\bßjv´Õ¡DÐ".length();
                  var17 = 3;
                  var26 = -1;
            }

            var10000 = 88;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}






