package com.finalshell.connection;

import com.finalshell.core.Kw4;
import com.finalshell.core.NY;
import com.finalshell.core.U82;
import com.finalshell.core.Y62_2;
import com.finalshell.core.YA3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.AK;
import com.finalshell.ui.listener.K82;
import com.finalshell.ui.listener.O4;
import com.finalshell.ui.listener.Os4;
import com.finalshell.ui.listener.T12;
import com.finalshell.ui.model.GR;
import com.finalshell.ui.panel.F8;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import javax.swing.text.DefaultCaret;
import net.miginfocom.swing.MigLayout;

public class Copy extends F8 {
   public String m;
   public String I;
   public String b;
   public U82 d;
   public String W;
   public Kw4 U;
   public Y62_2 y;
   public GR C;
   public int A;
   public int D;
   public static String[] a;
   public static String[] e;
   public static long[] g;
   public static Integer[] h;

   public Copy(Kw4 var1) {
   super();
      String[] var10000 = Y62_2.Z();
      String[] var2 = var10000;
      long var9 = 231874607456927970L;
      String var8 = "";
      Ref.s(231874607456927970L, var8, var9);
      Registry.lookupField(225800492388928374L).setInt(this, -1);
      Registry.lookupField(562657621005253107L).setInt(this, -1);
      long var11 = 528484137395588052L;
      Ref.s(528484137395588052L, var1, var11);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 539126826743258386L;
      Object[] var12 = var10004;
      var10004 = Ref.h(539126826743258386L, var12, var13);
      long var15 = 633196159185933686L;
      Object var14 = var10004;
      Ref.s(633196159185933686L, var14, var15);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(20704, -19264), a(20709, -3591), a(20705, -26699)));
      this.setPreferredSize(new Dimension(b(18339, 2775147215422985462L), b(21913, 2802971621032462029L)));
      Object[] var10005 = Registry.emptyArgs();
      long var17 = 500998504066804816L;
      Object[] var16 = var10005;
      Ref.h(500998504066804816L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      GR var10006 = new GR();
      long var19 = 347284645451059683L;
      GR var18 = var10006;
      Ref.s(347284645451059683L, var18, var19);
      Y62_2 var10007 = new Y62_2();
      long var21 = 406455305964270214L;
      Y62_2 var20 = var10007;
      Ref.s(406455305964270214L, var20, var21);
      Object var22 = 406455305964270214L;
      ((Y62_2)Ref.g(406455305964270214L, var22)).setOpaque(false);
      Object var24 = 406455305964270214L;
      Ref.g(406455305964270214L, var24);
      Object var26 = 347284645451059683L;
      Object[] var10011 = Registry.packArgs(Ref.g(347284645451059683L, var26));
      long var29 = 268280612622277165L;
      Object[] var28 = var10011;
      Ref.h(268280612622277165L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      JScrollPane var10012;
      Object var30 = 406455305964270214L;
      super((Y62_2)Ref.g(406455305964270214L, var30));
      JScrollPane var3 = var10012;
      var3.setOpaque(false);
      var3.getViewport().setOpaque(false);
      this.add(var3, a(20710, 23545));
      var3.addMouseListener(new Os4(this));
      JPopupMenu var4 = new JPopupMenu();
      JMenuItem var5 = new JMenuItem(a(20708, -4145));
      var5.addActionListener(new T12(this));
      var4.add(var5);
      JMenuItem var6 = new JMenuItem(a(20706, 4920));
      var6.addActionListener(new K82(this));
      var4.add(var6);
      JMenuItem var7 = new JMenuItem(a(20707, 17885));
      var7.addActionListener(new AK(this));
      var4.add(var7);
      Object var32 = 406455305964270214L;
      ((Y62_2)Ref.g(406455305964270214L, var32)).addMouseListener(new O4(this, var4));
      if (var2 == null) {
         Ky4.K(new String[3]);
      }
   }

   public JTextArea M() {
      JTextArea var1 = new JTextArea();
      var1.setLineWrap(true);
      var1.setOpaque(false);
      var1.setEditable(false);
      var1.setAutoscrolls(false);
      Object var3 = 272014085074929416L;
      Object var10002 = Ref.g(272014085074929416L, var3);
      String var10003 = (String)(Registry.emptyArgs());
      long var6 = 372900192662778876L;
      Object[] var5 = var10003;
      var10003 = Ref.h(372900192662778876L, var5, var6);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10002.setText(var10003);
      var1.setCaretPosition(0);
      DefaultCaret var2 = (DefaultCaret)var1.getCaret();
      var2.setUpdatePolicy(1);
      return var1;
   }

   public void E(Kw4 var1) {
      String[] var2;
      YA3_2 var4;
      label57: {
         Object var7 = 406455305964270214L;
         Object var3 = ((Y62_2)Ref.g(406455305964270214L, var7)).getSelectedRow();
         String[] var10001 = Y62_2.Z();
         var4 = null;
         var2 = var10001;
         Copy var37 = (Copy)var3;
         if (var2 != null) {
            if (!(var3 > -1)) {
               break label57;
            }

            var37 = this;
            Object var9 = 406455305964270214L;
            ((Y62_2)Ref.g(406455305964270214L, var9)).convertRowIndexToModel((int)var3);
         }

         Copy var5 = var37;
         Object var11 = 347284645451059683L;
         Ref.g(347284645451059683L, var11);
         ArrayList var10003 = Registry.emptyArgs();
         long var14 = 530247999995353660L;
         Object[] var13 = var10003;
         var10003 = Ref.h(530247999995353660L, var13, var14);

         try {
            var10003 = (ArrayList)var10003;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         var4 = (YA3_2)var10003.get((int)var5);
      }

      Object var15 = 347284645451059683L;
      Ref.g(347284645451059683L, var15);
      Object[] var10006 = Registry.emptyArgs();
      long var18 = 279562214327125641L;
      Object[] var17 = var10006;
      var10006 = Registry.packArgs(Ref.h(279562214327125641L, var17, var18));
      long var20 = 177214140286815489L;
      Object[] var19 = var10006;
      Ref.h(177214140286815489L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      Object var21 = 347284645451059683L;
      GR var10007 = (GR)Ref.g(347284645451059683L, var21);
      if (var2 != null) {
         var10007.fireTableDataChanged();
         if (var4 == null) {
            return;
         }

         Object var23 = 347284645451059683L;
         GR var10008 = (GR)Ref.g(347284645451059683L, var23);
      }

      Object[] var10009 = Registry.emptyArgs();
      long var26 = 271743078317072247L;
      Object[] var25 = var10009;
      var10009 = Registry.packArgs(Ref.h(271743078317072247L, var25, var26));
      long var28 = 560077250842654235L;
      Object[] var27 = var10009;
      var10009 = Ref.h(560077250842654235L, var27, var28);

      try {
         var43 = (Integer)var10009;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      int var36 = var43;
      Object var29 = 406455305964270214L;
      int var6 = ((Y62_2)Ref.g(406455305964270214L, var29)).convertRowIndexToView(var36);
      Object var31 = 406455305964270214L;
      ((Y62_2)Ref.g(406455305964270214L, var31)).getSelectionModel().setSelectionInterval(var6, var6);
   }

   public void H() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 399585344452154517L;
      Object[] var5 = var10002;
      Ref.h(399585344452154517L, var5, var6);
      NY var10003 = (NY)(Registry.emptyArgs());
      long var8 = 149968465491171480L;
      Object[] var7 = var10003;
      var10003 = Ref.h(149968465491171480L, var7, var8);

      try {
         var10003 = (NY)var10003;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      NY var1 = var10003;
      byte var15 = 2;
      Color var10008 = (Color)(Registry.emptyArgs());
      long var10 = 345089686683358688L;
      Object[] var9 = var10008;
      var10008 = Ref.h(345089686683358688L, var9, var10);

      try {
         var10008 = (Color)var10008;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      MatteBorder var2 = BorderFactory.createMatteBorder(0, 0, 0, (int)var1, var10008);
      this.setBorder(null);
   }

   @Override
   public String getName() {
      Object var1 = 258760253724184004L;
      return (String)Ref.g(258760253724184004L, var1);
   }

   @Override
   public void setName(String var1) {
      long var3 = 258760253724184004L;
      Ref.s(258760253724184004L, var1, var3);
   }

   public String A() {
      Object var1 = 622942266169776697L;
      return (String)Ref.g(622942266169776697L, var1);
   }

   public void C(String var1) {
      long var3 = 622942266169776697L;
      Ref.s(622942266169776697L, var1, var3);
   }

   public U82 p() {
      Object var1 = 272014085074929416L;
      return (U82)Ref.g(272014085074929416L, var1);
   }

   public void v(U82 var1) {
      long var3 = 272014085074929416L;
      Ref.s(272014085074929416L, var1, var3);
   }

   public String y() {
      Object var1 = 633196159185933686L;
      return (String)Ref.g(633196159185933686L, var1);
   }

   public void T(String var1) {
      long var3 = 633196159185933686L;
      Ref.s(633196159185933686L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 20704) & 65535;
      if (e[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 17;
               break;
            case 1:
               var10000 = 41;
               break;
            case 2:
               var10000 = 39;
               break;
            case 3:
               var10000 = 133;
               break;
            case 4:
               var10000 = 86;
               break;
            case 5:
               var10000 = 234;
               break;
            case 6:
               var10000 = 188;
               break;
            case 7:
               var10000 = 198;
               break;
            case 8:
               var10000 = 175;
               break;
            case 9:
               var10000 = 23;
               break;
            case 10:
               var10000 = 138;
               break;
            case 11:
               var10000 = 62;
               break;
            case 12:
               var10000 = 91;
               break;
            case 13:
               var10000 = 221;
               break;
            case 14:
               var10000 = 32;
               break;
            case 15:
               var10000 = 150;
               break;
            case 16:
               var10000 = 2;
               break;
            case 17:
               var10000 = 115;
               break;
            case 18:
               var10000 = 68;
               break;
            case 19:
               var10000 = 99;
               break;
            case 20:
               var10000 = 48;
               break;
            case 21:
               var10000 = 112;
               break;
            case 22:
               var10000 = 81;
               break;
            case 23:
               var10000 = 104;
               break;
            case 24:
               var10000 = 148;
               break;
            case 25:
               var10000 = 120;
               break;
            case 26:
               var10000 = 215;
               break;
            case 27:
               var10000 = 251;
               break;
            case 28:
               var10000 = 70;
               break;
            case 29:
               var10000 = 40;
               break;
            case 30:
               var10000 = 243;
               break;
            case 31:
               var10000 = 152;
               break;
            case 32:
               var10000 = 6;
               break;
            case 33:
               var10000 = 142;
               break;
            case 34:
               var10000 = 171;
               break;
            case 35:
               var10000 = 129;
               break;
            case 36:
               var10000 = 74;
               break;
            case 37:
               var10000 = 222;
               break;
            case 38:
               var10000 = 239;
               break;
            case 39:
               var10000 = 237;
               break;
            case 40:
               var10000 = 128;
               break;
            case 41:
               var10000 = 248;
               break;
            case 42:
               var10000 = 211;
               break;
            case 43:
               var10000 = 143;
               break;
            case 44:
               var10000 = 126;
               break;
            case 45:
               var10000 = 246;
               break;
            case 46:
               var10000 = 49;
               break;
            case 47:
               var10000 = 214;
               break;
            case 48:
               var10000 = 63;
               break;
            case 49:
               var10000 = 141;
               break;
            case 50:
               var10000 = 43;
               break;
            case 51:
               var10000 = 145;
               break;
            case 52:
               var10000 = 161;
               break;
            case 53:
               var10000 = 147;
               break;
            case 54:
               var10000 = 69;
               break;
            case 55:
               var10000 = 151;
               break;
            case 56:
               var10000 = 186;
               break;
            case 57:
               var10000 = 4;
               break;
            case 58:
               var10000 = 118;
               break;
            case 59:
               var10000 = 190;
               break;
            case 60:
               var10000 = 54;
               break;
            case 61:
               var10000 = 28;
               break;
            case 62:
               var10000 = 14;
               break;
            case 63:
               var10000 = 154;
               break;
            case 64:
               var10000 = 206;
               break;
            case 65:
               var10000 = 34;
               break;
            case 66:
               var10000 = 89;
               break;
            case 67:
               var10000 = 157;
               break;
            case 68:
               var10000 = 59;
               break;
            case 69:
               var10000 = 193;
               break;
            case 70:
               var10000 = 192;
               break;
            case 71:
               var10000 = 95;
               break;
            case 72:
               var10000 = 56;
               break;
            case 73:
               var10000 = 158;
               break;
            case 74:
               var10000 = 61;
               break;
            case 75:
               var10000 = 162;
               break;
            case 76:
               var10000 = 223;
               break;
            case 77:
               var10000 = 236;
               break;
            case 78:
               var10000 = 83;
               break;
            case 79:
               var10000 = 227;
               break;
            case 80:
               var10000 = 60;
               break;
            case 81:
               var10000 = 29;
               break;
            case 82:
               var10000 = 78;
               break;
            case 83:
               var10000 = 26;
               break;
            case 84:
               var10000 = 27;
               break;
            case 85:
               var10000 = 124;
               break;
            case 86:
               var10000 = 55;
               break;
            case 87:
               var10000 = 65;
               break;
            case 88:
               var10000 = 169;
               break;
            case 89:
               var10000 = 52;
               break;
            case 90:
               var10000 = 253;
               break;
            case 91:
               var10000 = 67;
               break;
            case 92:
               var10000 = 247;
               break;
            case 93:
               var10000 = 146;
               break;
            case 94:
               var10000 = 1;
               break;
            case 95:
               var10000 = 254;
               break;
            case 96:
               var10000 = 93;
               break;
            case 97:
               var10000 = 135;
               break;
            case 98:
               var10000 = 176;
               break;
            case 99:
               var10000 = 244;
               break;
            case 100:
               var10000 = 0;
               break;
            case 101:
               var10000 = 178;
               break;
            case 102:
               var10000 = 90;
               break;
            case 103:
               var10000 = 12;
               break;
            case 104:
               var10000 = 201;
               break;
            case 105:
               var10000 = 212;
               break;
            case 106:
               var10000 = 16;
               break;
            case 107:
               var10000 = 42;
               break;
            case 108:
               var10000 = 230;
               break;
            case 109:
               var10000 = 127;
               break;
            case 110:
               var10000 = 196;
               break;
            case 111:
               var10000 = 123;
               break;
            case 112:
               var10000 = 209;
               break;
            case 113:
               var10000 = 199;
               break;
            case 114:
               var10000 = 226;
               break;
            case 115:
               var10000 = 172;
               break;
            case 116:
               var10000 = 85;
               break;
            case 117:
               var10000 = 132;
               break;
            case 118:
               var10000 = 116;
               break;
            case 119:
               var10000 = 202;
               break;
            case 120:
               var10000 = 252;
               break;
            case 121:
               var10000 = 228;
               break;
            case 122:
               var10000 = 5;
               break;
            case 123:
               var10000 = 73;
               break;
            case 124:
               var10000 = 197;
               break;
            case 125:
               var10000 = 88;
               break;
            case 126:
               var10000 = 204;
               break;
            case 127:
               var10000 = 241;
               break;
            case 128:
               var10000 = 72;
               break;
            case 129:
               var10000 = 98;
               break;
            case 130:
               var10000 = 24;
               break;
            case 131:
               var10000 = 255;
               break;
            case 132:
               var10000 = 229;
               break;
            case 133:
               var10000 = 117;
               break;
            case 134:
               var10000 = 203;
               break;
            case 135:
               var10000 = 44;
               break;
            case 136:
               var10000 = 31;
               break;
            case 137:
               var10000 = 165;
               break;
            case 138:
               var10000 = 18;
               break;
            case 139:
               var10000 = 224;
               break;
            case 140:
               var10000 = 205;
               break;
            case 141:
               var10000 = 38;
               break;
            case 142:
               var10000 = 11;
               break;
            case 143:
               var10000 = 107;
               break;
            case 144:
               var10000 = 195;
               break;
            case 145:
               var10000 = 189;
               break;
            case 146:
               var10000 = 144;
               break;
            case 147:
               var10000 = 218;
               break;
            case 148:
               var10000 = 155;
               break;
            case 149:
               var10000 = 35;
               break;
            case 150:
               var10000 = 242;
               break;
            case 151:
               var10000 = 53;
               break;
            case 152:
               var10000 = 240;
               break;
            case 153:
               var10000 = 156;
               break;
            case 154:
               var10000 = 10;
               break;
            case 155:
               var10000 = 9;
               break;
            case 156:
               var10000 = 108;
               break;
            case 157:
               var10000 = 100;
               break;
            case 158:
               var10000 = 238;
               break;
            case 159:
               var10000 = 191;
               break;
            case 160:
               var10000 = 106;
               break;
            case 161:
               var10000 = 182;
               break;
            case 162:
               var10000 = 177;
               break;
            case 163:
               var10000 = 30;
               break;
            case 164:
               var10000 = 77;
               break;
            case 165:
               var10000 = 137;
               break;
            case 166:
               var10000 = 185;
               break;
            case 167:
               var10000 = 82;
               break;
            case 168:
               var10000 = 114;
               break;
            case 169:
               var10000 = 19;
               break;
            case 170:
               var10000 = 45;
               break;
            case 171:
               var10000 = 187;
               break;
            case 172:
               var10000 = 153;
               break;
            case 173:
               var10000 = 159;
               break;
            case 174:
               var10000 = 179;
               break;
            case 175:
               var10000 = 101;
               break;
            case 176:
               var10000 = 96;
               break;
            case 177:
               var10000 = 210;
               break;
            case 178:
               var10000 = 80;
               break;
            case 179:
               var10000 = 207;
               break;
            case 180:
               var10000 = 37;
               break;
            case 181:
               var10000 = 66;
               break;
            case 182:
               var10000 = 231;
               break;
            case 183:
               var10000 = 249;
               break;
            case 184:
               var10000 = 232;
               break;
            case 185:
               var10000 = 94;
               break;
            case 186:
               var10000 = 15;
               break;
            case 187:
               var10000 = 71;
               break;
            case 188:
               var10000 = 76;
               break;
            case 189:
               var10000 = 167;
               break;
            case 190:
               var10000 = 20;
               break;
            case 191:
               var10000 = 113;
               break;
            case 192:
               var10000 = 13;
               break;
            case 193:
               var10000 = 208;
               break;
            case 194:
               var10000 = 217;
               break;
            case 195:
               var10000 = 109;
               break;
            case 196:
               var10000 = 97;
               break;
            case 197:
               var10000 = 119;
               break;
            case 198:
               var10000 = 84;
               break;
            case 199:
               var10000 = 136;
               break;
            case 200:
               var10000 = 160;
               break;
            case 201:
               var10000 = 22;
               break;
            case 202:
               var10000 = 181;
               break;
            case 203:
               var10000 = 121;
               break;
            case 204:
               var10000 = 164;
               break;
            case 205:
               var10000 = 102;
               break;
            case 206:
               var10000 = 168;
               break;
            case 207:
               var10000 = 57;
               break;
            case 208:
               var10000 = 200;
               break;
            case 209:
               var10000 = 50;
               break;
            case 210:
               var10000 = 174;
               break;
            case 211:
               var10000 = 87;
               break;
            case 212:
               var10000 = 25;
               break;
            case 213:
               var10000 = 173;
               break;
            case 214:
               var10000 = 166;
               break;
            case 215:
               var10000 = 213;
               break;
            case 216:
               var10000 = 131;
               break;
            case 217:
               var10000 = 250;
               break;
            case 218:
               var10000 = 184;
               break;
            case 219:
               var10000 = 110;
               break;
            case 220:
               var10000 = 36;
               break;
            case 221:
               var10000 = 103;
               break;
            case 222:
               var10000 = 139;
               break;
            case 223:
               var10000 = 58;
               break;
            case 224:
               var10000 = 47;
               break;
            case 225:
               var10000 = 170;
               break;
            case 226:
               var10000 = 194;
               break;
            case 227:
               var10000 = 105;
               break;
            case 228:
               var10000 = 51;
               break;
            case 229:
               var10000 = 149;
               break;
            case 230:
               var10000 = 216;
               break;
            case 231:
               var10000 = 134;
               break;
            case 232:
               var10000 = 140;
               break;
            case 233:
               var10000 = 183;
               break;
            case 234:
               var10000 = 125;
               break;
            case 235:
               var10000 = 219;
               break;
            case 236:
               var10000 = 122;
               break;
            case 237:
               var10000 = 46;
               break;
            case 238:
               var10000 = 8;
               break;
            case 239:
               var10000 = 75;
               break;
            case 240:
               var10000 = 163;
               break;
            case 241:
               var10000 = 180;
               break;
            case 242:
               var10000 = 225;
               break;
            case 243:
               var10000 = 33;
               break;
            case 244:
               var10000 = 92;
               break;
            case 245:
               var10000 = 111;
               break;
            case 246:
               var10000 = 3;
               break;
            case 247:
               var10000 = 64;
               break;
            case 248:
               var10000 = 220;
               break;
            case 249:
               var10000 = 21;
               break;
            case 250:
               var10000 = 79;
               break;
            case 251:
               var10000 = 130;
               break;
            case 252:
               var10000 = 235;
               break;
            case 253:
               var10000 = 7;
               break;
            case 254:
               var10000 = 245;
               break;
            default:
               var10000 = 233;
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

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21332;
      if (h[var3] == null) {
         h[var3] = (int)(g[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[7];
      int var11 = 0;
      String var10 = "\u001e~é\u001c\u009cü?èè\u0006\f\u000e@±V\u0017\u0016Uß\u0012X\u0087ÐÁ\u0011\u0088\\Ùã&&b²Y3\u0085\u0010Gb\u0004夏劔窿厔\u0004赩疄迟躸\u0004妅勅H\r";
      int var12 = "\u001e~é\u001c\u009cü?èè\u0006\f\u000e@±V\u0017\u0016Uß\u0012X\u0087ÐÁ\u0011\u0088\\Ùã&&b²Y3\u0085\u0010Gb\u0004夏劔窿厔\u0004赩疄迟躸\u0004妅勅H\r"
         .length();
      char var9 = 15;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 3;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var30;
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 17;
                        break;
                     case 1:
                        var58 = 74;
                        break;
                     case 2:
                        var58 = 92;
                        break;
                     case 3:
                        var58 = 63;
                        break;
                     case 4:
                        var58 = 32;
                        break;
                     case 5:
                        var58 = 65;
                        break;
                     default:
                        var58 = 17;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     e = new String[7];
                     long var0 = 1478482168098073313L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "hË½\u0092\u007f\u0018\u000b<²:P\b²\u008f\u0099\u0007";
                     int var5 = "hË½\u0092\u007f\u0018\u000b<²:P\b²\u008f\u0099\u0007".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     g = var6;
                     h = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "c&\u008d\u0080î)úè¨Q\u0097\u001ef\"j\u001eÇ*a\u0017¦éH\u001c\u000eéÝä\u000f\u007f4\\<Ol\u0099<£4Ok®u\u0013a\u0004Î,\u0015³ßt";
                  var12 = "c&\u008d\u0080î)úè¨Q\u0097\u001ef\"j\u001eÇ*a\u0017¦éH\u001c\u000eéÝä\u000f\u007f4\\<Ol\u0099<£4Ok®u\u0013a\u0004Î,\u0015³ßt"
                     .length();
                  var9 = 23;
                  var16 = -1;
            }

            var10000 = 28;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





