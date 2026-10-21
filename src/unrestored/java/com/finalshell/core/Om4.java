package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.BZ;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Om4 {
   public static Xe2 Z;
   public static String[] a;
   public static String[] b;
   public static long c;

   public static String G(int var0) {
      int var10000 = LN3.v();
      String var2 = "";
      int var1 = var10000;
      var10000 = var0;
      int var10001 = 1;
      if (var1 != 0) {
         if (var0 == 1) {
            var2 = a(-11025, -10415);
            if (var1 != 0) {
               return var2;
            }
         }

         var10000 = var0;
         var10001 = 3;
      }

      if (var1 != 0) {
         if (var10000 == var10001) {
            var2 = a(-11037, 23753);
            if (var1 != 0) {
               return var2;
            }
         }

         var10000 = var0;
         var10001 = 2;
      }

      if (var1 != 0) {
         if (var10000 == var10001) {
            var2 = a(-11028, -9176);
            if (var1 != 0) {
               return var2;
            }
         }

         var10000 = var0;
         var10001 = 5;
      }

      label71: {
         if (var1 != 0) {
            if (var10000 == var10001) {
               var2 = a(-11038, -30599);
               if (var1 != 0) {
                  return var2;
               }
            }

            var10000 = var0;
            if (var1 == 0) {
               break label71;
            }

            var10001 = (int)c;
         }

         if (var10000 == var10001) {
            var2 = a(-11040, 5121);
            if (var1 != 0) {
               return var2;
            }
         }

         var10000 = var0;
      }

      if (var1 != 0) {
         if (var10000 == 0) {
            var2 = a(-11033, -4910);
            if (var1 != 0) {
               return var2;
            }
         }

         var10000 = var0;
      }

      if (var10000 == 4) {
         var2 = a(-11035, -7171);
      }

      return var2;
   }

   public static PW3 R(String var0) throws Pc2 {
      return PW3.e(var0, null, (Xe2)Registry.lookupField(528461357940718158L).get(null));
   }

   public static PW3 m(LN3 var0) throws Pc2 {
      Registry.packArgs(var0, Registry.lookupField(528461357940718158L).get(null));
      long var1 = 364434859370373608L;
      Object var10001 = Ref.h2(364434859370373608L, var1);

      try {
         return (PW3)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static PW3 r(LN3 var0, Xe2 var1) throws Pc2 {
      byte[] var10002 = (byte[])(Registry.emptyArgs());
      long var5 = 587292884221902213L;
      Object var4 = var10002;
      var10002 = Ref.h(587292884221902213L, var4, var5);

      try {
         var10002 = (byte[])var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      SshKeyCodec var2 = SshKeyCodec.h(var0, (byte[])var10002, null);
      return new PW3(var1, "", var2);
   }

   public static PW3 C(String var0, Xe2 var1) throws Pc2 {
      LN3.v();
      Object[] var10001 = Registry.packArgs(var0);
      long var4 = 602938716458919917L;
      Object var10002 = Ref.h2(602938716458919917L, var4);

      try {
         var10002 = (LN3)var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      LN3 var3 = (LN3)var10002;
      Object[] var2 = var10001;

      label37: {
         try {
            var10001 = var3;
            if (var2 == null) {
               break label37;
            }

            if (var3 == null) {
               return null;
            }
         } catch (Pc2 var10) {
            throw a(var10);
         }

         var10001 = var3;
      }

      Registry.packArgs(var10001, var1);
      long var6 = 364434859370373608L;
      var10002 = Ref.h2(364434859370373608L, var6);

      try {
         return (PW3)var10002;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public static LN3 k(String var0) {
      LN3 var2 = null;
      LN3.v();
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      LN3 var10003 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object var7 = var10003;
      var10003 = Ref.h(306266403902896148L, var7, var8);
      ArrayList var10004 = Registry.emptyArgs();
      long var10 = 626356373183057367L;
      Object var9 = var10004;
      var10004 = Ref.h(626356373183057367L, var9, var10);

      try {
         var10004 = (ArrayList)var10004;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Iterator var3 = var10004.iterator();
      Object var1 = var10003;

      while (true) {
         if (var3.hasNext()) {
            LN3 var4 = (LN3)var3.next();
            var10003 = var4;
            if (var1 == null) {
               break;
            }

            label44: {
               if (var1 == null) {
                  Object[] var19 = Registry.emptyArgs();
                  long var12 = 194080076253066315L;
                  Object[] var11 = var19;
                  var10004 = (ArrayList)Ref.h(194080076253066315L, var11, var12);

                  try {
                     var21 = (String)var10004;
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  if (!var21.equals(var0)) {
                     break label44;
                  }
               }

               var2 = var4;
            }

            if (var1 == null) {
               continue;
            }
         }

         var10003 = var2;
         break;
      }

      return var10003;
   }

   public static void K(String var0) {
      Object[] var15;
      Object[] var21;
      long var23;
      LN3.A();
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object[] var7 = var10003;
      var10003 = Ref.h(306266403902896148L, var7, var8);
      String var10004 = Registry.emptyArgs();
      long var10 = 626356373183057367L;
      Object var9 = var10004;
      var10004 = Ref.h(626356373183057367L, var9, var10);

      try {
         var10004 = (ArrayList)var10004;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      ArrayList var2 = var10004;
      Object var1 = var10003;
      Iterator var3 = var2.iterator();

      while (true) {
         label93:
         if (var3.hasNext()) {
            LN3 var4 = (LN3)var3.next();
            if (var1 == null) {
               break;
            }

            var10004 = Registry.emptyArgs();
            long var12 = 194080076253066315L;
            Object var11 = var10004;
            var10004 = Ref.h(194080076253066315L, var11, var12);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            label101: {
               boolean var44 = var10004.equals(var0);
               if (var1 == null) {
                  if (!var44) {
                     break label101;
                  }

                  var2.remove(var4);
               }

               Registry.emptyArgs();
               long var13 = 270389152141252877L;
               Ref.h2(270389152141252877L, var13);
               Object[] var10006 = Registry.emptyArgs();
               long var16 = 445913128761932285L;
               var15 = var10006;
               Ref.h(445913128761932285L, var15, var16);
               Object[] var10008 = Registry.emptyArgs();
               long var18 = 194080076253066315L;
               Object[] var17 = var10008;
               Ref.h(194080076253066315L, var17, var18);
               Object[] var10010 = Registry.emptyArgs();
               long var20 = 286931176286176762L;
               Object[] var19 = var10010;
               Object[] var10009 = Registry.packArgs(var4, Ref.h(286931176286176762L, var19, var20), Registry.lookupField(163332929561227942L).getInt(null));
               long var22 = 200839191777796316L;
               var21 = var10009;
               Ref.h(200839191777796316L, var21, var22);

               try {
                  ;
               } catch (InvocationTargetException var33) {
                  throw var33.getTargetException();
               }

               if (var1 == null) {
                  break label93;
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         Registry.emptyArgs();
         var23 = 270389152141252877L;
         Ref.h2(270389152141252877L, var23);
         Object[] var10005 = Registry.emptyArgs();
         long var26 = 578864097947885485L;
         Object[] var25 = var10005;
         Ref.h(578864097947885485L, var25, var26);

         try {
            break;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }
      }

      Ty4 var37 = new Ty4(Registry.lookupField(456349507517882113L).getInt(null));
      Registry.emptyArgs();
      long var27 = 270389152141252877L;
      Ref.h2(270389152141252877L, var27);
      Object[] var10007 = Registry.packArgs(var37);
      long var30 = 473928376202613579L;
      Object[] var29 = var10007;
      Ref.h(473928376202613579L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      if (Ky4.F$arrString() != null) {
         LN3.O(++var1);
      }
   }

   public static void F(Oc2 var0) {
      long var15;
      boolean var40;
      LN3.v();
      Registry.packArgs(var0);
      long var8 = 421592305985005457L;
      Object var10002 = Ref.h2(421592305985005457L, var8);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      ArrayList var2 = (ArrayList)var10002;
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 306266403902896148L;
      Object[] var12 = var10004;
      var10004 = Ref.h(306266403902896148L, var12, var13);
      ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
      var15 = 626356373183057367L;
      Object var14 = var10005;
      var10005 = Ref.h(626356373183057367L, var14, var15);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      ArrayList var3 = var10005;
      Object var1 = var10004;
      Registry.packArgs(var2, var3, new LN3());
      long var16 = 212474312414779304L;
      var10005 = Ref.h2(212474312414779304L, var16);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      ArrayList var4 = var10005;
      ArrayList var5 = new ArrayList();
      Iterator var6 = var4.iterator();

      while (true) {
         if (var6.hasNext()) {
            LN3 var7 = (LN3)var6.next();
            if (var1 == null) {
               break;
            }

            Registry.packArgs(var7);
            long var18 = 366543685241882690L;
            Object var10006 = Ref.h2(366543685241882690L, var18);

            try {
               var40 = (Boolean)var10006;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            if (var1 == null && !var40) {
               var5.add(var7);
            }

            if (var1 == null) {
               continue;
            }

            Ky4.K(new String[1]);
         }

         Registry.packArgs(var5);
         long var20 = 319819356736477012L;
         Ref.h2(319819356736477012L, var20);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         Registry.emptyArgs();
         long var22 = 270389152141252877L;
         Ref.h2(270389152141252877L, var22);
         Object[] var10008 = Registry.emptyArgs();
         long var25 = 306266403902896148L;
         Object[] var24 = var10008;
         Ref.h(306266403902896148L, var24, var25);
         Object[] var10009 = Registry.packArgs(var5);
         long var27 = 506094134529398351L;
         Object[] var26 = var10009;
         Ref.h(506094134529398351L, var26, var27);

         try {
            break;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      }
   }

   public static void y(ArrayList var0) {
      Collections.sort(var0, new BZ());
   }

   public static ArrayList I(Oc2 var0) {
      int var10000 = LN3.A();
      ArrayList var2 = new ArrayList();
      int var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < var0.size()) {
      long var15;
            O0 var4 = var0.V(var3);
            LN3 var5 = new LN3();
            var15 = (long)(var5);
            Object[] var10001 = Registry.packArgs(var4.Z(a(-11036, -3843)));
            long var7 = 622750082590203090L;
            Object[] var6 = var10001;
            Ref.h(622750082590203090L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            Object[] var10002 = Registry.packArgs(var4.C$String(a(-11027, -21434)));
            long var9 = 271672579734969828L;
            Object[] var8 = var10002;
            Ref.h(271672579734969828L, var8, var9);

            try {
               ;
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            Registry.packArgs(var5, var4);
            long var10 = 272456164038541053L;
            Ref.h2(272456164038541053L, var10);

            try {
               ;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            if (var1 != 0) {
               break;
            }

            var2.add(var5);
            var3++;
            if (var1 == 0) {
               continue;
            }
         }

         var15 = var2;
         break;
      }

      return (ArrayList)var15;
   }

   public static Oc2 C(ArrayList var0) {
      int var10000 = LN3.v();
      Oc2 var2 = new Oc2();
      int var1 = var10000;
      Iterator var3 = var0.iterator();

      while (true) {
         if (var3.hasNext()) {
            LN3 var4 = (LN3)var3.next();
            O0 var5 = new O0();
            var15 = var5;
            String var10001 = a(-11034, 15068);
            Object var10003 = Registry.emptyArgs();
            long var7 = 557543992546278139L;
            Object var6 = var10003;
            var10003 = Ref.h(557543992546278139L, var6, var7);

            try {
               var10003 = (String)var10003;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            var10001.C(var4, var10003);
            String var10002 = a(-11039, 242);
            Object[] var10004 = Registry.emptyArgs();
            long var9 = 587292884221902213L;
            Object[] var8 = var10004;
            var10004 = Ref.h(587292884221902213L, var8, var9);

            try {
               var10004 = (byte[])var10004;
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            var10002.C(var4, var10004);
            Registry.packArgs(var4, var5);
            long var10 = 622166953529806027L;
            Ref.h2(622166953529806027L, var10);

            try {
               ;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            if (var1 == 0) {
               break;
            }

            var2.add(var5);
            if (var1 != 0) {
               continue;
            }
         }

         var15 = var2;
         break;
      }

      return (Oc2)var15;
   }

   static {
      __vfClinit__();
   }

   public static Pc2 a(Pc2 var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -11035) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 241;
               break;
            case 1:
               var10000 = 21;
               break;
            case 2:
               var10000 = 237;
               break;
            case 3:
               var10000 = 212;
               break;
            case 4:
               var10000 = 95;
               break;
            case 5:
               var10000 = 154;
               break;
            case 6:
               var10000 = 143;
               break;
            case 7:
               var10000 = 235;
               break;
            case 8:
               var10000 = 65;
               break;
            case 9:
               var10000 = 71;
               break;
            case 10:
               var10000 = 158;
               break;
            case 11:
               var10000 = 117;
               break;
            case 12:
               var10000 = 184;
               break;
            case 13:
               var10000 = 179;
               break;
            case 14:
               var10000 = 61;
               break;
            case 15:
               var10000 = 111;
               break;
            case 16:
               var10000 = 72;
               break;
            case 17:
               var10000 = 172;
               break;
            case 18:
               var10000 = 134;
               break;
            case 19:
               var10000 = 243;
               break;
            case 20:
               var10000 = 126;
               break;
            case 21:
               var10000 = 119;
               break;
            case 22:
               var10000 = 139;
               break;
            case 23:
               var10000 = 22;
               break;
            case 24:
               var10000 = 96;
               break;
            case 25:
               var10000 = 208;
               break;
            case 26:
               var10000 = 10;
               break;
            case 27:
               var10000 = 88;
               break;
            case 28:
               var10000 = 31;
               break;
            case 29:
               var10000 = 192;
               break;
            case 30:
               var10000 = 136;
               break;
            case 31:
               var10000 = 202;
               break;
            case 32:
               var10000 = 82;
               break;
            case 33:
               var10000 = 63;
               break;
            case 34:
               var10000 = 74;
               break;
            case 35:
               var10000 = 47;
               break;
            case 36:
               var10000 = 186;
               break;
            case 37:
               var10000 = 194;
               break;
            case 38:
               var10000 = 152;
               break;
            case 39:
               var10000 = 125;
               break;
            case 40:
               var10000 = 9;
               break;
            case 41:
               var10000 = 101;
               break;
            case 42:
               var10000 = 49;
               break;
            case 43:
               var10000 = 76;
               break;
            case 44:
               var10000 = 13;
               break;
            case 45:
               var10000 = 24;
               break;
            case 46:
               var10000 = 27;
               break;
            case 47:
               var10000 = 90;
               break;
            case 48:
               var10000 = 151;
               break;
            case 49:
               var10000 = 253;
               break;
            case 50:
               var10000 = 141;
               break;
            case 51:
               var10000 = 87;
               break;
            case 52:
               var10000 = 73;
               break;
            case 53:
               var10000 = 84;
               break;
            case 54:
               var10000 = 137;
               break;
            case 55:
               var10000 = 209;
               break;
            case 56:
               var10000 = 178;
               break;
            case 57:
               var10000 = 11;
               break;
            case 58:
               var10000 = 244;
               break;
            case 59:
               var10000 = 198;
               break;
            case 60:
               var10000 = 23;
               break;
            case 61:
               var10000 = 255;
               break;
            case 62:
               var10000 = 185;
               break;
            case 63:
               var10000 = 153;
               break;
            case 64:
               var10000 = 52;
               break;
            case 65:
               var10000 = 0;
               break;
            case 66:
               var10000 = 221;
               break;
            case 67:
               var10000 = 164;
               break;
            case 68:
               var10000 = 169;
               break;
            case 69:
               var10000 = 183;
               break;
            case 70:
               var10000 = 168;
               break;
            case 71:
               var10000 = 89;
               break;
            case 72:
               var10000 = 3;
               break;
            case 73:
               var10000 = 4;
               break;
            case 74:
               var10000 = 238;
               break;
            case 75:
               var10000 = 135;
               break;
            case 76:
               var10000 = 149;
               break;
            case 77:
               var10000 = 252;
               break;
            case 78:
               var10000 = 218;
               break;
            case 79:
               var10000 = 205;
               break;
            case 80:
               var10000 = 180;
               break;
            case 81:
               var10000 = 199;
               break;
            case 82:
               var10000 = 156;
               break;
            case 83:
               var10000 = 45;
               break;
            case 84:
               var10000 = 181;
               break;
            case 85:
               var10000 = 233;
               break;
            case 86:
               var10000 = 107;
               break;
            case 87:
               var10000 = 102;
               break;
            case 88:
               var10000 = 128;
               break;
            case 89:
               var10000 = 5;
               break;
            case 90:
               var10000 = 204;
               break;
            case 91:
               var10000 = 33;
               break;
            case 92:
               var10000 = 197;
               break;
            case 93:
               var10000 = 174;
               break;
            case 94:
               var10000 = 165;
               break;
            case 95:
               var10000 = 12;
               break;
            case 96:
               var10000 = 40;
               break;
            case 97:
               var10000 = 53;
               break;
            case 98:
               var10000 = 219;
               break;
            case 99:
               var10000 = 246;
               break;
            case 100:
               var10000 = 38;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 85;
               break;
            case 103:
               var10000 = 30;
               break;
            case 104:
               var10000 = 182;
               break;
            case 105:
               var10000 = 239;
               break;
            case 106:
               var10000 = 144;
               break;
            case 107:
               var10000 = 167;
               break;
            case 108:
               var10000 = 100;
               break;
            case 109:
               var10000 = 50;
               break;
            case 110:
               var10000 = 145;
               break;
            case 111:
               var10000 = 75;
               break;
            case 112:
               var10000 = 6;
               break;
            case 113:
               var10000 = 200;
               break;
            case 114:
               var10000 = 161;
               break;
            case 115:
               var10000 = 130;
               break;
            case 116:
               var10000 = 20;
               break;
            case 117:
               var10000 = 113;
               break;
            case 118:
               var10000 = 234;
               break;
            case 119:
               var10000 = 159;
               break;
            case 120:
               var10000 = 242;
               break;
            case 121:
               var10000 = 91;
               break;
            case 122:
               var10000 = 68;
               break;
            case 123:
               var10000 = 79;
               break;
            case 124:
               var10000 = 8;
               break;
            case 125:
               var10000 = 41;
               break;
            case 126:
               var10000 = 54;
               break;
            case 127:
               var10000 = 247;
               break;
            case 128:
               var10000 = 55;
               break;
            case 129:
               var10000 = 69;
               break;
            case 130:
               var10000 = 191;
               break;
            case 131:
               var10000 = 36;
               break;
            case 132:
               var10000 = 132;
               break;
            case 133:
               var10000 = 170;
               break;
            case 134:
               var10000 = 162;
               break;
            case 135:
               var10000 = 16;
               break;
            case 136:
               var10000 = 203;
               break;
            case 137:
               var10000 = 190;
               break;
            case 138:
               var10000 = 254;
               break;
            case 139:
               var10000 = 211;
               break;
            case 140:
               var10000 = 175;
               break;
            case 141:
               var10000 = 127;
               break;
            case 142:
               var10000 = 223;
               break;
            case 143:
               var10000 = 131;
               break;
            case 144:
               var10000 = 80;
               break;
            case 145:
               var10000 = 104;
               break;
            case 146:
               var10000 = 232;
               break;
            case 147:
               var10000 = 155;
               break;
            case 148:
               var10000 = 81;
               break;
            case 149:
               var10000 = 123;
               break;
            case 150:
               var10000 = 1;
               break;
            case 151:
               var10000 = 150;
               break;
            case 152:
               var10000 = 64;
               break;
            case 153:
               var10000 = 124;
               break;
            case 154:
               var10000 = 250;
               break;
            case 155:
               var10000 = 2;
               break;
            case 156:
               var10000 = 108;
               break;
            case 157:
               var10000 = 103;
               break;
            case 158:
               var10000 = 121;
               break;
            case 159:
               var10000 = 188;
               break;
            case 160:
               var10000 = 77;
               break;
            case 161:
               var10000 = 57;
               break;
            case 162:
               var10000 = 122;
               break;
            case 163:
               var10000 = 187;
               break;
            case 164:
               var10000 = 18;
               break;
            case 165:
               var10000 = 110;
               break;
            case 166:
               var10000 = 142;
               break;
            case 167:
               var10000 = 37;
               break;
            case 168:
               var10000 = 195;
               break;
            case 169:
               var10000 = 220;
               break;
            case 170:
               var10000 = 99;
               break;
            case 171:
               var10000 = 189;
               break;
            case 172:
               var10000 = 228;
               break;
            case 173:
               var10000 = 78;
               break;
            case 174:
               var10000 = 25;
               break;
            case 175:
               var10000 = 32;
               break;
            case 176:
               var10000 = 140;
               break;
            case 177:
               var10000 = 114;
               break;
            case 178:
               var10000 = 42;
               break;
            case 179:
               var10000 = 26;
               break;
            case 180:
               var10000 = 92;
               break;
            case 181:
               var10000 = 29;
               break;
            case 182:
               var10000 = 133;
               break;
            case 183:
               var10000 = 28;
               break;
            case 184:
               var10000 = 177;
               break;
            case 185:
               var10000 = 67;
               break;
            case 186:
               var10000 = 116;
               break;
            case 187:
               var10000 = 59;
               break;
            case 188:
               var10000 = 15;
               break;
            case 189:
               var10000 = 129;
               break;
            case 190:
               var10000 = 109;
               break;
            case 191:
               var10000 = 70;
               break;
            case 192:
               var10000 = 193;
               break;
            case 193:
               var10000 = 17;
               break;
            case 194:
               var10000 = 138;
               break;
            case 195:
               var10000 = 201;
               break;
            case 196:
               var10000 = 216;
               break;
            case 197:
               var10000 = 248;
               break;
            case 198:
               var10000 = 115;
               break;
            case 199:
               var10000 = 206;
               break;
            case 200:
               var10000 = 83;
               break;
            case 201:
               var10000 = 48;
               break;
            case 202:
               var10000 = 34;
               break;
            case 203:
               var10000 = 240;
               break;
            case 204:
               var10000 = 97;
               break;
            case 205:
               var10000 = 66;
               break;
            case 206:
               var10000 = 7;
               break;
            case 207:
               var10000 = 160;
               break;
            case 208:
               var10000 = 56;
               break;
            case 209:
               var10000 = 14;
               break;
            case 210:
               var10000 = 19;
               break;
            case 211:
               var10000 = 60;
               break;
            case 212:
               var10000 = 112;
               break;
            case 213:
               var10000 = 176;
               break;
            case 214:
               var10000 = 196;
               break;
            case 215:
               var10000 = 157;
               break;
            case 216:
               var10000 = 163;
               break;
            case 217:
               var10000 = 173;
               break;
            case 218:
               var10000 = 227;
               break;
            case 219:
               var10000 = 214;
               break;
            case 220:
               var10000 = 171;
               break;
            case 221:
               var10000 = 44;
               break;
            case 222:
               var10000 = 35;
               break;
            case 223:
               var10000 = 62;
               break;
            case 224:
               var10000 = 146;
               break;
            case 225:
               var10000 = 118;
               break;
            case 226:
               var10000 = 148;
               break;
            case 227:
               var10000 = 105;
               break;
            case 228:
               var10000 = 251;
               break;
            case 229:
               var10000 = 166;
               break;
            case 230:
               var10000 = 51;
               break;
            case 231:
               var10000 = 39;
               break;
            case 232:
               var10000 = 106;
               break;
            case 233:
               var10000 = 58;
               break;
            case 234:
               var10000 = 94;
               break;
            case 235:
               var10000 = 225;
               break;
            case 236:
               var10000 = 210;
               break;
            case 237:
               var10000 = 217;
               break;
            case 238:
               var10000 = 86;
               break;
            case 239:
               var10000 = 229;
               break;
            case 240:
               var10000 = 222;
               break;
            case 241:
               var10000 = 147;
               break;
            case 242:
               var10000 = 213;
               break;
            case 243:
               var10000 = 120;
               break;
            case 244:
               var10000 = 224;
               break;
            case 245:
               var10000 = 93;
               break;
            case 246:
               var10000 = 245;
               break;
            case 247:
               var10000 = 215;
               break;
            case 248:
               var10000 = 98;
               break;
            case 249:
               var10000 = 46;
               break;
            case 250:
               var10000 = 43;
               break;
            case 251:
               var10000 = 249;
               break;
            case 252:
               var10000 = 230;
               break;
            case 253:
               var10000 = 226;
               break;
            case 254:
               var10000 = 231;
               break;
            default:
               var10000 = 236;
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
      char[] var23;
      String[] var7 = new String[11];
      int var5 = 0;
      String var4 = "ªÇ>Æ\u0004Å9\b\u0001B\u0080)\u008c=\\U\u0005Ì\u00adù\u0015Û\bÕ6h\u000fÉ^\u0083ó\b¬Ì5ø:\u0007\u008a\u0012\u0005\u0013Wdå¨\u0005ø9i¨\u000e\u0007¢\fT\u008fe\u009eW\b~Y\u001dâgãVD";
      int var6 = "ªÇ>Æ\u0004Å9\b\u0001B\u0080)\u008c=\\U\u0005Ì\u00adù\u0015Û\bÕ6h\u000fÉ^\u0083ó\b¬Ì5ø:\u0007\u008a\u0012\u0005\u0013Wdå¨\u0005ø9i¨\u000e\u0007¢\fT\u008fe\u009eW\b~Y\u001dâgãVD"
         .length();
      char var3 = 7;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 12;
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
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 19;
                        break;
                     case 1:
                        var50 = 67;
                        break;
                     case 2:
                        var50 = 48;
                        break;
                     case 3:
                        var50 = 18;
                        break;
                     case 4:
                        var50 = 37;
                        break;
                     case 5:
                        var50 = 2;
                        break;
                     default:
                        var50 = 120;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
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
                     b = new String[11];
                     long var0 = 1201088525776559339L;
                     long var27 = 407058529987697901L ^ var0;
                     byte var18 = -1;
                     c = var27;
                     Registry.lookupField(528461357940718158L).set(null, new Xe2());
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

                  var4 = "`Åd\u0003×\u001aF";
                  var6 = "`Åd\u0003×\u001aF".length();
                  var3 = 3;
                  var10 = -1;
            }

            var10000 = 3;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
   private static Object var21;
}





