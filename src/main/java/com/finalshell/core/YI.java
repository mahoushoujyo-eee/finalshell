package com.finalshell.core;

import com.finalshell.connection.Connection12;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Zr2;
import com.finalshell.ui.panel.Address;
import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class YI implements PO3 {
   public static Random d;
   public boolean G;
   public Lv4_2 A;
   public String c;
   public String j;
   public String X;
   public static int e;
   public static int U;
   public static int z;
   public static int D;
   public static int Q;
   public static int g;
   public int u;
   public ArrayList R;
   public Connection12 o;
   public long J;
   public long W;
   public float r;
   public DecimalFormat Y;
   public static int I;
   public String v;
   public L0 O;
   public boolean f;
   public long F;
   public DY3 B;
   public com.finalshell.ui.model.Ck4 L;
   public Address q;
   public int y;
   public static int N;
   public static int l;
   public int m;
   public CK k;
   public static String[] a;
   public static String[] b;

   public YI(Connection12 var1, Lv4_2 var2, String var3, String var4, String var5, String var6, boolean var7) {
      Registry.lookupField(599949014459759654L).setBoolean(this, true);
      Registry.lookupField(235419407516667394L).setInt(this, ((Random)Registry.lookupField(287416731440393970L).get(null)).nextInt());
      Registry.lookupField(156944160001485315L).setInt(this, Registry.lookupField(476761782289979268L).getInt(null));
      ArrayList var10001 = new ArrayList();
      long var9 = 596061703104958760L;
      ArrayList var8 = var10001;
      Ref.s(596061703104958760L, var8, var9);
      Registry.lookupField(453239467128715174L).setFloat(this, -1.0F);
      DecimalFormat var10002 = new DecimalFormat(a(23311, 14580));
      long var11 = 590424579377289611L;
      DecimalFormat var10 = var10002;
      Ref.s(590424579377289611L, var10, var11);
      long var13 = 375795494916901132L;
      String var12 = "0";
      Ref.s(375795494916901132L, var12, var13);
      Registry.lookupField(451574105394034930L).setBoolean(this, false);
      Registry.lookupField(235243263568626732L).setInt(this, Registry.lookupField(454428843955025864L).getInt(null));
      long var15 = 275061180115109797L;
      Ref.s(275061180115109797L, var1, var15);
      long var17 = 275120163731345273L;
      Ref.s(275120163731345273L, var2, var17);
      long var19 = 340907212900255945L;
      Ref.s(340907212900255945L, var3, var19);
      long var21 = 377371690155578360L;
      Ref.s(377371690155578360L, var6, var21);
      long var23 = 309006563994833262L;
      Ref.s(309006563994833262L, var5, var23);
      Registry.lookupField(599949014459759654L).setBoolean(this, var7);
   }

   public YI(int var1, int var2, String var3, String var4, long var5, boolean var7) {
   super((String)Ref.g(309006563994833262L, var2));
   super();
      Connection12.X();
      Registry.lookupField(599949014459759654L).setBoolean(this, true);
      Registry.lookupField(235419407516667394L).setInt(this, ((Random)Registry.lookupField(287416731440393970L).get(null)).nextInt());
      Registry.lookupField(156944160001485315L).setInt(this, Registry.lookupField(476761782289979268L).getInt(null));
      ArrayList var10002 = new ArrayList();
      long var10 = 596061703104958760L;
      ArrayList var9 = var10002;
      Ref.s(596061703104958760L, var9, var10);
      Registry.lookupField(453239467128715174L).setFloat(this, -1.0F);
      DecimalFormat var10003 = new DecimalFormat(a(23310, -29292));
      long var12 = 590424579377289611L;
      DecimalFormat var11 = var10003;
      Ref.s(590424579377289611L, var11, var12);
      long var14 = 375795494916901132L;
      String var13 = "0";
      Ref.s(375795494916901132L, var13, var14);
      Registry.lookupField(451574105394034930L).setBoolean(this, false);
      Registry.lookupField(235243263568626732L).setInt(this, Registry.lookupField(454428843955025864L).getInt(null));
      Registry.lookupField(235243263568626732L).setInt(this, var1);
      Registry.lookupField(235419407516667394L).setInt(this, var2);
      long var16 = 377371690155578360L;
      Ref.s(377371690155578360L, var3, var16);
      long var18 = 309006563994833262L;
      Ref.s(309006563994833262L, var4, var18);
      Registry.lookupField(421926817811915901L).setLong(this, var5);
      Registry.lookupField(599949014459759654L).setBoolean(this, var7);
      if (Ky4.F$arrString() != null) {
         Connection12.c(this == null);
      }
   }

   public void B$void() {
      boolean var1 = Connection12.d$boolean();
      YI var10000 = this;
      if (!var1) {
         if (!Registry.lookupField(599949014459759654L).getBoolean(this)) {
            File var10001;
            Object var2 = 309006563994833262L;
            Registry.lookupField(421926817811915901L).setLong(var10001, var10001.length());
         }

         Registry.lookupField(462963046837501077L).setLong(this, 0L);
         Registry.lookupField(156944160001485315L).setInt(this, Registry.lookupField(476761782289979268L).getInt(null));
         var10000 = this;
         long var5 = 375795494916901132L;
         String var4 = "0";
         Ref.s(375795494916901132L, var4, var5);
      }

      Registry.lookupField(453239467128715174L).setFloat(var10000, -1.0F);
   }

   public void y() {
      L0 var10001 = new L0(2);
      long var3 = 321719495735028835L;
      L0 var2 = var10001;
      Ref.s(321719495735028835L, var2, var3);
      Registry.lookupField(156944160001485315L).setInt(this, Registry.lookupField(635857280906233483L).getInt(null));
      VO var1 = new VO(this, Registry.lookupField(372857647671097670L).getInt(null));
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 362963097309202183L;
      Object[] var4 = var10002;
      Ref.h(362963097309202183L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void W() {
   }

   public void u() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: new com/finalshell/core/L0
      // 004: dup
      // 005: bipush 2
      // 006: invokespecial com/finalshell/core/L0.<init> (I)V
      // 009: ldc2_w 321719495735028835
      // 00c: astore 7
      // 00e: astore 6
      // 010: ldc2_w 321719495735028835
      // 013: aload 6
      // 015: aload 7
      // 017: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 01a: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 01d: ldc2_w 282230959687568081
      // 020: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 023: aconst_null
      // 024: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 027: bipush 1
      // 028: iadd
      // 029: ldc2_w 282230959687568081
      // 02c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02f: aconst_null
      // 030: dup2_x1
      // 031: pop2
      // 032: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 035: istore 1
      // 036: aload 0
      // 037: aconst_null
      // 038: ldc2_w 538199581301250038
      // 03b: astore 9
      // 03d: astore 8
      // 03f: ldc2_w 538199581301250038
      // 042: aload 8
      // 044: aload 9
      // 046: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 049: aload 0
      // 04a: ldc2_w 635857280906233483
      // 04d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 050: aconst_null
      // 051: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 054: ldc2_w 156944160001485315
      // 057: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 05a: dup_x2
      // 05b: pop
      // 05c: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 05f: new com/finalshell/core/VO
      // 062: dup
      // 063: aload 0
      // 064: ldc2_w 372857647671097670
      // 067: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 06a: aconst_null
      // 06b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 06e: invokespecial com/finalshell/core/VO.<init> (Lcom/finalshell/core/YI;I)V
      // 071: astore 2
      // 072: aload 0
      // 073: aload 2
      // 074: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 077: ldc2_w 362963097309202183
      // 07a: astore 11
      // 07c: astore 10
      // 07e: ldc2_w 362963097309202183
      // 081: aload 10
      // 083: aload 11
      // 085: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 088: pop
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 0
      // 091: aconst_null
      // 092: ldc2_w 231797492164834063
      // 095: astore 13
      // 097: astore 12
      // 099: ldc2_w 231797492164834063
      // 09c: aload 12
      // 09e: aload 13
      // 0a0: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0a3: aload 0
      // 0a4: aload 0
      // 0a5: ldc2_w 275061180115109797
      // 0a8: astore 14
      // 0aa: ldc2_w 275061180115109797
      // 0ad: aload 14
      // 0af: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b5: ldc2_w 191192660445086924
      // 0b8: astore 17
      // 0ba: astore 16
      // 0bc: ldc2_w 191192660445086924
      // 0bf: aload 16
      // 0c1: aload 17
      // 0c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c6: goto 0cd
      // 0c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: ldc2_w 231797492164834063
      // 0d0: astore 19
      // 0d2: astore 18
      // 0d4: ldc2_w 231797492164834063
      // 0d7: aload 18
      // 0d9: aload 19
      // 0db: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0de: aload 0
      // 0df: iload 1
      // 0e0: ifeq 202
      // 0e3: ldc2_w 599949014459759654
      // 0e6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e9: swap
      // 0ea: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0ed: ifeq 1c2
      // 0f0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f3: ldc2_w 270389152141252877
      // 0f6: astore 20
      // 0f8: ldc2_w 270389152141252877
      // 0fb: aload 20
      // 0fd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 100: goto 107
      // 103: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 106: athrow
      // 107: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10a: ldc2_w 377280722715900564
      // 10d: astore 23
      // 10f: astore 22
      // 111: ldc2_w 377280722715900564
      // 114: aload 22
      // 116: aload 23
      // 118: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11b: goto 122
      // 11e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 121: athrow
      // 122: aload 0
      // 123: ldc2_w 377371690155578360
      // 126: astore 24
      // 128: ldc2_w 377371690155578360
      // 12b: aload 24
      // 12d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 130: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 133: ldc2_w 516351747037080661
      // 136: astore 27
      // 138: astore 26
      // 13a: ldc2_w 516351747037080661
      // 13d: aload 26
      // 13f: aload 27
      // 141: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 144: pop
      // 145: goto 14c
      // 148: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: new java/io/File
      // 14f: dup
      // 150: aload 0
      // 151: ldc2_w 377371690155578360
      // 154: astore 28
      // 156: ldc2_w 377371690155578360
      // 159: aload 28
      // 15b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 15e: checkcast java/lang/String
      // 161: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 164: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 167: astore 3
      // 168: iload 1
      // 169: ifeq 1be
      // 16c: aload 3
      // 16d: invokevirtual java/io/File.exists ()Z
      // 170: ifne 186
      // 173: goto 17a
      // 176: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: aload 3
      // 17b: invokevirtual java/io/File.mkdirs ()Z
      // 17e: pop
      // 17f: goto 186
      // 182: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 185: athrow
      // 186: aload 0
      // 187: ldc2_w 231797492164834063
      // 18a: astore 30
      // 18c: ldc2_w 231797492164834063
      // 18f: aload 30
      // 191: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 194: checkcast com/finalshell/core/DY3
      // 197: aload 0
      // 198: ldc2_w 309006563994833262
      // 19b: astore 32
      // 19d: ldc2_w 309006563994833262
      // 1a0: aload 32
      // 1a2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1a5: checkcast java/lang/String
      // 1a8: aload 0
      // 1a9: ldc2_w 377371690155578360
      // 1ac: astore 34
      // 1ae: ldc2_w 377371690155578360
      // 1b1: aload 34
      // 1b3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b6: checkcast java/lang/String
      // 1b9: aload 0
      // 1ba: bipush 0
      // 1bb: invokevirtual com/finalshell/core/DY3.K (Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/core/PO3;I)V
      // 1be: iload 1
      // 1bf: ifne 24a
      // 1c2: aload 0
      // 1c3: ldc2_w 231797492164834063
      // 1c6: astore 36
      // 1c8: ldc2_w 231797492164834063
      // 1cb: aload 36
      // 1cd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1d0: checkcast com/finalshell/core/DY3
      // 1d3: aload 0
      // 1d4: ldc2_w 309006563994833262
      // 1d7: astore 38
      // 1d9: ldc2_w 309006563994833262
      // 1dc: aload 38
      // 1de: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1e1: checkcast java/lang/String
      // 1e4: aload 0
      // 1e5: ldc2_w 377371690155578360
      // 1e8: astore 40
      // 1ea: ldc2_w 377371690155578360
      // 1ed: aload 40
      // 1ef: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f2: checkcast java/lang/String
      // 1f5: aload 0
      // 1f6: bipush 0
      // 1f7: invokevirtual com/finalshell/core/DY3.d (Ljava/lang/String;Ljava/lang/String;Lcom/finalshell/core/PO3;I)V
      // 1fa: aload 0
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 0
      // 203: ldc2_w 275061180115109797
      // 206: astore 42
      // 208: ldc2_w 275061180115109797
      // 20b: aload 42
      // 20d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 210: aload 0
      // 211: ldc2_w 377371690155578360
      // 214: astore 44
      // 216: ldc2_w 377371690155578360
      // 219: aload 44
      // 21b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 21e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 221: ldc2_w 303344491018408266
      // 224: astore 47
      // 226: astore 46
      // 228: ldc2_w 303344491018408266
      // 22b: aload 46
      // 22d: aload 47
      // 22f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 232: goto 239
      // 235: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 238: athrow
      // 239: ldc2_w 538199581301250038
      // 23c: astore 49
      // 23e: astore 48
      // 240: ldc2_w 538199581301250038
      // 243: aload 48
      // 245: aload 49
      // 247: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 24a: aload 0
      // 24b: ldc2_w 364503691566382472
      // 24e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 251: aconst_null
      // 252: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 255: ldc2_w 156944160001485315
      // 258: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 25b: dup_x2
      // 25c: pop
      // 25d: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 260: ldc2_w 282230959687568081
      // 263: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 266: aconst_null
      // 267: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 26a: bipush 1
      // 26b: isub
      // 26c: ldc2_w 282230959687568081
      // 26f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 272: aconst_null
      // 273: dup2_x1
      // 274: pop2
      // 275: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 278: aload 0
      // 279: ldc2_w 321719495735028835
      // 27c: astore 50
      // 27e: ldc2_w 321719495735028835
      // 281: aload 50
      // 283: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 286: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 289: ldc2_w 457664105228082520
      // 28c: astore 53
      // 28e: astore 52
      // 290: ldc2_w 457664105228082520
      // 293: aload 52
      // 295: aload 53
      // 297: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29a: pop
      // 29b: goto 2a2
      // 29e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a1: athrow
      // 2a2: aload 0
      // 2a3: ldc2_w 156944160001485315
      // 2a6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2a9: swap
      // 2aa: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2ad: ldc2_w 364503691566382472
      // 2b0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2b3: aconst_null
      // 2b4: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2b7: iload 1
      // 2b8: ifeq 37d
      // 2bb: if_icmpne 361
      // 2be: aload 0
      // 2bf: ldc2_w 275061180115109797
      // 2c2: astore 54
      // 2c4: ldc2_w 275061180115109797
      // 2c7: aload 54
      // 2c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2cc: aload 0
      // 2cd: ldc2_w 231797492164834063
      // 2d0: astore 56
      // 2d2: ldc2_w 231797492164834063
      // 2d5: aload 56
      // 2d7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2da: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2dd: ldc2_w 520173843466894851
      // 2e0: astore 59
      // 2e2: astore 58
      // 2e4: ldc2_w 520173843466894851
      // 2e7: aload 58
      // 2e9: aload 59
      // 2eb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2ee: pop
      // 2ef: goto 2f6
      // 2f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f5: athrow
      // 2f6: goto 2fe
      // 2f9: astore 3
      // 2fa: aload 3
      // 2fb: invokevirtual java/lang/Exception.printStackTrace ()V
      // 2fe: ldc2_w 388376917454860932
      // 301: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 304: aconst_null
      // 305: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 308: new com/finalshell/task/BI
      // 30b: dup
      // 30c: aload 0
      // 30d: invokespecial com/finalshell/task/BI.<init> (Lcom/finalshell/core/YI;)V
      // 310: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 313: ldc2_w 434592463220957006
      // 316: astore 61
      // 318: astore 60
      // 31a: ldc2_w 434592463220957006
      // 31d: aload 60
      // 31f: aload 61
      // 321: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 324: pop
      // 325: goto 32c
      // 328: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32b: athrow
      // 32c: new com/finalshell/core/VO
      // 32f: dup
      // 330: aload 0
      // 331: ldc2_w 242649790291880610
      // 334: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 337: aconst_null
      // 338: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 33b: invokespecial com/finalshell/core/VO.<init> (Lcom/finalshell/core/YI;I)V
      // 33e: astore 3
      // 33f: aload 0
      // 340: aload 3
      // 341: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 344: ldc2_w 362963097309202183
      // 347: astore 63
      // 349: astore 62
      // 34b: ldc2_w 362963097309202183
      // 34e: aload 62
      // 350: aload 63
      // 352: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 355: pop
      // 356: goto 35d
      // 359: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 35c: athrow
      // 35d: iload 1
      // 35e: ifne 67e
      // 361: aload 0
      // 362: ldc2_w 156944160001485315
      // 365: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 368: swap
      // 369: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 36c: ldc2_w 474112474147008326
      // 36f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 372: aconst_null
      // 373: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 376: goto 37d
      // 379: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37c: athrow
      // 37d: if_icmpne 67e
      // 380: new com/finalshell/core/VO
      // 383: dup
      // 384: aload 0
      // 385: ldc2_w 352927757876034743
      // 388: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 38b: aconst_null
      // 38c: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 38f: invokespecial com/finalshell/core/VO.<init> (Lcom/finalshell/core/YI;I)V
      // 392: astore 3
      // 393: aload 0
      // 394: aload 3
      // 395: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 398: ldc2_w 362963097309202183
      // 39b: astore 65
      // 39d: astore 64
      // 39f: ldc2_w 362963097309202183
      // 3a2: aload 64
      // 3a4: aload 65
      // 3a6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3a9: pop
      // 3aa: goto 3b1
      // 3ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3b0: athrow
      // 3b1: goto 67e
      // 3b4: astore 3
      // 3b5: aload 3
      // 3b6: invokevirtual java/lang/Exception.printStackTrace ()V
      // 3b9: aload 0
      // 3ba: ldc2_w 474112474147008326
      // 3bd: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3c0: aconst_null
      // 3c1: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 3c4: ldc2_w 156944160001485315
      // 3c7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3ca: dup_x2
      // 3cb: pop
      // 3cc: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 3cf: ldc2_w 282230959687568081
      // 3d2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3d5: aconst_null
      // 3d6: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 3d9: bipush 1
      // 3da: isub
      // 3db: ldc2_w 282230959687568081
      // 3de: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3e1: aconst_null
      // 3e2: dup2_x1
      // 3e3: pop2
      // 3e4: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 3e7: aload 0
      // 3e8: ldc2_w 321719495735028835
      // 3eb: astore 66
      // 3ed: ldc2_w 321719495735028835
      // 3f0: aload 66
      // 3f2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3f5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3f8: ldc2_w 457664105228082520
      // 3fb: astore 69
      // 3fd: astore 68
      // 3ff: ldc2_w 457664105228082520
      // 402: aload 68
      // 404: aload 69
      // 406: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 409: pop
      // 40a: goto 411
      // 40d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 410: athrow
      // 411: aload 0
      // 412: ldc2_w 156944160001485315
      // 415: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 418: swap
      // 419: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 41c: ldc2_w 364503691566382472
      // 41f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 422: aconst_null
      // 423: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 426: iload 1
      // 427: ifeq 4e4
      // 42a: if_icmpne 4cf
      // 42d: aload 0
      // 42e: ldc2_w 275061180115109797
      // 431: astore 70
      // 433: ldc2_w 275061180115109797
      // 436: aload 70
      // 438: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 43b: aload 0
      // 43c: ldc2_w 231797492164834063
      // 43f: astore 72
      // 441: ldc2_w 231797492164834063
      // 444: aload 72
      // 446: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 449: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 44c: ldc2_w 520173843466894851
      // 44f: astore 75
      // 451: astore 74
      // 453: ldc2_w 520173843466894851
      // 456: aload 74
      // 458: aload 75
      // 45a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 45d: pop
      // 45e: goto 465
      // 461: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 464: athrow
      // 465: goto 46d
      // 468: astore 3
      // 469: aload 3
      // 46a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 46d: ldc2_w 388376917454860932
      // 470: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 473: aconst_null
      // 474: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 477: new com/finalshell/task/BI
      // 47a: dup
      // 47b: aload 0
      // 47c: invokespecial com/finalshell/task/BI.<init> (Lcom/finalshell/core/YI;)V
      // 47f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 482: ldc2_w 434592463220957006
      // 485: astore 77
      // 487: astore 76
      // 489: ldc2_w 434592463220957006
      // 48c: aload 76
      // 48e: aload 77
      // 490: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 493: pop
      // 494: goto 49b
      // 497: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 49a: athrow
      // 49b: new com/finalshell/core/VO
      // 49e: dup
      // 49f: aload 0
      // 4a0: ldc2_w 242649790291880610
      // 4a3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 4a6: aconst_null
      // 4a7: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 4aa: invokespecial com/finalshell/core/VO.<init> (Lcom/finalshell/core/YI;I)V
      // 4ad: astore 3
      // 4ae: aload 0
      // 4af: aload 3
      // 4b0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4b3: ldc2_w 362963097309202183
      // 4b6: astore 79
      // 4b8: astore 78
      // 4ba: ldc2_w 362963097309202183
      // 4bd: aload 78
      // 4bf: aload 79
      // 4c1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c4: pop
      // 4c5: goto 4cc
      // 4c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4cb: athrow
      // 4cc: goto 67e
      // 4cf: aload 0
      // 4d0: ldc2_w 156944160001485315
      // 4d3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 4d6: swap
      // 4d7: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 4da: ldc2_w 474112474147008326
      // 4dd: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 4e0: aconst_null
      // 4e1: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 4e4: if_icmpne 67e
      // 4e7: new com/finalshell/core/VO
      // 4ea: dup
      // 4eb: aload 0
      // 4ec: ldc2_w 352927757876034743
      // 4ef: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 4f2: aconst_null
      // 4f3: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 4f6: invokespecial com/finalshell/core/VO.<init> (Lcom/finalshell/core/YI;I)V
      // 4f9: astore 3
      // 4fa: aload 0
      // 4fb: aload 3
      // 4fc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4ff: ldc2_w 362963097309202183
      // 502: astore 81
      // 504: astore 80
      // 506: ldc2_w 362963097309202183
      // 509: aload 80
      // 50b: aload 81
      // 50d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 510: pop
      // 511: goto 518
      // 514: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 517: athrow
      // 518: goto 67e
      // 51b: astore 4
      // 51d: ldc2_w 282230959687568081
      // 520: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 523: aconst_null
      // 524: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 527: bipush 1
      // 528: isub
      // 529: ldc2_w 282230959687568081
      // 52c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 52f: aconst_null
      // 530: dup2_x1
      // 531: pop2
      // 532: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 535: aload 0
      // 536: ldc2_w 321719495735028835
      // 539: astore 82
      // 53b: ldc2_w 321719495735028835
      // 53e: aload 82
      // 540: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 543: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 546: ldc2_w 457664105228082520
      // 549: astore 85
      // 54b: astore 84
      // 54d: ldc2_w 457664105228082520
      // 550: aload 84
      // 552: aload 85
      // 554: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 557: pop
      // 558: goto 55f
      // 55b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 55e: athrow
      // 55f: aload 0
      // 560: ldc2_w 156944160001485315
      // 563: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 566: swap
      // 567: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 56a: ldc2_w 364503691566382472
      // 56d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 570: aconst_null
      // 571: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 574: iload 1
      // 575: ifeq 645
      // 578: if_icmpne 629
      // 57b: goto 582
      // 57e: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 581: athrow
      // 582: aload 0
      // 583: ldc2_w 275061180115109797
      // 586: astore 86
      // 588: ldc2_w 275061180115109797
      // 58b: aload 86
      // 58d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 590: aload 0
      // 591: ldc2_w 231797492164834063
      // 594: astore 88
      // 596: ldc2_w 231797492164834063
      // 599: aload 88
      // 59b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 59e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5a1: ldc2_w 520173843466894851
      // 5a4: astore 91
      // 5a6: astore 90
      // 5a8: ldc2_w 520173843466894851
      // 5ab: aload 90
      // 5ad: aload 91
      // 5af: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5b2: pop
      // 5b3: goto 5ba
      // 5b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5b9: athrow
      // 5ba: goto 5c4
      // 5bd: astore 5
      // 5bf: aload 5
      // 5c1: invokevirtual java/lang/Exception.printStackTrace ()V
      // 5c4: ldc2_w 388376917454860932
      // 5c7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 5ca: aconst_null
      // 5cb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5ce: new com/finalshell/task/BI
      // 5d1: dup
      // 5d2: aload 0
      // 5d3: invokespecial com/finalshell/task/BI.<init> (Lcom/finalshell/core/YI;)V
      // 5d6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5d9: ldc2_w 434592463220957006
      // 5dc: astore 93
      // 5de: astore 92
      // 5e0: ldc2_w 434592463220957006
      // 5e3: aload 92
      // 5e5: aload 93
      // 5e7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5ea: pop
      // 5eb: goto 5f2
      // 5ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5f1: athrow
      // 5f2: new com/finalshell/core/VO
      // 5f5: dup
      // 5f6: aload 0
      // 5f7: ldc2_w 242649790291880610
      // 5fa: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 5fd: aconst_null
      // 5fe: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 601: invokespecial com/finalshell/core/VO.<init> (Lcom/finalshell/core/YI;I)V
      // 604: astore 5
      // 606: aload 0
      // 607: aload 5
      // 609: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 60c: ldc2_w 362963097309202183
      // 60f: astore 95
      // 611: astore 94
      // 613: ldc2_w 362963097309202183
      // 616: aload 94
      // 618: aload 95
      // 61a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 61d: pop
      // 61e: goto 625
      // 621: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 624: athrow
      // 625: iload 1
      // 626: ifne 67b
      // 629: aload 0
      // 62a: ldc2_w 156944160001485315
      // 62d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 630: swap
      // 631: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 634: ldc2_w 474112474147008326
      // 637: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 63a: aconst_null
      // 63b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 63e: goto 645
      // 641: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 644: athrow
      // 645: if_icmpne 67b
      // 648: new com/finalshell/core/VO
      // 64b: dup
      // 64c: aload 0
      // 64d: ldc2_w 352927757876034743
      // 650: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 653: aconst_null
      // 654: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 657: invokespecial com/finalshell/core/VO.<init> (Lcom/finalshell/core/YI;I)V
      // 65a: astore 5
      // 65c: aload 0
      // 65d: aload 5
      // 65f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 662: ldc2_w 362963097309202183
      // 665: astore 97
      // 667: astore 96
      // 669: ldc2_w 362963097309202183
      // 66c: aload 96
      // 66e: aload 97
      // 670: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 673: pop
      // 674: goto 67b
      // 677: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 67a: athrow
      // 67b: aload 4
      // 67d: athrow
      // 67e: return
   }

   public void E$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/connection/Connection12.X ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 0fa
      // 009: ldc2_w 231797492164834063
      // 00c: astore 3
      // 00d: ldc2_w 231797492164834063
      // 010: aload 3
      // 011: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 014: checkcast com/finalshell/core/DY3
      // 017: ifnull 0f9
      // 01a: goto 021
      // 01d: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: aload 0
      // 022: ldc2_w 156944160001485315
      // 025: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 028: swap
      // 029: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 02c: ldc2_w 635857280906233483
      // 02f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 032: aconst_null
      // 033: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 036: iload 1
      // 037: ifeq 0ce
      // 03a: goto 041
      // 03d: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: if_icmpne 0b2
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: ldc2_w 388376917454860932
      // 04e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 051: aconst_null
      // 052: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 055: new com/finalshell/task/Gx2
      // 058: dup
      // 059: aload 0
      // 05a: invokespecial com/finalshell/task/Gx2.<init> (Lcom/finalshell/core/YI;)V
      // 05d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 060: ldc2_w 434592463220957006
      // 063: astore 6
      // 065: astore 5
      // 067: ldc2_w 434592463220957006
      // 06a: aload 5
      // 06c: aload 6
      // 06e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 071: pop
      // 072: goto 079
      // 075: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 078: athrow
      // 079: ldc2_w 388376917454860932
      // 07c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 07f: aconst_null
      // 080: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 083: new com/finalshell/task/Aw2
      // 086: dup
      // 087: aload 0
      // 088: invokespecial com/finalshell/task/Aw2.<init> (Lcom/finalshell/core/YI;)V
      // 08b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 08e: ldc2_w 434592463220957006
      // 091: astore 8
      // 093: astore 7
      // 095: ldc2_w 434592463220957006
      // 098: aload 7
      // 09a: aload 8
      // 09c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09f: pop
      // 0a0: goto 0a7
      // 0a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: iload 1
      // 0a8: ifne 0f9
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: ldc2_w 156944160001485315
      // 0b6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0b9: swap
      // 0ba: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0bd: ldc2_w 476761782289979268
      // 0c0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0c3: aconst_null
      // 0c4: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: iload 1
      // 0cf: ifeq 119
      // 0d2: if_icmpne 0f9
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: ldc2_w 588497303530669971
      // 0e0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e3: aconst_null
      // 0e4: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0e7: ldc2_w 156944160001485315
      // 0ea: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ed: dup_x2
      // 0ee: pop
      // 0ef: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: iload 1
      // 0fb: ifeq 11d
      // 0fe: ldc2_w 235243263568626732
      // 101: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 104: swap
      // 105: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 108: ldc2_w 183482007281545121
      // 10b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 10e: aconst_null
      // 10f: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/YI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: if_icmpne 138
      // 11c: aload 0
      // 11d: ldc2_w 632636190150119565
      // 120: astore 9
      // 122: ldc2_w 632636190150119565
      // 125: aload 9
      // 127: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 12a: checkcast com/finalshell/core/CK
      // 12d: invokevirtual com/finalshell/core/CK.D$void ()V
      // 130: goto 138
      // 133: astore 2
      // 134: aload 2
      // 135: invokevirtual java/io/IOException.printStackTrace ()V
      // 138: return
   }

   @Override
   public void b(int var1, String var2, String var3, long var4) {
      Registry.lookupField(421926817811915901L).setLong(this, var4);
   }

   public boolean o$boolean(long var1) {
      Connection12.d$boolean();
      Registry.lookupField(462963046837501077L).setLong(this, Registry.lookupField(462963046837501077L).getLong(this) + var1);
      Registry.lookupField(453239467128715174L)
         .setFloat(
            this, (float)Registry.lookupField(462963046837501077L).getLong(this) * 100.0F / (float)Registry.lookupField(421926817811915901L).getLong(this)
         );
      Object var5 = 590424579377289611L;
      String var10003 = ((DecimalFormat)Ref.g(590424579377289611L, var5)).format((double)Registry.lookupField(453239467128715174L).getFloat(this));
      long var8 = 375795494916901132L;
      String var7 = var10003;
      Ref.s(375795494916901132L, var7, var8);
      if (this == null) {
         Object var9 = 375795494916901132L;
         if (((String)Ref.g(375795494916901132L, var9)).endsWith(a(23308, 11076))) {
            String var10004 = "" + (int)Registry.lookupField(453239467128715174L).getFloat(this);
            long var12 = 375795494916901132L;
            String var11 = var10004;
            Ref.s(375795494916901132L, var11, var12);
         }
      }

      Object var13 = 321719495735028835L;
      Ref.g(321719495735028835L, var13);
      Object[] var21 = Registry.packArgs((int)var1);
      long var16 = 293036687901413973L;
      Object[] var15 = var21;
      Ref.h(293036687901413973L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      VO var4 = new VO(this, Registry.lookupField(129638889012486075L).getInt(null));
      Object[] var10005 = Registry.packArgs(var4);
      long var18 = 362963097309202183L;
      Object[] var17 = var10005;
      Ref.h(362963097309202183L, var17, var18);

      try {
         return true;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }
   }

   public boolean G(long var1) {
      Registry.lookupField(462963046837501077L).setLong(this, Registry.lookupField(462963046837501077L).getLong(this) + var1);
      boolean var10000 = Connection12.d$boolean();
      Registry.lookupField(453239467128715174L)
         .setFloat(
            this, (float)Registry.lookupField(462963046837501077L).getLong(this) * 100.0F / (float)Registry.lookupField(421926817811915901L).getLong(this)
         );
      boolean var3 = var10000;
      Object var5 = 590424579377289611L;
      String var10002 = ((DecimalFormat)Ref.g(590424579377289611L, var5)).format((double)Registry.lookupField(453239467128715174L).getFloat(this));
      long var8 = 375795494916901132L;
      String var7 = var10002;
      Ref.s(375795494916901132L, var7, var8);
      if (!var3) {
         Object var9 = 375795494916901132L;
         if (((String)Ref.g(375795494916901132L, var9)).endsWith(a(23309, -16737))) {
            String var10004 = "" + (int)Registry.lookupField(453239467128715174L).getFloat(this);
            long var12 = 375795494916901132L;
            String var11 = var10004;
            Ref.s(375795494916901132L, var11, var12);
         }
      }

      Object var13 = 321719495735028835L;
      Ref.g(321719495735028835L, var13);
      Object[] var21 = Registry.packArgs((int)var1);
      long var16 = 293036687901413973L;
      Object[] var15 = var21;
      Ref.h(293036687901413973L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      VO var4 = new VO(this, Registry.lookupField(129638889012486075L).getInt(null));
      Object[] var10005 = Registry.packArgs(var4);
      long var18 = 362963097309202183L;
      Object[] var17 = var10005;
      Ref.h(362963097309202183L, var17, var18);

      try {
         return true;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }
   }

   public void w() {
      Registry.lookupField(156944160001485315L).setInt(this, Registry.lookupField(474112474147008326L).getInt(null));
      VO var1 = new VO(this, Registry.lookupField(352927757876034743L).getInt(null));
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 362963097309202183L;
      Object[] var2 = var10001;
      Ref.h(362963097309202183L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void N() {
      Registry.lookupField(156944160001485315L).setInt(this, Registry.lookupField(364503691566382472L).getInt(null));
      VO var1 = new VO(this, Registry.lookupField(242649790291880610L).getInt(null));
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 362963097309202183L;
      Object[] var2 = var10001;
      Ref.h(362963097309202183L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void c() {
   }

   public synchronized void w(Cq2 var1) {
      Object var2 = 596061703104958760L;
      ((ArrayList)Ref.g(596061703104958760L, var2)).add(var1);
   }

   public synchronized void V(VO var1) {
      Connection12.d$boolean();
      Object var5 = 596061703104958760L;
      Iterator var3 = ((ArrayList)Ref.g(596061703104958760L, var5)).iterator();
      YI var2 = this;

      while (var3.hasNext()) {
         Cq2 var4 = (Cq2)var3.next();
         Object[] var10002 = Registry.packArgs(var1);
         long var8 = 297776913386603291L;
         Object[] var7 = var10002;
         Ref.h(297776913386603291L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         if (var2 == null) {
            break;
         }
      }
   }

   public synchronized void v() {
      Registry.lookupField(156944160001485315L).setInt(this, Registry.lookupField(635857280906233483L).getInt(null));
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Zr2(this));
      long var2 = 434592463220957006L;
      Object[] var1 = var10001;
      Ref.h(434592463220957006L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public Lv4_2 E$lv_4() {
      Object var1 = 275120163731345273L;
      return (Lv4_2)Ref.g(275120163731345273L, var1);
   }

   public void H(Lv4_2 var1) {
      long var3 = 275120163731345273L;
      Ref.s(275120163731345273L, var1, var3);
   }

   public String o() {
      Object var1 = 309006563994833262L;
      return (String)Ref.g(309006563994833262L, var1);
   }

   public void I(String var1) {
      long var3 = 309006563994833262L;
      Ref.s(309006563994833262L, var1, var3);
   }

   public String F$String() {
      Object var1 = 377371690155578360L;
      return (String)Ref.g(377371690155578360L, var1);
   }

   public void Z(String var1) {
      long var3 = 377371690155578360L;
      Ref.s(377371690155578360L, var1, var3);
   }

   public int B$int() {
      return Registry.lookupField(235419407516667394L).getInt(this);
   }

   public void V(int var1) {
      Registry.lookupField(235419407516667394L).setInt(this, var1);
   }

   public boolean e() {
      return Registry.lookupField(599949014459759654L).getBoolean(this);
   }

   public int D() {
      return Registry.lookupField(156944160001485315L).getInt(this);
   }

   public float n() {
      return Registry.lookupField(453239467128715174L).getFloat(this);
   }

   public String m() {
      Object var1 = 375795494916901132L;
      return (String)Ref.g(375795494916901132L, var1);
   }

   public long Z() {
      return Registry.lookupField(421926817811915901L).getLong(this);
   }

   public void R(long var1) {
      Registry.lookupField(421926817811915901L).setLong(this, var1);
   }

   public long U() {
      return Registry.lookupField(462963046837501077L).getLong(this);
   }

   public void t(long var1) {
      Registry.lookupField(462963046837501077L).setLong(this, var1);
   }

   public L0 r() {
      Object var1 = 321719495735028835L;
      return (L0)Ref.g(321719495735028835L, var1);
   }

   public void f(L0 var1) {
      long var3 = 321719495735028835L;
      Ref.s(321719495735028835L, var1, var3);
   }

   public boolean x() {
      return Registry.lookupField(451574105394034930L).getBoolean(this);
   }

   public void g(boolean var1) {
      Registry.lookupField(451574105394034930L).setBoolean(this, var1);
   }

   public long R() {
      return Registry.lookupField(229000824307526334L).getLong(this);
   }

   public void o$void(long var1) {
      Registry.lookupField(229000824307526334L).setLong(this, var1);
   }

   public com.finalshell.ui.model.Ck4 Y() {
      Object var1 = 538199581301250038L;
      return (com.finalshell.ui.model.Ck4)Ref.g(538199581301250038L, var1);
   }

   public void k(com.finalshell.ui.model.Ck4 var1) {
      long var3 = 538199581301250038L;
      Ref.s(538199581301250038L, var1, var3);
   }

   public Address F$F6() {
      Object var1 = 523895448130328514L;
      return (Address)Ref.g(523895448130328514L, var1);
   }

   public void v(Address var1) {
      long var3 = 523895448130328514L;
      Ref.s(523895448130328514L, var1, var3);
   }

   public int t() {
      return Registry.lookupField(235243263568626732L).getInt(this);
   }

   public void d(int var1) {
      Registry.lookupField(235243263568626732L).setInt(this, var1);
   }

   public CK G() {
      Object var1 = 632636190150119565L;
      return (CK)Ref.g(632636190150119565L, var1);
   }

   public void J(CK var1) {
      long var3 = 632636190150119565L;
      Ref.s(632636190150119565L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 23310) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 211;
               break;
            case 1:
               var10000 = 43;
               break;
            case 2:
               var10000 = 27;
               break;
            case 3:
               var10000 = 212;
               break;
            case 4:
               var10000 = 73;
               break;
            case 5:
               var10000 = 50;
               break;
            case 6:
               var10000 = 58;
               break;
            case 7:
               var10000 = 53;
               break;
            case 8:
               var10000 = 48;
               break;
            case 9:
               var10000 = 90;
               break;
            case 10:
               var10000 = 99;
               break;
            case 11:
               var10000 = 29;
               break;
            case 12:
               var10000 = 208;
               break;
            case 13:
               var10000 = 197;
               break;
            case 14:
               var10000 = 240;
               break;
            case 15:
               var10000 = 170;
               break;
            case 16:
               var10000 = 138;
               break;
            case 17:
               var10000 = 229;
               break;
            case 18:
               var10000 = 47;
               break;
            case 19:
               var10000 = 98;
               break;
            case 20:
               var10000 = 202;
               break;
            case 21:
               var10000 = 141;
               break;
            case 22:
               var10000 = 186;
               break;
            case 23:
               var10000 = 4;
               break;
            case 24:
               var10000 = 20;
               break;
            case 25:
               var10000 = 79;
               break;
            case 26:
               var10000 = 78;
               break;
            case 27:
               var10000 = 192;
               break;
            case 28:
               var10000 = 203;
               break;
            case 29:
               var10000 = 96;
               break;
            case 30:
               var10000 = 117;
               break;
            case 31:
               var10000 = 248;
               break;
            case 32:
               var10000 = 15;
               break;
            case 33:
               var10000 = 64;
               break;
            case 34:
               var10000 = 225;
               break;
            case 35:
               var10000 = 205;
               break;
            case 36:
               var10000 = 129;
               break;
            case 37:
               var10000 = 160;
               break;
            case 38:
               var10000 = 11;
               break;
            case 39:
               var10000 = 69;
               break;
            case 40:
               var10000 = 34;
               break;
            case 41:
               var10000 = 97;
               break;
            case 42:
               var10000 = 14;
               break;
            case 43:
               var10000 = 188;
               break;
            case 44:
               var10000 = 38;
               break;
            case 45:
               var10000 = 171;
               break;
            case 46:
               var10000 = 177;
               break;
            case 47:
               var10000 = 2;
               break;
            case 48:
               var10000 = 30;
               break;
            case 49:
               var10000 = 72;
               break;
            case 50:
               var10000 = 1;
               break;
            case 51:
               var10000 = 255;
               break;
            case 52:
               var10000 = 8;
               break;
            case 53:
               var10000 = 41;
               break;
            case 54:
               var10000 = 3;
               break;
            case 55:
               var10000 = 175;
               break;
            case 56:
               var10000 = 245;
               break;
            case 57:
               var10000 = 109;
               break;
            case 58:
               var10000 = 191;
               break;
            case 59:
               var10000 = 94;
               break;
            case 60:
               var10000 = 164;
               break;
            case 61:
               var10000 = 59;
               break;
            case 62:
               var10000 = 131;
               break;
            case 63:
               var10000 = 251;
               break;
            case 64:
               var10000 = 49;
               break;
            case 65:
               var10000 = 33;
               break;
            case 66:
               var10000 = 230;
               break;
            case 67:
               var10000 = 44;
               break;
            case 68:
               var10000 = 19;
               break;
            case 69:
               var10000 = 132;
               break;
            case 70:
               var10000 = 124;
               break;
            case 71:
               var10000 = 142;
               break;
            case 72:
               var10000 = 210;
               break;
            case 73:
               var10000 = 254;
               break;
            case 74:
               var10000 = 224;
               break;
            case 75:
               var10000 = 7;
               break;
            case 76:
               var10000 = 67;
               break;
            case 77:
               var10000 = 152;
               break;
            case 78:
               var10000 = 37;
               break;
            case 79:
               var10000 = 89;
               break;
            case 80:
               var10000 = 239;
               break;
            case 81:
               var10000 = 6;
               break;
            case 82:
               var10000 = 226;
               break;
            case 83:
               var10000 = 36;
               break;
            case 84:
               var10000 = 181;
               break;
            case 85:
               var10000 = 169;
               break;
            case 86:
               var10000 = 163;
               break;
            case 87:
               var10000 = 253;
               break;
            case 88:
               var10000 = 227;
               break;
            case 89:
               var10000 = 232;
               break;
            case 90:
               var10000 = 122;
               break;
            case 91:
               var10000 = 31;
               break;
            case 92:
               var10000 = 16;
               break;
            case 93:
               var10000 = 45;
               break;
            case 94:
               var10000 = 176;
               break;
            case 95:
               var10000 = 107;
               break;
            case 96:
               var10000 = 238;
               break;
            case 97:
               var10000 = 194;
               break;
            case 98:
               var10000 = 13;
               break;
            case 99:
               var10000 = 128;
               break;
            case 100:
               var10000 = 157;
               break;
            case 101:
               var10000 = 120;
               break;
            case 102:
               var10000 = 228;
               break;
            case 103:
               var10000 = 24;
               break;
            case 104:
               var10000 = 162;
               break;
            case 105:
               var10000 = 168;
               break;
            case 106:
               var10000 = 178;
               break;
            case 107:
               var10000 = 5;
               break;
            case 108:
               var10000 = 118;
               break;
            case 109:
               var10000 = 150;
               break;
            case 110:
               var10000 = 114;
               break;
            case 111:
               var10000 = 92;
               break;
            case 112:
               var10000 = 220;
               break;
            case 113:
               var10000 = 56;
               break;
            case 114:
               var10000 = 113;
               break;
            case 115:
               var10000 = 190;
               break;
            case 116:
               var10000 = 112;
               break;
            case 117:
               var10000 = 71;
               break;
            case 118:
               var10000 = 105;
               break;
            case 119:
               var10000 = 200;
               break;
            case 120:
               var10000 = 201;
               break;
            case 121:
               var10000 = 81;
               break;
            case 122:
               var10000 = 65;
               break;
            case 123:
               var10000 = 40;
               break;
            case 124:
               var10000 = 196;
               break;
            case 125:
               var10000 = 51;
               break;
            case 126:
               var10000 = 88;
               break;
            case 127:
               var10000 = 39;
               break;
            case 128:
               var10000 = 104;
               break;
            case 129:
               var10000 = 86;
               break;
            case 130:
               var10000 = 221;
               break;
            case 131:
               var10000 = 209;
               break;
            case 132:
               var10000 = 102;
               break;
            case 133:
               var10000 = 12;
               break;
            case 134:
               var10000 = 167;
               break;
            case 135:
               var10000 = 61;
               break;
            case 136:
               var10000 = 145;
               break;
            case 137:
               var10000 = 151;
               break;
            case 138:
               var10000 = 154;
               break;
            case 139:
               var10000 = 184;
               break;
            case 140:
               var10000 = 249;
               break;
            case 141:
               var10000 = 123;
               break;
            case 142:
               var10000 = 136;
               break;
            case 143:
               var10000 = 156;
               break;
            case 144:
               var10000 = 246;
               break;
            case 145:
               var10000 = 155;
               break;
            case 146:
               var10000 = 22;
               break;
            case 147:
               var10000 = 235;
               break;
            case 148:
               var10000 = 70;
               break;
            case 149:
               var10000 = 75;
               break;
            case 150:
               var10000 = 111;
               break;
            case 151:
               var10000 = 85;
               break;
            case 152:
               var10000 = 247;
               break;
            case 153:
               var10000 = 222;
               break;
            case 154:
               var10000 = 159;
               break;
            case 155:
               var10000 = 55;
               break;
            case 156:
               var10000 = 0;
               break;
            case 157:
               var10000 = 100;
               break;
            case 158:
               var10000 = 121;
               break;
            case 159:
               var10000 = 134;
               break;
            case 160:
               var10000 = 17;
               break;
            case 161:
               var10000 = 195;
               break;
            case 162:
               var10000 = 241;
               break;
            case 163:
               var10000 = 125;
               break;
            case 164:
               var10000 = 28;
               break;
            case 165:
               var10000 = 207;
               break;
            case 166:
               var10000 = 101;
               break;
            case 167:
               var10000 = 137;
               break;
            case 168:
               var10000 = 147;
               break;
            case 169:
               var10000 = 216;
               break;
            case 170:
               var10000 = 183;
               break;
            case 171:
               var10000 = 119;
               break;
            case 172:
               var10000 = 66;
               break;
            case 173:
               var10000 = 87;
               break;
            case 174:
               var10000 = 74;
               break;
            case 175:
               var10000 = 231;
               break;
            case 176:
               var10000 = 84;
               break;
            case 177:
               var10000 = 217;
               break;
            case 178:
               var10000 = 174;
               break;
            case 179:
               var10000 = 108;
               break;
            case 180:
               var10000 = 26;
               break;
            case 181:
               var10000 = 77;
               break;
            case 182:
               var10000 = 198;
               break;
            case 183:
               var10000 = 126;
               break;
            case 184:
               var10000 = 54;
               break;
            case 185:
               var10000 = 244;
               break;
            case 186:
               var10000 = 76;
               break;
            case 187:
               var10000 = 166;
               break;
            case 188:
               var10000 = 133;
               break;
            case 189:
               var10000 = 140;
               break;
            case 190:
               var10000 = 233;
               break;
            case 191:
               var10000 = 237;
               break;
            case 192:
               var10000 = 187;
               break;
            case 193:
               var10000 = 139;
               break;
            case 194:
               var10000 = 127;
               break;
            case 195:
               var10000 = 25;
               break;
            case 196:
               var10000 = 106;
               break;
            case 197:
               var10000 = 80;
               break;
            case 198:
               var10000 = 214;
               break;
            case 199:
               var10000 = 83;
               break;
            case 200:
               var10000 = 204;
               break;
            case 201:
               var10000 = 135;
               break;
            case 202:
               var10000 = 10;
               break;
            case 203:
               var10000 = 165;
               break;
            case 204:
               var10000 = 153;
               break;
            case 205:
               var10000 = 193;
               break;
            case 206:
               var10000 = 82;
               break;
            case 207:
               var10000 = 21;
               break;
            case 208:
               var10000 = 42;
               break;
            case 209:
               var10000 = 93;
               break;
            case 210:
               var10000 = 161;
               break;
            case 211:
               var10000 = 158;
               break;
            case 212:
               var10000 = 23;
               break;
            case 213:
               var10000 = 115;
               break;
            case 214:
               var10000 = 199;
               break;
            case 215:
               var10000 = 32;
               break;
            case 216:
               var10000 = 149;
               break;
            case 217:
               var10000 = 46;
               break;
            case 218:
               var10000 = 223;
               break;
            case 219:
               var10000 = 243;
               break;
            case 220:
               var10000 = 182;
               break;
            case 221:
               var10000 = 60;
               break;
            case 222:
               var10000 = 219;
               break;
            case 223:
               var10000 = 146;
               break;
            case 224:
               var10000 = 180;
               break;
            case 225:
               var10000 = 52;
               break;
            case 226:
               var10000 = 252;
               break;
            case 227:
               var10000 = 179;
               break;
            case 228:
               var10000 = 250;
               break;
            case 229:
               var10000 = 68;
               break;
            case 230:
               var10000 = 130;
               break;
            case 231:
               var10000 = 172;
               break;
            case 232:
               var10000 = 206;
               break;
            case 233:
               var10000 = 35;
               break;
            case 234:
               var10000 = 213;
               break;
            case 235:
               var10000 = 218;
               break;
            case 236:
               var10000 = 110;
               break;
            case 237:
               var10000 = 62;
               break;
            case 238:
               var10000 = 148;
               break;
            case 239:
               var10000 = 242;
               break;
            case 240:
               var10000 = 57;
               break;
            case 241:
               var10000 = 116;
               break;
            case 242:
               var10000 = 9;
               break;
            case 243:
               var10000 = 236;
               break;
            case 244:
               var10000 = 143;
               break;
            case 245:
               var10000 = 185;
               break;
            case 246:
               var10000 = 91;
               break;
            case 247:
               var10000 = 234;
               break;
            case 248:
               var10000 = 215;
               break;
            case 249:
               var10000 = 63;
               break;
            case 250:
               var10000 = 95;
               break;
            case 251:
               var10000 = 189;
               break;
            case 252:
               var10000 = 173;
               break;
            case 253:
               var10000 = 144;
               break;
            case 254:
               var10000 = 18;
               break;
            default:
               var10000 = 103;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "-\u0014B8Ý\u0005}\u0019H\u0099\u009c";
      int var12 = "-\u0014B8Ý\u0005}\u0019H\u0099\u009c".length();
      char var9 = 5;
      int var17 = -1;

      label71:
      while (true) {
         byte var10000 = 29;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label66: {
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
                     break label66;
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
                        var65 = 99;
                        break;
                     case 1:
                        var65 = 67;
                        break;
                     case 2:
                        var65 = 66;
                        break;
                     case 3:
                        var65 = 5;
                        break;
                     case 4:
                        var65 = 101;
                        break;
                     case 5:
                        var65 = 107;
                        break;
                     default:
                        var65 = 96;
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
                     b = new String[4];
                     long var1 = 2902128104922392816L;
                     long[] var0 = new long[8];
                     int var4 = 0;
                     String var5 = "ËwZ!¢\u0093¨\u0088áC\u00887¢\u0093¨\u0094c\u0083Ñ;¢\u0093¨¯ä]\u0003ó¢\u0093¨ªs!ªG¢\u0093¨ä\u0091¶m´¢\u0093¨|";
                     int var6 = "ËwZ!¢\u0093¨\u0088áC\u00887¢\u0093¨\u0094c\u0083Ñ;¢\u0093¨¯ä]\u0003ó¢\u0093¨ªs!ªG¢\u0093¨ä\u0091¶m´¢\u0093¨|".length();
                     byte var3 = 0;

                     label45:
                     while (true) {
                        byte var26 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var26, var3).getBytes("ISO-8859-1");
                        long[] var19 = var0;
                        int var27 = var4++;
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
                           long var54 = var37 ^ var1;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var3 >= var6) {
                                    Registry.lookupField(287416731440393970L).set(null, new Random());
                                    Registry.lookupField(635857280906233483L).setInt(null, (int)var0[1]);
                                    Registry.lookupField(476761782289979268L).setInt(null, (int)var0[3]);
                                    Registry.lookupField(224137447456479561L).setInt(null, (int)var0[2]);
                                    Registry.lookupField(364503691566382472L).setInt(null, (int)var0[0]);
                                    Registry.lookupField(474112474147008326L).setInt(null, (int)var0[6]);
                                    Registry.lookupField(588497303530669971L).setInt(null, (int)var0[5]);
                                    Registry.lookupField(282230959687568081L).setInt(null, 0);
                                    Registry.lookupField(454428843955025864L).setInt(null, (int)var0[7]);
                                    Registry.lookupField(183482007281545121L).setInt(null, (int)var0[4]);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var3 < var6) {
                                    continue label45;
                                 }

                                 var5 = "ùfær¢\u0093¨rË\u009c~P¢\u0093¨ú";
                                 var6 = "ùfær¢\u0093¨rË\u009c~P¢\u0093¨ú".length();
                                 var3 = 0;
                           }

                           byte var28 = var3;
                           var3 += 8;
                           var7 = var5.substring(var28, var3).getBytes("ISO-8859-1");
                           var19 = var0;
                           var27 = var4++;
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
                     continue label71;
                  }

                  var10 = "\u000e)\u0002\u009b\u0086";
                  var12 = "\u000e)\u0002\u009b\u0086".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 88;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





