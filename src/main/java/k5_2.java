import com._C;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

class k5_2 implements ActionListener {
   final String Q;
   final fX_3 W;
   final JPopupMenu z;
   final Component a;
   final JLabel Z;
   final Color e;
   final W8 V;
   final Jx_2 c;
   private static final String b;

   k5_2(Jx_2 var1, String var2, fX_3 var3, JPopupMenu var4, Component var5, JLabel var6, Color var7, W8 var8) {
      this.c = var1;
      this.Q = var2;
      this.W = var3;
      this.z = var4;
      this.a = var5;
      this.Z = var6;
      this.e = var7;
      this.V = var8;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.f();
      Method var26 = com.c.d(270389152141252877L);
      Object[] var86 = var10000;
      Method var58 = null;

      try {
         var10000 = (Object[])var26.invoke(var58, var86);
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      var58 = com.c.f();
      Method var10003 = com.c.d(634817973682994708L);
      var86 = (Object[])var58;
      var58 = var10000;
      Method var28 = var10003;

      try {
         var10000 = (Object[])var28.invoke(var58, var86);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      var58 = com.c.f();
      var10003 = com.c.d(240567170779145617L);
      var86 = (Object[])var58;
      var58 = var10000;
      Method var30 = var10003;

      try {
         var10000 = (Object[])var30.invoke(var58, var86);
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      var58 = com.c.f();
      var10003 = com.c.d(226341449505323490L);
      var86 = (Object[])var58;
      var58 = var10000;
      Method var32 = var10003;

      try {
         var10000 = (U)var32.invoke(var58, var86);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      U var3 = var10000;
      int[] var34 = Jx_2.O();
      var58 = com.c.c(529591097353700130L).get(this);
      var86 = com.c.a(com.c.c(121991795061046485L).get(this), var3);
      Method var10004 = com.c.d(596842460043417062L);
      Object[] var109 = var86;
      var86 = (Object[])var58;
      var58 = var10004;

      try {
         var67 = (YB)var58.invoke(var86, var109);
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      YB var4 = var67;
      int[] var2 = var34;
      Object[] var68 = com.c.f();
      var10003 = com.c.d(418327897845479655L);
      var86 = var68;
      YB var69 = var4;
      Method var35 = var10003;

      try {
         var36 = (Integer)var35.invoke(var69, var86);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      int var5 = var36;
      if (var2 == null) {
         if (var5 == com.c.c(564170828581134815L).getInt(null)) {
            Object[] var70 = com.c.f();
            var10003 = com.c.d(191095475795927576L);
            var86 = var70;
            YB var71 = var4;
            Method var37 = var10003;

            try {
               var10000 = (String)var37.invoke(var71, var86);
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            String var6 = var10000;
            var10000 = (Object[])com.c.c(122366408558848086L).get(this);
            Object[] var72 = com.c.a(var6);
            var10003 = com.c.d(610893823161621108L);
            var86 = var72;
            var58 = var10000;
            Method var40 = var10003;

            try {
               var41 = (Boolean)var40.invoke(var58, var86);
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            boolean var7 = var41;
            var10000 = (Object[])com.c.c(122366408558848086L).get(this);
            Object[] var74 = com.c.a(var6);
            var10003 = com.c.d(586754005152705687L);
            var86 = var74;
            var58 = var10000;
            Method var43 = var10003;

            try {
               var43.invoke(var58, var86);
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            var10000 = (Object[])com.c.c(529591097353700130L).get(this);
            Object[] var76 = com.c.f();
            var10003 = com.c.d(528723233100399280L);
            var86 = var76;
            var58 = var10000;
            Method var45 = var10003;

            try {
               var45.invoke(var58, var86);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            var10000 = (Object[])com.c.c(529591097353700130L).get(this);
            Object[] var78 = com.c.a(var6);
            var10003 = com.c.d(491105122976850438L);
            var86 = var78;
            var58 = var10000;
            Method var47 = var10003;

            try {
               var10000 = (W8)var47.invoke(var58, var86);
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            label145: {
               W8 var8 = var10000;
               if (!var7) {
                  var10000 = (Object[])com.c.c(529591097353700130L).get(this);
                  Object[] var80 = com.c.a(
                     com.c.c(122366408558848086L).get(this), com.c.c(578022464992353597L).get(this), com.c.c(631202157895974153L).get(this), var6
                  );
                  var10003 = com.c.d(551513000150344715L);
                  var86 = var80;
                  var58 = var10000;
                  Method var50 = var10003;

                  try {
                     var10000 = (W8)var50.invoke(var58, var86);
                  } catch (InvocationTargetException var14) {
                     throw var14.getTargetException();
                  }

                  W8 var9 = var10000;
                  JPopupMenu var52 = (JPopupMenu)com.c.c(578022464992353597L).get(this);
                  var86 = (Object[])com.c.c(122366408558848086L).get(this);
                  Object[] var117 = com.c.f();
                  Method var10005 = com.c.d(284002349345105786L);
                  Object[] var123 = var117;
                  var10003 = var86;
                  Method var100 = var10005;

                  try {
                     var101 = (Integer)var100.invoke(var10003, var123);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  var52.insert(var9, var101 - 1);
                  ((ArrayList)com.c.c(585743319788652558L).get(com.c.c(529591097353700130L).get(this))).remove(var8);
                  ((ArrayList)com.c.c(585743319788652558L).get(com.c.c(529591097353700130L).get(this))).add(0, var9);
                  if (var2 == null) {
                     break label145;
                  }
               }

               if (var8 != null) {
                  ((JPopupMenu)com.c.c(578022464992353597L).get(this)).remove(var8);
                  JPopupMenu var53 = (JPopupMenu)com.c.c(578022464992353597L).get(this);
                  var86 = (Object[])com.c.c(122366408558848086L).get(this);
                  Object[] var119 = com.c.f();
                  Method var125 = com.c.d(284002349345105786L);
                  Object[] var124 = var119;
                  var10003 = var86;
                  Method var103 = var125;

                  try {
                     var104 = (Integer)var103.invoke(var10003, var124);
                  } catch (InvocationTargetException var12) {
                     throw var12.getTargetException();
                  }

                  var53.insert(var8, var104 - 1);
                  ((ArrayList)com.c.c(585743319788652558L).get(com.c.c(529591097353700130L).get(this))).remove(var8);
                  ((ArrayList)com.c.c(585743319788652558L).get(com.c.c(529591097353700130L).get(this))).add(0, var8);
               }
            }

            ((_C)com.c.c(435031631667149019L).get(com.c.c(529591097353700130L).get(this))).setText(b + new File(var6).getAbsolutePath());
            ((_C)com.c.c(435031631667149019L).get(com.c.c(529591097353700130L).get(this))).setToolTipText(var6);
            var10000 = (Object[])com.c.c(269586463206323716L).get(com.c.c(529591097353700130L).get(this));
            Object[] var82 = com.c.a(var6);
            var10003 = com.c.d(565172623409340742L);
            var86 = var82;
            var58 = var10000;
            Method var55 = var10003;

            try {
               var55.invoke(var58, var86);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            var10000 = (Object[])com.c.c(529591097353700130L).get(this);
            Object[] var84 = com.c.f();
            var10003 = com.c.d(528723233100399280L);
            var86 = var84;
            var58 = var10000;
            Method var57 = var10003;

            try {
               var57.invoke(var58, var86);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         ((JLabel)com.c.c(514650530841217795L).get(this)).setBackground((Color)com.c.c(633449457647939731L).get(this));
         ((W8)com.c.c(394846911229968291L).get(this)).setBackground((Color)com.c.c(633449457647939731L).get(this));
         ((C5)com.c.c(534231457215759502L).get(com.c.c(529591097353700130L).get(this))).setVisible(true);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "乩輚\f*".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 105;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 105;
         var10006 = var0;
      } else {
         var6 = 105;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 105;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 11;
               break;
            case 1:
               var23 = 14;
               break;
            case 2:
               var23 = 95;
               break;
            case 3:
               var23 = 99;
               break;
            case 4:
               var23 = 114;
               break;
            case 5:
               var23 = 76;
               break;
            default:
               var23 = 93;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





