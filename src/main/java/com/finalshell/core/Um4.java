package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

public class Um4 {
   public Font B;
   public Font W;
   public Font F;
   public Font Y;
   public Font w;
   int b;
   String o;
   static Locale E;
   static Graphics2D a;
   static int R;
   static int M;
   int u;
   static Font x;
   static Font d;
   static int s;
   int Z;
   boolean n;
   float Q;
   public static String[] c;
   public static String[] e;

   public Um4(String var1, int var2, boolean var3) {
      Registry.lookupField(180566717326200177L).setBoolean(this, false);
      Registry.lookupField(298575041160901307L).setFloat(this, 1.25F);
      long var5 = 403408974200984766L;
      Ref.s(403408974200984766L, var1, var5);
      Registry.lookupField(233306704579193301L).setInt(this, var2);
      Registry.lookupField(180566717326200177L).setBoolean(this, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var7 = 497175328745812458L;
      Object[] var6 = var10002;
      Ref.h(497175328745812458L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public void P() {
      Object var4 = 403408974200984766L;
      Registry.packArgs(
         Ref.g(403408974200984766L, var4),
         0,
         Registry.lookupField(233306704579193301L).getInt(this),
         Registry.lookupField(180566717326200177L).getBoolean(this)
      );
      long var6 = 519848640695097965L;
      Object var10003 = Ref.h2(519848640695097965L, var6);
      long var9 = 223904814779174458L;
      Object var8 = var10003;
      Ref.s(223904814779174458L, var8, var9);
      var10003 = (Graphics2D)Registry.lookupField(364518140765360504L).get(null);
      Object var10 = 223904814779174458L;
      this.setFont((Font)Ref.g(223904814779174458L, var10));
      FontMetrics var1 = ((Graphics2D)Registry.lookupField(364518140765360504L).get(null)).getFontMetrics();
      Registry.lookupField(123017744695968447L).setInt(this, var1.getHeight());
      float var2 = (float)Registry.lookupField(123017744695968447L).getInt(this) / (float)Registry.lookupField(552591624797315890L).getInt(null);
      Registry.packArgs(var1);
      long var12 = 242264890431253351L;
      Object var10005 = Ref.h2(242264890431253351L, var12);

      try {
         var30 = (Integer)var10005;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      float var3 = (float)var30 / (float)Registry.lookupField(124437334892454004L).getInt(null);
      Font var10006 = ((Font)Registry.lookupField(535357260704838668L).get(null)).deriveFont(AffineTransform.getScaleInstance((double)var2, (double)var2));
      long var15 = 352191715697652851L;
      Font var14 = var10006;
      Ref.s(352191715697652851L, var14, var15);
      Registry.lookupField(130139280233207437L).setInt(this, (int)(var2 * (float)Registry.lookupField(471787672653375500L).getInt(null)));
      Object var16 = 223904814779174458L;
      Font var10008 = ((Font)Ref.g(223904814779174458L, var16)).deriveFont(1);
      long var19 = 339341087782156692L;
      Font var18 = var10008;
      Ref.s(339341087782156692L, var18, var19);
      Object var20 = 223904814779174458L;
      Font var10010 = ((Font)Ref.g(223904814779174458L, var20)).deriveFont(2);
      long var23 = 230019576597980753L;
      Font var22 = var10010;
      Ref.s(230019576597980753L, var22, var23);
      Object var24 = 223904814779174458L;
      Font var10012 = ((Font)Ref.g(223904814779174458L, var24)).deriveFont(3);
      long var27 = 244381842022509280L;
      Font var26 = var10012;
      Ref.s(244381842022509280L, var26, var27);
   }

   public float F$float() {
      return Registry.lookupField(298575041160901307L).getFloat(this);
   }

   public void W(float var1) {
      Registry.lookupField(298575041160901307L).setFloat(this, var1);
   }

   static int b(FontMetrics var0) {
      int var1 = 0;

      for (int var5 : var0.getWidths()) {
         if (var5 > var1) {
            var1 = var5;
         }
      }

      return var1;
   }

   static Font D(String var0) throws FontFormatException, IOException {
      File var2 = new File(var0);
      FileInputStream var3 = new FileInputStream(var2);
      return Font.createFont(0, var3);
   }

   static Font A(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: sipush -21374
      // 03: aconst_null
      // 04: astore 2
      // 05: sipush 29675
      // 08: invokestatic com/finalshell/core/Um4.a (II)Ljava/lang/String;
      // 0b: astore 3
      // 0c: invokestatic com/finalshell/ui/panel/Zn2.g ()[I
      // 0f: new java/io/File
      // 12: dup
      // 13: aload 3
      // 14: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 17: astore 4
      // 19: astore 1
      // 1a: aload 4
      // 1c: aload 1
      // 1d: ifnonnull 3c
      // 20: invokevirtual java/io/File.exists ()Z
      // 23: ifne 3a
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Um4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 4
      // 2f: invokevirtual java/io/File.mkdirs ()Z
      // 32: pop
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Um4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 4
      // 3c: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 3f: astore 5
      // 41: aload 5
      // 43: astore 6
      // 45: aload 6
      // 47: arraylength
      // 48: istore 7
      // 4a: bipush 0
      // 4b: istore 8
      // 4d: iload 8
      // 4f: iload 7
      // 51: if_icmpge cd
      // 54: aload 6
      // 56: iload 8
      // 58: aaload
      // 59: astore 9
      // 5b: new java/io/FileInputStream
      // 5e: dup
      // 5f: aload 9
      // 61: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 64: astore 10
      // 66: bipush 0
      // 67: aload 10
      // 69: invokestatic java/awt/Font.createFont (ILjava/io/InputStream;)Ljava/awt/Font;
      // 6c: astore 11
      // 6e: aload 11
      // 70: aload 1
      // 71: ifnonnull ce
      // 74: aload 1
      // 75: ifnonnull 8b
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Um4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: ifnull b8
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/Um4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 11
      // 8b: ldc2_w 134536059572356228
      // 8e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 91: aconst_null
      // 92: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 95: checkcast java/util/Locale
      // 98: invokevirtual java/awt/Font.getFontName (Ljava/util/Locale;)Ljava/lang/String;
      // 9b: astore 12
      // 9d: aload 1
      // 9e: ifnonnull b4
      // a1: aload 12
      // a3: aload 0
      // a4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a7: ifeq b8
      // aa: goto b1
      // ad: invokestatic com/finalshell/core/Um4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: aload 11
      // b3: astore 2
      // b4: aload 1
      // b5: ifnull cd
      // b8: goto c6
      // bb: invokestatic com/finalshell/core/Um4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // be: athrow
      // bf: astore 10
      // c1: aload 10
      // c3: invokevirtual java/lang/Exception.printStackTrace ()V
      // c6: iinc 8 1
      // c9: aload 1
      // ca: ifnull 4d
      // cd: aload 2
      // ce: areturn
   }

   public int A$int() {
      return Registry.lookupField(130139280233207437L).getInt(this);
   }

   public void S(int var1) {
      Registry.lookupField(130139280233207437L).setInt(this, var1);
   }

   public Font V() {
      Object var1 = 223904814779174458L;
      return (Font)Ref.g(223904814779174458L, var1);
   }

   public void v(Font var1) {
      long var3 = 223904814779174458L;
      Ref.s(223904814779174458L, var1, var3);
   }

   public Font l$Font() {
      Object var1 = 339341087782156692L;
      return (Font)Ref.g(339341087782156692L, var1);
   }

   public void n(Font var1) {
      long var3 = 339341087782156692L;
      Ref.s(339341087782156692L, var1, var3);
   }

   public Font M() {
      Object var1 = 352191715697652851L;
      return (Font)Ref.g(352191715697652851L, var1);
   }

   public void i(Font var1) {
      long var3 = 352191715697652851L;
      Ref.s(352191715697652851L, var1, var3);
   }

   public Font F$Font() {
      Object var1 = 230019576597980753L;
      return (Font)Ref.g(230019576597980753L, var1);
   }

   public void S(Font var1) {
      long var3 = 230019576597980753L;
      Ref.s(230019576597980753L, var1, var3);
   }

   public Font A$Font() {
      Object var1 = 244381842022509280L;
      return (Font)Ref.g(244381842022509280L, var1);
   }

   public void d(Font var1) {
      long var3 = 244381842022509280L;
      Ref.s(244381842022509280L, var1, var3);
   }

   public int l$int() {
      return Registry.lookupField(233306704579193301L).getInt(this);
   }

   public void P(int var1) {
      Registry.lookupField(233306704579193301L).setInt(this, var1);
   }

   public String b() {
      Object var1 = 403408974200984766L;
      return (String)Ref.g(403408974200984766L, var1);
   }

   public void d(String var1) {
      long var3 = 403408974200984766L;
      Ref.s(403408974200984766L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -21373) & 65535;
      if (e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 220;
               break;
            case 1:
               var10000 = 55;
               break;
            case 2:
               var10000 = 168;
               break;
            case 3:
               var10000 = 63;
               break;
            case 4:
               var10000 = 119;
               break;
            case 5:
               var10000 = 179;
               break;
            case 6:
               var10000 = 115;
               break;
            case 7:
               var10000 = 12;
               break;
            case 8:
               var10000 = 100;
               break;
            case 9:
               var10000 = 104;
               break;
            case 10:
               var10000 = 149;
               break;
            case 11:
               var10000 = 33;
               break;
            case 12:
               var10000 = 105;
               break;
            case 13:
               var10000 = 173;
               break;
            case 14:
               var10000 = 146;
               break;
            case 15:
               var10000 = 4;
               break;
            case 16:
               var10000 = 237;
               break;
            case 17:
               var10000 = 29;
               break;
            case 18:
               var10000 = 251;
               break;
            case 19:
               var10000 = 221;
               break;
            case 20:
               var10000 = 18;
               break;
            case 21:
               var10000 = 171;
               break;
            case 22:
               var10000 = 250;
               break;
            case 23:
               var10000 = 185;
               break;
            case 24:
               var10000 = 60;
               break;
            case 25:
               var10000 = 167;
               break;
            case 26:
               var10000 = 202;
               break;
            case 27:
               var10000 = 159;
               break;
            case 28:
               var10000 = 42;
               break;
            case 29:
               var10000 = 9;
               break;
            case 30:
               var10000 = 79;
               break;
            case 31:
               var10000 = 162;
               break;
            case 32:
               var10000 = 11;
               break;
            case 33:
               var10000 = 240;
               break;
            case 34:
               var10000 = 232;
               break;
            case 35:
               var10000 = 239;
               break;
            case 36:
               var10000 = 150;
               break;
            case 37:
               var10000 = 56;
               break;
            case 38:
               var10000 = 141;
               break;
            case 39:
               var10000 = 125;
               break;
            case 40:
               var10000 = 224;
               break;
            case 41:
               var10000 = 199;
               break;
            case 42:
               var10000 = 66;
               break;
            case 43:
               var10000 = 212;
               break;
            case 44:
               var10000 = 106;
               break;
            case 45:
               var10000 = 131;
               break;
            case 46:
               var10000 = 142;
               break;
            case 47:
               var10000 = 84;
               break;
            case 48:
               var10000 = 233;
               break;
            case 49:
               var10000 = 59;
               break;
            case 50:
               var10000 = 16;
               break;
            case 51:
               var10000 = 95;
               break;
            case 52:
               var10000 = 193;
               break;
            case 53:
               var10000 = 238;
               break;
            case 54:
               var10000 = 188;
               break;
            case 55:
               var10000 = 6;
               break;
            case 56:
               var10000 = 226;
               break;
            case 57:
               var10000 = 241;
               break;
            case 58:
               var10000 = 47;
               break;
            case 59:
               var10000 = 218;
               break;
            case 60:
               var10000 = 3;
               break;
            case 61:
               var10000 = 200;
               break;
            case 62:
               var10000 = 176;
               break;
            case 63:
               var10000 = 28;
               break;
            case 64:
               var10000 = 101;
               break;
            case 65:
               var10000 = 229;
               break;
            case 66:
               var10000 = 244;
               break;
            case 67:
               var10000 = 196;
               break;
            case 68:
               var10000 = 134;
               break;
            case 69:
               var10000 = 107;
               break;
            case 70:
               var10000 = 184;
               break;
            case 71:
               var10000 = 144;
               break;
            case 72:
               var10000 = 1;
               break;
            case 73:
               var10000 = 103;
               break;
            case 74:
               var10000 = 230;
               break;
            case 75:
               var10000 = 90;
               break;
            case 76:
               var10000 = 27;
               break;
            case 77:
               var10000 = 139;
               break;
            case 78:
               var10000 = 213;
               break;
            case 79:
               var10000 = 166;
               break;
            case 80:
               var10000 = 127;
               break;
            case 81:
               var10000 = 148;
               break;
            case 82:
               var10000 = 248;
               break;
            case 83:
               var10000 = 128;
               break;
            case 84:
               var10000 = 92;
               break;
            case 85:
               var10000 = 219;
               break;
            case 86:
               var10000 = 253;
               break;
            case 87:
               var10000 = 36;
               break;
            case 88:
               var10000 = 189;
               break;
            case 89:
               var10000 = 175;
               break;
            case 90:
               var10000 = 110;
               break;
            case 91:
               var10000 = 228;
               break;
            case 92:
               var10000 = 117;
               break;
            case 93:
               var10000 = 50;
               break;
            case 94:
               var10000 = 75;
               break;
            case 95:
               var10000 = 114;
               break;
            case 96:
               var10000 = 96;
               break;
            case 97:
               var10000 = 129;
               break;
            case 98:
               var10000 = 170;
               break;
            case 99:
               var10000 = 72;
               break;
            case 100:
               var10000 = 85;
               break;
            case 101:
               var10000 = 254;
               break;
            case 102:
               var10000 = 80;
               break;
            case 103:
               var10000 = 98;
               break;
            case 104:
               var10000 = 41;
               break;
            case 105:
               var10000 = 97;
               break;
            case 106:
               var10000 = 190;
               break;
            case 107:
               var10000 = 8;
               break;
            case 108:
               var10000 = 132;
               break;
            case 109:
               var10000 = 121;
               break;
            case 110:
               var10000 = 62;
               break;
            case 111:
               var10000 = 147;
               break;
            case 112:
               var10000 = 215;
               break;
            case 113:
               var10000 = 187;
               break;
            case 114:
               var10000 = 44;
               break;
            case 115:
               var10000 = 235;
               break;
            case 116:
               var10000 = 205;
               break;
            case 117:
               var10000 = 136;
               break;
            case 118:
               var10000 = 35;
               break;
            case 119:
               var10000 = 83;
               break;
            case 120:
               var10000 = 160;
               break;
            case 121:
               var10000 = 182;
               break;
            case 122:
               var10000 = 76;
               break;
            case 123:
               var10000 = 242;
               break;
            case 124:
               var10000 = 130;
               break;
            case 125:
               var10000 = 247;
               break;
            case 126:
               var10000 = 211;
               break;
            case 127:
               var10000 = 116;
               break;
            case 128:
               var10000 = 204;
               break;
            case 129:
               var10000 = 137;
               break;
            case 130:
               var10000 = 164;
               break;
            case 131:
               var10000 = 43;
               break;
            case 132:
               var10000 = 203;
               break;
            case 133:
               var10000 = 118;
               break;
            case 134:
               var10000 = 10;
               break;
            case 135:
               var10000 = 178;
               break;
            case 136:
               var10000 = 174;
               break;
            case 137:
               var10000 = 30;
               break;
            case 138:
               var10000 = 255;
               break;
            case 139:
               var10000 = 234;
               break;
            case 140:
               var10000 = 93;
               break;
            case 141:
               var10000 = 48;
               break;
            case 142:
               var10000 = 22;
               break;
            case 143:
               var10000 = 198;
               break;
            case 144:
               var10000 = 124;
               break;
            case 145:
               var10000 = 153;
               break;
            case 146:
               var10000 = 88;
               break;
            case 147:
               var10000 = 225;
               break;
            case 148:
               var10000 = 246;
               break;
            case 149:
               var10000 = 17;
               break;
            case 150:
               var10000 = 87;
               break;
            case 151:
               var10000 = 181;
               break;
            case 152:
               var10000 = 70;
               break;
            case 153:
               var10000 = 138;
               break;
            case 154:
               var10000 = 245;
               break;
            case 155:
               var10000 = 26;
               break;
            case 156:
               var10000 = 0;
               break;
            case 157:
               var10000 = 32;
               break;
            case 158:
               var10000 = 236;
               break;
            case 159:
               var10000 = 68;
               break;
            case 160:
               var10000 = 113;
               break;
            case 161:
               var10000 = 172;
               break;
            case 162:
               var10000 = 24;
               break;
            case 163:
               var10000 = 154;
               break;
            case 164:
               var10000 = 40;
               break;
            case 165:
               var10000 = 5;
               break;
            case 166:
               var10000 = 61;
               break;
            case 167:
               var10000 = 152;
               break;
            case 168:
               var10000 = 49;
               break;
            case 169:
               var10000 = 2;
               break;
            case 170:
               var10000 = 151;
               break;
            case 171:
               var10000 = 163;
               break;
            case 172:
               var10000 = 25;
               break;
            case 173:
               var10000 = 201;
               break;
            case 174:
               var10000 = 120;
               break;
            case 175:
               var10000 = 21;
               break;
            case 176:
               var10000 = 34;
               break;
            case 177:
               var10000 = 194;
               break;
            case 178:
               var10000 = 19;
               break;
            case 179:
               var10000 = 222;
               break;
            case 180:
               var10000 = 67;
               break;
            case 181:
               var10000 = 57;
               break;
            case 182:
               var10000 = 177;
               break;
            case 183:
               var10000 = 82;
               break;
            case 184:
               var10000 = 65;
               break;
            case 185:
               var10000 = 165;
               break;
            case 186:
               var10000 = 31;
               break;
            case 187:
               var10000 = 207;
               break;
            case 188:
               var10000 = 135;
               break;
            case 189:
               var10000 = 51;
               break;
            case 190:
               var10000 = 133;
               break;
            case 191:
               var10000 = 112;
               break;
            case 192:
               var10000 = 192;
               break;
            case 193:
               var10000 = 81;
               break;
            case 194:
               var10000 = 23;
               break;
            case 195:
               var10000 = 126;
               break;
            case 196:
               var10000 = 161;
               break;
            case 197:
               var10000 = 231;
               break;
            case 198:
               var10000 = 217;
               break;
            case 199:
               var10000 = 37;
               break;
            case 200:
               var10000 = 156;
               break;
            case 201:
               var10000 = 214;
               break;
            case 202:
               var10000 = 111;
               break;
            case 203:
               var10000 = 195;
               break;
            case 204:
               var10000 = 140;
               break;
            case 205:
               var10000 = 206;
               break;
            case 206:
               var10000 = 108;
               break;
            case 207:
               var10000 = 71;
               break;
            case 208:
               var10000 = 180;
               break;
            case 209:
               var10000 = 123;
               break;
            case 210:
               var10000 = 7;
               break;
            case 211:
               var10000 = 53;
               break;
            case 212:
               var10000 = 58;
               break;
            case 213:
               var10000 = 186;
               break;
            case 214:
               var10000 = 13;
               break;
            case 215:
               var10000 = 46;
               break;
            case 216:
               var10000 = 197;
               break;
            case 217:
               var10000 = 54;
               break;
            case 218:
               var10000 = 191;
               break;
            case 219:
               var10000 = 227;
               break;
            case 220:
               var10000 = 69;
               break;
            case 221:
               var10000 = 78;
               break;
            case 222:
               var10000 = 20;
               break;
            case 223:
               var10000 = 216;
               break;
            case 224:
               var10000 = 102;
               break;
            case 225:
               var10000 = 94;
               break;
            case 226:
               var10000 = 15;
               break;
            case 227:
               var10000 = 38;
               break;
            case 228:
               var10000 = 99;
               break;
            case 229:
               var10000 = 252;
               break;
            case 230:
               var10000 = 169;
               break;
            case 231:
               var10000 = 183;
               break;
            case 232:
               var10000 = 143;
               break;
            case 233:
               var10000 = 210;
               break;
            case 234:
               var10000 = 39;
               break;
            case 235:
               var10000 = 77;
               break;
            case 236:
               var10000 = 145;
               break;
            case 237:
               var10000 = 45;
               break;
            case 238:
               var10000 = 64;
               break;
            case 239:
               var10000 = 158;
               break;
            case 240:
               var10000 = 223;
               break;
            case 241:
               var10000 = 74;
               break;
            case 242:
               var10000 = 73;
               break;
            case 243:
               var10000 = 155;
               break;
            case 244:
               var10000 = 14;
               break;
            case 245:
               var10000 = 243;
               break;
            case 246:
               var10000 = 52;
               break;
            case 247:
               var10000 = 91;
               break;
            case 248:
               var10000 = 109;
               break;
            case 249:
               var10000 = 89;
               break;
            case 250:
               var10000 = 249;
               break;
            case 251:
               var10000 = 209;
               break;
            case 252:
               var10000 = 86;
               break;
            case 253:
               var10000 = 208;
               break;
            case 254:
               var10000 = 122;
               break;
            default:
               var10000 = 157;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "ö÷¡M¤>¾·8\u0084\u0001Î\u0087Åj¦© \u0003T~¸\u0005\u0001\u0096³dþýÝ\u0085:Uåu%\u0015ÒÎ©n{\u0096m\u00827»\u000b|\"\u0007ãd+^Ç&à";
      int var4 = "ö÷¡M¤>¾·8\u0084\u0001Î\u0087Åj¦© \u0003T~¸\u0005\u0001\u0096³dþýÝ\u0085:Uåu%\u0015ÒÎ©n{\u0096m\u00827»\u000b|\"\u0007ãd+^Ç&à".length();
      char var1 = '2';
      int var18 = -1;

      label78:
      while (true) {
         byte var10000 = 27;
         String var10001 = var2.substring(++var18, var18 + var1);
         int var10002 = -1;

         while (true) {
      char[] var32;
            label73: {
               char[] var38 = var10001.toCharArray();
               int var10004 = var38.length;
               int var6 = 0;
               byte var41 = var10000;
               var32 = var38;
               int var24 = var10004;
               byte var46;
               char[] var50;
               int var10006;
               if (var10004 <= 1) {
                  var50 = var38;
                  var46 = var10000;
                  var10006 = var6;
               } else {
                  var41 = var10000;
                  var24 = var10004;
                  if (var10004 <= var6) {
                     break label73;
                  }

                  var50 = var38;
                  var46 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var59 = var50[var10006];
                  byte var60;
                  switch (var6 % 7) {
                     case 0:
                        var60 = 79;
                        break;
                     case 1:
                        var60 = 113;
                        break;
                     case 2:
                        var60 = 75;
                        break;
                     case 3:
                        var60 = 33;
                        break;
                     case 4:
                        var60 = 119;
                        break;
                     case 5:
                        var60 = 71;
                        break;
                     default:
                        var60 = 2;
                  }

                  var50[var10006] = (char)(var59 ^ var46 ^ var60);
                  var6++;
                  if (var41 == 0) {
                     var10006 = var41;
                     var50 = var32;
                     var46 = var41;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var50 = var32;
                     var46 = var41;
                     var10006 = var6;
                  }
               }
            }

            String var43 = new String(var32).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var43;
                  if ((var18 += var1) >= var4) {
                     c = var5;
                     e = new String[4];
                     Registry.lookupField(134536059572356228L).set(null, new Locale(a(-21375, -11211), a(-21376, 21850)));
                     Registry.packArgs(1, 1);
                     long var10 = 401056956354921780L;
                     Object var26 = Ref.h2(401056956354921780L, var10);

                     try {
                        var26 = (BufferedImage)var26;
                     } catch (InvocationTargetException var16) {
                        throw var16.getTargetException();
                     }

                     BufferedImage var7 = (BufferedImage)var26;
                     Registry.lookupField(364518140765360504L).set(null, var7.createGraphics());

                     try {
                        InputStream var8 = Um4.class.getResourceAsStream(a(-21373, 5029));
                        Registry.lookupField(578432565496224277L).set(null, null);
                        Registry.lookupField(578432565496224277L).set(null, Font.createFont(0, var8));
                        Registry.lookupField(535357260704838668L).set(null, ((Font)Registry.lookupField(578432565496224277L).get(null)).deriveFont(0, 128.0F));
                        ((Graphics2D)Registry.lookupField(364518140765360504L).get(null)).setFont((Font)Registry.lookupField(535357260704838668L).get(null));
                        FontMetrics var9 = ((Graphics2D)Registry.lookupField(364518140765360504L).get(null)).getFontMetrics();
                        Registry.lookupField(471787672653375500L).setInt(null, var9.getDescent());
                        Registry.lookupField(552591624797315890L).setInt(null, var9.getHeight());
                        Registry.packArgs(var9);
                        long var12 = 242264890431253351L;
                        Object var36 = Ref.h2(242264890431253351L, var12);

                        try {
                           var10002 = (Integer)var36;
                        } catch (InvocationTargetException var14) {
                           throw var14.getTargetException();
                        }

                        Registry.lookupField(124437334892454004L).setInt(null, var10002);
                     } catch (Exception var15) {
                        var15.printStackTrace();
                     }

                     return;
                  }

                  var1 = var2.charAt(var18);
                  break;
               default:
                  var5[var3++] = var43;
                  if ((var18 += var1) < var4) {
                     var1 = var2.charAt(var18);
                     continue label78;
                  }

                  var2 = "\r\u009b\u0002\u0091¦";
                  var4 = "\r\u009b\u0002\u0091¦".length();
                  var1 = 2;
                  var18 = -1;
            }

            var10000 = 97;
            var10001 = var2.substring(++var18, var18 + var1);
            var10002 = 0;
         }
      }
   }
}





