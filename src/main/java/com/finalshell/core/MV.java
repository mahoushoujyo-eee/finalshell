package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.O0;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;

public class MV {
   public HashMap v;
   public long T;
   public boolean H;
   public SimpleDateFormat b;
   public static String[] a;
   public static String[] c;
   public static long d;
   public static long e;

   public MV() {
      Object[] var12;
      HashMap var10001 = new HashMap();
      long var3 = 398995918008114658L;
      HashMap var2 = var10001;
      Ref.s(398995918008114658L, var2, var3);
      Registry.lookupField(324734664802285080L).setLong(this, 0L);
      Registry.lookupField(303519943996955852L).setBoolean(this, false);
      SimpleDateFormat var10002 = new SimpleDateFormat(a(7009, -3814));
      long var5 = 145348801342144095L;
      SimpleDateFormat var4 = var10002;
      Ref.s(145348801342144095L, var4, var5);

      try {
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 380574043775219665L;
         Object[] var6 = var10003;
         Ref.h(380574043775219665L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }
      } catch (Exception var11) {
      }

      Registry.lookupField(388376917454860932L).get(null);
      var12 = Registry.packArgs(new com.finalshell.task.D7(this), (int)d);
      long var9 = 201859364639460244L;
      Object[] var8 = var12;
      Ref.h(201859364639460244L, var8, var9);
   }

   public void v(String var1, String var2, int var3) {
      long var12;
      CT3 var4 = new CT3(var1, var2, System.currentTimeMillis(), var3);
      Object var5 = 398995918008114658L;
      ((HashMap)Ref.g(398995918008114658L, var5)).put(var1, var4);
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 198546643999975881L;
      Object[] var7 = var10002;
      Ref.h(198546643999975881L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Ref.h2(270389152141252877L, var9);
      Object[] var10004 = Registry.emptyArgs();
      var12 = 612604310671515822L;
      Object[] var11 = var10004;
      Ref.h(612604310671515822L, var11, var12);
      Object[] var10005 = Registry.emptyArgs();
      long var14 = 200561288808923907L;
      Object[] var13 = var10005;
      Ref.h(200561288808923907L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }
   }

   public void h(String var1, String var2, int var3) {
      Object[] var12;
      Object var4 = 398995918008114658L;
      ((HashMap)Ref.g(398995918008114658L, var4)).remove(var1);
      Object[] var10002 = Registry.emptyArgs();
      long var7 = 198546643999975881L;
      Object[] var6 = var10002;
      Ref.h(198546643999975881L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10004 = Registry.emptyArgs();
      long var11 = 612604310671515822L;
      Object[] var10 = var10004;
      Ref.h(612604310671515822L, var10, var11);
      Object[] var10005 = Registry.emptyArgs();
      long var13 = 200561288808923907L;
      var12 = var10005;
      Ref.h(200561288808923907L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }

   public void R(String var1, int var2) {
      Object[] var10001 = Registry.packArgs(var1, null, var2);
      long var4 = 200839191777796316L;
      Object[] var3 = var10001;
      Ref.h(200839191777796316L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public long Y(String var1) {
      Long var12;
      boolean var10000 = Ln4_2.i();
      long var3 = e;
      boolean var2 = var10000;
      Object var6 = 398995918008114658L;
      CT3 var5 = (CT3)((HashMap)Ref.g(398995918008114658L, var6)).get(var1);
      if (!var2 || var5 != null) {
         Object var10002 = Registry.emptyArgs();
         long var9 = 336340164074561368L;
         Object var8 = var10002;
         var10002 = Ref.h(336340164074561368L, var8, var9);

         try {
            var12 = (Long)var10002;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         var3 = var12;
      }

      return var3;
   }

   public void G(O0 var1) {
      String var10002 = a(7010, -18430);
      Object var2 = 398995918008114658L;
      Object[] var10 = Registry.packArgs(var10002, this, Ref.g(398995918008114658L, var2));
      long var5 = 431582369632369217L;
      Object[] var4 = var10;
      Ref.h(431582369632369217L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var7 = 619282492819259929L;
      Object[] var6 = var10003;
      Ref.h(619282492819259929L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public void T() throws Exception {
      Registry.packArgs(Registry.lookupField(520328224838264973L).get(null));
      long var3 = 340002508208074194L;
      Object var10001 = Ref.h2(340002508208074194L, var3);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      String var1 = (String)var10001;
      O0 var2 = O0.y(var1);
      Object[] var10002 = Registry.packArgs(var2);
      long var6 = 504292082390597764L;
      Object[] var5 = var10002;
      Ref.h(504292082390597764L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public O0 C() {
      O0 var1 = new O0();
      String var10002 = a(7020, 32020);
      Object var2 = 398995918008114658L;
      Object[] var7 = Registry.packArgs(var10002, this, Ref.g(398995918008114658L, var2));
      long var5 = 171030171221033251L;
      Object[] var4 = var7;
      Ref.h(171030171221033251L, var4, var5);

      try {
         return var1;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void E(O0 var1, String var2, HashMap var3) {
      Object[] var12;
      boolean var24;
      boolean var10000 = Ln4_2.i();
      O0 var5 = var1.D(var2);
      Iterator var6 = var5.keySet().iterator();
      boolean var4 = var10000;

      while (var6.hasNext()) {
         String var7;
         CT3 var20;
         label54: {
            var7 = (String)var6.next();
            O0 var8 = var5.D(var7);
            CT3 var9 = (CT3)var3.get(var7);
            CT3 var10 = new CT3(var8.C$String(a(7022, -15094)), var8.C$String(a(7016, 20338)), var8.I(a(7018, 25768)), var8.b(a(7023, -21795)));
            var20 = null;
            CT3 var21 = var9;
            if (var4) {
               if (var9 == null) {
                  var20 = var10;
                  break label54;
               }

               var21 = var10;
            }

            if (var4) {
               Object[] var10001 = Registry.emptyArgs();
               long var13 = 336340164074561368L;
               var12 = var10001;
               var10001 = Ref.h(336340164074561368L, var12, var13);

               try {
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               Object var10003 = Registry.emptyArgs();
               long var15 = 336340164074561368L;
               Object var14 = var10003;
               var10003 = Ref.h(336340164074561368L, var14, var15);

               try {
                  var24 = (Long)var10003;
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }

               if (var9 > var24) {
                  var20 = var10;
                  break label54;
               }
            }

            var20 = var21;
         }

         var3.put(var7, var20);
         Object var16 = 398995918008114658L;
         ((HashMap)Ref.g(398995918008114658L, var16)).put(var7, var20);
         if (!var4) {
            break;
         }
      }
   }

   public synchronized void N() {
      Registry.lookupField(303519943996955852L).setBoolean(this, true);
   }

   public void l(O0 var1, String var2, HashMap var3) {
      Long var25;
      Integer var27;
      boolean var10000 = Ln4_2.R();
      O0 var5 = new O0();
      var1.C(var2, var5);
      Iterator var6 = var3.keySet().iterator();
      boolean var4 = var10000;

      while (var6.hasNext()) {
         String var7 = (String)var6.next();
         CT3 var8 = (CT3)var3.get(var7);
         O0 var9 = new O0();
         String var10001 = a(7017, 10498);
         String var10003 = (String)(Registry.emptyArgs());
         long var11 = 269977014460000786L;
         Object var10 = var10003;
         var10003 = Ref.h(269977014460000786L, var10, var11);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         var10001.C(var8, var10003);
         String var10002 = a(7011, -3105);
         Object var12 = 322141930679153907L;
         var10002.C(var8, (String)Ref.g(322141930679153907L, var12));
         String var23 = a(7019, 12746);
         Object var10005 = Registry.emptyArgs();
         long var15 = 336340164074561368L;
         Object var14 = var10005;
         var10005 = Ref.h(336340164074561368L, var14, var15);

         try {
            var25 = (Long)var10005;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         var23.C(var8, var25);
         String var10004 = a(7021, -28158);
         Object var10006 = Registry.emptyArgs();
         long var17 = 402484330416858586L;
         Object var16 = var10006;
         var10006 = Ref.h(402484330416858586L, var16, var17);

         try {
            var27 = (Integer)var10006;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         var10004.C(var8, var27);
         var5.C(var7, var9);
         if (var4) {
            break;
         }
      }
   }

   public synchronized void I() {
      O0 var10001 = (O0)(Registry.emptyArgs());
      long var4 = 473402910517899072L;
      Object var3 = var10001;
      var10001 = Ref.h(473402910517899072L, var3, var4);

      try {
         var10001 = (O0)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      O0 var1 = var10001;

      try {
         Registry.packArgs(var1.V(), Registry.lookupField(520328224838264973L).get(null));
         long var5 = 373871880855596298L;
         Ref.h2(373871880855596298L, var5);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 7019) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 189;
               break;
            case 1:
               var10000 = 65;
               break;
            case 2:
               var10000 = 176;
               break;
            case 3:
               var10000 = 240;
               break;
            case 4:
               var10000 = 54;
               break;
            case 5:
               var10000 = 107;
               break;
            case 6:
               var10000 = 207;
               break;
            case 7:
               var10000 = 75;
               break;
            case 8:
               var10000 = 9;
               break;
            case 9:
               var10000 = 0;
               break;
            case 10:
               var10000 = 23;
               break;
            case 11:
               var10000 = 174;
               break;
            case 12:
               var10000 = 103;
               break;
            case 13:
               var10000 = 144;
               break;
            case 14:
               var10000 = 90;
               break;
            case 15:
               var10000 = 98;
               break;
            case 16:
               var10000 = 135;
               break;
            case 17:
               var10000 = 141;
               break;
            case 18:
               var10000 = 213;
               break;
            case 19:
               var10000 = 200;
               break;
            case 20:
               var10000 = 85;
               break;
            case 21:
               var10000 = 10;
               break;
            case 22:
               var10000 = 254;
               break;
            case 23:
               var10000 = 77;
               break;
            case 24:
               var10000 = 152;
               break;
            case 25:
               var10000 = 91;
               break;
            case 26:
               var10000 = 105;
               break;
            case 27:
               var10000 = 64;
               break;
            case 28:
               var10000 = 70;
               break;
            case 29:
               var10000 = 44;
               break;
            case 30:
               var10000 = 108;
               break;
            case 31:
               var10000 = 2;
               break;
            case 32:
               var10000 = 153;
               break;
            case 33:
               var10000 = 14;
               break;
            case 34:
               var10000 = 97;
               break;
            case 35:
               var10000 = 241;
               break;
            case 36:
               var10000 = 27;
               break;
            case 37:
               var10000 = 229;
               break;
            case 38:
               var10000 = 171;
               break;
            case 39:
               var10000 = 180;
               break;
            case 40:
               var10000 = 126;
               break;
            case 41:
               var10000 = 60;
               break;
            case 42:
               var10000 = 82;
               break;
            case 43:
               var10000 = 96;
               break;
            case 44:
               var10000 = 218;
               break;
            case 45:
               var10000 = 159;
               break;
            case 46:
               var10000 = 220;
               break;
            case 47:
               var10000 = 115;
               break;
            case 48:
               var10000 = 223;
               break;
            case 49:
               var10000 = 29;
               break;
            case 50:
               var10000 = 215;
               break;
            case 51:
               var10000 = 92;
               break;
            case 52:
               var10000 = 89;
               break;
            case 53:
               var10000 = 133;
               break;
            case 54:
               var10000 = 195;
               break;
            case 55:
               var10000 = 182;
               break;
            case 56:
               var10000 = 131;
               break;
            case 57:
               var10000 = 236;
               break;
            case 58:
               var10000 = 224;
               break;
            case 59:
               var10000 = 5;
               break;
            case 60:
               var10000 = 221;
               break;
            case 61:
               var10000 = 79;
               break;
            case 62:
               var10000 = 130;
               break;
            case 63:
               var10000 = 181;
               break;
            case 64:
               var10000 = 201;
               break;
            case 65:
               var10000 = 208;
               break;
            case 66:
               var10000 = 147;
               break;
            case 67:
               var10000 = 78;
               break;
            case 68:
               var10000 = 42;
               break;
            case 69:
               var10000 = 222;
               break;
            case 70:
               var10000 = 86;
               break;
            case 71:
               var10000 = 137;
               break;
            case 72:
               var10000 = 62;
               break;
            case 73:
               var10000 = 230;
               break;
            case 74:
               var10000 = 203;
               break;
            case 75:
               var10000 = 149;
               break;
            case 76:
               var10000 = 68;
               break;
            case 77:
               var10000 = 157;
               break;
            case 78:
               var10000 = 194;
               break;
            case 79:
               var10000 = 26;
               break;
            case 80:
               var10000 = 31;
               break;
            case 81:
               var10000 = 177;
               break;
            case 82:
               var10000 = 112;
               break;
            case 83:
               var10000 = 150;
               break;
            case 84:
               var10000 = 134;
               break;
            case 85:
               var10000 = 116;
               break;
            case 86:
               var10000 = 142;
               break;
            case 87:
               var10000 = 251;
               break;
            case 88:
               var10000 = 209;
               break;
            case 89:
               var10000 = 242;
               break;
            case 90:
               var10000 = 43;
               break;
            case 91:
               var10000 = 49;
               break;
            case 92:
               var10000 = 113;
               break;
            case 93:
               var10000 = 143;
               break;
            case 94:
               var10000 = 167;
               break;
            case 95:
               var10000 = 155;
               break;
            case 96:
               var10000 = 186;
               break;
            case 97:
               var10000 = 170;
               break;
            case 98:
               var10000 = 1;
               break;
            case 99:
               var10000 = 72;
               break;
            case 100:
               var10000 = 117;
               break;
            case 101:
               var10000 = 237;
               break;
            case 102:
               var10000 = 66;
               break;
            case 103:
               var10000 = 110;
               break;
            case 104:
               var10000 = 219;
               break;
            case 105:
               var10000 = 32;
               break;
            case 106:
               var10000 = 206;
               break;
            case 107:
               var10000 = 248;
               break;
            case 108:
               var10000 = 129;
               break;
            case 109:
               var10000 = 225;
               break;
            case 110:
               var10000 = 118;
               break;
            case 111:
               var10000 = 12;
               break;
            case 112:
               var10000 = 37;
               break;
            case 113:
               var10000 = 83;
               break;
            case 114:
               var10000 = 111;
               break;
            case 115:
               var10000 = 172;
               break;
            case 116:
               var10000 = 61;
               break;
            case 117:
               var10000 = 255;
               break;
            case 118:
               var10000 = 88;
               break;
            case 119:
               var10000 = 109;
               break;
            case 120:
               var10000 = 7;
               break;
            case 121:
               var10000 = 158;
               break;
            case 122:
               var10000 = 210;
               break;
            case 123:
               var10000 = 205;
               break;
            case 124:
               var10000 = 45;
               break;
            case 125:
               var10000 = 166;
               break;
            case 126:
               var10000 = 73;
               break;
            case 127:
               var10000 = 38;
               break;
            case 128:
               var10000 = 81;
               break;
            case 129:
               var10000 = 56;
               break;
            case 130:
               var10000 = 162;
               break;
            case 131:
               var10000 = 183;
               break;
            case 132:
               var10000 = 185;
               break;
            case 133:
               var10000 = 57;
               break;
            case 134:
               var10000 = 234;
               break;
            case 135:
               var10000 = 40;
               break;
            case 136:
               var10000 = 217;
               break;
            case 137:
               var10000 = 178;
               break;
            case 138:
               var10000 = 4;
               break;
            case 139:
               var10000 = 168;
               break;
            case 140:
               var10000 = 63;
               break;
            case 141:
               var10000 = 231;
               break;
            case 142:
               var10000 = 184;
               break;
            case 143:
               var10000 = 156;
               break;
            case 144:
               var10000 = 123;
               break;
            case 145:
               var10000 = 160;
               break;
            case 146:
               var10000 = 179;
               break;
            case 147:
               var10000 = 216;
               break;
            case 148:
               var10000 = 132;
               break;
            case 149:
               var10000 = 247;
               break;
            case 150:
               var10000 = 55;
               break;
            case 151:
               var10000 = 197;
               break;
            case 152:
               var10000 = 204;
               break;
            case 153:
               var10000 = 16;
               break;
            case 154:
               var10000 = 53;
               break;
            case 155:
               var10000 = 35;
               break;
            case 156:
               var10000 = 69;
               break;
            case 157:
               var10000 = 102;
               break;
            case 158:
               var10000 = 140;
               break;
            case 159:
               var10000 = 169;
               break;
            case 160:
               var10000 = 245;
               break;
            case 161:
               var10000 = 228;
               break;
            case 162:
               var10000 = 239;
               break;
            case 163:
               var10000 = 214;
               break;
            case 164:
               var10000 = 235;
               break;
            case 165:
               var10000 = 148;
               break;
            case 166:
               var10000 = 127;
               break;
            case 167:
               var10000 = 39;
               break;
            case 168:
               var10000 = 165;
               break;
            case 169:
               var10000 = 34;
               break;
            case 170:
               var10000 = 36;
               break;
            case 171:
               var10000 = 94;
               break;
            case 172:
               var10000 = 33;
               break;
            case 173:
               var10000 = 253;
               break;
            case 174:
               var10000 = 188;
               break;
            case 175:
               var10000 = 41;
               break;
            case 176:
               var10000 = 13;
               break;
            case 177:
               var10000 = 227;
               break;
            case 178:
               var10000 = 233;
               break;
            case 179:
               var10000 = 30;
               break;
            case 180:
               var10000 = 193;
               break;
            case 181:
               var10000 = 100;
               break;
            case 182:
               var10000 = 48;
               break;
            case 183:
               var10000 = 125;
               break;
            case 184:
               var10000 = 46;
               break;
            case 185:
               var10000 = 164;
               break;
            case 186:
               var10000 = 124;
               break;
            case 187:
               var10000 = 71;
               break;
            case 188:
               var10000 = 99;
               break;
            case 189:
               var10000 = 211;
               break;
            case 190:
               var10000 = 93;
               break;
            case 191:
               var10000 = 84;
               break;
            case 192:
               var10000 = 198;
               break;
            case 193:
               var10000 = 128;
               break;
            case 194:
               var10000 = 175;
               break;
            case 195:
               var10000 = 47;
               break;
            case 196:
               var10000 = 238;
               break;
            case 197:
               var10000 = 252;
               break;
            case 198:
               var10000 = 190;
               break;
            case 199:
               var10000 = 196;
               break;
            case 200:
               var10000 = 67;
               break;
            case 201:
               var10000 = 138;
               break;
            case 202:
               var10000 = 146;
               break;
            case 203:
               var10000 = 76;
               break;
            case 204:
               var10000 = 28;
               break;
            case 205:
               var10000 = 145;
               break;
            case 206:
               var10000 = 52;
               break;
            case 207:
               var10000 = 15;
               break;
            case 208:
               var10000 = 58;
               break;
            case 209:
               var10000 = 50;
               break;
            case 210:
               var10000 = 20;
               break;
            case 211:
               var10000 = 136;
               break;
            case 212:
               var10000 = 74;
               break;
            case 213:
               var10000 = 226;
               break;
            case 214:
               var10000 = 202;
               break;
            case 215:
               var10000 = 249;
               break;
            case 216:
               var10000 = 3;
               break;
            case 217:
               var10000 = 173;
               break;
            case 218:
               var10000 = 151;
               break;
            case 219:
               var10000 = 120;
               break;
            case 220:
               var10000 = 119;
               break;
            case 221:
               var10000 = 17;
               break;
            case 222:
               var10000 = 154;
               break;
            case 223:
               var10000 = 212;
               break;
            case 224:
               var10000 = 25;
               break;
            case 225:
               var10000 = 80;
               break;
            case 226:
               var10000 = 104;
               break;
            case 227:
               var10000 = 244;
               break;
            case 228:
               var10000 = 19;
               break;
            case 229:
               var10000 = 161;
               break;
            case 230:
               var10000 = 114;
               break;
            case 231:
               var10000 = 8;
               break;
            case 232:
               var10000 = 163;
               break;
            case 233:
               var10000 = 101;
               break;
            case 234:
               var10000 = 250;
               break;
            case 235:
               var10000 = 11;
               break;
            case 236:
               var10000 = 246;
               break;
            case 237:
               var10000 = 191;
               break;
            case 238:
               var10000 = 95;
               break;
            case 239:
               var10000 = 122;
               break;
            case 240:
               var10000 = 51;
               break;
            case 241:
               var10000 = 6;
               break;
            case 242:
               var10000 = 232;
               break;
            case 243:
               var10000 = 22;
               break;
            case 244:
               var10000 = 192;
               break;
            case 245:
               var10000 = 24;
               break;
            case 246:
               var10000 = 139;
               break;
            case 247:
               var10000 = 18;
               break;
            case 248:
               var10000 = 199;
               break;
            case 249:
               var10000 = 121;
               break;
            case 250:
               var10000 = 106;
               break;
            case 251:
               var10000 = 21;
               break;
            case 252:
               var10000 = 243;
               break;
            case 253:
               var10000 = 59;
               break;
            case 254:
               var10000 = 87;
               break;
            default:
               var10000 = 187;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var26;
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "Â~1Y8\u0007¼'\u009b\u009eh\u000b\"K-ÿ»ÓÌ½\u0095Í©\u00028*\u0004n¦îÆ\u0004\u0010\neH\u0002Z¸\u0004µ,Ñ\u008c\u0004\u0007¿\u0091á\u0004ñÎ\u001dË";
      int var8 = "Â~1Y8\u0007¼'\u009b\u009eh\u000b\"K-ÿ»ÓÌ½\u0095Í©\u00028*\u0004n¦îÆ\u0004\u0010\neH\u0002Z¸\u0004µ,Ñ\u008c\u0004\u0007¿\u0091á\u0004ñÎ\u001dË"
         .length();
      char var5 = 11;
      int var12 = -1;

      label52:
      while (true) {
         byte var10000 = 84;
         String var10001 = var6.substring(++var12, var12 + var5);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var32 = var10001.toCharArray();
               int var10004 = var32.length;
               int var10 = 0;
               byte var35 = var10000;
               var26 = var32;
               int var18 = var10004;
               byte var40;
               char[] var44;
               int var10006;
               if (var10004 <= 1) {
                  var44 = var32;
                  var40 = var10000;
                  var10006 = var10;
               } else {
                  var35 = var10000;
                  var18 = var10004;
                  if (var10004 <= var10) {
                     break label47;
                  }

                  var44 = var32;
                  var40 = var10000;
                  var10006 = var10;
               }

               while (true) {
                  char var53 = var44[var10006];
                  byte var54;
                  switch (var10 % 7) {
                     case 0:
                        var54 = 75;
                        break;
                     case 1:
                        var54 = 111;
                        break;
                     case 2:
                        var54 = 90;
                        break;
                     case 3:
                        var54 = 9;
                        break;
                     case 4:
                        var54 = 30;
                        break;
                     case 5:
                        var54 = 127;
                        break;
                     default:
                        var54 = 3;
                  }

                  var44[var10006] = (char)(var53 ^ var40 ^ var54);
                  var10++;
                  if (var35 == 0) {
                     var10006 = var35;
                     var44 = var26;
                     var40 = var35;
                  } else {
                     if (var18 <= var10) {
                        break;
                     }

                     var44 = var26;
                     var40 = var35;
                     var10006 = var10;
                  }
               }
            }

            String var37 = new String(var26).intern();
            switch (var10002) {
               case 0:
                  var9[var7++] = var37;
                  if ((var12 += var5) >= var8) {
                     a = var9;
                     c = new String[11];
                     long var2 = 8103016811989264521L;
                     long var30 = -8638893410081346719L ^ var2;
                     byte var20 = -1;
                     d = var30;
                     long var0 = 6686142837837075510L;
                     long var31 = -6686142837837075511L ^ var0;
                     byte var21 = -1;
                     e = var31;
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var37;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label52;
                  }

                  var6 = "}\u0002ÃK\u0013Ó¬¥\u009dY5í\bñ\u001dÑ\u0095ËÊ2\u0085L$\u0011";
                  var8 = "}\u0002ÃK\u0013Ó¬¥\u009dY5í\bñ\u001dÑ\u0095ËÊ2\u0085L$\u0011".length();
                  var5 = 4;
                  var12 = -1;
            }

            var10000 = 39;
            var10001 = var6.substring(++var12, var12 + var5);
            var10002 = 0;
         }
      }
   }
}





