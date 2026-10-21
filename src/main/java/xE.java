import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class xE implements Bk_2 {
   static EventLoopGroup g;
   static Bootstrap c;
   int P;
   String d;
   String K;
   String G;
   int C;
   String v;
   String A;
   Bk_2 U;
   Channel D;
   Yu_2 w = new Yu_2();
   BA Q;
   ArrayList h;
   HashMap u;
   VD q;
   boolean I;
   boolean e;
   private static int s;
   private static final String[] a;
   private static final String[] b;
   private static final long f;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var7 = new String[12];
      int var5 = 0;
      String var4 = "\u009e\u0016Ö1\u0011b¦\u0013f\f\u0089w¤Vâàæ\u0018¯ÞSÙ¶å°üÐ\u000e\u008aoË\u0015\u0087Ü\u008c¶\u007f\u0013Ðü\u001c\u0086\tµ°ÍùÁª}\u0093\u0018\u0003\n\u0007\u001d\u000etÉ¹Y\u0095ª@{®¢£/\u000bë\tk+\u0016\u008aºÄ\u0012^õ\u000emö\u009a¾ñVÌä?Q\u0091QM$\u000b\u0002c;\u0083\u001få¦\u007fni\u00ad\u000b1n]\"ÓÑ?üZ©×";
      int var6 = "\u009e\u0016Ö1\u0011b¦\u0013f\f\u0089w¤Vâàæ\u0018¯ÞSÙ¶å°üÐ\u000e\u008aoË\u0015\u0087Ü\u008c¶\u007f\u0013Ðü\u001c\u0086\tµ°ÍùÁª}\u0093\u0018\u0003\n\u0007\u001d\u000etÉ¹Y\u0095ª@{®¢£/\u000bë\tk+\u0016\u008aºÄ\u0012^õ\u000emö\u009a¾ñVÌä?Q\u0091QM$\u000b\u0002c;\u0083\u001få¦\u007fni\u00ad\u000b1n]\"ÓÑ?üZ©×"
         .length();
      R(0);
      char var3 = 7;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 105;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  var40[var10006] = (char)(var40[var10006] ^ var36 ^ switch (var8 % 7) {
                     case 0 -> 80;
                     case 1 -> 105;
                     case 2 -> 90;
                     case 3 -> 57;
                     case 4 -> 46;
                     case 5 -> 60;
                     default -> 82;
                  });
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     b = new String[12];
                     long var0 = 9079262986183371831L;
                     long var27 = -56176067801519070L ^ var0;
                     byte var18 = -1;
                     f = var27;
                     g = new NioEventLoopGroup();
                     c = new Bootstrap();
                     c.group(g).channel(NioSocketChannel.class).option(ChannelOption.TCP_NODELAY, Boolean.valueOf(true)).handler(new aO());
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "XÓ¸hÉ\u009f`S\u000bùÞD4ð\u0013[£Ù®C";
                  var6 = "XÓ¸hÉ\u009f`S\u000bùÞD4ð\u0013[£Ù®C".length();
                  var3 = '\b';
                  var10 = -1;
            }

            var10000 = 105;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }

   public static void main(String[] var0) {
      long var1 = System.currentTimeMillis();
      xE var3 = new xE(a(-24973, 8374), (int)f, a(-24972, 26842), a(-24975, 3481));
      var3.X(true);
      var3.c();
      var3.U(new l1_2(var3));
   }

   public xE(String var1, int var2, String var3, String var4) {
      int var10000 = D();
      this.h = new ArrayList();
      this.u = new HashMap();
      this.q = null;
      this.I = true;
      this.e = false;
      this.d = var1;
      int var5 = var10000;
      this.P = var2;
      this.v = var3;
      this.K = var4;
      if (com.ky_4.F() != null) {
         R(++var5);
      }
   }

   public void c() {
      ChannelFuture var1 = c.connect(this.d, this.P);
      var1.addListener(new CI(this)).channel().attr(BA.i).set(this);
      this.D = var1.channel();
   }

   public void n() {
      int var1 = I();
      Channel var10000 = this.D;
      if (var1 != 0) {
         if (this.D == null) {
            return;
         }

         var10000 = this.D;
      }

      var10000.close();
   }

   @Override
   public void d(xU param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic xE.I ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 01e
      // 009: getfield xE.Q LBA;
      // 00c: ifnonnull 035
      // 00f: goto 016
      // 012: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 015: athrow
      // 016: aload 0
      // 017: goto 01e
      // 01a: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield xE.D Lio/netty/channel/Channel;
      // 022: getstatic BA.j Lio/netty/util/AttributeKey;
      // 025: invokeinterface io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; 2
      // 02a: invokeinterface io/netty/util/Attribute.get ()Ljava/lang/Object; 1
      // 02f: checkcast BA
      // 032: putfield xE.Q LBA;
      // 035: aload 1
      // 036: invokestatic ai_2.L (LxU;)Lcom/O0;
      // 039: astore 3
      // 03a: aload 3
      // 03b: sipush -24962
      // 03e: sipush 3963
      // 041: invokestatic xE.a (II)Ljava/lang/String;
      // 044: invokevirtual com/O0.C (Ljava/lang/String;)Ljava/lang/String;
      // 047: astore 4
      // 049: aload 4
      // 04b: sipush -24971
      // 04e: sipush -8028
      // 051: invokestatic xE.a (II)Ljava/lang/String;
      // 054: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 057: iload 2
      // 058: ifeq 0ec
      // 05b: ifeq 0d7
      // 05e: goto 065
      // 061: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 064: athrow
      // 065: new org/icmp4j/j
      // 068: dup
      // 069: invokespecial org/icmp4j/j.<init> ()V
      // 06c: astore 5
      // 06e: aload 5
      // 070: aload 3
      // 071: sipush -24976
      // 074: sipush 14856
      // 077: invokestatic xE.a (II)Ljava/lang/String;
      // 07a: invokevirtual com/O0.b (Ljava/lang/String;)I
      // 07d: invokevirtual org/icmp4j/j.w (I)V
      // 080: aload 5
      // 082: bipush 1
      // 083: invokevirtual org/icmp4j/j.P (Z)V
      // 086: iload 2
      // 087: ifeq 0b0
      // 08a: aload 5
      // 08c: invokevirtual org/icmp4j/j.r ()I
      // 08f: bipush -1
      // 090: if_icmple 0a7
      // 093: goto 09a
      // 096: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 099: athrow
      // 09a: aload 5
      // 09c: bipush 1
      // 09d: invokevirtual org/icmp4j/j.v (Z)V
      // 0a0: goto 0a7
      // 0a3: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield xE.w LYu_2;
      // 0ab: aload 5
      // 0ad: invokevirtual Yu_2.T (Lorg/icmp4j/j;)V
      // 0b0: aload 0
      // 0b1: getfield xE.U LBk_2;
      // 0b4: iload 2
      // 0b5: ifeq 0cd
      // 0b8: ifnull 263
      // 0bb: goto 0c2
      // 0be: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield xE.U LBk_2;
      // 0c6: goto 0cd
      // 0c9: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 0cc: athrow
      // 0cd: aload 1
      // 0ce: invokeinterface Bk_2.d (LxU;)V 2
      // 0d3: iload 2
      // 0d4: ifne 263
      // 0d7: aload 4
      // 0d9: sipush -24963
      // 0dc: sipush 22985
      // 0df: invokestatic xE.a (II)Ljava/lang/String;
      // 0e2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e5: goto 0ec
      // 0e8: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 0eb: athrow
      // 0ec: iload 2
      // 0ed: ifeq 105
      // 0f0: ifeq 263
      // 0f3: goto 0fa
      // 0f6: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: getfield xE.e Z
      // 0fe: goto 105
      // 101: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 104: athrow
      // 105: ifne 263
      // 108: aload 3
      // 109: astore 5
      // 10b: aload 5
      // 10d: sipush -24969
      // 110: sipush 10322
      // 113: invokestatic xE.a (II)Ljava/lang/String;
      // 116: invokevirtual com/O0.C (Ljava/lang/String;)Ljava/lang/String;
      // 119: astore 6
      // 11b: aload 5
      // 11d: sipush -24970
      // 120: sipush 9457
      // 123: invokestatic xE.a (II)Ljava/lang/String;
      // 126: invokevirtual com/O0.C (Ljava/lang/String;)Ljava/lang/String;
      // 129: astore 7
      // 12b: aload 5
      // 12d: sipush -24964
      // 130: sipush 29878
      // 133: invokestatic xE.a (II)Ljava/lang/String;
      // 136: invokevirtual com/O0.J (Ljava/lang/String;)Lcom/Oc_2;
      // 139: astore 8
      // 13b: aload 0
      // 13c: getfield xE.h Ljava/util/ArrayList;
      // 13f: invokevirtual java/util/ArrayList.clear ()V
      // 142: aload 0
      // 143: getfield xE.u Ljava/util/HashMap;
      // 146: invokevirtual java/util/HashMap.clear ()V
      // 149: aload 0
      // 14a: aconst_null
      // 14b: putfield xE.q LVD;
      // 14e: bipush 0
      // 14f: istore 9
      // 151: bipush 0
      // 152: istore 10
      // 154: iload 2
      // 155: ifne 1d2
      // 158: aload 8
      // 15a: iload 10
      // 15c: invokevirtual com/Oc_2.V (I)Lcom/O0;
      // 15f: astore 11
      // 161: new VD
      // 164: dup
      // 165: aload 11
      // 167: sipush -24961
      // 16a: sipush -2836
      // 16d: invokestatic xE.a (II)Ljava/lang/String;
      // 170: invokevirtual com/O0.C (Ljava/lang/String;)Ljava/lang/String;
      // 173: aload 11
      // 175: sipush -24974
      // 178: sipush -2102
      // 17b: invokestatic xE.a (II)Ljava/lang/String;
      // 17e: invokevirtual com/O0.C (Ljava/lang/String;)Ljava/lang/String;
      // 181: aconst_null
      // 182: bipush -1
      // 183: invokespecial VD.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
      // 186: astore 12
      // 188: aload 0
      // 189: getfield xE.h Ljava/util/ArrayList;
      // 18c: aload 12
      // 18e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 191: pop
      // 192: aload 0
      // 193: getfield xE.u Ljava/util/HashMap;
      // 196: aload 12
      // 198: invokevirtual VD.X ()Ljava/lang/String;
      // 19b: aload 12
      // 19d: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1a0: pop
      // 1a1: aload 0
      // 1a2: getfield xE.v Ljava/lang/String;
      // 1a5: iload 2
      // 1a6: ifeq 1b8
      // 1a9: ifnull 1cf
      // 1ac: aload 12
      // 1ae: invokevirtual VD.X ()Ljava/lang/String;
      // 1b1: goto 1b8
      // 1b4: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: getfield xE.v Ljava/lang/String;
      // 1bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1bf: ifeq 1cf
      // 1c2: aload 0
      // 1c3: aload 12
      // 1c5: putfield xE.q LVD;
      // 1c8: goto 1cf
      // 1cb: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 1ce: athrow
      // 1cf: iinc 10 1
      // 1d2: iload 10
      // 1d4: aload 8
      // 1d6: invokevirtual com/Oc_2.size ()I
      // 1d9: if_icmplt 158
      // 1dc: aload 0
      // 1dd: getfield xE.u Ljava/util/HashMap;
      // 1e0: aload 7
      // 1e2: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1e5: checkcast VD
      // 1e8: astore 10
      // 1ea: aload 0
      // 1eb: iload 2
      // 1ec: ifeq 220
      // 1ef: getfield xE.q LVD;
      // 1f2: ifnonnull 209
      // 1f5: goto 1fc
      // 1f8: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 1fb: athrow
      // 1fc: aload 0
      // 1fd: aload 10
      // 1ff: putfield xE.q LVD;
      // 202: goto 209
      // 205: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 208: athrow
      // 209: aload 0
      // 20a: aload 0
      // 20b: getfield xE.q LVD;
      // 20e: invokevirtual VD.X ()Ljava/lang/String;
      // 211: putfield xE.v Ljava/lang/String;
      // 214: aload 0
      // 215: aload 0
      // 216: getfield xE.q LVD;
      // 219: invokevirtual VD.k ()Ljava/lang/String;
      // 21c: putfield xE.A Ljava/lang/String;
      // 21f: aload 0
      // 220: getfield xE.Q LBA;
      // 223: invokevirtual BA.U ()V
      // 226: goto 230
      // 229: astore 11
      // 22b: aload 11
      // 22d: invokevirtual java/io/UnsupportedEncodingException.printStackTrace ()V
      // 230: aload 0
      // 231: iload 2
      // 232: ifeq 25f
      // 235: getfield xE.U LBk_2;
      // 238: ifnull 25e
      // 23b: goto 242
      // 23e: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 241: athrow
      // 242: aload 0
      // 243: getfield xE.U LBk_2;
      // 246: aload 0
      // 247: getfield xE.h Ljava/util/ArrayList;
      // 24a: aload 0
      // 24b: getfield xE.v Ljava/lang/String;
      // 24e: aload 0
      // 24f: getfield xE.A Ljava/lang/String;
      // 252: invokeinterface Bk_2.w (Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V 4
      // 257: goto 25e
      // 25a: invokestatic xE.a (Ljava/io/UnsupportedEncodingException;)Ljava/io/UnsupportedEncodingException;
      // 25d: athrow
      // 25e: aload 0
      // 25f: bipush 1
      // 260: putfield xE.e Z
      // 263: return
   }

   @Override
   public void j() {
      int var1 = I();
      Bk_2 var10000 = this.U;
      if (var1 != 0) {
         if (this.U == null) {
            return;
         }

         var10000 = this.U;
      }

      var10000.j();
   }

   @Override
   public void V() {
      int var1 = I();
      Bk_2 var10000 = this.U;
      if (var1 != 0) {
         if (this.U == null) {
            return;
         }

         var10000 = this.U;
      }

      var10000.V();
   }

   @Override
   public void a() {
      int var1 = I();
      Bk_2 var10000 = this.U;
      if (var1 != 0) {
         if (this.U == null) {
            return;
         }

         var10000 = this.U;
      }

      var10000.a();
   }

   public int j$int() {
      return this.P;
   }

   public void m(int var1) {
      this.P = var1;
   }

   public String J() {
      return this.d;
   }

   public void H(String var1) {
      this.d = var1;
   }

   public String V$String() {
      return this.K;
   }

   public void r(String var1) {
      this.K = var1;
   }

   public String h() {
      return this.G;
   }

   public void D(String var1) {
      this.G = var1;
   }

   public int Q() {
      return this.C;
   }

   public void u(int var1) {
      this.C = var1;
   }

   public Bk_2 z() {
      return this.U;
   }

   public void U(Bk_2 var1) {
      this.U = var1;
   }

   public String B() {
      return this.v;
   }

   public void z(String var1) {
      this.v = var1;
   }

   public Yu_2 B$Yu_2() {
      return this.w;
   }

   public void z(Yu_2 var1) {
      this.w = var1;
   }

   @Override
   public void w(List var1, String var2, String var3) {
   }

   public boolean r() {
      return this.I;
   }

   public void X(boolean var1) {
      this.I = var1;
   }

   public static void R(int var0) {
      s = var0;
   }

   public static int D() {
      return s;
   }

   public static int I() {
      int var0 = D();
      return var0 == 0 ? 60 : 0;
   }

   private static UnsupportedEncodingException a(UnsupportedEncodingException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -24972) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 175;
            case 1 -> 202;
            case 2 -> 245;
            case 3 -> 242;
            case 4 -> 185;
            case 5 -> 164;
            case 6 -> 116;
            case 7 -> 197;
            case 8 -> 78;
            case 9 -> 207;
            case 10 -> 60;
            case 11 -> 94;
            case 12 -> 82;
            case 13 -> 148;
            case 14 -> 24;
            case 15 -> 69;
            case 16 -> 146;
            case 17 -> 61;
            case 18 -> 170;
            case 19 -> 45;
            case 20 -> 23;
            case 21 -> 48;
            case 22 -> 72;
            case 23 -> 171;
            case 24 -> 246;
            case 25 -> 115;
            case 26 -> 51;
            case 27 -> 240;
            case 28 -> 194;
            case 29 -> 64;
            case 30 -> 149;
            case 31 -> 117;
            case 32 -> 125;
            case 33 -> 68;
            case 34 -> 43;
            case 35 -> 97;
            case 36 -> 222;
            case 37 -> 218;
            case 38 -> 249;
            case 39 -> 73;
            case 40 -> 157;
            case 41 -> 145;
            case 42 -> 58;
            case 43 -> 130;
            case 44 -> 28;
            case 45 -> 65;
            case 46 -> 255;
            case 47 -> 163;
            case 48 -> 74;
            case 49 -> 239;
            case 50 -> 205;
            case 51 -> 199;
            case 52 -> 95;
            case 53 -> 186;
            case 54 -> 166;
            case 55 -> 136;
            case 56 -> 141;
            case 57 -> 11;
            case 58 -> 174;
            case 59 -> 110;
            case 60 -> 10;
            case 61 -> 42;
            case 62 -> 167;
            case 63 -> 132;
            case 64 -> 89;
            case 65 -> 47;
            case 66 -> 143;
            case 67 -> 46;
            case 68 -> 62;
            case 69 -> 13;
            case 70 -> 2;
            case 71 -> 196;
            case 72 -> 200;
            case 73 -> 54;
            case 74 -> 144;
            case 75 -> 190;
            case 76 -> 84;
            case 77 -> 29;
            case 78 -> 36;
            case 79 -> 106;
            case 80 -> 7;
            case 81 -> 192;
            case 82 -> 169;
            case 83 -> 131;
            case 84 -> 81;
            case 85 -> 14;
            case 86 -> 126;
            case 87 -> 38;
            case 88 -> 101;
            case 89 -> 250;
            case 90 -> 252;
            case 91 -> 220;
            case 92 -> 177;
            case 93 -> 49;
            case 94 -> 215;
            case 95 -> 119;
            case 96 -> 93;
            case 97 -> 111;
            case 98 -> 183;
            case 99 -> 122;
            case 100 -> 217;
            case 101 -> 152;
            case 102 -> 123;
            case 103 -> 8;
            case 104 -> 31;
            case 105 -> 75;
            case 106 -> 153;
            case 107 -> 154;
            case 108 -> 203;
            case 109 -> 16;
            case 110 -> 92;
            case 111 -> 156;
            case 112 -> 227;
            case 113 -> 50;
            case 114 -> 212;
            case 115 -> 1;
            case 116 -> 213;
            case 117 -> 181;
            case 118 -> 151;
            case 119 -> 87;
            case 120 -> 59;
            case 121 -> 35;
            case 122 -> 109;
            case 123 -> 176;
            case 124 -> 85;
            case 125 -> 128;
            case 126 -> 19;
            case 127 -> 162;
            case 128 -> 22;
            case 129 -> 231;
            case 130 -> 209;
            case 131 -> 247;
            case 132 -> 150;
            case 133 -> 184;
            case 134 -> 172;
            case 135 -> 187;
            case 136 -> 56;
            case 137 -> 219;
            case 138 -> 178;
            case 139 -> 44;
            case 140 -> 83;
            case 141 -> 159;
            case 142 -> 86;
            case 143 -> 251;
            case 144 -> 225;
            case 145 -> 195;
            case 146 -> 214;
            case 147 -> 189;
            case 148 -> 204;
            case 149 -> 134;
            case 150 -> 99;
            case 151 -> 229;
            case 152 -> 160;
            case 153 -> 155;
            case 154 -> 112;
            case 155 -> 226;
            case 156 -> 9;
            case 157 -> 76;
            case 158 -> 120;
            case 159 -> 224;
            case 160 -> 0;
            case 161 -> 17;
            case 162 -> 100;
            case 163 -> 165;
            case 164 -> 20;
            case 165 -> 168;
            case 166 -> 53;
            case 167 -> 5;
            case 168 -> 107;
            case 169 -> 211;
            case 170 -> 71;
            case 171 -> 77;
            case 172 -> 241;
            case 173 -> 133;
            case 174 -> 188;
            case 175 -> 102;
            case 176 -> 12;
            case 177 -> 55;
            case 178 -> 191;
            case 179 -> 26;
            case 180 -> 137;
            case 181 -> 206;
            case 182 -> 233;
            case 183 -> 70;
            case 184 -> 232;
            case 185 -> 179;
            case 186 -> 27;
            case 187 -> 135;
            case 188 -> 127;
            case 189 -> 158;
            case 190 -> 30;
            case 191 -> 39;
            case 192 -> 57;
            case 193 -> 254;
            case 194 -> 129;
            case 195 -> 221;
            case 196 -> 201;
            case 197 -> 104;
            case 198 -> 79;
            case 199 -> 230;
            case 200 -> 121;
            case 201 -> 6;
            case 202 -> 96;
            case 203 -> 140;
            case 204 -> 248;
            case 205 -> 80;
            case 206 -> 161;
            case 207 -> 32;
            case 208 -> 244;
            case 209 -> 91;
            case 210 -> 198;
            case 211 -> 142;
            case 212 -> 114;
            case 213 -> 41;
            case 214 -> 180;
            case 215 -> 124;
            case 216 -> 147;
            case 217 -> 223;
            case 218 -> 208;
            case 219 -> 4;
            case 220 -> 182;
            case 221 -> 118;
            case 222 -> 216;
            case 223 -> 63;
            case 224 -> 40;
            case 225 -> 108;
            case 226 -> 139;
            case 227 -> 88;
            case 228 -> 33;
            case 229 -> 90;
            case 230 -> 113;
            case 231 -> 228;
            case 232 -> 21;
            case 233 -> 25;
            case 234 -> 234;
            case 235 -> 237;
            case 236 -> 193;
            case 237 -> 253;
            case 238 -> 236;
            case 239 -> 173;
            case 240 -> 66;
            case 241 -> 243;
            case 242 -> 103;
            case 243 -> 34;
            case 244 -> 98;
            case 245 -> 235;
            case 246 -> 37;
            case 247 -> 15;
            case 248 -> 52;
            case 249 -> 18;
            case 250 -> 105;
            case 251 -> 3;
            case 252 -> 67;
            case 253 -> 238;
            case 254 -> 210;
            default -> 138;
         };
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
}





