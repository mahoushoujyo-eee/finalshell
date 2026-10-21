package com.finalshell.crypto;

import com.finalshell.core.Cd4;
import com.finalshell.core.Cs4;
import com.finalshell.core.Cv2;
import com.finalshell.core.DQ;
import com.finalshell.core.DS3;
import com.finalshell.core.DZ3;
import com.finalshell.core.De4;
import com.finalshell.core.Dm4;
import com.finalshell.core.Dq4;
import com.finalshell.core.E8;
import com.finalshell.core.EU;
import com.finalshell.core.FP;
import com.finalshell.core.F_2_3;
import com.finalshell.core.Fw2;
import com.finalshell.core.GH_2;
import com.finalshell.core.GN;
import com.finalshell.core.Gq2;
import com.finalshell.core.Hh2;
import com.finalshell.core.I82;
import com.finalshell.core.IF;
import com.finalshell.core.Ic4;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Ms2;
import com.finalshell.core.OD;
import com.finalshell.core.PJ3;
import com.finalshell.core.Pc2;
import com.finalshell.core.Qg2;
import com.finalshell.core.RW;
import com.finalshell.core.Tn2;
import com.finalshell.core.UJ;
import com.finalshell.core.W7;
import com.finalshell.core.Xe2;
import com.finalshell.core.YU;
import com.finalshell.core.Y_2;
import com.finalshell.core.Yl4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.WR3;
import com.finalshell.ui.dialog.LoginDialog;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Toolkit;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;

public class ConnectHost {
   public byte[] i0;
   public byte[] ii;
   public byte[] i6;
   public byte[] i;
   public byte[] y;
   public byte[] m;
   public byte[] iE;
   public byte[] Q;
   public byte[] i8;
   public byte[] j;
   public byte[] B;
   public byte[] s;
   public int o;
   public int i1;
   public String[] L;
   public EU b;
   public EU iO;
   public FP z;
   public FP C;
   public byte[] e;
   public byte[] F;
   public OD v;
   public OD iK;
   public Cs4 h;
   public Socket ib;
   public int iD;
   public volatile boolean iJ;
   public volatile boolean H;
   public Thread im;
   public Object S;
   public boolean N;
   public boolean iu;
   public InputStream O;
   public OutputStream l;
   public static I82 p;
   public UJ k;
   public YU D;
   public PJ3 K;
   public Hashtable M;
   public Ic4 P;
   public Gq2 Y;
   public String in;
   public int i4;
   public int f;
   public Cd4 w;
   public RW q;
   public volatile String[] id;
   public volatile boolean n;
   public boolean ih;
   public long R;
   public int iI;
   public int X;
   public String V;
   public String U;
   public int x;
   public String g;
   public byte[] iS;
   public Xe2 d;
   public GN ij;
   public ConnectionProperty r;
   public ConnectionProperty ix;
   public Lv4_2 Z;
   public ConnectHost i2;
   public int t;
   public boolean iF;
   public ArrayList a;
   public boolean I;
   public GH_2 u;
   public static String iQ;
   public static String G;
   public static long ia;
   public static long J;
   public boolean iv;
   public volatile boolean iq;
   public volatile boolean W;
   public volatile String[] E;
   public int[] iY;
   public int[] T;
   public int il;
   public int A;
   public Runnable iw;
   public Fw2 iC;
   public static byte[] c;
   public static byte[] iy;
   public DQ iM;
   public static String[] ab;
   public static String[] bb;
   public static long[] cb;
   public static Integer[] db;
   public static long[] eb;
   public static Long[] fb;

   public static void W$void() {
      iQ = null;
      G = null;
      Registry.packArgs(a(-8791, -20661));
      long var4 = 517287540690064504L;
      Object var10001 = Ref.h2(517287540690064504L, var4);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      String var0 = (String)var10001;
      Tn2 var1 = new Tn2();

      try {
         new StringBuilder();
         Object var10003 = Registry.packArgs(ConnectionProperty.l$String());
         long var6 = 517287540690064504L;
         Object var10004 = Ref.h2(517287540690064504L, var6);

         try {
            var10004 = (String)var10004;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         var10003 = Registry.packArgs(
            var10003.append((String)var10004).append(var0).toString().getBytes(a(-8799, 20067)), Registry.lookupField(539188650316259173L).get(null)
         );
         long var9 = 260894324830752426L;
         Object var8 = var10003;
         var10003 = Ref.h(260894324830752426L, var8, var9);

         try {
            var10003 = (byte[])var10003;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }

         Registry.packArgs(var10003);
         long var10 = 143136866495902418L;
         var10004 = Ref.h2(143136866495902418L, var10);

         try {
            var10004 = (String)var10004;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         String var2 = var10004.subSequence(a(23693, 8587490070946104263L), a(531, 4737064468881251689L)).toString();
         Registry.packArgs(var2);
         long var12 = 447583865571692266L;
         Object var10005 = Ref.h2(447583865571692266L, var12);

         try {
            var10005 = (String)var10005;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         G = (String)var10005;
      } catch (UnsupportedEncodingException var34) {
         var34.printStackTrace();
      }

      Registry.packArgs(a(-8762, 18402));
      long var14 = 517287540690064504L;
      var10001 = Ref.h2(517287540690064504L, var14);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      var0 = (String)var10001;

      try {
         Registry.packArgs(ConnectionProperty.l$String());
         long var16 = 517287540690064504L;
         Object var10002 = Ref.h2(517287540690064504L, var16);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         String var37 = (String)var10002;
         byte[] var45 = (byte[])(Registry.packArgs((var37 + var0).getBytes(a(-8906, -27679)), Registry.lookupField(539188650316259173L).get(null)));
         long var19 = 260894324830752426L;
         Object var18 = var45;
         var45 = Ref.h(260894324830752426L, var18, var19);

         try {
            var45 = (byte[])var45;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         Registry.packArgs(var45);
         long var20 = 143136866495902418L;
         Object var51 = Ref.h2(143136866495902418L, var20);

         try {
            var51 = (String)var51;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         String var3 = var51.subSequence(a(11840, 3524730752623391035L), a(30187, 3431361680507759281L)).toString();
         Registry.packArgs(var3);
         long var22 = 447583865571692266L;
         Object var54 = Ref.h2(447583865571692266L, var22);

         try {
            var54 = (String)var54;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }

         iQ = (String)var54;
      } catch (UnsupportedEncodingException var28) {
         var28.printStackTrace();
      }
   }

   public static void t$void() {
      Toolkit var0 = Toolkit.getDefaultToolkit();
      var0.addAWTEventListener(new W7(), b(16776, 1473469404361689390L));
   }

   public ConnectHost(Xe2 param1, String param2, String param3, int param4, Ms2 param5, Lv4_2 param6, int param7) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: aload 0
      // 005: new java/lang/StringBuilder
      // 008: dup
      // 009: invokespecial java/lang/StringBuilder.<init> ()V
      // 00c: sipush -8831
      // 00f: sipush 16205
      // 012: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 015: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 018: getstatic com/finalshell/core/Xe2.s Ljava/lang/String;
      // 01b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 01e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 021: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 024: putfield com/finalshell/crypto/ConnectHost.ii [B
      // 027: aload 0
      // 028: bipush 0
      // 029: putfield com/finalshell/crypto/ConnectHost.o I
      // 02c: aload 0
      // 02d: bipush 0
      // 02e: putfield com/finalshell/crypto/ConnectHost.i1 I
      // 031: aload 0
      // 032: aconst_null
      // 033: putfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 036: aload 0
      // 037: bipush 0
      // 038: putfield com/finalshell/crypto/ConnectHost.iD I
      // 03b: aload 0
      // 03c: bipush 0
      // 03d: putfield com/finalshell/crypto/ConnectHost.iJ Z
      // 040: aload 0
      // 041: bipush 0
      // 042: putfield com/finalshell/crypto/ConnectHost.H Z
      // 045: aload 0
      // 046: aconst_null
      // 047: putfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 04a: aload 0
      // 04b: new java/lang/Object
      // 04e: dup
      // 04f: invokespecial java/lang/Object.<init> ()V
      // 052: putfield com/finalshell/crypto/ConnectHost.S Ljava/lang/Object;
      // 055: aload 0
      // 056: bipush 0
      // 057: putfield com/finalshell/crypto/ConnectHost.N Z
      // 05a: aload 0
      // 05b: bipush 0
      // 05c: putfield com/finalshell/crypto/ConnectHost.iu Z
      // 05f: aload 0
      // 060: aconst_null
      // 061: putfield com/finalshell/crypto/ConnectHost.O Ljava/io/InputStream;
      // 064: aload 0
      // 065: aconst_null
      // 066: putfield com/finalshell/crypto/ConnectHost.l Ljava/io/OutputStream;
      // 069: aload 0
      // 06a: aconst_null
      // 06b: putfield com/finalshell/crypto/ConnectHost.K Lcom/finalshell/core/PJ3;
      // 06e: aload 0
      // 06f: aconst_null
      // 070: putfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 073: aload 0
      // 074: aconst_null
      // 075: putfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 078: aload 0
      // 079: aconst_null
      // 07a: putfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 07d: aload 0
      // 07e: bipush 0
      // 07f: putfield com/finalshell/crypto/ConnectHost.i4 I
      // 082: aload 0
      // 083: bipush 1
      // 084: putfield com/finalshell/crypto/ConnectHost.f I
      // 087: aload 0
      // 088: aconst_null
      // 089: putfield com/finalshell/crypto/ConnectHost.w Lcom/finalshell/core/Cd4;
      // 08c: aload 0
      // 08d: aconst_null
      // 08e: putfield com/finalshell/crypto/ConnectHost.q Lcom/finalshell/core/RW;
      // 091: aload 0
      // 092: aconst_null
      // 093: putfield com/finalshell/crypto/ConnectHost.id [Ljava/lang/String;
      // 096: aload 0
      // 097: bipush 0
      // 098: putfield com/finalshell/crypto/ConnectHost.n Z
      // 09b: aload 0
      // 09c: bipush 0
      // 09d: putfield com/finalshell/crypto/ConnectHost.ih Z
      // 0a0: aload 0
      // 0a1: lconst_0
      // 0a2: putfield com/finalshell/crypto/ConnectHost.R J
      // 0a5: aload 0
      // 0a6: sipush 18285
      // 0a9: ldc2_w 4694902843383928893
      // 0ac: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0af: putfield com/finalshell/crypto/ConnectHost.iI I
      // 0b2: aload 0
      // 0b3: bipush 0
      // 0b4: putfield com/finalshell/crypto/ConnectHost.X I
      // 0b7: aload 0
      // 0b8: sipush -8876
      // 0bb: sipush 1328
      // 0be: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0c1: putfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 0c4: aload 0
      // 0c5: sipush -8776
      // 0c8: sipush 16976
      // 0cb: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0ce: putfield com/finalshell/crypto/ConnectHost.U Ljava/lang/String;
      // 0d1: aload 0
      // 0d2: sipush 24515
      // 0d5: ldc2_w 7338085327401795773
      // 0d8: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0db: putfield com/finalshell/crypto/ConnectHost.x I
      // 0de: aload 0
      // 0df: aconst_null
      // 0e0: putfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 0e3: aload 0
      // 0e4: aconst_null
      // 0e5: putfield com/finalshell/crypto/ConnectHost.iS [B
      // 0e8: aload 0
      // 0e9: aload 0
      // 0ea: putfield com/finalshell/crypto/ConnectHost.i2 Lcom/finalshell/crypto/ConnectHost;
      // 0ed: aload 0
      // 0ee: new java/util/ArrayList
      // 0f1: dup
      // 0f2: invokespecial java/util/ArrayList.<init> ()V
      // 0f5: putfield com/finalshell/crypto/ConnectHost.a Ljava/util/ArrayList;
      // 0f8: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 0fb: aload 0
      // 0fc: bipush 0
      // 0fd: putfield com/finalshell/crypto/ConnectHost.I Z
      // 100: aload 0
      // 101: bipush 0
      // 102: putfield com/finalshell/crypto/ConnectHost.iv Z
      // 105: aload 0
      // 106: bipush 0
      // 107: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 10a: aload 0
      // 10b: bipush 0
      // 10c: putfield com/finalshell/crypto/ConnectHost.W Z
      // 10f: aload 0
      // 110: aconst_null
      // 111: putfield com/finalshell/crypto/ConnectHost.E [Ljava/lang/String;
      // 114: aload 0
      // 115: bipush 1
      // 116: newarray 10
      // 118: putfield com/finalshell/crypto/ConnectHost.iY [I
      // 11b: aload 0
      // 11c: bipush 1
      // 11d: newarray 10
      // 11f: putfield com/finalshell/crypto/ConnectHost.T [I
      // 122: aload 0
      // 123: sipush 11298
      // 126: ldc2_w 2411481202322158430
      // 129: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 12c: putfield com/finalshell/crypto/ConnectHost.il I
      // 12f: aload 0
      // 130: sipush 11298
      // 133: ldc2_w 2411481202322158430
      // 136: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 139: putfield com/finalshell/crypto/ConnectHost.A I
      // 13c: aload 0
      // 13d: new com/finalshell/core/Fw2
      // 140: dup
      // 141: aconst_null
      // 142: invokespecial com/finalshell/core/Fw2.<init> (Lcom/finalshell/core/W7;)V
      // 145: putfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 148: aload 0
      // 149: aconst_null
      // 14a: putfield com/finalshell/crypto/ConnectHost.iM Lcom/finalshell/core/DQ;
      // 14d: aload 0
      // 14e: aload 1
      // 14f: putfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 152: aload 0
      // 153: new com/finalshell/core/UJ
      // 156: dup
      // 157: invokespecial com/finalshell/core/UJ.<init> ()V
      // 15a: putfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 15d: aload 0
      // 15e: new com/finalshell/core/YU
      // 161: dup
      // 162: aload 0
      // 163: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 166: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 169: putfield com/finalshell/crypto/ConnectHost.D Lcom/finalshell/core/YU;
      // 16c: aload 0
      // 16d: aload 2
      // 16e: putfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 171: aload 0
      // 172: aload 0
      // 173: aload 3
      // 174: dup_x1
      // 175: putfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 178: putfield com/finalshell/crypto/ConnectHost.U Ljava/lang/String;
      // 17b: istore 8
      // 17d: aload 0
      // 17e: iload 4
      // 180: putfield com/finalshell/crypto/ConnectHost.x I
      // 183: aload 0
      // 184: iload 7
      // 186: putfield com/finalshell/crypto/ConnectHost.t I
      // 189: aload 0
      // 18a: aload 6
      // 18c: putfield com/finalshell/crypto/ConnectHost.Z Lcom/finalshell/core/Lv4_2;
      // 18f: aload 6
      // 191: iload 8
      // 193: ifeq 1a2
      // 196: ifnull 1f1
      // 199: goto 1a0
      // 19c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: aload 6
      // 1a2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1a5: ldc2_w 195538594886366540
      // 1a8: astore 11
      // 1aa: astore 10
      // 1ac: ldc2_w 195538594886366540
      // 1af: aload 10
      // 1b1: aload 11
      // 1b3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b6: checkcast java/lang/String
      // 1b9: goto 1c0
      // 1bc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1bf: athrow
      // 1c0: ifnull 1f1
      // 1c3: aload 0
      // 1c4: aload 6
      // 1c6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1c9: ldc2_w 195538594886366540
      // 1cc: astore 13
      // 1ce: astore 12
      // 1d0: ldc2_w 195538594886366540
      // 1d3: aload 12
      // 1d5: aload 13
      // 1d7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1da: checkcast java/lang/String
      // 1dd: goto 1e4
      // 1e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 1e7: putfield com/finalshell/crypto/ConnectHost.iS [B
      // 1ea: goto 1f1
      // 1ed: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f0: athrow
      // 1f1: aload 5
      // 1f3: ifnull 203
      // 1f6: aload 0
      // 1f7: aload 5
      // 1f9: invokevirtual com/finalshell/crypto/ConnectHost.S (Lcom/finalshell/core/Ms2;)V
      // 1fc: goto 203
      // 1ff: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: aload 0
      // 204: invokespecial com/finalshell/crypto/ConnectHost.Y$void ()V
      // 207: aload 0
      // 208: getfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 20b: iload 8
      // 20d: ifeq 23d
      // 210: ifnonnull 239
      // 213: goto 21a
      // 216: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 219: athrow
      // 21a: aload 0
      // 21b: invokestatic java/lang/System.getProperties ()Ljava/util/Properties;
      // 21e: sipush -8838
      // 221: sipush -16896
      // 224: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 227: invokevirtual java/util/Properties.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 22a: checkcast java/lang/String
      // 22d: putfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 230: goto 239
      // 233: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 236: athrow
      // 237: astore 9
      // 239: aload 0
      // 23a: getfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 23d: ifnonnull 255
      // 240: new com/finalshell/core/Pc2
      // 243: dup
      // 244: sipush -8941
      // 247: sipush -12498
      // 24a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 24d: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 250: athrow
      // 251: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 254: athrow
      // 255: return
   }

   public int T(int var1, String var2, int var3, boolean var4) throws Pc2 {
      return this.O(a(-8776, 16976), var1, var2, var3, var4);
   }

   public int O(String var1, int var2, String var3, int var4, boolean var5) throws Pc2 {
      return this.L(var1, var2, var3, var4, null, var5);
   }

   public int U(String param1, int param2, String param3, int param4, F_2_3 param5, int param6, boolean param7) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 0
      // 04: aload 1
      // 05: iload 2
      // 06: aload 3
      // 07: iload 4
      // 09: aload 5
      // 0b: iload 7
      // 0d: invokestatic com/finalshell/core/Qg2.W (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;ILjava/lang/String;ILcom/finalshell/core/F_2_3;Z)Lcom/finalshell/core/Qg2;
      // 10: astore 9
      // 12: istore 8
      // 14: aload 9
      // 16: iload 6
      // 18: invokevirtual com/finalshell/core/Qg2.V (I)V
      // 1b: new java/lang/Thread
      // 1e: dup
      // 1f: aload 9
      // 21: dup
      // 22: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 25: pop
      // 26: invokedynamic run (Lcom/finalshell/core/Qg2;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/core/Qg2.E ()V, ()V ]
      // 2b: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 2e: astore 10
      // 30: aload 10
      // 32: new java/lang/StringBuilder
      // 35: dup
      // 36: invokespecial java/lang/StringBuilder.<init> ()V
      // 39: sipush -8959
      // 3c: sipush 10643
      // 3f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 42: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45: aload 3
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4c: invokevirtual java/lang/Thread.setName (Ljava/lang/String;)V
      // 4f: aload 0
      // 50: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 53: iload 8
      // 55: ifne 7c
      // 58: ifeq 72
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: aload 10
      // 64: aload 0
      // 65: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 68: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: aload 10
      // 74: invokevirtual java/lang/Thread.start ()V
      // 77: aload 9
      // 79: getfield com/finalshell/core/Qg2.r I
      // 7c: ireturn
   }

   public int L(String var1, int var2, String var3, int var4, F_2_3 var5, boolean var6) throws Pc2 {
      return this.U(var1, var2, var3, var4, var5, 0, var6);
   }

   public void S(Ms2 var1) {
      this.a.add(var1);
   }

   public void r(Yl4 var1) {
      boolean var10000 = Dm4.J$boolean();
      Iterator var3 = this.a.iterator();
      boolean var2 = var10000;

      while (var3.hasNext()) {
         Ms2 var4 = (Ms2)var3.next();
         Object[] var10001 = Registry.packArgs(var1);
         long var6 = 364979192734079701L;
         Object[] var5 = var10001;
         Ref.h(364979192734079701L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         if (var2) {
            break;
         }
      }
   }

   public void c(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aconst_null
      // 04: astore 3
      // 05: istore 2
      // 06: aload 0
      // 07: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 0a: iload 2
      // 0b: ifne 23
      // 0e: ifnull 27
      // 11: goto 18
      // 14: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$QT ()Lcom/finalshell/core/QT;
      // 26: astore 3
      // 27: aload 3
      // 28: iload 2
      // 29: ifne 45
      // 2c: ifnull 4a
      // 2f: goto 36
      // 32: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 3
      // 37: aload 1
      // 38: invokeinterface com/finalshell/core/QT.a (Ljava/lang/String;)V 2
      // 3d: aload 3
      // 3e: goto 45
      // 41: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: invokeinterface com/finalshell/core/QT.K ()V 1
      // 4a: return
   }

   public void B() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 3a
      // 09: getfield com/finalshell/crypto/ConnectHost.u Lcom/finalshell/core/GH_2;
      // 0c: ifnull 39
      // 0f: goto 16
      // 12: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/crypto/ConnectHost.u Lcom/finalshell/core/GH_2;
      // 1a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d: ldc2_w 624731062495880669
      // 20: astore 3
      // 21: astore 2
      // 22: ldc2_w 624731062495880669
      // 25: aload 2
      // 26: aload 3
      // 27: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a: pop
      // 2b: goto 32
      // 2e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 31: athrow
      // 32: goto 39
      // 35: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual com/finalshell/crypto/ConnectHost.d ()V
      // 3d: return
   }

   public ConnectionProperty a() {
      return this.r;
   }

   public void N(ConnectionProperty var1) {
      this.r = var1;
   }

   public Lv4_2 H() {
      return this.Z;
   }

   public void D(Lv4_2 var1) {
      this.Z = var1;
   }

   public boolean i$boolean() {
      return this.I;
   }

   public boolean O$boolean() {
      return this.iF;
   }

   public void B(boolean var1) {
      this.iF = var1;
   }

   public void L() {
      boolean var1 = Dm4.J$boolean();

      byte var7;
      label28: {
         try {
            Registry.packArgs(this.g);
            long var3 = 330094358428833085L;
            Object var10001 = Ref.h2(330094358428833085L, var3);

            try {
               var7 = (Boolean)var10001;
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            if (var1) {
               break label28;
            }

            if (var7 == 0) {
               return;
            }
         } catch (SecurityException var6) {
            throw a(var6);
         }

         var7 = 1;
      }

      Registry.lookupField(347525510598802164L).setInt(null, var7);
      new LoginDialog(this.r.x$U(), this.Z, this);
   }

   public Xe2 r$Xe_2() {
      return this.d;
   }

   public void s(Xe2 var1) {
      this.d = var1;
   }

   public ConnectionProperty m$_y_2() {
      return this.ix;
   }

   public void V(ConnectionProperty var1) {
      this.ix = var1;
   }

   public ConnectHost(Xe2 param1, String param2, String param3, int param4) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: invokespecial java/lang/Object.<init> ()V
      // 007: istore 5
      // 009: aload 0
      // 00a: new java/lang/StringBuilder
      // 00d: dup
      // 00e: invokespecial java/lang/StringBuilder.<init> ()V
      // 011: sipush -8807
      // 014: sipush 2196
      // 017: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 01a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 01d: getstatic com/finalshell/core/Xe2.s Ljava/lang/String;
      // 020: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 023: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 026: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 029: putfield com/finalshell/crypto/ConnectHost.ii [B
      // 02c: aload 0
      // 02d: bipush 0
      // 02e: putfield com/finalshell/crypto/ConnectHost.o I
      // 031: aload 0
      // 032: bipush 0
      // 033: putfield com/finalshell/crypto/ConnectHost.i1 I
      // 036: aload 0
      // 037: aconst_null
      // 038: putfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 03b: aload 0
      // 03c: bipush 0
      // 03d: putfield com/finalshell/crypto/ConnectHost.iD I
      // 040: aload 0
      // 041: bipush 0
      // 042: putfield com/finalshell/crypto/ConnectHost.iJ Z
      // 045: aload 0
      // 046: bipush 0
      // 047: putfield com/finalshell/crypto/ConnectHost.H Z
      // 04a: aload 0
      // 04b: aconst_null
      // 04c: putfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 04f: aload 0
      // 050: new java/lang/Object
      // 053: dup
      // 054: invokespecial java/lang/Object.<init> ()V
      // 057: putfield com/finalshell/crypto/ConnectHost.S Ljava/lang/Object;
      // 05a: aload 0
      // 05b: bipush 0
      // 05c: putfield com/finalshell/crypto/ConnectHost.N Z
      // 05f: aload 0
      // 060: bipush 0
      // 061: putfield com/finalshell/crypto/ConnectHost.iu Z
      // 064: aload 0
      // 065: aconst_null
      // 066: putfield com/finalshell/crypto/ConnectHost.O Ljava/io/InputStream;
      // 069: aload 0
      // 06a: aconst_null
      // 06b: putfield com/finalshell/crypto/ConnectHost.l Ljava/io/OutputStream;
      // 06e: aload 0
      // 06f: aconst_null
      // 070: putfield com/finalshell/crypto/ConnectHost.K Lcom/finalshell/core/PJ3;
      // 073: aload 0
      // 074: aconst_null
      // 075: putfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 078: aload 0
      // 079: aconst_null
      // 07a: putfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 07d: aload 0
      // 07e: aconst_null
      // 07f: putfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 082: aload 0
      // 083: bipush 0
      // 084: putfield com/finalshell/crypto/ConnectHost.i4 I
      // 087: aload 0
      // 088: bipush 1
      // 089: putfield com/finalshell/crypto/ConnectHost.f I
      // 08c: aload 0
      // 08d: aconst_null
      // 08e: putfield com/finalshell/crypto/ConnectHost.w Lcom/finalshell/core/Cd4;
      // 091: aload 0
      // 092: aconst_null
      // 093: putfield com/finalshell/crypto/ConnectHost.q Lcom/finalshell/core/RW;
      // 096: aload 0
      // 097: aconst_null
      // 098: putfield com/finalshell/crypto/ConnectHost.id [Ljava/lang/String;
      // 09b: aload 0
      // 09c: bipush 0
      // 09d: putfield com/finalshell/crypto/ConnectHost.n Z
      // 0a0: aload 0
      // 0a1: bipush 0
      // 0a2: putfield com/finalshell/crypto/ConnectHost.ih Z
      // 0a5: aload 0
      // 0a6: lconst_0
      // 0a7: putfield com/finalshell/crypto/ConnectHost.R J
      // 0aa: aload 0
      // 0ab: sipush 26688
      // 0ae: ldc2_w 5499307281655199511
      // 0b1: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0b4: putfield com/finalshell/crypto/ConnectHost.iI I
      // 0b7: aload 0
      // 0b8: bipush 0
      // 0b9: putfield com/finalshell/crypto/ConnectHost.X I
      // 0bc: aload 0
      // 0bd: sipush -8776
      // 0c0: sipush 16976
      // 0c3: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0c6: putfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 0c9: aload 0
      // 0ca: sipush -8776
      // 0cd: sipush 16976
      // 0d0: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0d3: putfield com/finalshell/crypto/ConnectHost.U Ljava/lang/String;
      // 0d6: aload 0
      // 0d7: sipush 21143
      // 0da: ldc2_w 4494981248157306360
      // 0dd: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0e0: putfield com/finalshell/crypto/ConnectHost.x I
      // 0e3: aload 0
      // 0e4: aconst_null
      // 0e5: putfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 0e8: aload 0
      // 0e9: aconst_null
      // 0ea: putfield com/finalshell/crypto/ConnectHost.iS [B
      // 0ed: aload 0
      // 0ee: aload 0
      // 0ef: putfield com/finalshell/crypto/ConnectHost.i2 Lcom/finalshell/crypto/ConnectHost;
      // 0f2: aload 0
      // 0f3: new java/util/ArrayList
      // 0f6: dup
      // 0f7: invokespecial java/util/ArrayList.<init> ()V
      // 0fa: putfield com/finalshell/crypto/ConnectHost.a Ljava/util/ArrayList;
      // 0fd: aload 0
      // 0fe: bipush 0
      // 0ff: putfield com/finalshell/crypto/ConnectHost.I Z
      // 102: aload 0
      // 103: bipush 0
      // 104: putfield com/finalshell/crypto/ConnectHost.iv Z
      // 107: aload 0
      // 108: bipush 0
      // 109: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 10c: aload 0
      // 10d: bipush 0
      // 10e: putfield com/finalshell/crypto/ConnectHost.W Z
      // 111: aload 0
      // 112: aconst_null
      // 113: putfield com/finalshell/crypto/ConnectHost.E [Ljava/lang/String;
      // 116: aload 0
      // 117: bipush 1
      // 118: newarray 10
      // 11a: putfield com/finalshell/crypto/ConnectHost.iY [I
      // 11d: aload 0
      // 11e: bipush 1
      // 11f: newarray 10
      // 121: putfield com/finalshell/crypto/ConnectHost.T [I
      // 124: aload 0
      // 125: sipush 11298
      // 128: ldc2_w 2411481202322158430
      // 12b: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 12e: putfield com/finalshell/crypto/ConnectHost.il I
      // 131: aload 0
      // 132: sipush 11298
      // 135: ldc2_w 2411481202322158430
      // 138: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 13b: putfield com/finalshell/crypto/ConnectHost.A I
      // 13e: aload 0
      // 13f: new com/finalshell/core/Fw2
      // 142: dup
      // 143: aconst_null
      // 144: invokespecial com/finalshell/core/Fw2.<init> (Lcom/finalshell/core/W7;)V
      // 147: putfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 14a: aload 0
      // 14b: aconst_null
      // 14c: putfield com/finalshell/crypto/ConnectHost.iM Lcom/finalshell/core/DQ;
      // 14f: aload 0
      // 150: aload 1
      // 151: putfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 154: aload 0
      // 155: new com/finalshell/core/UJ
      // 158: dup
      // 159: invokespecial com/finalshell/core/UJ.<init> ()V
      // 15c: putfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 15f: aload 0
      // 160: new com/finalshell/core/YU
      // 163: dup
      // 164: aload 0
      // 165: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 168: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 16b: putfield com/finalshell/crypto/ConnectHost.D Lcom/finalshell/core/YU;
      // 16e: aload 0
      // 16f: aload 2
      // 170: putfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 173: aload 0
      // 174: aload 0
      // 175: aload 3
      // 176: dup_x1
      // 177: putfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 17a: putfield com/finalshell/crypto/ConnectHost.U Ljava/lang/String;
      // 17d: aload 0
      // 17e: iload 4
      // 180: putfield com/finalshell/crypto/ConnectHost.x I
      // 183: aload 0
      // 184: invokespecial com/finalshell/crypto/ConnectHost.Y$void ()V
      // 187: aload 0
      // 188: getfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 18b: iload 5
      // 18d: ifne 1b5
      // 190: ifnonnull 1b1
      // 193: goto 19a
      // 196: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: aload 0
      // 19b: sipush -8749
      // 19e: sipush -27021
      // 1a1: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1a4: invokestatic com/finalshell/core/E8.T (Ljava/lang/String;)Ljava/lang/String;
      // 1a7: putfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: getfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 1b5: ifnonnull 1cd
      // 1b8: new com/finalshell/core/Pc2
      // 1bb: dup
      // 1bc: sipush -8851
      // 1bf: sipush 9682
      // 1c2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1c5: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1c8: athrow
      // 1c9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: iload 5
      // 1cf: ifeq 1e0
      // 1d2: bipush 4
      // 1d3: anewarray 160
      // 1d6: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 1d9: goto 1e0
      // 1dc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: return
   }

   public void C$void() throws Pc2 {
      this.B(this.iD);
   }

   public boolean Y$boolean() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/crypto/ConnectHost.iv Z
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public void B(int param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 0003: istore 2
      // 0004: aload 0
      // 0005: iload 2
      // 0006: ifeq 0047
      // 0009: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 000c: ifeq 002b
      // 000f: goto 0016
      // 0012: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0015: athrow
      // 0016: new com/finalshell/core/Pc2
      // 0019: dup
      // 001a: sipush -8772
      // 001d: sipush 10471
      // 0020: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0023: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0026: athrow
      // 0027: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 002a: athrow
      // 002b: aload 0
      // 002c: bipush 1
      // 002d: putfield com/finalshell/crypto/ConnectHost.I Z
      // 0030: aload 0
      // 0031: new com/finalshell/core/Yl4
      // 0034: dup
      // 0035: aload 0
      // 0036: ldc2_w 411125898711485254
      // 0039: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 003c: aconst_null
      // 003d: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0040: invokespecial com/finalshell/core/Yl4.<init> (Lcom/finalshell/crypto/ConnectHost;I)V
      // 0043: invokevirtual com/finalshell/crypto/ConnectHost.r (Lcom/finalshell/core/Yl4;)V
      // 0046: aload 0
      // 0047: new com/finalshell/core/Cs4
      // 004a: dup
      // 004b: invokespecial com/finalshell/core/Cs4.<init> ()V
      // 004e: putfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 0051: getstatic com/finalshell/crypto/ConnectHost.p Lcom/finalshell/core/I82;
      // 0054: iload 2
      // 0055: ifeq 00a2
      // 0058: ifnonnull 009f
      // 005b: goto 0062
      // 005e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0061: athrow
      // 0062: aload 0
      // 0063: sipush -8943
      // 0066: sipush 11733
      // 0069: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 006c: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 006f: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0072: ldc_w com/finalshell/core/I82
      // 0075: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 0078: astore 3
      // 0079: aload 3
      // 007a: bipush 0
      // 007b: anewarray 607
      // 007e: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0081: bipush 0
      // 0082: anewarray 4
      // 0085: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0088: checkcast com/finalshell/core/I82
      // 008b: putstatic com/finalshell/crypto/ConnectHost.p Lcom/finalshell/core/I82;
      // 008e: goto 009f
      // 0091: astore 3
      // 0092: new com/finalshell/core/Pc2
      // 0095: dup
      // 0096: aload 3
      // 0097: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 009a: aload 3
      // 009b: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 009e: athrow
      // 009f: getstatic com/finalshell/crypto/ConnectHost.p Lcom/finalshell/core/I82;
      // 00a2: invokestatic com/finalshell/core/YU.c (Lcom/finalshell/core/I82;)V
      // 00a5: aload 0
      // 00a6: iload 2
      // 00a7: ifeq 00ff
      // 00aa: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 00ad: bipush 1
      // 00ae: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 00b3: ifeq 00fe
      // 00b6: goto 00bd
      // 00b9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00bc: athrow
      // 00bd: aload 0
      // 00be: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 00c1: bipush 1
      // 00c2: new java/lang/StringBuilder
      // 00c5: dup
      // 00c6: invokespecial java/lang/StringBuilder.<init> ()V
      // 00c9: sipush -8778
      // 00cc: sipush 32742
      // 00cf: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 00d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 00d5: aload 0
      // 00d6: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 00d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 00dc: sipush -8924
      // 00df: sipush 9647
      // 00e2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 00e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 00e8: aload 0
      // 00e9: getfield com/finalshell/crypto/ConnectHost.x I
      // 00ec: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 00ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 00f2: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 00f7: goto 00fe
      // 00fa: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00fd: athrow
      // 00fe: aload 0
      // 00ff: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 0102: iload 2
      // 0103: ifeq 06b7
      // 0106: ifnonnull 06ac
      // 0109: goto 0110
      // 010c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 010f: athrow
      // 0110: aload 0
      // 0111: getfield com/finalshell/crypto/ConnectHost.K Lcom/finalshell/core/PJ3;
      // 0114: iload 2
      // 0115: ifeq 0674
      // 0118: goto 011f
      // 011b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 011e: athrow
      // 011f: ifnonnull 0654
      // 0122: goto 0129
      // 0125: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0128: athrow
      // 0129: bipush 1
      // 012a: istore 7
      // 012c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 012f: ldc2_w 270389152141252877
      // 0132: astore 22
      // 0134: ldc2_w 270389152141252877
      // 0137: aload 22
      // 0139: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 013c: checkcast com/finalshell/core/YT3_2
      // 013f: goto 0146
      // 0142: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0145: athrow
      // 0146: iload 2
      // 0147: ifeq 019b
      // 014a: ifnonnull 017a
      // 014d: goto 0154
      // 0150: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0153: athrow
      // 0154: aload 0
      // 0155: aload 0
      // 0156: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 0159: aload 0
      // 015a: getfield com/finalshell/crypto/ConnectHost.x I
      // 015d: iload 1
      // 015e: invokestatic com/finalshell/core/E8.k (Ljava/lang/String;II)Ljava/net/Socket;
      // 0161: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0164: aload 0
      // 0165: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0168: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 016b: astore 5
      // 016d: aload 0
      // 016e: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0171: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 0174: astore 6
      // 0176: iload 2
      // 0177: ifne 0650
      // 017a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 017d: ldc2_w 270389152141252877
      // 0180: astore 24
      // 0182: ldc2_w 270389152141252877
      // 0185: aload 24
      // 0187: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 018a: checkcast com/finalshell/core/YT3_2
      // 018d: goto 0194
      // 0190: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0193: athrow
      // 0194: goto 019b
      // 0197: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019a: athrow
      // 019b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 019e: ldc2_w 306266403902896148
      // 01a1: astore 27
      // 01a3: astore 26
      // 01a5: ldc2_w 306266403902896148
      // 01a8: aload 26
      // 01aa: aload 27
      // 01ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01af: goto 01b6
      // 01b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01b5: athrow
      // 01b6: aload 0
      // 01b7: getfield com/finalshell/crypto/ConnectHost.Z Lcom/finalshell/core/Lv4_2;
      // 01ba: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01bd: ldc2_w 603433831346798442
      // 01c0: astore 29
      // 01c2: astore 28
      // 01c4: ldc2_w 603433831346798442
      // 01c7: aload 28
      // 01c9: aload 29
      // 01cb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01ce: goto 01d5
      // 01d1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01d4: athrow
      // 01d5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 01d8: ldc2_w 560237732988887706
      // 01db: astore 31
      // 01dd: astore 30
      // 01df: ldc2_w 560237732988887706
      // 01e2: aload 30
      // 01e4: aload 31
      // 01e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01e9: checkcast com/finalshell/core/LD3_2
      // 01ec: goto 01f3
      // 01ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01f2: athrow
      // 01f3: astore 8
      // 01f5: aconst_null
      // 01f6: astore 9
      // 01f8: aload 0
      // 01f9: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 01fc: iload 2
      // 01fd: ifeq 0215
      // 0200: ifnull 021a
      // 0203: goto 020a
      // 0206: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0209: athrow
      // 020a: aload 0
      // 020b: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 020e: goto 0215
      // 0211: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0214: athrow
      // 0215: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$QT ()Lcom/finalshell/core/QT;
      // 0218: astore 9
      // 021a: aload 0
      // 021b: getfield com/finalshell/crypto/ConnectHost.Z Lcom/finalshell/core/Lv4_2;
      // 021e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0221: ldc2_w 603433831346798442
      // 0224: astore 33
      // 0226: astore 32
      // 0228: ldc2_w 603433831346798442
      // 022b: aload 32
      // 022d: aload 33
      // 022f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0232: checkcast java/lang/String
      // 0235: goto 023c
      // 0238: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 023b: athrow
      // 023c: ldc_w "0"
      // 023f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0242: iload 2
      // 0243: ifeq 03be
      // 0246: ifeq 0387
      // 0249: goto 0250
      // 024c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024f: athrow
      // 0250: aload 0
      // 0251: iload 2
      // 0252: ifeq 02c8
      // 0255: goto 025c
      // 0258: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025b: athrow
      // 025c: getfield com/finalshell/crypto/ConnectHost.Z Lcom/finalshell/core/Lv4_2;
      // 025f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0262: ldc2_w 581008912184751225
      // 0265: astore 35
      // 0267: astore 34
      // 0269: ldc2_w 581008912184751225
      // 026c: aload 34
      // 026e: aload 35
      // 0270: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0273: checkcast java/lang/Boolean
      // 0276: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0279: goto 0280
      // 027c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 027f: athrow
      // 0280: ifeq 02a3
      // 0283: goto 028a
      // 0286: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0289: athrow
      // 028a: aload 0
      // 028b: iload 2
      // 028c: ifeq 02f2
      // 028f: goto 0296
      // 0292: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0295: athrow
      // 0296: getfield com/finalshell/crypto/ConnectHost.iF Z
      // 0299: ifeq 02dd
      // 029c: goto 02a3
      // 029f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a2: athrow
      // 02a3: aload 0
      // 02a4: sipush -8789
      // 02a7: sipush -23740
      // 02aa: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 02ad: invokespecial com/finalshell/crypto/ConnectHost.c (Ljava/lang/String;)V
      // 02b0: aload 0
      // 02b1: aload 0
      // 02b2: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 02b5: aload 0
      // 02b6: getfield com/finalshell/crypto/ConnectHost.x I
      // 02b9: iload 1
      // 02ba: invokestatic com/finalshell/core/E8.k (Ljava/lang/String;II)Ljava/net/Socket;
      // 02bd: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 02c0: aload 0
      // 02c1: goto 02c8
      // 02c4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c7: athrow
      // 02c8: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 02cb: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 02ce: astore 5
      // 02d0: aload 0
      // 02d1: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 02d4: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 02d7: astore 6
      // 02d9: iload 2
      // 02da: ifne 0650
      // 02dd: aload 0
      // 02de: sipush -8859
      // 02e1: sipush 25028
      // 02e4: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 02e7: invokespecial com/finalshell/crypto/ConnectHost.c (Ljava/lang/String;)V
      // 02ea: aload 0
      // 02eb: goto 02f2
      // 02ee: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f1: athrow
      // 02f2: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 02f5: aload 0
      // 02f6: getfield com/finalshell/crypto/ConnectHost.x I
      // 02f9: aload 0
      // 02fa: getfield com/finalshell/crypto/ConnectHost.t I
      // 02fd: aload 9
      // 02ff: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;
      // 0302: ldc2_w 252674541260190421
      // 0305: astore 36
      // 0307: ldc2_w 252674541260190421
      // 030a: aload 36
      // 030c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 030f: checkcast com/finalshell/core/Ow4_2
      // 0312: goto 0319
      // 0315: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0318: athrow
      // 0319: astore 10
      // 031b: aload 0
      // 031c: aload 10
      // 031e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0321: ldc2_w 554768132038690933
      // 0324: astore 39
      // 0326: astore 38
      // 0328: ldc2_w 554768132038690933
      // 032b: aload 38
      // 032d: aload 39
      // 032f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0332: checkcast java/net/Socket
      // 0335: goto 033c
      // 0338: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 033b: athrow
      // 033c: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 033f: aload 10
      // 0341: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0344: ldc2_w 338384932181778709
      // 0347: astore 41
      // 0349: astore 40
      // 034b: ldc2_w 338384932181778709
      // 034e: aload 40
      // 0350: aload 41
      // 0352: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0355: checkcast java/io/InputStream
      // 0358: goto 035f
      // 035b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 035e: athrow
      // 035f: astore 5
      // 0361: aload 10
      // 0363: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0366: ldc2_w 306921991173116420
      // 0369: astore 43
      // 036b: astore 42
      // 036d: ldc2_w 306921991173116420
      // 0370: aload 42
      // 0372: aload 43
      // 0374: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0377: checkcast java/io/OutputStream
      // 037a: goto 0381
      // 037d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0380: athrow
      // 0381: astore 6
      // 0383: iload 2
      // 0384: ifne 0650
      // 0387: aload 0
      // 0388: sipush -8910
      // 038b: sipush -15810
      // 038e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0391: invokespecial com/finalshell/crypto/ConnectHost.c (Ljava/lang/String;)V
      // 0394: aload 8
      // 0396: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0399: ldc2_w 562951426394330328
      // 039c: astore 45
      // 039e: astore 44
      // 03a0: ldc2_w 562951426394330328
      // 03a3: aload 44
      // 03a5: aload 45
      // 03a7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03aa: checkcast java/lang/Integer
      // 03ad: invokevirtual java/lang/Integer.intValue ()I
      // 03b0: goto 03b7
      // 03b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03b6: athrow
      // 03b7: goto 03be
      // 03ba: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03bd: athrow
      // 03be: ldc2_w 392143205024518869
      // 03c1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 03c4: aconst_null
      // 03c5: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 03c8: iload 2
      // 03c9: ifeq 05a2
      // 03cc: if_icmpne 056e
      // 03cf: goto 03d6
      // 03d2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d5: athrow
      // 03d6: aconst_null
      // 03d7: astore 10
      // 03d9: aload 8
      // 03db: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03de: ldc2_w 562777604625200665
      // 03e1: astore 47
      // 03e3: astore 46
      // 03e5: ldc2_w 562777604625200665
      // 03e8: aload 46
      // 03ea: aload 47
      // 03ec: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03ef: goto 03f6
      // 03f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03f5: athrow
      // 03f6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 03f9: ldc2_w 330094358428833085
      // 03fc: astore 48
      // 03fe: ldc2_w 330094358428833085
      // 0401: aload 48
      // 0403: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0406: checkcast java/lang/Boolean
      // 0409: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 040c: goto 0413
      // 040f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0412: athrow
      // 0413: iload 2
      // 0414: ifeq 0462
      // 0417: ifne 04fb
      // 041a: goto 0421
      // 041d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0420: athrow
      // 0421: aload 8
      // 0423: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0426: ldc2_w 465224899237569377
      // 0429: astore 51
      // 042b: astore 50
      // 042d: ldc2_w 465224899237569377
      // 0430: aload 50
      // 0432: aload 51
      // 0434: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0437: goto 043e
      // 043a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 043d: athrow
      // 043e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0441: ldc2_w 330094358428833085
      // 0444: astore 52
      // 0446: ldc2_w 330094358428833085
      // 0449: aload 52
      // 044b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 044e: checkcast java/lang/Boolean
      // 0451: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0454: goto 045b
      // 0457: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 045a: athrow
      // 045b: goto 0462
      // 045e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0461: athrow
      // 0462: ifne 04fb
      // 0465: new sockslib/client/Socks5
      // 0468: dup
      // 0469: new java/net/InetSocketAddress
      // 046c: dup
      // 046d: aload 8
      // 046f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0472: ldc2_w 531355023953548464
      // 0475: astore 55
      // 0477: astore 54
      // 0479: ldc2_w 531355023953548464
      // 047c: aload 54
      // 047e: aload 55
      // 0480: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0483: checkcast java/lang/String
      // 0486: goto 048d
      // 0489: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 048c: athrow
      // 048d: aload 8
      // 048f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0492: ldc2_w 511476850441845458
      // 0495: astore 57
      // 0497: astore 56
      // 0499: ldc2_w 511476850441845458
      // 049c: aload 56
      // 049e: aload 57
      // 04a0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04a3: checkcast java/lang/Integer
      // 04a6: invokevirtual java/lang/Integer.intValue ()I
      // 04a9: goto 04b0
      // 04ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04af: athrow
      // 04b0: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 04b3: aload 8
      // 04b5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04b8: ldc2_w 562777604625200665
      // 04bb: astore 59
      // 04bd: astore 58
      // 04bf: ldc2_w 562777604625200665
      // 04c2: aload 58
      // 04c4: aload 59
      // 04c6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04c9: checkcast java/lang/String
      // 04cc: goto 04d3
      // 04cf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04d2: athrow
      // 04d3: aload 8
      // 04d5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04d8: ldc2_w 465224899237569377
      // 04db: astore 61
      // 04dd: astore 60
      // 04df: ldc2_w 465224899237569377
      // 04e2: aload 60
      // 04e4: aload 61
      // 04e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04e9: checkcast java/lang/String
      // 04ec: goto 04f3
      // 04ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04f2: athrow
      // 04f3: invokespecial sockslib/client/Socks5.<init> (Ljava/net/SocketAddress;Ljava/lang/String;Ljava/lang/String;)V
      // 04f6: astore 10
      // 04f8: goto 054e
      // 04fb: new sockslib/client/Socks5
      // 04fe: dup
      // 04ff: new java/net/InetSocketAddress
      // 0502: dup
      // 0503: aload 8
      // 0505: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0508: ldc2_w 531355023953548464
      // 050b: astore 63
      // 050d: astore 62
      // 050f: ldc2_w 531355023953548464
      // 0512: aload 62
      // 0514: aload 63
      // 0516: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0519: checkcast java/lang/String
      // 051c: goto 0523
      // 051f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0522: athrow
      // 0523: aload 8
      // 0525: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0528: ldc2_w 511476850441845458
      // 052b: astore 65
      // 052d: astore 64
      // 052f: ldc2_w 511476850441845458
      // 0532: aload 64
      // 0534: aload 65
      // 0536: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0539: checkcast java/lang/Integer
      // 053c: invokevirtual java/lang/Integer.intValue ()I
      // 053f: goto 0546
      // 0542: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0545: athrow
      // 0546: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 0549: invokespecial sockslib/client/Socks5.<init> (Ljava/net/SocketAddress;)V
      // 054c: astore 10
      // 054e: aload 0
      // 054f: new sockslib/client/SocksSocket
      // 0552: dup
      // 0553: aload 10
      // 0555: new java/net/InetSocketAddress
      // 0558: dup
      // 0559: aload 0
      // 055a: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 055d: aload 0
      // 055e: getfield com/finalshell/crypto/ConnectHost.x I
      // 0561: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 0564: invokespecial sockslib/client/SocksSocket.<init> (Lsockslib/client/SocksProxy;Ljava/net/SocketAddress;)V
      // 0567: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 056a: iload 2
      // 056b: ifne 063e
      // 056e: aload 8
      // 0570: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0573: ldc2_w 562951426394330328
      // 0576: astore 67
      // 0578: astore 66
      // 057a: ldc2_w 562951426394330328
      // 057d: aload 66
      // 057f: aload 67
      // 0581: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0584: checkcast java/lang/Integer
      // 0587: invokevirtual java/lang/Integer.intValue ()I
      // 058a: goto 0591
      // 058d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0590: athrow
      // 0591: ldc2_w 319971801115033366
      // 0594: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0597: aconst_null
      // 0598: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 059b: goto 05a2
      // 059e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a1: athrow
      // 05a2: if_icmpne 063e
      // 05a5: aload 0
      // 05a6: aload 0
      // 05a7: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 05aa: aload 0
      // 05ab: getfield com/finalshell/crypto/ConnectHost.x I
      // 05ae: aload 8
      // 05b0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05b3: ldc2_w 531355023953548464
      // 05b6: astore 69
      // 05b8: astore 68
      // 05ba: ldc2_w 531355023953548464
      // 05bd: aload 68
      // 05bf: aload 69
      // 05c1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05c4: checkcast java/lang/String
      // 05c7: goto 05ce
      // 05ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05cd: athrow
      // 05ce: aload 8
      // 05d0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05d3: ldc2_w 511476850441845458
      // 05d6: astore 71
      // 05d8: astore 70
      // 05da: ldc2_w 511476850441845458
      // 05dd: aload 70
      // 05df: aload 71
      // 05e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05e4: checkcast java/lang/Integer
      // 05e7: invokevirtual java/lang/Integer.intValue ()I
      // 05ea: goto 05f1
      // 05ed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05f0: athrow
      // 05f1: aload 8
      // 05f3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05f6: ldc2_w 562777604625200665
      // 05f9: astore 73
      // 05fb: astore 72
      // 05fd: ldc2_w 562777604625200665
      // 0600: aload 72
      // 0602: aload 73
      // 0604: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0607: checkcast java/lang/String
      // 060a: goto 0611
      // 060d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0610: athrow
      // 0611: aload 8
      // 0613: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0616: ldc2_w 465224899237569377
      // 0619: astore 75
      // 061b: astore 74
      // 061d: ldc2_w 465224899237569377
      // 0620: aload 74
      // 0622: aload 75
      // 0624: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0627: checkcast java/lang/String
      // 062a: goto 0631
      // 062d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0630: athrow
      // 0631: invokestatic com/finalshell/core/Fi4.I (Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
      // 0634: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0637: goto 063e
      // 063a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063d: athrow
      // 063e: aload 0
      // 063f: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0642: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 0645: astore 5
      // 0647: aload 0
      // 0648: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 064b: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 064e: astore 6
      // 0650: iload 2
      // 0651: ifne 068e
      // 0654: aload 0
      // 0655: aload 0
      // 0656: getfield com/finalshell/crypto/ConnectHost.K Lcom/finalshell/core/PJ3;
      // 0659: aload 0
      // 065a: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 065d: aload 0
      // 065e: getfield com/finalshell/crypto/ConnectHost.x I
      // 0661: invokeinterface com/finalshell/core/PJ3.y (Ljava/lang/String;I)Ljava/net/Socket; 3
      // 0666: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0669: aload 0
      // 066a: getfield com/finalshell/crypto/ConnectHost.K Lcom/finalshell/core/PJ3;
      // 066d: goto 0674
      // 0670: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0673: athrow
      // 0674: aload 0
      // 0675: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0678: invokeinterface com/finalshell/core/PJ3.j (Ljava/net/Socket;)Ljava/io/InputStream; 2
      // 067d: astore 5
      // 067f: aload 0
      // 0680: getfield com/finalshell/crypto/ConnectHost.K Lcom/finalshell/core/PJ3;
      // 0683: aload 0
      // 0684: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0687: invokeinterface com/finalshell/core/PJ3.P (Ljava/net/Socket;)Ljava/io/OutputStream; 2
      // 068c: astore 6
      // 068e: aload 0
      // 068f: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0692: bipush 1
      // 0693: invokevirtual java/net/Socket.setTcpNoDelay (Z)V
      // 0696: aload 0
      // 0697: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 069a: aload 5
      // 069c: invokevirtual com/finalshell/core/Cs4.U (Ljava/io/InputStream;)V
      // 069f: aload 0
      // 06a0: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 06a3: aload 6
      // 06a5: invokevirtual com/finalshell/core/Cs4.H (Ljava/io/OutputStream;)V
      // 06a8: iload 2
      // 06a9: ifne 070c
      // 06ac: aload 0
      // 06ad: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 06b0: goto 06b7
      // 06b3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06b6: athrow
      // 06b7: dup
      // 06b8: astore 5
      // 06ba: monitorenter
      // 06bb: aload 0
      // 06bc: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 06bf: aload 0
      // 06c0: getfield com/finalshell/crypto/ConnectHost.K Lcom/finalshell/core/PJ3;
      // 06c3: aload 0
      // 06c4: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 06c7: aload 0
      // 06c8: getfield com/finalshell/crypto/ConnectHost.x I
      // 06cb: iload 1
      // 06cc: invokeinterface com/finalshell/core/Ic4.e (Lcom/finalshell/core/PJ3;Ljava/lang/String;II)V 5
      // 06d1: aload 0
      // 06d2: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 06d5: aload 0
      // 06d6: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 06d9: invokeinterface com/finalshell/core/Ic4.R ()Ljava/io/InputStream; 1
      // 06de: invokevirtual com/finalshell/core/Cs4.U (Ljava/io/InputStream;)V
      // 06e1: aload 0
      // 06e2: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 06e5: aload 0
      // 06e6: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 06e9: invokeinterface com/finalshell/core/Ic4.p ()Ljava/io/OutputStream; 1
      // 06ee: invokevirtual com/finalshell/core/Cs4.H (Ljava/io/OutputStream;)V
      // 06f1: aload 0
      // 06f2: aload 0
      // 06f3: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 06f6: invokeinterface com/finalshell/core/Ic4.W ()Ljava/net/Socket; 1
      // 06fb: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 06fe: aload 5
      // 0700: monitorexit
      // 0701: goto 070c
      // 0704: astore 11
      // 0706: aload 5
      // 0708: monitorexit
      // 0709: aload 11
      // 070b: athrow
      // 070c: iload 1
      // 070d: iload 2
      // 070e: ifeq 0752
      // 0711: ifle 0743
      // 0714: goto 071b
      // 0717: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071a: athrow
      // 071b: aload 0
      // 071c: iload 2
      // 071d: ifeq 0749
      // 0720: goto 0727
      // 0723: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0726: athrow
      // 0727: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 072a: ifnull 0743
      // 072d: goto 0734
      // 0730: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0733: athrow
      // 0734: aload 0
      // 0735: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 0738: iload 1
      // 0739: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 073c: goto 0743
      // 073f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0742: athrow
      // 0743: aload 0
      // 0744: bipush 1
      // 0745: putfield com/finalshell/crypto/ConnectHost.iJ Z
      // 0748: aload 0
      // 0749: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 074c: bipush 1
      // 074d: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0752: iload 2
      // 0753: ifeq 0789
      // 0756: ifeq 077a
      // 0759: goto 0760
      // 075c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075f: athrow
      // 0760: aload 0
      // 0761: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0764: bipush 1
      // 0765: sipush -8849
      // 0768: sipush -22677
      // 076b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 076e: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0773: goto 077a
      // 0776: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0779: athrow
      // 077a: aload 0
      // 077b: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 077e: aload 0
      // 077f: invokevirtual com/finalshell/core/Xe2.f (Lcom/finalshell/crypto/ConnectHost;)V
      // 0782: aload 0
      // 0783: getfield com/finalshell/crypto/ConnectHost.ii [B
      // 0786: arraylength
      // 0787: bipush 2
      // 0788: iadd
      // 0789: newarray 8
      // 078b: astore 5
      // 078d: aload 0
      // 078e: getfield com/finalshell/crypto/ConnectHost.ii [B
      // 0791: bipush 0
      // 0792: aload 5
      // 0794: bipush 0
      // 0795: aload 0
      // 0796: getfield com/finalshell/crypto/ConnectHost.ii [B
      // 0799: arraylength
      // 079a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 079d: aload 5
      // 079f: aload 5
      // 07a1: arraylength
      // 07a2: bipush 2
      // 07a3: isub
      // 07a4: sipush 20091
      // 07a7: ldc2_w 8243915575461302566
      // 07aa: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 07ad: bastore
      // 07ae: aload 5
      // 07b0: aload 5
      // 07b2: arraylength
      // 07b3: bipush 1
      // 07b4: isub
      // 07b5: sipush 2693
      // 07b8: ldc2_w 8410780820559894005
      // 07bb: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 07be: bastore
      // 07bf: aload 0
      // 07c0: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 07c3: aload 5
      // 07c5: bipush 0
      // 07c6: aload 5
      // 07c8: arraylength
      // 07c9: invokevirtual com/finalshell/core/Cs4.z ([BII)V
      // 07cc: bipush 0
      // 07cd: istore 3
      // 07ce: bipush 0
      // 07cf: istore 4
      // 07d1: iload 3
      // 07d2: aload 0
      // 07d3: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 07d6: getfield com/finalshell/core/UJ.g [B
      // 07d9: arraylength
      // 07da: if_icmpge 0825
      // 07dd: aload 0
      // 07de: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 07e1: invokevirtual com/finalshell/core/Cs4.z ()I
      // 07e4: istore 4
      // 07e6: iload 4
      // 07e8: iload 2
      // 07e9: ifeq 0812
      // 07ec: ifge 07fa
      // 07ef: iload 2
      // 07f0: ifne 0825
      // 07f3: goto 07fa
      // 07f6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f9: athrow
      // 07fa: aload 0
      // 07fb: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 07fe: getfield com/finalshell/core/UJ.g [B
      // 0801: iload 3
      // 0802: iload 4
      // 0804: i2b
      // 0805: bastore
      // 0806: iinc 3 1
      // 0809: iload 4
      // 080b: goto 0812
      // 080e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0811: athrow
      // 0812: sipush 1142
      // 0815: ldc2_w 894528359454743333
      // 0818: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 081b: if_icmpne 07d1
      // 081e: iload 2
      // 081f: ifeq 07e6
      // 0822: goto 0825
      // 0825: iload 4
      // 0827: iload 2
      // 0828: ifeq 0855
      // 082b: ifge 084a
      // 082e: goto 0835
      // 0831: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0834: athrow
      // 0835: new com/finalshell/core/Pc2
      // 0838: dup
      // 0839: sipush -8833
      // 083c: sipush -19387
      // 083f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0842: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0845: athrow
      // 0846: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0849: athrow
      // 084a: aload 0
      // 084b: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 084e: getfield com/finalshell/core/UJ.g [B
      // 0851: iload 3
      // 0852: bipush 1
      // 0853: isub
      // 0854: baload
      // 0855: sipush 1142
      // 0858: ldc2_w 894528359454743333
      // 085b: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 085e: iload 2
      // 085f: ifeq 08b3
      // 0862: if_icmpne 08b1
      // 0865: goto 086c
      // 0868: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086b: athrow
      // 086c: iinc 3 -1
      // 086f: iload 3
      // 0870: iload 2
      // 0871: ifeq 08b2
      // 0874: goto 087b
      // 0877: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087a: athrow
      // 087b: ifle 08b1
      // 087e: goto 0885
      // 0881: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0884: athrow
      // 0885: aload 0
      // 0886: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0889: getfield com/finalshell/core/UJ.g [B
      // 088c: iload 3
      // 088d: bipush 1
      // 088e: isub
      // 088f: baload
      // 0890: sipush 17377
      // 0893: ldc2_w 6003903457819319425
      // 0896: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0899: iload 2
      // 089a: ifeq 08b3
      // 089d: goto 08a4
      // 08a0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a3: athrow
      // 08a4: if_icmpne 08b1
      // 08a7: goto 08ae
      // 08aa: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08ad: athrow
      // 08ae: iinc 3 -1
      // 08b1: iload 3
      // 08b2: bipush 3
      // 08b3: iload 2
      // 08b4: ifeq 08ca
      // 08b7: if_icmple 07cc
      // 08ba: goto 08c1
      // 08bd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c0: athrow
      // 08c1: iload 3
      // 08c2: aload 0
      // 08c3: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 08c6: getfield com/finalshell/core/UJ.g [B
      // 08c9: arraylength
      // 08ca: iload 2
      // 08cb: ifeq 0973
      // 08ce: if_icmpeq 096a
      // 08d1: goto 08d8
      // 08d4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d7: athrow
      // 08d8: aload 0
      // 08d9: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 08dc: getfield com/finalshell/core/UJ.g [B
      // 08df: bipush 0
      // 08e0: baload
      // 08e1: sipush 21234
      // 08e4: ldc2_w 4738476818152312198
      // 08e7: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 08ea: iload 2
      // 08eb: ifeq 0911
      // 08ee: goto 08f5
      // 08f1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f4: athrow
      // 08f5: if_icmpne 07cc
      // 08f8: goto 08ff
      // 08fb: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08fe: athrow
      // 08ff: aload 0
      // 0900: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0903: getfield com/finalshell/core/UJ.g [B
      // 0906: bipush 1
      // 0907: baload
      // 0908: sipush 13373
      // 090b: ldc2_w 2688142674351598416
      // 090e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0911: iload 2
      // 0912: ifeq 0931
      // 0915: if_icmpne 07cc
      // 0918: goto 091f
      // 091b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091e: athrow
      // 091f: aload 0
      // 0920: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0923: getfield com/finalshell/core/UJ.g [B
      // 0926: bipush 2
      // 0927: baload
      // 0928: sipush 13744
      // 092b: ldc2_w 2164185390874798804
      // 092e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0931: iload 2
      // 0932: ifeq 0951
      // 0935: if_icmpne 07cc
      // 0938: goto 093f
      // 093b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093e: athrow
      // 093f: aload 0
      // 0940: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0943: getfield com/finalshell/core/UJ.g [B
      // 0946: bipush 3
      // 0947: baload
      // 0948: sipush 19078
      // 094b: ldc2_w 4891081296206714351
      // 094e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0951: iload 2
      // 0952: ifeq 0973
      // 0955: if_icmpeq 096a
      // 0958: goto 095f
      // 095b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095e: athrow
      // 095f: iload 2
      // 0960: ifne 07cc
      // 0963: goto 096a
      // 0966: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0969: athrow
      // 096a: iload 3
      // 096b: aload 0
      // 096c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 096f: getfield com/finalshell/core/UJ.g [B
      // 0972: arraylength
      // 0973: iload 2
      // 0974: ifeq 0992
      // 0977: if_icmpeq 09f6
      // 097a: goto 0981
      // 097d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0980: athrow
      // 0981: iload 3
      // 0982: sipush 30190
      // 0985: ldc2_w 7061861579194559164
      // 0988: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 098b: goto 0992
      // 098e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0991: athrow
      // 0992: iload 2
      // 0993: ifeq 09c4
      // 0996: if_icmplt 09f6
      // 0999: goto 09a0
      // 099c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099f: athrow
      // 09a0: aload 0
      // 09a1: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 09a4: getfield com/finalshell/core/UJ.g [B
      // 09a7: bipush 4
      // 09a8: iload 2
      // 09a9: ifeq 0a1a
      // 09ac: goto 09b3
      // 09af: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b2: athrow
      // 09b3: baload
      // 09b4: sipush 3264
      // 09b7: ldc2_w 8234307994563416991
      // 09ba: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 09bd: goto 09c4
      // 09c0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c3: athrow
      // 09c4: if_icmpne 0a0b
      // 09c7: aload 0
      // 09c8: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 09cb: getfield com/finalshell/core/UJ.g [B
      // 09ce: sipush 26688
      // 09d1: ldc2_w 5499307281655199511
      // 09d4: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 09d7: iload 2
      // 09d8: ifeq 0a1a
      // 09db: goto 09e2
      // 09de: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e1: athrow
      // 09e2: baload
      // 09e3: sipush 26648
      // 09e6: ldc2_w 3529520793678673759
      // 09e9: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 09ec: if_icmpeq 0a0b
      // 09ef: goto 09f6
      // 09f2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f5: athrow
      // 09f6: new com/finalshell/core/Pc2
      // 09f9: dup
      // 09fa: sipush -8758
      // 09fd: sipush -3519
      // 0a00: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0a03: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0a06: athrow
      // 0a07: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0a: athrow
      // 0a0b: aload 0
      // 0a0c: iload 3
      // 0a0d: newarray 8
      // 0a0f: putfield com/finalshell/crypto/ConnectHost.i0 [B
      // 0a12: aload 0
      // 0a13: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0a16: getfield com/finalshell/core/UJ.g [B
      // 0a19: bipush 0
      // 0a1a: aload 0
      // 0a1b: getfield com/finalshell/crypto/ConnectHost.i0 [B
      // 0a1e: bipush 0
      // 0a1f: iload 3
      // 0a20: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a23: aload 0
      // 0a24: getfield com/finalshell/crypto/ConnectHost.i0 [B
      // 0a27: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 0a2a: astore 5
      // 0a2c: aload 0
      // 0a2d: aload 5
      // 0a2f: sipush -8839
      // 0a32: sipush -24542
      // 0a35: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0a38: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0a3b: putfield com/finalshell/crypto/ConnectHost.n Z
      // 0a3e: aload 0
      // 0a3f: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0a42: bipush 1
      // 0a43: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0a48: iload 2
      // 0a49: ifeq 0ac3
      // 0a4c: ifeq 0aac
      // 0a4f: goto 0a56
      // 0a52: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a55: athrow
      // 0a56: aload 0
      // 0a57: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0a5a: bipush 1
      // 0a5b: new java/lang/StringBuilder
      // 0a5e: dup
      // 0a5f: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a62: sipush -8845
      // 0a65: sipush -27624
      // 0a68: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0a6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6e: aload 5
      // 0a70: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a73: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a76: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0a7b: aload 0
      // 0a7c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0a7f: bipush 1
      // 0a80: new java/lang/StringBuilder
      // 0a83: dup
      // 0a84: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a87: sipush -8955
      // 0a8a: sipush -25639
      // 0a8d: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0a90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a93: aload 0
      // 0a94: getfield com/finalshell/crypto/ConnectHost.ii [B
      // 0a97: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 0a9a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a9d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0aa0: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0aa5: goto 0aac
      // 0aa8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aab: athrow
      // 0aac: aload 0
      // 0aad: invokespecial com/finalshell/crypto/ConnectHost.x$void ()V
      // 0ab0: aload 0
      // 0ab1: aload 0
      // 0ab2: aload 0
      // 0ab3: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0ab6: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 0ab9: putfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0abc: aload 0
      // 0abd: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0ac0: invokevirtual com/finalshell/core/UJ.A ()B
      // 0ac3: iload 2
      // 0ac4: ifeq 0b20
      // 0ac7: sipush 14970
      // 0aca: ldc2_w 2877576147334079800
      // 0acd: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0ad0: if_icmpeq 0b0b
      // 0ad3: goto 0ada
      // 0ad6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad9: athrow
      // 0ada: aload 0
      // 0adb: bipush 0
      // 0adc: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 0adf: new com/finalshell/core/Pc2
      // 0ae2: dup
      // 0ae3: new java/lang/StringBuilder
      // 0ae6: dup
      // 0ae7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0aea: sipush -8832
      // 0aed: sipush -24906
      // 0af0: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0af3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af6: aload 0
      // 0af7: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0afa: invokevirtual com/finalshell/core/UJ.A ()B
      // 0afd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0b00: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b03: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0b06: athrow
      // 0b07: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0a: athrow
      // 0b0b: aload 0
      // 0b0c: iload 2
      // 0b0d: ifeq 0b3e
      // 0b10: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0b13: bipush 1
      // 0b14: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0b19: goto 0b20
      // 0b1c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1f: athrow
      // 0b20: ifeq 0b3d
      // 0b23: aload 0
      // 0b24: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0b27: bipush 1
      // 0b28: sipush -8753
      // 0b2b: sipush -2690
      // 0b2e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0b31: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0b36: goto 0b3d
      // 0b39: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3c: athrow
      // 0b3d: aload 0
      // 0b3e: aload 0
      // 0b3f: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0b42: invokespecial com/finalshell/crypto/ConnectHost.L (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/Cv2;
      // 0b45: astore 6
      // 0b47: aload 0
      // 0b48: aload 0
      // 0b49: aload 0
      // 0b4a: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0b4d: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 0b50: putfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0b53: aload 6
      // 0b55: invokevirtual com/finalshell/core/Cv2.j$int ()I
      // 0b58: aload 0
      // 0b59: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0b5c: invokevirtual com/finalshell/core/UJ.A ()B
      // 0b5f: if_icmpne 0bb0
      // 0b62: aload 0
      // 0b63: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b66: putfield com/finalshell/crypto/ConnectHost.R J
      // 0b69: aload 6
      // 0b6b: aload 0
      // 0b6c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0b6f: invokevirtual com/finalshell/core/Cv2.f (Lcom/finalshell/core/UJ;)Z
      // 0b72: istore 7
      // 0b74: iload 2
      // 0b75: ifeq 0b89
      // 0b78: iload 7
      // 0b7a: ifne 0bac
      // 0b7d: aload 0
      // 0b7e: bipush 0
      // 0b7f: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 0b82: goto 0b89
      // 0b85: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b88: athrow
      // 0b89: new com/finalshell/core/Pc2
      // 0b8c: dup
      // 0b8d: new java/lang/StringBuilder
      // 0b90: dup
      // 0b91: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b94: sipush -8730
      // 0b97: sipush -2679
      // 0b9a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0b9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ba0: iload 7
      // 0ba2: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 0ba5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ba8: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0bab: athrow
      // 0bac: iload 2
      // 0bad: ifne 0be1
      // 0bb0: aload 0
      // 0bb1: bipush 0
      // 0bb2: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 0bb5: new com/finalshell/core/Pc2
      // 0bb8: dup
      // 0bb9: new java/lang/StringBuilder
      // 0bbc: dup
      // 0bbd: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bc0: sipush -8775
      // 0bc3: sipush -4532
      // 0bc6: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0bc9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bcc: aload 0
      // 0bcd: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0bd0: invokevirtual com/finalshell/core/UJ.A ()B
      // 0bd3: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0bd6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0bd9: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0bdc: athrow
      // 0bdd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be0: athrow
      // 0be1: aload 6
      // 0be3: invokevirtual com/finalshell/core/Cv2.j$int ()I
      // 0be6: ifne 0b47
      // 0be9: iload 2
      // 0bea: ifeq 0b74
      // 0bed: goto 0bf0
      // 0bf0: invokestatic java/lang/System.currentTimeMillis ()J
      // 0bf3: lstore 7
      // 0bf5: aload 0
      // 0bf6: bipush 1
      // 0bf7: putfield com/finalshell/crypto/ConnectHost.W Z
      // 0bfa: aload 0
      // 0bfb: aload 0
      // 0bfc: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 0bff: aload 0
      // 0c00: getfield com/finalshell/crypto/ConnectHost.x I
      // 0c03: aload 6
      // 0c05: invokespecial com/finalshell/crypto/ConnectHost.X (Ljava/lang/String;ILcom/finalshell/core/Cv2;)V
      // 0c08: aload 0
      // 0c09: bipush 0
      // 0c0a: putfield com/finalshell/crypto/ConnectHost.W Z
      // 0c0d: aload 0
      // 0c0e: dup
      // 0c0f: getfield com/finalshell/crypto/ConnectHost.R J
      // 0c12: invokestatic java/lang/System.currentTimeMillis ()J
      // 0c15: lload 7
      // 0c17: lsub
      // 0c18: ladd
      // 0c19: putfield com/finalshell/crypto/ConnectHost.R J
      // 0c1c: goto 0c2e
      // 0c1f: astore 7
      // 0c21: aload 0
      // 0c22: bipush 0
      // 0c23: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 0c26: aload 0
      // 0c27: bipush 0
      // 0c28: putfield com/finalshell/crypto/ConnectHost.W Z
      // 0c2b: aload 7
      // 0c2d: athrow
      // 0c2e: aload 0
      // 0c2f: invokevirtual com/finalshell/crypto/ConnectHost.L ()V
      // 0c32: aload 0
      // 0c33: invokespecial com/finalshell/crypto/ConnectHost.i$void ()V
      // 0c36: aload 0
      // 0c37: aload 0
      // 0c38: aload 0
      // 0c39: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0c3c: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 0c3f: putfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0c42: aload 0
      // 0c43: iload 2
      // 0c44: ifeq 0caf
      // 0c47: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0c4a: invokevirtual com/finalshell/core/UJ.A ()B
      // 0c4d: sipush 358
      // 0c50: ldc2_w 6938776846677974536
      // 0c53: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0c56: if_icmpne 0ca7
      // 0c59: goto 0c60
      // 0c5c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5f: athrow
      // 0c60: aload 0
      // 0c61: iload 2
      // 0c62: ifeq 0c9a
      // 0c65: goto 0c6c
      // 0c68: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6b: athrow
      // 0c6c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0c6f: bipush 1
      // 0c70: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0c75: ifeq 0c99
      // 0c78: goto 0c7f
      // 0c7b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7e: athrow
      // 0c7f: aload 0
      // 0c80: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0c83: bipush 1
      // 0c84: sipush -8874
      // 0c87: sipush -21563
      // 0c8a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0c8d: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0c92: goto 0c99
      // 0c95: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c98: athrow
      // 0c99: aload 0
      // 0c9a: aload 0
      // 0c9b: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0c9e: aload 6
      // 0ca0: invokespecial com/finalshell/crypto/ConnectHost.b (Lcom/finalshell/core/UJ;Lcom/finalshell/core/Cv2;)V
      // 0ca3: iload 2
      // 0ca4: ifne 0cdb
      // 0ca7: aload 0
      // 0ca8: goto 0caf
      // 0cab: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cae: athrow
      // 0caf: bipush 0
      // 0cb0: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 0cb3: new com/finalshell/core/Pc2
      // 0cb6: dup
      // 0cb7: new java/lang/StringBuilder
      // 0cba: dup
      // 0cbb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cbe: sipush -8939
      // 0cc1: sipush -28538
      // 0cc4: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0cc7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cca: aload 0
      // 0ccb: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0cce: invokevirtual com/finalshell/core/UJ.A ()B
      // 0cd1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0cd4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cd7: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0cda: athrow
      // 0cdb: aload 0
      // 0cdc: sipush -8741
      // 0cdf: sipush 24796
      // 0ce2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0ce5: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0ce8: astore 7
      // 0cea: aload 7
      // 0cec: ifnull 0cff
      // 0cef: aload 0
      // 0cf0: aload 7
      // 0cf2: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0cf5: putfield com/finalshell/crypto/ConnectHost.iI I
      // 0cf8: goto 0cff
      // 0cfb: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cfe: athrow
      // 0cff: goto 0d34
      // 0d02: astore 7
      // 0d04: new com/finalshell/core/Pc2
      // 0d07: dup
      // 0d08: new java/lang/StringBuilder
      // 0d0b: dup
      // 0d0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d0f: sipush -8868
      // 0d12: sipush 17773
      // 0d15: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0d18: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d1b: aload 0
      // 0d1c: sipush -8741
      // 0d1f: sipush 24796
      // 0d22: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0d25: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0d28: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d2b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d2e: aload 7
      // 0d30: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0d33: athrow
      // 0d34: bipush 0
      // 0d35: istore 7
      // 0d37: bipush 0
      // 0d38: istore 8
      // 0d3a: aconst_null
      // 0d3b: astore 9
      // 0d3d: aload 0
      // 0d3e: sipush -8773
      // 0d41: sipush -17452
      // 0d44: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0d47: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0d4a: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0d4d: ldc_w com/finalshell/core/V2_2
      // 0d50: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 0d53: astore 10
      // 0d55: aload 10
      // 0d57: bipush 0
      // 0d58: anewarray 607
      // 0d5b: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0d5e: bipush 0
      // 0d5f: anewarray 4
      // 0d62: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0d65: checkcast com/finalshell/core/V2_2
      // 0d68: astore 9
      // 0d6a: goto 0d7e
      // 0d6d: astore 10
      // 0d6f: new com/finalshell/core/Pc2
      // 0d72: dup
      // 0d73: aload 10
      // 0d75: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 0d78: aload 10
      // 0d7a: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0d7d: athrow
      // 0d7e: aload 9
      // 0d80: aload 0
      // 0d81: invokevirtual com/finalshell/core/V2_2.D (Lcom/finalshell/crypto/ConnectHost;)Z
      // 0d84: istore 7
      // 0d86: ldc_w ""
      // 0d89: astore 10
      // 0d8b: aload 0
      // 0d8c: getfield com/finalshell/crypto/ConnectHost.Z Lcom/finalshell/core/Lv4_2;
      // 0d8f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0d92: ldc2_w 142726811055146914
      // 0d95: astore 77
      // 0d97: astore 76
      // 0d99: ldc2_w 142726811055146914
      // 0d9c: aload 76
      // 0d9e: aload 77
      // 0da0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0da3: checkcast java/lang/Integer
      // 0da6: invokevirtual java/lang/Integer.intValue ()I
      // 0da9: goto 0db0
      // 0dac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0daf: athrow
      // 0db0: ldc2_w 613057195457720571
      // 0db3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0db6: aconst_null
      // 0db7: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0dba: iload 2
      // 0dbb: ifeq 0e0d
      // 0dbe: if_icmpne 0dd7
      // 0dc1: goto 0dc8
      // 0dc4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc7: athrow
      // 0dc8: sipush -8735
      // 0dcb: sipush 32349
      // 0dce: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0dd1: astore 10
      // 0dd3: iload 2
      // 0dd4: ifne 0e6e
      // 0dd7: aload 0
      // 0dd8: getfield com/finalshell/crypto/ConnectHost.Z Lcom/finalshell/core/Lv4_2;
      // 0ddb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0dde: ldc2_w 142726811055146914
      // 0de1: astore 79
      // 0de3: astore 78
      // 0de5: ldc2_w 142726811055146914
      // 0de8: aload 78
      // 0dea: aload 79
      // 0dec: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0def: checkcast java/lang/Integer
      // 0df2: invokevirtual java/lang/Integer.intValue ()I
      // 0df5: goto 0dfc
      // 0df8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0dfb: athrow
      // 0dfc: ldc2_w 187047088046998003
      // 0dff: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e02: aconst_null
      // 0e03: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0e06: goto 0e0d
      // 0e09: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0c: athrow
      // 0e0d: iload 2
      // 0e0e: ifeq 0e60
      // 0e11: if_icmpne 0e2a
      // 0e14: goto 0e1b
      // 0e17: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1a: athrow
      // 0e1b: sipush -8919
      // 0e1e: sipush 31337
      // 0e21: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0e24: astore 10
      // 0e26: iload 2
      // 0e27: ifne 0e6e
      // 0e2a: aload 0
      // 0e2b: getfield com/finalshell/crypto/ConnectHost.Z Lcom/finalshell/core/Lv4_2;
      // 0e2e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e31: ldc2_w 142726811055146914
      // 0e34: astore 81
      // 0e36: astore 80
      // 0e38: ldc2_w 142726811055146914
      // 0e3b: aload 80
      // 0e3d: aload 81
      // 0e3f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e42: checkcast java/lang/Integer
      // 0e45: invokevirtual java/lang/Integer.intValue ()I
      // 0e48: goto 0e4f
      // 0e4b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e4e: athrow
      // 0e4f: ldc2_w 561522029490727843
      // 0e52: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e55: aconst_null
      // 0e56: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0e59: goto 0e60
      // 0e5c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5f: athrow
      // 0e60: if_icmpne 0e6e
      // 0e63: sipush -8822
      // 0e66: sipush 25387
      // 0e69: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0e6c: astore 10
      // 0e6e: aload 10
      // 0e70: ldc_w ","
      // 0e73: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 0e76: astore 11
      // 0e78: aconst_null
      // 0e79: astore 12
      // 0e7b: iload 7
      // 0e7d: ifne 0ead
      // 0e80: aload 9
      // 0e82: invokevirtual com/finalshell/core/V2_2.N ()Ljava/lang/String;
      // 0e85: astore 12
      // 0e87: aload 12
      // 0e89: iload 2
      // 0e8a: ifeq 0eab
      // 0e8d: ifnull 0ea2
      // 0e90: goto 0e97
      // 0e93: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e96: athrow
      // 0e97: aload 12
      // 0e99: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0e9c: astore 12
      // 0e9e: iload 2
      // 0e9f: ifne 0ead
      // 0ea2: aload 10
      // 0ea4: goto 0eab
      // 0ea7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eaa: athrow
      // 0eab: astore 12
      // 0ead: aload 12
      // 0eaf: ldc_w ","
      // 0eb2: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 0eb5: astore 13
      // 0eb7: bipush 0
      // 0eb8: istore 14
      // 0eba: iload 7
      // 0ebc: ifne 1212
      // 0ebf: aload 11
      // 0ec1: iload 2
      // 0ec2: ifeq 1317
      // 0ec5: ifnull 1212
      // 0ec8: goto 0ecf
      // 0ecb: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ece: athrow
      // 0ecf: iload 14
      // 0ed1: iload 2
      // 0ed2: ifeq 1214
      // 0ed5: goto 0edc
      // 0ed8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0edb: athrow
      // 0edc: aload 11
      // 0ede: arraylength
      // 0edf: if_icmpge 1212
      // 0ee2: goto 0ee9
      // 0ee5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee8: athrow
      // 0ee9: aload 11
      // 0eeb: iload 14
      // 0eed: iinc 14 1
      // 0ef0: aaload
      // 0ef1: astore 15
      // 0ef3: bipush 0
      // 0ef4: istore 16
      // 0ef6: bipush 0
      // 0ef7: istore 17
      // 0ef9: iload 17
      // 0efb: aload 13
      // 0efd: arraylength
      // 0efe: if_icmpge 0f39
      // 0f01: aload 13
      // 0f03: iload 17
      // 0f05: aaload
      // 0f06: aload 15
      // 0f08: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f0b: iload 2
      // 0f0c: ifeq 0f3b
      // 0f0f: iload 2
      // 0f10: ifeq 0f25
      // 0f13: goto 0f1a
      // 0f16: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f19: athrow
      // 0f1a: ifeq 0f2b
      // 0f1d: goto 0f24
      // 0f20: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f23: athrow
      // 0f24: bipush 1
      // 0f25: istore 16
      // 0f27: iload 2
      // 0f28: ifne 0f39
      // 0f2b: iinc 17 1
      // 0f2e: iload 2
      // 0f2f: ifne 0ef9
      // 0f32: goto 0f39
      // 0f35: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f38: athrow
      // 0f39: iload 16
      // 0f3b: iload 2
      // 0f3c: ifeq 0f5e
      // 0f3f: ifne 0f54
      // 0f42: goto 0f49
      // 0f45: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f48: athrow
      // 0f49: iload 2
      // 0f4a: ifne 0eba
      // 0f4d: goto 0f54
      // 0f50: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f53: athrow
      // 0f54: aload 0
      // 0f55: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0f58: bipush 1
      // 0f59: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0f5e: ifeq 1002
      // 0f61: sipush -8780
      // 0f64: sipush -28373
      // 0f67: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0f6a: astore 17
      // 0f6c: iload 14
      // 0f6e: bipush 1
      // 0f6f: isub
      // 0f70: istore 18
      // 0f72: iload 18
      // 0f74: aload 11
      // 0f76: arraylength
      // 0f77: if_icmpge 0fd1
      // 0f7a: new java/lang/StringBuilder
      // 0f7d: dup
      // 0f7e: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f81: aload 17
      // 0f83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f86: aload 11
      // 0f88: iload 18
      // 0f8a: aaload
      // 0f8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f91: astore 17
      // 0f93: iload 2
      // 0f94: ifeq 0fcd
      // 0f97: iload 18
      // 0f99: bipush 1
      // 0f9a: iadd
      // 0f9b: aload 11
      // 0f9d: arraylength
      // 0f9e: iload 2
      // 0f9f: ifeq 123c
      // 0fa2: goto 0fa9
      // 0fa5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa8: athrow
      // 0fa9: if_icmpge 0fca
      // 0fac: goto 0fb3
      // 0faf: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb2: athrow
      // 0fb3: new java/lang/StringBuilder
      // 0fb6: dup
      // 0fb7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fba: aload 17
      // 0fbc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fbf: ldc_w ","
      // 0fc2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fc8: astore 17
      // 0fca: iinc 18 1
      // 0fcd: iload 2
      // 0fce: ifne 0f72
      // 0fd1: aload 0
      // 0fd2: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0fd5: bipush 1
      // 0fd6: aload 17
      // 0fd8: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0fdd: aload 0
      // 0fde: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0fe1: bipush 1
      // 0fe2: new java/lang/StringBuilder
      // 0fe5: dup
      // 0fe6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fe9: sipush -8785
      // 0fec: sipush -24077
      // 0fef: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0ff2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ff5: aload 15
      // 0ff7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ffa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ffd: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 1002: aconst_null
      // 1003: astore 17
      // 1005: aconst_null
      // 1006: astore 18
      // 1008: aload 0
      // 1009: new java/lang/StringBuilder
      // 100c: dup
      // 100d: invokespecial java/lang/StringBuilder.<init> ()V
      // 1010: sipush -8902
      // 1013: sipush -10488
      // 1016: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1019: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 101c: aload 15
      // 101e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1021: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1024: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 1027: iload 2
      // 1028: ifeq 105b
      // 102b: ifnull 107b
      // 102e: goto 1035
      // 1031: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1034: athrow
      // 1035: aload 0
      // 1036: new java/lang/StringBuilder
      // 1039: dup
      // 103a: invokespecial java/lang/StringBuilder.<init> ()V
      // 103d: sipush -8920
      // 1040: sipush -4579
      // 1043: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1046: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1049: aload 15
      // 104b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1051: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 1054: goto 105b
      // 1057: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105a: athrow
      // 105b: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 105e: ldc_w com/finalshell/core/IM
      // 1061: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 1064: astore 18
      // 1066: aload 18
      // 1068: bipush 0
      // 1069: anewarray 607
      // 106c: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 106f: bipush 0
      // 1070: anewarray 4
      // 1073: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 1076: checkcast com/finalshell/core/IM
      // 1079: astore 17
      // 107b: goto 10d5
      // 107e: astore 18
      // 1080: aload 18
      // 1082: invokevirtual java/lang/Exception.printStackTrace ()V
      // 1085: aload 0
      // 1086: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 1089: bipush 2
      // 108a: iload 2
      // 108b: ifeq 10a9
      // 108e: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1093: ifeq 10d5
      // 1096: goto 109d
      // 1099: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109c: athrow
      // 109d: aload 0
      // 109e: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 10a1: bipush 2
      // 10a2: goto 10a9
      // 10a5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a8: athrow
      // 10a9: new java/lang/StringBuilder
      // 10ac: dup
      // 10ad: invokespecial java/lang/StringBuilder.<init> ()V
      // 10b0: sipush -8828
      // 10b3: sipush -9220
      // 10b6: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 10b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10bc: aload 15
      // 10be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10c1: sipush -8861
      // 10c4: sipush 23898
      // 10c7: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 10ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10d0: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 10d5: aload 17
      // 10d7: iload 2
      // 10d8: ifeq 10ea
      // 10db: ifnull 1207
      // 10de: goto 10e5
      // 10e1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e4: athrow
      // 10e5: bipush 0
      // 10e6: istore 8
      // 10e8: aload 17
      // 10ea: aload 0
      // 10eb: invokevirtual com/finalshell/core/IM.D (Lcom/finalshell/crypto/ConnectHost;)Z
      // 10ee: istore 7
      // 10f0: iload 7
      // 10f2: iload 2
      // 10f3: ifeq 111c
      // 10f6: ifeq 1157
      // 10f9: goto 1100
      // 10fc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10ff: athrow
      // 1100: aload 0
      // 1101: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 1104: bipush 1
      // 1105: iload 2
      // 1106: ifeq 112b
      // 1109: goto 1110
      // 110c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110f: athrow
      // 1110: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1115: goto 111c
      // 1118: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111b: athrow
      // 111c: ifeq 1157
      // 111f: aload 0
      // 1120: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 1123: bipush 1
      // 1124: goto 112b
      // 1127: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112a: athrow
      // 112b: new java/lang/StringBuilder
      // 112e: dup
      // 112f: invokespecial java/lang/StringBuilder.<init> ()V
      // 1132: sipush -8858
      // 1135: sipush 8057
      // 1138: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 113b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113e: aload 15
      // 1140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1143: sipush -8869
      // 1146: sipush 11398
      // 1149: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 114c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1152: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 1157: goto 1207
      // 115a: astore 18
      // 115c: aload 18
      // 115e: invokevirtual com/finalshell/core/Pz2.printStackTrace ()V
      // 1161: bipush 1
      // 1162: istore 8
      // 1164: goto 1207
      // 1167: astore 18
      // 1169: aload 18
      // 116b: invokevirtual com/finalshell/core/PD.printStackTrace ()V
      // 116e: aload 12
      // 1170: astore 19
      // 1172: aload 18
      // 1174: invokevirtual com/finalshell/core/PD.k ()Ljava/lang/String;
      // 1177: astore 12
      // 1179: aload 12
      // 117b: ldc_w ","
      // 117e: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 1181: astore 13
      // 1183: aload 19
      // 1185: aload 12
      // 1187: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 118a: iload 2
      // 118b: ifeq 119c
      // 118e: ifne 119b
      // 1191: goto 1198
      // 1194: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1197: athrow
      // 1198: bipush 0
      // 1199: istore 14
      // 119b: bipush 0
      // 119c: istore 8
      // 119e: goto 0eba
      // 11a1: astore 18
      // 11a3: aload 18
      // 11a5: invokevirtual java/lang/RuntimeException.printStackTrace ()V
      // 11a8: aload 18
      // 11aa: athrow
      // 11ab: astore 18
      // 11ad: aload 18
      // 11af: invokevirtual com/finalshell/core/Pc2.printStackTrace ()V
      // 11b2: aload 18
      // 11b4: athrow
      // 11b5: astore 18
      // 11b7: aload 18
      // 11b9: invokevirtual java/lang/Exception.printStackTrace ()V
      // 11bc: aload 0
      // 11bd: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 11c0: bipush 2
      // 11c1: iload 2
      // 11c2: ifeq 11e0
      // 11c5: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 11ca: ifeq 1203
      // 11cd: goto 11d4
      // 11d0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d3: athrow
      // 11d4: aload 0
      // 11d5: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 11d8: bipush 2
      // 11d9: goto 11e0
      // 11dc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11df: athrow
      // 11e0: new java/lang/StringBuilder
      // 11e3: dup
      // 11e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 11e7: sipush -8907
      // 11ea: sipush -12680
      // 11ed: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 11f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11f3: aload 18
      // 11f5: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 11f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11fe: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 1203: iload 2
      // 1204: ifne 1212
      // 1207: iload 2
      // 1208: ifne 0eba
      // 120b: goto 1212
      // 120e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1211: athrow
      // 1212: iload 7
      // 1214: iload 2
      // 1215: ifeq 122d
      // 1218: ifne 12bb
      // 121b: goto 1222
      // 121e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1221: athrow
      // 1222: aload 0
      // 1223: getfield com/finalshell/crypto/ConnectHost.X I
      // 1226: goto 122d
      // 1229: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122c: athrow
      // 122d: iload 2
      // 122e: ifeq 1292
      // 1231: aload 0
      // 1232: getfield com/finalshell/crypto/ConnectHost.iI I
      // 1235: goto 123c
      // 1238: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123b: athrow
      // 123c: if_icmplt 1290
      // 123f: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 1242: bipush 1
      // 1243: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1248: iload 2
      // 1249: ifeq 1292
      // 124c: goto 1253
      // 124f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1252: athrow
      // 1253: ifeq 1290
      // 1256: goto 125d
      // 1259: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125c: athrow
      // 125d: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 1260: bipush 1
      // 1261: new java/lang/StringBuilder
      // 1264: dup
      // 1265: invokespecial java/lang/StringBuilder.<init> ()V
      // 1268: sipush -8794
      // 126b: sipush 8325
      // 126e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1271: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1274: aload 0
      // 1275: getfield com/finalshell/crypto/ConnectHost.iI I
      // 1278: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 127b: ldc_w "次"
      // 127e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1281: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1284: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 1289: goto 1290
      // 128c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128f: athrow
      // 1290: iload 8
      // 1292: ifeq 12aa
      // 1295: new com/finalshell/core/Pc2
      // 1298: dup
      // 1299: sipush -8751
      // 129c: sipush -29000
      // 129f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 12a2: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 12a5: athrow
      // 12a6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a9: athrow
      // 12aa: new com/finalshell/core/Pc2
      // 12ad: dup
      // 12ae: sipush -8952
      // 12b1: sipush -30665
      // 12b4: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 12b7: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 12ba: athrow
      // 12bb: aload 0
      // 12bc: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 12bf: iload 2
      // 12c0: ifeq 1317
      // 12c3: ifnull 130e
      // 12c6: goto 12cd
      // 12c9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12cc: athrow
      // 12cd: iload 1
      // 12ce: iload 2
      // 12cf: ifeq 12f9
      // 12d2: goto 12d9
      // 12d5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d8: athrow
      // 12d9: ifgt 12fc
      // 12dc: goto 12e3
      // 12df: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e2: athrow
      // 12e3: aload 0
      // 12e4: iload 2
      // 12e5: ifeq 1317
      // 12e8: goto 12ef
      // 12eb: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12ee: athrow
      // 12ef: getfield com/finalshell/crypto/ConnectHost.iD I
      // 12f2: goto 12f9
      // 12f5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f8: athrow
      // 12f9: ifle 130e
      // 12fc: aload 0
      // 12fd: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 1300: aload 0
      // 1301: getfield com/finalshell/crypto/ConnectHost.iD I
      // 1304: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 1307: goto 130e
      // 130a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130d: athrow
      // 130e: aload 0
      // 130f: bipush 1
      // 1310: putfield com/finalshell/crypto/ConnectHost.H Z
      // 1313: aload 0
      // 1314: getfield com/finalshell/crypto/ConnectHost.S Ljava/lang/Object;
      // 1317: dup
      // 1318: astore 15
      // 131a: monitorenter
      // 131b: aload 0
      // 131c: iload 2
      // 131d: ifeq 139f
      // 1320: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 1323: ifeq 139d
      // 1326: aload 0
      // 1327: new java/lang/Thread
      // 132a: dup
      // 132b: aload 0
      // 132c: invokedynamic run (Lcom/finalshell/crypto/ConnectHost;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/crypto/ConnectHost.P$void ()V, ()V ]
      // 1331: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 1334: putfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 1337: aload 0
      // 1338: getfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 133b: new java/lang/StringBuilder
      // 133e: dup
      // 133f: invokespecial java/lang/StringBuilder.<init> ()V
      // 1342: sipush -8893
      // 1345: sipush 12749
      // 1348: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 134b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134e: aload 0
      // 134f: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 1352: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1355: sipush -8855
      // 1358: sipush -22091
      // 135b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 135e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1361: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1364: invokevirtual java/lang/Thread.setName (Ljava/lang/String;)V
      // 1367: aload 0
      // 1368: iload 2
      // 1369: ifeq 139a
      // 136c: goto 1373
      // 136f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1372: athrow
      // 1373: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 1376: ifeq 1392
      // 1379: goto 1380
      // 137c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137f: athrow
      // 1380: aload 0
      // 1381: getfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 1384: aload 0
      // 1385: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 1388: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 138b: goto 1392
      // 138e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1391: athrow
      // 1392: aload 0
      // 1393: getfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 1396: invokevirtual java/lang/Thread.start ()V
      // 1399: aload 0
      // 139a: invokespecial com/finalshell/crypto/ConnectHost.A ()V
      // 139d: aload 15
      // 139f: monitorexit
      // 13a0: goto 13ab
      // 13a3: astore 20
      // 13a5: aload 15
      // 13a7: monitorexit
      // 13a8: aload 20
      // 13aa: athrow
      // 13ab: aload 0
      // 13ac: getfield com/finalshell/crypto/ConnectHost.iS [B
      // 13af: invokestatic com/finalshell/core/E8.Q ([B)V
      // 13b2: aload 0
      // 13b3: aconst_null
      // 13b4: putfield com/finalshell/crypto/ConnectHost.iS [B
      // 13b7: aload 0
      // 13b8: bipush 0
      // 13b9: putfield com/finalshell/crypto/ConnectHost.I Z
      // 13bc: aload 0
      // 13bd: iload 2
      // 13be: ifeq 141c
      // 13c1: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 13c4: ifeq 1410
      // 13c7: goto 13ce
      // 13ca: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13cd: athrow
      // 13ce: ldc2_w 388376917454860932
      // 13d1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 13d4: aconst_null
      // 13d5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 13d8: new com/finalshell/task/Be2
      // 13db: dup
      // 13dc: aload 0
      // 13dd: invokespecial com/finalshell/task/Be2.<init> (Lcom/finalshell/crypto/ConnectHost;)V
      // 13e0: sipush 747
      // 13e3: ldc2_w 8602697979730926990
      // 13e6: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 13e9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 13ec: ldc2_w 266288712085965362
      // 13ef: astore 83
      // 13f1: astore 82
      // 13f3: ldc2_w 266288712085965362
      // 13f6: aload 82
      // 13f8: aload 83
      // 13fa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 13fd: goto 1404
      // 1400: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1403: athrow
      // 1404: pop
      // 1405: iload 2
      // 1406: ifne 1595
      // 1409: goto 1410
      // 140c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140f: athrow
      // 1410: aload 0
      // 1411: invokevirtual com/finalshell/crypto/ConnectHost.B ()V
      // 1414: aload 0
      // 1415: goto 141c
      // 1418: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141b: athrow
      // 141c: new com/finalshell/core/Yl4
      // 141f: dup
      // 1420: aload 0
      // 1421: ldc2_w 261180006635811470
      // 1424: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1427: aconst_null
      // 1428: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 142b: invokespecial com/finalshell/core/Yl4.<init> (Lcom/finalshell/crypto/ConnectHost;I)V
      // 142e: invokevirtual com/finalshell/crypto/ConnectHost.r (Lcom/finalshell/core/Yl4;)V
      // 1431: goto 1595
      // 1434: astore 3
      // 1435: aload 0
      // 1436: bipush 0
      // 1437: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 143a: aload 0
      // 143b: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 143e: ifeq 14a2
      // 1441: aload 3
      // 1442: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 1445: astore 4
      // 1447: aload 0
      // 1448: getfield com/finalshell/crypto/ConnectHost.D Lcom/finalshell/core/YU;
      // 144b: invokevirtual com/finalshell/core/YU.M ()V
      // 144e: aload 0
      // 144f: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 1452: sipush 17377
      // 1455: ldc2_w 6003903457819319425
      // 1458: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 145b: aload 4
      // 145d: invokevirtual java/lang/String.length ()I
      // 1460: iadd
      // 1461: bipush 2
      // 1462: iadd
      // 1463: aload 0
      // 1464: invokevirtual com/finalshell/crypto/ConnectHost.D ()I
      // 1467: iadd
      // 1468: invokevirtual com/finalshell/core/UJ.X (I)V
      // 146b: aload 0
      // 146c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 146f: bipush 1
      // 1470: invokevirtual com/finalshell/core/UJ.V (B)V
      // 1473: aload 0
      // 1474: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 1477: bipush 3
      // 1478: invokevirtual com/finalshell/core/UJ.u (I)V
      // 147b: aload 0
      // 147c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 147f: aload 4
      // 1481: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 1484: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 1487: aload 0
      // 1488: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 148b: sipush -8766
      // 148e: sipush 11268
      // 1491: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1494: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 1497: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 149a: aload 0
      // 149b: aload 0
      // 149c: getfield com/finalshell/crypto/ConnectHost.D Lcom/finalshell/core/YU;
      // 149f: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 14a2: goto 14a7
      // 14a5: astore 4
      // 14a7: aload 0
      // 14a8: invokevirtual com/finalshell/crypto/ConnectHost.G ()V
      // 14ab: goto 14b0
      // 14ae: astore 4
      // 14b0: aload 0
      // 14b1: bipush 0
      // 14b2: putfield com/finalshell/crypto/ConnectHost.iJ Z
      // 14b5: aload 3
      // 14b6: instanceof java/lang/RuntimeException
      // 14b9: iload 2
      // 14ba: ifeq 14df
      // 14bd: ifeq 14d0
      // 14c0: goto 14c7
      // 14c3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c6: athrow
      // 14c7: aload 3
      // 14c8: checkcast java/lang/RuntimeException
      // 14cb: athrow
      // 14cc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14cf: athrow
      // 14d0: aload 3
      // 14d1: iload 2
      // 14d2: ifeq 14e3
      // 14d5: instanceof com/finalshell/core/Pc2
      // 14d8: goto 14df
      // 14db: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14de: athrow
      // 14df: ifeq 14e7
      // 14e2: aload 3
      // 14e3: checkcast com/finalshell/core/Pc2
      // 14e6: athrow
      // 14e7: new com/finalshell/core/Pc2
      // 14ea: dup
      // 14eb: new java/lang/StringBuilder
      // 14ee: dup
      // 14ef: invokespecial java/lang/StringBuilder.<init> ()V
      // 14f2: sipush -8867
      // 14f5: sipush -23340
      // 14f8: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 14fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14fe: aload 3
      // 14ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1502: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1505: aload 3
      // 1506: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1509: athrow
      // 150a: astore 21
      // 150c: aload 0
      // 150d: getfield com/finalshell/crypto/ConnectHost.iS [B
      // 1510: invokestatic com/finalshell/core/E8.Q ([B)V
      // 1513: aload 0
      // 1514: aconst_null
      // 1515: putfield com/finalshell/crypto/ConnectHost.iS [B
      // 1518: aload 0
      // 1519: bipush 0
      // 151a: putfield com/finalshell/crypto/ConnectHost.I Z
      // 151d: aload 0
      // 151e: iload 2
      // 151f: ifeq 157d
      // 1522: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 1525: ifeq 1571
      // 1528: goto 152f
      // 152b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152e: athrow
      // 152f: ldc2_w 388376917454860932
      // 1532: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1535: aconst_null
      // 1536: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1539: new com/finalshell/task/Be2
      // 153c: dup
      // 153d: aload 0
      // 153e: invokespecial com/finalshell/task/Be2.<init> (Lcom/finalshell/crypto/ConnectHost;)V
      // 1541: sipush 4834
      // 1544: ldc2_w 160462110791142829
      // 1547: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 154a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 154d: ldc2_w 266288712085965362
      // 1550: astore 85
      // 1552: astore 84
      // 1554: ldc2_w 266288712085965362
      // 1557: aload 84
      // 1559: aload 85
      // 155b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 155e: goto 1565
      // 1561: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1564: athrow
      // 1565: pop
      // 1566: iload 2
      // 1567: ifne 1592
      // 156a: goto 1571
      // 156d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1570: athrow
      // 1571: aload 0
      // 1572: invokevirtual com/finalshell/crypto/ConnectHost.B ()V
      // 1575: aload 0
      // 1576: goto 157d
      // 1579: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 157c: athrow
      // 157d: new com/finalshell/core/Yl4
      // 1580: dup
      // 1581: aload 0
      // 1582: ldc2_w 261180006635811470
      // 1585: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1588: aconst_null
      // 1589: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 158c: invokespecial com/finalshell/core/Yl4.<init> (Lcom/finalshell/crypto/ConnectHost;I)V
      // 158f: invokevirtual com/finalshell/crypto/ConnectHost.r (Lcom/finalshell/core/Yl4;)V
      // 1592: aload 21
      // 1594: athrow
      // 1595: ldc2_w 388376917454860932
      // 1598: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 159b: aconst_null
      // 159c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 159f: new com/finalshell/task/Nh4
      // 15a2: dup
      // 15a3: aload 0
      // 15a4: invokespecial com/finalshell/task/Nh4.<init> (Lcom/finalshell/crypto/ConnectHost;)V
      // 15a7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 15aa: ldc2_w 434592463220957006
      // 15ad: astore 87
      // 15af: astore 86
      // 15b1: ldc2_w 434592463220957006
      // 15b4: aload 86
      // 15b6: aload 87
      // 15b8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15bb: pop
      // 15bc: goto 15c3
      // 15bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15c2: athrow
      // 15c3: aload 0
      // 15c4: iload 2
      // 15c5: ifeq 1605
      // 15c8: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 15cb: ifnull 1604
      // 15ce: goto 15d5
      // 15d1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d4: athrow
      // 15d5: aload 0
      // 15d6: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 15d9: invokevirtual com/finalshell/ui/panel/ConnectionProperty.c$void ()V
      // 15dc: aload 0
      // 15dd: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 15e0: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$QT ()Lcom/finalshell/core/QT;
      // 15e3: sipush -8854
      // 15e6: sipush 30403
      // 15e9: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 15ec: invokeinterface com/finalshell/core/QT.a (Ljava/lang/String;)V 2
      // 15f1: aload 0
      // 15f2: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 15f5: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$QT ()Lcom/finalshell/core/QT;
      // 15f8: invokeinterface com/finalshell/core/QT.K ()V 1
      // 15fd: goto 1604
      // 1600: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1603: athrow
      // 1604: aload 0
      // 1605: bipush 1
      // 1606: putfield com/finalshell/crypto/ConnectHost.iv Z
      // 1609: return
   }

   public Cv2 L(UJ param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: aload 1
      // 004: invokevirtual com/finalshell/core/UJ.d ()I
      // 007: istore 3
      // 008: istore 2
      // 009: iload 3
      // 00a: iload 2
      // 00b: ifeq 027
      // 00e: aload 1
      // 00f: invokevirtual com/finalshell/core/UJ.P ()I
      // 012: if_icmpeq 038
      // 015: goto 01c
      // 018: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 1
      // 01d: invokevirtual com/finalshell/core/UJ.r ()I
      // 020: goto 027
      // 023: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: pop
      // 028: aload 0
      // 029: aload 1
      // 02a: getfield com/finalshell/core/UJ.X I
      // 02d: bipush 5
      // 02e: isub
      // 02f: newarray 8
      // 031: putfield com/finalshell/crypto/ConnectHost.i [B
      // 034: iload 2
      // 035: ifne 04d
      // 038: aload 0
      // 039: iload 3
      // 03a: bipush 1
      // 03b: isub
      // 03c: aload 1
      // 03d: invokevirtual com/finalshell/core/UJ.r ()I
      // 040: isub
      // 041: newarray 8
      // 043: putfield com/finalshell/crypto/ConnectHost.i [B
      // 046: goto 04d
      // 049: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 1
      // 04e: getfield com/finalshell/core/UJ.g [B
      // 051: aload 1
      // 052: getfield com/finalshell/core/UJ.Z I
      // 055: aload 0
      // 056: getfield com/finalshell/crypto/ConnectHost.i [B
      // 059: bipush 0
      // 05a: aload 0
      // 05b: getfield com/finalshell/crypto/ConnectHost.i [B
      // 05e: arraylength
      // 05f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 062: aload 0
      // 063: getfield com/finalshell/crypto/ConnectHost.iq Z
      // 066: iload 2
      // 067: ifeq 0a1
      // 06a: ifne 07f
      // 06d: goto 074
      // 070: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 0
      // 075: invokespecial com/finalshell/crypto/ConnectHost.x$void ()V
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 0
      // 080: aload 0
      // 081: aload 0
      // 082: getfield com/finalshell/crypto/ConnectHost.i [B
      // 085: aload 0
      // 086: getfield com/finalshell/crypto/ConnectHost.i6 [B
      // 089: invokestatic com/finalshell/core/Cv2.V (Lcom/finalshell/crypto/ConnectHost;[B[B)[Ljava/lang/String;
      // 08c: putfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 08f: aload 0
      // 090: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 093: bipush 0
      // 094: aaload
      // 095: sipush -8918
      // 098: sipush 31065
      // 09b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 09e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a1: iload 2
      // 0a2: ifeq 0c8
      // 0a5: ifne 0d6
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 0b3: bipush 0
      // 0b4: aaload
      // 0b5: sipush -8922
      // 0b8: sipush 19518
      // 0bb: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0be: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: iload 2
      // 0c9: ifeq 105
      // 0cc: ifeq 101
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: new com/finalshell/core/Pc2
      // 0d9: dup
      // 0da: new java/lang/StringBuilder
      // 0dd: dup
      // 0de: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e1: sipush -8912
      // 0e4: sipush -6789
      // 0e7: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: aload 0
      // 0ee: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 0f1: bipush 0
      // 0f2: aaload
      // 0f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f9: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0fc: athrow
      // 0fd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: aload 0
      // 102: getfield com/finalshell/crypto/ConnectHost.H Z
      // 105: iload 2
      // 106: ifeq 12c
      // 109: ifne 16b
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: aload 0
      // 114: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 117: bipush 2
      // 118: aaload
      // 119: sipush -8875
      // 11c: sipush -15282
      // 11f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 122: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 125: goto 12c
      // 128: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: iload 2
      // 12d: ifeq 153
      // 130: ifne 156
      // 133: goto 13a
      // 136: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 139: athrow
      // 13a: aload 0
      // 13b: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 13e: bipush 3
      // 13f: aaload
      // 140: sipush -8875
      // 143: sipush -15282
      // 146: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 149: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152: athrow
      // 153: ifeq 16b
      // 156: new com/finalshell/core/Pc2
      // 159: dup
      // 15a: sipush -8827
      // 15d: sipush -16615
      // 160: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 163: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 166: athrow
      // 167: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: aconst_null
      // 16c: astore 4
      // 16e: aload 0
      // 16f: aload 0
      // 170: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 173: bipush 0
      // 174: aaload
      // 175: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 178: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 17b: ldc_w com/finalshell/core/Cv2
      // 17e: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 181: astore 5
      // 183: aload 5
      // 185: bipush 0
      // 186: anewarray 607
      // 189: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 18c: bipush 0
      // 18d: anewarray 4
      // 190: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 193: checkcast com/finalshell/core/Cv2
      // 196: astore 4
      // 198: goto 1ac
      // 19b: astore 5
      // 19d: new com/finalshell/core/Pc2
      // 1a0: dup
      // 1a1: aload 5
      // 1a3: invokevirtual java/lang/Throwable.toString ()Ljava/lang/String;
      // 1a6: aload 5
      // 1a8: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1ab: athrow
      // 1ac: aload 4
      // 1ae: aload 0
      // 1af: aload 0
      // 1b0: getfield com/finalshell/crypto/ConnectHost.i0 [B
      // 1b3: aload 0
      // 1b4: getfield com/finalshell/crypto/ConnectHost.ii [B
      // 1b7: aload 0
      // 1b8: getfield com/finalshell/crypto/ConnectHost.i [B
      // 1bb: aload 0
      // 1bc: getfield com/finalshell/crypto/ConnectHost.i6 [B
      // 1bf: invokevirtual com/finalshell/core/Cv2.m (Lcom/finalshell/crypto/ConnectHost;[B[B[B[B)V
      // 1c2: aload 4
      // 1c4: areturn
   }

   public String[] p() {
      return this.E;
   }

   public void e() throws Exception {
      this.x$void();
   }

   public void x$void() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01c
      // 009: getfield com/finalshell/crypto/ConnectHost.iq Z
      // 00c: ifeq 01b
      // 00f: goto 016
      // 012: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: return
      // 017: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 0
      // 01c: sipush -8901
      // 01f: sipush -2661
      // 022: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 025: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 028: astore 2
      // 029: aload 0
      // 02a: sipush -8929
      // 02d: sipush -28645
      // 030: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 033: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 036: astore 3
      // 037: aload 0
      // 038: aload 0
      // 039: sipush -8884
      // 03c: sipush -6202
      // 03f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 042: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 045: invokespecial com/finalshell/crypto/ConnectHost.Q (Ljava/lang/String;)[Ljava/lang/String;
      // 048: astore 4
      // 04a: aload 4
      // 04c: iload 1
      // 04d: ifeq 05c
      // 050: ifnull 176
      // 053: goto 05a
      // 056: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: aload 4
      // 05c: arraylength
      // 05d: iload 1
      // 05e: ifeq 087
      // 061: ifle 176
      // 064: goto 06b
      // 067: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: aload 0
      // 06c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 06f: bipush 0
      // 070: iload 1
      // 071: ifeq 0ba
      // 074: goto 07b
      // 077: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 080: goto 087
      // 083: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: ifeq 0d9
      // 08a: aload 0
      // 08b: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 08e: bipush 0
      // 08f: new java/lang/StringBuilder
      // 092: dup
      // 093: invokespecial java/lang/StringBuilder.<init> ()V
      // 096: sipush -8781
      // 099: sipush 14608
      // 09c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: aload 2
      // 0a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a9: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0ae: aload 0
      // 0af: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0b2: bipush 0
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: new java/lang/StringBuilder
      // 0bd: dup
      // 0be: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c1: sipush -8935
      // 0c4: sipush -11903
      // 0c7: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: aload 3
      // 0ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d4: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 0d9: aload 2
      // 0da: aload 4
      // 0dc: invokestatic com/finalshell/core/E8.z (Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
      // 0df: astore 2
      // 0e0: aload 3
      // 0e1: aload 4
      // 0e3: invokestatic com/finalshell/core/E8.z (Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
      // 0e6: astore 3
      // 0e7: aload 2
      // 0e8: iload 1
      // 0e9: ifeq 0f7
      // 0ec: ifnull 0fa
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: aload 3
      // 0f7: ifnonnull 10f
      // 0fa: new com/finalshell/core/Pc2
      // 0fd: dup
      // 0fe: sipush -8797
      // 101: sipush -21493
      // 104: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 107: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 10a: athrow
      // 10b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 0
      // 110: iload 1
      // 111: ifeq 177
      // 114: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 117: bipush 0
      // 118: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 11d: ifeq 176
      // 120: goto 127
      // 123: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aload 0
      // 128: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 12b: bipush 0
      // 12c: new java/lang/StringBuilder
      // 12f: dup
      // 130: invokespecial java/lang/StringBuilder.<init> ()V
      // 133: sipush -8862
      // 136: sipush 13757
      // 139: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13f: aload 2
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 146: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 14b: aload 0
      // 14c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 14f: bipush 0
      // 150: new java/lang/StringBuilder
      // 153: dup
      // 154: invokespecial java/lang/StringBuilder.<init> ()V
      // 157: sipush -8813
      // 15a: sipush 3554
      // 15d: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: aload 3
      // 164: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 167: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16a: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 16f: goto 176
      // 172: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: aload 0
      // 177: sipush -8956
      // 17a: sipush -15706
      // 17d: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 180: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 183: astore 5
      // 185: aload 0
      // 186: sipush -8921
      // 189: sipush -24864
      // 18c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 18f: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 192: astore 6
      // 194: aload 0
      // 195: aload 0
      // 196: sipush -8937
      // 199: sipush 16302
      // 19c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 19f: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 1a2: invokespecial com/finalshell/crypto/ConnectHost.C (Ljava/lang/String;)[Ljava/lang/String;
      // 1a5: astore 7
      // 1a7: aload 7
      // 1a9: iload 1
      // 1aa: ifeq 1b9
      // 1ad: ifnull 2dd
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: aload 7
      // 1b9: arraylength
      // 1ba: iload 1
      // 1bb: ifeq 1e4
      // 1be: ifle 2dd
      // 1c1: goto 1c8
      // 1c4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c7: athrow
      // 1c8: aload 0
      // 1c9: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 1cc: bipush 0
      // 1cd: iload 1
      // 1ce: ifeq 218
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1dd: goto 1e4
      // 1e0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e3: athrow
      // 1e4: ifeq 238
      // 1e7: aload 0
      // 1e8: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 1eb: bipush 0
      // 1ec: new java/lang/StringBuilder
      // 1ef: dup
      // 1f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f3: sipush -8944
      // 1f6: sipush 21795
      // 1f9: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ff: aload 5
      // 201: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 204: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 207: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 20c: aload 0
      // 20d: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 210: bipush 0
      // 211: goto 218
      // 214: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 217: athrow
      // 218: new java/lang/StringBuilder
      // 21b: dup
      // 21c: invokespecial java/lang/StringBuilder.<init> ()V
      // 21f: sipush -8891
      // 222: sipush 22266
      // 225: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 228: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22b: aload 6
      // 22d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 230: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 233: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 238: aload 5
      // 23a: aload 7
      // 23c: invokestatic com/finalshell/core/E8.z (Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
      // 23f: astore 5
      // 241: aload 6
      // 243: aload 7
      // 245: invokestatic com/finalshell/core/E8.z (Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
      // 248: astore 6
      // 24a: aload 5
      // 24c: iload 1
      // 24d: ifeq 25c
      // 250: ifnull 25f
      // 253: goto 25a
      // 256: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 259: athrow
      // 25a: aload 6
      // 25c: ifnonnull 274
      // 25f: new com/finalshell/core/Pc2
      // 262: dup
      // 263: sipush -8770
      // 266: sipush -10561
      // 269: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 26c: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 26f: athrow
      // 270: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 273: athrow
      // 274: aload 0
      // 275: iload 1
      // 276: ifeq 2de
      // 279: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 27c: bipush 0
      // 27d: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 282: ifeq 2dd
      // 285: goto 28c
      // 288: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28b: athrow
      // 28c: aload 0
      // 28d: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 290: bipush 0
      // 291: new java/lang/StringBuilder
      // 294: dup
      // 295: invokespecial java/lang/StringBuilder.<init> ()V
      // 298: sipush -8744
      // 29b: sipush 5789
      // 29e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 2a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a4: aload 5
      // 2a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ac: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 2b1: aload 0
      // 2b2: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 2b5: bipush 0
      // 2b6: new java/lang/StringBuilder
      // 2b9: dup
      // 2ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 2bd: sipush -8721
      // 2c0: sipush -26939
      // 2c3: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 2c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c9: aload 6
      // 2cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ce: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d1: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 2d6: goto 2dd
      // 2d9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2dc: athrow
      // 2dd: aload 0
      // 2de: sipush -8835
      // 2e1: sipush -7166
      // 2e4: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 2e7: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 2ea: astore 8
      // 2ec: aload 0
      // 2ed: aload 0
      // 2ee: sipush -8853
      // 2f1: sipush 826
      // 2f4: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 2f7: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 2fa: invokespecial com/finalshell/crypto/ConnectHost.W$arrString (Ljava/lang/String;)[Ljava/lang/String;
      // 2fd: astore 9
      // 2ff: aload 9
      // 301: iload 1
      // 302: ifeq 311
      // 305: ifnull 3d2
      // 308: goto 30f
      // 30b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30e: athrow
      // 30f: aload 9
      // 311: arraylength
      // 312: iload 1
      // 313: ifeq 33c
      // 316: ifle 3d2
      // 319: goto 320
      // 31c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31f: athrow
      // 320: aload 0
      // 321: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 324: bipush 0
      // 325: iload 1
      // 326: ifeq 34b
      // 329: goto 330
      // 32c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32f: athrow
      // 330: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 335: goto 33c
      // 338: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33b: athrow
      // 33c: ifeq 36b
      // 33f: aload 0
      // 340: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 343: bipush 0
      // 344: goto 34b
      // 347: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34a: athrow
      // 34b: new java/lang/StringBuilder
      // 34e: dup
      // 34f: invokespecial java/lang/StringBuilder.<init> ()V
      // 352: sipush -8817
      // 355: sipush 26050
      // 358: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 35b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35e: aload 8
      // 360: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 363: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 366: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 36b: aload 8
      // 36d: aload 9
      // 36f: invokestatic com/finalshell/core/E8.z (Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
      // 372: astore 8
      // 374: aload 8
      // 376: ifnonnull 38e
      // 379: new com/finalshell/core/Pc2
      // 37c: dup
      // 37d: sipush -8814
      // 380: sipush -3121
      // 383: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 386: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 389: athrow
      // 38a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38d: athrow
      // 38e: aload 0
      // 38f: iload 1
      // 390: ifeq 3d3
      // 393: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 396: bipush 0
      // 397: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 39c: ifeq 3d2
      // 39f: goto 3a6
      // 3a2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a5: athrow
      // 3a6: aload 0
      // 3a7: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 3aa: bipush 0
      // 3ab: new java/lang/StringBuilder
      // 3ae: dup
      // 3af: invokespecial java/lang/StringBuilder.<init> ()V
      // 3b2: sipush -8777
      // 3b5: sipush 24375
      // 3b8: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3be: aload 8
      // 3c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3c6: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 3cb: goto 3d2
      // 3ce: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d1: athrow
      // 3d2: aload 0
      // 3d3: sipush -8883
      // 3d6: sipush -20843
      // 3d9: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3dc: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 3df: astore 10
      // 3e1: aload 10
      // 3e3: iload 1
      // 3e4: ifeq 440
      // 3e7: sipush -8905
      // 3ea: sipush 9495
      // 3ed: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3f0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3f3: ifeq 433
      // 3f6: goto 3fd
      // 3f9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fc: athrow
      // 3fd: aload 0
      // 3fe: iload 1
      // 3ff: ifeq 434
      // 402: goto 409
      // 405: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 408: athrow
      // 409: getfield com/finalshell/crypto/ConnectHost.H Z
      // 40c: ifne 433
      // 40f: goto 416
      // 412: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 415: athrow
      // 416: new java/lang/StringBuilder
      // 419: dup
      // 41a: invokespecial java/lang/StringBuilder.<init> ()V
      // 41d: aload 8
      // 41f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 422: sipush -8882
      // 425: sipush 23011
      // 428: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 42b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 431: astore 8
      // 433: aload 0
      // 434: sipush -8740
      // 437: sipush 15782
      // 43a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 43d: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 440: astore 11
      // 442: aload 0
      // 443: aload 0
      // 444: sipush -8755
      // 447: sipush -9235
      // 44a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 44d: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 450: invokespecial com/finalshell/crypto/ConnectHost.h (Ljava/lang/String;)[Ljava/lang/String;
      // 453: astore 12
      // 455: aload 0
      // 456: iload 1
      // 457: ifeq 536
      // 45a: aload 12
      // 45c: putfield com/finalshell/crypto/ConnectHost.E [Ljava/lang/String;
      // 45f: aload 12
      // 461: ifnull 535
      // 464: goto 46b
      // 467: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46a: athrow
      // 46b: aload 12
      // 46d: arraylength
      // 46e: iload 1
      // 46f: ifeq 49f
      // 472: goto 479
      // 475: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 478: athrow
      // 479: ifle 535
      // 47c: goto 483
      // 47f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 482: athrow
      // 483: aload 0
      // 484: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 487: bipush 0
      // 488: iload 1
      // 489: ifeq 4ae
      // 48c: goto 493
      // 48f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 492: athrow
      // 493: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 498: goto 49f
      // 49b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49e: athrow
      // 49f: ifeq 4ce
      // 4a2: aload 0
      // 4a3: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 4a6: bipush 0
      // 4a7: goto 4ae
      // 4aa: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ad: athrow
      // 4ae: new java/lang/StringBuilder
      // 4b1: dup
      // 4b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 4b5: sipush -8837
      // 4b8: sipush 17452
      // 4bb: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 4be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c1: aload 11
      // 4c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4c9: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 4ce: aload 11
      // 4d0: aload 12
      // 4d2: invokestatic com/finalshell/core/E8.z (Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
      // 4d5: astore 11
      // 4d7: aload 11
      // 4d9: ifnonnull 4f1
      // 4dc: new com/finalshell/core/Pc2
      // 4df: dup
      // 4e0: sipush -8900
      // 4e3: sipush -31294
      // 4e6: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 4e9: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 4ec: athrow
      // 4ed: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f0: athrow
      // 4f1: aload 0
      // 4f2: iload 1
      // 4f3: ifeq 536
      // 4f6: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 4f9: bipush 0
      // 4fa: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 4ff: ifeq 535
      // 502: goto 509
      // 505: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 508: athrow
      // 509: aload 0
      // 50a: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 50d: bipush 0
      // 50e: new java/lang/StringBuilder
      // 511: dup
      // 512: invokespecial java/lang/StringBuilder.<init> ()V
      // 515: sipush -8852
      // 518: sipush -13645
      // 51b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 51e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 521: aload 11
      // 523: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 526: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 529: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 52e: goto 535
      // 531: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 534: athrow
      // 535: aload 0
      // 536: sipush -8724
      // 539: sipush 7694
      // 53c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 53f: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 542: astore 13
      // 544: iload 1
      // 545: ifeq 84d
      // 548: aload 13
      // 54a: sipush -8905
      // 54d: sipush 9495
      // 550: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 553: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 556: ifeq 841
      // 559: goto 560
      // 55c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55f: athrow
      // 560: aload 0
      // 561: iload 1
      // 562: ifeq 5ac
      // 565: goto 56c
      // 568: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56b: athrow
      // 56c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 56f: bipush 0
      // 570: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 575: ifeq 5ab
      // 578: goto 57f
      // 57b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57e: athrow
      // 57f: aload 0
      // 580: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 583: bipush 0
      // 584: new java/lang/StringBuilder
      // 587: dup
      // 588: invokespecial java/lang/StringBuilder.<init> ()V
      // 58b: sipush -8848
      // 58e: sipush -3956
      // 591: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 594: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 597: aload 11
      // 599: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 59f: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 5a4: goto 5ab
      // 5a7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5aa: athrow
      // 5ab: aload 0
      // 5ac: invokevirtual com/finalshell/crypto/ConnectHost.r$RW ()Lcom/finalshell/core/RW;
      // 5af: astore 14
      // 5b1: aload 0
      // 5b2: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 5b5: astore 15
      // 5b7: aload 0
      // 5b8: getfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 5bb: iload 1
      // 5bc: ifeq 5de
      // 5bf: ifnull 5cf
      // 5c2: goto 5c9
      // 5c5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c8: athrow
      // 5c9: aload 0
      // 5ca: getfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 5cd: astore 15
      // 5cf: aload 0
      // 5d0: iload 1
      // 5d1: ifeq 5e2
      // 5d4: getfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 5d7: goto 5de
      // 5da: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5dd: athrow
      // 5de: ifnonnull 61b
      // 5e1: aload 0
      // 5e2: getfield com/finalshell/crypto/ConnectHost.x I
      // 5e5: sipush 21143
      // 5e8: ldc2_w 4494981248157306360
      // 5eb: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 5ee: if_icmpeq 61b
      // 5f1: new java/lang/StringBuilder
      // 5f4: dup
      // 5f5: invokespecial java/lang/StringBuilder.<init> ()V
      // 5f8: ldc_w "["
      // 5fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5fe: aload 15
      // 600: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 603: sipush -8811
      // 606: sipush -26954
      // 609: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 60c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60f: aload 0
      // 610: getfield com/finalshell/crypto/ConnectHost.x I
      // 613: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 616: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 619: astore 15
      // 61b: aload 14
      // 61d: aload 15
      // 61f: aconst_null
      // 620: invokeinterface com/finalshell/core/RW.R (Ljava/lang/String;Ljava/lang/String;)[Lcom/finalshell/core/DQ; 3
      // 625: astore 16
      // 627: aload 16
      // 629: iload 1
      // 62a: ifeq 639
      // 62d: ifnull 7fd
      // 630: goto 637
      // 633: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 636: athrow
      // 637: aload 16
      // 639: arraylength
      // 63a: iload 1
      // 63b: ifeq 812
      // 63e: ifle 7fd
      // 641: goto 648
      // 644: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 647: athrow
      // 648: new java/util/ArrayList
      // 64b: dup
      // 64c: invokespecial java/util/ArrayList.<init> ()V
      // 64f: astore 17
      // 651: new java/util/ArrayList
      // 654: dup
      // 655: aload 11
      // 657: ldc_w ","
      // 65a: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 65d: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 660: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 663: astore 18
      // 665: aload 18
      // 667: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 66c: astore 19
      // 66e: aload 19
      // 670: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 675: ifeq 7d4
      // 678: aload 19
      // 67a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 67f: checkcast java/lang/String
      // 682: astore 20
      // 684: aload 20
      // 686: astore 21
      // 688: aload 21
      // 68a: iload 1
      // 68b: ifeq 76e
      // 68e: sipush -8745
      // 691: sipush -25543
      // 694: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 697: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 69a: iload 1
      // 69b: ifeq 7db
      // 69e: goto 6a5
      // 6a1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a4: athrow
      // 6a5: ifne 75e
      // 6a8: goto 6af
      // 6ab: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6ae: athrow
      // 6af: aload 21
      // 6b1: iload 1
      // 6b2: ifeq 76e
      // 6b5: goto 6bc
      // 6b8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6bb: athrow
      // 6bc: sipush -8826
      // 6bf: sipush -26471
      // 6c2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 6c5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6c8: ifne 75e
      // 6cb: goto 6d2
      // 6ce: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d1: athrow
      // 6d2: aload 21
      // 6d4: iload 1
      // 6d5: ifeq 76e
      // 6d8: goto 6df
      // 6db: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6de: athrow
      // 6df: sipush -8757
      // 6e2: sipush 6772
      // 6e5: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 6e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6eb: ifne 75e
      // 6ee: goto 6f5
      // 6f1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f4: athrow
      // 6f5: aload 21
      // 6f7: iload 1
      // 6f8: ifeq 76e
      // 6fb: goto 702
      // 6fe: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 701: athrow
      // 702: sipush -8863
      // 705: sipush -25493
      // 708: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 70b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 70e: ifne 75e
      // 711: goto 718
      // 714: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 717: athrow
      // 718: aload 21
      // 71a: iload 1
      // 71b: ifeq 76e
      // 71e: goto 725
      // 721: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 724: athrow
      // 725: sipush -8823
      // 728: sipush -20900
      // 72b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 72e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 731: ifne 75e
      // 734: goto 73b
      // 737: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73a: athrow
      // 73b: aload 21
      // 73d: iload 1
      // 73e: ifeq 76e
      // 741: goto 748
      // 744: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 747: athrow
      // 748: sipush -8809
      // 74b: sipush 13812
      // 74e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 751: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 754: ifeq 770
      // 757: goto 75e
      // 75a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75d: athrow
      // 75e: sipush -8768
      // 761: sipush -13469
      // 764: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 767: goto 76e
      // 76a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76d: athrow
      // 76e: astore 21
      // 770: aload 16
      // 772: astore 22
      // 774: aload 22
      // 776: arraylength
      // 777: istore 23
      // 779: bipush 0
      // 77a: istore 24
      // 77c: iload 24
      // 77e: iload 23
      // 780: if_icmpge 7d0
      // 783: aload 22
      // 785: iload 24
      // 787: aaload
      // 788: astore 25
      // 78a: iload 1
      // 78b: ifeq 7cc
      // 78e: aload 25
      // 790: invokevirtual com/finalshell/core/DQ.J ()Ljava/lang/String;
      // 793: aload 21
      // 795: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 798: iload 1
      // 799: ifeq 675
      // 79c: goto 7a3
      // 79f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a2: athrow
      // 7a3: ifeq 7c2
      // 7a6: aload 17
      // 7a8: aload 20
      // 7aa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7af: pop
      // 7b0: aload 19
      // 7b2: invokeinterface java/util/Iterator.remove ()V 1
      // 7b7: iload 1
      // 7b8: ifne 7d0
      // 7bb: goto 7c2
      // 7be: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c1: athrow
      // 7c2: iinc 24 1
      // 7c5: goto 7cc
      // 7c8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7cb: athrow
      // 7cc: iload 1
      // 7cd: ifne 77c
      // 7d0: iload 1
      // 7d1: ifne 66e
      // 7d4: aload 17
      // 7d6: invokeinterface java/util/List.size ()I 1
      // 7db: iload 1
      // 7dc: ifeq 812
      // 7df: ifle 7fd
      // 7e2: goto 7e9
      // 7e5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e8: athrow
      // 7e9: aload 17
      // 7eb: aload 18
      // 7ed: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 7f2: pop
      // 7f3: ldc_w ","
      // 7f6: aload 17
      // 7f8: invokestatic java/lang/String.join (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
      // 7fb: astore 11
      // 7fd: aload 0
      // 7fe: iload 1
      // 7ff: ifeq 847
      // 802: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 805: bipush 0
      // 806: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 80b: goto 812
      // 80e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 811: athrow
      // 812: ifeq 841
      // 815: aload 0
      // 816: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 819: bipush 0
      // 81a: new java/lang/StringBuilder
      // 81d: dup
      // 81e: invokespecial java/lang/StringBuilder.<init> ()V
      // 821: sipush -8787
      // 824: sipush -6249
      // 827: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 82a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 82d: aload 11
      // 82f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 832: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 835: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 83a: goto 841
      // 83d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 840: athrow
      // 841: aload 0
      // 842: bipush 1
      // 843: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 846: aload 0
      // 847: invokestatic java/lang/System.currentTimeMillis ()J
      // 84a: putfield com/finalshell/crypto/ConnectHost.R J
      // 84d: new com/finalshell/core/UJ
      // 850: dup
      // 851: invokespecial com/finalshell/core/UJ.<init> ()V
      // 854: astore 14
      // 856: new com/finalshell/core/YU
      // 859: dup
      // 85a: aload 14
      // 85c: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 85f: astore 15
      // 861: aload 15
      // 863: invokevirtual com/finalshell/core/YU.M ()V
      // 866: aload 14
      // 868: sipush 14970
      // 86b: ldc2_w 2877576147334079800
      // 86e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 871: invokevirtual com/finalshell/core/UJ.V (B)V
      // 874: getstatic com/finalshell/crypto/ConnectHost.p Lcom/finalshell/core/I82;
      // 877: dup
      // 878: astore 16
      // 87a: monitorenter
      // 87b: getstatic com/finalshell/crypto/ConnectHost.p Lcom/finalshell/core/I82;
      // 87e: aload 14
      // 880: getfield com/finalshell/core/UJ.g [B
      // 883: aload 14
      // 885: getfield com/finalshell/core/UJ.X I
      // 888: sipush 14246
      // 88b: ldc2_w 2487488973486041323
      // 88e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 891: invokeinterface com/finalshell/core/I82.Y ([BII)V 4
      // 896: aload 14
      // 898: sipush 14246
      // 89b: ldc2_w 2487488973486041323
      // 89e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 8a1: invokevirtual com/finalshell/core/UJ.S (I)V
      // 8a4: aload 16
      // 8a6: monitorexit
      // 8a7: goto 8b2
      // 8aa: astore 26
      // 8ac: aload 16
      // 8ae: monitorexit
      // 8af: aload 26
      // 8b1: athrow
      // 8b2: aload 14
      // 8b4: aload 8
      // 8b6: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 8b9: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 8bc: aload 14
      // 8be: aload 11
      // 8c0: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 8c3: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 8c6: aload 14
      // 8c8: aload 2
      // 8c9: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 8cc: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 8cf: aload 14
      // 8d1: aload 3
      // 8d2: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 8d5: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 8d8: aload 14
      // 8da: aload 0
      // 8db: sipush -8956
      // 8de: sipush -15706
      // 8e1: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 8e4: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 8e7: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 8ea: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 8ed: aload 14
      // 8ef: aload 0
      // 8f0: sipush -8921
      // 8f3: sipush -24864
      // 8f6: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 8f9: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 8fc: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 8ff: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 902: aload 14
      // 904: aload 0
      // 905: sipush -8738
      // 908: sipush -9271
      // 90b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 90e: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 911: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 914: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 917: aload 14
      // 919: aload 0
      // 91a: sipush -8760
      // 91d: sipush -31318
      // 920: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 923: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 926: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 929: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 92c: aload 14
      // 92e: aload 0
      // 92f: sipush -8800
      // 932: sipush 14501
      // 935: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 938: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 93b: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 93e: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 941: aload 14
      // 943: aload 0
      // 944: sipush -8957
      // 947: sipush 24477
      // 94a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 94d: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 950: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 953: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 956: aload 14
      // 958: bipush 0
      // 959: invokevirtual com/finalshell/core/UJ.V (B)V
      // 95c: aload 14
      // 95e: bipush 0
      // 95f: invokevirtual com/finalshell/core/UJ.u (I)V
      // 962: aload 14
      // 964: bipush 5
      // 965: invokevirtual com/finalshell/core/UJ.Z (I)V
      // 968: aload 0
      // 969: aload 14
      // 96b: invokevirtual com/finalshell/core/UJ.P ()I
      // 96e: newarray 8
      // 970: putfield com/finalshell/crypto/ConnectHost.i6 [B
      // 973: aload 14
      // 975: aload 0
      // 976: getfield com/finalshell/crypto/ConnectHost.i6 [B
      // 979: invokevirtual com/finalshell/core/UJ.W ([B)V
      // 97c: aload 0
      // 97d: aload 15
      // 97f: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 982: aload 0
      // 983: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 986: bipush 1
      // 987: iload 1
      // 988: ifeq 9a6
      // 98b: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 990: ifeq 9b4
      // 993: goto 99a
      // 996: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 999: athrow
      // 99a: aload 0
      // 99b: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 99e: bipush 1
      // 99f: goto 9a6
      // 9a2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a5: athrow
      // 9a6: sipush -8767
      // 9a9: sipush 31547
      // 9ac: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 9af: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 9b4: return
   }

   public void i$void() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/crypto/ConnectHost.D Lcom/finalshell/core/YU;
      // 07: invokevirtual com/finalshell/core/YU.M ()V
      // 0a: istore 1
      // 0b: aload 0
      // 0c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0f: sipush 358
      // 12: ldc2_w 6938776846677974536
      // 15: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 18: invokevirtual com/finalshell/core/UJ.V (B)V
      // 1b: aload 0
      // 1c: aload 0
      // 1d: getfield com/finalshell/crypto/ConnectHost.D Lcom/finalshell/core/YU;
      // 20: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 23: aload 0
      // 24: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 27: bipush 1
      // 28: iload 1
      // 29: ifne 47
      // 2c: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 31: ifeq 55
      // 34: goto 3b
      // 37: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 0
      // 3c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 3f: bipush 1
      // 40: goto 47
      // 43: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: sipush -8946
      // 4a: sipush -18540
      // 4d: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 50: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 55: return
   }

   public void X(String param1, int param2, Cv2 param3) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: sipush -8917
      // 007: sipush -18994
      // 00a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 00d: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 010: astore 5
      // 012: istore 4
      // 014: aload 0
      // 015: getfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 018: iload 4
      // 01a: ifne 032
      // 01d: ifnull 033
      // 020: goto 027
      // 023: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: aload 0
      // 028: getfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: astore 1
      // 033: aload 3
      // 034: invokevirtual com/finalshell/core/Cv2.m ()[B
      // 037: astore 6
      // 039: aload 3
      // 03a: invokevirtual com/finalshell/core/Cv2.d ()Ljava/lang/String;
      // 03d: astore 7
      // 03f: aload 3
      // 040: invokevirtual com/finalshell/core/Cv2.j$String ()Ljava/lang/String;
      // 043: astore 8
      // 045: new java/lang/String
      // 048: dup
      // 049: aload 6
      // 04b: invokespecial java/lang/String.<init> ([B)V
      // 04e: astore 9
      // 050: aload 0
      // 051: iload 4
      // 053: ifne 09d
      // 056: getfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 059: ifnonnull 09c
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: iload 2
      // 064: sipush 21143
      // 067: ldc2_w 4494981248157306360
      // 06a: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 06d: if_icmpeq 09c
      // 070: goto 077
      // 073: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: new java/lang/StringBuilder
      // 07a: dup
      // 07b: invokespecial java/lang/StringBuilder.<init> ()V
      // 07e: ldc_w "["
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: aload 1
      // 085: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 088: sipush -8792
      // 08b: sipush 20560
      // 08e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: iload 2
      // 095: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 098: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09b: astore 1
      // 09c: aload 0
      // 09d: invokevirtual com/finalshell/crypto/ConnectHost.r$RW ()Lcom/finalshell/core/RW;
      // 0a0: astore 10
      // 0a2: aload 0
      // 0a3: sipush -8844
      // 0a6: sipush -9496
      // 0a9: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0ac: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0af: astore 11
      // 0b1: aload 11
      // 0b3: sipush -8905
      // 0b6: sipush 9495
      // 0b9: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bf: iload 4
      // 0c1: ifne 0da
      // 0c4: ifeq 0f8
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 10
      // 0d0: instanceof com/finalshell/core/Bb2
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: ifeq 0f8
      // 0dd: aload 0
      // 0de: aload 10
      // 0e0: checkcast com/finalshell/core/Bb2
      // 0e3: aload 1
      // 0e4: aload 6
      // 0e6: invokevirtual com/finalshell/core/Bb2.m (Ljava/lang/String;[B)Lcom/finalshell/core/DQ;
      // 0e9: putfield com/finalshell/crypto/ConnectHost.iM Lcom/finalshell/core/DQ;
      // 0ec: iload 4
      // 0ee: ifeq 10d
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: new com/finalshell/core/DQ
      // 0fc: dup
      // 0fd: aload 1
      // 0fe: aload 6
      // 100: invokespecial com/finalshell/core/DQ.<init> (Ljava/lang/String;[B)V
      // 103: putfield com/finalshell/crypto/ConnectHost.iM Lcom/finalshell/core/DQ;
      // 106: goto 10d
      // 109: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: bipush 0
      // 10e: istore 12
      // 110: aload 10
      // 112: dup
      // 113: astore 13
      // 115: monitorenter
      // 116: aload 10
      // 118: aload 1
      // 119: aload 6
      // 11b: invokeinterface com/finalshell/core/RW.e (Ljava/lang/String;[B)I 3
      // 120: istore 12
      // 122: aload 13
      // 124: monitorexit
      // 125: goto 130
      // 128: astore 14
      // 12a: aload 13
      // 12c: monitorexit
      // 12d: aload 14
      // 12f: athrow
      // 130: bipush 0
      // 131: istore 13
      // 133: bipush 0
      // 134: istore 14
      // 136: aload 5
      // 138: sipush -8958
      // 13b: sipush -15575
      // 13e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 141: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 144: iload 4
      // 146: ifne 179
      // 149: ifne 177
      // 14c: goto 153
      // 14f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152: athrow
      // 153: aload 5
      // 155: sipush -8905
      // 158: sipush 9495
      // 15b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 15e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 161: iload 4
      // 163: ifne 33f
      // 166: goto 16d
      // 169: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: ifeq 331
      // 170: goto 177
      // 173: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: iload 12
      // 179: iload 4
      // 17b: ifne 33f
      // 17e: bipush 2
      // 17f: if_icmpne 331
      // 182: goto 189
      // 185: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: aconst_null
      // 18a: astore 15
      // 18c: aload 10
      // 18e: dup
      // 18f: astore 16
      // 191: monitorenter
      // 192: aload 10
      // 194: invokeinterface com/finalshell/core/RW.O ()Ljava/lang/String; 1
      // 199: astore 15
      // 19b: aload 16
      // 19d: monitorexit
      // 19e: goto 1a9
      // 1a1: astore 17
      // 1a3: aload 16
      // 1a5: monitorexit
      // 1a6: aload 17
      // 1a8: athrow
      // 1a9: aload 15
      // 1ab: iload 4
      // 1ad: ifne 1c3
      // 1b0: ifnonnull 1c5
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: sipush -8729
      // 1bd: sipush -13648
      // 1c0: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1c3: astore 15
      // 1c5: bipush 0
      // 1c6: istore 16
      // 1c8: aload 0
      // 1c9: getfield com/finalshell/crypto/ConnectHost.Y Lcom/finalshell/core/Gq2;
      // 1cc: ifnull 29c
      // 1cf: new java/lang/StringBuilder
      // 1d2: dup
      // 1d3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d6: sipush -8725
      // 1d9: sipush -31679
      // 1dc: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: aload 0
      // 1e3: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 1e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e9: sipush -8763
      // 1ec: sipush 17860
      // 1ef: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f5: aload 8
      // 1f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fd: astore 17
      // 1ff: bipush 2
      // 200: istore 18
      // 202: bipush 3
      // 203: anewarray 160
      // 206: dup
      // 207: bipush 0
      // 208: sipush -8892
      // 20b: sipush 1402
      // 20e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 211: aastore
      // 212: dup
      // 213: bipush 1
      // 214: sipush -8761
      // 217: sipush -31689
      // 21a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 21d: aastore
      // 21e: dup
      // 21f: bipush 2
      // 220: sipush -8748
      // 223: sipush 27986
      // 226: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 229: aastore
      // 22a: astore 19
      // 22c: aload 0
      // 22d: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 230: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 233: aload 17
      // 235: sipush -8911
      // 238: sipush 24449
      // 23b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 23e: bipush 0
      // 23f: iload 18
      // 241: aconst_null
      // 242: aload 19
      // 244: sipush -8790
      // 247: sipush 27078
      // 24a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 24d: invokestatic javax/swing/JOptionPane.showOptionDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I
      // 250: istore 20
      // 252: iload 20
      // 254: iload 4
      // 256: ifne 277
      // 259: ifne 26e
      // 25c: goto 263
      // 25f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 262: athrow
      // 263: bipush 1
      // 264: istore 13
      // 266: bipush 1
      // 267: istore 16
      // 269: iload 4
      // 26b: ifeq 29c
      // 26e: iload 20
      // 270: goto 277
      // 273: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 276: athrow
      // 277: bipush 1
      // 278: iload 4
      // 27a: ifne 299
      // 27d: if_icmpne 28f
      // 280: goto 287
      // 283: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 286: athrow
      // 287: bipush 1
      // 288: istore 16
      // 28a: iload 4
      // 28c: ifeq 29c
      // 28f: iload 20
      // 291: bipush 2
      // 292: goto 299
      // 295: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 298: athrow
      // 299: if_icmpne 29c
      // 29c: iload 16
      // 29e: ifne 2c7
      // 2a1: new com/finalshell/core/Pc2
      // 2a4: dup
      // 2a5: new java/lang/StringBuilder
      // 2a8: dup
      // 2a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ac: sipush -8933
      // 2af: sipush -29356
      // 2b2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 2b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b8: aload 1
      // 2b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2bf: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 2c2: athrow
      // 2c3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c6: athrow
      // 2c7: aload 10
      // 2c9: dup
      // 2ca: astore 17
      // 2cc: monitorenter
      // 2cd: iload 13
      // 2cf: iload 4
      // 2d1: ifne 321
      // 2d4: ifne 320
      // 2d7: aload 10
      // 2d9: aload 1
      // 2da: aload 7
      // 2dc: iload 4
      // 2de: ifne 30e
      // 2e1: goto 2e8
      // 2e4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e7: athrow
      // 2e8: sipush -8898
      // 2eb: sipush -7243
      // 2ee: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 2f1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f4: ifeq 311
      // 2f7: goto 2fe
      // 2fa: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fd: athrow
      // 2fe: sipush -8864
      // 301: sipush 31363
      // 304: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 307: goto 30e
      // 30a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: goto 31a
      // 311: sipush -8931
      // 314: sipush 9444
      // 317: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 31a: aconst_null
      // 31b: invokeinterface com/finalshell/core/RW.n (Ljava/lang/String;Ljava/lang/String;[B)V 4
      // 320: bipush 1
      // 321: istore 14
      // 323: aload 17
      // 325: monitorexit
      // 326: goto 331
      // 329: astore 21
      // 32b: aload 17
      // 32d: monitorexit
      // 32e: aload 21
      // 330: athrow
      // 331: aload 5
      // 333: sipush -8894
      // 336: sipush -30398
      // 339: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 33c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 33f: iload 4
      // 341: ifne 374
      // 344: ifne 372
      // 347: goto 34e
      // 34a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34d: athrow
      // 34e: aload 5
      // 350: sipush -8905
      // 353: sipush 9495
      // 356: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 359: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 35c: iload 4
      // 35e: ifne 574
      // 361: goto 368
      // 364: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 367: athrow
      // 368: ifeq 566
      // 36b: goto 372
      // 36e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 371: athrow
      // 372: iload 12
      // 374: iload 4
      // 376: ifne 574
      // 379: ifeq 566
      // 37c: goto 383
      // 37f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 382: athrow
      // 383: iload 14
      // 385: iload 4
      // 387: ifne 574
      // 38a: goto 391
      // 38d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 390: athrow
      // 391: ifne 566
      // 394: goto 39b
      // 397: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39a: athrow
      // 39b: aload 5
      // 39d: sipush -8905
      // 3a0: sipush 9495
      // 3a3: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3a9: ifeq 3dc
      // 3ac: goto 3b3
      // 3af: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b2: athrow
      // 3b3: new com/finalshell/core/Pc2
      // 3b6: dup
      // 3b7: new java/lang/StringBuilder
      // 3ba: dup
      // 3bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 3be: sipush -8940
      // 3c1: sipush -24615
      // 3c4: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ca: aload 0
      // 3cb: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 3ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d4: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 3d7: athrow
      // 3d8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3db: athrow
      // 3dc: aload 0
      // 3dd: getfield com/finalshell/crypto/ConnectHost.Y Lcom/finalshell/core/Gq2;
      // 3e0: ifnull 4e9
      // 3e3: bipush 1
      // 3e4: istore 15
      // 3e6: aload 0
      // 3e7: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 3ea: ifnull 4b6
      // 3ed: bipush 2
      // 3ee: istore 16
      // 3f0: bipush 3
      // 3f1: anewarray 160
      // 3f4: dup
      // 3f5: bipush 0
      // 3f6: sipush -8769
      // 3f9: sipush -17144
      // 3fc: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3ff: aastore
      // 400: dup
      // 401: bipush 1
      // 402: sipush -8788
      // 405: sipush -17096
      // 408: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 40b: aastore
      // 40c: dup
      // 40d: bipush 2
      // 40e: sipush -8790
      // 411: sipush 27078
      // 414: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 417: aastore
      // 418: astore 17
      // 41a: aload 0
      // 41b: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 41e: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 421: new java/lang/StringBuilder
      // 424: dup
      // 425: invokespecial java/lang/StringBuilder.<init> ()V
      // 428: sipush -8873
      // 42b: sipush 25132
      // 42e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 431: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 434: aload 0
      // 435: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 438: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 43b: sipush -8850
      // 43e: sipush 10254
      // 441: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 444: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 447: aload 8
      // 449: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 44f: sipush -8950
      // 452: sipush -15299
      // 455: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 458: bipush 0
      // 459: iload 16
      // 45b: aconst_null
      // 45c: aload 17
      // 45e: sipush -8790
      // 461: sipush 27078
      // 464: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 467: invokestatic javax/swing/JOptionPane.showOptionDialog (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I
      // 46a: istore 18
      // 46c: iload 18
      // 46e: iload 4
      // 470: ifne 482
      // 473: ifne 480
      // 476: goto 47d
      // 479: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47c: athrow
      // 47d: goto 4b6
      // 480: iload 18
      // 482: bipush 1
      // 483: iload 4
      // 485: ifne 4b0
      // 488: if_icmpne 49a
      // 48b: goto 492
      // 48e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 491: athrow
      // 492: bipush 1
      // 493: istore 14
      // 495: iload 4
      // 497: ifeq 4b6
      // 49a: iload 18
      // 49c: iload 4
      // 49e: ifne 4b8
      // 4a1: goto 4a8
      // 4a4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a7: athrow
      // 4a8: bipush 2
      // 4a9: goto 4b0
      // 4ac: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4af: athrow
      // 4b0: if_icmpne 4b6
      // 4b3: bipush 0
      // 4b4: istore 15
      // 4b6: iload 15
      // 4b8: ifne 4e4
      // 4bb: new com/finalshell/core/Pc2
      // 4be: dup
      // 4bf: new java/lang/StringBuilder
      // 4c2: dup
      // 4c3: invokespecial java/lang/StringBuilder.<init> ()V
      // 4c6: sipush -8885
      // 4c9: sipush 32287
      // 4cc: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 4cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d2: aload 0
      // 4d3: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 4d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4dc: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 4df: athrow
      // 4e0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e3: athrow
      // 4e4: iload 4
      // 4e6: ifeq 566
      // 4e9: iload 12
      // 4eb: bipush 1
      // 4ec: if_icmpne 541
      // 4ef: goto 4f6
      // 4f2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f5: athrow
      // 4f6: new com/finalshell/core/Pc2
      // 4f9: dup
      // 4fa: new java/lang/StringBuilder
      // 4fd: dup
      // 4fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 501: sipush -8840
      // 504: sipush 31768
      // 507: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 50a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50d: aload 0
      // 50e: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 511: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 514: sipush -8909
      // 517: sipush -27479
      // 51a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 51d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 520: aload 7
      // 522: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 525: sipush -8754
      // 528: sipush -28353
      // 52b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 52e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 531: aload 8
      // 533: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 536: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 539: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 53c: athrow
      // 53d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 540: athrow
      // 541: new com/finalshell/core/Pc2
      // 544: dup
      // 545: new java/lang/StringBuilder
      // 548: dup
      // 549: invokespecial java/lang/StringBuilder.<init> ()V
      // 54c: sipush -8916
      // 54f: sipush 20321
      // 552: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 555: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 558: aload 0
      // 559: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 55c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 562: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 565: athrow
      // 566: aload 5
      // 568: sipush -8947
      // 56b: sipush -8759
      // 56e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 571: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 574: iload 4
      // 576: ifne 5a1
      // 579: ifeq 59f
      // 57c: goto 583
      // 57f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 582: athrow
      // 583: bipush 1
      // 584: iload 4
      // 586: ifne 5a1
      // 589: goto 590
      // 58c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58f: athrow
      // 590: iload 12
      // 592: if_icmpne 59f
      // 595: goto 59c
      // 598: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59b: athrow
      // 59c: bipush 1
      // 59d: istore 14
      // 59f: iload 12
      // 5a1: iload 4
      // 5a3: ifne 702
      // 5a6: ifne 700
      // 5a9: goto 5b0
      // 5ac: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5af: athrow
      // 5b0: aload 10
      // 5b2: aload 1
      // 5b3: aload 3
      // 5b4: invokevirtual com/finalshell/core/Cv2.G ()Ljava/lang/String;
      // 5b7: invokeinterface com/finalshell/core/RW.R (Ljava/lang/String;Ljava/lang/String;)[Lcom/finalshell/core/DQ; 3
      // 5bc: astore 15
      // 5be: aload 6
      // 5c0: bipush 0
      // 5c1: aload 6
      // 5c3: arraylength
      // 5c4: bipush 1
      // 5c5: invokestatic com/finalshell/core/E8.V ([BIIZ)[B
      // 5c8: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 5cb: astore 16
      // 5cd: bipush 0
      // 5ce: istore 17
      // 5d0: iload 17
      // 5d2: aload 15
      // 5d4: arraylength
      // 5d5: if_icmpge 700
      // 5d8: aload 15
      // 5da: iload 12
      // 5dc: aaload
      // 5dd: invokevirtual com/finalshell/core/DQ.C ()Ljava/lang/String;
      // 5e0: aload 16
      // 5e2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5e5: iload 4
      // 5e7: ifne 702
      // 5ea: iload 4
      // 5ec: ifne 61b
      // 5ef: goto 5f6
      // 5f2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f5: athrow
      // 5f6: ifeq 6f8
      // 5f9: goto 600
      // 5fc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ff: athrow
      // 600: aload 15
      // 602: iload 17
      // 604: aaload
      // 605: invokevirtual com/finalshell/core/DQ.T ()Ljava/lang/String;
      // 608: sipush -8908
      // 60b: sipush -3774
      // 60e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 611: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 614: goto 61b
      // 617: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61a: athrow
      // 61b: ifeq 6f8
      // 61e: aload 0
      // 61f: getfield com/finalshell/crypto/ConnectHost.Y Lcom/finalshell/core/Gq2;
      // 622: iload 4
      // 624: ifne 643
      // 627: goto 62e
      // 62a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62d: athrow
      // 62e: ifnull 682
      // 631: goto 638
      // 634: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 637: athrow
      // 638: aload 0
      // 639: getfield com/finalshell/crypto/ConnectHost.Y Lcom/finalshell/core/Gq2;
      // 63c: goto 643
      // 63f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 642: athrow
      // 643: new java/lang/StringBuilder
      // 646: dup
      // 647: invokespecial java/lang/StringBuilder.<init> ()V
      // 64a: sipush -8801
      // 64d: sipush -8243
      // 650: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 653: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 656: aload 7
      // 658: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65b: sipush -8925
      // 65e: sipush 1481
      // 661: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 664: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 667: aload 0
      // 668: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 66b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66e: sipush -8880
      // 671: sipush -25822
      // 674: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 677: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 67a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 67d: invokeinterface com/finalshell/core/Gq2.q (Ljava/lang/String;)V 2
      // 682: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 685: bipush 1
      // 686: iload 4
      // 688: ifne 6a5
      // 68b: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 690: ifeq 6d3
      // 693: goto 69a
      // 696: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 699: athrow
      // 69a: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 69d: bipush 1
      // 69e: goto 6a5
      // 6a1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a4: athrow
      // 6a5: new java/lang/StringBuilder
      // 6a8: dup
      // 6a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 6ac: sipush -8723
      // 6af: sipush -17182
      // 6b2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 6b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b8: aload 0
      // 6b9: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 6bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6bf: sipush -8804
      // 6c2: sipush -30755
      // 6c5: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 6c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6ce: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 6d3: new com/finalshell/core/Pc2
      // 6d6: dup
      // 6d7: new java/lang/StringBuilder
      // 6da: dup
      // 6db: invokespecial java/lang/StringBuilder.<init> ()V
      // 6de: sipush -8836
      // 6e1: sipush 10463
      // 6e4: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 6e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ea: aload 0
      // 6eb: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 6ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6f1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6f4: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 6f7: athrow
      // 6f8: iinc 17 1
      // 6fb: iload 4
      // 6fd: ifeq 5d0
      // 700: iload 12
      // 702: iload 4
      // 704: ifne 77c
      // 707: ifne 77a
      // 70a: goto 711
      // 70d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 710: athrow
      // 711: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 714: bipush 1
      // 715: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 71a: iload 4
      // 71c: ifne 77c
      // 71f: goto 726
      // 722: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 725: athrow
      // 726: ifeq 77a
      // 729: goto 730
      // 72c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72f: athrow
      // 730: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 733: bipush 1
      // 734: new java/lang/StringBuilder
      // 737: dup
      // 738: invokespecial java/lang/StringBuilder.<init> ()V
      // 73b: sipush -8764
      // 73e: sipush -9961
      // 741: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 744: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 747: aload 0
      // 748: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 74b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74e: sipush -8816
      // 751: sipush -26734
      // 754: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 757: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75a: aload 7
      // 75c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75f: sipush -8843
      // 762: sipush -17634
      // 765: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 768: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 76e: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 773: goto 77a
      // 776: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 779: athrow
      // 77a: iload 14
      // 77c: iload 4
      // 77e: ifne 7f6
      // 781: ifeq 7f4
      // 784: goto 78b
      // 787: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78a: athrow
      // 78b: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 78e: bipush 2
      // 78f: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 794: iload 4
      // 796: ifne 7f6
      // 799: goto 7a0
      // 79c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79f: athrow
      // 7a0: ifeq 7f4
      // 7a3: goto 7aa
      // 7a6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a9: athrow
      // 7aa: invokestatic com/finalshell/core/Xe2.W ()Lcom/finalshell/core/GN;
      // 7ad: bipush 2
      // 7ae: new java/lang/StringBuilder
      // 7b1: dup
      // 7b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 7b5: sipush -8903
      // 7b8: sipush -8365
      // 7bb: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 7be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7c1: aload 0
      // 7c2: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 7c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7c8: sipush -8759
      // 7cb: sipush 15187
      // 7ce: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 7d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d4: aload 7
      // 7d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d9: sipush -8815
      // 7dc: sipush -20447
      // 7df: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 7e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e8: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 7ed: goto 7f4
      // 7f0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f3: athrow
      // 7f4: iload 14
      // 7f6: ifeq 81c
      // 7f9: aload 10
      // 7fb: dup
      // 7fc: astore 15
      // 7fe: monitorenter
      // 7ff: aload 10
      // 801: aload 0
      // 802: getfield com/finalshell/crypto/ConnectHost.iM Lcom/finalshell/core/DQ;
      // 805: aload 0
      // 806: getfield com/finalshell/crypto/ConnectHost.Y Lcom/finalshell/core/Gq2;
      // 809: invokeinterface com/finalshell/core/RW.Y (Lcom/finalshell/core/DQ;Lcom/finalshell/core/Gq2;)V 3
      // 80e: aload 15
      // 810: monitorexit
      // 811: goto 81c
      // 814: astore 22
      // 816: aload 15
      // 818: monitorexit
      // 819: aload 22
      // 81b: athrow
      // 81c: return
   }

   public Dm4 i$dm_4(String param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 08: ifne 20
      // 0b: new com/finalshell/core/Pc2
      // 0e: dup
      // 0f: sipush -8802
      // 12: sipush 5214
      // 15: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 18: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 1b: athrow
      // 1c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 0
      // 22: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/String;Lcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 25: astore 3
      // 26: aload 0
      // 27: aload 3
      // 28: invokevirtual com/finalshell/crypto/ConnectHost.j (Lcom/finalshell/core/Dm4;)V
      // 2b: aload 3
      // 2c: invokevirtual com/finalshell/core/Dm4.n ()V
      // 2f: aload 3
      // 30: iload 2
      // 31: ifeq 51
      // 34: instanceof com/finalshell/core/Dq4
      // 37: ifeq 50
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: aload 3
      // 43: checkcast com/finalshell/core/Dq4
      // 46: invokespecial com/finalshell/crypto/ConnectHost.E (Lcom/finalshell/core/Dq4;)V
      // 49: goto 50
      // 4c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 3
      // 51: areturn
      // 52: astore 3
      // 53: aconst_null
      // 54: areturn
   }

   public void h(YU param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 01e
      // 009: getfield com/finalshell/crypto/ConnectHost.v Lcom/finalshell/core/OD;
      // 00c: ifnull 053
      // 00f: goto 016
      // 012: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: getfield com/finalshell/crypto/ConnectHost.T [I
      // 021: bipush 0
      // 022: aload 1
      // 023: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 026: getfield com/finalshell/core/UJ.X I
      // 029: iastore
      // 02a: aload 1
      // 02b: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 02e: aload 0
      // 02f: getfield com/finalshell/crypto/ConnectHost.v Lcom/finalshell/core/OD;
      // 032: aload 1
      // 033: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 036: getfield com/finalshell/core/UJ.g [B
      // 039: bipush 5
      // 03a: aload 0
      // 03b: getfield com/finalshell/crypto/ConnectHost.T [I
      // 03e: invokeinterface com/finalshell/core/OD.T ([BI[I)[B 4
      // 043: putfield com/finalshell/core/UJ.g [B
      // 046: aload 1
      // 047: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 04a: aload 0
      // 04b: getfield com/finalshell/crypto/ConnectHost.T [I
      // 04e: bipush 0
      // 04f: iaload
      // 050: putfield com/finalshell/core/UJ.X I
      // 053: sipush 11298
      // 056: ldc2_w 2411481202322158430
      // 059: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 05c: istore 3
      // 05d: aload 0
      // 05e: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 061: iload 2
      // 062: ifeq 078
      // 065: ifnull 074
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield com/finalshell/crypto/ConnectHost.A I
      // 073: istore 3
      // 074: aload 0
      // 075: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 078: iload 2
      // 079: ifeq 091
      // 07c: ifnull 0a8
      // 07f: goto 086
      // 082: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: aload 0
      // 087: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: invokeinterface com/finalshell/core/EU.c ()Z 1
      // 096: iload 2
      // 097: ifeq 0a5
      // 09a: ifeq 0a8
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: bipush 1
      // 0a5: goto 0a9
      // 0a8: bipush 0
      // 0a9: istore 4
      // 0ab: aload 0
      // 0ac: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 0af: iload 2
      // 0b0: ifeq 0c8
      // 0b3: ifnull 0df
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: invokeinterface com/finalshell/core/EU.S ()Z 1
      // 0cd: iload 2
      // 0ce: ifeq 0dc
      // 0d1: ifeq 0df
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: bipush 1
      // 0dc: goto 0e0
      // 0df: bipush 0
      // 0e0: istore 5
      // 0e2: iload 4
      // 0e4: iload 2
      // 0e5: ifeq 0f4
      // 0e8: ifne 14b
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: iload 5
      // 0f4: ifne 14b
      // 0f7: aload 0
      // 0f8: iload 2
      // 0f9: ifeq 118
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 106: ifnull 14b
      // 109: goto 110
      // 10c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: aload 0
      // 111: goto 118
      // 114: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 11b: iload 2
      // 11c: ifeq 134
      // 11f: ifnull 14b
      // 122: goto 129
      // 125: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 12d: goto 134
      // 130: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: invokeinterface com/finalshell/core/FP.P ()Z 1
      // 139: iload 2
      // 13a: ifeq 148
      // 13d: ifeq 14b
      // 140: goto 147
      // 143: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: bipush 1
      // 148: goto 14c
      // 14b: bipush 0
      // 14c: istore 6
      // 14e: aload 1
      // 14f: iload 3
      // 150: iload 4
      // 152: iload 2
      // 153: ifeq 162
      // 156: ifne 184
      // 159: goto 160
      // 15c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: iload 5
      // 162: iload 2
      // 163: ifeq 172
      // 166: ifne 184
      // 169: goto 170
      // 16c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: iload 6
      // 172: iload 2
      // 173: ifeq 181
      // 176: ifne 184
      // 179: goto 180
      // 17c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: bipush 1
      // 181: goto 185
      // 184: bipush 0
      // 185: invokevirtual com/finalshell/core/YU.d (IZ)V
      // 188: aload 1
      // 189: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 18c: getfield com/finalshell/core/UJ.g [B
      // 18f: astore 7
      // 191: iload 4
      // 193: iload 2
      // 194: ifeq 1f8
      // 197: ifeq 1ef
      // 19a: goto 1a1
      // 19d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 1a5: aload 0
      // 1a6: getfield com/finalshell/crypto/ConnectHost.i1 I
      // 1a9: invokeinterface com/finalshell/core/EU.S (I)V 2
      // 1ae: aload 0
      // 1af: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 1b2: aload 7
      // 1b4: bipush 0
      // 1b5: bipush 4
      // 1b6: aload 7
      // 1b8: bipush 0
      // 1b9: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 1be: aload 0
      // 1bf: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 1c2: aload 7
      // 1c4: bipush 0
      // 1c5: aload 1
      // 1c6: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 1c9: getfield com/finalshell/core/UJ.X I
      // 1cc: aload 7
      // 1ce: bipush 0
      // 1cf: invokeinterface com/finalshell/core/EU.E ([BII[BI)V 6
      // 1d4: aload 1
      // 1d5: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 1d8: aload 0
      // 1d9: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 1dc: invokeinterface com/finalshell/core/EU.j ()I 1
      // 1e1: invokevirtual com/finalshell/core/UJ.S (I)V
      // 1e4: iload 2
      // 1e5: ifne 36a
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: iload 5
      // 1f1: goto 1f8
      // 1f4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f7: athrow
      // 1f8: iload 2
      // 1f9: ifeq 24f
      // 1fc: ifeq 246
      // 1ff: goto 206
      // 202: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 205: athrow
      // 206: aload 0
      // 207: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 20a: aload 7
      // 20c: bipush 0
      // 20d: bipush 4
      // 20e: invokeinterface com/finalshell/core/EU.c ([BII)V 4
      // 213: aload 0
      // 214: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 217: aload 7
      // 219: bipush 4
      // 21a: aload 1
      // 21b: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 21e: getfield com/finalshell/core/UJ.X I
      // 221: bipush 4
      // 222: isub
      // 223: aload 7
      // 225: bipush 4
      // 226: invokeinterface com/finalshell/core/EU.E ([BII[BI)V 6
      // 22b: aload 1
      // 22c: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 22f: aload 0
      // 230: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 233: invokeinterface com/finalshell/core/EU.j ()I 1
      // 238: invokevirtual com/finalshell/core/UJ.S (I)V
      // 23b: iload 2
      // 23c: ifne 36a
      // 23f: goto 246
      // 242: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 245: athrow
      // 246: iload 6
      // 248: goto 24f
      // 24b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24e: athrow
      // 24f: ifeq 2c1
      // 252: aload 0
      // 253: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 256: aload 7
      // 258: bipush 4
      // 259: aload 1
      // 25a: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 25d: getfield com/finalshell/core/UJ.X I
      // 260: bipush 4
      // 261: isub
      // 262: aload 7
      // 264: bipush 4
      // 265: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 26a: aload 0
      // 26b: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 26e: aload 0
      // 26f: getfield com/finalshell/crypto/ConnectHost.i1 I
      // 272: invokeinterface com/finalshell/core/FP.H (I)V 2
      // 277: aload 0
      // 278: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 27b: aload 1
      // 27c: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 27f: getfield com/finalshell/core/UJ.g [B
      // 282: bipush 0
      // 283: aload 1
      // 284: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 287: getfield com/finalshell/core/UJ.X I
      // 28a: invokeinterface com/finalshell/core/FP.o ([BII)V 4
      // 28f: aload 0
      // 290: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 293: aload 1
      // 294: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 297: getfield com/finalshell/core/UJ.g [B
      // 29a: aload 1
      // 29b: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 29e: getfield com/finalshell/core/UJ.X I
      // 2a1: invokeinterface com/finalshell/core/FP.U ([BI)V 3
      // 2a6: aload 1
      // 2a7: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 2aa: aload 0
      // 2ab: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 2ae: invokeinterface com/finalshell/core/FP.h ()I 1
      // 2b3: invokevirtual com/finalshell/core/UJ.S (I)V
      // 2b6: iload 2
      // 2b7: ifne 36a
      // 2ba: goto 2c1
      // 2bd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c0: athrow
      // 2c1: aload 0
      // 2c2: iload 2
      // 2c3: ifeq 31e
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 2d0: ifnull 31d
      // 2d3: goto 2da
      // 2d6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 2de: aload 0
      // 2df: getfield com/finalshell/crypto/ConnectHost.i1 I
      // 2e2: invokeinterface com/finalshell/core/FP.H (I)V 2
      // 2e7: aload 0
      // 2e8: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 2eb: aload 1
      // 2ec: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 2ef: getfield com/finalshell/core/UJ.g [B
      // 2f2: bipush 0
      // 2f3: aload 1
      // 2f4: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 2f7: getfield com/finalshell/core/UJ.X I
      // 2fa: invokeinterface com/finalshell/core/FP.o ([BII)V 4
      // 2ff: aload 0
      // 300: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 303: aload 1
      // 304: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 307: getfield com/finalshell/core/UJ.g [B
      // 30a: aload 1
      // 30b: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 30e: getfield com/finalshell/core/UJ.X I
      // 311: invokeinterface com/finalshell/core/FP.U ([BI)V 3
      // 316: goto 31d
      // 319: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: aload 0
      // 31e: iload 2
      // 31f: ifeq 34d
      // 322: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 325: ifnull 34c
      // 328: goto 32f
      // 32b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32e: athrow
      // 32f: aload 0
      // 330: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 333: aload 7
      // 335: bipush 0
      // 336: aload 1
      // 337: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 33a: getfield com/finalshell/core/UJ.X I
      // 33d: aload 7
      // 33f: bipush 0
      // 340: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 345: goto 34c
      // 348: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34b: athrow
      // 34c: aload 0
      // 34d: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 350: ifnull 36a
      // 353: aload 1
      // 354: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 357: aload 0
      // 358: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 35b: invokeinterface com/finalshell/core/FP.h ()I 1
      // 360: invokevirtual com/finalshell/core/UJ.S (I)V
      // 363: goto 36a
      // 366: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 369: athrow
      // 36a: return
   }

   public UJ V(UJ param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: bipush 0
      // 004: istore 3
      // 005: istore 2
      // 006: aload 0
      // 007: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 00a: iload 2
      // 00b: ifeq 023
      // 00e: ifnull 03a
      // 011: goto 018
      // 014: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 0
      // 019: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: invokeinterface com/finalshell/core/EU.c ()Z 1
      // 028: iload 2
      // 029: ifeq 037
      // 02c: ifeq 03a
      // 02f: goto 036
      // 032: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: bipush 1
      // 037: goto 03b
      // 03a: bipush 0
      // 03b: istore 4
      // 03d: aload 0
      // 03e: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 041: iload 2
      // 042: ifeq 05a
      // 045: ifnull 071
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 0
      // 050: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 053: goto 05a
      // 056: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: invokeinterface com/finalshell/core/EU.S ()Z 1
      // 05f: iload 2
      // 060: ifeq 06e
      // 063: ifeq 071
      // 066: goto 06d
      // 069: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: bipush 1
      // 06e: goto 072
      // 071: bipush 0
      // 072: istore 5
      // 074: iload 4
      // 076: iload 2
      // 077: ifeq 086
      // 07a: ifne 0dd
      // 07d: goto 084
      // 080: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: iload 5
      // 086: ifne 0dd
      // 089: aload 0
      // 08a: iload 2
      // 08b: ifeq 0aa
      // 08e: goto 095
      // 091: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 098: ifnull 0dd
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 0ad: iload 2
      // 0ae: ifeq 0c6
      // 0b1: ifnull 0dd
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: invokeinterface com/finalshell/core/FP.P ()Z 1
      // 0cb: iload 2
      // 0cc: ifeq 0da
      // 0cf: ifeq 0dd
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: bipush 1
      // 0da: goto 0de
      // 0dd: bipush 0
      // 0de: istore 6
      // 0e0: aload 1
      // 0e1: invokevirtual com/finalshell/core/UJ.m ()V
      // 0e4: iload 4
      // 0e6: ifeq 2ea
      // 0e9: aload 0
      // 0ea: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 0ed: aload 1
      // 0ee: getfield com/finalshell/core/UJ.g [B
      // 0f1: aload 1
      // 0f2: getfield com/finalshell/core/UJ.X I
      // 0f5: bipush 4
      // 0f6: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 0f9: aload 1
      // 0fa: dup
      // 0fb: getfield com/finalshell/core/UJ.X I
      // 0fe: bipush 4
      // 0ff: iadd
      // 100: putfield com/finalshell/core/UJ.X I
      // 103: aload 0
      // 104: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 107: aload 0
      // 108: getfield com/finalshell/crypto/ConnectHost.o I
      // 10b: invokeinterface com/finalshell/core/EU.S (I)V 2
      // 110: bipush 4
      // 111: newarray 8
      // 113: astore 7
      // 115: aload 0
      // 116: iload 2
      // 117: ifeq 1b5
      // 11a: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 11d: aload 1
      // 11e: getfield com/finalshell/core/UJ.g [B
      // 121: bipush 0
      // 122: bipush 4
      // 123: aload 7
      // 125: bipush 0
      // 126: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 12b: aload 7
      // 12d: bipush 0
      // 12e: baload
      // 12f: sipush 7982
      // 132: ldc2_w 6004249295577710660
      // 135: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 138: ishl
      // 139: sipush 29656
      // 13c: ldc2_w 1090538408350936209
      // 13f: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 142: iand
      // 143: aload 7
      // 145: bipush 1
      // 146: baload
      // 147: sipush 30946
      // 14a: ldc2_w 8407518286402938796
      // 14d: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 150: ishl
      // 151: sipush 21100
      // 154: ldc2_w 8547072606318546206
      // 157: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 15a: iand
      // 15b: ior
      // 15c: aload 7
      // 15e: bipush 2
      // 15f: baload
      // 160: sipush 11298
      // 163: ldc2_w 2411481202322158430
      // 166: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 169: ishl
      // 16a: sipush 19539
      // 16d: ldc2_w 6672736249196761887
      // 170: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 173: iand
      // 174: ior
      // 175: aload 7
      // 177: bipush 3
      // 178: baload
      // 179: sipush 22964
      // 17c: ldc2_w 9100282419660474096
      // 17f: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 182: iand
      // 183: ior
      // 184: istore 3
      // 185: iload 3
      // 186: bipush 5
      // 187: iload 2
      // 188: ifeq 3a1
      // 18b: if_icmplt 1b4
      // 18e: goto 195
      // 191: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: iload 3
      // 196: sipush 5750
      // 199: ldc2_w 4607550497866123575
      // 19c: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 19f: iload 2
      // 1a0: ifeq 1e2
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: if_icmple 1cb
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: aload 1
      // 1b6: aload 0
      // 1b7: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 1ba: aload 0
      // 1bb: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 1be: bipush 0
      // 1bf: sipush 10620
      // 1c2: ldc2_w 1641328671930824255
      // 1c5: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 1c8: invokespecial com/finalshell/crypto/ConnectHost.R (Lcom/finalshell/core/UJ;Lcom/finalshell/core/EU;Lcom/finalshell/core/FP;II)V
      // 1cb: iload 3
      // 1cc: aload 0
      // 1cd: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 1d0: invokeinterface com/finalshell/core/EU.j ()I 1
      // 1d5: iadd
      // 1d6: istore 3
      // 1d7: aload 1
      // 1d8: getfield com/finalshell/core/UJ.X I
      // 1db: iload 3
      // 1dc: iadd
      // 1dd: aload 1
      // 1de: getfield com/finalshell/core/UJ.g [B
      // 1e1: arraylength
      // 1e2: iload 2
      // 1e3: ifeq 214
      // 1e6: if_icmple 20f
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: aload 1
      // 1f1: getfield com/finalshell/core/UJ.X I
      // 1f4: iload 3
      // 1f5: iadd
      // 1f6: newarray 8
      // 1f8: astore 8
      // 1fa: aload 1
      // 1fb: getfield com/finalshell/core/UJ.g [B
      // 1fe: bipush 0
      // 1ff: aload 8
      // 201: bipush 0
      // 202: aload 1
      // 203: getfield com/finalshell/core/UJ.X I
      // 206: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 209: aload 1
      // 20a: aload 8
      // 20c: putfield com/finalshell/core/UJ.g [B
      // 20f: iload 3
      // 210: aload 0
      // 211: getfield com/finalshell/crypto/ConnectHost.il I
      // 214: irem
      // 215: iload 2
      // 216: ifeq 2a1
      // 219: ifeq 286
      // 21c: goto 223
      // 21f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 222: athrow
      // 223: new java/lang/StringBuilder
      // 226: dup
      // 227: invokespecial java/lang/StringBuilder.<init> ()V
      // 22a: sipush -8904
      // 22d: sipush -2050
      // 230: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 233: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 236: iload 3
      // 237: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 23a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23d: astore 8
      // 23f: aload 0
      // 240: iload 2
      // 241: ifeq 26b
      // 244: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 247: bipush 4
      // 248: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 24d: ifeq 26a
      // 250: goto 257
      // 253: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: aload 0
      // 258: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 25b: bipush 4
      // 25c: aload 8
      // 25e: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 263: goto 26a
      // 266: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: aload 0
      // 26b: aload 1
      // 26c: aload 0
      // 26d: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 270: aload 0
      // 271: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 274: bipush 0
      // 275: sipush 10620
      // 278: ldc2_w 1641328671930824255
      // 27b: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 27e: aload 0
      // 27f: getfield com/finalshell/crypto/ConnectHost.il I
      // 282: isub
      // 283: invokespecial com/finalshell/crypto/ConnectHost.R (Lcom/finalshell/core/UJ;Lcom/finalshell/core/EU;Lcom/finalshell/core/FP;II)V
      // 286: aload 0
      // 287: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 28a: aload 1
      // 28b: getfield com/finalshell/core/UJ.g [B
      // 28e: aload 1
      // 28f: getfield com/finalshell/core/UJ.X I
      // 292: iload 3
      // 293: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 296: iload 3
      // 297: aload 0
      // 298: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 29b: invokeinterface com/finalshell/core/EU.j ()I 1
      // 2a0: isub
      // 2a1: istore 3
      // 2a2: aload 1
      // 2a3: dup
      // 2a4: getfield com/finalshell/core/UJ.X I
      // 2a7: iload 3
      // 2a8: iadd
      // 2a9: putfield com/finalshell/core/UJ.X I
      // 2ac: aload 0
      // 2ad: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 2b0: aload 1
      // 2b1: getfield com/finalshell/core/UJ.g [B
      // 2b4: bipush 0
      // 2b5: iload 3
      // 2b6: bipush 4
      // 2b7: iadd
      // 2b8: aload 1
      // 2b9: getfield com/finalshell/core/UJ.g [B
      // 2bc: bipush 0
      // 2bd: invokeinterface com/finalshell/core/EU.E ([BII[BI)V 6
      // 2c2: goto 2da
      // 2c5: astore 8
      // 2c7: new com/finalshell/core/Pc2
      // 2ca: dup
      // 2cb: sipush -8739
      // 2ce: sipush 26029
      // 2d1: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 2d4: aload 8
      // 2d6: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 2d9: athrow
      // 2da: aload 7
      // 2dc: bipush 0
      // 2dd: aload 1
      // 2de: getfield com/finalshell/core/UJ.g [B
      // 2e1: bipush 0
      // 2e2: bipush 4
      // 2e3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2e6: iload 2
      // 2e7: ifne 89a
      // 2ea: iload 5
      // 2ec: iload 2
      // 2ed: ifeq 3a0
      // 2f0: goto 2f7
      // 2f3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f6: athrow
      // 2f7: ifne 318
      // 2fa: goto 301
      // 2fd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 300: athrow
      // 301: iload 6
      // 303: iload 2
      // 304: ifeq 3a0
      // 307: goto 30e
      // 30a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: ifeq 5b6
      // 311: goto 318
      // 314: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 317: athrow
      // 318: aload 0
      // 319: iload 2
      // 31a: ifeq 3cb
      // 31d: goto 324
      // 320: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 323: athrow
      // 324: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 327: aload 1
      // 328: getfield com/finalshell/core/UJ.g [B
      // 32b: aload 1
      // 32c: getfield com/finalshell/core/UJ.X I
      // 32f: bipush 4
      // 330: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 333: aload 1
      // 334: dup
      // 335: getfield com/finalshell/core/UJ.X I
      // 338: bipush 4
      // 339: iadd
      // 33a: putfield com/finalshell/core/UJ.X I
      // 33d: aload 1
      // 33e: getfield com/finalshell/core/UJ.g [B
      // 341: bipush 0
      // 342: baload
      // 343: sipush 5581
      // 346: ldc2_w 8623295296179767979
      // 349: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 34c: ishl
      // 34d: sipush 21737
      // 350: ldc2_w 3719935381928692641
      // 353: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 356: iand
      // 357: aload 1
      // 358: getfield com/finalshell/core/UJ.g [B
      // 35b: bipush 1
      // 35c: baload
      // 35d: sipush 14246
      // 360: ldc2_w 2487488973486041323
      // 363: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 366: ishl
      // 367: sipush 18268
      // 36a: ldc2_w 3904502175353854015
      // 36d: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 370: iand
      // 371: ior
      // 372: aload 1
      // 373: getfield com/finalshell/core/UJ.g [B
      // 376: bipush 2
      // 377: baload
      // 378: sipush 11298
      // 37b: ldc2_w 2411481202322158430
      // 37e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 381: ishl
      // 382: sipush 20429
      // 385: ldc2_w 4016307658205483198
      // 388: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 38b: iand
      // 38c: ior
      // 38d: aload 1
      // 38e: getfield com/finalshell/core/UJ.g [B
      // 391: bipush 3
      // 392: baload
      // 393: sipush 7813
      // 396: ldc2_w 2971678928545022450
      // 399: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 39c: iand
      // 39d: ior
      // 39e: istore 3
      // 39f: iload 3
      // 3a0: bipush 5
      // 3a1: if_icmplt 3c3
      // 3a4: iload 3
      // 3a5: iload 2
      // 3a6: ifeq 3e3
      // 3a9: goto 3b0
      // 3ac: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3af: athrow
      // 3b0: sipush 10620
      // 3b3: ldc2_w 1641328671930824255
      // 3b6: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 3b9: if_icmple 3e1
      // 3bc: goto 3c3
      // 3bf: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c2: athrow
      // 3c3: aload 0
      // 3c4: goto 3cb
      // 3c7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ca: athrow
      // 3cb: aload 1
      // 3cc: aload 0
      // 3cd: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 3d0: aload 0
      // 3d1: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 3d4: bipush 0
      // 3d5: sipush 10620
      // 3d8: ldc2_w 1641328671930824255
      // 3db: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 3de: invokespecial com/finalshell/crypto/ConnectHost.R (Lcom/finalshell/core/UJ;Lcom/finalshell/core/EU;Lcom/finalshell/core/FP;II)V
      // 3e1: iload 5
      // 3e3: iload 2
      // 3e4: ifeq 403
      // 3e7: ifeq 3fd
      // 3ea: goto 3f1
      // 3ed: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f0: athrow
      // 3f1: iload 3
      // 3f2: aload 0
      // 3f3: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 3f6: invokeinterface com/finalshell/core/EU.j ()I 1
      // 3fb: iadd
      // 3fc: istore 3
      // 3fd: aload 1
      // 3fe: getfield com/finalshell/core/UJ.X I
      // 401: iload 3
      // 402: iadd
      // 403: aload 1
      // 404: getfield com/finalshell/core/UJ.g [B
      // 407: arraylength
      // 408: iload 2
      // 409: ifeq 43a
      // 40c: if_icmple 435
      // 40f: goto 416
      // 412: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 415: athrow
      // 416: aload 1
      // 417: getfield com/finalshell/core/UJ.X I
      // 41a: iload 3
      // 41b: iadd
      // 41c: newarray 8
      // 41e: astore 7
      // 420: aload 1
      // 421: getfield com/finalshell/core/UJ.g [B
      // 424: bipush 0
      // 425: aload 7
      // 427: bipush 0
      // 428: aload 1
      // 429: getfield com/finalshell/core/UJ.X I
      // 42c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 42f: aload 1
      // 430: aload 7
      // 432: putfield com/finalshell/core/UJ.g [B
      // 435: iload 3
      // 436: aload 0
      // 437: getfield com/finalshell/crypto/ConnectHost.il I
      // 43a: irem
      // 43b: iload 2
      // 43c: ifeq 4c8
      // 43f: ifeq 4ac
      // 442: goto 449
      // 445: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 448: athrow
      // 449: new java/lang/StringBuilder
      // 44c: dup
      // 44d: invokespecial java/lang/StringBuilder.<init> ()V
      // 450: sipush -8895
      // 453: sipush 11924
      // 456: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 459: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45c: iload 3
      // 45d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 460: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 463: astore 7
      // 465: aload 0
      // 466: iload 2
      // 467: ifeq 491
      // 46a: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 46d: bipush 4
      // 46e: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 473: ifeq 490
      // 476: goto 47d
      // 479: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47c: athrow
      // 47d: aload 0
      // 47e: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 481: bipush 4
      // 482: aload 7
      // 484: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 489: goto 490
      // 48c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48f: athrow
      // 490: aload 0
      // 491: aload 1
      // 492: aload 0
      // 493: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 496: aload 0
      // 497: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 49a: bipush 0
      // 49b: sipush 10620
      // 49e: ldc2_w 1641328671930824255
      // 4a1: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 4a4: aload 0
      // 4a5: getfield com/finalshell/crypto/ConnectHost.il I
      // 4a8: isub
      // 4a9: invokespecial com/finalshell/crypto/ConnectHost.R (Lcom/finalshell/core/UJ;Lcom/finalshell/core/EU;Lcom/finalshell/core/FP;II)V
      // 4ac: aload 0
      // 4ad: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 4b0: aload 1
      // 4b1: getfield com/finalshell/core/UJ.g [B
      // 4b4: aload 1
      // 4b5: getfield com/finalshell/core/UJ.X I
      // 4b8: iload 3
      // 4b9: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 4bc: aload 1
      // 4bd: dup
      // 4be: getfield com/finalshell/core/UJ.X I
      // 4c1: iload 3
      // 4c2: iadd
      // 4c3: putfield com/finalshell/core/UJ.X I
      // 4c6: iload 5
      // 4c8: iload 2
      // 4c9: ifeq 586
      // 4cc: ifeq 52b
      // 4cf: goto 4d6
      // 4d2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d5: athrow
      // 4d6: aload 0
      // 4d7: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 4da: aload 1
      // 4db: getfield com/finalshell/core/UJ.g [B
      // 4de: bipush 0
      // 4df: bipush 4
      // 4e0: invokeinterface com/finalshell/core/EU.c ([BII)V 4
      // 4e5: aload 0
      // 4e6: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 4e9: aload 1
      // 4ea: getfield com/finalshell/core/UJ.g [B
      // 4ed: bipush 4
      // 4ee: iload 3
      // 4ef: aload 1
      // 4f0: getfield com/finalshell/core/UJ.g [B
      // 4f3: bipush 4
      // 4f4: invokeinterface com/finalshell/core/EU.E ([BII[BI)V 6
      // 4f9: goto 515
      // 4fc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ff: athrow
      // 500: astore 7
      // 502: new com/finalshell/core/Pc2
      // 505: dup
      // 506: sipush -8756
      // 509: sipush -13270
      // 50c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 50f: aload 7
      // 511: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 514: athrow
      // 515: aload 1
      // 516: dup
      // 517: getfield com/finalshell/core/UJ.X I
      // 51a: aload 0
      // 51b: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 51e: invokeinterface com/finalshell/core/EU.j ()I 1
      // 523: isub
      // 524: putfield com/finalshell/core/UJ.X I
      // 527: iload 2
      // 528: ifne 89a
      // 52b: aload 0
      // 52c: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 52f: aload 0
      // 530: getfield com/finalshell/crypto/ConnectHost.o I
      // 533: invokeinterface com/finalshell/core/FP.H (I)V 2
      // 538: aload 0
      // 539: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 53c: aload 1
      // 53d: getfield com/finalshell/core/UJ.g [B
      // 540: bipush 0
      // 541: aload 1
      // 542: getfield com/finalshell/core/UJ.X I
      // 545: invokeinterface com/finalshell/core/FP.o ([BII)V 4
      // 54a: aload 0
      // 54b: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 54e: aload 0
      // 54f: getfield com/finalshell/crypto/ConnectHost.e [B
      // 552: bipush 0
      // 553: invokeinterface com/finalshell/core/FP.U ([BI)V 3
      // 558: aload 0
      // 559: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 55c: aload 0
      // 55d: getfield com/finalshell/crypto/ConnectHost.F [B
      // 560: bipush 0
      // 561: aload 0
      // 562: getfield com/finalshell/crypto/ConnectHost.F [B
      // 565: arraylength
      // 566: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 569: aload 0
      // 56a: iload 2
      // 56b: ifeq 59f
      // 56e: goto 575
      // 571: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 574: athrow
      // 575: getfield com/finalshell/crypto/ConnectHost.e [B
      // 578: aload 0
      // 579: getfield com/finalshell/crypto/ConnectHost.F [B
      // 57c: invokestatic com/finalshell/core/E8.Y ([B[B)Z
      // 57f: goto 586
      // 582: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 585: athrow
      // 586: ifne 59e
      // 589: new com/finalshell/core/Pc2
      // 58c: dup
      // 58d: sipush -8756
      // 590: sipush -13270
      // 593: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 596: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 599: athrow
      // 59a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59d: athrow
      // 59e: aload 0
      // 59f: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 5a2: aload 1
      // 5a3: getfield com/finalshell/core/UJ.g [B
      // 5a6: bipush 4
      // 5a7: iload 3
      // 5a8: aload 1
      // 5a9: getfield com/finalshell/core/UJ.g [B
      // 5ac: bipush 4
      // 5ad: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 5b2: iload 2
      // 5b3: ifne 89a
      // 5b6: aload 0
      // 5b7: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 5ba: aload 1
      // 5bb: getfield com/finalshell/core/UJ.g [B
      // 5be: aload 1
      // 5bf: getfield com/finalshell/core/UJ.X I
      // 5c2: aload 0
      // 5c3: getfield com/finalshell/crypto/ConnectHost.il I
      // 5c6: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 5c9: aload 1
      // 5ca: dup
      // 5cb: getfield com/finalshell/core/UJ.X I
      // 5ce: aload 0
      // 5cf: getfield com/finalshell/crypto/ConnectHost.il I
      // 5d2: iadd
      // 5d3: putfield com/finalshell/core/UJ.X I
      // 5d6: iload 2
      // 5d7: ifeq 66f
      // 5da: goto 5e1
      // 5dd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e0: athrow
      // 5e1: aload 0
      // 5e2: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 5e5: ifnull 60d
      // 5e8: goto 5ef
      // 5eb: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ee: athrow
      // 5ef: aload 0
      // 5f0: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 5f3: aload 1
      // 5f4: getfield com/finalshell/core/UJ.g [B
      // 5f7: bipush 0
      // 5f8: aload 0
      // 5f9: getfield com/finalshell/crypto/ConnectHost.il I
      // 5fc: aload 1
      // 5fd: getfield com/finalshell/core/UJ.g [B
      // 600: bipush 0
      // 601: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 606: goto 60d
      // 609: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60c: athrow
      // 60d: aload 1
      // 60e: getfield com/finalshell/core/UJ.g [B
      // 611: bipush 0
      // 612: baload
      // 613: sipush 5581
      // 616: ldc2_w 8623295296179767979
      // 619: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 61c: ishl
      // 61d: sipush 21737
      // 620: ldc2_w 3719935381928692641
      // 623: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 626: iand
      // 627: aload 1
      // 628: getfield com/finalshell/core/UJ.g [B
      // 62b: bipush 1
      // 62c: baload
      // 62d: sipush 14246
      // 630: ldc2_w 2487488973486041323
      // 633: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 636: ishl
      // 637: sipush 18268
      // 63a: ldc2_w 3904502175353854015
      // 63d: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 640: iand
      // 641: ior
      // 642: aload 1
      // 643: getfield com/finalshell/core/UJ.g [B
      // 646: bipush 2
      // 647: baload
      // 648: sipush 11298
      // 64b: ldc2_w 2411481202322158430
      // 64e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 651: ishl
      // 652: sipush 20429
      // 655: ldc2_w 4016307658205483198
      // 658: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 65b: iand
      // 65c: ior
      // 65d: aload 1
      // 65e: getfield com/finalshell/core/UJ.g [B
      // 661: bipush 3
      // 662: baload
      // 663: sipush 7813
      // 666: ldc2_w 2971678928545022450
      // 669: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 66c: iand
      // 66d: ior
      // 66e: istore 3
      // 66f: iload 3
      // 670: bipush 5
      // 671: iload 2
      // 672: ifeq 690
      // 675: if_icmplt 69e
      // 678: goto 67f
      // 67b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67e: athrow
      // 67f: iload 3
      // 680: sipush 10620
      // 683: ldc2_w 1641328671930824255
      // 686: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 689: goto 690
      // 68c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68f: athrow
      // 690: iload 2
      // 691: ifeq 6c3
      // 694: if_icmple 6bc
      // 697: goto 69e
      // 69a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69d: athrow
      // 69e: aload 0
      // 69f: aload 1
      // 6a0: aload 0
      // 6a1: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 6a4: aload 0
      // 6a5: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 6a8: bipush 0
      // 6a9: sipush 10620
      // 6ac: ldc2_w 1641328671930824255
      // 6af: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 6b2: invokespecial com/finalshell/crypto/ConnectHost.R (Lcom/finalshell/core/UJ;Lcom/finalshell/core/EU;Lcom/finalshell/core/FP;II)V
      // 6b5: goto 6bc
      // 6b8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6bb: athrow
      // 6bc: iload 3
      // 6bd: bipush 4
      // 6be: iadd
      // 6bf: aload 0
      // 6c0: getfield com/finalshell/crypto/ConnectHost.il I
      // 6c3: isub
      // 6c4: istore 7
      // 6c6: aload 1
      // 6c7: getfield com/finalshell/core/UJ.X I
      // 6ca: iload 7
      // 6cc: iadd
      // 6cd: aload 1
      // 6ce: getfield com/finalshell/core/UJ.g [B
      // 6d1: arraylength
      // 6d2: iload 2
      // 6d3: ifeq 706
      // 6d6: if_icmple 700
      // 6d9: goto 6e0
      // 6dc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6df: athrow
      // 6e0: aload 1
      // 6e1: getfield com/finalshell/core/UJ.X I
      // 6e4: iload 7
      // 6e6: iadd
      // 6e7: newarray 8
      // 6e9: astore 8
      // 6eb: aload 1
      // 6ec: getfield com/finalshell/core/UJ.g [B
      // 6ef: bipush 0
      // 6f0: aload 8
      // 6f2: bipush 0
      // 6f3: aload 1
      // 6f4: getfield com/finalshell/core/UJ.X I
      // 6f7: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 6fa: aload 1
      // 6fb: aload 8
      // 6fd: putfield com/finalshell/core/UJ.g [B
      // 700: iload 7
      // 702: aload 0
      // 703: getfield com/finalshell/crypto/ConnectHost.il I
      // 706: irem
      // 707: iload 2
      // 708: ifeq 77b
      // 70b: ifeq 779
      // 70e: goto 715
      // 711: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 714: athrow
      // 715: new java/lang/StringBuilder
      // 718: dup
      // 719: invokespecial java/lang/StringBuilder.<init> ()V
      // 71c: sipush -8895
      // 71f: sipush 11924
      // 722: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 725: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 728: iload 7
      // 72a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 72d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 730: astore 8
      // 732: aload 0
      // 733: iload 2
      // 734: ifeq 75e
      // 737: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 73a: bipush 4
      // 73b: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 740: ifeq 75d
      // 743: goto 74a
      // 746: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 749: athrow
      // 74a: aload 0
      // 74b: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 74e: bipush 4
      // 74f: aload 8
      // 751: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 756: goto 75d
      // 759: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75c: athrow
      // 75d: aload 0
      // 75e: aload 1
      // 75f: aload 0
      // 760: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 763: aload 0
      // 764: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 767: bipush 0
      // 768: sipush 10620
      // 76b: ldc2_w 1641328671930824255
      // 76e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 771: aload 0
      // 772: getfield com/finalshell/crypto/ConnectHost.il I
      // 775: isub
      // 776: invokespecial com/finalshell/crypto/ConnectHost.R (Lcom/finalshell/core/UJ;Lcom/finalshell/core/EU;Lcom/finalshell/core/FP;II)V
      // 779: iload 7
      // 77b: ifle 7d5
      // 77e: aload 0
      // 77f: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 782: aload 1
      // 783: getfield com/finalshell/core/UJ.g [B
      // 786: aload 1
      // 787: getfield com/finalshell/core/UJ.X I
      // 78a: iload 7
      // 78c: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 78f: aload 1
      // 790: dup
      // 791: getfield com/finalshell/core/UJ.X I
      // 794: iload 7
      // 796: iadd
      // 797: putfield com/finalshell/core/UJ.X I
      // 79a: aload 0
      // 79b: iload 2
      // 79c: ifeq 7d6
      // 79f: goto 7a6
      // 7a2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a5: athrow
      // 7a6: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 7a9: ifnull 7d5
      // 7ac: goto 7b3
      // 7af: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b2: athrow
      // 7b3: aload 0
      // 7b4: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 7b7: aload 1
      // 7b8: getfield com/finalshell/core/UJ.g [B
      // 7bb: aload 0
      // 7bc: getfield com/finalshell/crypto/ConnectHost.il I
      // 7bf: iload 7
      // 7c1: aload 1
      // 7c2: getfield com/finalshell/core/UJ.g [B
      // 7c5: aload 0
      // 7c6: getfield com/finalshell/crypto/ConnectHost.il I
      // 7c9: invokeinterface com/finalshell/core/EU.X ([BII[BI)V 6
      // 7ce: goto 7d5
      // 7d1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d4: athrow
      // 7d5: aload 0
      // 7d6: iload 2
      // 7d7: ifeq 8a5
      // 7da: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 7dd: ifnull 89a
      // 7e0: goto 7e7
      // 7e3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e6: athrow
      // 7e7: aload 0
      // 7e8: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 7eb: aload 0
      // 7ec: getfield com/finalshell/crypto/ConnectHost.o I
      // 7ef: invokeinterface com/finalshell/core/FP.H (I)V 2
      // 7f4: aload 0
      // 7f5: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 7f8: aload 1
      // 7f9: getfield com/finalshell/core/UJ.g [B
      // 7fc: bipush 0
      // 7fd: aload 1
      // 7fe: getfield com/finalshell/core/UJ.X I
      // 801: invokeinterface com/finalshell/core/FP.o ([BII)V 4
      // 806: aload 0
      // 807: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 80a: aload 0
      // 80b: getfield com/finalshell/crypto/ConnectHost.e [B
      // 80e: bipush 0
      // 80f: invokeinterface com/finalshell/core/FP.U ([BI)V 3
      // 814: aload 0
      // 815: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 818: aload 0
      // 819: getfield com/finalshell/crypto/ConnectHost.F [B
      // 81c: bipush 0
      // 81d: aload 0
      // 81e: getfield com/finalshell/crypto/ConnectHost.F [B
      // 821: arraylength
      // 822: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 825: aload 0
      // 826: iload 2
      // 827: ifeq 8a5
      // 82a: goto 831
      // 82d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 830: athrow
      // 831: getfield com/finalshell/crypto/ConnectHost.e [B
      // 834: aload 0
      // 835: getfield com/finalshell/crypto/ConnectHost.F [B
      // 838: invokestatic com/finalshell/core/E8.Y ([B[B)Z
      // 83b: ifne 89a
      // 83e: goto 845
      // 841: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 844: athrow
      // 845: iload 7
      // 847: aload 0
      // 848: getfield com/finalshell/crypto/ConnectHost.il I
      // 84b: iadd
      // 84c: sipush 10620
      // 84f: ldc2_w 1641328671930824255
      // 852: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 855: if_icmple 874
      // 858: goto 85f
      // 85b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85e: athrow
      // 85f: new java/io/IOException
      // 862: dup
      // 863: sipush -8818
      // 866: sipush 11206
      // 869: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 86c: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 86f: athrow
      // 870: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 873: athrow
      // 874: aload 0
      // 875: aload 1
      // 876: aload 0
      // 877: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 87a: aload 0
      // 87b: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 87e: aload 1
      // 87f: getfield com/finalshell/core/UJ.X I
      // 882: sipush 10620
      // 885: ldc2_w 1641328671930824255
      // 888: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 88b: iload 7
      // 88d: isub
      // 88e: aload 0
      // 88f: getfield com/finalshell/crypto/ConnectHost.il I
      // 892: isub
      // 893: invokespecial com/finalshell/crypto/ConnectHost.R (Lcom/finalshell/core/UJ;Lcom/finalshell/core/EU;Lcom/finalshell/core/FP;II)V
      // 896: iload 2
      // 897: ifne 0e0
      // 89a: aload 0
      // 89b: dup
      // 89c: getfield com/finalshell/crypto/ConnectHost.o I
      // 89f: bipush 1
      // 8a0: iadd
      // 8a1: putfield com/finalshell/crypto/ConnectHost.o I
      // 8a4: aload 0
      // 8a5: getfield com/finalshell/crypto/ConnectHost.iK Lcom/finalshell/core/OD;
      // 8a8: ifnull 940
      // 8ab: aload 1
      // 8ac: getfield com/finalshell/core/UJ.g [B
      // 8af: bipush 4
      // 8b0: baload
      // 8b1: istore 7
      // 8b3: aload 0
      // 8b4: getfield com/finalshell/crypto/ConnectHost.iY [I
      // 8b7: bipush 0
      // 8b8: aload 1
      // 8b9: getfield com/finalshell/core/UJ.X I
      // 8bc: bipush 5
      // 8bd: isub
      // 8be: iload 7
      // 8c0: isub
      // 8c1: iastore
      // 8c2: aload 0
      // 8c3: getfield com/finalshell/crypto/ConnectHost.iK Lcom/finalshell/core/OD;
      // 8c6: aload 1
      // 8c7: getfield com/finalshell/core/UJ.g [B
      // 8ca: bipush 5
      // 8cb: aload 0
      // 8cc: getfield com/finalshell/crypto/ConnectHost.iY [I
      // 8cf: invokeinterface com/finalshell/core/OD.d ([BI[I)[B 4
      // 8d4: astore 8
      // 8d6: iload 2
      // 8d7: ifeq 8ff
      // 8da: aload 8
      // 8dc: ifnull 903
      // 8df: goto 8e6
      // 8e2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e5: athrow
      // 8e6: aload 1
      // 8e7: aload 8
      // 8e9: putfield com/finalshell/core/UJ.g [B
      // 8ec: aload 1
      // 8ed: bipush 5
      // 8ee: aload 0
      // 8ef: getfield com/finalshell/crypto/ConnectHost.iY [I
      // 8f2: bipush 0
      // 8f3: iaload
      // 8f4: iadd
      // 8f5: putfield com/finalshell/core/UJ.X I
      // 8f8: goto 8ff
      // 8fb: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8fe: athrow
      // 8ff: iload 2
      // 900: ifne 940
      // 903: aload 0
      // 904: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 907: bipush 3
      // 908: iload 2
      // 909: ifeq 92e
      // 90c: goto 913
      // 90f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 912: athrow
      // 913: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 918: ifeq e24
      // 91b: goto 922
      // 91e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 921: athrow
      // 922: aload 0
      // 923: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 926: bipush 3
      // 927: goto 92e
      // 92a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92d: athrow
      // 92e: sipush -8824
      // 931: sipush -4884
      // 934: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 937: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 93c: iload 2
      // 93d: ifne e24
      // 940: aload 1
      // 941: invokevirtual com/finalshell/core/UJ.A ()B
      // 944: sipush 7813
      // 947: ldc2_w 2971678928545022450
      // 94a: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 94d: iand
      // 94e: istore 7
      // 950: iload 7
      // 952: bipush 1
      // 953: iload 2
      // 954: ifeq 9c3
      // 957: if_icmpne 9c0
      // 95a: goto 961
      // 95d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 960: athrow
      // 961: aload 1
      // 962: invokevirtual com/finalshell/core/UJ.a ()V
      // 965: aload 1
      // 966: invokevirtual com/finalshell/core/UJ.d ()I
      // 969: pop
      // 96a: aload 1
      // 96b: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 96e: pop
      // 96f: aload 1
      // 970: invokevirtual com/finalshell/core/UJ.d ()I
      // 973: istore 8
      // 975: aload 1
      // 976: invokevirtual com/finalshell/core/UJ.S ()[B
      // 979: astore 9
      // 97b: aload 1
      // 97c: invokevirtual com/finalshell/core/UJ.S ()[B
      // 97f: astore 10
      // 981: new com/finalshell/core/Pc2
      // 984: dup
      // 985: new java/lang/StringBuilder
      // 988: dup
      // 989: invokespecial java/lang/StringBuilder.<init> ()V
      // 98c: sipush -8890
      // 98f: sipush 29573
      // 992: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 995: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 998: iload 8
      // 99a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 99d: ldc_w " "
      // 9a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a3: aload 9
      // 9a5: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 9a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9ab: ldc_w " "
      // 9ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b1: aload 10
      // 9b3: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 9b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9bc: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 9bf: athrow
      // 9c0: iload 7
      // 9c2: bipush 2
      // 9c3: iload 2
      // 9c4: ifeq 9d7
      // 9c7: if_icmpne 9d4
      // 9ca: goto 9d1
      // 9cd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d0: athrow
      // 9d1: goto e19
      // 9d4: iload 7
      // 9d6: bipush 3
      // 9d7: iload 2
      // 9d8: ifeq a4b
      // 9db: if_icmpne a41
      // 9de: goto 9e5
      // 9e1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e4: athrow
      // 9e5: aload 1
      // 9e6: invokevirtual com/finalshell/core/UJ.a ()V
      // 9e9: aload 1
      // 9ea: invokevirtual com/finalshell/core/UJ.d ()I
      // 9ed: pop
      // 9ee: aload 1
      // 9ef: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 9f2: pop
      // 9f3: aload 1
      // 9f4: invokevirtual com/finalshell/core/UJ.d ()I
      // 9f7: istore 8
      // 9f9: aload 0
      // 9fa: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 9fd: bipush 1
      // 9fe: iload 2
      // 9ff: ifeq a1d
      // a02: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // a07: ifeq a3d
      // a0a: goto a11
      // a0d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a10: athrow
      // a11: aload 0
      // a12: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // a15: bipush 1
      // a16: goto a1d
      // a19: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1c: athrow
      // a1d: new java/lang/StringBuilder
      // a20: dup
      // a21: invokespecial java/lang/StringBuilder.<init> ()V
      // a24: sipush -8782
      // a27: sipush 29436
      // a2a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // a2d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a30: iload 8
      // a32: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // a35: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a38: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // a3d: iload 2
      // a3e: ifne e19
      // a41: iload 7
      // a43: bipush 4
      // a44: goto a4b
      // a47: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4a: athrow
      // a4b: iload 2
      // a4c: ifeq a84
      // a4f: if_icmpne a72
      // a52: goto a59
      // a55: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a58: athrow
      // a59: aload 1
      // a5a: invokevirtual com/finalshell/core/UJ.a ()V
      // a5d: aload 1
      // a5e: invokevirtual com/finalshell/core/UJ.d ()I
      // a61: pop
      // a62: aload 1
      // a63: invokevirtual com/finalshell/core/UJ.c$int ()I
      // a66: pop
      // a67: iload 2
      // a68: ifne e19
      // a6b: goto a72
      // a6e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a71: athrow
      // a72: iload 7
      // a74: sipush 1510
      // a77: ldc2_w 8900841291140209281
      // a7a: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // a7d: goto a84
      // a80: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a83: athrow
      // a84: iload 2
      // a85: ifeq adc
      // a88: if_icmpne aca
      // a8b: goto a92
      // a8e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a91: athrow
      // a92: aload 1
      // a93: invokevirtual com/finalshell/core/UJ.a ()V
      // a96: aload 1
      // a97: invokevirtual com/finalshell/core/UJ.d ()I
      // a9a: pop
      // a9b: aload 1
      // a9c: invokevirtual com/finalshell/core/UJ.c$int ()I
      // a9f: pop
      // aa0: aload 1
      // aa1: invokevirtual com/finalshell/core/UJ.d ()I
      // aa4: aload 0
      // aa5: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // aa8: astore 8
      // aaa: aload 8
      // aac: iload 2
      // aad: ifeq abf
      // ab0: ifnonnull abd
      // ab3: goto aba
      // ab6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab9: athrow
      // aba: goto ac6
      // abd: aload 8
      // abf: aload 1
      // ac0: invokevirtual com/finalshell/core/UJ.K ()J
      // ac3: invokevirtual com/finalshell/core/Dm4.p (J)V
      // ac6: iload 2
      // ac7: ifne e19
      // aca: iload 7
      // acc: sipush 3846
      // acf: ldc2_w 3570109181300215875
      // ad2: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // ad5: goto adc
      // ad8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // adb: athrow
      // adc: iload 2
      // add: ifeq da8
      // ae0: if_icmpne d96
      // ae3: goto aea
      // ae6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae9: athrow
      // aea: aload 1
      // aeb: invokevirtual com/finalshell/core/UJ.a ()V
      // aee: aload 1
      // aef: invokevirtual com/finalshell/core/UJ.d ()I
      // af2: pop
      // af3: aload 1
      // af4: invokevirtual com/finalshell/core/UJ.c$int ()I
      // af7: pop
      // af8: bipush 0
      // af9: istore 8
      // afb: aload 0
      // afc: sipush -8897
      // aff: sipush -15022
      // b02: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // b05: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // b08: astore 9
      // b0a: aload 9
      // b0c: sipush -8905
      // b0f: sipush 9495
      // b12: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // b15: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // b18: iload 2
      // b19: ifeq b6a
      // b1c: ifne b5f
      // b1f: goto b26
      // b22: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b25: athrow
      // b26: bipush 1
      // b27: istore 8
      // b29: aload 0
      // b2a: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // b2d: bipush 1
      // b2e: iload 2
      // b2f: ifeq b4d
      // b32: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // b37: ifeq c3c
      // b3a: goto b41
      // b3d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b40: athrow
      // b41: aload 0
      // b42: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // b45: bipush 1
      // b46: goto b4d
      // b49: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b4c: athrow
      // b4d: sipush -8795
      // b50: sipush 28037
      // b53: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // b56: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // b5b: iload 2
      // b5c: ifne c3c
      // b5f: aload 0
      // b60: getfield com/finalshell/crypto/ConnectHost.H Z
      // b63: goto b6a
      // b66: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b69: athrow
      // b6a: iload 2
      // b6b: ifeq bbc
      // b6e: ifeq bb1
      // b71: goto b78
      // b74: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b77: athrow
      // b78: bipush 1
      // b79: istore 8
      // b7b: aload 0
      // b7c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // b7f: bipush 1
      // b80: iload 2
      // b81: ifeq b9f
      // b84: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // b89: ifeq c3c
      // b8c: goto b93
      // b8f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b92: athrow
      // b93: aload 0
      // b94: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // b97: bipush 1
      // b98: goto b9f
      // b9b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b9e: athrow
      // b9f: sipush -8803
      // ba2: sipush 24948
      // ba5: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // ba8: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // bad: iload 2
      // bae: ifne c3c
      // bb1: aload 0
      // bb2: getfield com/finalshell/crypto/ConnectHost.iq Z
      // bb5: goto bbc
      // bb8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bbb: athrow
      // bbc: iload 2
      // bbd: ifeq c1f
      // bc0: ifeq c03
      // bc3: goto bca
      // bc6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc9: athrow
      // bca: bipush 1
      // bcb: istore 8
      // bcd: aload 0
      // bce: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // bd1: bipush 1
      // bd2: iload 2
      // bd3: ifeq bf1
      // bd6: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // bdb: ifeq c3c
      // bde: goto be5
      // be1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // be4: athrow
      // be5: aload 0
      // be6: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // be9: bipush 1
      // bea: goto bf1
      // bed: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bf0: athrow
      // bf1: sipush -8722
      // bf4: sipush -17706
      // bf7: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // bfa: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // bff: iload 2
      // c00: ifne c3c
      // c03: aload 0
      // c04: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // c07: bipush 1
      // c08: iload 2
      // c09: ifeq c2e
      // c0c: goto c13
      // c0f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c12: athrow
      // c13: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // c18: goto c1f
      // c1b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c1e: athrow
      // c1f: ifeq c3c
      // c22: aload 0
      // c23: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // c26: bipush 1
      // c27: goto c2e
      // c2a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c2d: athrow
      // c2e: sipush -8881
      // c31: sipush 1731
      // c34: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // c37: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // c3c: aload 1
      // c3d: invokevirtual com/finalshell/core/UJ.K ()J
      // c40: lstore 10
      // c42: lconst_0
      // c43: lstore 12
      // c45: lload 12
      // c47: lload 10
      // c49: lcmp
      // c4a: ifge d92
      // c4d: aload 1
      // c4e: invokevirtual com/finalshell/core/UJ.S ()[B
      // c51: astore 14
      // c53: aload 1
      // c54: invokevirtual com/finalshell/core/UJ.S ()[B
      // c57: astore 15
      // c59: iload 2
      // c5a: ifeq d8e
      // c5d: iload 8
      // c5f: iload 2
      // c60: ifeq 0e6
      // c63: goto c6a
      // c66: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c69: athrow
      // c6a: ifne d88
      // c6d: aload 14
      // c6f: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // c72: iload 2
      // c73: ifeq c9f
      // c76: goto c7d
      // c79: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c7c: athrow
      // c7d: sipush -8731
      // c80: sipush 11980
      // c83: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // c86: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // c89: ifeq d88
      // c8c: goto c93
      // c8f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c92: athrow
      // c93: aload 15
      // c95: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // c98: goto c9f
      // c9b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9e: athrow
      // c9f: astore 16
      // ca1: aload 0
      // ca2: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // ca5: bipush 1
      // ca6: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // cab: iload 2
      // cac: ifeq cfa
      // caf: ifeq ceb
      // cb2: goto cb9
      // cb5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cb8: athrow
      // cb9: aload 0
      // cba: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // cbd: bipush 1
      // cbe: new java/lang/StringBuilder
      // cc1: dup
      // cc2: invokespecial java/lang/StringBuilder.<init> ()V
      // cc5: sipush -8842
      // cc8: sipush 22969
      // ccb: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // cce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cd1: aload 16
      // cd3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cd6: ldc_w ">"
      // cd9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cdc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // cdf: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // ce4: goto ceb
      // ce7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cea: athrow
      // ceb: aload 0
      // cec: iload 2
      // ced: ifeq d7d
      // cf0: getfield com/finalshell/crypto/ConnectHost.n Z
      // cf3: goto cfa
      // cf6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cf9: athrow
      // cfa: ifeq d7c
      // cfd: aload 16
      // cff: iload 2
      // d00: ifeq d48
      // d03: goto d0a
      // d06: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d09: athrow
      // d0a: invokevirtual java/lang/String.isEmpty ()Z
      // d0d: ifne d38
      // d10: goto d17
      // d13: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d16: athrow
      // d17: new java/lang/StringBuilder
      // d1a: dup
      // d1b: invokespecial java/lang/StringBuilder.<init> ()V
      // d1e: aload 16
      // d20: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d23: sipush -8896
      // d26: sipush 32044
      // d29: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // d2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d2f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d32: astore 16
      // d34: iload 2
      // d35: ifne d4a
      // d38: sipush -8750
      // d3b: sipush 21893
      // d3e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // d41: goto d48
      // d44: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d47: athrow
      // d48: astore 16
      // d4a: aload 0
      // d4b: iload 2
      // d4c: ifeq d7d
      // d4f: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // d52: bipush 1
      // d53: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // d58: ifeq d7c
      // d5b: goto d62
      // d5e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d61: athrow
      // d62: aload 0
      // d63: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // d66: bipush 1
      // d67: sipush -8746
      // d6a: sipush -11381
      // d6d: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // d70: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // d75: goto d7c
      // d78: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d7b: athrow
      // d7c: aload 0
      // d7d: aload 16
      // d7f: ldc_w ","
      // d82: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // d85: putfield com/finalshell/crypto/ConnectHost.id [Ljava/lang/String;
      // d88: lload 12
      // d8a: lconst_1
      // d8b: ladd
      // d8c: lstore 12
      // d8e: iload 2
      // d8f: ifne c45
      // d92: iload 2
      // d93: ifne e19
      // d96: iload 7
      // d98: sipush 6545
      // d9b: ldc2_w 5507461040383100608
      // d9e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // da1: goto da8
      // da4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // da7: athrow
      // da8: if_icmpne e24
      // dab: aload 0
      // dac: bipush 1
      // dad: putfield com/finalshell/crypto/ConnectHost.H Z
      // db0: iload 2
      // db1: ifeq e28
      // db4: goto dbb
      // db7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // dba: athrow
      // dbb: aload 0
      // dbc: getfield com/finalshell/crypto/ConnectHost.iK Lcom/finalshell/core/OD;
      // dbf: ifnonnull e24
      // dc2: goto dc9
      // dc5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // dc8: athrow
      // dc9: aload 0
      // dca: iload 2
      // dcb: ifeq dea
      // dce: goto dd5
      // dd1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // dd4: athrow
      // dd5: getfield com/finalshell/crypto/ConnectHost.v Lcom/finalshell/core/OD;
      // dd8: ifnonnull e24
      // ddb: goto de2
      // dde: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // de1: athrow
      // de2: aload 0
      // de3: goto dea
      // de6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // de9: athrow
      // dea: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // ded: sipush 26688
      // df0: ldc2_w 5499307281655199511
      // df3: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // df6: aaload
      // df7: astore 8
      // df9: aload 0
      // dfa: aload 8
      // dfc: invokespecial com/finalshell/crypto/ConnectHost.V (Ljava/lang/String;)V
      // dff: aload 0
      // e00: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // e03: sipush 30190
      // e06: ldc2_w 7061861579194559164
      // e09: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // e0c: aaload
      // e0d: astore 8
      // e0f: aload 0
      // e10: aload 8
      // e12: invokespecial com/finalshell/crypto/ConnectHost.W$void (Ljava/lang/String;)V
      // e15: iload 2
      // e16: ifne e24
      // e19: iload 2
      // e1a: ifne 0e0
      // e1d: goto e24
      // e20: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e23: athrow
      // e24: aload 1
      // e25: invokevirtual com/finalshell/core/UJ.a ()V
      // e28: aload 1
      // e29: areturn
   }

   public void R(UJ param1, EU param2, FP param3, int param4, int param5) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 6
      // 005: aload 2
      // 006: invokeinterface com/finalshell/core/EU.Y ()Z 1
      // 00b: ifeq 041
      // 00e: aload 3
      // 00f: iload 6
      // 011: ifne 057
      // 014: goto 01b
      // 017: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: ifnull 056
      // 01e: goto 025
      // 021: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 3
      // 026: iload 6
      // 028: ifne 057
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: invokeinterface com/finalshell/core/FP.P ()Z 1
      // 037: ifeq 056
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: new com/finalshell/core/Pc2
      // 044: dup
      // 045: sipush -8756
      // 048: sipush -13270
      // 04b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 04e: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 051: athrow
      // 052: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 3
      // 057: iload 6
      // 059: ifne 078
      // 05c: ifnull 084
      // 05f: goto 066
      // 062: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: aload 3
      // 067: aload 0
      // 068: getfield com/finalshell/crypto/ConnectHost.o I
      // 06b: invokeinterface com/finalshell/core/FP.H (I)V 2
      // 070: aload 3
      // 071: goto 078
      // 074: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 1
      // 079: getfield com/finalshell/core/UJ.g [B
      // 07c: bipush 0
      // 07d: iload 4
      // 07f: invokeinterface com/finalshell/core/FP.o ([BII)V 4
      // 084: aconst_null
      // 085: astore 7
      // 087: iload 5
      // 089: ifle 0f7
      // 08c: aload 1
      // 08d: invokevirtual com/finalshell/core/UJ.m ()V
      // 090: iload 5
      // 092: iload 6
      // 094: ifne 0b2
      // 097: aload 1
      // 098: getfield com/finalshell/core/UJ.g [B
      // 09b: arraylength
      // 09c: if_icmple 0b5
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: getfield com/finalshell/core/UJ.g [B
      // 0aa: arraylength
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: goto 0b7
      // 0b5: iload 5
      // 0b7: istore 8
      // 0b9: aload 0
      // 0ba: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 0bd: aload 1
      // 0be: getfield com/finalshell/core/UJ.g [B
      // 0c1: bipush 0
      // 0c2: iload 8
      // 0c4: invokevirtual com/finalshell/core/Cs4.q ([BII)V
      // 0c7: iload 6
      // 0c9: ifne 0f2
      // 0cc: aload 3
      // 0cd: ifnull 0eb
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 3
      // 0d8: aload 1
      // 0d9: getfield com/finalshell/core/UJ.g [B
      // 0dc: bipush 0
      // 0dd: iload 8
      // 0df: invokeinterface com/finalshell/core/FP.o ([BII)V 4
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: iload 5
      // 0ed: iload 8
      // 0ef: isub
      // 0f0: istore 5
      // 0f2: iload 6
      // 0f4: ifeq 087
      // 0f7: goto 14a
      // 0fa: astore 8
      // 0fc: aload 8
      // 0fe: astore 7
      // 100: aload 0
      // 101: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 104: bipush 3
      // 105: iload 6
      // 107: ifne 125
      // 10a: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 10f: ifeq 14a
      // 112: goto 119
      // 115: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: aload 0
      // 11a: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 11d: bipush 3
      // 11e: goto 125
      // 121: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: new java/lang/StringBuilder
      // 128: dup
      // 129: invokespecial java/lang/StringBuilder.<init> ()V
      // 12c: sipush -8879
      // 12f: sipush 5354
      // 132: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: aload 8
      // 13a: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 143: aload 8
      // 145: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 14a: aload 3
      // 14b: iload 6
      // 14d: ifne 15b
      // 150: ifnull 165
      // 153: goto 15a
      // 156: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: aload 3
      // 15b: aload 1
      // 15c: getfield com/finalshell/core/UJ.g [B
      // 15f: bipush 0
      // 160: invokeinterface com/finalshell/core/FP.U ([BI)V 3
      // 165: new com/finalshell/core/Pc2
      // 168: dup
      // 169: sipush -8756
      // 16c: sipush -13270
      // 16f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 172: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 175: astore 8
      // 177: aload 7
      // 179: ifnull 18a
      // 17c: aload 8
      // 17e: aload 7
      // 180: invokevirtual com/finalshell/core/Pc2.addSuppressed (Ljava/lang/Throwable;)V
      // 183: goto 18a
      // 186: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: aload 8
      // 18c: athrow
   }

   public byte[] I() {
      return this.m;
   }

   public void b(UJ var1, Cv2 var2) throws Exception {
      this.I(var2);
      this.iq = false;
   }

   public void I(Cv2 param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual com/finalshell/core/Cv2.k ()[B
      // 004: astore 3
      // 005: aload 1
      // 006: invokevirtual com/finalshell/core/Cv2.V ()[B
      // 009: astore 4
      // 00b: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 00e: aload 1
      // 00f: invokevirtual com/finalshell/core/Cv2.i ()Lcom/finalshell/core/Y_2;
      // 012: astore 5
      // 014: istore 2
      // 015: aload 0
      // 016: iload 2
      // 017: ifeq 09a
      // 01a: getfield com/finalshell/crypto/ConnectHost.m [B
      // 01d: ifnonnull 045
      // 020: goto 027
      // 023: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: aload 0
      // 028: aload 4
      // 02a: arraylength
      // 02b: newarray 8
      // 02d: putfield com/finalshell/crypto/ConnectHost.m [B
      // 030: aload 4
      // 032: bipush 0
      // 033: aload 0
      // 034: getfield com/finalshell/crypto/ConnectHost.m [B
      // 037: bipush 0
      // 038: aload 4
      // 03a: arraylength
      // 03b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 03e: goto 045
      // 041: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: aload 0
      // 046: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 049: invokevirtual com/finalshell/core/UJ.m ()V
      // 04c: aload 0
      // 04d: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 050: aload 3
      // 051: invokevirtual com/finalshell/core/UJ.x ([B)V
      // 054: aload 0
      // 055: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 058: aload 4
      // 05a: invokevirtual com/finalshell/core/UJ.e ([B)V
      // 05d: aload 0
      // 05e: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 061: sipush 6145
      // 064: ldc2_w 7902319830484387677
      // 067: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 06a: invokevirtual com/finalshell/core/UJ.V (B)V
      // 06d: aload 0
      // 06e: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 071: aload 0
      // 072: getfield com/finalshell/crypto/ConnectHost.m [B
      // 075: invokevirtual com/finalshell/core/UJ.e ([B)V
      // 078: aload 5
      // 07a: aload 0
      // 07b: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 07e: getfield com/finalshell/core/UJ.g [B
      // 081: bipush 0
      // 082: aload 0
      // 083: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 086: getfield com/finalshell/core/UJ.X I
      // 089: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 08e: aload 0
      // 08f: aload 5
      // 091: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 096: putfield com/finalshell/crypto/ConnectHost.iE [B
      // 099: aload 0
      // 09a: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 09d: getfield com/finalshell/core/UJ.X I
      // 0a0: aload 0
      // 0a1: getfield com/finalshell/crypto/ConnectHost.m [B
      // 0a4: arraylength
      // 0a5: isub
      // 0a6: bipush 1
      // 0a7: isub
      // 0a8: istore 6
      // 0aa: aload 0
      // 0ab: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0ae: getfield com/finalshell/core/UJ.g [B
      // 0b1: iload 6
      // 0b3: dup2
      // 0b4: baload
      // 0b5: bipush 1
      // 0b6: iadd
      // 0b7: i2b
      // 0b8: bastore
      // 0b9: aload 5
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0bf: getfield com/finalshell/core/UJ.g [B
      // 0c2: bipush 0
      // 0c3: aload 0
      // 0c4: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0c7: getfield com/finalshell/core/UJ.X I
      // 0ca: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 0cf: aload 0
      // 0d0: aload 5
      // 0d2: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 0d7: putfield com/finalshell/crypto/ConnectHost.Q [B
      // 0da: aload 0
      // 0db: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0de: getfield com/finalshell/core/UJ.g [B
      // 0e1: iload 6
      // 0e3: dup2
      // 0e4: baload
      // 0e5: bipush 1
      // 0e6: iadd
      // 0e7: i2b
      // 0e8: bastore
      // 0e9: aload 5
      // 0eb: aload 0
      // 0ec: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0ef: getfield com/finalshell/core/UJ.g [B
      // 0f2: bipush 0
      // 0f3: aload 0
      // 0f4: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 0f7: getfield com/finalshell/core/UJ.X I
      // 0fa: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 0ff: aload 0
      // 100: aload 5
      // 102: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 107: putfield com/finalshell/crypto/ConnectHost.i8 [B
      // 10a: aload 0
      // 10b: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 10e: getfield com/finalshell/core/UJ.g [B
      // 111: iload 6
      // 113: dup2
      // 114: baload
      // 115: bipush 1
      // 116: iadd
      // 117: i2b
      // 118: bastore
      // 119: aload 5
      // 11b: aload 0
      // 11c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 11f: getfield com/finalshell/core/UJ.g [B
      // 122: bipush 0
      // 123: aload 0
      // 124: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 127: getfield com/finalshell/core/UJ.X I
      // 12a: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 12f: aload 0
      // 130: aload 5
      // 132: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 137: putfield com/finalshell/crypto/ConnectHost.j [B
      // 13a: aload 0
      // 13b: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 13e: getfield com/finalshell/core/UJ.g [B
      // 141: iload 6
      // 143: dup2
      // 144: baload
      // 145: bipush 1
      // 146: iadd
      // 147: i2b
      // 148: bastore
      // 149: aload 5
      // 14b: aload 0
      // 14c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 14f: getfield com/finalshell/core/UJ.g [B
      // 152: bipush 0
      // 153: aload 0
      // 154: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 157: getfield com/finalshell/core/UJ.X I
      // 15a: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 15f: aload 0
      // 160: aload 5
      // 162: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 167: putfield com/finalshell/crypto/ConnectHost.B [B
      // 16a: aload 0
      // 16b: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 16e: getfield com/finalshell/core/UJ.g [B
      // 171: iload 6
      // 173: dup2
      // 174: baload
      // 175: bipush 1
      // 176: iadd
      // 177: i2b
      // 178: bastore
      // 179: aload 5
      // 17b: aload 0
      // 17c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 17f: getfield com/finalshell/core/UJ.g [B
      // 182: bipush 0
      // 183: aload 0
      // 184: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 187: getfield com/finalshell/core/UJ.X I
      // 18a: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 18f: aload 0
      // 190: aload 5
      // 192: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 197: putfield com/finalshell/crypto/ConnectHost.s [B
      // 19a: aload 0
      // 19b: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 19e: bipush 3
      // 19f: aaload
      // 1a0: astore 9
      // 1a2: aload 0
      // 1a3: aload 9
      // 1a5: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 1a8: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 1ab: ldc_w com/finalshell/core/EU
      // 1ae: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 1b1: astore 7
      // 1b3: aload 0
      // 1b4: aload 7
      // 1b6: bipush 0
      // 1b7: anewarray 607
      // 1ba: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 1bd: bipush 0
      // 1be: anewarray 4
      // 1c1: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 1c4: checkcast com/finalshell/core/EU
      // 1c7: putfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 1ca: aload 0
      // 1cb: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 1ce: invokeinterface com/finalshell/core/EU.u ()I 1
      // 1d3: aload 0
      // 1d4: getfield com/finalshell/crypto/ConnectHost.j [B
      // 1d7: arraylength
      // 1d8: if_icmple 25f
      // 1db: aload 0
      // 1dc: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 1df: invokevirtual com/finalshell/core/UJ.m ()V
      // 1e2: aload 0
      // 1e3: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 1e6: aload 3
      // 1e7: invokevirtual com/finalshell/core/UJ.x ([B)V
      // 1ea: aload 0
      // 1eb: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 1ee: aload 4
      // 1f0: invokevirtual com/finalshell/core/UJ.e ([B)V
      // 1f3: aload 0
      // 1f4: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 1f7: aload 0
      // 1f8: getfield com/finalshell/crypto/ConnectHost.j [B
      // 1fb: invokevirtual com/finalshell/core/UJ.e ([B)V
      // 1fe: aload 5
      // 200: aload 0
      // 201: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 204: getfield com/finalshell/core/UJ.g [B
      // 207: bipush 0
      // 208: aload 0
      // 209: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 20c: getfield com/finalshell/core/UJ.X I
      // 20f: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 214: aload 5
      // 216: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 21b: astore 10
      // 21d: aload 0
      // 21e: getfield com/finalshell/crypto/ConnectHost.j [B
      // 221: arraylength
      // 222: aload 10
      // 224: arraylength
      // 225: iadd
      // 226: newarray 8
      // 228: astore 11
      // 22a: aload 0
      // 22b: getfield com/finalshell/crypto/ConnectHost.j [B
      // 22e: bipush 0
      // 22f: aload 11
      // 231: bipush 0
      // 232: aload 0
      // 233: getfield com/finalshell/crypto/ConnectHost.j [B
      // 236: arraylength
      // 237: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 23a: aload 10
      // 23c: bipush 0
      // 23d: aload 11
      // 23f: aload 0
      // 240: getfield com/finalshell/crypto/ConnectHost.j [B
      // 243: arraylength
      // 244: aload 10
      // 246: arraylength
      // 247: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 24a: aload 0
      // 24b: aload 11
      // 24d: putfield com/finalshell/crypto/ConnectHost.j [B
      // 250: iload 2
      // 251: ifeq 27e
      // 254: iload 2
      // 255: ifne 1ca
      // 258: goto 25f
      // 25b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25e: athrow
      // 25f: aload 0
      // 260: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 263: bipush 1
      // 264: aload 0
      // 265: getfield com/finalshell/crypto/ConnectHost.j [B
      // 268: aload 0
      // 269: getfield com/finalshell/crypto/ConnectHost.Q [B
      // 26c: invokeinterface com/finalshell/core/EU.z (I[B[B)V 4
      // 271: aload 0
      // 272: aload 0
      // 273: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 276: invokeinterface com/finalshell/core/EU.w ()I 1
      // 27b: putfield com/finalshell/crypto/ConnectHost.il I
      // 27e: aload 0
      // 27f: iload 2
      // 280: ifeq 328
      // 283: getfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 286: invokeinterface com/finalshell/core/EU.S ()Z 1
      // 28b: ifne 30e
      // 28e: goto 295
      // 291: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: aload 0
      // 296: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 299: bipush 5
      // 29a: aaload
      // 29b: astore 9
      // 29d: aload 0
      // 29e: aload 9
      // 2a0: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 2a3: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 2a6: ldc_w com/finalshell/core/FP
      // 2a9: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 2ac: astore 8
      // 2ae: aload 0
      // 2af: aload 8
      // 2b1: bipush 0
      // 2b2: anewarray 607
      // 2b5: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 2b8: bipush 0
      // 2b9: anewarray 4
      // 2bc: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 2bf: checkcast com/finalshell/core/FP
      // 2c2: putfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 2c5: aload 0
      // 2c6: aload 0
      // 2c7: aload 0
      // 2c8: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 2cb: aload 3
      // 2cc: aload 4
      // 2ce: aload 0
      // 2cf: getfield com/finalshell/crypto/ConnectHost.s [B
      // 2d2: aload 5
      // 2d4: aload 0
      // 2d5: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 2d8: invokeinterface com/finalshell/core/FP.h ()I 1
      // 2dd: invokespecial com/finalshell/crypto/ConnectHost.G (Lcom/finalshell/core/UJ;[B[B[BLcom/finalshell/core/Y_2;I)[B
      // 2e0: putfield com/finalshell/crypto/ConnectHost.s [B
      // 2e3: aload 0
      // 2e4: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 2e7: aload 0
      // 2e8: getfield com/finalshell/crypto/ConnectHost.s [B
      // 2eb: invokeinterface com/finalshell/core/FP.L ([B)V 2
      // 2f0: aload 0
      // 2f1: aload 0
      // 2f2: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 2f5: invokeinterface com/finalshell/core/FP.h ()I 1
      // 2fa: newarray 8
      // 2fc: putfield com/finalshell/crypto/ConnectHost.e [B
      // 2ff: aload 0
      // 300: aload 0
      // 301: getfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 304: invokeinterface com/finalshell/core/FP.h ()I 1
      // 309: newarray 8
      // 30b: putfield com/finalshell/crypto/ConnectHost.F [B
      // 30e: aload 0
      // 30f: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 312: bipush 2
      // 313: aaload
      // 314: astore 9
      // 316: aload 0
      // 317: aload 9
      // 319: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 31c: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 31f: ldc_w com/finalshell/core/EU
      // 322: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 325: astore 7
      // 327: aload 0
      // 328: aload 7
      // 32a: bipush 0
      // 32b: anewarray 607
      // 32e: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 331: bipush 0
      // 332: anewarray 4
      // 335: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 338: checkcast com/finalshell/core/EU
      // 33b: putfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 33e: aload 0
      // 33f: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 342: invokeinterface com/finalshell/core/EU.u ()I 1
      // 347: aload 0
      // 348: getfield com/finalshell/crypto/ConnectHost.i8 [B
      // 34b: arraylength
      // 34c: if_icmple 3d3
      // 34f: aload 0
      // 350: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 353: invokevirtual com/finalshell/core/UJ.m ()V
      // 356: aload 0
      // 357: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 35a: aload 3
      // 35b: invokevirtual com/finalshell/core/UJ.x ([B)V
      // 35e: aload 0
      // 35f: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 362: aload 4
      // 364: invokevirtual com/finalshell/core/UJ.e ([B)V
      // 367: aload 0
      // 368: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 36b: aload 0
      // 36c: getfield com/finalshell/crypto/ConnectHost.i8 [B
      // 36f: invokevirtual com/finalshell/core/UJ.e ([B)V
      // 372: aload 5
      // 374: aload 0
      // 375: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 378: getfield com/finalshell/core/UJ.g [B
      // 37b: bipush 0
      // 37c: aload 0
      // 37d: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 380: getfield com/finalshell/core/UJ.X I
      // 383: invokeinterface com/finalshell/core/Y_2.p ([BII)V 4
      // 388: aload 5
      // 38a: invokeinterface com/finalshell/core/Y_2.O ()[B 1
      // 38f: astore 10
      // 391: aload 0
      // 392: getfield com/finalshell/crypto/ConnectHost.i8 [B
      // 395: arraylength
      // 396: aload 10
      // 398: arraylength
      // 399: iadd
      // 39a: newarray 8
      // 39c: astore 11
      // 39e: aload 0
      // 39f: getfield com/finalshell/crypto/ConnectHost.i8 [B
      // 3a2: bipush 0
      // 3a3: aload 11
      // 3a5: bipush 0
      // 3a6: aload 0
      // 3a7: getfield com/finalshell/crypto/ConnectHost.i8 [B
      // 3aa: arraylength
      // 3ab: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3ae: aload 10
      // 3b0: bipush 0
      // 3b1: aload 11
      // 3b3: aload 0
      // 3b4: getfield com/finalshell/crypto/ConnectHost.i8 [B
      // 3b7: arraylength
      // 3b8: aload 10
      // 3ba: arraylength
      // 3bb: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 3be: aload 0
      // 3bf: aload 11
      // 3c1: putfield com/finalshell/crypto/ConnectHost.i8 [B
      // 3c4: iload 2
      // 3c5: ifeq 3f2
      // 3c8: iload 2
      // 3c9: ifne 33e
      // 3cc: goto 3d3
      // 3cf: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d2: athrow
      // 3d3: aload 0
      // 3d4: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 3d7: bipush 0
      // 3d8: aload 0
      // 3d9: getfield com/finalshell/crypto/ConnectHost.i8 [B
      // 3dc: aload 0
      // 3dd: getfield com/finalshell/crypto/ConnectHost.iE [B
      // 3e0: invokeinterface com/finalshell/core/EU.z (I[B[B)V 4
      // 3e5: aload 0
      // 3e6: aload 0
      // 3e7: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 3ea: invokeinterface com/finalshell/core/EU.w ()I 1
      // 3ef: putfield com/finalshell/crypto/ConnectHost.A I
      // 3f2: aload 0
      // 3f3: iload 2
      // 3f4: ifeq 48b
      // 3f7: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 3fa: invokeinterface com/finalshell/core/EU.S ()Z 1
      // 3ff: ifne 464
      // 402: goto 409
      // 405: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 408: athrow
      // 409: aload 0
      // 40a: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 40d: bipush 4
      // 40e: aaload
      // 40f: astore 9
      // 411: aload 0
      // 412: aload 9
      // 414: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 417: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 41a: ldc_w com/finalshell/core/FP
      // 41d: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 420: astore 8
      // 422: aload 0
      // 423: aload 8
      // 425: bipush 0
      // 426: anewarray 607
      // 429: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 42c: bipush 0
      // 42d: anewarray 4
      // 430: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 433: checkcast com/finalshell/core/FP
      // 436: putfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 439: aload 0
      // 43a: aload 0
      // 43b: aload 0
      // 43c: getfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 43f: aload 3
      // 440: aload 4
      // 442: aload 0
      // 443: getfield com/finalshell/crypto/ConnectHost.B [B
      // 446: aload 5
      // 448: aload 0
      // 449: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 44c: invokeinterface com/finalshell/core/FP.h ()I 1
      // 451: invokespecial com/finalshell/crypto/ConnectHost.G (Lcom/finalshell/core/UJ;[B[B[BLcom/finalshell/core/Y_2;I)[B
      // 454: putfield com/finalshell/crypto/ConnectHost.B [B
      // 457: aload 0
      // 458: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 45b: aload 0
      // 45c: getfield com/finalshell/crypto/ConnectHost.B [B
      // 45f: invokeinterface com/finalshell/core/FP.L ([B)V 2
      // 464: aload 0
      // 465: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 468: sipush 26688
      // 46b: ldc2_w 5499307281655199511
      // 46e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 471: aaload
      // 472: astore 9
      // 474: aload 0
      // 475: aload 9
      // 477: invokespecial com/finalshell/crypto/ConnectHost.V (Ljava/lang/String;)V
      // 47a: aload 0
      // 47b: getfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 47e: sipush 30190
      // 481: ldc2_w 7061861579194559164
      // 484: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 487: aaload
      // 488: astore 9
      // 48a: aload 0
      // 48b: aload 9
      // 48d: invokespecial com/finalshell/crypto/ConnectHost.W$void (Ljava/lang/String;)V
      // 490: goto 4c1
      // 493: astore 7
      // 495: aload 7
      // 497: iload 2
      // 498: ifeq 4b1
      // 49b: instanceof com/finalshell/core/Pc2
      // 49e: ifeq 4b2
      // 4a1: goto 4a8
      // 4a4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a7: athrow
      // 4a8: aload 7
      // 4aa: goto 4b1
      // 4ad: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b0: athrow
      // 4b1: athrow
      // 4b2: new com/finalshell/core/Pc2
      // 4b5: dup
      // 4b6: aload 7
      // 4b8: invokevirtual java/lang/Throwable.toString ()Ljava/lang/String;
      // 4bb: aload 7
      // 4bd: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 4c0: athrow
      // 4c1: return
   }

   public byte[] G(UJ var1, byte[] var2, byte[] var3, byte[] var4, Y_2 var5, int var6) throws Exception {
      byte[] var11;
      byte[] var8 = var4;
      boolean var10000 = Dm4.J$boolean();
      int var9 = var5.e();
      boolean var7 = var10000;

      while (true) {
         if (var8.length < var6) {
            var1.m();
            var1.x(var2);
            var1.e(var3);
            var1.e(var8);
            var5.p(var1.g, 0, var1.X);
            byte[] var10 = new byte[var8.length + var9];
            System.arraycopy(var8, 0, var10, 0, var8.length);
            System.arraycopy(var5.O(), 0, var10, var8.length, var9);
            E8.Q(var8);
            var11 = var10;
            if (var7) {
               break;
            }

            var8 = var10;
            if (!var7) {
               continue;
            }
         }

         var11 = var8;
         break;
      }

      return var11;
   }

   public void O(YU param1, Dm4 param2, int param3) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: invokevirtual com/finalshell/crypto/ConnectHost.y ()I
      // 007: i2l
      // 008: lstore 5
      // 00a: istore 4
      // 00c: aload 0
      // 00d: getfield com/finalshell/crypto/ConnectHost.iq Z
      // 010: ifeq 077
      // 013: lload 5
      // 015: iload 4
      // 017: ifne 06a
      // 01a: lconst_0
      // 01b: lcmp
      // 01c: iload 4
      // 01e: ifne 010
      // 021: goto 028
      // 024: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: ifle 061
      // 02b: invokestatic java/lang/System.currentTimeMillis ()J
      // 02e: aload 0
      // 02f: getfield com/finalshell/crypto/ConnectHost.R J
      // 032: lsub
      // 033: iload 4
      // 035: ifne 06a
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: lload 5
      // 041: lcmp
      // 042: ifle 061
      // 045: goto 04c
      // 048: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: new com/finalshell/core/Pc2
      // 04f: dup
      // 050: sipush -8951
      // 053: sipush 406
      // 056: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 059: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 05c: athrow
      // 05d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: sipush 2723
      // 064: ldc2_w 2196937536798769670
      // 067: invokestatic com/finalshell/crypto/ConnectHost.b (IJ)J
      // 06a: invokestatic java/lang/Thread.sleep (J)V
      // 06d: goto 00c
      // 070: astore 7
      // 072: iload 4
      // 074: ifeq 00c
      // 077: aload 2
      // 078: dup
      // 079: astore 7
      // 07b: monitorenter
      // 07c: aload 2
      // 07d: getfield com/finalshell/core/Dm4.z J
      // 080: iload 3
      // 081: i2l
      // 082: lcmp
      // 083: iload 4
      // 085: ifne 0d1
      // 088: ifge 0cd
      // 08b: aload 2
      // 08c: dup
      // 08d: getfield com/finalshell/core/Dm4.r I
      // 090: bipush 1
      // 091: iadd
      // 092: putfield com/finalshell/core/Dm4.r I
      // 095: aload 2
      // 096: sipush 17923
      // 099: ldc2_w 2804926042009734823
      // 09c: invokestatic com/finalshell/crypto/ConnectHost.b (IJ)J
      // 09f: invokevirtual java/lang/Object.wait (J)V
      // 0a2: aload 2
      // 0a3: dup
      // 0a4: getfield com/finalshell/core/Dm4.r I
      // 0a7: bipush 1
      // 0a8: isub
      // 0a9: putfield com/finalshell/core/Dm4.r I
      // 0ac: goto 0cd
      // 0af: astore 8
      // 0b1: aload 2
      // 0b2: dup
      // 0b3: getfield com/finalshell/core/Dm4.r I
      // 0b6: bipush 1
      // 0b7: isub
      // 0b8: putfield com/finalshell/core/Dm4.r I
      // 0bb: goto 0cd
      // 0be: astore 9
      // 0c0: aload 2
      // 0c1: dup
      // 0c2: getfield com/finalshell/core/Dm4.r I
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: putfield com/finalshell/core/Dm4.r I
      // 0ca: aload 9
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: getfield com/finalshell/crypto/ConnectHost.iq Z
      // 0d1: iload 4
      // 0d3: ifne 0fb
      // 0d6: ifeq 0e8
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: aload 7
      // 0e2: monitorexit
      // 0e3: iload 4
      // 0e5: ifeq 00c
      // 0e8: aload 2
      // 0e9: iload 4
      // 0eb: ifne 113
      // 0ee: getfield com/finalshell/core/Dm4.z J
      // 0f1: iload 3
      // 0f2: i2l
      // 0f3: lcmp
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: iflt 111
      // 0fe: aload 2
      // 0ff: dup
      // 100: getfield com/finalshell/core/Dm4.z J
      // 103: iload 3
      // 104: i2l
      // 105: lsub
      // 106: putfield com/finalshell/core/Dm4.z J
      // 109: aload 7
      // 10b: monitorexit
      // 10c: iload 4
      // 10e: ifeq 2d1
      // 111: aload 7
      // 113: monitorexit
      // 114: goto 11f
      // 117: astore 10
      // 119: aload 7
      // 11b: monitorexit
      // 11c: aload 10
      // 11e: athrow
      // 11f: aload 2
      // 120: getfield com/finalshell/core/Dm4.S Z
      // 123: iload 4
      // 125: ifne 13d
      // 128: ifne 14c
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: aload 2
      // 133: invokevirtual com/finalshell/core/Dm4.L ()Z
      // 136: goto 13d
      // 139: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: iload 4
      // 13f: ifne 162
      // 142: ifne 161
      // 145: goto 14c
      // 148: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: new java/io/IOException
      // 14f: dup
      // 150: sipush -8914
      // 153: sipush 16894
      // 156: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 159: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 15c: athrow
      // 15d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 160: athrow
      // 161: bipush 0
      // 162: istore 7
      // 164: bipush 0
      // 165: istore 8
      // 167: bipush 0
      // 168: istore 9
      // 16a: bipush -1
      // 16b: istore 10
      // 16d: aload 2
      // 16e: dup
      // 16f: astore 11
      // 171: monitorenter
      // 172: aload 2
      // 173: iload 4
      // 175: ifne 238
      // 178: getfield com/finalshell/core/Dm4.z J
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: ifle 236
      // 180: aload 2
      // 181: getfield com/finalshell/core/Dm4.z J
      // 184: lstore 12
      // 186: lload 12
      // 188: iload 3
      // 189: i2l
      // 18a: lcmp
      // 18b: iload 4
      // 18d: ifne 1a3
      // 190: ifle 19e
      // 193: goto 19a
      // 196: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: iload 3
      // 19b: i2l
      // 19c: lstore 12
      // 19e: lload 12
      // 1a0: iload 3
      // 1a1: i2l
      // 1a2: lcmp
      // 1a3: iload 4
      // 1a5: ifne 234
      // 1a8: ifeq 213
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b1: athrow
      // 1b2: aload 1
      // 1b3: lload 12
      // 1b5: l2i
      // 1b6: aload 0
      // 1b7: iload 4
      // 1b9: ifne 1d8
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 1c6: ifnull 1de
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: getfield com/finalshell/crypto/ConnectHost.A I
      // 1db: goto 1e7
      // 1de: sipush 14893
      // 1e1: ldc2_w 391773278829520207
      // 1e4: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 1e7: aload 0
      // 1e8: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 1eb: iload 4
      // 1ed: ifne 205
      // 1f0: ifnull 20d
      // 1f3: goto 1fa
      // 1f6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 1fe: goto 205
      // 201: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 204: athrow
      // 205: invokeinterface com/finalshell/core/FP.h ()I 1
      // 20a: goto 20e
      // 20d: bipush 0
      // 20e: invokevirtual com/finalshell/core/YU.h (III)I
      // 211: istore 8
      // 213: aload 1
      // 214: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 217: invokevirtual com/finalshell/core/UJ.A ()B
      // 21a: istore 9
      // 21c: aload 2
      // 21d: invokevirtual com/finalshell/core/Dm4.J$int ()I
      // 220: istore 10
      // 222: iload 3
      // 223: lload 12
      // 225: l2i
      // 226: isub
      // 227: istore 3
      // 228: aload 2
      // 229: dup
      // 22a: getfield com/finalshell/core/Dm4.z J
      // 22d: lload 12
      // 22f: lsub
      // 230: putfield com/finalshell/core/Dm4.z J
      // 233: bipush 1
      // 234: istore 7
      // 236: aload 11
      // 238: monitorexit
      // 239: goto 244
      // 23c: astore 14
      // 23e: aload 11
      // 240: monitorexit
      // 241: aload 14
      // 243: athrow
      // 244: iload 7
      // 246: iload 4
      // 248: ifne 27e
      // 24b: ifeq 275
      // 24e: goto 255
      // 251: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 254: athrow
      // 255: aload 0
      // 256: aload 1
      // 257: invokespecial com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;)V
      // 25a: iload 3
      // 25b: ifne 26a
      // 25e: goto 265
      // 261: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 264: athrow
      // 265: return
      // 266: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: aload 1
      // 26b: iload 9
      // 26d: iload 10
      // 26f: iload 8
      // 271: iload 3
      // 272: invokevirtual com/finalshell/core/YU.u (BIII)V
      // 275: aload 2
      // 276: dup
      // 277: astore 11
      // 279: monitorenter
      // 27a: aload 0
      // 27b: getfield com/finalshell/crypto/ConnectHost.iq Z
      // 27e: iload 4
      // 280: ifne 2a8
      // 283: ifeq 295
      // 286: goto 28d
      // 289: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28c: athrow
      // 28d: aload 11
      // 28f: monitorexit
      // 290: iload 4
      // 292: ifeq 00c
      // 295: aload 2
      // 296: iload 4
      // 298: ifne 2c0
      // 29b: getfield com/finalshell/core/Dm4.z J
      // 29e: iload 3
      // 29f: i2l
      // 2a0: lcmp
      // 2a1: goto 2a8
      // 2a4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: iflt 2be
      // 2ab: aload 2
      // 2ac: dup
      // 2ad: getfield com/finalshell/core/Dm4.z J
      // 2b0: iload 3
      // 2b1: i2l
      // 2b2: lsub
      // 2b3: putfield com/finalshell/core/Dm4.z J
      // 2b6: aload 11
      // 2b8: monitorexit
      // 2b9: iload 4
      // 2bb: ifeq 2d1
      // 2be: aload 11
      // 2c0: monitorexit
      // 2c1: goto 2cc
      // 2c4: astore 15
      // 2c6: aload 11
      // 2c8: monitorexit
      // 2c9: aload 15
      // 2cb: athrow
      // 2cc: iload 4
      // 2ce: ifeq 00c
      // 2d1: aload 0
      // 2d2: aload 1
      // 2d3: invokespecial com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;)V
      // 2d6: return
   }

   public void D(YU param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: invokevirtual com/finalshell/crypto/ConnectHost.y ()I
      // 007: i2l
      // 008: lstore 3
      // 009: istore 2
      // 00a: aload 0
      // 00b: getfield com/finalshell/crypto/ConnectHost.iq Z
      // 00e: ifeq 1ad
      // 011: iload 2
      // 012: ifne 1b2
      // 015: lload 3
      // 016: lconst_0
      // 017: lcmp
      // 018: iload 2
      // 019: ifne 081
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: ifle 07a
      // 026: goto 02d
      // 029: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: invokestatic java/lang/System.currentTimeMillis ()J
      // 030: aload 0
      // 031: getfield com/finalshell/crypto/ConnectHost.R J
      // 034: lsub
      // 035: lload 3
      // 036: lcmp
      // 037: iload 2
      // 038: ifne 081
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: ifle 07a
      // 045: goto 04c
      // 048: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield com/finalshell/crypto/ConnectHost.W Z
      // 050: iload 2
      // 051: ifne 081
      // 054: goto 05b
      // 057: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: ifne 07a
      // 05e: goto 065
      // 061: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: new com/finalshell/core/Pc2
      // 068: dup
      // 069: sipush -8942
      // 06c: sipush -32542
      // 06f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 072: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 075: athrow
      // 076: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079: athrow
      // 07a: aload 1
      // 07b: getfield com/finalshell/core/YU.P Lcom/finalshell/core/UJ;
      // 07e: invokevirtual com/finalshell/core/UJ.A ()B
      // 081: istore 5
      // 083: iload 2
      // 084: ifne 1b2
      // 087: iload 5
      // 089: sipush 31615
      // 08c: ldc2_w 2055688399987500068
      // 08f: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 092: if_icmpeq 1ad
      // 095: goto 09c
      // 098: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: iload 5
      // 09e: sipush 6053
      // 0a1: ldc2_w 7492126091408574665
      // 0a4: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0a7: iload 2
      // 0a8: ifne 0ce
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: if_icmpeq 1ad
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: iload 5
      // 0be: sipush 11939
      // 0c1: ldc2_w 8628520805854687720
      // 0c4: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: iload 2
      // 0cf: ifne 0ee
      // 0d2: if_icmpeq 1ad
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: iload 5
      // 0de: sipush 10275
      // 0e1: ldc2_w 8745688584460056405
      // 0e4: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: iload 2
      // 0ef: ifne 10e
      // 0f2: if_icmpeq 1ad
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: iload 5
      // 0fe: sipush 24330
      // 101: ldc2_w 6536508133514625108
      // 104: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: iload 2
      // 10f: ifne 12e
      // 112: if_icmpeq 1ad
      // 115: goto 11c
      // 118: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: iload 5
      // 11e: sipush 7451
      // 121: ldc2_w 2374819893374747242
      // 124: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: iload 2
      // 12f: ifne 14e
      // 132: if_icmpeq 1ad
      // 135: goto 13c
      // 138: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: iload 5
      // 13e: sipush 7625
      // 141: ldc2_w 7542909318134137506
      // 144: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: iload 2
      // 14f: ifne 16e
      // 152: if_icmpeq 1ad
      // 155: goto 15c
      // 158: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: iload 5
      // 15e: sipush 5126
      // 161: ldc2_w 7515344756858751867
      // 164: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: iload 2
      // 16f: ifne 186
      // 172: if_icmpeq 1ad
      // 175: goto 17c
      // 178: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: iload 5
      // 17e: bipush 1
      // 17f: goto 186
      // 182: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 185: athrow
      // 186: if_icmpne 194
      // 189: iload 2
      // 18a: ifeq 1ad
      // 18d: goto 194
      // 190: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: sipush 7441
      // 197: ldc2_w 3369535546098701744
      // 19a: invokestatic com/finalshell/crypto/ConnectHost.b (IJ)J
      // 19d: invokestatic java/lang/Thread.sleep (J)V
      // 1a0: goto 1a9
      // 1a3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: astore 6
      // 1a9: iload 2
      // 1aa: ifeq 00a
      // 1ad: aload 0
      // 1ae: aload 1
      // 1af: invokespecial com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;)V
      // 1b2: return
   }

   public void O(YU param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/crypto/ConnectHost.S Ljava/lang/Object;
      // 07: dup
      // 08: astore 3
      // 09: monitorenter
      // 0a: istore 2
      // 0b: aload 0
      // 0c: aload 1
      // 0d: invokevirtual com/finalshell/crypto/ConnectHost.h (Lcom/finalshell/core/YU;)V
      // 10: aload 0
      // 11: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 14: iload 2
      // 15: ifeq 3c
      // 18: ifnull 3b
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 26: aload 1
      // 27: invokevirtual com/finalshell/core/Cs4.d (Lcom/finalshell/core/YU;)V
      // 2a: aload 0
      // 2b: dup
      // 2c: getfield com/finalshell/crypto/ConnectHost.i1 I
      // 2f: bipush 1
      // 30: iadd
      // 31: putfield com/finalshell/crypto/ConnectHost.i1 I
      // 34: goto 3b
      // 37: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 3
      // 3c: monitorexit
      // 3d: goto 47
      // 40: astore 4
      // 42: aload 3
      // 43: monitorexit
      // 44: aload 4
      // 46: athrow
      // 47: return
   }

   public void P$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: aload 0
      // 005: invokedynamic run (Lcom/finalshell/crypto/ConnectHost;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/crypto/ConnectHost.P$void ()V, ()V ]
      // 00a: putfield com/finalshell/crypto/ConnectHost.iw Ljava/lang/Runnable;
      // 00d: istore 1
      // 00e: new com/finalshell/core/UJ
      // 011: dup
      // 012: invokespecial com/finalshell/core/UJ.<init> ()V
      // 015: astore 3
      // 016: new com/finalshell/core/YU
      // 019: dup
      // 01a: aload 3
      // 01b: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 01e: astore 4
      // 020: bipush 0
      // 021: istore 5
      // 023: bipush 1
      // 024: newarray 10
      // 026: astore 7
      // 028: bipush 1
      // 029: newarray 10
      // 02b: astore 8
      // 02d: aconst_null
      // 02e: astore 9
      // 030: bipush 0
      // 031: istore 10
      // 033: aload 0
      // 034: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 037: ifeq 8fd
      // 03a: aload 0
      // 03b: iload 1
      // 03c: ifne 04d
      // 03f: getfield com/finalshell/crypto/ConnectHost.iw Ljava/lang/Runnable;
      // 042: ifnull 8fd
      // 045: goto 04c
      // 048: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: aload 0
      // 04d: aload 3
      // 04e: invokevirtual com/finalshell/crypto/ConnectHost.V (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/UJ;
      // 051: astore 3
      // 052: bipush 0
      // 053: istore 10
      // 055: goto 0c5
      // 058: astore 11
      // 05a: aload 0
      // 05b: getfield com/finalshell/crypto/ConnectHost.iq Z
      // 05e: iload 1
      // 05f: ifne 09d
      // 062: ifne 099
      // 065: goto 06c
      // 068: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06b: athrow
      // 06c: iload 10
      // 06e: iload 1
      // 06f: ifne 09d
      // 072: goto 079
      // 075: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield com/finalshell/crypto/ConnectHost.f I
      // 07d: if_icmpge 099
      // 080: goto 087
      // 083: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: aload 0
      // 088: invokevirtual com/finalshell/crypto/ConnectHost.U$void ()V
      // 08b: iinc 10 1
      // 08e: iload 1
      // 08f: ifeq 033
      // 092: goto 099
      // 095: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield com/finalshell/crypto/ConnectHost.iq Z
      // 09d: iload 1
      // 09e: ifne 0ad
      // 0a1: ifeq 0c2
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa: athrow
      // 0ab: iload 10
      // 0ad: aload 0
      // 0ae: getfield com/finalshell/crypto/ConnectHost.f I
      // 0b1: if_icmpge 0c2
      // 0b4: iinc 10 1
      // 0b7: iload 1
      // 0b8: ifeq 033
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: aload 11
      // 0c4: athrow
      // 0c5: aload 3
      // 0c6: invokevirtual com/finalshell/core/UJ.A ()B
      // 0c9: sipush 7813
      // 0cc: ldc2_w 2971678928545022450
      // 0cf: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0d2: iand
      // 0d3: istore 11
      // 0d5: aload 9
      // 0d7: iload 1
      // 0d8: ifne 0e7
      // 0db: ifnull 139
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 9
      // 0e7: invokevirtual com/finalshell/core/Cv2.j$int ()I
      // 0ea: iload 1
      // 0eb: ifne 13b
      // 0ee: iload 11
      // 0f0: if_icmpne 139
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: invokestatic java/lang/System.currentTimeMillis ()J
      // 0fe: putfield com/finalshell/crypto/ConnectHost.R J
      // 101: aload 9
      // 103: aload 3
      // 104: invokevirtual com/finalshell/core/Cv2.f (Lcom/finalshell/core/UJ;)Z
      // 107: istore 12
      // 109: iload 12
      // 10b: ifne 033
      // 10e: iload 1
      // 10f: ifne 8fd
      // 112: new com/finalshell/core/Pc2
      // 115: dup
      // 116: new java/lang/StringBuilder
      // 119: dup
      // 11a: invokespecial java/lang/StringBuilder.<init> ()V
      // 11d: sipush -8765
      // 120: sipush -14461
      // 123: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 126: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 129: iload 12
      // 12b: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 12e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 131: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 134: athrow
      // 135: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: iload 11
      // 13b: lookupswitch 1943 16 20 137 21 148 80 1697 81 1788 82 1788 90 1189 91 863 92 959 93 694 94 165 95 430 96 765 97 814 98 1023 99 1561 100 1629
      // 1c4: aload 0
      // 1c5: aload 3
      // 1c6: invokespecial com/finalshell/crypto/ConnectHost.L (Lcom/finalshell/core/UJ;)Lcom/finalshell/core/Cv2;
      // 1c9: astore 9
      // 1cb: iload 1
      // 1cc: ifeq 8f9
      // 1cf: aload 0
      // 1d0: invokespecial com/finalshell/crypto/ConnectHost.i$void ()V
      // 1d3: aload 0
      // 1d4: aload 3
      // 1d5: aload 9
      // 1d7: invokespecial com/finalshell/crypto/ConnectHost.b (Lcom/finalshell/core/UJ;Lcom/finalshell/core/Cv2;)V
      // 1da: aconst_null
      // 1db: astore 9
      // 1dd: goto 8f9
      // 1e0: aload 3
      // 1e1: invokevirtual com/finalshell/core/UJ.d ()I
      // 1e4: pop
      // 1e5: aload 3
      // 1e6: invokevirtual com/finalshell/core/UJ.r ()I
      // 1e9: pop
      // 1ea: aload 3
      // 1eb: invokevirtual com/finalshell/core/UJ.r ()I
      // 1ee: pop
      // 1ef: aload 3
      // 1f0: invokevirtual com/finalshell/core/UJ.d ()I
      // 1f3: istore 5
      // 1f5: iload 5
      // 1f7: aload 0
      // 1f8: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 1fb: astore 6
      // 1fd: aload 3
      // 1fe: aload 7
      // 200: aload 8
      // 202: invokevirtual com/finalshell/core/UJ.C ([I[I)[B
      // 205: astore 2
      // 206: aload 6
      // 208: ifnonnull 216
      // 20b: iload 1
      // 20c: ifeq 8f9
      // 20f: goto 216
      // 212: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 215: athrow
      // 216: aload 8
      // 218: bipush 0
      // 219: iaload
      // 21a: ifne 22f
      // 21d: goto 224
      // 220: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 223: athrow
      // 224: iload 1
      // 225: ifeq 8f9
      // 228: goto 22f
      // 22b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22e: athrow
      // 22f: aload 6
      // 231: aload 2
      // 232: aload 7
      // 234: bipush 0
      // 235: iaload
      // 236: aload 8
      // 238: bipush 0
      // 239: iaload
      // 23a: invokevirtual com/finalshell/core/Dm4.Y ([BII)V
      // 23d: goto 250
      // 240: astore 12
      // 242: aload 6
      // 244: invokevirtual com/finalshell/core/Dm4.r ()V
      // 247: goto 24c
      // 24a: astore 13
      // 24c: iload 1
      // 24d: ifeq 8f9
      // 250: aload 8
      // 252: bipush 0
      // 253: iaload
      // 254: istore 12
      // 256: aload 6
      // 258: aload 6
      // 25a: getfield com/finalshell/core/Dm4.e I
      // 25d: iload 12
      // 25f: isub
      // 260: invokevirtual com/finalshell/core/Dm4.Q (I)V
      // 263: aload 6
      // 265: iload 1
      // 266: ifne 2b0
      // 269: getfield com/finalshell/core/Dm4.e I
      // 26c: aload 6
      // 26e: getfield com/finalshell/core/Dm4.y I
      // 271: bipush 2
      // 272: idiv
      // 273: if_icmpge 8f9
      // 276: goto 27d
      // 279: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27c: athrow
      // 27d: aload 4
      // 27f: invokevirtual com/finalshell/core/YU.M ()V
      // 282: aload 3
      // 283: sipush 329
      // 286: ldc2_w 3860829638118776329
      // 289: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 28c: invokevirtual com/finalshell/core/UJ.V (B)V
      // 28f: aload 3
      // 290: aload 6
      // 292: invokevirtual com/finalshell/core/Dm4.J$int ()I
      // 295: invokevirtual com/finalshell/core/UJ.u (I)V
      // 298: aload 3
      // 299: aload 6
      // 29b: getfield com/finalshell/core/Dm4.y I
      // 29e: aload 6
      // 2a0: getfield com/finalshell/core/Dm4.e I
      // 2a3: isub
      // 2a4: invokevirtual com/finalshell/core/UJ.u (I)V
      // 2a7: aload 6
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2af: athrow
      // 2b0: dup
      // 2b1: astore 13
      // 2b3: monitorenter
      // 2b4: aload 6
      // 2b6: iload 1
      // 2b7: ifne 2cf
      // 2ba: getfield com/finalshell/core/Dm4.S Z
      // 2bd: ifne 2cd
      // 2c0: aload 0
      // 2c1: aload 4
      // 2c3: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: aload 13
      // 2cf: monitorexit
      // 2d0: goto 2db
      // 2d3: astore 14
      // 2d5: aload 13
      // 2d7: monitorexit
      // 2d8: aload 14
      // 2da: athrow
      // 2db: aload 6
      // 2dd: aload 6
      // 2df: getfield com/finalshell/core/Dm4.y I
      // 2e2: invokevirtual com/finalshell/core/Dm4.Q (I)V
      // 2e5: iload 1
      // 2e6: ifeq 8f9
      // 2e9: aload 3
      // 2ea: invokevirtual com/finalshell/core/UJ.d ()I
      // 2ed: pop
      // 2ee: aload 3
      // 2ef: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 2f2: pop
      // 2f3: aload 3
      // 2f4: invokevirtual com/finalshell/core/UJ.d ()I
      // 2f7: istore 5
      // 2f9: iload 5
      // 2fb: aload 0
      // 2fc: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 2ff: astore 6
      // 301: aload 3
      // 302: invokevirtual com/finalshell/core/UJ.d ()I
      // 305: pop
      // 306: aload 3
      // 307: aload 7
      // 309: aload 8
      // 30b: invokevirtual com/finalshell/core/UJ.C ([I[I)[B
      // 30e: astore 2
      // 30f: aload 6
      // 311: ifnonnull 31f
      // 314: iload 1
      // 315: ifeq 8f9
      // 318: goto 31f
      // 31b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31e: athrow
      // 31f: aload 8
      // 321: bipush 0
      // 322: iaload
      // 323: iload 1
      // 324: ifne 35c
      // 327: goto 32e
      // 32a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32d: athrow
      // 32e: ifne 343
      // 331: goto 338
      // 334: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 337: athrow
      // 338: iload 1
      // 339: ifeq 8f9
      // 33c: goto 343
      // 33f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 342: athrow
      // 343: aload 6
      // 345: aload 2
      // 346: aload 7
      // 348: bipush 0
      // 349: iaload
      // 34a: aload 8
      // 34c: bipush 0
      // 34d: iaload
      // 34e: invokevirtual com/finalshell/core/Dm4.n ([BII)V
      // 351: aload 8
      // 353: bipush 0
      // 354: iaload
      // 355: goto 35c
      // 358: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35b: athrow
      // 35c: istore 12
      // 35e: aload 6
      // 360: aload 6
      // 362: getfield com/finalshell/core/Dm4.e I
      // 365: iload 12
      // 367: isub
      // 368: invokevirtual com/finalshell/core/Dm4.Q (I)V
      // 36b: aload 6
      // 36d: iload 1
      // 36e: ifne 3b8
      // 371: getfield com/finalshell/core/Dm4.e I
      // 374: aload 6
      // 376: getfield com/finalshell/core/Dm4.y I
      // 379: bipush 2
      // 37a: idiv
      // 37b: if_icmpge 8f9
      // 37e: goto 385
      // 381: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 384: athrow
      // 385: aload 4
      // 387: invokevirtual com/finalshell/core/YU.M ()V
      // 38a: aload 3
      // 38b: sipush 329
      // 38e: ldc2_w 3860829638118776329
      // 391: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 394: invokevirtual com/finalshell/core/UJ.V (B)V
      // 397: aload 3
      // 398: aload 6
      // 39a: invokevirtual com/finalshell/core/Dm4.J$int ()I
      // 39d: invokevirtual com/finalshell/core/UJ.u (I)V
      // 3a0: aload 3
      // 3a1: aload 6
      // 3a3: getfield com/finalshell/core/Dm4.y I
      // 3a6: aload 6
      // 3a8: getfield com/finalshell/core/Dm4.e I
      // 3ab: isub
      // 3ac: invokevirtual com/finalshell/core/UJ.u (I)V
      // 3af: aload 6
      // 3b1: goto 3b8
      // 3b4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b7: athrow
      // 3b8: dup
      // 3b9: astore 13
      // 3bb: monitorenter
      // 3bc: aload 6
      // 3be: iload 1
      // 3bf: ifne 3d7
      // 3c2: getfield com/finalshell/core/Dm4.S Z
      // 3c5: ifne 3d5
      // 3c8: aload 0
      // 3c9: aload 4
      // 3cb: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 3ce: goto 3d5
      // 3d1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d4: athrow
      // 3d5: aload 13
      // 3d7: monitorexit
      // 3d8: goto 3e3
      // 3db: astore 15
      // 3dd: aload 13
      // 3df: monitorexit
      // 3e0: aload 15
      // 3e2: athrow
      // 3e3: aload 6
      // 3e5: aload 6
      // 3e7: getfield com/finalshell/core/Dm4.y I
      // 3ea: invokevirtual com/finalshell/core/Dm4.Q (I)V
      // 3ed: iload 1
      // 3ee: ifeq 8f9
      // 3f1: aload 3
      // 3f2: invokevirtual com/finalshell/core/UJ.d ()I
      // 3f5: pop
      // 3f6: aload 3
      // 3f7: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 3fa: pop
      // 3fb: aload 3
      // 3fc: invokevirtual com/finalshell/core/UJ.d ()I
      // 3ff: istore 5
      // 401: iload 5
      // 403: aload 0
      // 404: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 407: astore 6
      // 409: aload 6
      // 40b: iload 1
      // 40c: ifne 42d
      // 40f: ifnonnull 424
      // 412: goto 419
      // 415: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 418: athrow
      // 419: iload 1
      // 41a: ifeq 8f9
      // 41d: goto 424
      // 420: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 423: athrow
      // 424: aload 6
      // 426: goto 42d
      // 429: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42c: athrow
      // 42d: aload 3
      // 42e: invokevirtual com/finalshell/core/UJ.K ()J
      // 431: invokevirtual com/finalshell/core/Dm4.p (J)V
      // 434: iload 1
      // 435: ifeq 8f9
      // 438: aload 3
      // 439: invokevirtual com/finalshell/core/UJ.d ()I
      // 43c: pop
      // 43d: aload 3
      // 43e: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 441: pop
      // 442: aload 3
      // 443: invokevirtual com/finalshell/core/UJ.d ()I
      // 446: istore 5
      // 448: iload 5
      // 44a: aload 0
      // 44b: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 44e: astore 6
      // 450: aload 6
      // 452: iload 1
      // 453: ifne 462
      // 456: ifnull 8f9
      // 459: goto 460
      // 45c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45f: athrow
      // 460: aload 6
      // 462: invokevirtual com/finalshell/core/Dm4.x$void ()V
      // 465: iload 1
      // 466: ifeq 8f9
      // 469: aload 3
      // 46a: invokevirtual com/finalshell/core/UJ.d ()I
      // 46d: pop
      // 46e: aload 3
      // 46f: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 472: pop
      // 473: aload 3
      // 474: invokevirtual com/finalshell/core/UJ.d ()I
      // 477: istore 5
      // 479: iload 5
      // 47b: aload 0
      // 47c: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 47f: astore 6
      // 481: aload 6
      // 483: iload 1
      // 484: ifne 493
      // 487: ifnull 8f9
      // 48a: goto 491
      // 48d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 490: athrow
      // 491: aload 6
      // 493: invokevirtual com/finalshell/core/Dm4.r ()V
      // 496: iload 1
      // 497: ifeq 8f9
      // 49a: aload 3
      // 49b: invokevirtual com/finalshell/core/UJ.d ()I
      // 49e: pop
      // 49f: aload 3
      // 4a0: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 4a3: pop
      // 4a4: aload 3
      // 4a5: invokevirtual com/finalshell/core/UJ.d ()I
      // 4a8: istore 5
      // 4aa: iload 5
      // 4ac: aload 0
      // 4ad: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 4b0: astore 6
      // 4b2: aload 3
      // 4b3: invokevirtual com/finalshell/core/UJ.d ()I
      // 4b6: istore 13
      // 4b8: aload 3
      // 4b9: invokevirtual com/finalshell/core/UJ.K ()J
      // 4bc: lstore 14
      // 4be: aload 3
      // 4bf: invokevirtual com/finalshell/core/UJ.d ()I
      // 4c2: istore 16
      // 4c4: aload 6
      // 4c6: iload 1
      // 4c7: ifne 4f1
      // 4ca: ifnull 8f9
      // 4cd: goto 4d4
      // 4d0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d3: athrow
      // 4d4: aload 6
      // 4d6: lload 14
      // 4d8: invokevirtual com/finalshell/core/Dm4.X (J)V
      // 4db: aload 6
      // 4dd: iload 16
      // 4df: invokevirtual com/finalshell/core/Dm4.A (I)V
      // 4e2: aload 6
      // 4e4: bipush 1
      // 4e5: putfield com/finalshell/core/Dm4.m Z
      // 4e8: aload 6
      // 4ea: goto 4f1
      // 4ed: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f0: athrow
      // 4f1: iload 13
      // 4f3: invokevirtual com/finalshell/core/Dm4.N (I)V
      // 4f6: iload 1
      // 4f7: ifeq 8f9
      // 4fa: aload 3
      // 4fb: invokevirtual com/finalshell/core/UJ.d ()I
      // 4fe: pop
      // 4ff: aload 3
      // 500: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 503: pop
      // 504: aload 3
      // 505: invokevirtual com/finalshell/core/UJ.d ()I
      // 508: istore 5
      // 50a: iload 5
      // 50c: aload 0
      // 50d: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 510: astore 6
      // 512: aload 6
      // 514: ifnull 8f9
      // 517: aload 3
      // 518: invokevirtual com/finalshell/core/UJ.d ()I
      // 51b: istore 17
      // 51d: aload 6
      // 51f: iload 17
      // 521: invokevirtual com/finalshell/core/Dm4.j (I)V
      // 524: aload 6
      // 526: bipush 1
      // 527: putfield com/finalshell/core/Dm4.S Z
      // 52a: aload 6
      // 52c: bipush 1
      // 52d: putfield com/finalshell/core/Dm4.E Z
      // 530: aload 6
      // 532: bipush 0
      // 533: invokevirtual com/finalshell/core/Dm4.N (I)V
      // 536: iload 1
      // 537: ifeq 8f9
      // 53a: aload 3
      // 53b: invokevirtual com/finalshell/core/UJ.d ()I
      // 53e: pop
      // 53f: aload 3
      // 540: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 543: pop
      // 544: aload 3
      // 545: invokevirtual com/finalshell/core/UJ.d ()I
      // 548: istore 5
      // 54a: aload 3
      // 54b: invokevirtual com/finalshell/core/UJ.S ()[B
      // 54e: astore 2
      // 54f: aload 3
      // 550: invokevirtual com/finalshell/core/UJ.r ()I
      // 553: iload 1
      // 554: ifne 562
      // 557: ifeq 565
      // 55a: goto 561
      // 55d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 560: athrow
      // 561: bipush 1
      // 562: goto 566
      // 565: bipush 0
      // 566: istore 17
      // 568: iload 5
      // 56a: aload 0
      // 56b: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 56e: astore 6
      // 570: aload 6
      // 572: ifnull 8f9
      // 575: sipush 4579
      // 578: ldc2_w 4935222543909654166
      // 57b: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 57e: istore 18
      // 580: aload 2
      // 581: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 584: sipush -8812
      // 587: sipush 9315
      // 58a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 58d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 590: iload 1
      // 591: ifne 5b8
      // 594: ifeq 5b6
      // 597: goto 59e
      // 59a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59d: athrow
      // 59e: aload 3
      // 59f: invokevirtual com/finalshell/core/UJ.d ()I
      // 5a2: istore 5
      // 5a4: sipush 27763
      // 5a7: aload 6
      // 5a9: iload 5
      // 5ab: invokevirtual com/finalshell/core/Dm4.j (I)V
      // 5ae: ldc2_w 1991135887199433482
      // 5b1: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 5b4: istore 18
      // 5b6: iload 17
      // 5b8: ifeq 5dc
      // 5bb: aload 4
      // 5bd: invokevirtual com/finalshell/core/YU.M ()V
      // 5c0: aload 3
      // 5c1: iload 18
      // 5c3: invokevirtual com/finalshell/core/UJ.V (B)V
      // 5c6: aload 3
      // 5c7: aload 6
      // 5c9: invokevirtual com/finalshell/core/Dm4.J$int ()I
      // 5cc: invokevirtual com/finalshell/core/UJ.u (I)V
      // 5cf: aload 0
      // 5d0: aload 4
      // 5d2: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 5d5: goto 5dc
      // 5d8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5db: athrow
      // 5dc: iload 1
      // 5dd: ifeq 8f9
      // 5e0: aload 3
      // 5e1: invokevirtual com/finalshell/core/UJ.d ()I
      // 5e4: pop
      // 5e5: aload 3
      // 5e6: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 5e9: pop
      // 5ea: aload 3
      // 5eb: invokevirtual com/finalshell/core/UJ.S ()[B
      // 5ee: astore 2
      // 5ef: aload 2
      // 5f0: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 5f3: astore 18
      // 5f5: sipush -8784
      // 5f8: sipush 1550
      // 5fb: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 5fe: iload 1
      // 5ff: ifne 6d0
      // 602: aload 18
      // 604: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 607: ifne 6c7
      // 60a: goto 611
      // 60d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 610: athrow
      // 611: sipush -8930
      // 614: sipush 5500
      // 617: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 61a: aload 18
      // 61c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 61f: iload 1
      // 620: ifne 662
      // 623: goto 62a
      // 626: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 629: athrow
      // 62a: ifeq 64d
      // 62d: goto 634
      // 630: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 633: athrow
      // 634: aload 0
      // 635: getfield com/finalshell/crypto/ConnectHost.N Z
      // 638: iload 1
      // 639: ifne 662
      // 63c: goto 643
      // 63f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 642: athrow
      // 643: ifne 6c7
      // 646: goto 64d
      // 649: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64c: athrow
      // 64d: sipush -8841
      // 650: sipush 20800
      // 653: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 656: aload 18
      // 658: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 65b: goto 662
      // 65e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 661: athrow
      // 662: iload 1
      // 663: ifne 686
      // 666: ifeq 689
      // 669: goto 670
      // 66c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66f: athrow
      // 670: aload 0
      // 671: iload 1
      // 672: ifne 6be
      // 675: goto 67c
      // 678: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67b: athrow
      // 67c: getfield com/finalshell/crypto/ConnectHost.iu Z
      // 67f: goto 686
      // 682: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 685: athrow
      // 686: ifne 6c7
      // 689: aload 4
      // 68b: invokevirtual com/finalshell/core/YU.M ()V
      // 68e: aload 3
      // 68f: sipush 23520
      // 692: ldc2_w 6819126643894797478
      // 695: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 698: invokevirtual com/finalshell/core/UJ.V (B)V
      // 69b: aload 3
      // 69c: aload 3
      // 69d: invokevirtual com/finalshell/core/UJ.d ()I
      // 6a0: invokevirtual com/finalshell/core/UJ.u (I)V
      // 6a3: aload 3
      // 6a4: bipush 1
      // 6a5: invokevirtual com/finalshell/core/UJ.u (I)V
      // 6a8: aload 3
      // 6a9: getstatic com/finalshell/core/E8.z [B
      // 6ac: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 6af: aload 3
      // 6b0: getstatic com/finalshell/core/E8.z [B
      // 6b3: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 6b6: aload 0
      // 6b7: goto 6be
      // 6ba: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6bd: athrow
      // 6be: aload 4
      // 6c0: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 6c3: iload 1
      // 6c4: ifeq 8f9
      // 6c7: aload 18
      // 6c9: goto 6d0
      // 6cc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6cf: athrow
      // 6d0: aload 0
      // 6d1: invokestatic com/finalshell/core/Dm4.a (Ljava/lang/String;Lcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 6d4: astore 6
      // 6d6: aload 0
      // 6d7: aload 6
      // 6d9: invokevirtual com/finalshell/crypto/ConnectHost.j (Lcom/finalshell/core/Dm4;)V
      // 6dc: aload 6
      // 6de: aload 3
      // 6df: invokevirtual com/finalshell/core/Dm4.D (Lcom/finalshell/core/UJ;)V
      // 6e2: aload 6
      // 6e4: invokevirtual com/finalshell/core/Dm4.n ()V
      // 6e7: new java/lang/Thread
      // 6ea: dup
      // 6eb: aload 6
      // 6ed: dup
      // 6ee: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 6f1: pop
      // 6f2: invokedynamic run (Lcom/finalshell/core/Dm4;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/core/Dm4.S ()V, ()V ]
      // 6f7: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 6fa: astore 19
      // 6fc: aload 19
      // 6fe: new java/lang/StringBuilder
      // 701: dup
      // 702: invokespecial java/lang/StringBuilder.<init> ()V
      // 705: sipush -8771
      // 708: sipush -25122
      // 70b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 70e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 711: aload 18
      // 713: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 716: ldc_w " "
      // 719: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71c: aload 0
      // 71d: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 720: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 723: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 726: invokevirtual java/lang/Thread.setName (Ljava/lang/String;)V
      // 729: iload 1
      // 72a: ifne 750
      // 72d: aload 0
      // 72e: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 731: ifeq 74b
      // 734: goto 73b
      // 737: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73a: athrow
      // 73b: aload 19
      // 73d: aload 0
      // 73e: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 741: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 744: goto 74b
      // 747: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74a: athrow
      // 74b: aload 19
      // 74d: invokevirtual java/lang/Thread.start ()V
      // 750: iload 1
      // 751: ifeq 8f9
      // 754: aload 3
      // 755: invokevirtual com/finalshell/core/UJ.d ()I
      // 758: pop
      // 759: aload 3
      // 75a: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 75d: pop
      // 75e: aload 3
      // 75f: invokevirtual com/finalshell/core/UJ.d ()I
      // 762: istore 5
      // 764: iload 5
      // 766: aload 0
      // 767: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 76a: astore 6
      // 76c: aload 6
      // 76e: iload 1
      // 76f: ifne 790
      // 772: ifnonnull 787
      // 775: goto 77c
      // 778: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77b: athrow
      // 77c: iload 1
      // 77d: ifeq 8f9
      // 780: goto 787
      // 783: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 786: athrow
      // 787: aload 6
      // 789: goto 790
      // 78c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78f: athrow
      // 790: bipush 1
      // 791: putfield com/finalshell/core/Dm4.b I
      // 794: iload 1
      // 795: ifeq 8f9
      // 798: aload 3
      // 799: invokevirtual com/finalshell/core/UJ.d ()I
      // 79c: pop
      // 79d: aload 3
      // 79e: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 7a1: pop
      // 7a2: aload 3
      // 7a3: invokevirtual com/finalshell/core/UJ.d ()I
      // 7a6: istore 5
      // 7a8: iload 5
      // 7aa: aload 0
      // 7ab: invokestatic com/finalshell/core/Dm4.A (ILcom/finalshell/crypto/ConnectHost;)Lcom/finalshell/core/Dm4;
      // 7ae: astore 6
      // 7b0: aload 6
      // 7b2: iload 1
      // 7b3: ifne 7d4
      // 7b6: ifnonnull 7cb
      // 7b9: goto 7c0
      // 7bc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7bf: athrow
      // 7c0: iload 1
      // 7c1: ifeq 8f9
      // 7c4: goto 7cb
      // 7c7: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7ca: athrow
      // 7cb: aload 6
      // 7cd: goto 7d4
      // 7d0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d3: athrow
      // 7d4: bipush 0
      // 7d5: putfield com/finalshell/core/Dm4.b I
      // 7d8: iload 1
      // 7d9: ifeq 8f9
      // 7dc: aload 3
      // 7dd: invokevirtual com/finalshell/core/UJ.d ()I
      // 7e0: pop
      // 7e1: aload 3
      // 7e2: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 7e5: pop
      // 7e6: aload 3
      // 7e7: invokevirtual com/finalshell/core/UJ.S ()[B
      // 7ea: astore 2
      // 7eb: aload 3
      // 7ec: invokevirtual com/finalshell/core/UJ.r ()I
      // 7ef: iload 1
      // 7f0: ifne 7fe
      // 7f3: ifeq 801
      // 7f6: goto 7fd
      // 7f9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7fc: athrow
      // 7fd: bipush 1
      // 7fe: goto 802
      // 801: bipush 0
      // 802: istore 17
      // 804: iload 1
      // 805: ifne 833
      // 808: iload 17
      // 80a: ifeq 8f9
      // 80d: goto 814
      // 810: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 813: athrow
      // 814: aload 4
      // 816: invokevirtual com/finalshell/core/YU.M ()V
      // 819: aload 3
      // 81a: sipush 14059
      // 81d: ldc2_w 517102079082506643
      // 820: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 823: invokevirtual com/finalshell/core/UJ.V (B)V
      // 826: aload 0
      // 827: aload 4
      // 829: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 82c: goto 833
      // 82f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 832: athrow
      // 833: iload 1
      // 834: ifeq 8f9
      // 837: aload 0
      // 838: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 83b: invokevirtual com/finalshell/core/Fw2.p ()Ljava/lang/Thread;
      // 83e: astore 19
      // 840: aload 19
      // 842: ifnull 8f9
      // 845: aload 0
      // 846: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 849: iload 11
      // 84b: iload 1
      // 84c: ifne 871
      // 84f: goto 856
      // 852: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 855: athrow
      // 856: sipush 7537
      // 859: ldc2_w 983812874600743465
      // 85c: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 85f: if_icmpne 874
      // 862: goto 869
      // 865: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 868: athrow
      // 869: bipush 1
      // 86a: goto 871
      // 86d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 870: athrow
      // 871: goto 875
      // 874: bipush 0
      // 875: invokevirtual com/finalshell/core/Fw2.P (I)V
      // 878: iload 1
      // 879: ifne 8ce
      // 87c: iload 11
      // 87e: sipush 20298
      // 881: ldc2_w 2425422710879866914
      // 884: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 887: if_icmpne 8c9
      // 88a: goto 891
      // 88d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 890: athrow
      // 891: aload 0
      // 892: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 895: invokevirtual com/finalshell/core/Fw2.o ()I
      // 898: iload 1
      // 899: ifne 8bd
      // 89c: goto 8a3
      // 89f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a2: athrow
      // 8a3: ifne 8c9
      // 8a6: goto 8ad
      // 8a9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8ac: athrow
      // 8ad: aload 3
      // 8ae: invokevirtual com/finalshell/core/UJ.d ()I
      // 8b1: pop
      // 8b2: aload 3
      // 8b3: invokevirtual com/finalshell/core/UJ.c$int ()I
      // 8b6: goto 8bd
      // 8b9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8bc: athrow
      // 8bd: pop
      // 8be: aload 0
      // 8bf: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 8c2: aload 3
      // 8c3: invokevirtual com/finalshell/core/UJ.d ()I
      // 8c6: invokevirtual com/finalshell/core/Fw2.D (I)V
      // 8c9: aload 19
      // 8cb: invokevirtual java/lang/Thread.interrupt ()V
      // 8ce: iload 1
      // 8cf: ifeq 8f9
      // 8d2: new java/io/IOException
      // 8d5: dup
      // 8d6: new java/lang/StringBuilder
      // 8d9: dup
      // 8da: invokespecial java/lang/StringBuilder.<init> ()V
      // 8dd: sipush -8736
      // 8e0: sipush 23830
      // 8e3: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 8e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8e9: iload 11
      // 8eb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 8ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8f1: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 8f4: athrow
      // 8f5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f8: athrow
      // 8f9: iload 1
      // 8fa: ifeq 033
      // 8fd: goto 94e
      // 900: astore 11
      // 902: aload 0
      // 903: bipush 0
      // 904: putfield com/finalshell/crypto/ConnectHost.iq Z
      // 907: aload 0
      // 908: iload 1
      // 909: ifne 94f
      // 90c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 90f: bipush 1
      // 910: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 915: ifeq 94e
      // 918: goto 91f
      // 91b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91e: athrow
      // 91f: aload 0
      // 920: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 923: bipush 1
      // 924: new java/lang/StringBuilder
      // 927: dup
      // 928: invokespecial java/lang/StringBuilder.<init> ()V
      // 92b: sipush -8927
      // 92e: sipush -6276
      // 931: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 934: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 937: aload 11
      // 939: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 93c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 93f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 942: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 947: goto 94e
      // 94a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94d: athrow
      // 94e: aload 0
      // 94f: invokevirtual com/finalshell/crypto/ConnectHost.G ()V
      // 952: goto 95c
      // 955: astore 11
      // 957: goto 95c
      // 95a: astore 11
      // 95c: aload 0
      // 95d: bipush 0
      // 95e: putfield com/finalshell/crypto/ConnectHost.iJ Z
      // 961: return
   }

   public void G() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getfield com/finalshell/crypto/ConnectHost.iJ Z
      // 008: iload 1
      // 009: ifne 02c
      // 00c: ifne 017
      // 00f: goto 016
      // 012: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: return
      // 017: aload 0
      // 018: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 01b: iload 1
      // 01c: ifne 089
      // 01f: bipush 1
      // 020: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 025: goto 02c
      // 028: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: ifeq 070
      // 02f: aload 0
      // 030: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 033: bipush 1
      // 034: new java/lang/StringBuilder
      // 037: dup
      // 038: invokespecial java/lang/StringBuilder.<init> ()V
      // 03b: sipush -8886
      // 03e: sipush 26402
      // 041: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 044: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 047: aload 0
      // 048: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 04b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04e: sipush -8948
      // 051: sipush -11091
      // 054: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 057: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05a: aload 0
      // 05b: getfield com/finalshell/crypto/ConnectHost.x I
      // 05e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 061: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 064: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 069: goto 070
      // 06c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: aload 0
      // 071: invokestatic com/finalshell/core/Dm4.h (Lcom/finalshell/crypto/ConnectHost;)V
      // 074: aload 0
      // 075: bipush 0
      // 076: putfield com/finalshell/crypto/ConnectHost.iJ Z
      // 079: aload 0
      // 07a: invokestatic com/finalshell/core/Qg2.G (Lcom/finalshell/crypto/ConnectHost;)V
      // 07d: aload 0
      // 07e: invokestatic com/finalshell/core/DS3.M (Lcom/finalshell/crypto/ConnectHost;)V
      // 081: aload 0
      // 082: invokestatic com/finalshell/core/De4.k (Lcom/finalshell/crypto/ConnectHost;)V
      // 085: aload 0
      // 086: getfield com/finalshell/crypto/ConnectHost.S Ljava/lang/Object;
      // 089: dup
      // 08a: astore 2
      // 08b: monitorenter
      // 08c: aload 0
      // 08d: getfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 090: iload 1
      // 091: ifne 0ae
      // 094: ifnull 0ad
      // 097: invokestatic java/lang/Thread.yield ()V
      // 09a: aload 0
      // 09b: getfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 09e: invokevirtual java/lang/Thread.interrupt ()V
      // 0a1: aload 0
      // 0a2: aconst_null
      // 0a3: putfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: aload 2
      // 0ae: monitorexit
      // 0af: goto 0b7
      // 0b2: astore 3
      // 0b3: aload 2
      // 0b4: monitorexit
      // 0b5: aload 3
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: aconst_null
      // 0b9: putfield com/finalshell/crypto/ConnectHost.iw Ljava/lang/Runnable;
      // 0bc: aload 0
      // 0bd: iload 1
      // 0be: ifne 141
      // 0c1: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 0c4: ifnull 140
      // 0c7: aload 0
      // 0c8: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 0cb: iload 1
      // 0cc: ifne 0f8
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 0d9: ifnull 0f4
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 0e7: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 0ea: invokevirtual java/io/InputStream.close ()V
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 0f8: getfield com/finalshell/core/Cs4.X Ljava/io/OutputStream;
      // 0fb: iload 1
      // 0fc: ifne 12c
      // 0ff: ifnull 11a
      // 102: goto 109
      // 105: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: aload 0
      // 10a: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 10d: getfield com/finalshell/core/Cs4.X Ljava/io/OutputStream;
      // 110: invokevirtual java/io/OutputStream.close ()V
      // 113: goto 11a
      // 116: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 0
      // 11b: iload 1
      // 11c: ifne 141
      // 11f: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 122: getfield com/finalshell/core/Cs4.K Ljava/io/OutputStream;
      // 125: goto 12c
      // 128: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: ifnull 140
      // 12f: aload 0
      // 130: getfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 133: getfield com/finalshell/core/Cs4.K Ljava/io/OutputStream;
      // 136: invokevirtual java/io/OutputStream.close ()V
      // 139: goto 140
      // 13c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13f: athrow
      // 140: aload 0
      // 141: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 144: iload 1
      // 145: ifne 188
      // 148: ifnonnull 17d
      // 14b: goto 152
      // 14e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: aload 0
      // 153: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 156: iload 1
      // 157: ifne 176
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 160: athrow
      // 161: ifnull 1a5
      // 164: goto 16b
      // 167: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 16f: goto 176
      // 172: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: invokevirtual java/net/Socket.close ()V
      // 179: iload 1
      // 17a: ifeq 1a5
      // 17d: aload 0
      // 17e: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 181: goto 188
      // 184: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: dup
      // 189: astore 2
      // 18a: monitorenter
      // 18b: aload 0
      // 18c: getfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 18f: invokeinterface com/finalshell/core/Ic4.n ()V 1
      // 194: aload 2
      // 195: monitorexit
      // 196: goto 1a0
      // 199: astore 4
      // 19b: aload 2
      // 19c: monitorexit
      // 19d: aload 4
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: aconst_null
      // 1a2: putfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 1a5: goto 1a9
      // 1a8: astore 2
      // 1a9: aload 0
      // 1aa: aconst_null
      // 1ab: putfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 1ae: aload 0
      // 1af: aconst_null
      // 1b0: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 1b3: aload 0
      // 1b4: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 1b7: aload 0
      // 1b8: invokevirtual com/finalshell/core/Xe2.F (Lcom/finalshell/crypto/ConnectHost;)Z
      // 1bb: pop
      // 1bc: aload 0
      // 1bd: iload 1
      // 1be: ifne 1da
      // 1c1: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 1c4: ifnull 1d9
      // 1c7: goto 1ce
      // 1ca: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: getfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 1d2: invokevirtual com/finalshell/ui/panel/ConnectionProperty.Z ()V
      // 1d5: goto 1d9
      // 1d8: astore 2
      // 1d9: aload 0
      // 1da: new com/finalshell/core/Yl4
      // 1dd: dup
      // 1de: aload 0
      // 1df: ldc2_w 261180006635811470
      // 1e2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1e5: aconst_null
      // 1e6: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 1e9: invokespecial com/finalshell/core/Yl4.<init> (Lcom/finalshell/crypto/ConnectHost;I)V
      // 1ec: invokevirtual com/finalshell/crypto/ConnectHost.r (Lcom/finalshell/core/Yl4;)V
      // 1ef: return
   }

   public int S(int var1, String var2, int var3) throws Pc2 {
      return this.k(a(-8776, 16976), var1, var2, var3);
   }

   public int k(String var1, int var2, String var3, int var4) throws Pc2 {
      return this.G(var1, var2, var3, var4, null);
   }

   public int G(String var1, int var2, String var3, int var4, F_2_3 var5) throws Pc2 {
      return this.c(var1, var2, var3, var4, var5, 0);
   }

   public int c(String param1, int param2, String param3, int param4, F_2_3 param5, int param6) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 0
      // 04: aload 1
      // 05: iload 2
      // 06: aload 3
      // 07: iload 4
      // 09: aload 5
      // 0b: invokestatic com/finalshell/core/Qg2.k (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;ILjava/lang/String;ILcom/finalshell/core/F_2_3;)Lcom/finalshell/core/Qg2;
      // 0e: astore 8
      // 10: istore 7
      // 12: aload 8
      // 14: iload 6
      // 16: invokevirtual com/finalshell/core/Qg2.V (I)V
      // 19: new java/lang/Thread
      // 1c: dup
      // 1d: aload 8
      // 1f: dup
      // 20: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 23: pop
      // 24: invokedynamic run (Lcom/finalshell/core/Qg2;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/core/Qg2.E ()V, ()V ]
      // 29: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 2c: astore 9
      // 2e: aload 9
      // 30: new java/lang/StringBuilder
      // 33: dup
      // 34: invokespecial java/lang/StringBuilder.<init> ()V
      // 37: sipush -8752
      // 3a: sipush -13913
      // 3d: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 40: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 43: aload 3
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4a: invokevirtual java/lang/Thread.setName (Ljava/lang/String;)V
      // 4d: aload 0
      // 4e: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 51: iload 7
      // 53: ifne 7a
      // 56: ifeq 70
      // 59: goto 60
      // 5c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 9
      // 62: aload 0
      // 63: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 66: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 69: goto 70
      // 6c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aload 9
      // 72: invokevirtual java/lang/Thread.start ()V
      // 75: aload 8
      // 77: getfield com/finalshell/core/Qg2.r I
      // 7a: ireturn
   }

   public int s(String param1, int param2, String param3, F_2_3 param4, int param5) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: iload 2
      // 03: aload 3
      // 04: aload 4
      // 06: invokestatic com/finalshell/core/Qg2.Y (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;ILjava/lang/String;Lcom/finalshell/core/F_2_3;)Lcom/finalshell/core/Qg2;
      // 09: astore 7
      // 0b: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 0e: aload 7
      // 10: iload 5
      // 12: invokevirtual com/finalshell/core/Qg2.V (I)V
      // 15: new java/lang/Thread
      // 18: dup
      // 19: aload 7
      // 1b: dup
      // 1c: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f: pop
      // 20: invokedynamic run (Lcom/finalshell/core/Qg2;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, com/finalshell/core/Qg2.E ()V, ()V ]
      // 25: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 28: astore 8
      // 2a: aload 8
      // 2c: new java/lang/StringBuilder
      // 2f: dup
      // 30: invokespecial java/lang/StringBuilder.<init> ()V
      // 33: sipush -8752
      // 36: sipush -13913
      // 39: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f: aload 0
      // 40: getfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49: invokevirtual java/lang/Thread.setName (Ljava/lang/String;)V
      // 4c: istore 6
      // 4e: aload 0
      // 4f: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 52: iload 6
      // 54: ifne 7b
      // 57: ifeq 71
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 8
      // 63: aload 0
      // 64: getfield com/finalshell/crypto/ConnectHost.ih Z
      // 67: invokevirtual java/lang/Thread.setDaemon (Z)V
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 8
      // 73: invokevirtual java/lang/Thread.start ()V
      // 76: aload 7
      // 78: getfield com/finalshell/core/Qg2.r I
      // 7b: ireturn
   }

   public void Z(int var1) throws Pc2 {
      this.Q(a(-8776, 16976), var1);
   }

   public void Q(String var1, int var2) throws Pc2 {
      Qg2.t(this, var1, var2);
   }

   public String[] x$arrString() throws Pc2 {
      return Qg2.a(this);
   }

   public void f(int var1, String var2, int var3) throws Pc2 {
      this.H(null, var1, var2, var3, (PJ3)null);
   }

   public void E(String var1, int var2, String var3, int var4) throws Pc2 {
      this.H(var1, var2, var3, var4, (PJ3)null);
   }

   public void R(int var1, String var2, int var3, PJ3 var4) throws Pc2 {
      this.H(null, var1, var2, var3, var4);
   }

   public void H(String var1, int var2, String var3, int var4, PJ3 var5) throws Pc2 {
      int var6 = this.R(var1, var2);
      DS3.f(this, var1, var2, var6, var3, var4, var5);
   }

   public void E(int var1, String var2) throws Pc2 {
      this.q(null, var1, var2, null);
   }

   public void k(int var1, String var2, Object[] var3) throws Pc2 {
      this.q(null, var1, var2, var3);
   }

   public void q(String var1, int var2, String var3, Object[] var4) throws Pc2 {
      int var5 = this.R(var1, var2);
      DS3.f(this, var1, var2, var5, var3, var4);
   }

   public String[] Q() throws Pc2 {
      return DS3.R(this);
   }

   public Hh2 i$Hh_2(String param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: aload 1
      // 004: ldc_w " "
      // 007: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 00a: astore 3
      // 00b: istore 2
      // 00c: aload 3
      // 00d: arraylength
      // 00e: bipush 1
      // 00f: if_icmple 0c4
      // 012: new java/util/Vector
      // 015: dup
      // 016: invokespecial java/util/Vector.<init> ()V
      // 019: astore 4
      // 01b: bipush 0
      // 01c: istore 5
      // 01e: iload 5
      // 020: aload 3
      // 021: arraylength
      // 022: if_icmpge 05f
      // 025: aload 3
      // 026: iload 5
      // 028: aaload
      // 029: iload 2
      // 02a: ifeq 0c5
      // 02d: invokevirtual java/lang/String.length ()I
      // 030: ifne 045
      // 033: goto 03a
      // 036: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: iload 2
      // 03b: ifne 058
      // 03e: goto 045
      // 041: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: aload 4
      // 047: aload 3
      // 048: iload 5
      // 04a: aaload
      // 04b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 04e: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 051: goto 058
      // 054: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: iinc 5 1
      // 05b: iload 2
      // 05c: ifne 01e
      // 05f: new java/lang/StringBuilder
      // 062: dup
      // 063: invokespecial java/lang/StringBuilder.<init> ()V
      // 066: astore 5
      // 068: bipush 0
      // 069: istore 6
      // 06b: iload 6
      // 06d: aload 4
      // 06f: invokevirtual java/util/Vector.size ()I
      // 072: if_icmpge 0be
      // 075: aload 5
      // 077: aload 4
      // 079: iload 6
      // 07b: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 07e: checkcast java/lang/String
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: pop
      // 085: iload 2
      // 086: ifeq 0c4
      // 089: iload 2
      // 08a: ifeq 0ba
      // 08d: goto 094
      // 090: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: iload 6
      // 096: bipush 1
      // 097: iadd
      // 098: aload 4
      // 09a: invokevirtual java/util/Vector.size ()I
      // 09d: if_icmpge 0b7
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: aload 5
      // 0a9: ldc_w ":"
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: pop
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: iinc 6 1
      // 0ba: iload 2
      // 0bb: ifne 06b
      // 0be: aload 5
      // 0c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c3: astore 1
      // 0c4: aload 1
      // 0c5: astore 4
      // 0c7: new com/finalshell/core/Hh2
      // 0ca: dup
      // 0cb: invokespecial com/finalshell/core/Hh2.<init> ()V
      // 0ce: astore 5
      // 0d0: aload 1
      // 0d1: ldc_w ":"
      // 0d4: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 0d7: bipush -1
      // 0d8: iload 2
      // 0d9: ifeq 142
      // 0dc: if_icmpne 10d
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: new com/finalshell/core/Pc2
      // 0e9: dup
      // 0ea: new java/lang/StringBuilder
      // 0ed: dup
      // 0ee: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f1: sipush -8796
      // 0f4: sipush 24638
      // 0f7: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: aload 4
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 105: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 108: athrow
      // 109: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: aload 5
      // 10f: aload 1
      // 110: aload 1
      // 111: ldc_w ":"
      // 114: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 117: bipush 1
      // 118: iadd
      // 119: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 11c: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 11f: putfield com/finalshell/core/Hh2.j I
      // 122: aload 1
      // 123: bipush 0
      // 124: aload 1
      // 125: ldc_w ":"
      // 128: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 12b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 12e: astore 1
      // 12f: iload 2
      // 130: ifeq 17e
      // 133: aload 1
      // 134: ldc_w ":"
      // 137: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 13a: bipush -1
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: if_icmpne 16c
      // 145: new com/finalshell/core/Pc2
      // 148: dup
      // 149: new java/lang/StringBuilder
      // 14c: dup
      // 14d: invokespecial java/lang/StringBuilder.<init> ()V
      // 150: sipush -8945
      // 153: sipush -8822
      // 156: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 159: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15c: aload 4
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 164: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 167: athrow
      // 168: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 5
      // 16e: aload 1
      // 16f: aload 1
      // 170: ldc_w ":"
      // 173: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 176: bipush 1
      // 177: iadd
      // 178: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 17b: putfield com/finalshell/core/Hh2.T Ljava/lang/String;
      // 17e: goto 195
      // 181: astore 6
      // 183: aload 5
      // 185: aload 1
      // 186: aload 1
      // 187: ldc_w ":"
      // 18a: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 18d: bipush 1
      // 18e: iadd
      // 18f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 192: putfield com/finalshell/core/Hh2.z Ljava/lang/String;
      // 195: aload 1
      // 196: bipush 0
      // 197: aload 1
      // 198: ldc_w ":"
      // 19b: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 19e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1a1: astore 1
      // 1a2: iload 2
      // 1a3: ifeq 251
      // 1a6: aload 1
      // 1a7: ldc_w ":"
      // 1aa: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 1ad: bipush -1
      // 1ae: if_icmpeq 241
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b7: athrow
      // 1b8: aload 5
      // 1ba: aload 1
      // 1bb: aload 1
      // 1bc: ldc_w ":"
      // 1bf: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 1c2: bipush 1
      // 1c3: iadd
      // 1c4: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1c7: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 1ca: putfield com/finalshell/core/Hh2.R I
      // 1cd: aload 1
      // 1ce: bipush 0
      // 1cf: aload 1
      // 1d0: ldc_w ":"
      // 1d3: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 1d6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1d9: astore 1
      // 1da: aload 1
      // 1db: iload 2
      // 1dc: ifeq 211
      // 1df: invokevirtual java/lang/String.length ()I
      // 1e2: ifeq 208
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: aload 1
      // 1ed: ldc_w "*"
      // 1f0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f3: iload 2
      // 1f4: ifeq 22a
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fd: athrow
      // 1fe: ifeq 212
      // 201: goto 208
      // 204: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 207: athrow
      // 208: sipush -8834
      // 20b: sipush -31192
      // 20e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 211: astore 1
      // 212: aload 1
      // 213: iload 2
      // 214: ifeq 236
      // 217: sipush -8899
      // 21a: sipush 28170
      // 21d: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 220: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 223: goto 22a
      // 226: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 229: athrow
      // 22a: ifeq 237
      // 22d: sipush -8776
      // 230: sipush 16976
      // 233: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 236: astore 1
      // 237: aload 5
      // 239: aload 1
      // 23a: putfield com/finalshell/core/Hh2.n Ljava/lang/String;
      // 23d: iload 2
      // 23e: ifne 25f
      // 241: aload 5
      // 243: aload 1
      // 244: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 247: putfield com/finalshell/core/Hh2.R I
      // 24a: goto 251
      // 24d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: aload 5
      // 253: sipush -8776
      // 256: sipush 16976
      // 259: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 25c: putfield com/finalshell/core/Hh2.n Ljava/lang/String;
      // 25f: goto 28c
      // 262: astore 6
      // 264: new com/finalshell/core/Pc2
      // 267: dup
      // 268: new java/lang/StringBuilder
      // 26b: dup
      // 26c: invokespecial java/lang/StringBuilder.<init> ()V
      // 26f: sipush -8945
      // 272: sipush -8822
      // 275: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 278: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27b: aload 6
      // 27d: invokevirtual java/lang/NumberFormatException.toString ()Ljava/lang/String;
      // 280: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 283: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 286: aload 6
      // 288: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 28b: athrow
      // 28c: aload 5
      // 28e: areturn
   }

   public int y(String var1) throws Pc2 {
      Hh2 var2 = this.i$Hh_2(var1);
      return this.k(var2.n, var2.R, var2.T, var2.j);
   }

   public int n(String var1) throws Pc2 {
      Hh2 var2 = this.i$Hh_2(var1);
      int var3 = this.R(var2.n, var2.R);
      DS3.f(this, var2.n, var2.R, var3, var2.T, var2.j, null);
      return var3;
   }

   public Dm4 l(String var1, int var2) throws Pc2 {
      DZ3 var3 = new DZ3();
      var3.n();
      this.j(var3);
      var3.e(var1);
      var3.t(var2);
      return var3;
   }

   public int R(String param1, int param2) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 007: dup
      // 008: astore 4
      // 00a: monitorenter
      // 00b: istore 3
      // 00c: new com/finalshell/core/UJ
      // 00f: dup
      // 010: sipush 15038
      // 013: ldc2_w 4770717517059696104
      // 016: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 019: invokespecial com/finalshell/core/UJ.<init> (I)V
      // 01c: astore 5
      // 01e: new com/finalshell/core/YU
      // 021: dup
      // 022: aload 5
      // 024: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 027: astore 6
      // 029: aload 1
      // 02a: invokestatic com/finalshell/core/DS3.J (Ljava/lang/String;)Ljava/lang/String;
      // 02d: astore 7
      // 02f: aload 0
      // 030: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 033: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 036: invokevirtual com/finalshell/core/Fw2.V (Ljava/lang/Thread;)V
      // 039: aload 0
      // 03a: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 03d: iload 2
      // 03e: invokevirtual com/finalshell/core/Fw2.D (I)V
      // 041: aload 6
      // 043: invokevirtual com/finalshell/core/YU.M ()V
      // 046: aload 5
      // 048: sipush 1749
      // 04b: ldc2_w 3194252105357629876
      // 04e: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 051: invokevirtual com/finalshell/core/UJ.V (B)V
      // 054: aload 5
      // 056: sipush -8857
      // 059: sipush -32327
      // 05c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 05f: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 062: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 065: aload 5
      // 067: bipush 1
      // 068: invokevirtual com/finalshell/core/UJ.V (B)V
      // 06b: aload 5
      // 06d: aload 7
      // 06f: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 072: invokevirtual com/finalshell/core/UJ.q ([B)V
      // 075: aload 5
      // 077: iload 2
      // 078: invokevirtual com/finalshell/core/UJ.u (I)V
      // 07b: aload 0
      // 07c: aload 6
      // 07e: invokevirtual com/finalshell/crypto/ConnectHost.D (Lcom/finalshell/core/YU;)V
      // 081: goto 09d
      // 084: astore 8
      // 086: aload 0
      // 087: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 08a: aconst_null
      // 08b: invokevirtual com/finalshell/core/Fw2.V (Ljava/lang/Thread;)V
      // 08e: new com/finalshell/core/Pc2
      // 091: dup
      // 092: aload 8
      // 094: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 097: aload 8
      // 099: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 09c: athrow
      // 09d: bipush 0
      // 09e: istore 8
      // 0a0: aload 0
      // 0a1: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 0a4: invokevirtual com/finalshell/core/Fw2.G ()I
      // 0a7: istore 9
      // 0a9: iload 8
      // 0ab: sipush 1142
      // 0ae: ldc2_w 894528359454743333
      // 0b1: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0b4: if_icmpge 0f4
      // 0b7: iload 9
      // 0b9: bipush -1
      // 0ba: iload 3
      // 0bb: ifne 10a
      // 0be: iload 3
      // 0bf: ifne 10a
      // 0c2: goto 0c9
      // 0c5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: if_icmpne 0f4
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: sipush 25406
      // 0d6: ldc2_w 5520454841709898649
      // 0d9: invokestatic com/finalshell/crypto/ConnectHost.b (IJ)J
      // 0dc: invokestatic java/lang/Thread.sleep (J)V
      // 0df: goto 0e4
      // 0e2: astore 10
      // 0e4: iinc 8 1
      // 0e7: aload 0
      // 0e8: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 0eb: invokevirtual com/finalshell/core/Fw2.G ()I
      // 0ee: istore 9
      // 0f0: iload 3
      // 0f1: ifeq 0a9
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 0f8: aconst_null
      // 0f9: invokevirtual com/finalshell/core/Fw2.V (Ljava/lang/Thread;)V
      // 0fc: iload 9
      // 0fe: iload 3
      // 0ff: ifne 13a
      // 102: bipush 1
      // 103: goto 10a
      // 106: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: if_icmpeq 133
      // 10d: new com/finalshell/core/Pc2
      // 110: dup
      // 111: new java/lang/StringBuilder
      // 114: dup
      // 115: invokespecial java/lang/StringBuilder.<init> ()V
      // 118: sipush -8810
      // 11b: sipush -5307
      // 11e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: iload 2
      // 125: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 128: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12b: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 12e: athrow
      // 12f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 0
      // 134: getfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 137: invokevirtual com/finalshell/core/Fw2.o ()I
      // 13a: istore 2
      // 13b: aload 4
      // 13d: monitorexit
      // 13e: goto 149
      // 141: astore 11
      // 143: aload 4
      // 145: monitorexit
      // 146: aload 11
      // 148: athrow
      // 149: iload 2
      // 14a: ireturn
   }

   public void u(int var1) throws Pc2 {
      this.t(null, var1);
   }

   public void t(String var1, int var2) throws Pc2 {
      DS3.c(this, var1, var2);
   }

   public void V(String param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/crypto/ConnectHost.v Lcom/finalshell/core/OD;
      // 007: astore 3
      // 008: istore 2
      // 009: aload 1
      // 00a: iload 2
      // 00b: ifne 04b
      // 00e: sipush -8865
      // 011: sipush -13504
      // 014: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 017: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01a: ifeq 046
      // 01d: goto 024
      // 020: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 0
      // 025: aconst_null
      // 026: putfield com/finalshell/crypto/ConnectHost.v Lcom/finalshell/core/OD;
      // 029: aload 3
      // 02a: iload 2
      // 02b: ifne 040
      // 02e: goto 035
      // 031: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: ifnull 045
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: aload 3
      // 040: invokeinterface com/finalshell/core/OD.F ()V 1
      // 045: return
      // 046: aload 0
      // 047: aload 1
      // 048: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 04b: astore 4
      // 04d: aload 4
      // 04f: iload 2
      // 050: ifne 05e
      // 053: ifnull 142
      // 056: goto 05d
      // 059: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 1
      // 05e: iload 2
      // 05f: ifne 0b5
      // 062: sipush -8798
      // 065: sipush -9217
      // 068: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 06b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06e: ifne 0b3
      // 071: goto 078
      // 074: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: getfield com/finalshell/crypto/ConnectHost.H Z
      // 07c: iload 2
      // 07d: ifne 0b0
      // 080: goto 087
      // 083: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: ifeq 142
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 1
      // 092: iload 2
      // 093: ifne 0b5
      // 096: goto 09d
      // 099: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: sipush -8871
      // 0a0: sipush -22063
      // 0a3: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: ifeq 142
      // 0b3: aload 4
      // 0b5: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0b8: ldc_w com/finalshell/core/OD
      // 0bb: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 0be: astore 5
      // 0c0: sipush 26688
      // 0c3: aload 0
      // 0c4: aload 5
      // 0c6: bipush 0
      // 0c7: anewarray 607
      // 0ca: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0cd: bipush 0
      // 0ce: anewarray 4
      // 0d1: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0d4: checkcast com/finalshell/core/OD
      // 0d7: putfield com/finalshell/crypto/ConnectHost.v Lcom/finalshell/core/OD;
      // 0da: ldc2_w 5499307281655199511
      // 0dd: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0e0: istore 6
      // 0e2: aload 0
      // 0e3: sipush -8786
      // 0e6: sipush 6333
      // 0e9: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0ec: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0ef: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0f2: istore 6
      // 0f4: goto 0f9
      // 0f7: astore 7
      // 0f9: aload 0
      // 0fa: getfield com/finalshell/crypto/ConnectHost.v Lcom/finalshell/core/OD;
      // 0fd: bipush 1
      // 0fe: iload 6
      // 100: aload 0
      // 101: invokeinterface com/finalshell/core/OD.O (IILcom/finalshell/crypto/ConnectHost;)V 4
      // 106: aload 3
      // 107: iload 2
      // 108: ifne 10f
      // 10b: ifnull 142
      // 10e: aload 3
      // 10f: invokeinterface com/finalshell/core/OD.F ()V 1
      // 114: goto 142
      // 117: astore 5
      // 119: new com/finalshell/core/Pc2
      // 11c: dup
      // 11d: aload 5
      // 11f: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 122: aload 5
      // 124: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 127: athrow
      // 128: astore 8
      // 12a: aload 3
      // 12b: iload 2
      // 12c: ifne 13a
      // 12f: ifnull 13f
      // 132: goto 139
      // 135: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: aload 3
      // 13a: invokeinterface com/finalshell/core/OD.F ()V 1
      // 13f: aload 8
      // 141: athrow
      // 142: return
   }

   public void W$void(String param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/crypto/ConnectHost.iK Lcom/finalshell/core/OD;
      // 007: astore 3
      // 008: istore 2
      // 009: aload 1
      // 00a: iload 2
      // 00b: ifne 04b
      // 00e: sipush -8875
      // 011: sipush -15282
      // 014: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 017: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 01a: ifeq 046
      // 01d: goto 024
      // 020: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 0
      // 025: aconst_null
      // 026: putfield com/finalshell/crypto/ConnectHost.iK Lcom/finalshell/core/OD;
      // 029: aload 3
      // 02a: iload 2
      // 02b: ifne 040
      // 02e: goto 035
      // 031: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: ifnull 045
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: aload 3
      // 040: invokeinterface com/finalshell/core/OD.F ()V 1
      // 045: return
      // 046: aload 0
      // 047: aload 1
      // 048: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 04b: astore 4
      // 04d: aload 4
      // 04f: iload 2
      // 050: ifne 05e
      // 053: ifnull 11f
      // 056: goto 05d
      // 059: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 1
      // 05e: iload 2
      // 05f: ifne 0b5
      // 062: sipush -8923
      // 065: sipush -10618
      // 068: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 06b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06e: ifne 0b3
      // 071: goto 078
      // 074: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: getfield com/finalshell/crypto/ConnectHost.H Z
      // 07c: iload 2
      // 07d: ifne 0b0
      // 080: goto 087
      // 083: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: ifeq 11f
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 1
      // 092: iload 2
      // 093: ifne 0b5
      // 096: goto 09d
      // 099: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: sipush -8846
      // 0a0: sipush 7698
      // 0a3: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: ifeq 11f
      // 0b3: aload 4
      // 0b5: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0b8: ldc_w com/finalshell/core/OD
      // 0bb: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 0be: astore 5
      // 0c0: aload 0
      // 0c1: aload 5
      // 0c3: bipush 0
      // 0c4: anewarray 607
      // 0c7: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0ca: bipush 0
      // 0cb: anewarray 4
      // 0ce: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0d1: checkcast com/finalshell/core/OD
      // 0d4: putfield com/finalshell/crypto/ConnectHost.iK Lcom/finalshell/core/OD;
      // 0d7: aload 0
      // 0d8: getfield com/finalshell/crypto/ConnectHost.iK Lcom/finalshell/core/OD;
      // 0db: bipush 0
      // 0dc: bipush 0
      // 0dd: aload 0
      // 0de: invokeinterface com/finalshell/core/OD.O (IILcom/finalshell/crypto/ConnectHost;)V 4
      // 0e3: aload 3
      // 0e4: iload 2
      // 0e5: ifne 0ec
      // 0e8: ifnull 11f
      // 0eb: aload 3
      // 0ec: invokeinterface com/finalshell/core/OD.F ()V 1
      // 0f1: goto 11f
      // 0f4: astore 5
      // 0f6: new com/finalshell/core/Pc2
      // 0f9: dup
      // 0fa: aload 5
      // 0fc: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 0ff: aload 5
      // 101: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 104: athrow
      // 105: astore 6
      // 107: aload 3
      // 108: iload 2
      // 109: ifne 117
      // 10c: ifnull 11c
      // 10f: goto 116
      // 112: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 3
      // 117: invokeinterface com/finalshell/core/OD.F ()V 1
      // 11c: aload 6
      // 11e: athrow
      // 11f: return
   }

   public void j(Dm4 var1) {
      var1.D(this);
   }

   public String[] P$arrString() {
      return this.id;
   }

   public void s(Ic4 var1) {
      this.P = var1;
   }

   public void L(String var1) {
      this.V = var1;
   }

   public void L(int var1) {
      this.x = var1;
   }

   public void R(String var1) {
      this.g = var1;
   }

   public void Q(Gq2 var1) {
      this.Y = var1;
   }

   public Gq2 N() {
      return this.Y;
   }

   public void t(InputStream var1) {
      this.O = var1;
   }

   public void P(OutputStream var1) {
      this.l = var1;
   }

   public void m(String var1) {
      De4.N(var1);
   }

   public void E(int var1) {
      De4.o(var1);
   }

   public void O(String var1) {
      De4.n(var1);
   }

   public void z(String var1) {
      try {
         if (var1 != null) {
            this.iS = E8.J(var1);
         }
      } catch (SecurityException var2) {
         throw a(var2);
      }
   }

   public void d(byte[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 23
      // 09: ifnull 2e
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: arraylength
      // 16: newarray 8
      // 18: putfield com/finalshell/crypto/ConnectHost.iS [B
      // 1b: aload 1
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: bipush 0
      // 24: aload 0
      // 25: getfield com/finalshell/crypto/ConnectHost.iS [B
      // 28: bipush 0
      // 29: aload 1
      // 2a: arraylength
      // 2b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2e: return
   }

   public void o(Properties var1) {
      boolean var10000 = Dm4.F$boolean();
      Hashtable var3 = new Hashtable();
      boolean var2 = var10000;
      Iterator var4 = var1.stringPropertyNames().iterator();

      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();

            try {
               var3.put(var5, var1.getProperty(var5));
               if (!var2) {
                  break;
               }

               if (var2) {
                  continue;
               }
            } catch (SecurityException var6) {
               throw a(var6);
            }
         }

         this.W(var3);
         break;
      }
   }

   public void W(Hashtable param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/crypto/ConnectHost.S Ljava/lang/Object;
      // 07: dup
      // 08: astore 3
      // 09: monitorenter
      // 0a: istore 2
      // 0b: aload 0
      // 0c: getfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 0f: iload 2
      // 10: ifeq 30
      // 13: ifnonnull 2f
      // 16: goto 1d
      // 19: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: new java/util/Hashtable
      // 21: dup
      // 22: invokespecial java/util/Hashtable.<init> ()V
      // 25: putfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual java/util/Hashtable.keys ()Ljava/util/Enumeration;
      // 33: astore 4
      // 35: aload 4
      // 37: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 3c: ifeq ef
      // 3f: aload 4
      // 41: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 46: checkcast java/lang/String
      // 49: astore 5
      // 4b: aload 5
      // 4d: iload 2
      // 4e: ifeq f0
      // 51: iload 2
      // 52: ifeq 82
      // 55: goto 5c
      // 58: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: sipush -8926
      // 5f: sipush 3767
      // 62: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 65: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 68: ifeq 85
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: sipush -8878
      // 75: sipush -15633
      // 78: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: goto 87
      // 85: aload 5
      // 87: astore 6
      // 89: aload 1
      // 8a: aload 5
      // 8c: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 8f: checkcast java/lang/String
      // 92: astore 7
      // 94: aload 6
      // 96: iload 2
      // 97: ifeq ea
      // 9a: sipush -8883
      // 9d: sipush -20843
      // a0: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // a3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a6: ifeq df
      // a9: goto b0
      // ac: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af: athrow
      // b0: aload 7
      // b2: iload 2
      // b3: ifeq ea
      // b6: goto bd
      // b9: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bc: athrow
      // bd: sipush -8905
      // c0: sipush 9495
      // c3: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // c6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // c9: ifne df
      // cc: goto d3
      // cf: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d2: athrow
      // d3: aload 0
      // d4: aconst_null
      // d5: putfield com/finalshell/crypto/ConnectHost.id [Ljava/lang/String;
      // d8: goto df
      // db: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // de: athrow
      // df: aload 0
      // e0: getfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // e3: aload 6
      // e5: aload 7
      // e7: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // ea: pop
      // eb: iload 2
      // ec: ifne 35
      // ef: aload 3
      // f0: monitorexit
      // f1: goto fb
      // f4: astore 8
      // f6: aload 3
      // f7: monitorexit
      // f8: aload 8
      // fa: athrow
      // fb: return
   }

   public void b(String param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/crypto/ConnectHost.S Ljava/lang/Object;
      // 07: dup
      // 08: astore 4
      // 0a: monitorenter
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 26
      // 11: getfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 14: ifnonnull 30
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: new java/util/Hashtable
      // 29: dup
      // 2a: invokespecial java/util/Hashtable.<init> ()V
      // 2d: putfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 30: aload 1
      // 31: sipush -8825
      // 34: sipush 2297
      // 37: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3d: iload 3
      // 3e: ifne 87
      // 41: ifeq 68
      // 44: goto 4b
      // 47: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 4f: sipush -8878
      // 52: sipush -15633
      // 55: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 58: aload 2
      // 59: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 5c: pop
      // 5d: iload 3
      // 5e: ifeq c2
      // 61: goto 68
      // 64: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: aload 1
      // 69: iload 3
      // 6a: ifne c1
      // 6d: goto 74
      // 70: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: sipush -8883
      // 77: sipush -20843
      // 7a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 7d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 80: goto 87
      // 83: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: ifeq b8
      // 8a: aload 2
      // 8b: iload 3
      // 8c: ifne c1
      // 8f: goto 96
      // 92: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: sipush -8905
      // 99: sipush 9495
      // 9c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 9f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a2: ifne b8
      // a5: goto ac
      // a8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab: athrow
      // ac: aload 0
      // ad: aconst_null
      // ae: putfield com/finalshell/crypto/ConnectHost.id [Ljava/lang/String;
      // b1: goto b8
      // b4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b7: athrow
      // b8: aload 0
      // b9: getfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // bc: aload 1
      // bd: aload 2
      // be: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // c1: pop
      // c2: aload 4
      // c4: monitorexit
      // c5: goto d0
      // c8: astore 5
      // ca: aload 4
      // cc: monitorexit
      // cd: aload 5
      // cf: athrow
      // d0: return
   }

   public String T(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 2f
      // 09: sipush -8926
      // 0c: sipush 3767
      // 0f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 12: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15: ifeq 30
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: sipush -8878
      // 22: sipush -15633
      // 25: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: astore 1
      // 30: aconst_null
      // 31: astore 3
      // 32: aload 0
      // 33: getfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 36: iload 2
      // 37: ifne 53
      // 3a: ifnull 72
      // 3d: goto 44
      // 40: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 48: aload 1
      // 49: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: astore 3
      // 54: aload 3
      // 55: iload 2
      // 56: ifne 6e
      // 59: instanceof java/lang/String
      // 5c: ifeq 72
      // 5f: goto 66
      // 62: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 3
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: checkcast java/lang/String
      // 71: areturn
      // 72: aload 1
      // 73: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 76: astore 3
      // 77: aload 3
      // 78: iload 2
      // 79: ifne 94
      // 7c: instanceof java/lang/String
      // 7f: ifeq 95
      // 82: goto 89
      // 85: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 3
      // 8a: checkcast java/lang/String
      // 8d: goto 94
      // 90: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: areturn
      // 95: aconst_null
      // 96: areturn
   }

   public void q(PJ3 var1) {
      this.K = var1;
   }

   public boolean t$boolean() {
      return this.iJ;
   }

   public int y() {
      return this.iD;
   }

   public void d(int param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 08: iload 2
      // 09: ifeq 40
      // 0c: ifnonnull 3c
      // 0f: goto 16
      // 12: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: iload 1
      // 17: ifge 36
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: new com/finalshell/core/Pc2
      // 24: dup
      // 25: sipush -8743
      // 28: sipush -29194
      // 2b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 2e: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 31: athrow
      // 32: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: iload 1
      // 38: putfield com/finalshell/crypto/ConnectHost.iD I
      // 3b: return
      // 3c: aload 0
      // 3d: getfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 40: iload 1
      // 41: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 44: aload 0
      // 45: iload 1
      // 46: putfield com/finalshell/crypto/ConnectHost.iD I
      // 49: goto 5a
      // 4c: astore 3
      // 4d: new com/finalshell/core/Pc2
      // 50: dup
      // 51: aload 3
      // 52: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 55: aload 3
      // 56: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 59: athrow
      // 5a: return
   }

   public String O$String() {
      return E8.B(this.i0);
   }

   public String U$String() {
      return E8.B(this.ii);
   }

   public void j(String var1) {
      this.ii = E8.J(var1);
   }

   public void n() throws Exception {
      UJ var1 = new UJ();
      YU var2 = new YU(var1);
      var2.M();
      var1.V((byte)2);
      this.D(var2);
   }

   public void U$void() throws Exception {
      UJ var1 = new UJ();
      YU var2 = new YU(var1);
      var2.M();
      var1.V((byte)a(1749, 3194252105357629876L));
      var1.q(c);
      var1.V((byte)1);
      this.D(var2);
   }

   public void r$void() throws Exception {
      UJ var1 = new UJ();
      YU var2 = new YU(var1);
      var2.M();
      var1.V((byte)a(3478, 9220394196597347049L));
      var1.q(iy);
      var1.V((byte)0);
      this.D(var2);
   }

   public DQ Z() {
      return this.iM;
   }

   public String o() {
      return this.V;
   }

   public String t$String() {
      return this.g;
   }

   public int f() {
      return this.x;
   }

   public void i$void(String var1) {
      this.in = var1;
   }

   public String R() {
      return this.in;
   }

   public void H(int var1) throws Pc2 {
      this.d(var1);
      this.i4 = var1;
   }

   public int m$int() {
      return this.i4;
   }

   public void G(int var1) {
      this.f = var1;
   }

   public int C$int() {
      return this.f;
   }

   public void H(boolean var1) {
      this.ih = var1;
   }

   public String[] Q(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 014
      // 009: ifnull 025
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aload 1
      // 014: invokevirtual java/lang/String.length ()I
      // 017: iload 2
      // 018: ifne 040
      // 01b: ifne 02b
      // 01e: goto 025
      // 021: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aconst_null
      // 026: areturn
      // 027: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 0
      // 02c: iload 2
      // 02d: ifne 06f
      // 030: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 033: bipush 1
      // 034: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 039: goto 040
      // 03c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: ifeq 06e
      // 043: aload 0
      // 044: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 047: bipush 1
      // 048: new java/lang/StringBuilder
      // 04b: dup
      // 04c: invokespecial java/lang/StringBuilder.<init> ()V
      // 04f: sipush -8913
      // 052: sipush 32428
      // 055: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 058: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05b: aload 1
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 062: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aload 0
      // 06f: sipush -8783
      // 072: sipush 3069
      // 075: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 078: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 07b: astore 3
      // 07c: aload 0
      // 07d: sipush -8847
      // 080: sipush -26483
      // 083: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 086: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 089: astore 4
      // 08b: new java/util/Vector
      // 08e: dup
      // 08f: invokespecial java/util/Vector.<init> ()V
      // 092: astore 5
      // 094: aload 1
      // 095: ldc_w ","
      // 098: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 09b: astore 6
      // 09d: bipush 0
      // 09e: istore 7
      // 0a0: iload 7
      // 0a2: aload 6
      // 0a4: arraylength
      // 0a5: if_icmpge 11f
      // 0a8: aload 6
      // 0aa: iload 7
      // 0ac: aaload
      // 0ad: astore 8
      // 0af: aload 4
      // 0b1: aload 8
      // 0b3: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0b6: iload 2
      // 0b7: ifne 124
      // 0ba: iload 2
      // 0bb: ifne 107
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: bipush -1
      // 0c6: if_icmpne 0f7
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: aload 3
      // 0d1: aload 8
      // 0d3: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0d6: iload 2
      // 0d7: ifne 107
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: bipush -1
      // 0e2: if_icmpne 0f7
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: iload 2
      // 0ed: ifeq 118
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: aload 8
      // 0fa: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0fd: invokestatic com/finalshell/crypto/ConnectHost.X (Ljava/lang/String;)Z
      // 100: goto 107
      // 103: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: ifne 118
      // 10a: aload 5
      // 10c: aload 8
      // 10e: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 111: goto 118
      // 114: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: iinc 7 1
      // 11b: iload 2
      // 11c: ifeq 0a0
      // 11f: aload 5
      // 121: invokevirtual java/util/Vector.size ()I
      // 124: iload 2
      // 125: ifne 13d
      // 128: ifne 138
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: aconst_null
      // 133: areturn
      // 134: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 5
      // 13a: invokevirtual java/util/Vector.size ()I
      // 13d: anewarray 160
      // 140: astore 7
      // 142: aload 5
      // 144: invokevirtual java/util/Vector.toArray ()[Ljava/lang/Object;
      // 147: bipush 0
      // 148: aload 7
      // 14a: bipush 0
      // 14b: aload 5
      // 14d: invokevirtual java/util/Vector.size ()I
      // 150: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 153: aload 0
      // 154: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 157: bipush 1
      // 158: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 15d: iload 2
      // 15e: ifne 16c
      // 161: ifeq 1a5
      // 164: goto 16b
      // 167: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: bipush 0
      // 16c: istore 8
      // 16e: iload 8
      // 170: aload 7
      // 172: arraylength
      // 173: if_icmpge 1a5
      // 176: aload 0
      // 177: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 17a: bipush 1
      // 17b: new java/lang/StringBuilder
      // 17e: dup
      // 17f: invokespecial java/lang/StringBuilder.<init> ()V
      // 182: aload 7
      // 184: iload 8
      // 186: aaload
      // 187: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18a: sipush -8726
      // 18d: sipush -30073
      // 190: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 193: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 196: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 199: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 19e: iinc 8 1
      // 1a1: iload 2
      // 1a2: ifeq 16e
      // 1a5: aload 7
      // 1a7: areturn
   }

   public static boolean X(String var0) {
      try {
         Class var1 = Class.forName(var0).asSubclass(EU.class);
         EU var2 = (EU)var1.getDeclaredConstructor().newInstance();
         var2.z(0, new byte[var2.u()], new byte[var2.w()]);
         return true;
      } catch (NoClassDefFoundError | Exception var3) {
         return false;
      }
   }

   public String[] C(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 014
      // 009: ifnull 025
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aload 1
      // 014: invokevirtual java/lang/String.length ()I
      // 017: iload 2
      // 018: ifne 040
      // 01b: ifne 02b
      // 01e: goto 025
      // 021: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aconst_null
      // 026: areturn
      // 027: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 0
      // 02c: iload 2
      // 02d: ifne 06f
      // 030: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 033: bipush 1
      // 034: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 039: goto 040
      // 03c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: ifeq 06e
      // 043: aload 0
      // 044: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 047: bipush 1
      // 048: new java/lang/StringBuilder
      // 04b: dup
      // 04c: invokespecial java/lang/StringBuilder.<init> ()V
      // 04f: sipush -8949
      // 052: sipush 26453
      // 055: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 058: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05b: aload 1
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 062: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aload 0
      // 06f: sipush -8956
      // 072: sipush -15706
      // 075: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 078: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 07b: astore 3
      // 07c: aload 0
      // 07d: sipush -8921
      // 080: sipush -24864
      // 083: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 086: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 089: astore 4
      // 08b: new java/util/Vector
      // 08e: dup
      // 08f: invokespecial java/util/Vector.<init> ()V
      // 092: astore 5
      // 094: aload 1
      // 095: ldc_w ","
      // 098: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 09b: astore 6
      // 09d: bipush 0
      // 09e: istore 7
      // 0a0: iload 7
      // 0a2: aload 6
      // 0a4: arraylength
      // 0a5: if_icmpge 11f
      // 0a8: aload 6
      // 0aa: iload 7
      // 0ac: aaload
      // 0ad: astore 8
      // 0af: aload 4
      // 0b1: aload 8
      // 0b3: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0b6: iload 2
      // 0b7: ifne 124
      // 0ba: iload 2
      // 0bb: ifne 107
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: bipush -1
      // 0c6: if_icmpne 0f7
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: aload 3
      // 0d1: aload 8
      // 0d3: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0d6: iload 2
      // 0d7: ifne 107
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: bipush -1
      // 0e2: if_icmpne 0f7
      // 0e5: goto 0ec
      // 0e8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: iload 2
      // 0ed: ifeq 118
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: aload 8
      // 0fa: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 0fd: invokestatic com/finalshell/crypto/ConnectHost.v (Ljava/lang/String;)Z
      // 100: goto 107
      // 103: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: ifne 118
      // 10a: aload 5
      // 10c: aload 8
      // 10e: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 111: goto 118
      // 114: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: iinc 7 1
      // 11b: iload 2
      // 11c: ifeq 0a0
      // 11f: aload 5
      // 121: invokevirtual java/util/Vector.size ()I
      // 124: iload 2
      // 125: ifne 13d
      // 128: ifne 138
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: aconst_null
      // 133: areturn
      // 134: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 5
      // 13a: invokevirtual java/util/Vector.size ()I
      // 13d: anewarray 160
      // 140: astore 7
      // 142: aload 5
      // 144: invokevirtual java/util/Vector.toArray ()[Ljava/lang/Object;
      // 147: bipush 0
      // 148: aload 7
      // 14a: bipush 0
      // 14b: aload 5
      // 14d: invokevirtual java/util/Vector.size ()I
      // 150: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 153: aload 0
      // 154: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 157: bipush 1
      // 158: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 15d: iload 2
      // 15e: ifne 16c
      // 161: ifeq 1a5
      // 164: goto 16b
      // 167: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: bipush 0
      // 16c: istore 8
      // 16e: iload 8
      // 170: aload 7
      // 172: arraylength
      // 173: if_icmpge 1a5
      // 176: aload 0
      // 177: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 17a: bipush 1
      // 17b: new java/lang/StringBuilder
      // 17e: dup
      // 17f: invokespecial java/lang/StringBuilder.<init> ()V
      // 182: aload 7
      // 184: iload 8
      // 186: aaload
      // 187: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18a: sipush -8953
      // 18d: sipush -27245
      // 190: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 193: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 196: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 199: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 19e: iinc 8 1
      // 1a1: iload 2
      // 1a2: ifeq 16e
      // 1a5: aload 7
      // 1a7: areturn
   }

   public static boolean v(String var0) {
      try {
         Class var1 = Class.forName(var0).asSubclass(FP.class);
         FP var2 = (FP)var1.getDeclaredConstructor().newInstance();
         var2.L(new byte[var2.h()]);
         return true;
      } catch (NoClassDefFoundError | Exception var3) {
         return false;
      }
   }

   public String[] W$arrString(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 014
      // 009: ifnull 025
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aload 1
      // 014: invokevirtual java/lang/String.length ()I
      // 017: iload 2
      // 018: ifne 040
      // 01b: ifne 02b
      // 01e: goto 025
      // 021: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aconst_null
      // 026: areturn
      // 027: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 0
      // 02c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 02f: bipush 1
      // 030: iload 2
      // 031: ifne 04f
      // 034: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 039: goto 040
      // 03c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: ifeq 06e
      // 043: aload 0
      // 044: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 047: bipush 1
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: new java/lang/StringBuilder
      // 052: dup
      // 053: invokespecial java/lang/StringBuilder.<init> ()V
      // 056: sipush -8870
      // 059: sipush 20682
      // 05c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 05f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 062: aload 1
      // 063: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 069: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 06e: new java/util/Vector
      // 071: dup
      // 072: invokespecial java/util/Vector.<init> ()V
      // 075: astore 3
      // 076: aload 1
      // 077: ldc_w ","
      // 07a: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 07d: astore 4
      // 07f: bipush 0
      // 080: istore 5
      // 082: iload 5
      // 084: aload 4
      // 086: arraylength
      // 087: if_icmpge 0bc
      // 08a: aload 0
      // 08b: aload 0
      // 08c: aload 4
      // 08e: iload 5
      // 090: aaload
      // 091: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 094: invokestatic com/finalshell/crypto/ConnectHost.m (Lcom/finalshell/crypto/ConnectHost;Ljava/lang/String;)Z
      // 097: iload 2
      // 098: ifne 0c0
      // 09b: ifne 0b5
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 3
      // 0a6: aload 4
      // 0a8: iload 5
      // 0aa: aaload
      // 0ab: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: iinc 5 1
      // 0b8: iload 2
      // 0b9: ifeq 082
      // 0bc: aload 3
      // 0bd: invokevirtual java/util/Vector.size ()I
      // 0c0: iload 2
      // 0c1: ifne 0d8
      // 0c4: ifne 0d4
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aconst_null
      // 0cf: areturn
      // 0d0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: aload 3
      // 0d5: invokevirtual java/util/Vector.size ()I
      // 0d8: anewarray 160
      // 0db: astore 5
      // 0dd: aload 3
      // 0de: invokevirtual java/util/Vector.toArray ()[Ljava/lang/Object;
      // 0e1: bipush 0
      // 0e2: aload 5
      // 0e4: bipush 0
      // 0e5: aload 3
      // 0e6: invokevirtual java/util/Vector.size ()I
      // 0e9: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0ec: aload 0
      // 0ed: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 0f0: bipush 1
      // 0f1: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 0f6: iload 2
      // 0f7: ifne 105
      // 0fa: ifeq 13e
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: bipush 0
      // 105: istore 6
      // 107: iload 6
      // 109: aload 5
      // 10b: arraylength
      // 10c: if_icmpge 13e
      // 10f: aload 0
      // 110: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 113: bipush 1
      // 114: new java/lang/StringBuilder
      // 117: dup
      // 118: invokespecial java/lang/StringBuilder.<init> ()V
      // 11b: aload 5
      // 11d: iload 6
      // 11f: aaload
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: sipush -8953
      // 126: sipush -27245
      // 129: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 132: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 137: iinc 6 1
      // 13a: iload 2
      // 13b: ifeq 107
      // 13e: aload 5
      // 140: areturn
   }

   public static boolean m(ConnectHost var0, String var1) {
      try {
         Class var2 = Class.forName(var1).asSubclass(Cv2.class);
         Cv2 var3 = (Cv2)var2.getDeclaredConstructor().newInstance();
         var3.m(var0, null, null, null, null);
         return true;
      } catch (NoClassDefFoundError | Exception var4) {
         return false;
      }
   }

   public String[] h(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 014
      // 009: ifnull 025
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aload 1
      // 014: invokevirtual java/lang/String.length ()I
      // 017: iload 2
      // 018: ifne 040
      // 01b: ifne 02b
      // 01e: goto 025
      // 021: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aconst_null
      // 026: areturn
      // 027: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 0
      // 02c: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 02f: bipush 1
      // 030: iload 2
      // 031: ifne 04f
      // 034: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 039: goto 040
      // 03c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: ifeq 06e
      // 043: aload 0
      // 044: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 047: bipush 1
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: new java/lang/StringBuilder
      // 052: dup
      // 053: invokespecial java/lang/StringBuilder.<init> ()V
      // 056: sipush -8774
      // 059: sipush -3326
      // 05c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 05f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 062: aload 1
      // 063: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 069: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 06e: new java/util/Vector
      // 071: dup
      // 072: invokespecial java/util/Vector.<init> ()V
      // 075: astore 3
      // 076: aload 1
      // 077: ldc_w ","
      // 07a: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 07d: astore 4
      // 07f: bipush 0
      // 080: istore 5
      // 082: iload 5
      // 084: aload 4
      // 086: arraylength
      // 087: if_icmpge 0d2
      // 08a: aload 4
      // 08c: iload 5
      // 08e: aaload
      // 08f: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 092: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 095: ldc_w com/finalshell/core/Al2
      // 098: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 09b: astore 6
      // 09d: aload 6
      // 09f: bipush 0
      // 0a0: anewarray 607
      // 0a3: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0a6: bipush 0
      // 0a7: anewarray 4
      // 0aa: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0ad: checkcast com/finalshell/core/Al2
      // 0b0: astore 7
      // 0b2: aload 7
      // 0b4: invokeinterface com/finalshell/core/Al2.k$void ()V 1
      // 0b9: iload 2
      // 0ba: ifne 0ea
      // 0bd: goto 0cb
      // 0c0: astore 6
      // 0c2: aload 3
      // 0c3: aload 4
      // 0c5: iload 5
      // 0c7: aaload
      // 0c8: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 0cb: iinc 5 1
      // 0ce: iload 2
      // 0cf: ifeq 082
      // 0d2: aload 3
      // 0d3: invokevirtual java/util/Vector.size ()I
      // 0d6: iload 2
      // 0d7: ifne 0ee
      // 0da: ifne 0ea
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: aconst_null
      // 0e5: areturn
      // 0e6: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 3
      // 0eb: invokevirtual java/util/Vector.size ()I
      // 0ee: anewarray 160
      // 0f1: astore 5
      // 0f3: aload 3
      // 0f4: invokevirtual java/util/Vector.toArray ()[Ljava/lang/Object;
      // 0f7: bipush 0
      // 0f8: aload 5
      // 0fa: bipush 0
      // 0fb: aload 3
      // 0fc: invokevirtual java/util/Vector.size ()I
      // 0ff: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 102: aload 0
      // 103: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 106: bipush 1
      // 107: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 10c: iload 2
      // 10d: ifne 11b
      // 110: ifeq 154
      // 113: goto 11a
      // 116: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: bipush 0
      // 11b: istore 6
      // 11d: iload 6
      // 11f: aload 5
      // 121: arraylength
      // 122: if_icmpge 154
      // 125: aload 0
      // 126: invokevirtual com/finalshell/crypto/ConnectHost.W$GN ()Lcom/finalshell/core/GN;
      // 129: bipush 1
      // 12a: new java/lang/StringBuilder
      // 12d: dup
      // 12e: invokespecial java/lang/StringBuilder.<init> ()V
      // 131: aload 5
      // 133: iload 6
      // 135: aaload
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: sipush -8953
      // 13c: sipush -27245
      // 13f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 142: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 145: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 148: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 14d: iinc 6 1
      // 150: iload 2
      // 151: ifeq 11d
      // 154: aload 5
      // 156: areturn
   }

   public void T(Cd4 var1) {
      this.w = var1;
   }

   public Cd4 m$cd_4() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/crypto/ConnectHost.w Lcom/finalshell/core/Cd4;
      // 08: iload 1
      // 09: ifne 26
      // 0c: ifnonnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 1a: invokevirtual com/finalshell/core/Xe2.m ()Lcom/finalshell/core/Cd4;
      // 1d: areturn
      // 1e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/crypto/ConnectHost.w Lcom/finalshell/core/Cd4;
      // 26: areturn
   }

   public void f(RW var1) {
      this.q = var1;
   }

   public RW r$RW() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/crypto/ConnectHost.q Lcom/finalshell/core/RW;
      // 08: iload 1
      // 09: ifne 26
      // 0c: ifnonnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 1a: invokevirtual com/finalshell/core/Xe2.e ()Lcom/finalshell/core/RW;
      // 1d: areturn
      // 1e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/crypto/ConnectHost.q Lcom/finalshell/core/RW;
      // 26: areturn
   }

   public void Y$void() throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 007: invokevirtual com/finalshell/core/Xe2.h ()Lcom/finalshell/core/Fq2;
      // 00a: astore 2
      // 00b: istore 1
      // 00c: aload 2
      // 00d: iload 1
      // 00e: ifne 01d
      // 011: ifnonnull 01c
      // 014: goto 01b
      // 017: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: return
      // 01c: aload 2
      // 01d: aload 0
      // 01e: getfield com/finalshell/crypto/ConnectHost.U Ljava/lang/String;
      // 021: invokeinterface com/finalshell/core/Fq2.s (Ljava/lang/String;)Lcom/finalshell/core/IF; 2
      // 026: astore 3
      // 027: aconst_null
      // 028: astore 4
      // 02a: aload 0
      // 02b: getfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 02e: iload 1
      // 02f: ifne 049
      // 032: ifnonnull 068
      // 035: goto 03c
      // 038: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 3
      // 03d: invokeinterface com/finalshell/core/IF.o ()Ljava/lang/String; 1
      // 042: goto 049
      // 045: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: astore 4
      // 04b: aload 4
      // 04d: iload 1
      // 04e: ifne 076
      // 051: ifnull 068
      // 054: goto 05b
      // 057: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: aload 0
      // 05c: aload 4
      // 05e: putfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 061: goto 068
      // 064: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: aload 3
      // 069: iload 1
      // 06a: ifne 087
      // 06d: invokeinterface com/finalshell/core/IF.U ()Ljava/lang/String; 1
      // 072: astore 4
      // 074: aload 4
      // 076: ifnull 086
      // 079: aload 0
      // 07a: aload 4
      // 07c: putfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 07f: goto 086
      // 082: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: aload 3
      // 087: invokeinterface com/finalshell/core/IF.x ()I 1
      // 08c: istore 5
      // 08e: iload 1
      // 08f: ifne 1d5
      // 092: iload 5
      // 094: bipush -1
      // 095: if_icmpeq 0ac
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: iload 5
      // 0a2: putfield com/finalshell/crypto/ConnectHost.x I
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: aload 3
      // 0ae: sipush -8829
      // 0b1: sipush 30122
      // 0b4: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0b7: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 0ba: aload 0
      // 0bb: aload 3
      // 0bc: sipush -8806
      // 0bf: sipush 30005
      // 0c2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0c5: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 0c8: aload 0
      // 0c9: aload 3
      // 0ca: sipush -8872
      // 0cd: sipush -30715
      // 0d0: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0d3: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 0d6: aload 0
      // 0d7: aload 3
      // 0d8: sipush -8938
      // 0db: sipush -1787
      // 0de: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0e1: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 0e4: aload 0
      // 0e5: aload 3
      // 0e6: sipush -8856
      // 0e9: sipush 21330
      // 0ec: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0ef: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 0f2: aload 0
      // 0f3: aload 3
      // 0f4: sipush -8733
      // 0f7: sipush -21613
      // 0fa: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 0fd: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 100: aload 0
      // 101: aload 3
      // 102: sipush -8901
      // 105: sipush -2661
      // 108: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 10b: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 10e: aload 0
      // 10f: aload 3
      // 110: sipush -8929
      // 113: sipush -28645
      // 116: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 119: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 11c: aload 0
      // 11d: aload 3
      // 11e: sipush -8779
      // 121: sipush -10604
      // 124: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 127: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 12a: aload 0
      // 12b: aload 3
      // 12c: sipush -8915
      // 12f: sipush 4438
      // 132: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 135: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 138: aload 0
      // 139: aload 3
      // 13a: sipush -8747
      // 13d: sipush -2110
      // 140: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 143: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 146: aload 0
      // 147: aload 3
      // 148: sipush -8936
      // 14b: sipush 1510
      // 14e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 151: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 154: aload 0
      // 155: aload 3
      // 156: sipush -8889
      // 159: sipush 17750
      // 15c: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 15f: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 162: aload 0
      // 163: aload 3
      // 164: sipush -8830
      // 167: sipush 14024
      // 16a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 16d: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 170: aload 0
      // 171: aload 3
      // 172: sipush -8877
      // 175: sipush -31697
      // 178: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 17b: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 17e: aload 0
      // 17f: aload 3
      // 180: sipush -8960
      // 183: sipush 25297
      // 186: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 189: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 18c: aload 0
      // 18d: aload 3
      // 18e: sipush -8888
      // 191: sipush 23753
      // 194: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 197: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 19a: aload 0
      // 19b: aload 3
      // 19c: sipush -8887
      // 19f: sipush -2134
      // 1a2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1a5: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 1a8: aload 0
      // 1a9: aload 3
      // 1aa: sipush -8742
      // 1ad: sipush -28625
      // 1b0: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1b3: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 1b6: aload 0
      // 1b7: aload 3
      // 1b8: sipush -8793
      // 1bb: sipush -19927
      // 1be: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1c1: invokespecial com/finalshell/crypto/ConnectHost.d (Lcom/finalshell/core/IF;Ljava/lang/String;)V
      // 1c4: aload 3
      // 1c5: sipush -8805
      // 1c8: sipush -32665
      // 1cb: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1ce: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 1d3: astore 4
      // 1d5: aload 4
      // 1d7: iload 1
      // 1d8: ifne 209
      // 1db: ifnull 1f2
      // 1de: goto 1e5
      // 1e1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: aload 4
      // 1e8: invokevirtual com/finalshell/crypto/ConnectHost.i$void (Ljava/lang/String;)V
      // 1eb: goto 1f2
      // 1ee: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f1: athrow
      // 1f2: aload 3
      // 1f3: sipush -8866
      // 1f6: sipush 13198
      // 1f9: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1fc: iload 1
      // 1fd: ifne 230
      // 200: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 205: astore 4
      // 207: aload 4
      // 209: ifnull 226
      // 20c: new com/finalshell/core/Bb2
      // 20f: dup
      // 210: aload 0
      // 211: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 214: invokespecial com/finalshell/core/Bb2.<init> (Lcom/finalshell/core/Xe2;)V
      // 217: astore 6
      // 219: aload 6
      // 21b: aload 4
      // 21d: invokevirtual com/finalshell/core/Bb2.G (Ljava/lang/String;)V
      // 220: aload 0
      // 221: aload 6
      // 223: invokevirtual com/finalshell/crypto/ConnectHost.f (Lcom/finalshell/core/RW;)V
      // 226: aload 3
      // 227: sipush -8732
      // 22a: sipush -23287
      // 22d: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 230: invokeinterface com/finalshell/core/IF.G (Ljava/lang/String;)[Ljava/lang/String; 2
      // 235: astore 6
      // 237: iload 1
      // 238: ifne 362
      // 23b: aload 6
      // 23d: ifnull 351
      // 240: goto 247
      // 243: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 246: athrow
      // 247: aload 2
      // 248: ldc_w ""
      // 24b: invokeinterface com/finalshell/core/Fq2.s (Ljava/lang/String;)Lcom/finalshell/core/IF; 2
      // 250: sipush -8934
      // 253: sipush -16777
      // 256: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 259: invokeinterface com/finalshell/core/IF.G (Ljava/lang/String;)[Ljava/lang/String; 2
      // 25e: astore 7
      // 260: aload 7
      // 262: iload 1
      // 263: ifne 2a8
      // 266: ifnull 29d
      // 269: goto 270
      // 26c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: bipush 0
      // 271: istore 8
      // 273: iload 8
      // 275: aload 7
      // 277: arraylength
      // 278: if_icmpge 299
      // 27b: aload 0
      // 27c: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 27f: aload 7
      // 281: iload 8
      // 283: aaload
      // 284: invokevirtual com/finalshell/core/Xe2.L (Ljava/lang/String;)V
      // 287: iinc 8 1
      // 28a: iload 1
      // 28b: ifne 2aa
      // 28e: iload 1
      // 28f: ifeq 273
      // 292: goto 299
      // 295: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 298: athrow
      // 299: iload 1
      // 29a: ifeq 2aa
      // 29d: bipush 0
      // 29e: anewarray 160
      // 2a1: goto 2a8
      // 2a4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: astore 7
      // 2aa: aload 6
      // 2ac: arraylength
      // 2ad: aload 7
      // 2af: arraylength
      // 2b0: isub
      // 2b1: ifle 351
      // 2b4: new com/finalshell/core/Rm4
      // 2b7: dup
      // 2b8: aload 0
      // 2b9: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 2bc: invokevirtual com/finalshell/core/Xe2.m ()Lcom/finalshell/core/Cd4;
      // 2bf: bipush 1
      // 2c0: invokespecial com/finalshell/core/Rm4.<init> (Lcom/finalshell/core/Cd4;Z)V
      // 2c3: astore 8
      // 2c5: bipush 0
      // 2c6: istore 9
      // 2c8: iload 9
      // 2ca: aload 6
      // 2cc: arraylength
      // 2cd: if_icmpge 34b
      // 2d0: aload 6
      // 2d2: iload 9
      // 2d4: aaload
      // 2d5: astore 10
      // 2d7: iload 1
      // 2d8: ifne 362
      // 2db: bipush 0
      // 2dc: istore 11
      // 2de: iload 11
      // 2e0: aload 7
      // 2e2: arraylength
      // 2e3: if_icmpge 30f
      // 2e6: aload 10
      // 2e8: aload 7
      // 2ea: iload 11
      // 2ec: aaload
      // 2ed: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f0: iload 1
      // 2f1: ifne 2ca
      // 2f4: ifne 302
      // 2f7: iload 1
      // 2f8: ifeq 308
      // 2fb: goto 302
      // 2fe: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 301: athrow
      // 302: aconst_null
      // 303: astore 10
      // 305: goto 30f
      // 308: iinc 11 1
      // 30b: iload 1
      // 30c: ifeq 2de
      // 30f: aload 10
      // 311: iload 1
      // 312: ifne 333
      // 315: ifnonnull 32a
      // 318: goto 31f
      // 31b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31e: athrow
      // 31f: iload 1
      // 320: ifeq 344
      // 323: goto 32a
      // 326: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: aload 10
      // 32c: goto 333
      // 32f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 332: athrow
      // 333: aconst_null
      // 334: aload 0
      // 335: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 338: invokestatic com/finalshell/core/PW3.e (Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/core/Xe2;)Lcom/finalshell/core/PW3;
      // 33b: astore 11
      // 33d: aload 8
      // 33f: aload 11
      // 341: invokevirtual com/finalshell/core/Rm4.N (Lcom/finalshell/core/AB_2;)V
      // 344: iinc 9 1
      // 347: iload 1
      // 348: ifeq 2c8
      // 34b: aload 0
      // 34c: aload 8
      // 34e: invokevirtual com/finalshell/crypto/ConnectHost.T (Lcom/finalshell/core/Cd4;)V
      // 351: aload 3
      // 352: sipush -8954
      // 355: sipush -26119
      // 358: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 35b: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 360: astore 4
      // 362: aload 4
      // 364: iload 1
      // 365: ifne 397
      // 368: ifnull 384
      // 36b: goto 372
      // 36e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 371: athrow
      // 372: aload 0
      // 373: aload 4
      // 375: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 378: invokevirtual com/finalshell/crypto/ConnectHost.H (I)V
      // 37b: goto 384
      // 37e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 381: athrow
      // 382: astore 7
      // 384: aload 3
      // 385: sipush -8860
      // 388: sipush -11278
      // 38b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 38e: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 393: astore 4
      // 395: aload 4
      // 397: iload 1
      // 398: ifne 3ca
      // 39b: ifnull 3b7
      // 39e: goto 3a5
      // 3a1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a4: athrow
      // 3a5: aload 0
      // 3a6: aload 4
      // 3a8: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 3ab: invokevirtual com/finalshell/crypto/ConnectHost.d (I)V
      // 3ae: goto 3b7
      // 3b1: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b4: athrow
      // 3b5: astore 7
      // 3b7: aload 3
      // 3b8: sipush -8741
      // 3bb: sipush 24796
      // 3be: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3c1: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 3c6: astore 4
      // 3c8: aload 4
      // 3ca: iload 1
      // 3cb: ifne 401
      // 3ce: ifnull 3ee
      // 3d1: goto 3d8
      // 3d4: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d7: athrow
      // 3d8: aload 0
      // 3d9: sipush -8741
      // 3dc: sipush 24796
      // 3df: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3e2: aload 4
      // 3e4: invokevirtual com/finalshell/crypto/ConnectHost.b (Ljava/lang/String;Ljava/lang/String;)V
      // 3e7: goto 3ee
      // 3ea: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ed: athrow
      // 3ee: aload 3
      // 3ef: sipush -8820
      // 3f2: sipush -24277
      // 3f5: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 3f8: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 3fd: astore 4
      // 3ff: aload 4
      // 401: ifnull 41a
      // 404: aload 0
      // 405: sipush -8820
      // 408: sipush -24277
      // 40b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 40e: aload 4
      // 410: invokevirtual com/finalshell/crypto/ConnectHost.b (Ljava/lang/String;Ljava/lang/String;)V
      // 413: goto 41a
      // 416: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 419: athrow
      // 41a: return
   }

   public void E(Dq4 param1) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 07: invokevirtual com/finalshell/core/Xe2.h ()Lcom/finalshell/core/Fq2;
      // 0a: astore 3
      // 0b: istore 2
      // 0c: aload 3
      // 0d: iload 2
      // 0e: ifne 1d
      // 11: ifnonnull 1c
      // 14: goto 1b
      // 17: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: return
      // 1c: aload 3
      // 1d: aload 0
      // 1e: getfield com/finalshell/crypto/ConnectHost.U Ljava/lang/String;
      // 21: invokeinterface com/finalshell/core/Fq2.s (Ljava/lang/String;)Lcom/finalshell/core/IF; 2
      // 26: astore 4
      // 28: aconst_null
      // 29: astore 5
      // 2b: aload 4
      // 2d: sipush -8737
      // 30: sipush 25972
      // 33: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 36: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 3b: astore 5
      // 3d: aload 5
      // 3f: iload 2
      // 40: ifne 7a
      // 43: ifnull 66
      // 46: goto 4d
      // 49: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 1
      // 4e: aload 5
      // 50: sipush -8905
      // 53: sipush 9495
      // 56: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 59: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5c: invokevirtual com/finalshell/core/Dq4.y (Z)V
      // 5f: goto 66
      // 62: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 4
      // 68: sipush -8932
      // 6b: sipush -9849
      // 6e: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 71: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 76: astore 5
      // 78: aload 5
      // 7a: ifnull 96
      // 7d: aload 1
      // 7e: aload 5
      // 80: sipush -8905
      // 83: sipush 9495
      // 86: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 89: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 8c: invokevirtual com/finalshell/core/Dq4.u (Z)V
      // 8f: goto 96
      // 92: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: return
   }

   public void A() throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 31
      // 09: sipush -8820
      // 0c: sipush -24277
      // 0f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 12: invokevirtual com/finalshell/crypto/ConnectHost.T (Ljava/lang/String;)Ljava/lang/String;
      // 15: sipush -8819
      // 18: sipush -10110
      // 1b: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 1e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 21: ifeq 30
      // 24: goto 2b
      // 27: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: return
      // 2c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 34: invokevirtual com/finalshell/core/Xe2.h ()Lcom/finalshell/core/Fq2;
      // 37: astore 2
      // 38: aload 2
      // 39: iload 1
      // 3a: ifeq 49
      // 3d: ifnonnull 48
      // 40: goto 47
      // 43: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: return
      // 48: aload 2
      // 49: aload 0
      // 4a: getfield com/finalshell/crypto/ConnectHost.U Ljava/lang/String;
      // 4d: invokeinterface com/finalshell/core/Fq2.s (Ljava/lang/String;)Lcom/finalshell/core/IF; 2
      // 52: astore 3
      // 53: aload 3
      // 54: sipush -8928
      // 57: sipush 7266
      // 5a: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 5d: invokeinterface com/finalshell/core/IF.G (Ljava/lang/String;)[Ljava/lang/String; 2
      // 62: astore 4
      // 64: aload 4
      // 66: iload 1
      // 67: ifeq ae
      // 6a: ifnull 9b
      // 6d: goto 74
      // 70: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: bipush 0
      // 75: istore 5
      // 77: iload 5
      // 79: aload 4
      // 7b: arraylength
      // 7c: if_icmpge 9b
      // 7f: aload 0
      // 80: aload 4
      // 82: iload 5
      // 84: aaload
      // 85: invokevirtual com/finalshell/crypto/ConnectHost.y (Ljava/lang/String;)I
      // 88: pop
      // 89: iinc 5 1
      // 8c: iload 1
      // 8d: ifeq ac
      // 90: iload 1
      // 91: ifne 77
      // 94: goto 9b
      // 97: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a: athrow
      // 9b: aload 3
      // 9c: sipush -8808
      // 9f: sipush 32707
      // a2: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // a5: invokeinterface com/finalshell/core/IF.G (Ljava/lang/String;)[Ljava/lang/String; 2
      // aa: astore 4
      // ac: aload 4
      // ae: ifnull cd
      // b1: bipush 0
      // b2: istore 5
      // b4: iload 5
      // b6: aload 4
      // b8: arraylength
      // b9: if_icmpge cd
      // bc: aload 0
      // bd: aload 4
      // bf: iload 5
      // c1: aaload
      // c2: invokevirtual com/finalshell/crypto/ConnectHost.n (Ljava/lang/String;)I
      // c5: pop
      // c6: iinc 5 1
      // c9: iload 1
      // ca: ifne b4
      // cd: return
   }

   public void d(IF param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 1
      // 04: aload 2
      // 05: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 0a: astore 4
      // 0c: istore 3
      // 0d: aload 4
      // 0f: iload 3
      // 10: ifeq 52
      // 13: ifnonnull 50
      // 16: goto 1d
      // 19: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 2
      // 1e: iload 3
      // 1f: ifeq 52
      // 22: goto 29
      // 25: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: sipush -8878
      // 2c: sipush -15633
      // 2f: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 32: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 35: ifeq 50
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 1
      // 40: sipush -8926
      // 43: sipush 3767
      // 46: invokestatic com/finalshell/crypto/ConnectHost.a (II)Ljava/lang/String;
      // 49: invokeinterface com/finalshell/core/IF.m (Ljava/lang/String;)Ljava/lang/String; 2
      // 4e: astore 4
      // 50: aload 4
      // 52: ifnull 63
      // 55: aload 0
      // 56: aload 2
      // 57: aload 4
      // 59: invokevirtual com/finalshell/crypto/ConnectHost.b (Ljava/lang/String;Ljava/lang/String;)V
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: return
   }

   public GN W$GN() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/crypto/ConnectHost.ij Lcom/finalshell/core/GN;
      // 08: iload 1
      // 09: ifne 26
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/crypto/ConnectHost.ij Lcom/finalshell/core/GN;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 23: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 26: areturn
   }

   public void P(GN var1) {
      this.ij = var1;
   }

   public int D() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: sipush 16535
      // 06: ldc2_w 7263380765539622862
      // 09: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 0c: istore 2
      // 0d: aload 0
      // 0e: getfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 11: astore 3
      // 12: aload 0
      // 13: getfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 16: astore 4
      // 18: istore 1
      // 19: sipush 14970
      // 1c: ldc2_w 2877576147334079800
      // 1f: invokestatic com/finalshell/crypto/ConnectHost.a (IJ)I
      // 22: istore 5
      // 24: aload 3
      // 25: iload 1
      // 26: ifeq 34
      // 29: ifnull 8b
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 3
      // 34: invokeinterface com/finalshell/core/EU.c ()Z 1
      // 39: iload 1
      // 3a: ifeq 6f
      // 3d: ifne 62
      // 40: goto 47
      // 43: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 3
      // 48: invokeinterface com/finalshell/core/EU.S ()Z 1
      // 4d: iload 1
      // 4e: ifeq 6f
      // 51: goto 58
      // 54: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: ifeq 8b
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: aload 3
      // 63: invokeinterface com/finalshell/core/EU.j ()I 1
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: iload 5
      // 71: iload 1
      // 72: ifeq c5
      // 75: if_icmple c2
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: aload 3
      // 80: invokeinterface com/finalshell/core/EU.j ()I 1
      // 85: istore 5
      // 87: iload 1
      // 88: ifne c2
      // 8b: aload 4
      // 8d: iload 1
      // 8e: ifeq a4
      // 91: goto 98
      // 94: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: ifnull c2
      // 9b: goto a2
      // 9e: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: aload 4
      // a4: invokeinterface com/finalshell/core/FP.h ()I 1
      // a9: iload 5
      // ab: iload 1
      // ac: ifeq c5
      // af: if_icmple c2
      // b2: goto b9
      // b5: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8: athrow
      // b9: aload 4
      // bb: invokeinterface com/finalshell/core/FP.h ()I 1
      // c0: istore 5
      // c2: iload 2
      // c3: iload 5
      // c5: iadd
      // c6: istore 2
      // c7: iload 2
      // c8: ireturn
   }

   public void S() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aconst_null
      // 002: putfield com/finalshell/crypto/ConnectHost.i0 [B
      // 005: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 008: aload 0
      // 009: aconst_null
      // 00a: putfield com/finalshell/crypto/ConnectHost.ii [B
      // 00d: aload 0
      // 00e: aconst_null
      // 00f: putfield com/finalshell/crypto/ConnectHost.i6 [B
      // 012: aload 0
      // 013: aconst_null
      // 014: putfield com/finalshell/crypto/ConnectHost.i [B
      // 017: aload 0
      // 018: aconst_null
      // 019: putfield com/finalshell/crypto/ConnectHost.y [B
      // 01c: aload 0
      // 01d: aconst_null
      // 01e: putfield com/finalshell/crypto/ConnectHost.m [B
      // 021: aload 0
      // 022: aconst_null
      // 023: putfield com/finalshell/crypto/ConnectHost.iE [B
      // 026: aload 0
      // 027: aconst_null
      // 028: putfield com/finalshell/crypto/ConnectHost.Q [B
      // 02b: aload 0
      // 02c: aconst_null
      // 02d: putfield com/finalshell/crypto/ConnectHost.i8 [B
      // 030: aload 0
      // 031: aconst_null
      // 032: putfield com/finalshell/crypto/ConnectHost.j [B
      // 035: aload 0
      // 036: aconst_null
      // 037: putfield com/finalshell/crypto/ConnectHost.B [B
      // 03a: istore 1
      // 03b: aload 0
      // 03c: aconst_null
      // 03d: putfield com/finalshell/crypto/ConnectHost.s [B
      // 040: aload 0
      // 041: aconst_null
      // 042: putfield com/finalshell/crypto/ConnectHost.L [Ljava/lang/String;
      // 045: aload 0
      // 046: aconst_null
      // 047: putfield com/finalshell/crypto/ConnectHost.b Lcom/finalshell/core/EU;
      // 04a: aload 0
      // 04b: aconst_null
      // 04c: putfield com/finalshell/crypto/ConnectHost.iO Lcom/finalshell/core/EU;
      // 04f: aload 0
      // 050: aconst_null
      // 051: putfield com/finalshell/crypto/ConnectHost.z Lcom/finalshell/core/FP;
      // 054: aload 0
      // 055: aconst_null
      // 056: putfield com/finalshell/crypto/ConnectHost.C Lcom/finalshell/core/FP;
      // 059: aload 0
      // 05a: aconst_null
      // 05b: putfield com/finalshell/crypto/ConnectHost.e [B
      // 05e: aload 0
      // 05f: aconst_null
      // 060: putfield com/finalshell/crypto/ConnectHost.F [B
      // 063: aload 0
      // 064: aconst_null
      // 065: putfield com/finalshell/crypto/ConnectHost.v Lcom/finalshell/core/OD;
      // 068: aload 0
      // 069: aconst_null
      // 06a: putfield com/finalshell/crypto/ConnectHost.iK Lcom/finalshell/core/OD;
      // 06d: aload 0
      // 06e: aconst_null
      // 06f: putfield com/finalshell/crypto/ConnectHost.h Lcom/finalshell/core/Cs4;
      // 072: aload 0
      // 073: aconst_null
      // 074: putfield com/finalshell/crypto/ConnectHost.ib Ljava/net/Socket;
      // 077: aload 0
      // 078: aconst_null
      // 079: putfield com/finalshell/crypto/ConnectHost.im Ljava/lang/Thread;
      // 07c: aload 0
      // 07d: aconst_null
      // 07e: putfield com/finalshell/crypto/ConnectHost.S Ljava/lang/Object;
      // 081: aload 0
      // 082: aconst_null
      // 083: putfield com/finalshell/crypto/ConnectHost.O Ljava/io/InputStream;
      // 086: aload 0
      // 087: aconst_null
      // 088: putfield com/finalshell/crypto/ConnectHost.l Ljava/io/OutputStream;
      // 08b: aload 0
      // 08c: aconst_null
      // 08d: putfield com/finalshell/crypto/ConnectHost.k Lcom/finalshell/core/UJ;
      // 090: aload 0
      // 091: aconst_null
      // 092: putfield com/finalshell/crypto/ConnectHost.D Lcom/finalshell/core/YU;
      // 095: aload 0
      // 096: aconst_null
      // 097: putfield com/finalshell/crypto/ConnectHost.K Lcom/finalshell/core/PJ3;
      // 09a: aload 0
      // 09b: aconst_null
      // 09c: putfield com/finalshell/crypto/ConnectHost.M Ljava/util/Hashtable;
      // 09f: aload 0
      // 0a0: aconst_null
      // 0a1: putfield com/finalshell/crypto/ConnectHost.P Lcom/finalshell/core/Ic4;
      // 0a4: aload 0
      // 0a5: aconst_null
      // 0a6: putfield com/finalshell/crypto/ConnectHost.Y Lcom/finalshell/core/Gq2;
      // 0a9: aload 0
      // 0aa: aconst_null
      // 0ab: putfield com/finalshell/crypto/ConnectHost.in Ljava/lang/String;
      // 0ae: aload 0
      // 0af: aconst_null
      // 0b0: putfield com/finalshell/crypto/ConnectHost.w Lcom/finalshell/core/Cd4;
      // 0b3: aload 0
      // 0b4: aconst_null
      // 0b5: putfield com/finalshell/crypto/ConnectHost.q Lcom/finalshell/core/RW;
      // 0b8: aload 0
      // 0b9: aconst_null
      // 0ba: putfield com/finalshell/crypto/ConnectHost.id [Ljava/lang/String;
      // 0bd: aload 0
      // 0be: aconst_null
      // 0bf: putfield com/finalshell/crypto/ConnectHost.V Ljava/lang/String;
      // 0c2: aload 0
      // 0c3: aconst_null
      // 0c4: putfield com/finalshell/crypto/ConnectHost.U Ljava/lang/String;
      // 0c7: aload 0
      // 0c8: aconst_null
      // 0c9: putfield com/finalshell/crypto/ConnectHost.g Ljava/lang/String;
      // 0cc: aload 0
      // 0cd: aconst_null
      // 0ce: putfield com/finalshell/crypto/ConnectHost.iS [B
      // 0d1: aload 0
      // 0d2: aconst_null
      // 0d3: putfield com/finalshell/crypto/ConnectHost.d Lcom/finalshell/core/Xe2;
      // 0d6: aload 0
      // 0d7: aconst_null
      // 0d8: putfield com/finalshell/crypto/ConnectHost.ij Lcom/finalshell/core/GN;
      // 0db: aload 0
      // 0dc: aconst_null
      // 0dd: putfield com/finalshell/crypto/ConnectHost.r Lcom/finalshell/ui/panel/ConnectionProperty;
      // 0e0: aload 0
      // 0e1: aconst_null
      // 0e2: putfield com/finalshell/crypto/ConnectHost.ix Lcom/finalshell/ui/panel/ConnectionProperty;
      // 0e5: aload 0
      // 0e6: aconst_null
      // 0e7: putfield com/finalshell/crypto/ConnectHost.Z Lcom/finalshell/core/Lv4_2;
      // 0ea: aload 0
      // 0eb: aconst_null
      // 0ec: putfield com/finalshell/crypto/ConnectHost.i2 Lcom/finalshell/crypto/ConnectHost;
      // 0ef: aload 0
      // 0f0: aconst_null
      // 0f1: putfield com/finalshell/crypto/ConnectHost.a Ljava/util/ArrayList;
      // 0f4: aload 0
      // 0f5: aconst_null
      // 0f6: putfield com/finalshell/crypto/ConnectHost.u Lcom/finalshell/core/GH_2;
      // 0f9: aload 0
      // 0fa: aconst_null
      // 0fb: putfield com/finalshell/crypto/ConnectHost.E [Ljava/lang/String;
      // 0fe: aload 0
      // 0ff: aconst_null
      // 100: putfield com/finalshell/crypto/ConnectHost.iY [I
      // 103: aload 0
      // 104: aconst_null
      // 105: putfield com/finalshell/crypto/ConnectHost.T [I
      // 108: aload 0
      // 109: aconst_null
      // 10a: putfield com/finalshell/crypto/ConnectHost.iw Ljava/lang/Runnable;
      // 10d: aload 0
      // 10e: aconst_null
      // 10f: putfield com/finalshell/crypto/ConnectHost.iC Lcom/finalshell/core/Fw2;
      // 112: aload 0
      // 113: aconst_null
      // 114: putfield com/finalshell/crypto/ConnectHost.iM Lcom/finalshell/core/DQ;
      // 117: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 11a: ifnull 134
      // 11d: iload 1
      // 11e: ifeq 130
      // 121: goto 128
      // 124: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: bipush 0
      // 129: goto 131
      // 12c: invokestatic com/finalshell/crypto/ConnectHost.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f: athrow
      // 130: bipush 1
      // 131: invokestatic com/finalshell/core/Dm4.K (Z)V
      // 134: return
   }

   public void d() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new WR3(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -8954) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 192;
               break;
            case 1:
               var10000 = 205;
               break;
            case 2:
               var10000 = 55;
               break;
            case 3:
               var10000 = 166;
               break;
            case 4:
               var10000 = 35;
               break;
            case 5:
               var10000 = 187;
               break;
            case 6:
               var10000 = 103;
               break;
            case 7:
               var10000 = 96;
               break;
            case 8:
               var10000 = 87;
               break;
            case 9:
               var10000 = 213;
               break;
            case 10:
               var10000 = 77;
               break;
            case 11:
               var10000 = 89;
               break;
            case 12:
               var10000 = 161;
               break;
            case 13:
               var10000 = 221;
               break;
            case 14:
               var10000 = 79;
               break;
            case 15:
               var10000 = 212;
               break;
            case 16:
               var10000 = 190;
               break;
            case 17:
               var10000 = 233;
               break;
            case 18:
               var10000 = 51;
               break;
            case 19:
               var10000 = 108;
               break;
            case 20:
               var10000 = 131;
               break;
            case 21:
               var10000 = 37;
               break;
            case 22:
               var10000 = 244;
               break;
            case 23:
               var10000 = 250;
               break;
            case 24:
               var10000 = 248;
               break;
            case 25:
               var10000 = 53;
               break;
            case 26:
               var10000 = 75;
               break;
            case 27:
               var10000 = 134;
               break;
            case 28:
               var10000 = 234;
               break;
            case 29:
               var10000 = 179;
               break;
            case 30:
               var10000 = 130;
               break;
            case 31:
               var10000 = 147;
               break;
            case 32:
               var10000 = 170;
               break;
            case 33:
               var10000 = 191;
               break;
            case 34:
               var10000 = 251;
               break;
            case 35:
               var10000 = 104;
               break;
            case 36:
               var10000 = 4;
               break;
            case 37:
               var10000 = 8;
               break;
            case 38:
               var10000 = 141;
               break;
            case 39:
               var10000 = 199;
               break;
            case 40:
               var10000 = 202;
               break;
            case 41:
               var10000 = 127;
               break;
            case 42:
               var10000 = 72;
               break;
            case 43:
               var10000 = 15;
               break;
            case 44:
               var10000 = 126;
               break;
            case 45:
               var10000 = 95;
               break;
            case 46:
               var10000 = 88;
               break;
            case 47:
               var10000 = 208;
               break;
            case 48:
               var10000 = 86;
               break;
            case 49:
               var10000 = 133;
               break;
            case 50:
               var10000 = 44;
               break;
            case 51:
               var10000 = 123;
               break;
            case 52:
               var10000 = 198;
               break;
            case 53:
               var10000 = 33;
               break;
            case 54:
               var10000 = 242;
               break;
            case 55:
               var10000 = 34;
               break;
            case 56:
               var10000 = 139;
               break;
            case 57:
               var10000 = 82;
               break;
            case 58:
               var10000 = 144;
               break;
            case 59:
               var10000 = 226;
               break;
            case 60:
               var10000 = 6;
               break;
            case 61:
               var10000 = 90;
               break;
            case 62:
               var10000 = 105;
               break;
            case 63:
               var10000 = 146;
               break;
            case 64:
               var10000 = 243;
               break;
            case 65:
               var10000 = 46;
               break;
            case 66:
               var10000 = 61;
               break;
            case 67:
               var10000 = 5;
               break;
            case 68:
               var10000 = 214;
               break;
            case 69:
               var10000 = 62;
               break;
            case 70:
               var10000 = 54;
               break;
            case 71:
               var10000 = 68;
               break;
            case 72:
               var10000 = 231;
               break;
            case 73:
               var10000 = 162;
               break;
            case 74:
               var10000 = 113;
               break;
            case 75:
               var10000 = 225;
               break;
            case 76:
               var10000 = 43;
               break;
            case 77:
               var10000 = 184;
               break;
            case 78:
               var10000 = 185;
               break;
            case 79:
               var10000 = 180;
               break;
            case 80:
               var10000 = 102;
               break;
            case 81:
               var10000 = 110;
               break;
            case 82:
               var10000 = 111;
               break;
            case 83:
               var10000 = 153;
               break;
            case 84:
               var10000 = 216;
               break;
            case 85:
               var10000 = 215;
               break;
            case 86:
               var10000 = 177;
               break;
            case 87:
               var10000 = 28;
               break;
            case 88:
               var10000 = 197;
               break;
            case 89:
               var10000 = 109;
               break;
            case 90:
               var10000 = 98;
               break;
            case 91:
               var10000 = 176;
               break;
            case 92:
               var10000 = 3;
               break;
            case 93:
               var10000 = 63;
               break;
            case 94:
               var10000 = 155;
               break;
            case 95:
               var10000 = 194;
               break;
            case 96:
               var10000 = 255;
               break;
            case 97:
               var10000 = 236;
               break;
            case 98:
               var10000 = 128;
               break;
            case 99:
               var10000 = 24;
               break;
            case 100:
               var10000 = 149;
               break;
            case 101:
               var10000 = 64;
               break;
            case 102:
               var10000 = 140;
               break;
            case 103:
               var10000 = 65;
               break;
            case 104:
               var10000 = 183;
               break;
            case 105:
               var10000 = 31;
               break;
            case 106:
               var10000 = 70;
               break;
            case 107:
               var10000 = 1;
               break;
            case 108:
               var10000 = 11;
               break;
            case 109:
               var10000 = 94;
               break;
            case 110:
               var10000 = 159;
               break;
            case 111:
               var10000 = 193;
               break;
            case 112:
               var10000 = 135;
               break;
            case 113:
               var10000 = 235;
               break;
            case 114:
               var10000 = 232;
               break;
            case 115:
               var10000 = 48;
               break;
            case 116:
               var10000 = 115;
               break;
            case 117:
               var10000 = 204;
               break;
            case 118:
               var10000 = 40;
               break;
            case 119:
               var10000 = 121;
               break;
            case 120:
               var10000 = 247;
               break;
            case 121:
               var10000 = 252;
               break;
            case 122:
               var10000 = 83;
               break;
            case 123:
               var10000 = 118;
               break;
            case 124:
               var10000 = 207;
               break;
            case 125:
               var10000 = 119;
               break;
            case 126:
               var10000 = 137;
               break;
            case 127:
               var10000 = 200;
               break;
            case 128:
               var10000 = 38;
               break;
            case 129:
               var10000 = 129;
               break;
            case 130:
               var10000 = 241;
               break;
            case 131:
               var10000 = 189;
               break;
            case 132:
               var10000 = 23;
               break;
            case 133:
               var10000 = 16;
               break;
            case 134:
               var10000 = 237;
               break;
            case 135:
               var10000 = 114;
               break;
            case 136:
               var10000 = 224;
               break;
            case 137:
               var10000 = 25;
               break;
            case 138:
               var10000 = 50;
               break;
            case 139:
               var10000 = 174;
               break;
            case 140:
               var10000 = 20;
               break;
            case 141:
               var10000 = 78;
               break;
            case 142:
               var10000 = 138;
               break;
            case 143:
               var10000 = 59;
               break;
            case 144:
               var10000 = 116;
               break;
            case 145:
               var10000 = 163;
               break;
            case 146:
               var10000 = 245;
               break;
            case 147:
               var10000 = 182;
               break;
            case 148:
               var10000 = 0;
               break;
            case 149:
               var10000 = 223;
               break;
            case 150:
               var10000 = 195;
               break;
            case 151:
               var10000 = 125;
               break;
            case 152:
               var10000 = 10;
               break;
            case 153:
               var10000 = 74;
               break;
            case 154:
               var10000 = 69;
               break;
            case 155:
               var10000 = 238;
               break;
            case 156:
               var10000 = 85;
               break;
            case 157:
               var10000 = 45;
               break;
            case 158:
               var10000 = 7;
               break;
            case 159:
               var10000 = 171;
               break;
            case 160:
               var10000 = 148;
               break;
            case 161:
               var10000 = 27;
               break;
            case 162:
               var10000 = 97;
               break;
            case 163:
               var10000 = 156;
               break;
            case 164:
               var10000 = 58;
               break;
            case 165:
               var10000 = 81;
               break;
            case 166:
               var10000 = 14;
               break;
            case 167:
               var10000 = 246;
               break;
            case 168:
               var10000 = 158;
               break;
            case 169:
               var10000 = 145;
               break;
            case 170:
               var10000 = 152;
               break;
            case 171:
               var10000 = 196;
               break;
            case 172:
               var10000 = 47;
               break;
            case 173:
               var10000 = 150;
               break;
            case 174:
               var10000 = 229;
               break;
            case 175:
               var10000 = 154;
               break;
            case 176:
               var10000 = 201;
               break;
            case 177:
               var10000 = 21;
               break;
            case 178:
               var10000 = 71;
               break;
            case 179:
               var10000 = 18;
               break;
            case 180:
               var10000 = 157;
               break;
            case 181:
               var10000 = 239;
               break;
            case 182:
               var10000 = 92;
               break;
            case 183:
               var10000 = 219;
               break;
            case 184:
               var10000 = 26;
               break;
            case 185:
               var10000 = 160;
               break;
            case 186:
               var10000 = 117;
               break;
            case 187:
               var10000 = 106;
               break;
            case 188:
               var10000 = 17;
               break;
            case 189:
               var10000 = 206;
               break;
            case 190:
               var10000 = 142;
               break;
            case 191:
               var10000 = 249;
               break;
            case 192:
               var10000 = 240;
               break;
            case 193:
               var10000 = 100;
               break;
            case 194:
               var10000 = 172;
               break;
            case 195:
               var10000 = 76;
               break;
            case 196:
               var10000 = 143;
               break;
            case 197:
               var10000 = 217;
               break;
            case 198:
               var10000 = 56;
               break;
            case 199:
               var10000 = 66;
               break;
            case 200:
               var10000 = 132;
               break;
            case 201:
               var10000 = 178;
               break;
            case 202:
               var10000 = 175;
               break;
            case 203:
               var10000 = 99;
               break;
            case 204:
               var10000 = 203;
               break;
            case 205:
               var10000 = 60;
               break;
            case 206:
               var10000 = 169;
               break;
            case 207:
               var10000 = 39;
               break;
            case 208:
               var10000 = 227;
               break;
            case 209:
               var10000 = 93;
               break;
            case 210:
               var10000 = 67;
               break;
            case 211:
               var10000 = 151;
               break;
            case 212:
               var10000 = 41;
               break;
            case 213:
               var10000 = 220;
               break;
            case 214:
               var10000 = 84;
               break;
            case 215:
               var10000 = 107;
               break;
            case 216:
               var10000 = 112;
               break;
            case 217:
               var10000 = 73;
               break;
            case 218:
               var10000 = 36;
               break;
            case 219:
               var10000 = 167;
               break;
            case 220:
               var10000 = 164;
               break;
            case 221:
               var10000 = 188;
               break;
            case 222:
               var10000 = 122;
               break;
            case 223:
               var10000 = 57;
               break;
            case 224:
               var10000 = 32;
               break;
            case 225:
               var10000 = 165;
               break;
            case 226:
               var10000 = 124;
               break;
            case 227:
               var10000 = 22;
               break;
            case 228:
               var10000 = 91;
               break;
            case 229:
               var10000 = 186;
               break;
            case 230:
               var10000 = 254;
               break;
            case 231:
               var10000 = 211;
               break;
            case 232:
               var10000 = 19;
               break;
            case 233:
               var10000 = 228;
               break;
            case 234:
               var10000 = 230;
               break;
            case 235:
               var10000 = 52;
               break;
            case 236:
               var10000 = 80;
               break;
            case 237:
               var10000 = 101;
               break;
            case 238:
               var10000 = 168;
               break;
            case 239:
               var10000 = 209;
               break;
            case 240:
               var10000 = 136;
               break;
            case 241:
               var10000 = 222;
               break;
            case 242:
               var10000 = 2;
               break;
            case 243:
               var10000 = 253;
               break;
            case 244:
               var10000 = 9;
               break;
            case 245:
               var10000 = 120;
               break;
            case 246:
               var10000 = 181;
               break;
            case 247:
               var10000 = 13;
               break;
            case 248:
               var10000 = 218;
               break;
            case 249:
               var10000 = 49;
               break;
            case 250:
               var10000 = 210;
               break;
            case 251:
               var10000 = 173;
               break;
            case 252:
               var10000 = 30;
               break;
            case 253:
               var10000 = 12;
               break;
            case 254:
               var10000 = 42;
               break;
            default:
               var10000 = 29;
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

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8042;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18597) & 32767;
      if (fb[var3] == null) {
         fb[var3] = eb[var3] ^ var1;
      }

      return fb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var11;
      char[] var46;
      String[] var21 = new String[238];
      int var19 = 0;
      String var18 = "3#\u0011`\u009fÉ¬È=²=C\u000f«\u0086USLZ\u0012\u008f\u008e\u009a\u000eÄ\u0085\u0098³ \u0018\u00936\\4©\u000fB\u0095\u0007\u000b¥þlW[A\u0016\u0097´hÎ\u008a»\u0011\u0097@tæ\u0018ùvN6\u009aîåñò4\u0003\u0086´Ê\bmä\u001e\rªV[\u0015\u0018\u0012áAÝ`l`uü\u001a¹º\u008b\u001fÛö\u008düpëýI=ä\u0017¤³\u0080;\u009fóíñ\u0087h\\\u0000ì\u009b\u0090Ûsmç,`ü\u0006\u0014\u0013p/Ó\r\u0092Õ\u0095ó\u007f\u0015\u00adU\u0019µÙÀÁ\u008f\u008a\u0011\u001c\u0096³WË¾\b\u008a\\0ÛË!(¦4C\u0006s¾\u0019`1\u001f\u0002\u000e]\u0004嬸儘该咗\u000bç\u0098\u008e®\u0097\u0098B5Þ¯]\u0004讥诗妉趝(k§Æn\u0093~S\u0095QÄõ¨ô2\u0006ÃhàjþÑ¦0¦üg<D\u0086\u0018Ï;æ>\u001a9\fg\u0080;\u0018Ð\u0091\u008eH\u0014Më±\u0014\u0016\u0089mAì¾ôÒ\u0096\u001bÉu¢¯Ø\trî<`ÁA\u0088\u000e\u0087\u0006且枙嬤鑐D4\u001b¢íZÄ{³=³\u0097\u001cX/é«q¾¸ã»§\u0002µ\u008b¯*6f(Æ\u007fsu%\u001d\u0085ù\u008bI®\u0019\u009f\u0004k\u0005Å8ßågÅæÊ&êgõí.¢ýKæ¯\"º\u0004VW\u0016j\u008bÏ¥ºæNU\u00816ÜFçT\u008a\u0080ðæ\u0007òá\u00187`\u0018\u0093Ûú\u00adô@[bÁäÚF\u0019\u0011r\u001aë\u0004\fùÎ\u001fÙFe¹»t\u009d\u0016Ô3\u0007}\u009d¿Ù2\u0011\u0012¢¡©'\u0099ÁjaGd\u0004\u0016²\u0006\u009b\u0016\u001dP\u008b\u0080\u0003tàô\n\u0083x3\u0098\u0099\u000b\u0003\u008f\u0011³\n\u009f<¦\u0080\n·+\u001ecx\u0007ÛÝ20µò<\fæÆåååyå³¨uLk\f亢枼寲铴斝単V县浃輙揯ì\u000fDmÖä\u008c\u0088\t\ný\u000f.©\u001a;\u009c:kw.y:7w\b\u009fC\u001cóÚ¸¶Rç\u0012i yäÏ\u0006\u009aÃ@\u0014è{\u0087bÿ\u0095\u000b\u00907dç½ß±{»ÐíµsÉ\u0087»B4\u000eýA`½\n\u0006OA\b_è\u001epìÃ\u0007\u008b\u0083î¨EÃ\u0001\u0006øxh¸\u001f\u0004\u0004~~¯÷\u0016\u009b#woA\u009dw'L²M\u000f½¨\u00940õ u¥J\u0018\u000e\nx6¢ÔfÜ,LP\u0002¥\u0097Á\f\u007fÔuÂ)\\|ÖÒ»\nº.ªe7=±W¤ÐvK³ÑÓÿ¤ê¿s9Ïs\u009d\u0087\u000fô!GÐÊT \u0098Ãx`å*r\\°ÕLà\u009ckò\u0011\u008d\rã\u0011»ëo5ÍÍf\"\u0095ÒD\u0015Ü\u000e¢\u009d&\u000e\u0082\u0082èª\u0099r\u009f\u0010úè\n丹枌宁铲崸纏故厾$\b\u0007Àq\u0087öh\b¤\n©Ò´»á\u009eÉ¾\u0016\n\u0015VÈ½1\f\u0019\u0011\u0017¸(ú~\u000b\u0092þ´å\u008f>\u00963\tÑB¸\u009c[Õ\u0085¨Ì\u001e°à6\u0010e\u008fT:]\u009e-ûÕ\u0003\"\u0087\u0088bäÂ\u00adÉÛ\u008dh\n;ðJ\u0097\u0005:\u0003Â(\n\u0003ë\u0083d\bÒwK\u001f+?U$#Å\"é9\u0085\u0082u\u008e»úY\u0091\u0086\" v\u008a'\u0096hïýl0©é\u0087 È\u0089^®ºð\b\u000e迶捏仜杹\u000b亾璝柤剼噤\u0088#<v\u0002K8\u0018\u0098c9\u0015\u0017\u0089°ô\u001dãBq^¸®\u0019\u0016s½QH\u0015RV\u0004嬘兑诡咾\u0003rqÿ\u0016H¶\u009d¬vÑ§!\u008dwµSs+\u0080\u0010V¢Ä\u0083eC*Æy_\u0083£c\u000b\u009báS ÅÜÍ¡[<ST7q\u0096§ËÌ¼Ý\u0081 ÕReDëuRÿ\u009d\f{\u0019ó\tëÒÃ\u0002ÿj¦ú\u008a\t\u008dü3K*/«÷\t\n\u001cöÀIç1ÌØè[\u0012å\u0089îç¡¶þQ\u001ddñþp\u0087\u0001\u008fÿ\u0090\u0013«Ta\u0095\u0095\u0013M\u000e¼2¯cÍû1Z\u0096\u0019ù\u0014ñ\u0085sm\u0086E¤o×,ÞB¢ú\u001d5[¤\u009ee\u0011\u008eó\u008f7§òlEQæ»å·ºÀSð\u0005厅挛召查歵7Q¿µ/.3l\u0093Z\u0018á«Þ¯\u0099,b½éðLgÆÌØ<Eö¿\u009d\u001d+Ä\u0094\u0005\u0089Ý!Ñá\u0010h\u0082î\u00adÎ\u0019üzÆE\u0090D\u0088º\u0003\u0006\u0089Ú\u000f$òý\t\u009dîÙS\u001d\u001a\u0090§@\u008eÄ\u001a\u0011¸ÄñL\u000f¾<(Ûø\"R,i÷LuSAÁÞð¦\u001c\u0091\u0012ñzl\u0099ñyô¨\\[Ù\u0019u{¡\u0010ëc\u000byøÂ\u0019æ¿ítÙ5a\u0019ÆÃ\u0095¥Z\\?L¥Y¶ÃNUNÊ[6Î\u0096¢\u0015C¿\u000f\f\u009bÕ\u0001\u0007f£t\u008e\nöí\u0080\u0016É\u009f\u00ad\u0089pugµ\u0095å¶\u0001\u0013a\u008cY×\u008bô¦cç\u0013ëÍþ%IÊ\u0012>*F\u0098¸?C«\u0096\u008c8×\b扲纚仁枴孆鑁;¸\u0018mý©´\u009aæ\fH#_ ²\u0000\u001f)Ï\u0017Ìÿ}`\"3n\u000f~X\u0013\u0093@\u0084f\u007fs\u0081å?(\u0002\u0081\u0018Ön\u0097\u0010\u001aê7\u009a¯\u009e\u009e\u0091$\u009e\u009b)\u0004ß;XÖ\u0015SB\u0002交枹\tí×¡\u001b1©÷QQ\u0004-àT@\u0018â´X\u009d¤ÃËìÛË¿ ãMU\u0085\u0098\u0085\u000eT^\u0007ôÊ\u000eÇõö l\u0000\u0017u¦C£¾\u008dn`£%\u001f{w%\u008b#\u0080:B*\u0010ÿÌ\u0016ïßÊ\u0013ì$×\u0007b³UÅu[è>F\t\u009aÁZ£\u009dGð¤®Qr\u0095\u0094í7\u008a©âgp¢¦\u001cCè·\u0086¸@\u0011\u0083\u009d5\u0000\u0017®ªá\"]Kí\u008a¹õ±V¡&4Mô(ir4ýR\\`ÆÛ$\u001dªãf¡ }h\u009c\u0016T[¬ ºñ¯¨Á6\u0097f³}\u0088ð?\u008c\u0087\u000b\u009dW¬X\tp\u0012¤¡2à A\u009e]\u0097F\u0085\u001eIz4\u0093Xè\u0004\u007f\u0083\u001e,\u000ecÑÌ\u008d\u007f£\u008b{Îä;O\u009b\u0003\u0011\u0097·\u0084÷\u0000\u0083ý}×\u0017 êÍJ¥ÔR\fÄ3êÛ\u001b0×ýþ\u0087\u0097)\u0002ì\u0013\u001b\u008cE¶I\u009eþ\u0092) pk\u0006¤Üî%\u0017]\u0097uZ\u0099ÁÂ\t\u008f#\u0010RÚ*c¥\"[\u0002ÓÆ\u0011I\u001eøæÕ\u001aîvüÆäÜöðï\u0007= =ù¤Gù-cÀÑ\u0014>2\u0095b\rgÎZ\u0004¡æû\u009a\u000f\u009a\u0007\\Æ\u000eAÌQÎ\b\u0016k8V\u0088PZ¹j\r辿揯仵杭.暥胂劀邭±ÜðQ9õ1ý±@.8;v'!m}kB(y]ºÉ\u0000Ú\u0091¨\u0001\u0018a\u0095Ü¼\u0011Ç\u0010ÔVÅ(>k\u000f³\u0017òÉCÉM\u009e6XàÏ\u0005iø\u0084\u0083\u0007\u001c\u001aþL\u009a\u0013\u0085\u0007ûD6\u0003#\u0094(\u0016 7]mXY\u0081º¦\u008b\u0013Â\u0015ÍÐ\u0092\u001d\u009ct\u009aÝ\u0090\u001c寳钼杶法凉辇Ýdò曔咈挑匫謁嬯鑴ø.)人枃孬鐀推縓,î%\u0016-\u0083Ü'¹+]¢\u0096BËj!'ùÔ\"f2ïé]>é\u0080n\u0014pGO\u001d\u009a\u0089\u001e\u0097]ôuß´\u0016c\u0081V\u009c\u0081Þæ¿\u0091\u0019\\\u0003^\u0095nì¼\u008aÔ»\u0002\u0010±\u009f-\u008eµ»s]:+¤\u0098\u0087¿Õ®ãß4\u0017\u001cÐ\u0016âÍÞm\u0098ÿ\nv\tRÍÊÅÅÎ²x \u0016:Ã\u0001\u0006輞掖仁杂抐劥\nEÿÚB\u001d\u0003\u0017\u009bæK \u0000C¿°$Éz\u0019{2A\u0088Ä\t+\u0018\u0098¤GÐ@-\u0097AcB\u009atº\nüì\b\u008c¥ìaÃWÝa\u0011Zê\u0018Y¾îä3Õ h\næ¼ï\u0089à\u0016\u00936wÎÝÒ\u0083Ó=ûÿ\u000eÈñ¨,ùKè`NÏ\u000ef7Âxê\u000bÇ\u0014¼oà;åÞ\tÏ¤\u008e9Ã\u0015>B\u0010\u0010B\u001e(ûå1S`Ò\u008a1À\u001aÉfó\u0017Ú×\u0012ç\u0012\u0014O\u009c\u0000e\u0001\u001d]^¨³y¢X\tÿ\u0019ü:¹\rd¥1qgÛ\u009fQ¾\u008cI\u0097÷³ä\u009bi0\u0017ª©\u0018ãd2\u0013A\u0012óå8ù¹Js³\u001eIÚ\bÇ!\u0085Ìïps5fÈT~gO3|\n~9\u008c°n\u000eý/Î§\u0007Ö,àûþµ\u000e$ò'\u0003³B¹\"ðy\b6/\u009eV\f*Ýl¸û)TÐ¸\u0091¸å'Hâ\u001fLÌÍXî\u00116¼°\u008a!¹\u0091\u007f:\u0098Î\u0001\u0080hêV\u0017\u0003\u001dKá\t\u008c\u0092\u0013\u0086a\u008dqÞ®?&^\u0097ÏO<¨rfd\u0081*®C\u000b){È\u009aZiçf±\u001aQ\rµ¦Æ\u000f\u007f¾¡Q34±ëññ\u0017ÕðS\u0089_\u001f\u0019ÁªO/¥¢I{yñà\u008dm[\u0007枣睎东朑寽铵V\u0013qµc\u0019û\u008aì6L\u0002ñ´«±¥øþ>Þ\f\rIÀ¢Â»ó\u0081¶MÔì\u0016\nXE\u0000\u0007p¿\u009aU\u0005nùÙv\u0018ëd[GÊ\fõ\u000f\u00ad\u008fJk\u008cç¯Á\u0016Þ\u0097t}¿cFÍ0L^ÊjÃ·üÑ37&}\u0017\u00170æ#UøÜ\u0015?X\r®:\u0014ùY÷&0RïD\u0019ÔÛ=ý?¤D$ÑAq¤O\u008d)q¿Óô\u0018õÜ4Å/¡'tå\u0012Êr\u00154çñÔ\u0085¥ \u0080\u009eÚ> \u0093YíÍ\u0087 rsº\u0003§º¶\u0012âKR\u0010z)\u001dà\u0093vØbù\u0002s\u008bê\u000b\r\u007f\u000b¢ÎÃpëi©ÊÎÌ¢\tRuÑ\\°Ò^¨-3®E\u0097ú\u0011\u0006ä-Ù\u0094c\u0007\u000e´!v¾\u00adÔ¦ö4'\u001cé\u008cäe¾ú¡^\u0005è¦\u009dY\f±.øºöÕlùËDùWª\u0013.ù·\u0004©\u0083²ÔY(l\u0014ß¾s*ÔÝ®\u0003N¾Ð\u001d\t\u0089b!\u0091d\u0015\u0004\u001b=>s\u000e1ÈÑ\u001cçëÒ>B§yq¡S\b-\u001cõw\fº\u0082ê`í\u001el\u0016Ó¹ß¼¢H\u009dÕ[}p×Gr\nÅô\u00103r\u0099Ô³\u001dëf\u001fºz|\u008bÍø\u0099\u0016sg'g\u0017\u0018h\u0092\u009b\u008e´cìÚC2o\u0088:\u0018\u0014À.ÍvÔÓÊ\u0092TJiy`×\u009ff\u008a\u00910bË\u0016(@.Ù;\u001cIu\rï\u0013\r^\fLm³¡µDP\u008cà5Ö\u0001\u0016\u0097\u0012»É\u0084Í\u001a(ÕÙ}\u008fÜ\u0087m_ª%\u0082\u00ad\u0003v\u000b\u0015\r>\u0019J¥bij)\u007f\u0002R\u0093\"áÇ»T?\u0099\u0098Ä\u0093¸n¸\u0015b\u0098®\u001bí°àíl4\u0094¾W\u0093üqvlÙmÓ9|gÌ{fwü\u0000îB2Ó\u001f¼\u000eÒð\u0002\u008b\"&§U\u0007\u0099ír+¾k]=\u0099\u008bg.\u000eC¯ +âáw!\u001e\u0001d¿\u0007Ñ$#\u0014<+\u001b\u001bÇ\u0081nÜMâ4\u0094úB]nî3ÿK\u0086f\u001aQþ\u009d\u009eæ$§Î\u001d\u0018¨GåÖEA\u0096ÅKN\u001fö\têËÃ\u0003Ö\u0006Ù\u008d*Fµ:Oþ\u009c\u000f,&×ÅjÅ°»t\u001cQ\u001en\u008b\u0080\u0004êîÚ#\u001bYN¼7e\u0084\u0016g{\u009a?kÉ6qôSo(15åç\u0003\u0006û(ACØZD~lJ\u000fb\u0005\u00805y}i¤wÅæ\u000e\u0007÷²ä%Ö\u007fL\u0011\u008dxµÊeg\u0084\u0006\u0095´ÞpcØµA\u0001+\u008cÔÊÕßj³\u000f\u009c÷ºÐ\r\u0084\u0012)\u009b3\u000fòâ\rX\u001cÎÂ,+¯(S\u009bl\u00ad\f³+x(½\u0095;\u009bõO\u0085:\rÛ\u00162ß\u0016\u0013©eaeÊ£\u007f\r\u0013¡/\u009brÚÝ<o`\u0016\u0099¹\b盺弹屪讶欶旆趑迀\u0013b\u0092>i\u0098.\u0094a\u009d\u009eôÂÌd\u0011q\u0098¶'\u0011\b½12\u009b\u0012\u0002\u001f\u001d\u0082ó\u009d$â\u0006mW=ó³L)¼Á\u0012ºi³áãU§ìÿÇ®ðcÅZêQ.`\u001b\u00972S[\u0010#G\u001b\u0088êfX\u0092Õê¤¬b¸çÅQ\u0002h¤\u009câ7·^{\u0014\u0095C\u0004pün§$ív:b\u000f_\u009e\u001cS£vÛ\u0016\u000eø#\u0017\\1ÖÝª2L~L\u008b\u009fz\u0016\fU~²¢å\b¹A\u0084¹ùÐ1Ç\u0005ç½yÿ}\u0011õÚà\u0012JVÑÑætM·ið\u001b\u001a\u008b\u001cÈ\u0017Úäè\b\u009b\u0099h\u0090½Kr'Ê7AÈæ´Åv¤Sº\u008fàî\u0005掍匾廪侌孙9\u0096\u0016\u0081Æ\u008d\u001dðVmààº\u0082Q\u008ekË\u0080\u008cS«Æ>\u0095\u0011Öo4\u0083¦¥8\u001aa@afÛ¬\u0089lÛ¤\u0092ûR}\u001câ\u0082¦OìïÅT$\u0002匑涶\u0007软揽仯术k¹\u007f\u0002²\u00930Klô\tÈ¤¼ßu{¾\u001f\u0003tY<Ønzv¡e\u008a²L\u000bBi\u008fÕ\u007f8äå\u0013®bÝ[ÂX\u0097~<\u008c1#1\u000e\nù8h%ÂÎ\u009fåì\u0084\u0086ÔÝ2\u0000 BF«\u0091³ß3Ê>Ì¥ÎWH\u0019:.\u0006S0d\u008cÜ£· ©æ³²¾\u0088!\u0095\u000f¯\u0011Ð\u0085\u0085;\u0096£Ëä!5¸#bªm]Ö¯°\u009e'Ê$\u0099\u001eÎ\u0093ò'©\u009b+É]ÔöLúÍéî_ua\u008cÂ¯\u0007ÜÔ\u0004B\b\u009eª#Â%\u001f³aÆÚ¥\u001a3\u008fó\u0098¥U¿ð¶\u0000o\u001d|£¬GÙMUÊ\u0098¨\u0002º\u0097\":\u0005¾ã@\u0083\u0010@üyßÀrA\u0088ÅT\u0089Ò¤8Àçøf|Ï\u009c\u0095sKôd\u0091UÆ\u0088\u008egÐÝ9½§:KÝÆu§GvZ\u008d\rÊ!\u0086±\u000fB\u0005¬î,9{ßK#NkLÜ&\nM\u0013êõ¢¦d*ý\u0005!@\u0013\u008fÎ¹ÊH®\u0089õ-\u0011}W\u0095\bº9\u0084zk?äþ¤\u001aÐU\u001fG|mJ\u0005匣掟匸杵毯\u001c\u009d\u0002áA¬Uh©o^2S\u0001\u0082\u0005¥1;\n]Ýkÿ\u0097\u0084«õ<\b\u008d¡Ç\u0084?Yÿc\u0011ºÆ%eâÿä\u0000\u001eÖ¯\u0006r© n\u0015\ra8®Ó\u0099<Ý\u0095Ç\u0085Ç\u0099\u0010\ti>1&#\u000eµ¥\u0019\u0017l\u008f\u0083\u0088@:Z\u0082{:ÅëZ3\u0007\u00adv\u0084bá{Ðë0a\u009enH\u0081%\u0014lüÑ8ÉÛêæ·-è\u008b\u009d\u001e\u0000i\u0084°E\u0010?\u008b#e\u009eÕ?á\u0010\u001b\u0089µ\u000ew\u009aÖ/Ã\u008fH\u0099\u0005掱史幭伕宩\u0006\u0093´|ÛV©1嬕钱嵲繓政压\u0002诶辟挞厢胋裢則挢¿姛柕断汯磰容廯譬匵涚轻掸å¤a晋咥按卖譴安鑎«6¨乡柅嬞鑜捡织þ«\u0002i\f\br{¸t©¼r@\u0007\u0011ïkv\u009e:Y\u0014\u0004\u0082Í\u008dQY^ì\u0087P1J4·ô\u001e\u000f9v\u0095\u0007i嬛钐揁繞ê²\u0018,ñÈãñ\u0094JU\u0005ga¬>kµ\u0085&J\u007fê^CB\u0088\u000e=(¢\u0098ÚneõOÿ¢R\u00172\u000f\\#ùÙyh\u0097òp\u0088bÍËÐ\u0097\u001f\u00044\u008eÿáÔn_þ\u0096\u000b\u00897,©bê\u009cøVr>\u0094Ñ\u008b\u000e.y÷Õá\u0016¤¸Ý\u009cHg\u0083}æs\u001bÝ\u0013,÷ìùSècN¯\u000fôYÀbNXQ\u0010öLOÁ66\u0019\u0003Ø±ÌKãÒ\u0083ñ\u000eÁg\u00802&\u0018ëÚëfyi)£´Pÿ¾\u0083E\u0015!V\u0006\u009b«\u0095¡\u0083\u0003\u00ad\u009fé\u000ed\u008cèæ±pÚ·d\u001fÍ7Ò=ÿ\u0011\u0089´\u0099áR)\u0004\u009d\u009eB%\u0017\u000f\fLIËñèH\fÿÛ\u009eð\tñ\u008aÈ\u0099c5Ê\u0002厼涹\u000f\u0001\u0080~Y\u0099?«ü©Ñ¤r[@¶\u0019ÙNZB\u0091§\u0099\u0002û:yá\u009fi\u0088Ø\u001d\u009e§ tÕg?ö\t;Vå\u001e¿\u009eª¼Õ\u0017\u0003\\tÆ\u0001L>\u0006ý\u0096\u0013ß\u0005`\u00ad¤Ô\u0082\u0013ÑþCÕ\u0006匮洀皎彷讅诟\u000f |ZÆ\u001dÌ;\u0082»\u001eæ\u008b\u0013\u007f¿\fî²\u001d\u0018\u001aç½ \u00904Lß\u000fê\r\u000e¥|qÎÛªQ\u0018\u008c\u009d\u0097m\u000e\u00078å\u009a2.xýìþÖr\u00996\f!è\u0084ªvGªçêw¿=\f\u001dó\u0003É\u0086+´j)ÆÇ\u000b6É\b¦Ù\\í HÁc\u0092Ä°BT\u0091Û\tÝ\u0017£Ë5\u000b\\Ô\"û\u000e\u0001Þ\u0018ÁFU¼.z_\u008eg'\u0006\u008dTBDÉ§:(,À\\\u0015Qé$D´£Ä±¬G¹-\u0097Î¥\u008a\u0004¯°ÂE\bÙ8Í\u001c\u0007±§á\u000b4QÓEraRVô\u0000K\fäk¥PíÏäe\u0088¯H0\u000f\u0007õ³ºË\u0092J¼\u0000ÑÒ4±{\u0005\u0014Ç\u008f§ó¸cäZ\u0015\u008fº>\r~Z^óé\u001eP\u0010ú\u008fË\u008b¼5þ¯¶ðÞ_ßç\u0097³\u0019\u00902º0ÚÝ`£T?@\u001a+Õw¨®Ô\u0019>I;\u000bh\u0084\u001ds\u0005_%eÙ\u0090|ª0\"\u009dà]òóKÔ\fsf\tìµykF6H9QÝ\u0018ä6xC\u008dCU¤?ý<ù\u008ceÀ¤®Oã»f\u0004\u0086[F\u0095Ìè\u009dØ`%'M\u0090´.~\u000eô\u001eÓ\u001e\u0092+&¢\u008d\u0099Úq¬\u0082\u008a6\u0081\u0098¯Ëm¯\u0004\u0000Wj@åêf\u001f\u0015²\u0099ð\u0005\u0006\u0089\u0081CÊÝðÚT%\u0095\u009c¨Öx®\u008b8ëÆñ.Ô¬\u000ef\u000fMÎª\u0005>e\u001e\u001b\u00adÙ\u0092Ú\u001a\u008c\u0002g2¹)?ìûçÁ6Á³æÞëQ\u008c\u001bFa\u0006MÆ§\u0095-`";
      int var20 = "3#\u0011`\u009fÉ¬È=²=C\u000f«\u0086USLZ\u0012\u008f\u008e\u009a\u000eÄ\u0085\u0098³ \u0018\u00936\\4©\u000fB\u0095\u0007\u000b¥þlW[A\u0016\u0097´hÎ\u008a»\u0011\u0097@tæ\u0018ùvN6\u009aîåñò4\u0003\u0086´Ê\bmä\u001e\rªV[\u0015\u0018\u0012áAÝ`l`uü\u001a¹º\u008b\u001fÛö\u008düpëýI=ä\u0017¤³\u0080;\u009fóíñ\u0087h\\\u0000ì\u009b\u0090Ûsmç,`ü\u0006\u0014\u0013p/Ó\r\u0092Õ\u0095ó\u007f\u0015\u00adU\u0019µÙÀÁ\u008f\u008a\u0011\u001c\u0096³WË¾\b\u008a\\0ÛË!(¦4C\u0006s¾\u0019`1\u001f\u0002\u000e]\u0004嬸儘该咗\u000bç\u0098\u008e®\u0097\u0098B5Þ¯]\u0004讥诗妉趝(k§Æn\u0093~S\u0095QÄõ¨ô2\u0006ÃhàjþÑ¦0¦üg<D\u0086\u0018Ï;æ>\u001a9\fg\u0080;\u0018Ð\u0091\u008eH\u0014Më±\u0014\u0016\u0089mAì¾ôÒ\u0096\u001bÉu¢¯Ø\trî<`ÁA\u0088\u000e\u0087\u0006且枙嬤鑐D4\u001b¢íZÄ{³=³\u0097\u001cX/é«q¾¸ã»§\u0002µ\u008b¯*6f(Æ\u007fsu%\u001d\u0085ù\u008bI®\u0019\u009f\u0004k\u0005Å8ßågÅæÊ&êgõí.¢ýKæ¯\"º\u0004VW\u0016j\u008bÏ¥ºæNU\u00816ÜFçT\u008a\u0080ðæ\u0007òá\u00187`\u0018\u0093Ûú\u00adô@[bÁäÚF\u0019\u0011r\u001aë\u0004\fùÎ\u001fÙFe¹»t\u009d\u0016Ô3\u0007}\u009d¿Ù2\u0011\u0012¢¡©'\u0099ÁjaGd\u0004\u0016²\u0006\u009b\u0016\u001dP\u008b\u0080\u0003tàô\n\u0083x3\u0098\u0099\u000b\u0003\u008f\u0011³\n\u009f<¦\u0080\n·+\u001ecx\u0007ÛÝ20µò<\fæÆåååyå³¨uLk\f亢枼寲铴斝単V县浃輙揯ì\u000fDmÖä\u008c\u0088\t\ný\u000f.©\u001a;\u009c:kw.y:7w\b\u009fC\u001cóÚ¸¶Rç\u0012i yäÏ\u0006\u009aÃ@\u0014è{\u0087bÿ\u0095\u000b\u00907dç½ß±{»ÐíµsÉ\u0087»B4\u000eýA`½\n\u0006OA\b_è\u001epìÃ\u0007\u008b\u0083î¨EÃ\u0001\u0006øxh¸\u001f\u0004\u0004~~¯÷\u0016\u009b#woA\u009dw'L²M\u000f½¨\u00940õ u¥J\u0018\u000e\nx6¢ÔfÜ,LP\u0002¥\u0097Á\f\u007fÔuÂ)\\|ÖÒ»\nº.ªe7=±W¤ÐvK³ÑÓÿ¤ê¿s9Ïs\u009d\u0087\u000fô!GÐÊT \u0098Ãx`å*r\\°ÕLà\u009ckò\u0011\u008d\rã\u0011»ëo5ÍÍf\"\u0095ÒD\u0015Ü\u000e¢\u009d&\u000e\u0082\u0082èª\u0099r\u009f\u0010úè\n丹枌宁铲崸纏故厾$\b\u0007Àq\u0087öh\b¤\n©Ò´»á\u009eÉ¾\u0016\n\u0015VÈ½1\f\u0019\u0011\u0017¸(ú~\u000b\u0092þ´å\u008f>\u00963\tÑB¸\u009c[Õ\u0085¨Ì\u001e°à6\u0010e\u008fT:]\u009e-ûÕ\u0003\"\u0087\u0088bäÂ\u00adÉÛ\u008dh\n;ðJ\u0097\u0005:\u0003Â(\n\u0003ë\u0083d\bÒwK\u001f+?U$#Å\"é9\u0085\u0082u\u008e»úY\u0091\u0086\" v\u008a'\u0096hïýl0©é\u0087 È\u0089^®ºð\b\u000e迶捏仜杹\u000b亾璝柤剼噤\u0088#<v\u0002K8\u0018\u0098c9\u0015\u0017\u0089°ô\u001dãBq^¸®\u0019\u0016s½QH\u0015RV\u0004嬘兑诡咾\u0003rqÿ\u0016H¶\u009d¬vÑ§!\u008dwµSs+\u0080\u0010V¢Ä\u0083eC*Æy_\u0083£c\u000b\u009báS ÅÜÍ¡[<ST7q\u0096§ËÌ¼Ý\u0081 ÕReDëuRÿ\u009d\f{\u0019ó\tëÒÃ\u0002ÿj¦ú\u008a\t\u008dü3K*/«÷\t\n\u001cöÀIç1ÌØè[\u0012å\u0089îç¡¶þQ\u001ddñþp\u0087\u0001\u008fÿ\u0090\u0013«Ta\u0095\u0095\u0013M\u000e¼2¯cÍû1Z\u0096\u0019ù\u0014ñ\u0085sm\u0086E¤o×,ÞB¢ú\u001d5[¤\u009ee\u0011\u008eó\u008f7§òlEQæ»å·ºÀSð\u0005厅挛召查歵7Q¿µ/.3l\u0093Z\u0018á«Þ¯\u0099,b½éðLgÆÌØ<Eö¿\u009d\u001d+Ä\u0094\u0005\u0089Ý!Ñá\u0010h\u0082î\u00adÎ\u0019üzÆE\u0090D\u0088º\u0003\u0006\u0089Ú\u000f$òý\t\u009dîÙS\u001d\u001a\u0090§@\u008eÄ\u001a\u0011¸ÄñL\u000f¾<(Ûø\"R,i÷LuSAÁÞð¦\u001c\u0091\u0012ñzl\u0099ñyô¨\\[Ù\u0019u{¡\u0010ëc\u000byøÂ\u0019æ¿ítÙ5a\u0019ÆÃ\u0095¥Z\\?L¥Y¶ÃNUNÊ[6Î\u0096¢\u0015C¿\u000f\f\u009bÕ\u0001\u0007f£t\u008e\nöí\u0080\u0016É\u009f\u00ad\u0089pugµ\u0095å¶\u0001\u0013a\u008cY×\u008bô¦cç\u0013ëÍþ%IÊ\u0012>*F\u0098¸?C«\u0096\u008c8×\b扲纚仁枴孆鑁;¸\u0018mý©´\u009aæ\fH#_ ²\u0000\u001f)Ï\u0017Ìÿ}`\"3n\u000f~X\u0013\u0093@\u0084f\u007fs\u0081å?(\u0002\u0081\u0018Ön\u0097\u0010\u001aê7\u009a¯\u009e\u009e\u0091$\u009e\u009b)\u0004ß;XÖ\u0015SB\u0002交枹\tí×¡\u001b1©÷QQ\u0004-àT@\u0018â´X\u009d¤ÃËìÛË¿ ãMU\u0085\u0098\u0085\u000eT^\u0007ôÊ\u000eÇõö l\u0000\u0017u¦C£¾\u008dn`£%\u001f{w%\u008b#\u0080:B*\u0010ÿÌ\u0016ïßÊ\u0013ì$×\u0007b³UÅu[è>F\t\u009aÁZ£\u009dGð¤®Qr\u0095\u0094í7\u008a©âgp¢¦\u001cCè·\u0086¸@\u0011\u0083\u009d5\u0000\u0017®ªá\"]Kí\u008a¹õ±V¡&4Mô(ir4ýR\\`ÆÛ$\u001dªãf¡ }h\u009c\u0016T[¬ ºñ¯¨Á6\u0097f³}\u0088ð?\u008c\u0087\u000b\u009dW¬X\tp\u0012¤¡2à A\u009e]\u0097F\u0085\u001eIz4\u0093Xè\u0004\u007f\u0083\u001e,\u000ecÑÌ\u008d\u007f£\u008b{Îä;O\u009b\u0003\u0011\u0097·\u0084÷\u0000\u0083ý}×\u0017 êÍJ¥ÔR\fÄ3êÛ\u001b0×ýþ\u0087\u0097)\u0002ì\u0013\u001b\u008cE¶I\u009eþ\u0092) pk\u0006¤Üî%\u0017]\u0097uZ\u0099ÁÂ\t\u008f#\u0010RÚ*c¥\"[\u0002ÓÆ\u0011I\u001eøæÕ\u001aîvüÆäÜöðï\u0007= =ù¤Gù-cÀÑ\u0014>2\u0095b\rgÎZ\u0004¡æû\u009a\u000f\u009a\u0007\\Æ\u000eAÌQÎ\b\u0016k8V\u0088PZ¹j\r辿揯仵杭.暥胂劀邭±ÜðQ9õ1ý±@.8;v'!m}kB(y]ºÉ\u0000Ú\u0091¨\u0001\u0018a\u0095Ü¼\u0011Ç\u0010ÔVÅ(>k\u000f³\u0017òÉCÉM\u009e6XàÏ\u0005iø\u0084\u0083\u0007\u001c\u001aþL\u009a\u0013\u0085\u0007ûD6\u0003#\u0094(\u0016 7]mXY\u0081º¦\u008b\u0013Â\u0015ÍÐ\u0092\u001d\u009ct\u009aÝ\u0090\u001c寳钼杶法凉辇Ýdò曔咈挑匫謁嬯鑴ø.)人枃孬鐀推縓,î%\u0016-\u0083Ü'¹+]¢\u0096BËj!'ùÔ\"f2ïé]>é\u0080n\u0014pGO\u001d\u009a\u0089\u001e\u0097]ôuß´\u0016c\u0081V\u009c\u0081Þæ¿\u0091\u0019\\\u0003^\u0095nì¼\u008aÔ»\u0002\u0010±\u009f-\u008eµ»s]:+¤\u0098\u0087¿Õ®ãß4\u0017\u001cÐ\u0016âÍÞm\u0098ÿ\nv\tRÍÊÅÅÎ²x \u0016:Ã\u0001\u0006輞掖仁杂抐劥\nEÿÚB\u001d\u0003\u0017\u009bæK \u0000C¿°$Éz\u0019{2A\u0088Ä\t+\u0018\u0098¤GÐ@-\u0097AcB\u009atº\nüì\b\u008c¥ìaÃWÝa\u0011Zê\u0018Y¾îä3Õ h\næ¼ï\u0089à\u0016\u00936wÎÝÒ\u0083Ó=ûÿ\u000eÈñ¨,ùKè`NÏ\u000ef7Âxê\u000bÇ\u0014¼oà;åÞ\tÏ¤\u008e9Ã\u0015>B\u0010\u0010B\u001e(ûå1S`Ò\u008a1À\u001aÉfó\u0017Ú×\u0012ç\u0012\u0014O\u009c\u0000e\u0001\u001d]^¨³y¢X\tÿ\u0019ü:¹\rd¥1qgÛ\u009fQ¾\u008cI\u0097÷³ä\u009bi0\u0017ª©\u0018ãd2\u0013A\u0012óå8ù¹Js³\u001eIÚ\bÇ!\u0085Ìïps5fÈT~gO3|\n~9\u008c°n\u000eý/Î§\u0007Ö,àûþµ\u000e$ò'\u0003³B¹\"ðy\b6/\u009eV\f*Ýl¸û)TÐ¸\u0091¸å'Hâ\u001fLÌÍXî\u00116¼°\u008a!¹\u0091\u007f:\u0098Î\u0001\u0080hêV\u0017\u0003\u001dKá\t\u008c\u0092\u0013\u0086a\u008dqÞ®?&^\u0097ÏO<¨rfd\u0081*®C\u000b){È\u009aZiçf±\u001aQ\rµ¦Æ\u000f\u007f¾¡Q34±ëññ\u0017ÕðS\u0089_\u001f\u0019ÁªO/¥¢I{yñà\u008dm[\u0007枣睎东朑寽铵V\u0013qµc\u0019û\u008aì6L\u0002ñ´«±¥øþ>Þ\f\rIÀ¢Â»ó\u0081¶MÔì\u0016\nXE\u0000\u0007p¿\u009aU\u0005nùÙv\u0018ëd[GÊ\fõ\u000f\u00ad\u008fJk\u008cç¯Á\u0016Þ\u0097t}¿cFÍ0L^ÊjÃ·üÑ37&}\u0017\u00170æ#UøÜ\u0015?X\r®:\u0014ùY÷&0RïD\u0019ÔÛ=ý?¤D$ÑAq¤O\u008d)q¿Óô\u0018õÜ4Å/¡'tå\u0012Êr\u00154çñÔ\u0085¥ \u0080\u009eÚ> \u0093YíÍ\u0087 rsº\u0003§º¶\u0012âKR\u0010z)\u001dà\u0093vØbù\u0002s\u008bê\u000b\r\u007f\u000b¢ÎÃpëi©ÊÎÌ¢\tRuÑ\\°Ò^¨-3®E\u0097ú\u0011\u0006ä-Ù\u0094c\u0007\u000e´!v¾\u00adÔ¦ö4'\u001cé\u008cäe¾ú¡^\u0005è¦\u009dY\f±.øºöÕlùËDùWª\u0013.ù·\u0004©\u0083²ÔY(l\u0014ß¾s*ÔÝ®\u0003N¾Ð\u001d\t\u0089b!\u0091d\u0015\u0004\u001b=>s\u000e1ÈÑ\u001cçëÒ>B§yq¡S\b-\u001cõw\fº\u0082ê`í\u001el\u0016Ó¹ß¼¢H\u009dÕ[}p×Gr\nÅô\u00103r\u0099Ô³\u001dëf\u001fºz|\u008bÍø\u0099\u0016sg'g\u0017\u0018h\u0092\u009b\u008e´cìÚC2o\u0088:\u0018\u0014À.ÍvÔÓÊ\u0092TJiy`×\u009ff\u008a\u00910bË\u0016(@.Ù;\u001cIu\rï\u0013\r^\fLm³¡µDP\u008cà5Ö\u0001\u0016\u0097\u0012»É\u0084Í\u001a(ÕÙ}\u008fÜ\u0087m_ª%\u0082\u00ad\u0003v\u000b\u0015\r>\u0019J¥bij)\u007f\u0002R\u0093\"áÇ»T?\u0099\u0098Ä\u0093¸n¸\u0015b\u0098®\u001bí°àíl4\u0094¾W\u0093üqvlÙmÓ9|gÌ{fwü\u0000îB2Ó\u001f¼\u000eÒð\u0002\u008b\"&§U\u0007\u0099ír+¾k]=\u0099\u008bg.\u000eC¯ +âáw!\u001e\u0001d¿\u0007Ñ$#\u0014<+\u001b\u001bÇ\u0081nÜMâ4\u0094úB]nî3ÿK\u0086f\u001aQþ\u009d\u009eæ$§Î\u001d\u0018¨GåÖEA\u0096ÅKN\u001fö\têËÃ\u0003Ö\u0006Ù\u008d*Fµ:Oþ\u009c\u000f,&×ÅjÅ°»t\u001cQ\u001en\u008b\u0080\u0004êîÚ#\u001bYN¼7e\u0084\u0016g{\u009a?kÉ6qôSo(15åç\u0003\u0006û(ACØZD~lJ\u000fb\u0005\u00805y}i¤wÅæ\u000e\u0007÷²ä%Ö\u007fL\u0011\u008dxµÊeg\u0084\u0006\u0095´ÞpcØµA\u0001+\u008cÔÊÕßj³\u000f\u009c÷ºÐ\r\u0084\u0012)\u009b3\u000fòâ\rX\u001cÎÂ,+¯(S\u009bl\u00ad\f³+x(½\u0095;\u009bõO\u0085:\rÛ\u00162ß\u0016\u0013©eaeÊ£\u007f\r\u0013¡/\u009brÚÝ<o`\u0016\u0099¹\b盺弹屪讶欶旆趑迀\u0013b\u0092>i\u0098.\u0094a\u009d\u009eôÂÌd\u0011q\u0098¶'\u0011\b½12\u009b\u0012\u0002\u001f\u001d\u0082ó\u009d$â\u0006mW=ó³L)¼Á\u0012ºi³áãU§ìÿÇ®ðcÅZêQ.`\u001b\u00972S[\u0010#G\u001b\u0088êfX\u0092Õê¤¬b¸çÅQ\u0002h¤\u009câ7·^{\u0014\u0095C\u0004pün§$ív:b\u000f_\u009e\u001cS£vÛ\u0016\u000eø#\u0017\\1ÖÝª2L~L\u008b\u009fz\u0016\fU~²¢å\b¹A\u0084¹ùÐ1Ç\u0005ç½yÿ}\u0011õÚà\u0012JVÑÑætM·ið\u001b\u001a\u008b\u001cÈ\u0017Úäè\b\u009b\u0099h\u0090½Kr'Ê7AÈæ´Åv¤Sº\u008fàî\u0005掍匾廪侌孙9\u0096\u0016\u0081Æ\u008d\u001dðVmààº\u0082Q\u008ekË\u0080\u008cS«Æ>\u0095\u0011Öo4\u0083¦¥8\u001aa@afÛ¬\u0089lÛ¤\u0092ûR}\u001câ\u0082¦OìïÅT$\u0002匑涶\u0007软揽仯术k¹\u007f\u0002²\u00930Klô\tÈ¤¼ßu{¾\u001f\u0003tY<Ønzv¡e\u008a²L\u000bBi\u008fÕ\u007f8äå\u0013®bÝ[ÂX\u0097~<\u008c1#1\u000e\nù8h%ÂÎ\u009fåì\u0084\u0086ÔÝ2\u0000 BF«\u0091³ß3Ê>Ì¥ÎWH\u0019:.\u0006S0d\u008cÜ£· ©æ³²¾\u0088!\u0095\u000f¯\u0011Ð\u0085\u0085;\u0096£Ëä!5¸#bªm]Ö¯°\u009e'Ê$\u0099\u001eÎ\u0093ò'©\u009b+É]ÔöLúÍéî_ua\u008cÂ¯\u0007ÜÔ\u0004B\b\u009eª#Â%\u001f³aÆÚ¥\u001a3\u008fó\u0098¥U¿ð¶\u0000o\u001d|£¬GÙMUÊ\u0098¨\u0002º\u0097\":\u0005¾ã@\u0083\u0010@üyßÀrA\u0088ÅT\u0089Ò¤8Àçøf|Ï\u009c\u0095sKôd\u0091UÆ\u0088\u008egÐÝ9½§:KÝÆu§GvZ\u008d\rÊ!\u0086±\u000fB\u0005¬î,9{ßK#NkLÜ&\nM\u0013êõ¢¦d*ý\u0005!@\u0013\u008fÎ¹ÊH®\u0089õ-\u0011}W\u0095\bº9\u0084zk?äþ¤\u001aÐU\u001fG|mJ\u0005匣掟匸杵毯\u001c\u009d\u0002áA¬Uh©o^2S\u0001\u0082\u0005¥1;\n]Ýkÿ\u0097\u0084«õ<\b\u008d¡Ç\u0084?Yÿc\u0011ºÆ%eâÿä\u0000\u001eÖ¯\u0006r© n\u0015\ra8®Ó\u0099<Ý\u0095Ç\u0085Ç\u0099\u0010\ti>1&#\u000eµ¥\u0019\u0017l\u008f\u0083\u0088@:Z\u0082{:ÅëZ3\u0007\u00adv\u0084bá{Ðë0a\u009enH\u0081%\u0014lüÑ8ÉÛêæ·-è\u008b\u009d\u001e\u0000i\u0084°E\u0010?\u008b#e\u009eÕ?á\u0010\u001b\u0089µ\u000ew\u009aÖ/Ã\u008fH\u0099\u0005掱史幭伕宩\u0006\u0093´|ÛV©1嬕钱嵲繓政压\u0002诶辟挞厢胋裢則挢¿姛柕断汯磰容廯譬匵涚轻掸å¤a晋咥按卖譴安鑎«6¨乡柅嬞鑜捡织þ«\u0002i\f\br{¸t©¼r@\u0007\u0011ïkv\u009e:Y\u0014\u0004\u0082Í\u008dQY^ì\u0087P1J4·ô\u001e\u000f9v\u0095\u0007i嬛钐揁繞ê²\u0018,ñÈãñ\u0094JU\u0005ga¬>kµ\u0085&J\u007fê^CB\u0088\u000e=(¢\u0098ÚneõOÿ¢R\u00172\u000f\\#ùÙyh\u0097òp\u0088bÍËÐ\u0097\u001f\u00044\u008eÿáÔn_þ\u0096\u000b\u00897,©bê\u009cøVr>\u0094Ñ\u008b\u000e.y÷Õá\u0016¤¸Ý\u009cHg\u0083}æs\u001bÝ\u0013,÷ìùSècN¯\u000fôYÀbNXQ\u0010öLOÁ66\u0019\u0003Ø±ÌKãÒ\u0083ñ\u000eÁg\u00802&\u0018ëÚëfyi)£´Pÿ¾\u0083E\u0015!V\u0006\u009b«\u0095¡\u0083\u0003\u00ad\u009fé\u000ed\u008cèæ±pÚ·d\u001fÍ7Ò=ÿ\u0011\u0089´\u0099áR)\u0004\u009d\u009eB%\u0017\u000f\fLIËñèH\fÿÛ\u009eð\tñ\u008aÈ\u0099c5Ê\u0002厼涹\u000f\u0001\u0080~Y\u0099?«ü©Ñ¤r[@¶\u0019ÙNZB\u0091§\u0099\u0002û:yá\u009fi\u0088Ø\u001d\u009e§ tÕg?ö\t;Vå\u001e¿\u009eª¼Õ\u0017\u0003\\tÆ\u0001L>\u0006ý\u0096\u0013ß\u0005`\u00ad¤Ô\u0082\u0013ÑþCÕ\u0006匮洀皎彷讅诟\u000f |ZÆ\u001dÌ;\u0082»\u001eæ\u008b\u0013\u007f¿\fî²\u001d\u0018\u001aç½ \u00904Lß\u000fê\r\u000e¥|qÎÛªQ\u0018\u008c\u009d\u0097m\u000e\u00078å\u009a2.xýìþÖr\u00996\f!è\u0084ªvGªçêw¿=\f\u001dó\u0003É\u0086+´j)ÆÇ\u000b6É\b¦Ù\\í HÁc\u0092Ä°BT\u0091Û\tÝ\u0017£Ë5\u000b\\Ô\"û\u000e\u0001Þ\u0018ÁFU¼.z_\u008eg'\u0006\u008dTBDÉ§:(,À\\\u0015Qé$D´£Ä±¬G¹-\u0097Î¥\u008a\u0004¯°ÂE\bÙ8Í\u001c\u0007±§á\u000b4QÓEraRVô\u0000K\fäk¥PíÏäe\u0088¯H0\u000f\u0007õ³ºË\u0092J¼\u0000ÑÒ4±{\u0005\u0014Ç\u008f§ó¸cäZ\u0015\u008fº>\r~Z^óé\u001eP\u0010ú\u008fË\u008b¼5þ¯¶ðÞ_ßç\u0097³\u0019\u00902º0ÚÝ`£T?@\u001a+Õw¨®Ô\u0019>I;\u000bh\u0084\u001ds\u0005_%eÙ\u0090|ª0\"\u009dà]òóKÔ\fsf\tìµykF6H9QÝ\u0018ä6xC\u008dCU¤?ý<ù\u008ceÀ¤®Oã»f\u0004\u0086[F\u0095Ìè\u009dØ`%'M\u0090´.~\u000eô\u001eÓ\u001e\u0092+&¢\u008d\u0099Úq¬\u0082\u008a6\u0081\u0098¯Ëm¯\u0004\u0000Wj@åêf\u001f\u0015²\u0099ð\u0005\u0006\u0089\u0081CÊÝðÚT%\u0095\u009c¨Öx®\u008b8ëÆñ.Ô¬\u000ef\u000fMÎª\u0005>e\u001e\u001b\u00adÙ\u0092Ú\u001a\u008c\u0002g2¹)?ìûçÁ6Á³æÞëQ\u008c\u001bFa\u0006MÆ§\u0095-`"
         .length();
      char var17 = 19;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 6;
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
                        var84 = 15;
                        break;
                     case 1:
                        var84 = 73;
                        break;
                     case 2:
                        var84 = 27;
                        break;
                     case 3:
                        var84 = 84;
                        break;
                     case 4:
                        var84 = 65;
                        break;
                     case 5:
                        var84 = 67;
                        break;
                     default:
                        var84 = 57;
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
                     ab = var21;
                     bb = new String[238];
                     long var8 = 3750145138319486808L;
                     long[] var14 = new long[62];
                     var11 = 0;
                     String var12 = "L\u001fC\u0007||o\u0004B\t\u000b\u0083ÉîmÛØË®\u0016±\u0098?+°n\u0083C\u0002Eº\u009a\u0089oø\u00998BñEFÅ÷ìaÅ¢¶îëÀ.khç\u0084¼\u001eY`CûD[Ìwç¤ô¯J\u001fôóoºûû7g+f$`Ü¿³ÔÜD\u0096©÷Rv¼\u008chûîc§eë(\u0097,Ã¹:u\u0084sÁY\u0002Ò\u009eEÄ\u0099e\u0091\u008c\u009eeó\"@ö\u0085Ì\bzr-ËOdK\u008e³Þo\u0085¡uö±äÆ\u0099Ë\u0082£»a½\u001c1µ\u0099êz®ú¯ó«§\u008c\"ÐòýáÆÖ» 'A\\\u000eøT¿\u0016\\\u0099ä\u0001\u0019¼\u0002¯\u0010Y\"F@Û\u009a\u0098u´Àæb½TqL\u0094ú§ä8<V\u000f\u0092í\u0012L:Á~\t^Ø\u0012vÌãºóÀnUVf¡JÛÔ¢\u008d8Fo- \u008cáª\u008f¶¸\u0094Ï_,\u0093cý²Ú[¹Þ®hC|Øõô¤ùq®>¬-\u001d\u0083É0\u0085\t?~\u0015\bäÄrJöÐ-c\u0001W£\u0019Ü\u008c\u008eÃG\u0000\u00852Á\u009eæÇ£\u008a¸¢\u0086ÒLÊtÉ³Gv{\u00adYg\u0017yä\u009a÷îq\fÃÚA´LHæo\u0019=G}þp«¢¦d\u009cMw\"\u0098>Åx%íj(©W$½J_Ár\u007f\u001c\u0082\"#¤÷=\u0085õ5C<\u0096\u000b\u0095\u008bhêFÂ\u009f\u008d¸m \u0091vk\u008eçÔ0Ö+£é\b '¯\u0013\u001bU\n02¬|öZîÕg$<èD·×®lð\u001e¾s¼ônY¹n\u0005ã\u009egí\u009fë`ôwo IB³n7c$¹\u008f\u009b·æi¬";
                     int var13 = "L\u001fC\u0007||o\u0004B\t\u000b\u0083ÉîmÛØË®\u0016±\u0098?+°n\u0083C\u0002Eº\u009a\u0089oø\u00998BñEFÅ÷ìaÅ¢¶îëÀ.khç\u0084¼\u001eY`CûD[Ìwç¤ô¯J\u001fôóoºûû7g+f$`Ü¿³ÔÜD\u0096©÷Rv¼\u008chûîc§eë(\u0097,Ã¹:u\u0084sÁY\u0002Ò\u009eEÄ\u0099e\u0091\u008c\u009eeó\"@ö\u0085Ì\bzr-ËOdK\u008e³Þo\u0085¡uö±äÆ\u0099Ë\u0082£»a½\u001c1µ\u0099êz®ú¯ó«§\u008c\"ÐòýáÆÖ» 'A\\\u000eøT¿\u0016\\\u0099ä\u0001\u0019¼\u0002¯\u0010Y\"F@Û\u009a\u0098u´Àæb½TqL\u0094ú§ä8<V\u000f\u0092í\u0012L:Á~\t^Ø\u0012vÌãºóÀnUVf¡JÛÔ¢\u008d8Fo- \u008cáª\u008f¶¸\u0094Ï_,\u0093cý²Ú[¹Þ®hC|Øõô¤ùq®>¬-\u001d\u0083É0\u0085\t?~\u0015\bäÄrJöÐ-c\u0001W£\u0019Ü\u008c\u008eÃG\u0000\u00852Á\u009eæÇ£\u008a¸¢\u0086ÒLÊtÉ³Gv{\u00adYg\u0017yä\u009a÷îq\fÃÚA´LHæo\u0019=G}þp«¢¦d\u009cMw\"\u0098>Åx%íj(©W$½J_Ár\u007f\u001c\u0082\"#¤÷=\u0085õ5C<\u0096\u000b\u0095\u008bhêFÂ\u009f\u008d¸m \u0091vk\u008eçÔ0Ö+£é\b '¯\u0013\u001bU\n02¬|öZîÕg$<èD·×®lð\u001e¾s¼ônY¹n\u0005ã\u009egí\u009fë`ôwo IB³n7c$¹\u008f\u009b·æi¬"
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
                                    cb = var14;
                                    db = new Integer[62];
                                    long var0 = 457930551664546820L;
                                    long[] var6 = new long[5];
                                    int var3 = 0;
                                    String var4 = "\u0018'òeÕ_V\b ·ü6Ôø\u001aÇJÆ}\u0007\u0019w¼u";
                                    int var5 = "\u0018'òeÕ_V\b ·ü6Ôø\u001aÇJÆ}\u0007\u0019w¼u".length();
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
                                                   eb = var6;
                                                   fb = new Long[5];
                                                   t$void();
                                                   c = E8.J(a(-8734, 20046));
                                                   iy = E8.J(a(-8821, 30128));
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "\u0012(5ôÅ¡\u001d:(\u0098\u001bÓ\u0014\u0080A¾";
                                                var5 = "\u0012(5ôÅ¡\u001d:(\u0098\u001bÓ\u0014\u0080A¾".length();
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

                                 var12 = "ÎÙ¸\u001ci£Jxü¥|cPv\u0018I";
                                 var13 = "ÎÙ¸\u001ci£Jxü¥|cPv\u0018I".length();
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

                  var18 = "sCÉ{bç\u00803ïÄ¦a6\u0012(\u0007¾X\u0002些朁";
                  var20 = "sCÉ{bç\u00803ïÄ¦a6\u0012(\u0007¾X\u0002些朁".length();
                  var17 = 18;
                  var26 = -1;
            }

            var10000 = 66;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





