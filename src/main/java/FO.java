import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;

public class FO {
   DatagramSocket K;
   public InetAddress c;
   public int b;
   LinkedBlockingQueue i = new LinkedBlockingQueue();
   boolean H = true;
   F0 O;
   InetAddress h;
   String n;
   int F;
   HashSet W = new HashSet();
   String L;
   int S;
   int X;
   QI C;
   String a;
   InetAddress f;
   int R;
   int t;
   byte[] o;
   private static final String d;
   private static final long e;

   public FO(QI var1, String var2, int var3, F0 var4, InetAddress var5, int var6, String var7, int var8) {
      this.S = (int)e;
      this.t = -1;
      this.C = var1;
      this.a = var2;

      try {
         this.f = InetAddress.getByName(var2);
      } catch (UnknownHostException var11) {
         var11.printStackTrace();
      }

      this.R = var3;
      this.O = var4;
      this.c = var5;
      this.b = var6;
      this.L = var7;
      this.X = var8;

      try {
         this.K = new DatagramSocket();
         this.K.setSoTimeout(this.S);
      } catch (SocketException var10) {
         var10.printStackTrace();
      }

      QI.U.execute(new l3_2(this));
   }

   void B(DatagramPacket var1) {
      byte[] var2 = this.o;
      byte[] var3 = new byte[var2.length + var1.getLength()];
      byte[] var4 = var1.getData();
      System.arraycopy(var2, 0, var3, 0, var2.length);
      System.arraycopy(var4, 0, var3, var2.length, var1.getLength());
      this.O.A(var3);
   }

   public void a(byte[] var1) {
      byte[] var2 = this.o;
      byte[] var3 = new byte[var2.length + var1.length];
      System.arraycopy(var2, 0, var3, 0, var2.length);
      System.arraycopy(var1, 0, var3, var2.length, var1.length);
      this.O.A(var3);
   }

   public void T(DatagramPacket param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic QI.N ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: dup
      // 006: getfield FO.t I
      // 009: bipush 1
      // 00a: iadd
      // 00b: putfield FO.t I
      // 00e: aload 1
      // 00f: invokevirtual java/net/DatagramPacket.getData ()[B
      // 012: astore 3
      // 013: new java/io/ByteArrayInputStream
      // 016: dup
      // 017: aload 3
      // 018: bipush 0
      // 019: aload 1
      // 01a: invokevirtual java/net/DatagramPacket.getLength ()I
      // 01d: invokespecial java/io/ByteArrayInputStream.<init> ([BII)V
      // 020: astore 4
      // 022: new JX
      // 025: dup
      // 026: aload 4
      // 028: invokespecial JX.<init> (Ljava/io/InputStream;)V
      // 02b: astore 5
      // 02d: aload 4
      // 02f: invokevirtual java/io/ByteArrayInputStream.available ()I
      // 032: istore 6
      // 034: aload 4
      // 036: invokevirtual java/io/ByteArrayInputStream.close ()V
      // 039: iload 6
      // 03b: newarray 8
      // 03d: astore 7
      // 03f: aload 1
      // 040: invokevirtual java/net/DatagramPacket.getData ()[B
      // 043: aload 1
      // 044: invokevirtual java/net/DatagramPacket.getLength ()I
      // 047: iload 6
      // 049: isub
      // 04a: aload 7
      // 04c: bipush 0
      // 04d: iload 6
      // 04f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 052: aload 0
      // 053: aload 5
      // 055: getfield Jk_2.R I
      // 058: putfield FO.F I
      // 05b: aload 2
      // 05c: ifnull 0ad
      // 05f: aload 5
      // 061: getfield Jk_2.e Ljava/net/InetAddress;
      // 064: ifnull 09d
      // 067: goto 06e
      // 06a: invokestatic FO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 06d: athrow
      // 06e: aload 0
      // 06f: aload 5
      // 071: getfield Jk_2.e Ljava/net/InetAddress;
      // 074: putfield FO.h Ljava/net/InetAddress;
      // 077: aload 0
      // 078: aload 0
      // 079: getfield FO.h Ljava/net/InetAddress;
      // 07c: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 07f: putfield FO.n Ljava/lang/String;
      // 082: aload 0
      // 083: aload 0
      // 084: aload 0
      // 085: getfield FO.h Ljava/net/InetAddress;
      // 088: aload 0
      // 089: getfield FO.F I
      // 08c: invokespecial FO.c (Ljava/net/InetAddress;I)[B
      // 08f: putfield FO.o [B
      // 092: aload 2
      // 093: ifnonnull 0bd
      // 096: goto 09d
      // 099: invokestatic FO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09c: athrow
      // 09d: aload 0
      // 09e: aload 5
      // 0a0: getfield Jk_2.B Ljava/lang/String;
      // 0a3: putfield FO.n Ljava/lang/String;
      // 0a6: goto 0ad
      // 0a9: invokestatic FO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: aload 0
      // 0af: aload 0
      // 0b0: getfield FO.n Ljava/lang/String;
      // 0b3: aload 0
      // 0b4: getfield FO.F I
      // 0b7: invokespecial FO.B (Ljava/lang/String;I)[B
      // 0ba: putfield FO.o [B
      // 0bd: new java/lang/StringBuilder
      // 0c0: dup
      // 0c1: getstatic FO.d Ljava/lang/String;
      // 0c4: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0c7: aload 0
      // 0c8: getfield FO.n Ljava/lang/String;
      // 0cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ce: ldc ":"
      // 0d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d3: aload 0
      // 0d4: getfield FO.F I
      // 0d7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0dd: invokestatic Jy_2.g (Ljava/lang/String;)V
      // 0e0: aload 0
      // 0e1: getfield FO.C LQI;
      // 0e4: aload 0
      // 0e5: aload 0
      // 0e6: getfield FO.f Ljava/net/InetAddress;
      // 0e9: aload 0
      // 0ea: getfield FO.R I
      // 0ed: aload 0
      // 0ee: getfield FO.n Ljava/lang/String;
      // 0f1: aload 0
      // 0f2: getfield FO.F I
      // 0f5: aload 0
      // 0f6: getfield FO.X I
      // 0f9: invokevirtual QI.a (LFO;Ljava/net/InetAddress;ILjava/lang/String;II)LQu_2;
      // 0fc: astore 8
      // 0fe: aload 8
      // 100: aload 7
      // 102: aload 0
      // 103: getfield FO.t I
      // 106: invokevirtual Qu_2.W ([BI)V
      // 109: aload 0
      // 10a: getfield FO.C LQI;
      // 10d: getfield QI.e Lv;
      // 110: aload 8
      // 112: aload 0
      // 113: getfield FO.t I
      // 116: invokevirtual v.p (LQu_2;I)V
      // 119: goto 129
      // 11c: astore 3
      // 11d: aload 3
      // 11e: invokevirtual java/io/IOException.printStackTrace ()V
      // 121: goto 129
      // 124: astore 3
      // 125: aload 3
      // 126: invokevirtual java/lang/Exception.printStackTrace ()V
      // 129: return
   }

   private byte[] c(InetAddress var1, int var2) {
      JX var3 = new JX(0, var1, var2);
      var3.Q[0] = 0;
      return var3.Q;
   }

   private byte[] B(String var1, int var2) {
      JX var3 = new JX(0, var1, var2);
      var3.Q[0] = 0;
      return var3.Q;
   }

   public void Z() {
      this.H = false;
      this.K.close();
      this.O.B(this);
   }

   public String j() {
      return this.L;
   }

   public void S(String var1) {
      this.L = var1;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "讄汍;cN=".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 88;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 88;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 43;
               break;
            case 1:
               var21 = 87;
               break;
            case 2:
               var21 = 22;
               break;
            case 3:
               var21 = 95;
               break;
            case 4:
               var21 = 102;
               break;
            case 5:
               var21 = 69;
               break;
            default:
               var21 = 38;
         }
      } else {
         var13 = 88;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            d = var16;
            long var3 = 509683582486133716L;
            long var12 = -4618727400112674764L ^ var3;
            var8 = -1;
            e = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 88;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 43;
               break;
            case 1:
               var21 = 87;
               break;
            case 2:
               var21 = 22;
               break;
            case 3:
               var21 = 95;
               break;
            case 4:
               var21 = 102;
               break;
            case 5:
               var21 = 69;
               break;
            default:
               var21 = 38;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 43;
                  break;
               case 1:
                  var21 = 87;
                  break;
               case 2:
                  var21 = 22;
                  break;
               case 3:
                  var21 = 95;
                  break;
               case 4:
                  var21 = 102;
                  break;
               case 5:
                  var21 = 69;
                  break;
               default:
                  var21 = 38;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               d = var15;
               long var0 = 509683582486133716L;
               long var11 = -4618727400112674764L ^ var0;
               var6 = -1;
               e = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 43;
                  break;
               case 1:
                  var21 = 87;
                  break;
               case 2:
                  var21 = 22;
                  break;
               case 3:
                  var21 = 95;
                  break;
               case 4:
                  var21 = 102;
                  break;
               case 5:
                  var21 = 69;
                  break;
               default:
                  var21 = 38;
            }
         }
      }
   }
}





