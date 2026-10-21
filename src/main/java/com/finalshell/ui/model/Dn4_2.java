package com.finalshell.ui.model;

import com.finalshell.core.Kw4;
import com.finalshell.core.UT;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CE;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Locale;

public class Dn4_2 implements Comparator {
   public final Comparator R;
   public final O8 d;
   public final Om2 r;
   public String B;
   public final String L;
   public final UT Z;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Long[] e;

   public Dn4_2(UT var1, String var2) {
      this.Z = var1;
      this.L = var2;
      this.R = Collator.getInstance(Locale.CHINA);
      this.d = new O8();
      this.r = new Om2();
      Object var3 = 371880190794060519L;
      Object var10002 = Ref.g(371880190794060519L, var3);
      long var6 = 594107705074217083L;
      Object var5 = var10002;
      Ref.s(594107705074217083L, var5, var6);
   }

   public int U(Kw4 var1, Kw4 var2) {
      Integer var108;
      Integer var114;
      Long var122;
      Long var125;
      Integer var134;
      Long var150;
      Long var153;
      Integer var162;
      int[] var3 = CE.S$arrint();
      Object var8 = 594107705074217083L;
      Dn4_2 var10001 = ((String)Ref.g(594107705074217083L, var8)).equals((String)Registry.lookupField(389386238796712282L).get(null));
      if (var3 != null) {
         if (var10001 == null) {
            Object var10 = 395182373245310285L;
            Comparator var112 = (Comparator)Ref.g(395182373245310285L, var10);
            String var135 = (String)(Registry.emptyArgs());
            long var13 = 582473494023502780L;
            Object var12 = var135;
            var135 = Ref.h(582473494023502780L, var12, var13);

            try {
               var135 = (String)var135;
            } catch (InvocationTargetException var85) {
               throw var85.getTargetException();
            }

            String var163 = (String)(Registry.emptyArgs());
            long var15 = 582473494023502780L;
            Object var14 = var163;
            var163 = Ref.h(582473494023502780L, var14, var15);

            try {
               var163 = (String)var163;
            } catch (InvocationTargetException var84) {
               throw var84.getTargetException();
            }

            return var135.compare(var2, var163);
         }

         var10001 = this;
         Object var16 = 594107705074217083L;
         ((String)Ref.g(594107705074217083L, var16)).equals((String)Registry.lookupField(376768915438230383L).get(null));
      }

      if (var3 != null) {
         if (var10001 == null) {
            Object var18 = 344173546614258802L;
            Ref.g(344173546614258802L, var18);
            Object var132 = Registry.emptyArgs();
            long var21 = 134324574424375296L;
            Object var20 = var132;
            var132 = Ref.h(134324574424375296L, var20, var21);

            try {
               var134 = (Integer)var132;
            } catch (InvocationTargetException var88) {
               throw var88.getTargetException();
            }

            Integer.valueOf(var134);
            Object var160 = Registry.emptyArgs();
            long var23 = 134324574424375296L;
            Object var22 = var160;
            var160 = Ref.h(134324574424375296L, var22, var23);

            try {
               var162 = (Integer)var160;
            } catch (InvocationTargetException var87) {
               throw var87.getTargetException();
            }

            Object var147 = Registry.packArgs(var2, Integer.valueOf(var162));
            long var25 = 227703286706087580L;
            Object var24 = var147;
            var147 = Ref.h(227703286706087580L, var24, var25);

            try {
               return (Integer)var147;
            } catch (InvocationTargetException var86) {
               throw var86.getTargetException();
            }
         }

         var10001 = this;
         Object var26 = 594107705074217083L;
         ((String)Ref.g(594107705074217083L, var26)).equals((String)Registry.lookupField(563850745499369434L).get(null));
      }

      if (var3 != null) {
         if (var10001 == null) {
            String var109 = (String)(Registry.emptyArgs());
            long var29 = 516374718951189974L;
            Object var28 = var109;
            var109 = Ref.h(516374718951189974L, var28, var29);

            try {
               var109 = (String)var109;
            } catch (InvocationTargetException var90) {
               throw var90.getTargetException();
            }

            String var106 = var109;
            String var116 = Registry.emptyArgs();
            long var31 = 516374718951189974L;
            Object var30 = var116;
            var116 = Ref.h(516374718951189974L, var30, var31);

            try {
               var116 = (String)var116;
            } catch (InvocationTargetException var89) {
               throw var89.getTargetException();
            }

            String var5;
            label285: {
               label299: {
                  var5 = var116;
                  var116 = var106;
                  if (var3 != null) {
                     if (var106 == null) {
                        var106 = "a";
                        if (var3 != null) {
                           break label299;
                        }
                     }

                     var116 = var106;
                  }

                  if (var3 == null) {
                     break label285;
                  }

                  if (var116.startsWith(a(-9713, 16928))) {
                     var106 = "a" + var106.replace(a(-9714, -29583), "");
                  }
               }

               var116 = var5;
            }

            label300: {
               if (var3 != null) {
                  if (var116 == null) {
                     var5 = "a";
                     if (var3 != null) {
                        break label300;
                     }
                  }

                  var116 = var5;
               }

               byte var120 = (byte)((var116.startsWith(a(-9714, -29583))) ? 1 : 0);
               if (var3 == null) {
                  return var120;
               }

               if (var120 != 0) {
                  var5 = "a" + var5.replace(a(-9714, -29583), "");
               }
            }

            Object var32 = 395182373245310285L;
            ((Comparator)Ref.g(395182373245310285L, var32)).compare(var106, var5);
            return (int)this;
         }

         var10001 = this;
         Object var34 = 594107705074217083L;
         ((String)Ref.g(594107705074217083L, var34)).equals((String)Registry.lookupField(162665871395615226L).get(null));
      }

      if (var3 != null) {
         if (var10001 == null) {
            Object var10002 = Registry.emptyArgs();
            long var37 = 528143184018704864L;
            Object var36 = var10002;
            var10002 = Ref.h(528143184018704864L, var36, var37);

            try {
               var108 = (Integer)var10002;
            } catch (InvocationTargetException var93) {
               throw var93.getTargetException();
            }

            long var4 = (long)var108;
            Object var10003 = Registry.emptyArgs();
            long var39 = 528143184018704864L;
            Object var38 = var10003;
            var10003 = Ref.h(528143184018704864L, var38, var39);

            try {
               var114 = (Integer)var10003;
            } catch (InvocationTargetException var92) {
               throw var92.getTargetException();
            }

            long var6 = (long)var114;
            long var166;
            Dn4_2 var115 = (var166 = var4 - 0L) == 0L ? 0 : (var166 < 0L ? -1 : 1);
            if (var3 != null) {
               if (var115 == null) {
                  var4 = a(12644, 724395259373966810L);
               }

               long var167;
               var115 = (var167 = var6 - 0L) == 0L ? 0 : (var167 < 0L ? -1 : 1);
            }

            if (var3 != null) {
               if (var115 == null) {
                  var6 = a(2969, 7696521759219937062L);
               }

               var115 = this;
               Object var40 = 196722139846004877L;
               Ref.g(196722139846004877L, var40);
               Object[] var145 = Registry.packArgs(Long.valueOf(var4), Long.valueOf(var6));
               long var43 = 262915954633911742L;
               Object[] var42 = var145;
               var145 = Ref.h(262915954633911742L, var42, var43);

               try {
               } catch (InvocationTargetException var91) {
                  throw var91.getTargetException();
               }
            }

            return (int)var115;
         }

         var10001 = this;
         Object var44 = 594107705074217083L;
         ((String)Ref.g(594107705074217083L, var44)).equals((String)Registry.lookupField(194216151110375024L).get(null));
      }

      if (var3 != null) {
         if (var10001 == null) {
            Object var46 = 344173546614258802L;
            Ref.g(344173546614258802L, var46);
            HashSet var129 = (HashSet)(Registry.emptyArgs());
            long var49 = 398648618049357234L;
            Object var48 = var129;
            var129 = Ref.h(398648618049357234L, var48, var49);

            try {
               var129 = (HashSet)var129;
            } catch (InvocationTargetException var96) {
               throw var96.getTargetException();
            }

            Integer.valueOf(var129.size());
            HashSet var157 = (HashSet)(Registry.emptyArgs());
            long var51 = 398648618049357234L;
            Object var50 = var157;
            var157 = Ref.h(398648618049357234L, var50, var51);

            try {
               var157 = (HashSet)var157;
            } catch (InvocationTargetException var95) {
               throw var95.getTargetException();
            }

            Object var143 = Registry.packArgs(var2, Integer.valueOf(var157.size()));
            long var53 = 227703286706087580L;
            Object var52 = var143;
            var143 = Ref.h(227703286706087580L, var52, var53);

            try {
               return (Integer)var143;
            } catch (InvocationTargetException var94) {
               throw var94.getTargetException();
            }
         }

         var10001 = this;
         Object var54 = 594107705074217083L;
         ((String)Ref.g(594107705074217083L, var54)).equals((String)Registry.lookupField(227453697139208661L).get(null));
      }

      if (var3 != null) {
         if (var10001 == null) {
            Object var56 = 344173546614258802L;
            Ref.g(344173546614258802L, var56);
            ArrayList var126 = (ArrayList)(Registry.emptyArgs());
            long var59 = 279562214327125641L;
            Object var58 = var126;
            var126 = Ref.h(279562214327125641L, var58, var59);

            try {
               var126 = (ArrayList)var126;
            } catch (InvocationTargetException var99) {
               throw var99.getTargetException();
            }

            Integer.valueOf(var126.size());
            ArrayList var154 = (ArrayList)(Registry.emptyArgs());
            long var61 = 279562214327125641L;
            Object var60 = var154;
            var154 = Ref.h(279562214327125641L, var60, var61);

            try {
               var154 = (ArrayList)var154;
            } catch (InvocationTargetException var98) {
               throw var98.getTargetException();
            }

            Object var141 = Registry.packArgs(var2, Integer.valueOf(var154.size()));
            long var63 = 227703286706087580L;
            Object var62 = var141;
            var141 = Ref.h(227703286706087580L, var62, var63);

            try {
               return (Integer)var141;
            } catch (InvocationTargetException var97) {
               throw var97.getTargetException();
            }
         }

         var10001 = this;
         Object var64 = 594107705074217083L;
         ((String)Ref.g(594107705074217083L, var64)).equals((String)Registry.lookupField(516763931638659925L).get(null));
      }

      if (var3 != null) {
         if (var10001 == null) {
            Object var66 = 196722139846004877L;
            Ref.g(196722139846004877L, var66);
            Object var123 = Registry.emptyArgs();
            long var69 = 165254620646467988L;
            Object var68 = var123;
            var123 = Ref.h(165254620646467988L, var68, var69);

            try {
               var125 = (Long)var123;
            } catch (InvocationTargetException var102) {
               throw var102.getTargetException();
            }

            Long.valueOf(var125);
            Object var151 = Registry.emptyArgs();
            long var71 = 165254620646467988L;
            Object var70 = var151;
            var151 = Ref.h(165254620646467988L, var70, var71);

            try {
               var153 = (Long)var151;
            } catch (InvocationTargetException var101) {
               throw var101.getTargetException();
            }

            Object var139 = Registry.packArgs(var2, Long.valueOf(var153));
            long var73 = 262915954633911742L;
            Object var72 = var139;
            var139 = Ref.h(262915954633911742L, var72, var73);

            try {
               return (Integer)var139;
            } catch (InvocationTargetException var100) {
               throw var100.getTargetException();
            }
         }

         var10001 = this;
         Object var74 = 594107705074217083L;
         ((String)Ref.g(594107705074217083L, var74)).equals((String)Registry.lookupField(459875455081736142L).get(null));
      }

      if (var3 != null) {
         if (var10001 == null) {
            Object var76 = 196722139846004877L;
            Ref.g(196722139846004877L, var76);
            Object var10004 = Registry.emptyArgs();
            long var79 = 361501567714445109L;
            Object var78 = var10004;
            var10004 = Ref.h(361501567714445109L, var78, var79);

            try {
               var122 = (Long)var10004;
            } catch (InvocationTargetException var105) {
               throw var105.getTargetException();
            }

            Long.valueOf(var122);
            Object var10006 = Registry.emptyArgs();
            long var81 = 361501567714445109L;
            Object var80 = var10006;
            var10006 = Ref.h(361501567714445109L, var80, var81);

            try {
               var150 = (Long)var10006;
            } catch (InvocationTargetException var104) {
               throw var104.getTargetException();
            }

            Object var10005 = Registry.packArgs(var2, Long.valueOf(var150));
            long var83 = 262915954633911742L;
            Object var82 = var10005;
            var10005 = Ref.h(262915954633911742L, var82, var83);

            try {
               return (Integer)var10005;
            } catch (InvocationTargetException var103) {
               throw var103.getTargetException();
            }
         }

         var10001 = true;
      }

      return (int)var10001;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object var10001 = Registry.packArgs((Kw4)var1, (Kw4)var2);
      long var4 = 484966342505463394L;
      Object var3 = var10001;
      var10001 = Ref.h(484966342505463394L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -9714) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 3;
               break;
            case 1:
               var10000 = 181;
               break;
            case 2:
               var10000 = 254;
               break;
            case 3:
               var10000 = 244;
               break;
            case 4:
               var10000 = 36;
               break;
            case 5:
               var10000 = 152;
               break;
            case 6:
               var10000 = 227;
               break;
            case 7:
               var10000 = 207;
               break;
            case 8:
               var10000 = 213;
               break;
            case 9:
               var10000 = 64;
               break;
            case 10:
               var10000 = 20;
               break;
            case 11:
               var10000 = 39;
               break;
            case 12:
               var10000 = 30;
               break;
            case 13:
               var10000 = 117;
               break;
            case 14:
               var10000 = 177;
               break;
            case 15:
               var10000 = 158;
               break;
            case 16:
               var10000 = 206;
               break;
            case 17:
               var10000 = 37;
               break;
            case 18:
               var10000 = 245;
               break;
            case 19:
               var10000 = 217;
               break;
            case 20:
               var10000 = 71;
               break;
            case 21:
               var10000 = 54;
               break;
            case 22:
               var10000 = 122;
               break;
            case 23:
               var10000 = 222;
               break;
            case 24:
               var10000 = 33;
               break;
            case 25:
               var10000 = 241;
               break;
            case 26:
               var10000 = 185;
               break;
            case 27:
               var10000 = 9;
               break;
            case 28:
               var10000 = 151;
               break;
            case 29:
               var10000 = 234;
               break;
            case 30:
               var10000 = 1;
               break;
            case 31:
               var10000 = 112;
               break;
            case 32:
               var10000 = 180;
               break;
            case 33:
               var10000 = 224;
               break;
            case 34:
               var10000 = 105;
               break;
            case 35:
               var10000 = 127;
               break;
            case 36:
               var10000 = 96;
               break;
            case 37:
               var10000 = 68;
               break;
            case 38:
               var10000 = 45;
               break;
            case 39:
               var10000 = 219;
               break;
            case 40:
               var10000 = 97;
               break;
            case 41:
               var10000 = 126;
               break;
            case 42:
               var10000 = 115;
               break;
            case 43:
               var10000 = 51;
               break;
            case 44:
               var10000 = 41;
               break;
            case 45:
               var10000 = 182;
               break;
            case 46:
               var10000 = 201;
               break;
            case 47:
               var10000 = 13;
               break;
            case 48:
               var10000 = 252;
               break;
            case 49:
               var10000 = 209;
               break;
            case 50:
               var10000 = 193;
               break;
            case 51:
               var10000 = 196;
               break;
            case 52:
               var10000 = 121;
               break;
            case 53:
               var10000 = 21;
               break;
            case 54:
               var10000 = 223;
               break;
            case 55:
               var10000 = 113;
               break;
            case 56:
               var10000 = 239;
               break;
            case 57:
               var10000 = 18;
               break;
            case 58:
               var10000 = 81;
               break;
            case 59:
               var10000 = 82;
               break;
            case 60:
               var10000 = 141;
               break;
            case 61:
               var10000 = 194;
               break;
            case 62:
               var10000 = 237;
               break;
            case 63:
               var10000 = 154;
               break;
            case 64:
               var10000 = 129;
               break;
            case 65:
               var10000 = 114;
               break;
            case 66:
               var10000 = 242;
               break;
            case 67:
               var10000 = 80;
               break;
            case 68:
               var10000 = 57;
               break;
            case 69:
               var10000 = 52;
               break;
            case 70:
               var10000 = 35;
               break;
            case 71:
               var10000 = 26;
               break;
            case 72:
               var10000 = 248;
               break;
            case 73:
               var10000 = 5;
               break;
            case 74:
               var10000 = 195;
               break;
            case 75:
               var10000 = 187;
               break;
            case 76:
               var10000 = 76;
               break;
            case 77:
               var10000 = 225;
               break;
            case 78:
               var10000 = 109;
               break;
            case 79:
               var10000 = 203;
               break;
            case 80:
               var10000 = 218;
               break;
            case 81:
               var10000 = 31;
               break;
            case 82:
               var10000 = 208;
               break;
            case 83:
               var10000 = 238;
               break;
            case 84:
               var10000 = 43;
               break;
            case 85:
               var10000 = 48;
               break;
            case 86:
               var10000 = 137;
               break;
            case 87:
               var10000 = 63;
               break;
            case 88:
               var10000 = 200;
               break;
            case 89:
               var10000 = 171;
               break;
            case 90:
               var10000 = 229;
               break;
            case 91:
               var10000 = 246;
               break;
            case 92:
               var10000 = 58;
               break;
            case 93:
               var10000 = 143;
               break;
            case 94:
               var10000 = 107;
               break;
            case 95:
               var10000 = 86;
               break;
            case 96:
               var10000 = 22;
               break;
            case 97:
               var10000 = 111;
               break;
            case 98:
               var10000 = 85;
               break;
            case 99:
               var10000 = 67;
               break;
            case 100:
               var10000 = 14;
               break;
            case 101:
               var10000 = 104;
               break;
            case 102:
               var10000 = 124;
               break;
            case 103:
               var10000 = 191;
               break;
            case 104:
               var10000 = 146;
               break;
            case 105:
               var10000 = 56;
               break;
            case 106:
               var10000 = 91;
               break;
            case 107:
               var10000 = 162;
               break;
            case 108:
               var10000 = 157;
               break;
            case 109:
               var10000 = 159;
               break;
            case 110:
               var10000 = 211;
               break;
            case 111:
               var10000 = 233;
               break;
            case 112:
               var10000 = 61;
               break;
            case 113:
               var10000 = 188;
               break;
            case 114:
               var10000 = 101;
               break;
            case 115:
               var10000 = 128;
               break;
            case 116:
               var10000 = 29;
               break;
            case 117:
               var10000 = 178;
               break;
            case 118:
               var10000 = 116;
               break;
            case 119:
               var10000 = 110;
               break;
            case 120:
               var10000 = 130;
               break;
            case 121:
               var10000 = 149;
               break;
            case 122:
               var10000 = 232;
               break;
            case 123:
               var10000 = 160;
               break;
            case 124:
               var10000 = 184;
               break;
            case 125:
               var10000 = 133;
               break;
            case 126:
               var10000 = 65;
               break;
            case 127:
               var10000 = 173;
               break;
            case 128:
               var10000 = 150;
               break;
            case 129:
               var10000 = 84;
               break;
            case 130:
               var10000 = 221;
               break;
            case 131:
               var10000 = 100;
               break;
            case 132:
               var10000 = 102;
               break;
            case 133:
               var10000 = 106;
               break;
            case 134:
               var10000 = 10;
               break;
            case 135:
               var10000 = 66;
               break;
            case 136:
               var10000 = 197;
               break;
            case 137:
               var10000 = 198;
               break;
            case 138:
               var10000 = 55;
               break;
            case 139:
               var10000 = 220;
               break;
            case 140:
               var10000 = 60;
               break;
            case 141:
               var10000 = 95;
               break;
            case 142:
               var10000 = 99;
               break;
            case 143:
               var10000 = 108;
               break;
            case 144:
               var10000 = 15;
               break;
            case 145:
               var10000 = 247;
               break;
            case 146:
               var10000 = 131;
               break;
            case 147:
               var10000 = 145;
               break;
            case 148:
               var10000 = 27;
               break;
            case 149:
               var10000 = 77;
               break;
            case 150:
               var10000 = 103;
               break;
            case 151:
               var10000 = 75;
               break;
            case 152:
               var10000 = 138;
               break;
            case 153:
               var10000 = 186;
               break;
            case 154:
               var10000 = 243;
               break;
            case 155:
               var10000 = 236;
               break;
            case 156:
               var10000 = 38;
               break;
            case 157:
               var10000 = 235;
               break;
            case 158:
               var10000 = 7;
               break;
            case 159:
               var10000 = 59;
               break;
            case 160:
               var10000 = 205;
               break;
            case 161:
               var10000 = 255;
               break;
            case 162:
               var10000 = 92;
               break;
            case 163:
               var10000 = 49;
               break;
            case 164:
               var10000 = 214;
               break;
            case 165:
               var10000 = 32;
               break;
            case 166:
               var10000 = 34;
               break;
            case 167:
               var10000 = 170;
               break;
            case 168:
               var10000 = 6;
               break;
            case 169:
               var10000 = 253;
               break;
            case 170:
               var10000 = 142;
               break;
            case 171:
               var10000 = 11;
               break;
            case 172:
               var10000 = 167;
               break;
            case 173:
               var10000 = 28;
               break;
            case 174:
               var10000 = 46;
               break;
            case 175:
               var10000 = 90;
               break;
            case 176:
               var10000 = 70;
               break;
            case 177:
               var10000 = 73;
               break;
            case 178:
               var10000 = 231;
               break;
            case 179:
               var10000 = 172;
               break;
            case 180:
               var10000 = 179;
               break;
            case 181:
               var10000 = 40;
               break;
            case 182:
               var10000 = 140;
               break;
            case 183:
               var10000 = 24;
               break;
            case 184:
               var10000 = 249;
               break;
            case 185:
               var10000 = 23;
               break;
            case 186:
               var10000 = 8;
               break;
            case 187:
               var10000 = 212;
               break;
            case 188:
               var10000 = 190;
               break;
            case 189:
               var10000 = 153;
               break;
            case 190:
               var10000 = 136;
               break;
            case 191:
               var10000 = 47;
               break;
            case 192:
               var10000 = 168;
               break;
            case 193:
               var10000 = 74;
               break;
            case 194:
               var10000 = 94;
               break;
            case 195:
               var10000 = 135;
               break;
            case 196:
               var10000 = 251;
               break;
            case 197:
               var10000 = 17;
               break;
            case 198:
               var10000 = 202;
               break;
            case 199:
               var10000 = 118;
               break;
            case 200:
               var10000 = 199;
               break;
            case 201:
               var10000 = 148;
               break;
            case 202:
               var10000 = 69;
               break;
            case 203:
               var10000 = 155;
               break;
            case 204:
               var10000 = 50;
               break;
            case 205:
               var10000 = 83;
               break;
            case 206:
               var10000 = 53;
               break;
            case 207:
               var10000 = 19;
               break;
            case 208:
               var10000 = 89;
               break;
            case 209:
               var10000 = 134;
               break;
            case 210:
               var10000 = 240;
               break;
            case 211:
               var10000 = 165;
               break;
            case 212:
               var10000 = 120;
               break;
            case 213:
               var10000 = 147;
               break;
            case 214:
               var10000 = 42;
               break;
            case 215:
               var10000 = 79;
               break;
            case 216:
               var10000 = 98;
               break;
            case 217:
               var10000 = 228;
               break;
            case 218:
               var10000 = 125;
               break;
            case 219:
               var10000 = 93;
               break;
            case 220:
               var10000 = 250;
               break;
            case 221:
               var10000 = 0;
               break;
            case 222:
               var10000 = 44;
               break;
            case 223:
               var10000 = 163;
               break;
            case 224:
               var10000 = 2;
               break;
            case 225:
               var10000 = 144;
               break;
            case 226:
               var10000 = 226;
               break;
            case 227:
               var10000 = 4;
               break;
            case 228:
               var10000 = 216;
               break;
            case 229:
               var10000 = 183;
               break;
            case 230:
               var10000 = 156;
               break;
            case 231:
               var10000 = 161;
               break;
            case 232:
               var10000 = 215;
               break;
            case 233:
               var10000 = 12;
               break;
            case 234:
               var10000 = 210;
               break;
            case 235:
               var10000 = 78;
               break;
            case 236:
               var10000 = 62;
               break;
            case 237:
               var10000 = 189;
               break;
            case 238:
               var10000 = 204;
               break;
            case 239:
               var10000 = 139;
               break;
            case 240:
               var10000 = 164;
               break;
            case 241:
               var10000 = 16;
               break;
            case 242:
               var10000 = 88;
               break;
            case 243:
               var10000 = 132;
               break;
            case 244:
               var10000 = 25;
               break;
            case 245:
               var10000 = 174;
               break;
            case 246:
               var10000 = 192;
               break;
            case 247:
               var10000 = 230;
               break;
            case 248:
               var10000 = 123;
               break;
            case 249:
               var10000 = 169;
               break;
            case 250:
               var10000 = 166;
               break;
            case 251:
               var10000 = 175;
               break;
            case 252:
               var10000 = 72;
               break;
            case 253:
               var10000 = 119;
               break;
            case 254:
               var10000 = 87;
               break;
            default:
               var10000 = 176;
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

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 25790) & 32767;
      if (e[var3] == null) {
         e[var3] = c[var3] ^ var1;
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "¶%\u0002Ú\u008a";
      int var12 = "¶%\u0002Ú\u008a".length();
      char var9 = 2;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 24;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 24;
               var10006 = var14;
            } else {
               var23 = 24;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 24;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 127;
                     break;
                  case 1:
                     var41 = 1;
                     break;
                  case 2:
                     var41 = 14;
                     break;
                  case 3:
                     var41 = 2;
                     break;
                  case 4:
                     var41 = 96;
                     break;
                  case 5:
                     var41 = 68;
                     break;
                  default:
                     var41 = 73;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 5257703689434208630L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "Bú\u008c\u0000¥\u000f0\u00ad\"8\u0094eÂ§\nQ";
            int var5 = "Bú\u008c\u0000¥\u000f0\u00ad\"8\u0094eÂ§\nQ".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
                     ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L
                  )
                  ^ var0;
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            c = var6;
            e = new Long[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





