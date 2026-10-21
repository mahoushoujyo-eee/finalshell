package com.finalshell.core;

import com.finalshell.io.YM3;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Ze2 extends ZS implements Ak2, X4, FW {
   public static Ze2 q;
   public DatatypeFactory A;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long e;

   @Override
   public void q(NL3 var1, Object var2, DL3 var3) throws IOException {
      SimpleDateFormat var12;
      String var10000 = Nv4.o();
      YM3 var5 = var1.w;
      String var4 = var10000;
      String var6 = var3.Y();
      Calendar var7 = (Calendar)var2;
      if (var6.equals(a(12855, -31174))) {
         long var11 = var7.getTimeInMillis() / e;
         var5.v((int)var11);
      } else {
         SimpleDateFormat var8 = new SimpleDateFormat(var6);

         label23: {
            label22: {
               try {
                  var12 = var8;
                  if (var4 == null) {
                     break label23;
                  }

                  if (var8 != null) {
                     break label22;
                  }
               } catch (IOException var10) {
                  throw new RuntimeException(a(var10));
               }

               var8 = new SimpleDateFormat(Ok2.z, var1.y);
            }

            var8.setTimeZone(var1.D);
            var12 = var8;
         }

         String var9 = var12.format(var7.getTime());
         var5.y(var9);
      }
   }

   @Override
   public void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 1
      // 004: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 007: astore 7
      // 009: astore 6
      // 00b: aload 2
      // 00c: aload 6
      // 00e: ifnull 026
      // 011: ifnonnull 025
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 7
      // 01d: invokevirtual com/finalshell/io/YM3.Y ()V
      // 020: return
      // 021: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 2
      // 026: aload 6
      // 028: ifnull 04e
      // 02b: instanceof javax/xml/datatype/XMLGregorianCalendar
      // 02e: ifeq 046
      // 031: goto 038
      // 034: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: aload 2
      // 039: checkcast javax/xml/datatype/XMLGregorianCalendar
      // 03c: invokevirtual javax/xml/datatype/XMLGregorianCalendar.toGregorianCalendar ()Ljava/util/GregorianCalendar;
      // 03f: astore 8
      // 041: aload 6
      // 043: ifnonnull 053
      // 046: aload 2
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: checkcast java/util/Calendar
      // 051: astore 8
      // 053: aload 7
      // 055: getstatic com/finalshell/ui/model/EP.UseISO8601DateFormat Lcom/finalshell/ui/model/EP;
      // 058: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 05b: aload 6
      // 05d: ifnull 079
      // 060: ifeq 3fc
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: aload 7
      // 06c: getstatic com/finalshell/ui/model/EP.UseSingleQuotes Lcom/finalshell/ui/model/EP;
      // 06f: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: aload 6
      // 07b: ifnull 091
      // 07e: ifeq 094
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: sipush 3174
      // 08b: ldc2_w 3842751412058144222
      // 08e: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 091: goto 09d
      // 094: sipush 8703
      // 097: ldc2_w 788688840070074452
      // 09a: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 09d: istore 9
      // 09f: aload 7
      // 0a1: iload 9
      // 0a3: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 0a6: pop
      // 0a7: aload 8
      // 0a9: bipush 1
      // 0aa: invokevirtual java/util/Calendar.get (I)I
      // 0ad: istore 10
      // 0af: aload 8
      // 0b1: bipush 2
      // 0b2: invokevirtual java/util/Calendar.get (I)I
      // 0b5: bipush 1
      // 0b6: iadd
      // 0b7: istore 11
      // 0b9: aload 8
      // 0bb: bipush 5
      // 0bc: invokevirtual java/util/Calendar.get (I)I
      // 0bf: istore 12
      // 0c1: aload 8
      // 0c3: sipush 28227
      // 0c6: ldc2_w 2437713501972848610
      // 0c9: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 0cc: invokevirtual java/util/Calendar.get (I)I
      // 0cf: istore 13
      // 0d1: aload 8
      // 0d3: sipush 16923
      // 0d6: ldc2_w 6341703243721798591
      // 0d9: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 0dc: invokevirtual java/util/Calendar.get (I)I
      // 0df: istore 14
      // 0e1: aload 8
      // 0e3: sipush 18224
      // 0e6: ldc2_w 1048144820910814863
      // 0e9: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 0ec: invokevirtual java/util/Calendar.get (I)I
      // 0ef: istore 15
      // 0f1: aload 8
      // 0f3: sipush 21596
      // 0f6: ldc2_w 6352406315189102069
      // 0f9: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 0fc: invokevirtual java/util/Calendar.get (I)I
      // 0ff: istore 16
      // 101: iload 16
      // 103: aload 6
      // 105: ifnull 196
      // 108: ifeq 18d
      // 10b: goto 112
      // 10e: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: sipush 12854
      // 115: sipush 24824
      // 118: invokestatic com/finalshell/core/Ze2.a (II)Ljava/lang/String;
      // 11b: invokevirtual java/lang/String.toCharArray ()[C
      // 11e: astore 17
      // 120: iload 16
      // 122: sipush 27991
      // 125: ldc2_w 2370589985359912180
      // 128: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 12b: aload 17
      // 12d: invokestatic com/finalshell/core/S7.E (II[C)V
      // 130: iload 15
      // 132: sipush 18516
      // 135: ldc2_w 784924409312639478
      // 138: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 13b: aload 17
      // 13d: invokestatic com/finalshell/core/S7.E (II[C)V
      // 140: iload 14
      // 142: sipush 17016
      // 145: ldc2_w 4422986372650693597
      // 148: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 14b: aload 17
      // 14d: invokestatic com/finalshell/core/S7.E (II[C)V
      // 150: iload 13
      // 152: sipush 7015
      // 155: ldc2_w 7104211530597018305
      // 158: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 15b: aload 17
      // 15d: invokestatic com/finalshell/core/S7.E (II[C)V
      // 160: iload 12
      // 162: sipush 19600
      // 165: ldc2_w 4598854528839384364
      // 168: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 16b: aload 17
      // 16d: invokestatic com/finalshell/core/S7.E (II[C)V
      // 170: iload 11
      // 172: sipush 3621
      // 175: ldc2_w 7893514789669584776
      // 178: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 17b: aload 17
      // 17d: invokestatic com/finalshell/core/S7.E (II[C)V
      // 180: iload 10
      // 182: bipush 4
      // 183: aload 17
      // 185: invokestatic com/finalshell/core/S7.E (II[C)V
      // 188: aload 6
      // 18a: ifnonnull 25c
      // 18d: iload 15
      // 18f: goto 196
      // 192: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: aload 6
      // 198: ifnull 1a7
      // 19b: ifne 1f6
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: iload 14
      // 1a7: aload 6
      // 1a9: ifnull 1b8
      // 1ac: ifne 1f6
      // 1af: goto 1b6
      // 1b2: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: iload 13
      // 1b8: ifne 1f6
      // 1bb: sipush 12850
      // 1be: sipush 30560
      // 1c1: invokestatic com/finalshell/core/Ze2.a (II)Ljava/lang/String;
      // 1c4: invokevirtual java/lang/String.toCharArray ()[C
      // 1c7: astore 17
      // 1c9: iload 12
      // 1cb: sipush 15789
      // 1ce: ldc2_w 7962656950288878612
      // 1d1: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 1d4: aload 17
      // 1d6: invokestatic com/finalshell/core/S7.E (II[C)V
      // 1d9: iload 11
      // 1db: sipush 8486
      // 1de: ldc2_w 6910174653932376209
      // 1e1: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 1e4: aload 17
      // 1e6: invokestatic com/finalshell/core/S7.E (II[C)V
      // 1e9: iload 10
      // 1eb: bipush 4
      // 1ec: aload 17
      // 1ee: invokestatic com/finalshell/core/S7.E (II[C)V
      // 1f1: aload 6
      // 1f3: ifnonnull 25c
      // 1f6: sipush 12851
      // 1f9: sipush -18045
      // 1fc: invokestatic com/finalshell/core/Ze2.a (II)Ljava/lang/String;
      // 1ff: invokevirtual java/lang/String.toCharArray ()[C
      // 202: astore 17
      // 204: iload 15
      // 206: sipush 21428
      // 209: ldc2_w 5004125225588548122
      // 20c: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 20f: aload 17
      // 211: invokestatic com/finalshell/core/S7.E (II[C)V
      // 214: iload 14
      // 216: sipush 28179
      // 219: ldc2_w 1607260472729509
      // 21c: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 21f: aload 17
      // 221: invokestatic com/finalshell/core/S7.E (II[C)V
      // 224: iload 13
      // 226: sipush 7015
      // 229: ldc2_w 7104211530597018305
      // 22c: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 22f: aload 17
      // 231: invokestatic com/finalshell/core/S7.E (II[C)V
      // 234: iload 12
      // 236: sipush 15789
      // 239: ldc2_w 7962656950288878612
      // 23c: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 23f: aload 17
      // 241: invokestatic com/finalshell/core/S7.E (II[C)V
      // 244: iload 11
      // 246: sipush 8486
      // 249: ldc2_w 6910174653932376209
      // 24c: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 24f: aload 17
      // 251: invokestatic com/finalshell/core/S7.E (II[C)V
      // 254: iload 10
      // 256: bipush 4
      // 257: aload 17
      // 259: invokestatic com/finalshell/core/S7.E (II[C)V
      // 25c: aload 7
      // 25e: aload 17
      // 260: invokevirtual com/finalshell/io/YM3.write ([C)V
      // 263: aload 8
      // 265: invokevirtual java/util/Calendar.getTimeZone ()Ljava/util/TimeZone;
      // 268: aload 8
      // 26a: invokevirtual java/util/Calendar.getTimeInMillis ()J
      // 26d: invokevirtual java/util/TimeZone.getOffset (J)I
      // 270: i2f
      // 271: ldc 3600000.0
      // 273: fdiv
      // 274: fstore 18
      // 276: fload 18
      // 278: f2i
      // 279: istore 19
      // 27b: iload 19
      // 27d: i2d
      // 27e: dconst_0
      // 27f: dcmpl
      // 280: aload 6
      // 282: ifnull 2b2
      // 285: ifne 2a9
      // 288: goto 28f
      // 28b: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28e: athrow
      // 28f: aload 7
      // 291: sipush 2960
      // 294: ldc2_w 6812751915835931179
      // 297: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 29a: invokevirtual com/finalshell/io/YM3.write (I)V
      // 29d: aload 6
      // 29f: ifnonnull 3ef
      // 2a2: goto 2a9
      // 2a5: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a8: athrow
      // 2a9: iload 19
      // 2ab: goto 2b2
      // 2ae: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b1: athrow
      // 2b2: aload 6
      // 2b4: ifnull 2f4
      // 2b7: sipush 12582
      // 2ba: ldc2_w 3860936313574949020
      // 2bd: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 2c0: if_icmple 2eb
      // 2c3: goto 2ca
      // 2c6: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: aload 7
      // 2cc: sipush 5692
      // 2cf: ldc2_w 9038166043213997979
      // 2d2: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 2d5: invokevirtual com/finalshell/io/YM3.write (I)V
      // 2d8: aload 7
      // 2da: iload 19
      // 2dc: invokevirtual com/finalshell/io/YM3.v (I)V
      // 2df: aload 6
      // 2e1: ifnonnull 3b7
      // 2e4: goto 2eb
      // 2e7: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ea: athrow
      // 2eb: iload 19
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: aload 6
      // 2f6: ifnull 33b
      // 2f9: ifle 332
      // 2fc: goto 303
      // 2ff: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 302: athrow
      // 303: aload 7
      // 305: sipush 30483
      // 308: ldc2_w 8604320641869792955
      // 30b: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 30e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 311: aload 7
      // 313: sipush 13468
      // 316: ldc2_w 5271296353961411891
      // 319: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 31c: invokevirtual com/finalshell/io/YM3.write (I)V
      // 31f: aload 7
      // 321: iload 19
      // 323: invokevirtual com/finalshell/io/YM3.v (I)V
      // 326: aload 6
      // 328: ifnonnull 3b7
      // 32b: goto 332
      // 32e: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 331: athrow
      // 332: iload 19
      // 334: goto 33b
      // 337: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33a: athrow
      // 33b: aload 6
      // 33d: ifnull 37d
      // 340: sipush 4672
      // 343: ldc2_w 2575282723727451104
      // 346: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 349: if_icmpge 374
      // 34c: goto 353
      // 34f: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 352: athrow
      // 353: aload 7
      // 355: sipush 472
      // 358: ldc2_w 6181154099383873638
      // 35b: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 35e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 361: aload 7
      // 363: iload 19
      // 365: invokevirtual com/finalshell/io/YM3.v (I)V
      // 368: aload 6
      // 36a: ifnonnull 3b7
      // 36d: goto 374
      // 370: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 373: athrow
      // 374: iload 19
      // 376: goto 37d
      // 379: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37c: athrow
      // 37d: aload 6
      // 37f: ifnull 3cf
      // 382: ifge 3b7
      // 385: goto 38c
      // 388: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38b: athrow
      // 38c: aload 7
      // 38e: sipush 13106
      // 391: ldc2_w 8055244677628658334
      // 394: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 397: invokevirtual com/finalshell/io/YM3.write (I)V
      // 39a: aload 7
      // 39c: sipush 13178
      // 39f: ldc2_w 8411504656064774864
      // 3a2: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 3a5: invokevirtual com/finalshell/io/YM3.write (I)V
      // 3a8: aload 7
      // 3aa: iload 19
      // 3ac: ineg
      // 3ad: invokevirtual com/finalshell/io/YM3.v (I)V
      // 3b0: goto 3b7
      // 3b3: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b6: athrow
      // 3b7: aload 7
      // 3b9: sipush 32288
      // 3bc: ldc2_w 6042960454386667421
      // 3bf: invokestatic com/finalshell/core/Ze2.a (IJ)I
      // 3c2: invokevirtual com/finalshell/io/YM3.write (I)V
      // 3c5: fload 18
      // 3c7: iload 19
      // 3c9: i2f
      // 3ca: fsub
      // 3cb: ldc 60.0
      // 3cd: fmul
      // 3ce: f2i
      // 3cf: istore 20
      // 3d1: aload 7
      // 3d3: sipush 12853
      // 3d6: sipush -7983
      // 3d9: invokestatic com/finalshell/core/Ze2.a (II)Ljava/lang/String;
      // 3dc: bipush 1
      // 3dd: anewarray 228
      // 3e0: dup
      // 3e1: bipush 0
      // 3e2: iload 20
      // 3e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3e7: aastore
      // 3e8: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 3eb: invokevirtual com/finalshell/io/YM3.q (Ljava/lang/CharSequence;)Lcom/finalshell/io/YM3;
      // 3ee: pop
      // 3ef: aload 7
      // 3f1: iload 9
      // 3f3: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 3f6: pop
      // 3f7: aload 6
      // 3f9: ifnonnull 409
      // 3fc: aload 8
      // 3fe: invokevirtual java/util/Calendar.getTime ()Ljava/util/Date;
      // 401: astore 9
      // 403: aload 1
      // 404: aload 9
      // 406: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 409: return
   }

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      return this.p(var1, var2, var3, null, 0);
   }

   @Override
   public Object p(Yn4 param1, Type param2, Object param3, String param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: getstatic com/finalshell/core/ZY.f Lcom/finalshell/core/ZY;
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: aload 4
      // 0b: iload 5
      // 0d: invokevirtual com/finalshell/core/ZY.p (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;
      // 10: astore 7
      // 12: astore 6
      // 14: aload 7
      // 16: aload 6
      // 18: ifnull 31
      // 1b: instanceof java/util/Calendar
      // 1e: ifeq 2f
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 7
      // 2a: areturn
      // 2b: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 7
      // 31: checkcast java/util/Date
      // 34: astore 8
      // 36: aload 8
      // 38: ifnonnull 41
      // 3b: aconst_null
      // 3c: areturn
      // 3d: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 1
      // 42: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 45: astore 9
      // 47: aload 9
      // 49: invokeinterface com/finalshell/core/P7.t ()Ljava/util/TimeZone; 1
      // 4e: aload 9
      // 50: invokeinterface com/finalshell/core/P7.w$Locale ()Ljava/util/Locale; 1
      // 55: invokestatic java/util/Calendar.getInstance (Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;
      // 58: astore 10
      // 5a: aload 10
      // 5c: aload 6
      // 5e: ifnull 83
      // 61: aload 8
      // 63: invokevirtual java/util/Calendar.setTime (Ljava/util/Date;)V
      // 66: aload 2
      // 67: ldc javax/xml/datatype/XMLGregorianCalendar
      // 69: if_acmpne 81
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: aload 0
      // 74: aload 10
      // 76: checkcast java/util/GregorianCalendar
      // 79: invokevirtual com/finalshell/core/Ze2.Z (Ljava/util/Calendar;)Ljavax/xml/datatype/XMLGregorianCalendar;
      // 7c: areturn
      // 7d: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: aload 10
      // 83: areturn
   }

   public XMLGregorianCalendar Z(Calendar param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Ze2.A Ljavax/xml/datatype/DatatypeFactory;
      // 08: aload 2
      // 09: ifnull 3b
      // 0c: ifnonnull 37
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic javax/xml/datatype/DatatypeFactory.newInstance ()Ljavax/xml/datatype/DatatypeFactory;
      // 1a: putfield com/finalshell/core/Ze2.A Ljavax/xml/datatype/DatatypeFactory;
      // 1d: goto 37
      // 20: invokestatic com/finalshell/core/Ze2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: astore 3
      // 25: new java/lang/IllegalStateException
      // 28: dup
      // 29: sipush 12852
      // 2c: sipush 2057
      // 2f: invokestatic com/finalshell/core/Ze2.a (II)Ljava/lang/String;
      // 32: aload 3
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 36: athrow
      // 37: aload 0
      // 38: getfield com/finalshell/core/Ze2.A Ljavax/xml/datatype/DatatypeFactory;
      // 3b: aload 1
      // 3c: checkcast java/util/GregorianCalendar
      // 3f: invokevirtual javax/xml/datatype/DatatypeFactory.newXMLGregorianCalendar (Ljava/util/GregorianCalendar;)Ljavax/xml/datatype/XMLGregorianCalendar;
      // 42: areturn
   }

   @Override
   public int j() {
      return 2;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 12855) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 38;
               break;
            case 1:
               var10000 = 11;
               break;
            case 2:
               var10000 = 168;
               break;
            case 3:
               var10000 = 218;
               break;
            case 4:
               var10000 = 40;
               break;
            case 5:
               var10000 = 65;
               break;
            case 6:
               var10000 = 19;
               break;
            case 7:
               var10000 = 51;
               break;
            case 8:
               var10000 = 226;
               break;
            case 9:
               var10000 = 191;
               break;
            case 10:
               var10000 = 20;
               break;
            case 11:
               var10000 = 111;
               break;
            case 12:
               var10000 = 138;
               break;
            case 13:
               var10000 = 190;
               break;
            case 14:
               var10000 = 16;
               break;
            case 15:
               var10000 = 255;
               break;
            case 16:
               var10000 = 126;
               break;
            case 17:
               var10000 = 124;
               break;
            case 18:
               var10000 = 97;
               break;
            case 19:
               var10000 = 220;
               break;
            case 20:
               var10000 = 193;
               break;
            case 21:
               var10000 = 206;
               break;
            case 22:
               var10000 = 3;
               break;
            case 23:
               var10000 = 81;
               break;
            case 24:
               var10000 = 34;
               break;
            case 25:
               var10000 = 39;
               break;
            case 26:
               var10000 = 246;
               break;
            case 27:
               var10000 = 154;
               break;
            case 28:
               var10000 = 212;
               break;
            case 29:
               var10000 = 80;
               break;
            case 30:
               var10000 = 158;
               break;
            case 31:
               var10000 = 48;
               break;
            case 32:
               var10000 = 2;
               break;
            case 33:
               var10000 = 149;
               break;
            case 34:
               var10000 = 6;
               break;
            case 35:
               var10000 = 223;
               break;
            case 36:
               var10000 = 22;
               break;
            case 37:
               var10000 = 108;
               break;
            case 38:
               var10000 = 28;
               break;
            case 39:
               var10000 = 59;
               break;
            case 40:
               var10000 = 117;
               break;
            case 41:
               var10000 = 135;
               break;
            case 42:
               var10000 = 67;
               break;
            case 43:
               var10000 = 56;
               break;
            case 44:
               var10000 = 105;
               break;
            case 45:
               var10000 = 184;
               break;
            case 46:
               var10000 = 254;
               break;
            case 47:
               var10000 = 222;
               break;
            case 48:
               var10000 = 50;
               break;
            case 49:
               var10000 = 153;
               break;
            case 50:
               var10000 = 26;
               break;
            case 51:
               var10000 = 1;
               break;
            case 52:
               var10000 = 142;
               break;
            case 53:
               var10000 = 93;
               break;
            case 54:
               var10000 = 242;
               break;
            case 55:
               var10000 = 151;
               break;
            case 56:
               var10000 = 157;
               break;
            case 57:
               var10000 = 146;
               break;
            case 58:
               var10000 = 41;
               break;
            case 59:
               var10000 = 188;
               break;
            case 60:
               var10000 = 119;
               break;
            case 61:
               var10000 = 137;
               break;
            case 62:
               var10000 = 45;
               break;
            case 63:
               var10000 = 237;
               break;
            case 64:
               var10000 = 66;
               break;
            case 65:
               var10000 = 187;
               break;
            case 66:
               var10000 = 244;
               break;
            case 67:
               var10000 = 79;
               break;
            case 68:
               var10000 = 73;
               break;
            case 69:
               var10000 = 89;
               break;
            case 70:
               var10000 = 18;
               break;
            case 71:
               var10000 = 201;
               break;
            case 72:
               var10000 = 224;
               break;
            case 73:
               var10000 = 239;
               break;
            case 74:
               var10000 = 221;
               break;
            case 75:
               var10000 = 52;
               break;
            case 76:
               var10000 = 88;
               break;
            case 77:
               var10000 = 162;
               break;
            case 78:
               var10000 = 173;
               break;
            case 79:
               var10000 = 144;
               break;
            case 80:
               var10000 = 21;
               break;
            case 81:
               var10000 = 118;
               break;
            case 82:
               var10000 = 96;
               break;
            case 83:
               var10000 = 210;
               break;
            case 84:
               var10000 = 103;
               break;
            case 85:
               var10000 = 131;
               break;
            case 86:
               var10000 = 225;
               break;
            case 87:
               var10000 = 30;
               break;
            case 88:
               var10000 = 15;
               break;
            case 89:
               var10000 = 53;
               break;
            case 90:
               var10000 = 23;
               break;
            case 91:
               var10000 = 120;
               break;
            case 92:
               var10000 = 229;
               break;
            case 93:
               var10000 = 31;
               break;
            case 94:
               var10000 = 98;
               break;
            case 95:
               var10000 = 197;
               break;
            case 96:
               var10000 = 130;
               break;
            case 97:
               var10000 = 192;
               break;
            case 98:
               var10000 = 234;
               break;
            case 99:
               var10000 = 85;
               break;
            case 100:
               var10000 = 228;
               break;
            case 101:
               var10000 = 74;
               break;
            case 102:
               var10000 = 159;
               break;
            case 103:
               var10000 = 211;
               break;
            case 104:
               var10000 = 32;
               break;
            case 105:
               var10000 = 141;
               break;
            case 106:
               var10000 = 77;
               break;
            case 107:
               var10000 = 167;
               break;
            case 108:
               var10000 = 62;
               break;
            case 109:
               var10000 = 143;
               break;
            case 110:
               var10000 = 128;
               break;
            case 111:
               var10000 = 134;
               break;
            case 112:
               var10000 = 253;
               break;
            case 113:
               var10000 = 37;
               break;
            case 114:
               var10000 = 5;
               break;
            case 115:
               var10000 = 122;
               break;
            case 116:
               var10000 = 240;
               break;
            case 117:
               var10000 = 209;
               break;
            case 118:
               var10000 = 4;
               break;
            case 119:
               var10000 = 61;
               break;
            case 120:
               var10000 = 86;
               break;
            case 121:
               var10000 = 87;
               break;
            case 122:
               var10000 = 129;
               break;
            case 123:
               var10000 = 181;
               break;
            case 124:
               var10000 = 156;
               break;
            case 125:
               var10000 = 227;
               break;
            case 126:
               var10000 = 176;
               break;
            case 127:
               var10000 = 0;
               break;
            case 128:
               var10000 = 94;
               break;
            case 129:
               var10000 = 13;
               break;
            case 130:
               var10000 = 29;
               break;
            case 131:
               var10000 = 33;
               break;
            case 132:
               var10000 = 202;
               break;
            case 133:
               var10000 = 75;
               break;
            case 134:
               var10000 = 217;
               break;
            case 135:
               var10000 = 247;
               break;
            case 136:
               var10000 = 43;
               break;
            case 137:
               var10000 = 186;
               break;
            case 138:
               var10000 = 84;
               break;
            case 139:
               var10000 = 69;
               break;
            case 140:
               var10000 = 183;
               break;
            case 141:
               var10000 = 109;
               break;
            case 142:
               var10000 = 238;
               break;
            case 143:
               var10000 = 83;
               break;
            case 144:
               var10000 = 252;
               break;
            case 145:
               var10000 = 57;
               break;
            case 146:
               var10000 = 185;
               break;
            case 147:
               var10000 = 92;
               break;
            case 148:
               var10000 = 133;
               break;
            case 149:
               var10000 = 42;
               break;
            case 150:
               var10000 = 17;
               break;
            case 151:
               var10000 = 140;
               break;
            case 152:
               var10000 = 102;
               break;
            case 153:
               var10000 = 12;
               break;
            case 154:
               var10000 = 232;
               break;
            case 155:
               var10000 = 68;
               break;
            case 156:
               var10000 = 199;
               break;
            case 157:
               var10000 = 91;
               break;
            case 158:
               var10000 = 24;
               break;
            case 159:
               var10000 = 101;
               break;
            case 160:
               var10000 = 189;
               break;
            case 161:
               var10000 = 214;
               break;
            case 162:
               var10000 = 60;
               break;
            case 163:
               var10000 = 213;
               break;
            case 164:
               var10000 = 216;
               break;
            case 165:
               var10000 = 195;
               break;
            case 166:
               var10000 = 70;
               break;
            case 167:
               var10000 = 49;
               break;
            case 168:
               var10000 = 127;
               break;
            case 169:
               var10000 = 207;
               break;
            case 170:
               var10000 = 63;
               break;
            case 171:
               var10000 = 203;
               break;
            case 172:
               var10000 = 95;
               break;
            case 173:
               var10000 = 194;
               break;
            case 174:
               var10000 = 174;
               break;
            case 175:
               var10000 = 160;
               break;
            case 176:
               var10000 = 245;
               break;
            case 177:
               var10000 = 166;
               break;
            case 178:
               var10000 = 172;
               break;
            case 179:
               var10000 = 208;
               break;
            case 180:
               var10000 = 243;
               break;
            case 181:
               var10000 = 165;
               break;
            case 182:
               var10000 = 236;
               break;
            case 183:
               var10000 = 9;
               break;
            case 184:
               var10000 = 163;
               break;
            case 185:
               var10000 = 110;
               break;
            case 186:
               var10000 = 204;
               break;
            case 187:
               var10000 = 44;
               break;
            case 188:
               var10000 = 180;
               break;
            case 189:
               var10000 = 35;
               break;
            case 190:
               var10000 = 249;
               break;
            case 191:
               var10000 = 104;
               break;
            case 192:
               var10000 = 170;
               break;
            case 193:
               var10000 = 182;
               break;
            case 194:
               var10000 = 58;
               break;
            case 195:
               var10000 = 179;
               break;
            case 196:
               var10000 = 107;
               break;
            case 197:
               var10000 = 116;
               break;
            case 198:
               var10000 = 64;
               break;
            case 199:
               var10000 = 241;
               break;
            case 200:
               var10000 = 10;
               break;
            case 201:
               var10000 = 161;
               break;
            case 202:
               var10000 = 231;
               break;
            case 203:
               var10000 = 36;
               break;
            case 204:
               var10000 = 78;
               break;
            case 205:
               var10000 = 198;
               break;
            case 206:
               var10000 = 230;
               break;
            case 207:
               var10000 = 150;
               break;
            case 208:
               var10000 = 106;
               break;
            case 209:
               var10000 = 46;
               break;
            case 210:
               var10000 = 112;
               break;
            case 211:
               var10000 = 72;
               break;
            case 212:
               var10000 = 205;
               break;
            case 213:
               var10000 = 71;
               break;
            case 214:
               var10000 = 248;
               break;
            case 215:
               var10000 = 219;
               break;
            case 216:
               var10000 = 76;
               break;
            case 217:
               var10000 = 147;
               break;
            case 218:
               var10000 = 99;
               break;
            case 219:
               var10000 = 200;
               break;
            case 220:
               var10000 = 115;
               break;
            case 221:
               var10000 = 100;
               break;
            case 222:
               var10000 = 47;
               break;
            case 223:
               var10000 = 233;
               break;
            case 224:
               var10000 = 121;
               break;
            case 225:
               var10000 = 196;
               break;
            case 226:
               var10000 = 145;
               break;
            case 227:
               var10000 = 27;
               break;
            case 228:
               var10000 = 123;
               break;
            case 229:
               var10000 = 90;
               break;
            case 230:
               var10000 = 148;
               break;
            case 231:
               var10000 = 175;
               break;
            case 232:
               var10000 = 136;
               break;
            case 233:
               var10000 = 171;
               break;
            case 234:
               var10000 = 54;
               break;
            case 235:
               var10000 = 113;
               break;
            case 236:
               var10000 = 8;
               break;
            case 237:
               var10000 = 235;
               break;
            case 238:
               var10000 = 7;
               break;
            case 239:
               var10000 = 25;
               break;
            case 240:
               var10000 = 82;
               break;
            case 241:
               var10000 = 55;
               break;
            case 242:
               var10000 = 14;
               break;
            case 243:
               var10000 = 139;
               break;
            case 244:
               var10000 = 114;
               break;
            case 245:
               var10000 = 155;
               break;
            case 246:
               var10000 = 250;
               break;
            case 247:
               var10000 = 152;
               break;
            case 248:
               var10000 = 132;
               break;
            case 249:
               var10000 = 164;
               break;
            case 250:
               var10000 = 251;
               break;
            case 251:
               var10000 = 125;
               break;
            case 252:
               var10000 = 169;
               break;
            case 253:
               var10000 = 177;
               break;
            case 254:
               var10000 = 178;
               break;
            default:
               var10000 = 215;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12719;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var12;
      char[] var36;
      String[] var15 = new String[6];
      int var13 = 0;
      var12 = "v.ÑRn`4$\u0017\u0010o©§JÆ\u009fÊ,L«ë¯\u001fúwþ¤ö¸¶Å\t\u0004ÊÙG%0/\u0017\u0016@\u0019ýËýw°74$§\u001e\u000e\nOo°IUÇÐÈê\u0003õFÁ'Ön«\u001bP4\u0093@%\u0004bd¬AQ·\f";
      int var14 = "v.ÑRn`4$\u0017\u0010o©§JÆ\u009fÊ,L«ë¯\u001fúwþ¤ö¸¶Å\t\u0004ÊÙG%0/\u0017\u0016@\u0019ýËýw°74$§\u001e\u000e\nOo°IUÇÐÈê\u0003õFÁ'Ön«\u001bP4\u0093@%\u0004bd¬AQ·\f"
         .length();
      char var11 = '\b';
      int var19 = -1;

      label70:
      while (true) {
         byte var10000 = 26;
         String var10001 = var12.substring(++var19, var19 + var11);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var16 = 0;
               byte var46 = var10000;
               var36 = var43;
               int var26 = var10004;
               byte var53;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               } else {
                  var46 = var10000;
                  var26 = var10004;
                  if (var10004 <= var16) {
                     break label65;
                  }

                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var68 = var59[var10006];
                  byte var69;
                  switch (var16 % 7) {
                     case 0:
                        var69 = 60;
                        break;
                     case 1:
                        var69 = 43;
                        break;
                     case 2:
                        var69 = 115;
                        break;
                     case 3:
                        var69 = 112;
                        break;
                     case 4:
                        var69 = 83;
                        break;
                     case 5:
                        var69 = 99;
                        break;
                     default:
                        var69 = 93;
                  }

                  var59[var10006] = (char)(var68 ^ var53 ^ var69);
                  var16++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var59 = var36;
                     var53 = var46;
                  } else {
                     if (var26 <= var16) {
                        break;
                     }

                     var59 = var36;
                     var53 = var46;
                     var10006 = var16;
                  }
               }
            }

            String var48 = new String(var36).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var48;
                  if ((var19 += var11) >= var14) {
                     a = var15;
                     b = new String[6];
                     long var2 = 290982077229208671L;
                     long[] var8 = new long[26];
                     int var5 = 0;
                     String var6 = "Ð\u0019a\u00ad®î\u0011\\_©\u0098Êg\u0086vV\u000fyò\u0081~Ì«ÐÝÊ.ÒA©\u0016ì] \u0011¦\u0013ñ\u0084)\u0006\u001dÄh~\t\u0096¿\u009b\u009bä\u0089H\u008bñ¤@¾+K\u0015uRÏ\u0088¨\u0018õ\u001f\u00843ï6\u009b-p\u00078¾\u0093\u001a\t\u001d/Q|g\u0092\u0019Ý!ÆMºgìõª5\u0096t9H¼N¸Ôy%ÜmºâyF8à\u0003K¶b\u008e*ý\u008dFÈHº;\u0086\u0086\u001eÍbÝÐùC\n.ù$\u0014}\u0083¸z~3Ûøz\u0094k¼PjiyÍ\u0089zCË\u0003®.¹\u0001°ÛªJ\u0014Ê\u0016ö:$»\u0003\u0018AÒl\u001d·þ\u009b©¦";
                     int var7 = "Ð\u0019a\u00ad®î\u0011\\_©\u0098Êg\u0086vV\u000fyò\u0081~Ì«ÐÝÊ.ÒA©\u0016ì] \u0011¦\u0013ñ\u0084)\u0006\u001dÄh~\t\u0096¿\u009b\u009bä\u0089H\u008bñ¤@¾+K\u0015uRÏ\u0088¨\u0018õ\u001f\u00843ï6\u009b-p\u00078¾\u0093\u001a\t\u001d/Q|g\u0092\u0019Ý!ÆMºgìõª5\u0096t9H¼N¸Ôy%ÜmºâyF8à\u0003K¶b\u008e*ý\u008dFÈHº;\u0086\u0086\u001eÍbÝÐùC\n.ù$\u0014}\u0083¸z~3Ûøz\u0094k¼PjiyÍ\u0089zCË\u0003®.¹\u0001°ÛªJ\u0014Ê\u0016ö:$»\u0003\u0018AÒl\u001d·þ\u009b©¦"
                        .length();
                     byte var4 = 0;

                     label44:
                     while (true) {
                        byte var28 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var28, var4).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                        long[] var21 = var8;
                        int var29 = var5++;
                        long var40 = ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L;
                        byte var49 = -1;

                        while (true) {
                           long var58 = var40 ^ var2;
                           switch (var49) {
                              case 0:
                                 var21[var29] = var58;
                                 if (var4 >= var7) {
                                    c = var8;
                                    d = new Integer[26];
                                    long var0 = 3282016151453062108L;
                                    long var42 = 3282016151453061172L ^ var0;
                                    byte var31 = -1;
                                    e = var42;
                                    q = new Ze2();
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var58;
                                 if (var4 < var7) {
                                    continue label44;
                                 }

                                 var6 = "\u000fv\u0017«:Ì\u0084É\bät`(ÉKê";
                                 var7 = "\u000fv\u0017«:Ì\u0084É\bät`(ÉKê".length();
                                 var4 = 0;
                           }

                           byte var30 = var4;
                           var4 += 8;
                           var9 = var6.substring(var30, var4).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                           var21 = var8;
                           var29 = var5++;
                           var40 = ((long)var9[0] & 255L) << 56
                              | ((long)var9[1] & 255L) << 48
                              | ((long)var9[2] & 255L) << 40
                              | ((long)var9[3] & 255L) << 32
                              | ((long)var9[4] & 255L) << 24
                              | ((long)var9[5] & 255L) << 16
                              | ((long)var9[6] & 255L) << 8
                              | (long)var9[7] & 255L;
                           var49 = 0;
                        }
                     }
                  }

                  var11 = var12.charAt(var19);
                  break;
               default:
                  var15[var13++] = var48;
                  if ((var19 += var11) < var14) {
                     var11 = var12.charAt(var19);
                     continue label70;
                  }

                  var12 = ">gÌ\u0006FR¾ø¨ª\u009b\u0097\t0\u008e2Ð¬\u0093\nêÊV³\u0015äÔ.åp";
                  var14 = ">gÌ\u0006FR¾ø¨ª\u009b\u0097\t0\u008e2Ð¬\u0093\nêÊV³\u0015äÔ.åp".length();
                  var11 = 19;
                  var19 = -1;
            }

            var10000 = 62;
            var10001 = var12.substring(++var19, var19 + var11);
            var10002 = 0;
         }
      }
   }
}





