import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class JX extends Jk_2 {
   public int t;
   public byte[] Q;
   static boolean J;
   private static final String[] a;
   private static final String[] d;
   private static final long[] h;
   private static final Integer[] i;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[6];
      int var11 = 0;
      String var10 = "¨ÈPR\u001c\u0007Å\u0007ó\u009cVj*\u000568¦ \u0016\u0005\u009cäî«¡";
      int var12 = "¨ÈPR\u001c\u0007Å\u0007ó\u009cVj*\u000568¦ \u0016\u0005\u009cäî«¡".length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 39;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 93;
                        break;
                     case 1:
                        var65 = 104;
                        break;
                     case 2:
                        var65 = 37;
                        break;
                     case 3:
                        var65 = 119;
                        break;
                     case 4:
                        var65 = 73;
                        break;
                     case 5:
                        var65 = 17;
                        break;
                     default:
                        var65 = 12;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     d = new String[6];
                     long var0 = 6764561795443658724L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "+Ç6\r¬\u0016\u001eWo\u001azA¥¯b¶\u0000xp0v\u0006nî\u0082È\u0007Ù\u007f4\u0002áÊïÈÄ3\u0081a1ã\bÿL¦¸´\u0012«4\u0093ÚS\u009e\u0001M)¼ñ\u0095æQSÂ=¥\u0014X\u008c\u00179^";
                     int var5 = "+Ç6\r¬\u0016\u001eWo\u001azA¥¯b¶\u0000xp0v\u0006nî\u0082È\u0007Ù\u007f4\u0002áÊïÈÄ3\u0081a1ã\bÿL¦¸´\u0012«4\u0093ÚS\u009e\u0001M)¼ñ\u0095æQSÂ=¥\u0014X\u008c\u00179^"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    h = var6;
                                    i = new Integer[11];
                                    J = true;
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "H\u009dð\u0090\u009c$ë\u008d\u0090.&Áó=íT";
                                 var5 = "H\u009dð\u0090\u009c$ë\u008d\u0090.&Áó=íT".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "Oø#\u0092ë\u0080\u0016\u0087¢ÚLÒ@ÐªÆÀ\u0000Lå\u0005\u0081êÏýæ";
                  var12 = "Oø#\u0092ë\u0080\u0016\u0087¢ÚLÒ@ÐªÆÀ\u0000Lå\u0005\u0081êÏýæ".length();
                  var9 = 20;
                  var17 = -1;
            }

            var10000 = 57;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   public JX(int var1) {
      super(var1, null, 0);
      this.Q = new byte[3];
      this.Q[0] = 5;
      this.Q[1] = (byte)var1;
      this.Q[2] = 0;
   }

   public JX(int var1, InetAddress var2, int var3) {
      String[] var4;
      String var7;
      label34: {
         String[] var10000 = Jk_2.Y();
         super(var1, var2, var3);
         var4 = var10000;
         InetAddress var10001 = var2;
         if (var4 != null) {
            if (var2 == null) {
               var7 = b(26365, -15894);
               break label34;
            }

            var10001 = var2;
         }

         var7 = var10001.getHostAddress();
      }

      byte[] var5;
      label28: {
         this.B = var7;
         this.u = b(10247, 8253599549113134423L);
         InetAddress var6 = var2;
         if (var4 != null) {
            if (var2 == null) {
               var5 = new byte[4];
               var5[0] = var5[1] = var5[2] = var5[3] = 0;
               if (var4 != null) {
                  break label28;
               }
            }

            var6 = var2;
         }

         var5 = var6.getAddress();
      }

      int var8 = var5.length;
      if (var4 != null) {
         var8 = var8 == 4 ? 1 : 4;
      }

      this.t = var8;
      this.Q = new byte[b(19448, 466346709552139951L) + var5.length];
      this.Q[0] = 5;
      this.Q[1] = (byte)this.r;
      this.Q[2] = 0;
      this.Q[3] = (byte)this.t;
      System.arraycopy(var5, 0, this.Q, 4, var5.length);
      this.Q[this.Q.length - 2] = (byte)(var3 >> b(32426, 1896017815960402942L));
      this.Q[this.Q.length - 1] = (byte)var3;
   }

   public JX(int var1, String var2, int var3) {
      super(var1, null, var3);
      this.B = var2;
      this.u = b(9308, 8591357032162877711L);
      this.t = b(11139, 7445231863479168726L);
      byte[] var4 = var2.getBytes();
      this.Q = new byte[b(21733, 2318394254194315700L) + var4.length];
      this.Q[0] = 5;
      this.Q[1] = (byte)this.r;
      this.Q[2] = 0;
      this.Q[3] = 3;
      this.Q[4] = (byte)var4.length;
      System.arraycopy(var4, 0, this.Q, 5, var4.length);
      this.Q[this.Q.length - 2] = (byte)(var3 >> b(29675, 5284365172101494450L));
      this.Q[this.Q.length - 1] = (byte)var3;
   }

   public JX(InputStream var1) throws b5_2, IOException {
      this(var1, true);
   }

   public JX(InputStream var1, boolean var2) throws b5_2, IOException {
      super();
      this.b(var1, var2);
   }

   @Override
   public void K(InputStream var1) throws b5_2, IOException {
      this.b(var1, true);
   }

   @Override
   public void b(InputStream param1, boolean param2) throws b5_2, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic Jk_2.Y ()[Ljava/lang/String;
      // 003: aload 0
      // 004: aconst_null
      // 005: putfield JX.Q [B
      // 008: aload 0
      // 009: aconst_null
      // 00a: putfield JX.e Ljava/net/InetAddress;
      // 00d: astore 3
      // 00e: new java/io/DataInputStream
      // 011: dup
      // 012: aload 1
      // 013: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 016: astore 4
      // 018: aload 0
      // 019: aload 4
      // 01b: invokevirtual java/io/DataInputStream.readUnsignedByte ()I
      // 01e: putfield JX.u I
      // 021: aload 0
      // 022: aload 4
      // 024: invokevirtual java/io/DataInputStream.readUnsignedByte ()I
      // 027: putfield JX.r I
      // 02a: iload 2
      // 02b: aload 3
      // 02c: ifnull 067
      // 02f: ifeq 062
      // 032: goto 039
      // 035: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield JX.r I
      // 03d: aload 3
      // 03e: ifnull 067
      // 041: goto 048
      // 044: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 047: athrow
      // 048: ifeq 062
      // 04b: goto 052
      // 04e: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 051: athrow
      // 052: new b5_2
      // 055: dup
      // 056: aload 0
      // 057: getfield JX.r I
      // 05a: invokespecial b5_2.<init> (I)V
      // 05d: athrow
      // 05e: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 061: athrow
      // 062: aload 4
      // 064: invokevirtual java/io/DataInputStream.readUnsignedByte ()I
      // 067: istore 5
      // 069: aload 0
      // 06a: aload 4
      // 06c: invokevirtual java/io/DataInputStream.readUnsignedByte ()I
      // 06f: putfield JX.t I
      // 072: aload 0
      // 073: getfield JX.t I
      // 076: aload 3
      // 077: ifnull 09d
      // 07a: tableswitch 165 1 4 34 127 94 60
      // 098: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09b: athrow
      // 09c: bipush 4
      // 09d: newarray 8
      // 09f: astore 6
      // 0a1: aload 4
      // 0a3: aload 6
      // 0a5: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 0a8: aload 0
      // 0a9: aload 6
      // 0ab: bipush 0
      // 0ac: invokestatic JX.n ([BI)Ljava/lang/String;
      // 0af: putfield JX.B Ljava/lang/String;
      // 0b2: aload 3
      // 0b3: ifnonnull 134
      // 0b6: sipush 18503
      // 0b9: ldc2_w 3020133598380231957
      // 0bc: invokestatic JX.b (IJ)I
      // 0bf: newarray 8
      // 0c1: astore 6
      // 0c3: aload 4
      // 0c5: aload 6
      // 0c7: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 0ca: aload 0
      // 0cb: aload 6
      // 0cd: bipush 0
      // 0ce: invokestatic JX.p ([BI)Ljava/lang/String;
      // 0d1: putfield JX.B Ljava/lang/String;
      // 0d4: aload 3
      // 0d5: ifnonnull 134
      // 0d8: aload 4
      // 0da: invokevirtual java/io/DataInputStream.readUnsignedByte ()I
      // 0dd: newarray 8
      // 0df: astore 6
      // 0e1: aload 4
      // 0e3: aload 6
      // 0e5: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 0e8: aload 0
      // 0e9: new java/lang/String
      // 0ec: dup
      // 0ed: aload 6
      // 0ef: invokespecial java/lang/String.<init> ([B)V
      // 0f2: putfield JX.B Ljava/lang/String;
      // 0f5: aload 3
      // 0f6: ifnonnull 134
      // 0f9: sipush 8921
      // 0fc: ldc2_w 4355433633419224961
      // 0ff: invokestatic JX.b (IJ)I
      // 102: newarray 8
      // 104: astore 6
      // 106: aload 4
      // 108: aload 6
      // 10a: invokevirtual java/io/DataInputStream.read ([B)I
      // 10d: pop
      // 10e: aload 0
      // 10f: new java/lang/String
      // 112: dup
      // 113: aload 6
      // 115: invokespecial java/lang/String.<init> ([B)V
      // 118: putfield JX.B Ljava/lang/String;
      // 11b: aload 3
      // 11c: ifnonnull 134
      // 11f: new b5_2
      // 122: dup
      // 123: sipush 10219
      // 126: ldc2_w 5638279547643421360
      // 129: invokestatic JX.b (IJ)I
      // 12c: invokespecial b5_2.<init> (I)V
      // 12f: athrow
      // 130: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 133: athrow
      // 134: aload 0
      // 135: aload 4
      // 137: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 13a: putfield JX.R I
      // 13d: aload 0
      // 13e: getfield JX.t I
      // 141: aload 3
      // 142: ifnull 15a
      // 145: bipush 3
      // 146: if_icmpeq 171
      // 149: goto 150
      // 14c: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14f: athrow
      // 150: getstatic JX.J Z
      // 153: goto 15a
      // 156: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 159: athrow
      // 15a: ifeq 171
      // 15d: aload 0
      // 15e: aload 0
      // 15f: getfield JX.B Ljava/lang/String;
      // 162: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 165: putfield JX.e Ljava/net/InetAddress;
      // 168: goto 171
      // 16b: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 16e: athrow
      // 16f: astore 7
      // 171: return
   }

   @Override
   public void l(OutputStream param1) throws b5_2, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Jk_2.Y ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull aa
      // 08: aload 0
      // 09: getfield JX.Q [B
      // 0c: ifnonnull a2
      // 0f: goto 16
      // 12: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 2
      // 18: ifnull 50
      // 1b: goto 22
      // 1e: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 21: athrow
      // 22: getfield JX.t I
      // 25: bipush 3
      // 26: if_icmpne 48
      // 29: goto 30
      // 2c: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2f: athrow
      // 30: new JX
      // 33: dup
      // 34: aload 0
      // 35: getfield JX.r I
      // 38: aload 0
      // 39: getfield JX.B Ljava/lang/String;
      // 3c: aload 0
      // 3d: getfield JX.R I
      // 40: invokespecial JX.<init> (ILjava/lang/String;I)V
      // 43: astore 3
      // 44: aload 2
      // 45: ifnonnull 9a
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4f: athrow
      // 50: aload 2
      // 51: ifnull 99
      // 54: getfield JX.e Ljava/net/InetAddress;
      // 57: ifnonnull 86
      // 5a: goto 61
      // 5d: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 60: athrow
      // 61: aload 0
      // 62: aload 0
      // 63: getfield JX.B Ljava/lang/String;
      // 66: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 69: putfield JX.e Ljava/net/InetAddress;
      // 6c: goto 86
      // 6f: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 72: athrow
      // 73: astore 4
      // 75: new b5_2
      // 78: dup
      // 79: sipush 6512
      // 7c: ldc2_w 4940647516020300838
      // 7f: invokestatic JX.b (IJ)I
      // 82: invokespecial b5_2.<init> (I)V
      // 85: athrow
      // 86: new JX
      // 89: dup
      // 8a: aload 0
      // 8b: getfield JX.r I
      // 8e: aload 0
      // 8f: getfield JX.e Ljava/net/InetAddress;
      // 92: aload 0
      // 93: getfield JX.R I
      // 96: invokespecial JX.<init> (ILjava/net/InetAddress;I)V
      // 99: astore 3
      // 9a: aload 0
      // 9b: aload 3
      // 9c: getfield JX.Q [B
      // 9f: putfield JX.Q [B
      // a2: aload 1
      // a3: aload 0
      // a4: getfield JX.Q [B
      // a7: invokevirtual java/io/OutputStream.write ([B)V
      // aa: return
   }

   @Override
   public InetAddress g() throws UnknownHostException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Jk_2.Y ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield JX.e Ljava/net/InetAddress;
      // 08: aload 1
      // 09: ifnull 2b
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield JX.e Ljava/net/InetAddress;
      // 1a: areturn
      // 1b: invokestatic JX.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: getfield JX.B Ljava/lang/String;
      // 24: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 27: dup_x1
      // 28: putfield JX.e Ljava/net/InetAddress;
      // 2b: areturn
   }

   @Override
   public String toString() {
      return b(26360, 5575)
         + this.u
         + "\n"
         + b(26361, -7791)
         + this.r
         + "\n"
         + b(26367, 15074)
         + this.t
         + "\n"
         + b(26366, -10062)
         + this.B
         + "\n"
         + b(26364, -28341)
         + this.R
         + "\n";
   }

   public static boolean s() {
      return J;
   }

   public static boolean V(boolean var0) {
      boolean var1 = J;
      J = var0;
      return var1;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 26364) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 193;
               break;
            case 1:
               var10000 = 64;
               break;
            case 2:
               var10000 = 225;
               break;
            case 3:
               var10000 = 181;
               break;
            case 4:
               var10000 = 127;
               break;
            case 5:
               var10000 = 23;
               break;
            case 6:
               var10000 = 179;
               break;
            case 7:
               var10000 = 160;
               break;
            case 8:
               var10000 = 97;
               break;
            case 9:
               var10000 = 161;
               break;
            case 10:
               var10000 = 60;
               break;
            case 11:
               var10000 = 155;
               break;
            case 12:
               var10000 = 33;
               break;
            case 13:
               var10000 = 10;
               break;
            case 14:
               var10000 = 222;
               break;
            case 15:
               var10000 = 104;
               break;
            case 16:
               var10000 = 116;
               break;
            case 17:
               var10000 = 48;
               break;
            case 18:
               var10000 = 145;
               break;
            case 19:
               var10000 = 136;
               break;
            case 20:
               var10000 = 152;
               break;
            case 21:
               var10000 = 31;
               break;
            case 22:
               var10000 = 89;
               break;
            case 23:
               var10000 = 40;
               break;
            case 24:
               var10000 = 42;
               break;
            case 25:
               var10000 = 55;
               break;
            case 26:
               var10000 = 149;
               break;
            case 27:
               var10000 = 159;
               break;
            case 28:
               var10000 = 18;
               break;
            case 29:
               var10000 = 221;
               break;
            case 30:
               var10000 = 162;
               break;
            case 31:
               var10000 = 251;
               break;
            case 32:
               var10000 = 13;
               break;
            case 33:
               var10000 = 252;
               break;
            case 34:
               var10000 = 196;
               break;
            case 35:
               var10000 = 90;
               break;
            case 36:
               var10000 = 241;
               break;
            case 37:
               var10000 = 234;
               break;
            case 38:
               var10000 = 85;
               break;
            case 39:
               var10000 = 15;
               break;
            case 40:
               var10000 = 3;
               break;
            case 41:
               var10000 = 131;
               break;
            case 42:
               var10000 = 233;
               break;
            case 43:
               var10000 = 79;
               break;
            case 44:
               var10000 = 81;
               break;
            case 45:
               var10000 = 8;
               break;
            case 46:
               var10000 = 169;
               break;
            case 47:
               var10000 = 4;
               break;
            case 48:
               var10000 = 121;
               break;
            case 49:
               var10000 = 47;
               break;
            case 50:
               var10000 = 211;
               break;
            case 51:
               var10000 = 98;
               break;
            case 52:
               var10000 = 29;
               break;
            case 53:
               var10000 = 114;
               break;
            case 54:
               var10000 = 184;
               break;
            case 55:
               var10000 = 195;
               break;
            case 56:
               var10000 = 185;
               break;
            case 57:
               var10000 = 119;
               break;
            case 58:
               var10000 = 78;
               break;
            case 59:
               var10000 = 45;
               break;
            case 60:
               var10000 = 58;
               break;
            case 61:
               var10000 = 236;
               break;
            case 62:
               var10000 = 158;
               break;
            case 63:
               var10000 = 26;
               break;
            case 64:
               var10000 = 120;
               break;
            case 65:
               var10000 = 146;
               break;
            case 66:
               var10000 = 232;
               break;
            case 67:
               var10000 = 228;
               break;
            case 68:
               var10000 = 173;
               break;
            case 69:
               var10000 = 107;
               break;
            case 70:
               var10000 = 68;
               break;
            case 71:
               var10000 = 253;
               break;
            case 72:
               var10000 = 50;
               break;
            case 73:
               var10000 = 217;
               break;
            case 74:
               var10000 = 76;
               break;
            case 75:
               var10000 = 218;
               break;
            case 76:
               var10000 = 165;
               break;
            case 77:
               var10000 = 94;
               break;
            case 78:
               var10000 = 208;
               break;
            case 79:
               var10000 = 122;
               break;
            case 80:
               var10000 = 171;
               break;
            case 81:
               var10000 = 12;
               break;
            case 82:
               var10000 = 20;
               break;
            case 83:
               var10000 = 141;
               break;
            case 84:
               var10000 = 227;
               break;
            case 85:
               var10000 = 75;
               break;
            case 86:
               var10000 = 194;
               break;
            case 87:
               var10000 = 25;
               break;
            case 88:
               var10000 = 248;
               break;
            case 89:
               var10000 = 103;
               break;
            case 90:
               var10000 = 140;
               break;
            case 91:
               var10000 = 176;
               break;
            case 92:
               var10000 = 63;
               break;
            case 93:
               var10000 = 7;
               break;
            case 94:
               var10000 = 210;
               break;
            case 95:
               var10000 = 143;
               break;
            case 96:
               var10000 = 243;
               break;
            case 97:
               var10000 = 36;
               break;
            case 98:
               var10000 = 9;
               break;
            case 99:
               var10000 = 254;
               break;
            case 100:
               var10000 = 11;
               break;
            case 101:
               var10000 = 246;
               break;
            case 102:
               var10000 = 132;
               break;
            case 103:
               var10000 = 178;
               break;
            case 104:
               var10000 = 113;
               break;
            case 105:
               var10000 = 117;
               break;
            case 106:
               var10000 = 105;
               break;
            case 107:
               var10000 = 231;
               break;
            case 108:
               var10000 = 186;
               break;
            case 109:
               var10000 = 46;
               break;
            case 110:
               var10000 = 16;
               break;
            case 111:
               var10000 = 74;
               break;
            case 112:
               var10000 = 242;
               break;
            case 113:
               var10000 = 172;
               break;
            case 114:
               var10000 = 142;
               break;
            case 115:
               var10000 = 69;
               break;
            case 116:
               var10000 = 223;
               break;
            case 117:
               var10000 = 206;
               break;
            case 118:
               var10000 = 51;
               break;
            case 119:
               var10000 = 192;
               break;
            case 120:
               var10000 = 84;
               break;
            case 121:
               var10000 = 135;
               break;
            case 122:
               var10000 = 102;
               break;
            case 123:
               var10000 = 123;
               break;
            case 124:
               var10000 = 5;
               break;
            case 125:
               var10000 = 200;
               break;
            case 126:
               var10000 = 14;
               break;
            case 127:
               var10000 = 77;
               break;
            case 128:
               var10000 = 110;
               break;
            case 129:
               var10000 = 61;
               break;
            case 130:
               var10000 = 163;
               break;
            case 131:
               var10000 = 86;
               break;
            case 132:
               var10000 = 54;
               break;
            case 133:
               var10000 = 239;
               break;
            case 134:
               var10000 = 93;
               break;
            case 135:
               var10000 = 134;
               break;
            case 136:
               var10000 = 133;
               break;
            case 137:
               var10000 = 37;
               break;
            case 138:
               var10000 = 204;
               break;
            case 139:
               var10000 = 175;
               break;
            case 140:
               var10000 = 106;
               break;
            case 141:
               var10000 = 30;
               break;
            case 142:
               var10000 = 27;
               break;
            case 143:
               var10000 = 44;
               break;
            case 144:
               var10000 = 21;
               break;
            case 145:
               var10000 = 52;
               break;
            case 146:
               var10000 = 92;
               break;
            case 147:
               var10000 = 100;
               break;
            case 148:
               var10000 = 138;
               break;
            case 149:
               var10000 = 150;
               break;
            case 150:
               var10000 = 247;
               break;
            case 151:
               var10000 = 82;
               break;
            case 152:
               var10000 = 245;
               break;
            case 153:
               var10000 = 226;
               break;
            case 154:
               var10000 = 71;
               break;
            case 155:
               var10000 = 101;
               break;
            case 156:
               var10000 = 183;
               break;
            case 157:
               var10000 = 43;
               break;
            case 158:
               var10000 = 96;
               break;
            case 159:
               var10000 = 0;
               break;
            case 160:
               var10000 = 205;
               break;
            case 161:
               var10000 = 34;
               break;
            case 162:
               var10000 = 182;
               break;
            case 163:
               var10000 = 124;
               break;
            case 164:
               var10000 = 164;
               break;
            case 165:
               var10000 = 67;
               break;
            case 166:
               var10000 = 157;
               break;
            case 167:
               var10000 = 229;
               break;
            case 168:
               var10000 = 1;
               break;
            case 169:
               var10000 = 112;
               break;
            case 170:
               var10000 = 213;
               break;
            case 171:
               var10000 = 22;
               break;
            case 172:
               var10000 = 35;
               break;
            case 173:
               var10000 = 83;
               break;
            case 174:
               var10000 = 137;
               break;
            case 175:
               var10000 = 130;
               break;
            case 176:
               var10000 = 216;
               break;
            case 177:
               var10000 = 17;
               break;
            case 178:
               var10000 = 126;
               break;
            case 179:
               var10000 = 238;
               break;
            case 180:
               var10000 = 111;
               break;
            case 181:
               var10000 = 41;
               break;
            case 182:
               var10000 = 65;
               break;
            case 183:
               var10000 = 255;
               break;
            case 184:
               var10000 = 53;
               break;
            case 185:
               var10000 = 129;
               break;
            case 186:
               var10000 = 166;
               break;
            case 187:
               var10000 = 109;
               break;
            case 188:
               var10000 = 203;
               break;
            case 189:
               var10000 = 28;
               break;
            case 190:
               var10000 = 49;
               break;
            case 191:
               var10000 = 91;
               break;
            case 192:
               var10000 = 230;
               break;
            case 193:
               var10000 = 56;
               break;
            case 194:
               var10000 = 170;
               break;
            case 195:
               var10000 = 244;
               break;
            case 196:
               var10000 = 147;
               break;
            case 197:
               var10000 = 70;
               break;
            case 198:
               var10000 = 2;
               break;
            case 199:
               var10000 = 118;
               break;
            case 200:
               var10000 = 108;
               break;
            case 201:
               var10000 = 39;
               break;
            case 202:
               var10000 = 128;
               break;
            case 203:
               var10000 = 188;
               break;
            case 204:
               var10000 = 115;
               break;
            case 205:
               var10000 = 212;
               break;
            case 206:
               var10000 = 167;
               break;
            case 207:
               var10000 = 32;
               break;
            case 208:
               var10000 = 190;
               break;
            case 209:
               var10000 = 214;
               break;
            case 210:
               var10000 = 201;
               break;
            case 211:
               var10000 = 240;
               break;
            case 212:
               var10000 = 174;
               break;
            case 213:
               var10000 = 154;
               break;
            case 214:
               var10000 = 151;
               break;
            case 215:
               var10000 = 198;
               break;
            case 216:
               var10000 = 220;
               break;
            case 217:
               var10000 = 148;
               break;
            case 218:
               var10000 = 189;
               break;
            case 219:
               var10000 = 219;
               break;
            case 220:
               var10000 = 237;
               break;
            case 221:
               var10000 = 72;
               break;
            case 222:
               var10000 = 249;
               break;
            case 223:
               var10000 = 177;
               break;
            case 224:
               var10000 = 144;
               break;
            case 225:
               var10000 = 24;
               break;
            case 226:
               var10000 = 191;
               break;
            case 227:
               var10000 = 80;
               break;
            case 228:
               var10000 = 95;
               break;
            case 229:
               var10000 = 235;
               break;
            case 230:
               var10000 = 59;
               break;
            case 231:
               var10000 = 224;
               break;
            case 232:
               var10000 = 87;
               break;
            case 233:
               var10000 = 207;
               break;
            case 234:
               var10000 = 197;
               break;
            case 235:
               var10000 = 180;
               break;
            case 236:
               var10000 = 215;
               break;
            case 237:
               var10000 = 209;
               break;
            case 238:
               var10000 = 73;
               break;
            case 239:
               var10000 = 199;
               break;
            case 240:
               var10000 = 99;
               break;
            case 241:
               var10000 = 168;
               break;
            case 242:
               var10000 = 156;
               break;
            case 243:
               var10000 = 38;
               break;
            case 244:
               var10000 = 66;
               break;
            case 245:
               var10000 = 202;
               break;
            case 246:
               var10000 = 250;
               break;
            case 247:
               var10000 = 6;
               break;
            case 248:
               var10000 = 57;
               break;
            case 249:
               var10000 = 125;
               break;
            case 250:
               var10000 = 139;
               break;
            case 251:
               var10000 = 62;
               break;
            case 252:
               var10000 = 88;
               break;
            case 253:
               var10000 = 19;
               break;
            case 254:
               var10000 = 187;
               break;
            default:
               var10000 = 153;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17745;
      if (i[var3] == null) {
         i[var3] = (int)(h[var3] ^ var1);
      }

      return i[var3];
   }
}





