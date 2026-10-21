import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Hashtable;

public class c extends y_2 implements Cloneable {
   private Hashtable H = new Hashtable();
   private int K;
   boolean j = true;
   uu_4 W = null;
   private static final String[] d;
   private static final String[] e;
   private static final long[] h;
   private static final Integer[] i;

   public c(y_2 var1, String var2, int var3) throws UnknownHostException {
      super(var1, var2, var3);
      this.w = b(7178, 2947374852290529917L);
      this.d(0, new a1());
   }

   public c(String var1, int var2) throws UnknownHostException {
      this(null, var1, var2);
   }

   public c(y_2 var1, InetAddress var2, int var3) {
      super(var1, var2, var3);
      this.w = b(27710, 3139939222662888000L);
      this.d(0, new a1());
   }

   public c(InetAddress var1, int var2) {
      this(null, var1, var2);
   }

   public boolean Z(boolean var1) {
      boolean var2 = this.j;
      this.j = var1;
      return var2;
   }

   public boolean D() {
      return this.j;
   }

   public boolean d(int var1, xz_2 var2) {
      String[] var3 = Jk_2.Y();
      int var10000 = var1;
      if (var3 != null) {
         if (var1 >= 0) {
            if (var3 == null) {
               return (boolean)var1;
            }

            if (var1 <= b(20761, 8450746254538540900L)) {
               if (var3 != null) {
                  if (var2 == null) {
                     if (this.H.remove(new Integer(var1)) != null) {
                        return true;
                     }

                     return false;
                  }

                  this.H.put(new Integer(var1), var2);
               }

               return true;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   public xz_2 M(int var1) {
      String[] var10000 = Jk_2.Y();
      Object var3 = this.H.get(new Integer(var1));
      String[] var2 = var10000;
      var10000 = (String[])var3;
      if (var2 != null) {
         if (var3 == null) {
            return null;
         }

         var10000 = (String[])var3;
      }

      return (xz_2)var10000;
   }

   @Override
   public Object clone() {
      c var1 = new c(this.v, this.k);
      var1.H = (Hashtable)this.H.clone();
      var1.s = (TR)this.s.clone();
      var1.j = this.j;
      var1.T = this.T;
      return var1;
   }

   @Override
   protected y_2 B() {
      c var1 = new c(this.v, this.k);
      var1.H = this.H;
      var1.s = this.s;
      var1.T = this.T;
      var1.j = this.j;
      return var1;
   }

   @Override
   protected void m() throws b5_2 {
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
      // 004: invokespecial y_2.m ()V
      // 007: aload 0
      // 008: getfield c.Y Ljava/net/Socket;
      // 00b: astore 3
      // 00c: astore 1
      // 00d: aload 0
      // 00e: getfield c.H Ljava/util/Hashtable;
      // 011: invokevirtual java/util/Hashtable.size ()I
      // 014: i2b
      // 015: istore 4
      // 017: bipush 2
      // 018: iload 4
      // 01a: iadd
      // 01b: newarray 8
      // 01d: astore 5
      // 01f: aload 5
      // 021: bipush 0
      // 022: aload 0
      // 023: getfield c.w I
      // 026: i2b
      // 027: bastore
      // 028: aload 5
      // 02a: bipush 1
      // 02b: iload 4
      // 02d: bastore
      // 02e: bipush 2
      // 02f: istore 6
      // 031: aload 0
      // 032: getfield c.H Ljava/util/Hashtable;
      // 035: invokevirtual java/util/Hashtable.keys ()Ljava/util/Enumeration;
      // 038: astore 7
      // 03a: aload 1
      // 03b: ifnonnull 05b
      // 03e: aload 5
      // 040: iload 6
      // 042: iinc 6 1
      // 045: aload 7
      // 047: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 04c: checkcast java/lang/Integer
      // 04f: invokevirtual java/lang/Integer.intValue ()I
      // 052: i2b
      // 053: bastore
      // 054: goto 05b
      // 057: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05a: athrow
      // 05b: aload 7
      // 05d: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 062: ifne 03e
      // 065: aload 0
      // 066: getfield c.I Ljava/io/OutputStream;
      // 069: aload 5
      // 06b: invokevirtual java/io/OutputStream.write ([B)V
      // 06e: aload 0
      // 06f: getfield c.I Ljava/io/OutputStream;
      // 072: invokevirtual java/io/OutputStream.flush ()V
      // 075: aload 0
      // 076: getfield c.L Ljava/io/InputStream;
      // 079: invokevirtual java/io/InputStream.read ()I
      // 07c: istore 8
      // 07e: aload 0
      // 07f: aload 0
      // 080: getfield c.L Ljava/io/InputStream;
      // 083: invokevirtual java/io/InputStream.read ()I
      // 086: putfield c.K I
      // 089: aload 1
      // 08a: ifnull 0bd
      // 08d: iload 8
      // 08f: iflt 0b2
      // 092: goto 099
      // 095: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield c.K I
      // 09d: aload 1
      // 09e: ifnull 0e6
      // 0a1: goto 0a8
      // 0a4: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0a7: athrow
      // 0a8: ifge 0d7
      // 0ab: goto 0b2
      // 0ae: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: invokevirtual c.F ()V
      // 0b6: goto 0bd
      // 0b9: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0bc: athrow
      // 0bd: new b5_2
      // 0c0: dup
      // 0c1: sipush 18560
      // 0c4: ldc2_w 5956174054630629119
      // 0c7: invokestatic c.b (IJ)I
      // 0ca: sipush 29408
      // 0cd: sipush -5474
      // 0d0: invokestatic c.b (II)Ljava/lang/String;
      // 0d3: invokespecial b5_2.<init> (ILjava/lang/String;)V
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: ifnull 10c
      // 0dc: getfield c.K I
      // 0df: goto 0e6
      // 0e2: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e5: athrow
      // 0e6: sipush 21839
      // 0e9: ldc2_w 6136836134469698357
      // 0ec: invokestatic c.b (IJ)I
      // 0ef: if_icmpne 10b
      // 0f2: aload 3
      // 0f3: invokevirtual java/net/Socket.close ()V
      // 0f6: new b5_2
      // 0f9: dup
      // 0fa: sipush 29934
      // 0fd: ldc2_w 80994870942737048
      // 100: invokestatic c.b (IJ)I
      // 103: invokespecial b5_2.<init> (I)V
      // 106: athrow
      // 107: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 10a: athrow
      // 10b: aload 0
      // 10c: aload 0
      // 10d: getfield c.K I
      // 110: invokevirtual c.M (I)Lxz_2;
      // 113: astore 2
      // 114: aload 2
      // 115: aload 1
      // 116: ifnull 142
      // 119: ifnonnull 141
      // 11c: goto 123
      // 11f: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 122: athrow
      // 123: new b5_2
      // 126: dup
      // 127: sipush 27952
      // 12a: ldc2_w 1698213409648196425
      // 12d: invokestatic c.b (IJ)I
      // 130: sipush 29409
      // 133: sipush -19432
      // 136: invokestatic c.b (II)Ljava/lang/String;
      // 139: invokespecial b5_2.<init> (ILjava/lang/String;)V
      // 13c: athrow
      // 13d: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 140: athrow
      // 141: aload 2
      // 142: aload 0
      // 143: getfield c.K I
      // 146: aload 3
      // 147: invokeinterface xz_2.J (ILjava/net/Socket;)[Ljava/lang/Object; 3
      // 14c: astore 9
      // 14e: aload 9
      // 150: aload 1
      // 151: ifnull 196
      // 154: ifnonnull 173
      // 157: goto 15e
      // 15a: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15d: athrow
      // 15e: new b5_2
      // 161: dup
      // 162: sipush 24646
      // 165: ldc2_w 7010487334507263546
      // 168: invokestatic c.b (IJ)I
      // 16b: invokespecial b5_2.<init> (I)V
      // 16e: athrow
      // 16f: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 172: athrow
      // 173: aload 0
      // 174: aload 9
      // 176: bipush 0
      // 177: aaload
      // 178: checkcast java/io/InputStream
      // 17b: putfield c.L Ljava/io/InputStream;
      // 17e: aload 0
      // 17f: aload 9
      // 181: bipush 1
      // 182: aaload
      // 183: checkcast java/io/OutputStream
      // 186: putfield c.I Ljava/io/OutputStream;
      // 189: aload 1
      // 18a: ifnull 1ad
      // 18d: aload 9
      // 18f: goto 196
      // 192: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 195: athrow
      // 196: arraylength
      // 197: bipush 2
      // 198: if_icmple 1fd
      // 19b: aload 0
      // 19c: aload 9
      // 19e: bipush 2
      // 19f: aaload
      // 1a0: checkcast uu_4
      // 1a3: putfield c.W Luu_4;
      // 1a6: goto 1ad
      // 1a9: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1ac: athrow
      // 1ad: goto 1fd
      // 1b0: astore 4
      // 1b2: aload 4
      // 1b4: athrow
      // 1b5: astore 4
      // 1b7: new b5_2
      // 1ba: dup
      // 1bb: sipush 12656
      // 1be: ldc2_w 124191620702791435
      // 1c1: invokestatic c.b (IJ)I
      // 1c4: invokespecial b5_2.<init> (I)V
      // 1c7: athrow
      // 1c8: astore 4
      // 1ca: new b5_2
      // 1cd: dup
      // 1ce: sipush 16096
      // 1d1: ldc2_w 9071453411824560280
      // 1d4: invokestatic c.b (IJ)I
      // 1d7: invokespecial b5_2.<init> (I)V
      // 1da: athrow
      // 1db: astore 4
      // 1dd: new b5_2
      // 1e0: dup
      // 1e1: sipush 15381
      // 1e4: ldc2_w 5338378050415422049
      // 1e7: invokestatic c.b (IJ)I
      // 1ea: new java/lang/StringBuilder
      // 1ed: dup
      // 1ee: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f1: aload 4
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f9: invokespecial b5_2.<init> (ILjava/lang/String;)V
      // 1fc: athrow
      // 1fd: invokestatic com/ky_4.F ()[Ljava/lang/String;
      // 200: ifnull 211
      // 203: bipush 3
      // 204: anewarray 241
      // 207: invokestatic Jk_2.p ([Ljava/lang/String;)V
      // 20a: goto 211
      // 20d: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 210: athrow
      // 211: return
   }

   @Override
   protected Jk_2 k(int var1, InetAddress var2, int var3) {
      return new JX(var1, var2, var3);
   }

   @Override
   protected Jk_2 Q(int param1, String param2, int param3) throws UnknownHostException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Jk_2.Y ()[Ljava/lang/String;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnull 20
      // 0b: getfield c.j Z
      // 0e: ifeq 2a
      // 11: goto 18
      // 14: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic c.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1f: athrow
      // 20: iload 1
      // 21: aload 2
      // 22: invokestatic java/net/InetAddress.getByName (Ljava/lang/String;)Ljava/net/InetAddress;
      // 25: iload 3
      // 26: invokevirtual c.k (ILjava/net/InetAddress;I)LJk_2;
      // 29: areturn
      // 2a: new JX
      // 2d: dup
      // 2e: iload 1
      // 2f: aload 2
      // 30: iload 3
      // 31: invokespecial JX.<init> (ILjava/lang/String;I)V
      // 34: areturn
   }

   @Override
   protected Jk_2 o(InputStream var1) throws b5_2, IOException {
      return new JX(var1);
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "Ù\u008cÉ5òpX\u000e1Ov+#\\wáK8È\"\u0018\u009fÒÈÉÐHu~ùýÍ\u000béú\u001f\u0019d\u0086g\u0085AÌ±_VoÑQÍÔë9ÂÚÈ°\u0007ý\u0087çz";
      int var12 = "Ù\u008cÉ5òpX\u000e1Ov+#\\wáK8È\"\u0018\u009fÒÈÉÐHu~ùýÍ\u000béú\u001f\u0019d\u0086g\u0085AÌ±_VoÑQÍÔë9ÂÚÈ°\u0007ý\u0087çz".length();
      char var9 = '$';
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 123;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 123;
               var10006 = var14;
            } else {
               var27 = 123;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 123;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 20;
                     break;
                  case 1:
                     var47 = 6;
                     break;
                  case 2:
                     var47 = 56;
                     break;
                  case 3:
                     var47 = 109;
                     break;
                  case 4:
                     var47 = 120;
                     break;
                  case 5:
                     var47 = 5;
                     break;
                  default:
                     var47 = 63;
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
            d = var13;
            e = new String[2];
            long var0 = 4815226651916615240L;
            long[] var6 = new long[11];
            int var3 = 0;
            String var4 = "\u009c?je\u008bX\u0084\r«å\u0081\u0081nÐ ·¯$\u0089×ßÐ\u0088r§äC\u0001xÀ9Ó)\u0097ý\u001c\u009b¢½\u0082\u0080ÝÍqHhYCEj\u008d\u009et7VÐY\u009aY \u008e\u009f\u0005\u0001éDDç[T\u001cÐ";
            int var5 = "\u009c?je\u008bX\u0084\r«å\u0081\u0081nÐ ·¯$\u0089×ßÐ\u0088r§äC\u0001xÀ9Ó)\u0097ý\u001c\u009b¢½\u0082\u0080ÝÍqHhYCEj\u008d\u009et7VÐY\u009aY \u008e\u009f\u0005\u0001éDDç[T\u001cÐ"
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
                           h = var6;
                           i = new Integer[11];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "5ª\\*FÉô0\u009f\u0085K\u001d?¸T)";
                        var5 = "5ª\\*FÉô0\u009f\u0085K\u001d?¸T)".length();
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

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 29409) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 20;
               break;
            case 1:
               var10000 = 141;
               break;
            case 2:
               var10000 = 169;
               break;
            case 3:
               var10000 = 153;
               break;
            case 4:
               var10000 = 47;
               break;
            case 5:
               var10000 = 235;
               break;
            case 6:
               var10000 = 234;
               break;
            case 7:
               var10000 = 67;
               break;
            case 8:
               var10000 = 26;
               break;
            case 9:
               var10000 = 202;
               break;
            case 10:
               var10000 = 179;
               break;
            case 11:
               var10000 = 86;
               break;
            case 12:
               var10000 = 94;
               break;
            case 13:
               var10000 = 209;
               break;
            case 14:
               var10000 = 66;
               break;
            case 15:
               var10000 = 198;
               break;
            case 16:
               var10000 = 77;
               break;
            case 17:
               var10000 = 132;
               break;
            case 18:
               var10000 = 65;
               break;
            case 19:
               var10000 = 163;
               break;
            case 20:
               var10000 = 173;
               break;
            case 21:
               var10000 = 109;
               break;
            case 22:
               var10000 = 116;
               break;
            case 23:
               var10000 = 7;
               break;
            case 24:
               var10000 = 115;
               break;
            case 25:
               var10000 = 155;
               break;
            case 26:
               var10000 = 233;
               break;
            case 27:
               var10000 = 45;
               break;
            case 28:
               var10000 = 2;
               break;
            case 29:
               var10000 = 199;
               break;
            case 30:
               var10000 = 52;
               break;
            case 31:
               var10000 = 101;
               break;
            case 32:
               var10000 = 60;
               break;
            case 33:
               var10000 = 57;
               break;
            case 34:
               var10000 = 5;
               break;
            case 35:
               var10000 = 4;
               break;
            case 36:
               var10000 = 193;
               break;
            case 37:
               var10000 = 224;
               break;
            case 38:
               var10000 = 42;
               break;
            case 39:
               var10000 = 194;
               break;
            case 40:
               var10000 = 108;
               break;
            case 41:
               var10000 = 114;
               break;
            case 42:
               var10000 = 72;
               break;
            case 43:
               var10000 = 61;
               break;
            case 44:
               var10000 = 232;
               break;
            case 45:
               var10000 = 75;
               break;
            case 46:
               var10000 = 99;
               break;
            case 47:
               var10000 = 76;
               break;
            case 48:
               var10000 = 92;
               break;
            case 49:
               var10000 = 150;
               break;
            case 50:
               var10000 = 212;
               break;
            case 51:
               var10000 = 107;
               break;
            case 52:
               var10000 = 37;
               break;
            case 53:
               var10000 = 227;
               break;
            case 54:
               var10000 = 55;
               break;
            case 55:
               var10000 = 39;
               break;
            case 56:
               var10000 = 17;
               break;
            case 57:
               var10000 = 118;
               break;
            case 58:
               var10000 = 1;
               break;
            case 59:
               var10000 = 113;
               break;
            case 60:
               var10000 = 166;
               break;
            case 61:
               var10000 = 81;
               break;
            case 62:
               var10000 = 127;
               break;
            case 63:
               var10000 = 139;
               break;
            case 64:
               var10000 = 69;
               break;
            case 65:
               var10000 = 236;
               break;
            case 66:
               var10000 = 143;
               break;
            case 67:
               var10000 = 211;
               break;
            case 68:
               var10000 = 200;
               break;
            case 69:
               var10000 = 134;
               break;
            case 70:
               var10000 = 63;
               break;
            case 71:
               var10000 = 124;
               break;
            case 72:
               var10000 = 49;
               break;
            case 73:
               var10000 = 222;
               break;
            case 74:
               var10000 = 130;
               break;
            case 75:
               var10000 = 58;
               break;
            case 76:
               var10000 = 160;
               break;
            case 77:
               var10000 = 196;
               break;
            case 78:
               var10000 = 243;
               break;
            case 79:
               var10000 = 29;
               break;
            case 80:
               var10000 = 136;
               break;
            case 81:
               var10000 = 100;
               break;
            case 82:
               var10000 = 64;
               break;
            case 83:
               var10000 = 119;
               break;
            case 84:
               var10000 = 245;
               break;
            case 85:
               var10000 = 79;
               break;
            case 86:
               var10000 = 241;
               break;
            case 87:
               var10000 = 207;
               break;
            case 88:
               var10000 = 95;
               break;
            case 89:
               var10000 = 181;
               break;
            case 90:
               var10000 = 71;
               break;
            case 91:
               var10000 = 28;
               break;
            case 92:
               var10000 = 16;
               break;
            case 93:
               var10000 = 210;
               break;
            case 94:
               var10000 = 170;
               break;
            case 95:
               var10000 = 25;
               break;
            case 96:
               var10000 = 220;
               break;
            case 97:
               var10000 = 84;
               break;
            case 98:
               var10000 = 214;
               break;
            case 99:
               var10000 = 178;
               break;
            case 100:
               var10000 = 203;
               break;
            case 101:
               var10000 = 177;
               break;
            case 102:
               var10000 = 148;
               break;
            case 103:
               var10000 = 197;
               break;
            case 104:
               var10000 = 225;
               break;
            case 105:
               var10000 = 248;
               break;
            case 106:
               var10000 = 146;
               break;
            case 107:
               var10000 = 186;
               break;
            case 108:
               var10000 = 38;
               break;
            case 109:
               var10000 = 70;
               break;
            case 110:
               var10000 = 15;
               break;
            case 111:
               var10000 = 230;
               break;
            case 112:
               var10000 = 105;
               break;
            case 113:
               var10000 = 239;
               break;
            case 114:
               var10000 = 242;
               break;
            case 115:
               var10000 = 255;
               break;
            case 116:
               var10000 = 247;
               break;
            case 117:
               var10000 = 80;
               break;
            case 118:
               var10000 = 11;
               break;
            case 119:
               var10000 = 53;
               break;
            case 120:
               var10000 = 3;
               break;
            case 121:
               var10000 = 122;
               break;
            case 122:
               var10000 = 33;
               break;
            case 123:
               var10000 = 162;
               break;
            case 124:
               var10000 = 254;
               break;
            case 125:
               var10000 = 215;
               break;
            case 126:
               var10000 = 9;
               break;
            case 127:
               var10000 = 190;
               break;
            case 128:
               var10000 = 147;
               break;
            case 129:
               var10000 = 213;
               break;
            case 130:
               var10000 = 90;
               break;
            case 131:
               var10000 = 43;
               break;
            case 132:
               var10000 = 184;
               break;
            case 133:
               var10000 = 240;
               break;
            case 134:
               var10000 = 183;
               break;
            case 135:
               var10000 = 22;
               break;
            case 136:
               var10000 = 23;
               break;
            case 137:
               var10000 = 102;
               break;
            case 138:
               var10000 = 13;
               break;
            case 139:
               var10000 = 0;
               break;
            case 140:
               var10000 = 171;
               break;
            case 141:
               var10000 = 174;
               break;
            case 142:
               var10000 = 144;
               break;
            case 143:
               var10000 = 24;
               break;
            case 144:
               var10000 = 133;
               break;
            case 145:
               var10000 = 96;
               break;
            case 146:
               var10000 = 83;
               break;
            case 147:
               var10000 = 106;
               break;
            case 148:
               var10000 = 50;
               break;
            case 149:
               var10000 = 85;
               break;
            case 150:
               var10000 = 182;
               break;
            case 151:
               var10000 = 237;
               break;
            case 152:
               var10000 = 218;
               break;
            case 153:
               var10000 = 192;
               break;
            case 154:
               var10000 = 103;
               break;
            case 155:
               var10000 = 151;
               break;
            case 156:
               var10000 = 87;
               break;
            case 157:
               var10000 = 161;
               break;
            case 158:
               var10000 = 149;
               break;
            case 159:
               var10000 = 152;
               break;
            case 160:
               var10000 = 189;
               break;
            case 161:
               var10000 = 62;
               break;
            case 162:
               var10000 = 229;
               break;
            case 163:
               var10000 = 164;
               break;
            case 164:
               var10000 = 253;
               break;
            case 165:
               var10000 = 88;
               break;
            case 166:
               var10000 = 137;
               break;
            case 167:
               var10000 = 12;
               break;
            case 168:
               var10000 = 158;
               break;
            case 169:
               var10000 = 216;
               break;
            case 170:
               var10000 = 73;
               break;
            case 171:
               var10000 = 10;
               break;
            case 172:
               var10000 = 19;
               break;
            case 173:
               var10000 = 97;
               break;
            case 174:
               var10000 = 14;
               break;
            case 175:
               var10000 = 219;
               break;
            case 176:
               var10000 = 250;
               break;
            case 177:
               var10000 = 223;
               break;
            case 178:
               var10000 = 204;
               break;
            case 179:
               var10000 = 117;
               break;
            case 180:
               var10000 = 111;
               break;
            case 181:
               var10000 = 112;
               break;
            case 182:
               var10000 = 51;
               break;
            case 183:
               var10000 = 228;
               break;
            case 184:
               var10000 = 221;
               break;
            case 185:
               var10000 = 59;
               break;
            case 186:
               var10000 = 246;
               break;
            case 187:
               var10000 = 231;
               break;
            case 188:
               var10000 = 35;
               break;
            case 189:
               var10000 = 195;
               break;
            case 190:
               var10000 = 78;
               break;
            case 191:
               var10000 = 31;
               break;
            case 192:
               var10000 = 217;
               break;
            case 193:
               var10000 = 167;
               break;
            case 194:
               var10000 = 154;
               break;
            case 195:
               var10000 = 32;
               break;
            case 196:
               var10000 = 91;
               break;
            case 197:
               var10000 = 131;
               break;
            case 198:
               var10000 = 74;
               break;
            case 199:
               var10000 = 89;
               break;
            case 200:
               var10000 = 156;
               break;
            case 201:
               var10000 = 27;
               break;
            case 202:
               var10000 = 138;
               break;
            case 203:
               var10000 = 145;
               break;
            case 204:
               var10000 = 125;
               break;
            case 205:
               var10000 = 176;
               break;
            case 206:
               var10000 = 68;
               break;
            case 207:
               var10000 = 56;
               break;
            case 208:
               var10000 = 41;
               break;
            case 209:
               var10000 = 185;
               break;
            case 210:
               var10000 = 205;
               break;
            case 211:
               var10000 = 188;
               break;
            case 212:
               var10000 = 165;
               break;
            case 213:
               var10000 = 120;
               break;
            case 214:
               var10000 = 30;
               break;
            case 215:
               var10000 = 157;
               break;
            case 216:
               var10000 = 251;
               break;
            case 217:
               var10000 = 201;
               break;
            case 218:
               var10000 = 175;
               break;
            case 219:
               var10000 = 159;
               break;
            case 220:
               var10000 = 98;
               break;
            case 221:
               var10000 = 180;
               break;
            case 222:
               var10000 = 187;
               break;
            case 223:
               var10000 = 44;
               break;
            case 224:
               var10000 = 93;
               break;
            case 225:
               var10000 = 135;
               break;
            case 226:
               var10000 = 206;
               break;
            case 227:
               var10000 = 142;
               break;
            case 228:
               var10000 = 249;
               break;
            case 229:
               var10000 = 21;
               break;
            case 230:
               var10000 = 6;
               break;
            case 231:
               var10000 = 36;
               break;
            case 232:
               var10000 = 238;
               break;
            case 233:
               var10000 = 18;
               break;
            case 234:
               var10000 = 48;
               break;
            case 235:
               var10000 = 252;
               break;
            case 236:
               var10000 = 129;
               break;
            case 237:
               var10000 = 82;
               break;
            case 238:
               var10000 = 168;
               break;
            case 239:
               var10000 = 121;
               break;
            case 240:
               var10000 = 46;
               break;
            case 241:
               var10000 = 40;
               break;
            case 242:
               var10000 = 244;
               break;
            case 243:
               var10000 = 104;
               break;
            case 244:
               var10000 = 110;
               break;
            case 245:
               var10000 = 208;
               break;
            case 246:
               var10000 = 123;
               break;
            case 247:
               var10000 = 34;
               break;
            case 248:
               var10000 = 8;
               break;
            case 249:
               var10000 = 172;
               break;
            case 250:
               var10000 = 126;
               break;
            case 251:
               var10000 = 191;
               break;
            case 252:
               var10000 = 226;
               break;
            case 253:
               var10000 = 140;
               break;
            case 254:
               var10000 = 54;
               break;
            default:
               var10000 = 128;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22142;
      if (i[var3] == null) {
         i[var3] = (int)(h[var3] ^ var1);
      }

      return i[var3];
   }
}





