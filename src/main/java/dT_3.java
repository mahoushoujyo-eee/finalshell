import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

public class dT_3 {
   private c3_2 y;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;
   private static final long e;

   public dT_3(InputStream var1, OutputStream var2) {
      this.y = new c3_2(var1, var2);
   }

   public void O(Path var1) throws IOException {
      int var10000 = To_2.L();
      DataInputStream var3 = new DataInputStream(Files.newInputStream(var1));
      int var2 = var10000;

      try {
         Object var5;
         label33: {
            boolean var4 = this.y.u();
            if (var4) {
               var5 = new yO_3();

               try {
                  if (var2 != 0) {
                     break label33;
                  }

                  com.ky_4.K(new String[4]);
               } catch (Throwable var11) {
                  throw a(var11);
               }
            }

            var5 = new fL_3();
         }

         BasicFileAttributes var6 = Files.readAttributes(var1, BasicFileAttributes.class);
         String var7 = var1.getFileName().toString()
            + '\u0000'
            + Long.valueOf(Files.size(var1)).toString()
            + " "
            + Long.toOctalString(var6.lastModifiedTime().toMillis() / e);
         byte[] var8 = Arrays.copyOf(var7.getBytes(), a(14425, 3726887937281617950L));
         this.y.B(0, Arrays.copyOf(var8, a(14425, 3726887937281617950L)), a(14425, 3726887937281617950L), (J1)var5);
         this.y.u();
         byte[] var9 = new byte[a(5838, 5991420705726226059L)];
         this.y.O(var3, 1, (J1)var5, var9);
         this.y.V();
      } catch (Throwable var12) {
         try {
            var3.close();
         } catch (Throwable var10) {
            var12.addSuppressed(var10);
         }

         throw var12;
      }

      var3.close();
   }

   public void T(Path[] var1) throws IOException {
      int var10000 = To_2.L();
      Path[] var3 = var1;
      int var2 = var10000;
      int var4 = var1.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            Path var6 = var3[var5];

            try {
               this.O(var6);
               var5++;
               if (var2 == 0) {
                  break;
               }

               if (var2 != 0) {
                  continue;
               }
            } catch (IOException var7) {
               throw a(var7);
            }
         }

         this.D();
         break;
      }
   }

   private void D() throws IOException {
      Object var3;
      label11: {
         int var10000 = To_2.T();
         boolean var2 = this.y.u();
         int var1 = var10000;
         if (var2) {
            var3 = new yO_3();
            if (var1 == 0) {
               break label11;
            }
         }

         var3 = new fL_3();
      }

      byte[] var4 = new byte[a(28932, 4195866527127583045L)];
      this.y.B(0, var4, var4.length, (J1)var3);
   }

   public Path A(Path var1) throws IOException {
      return this.c(var1, true);
   }

   public void m(Path var1) throws IOException {
      try {
         while (this.c(var1, true) != null) {
         }
      } catch (IOException var2) {
         throw a(var2);
      }
   }

   public Path E(Path var1) throws IOException {
      return this.c(var1, false);
   }

   private Path c(Path param1, boolean param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic To_2.L ()I
      // 003: aconst_null
      // 004: astore 4
      // 006: istore 3
      // 007: new yO_3
      // 00a: dup
      // 00b: invokespecial yO_3.<init> ()V
      // 00e: astore 6
      // 010: bipush 0
      // 011: istore 7
      // 013: aload 0
      // 014: getfield dT_3.y Lc3_2;
      // 017: bipush 1
      // 018: invokevirtual c3_2.A (Z)I
      // 01b: istore 9
      // 01d: aload 0
      // 01e: getfield dT_3.y Lc3_2;
      // 021: bipush 0
      // 022: iload 9
      // 024: iload 3
      // 025: ifeq 03b
      // 028: bipush 1
      // 029: if_icmpne 03e
      // 02c: goto 033
      // 02f: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: bipush 1
      // 034: goto 03b
      // 037: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: aload 6
      // 041: invokevirtual c3_2.M (IZLJ1;)[B
      // 044: astore 8
      // 046: iload 2
      // 047: ifeq 0d9
      // 04a: new java/lang/StringBuilder
      // 04d: dup
      // 04e: invokespecial java/lang/StringBuilder.<init> ()V
      // 051: astore 10
      // 053: aload 8
      // 055: bipush 0
      // 056: baload
      // 057: iload 3
      // 058: ifeq 091
      // 05b: ifne 090
      // 05e: goto 065
      // 061: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: aload 0
      // 066: getfield dT_3.y Lc3_2;
      // 069: sipush 19251
      // 06c: ldc2_w 6622079429588419441
      // 06f: invokestatic dT_3.a (IJ)I
      // 072: invokevirtual c3_2.b (B)V
      // 075: aconst_null
      // 076: astore 11
      // 078: aload 4
      // 07a: iload 3
      // 07b: ifeq 08a
      // 07e: ifnull 08d
      // 081: goto 088
      // 084: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: aload 4
      // 08a: invokevirtual java/io/DataOutputStream.close ()V
      // 08d: aload 11
      // 08f: areturn
      // 090: bipush 0
      // 091: istore 11
      // 093: iload 11
      // 095: aload 8
      // 097: arraylength
      // 098: if_icmpge 0c8
      // 09b: aload 8
      // 09d: iload 11
      // 09f: baload
      // 0a0: ifne 0ae
      // 0a3: iload 3
      // 0a4: ifne 0c8
      // 0a7: goto 0ae
      // 0aa: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: aload 10
      // 0b0: aload 8
      // 0b2: iload 11
      // 0b4: baload
      // 0b5: i2c
      // 0b6: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0b9: pop
      // 0ba: iinc 11 1
      // 0bd: iload 3
      // 0be: ifne 093
      // 0c1: goto 0c8
      // 0c4: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aload 1
      // 0c9: aload 10
      // 0cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ce: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0d3: astore 5
      // 0d5: iload 3
      // 0d6: ifne 0dc
      // 0d9: aload 1
      // 0da: astore 5
      // 0dc: new java/io/DataOutputStream
      // 0df: dup
      // 0e0: aload 5
      // 0e2: bipush 0
      // 0e3: anewarray 43
      // 0e6: invokestatic java/nio/file/Files.newOutputStream (Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;
      // 0e9: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 0ec: astore 4
      // 0ee: aload 0
      // 0ef: getfield dT_3.y Lc3_2;
      // 0f2: sipush 5467
      // 0f5: ldc2_w 2210228228683619611
      // 0f8: invokestatic dT_3.a (IJ)I
      // 0fb: invokevirtual c3_2.b (B)V
      // 0fe: goto 16a
      // 101: astore 10
      // 103: iinc 7 1
      // 106: iload 3
      // 107: ifeq 14b
      // 10a: iload 7
      // 10c: sipush 21076
      // 10f: ldc2_w 3081051703946942992
      // 112: invokestatic dT_3.a (IJ)I
      // 115: if_icmpne 13b
      // 118: goto 11f
      // 11b: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: aload 0
      // 120: getfield dT_3.y Lc3_2;
      // 123: invokevirtual c3_2.q ()V
      // 126: new java/io/IOException
      // 129: dup
      // 12a: sipush 30313
      // 12d: sipush 28703
      // 130: invokestatic dT_3.a (II)Ljava/lang/String;
      // 133: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 136: athrow
      // 137: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 0
      // 13c: getfield dT_3.y Lc3_2;
      // 13f: sipush 14645
      // 142: ldc2_w 2366508263792177523
      // 145: invokestatic dT_3.a (IJ)I
      // 148: invokevirtual c3_2.b (B)V
      // 14b: goto 013
      // 14e: astore 10
      // 150: aload 0
      // 151: getfield dT_3.y Lc3_2;
      // 154: invokevirtual c3_2.q ()V
      // 157: new java/io/IOException
      // 15a: dup
      // 15b: sipush 30312
      // 15e: sipush -29516
      // 161: invokestatic dT_3.a (II)Ljava/lang/String;
      // 164: aload 10
      // 166: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield dT_3.y Lc3_2;
      // 16e: aload 5
      // 170: bipush 1
      // 171: invokevirtual c3_2.a (Ljava/nio/file/Path;Z)V
      // 174: aload 4
      // 176: iload 3
      // 177: ifeq 17f
      // 17a: ifnull 19f
      // 17d: aload 4
      // 17f: invokevirtual java/io/DataOutputStream.close ()V
      // 182: goto 19f
      // 185: astore 12
      // 187: aload 4
      // 189: iload 3
      // 18a: ifeq 199
      // 18d: ifnull 19c
      // 190: goto 197
      // 193: invokestatic dT_3.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 196: athrow
      // 197: aload 4
      // 199: invokevirtual java/io/DataOutputStream.close ()V
      // 19c: aload 12
      // 19e: athrow
      // 19f: aload 5
      // 1a1: areturn
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var15 = new String[2];
      int var13 = 0;
      String var12 = "ðç\u0092½\u008fø\u0004Q·\u000e¥Dâ[s³j1¤Â¢û«G.nÇ\u0004Çõ\u0014ª)Î'Æ\u0085X\u0012UÌ\u0080\u0002\u0002üÅOØÉÍ!Õæý;³æ\u0092}\u00adë³\u0019qÅ Tå£\u008f¡";
      int var14 = "ðç\u0092½\u008fø\u0004Q·\u000e¥Dâ[s³j1¤Â¢û«G.nÇ\u0004Çõ\u0014ª)Î'Æ\u0085X\u0012UÌ\u0080\u0002\u0002üÅOØÉÍ!Õæý;³æ\u0092}\u00adë³\u0019qÅ Tå£\u008f¡"
         .length();
      char var11 = 24;
      int var10 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var12.substring(++var10, var10 + var11).toCharArray();
            int var10004 = var10003.length;
            int var16 = 0;
            byte var31 = 69;
            var10002 = var10003;
            int var19 = var10004;
            byte var36;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var36 = 69;
               var10006 = var16;
            } else {
               var31 = 69;
               var19 = var10004;
               if (var10004 <= var16) {
                  break label56;
               }

               var10005 = var10003;
               var36 = 69;
               var10006 = var16;
            }

            while (true) {
               char var50 = var10005[var10006];
               byte var51;
               switch (var16 % 7) {
                  case 0:
                     var51 = 60;
                     break;
                  case 1:
                     var51 = 100;
                     break;
                  case 2:
                     var51 = 28;
                     break;
                  case 3:
                     var51 = 12;
                     break;
                  case 4:
                     var51 = 37;
                     break;
                  case 5:
                     var51 = 78;
                     break;
                  default:
                     var51 = 41;
               }

               var10005[var10006] = (char)(var50 ^ var36 ^ var51);
               var16++;
               if (var31 == 0) {
                  var10006 = var31;
                  var10005 = var10002;
                  var36 = var31;
               } else {
                  if (var19 <= var16) {
                     break;
                  }

                  var10005 = var10002;
                  var36 = var31;
                  var10006 = var16;
               }
            }
         }

         String var33 = new String(var10002).intern();
         int var21 = -1;
         var15[var13++] = var33;
         if ((var10 += var11) >= var14) {
            a = var15;
            b = new String[2];
            long var2 = 6661895142730328197L;
            long[] var8 = new long[7];
            int var5 = 0;
            String var6 = "õj±ûU\tò\u009f¯ëL\u0090Yì2\u000e\\êh±L\f\u0099ã\u00139èÜJ\f\u0098\u001bÐ*þ?\u0012m5\u0098";
            int var7 = "õj±ûU\tò\u009f¯ëL\u0090Yì2\u000e\\êh±L\f\u0099ã\u00139èÜJ\f\u0098\u001bÐ*þ?\u0012m5\u0098".length();
            byte var4 = 0;

            label40:
            while (true) {
               var21 = var4;
               var4 += 8;
               byte[] var9 = var6.substring(var21, var4).getBytes("ISO-8859-1");
               long[] var10000 = var8;
               var21 = var5++;
               long var28 = ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L;
               byte var34 = -1;

               while (true) {
                  long var41 = var28 ^ var2;
                  switch (var34) {
                     case 0:
                        var10000[var21] = var41;
                        if (var4 >= var7) {
                           c = var8;
                           d = new Integer[7];
                           long var0 = 6778353867846263354L;
                           long var30 = 6778353867846263250L ^ var0;
                           byte var25 = -1;
                           e = var30;
                           return;
                        }
                        break;
                     default:
                        var10000[var21] = var41;
                        if (var4 < var7) {
                           continue label40;
                        }

                        var6 = "Þ1>ä;3Q@\u0095\u009dU:â]kò";
                        var7 = "Þ1>ä;3Q@\u0095\u009dU:â]kò".length();
                        var4 = 0;
                  }

                  byte var24 = var4;
                  var4 += 8;
                  var9 = var6.substring(var24, var4).getBytes("ISO-8859-1");
                  var10000 = var8;
                  var21 = var5++;
                  var28 = ((long)var9[0] & 255L) << 56
                     | ((long)var9[1] & 255L) << 48
                     | ((long)var9[2] & 255L) << 40
                     | ((long)var9[3] & 255L) << 32
                     | ((long)var9[4] & 255L) << 24
                     | ((long)var9[5] & 255L) << 16
                     | ((long)var9[6] & 255L) << 8
                     | (long)var9[7] & 255L;
                  var34 = 0;
               }
            }
         }

         var11 = var12.charAt(var10);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30312) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 195;
               break;
            case 1:
               var10000 = 171;
               break;
            case 2:
               var10000 = 210;
               break;
            case 3:
               var10000 = 75;
               break;
            case 4:
               var10000 = 114;
               break;
            case 5:
               var10000 = 213;
               break;
            case 6:
               var10000 = 67;
               break;
            case 7:
               var10000 = 17;
               break;
            case 8:
               var10000 = 238;
               break;
            case 9:
               var10000 = 204;
               break;
            case 10:
               var10000 = 100;
               break;
            case 11:
               var10000 = 5;
               break;
            case 12:
               var10000 = 44;
               break;
            case 13:
               var10000 = 90;
               break;
            case 14:
               var10000 = 43;
               break;
            case 15:
               var10000 = 182;
               break;
            case 16:
               var10000 = 85;
               break;
            case 17:
               var10000 = 211;
               break;
            case 18:
               var10000 = 236;
               break;
            case 19:
               var10000 = 154;
               break;
            case 20:
               var10000 = 60;
               break;
            case 21:
               var10000 = 202;
               break;
            case 22:
               var10000 = 8;
               break;
            case 23:
               var10000 = 220;
               break;
            case 24:
               var10000 = 231;
               break;
            case 25:
               var10000 = 228;
               break;
            case 26:
               var10000 = 62;
               break;
            case 27:
               var10000 = 107;
               break;
            case 28:
               var10000 = 150;
               break;
            case 29:
               var10000 = 10;
               break;
            case 30:
               var10000 = 227;
               break;
            case 31:
               var10000 = 113;
               break;
            case 32:
               var10000 = 73;
               break;
            case 33:
               var10000 = 110;
               break;
            case 34:
               var10000 = 79;
               break;
            case 35:
               var10000 = 249;
               break;
            case 36:
               var10000 = 179;
               break;
            case 37:
               var10000 = 164;
               break;
            case 38:
               var10000 = 149;
               break;
            case 39:
               var10000 = 66;
               break;
            case 40:
               var10000 = 255;
               break;
            case 41:
               var10000 = 239;
               break;
            case 42:
               var10000 = 206;
               break;
            case 43:
               var10000 = 97;
               break;
            case 44:
               var10000 = 172;
               break;
            case 45:
               var10000 = 52;
               break;
            case 46:
               var10000 = 55;
               break;
            case 47:
               var10000 = 6;
               break;
            case 48:
               var10000 = 93;
               break;
            case 49:
               var10000 = 130;
               break;
            case 50:
               var10000 = 127;
               break;
            case 51:
               var10000 = 119;
               break;
            case 52:
               var10000 = 0;
               break;
            case 53:
               var10000 = 244;
               break;
            case 54:
               var10000 = 26;
               break;
            case 55:
               var10000 = 78;
               break;
            case 56:
               var10000 = 207;
               break;
            case 57:
               var10000 = 135;
               break;
            case 58:
               var10000 = 76;
               break;
            case 59:
               var10000 = 221;
               break;
            case 60:
               var10000 = 177;
               break;
            case 61:
               var10000 = 37;
               break;
            case 62:
               var10000 = 88;
               break;
            case 63:
               var10000 = 212;
               break;
            case 64:
               var10000 = 3;
               break;
            case 65:
               var10000 = 233;
               break;
            case 66:
               var10000 = 191;
               break;
            case 67:
               var10000 = 155;
               break;
            case 68:
               var10000 = 165;
               break;
            case 69:
               var10000 = 106;
               break;
            case 70:
               var10000 = 156;
               break;
            case 71:
               var10000 = 151;
               break;
            case 72:
               var10000 = 153;
               break;
            case 73:
               var10000 = 219;
               break;
            case 74:
               var10000 = 181;
               break;
            case 75:
               var10000 = 223;
               break;
            case 76:
               var10000 = 38;
               break;
            case 77:
               var10000 = 201;
               break;
            case 78:
               var10000 = 250;
               break;
            case 79:
               var10000 = 104;
               break;
            case 80:
               var10000 = 80;
               break;
            case 81:
               var10000 = 69;
               break;
            case 82:
               var10000 = 96;
               break;
            case 83:
               var10000 = 193;
               break;
            case 84:
               var10000 = 29;
               break;
            case 85:
               var10000 = 222;
               break;
            case 86:
               var10000 = 158;
               break;
            case 87:
               var10000 = 134;
               break;
            case 88:
               var10000 = 15;
               break;
            case 89:
               var10000 = 173;
               break;
            case 90:
               var10000 = 12;
               break;
            case 91:
               var10000 = 215;
               break;
            case 92:
               var10000 = 81;
               break;
            case 93:
               var10000 = 163;
               break;
            case 94:
               var10000 = 120;
               break;
            case 95:
               var10000 = 36;
               break;
            case 96:
               var10000 = 20;
               break;
            case 97:
               var10000 = 115;
               break;
            case 98:
               var10000 = 13;
               break;
            case 99:
               var10000 = 232;
               break;
            case 100:
               var10000 = 92;
               break;
            case 101:
               var10000 = 56;
               break;
            case 102:
               var10000 = 132;
               break;
            case 103:
               var10000 = 140;
               break;
            case 104:
               var10000 = 143;
               break;
            case 105:
               var10000 = 28;
               break;
            case 106:
               var10000 = 251;
               break;
            case 107:
               var10000 = 187;
               break;
            case 108:
               var10000 = 198;
               break;
            case 109:
               var10000 = 141;
               break;
            case 110:
               var10000 = 147;
               break;
            case 111:
               var10000 = 226;
               break;
            case 112:
               var10000 = 102;
               break;
            case 113:
               var10000 = 234;
               break;
            case 114:
               var10000 = 184;
               break;
            case 115:
               var10000 = 137;
               break;
            case 116:
               var10000 = 68;
               break;
            case 117:
               var10000 = 50;
               break;
            case 118:
               var10000 = 166;
               break;
            case 119:
               var10000 = 82;
               break;
            case 120:
               var10000 = 84;
               break;
            case 121:
               var10000 = 192;
               break;
            case 122:
               var10000 = 253;
               break;
            case 123:
               var10000 = 16;
               break;
            case 124:
               var10000 = 25;
               break;
            case 125:
               var10000 = 35;
               break;
            case 126:
               var10000 = 83;
               break;
            case 127:
               var10000 = 185;
               break;
            case 128:
               var10000 = 138;
               break;
            case 129:
               var10000 = 59;
               break;
            case 130:
               var10000 = 32;
               break;
            case 131:
               var10000 = 241;
               break;
            case 132:
               var10000 = 230;
               break;
            case 133:
               var10000 = 252;
               break;
            case 134:
               var10000 = 246;
               break;
            case 135:
               var10000 = 111;
               break;
            case 136:
               var10000 = 98;
               break;
            case 137:
               var10000 = 229;
               break;
            case 138:
               var10000 = 189;
               break;
            case 139:
               var10000 = 152;
               break;
            case 140:
               var10000 = 70;
               break;
            case 141:
               var10000 = 108;
               break;
            case 142:
               var10000 = 91;
               break;
            case 143:
               var10000 = 124;
               break;
            case 144:
               var10000 = 99;
               break;
            case 145:
               var10000 = 65;
               break;
            case 146:
               var10000 = 123;
               break;
            case 147:
               var10000 = 105;
               break;
            case 148:
               var10000 = 133;
               break;
            case 149:
               var10000 = 101;
               break;
            case 150:
               var10000 = 242;
               break;
            case 151:
               var10000 = 167;
               break;
            case 152:
               var10000 = 136;
               break;
            case 153:
               var10000 = 2;
               break;
            case 154:
               var10000 = 245;
               break;
            case 155:
               var10000 = 41;
               break;
            case 156:
               var10000 = 205;
               break;
            case 157:
               var10000 = 33;
               break;
            case 158:
               var10000 = 196;
               break;
            case 159:
               var10000 = 47;
               break;
            case 160:
               var10000 = 216;
               break;
            case 161:
               var10000 = 176;
               break;
            case 162:
               var10000 = 162;
               break;
            case 163:
               var10000 = 39;
               break;
            case 164:
               var10000 = 112;
               break;
            case 165:
               var10000 = 217;
               break;
            case 166:
               var10000 = 122;
               break;
            case 167:
               var10000 = 89;
               break;
            case 168:
               var10000 = 178;
               break;
            case 169:
               var10000 = 103;
               break;
            case 170:
               var10000 = 94;
               break;
            case 171:
               var10000 = 53;
               break;
            case 172:
               var10000 = 58;
               break;
            case 173:
               var10000 = 4;
               break;
            case 174:
               var10000 = 22;
               break;
            case 175:
               var10000 = 128;
               break;
            case 176:
               var10000 = 118;
               break;
            case 177:
               var10000 = 208;
               break;
            case 178:
               var10000 = 186;
               break;
            case 179:
               var10000 = 125;
               break;
            case 180:
               var10000 = 51;
               break;
            case 181:
               var10000 = 54;
               break;
            case 182:
               var10000 = 183;
               break;
            case 183:
               var10000 = 144;
               break;
            case 184:
               var10000 = 159;
               break;
            case 185:
               var10000 = 74;
               break;
            case 186:
               var10000 = 18;
               break;
            case 187:
               var10000 = 129;
               break;
            case 188:
               var10000 = 61;
               break;
            case 189:
               var10000 = 240;
               break;
            case 190:
               var10000 = 188;
               break;
            case 191:
               var10000 = 23;
               break;
            case 192:
               var10000 = 49;
               break;
            case 193:
               var10000 = 139;
               break;
            case 194:
               var10000 = 7;
               break;
            case 195:
               var10000 = 117;
               break;
            case 196:
               var10000 = 218;
               break;
            case 197:
               var10000 = 42;
               break;
            case 198:
               var10000 = 254;
               break;
            case 199:
               var10000 = 180;
               break;
            case 200:
               var10000 = 175;
               break;
            case 201:
               var10000 = 237;
               break;
            case 202:
               var10000 = 34;
               break;
            case 203:
               var10000 = 169;
               break;
            case 204:
               var10000 = 11;
               break;
            case 205:
               var10000 = 86;
               break;
            case 206:
               var10000 = 19;
               break;
            case 207:
               var10000 = 27;
               break;
            case 208:
               var10000 = 148;
               break;
            case 209:
               var10000 = 1;
               break;
            case 210:
               var10000 = 199;
               break;
            case 211:
               var10000 = 145;
               break;
            case 212:
               var10000 = 203;
               break;
            case 213:
               var10000 = 121;
               break;
            case 214:
               var10000 = 116;
               break;
            case 215:
               var10000 = 131;
               break;
            case 216:
               var10000 = 24;
               break;
            case 217:
               var10000 = 225;
               break;
            case 218:
               var10000 = 160;
               break;
            case 219:
               var10000 = 142;
               break;
            case 220:
               var10000 = 95;
               break;
            case 221:
               var10000 = 214;
               break;
            case 222:
               var10000 = 126;
               break;
            case 223:
               var10000 = 190;
               break;
            case 224:
               var10000 = 63;
               break;
            case 225:
               var10000 = 48;
               break;
            case 226:
               var10000 = 14;
               break;
            case 227:
               var10000 = 168;
               break;
            case 228:
               var10000 = 209;
               break;
            case 229:
               var10000 = 77;
               break;
            case 230:
               var10000 = 46;
               break;
            case 231:
               var10000 = 21;
               break;
            case 232:
               var10000 = 40;
               break;
            case 233:
               var10000 = 243;
               break;
            case 234:
               var10000 = 170;
               break;
            case 235:
               var10000 = 72;
               break;
            case 236:
               var10000 = 235;
               break;
            case 237:
               var10000 = 157;
               break;
            case 238:
               var10000 = 200;
               break;
            case 239:
               var10000 = 45;
               break;
            case 240:
               var10000 = 224;
               break;
            case 241:
               var10000 = 64;
               break;
            case 242:
               var10000 = 71;
               break;
            case 243:
               var10000 = 247;
               break;
            case 244:
               var10000 = 174;
               break;
            case 245:
               var10000 = 146;
               break;
            case 246:
               var10000 = 87;
               break;
            case 247:
               var10000 = 194;
               break;
            case 248:
               var10000 = 109;
               break;
            case 249:
               var10000 = 161;
               break;
            case 250:
               var10000 = 9;
               break;
            case 251:
               var10000 = 57;
               break;
            case 252:
               var10000 = 248;
               break;
            case 253:
               var10000 = 31;
               break;
            case 254:
               var10000 = 30;
               break;
            default:
               var10000 = 197;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18500;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





