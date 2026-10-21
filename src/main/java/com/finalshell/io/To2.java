package com.finalshell.io;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.OC;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

public class To2 extends InputStream {
   InputStream p;
   LinkedList K = new LinkedList();
   int y = a(16070, 121829457104035969L);
   byte[] d;
   boolean H = false;
   boolean o = false;
   byte[] n = null;
   int r = 0;
   int Z = 0;
   public static int e;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public To2(InputStream var1) {
      this.p = var1;
   }

   @Override
   public int read() throws IOException {
      int var10000 = L();
      int var2 = this.p.read();
      int var1 = var10000;
      this.K.add((byte)var2);

      while (this.K.size() > this.y) {
         this.K.remove(0);
         if (var1 == 0) {
            break;
         }
      }

      return var2;
   }

   @Override
   public int read(byte[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/io/To2.L ()I
      // 003: aload 0
      // 004: dup
      // 005: getfield com/finalshell/io/To2.Z I
      // 008: bipush 1
      // 009: iadd
      // 00a: putfield com/finalshell/io/To2.Z I
      // 00d: invokestatic java/lang/System.currentTimeMillis ()J
      // 010: lstore 5
      // 012: istore 4
      // 014: bipush 0
      // 015: istore 7
      // 017: aload 0
      // 018: getfield com/finalshell/io/To2.o Z
      // 01b: iload 4
      // 01d: ifeq 04b
      // 020: ifne 03b
      // 023: goto 02a
      // 026: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield com/finalshell/io/To2.p Ljava/io/InputStream;
      // 02e: aload 1
      // 02f: iload 2
      // 030: iload 3
      // 031: invokevirtual java/io/InputStream.read ([BII)I
      // 034: istore 7
      // 036: iload 4
      // 038: ifne 062
      // 03b: aload 1
      // 03c: arraylength
      // 03d: aload 0
      // 03e: getfield com/finalshell/io/To2.r I
      // 041: invokestatic java/lang/Math.min (II)I
      // 044: goto 04b
      // 047: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 04a: athrow
      // 04b: istore 8
      // 04d: iload 8
      // 04f: istore 7
      // 051: aload 0
      // 052: getfield com/finalshell/io/To2.n [B
      // 055: bipush 0
      // 056: aload 1
      // 057: iload 2
      // 058: iload 8
      // 05a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 05d: aload 0
      // 05e: bipush 0
      // 05f: putfield com/finalshell/io/To2.o Z
      // 062: iload 7
      // 064: iload 4
      // 066: ifeq 083
      // 069: ifge 082
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 072: athrow
      // 073: new java/io/IOException
      // 076: dup
      // 077: getstatic com/finalshell/io/To2.a Ljava/lang/String;
      // 07a: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 07d: athrow
      // 07e: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 081: athrow
      // 082: iload 2
      // 083: istore 8
      // 085: iload 8
      // 087: iload 2
      // 088: iload 7
      // 08a: iadd
      // 08b: if_icmpge 0e9
      // 08e: aload 0
      // 08f: getfield com/finalshell/io/To2.H Z
      // 092: iload 4
      // 094: ifeq 0ca
      // 097: ifne 0e9
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/io/To2.K Ljava/util/LinkedList;
      // 0a5: aload 1
      // 0a6: iload 8
      // 0a8: baload
      // 0a9: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 0ac: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 0af: pop
      // 0b0: iload 4
      // 0b2: ifeq 0e4
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: getfield com/finalshell/io/To2.K Ljava/util/LinkedList;
      // 0c0: invokevirtual java/util/LinkedList.size ()I
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield com/finalshell/io/To2.y I
      // 0ce: if_icmple 0e1
      // 0d1: aload 0
      // 0d2: getfield com/finalshell/io/To2.K Ljava/util/LinkedList;
      // 0d5: bipush 0
      // 0d6: invokevirtual java/util/LinkedList.remove (I)Ljava/lang/Object;
      // 0d9: pop
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e0: athrow
      // 0e1: iinc 8 1
      // 0e4: iload 4
      // 0e6: ifne 085
      // 0e9: new java/lang/String
      // 0ec: dup
      // 0ed: aload 1
      // 0ee: bipush 0
      // 0ef: iload 7
      // 0f1: invokespecial java/lang/String.<init> ([BII)V
      // 0f4: astore 8
      // 0f6: aload 0
      // 0f7: dup
      // 0f8: getfield com/finalshell/io/To2.Z I
      // 0fb: bipush 1
      // 0fc: isub
      // 0fd: putfield com/finalshell/io/To2.Z I
      // 100: iload 7
      // 102: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 105: ifnull 117
      // 108: iinc 4 1
      // 10b: iload 4
      // 10d: invokestatic com/finalshell/io/To2.J (I)V
      // 110: goto 117
      // 113: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 116: athrow
      // 117: ireturn
   }

   public synchronized void F(byte[] var1, int var2) throws IOException {
      this.o = true;
      this.n = var1;
      this.r = var2;
   }

   public synchronized boolean W() {
      int var10000 = T();
      this.H = true;
      int var1 = var10000;
      byte var2 = 0;
      this.d = null;
      int[] var3 = new int[this.K.size()];
      char[] var4 = new char[this.K.size()];
      int var5 = 0;

      while (true) {
         if (var5 < this.K.size()) {
            var3[var5] = (Byte)this.K.get(var5);
            var4[var5] = (char)(var3[var5] & a(31051, 9034177086857815821L));
            var5++;
            if (var1 != 0) {
               break;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var5 = var3.length;
         break;
      }

      int var6 = this.K.size() - 1;

      while (true) {
         label61:
         if (var6 > 0) {
            int var8 = var3[var6];
            if (var1 == 0) {
               var10000 = var8;
               if (var1 != 0) {
                  break;
               }

               label39:
               if (var8 == a(12231, 3316081648401183106L)) {
                  label78: {
                     var10000 = var3[var6 - 1];
                     int var10001 = a(4106, 1028480774944214602L);
                     if (var1 == 0) {
                        if (var10000 != var10001) {
                           break label39;
                        }

                        var10000 = var3[var6 - 2];
                        if (var1 != 0) {
                           break label78;
                        }

                        var10001 = a(8759, 2728284761479838835L);
                     }

                     if (var10000 != var10001) {
                        break label39;
                     }

                     boolean var16 = true;
                  }

                  byte var10 = 5;
                  int var11 = this.K.size() - var6 + var10;
                  this.d = new byte[var11];
                  int var12 = 0;

                  while (true) {
                     if (var12 < var11) {
                        this.d[var12] = (Byte)this.K.get(var6 + var12 - var10);
                        var12++;
                        if (var1 != 0) {
                           break;
                        }

                        if (var1 == 0) {
                           continue;
                        }
                     }

                     var2 = 1;
                     break;
                  }

                  if (var1 == 0) {
                     break label61;
                  }
               }

               var6--;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000 != 0;
   }

   public boolean z() {
      return this.H;
   }

   public void U(boolean var1) {
      this.H = var1;
   }

   @Override
   public void close() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/io/To2.L ()I
      // 03: aload 0
      // 04: invokespecial java/io/InputStream.close ()V
      // 07: istore 1
      // 08: aload 0
      // 09: iload 1
      // 0a: ifeq 29
      // 0d: getfield com/finalshell/io/To2.p Ljava/io/InputStream;
      // 10: ifnull 28
      // 13: goto 1a
      // 16: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield com/finalshell/io/To2.p Ljava/io/InputStream;
      // 1e: invokevirtual java/io/InputStream.close ()V
      // 21: goto 28
      // 24: invokestatic com/finalshell/io/To2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual com/finalshell/io/To2.H ()V
      // 2c: return
   }

   public byte[] P() {
      return this.d;
   }

   public void F(byte[] var1) {
      this.d = var1;
   }

   public void v() {
      this.p = null;
      this.K = null;
      this.d = null;
      this.n = null;
   }

   public void H() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new OC(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public static void J(int var0) {
      e = var0;
   }

   public static int T() {
      return e;
   }

   public static int L() {
      int var0 = T();
      return var0 == 0 ? 13 : 0;
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24132;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (T() != 0) {
         J(105);
      }

      char[] var10003 = ")\u001d \u0003@H>".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 114;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 114;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 40;
               break;
            case 1:
               var50 = 1;
               break;
            case 2:
               var50 = 59;
               break;
            case 3:
               var50 = 81;
               break;
            case 4:
               var50 = 87;
               break;
            case 5:
               var50 = 84;
               break;
            default:
               var50 = 40;
         }
      } else {
         var34 = 114;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 6645581271512354221L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "QÓT\"ðfqô\u008ebÏë}_|7èNA¡âYª_";
            int var13 = "QÓT\"ðfqô\u008ebÏë}_|7èNA¡âYª_".length();
            byte var10 = 0;

            label75:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label75;
                        }

                        var12 = "\u008cÝ[Ò\u000f¦é,ÚÞØò6¥ÃÍ";
                        var13 = "\u008cÝ[Ò\u000f¦é,ÚÞØò6¥ÃÍ".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 114;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 40;
               break;
            case 1:
               var50 = 1;
               break;
            case 2:
               var50 = 59;
               break;
            case 3:
               var50 = 81;
               break;
            case 4:
               var50 = 87;
               break;
            case 5:
               var50 = 84;
               break;
            default:
               var50 = 40;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 40;
                  break;
               case 1:
                  var50 = 1;
                  break;
               case 2:
                  var50 = 59;
                  break;
               case 3:
                  var50 = 81;
                  break;
               case 4:
                  var50 = 87;
                  break;
               case 5:
                  var50 = 84;
                  break;
               default:
                  var50 = 40;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 6645581271512354221L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "QÓT\"ðfqô\u008ebÏë}_|7èNA¡âYª_";
               int var5 = "QÓT\"ðfqô\u008ebÏë}_|7èNA¡âYª_".length();
               byte var2 = 0;

               label40:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label40;
                           }

                           var4 = "\u008cÝ[Ò\u000f¦é,ÚÞØò6¥ÃÍ";
                           var5 = "\u008cÝ[Ò\u000f¦é,ÚÞØò6¥ÃÍ".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 40;
                  break;
               case 1:
                  var50 = 1;
                  break;
               case 2:
                  var50 = 59;
                  break;
               case 3:
                  var50 = 81;
                  break;
               case 4:
                  var50 = 87;
                  break;
               case 5:
                  var50 = 84;
                  break;
               default:
                  var50 = 40;
            }
         }
      }
   }
}





